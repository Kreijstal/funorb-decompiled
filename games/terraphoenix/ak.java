/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    static String field_c;
    static String field_g;
    static int field_q;
    private int field_n;
    private long field_h;
    static int field_e;
    private long field_p;
    private long field_o;
    private b field_d;
    private int field_m;
    private byte[] field_a;
    static String field_f;
    private byte[] field_k;
    static String field_j;
    private long field_l;
    private long field_i;
    private long field_b;

    final void b(byte param0) throws IOException {
        this.a(0);
        if (param0 > -5) {
            ak.a(false);
        }
        this.field_d.a(118);
    }

    final static void b(int param0) {
        int var1 = -86 / ((4 - param0) / 52);
        rd.field_k = new jj();
    }

    final long a(byte param0) {
        int var2 = 36 % ((-70 - param0) / 40);
        return this.field_i;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_j = null;
        if (param0) {
            field_c = (String) null;
        }
        field_g = null;
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        this.field_m = 0;
        if (this.field_p != this.field_h) {
            this.field_d.a(this.field_p, (byte) 89);
            this.field_h = this.field_p;
        }
        if (param0 > -86) {
            field_g = (String) null;
        }
        this.field_b = this.field_p;
        while (this.field_m < this.field_a.length) {
            var2 = this.field_a.length - this.field_m;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = this.field_d.a(this.field_a, var2, this.field_m, 12955);
            if (0 == (var3 ^ -1)) {
                break;
            }
            this.field_m = this.field_m + var3;
            this.field_h = this.field_h + (long)var3;
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (param0) {
            return;
        }
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        this.field_p = param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Terraphoenix.field_V;
        if (param5 != 116) {
          return;
        } else {
          L0: {
            if (param14 > param4) {
              if (param8 > param14) {
                dl.a(true, param1, param0, l.field_i, param14, param6, param9, param12, param3, param11, param8, param13, param4, param10, param15, param2, param7);
                break L0;
              } else {
                if (param4 < param8) {
                  dl.a(true, param11, param10, l.field_i, param8, param12, param9, param6, param13, param1, param14, param3, param4, param0, param15, param2, param7);
                  break L0;
                } else {
                  dl.a(true, param11, param10, l.field_i, param4, param7, param0, param6, param13, param15, param14, param2, param8, param9, param1, param3, param12);
                  break L0;
                }
              }
            } else {
              if (param4 >= param8) {
                if (param14 < param8) {
                  dl.a(true, param15, param9, l.field_i, param8, param12, param10, param7, param2, param1, param4, param3, param14, param0, param11, param13, param6);
                  break L0;
                } else {
                  dl.a(true, param15, param9, l.field_i, param14, param6, param0, param7, param2, param11, param4, param13, param8, param10, param1, param3, param12);
                  break L0;
                }
              } else {
                dl.a(true, param1, param0, l.field_i, param4, param7, param10, param12, param3, param15, param8, param2, param14, param9, param11, param13, param6);
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          if (0L == (this.field_o ^ -1L)) {
            break L0;
          } else {
            L1: {
              if (this.field_o == this.field_h) {
                break L1;
              } else {
                this.field_d.a(this.field_o, (byte) 81);
                this.field_h = this.field_o;
                break L1;
              }
            }
            L2: {
              this.field_d.a(this.field_n, this.field_k, 0, (byte) -73);
              this.field_h = this.field_h + (long)this.field_n;
              if (this.field_h <= this.field_l) {
                break L2;
              } else {
                this.field_l = this.field_h;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (this.field_b > this.field_o) {
                  break L4;
                } else {
                  if (this.field_o >= (long)this.field_m + this.field_b) {
                    break L4;
                  } else {
                    var2 = this.field_o;
                    break L3;
                  }
                }
              }
              if (this.field_b < this.field_o) {
                break L3;
              } else {
                if (this.field_b >= (long)this.field_n + this.field_o) {
                  break L3;
                } else {
                  var2 = this.field_b;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (this.field_b >= this.field_o - -(long)this.field_n) {
                  break L6;
                } else {
                  if (((long)this.field_n + this.field_o ^ -1L) < ((long)this.field_m + this.field_b ^ -1L)) {
                    break L6;
                  } else {
                    var4 = (long)this.field_n + this.field_o;
                    break L5;
                  }
                }
              }
              if (this.field_b + (long)this.field_m <= this.field_o) {
                break L5;
              } else {
                if (((long)this.field_n + this.field_o ^ -1L) > (this.field_b + (long)this.field_m ^ -1L)) {
                  break L5;
                } else {
                  var4 = (long)this.field_m + this.field_b;
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(-var2 + var4);
                  ka.a(this.field_k, (int)(-this.field_o + var2), this.field_a, (int)(-this.field_b + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_o = -1L;
            this.field_n = 0;
            break L0;
          }
        }
        L8: {
          if (param0 == 0) {
            break L8;
          } else {
            ak.a(true);
            break L8;
          }
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int incrementValue$1 = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            try {
              L1: {
                if (param3 + param2 <= param0.length) {
                  L2: {
                    if (this.field_o == -1L) {
                      break L2;
                    } else {
                      if ((this.field_o ^ -1L) < (this.field_p ^ -1L)) {
                        break L2;
                      } else {
                        if ((this.field_p + (long)param3 ^ -1L) < (this.field_o + (long)this.field_n ^ -1L)) {
                          break L2;
                        } else {
                          ka.a(this.field_k, (int)(this.field_p - this.field_o), param0, param2, param3);
                          this.field_p = this.field_p + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_p;
                    var7 = -21 / ((param1 - -73) / 52);
                    var8 = param2;
                    var9 = param3;
                    if (this.field_b > this.field_p) {
                      break L3;
                    } else {
                      if ((this.field_p ^ -1L) <= ((long)this.field_m + this.field_b ^ -1L)) {
                        break L3;
                      } else {
                        L4: {
                          var10_int = (int)(-this.field_p - (-this.field_b - (long)this.field_m));
                          if (param3 < var10_int) {
                            var10_int = param3;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ka.a(this.field_a, (int)(this.field_p + -this.field_b), param0, param2, var10_int);
                        param3 = param3 - var10_int;
                        param2 = param2 + var10_int;
                        this.field_p = this.field_p + (long)var10_int;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param3 > this.field_a.length) {
                      this.field_d.a(this.field_p, (byte) 93);
                      this.field_h = this.field_p;
                      L6: while (true) {
                        if ((param3 ^ -1) >= -1) {
                          break L5;
                        } else {
                          var10_int = this.field_d.a(param0, param3, param2, 12955);
                          if (-1 == var10_int) {
                            break L5;
                          } else {
                            param2 = param2 + var10_int;
                            param3 = param3 - var10_int;
                            this.field_h = this.field_h + (long)var10_int;
                            this.field_p = this.field_p + (long)var10_int;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      if ((param3 ^ -1) >= -1) {
                        break L5;
                      } else {
                        L7: {
                          this.c((byte) -127);
                          var10_int = param3;
                          if (var10_int <= this.field_m) {
                            break L7;
                          } else {
                            var10_int = this.field_m;
                            break L7;
                          }
                        }
                        ka.a(this.field_a, 0, param0, param2, var10_int);
                        param3 = param3 - var10_int;
                        param2 = param2 + var10_int;
                        this.field_p = this.field_p + (long)var10_int;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (0L == (this.field_o ^ -1L)) {
                      break L8;
                    } else {
                      L9: {
                        if ((this.field_p ^ -1L) <= (this.field_o ^ -1L)) {
                          break L9;
                        } else {
                          if (param3 > 0) {
                            L10: {
                              var10_int = (int)(-this.field_p + this.field_o) + param2;
                              if (param2 - -param3 >= var10_int) {
                                break L10;
                              } else {
                                var10_int = param2 - -param3;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (var10_int <= param2) {
                                break L9;
                              } else {
                                incrementValue$1 = param2;
                                param2++;
                                param0[incrementValue$1] = (byte) 0;
                                param3--;
                                this.field_p = this.field_p + 1L;
                                continue L11;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var10 = -1L;
                          if (this.field_o < var5_long) {
                            break L13;
                          } else {
                            if (((long)var9 + var5_long ^ -1L) >= (this.field_o ^ -1L)) {
                              break L13;
                            } else {
                              var10 = this.field_o;
                              break L12;
                            }
                          }
                        }
                        if ((this.field_o ^ -1L) < (var5_long ^ -1L)) {
                          break L12;
                        } else {
                          if ((this.field_o - -(long)this.field_n ^ -1L) < (var5_long ^ -1L)) {
                            var10 = var5_long;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          var12 = -1L;
                          if ((long)this.field_n + this.field_o <= var5_long) {
                            break L15;
                          } else {
                            if ((this.field_o + (long)this.field_n ^ -1L) < ((long)var9 + var5_long ^ -1L)) {
                              break L15;
                            } else {
                              var12 = (long)this.field_n + this.field_o;
                              break L14;
                            }
                          }
                        }
                        if (this.field_o >= (long)var9 + var5_long) {
                          break L14;
                        } else {
                          if (((long)this.field_n + this.field_o ^ -1L) > (var5_long - -(long)var9 ^ -1L)) {
                            break L14;
                          } else {
                            var12 = (long)var9 + var5_long;
                            break L14;
                          }
                        }
                      }
                      if ((var10 ^ -1L) >= 0L) {
                        break L8;
                      } else {
                        if ((var10 ^ -1L) <= (var12 ^ -1L)) {
                          break L8;
                        } else {
                          var14 = (int)(-var10 + var12);
                          ka.a(this.field_k, (int)(var10 + -this.field_o), param0, var8 - -(int)(-var5_long + var10), var14);
                          if ((var12 ^ -1L) < (this.field_p ^ -1L)) {
                            param3 = (int)((long)param3 - (-this.field_p + var12));
                            this.field_p = var12;
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
                } else {
                  throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param3);
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
              if (param3 <= 0) {
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
            stackOut_54_0 = (RuntimeException) (var5_ref);
            stackOut_54_1 = new StringBuilder().append("ak.H(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L16;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L16;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var3 = wa.a((byte) -117, param1);
            if (!param2) {
              L1: {
                if ((param0.indexOf(param1) ^ -1) != 0) {
                  break L1;
                } else {
                  if (0 != (param0.indexOf(var3) ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (param0.startsWith(param1)) {
                          break L3;
                        } else {
                          if (param0.startsWith(var3)) {
                            break L3;
                          } else {
                            if (param0.endsWith(param1)) {
                              break L3;
                            } else {
                              if (!param0.endsWith(var3)) {
                                stackOut_14_0 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("ak.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            if (param1 != 6605) {
                this.field_n = 83;
            }
            this.a(param0, (byte) -125, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ak.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_i < this.field_p + (long)param1) {
                    this.field_i = this.field_p + (long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_o == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_p < this.field_o) {
                        break L4;
                      } else {
                        if (this.field_o - -(long)this.field_n < this.field_p) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a(param0 + 1);
                    break L3;
                  }
                }
                L5: {
                  if (this.field_o == (long)param0) {
                    break L5;
                  } else {
                    if ((long)param1 + this.field_p > this.field_o + (long)this.field_k.length) {
                      var5_int = (int)((long)this.field_k.length + this.field_o + -this.field_p);
                      ka.a(param2, param3, this.field_k, (int)(-this.field_o + this.field_p), var5_int);
                      param1 = param1 - var5_int;
                      this.field_p = this.field_p + (long)var5_int;
                      param3 = param3 + var5_int;
                      this.field_n = this.field_k.length;
                      this.a(0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (param1 > this.field_k.length) {
                  L6: {
                    if ((this.field_h ^ -1L) == (this.field_p ^ -1L)) {
                      break L6;
                    } else {
                      this.field_d.a(this.field_p, (byte) 91);
                      this.field_h = this.field_p;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_d.a(param1, param2, param3, (byte) -107);
                    this.field_h = this.field_h + (long)param1;
                    if ((this.field_h ^ -1L) < (this.field_l ^ -1L)) {
                      this.field_l = this.field_h;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (this.field_p < this.field_b) {
                        break L9;
                      } else {
                        if (((long)this.field_m + this.field_b ^ -1L) < (this.field_p ^ -1L)) {
                          var5_long = this.field_p;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((this.field_p ^ -1L) < (this.field_b ^ -1L)) {
                      break L8;
                    } else {
                      if ((long)param1 + this.field_p > this.field_b) {
                        var5_long = this.field_b;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if ((this.field_b ^ -1L) <= (this.field_p - -(long)param1 ^ -1L)) {
                        break L11;
                      } else {
                        if (this.field_b + (long)this.field_m < (long)param1 + this.field_p) {
                          break L11;
                        } else {
                          var7 = (long)param1 + this.field_p;
                          break L10;
                        }
                      }
                    }
                    if ((long)this.field_m + this.field_b <= this.field_p) {
                      break L10;
                    } else {
                      if (this.field_b + (long)this.field_m > this.field_p - -(long)param1) {
                        break L10;
                      } else {
                        var7 = (long)this.field_m + this.field_b;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (-1L >= var5_long) {
                      break L12;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(var7 - var5_long);
                        ka.a(param2, (int)(-this.field_p + var5_long + (long)param3), this.field_a, (int)(-this.field_b + var5_long), var9);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_p = this.field_p + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (-1 > (param1 ^ -1)) {
                    L13: {
                      if ((this.field_o ^ -1L) != 0L) {
                        break L13;
                      } else {
                        this.field_o = this.field_p;
                        break L13;
                      }
                    }
                    L14: {
                      ka.a(param2, param3, this.field_k, (int)(-this.field_o + this.field_p), param1);
                      this.field_p = this.field_p + (long)param1;
                      if ((long)this.field_n >= this.field_p - this.field_o) {
                        break L14;
                      } else {
                        this.field_n = (int)(-this.field_o + this.field_p);
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
            stackOut_50_0 = (RuntimeException) (var5_ref);
            stackOut_50_1 = new StringBuilder().append("ak.D(").append(param0).append(',').append(param1).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L15;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param3 + ')');
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

    ak(b param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_n = 0;
        this.field_o = -1L;
        this.field_b = -1L;
        try {
            this.field_d = param0;
            dupTemp$0 = param0.b((byte) 73);
            this.field_l = dupTemp$0;
            this.field_i = dupTemp$0;
            this.field_a = new byte[param1];
            this.field_k = new byte[param2];
            this.field_p = 0L;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Members";
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_c = "Press the next button";
        field_j = "This password contains repeated characters, and would be easy to guess";
    }
}

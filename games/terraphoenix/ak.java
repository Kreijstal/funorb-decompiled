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
        ((ak) this).field_d.a(118);
    }

    final static void b(int param0) {
        int var1 = -86 / ((4 - param0) / 52);
        rd.field_k = new jj();
    }

    final long a(byte param0) {
        int var2 = 36 % ((-70 - param0) / 40);
        return ((ak) this).field_i;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_j = null;
        if (param0) {
            field_c = null;
        }
        field_g = null;
    }

    private final void c() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        ((ak) this).field_m = 0;
        if (((ak) this).field_p != ((ak) this).field_h) {
            ((ak) this).field_d.a(((ak) this).field_p, (byte) 89);
            ((ak) this).field_h = ((ak) this).field_p;
        }
        ((ak) this).field_b = ((ak) this).field_p;
        while (((ak) this).field_m < ((ak) this).field_a.length) {
            var2 = ((ak) this).field_a.length - ((ak) this).field_m;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((ak) this).field_d.a(((ak) this).field_a, var2, ((ak) this).field_m, 12955);
            if (var3 == -1) {
                break;
            }
            ((ak) this).field_m = ((ak) this).field_m + var3;
            ((ak) this).field_h = ((ak) this).field_h + (long)var3;
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (param0) {
            return;
        }
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((ak) this).field_p = param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = Terraphoenix.field_V;
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
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          if (((ak) this).field_o == -1L) {
            break L0;
          } else {
            L1: {
              if (((ak) this).field_o == ((ak) this).field_h) {
                break L1;
              } else {
                ((ak) this).field_d.a(((ak) this).field_o, (byte) 81);
                ((ak) this).field_h = ((ak) this).field_o;
                break L1;
              }
            }
            L2: {
              ((ak) this).field_d.a(((ak) this).field_n, ((ak) this).field_k, 0, (byte) -73);
              ((ak) this).field_h = ((ak) this).field_h + (long)((ak) this).field_n;
              if (((ak) this).field_h <= ((ak) this).field_l) {
                break L2;
              } else {
                ((ak) this).field_l = ((ak) this).field_h;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((ak) this).field_b > ((ak) this).field_o) {
                  break L4;
                } else {
                  if (((ak) this).field_o >= (long)((ak) this).field_m + ((ak) this).field_b) {
                    break L4;
                  } else {
                    var2 = ((ak) this).field_o;
                    break L3;
                  }
                }
              }
              if (((ak) this).field_b < ((ak) this).field_o) {
                break L3;
              } else {
                if (((ak) this).field_b >= (long)((ak) this).field_n + ((ak) this).field_o) {
                  break L3;
                } else {
                  var2 = ((ak) this).field_b;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((ak) this).field_b >= ((ak) this).field_o - -(long)((ak) this).field_n) {
                  break L6;
                } else {
                  if (~((long)((ak) this).field_n + ((ak) this).field_o) < ~((long)((ak) this).field_m + ((ak) this).field_b)) {
                    break L6;
                  } else {
                    var4 = (long)((ak) this).field_n + ((ak) this).field_o;
                    break L5;
                  }
                }
              }
              if (((ak) this).field_b + (long)((ak) this).field_m <= ((ak) this).field_o) {
                break L5;
              } else {
                if (~((long)((ak) this).field_n + ((ak) this).field_o) > ~(((ak) this).field_b + (long)((ak) this).field_m)) {
                  break L5;
                } else {
                  var4 = (long)((ak) this).field_m + ((ak) this).field_b;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (~var4 < ~var2) {
                  var6 = (int)(-var2 + var4);
                  ka.a(((ak) this).field_k, (int)(-((ak) this).field_o + var2), ((ak) this).field_a, (int)(-((ak) this).field_b + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ak) this).field_o = -1L;
            ((ak) this).field_n = 0;
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
            if (param3 + param2 <= param0.length) {
              L1: {
                if (((ak) this).field_o == -1L) {
                  break L1;
                } else {
                  if (~((ak) this).field_o < ~((ak) this).field_p) {
                    break L1;
                  } else {
                    if (~(((ak) this).field_p + (long)param3) < ~(((ak) this).field_o + (long)((ak) this).field_n)) {
                      break L1;
                    } else {
                      ka.a(((ak) this).field_k, (int)(((ak) this).field_p - ((ak) this).field_o), param0, param2, param3);
                      ((ak) this).field_p = ((ak) this).field_p + (long)param3;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((ak) this).field_p;
                var7 = -21 / ((param1 - -73) / 52);
                var8 = param2;
                var9 = param3;
                if (((ak) this).field_b > ((ak) this).field_p) {
                  break L2;
                } else {
                  if (~((ak) this).field_p <= ~((long)((ak) this).field_m + ((ak) this).field_b)) {
                    break L2;
                  } else {
                    L3: {
                      var10_int = (int)(-((ak) this).field_p - (-((ak) this).field_b - (long)((ak) this).field_m));
                      if (param3 < var10_int) {
                        var10_int = param3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ka.a(((ak) this).field_a, (int)(((ak) this).field_p + -((ak) this).field_b), param0, param2, var10_int);
                    param3 = param3 - var10_int;
                    param2 = param2 + var10_int;
                    ((ak) this).field_p = ((ak) this).field_p + (long)var10_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (param3 > ((ak) this).field_a.length) {
                  ((ak) this).field_d.a(((ak) this).field_p, (byte) 93);
                  ((ak) this).field_h = ((ak) this).field_p;
                  L5: while (true) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      var10_int = ((ak) this).field_d.a(param0, param3, param2, 12955);
                      if (-1 == var10_int) {
                        break L4;
                      } else {
                        param2 = param2 + var10_int;
                        param3 = param3 - var10_int;
                        ((ak) this).field_h = ((ak) this).field_h + (long)var10_int;
                        ((ak) this).field_p = ((ak) this).field_p + (long)var10_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param3 <= 0) {
                    break L4;
                  } else {
                    L6: {
                      int discarded$2 = -127;
                      this.c();
                      var10_int = param3;
                      if (var10_int <= ((ak) this).field_m) {
                        break L6;
                      } else {
                        var10_int = ((ak) this).field_m;
                        break L6;
                      }
                    }
                    ka.a(((ak) this).field_a, 0, param0, param2, var10_int);
                    param3 = param3 - var10_int;
                    param2 = param2 + var10_int;
                    ((ak) this).field_p = ((ak) this).field_p + (long)var10_int;
                    break L4;
                  }
                }
              }
              L7: {
                if (((ak) this).field_o == -1L) {
                  break L7;
                } else {
                  L8: {
                    if (~((ak) this).field_p <= ~((ak) this).field_o) {
                      break L8;
                    } else {
                      if (param3 > 0) {
                        L9: {
                          var10_int = (int)(-((ak) this).field_p + ((ak) this).field_o) + param2;
                          if (param2 - -param3 >= var10_int) {
                            break L9;
                          } else {
                            var10_int = param2 - -param3;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var10_int <= param2) {
                            break L8;
                          } else {
                            int incrementValue$3 = param2;
                            param2++;
                            param0[incrementValue$3] = (byte) 0;
                            param3--;
                            ((ak) this).field_p = ((ak) this).field_p + 1L;
                            continue L10;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var10 = -1L;
                      if (((ak) this).field_o < var5_long) {
                        break L12;
                      } else {
                        if (~((long)var9 + var5_long) >= ~((ak) this).field_o) {
                          break L12;
                        } else {
                          var10 = ((ak) this).field_o;
                          break L11;
                        }
                      }
                    }
                    if (~((ak) this).field_o < ~var5_long) {
                      break L11;
                    } else {
                      if (~(((ak) this).field_o - -(long)((ak) this).field_n) < ~var5_long) {
                        var10 = var5_long;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var12 = -1L;
                      if ((long)((ak) this).field_n + ((ak) this).field_o <= var5_long) {
                        break L14;
                      } else {
                        if (~(((ak) this).field_o + (long)((ak) this).field_n) < ~((long)var9 + var5_long)) {
                          break L14;
                        } else {
                          var12 = (long)((ak) this).field_n + ((ak) this).field_o;
                          break L13;
                        }
                      }
                    }
                    if (((ak) this).field_o >= (long)var9 + var5_long) {
                      break L13;
                    } else {
                      if (~((long)((ak) this).field_n + ((ak) this).field_o) > ~(var5_long - -(long)var9)) {
                        break L13;
                      } else {
                        var12 = (long)var9 + var5_long;
                        break L13;
                      }
                    }
                  }
                  if (var10 <= -1L) {
                    break L7;
                  } else {
                    if (~var10 <= ~var12) {
                      break L7;
                    } else {
                      var14 = (int)(-var10 + var12);
                      ka.a(((ak) this).field_k, (int)(var10 + -((ak) this).field_o), param0, var8 - -(int)(-var5_long + var10), var14);
                      if (~var12 < ~((ak) this).field_p) {
                        param3 = (int)((long)param3 - (-((ak) this).field_p + var12));
                        ((ak) this).field_p = var12;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              if (param3 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param3);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ak) this).field_h = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var5_ref;
            stackOut_54_1 = new StringBuilder().append("ak.H(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L15;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L15;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean a(String param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var3 = wa.a((byte) -117, param1);
            L1: {
              if (param0.indexOf(param1) != 0) {
                break L1;
              } else {
                if (0 != param0.indexOf(var3)) {
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
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L2;
                  }
                  break L0;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ak.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 0 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            if (param1 != 6605) {
                ((ak) this).field_n = 83;
            }
            ((ak) this).a(param0, (byte) -125, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ak.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
            L1: {
              if (((ak) this).field_i < ((ak) this).field_p + (long)param1) {
                ((ak) this).field_i = ((ak) this).field_p + (long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ak) this).field_o == -1L) {
                break L2;
              } else {
                L3: {
                  if (((ak) this).field_p < ((ak) this).field_o) {
                    break L3;
                  } else {
                    if (((ak) this).field_o - -(long)((ak) this).field_n < ((ak) this).field_p) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(param0 + 1);
                break L2;
              }
            }
            L4: {
              if (((ak) this).field_o == (long)param0) {
                break L4;
              } else {
                if ((long)param1 + ((ak) this).field_p > ((ak) this).field_o + (long)((ak) this).field_k.length) {
                  var5_int = (int)((long)((ak) this).field_k.length + ((ak) this).field_o + -((ak) this).field_p);
                  ka.a(param2, param3, ((ak) this).field_k, (int)(-((ak) this).field_o + ((ak) this).field_p), var5_int);
                  param1 = param1 - var5_int;
                  ((ak) this).field_p = ((ak) this).field_p + (long)var5_int;
                  param3 = param3 + var5_int;
                  ((ak) this).field_n = ((ak) this).field_k.length;
                  this.a(0);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param1 > ((ak) this).field_k.length) {
              L5: {
                if (~((ak) this).field_h == ~((ak) this).field_p) {
                  break L5;
                } else {
                  ((ak) this).field_d.a(((ak) this).field_p, (byte) 91);
                  ((ak) this).field_h = ((ak) this).field_p;
                  break L5;
                }
              }
              L6: {
                ((ak) this).field_d.a(param1, param2, param3, (byte) -107);
                ((ak) this).field_h = ((ak) this).field_h + (long)param1;
                if (~((ak) this).field_h < ~((ak) this).field_l) {
                  ((ak) this).field_l = ((ak) this).field_h;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((ak) this).field_p < ((ak) this).field_b) {
                    break L8;
                  } else {
                    if (~((long)((ak) this).field_m + ((ak) this).field_b) < ~((ak) this).field_p) {
                      var5_long = ((ak) this).field_p;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (~((ak) this).field_p < ~((ak) this).field_b) {
                  break L7;
                } else {
                  if ((long)param1 + ((ak) this).field_p > ((ak) this).field_b) {
                    var5_long = ((ak) this).field_b;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  if (~((ak) this).field_b <= ~(((ak) this).field_p - -(long)param1)) {
                    break L10;
                  } else {
                    if (((ak) this).field_b + (long)((ak) this).field_m < (long)param1 + ((ak) this).field_p) {
                      break L10;
                    } else {
                      var7 = (long)param1 + ((ak) this).field_p;
                      break L9;
                    }
                  }
                }
                if ((long)((ak) this).field_m + ((ak) this).field_b <= ((ak) this).field_p) {
                  break L9;
                } else {
                  if (((ak) this).field_b + (long)((ak) this).field_m > ((ak) this).field_p - -(long)param1) {
                    break L9;
                  } else {
                    var7 = (long)((ak) this).field_m + ((ak) this).field_b;
                    break L9;
                  }
                }
              }
              L11: {
                if (-1L >= var5_long) {
                  break L11;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(var7 - var5_long);
                    ka.a(param2, (int)(-((ak) this).field_p + var5_long + (long)param3), ((ak) this).field_a, (int)(-((ak) this).field_b + var5_long), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((ak) this).field_p = ((ak) this).field_p + (long)param1;
              return;
            } else {
              if (param1 > 0) {
                L12: {
                  if (((ak) this).field_o != -1L) {
                    break L12;
                  } else {
                    ((ak) this).field_o = ((ak) this).field_p;
                    break L12;
                  }
                }
                L13: {
                  ka.a(param2, param3, ((ak) this).field_k, (int)(-((ak) this).field_o + ((ak) this).field_p), param1);
                  ((ak) this).field_p = ((ak) this).field_p + (long)param1;
                  if ((long)((ak) this).field_n >= ((ak) this).field_p - ((ak) this).field_o) {
                    break L13;
                  } else {
                    ((ak) this).field_n = (int)(-((ak) this).field_o + ((ak) this).field_p);
                    break L13;
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ak) this).field_h = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5_ref;
            stackOut_50_1 = new StringBuilder().append("ak.D(").append(param0).append(44).append(param1).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L14;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L14;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param3 + 41);
        }
    }

    ak(b param0, int param1, int param2) throws IOException {
        ((ak) this).field_n = 0;
        ((ak) this).field_o = -1L;
        ((ak) this).field_b = -1L;
        try {
            ((ak) this).field_d = param0;
            long dupTemp$0 = param0.b((byte) 73);
            ((ak) this).field_l = dupTemp$0;
            ((ak) this).field_i = dupTemp$0;
            ((ak) this).field_a = new byte[param1];
            ((ak) this).field_k = new byte[param2];
            ((ak) this).field_p = 0L;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ak.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Members";
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_c = "Press the next button";
        field_j = "This password contains repeated characters, and would be easy to guess";
    }
}

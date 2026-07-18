/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private byte[] field_e;
    static String field_a;
    private long field_g;
    static int field_o;
    private int field_p;
    static String[] field_d;
    private byte[] field_i;
    private long field_f;
    private long field_b;
    private long field_m;
    static String field_r;
    private long field_q;
    static String field_l;
    static String field_n;
    private ji field_h;
    private long field_j;
    static int[] field_s;
    private int field_k;
    static int field_c;

    final void b(byte param0) throws IOException {
        if (param0 != 14) {
            ((nh) this).field_f = -101L;
        }
        this.a(-1);
        ((nh) this).field_h.b(0);
    }

    final long a(byte param0) {
        if (param0 < 124) {
            return 75L;
        }
        return ((nh) this).field_b;
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (((nh) this).field_m == (long)param0) {
            break L0;
          } else {
            L1: {
              if (((nh) this).field_g != ((nh) this).field_m) {
                ((nh) this).field_h.a(param0 + 110, ((nh) this).field_m);
                ((nh) this).field_g = ((nh) this).field_m;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((nh) this).field_h.a(((nh) this).field_p, ((nh) this).field_i, 0, false);
              ((nh) this).field_g = ((nh) this).field_g + (long)((nh) this).field_p;
              if (~((nh) this).field_g >= ~((nh) this).field_q) {
                break L2;
              } else {
                ((nh) this).field_q = ((nh) this).field_g;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((nh) this).field_m < ((nh) this).field_f) {
                  break L4;
                } else {
                  if (~((nh) this).field_m <= ~(((nh) this).field_f - -(long)((nh) this).field_k)) {
                    break L4;
                  } else {
                    var2 = ((nh) this).field_m;
                    break L3;
                  }
                }
              }
              if (((nh) this).field_f < ((nh) this).field_m) {
                break L3;
              } else {
                if ((long)((nh) this).field_p + ((nh) this).field_m <= ((nh) this).field_f) {
                  break L3;
                } else {
                  var2 = ((nh) this).field_f;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((nh) this).field_f <= ~((long)((nh) this).field_p + ((nh) this).field_m)) {
                  break L6;
                } else {
                  if ((long)((nh) this).field_k + ((nh) this).field_f >= (long)((nh) this).field_p + ((nh) this).field_m) {
                    var4 = (long)((nh) this).field_p + ((nh) this).field_m;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((nh) this).field_m <= ~(((nh) this).field_f + (long)((nh) this).field_k)) {
                break L5;
              } else {
                if (((nh) this).field_f + (long)((nh) this).field_k > ((nh) this).field_m - -(long)((nh) this).field_p) {
                  break L5;
                } else {
                  var4 = (long)((nh) this).field_k + ((nh) this).field_f;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (~var4 < ~var2) {
                  var6 = (int)(var4 + -var2);
                  ek.a(((nh) this).field_i, (int)(var2 + -((nh) this).field_m), ((nh) this).field_e, (int)(var2 + -((nh) this).field_f), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((nh) this).field_m = -1L;
            ((nh) this).field_p = 0;
            break L0;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 + param0 <= param2.length) {
              L1: {
                if (((nh) this).field_m == -1L) {
                  break L1;
                } else {
                  if (~((nh) this).field_j > ~((nh) this).field_m) {
                    break L1;
                  } else {
                    if (~((long)param1 + ((nh) this).field_j) < ~(((nh) this).field_m - -(long)((nh) this).field_p)) {
                      break L1;
                    } else {
                      ek.a(((nh) this).field_i, (int)(-((nh) this).field_m + ((nh) this).field_j), param2, param0, param1);
                      ((nh) this).field_j = ((nh) this).field_j + (long)param1;
                      return;
                    }
                  }
                }
              }
              var5_long = ((nh) this).field_j;
              if (param3 >= 122) {
                L2: {
                  var7 = param0;
                  var8 = param1;
                  if (((nh) this).field_j < ((nh) this).field_f) {
                    break L2;
                  } else {
                    if (((nh) this).field_j >= ((nh) this).field_f - -(long)((nh) this).field_k) {
                      break L2;
                    } else {
                      L3: {
                        var9_int = (int)(-((nh) this).field_j + (((nh) this).field_f + (long)((nh) this).field_k));
                        if (param1 >= var9_int) {
                          break L3;
                        } else {
                          var9_int = param1;
                          break L3;
                        }
                      }
                      ek.a(((nh) this).field_e, (int)(((nh) this).field_j + -((nh) this).field_f), param2, param0, var9_int);
                      param0 = param0 + var9_int;
                      ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                      param1 = param1 - var9_int;
                      break L2;
                    }
                  }
                }
                L4: {
                  if (((nh) this).field_e.length < param1) {
                    ((nh) this).field_h.a(-119, ((nh) this).field_j);
                    ((nh) this).field_g = ((nh) this).field_j;
                    L5: while (true) {
                      if (param1 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((nh) this).field_h.a(param1, param0, 1, param2);
                        if (var9_int == -1) {
                          break L4;
                        } else {
                          ((nh) this).field_g = ((nh) this).field_g + (long)var9_int;
                          param1 = param1 - var9_int;
                          ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                          param0 = param0 + var9_int;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    if (param1 <= 0) {
                      break L4;
                    } else {
                      L6: {
                        int discarded$2 = 17460;
                        this.b();
                        var9_int = param1;
                        if (var9_int > ((nh) this).field_k) {
                          var9_int = ((nh) this).field_k;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ek.a(((nh) this).field_e, 0, param2, param0, var9_int);
                      ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                      param0 = param0 + var9_int;
                      param1 = param1 - var9_int;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (-1L == ((nh) this).field_m) {
                    break L7;
                  } else {
                    L8: {
                      if (((nh) this).field_m <= ((nh) this).field_j) {
                        break L8;
                      } else {
                        if (param1 > 0) {
                          L9: {
                            var9_int = (int)(-((nh) this).field_j + ((nh) this).field_m) + param0;
                            if (param0 + param1 < var9_int) {
                              var9_int = param1 + param0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (var9_int <= param0) {
                              break L8;
                            } else {
                              int incrementValue$3 = param0;
                              param0++;
                              param2[incrementValue$3] = (byte) 0;
                              param1--;
                              ((nh) this).field_j = ((nh) this).field_j + 1L;
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
                        var9 = -1L;
                        var11 = -1L;
                        if (~var5_long < ~((nh) this).field_m) {
                          break L12;
                        } else {
                          if (((nh) this).field_m < (long)var8 + var5_long) {
                            var9 = ((nh) this).field_m;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (~((nh) this).field_m < ~var5_long) {
                        break L11;
                      } else {
                        if (~(((nh) this).field_m + (long)((nh) this).field_p) >= ~var5_long) {
                          break L11;
                        } else {
                          var9 = var5_long;
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (((nh) this).field_m + (long)((nh) this).field_p <= var5_long) {
                          break L14;
                        } else {
                          if (((nh) this).field_m + (long)((nh) this).field_p > var5_long - -(long)var8) {
                            break L14;
                          } else {
                            var11 = (long)((nh) this).field_p + ((nh) this).field_m;
                            break L13;
                          }
                        }
                      }
                      if (((nh) this).field_m >= var5_long + (long)var8) {
                        break L13;
                      } else {
                        if ((long)((nh) this).field_p + ((nh) this).field_m >= (long)var8 + var5_long) {
                          var11 = var5_long + (long)var8;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var9 <= -1L) {
                      break L7;
                    } else {
                      if (~var11 >= ~var9) {
                        break L7;
                      } else {
                        var13 = (int)(-var9 + var11);
                        ek.a(((nh) this).field_i, (int)(-((nh) this).field_m + var9), param2, var7 + (int)(var9 - var5_long), var13);
                        if (~((nh) this).field_j <= ~var11) {
                          break L7;
                        } else {
                          param1 = (int)((long)param1 - (var11 - ((nh) this).field_j));
                          ((nh) this).field_j = var11;
                          break L7;
                        }
                      }
                    }
                  }
                }
                if (param1 <= 0) {
                  break L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param2.length + param0 - -param1);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((nh) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var5_ref;
            stackOut_57_1 = new StringBuilder().append("nh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L15;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L15;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
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
              ((nh) this).a(0, param1.length, param1, (byte) 124);
              if (param0 == -102) {
                break L1;
              } else {
                ((nh) this).field_m = 89L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("nh.H(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void b() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        ((nh) this).field_k = 0;
        if (~((nh) this).field_j != ~((nh) this).field_g) {
            ((nh) this).field_h.a(-100, ((nh) this).field_j);
            ((nh) this).field_g = ((nh) this).field_j;
        }
        ((nh) this).field_f = ((nh) this).field_j;
        while (((nh) this).field_k < ((nh) this).field_e.length) {
            var2 = -((nh) this).field_k + ((nh) this).field_e.length;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((nh) this).field_h.a(var2, ((nh) this).field_k, 1, ((nh) this).field_e);
            if (var3 == -1) {
                break;
            }
            ((nh) this).field_k = ((nh) this).field_k + var3;
            ((nh) this).field_g = ((nh) this).field_g + (long)var3;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 0) {
        }
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        ((nh) this).field_j = param0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((long)param2 + ((nh) this).field_j <= ((nh) this).field_b) {
                break L1;
              } else {
                ((nh) this).field_b = (long)param2 + ((nh) this).field_j;
                break L1;
              }
            }
            L2: {
              if (((nh) this).field_m == -1L) {
                break L2;
              } else {
                if (((nh) this).field_m <= ((nh) this).field_j) {
                  if (((nh) this).field_m + (long)((nh) this).field_p >= ((nh) this).field_j) {
                    break L2;
                  } else {
                    this.a(-1);
                    break L2;
                  }
                } else {
                  this.a(-1);
                  break L2;
                }
              }
            }
            L3: {
              if (((nh) this).field_m == -1L) {
                break L3;
              } else {
                if (((nh) this).field_j + (long)param2 <= ((nh) this).field_m + (long)((nh) this).field_i.length) {
                  break L3;
                } else {
                  var5_int = (int)((long)((nh) this).field_i.length - ((nh) this).field_j - -((nh) this).field_m);
                  ek.a(param1, param0, ((nh) this).field_i, (int)(((nh) this).field_j + -((nh) this).field_m), var5_int);
                  param2 = param2 - var5_int;
                  ((nh) this).field_j = ((nh) this).field_j + (long)var5_int;
                  param0 = param0 + var5_int;
                  ((nh) this).field_p = ((nh) this).field_i.length;
                  this.a(param3 + -1);
                  break L3;
                }
              }
            }
            if (param2 > ((nh) this).field_i.length) {
              L4: {
                if (((nh) this).field_g == ((nh) this).field_j) {
                  break L4;
                } else {
                  ((nh) this).field_h.a(81, ((nh) this).field_j);
                  ((nh) this).field_g = ((nh) this).field_j;
                  break L4;
                }
              }
              L5: {
                ((nh) this).field_h.a(param2, param1, param0, false);
                ((nh) this).field_g = ((nh) this).field_g + (long)param2;
                if (((nh) this).field_g <= ((nh) this).field_q) {
                  break L5;
                } else {
                  ((nh) this).field_q = ((nh) this).field_g;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var5_long = -1L;
                  if (~((nh) this).field_j > ~((nh) this).field_f) {
                    break L7;
                  } else {
                    if ((long)((nh) this).field_k + ((nh) this).field_f > ((nh) this).field_j) {
                      var5_long = ((nh) this).field_j;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (~((nh) this).field_j < ~((nh) this).field_f) {
                  break L6;
                } else {
                  if (~((nh) this).field_f <= ~((long)param2 + ((nh) this).field_j)) {
                    break L6;
                  } else {
                    var5_long = ((nh) this).field_f;
                    break L6;
                  }
                }
              }
              L8: {
                L9: {
                  var7 = -1L;
                  if (~(((nh) this).field_j - -(long)param2) >= ~((nh) this).field_f) {
                    break L9;
                  } else {
                    if (((nh) this).field_j + (long)param2 > (long)((nh) this).field_k + ((nh) this).field_f) {
                      break L9;
                    } else {
                      var7 = (long)param2 + ((nh) this).field_j;
                      break L8;
                    }
                  }
                }
                if (((nh) this).field_f + (long)((nh) this).field_k <= ((nh) this).field_j) {
                  break L8;
                } else {
                  if (((nh) this).field_f - -(long)((nh) this).field_k > ((nh) this).field_j + (long)param2) {
                    break L8;
                  } else {
                    var7 = ((nh) this).field_f + (long)((nh) this).field_k;
                    break L8;
                  }
                }
              }
              L10: {
                if (var5_long <= -1L) {
                  break L10;
                } else {
                  if (~var7 >= ~var5_long) {
                    break L10;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    ek.a(param1, (int)(var5_long + ((long)param0 + -((nh) this).field_j)), ((nh) this).field_e, (int)(var5_long - ((nh) this).field_f), var9);
                    break L10;
                  }
                }
              }
              ((nh) this).field_j = ((nh) this).field_j + (long)param2;
              return;
            } else {
              if (param2 > param3) {
                L11: {
                  if (((nh) this).field_m == -1L) {
                    ((nh) this).field_m = ((nh) this).field_j;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  ek.a(param1, param0, ((nh) this).field_i, (int)(-((nh) this).field_m + ((nh) this).field_j), param2);
                  ((nh) this).field_j = ((nh) this).field_j + (long)param2;
                  if (-((nh) this).field_m + ((nh) this).field_j <= (long)((nh) this).field_p) {
                    break L12;
                  } else {
                    ((nh) this).field_p = (int)(((nh) this).field_j - ((nh) this).field_m);
                    break L12;
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
          ((nh) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5_ref;
            stackOut_47_1 = new StringBuilder().append("nh.D(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L13;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L13;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_s = null;
        field_n = null;
        field_d = null;
        field_a = null;
        field_l = null;
        field_r = null;
    }

    nh(ji param0, int param1, int param2) throws IOException {
        ((nh) this).field_m = -1L;
        ((nh) this).field_f = -1L;
        ((nh) this).field_p = 0;
        try {
            ((nh) this).field_h = param0;
            long dupTemp$0 = param0.a((byte) 104);
            ((nh) this).field_q = dupTemp$0;
            ((nh) this).field_b = dupTemp$0;
            ((nh) this).field_i = new byte[param2];
            ((nh) this).field_e = new byte[param1];
            ((nh) this).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Loading music";
        field_l = "Passwords must be between 5 and 20 characters long";
        field_a = "Spectate";
        field_n = "Message lobby";
    }
}

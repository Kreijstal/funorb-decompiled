/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uo {
    private long field_g;
    private long field_q;
    private long field_p;
    static dj field_b;
    private byte[] field_k;
    private int field_c;
    private byte[] field_l;
    private long field_f;
    private lj field_h;
    private long field_o;
    private long field_n;
    private int field_e;
    static int field_i;
    static int field_j;
    static String field_d;
    static sb field_m;
    static int field_a;

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((uo) this).field_n + (long)param0 <= ((uo) this).field_o) {
                break L1;
              } else {
                ((uo) this).field_o = ((uo) this).field_n - -(long)param0;
                break L1;
              }
            }
            L2: {
              if (((uo) this).field_g == -1L) {
                break L2;
              } else {
                if (((uo) this).field_g <= ((uo) this).field_n) {
                  if (~((uo) this).field_n >= ~(((uo) this).field_g - -(long)((uo) this).field_c)) {
                    break L2;
                  } else {
                    this.a((byte) 28);
                    break L2;
                  }
                } else {
                  this.a((byte) 28);
                  break L2;
                }
              }
            }
            L3: {
              if (((uo) this).field_g == -1L) {
                break L3;
              } else {
                if (~((long)param0 + ((uo) this).field_n) >= ~(((uo) this).field_g - -(long)((uo) this).field_l.length)) {
                  break L3;
                } else {
                  var5_int = (int)((long)((uo) this).field_l.length + (((uo) this).field_g + -((uo) this).field_n));
                  qb.a(param3, param1, ((uo) this).field_l, (int)(((uo) this).field_n - ((uo) this).field_g), var5_int);
                  param1 = param1 + var5_int;
                  param0 = param0 - var5_int;
                  ((uo) this).field_n = ((uo) this).field_n + (long)var5_int;
                  ((uo) this).field_c = ((uo) this).field_l.length;
                  this.a((byte) 28);
                  break L3;
                }
              }
            }
            if (((uo) this).field_l.length < param0) {
              L4: {
                if (~((uo) this).field_p == ~((uo) this).field_n) {
                  break L4;
                } else {
                  ((uo) this).field_h.a(false, ((uo) this).field_n);
                  ((uo) this).field_p = ((uo) this).field_n;
                  break L4;
                }
              }
              L5: {
                ((uo) this).field_h.a(param0, param3, param1, -80);
                ((uo) this).field_p = ((uo) this).field_p + (long)param0;
                if (((uo) this).field_p > ((uo) this).field_q) {
                  ((uo) this).field_q = ((uo) this).field_p;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  var5_long = -1L;
                  if (~((uo) this).field_n > ~((uo) this).field_f) {
                    break L7;
                  } else {
                    if (((uo) this).field_n >= (long)((uo) this).field_e + ((uo) this).field_f) {
                      break L7;
                    } else {
                      var5_long = ((uo) this).field_n;
                      break L6;
                    }
                  }
                }
                if (((uo) this).field_f < ((uo) this).field_n) {
                  break L6;
                } else {
                  if (~((uo) this).field_f > ~((long)param0 + ((uo) this).field_n)) {
                    var5_long = ((uo) this).field_f;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                L9: {
                  var7 = -1L;
                  if (~((uo) this).field_f <= ~(((uo) this).field_n + (long)param0)) {
                    break L9;
                  } else {
                    if (~((long)param0 + ((uo) this).field_n) >= ~(((uo) this).field_f + (long)((uo) this).field_e)) {
                      var7 = ((uo) this).field_n + (long)param0;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (~((long)((uo) this).field_e + ((uo) this).field_f) >= ~((uo) this).field_n) {
                  break L8;
                } else {
                  if (~(((uo) this).field_n + (long)param0) > ~(((uo) this).field_f - -(long)((uo) this).field_e)) {
                    break L8;
                  } else {
                    var7 = (long)((uo) this).field_e + ((uo) this).field_f;
                    break L8;
                  }
                }
              }
              L10: {
                if (var5_long <= -1L) {
                  break L10;
                } else {
                  if (~var5_long <= ~var7) {
                    break L10;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    qb.a(param3, (int)((long)param1 + var5_long + -((uo) this).field_n), ((uo) this).field_k, (int)(var5_long - ((uo) this).field_f), var9);
                    break L10;
                  }
                }
              }
              ((uo) this).field_n = ((uo) this).field_n + (long)param0;
              return;
            } else {
              if (param2 <= -67) {
                if (param0 <= 0) {
                  break L0;
                } else {
                  L11: {
                    if (-1L == ((uo) this).field_g) {
                      ((uo) this).field_g = ((uo) this).field_n;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    qb.a(param3, param1, ((uo) this).field_l, (int)(((uo) this).field_n + -((uo) this).field_g), param0);
                    ((uo) this).field_n = ((uo) this).field_n + (long)param0;
                    if (-((uo) this).field_g + ((uo) this).field_n > (long)((uo) this).field_c) {
                      ((uo) this).field_c = (int)(-((uo) this).field_g + ((uo) this).field_n);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((uo) this).field_p = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("uo.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param3 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L13;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L13;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param0.length >= param3 - -param2) {
              L1: {
                if (((uo) this).field_g == -1L) {
                  break L1;
                } else {
                  if (~((uo) this).field_g < ~((uo) this).field_n) {
                    break L1;
                  } else {
                    if (~((long)param2 + ((uo) this).field_n) >= ~((long)((uo) this).field_c + ((uo) this).field_g)) {
                      qb.a(((uo) this).field_l, (int)(-((uo) this).field_g + ((uo) this).field_n), param0, param3, param2);
                      ((uo) this).field_n = ((uo) this).field_n + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((uo) this).field_n;
                var7 = param3;
                var8 = param2;
                if (~((uo) this).field_n > ~((uo) this).field_f) {
                  break L2;
                } else {
                  if (((uo) this).field_n >= ((uo) this).field_f + (long)((uo) this).field_e) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)((long)((uo) this).field_e - (((uo) this).field_n - ((uo) this).field_f));
                      if (var9_int <= param2) {
                        break L3;
                      } else {
                        var9_int = param2;
                        break L3;
                      }
                    }
                    qb.a(((uo) this).field_k, (int)(((uo) this).field_n + -((uo) this).field_f), param0, param3, var9_int);
                    param3 = param3 + var9_int;
                    ((uo) this).field_n = ((uo) this).field_n + (long)var9_int;
                    param2 = param2 - var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (((uo) this).field_k.length < param2) {
                  ((uo) this).field_h.a(false, ((uo) this).field_n);
                  ((uo) this).field_p = ((uo) this).field_n;
                  L5: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((uo) this).field_h.a(false, param3, param2, param0);
                      if (-1 != var9_int) {
                        ((uo) this).field_n = ((uo) this).field_n + (long)var9_int;
                        param3 = param3 + var9_int;
                        param2 = param2 - var9_int;
                        ((uo) this).field_p = ((uo) this).field_p + (long)var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (0 < param2) {
                    L6: {
                      this.c(200000000);
                      var9_int = param2;
                      if (((uo) this).field_e >= var9_int) {
                        break L6;
                      } else {
                        var9_int = ((uo) this).field_e;
                        break L6;
                      }
                    }
                    qb.a(((uo) this).field_k, 0, param0, param3, var9_int);
                    param3 = param3 + var9_int;
                    ((uo) this).field_n = ((uo) this).field_n + (long)var9_int;
                    param2 = param2 - var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              if (param1 == 24) {
                L7: {
                  if (((uo) this).field_g != -1L) {
                    L8: {
                      if (~((uo) this).field_n <= ~((uo) this).field_g) {
                        break L8;
                      } else {
                        if (0 < param2) {
                          L9: {
                            var9_int = param3 + (int)(((uo) this).field_g - ((uo) this).field_n);
                            if (param3 + param2 < var9_int) {
                              var9_int = param3 + param2;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (param3 >= var9_int) {
                              break L8;
                            } else {
                              param2--;
                              int incrementValue$1 = param3;
                              param3++;
                              param0[incrementValue$1] = (byte) 0;
                              ((uo) this).field_n = ((uo) this).field_n + 1L;
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
                        if (~((uo) this).field_g > ~var5_long) {
                          break L12;
                        } else {
                          if (~((uo) this).field_g > ~((long)var8 + var5_long)) {
                            var9 = ((uo) this).field_g;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (~((uo) this).field_g < ~var5_long) {
                        break L11;
                      } else {
                        if (~var5_long > ~(((uo) this).field_g - -(long)((uo) this).field_c)) {
                          var9 = var5_long;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        var11 = -1L;
                        if (var5_long >= ((uo) this).field_g + (long)((uo) this).field_c) {
                          break L14;
                        } else {
                          if (~((long)((uo) this).field_c + ((uo) this).field_g) < ~(var5_long + (long)var8)) {
                            break L14;
                          } else {
                            var11 = (long)((uo) this).field_c + ((uo) this).field_g;
                            break L13;
                          }
                        }
                      }
                      if (var5_long - -(long)var8 <= ((uo) this).field_g) {
                        break L13;
                      } else {
                        if ((long)var8 + var5_long <= ((uo) this).field_g - -(long)((uo) this).field_c) {
                          var11 = var5_long + (long)var8;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (-1L >= var9) {
                      break L7;
                    } else {
                      if (var11 > var9) {
                        var13 = (int)(-var9 + var11);
                        qb.a(((uo) this).field_l, (int)(-((uo) this).field_g + var9), param0, (int)(-var5_long + var9) + var7, var13);
                        if (var11 > ((uo) this).field_n) {
                          param2 = (int)((long)param2 - (-((uo) this).field_n + var11));
                          ((uo) this).field_n = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                if (0 >= param2) {
                  break L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param3 + param2);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((uo) this).field_p = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var5_ref;
            stackOut_63_1 = new StringBuilder().append("uo.F(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L15;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L15;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            Object var3 = null;
            el discarded$0 = uo.a(-117, (String) null);
        }
        this.a((byte) 28);
        ((uo) this).field_h.b(-5317);
    }

    final long a(int param0) {
        if (param0 < 38) {
            ((uo) this).field_k = null;
        }
        return ((uo) this).field_o;
    }

    public static void b(int param0) {
        field_m = null;
        int var1 = 19 / ((35 - param0) / 50);
        field_d = null;
        field_b = null;
    }

    final static el a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        el stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -58) {
                break L1;
              } else {
                field_a = 111;
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2_int) {
                stackOut_11_0 = gm.field_f;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (el) (Object) stackIn_9_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("uo.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = 32 / ((param1 - 60) / 35);
        if (param0 < 0L) {
            throw new IOException();
        }
        ((uo) this).field_n = param0;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (((uo) this).field_g != -1L) {
            L1: {
              if (((uo) this).field_g == ((uo) this).field_p) {
                break L1;
              } else {
                ((uo) this).field_h.a(false, ((uo) this).field_g);
                ((uo) this).field_p = ((uo) this).field_g;
                break L1;
              }
            }
            L2: {
              ((uo) this).field_h.a(((uo) this).field_c, ((uo) this).field_l, 0, -120);
              ((uo) this).field_p = ((uo) this).field_p + (long)((uo) this).field_c;
              if (((uo) this).field_q < ((uo) this).field_p) {
                ((uo) this).field_q = ((uo) this).field_p;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((uo) this).field_g < ((uo) this).field_f) {
                  break L4;
                } else {
                  if (~((uo) this).field_g <= ~(((uo) this).field_f - -(long)((uo) this).field_e)) {
                    break L4;
                  } else {
                    var2 = ((uo) this).field_g;
                    break L3;
                  }
                }
              }
              if (~((uo) this).field_g < ~((uo) this).field_f) {
                break L3;
              } else {
                if (((uo) this).field_f < (long)((uo) this).field_c + ((uo) this).field_g) {
                  var2 = ((uo) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((uo) this).field_f >= (long)((uo) this).field_c + ((uo) this).field_g) {
                  break L6;
                } else {
                  if (~(((uo) this).field_f - -(long)((uo) this).field_e) <= ~(((uo) this).field_g + (long)((uo) this).field_c)) {
                    var4 = (long)((uo) this).field_c + ((uo) this).field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((uo) this).field_g <= ~((long)((uo) this).field_e + ((uo) this).field_f)) {
                break L5;
              } else {
                if (((uo) this).field_g + (long)((uo) this).field_c < ((uo) this).field_f + (long)((uo) this).field_e) {
                  break L5;
                } else {
                  var4 = ((uo) this).field_f - -(long)((uo) this).field_e;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (~var2 <= ~var4) {
                  break L7;
                } else {
                  var6 = (int)(var4 + -var2);
                  qb.a(((uo) this).field_l, (int)(var2 + -((uo) this).field_g), ((uo) this).field_k, (int)(-((uo) this).field_f + var2), var6);
                  break L7;
                }
              }
            }
            ((uo) this).field_c = 0;
            ((uo) this).field_g = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
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
              ((uo) this).a(param0, (byte) 24, param0.length, 0);
              if (param1 == 0) {
                break L1;
              } else {
                uo.b(-16);
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
            stackOut_3_1 = new StringBuilder().append("uo.J(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        ((uo) this).field_e = 0;
        if (~((uo) this).field_n != ~((uo) this).field_p) {
            ((uo) this).field_h.a(false, ((uo) this).field_n);
            ((uo) this).field_p = ((uo) this).field_n;
        }
        ((uo) this).field_f = ((uo) this).field_n;
        while (~((uo) this).field_e > ~((uo) this).field_k.length) {
            var2 = ((uo) this).field_k.length - ((uo) this).field_e;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((uo) this).field_h.a(false, ((uo) this).field_e, var2, ((uo) this).field_k);
            if (var3 == -1) {
                break;
            }
            ((uo) this).field_e = ((uo) this).field_e + var3;
            ((uo) this).field_p = ((uo) this).field_p + (long)var3;
        }
    }

    uo(lj param0, int param1, int param2) throws IOException {
        ((uo) this).field_g = -1L;
        ((uo) this).field_f = -1L;
        ((uo) this).field_c = 0;
        try {
            ((uo) this).field_h = param0;
            long dupTemp$0 = param0.b((byte) -25);
            ((uo) this).field_q = dupTemp$0;
            ((uo) this).field_o = dupTemp$0;
            ((uo) this).field_l = new byte[param2];
            ((uo) this).field_k = new byte[param1];
            ((uo) this).field_n = 0L;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uo.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void b(boolean param0) {
        he.field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dj();
        field_a = 0;
        field_d = "Hide lobby chat";
    }
}

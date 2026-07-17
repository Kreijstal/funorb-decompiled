/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lc {
    private long field_d;
    private long field_r;
    private long field_p;
    static boolean field_q;
    private eg field_c;
    private int field_k;
    static um field_m;
    private int field_j;
    static String field_l;
    static String field_g;
    static int[] field_n;
    static String field_e;
    private byte[] field_i;
    private long field_a;
    private byte[] field_o;
    static ci field_f;
    private long field_h;
    private long field_b;

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((lc) this).a(param1, -19616, param0, param1.length);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "lc.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        if (param0 == 17357) {
          L0: {
            if (((lc) this).field_h == -1L) {
              break L0;
            } else {
              L1: {
                if (~((lc) this).field_p != ~((lc) this).field_h) {
                  ((lc) this).field_c.a(((lc) this).field_h, -11526);
                  ((lc) this).field_p = ((lc) this).field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((lc) this).field_c.a(0, -1036, ((lc) this).field_o, ((lc) this).field_k);
                ((lc) this).field_p = ((lc) this).field_p + (long)((lc) this).field_k;
                if (~((lc) this).field_p >= ~((lc) this).field_b) {
                  break L2;
                } else {
                  ((lc) this).field_b = ((lc) this).field_p;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  var4 = -1L;
                  if (~((lc) this).field_h > ~((lc) this).field_d) {
                    break L4;
                  } else {
                    if (~(((lc) this).field_d + (long)((lc) this).field_j) >= ~((lc) this).field_h) {
                      break L4;
                    } else {
                      var2 = ((lc) this).field_h;
                      break L3;
                    }
                  }
                }
                if (~((lc) this).field_h < ~((lc) this).field_d) {
                  break L3;
                } else {
                  if ((long)((lc) this).field_k + ((lc) this).field_h > ((lc) this).field_d) {
                    var2 = ((lc) this).field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (((lc) this).field_d >= ((lc) this).field_h - -(long)((lc) this).field_k) {
                    break L6;
                  } else {
                    if ((long)((lc) this).field_k + ((lc) this).field_h > (long)((lc) this).field_j + ((lc) this).field_d) {
                      break L6;
                    } else {
                      var4 = (long)((lc) this).field_k + ((lc) this).field_h;
                      break L5;
                    }
                  }
                }
                if (~((lc) this).field_h <= ~((long)((lc) this).field_j + ((lc) this).field_d)) {
                  break L5;
                } else {
                  if (~((long)((lc) this).field_j + ((lc) this).field_d) >= ~((long)((lc) this).field_k + ((lc) this).field_h)) {
                    var4 = (long)((lc) this).field_j + ((lc) this).field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (var2 <= -1L) {
                  break L7;
                } else {
                  if (var4 <= var2) {
                    break L7;
                  } else {
                    var6 = (int)(-var2 + var4);
                    ne.a(((lc) this).field_o, (int)(-((lc) this).field_h + var2), ((lc) this).field_i, (int)(-((lc) this).field_d + var2), var6);
                    break L7;
                  }
                }
              }
              ((lc) this).field_k = 0;
              ((lc) this).field_h = -1L;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static String d(byte param0) {
        L0: {
          if (uk.field_e) {
            break L0;
          } else {
            if (be.field_f > ei.field_u) {
              break L0;
            } else {
              if (ei.field_u < be.field_f + sj.field_n) {
                return eg.field_j;
              } else {
                break L0;
              }
            }
          }
        }
        if (param0 == 60) {
          return null;
        } else {
          String discarded$2 = lc.d((byte) 67);
          return null;
        }
    }

    final static void a() {
        cd.field_x = new w(ki.field_P, dc.field_s, gd.field_b, qn.field_P, (ci) (Object) kj.field_g, sj.field_k);
        int var1 = 0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              if ((long)param1 + ((lc) this).field_a > ((lc) this).field_r) {
                ((lc) this).field_r = ((lc) this).field_a - -(long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((lc) this).field_h == -1L) {
                break L2;
              } else {
                L3: {
                  if (((lc) this).field_h > ((lc) this).field_a) {
                    break L3;
                  } else {
                    if ((long)((lc) this).field_k + ((lc) this).field_h < ((lc) this).field_a) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b(17357);
                break L2;
              }
            }
            L4: {
              if ((long)param2 == ((lc) this).field_h) {
                break L4;
              } else {
                if (~((long)param1 + ((lc) this).field_a) >= ~((long)((lc) this).field_o.length + ((lc) this).field_h)) {
                  break L4;
                } else {
                  var5_int = (int)(((lc) this).field_h - (((lc) this).field_a - (long)((lc) this).field_o.length));
                  ne.a(param3, param0, ((lc) this).field_o, (int)(-((lc) this).field_h + ((lc) this).field_a), var5_int);
                  param0 = param0 + var5_int;
                  param1 = param1 - var5_int;
                  ((lc) this).field_a = ((lc) this).field_a + (long)var5_int;
                  ((lc) this).field_k = ((lc) this).field_o.length;
                  this.b(17357);
                  break L4;
                }
              }
            }
            if (((lc) this).field_o.length < param1) {
              L5: {
                if (~((lc) this).field_p == ~((lc) this).field_a) {
                  break L5;
                } else {
                  ((lc) this).field_c.a(((lc) this).field_a, -11526);
                  ((lc) this).field_p = ((lc) this).field_a;
                  break L5;
                }
              }
              L6: {
                ((lc) this).field_c.a(param0, -1036, param3, param1);
                ((lc) this).field_p = ((lc) this).field_p + (long)param1;
                if (((lc) this).field_p > ((lc) this).field_b) {
                  ((lc) this).field_b = ((lc) this).field_p;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (~((lc) this).field_a > ~((lc) this).field_d) {
                    break L8;
                  } else {
                    if (~((long)((lc) this).field_j + ((lc) this).field_d) >= ~((lc) this).field_a) {
                      break L8;
                    } else {
                      var5_long = ((lc) this).field_a;
                      break L7;
                    }
                  }
                }
                if (~((lc) this).field_d > ~((lc) this).field_a) {
                  break L7;
                } else {
                  if (((lc) this).field_d >= ((lc) this).field_a + (long)param1) {
                    break L7;
                  } else {
                    var5_long = ((lc) this).field_d;
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (((lc) this).field_d >= ((lc) this).field_a - -(long)param1) {
                    break L10;
                  } else {
                    if (~((long)param1 + ((lc) this).field_a) >= ~(((lc) this).field_d - -(long)((lc) this).field_j)) {
                      var7 = ((lc) this).field_a - -(long)param1;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((lc) this).field_a >= (long)((lc) this).field_j + ((lc) this).field_d) {
                  break L9;
                } else {
                  if (~(((lc) this).field_a - -(long)param1) <= ~(((lc) this).field_d + (long)((lc) this).field_j)) {
                    var7 = ((lc) this).field_d - -(long)((lc) this).field_j;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (-1L >= var5_long) {
                  break L11;
                } else {
                  if (var5_long < var7) {
                    var9 = (int)(var7 - var5_long);
                    ne.a(param3, (int)(var5_long + (long)param0 + -((lc) this).field_a), ((lc) this).field_i, (int)(var5_long + -((lc) this).field_d), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((lc) this).field_a = ((lc) this).field_a + (long)param1;
              return;
            } else {
              if (param1 <= 0) {
                break L0;
              } else {
                L12: {
                  if (-1L != ((lc) this).field_h) {
                    break L12;
                  } else {
                    ((lc) this).field_h = ((lc) this).field_a;
                    break L12;
                  }
                }
                L13: {
                  ne.a(param3, param0, ((lc) this).field_o, (int)(-((lc) this).field_h + ((lc) this).field_a), param1);
                  ((lc) this).field_a = ((lc) this).field_a + (long)param1;
                  if ((long)((lc) this).field_k < ((lc) this).field_a - ((lc) this).field_h) {
                    ((lc) this).field_k = (int)(-((lc) this).field_h + ((lc) this).field_a);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((lc) this).field_p = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5_ref;
            stackOut_49_1 = new StringBuilder().append("lc.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L14;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L14;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 41);
        }
    }

    final static void a(String param0, String param1, int param2, int param3, String param4) {
        ld var6 = null;
        try {
            var6 = new ld(2, param0, 0, param1, param4);
            ml.a((byte) 29, var6);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "lc.K(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 2 + 44 + 0 + 44 + (param4 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final long c(byte param0) {
        if (param0 != 109) {
            return 91L;
        }
        return ((lc) this).field_r;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var14 = Chess.field_G;
        try {
          L0: {
            if (param0.length >= param2 - -param3) {
              L1: {
                if (-1L == ((lc) this).field_h) {
                  break L1;
                } else {
                  if (((lc) this).field_a < ((lc) this).field_h) {
                    break L1;
                  } else {
                    if (((lc) this).field_a + (long)param3 <= ((lc) this).field_h - -(long)((lc) this).field_k) {
                      ne.a(((lc) this).field_o, (int)(-((lc) this).field_h + ((lc) this).field_a), param0, param2, param3);
                      ((lc) this).field_a = ((lc) this).field_a + (long)param3;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (param1 == -19616) {
                L2: {
                  var5_long = ((lc) this).field_a;
                  var7 = param2;
                  var8 = param3;
                  if (~((lc) this).field_a > ~((lc) this).field_d) {
                    break L2;
                  } else {
                    if (~((long)((lc) this).field_j + ((lc) this).field_d) >= ~((lc) this).field_a) {
                      break L2;
                    } else {
                      L3: {
                        var9_int = (int)(((lc) this).field_d + -((lc) this).field_a + (long)((lc) this).field_j);
                        if (var9_int <= param3) {
                          break L3;
                        } else {
                          var9_int = param3;
                          break L3;
                        }
                      }
                      ne.a(((lc) this).field_i, (int)(-((lc) this).field_d + ((lc) this).field_a), param0, param2, var9_int);
                      param3 = param3 - var9_int;
                      param2 = param2 + var9_int;
                      ((lc) this).field_a = ((lc) this).field_a + (long)var9_int;
                      break L2;
                    }
                  }
                }
                L4: {
                  if (((lc) this).field_i.length >= param3) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      L5: {
                        int discarded$2 = 0;
                        this.c();
                        var9_int = param3;
                        if (((lc) this).field_j >= var9_int) {
                          break L5;
                        } else {
                          var9_int = ((lc) this).field_j;
                          break L5;
                        }
                      }
                      ne.a(((lc) this).field_i, 0, param0, param2, var9_int);
                      ((lc) this).field_a = ((lc) this).field_a + (long)var9_int;
                      param3 = param3 - var9_int;
                      param2 = param2 + var9_int;
                      break L4;
                    }
                  } else {
                    ((lc) this).field_c.a(((lc) this).field_a, -11526);
                    ((lc) this).field_p = ((lc) this).field_a;
                    L6: while (true) {
                      if (param3 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((lc) this).field_c.a(param2, param0, param3, (byte) 104);
                        if (-1 == var9_int) {
                          break L4;
                        } else {
                          param3 = param3 - var9_int;
                          ((lc) this).field_a = ((lc) this).field_a + (long)var9_int;
                          param2 = param2 + var9_int;
                          ((lc) this).field_p = ((lc) this).field_p + (long)var9_int;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (-1L != ((lc) this).field_h) {
                    L8: {
                      if (~((lc) this).field_h >= ~((lc) this).field_a) {
                        break L8;
                      } else {
                        if (param3 <= 0) {
                          break L8;
                        } else {
                          L9: {
                            var9_int = param2 - -(int)(-((lc) this).field_a + ((lc) this).field_h);
                            if (param2 + param3 < var9_int) {
                              var9_int = param2 + param3;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (var9_int <= param2) {
                              break L8;
                            } else {
                              param3--;
                              int incrementValue$3 = param2;
                              param2++;
                              param0[incrementValue$3] = (byte) 0;
                              ((lc) this).field_a = ((lc) this).field_a + 1L;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      L12: {
                        var9 = -1L;
                        if (~var5_long < ~((lc) this).field_h) {
                          break L12;
                        } else {
                          if (~((long)var8 + var5_long) < ~((lc) this).field_h) {
                            var9 = ((lc) this).field_h;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (((lc) this).field_h > var5_long) {
                        break L11;
                      } else {
                        if (var5_long >= ((lc) this).field_h + (long)((lc) this).field_k) {
                          break L11;
                        } else {
                          var9 = var5_long;
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        var11 = -1L;
                        if (var5_long >= (long)((lc) this).field_k + ((lc) this).field_h) {
                          break L14;
                        } else {
                          if (((lc) this).field_h + (long)((lc) this).field_k <= var5_long + (long)var8) {
                            var11 = ((lc) this).field_h - -(long)((lc) this).field_k;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (~((lc) this).field_h <= ~(var5_long + (long)var8)) {
                        break L13;
                      } else {
                        if ((long)var8 + var5_long > (long)((lc) this).field_k + ((lc) this).field_h) {
                          break L13;
                        } else {
                          var11 = (long)var8 + var5_long;
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
                        var13 = (int)(var11 - var9);
                        ne.a(((lc) this).field_o, (int)(var9 - ((lc) this).field_h), param0, (int)(var9 - var5_long) + var7, var13);
                        if (((lc) this).field_a >= var11) {
                          break L7;
                        } else {
                          param3 = (int)((long)param3 - (-((lc) this).field_a + var11));
                          ((lc) this).field_a = var11;
                          break L7;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                if (0 < param3) {
                  throw new EOFException();
                } else {
                  break L0;
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param3 + param2 - param0.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((lc) this).field_p = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("lc.L(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L15;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L15;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void b() {
        field_n = null;
        field_g = null;
        field_l = null;
        field_e = null;
        field_m = null;
        field_f = null;
    }

    private final void c() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          ((lc) this).field_j = 0;
          if (~((lc) this).field_p != ~((lc) this).field_a) {
            ((lc) this).field_c.a(((lc) this).field_a, -11526);
            ((lc) this).field_p = ((lc) this).field_a;
            break L0;
          } else {
            break L0;
          }
        }
        ((lc) this).field_d = ((lc) this).field_a;
        L1: while (true) {
          L2: {
            if (((lc) this).field_j >= ((lc) this).field_i.length) {
              break L2;
            } else {
              L3: {
                var2 = ((lc) this).field_i.length - ((lc) this).field_j;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((lc) this).field_c.a(((lc) this).field_j, ((lc) this).field_i, var2, (byte) 50);
              if (var3 == -1) {
                break L2;
              } else {
                ((lc) this).field_p = ((lc) this).field_p + (long)var3;
                ((lc) this).field_j = ((lc) this).field_j + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -87) {
            field_m = null;
        }
        this.b(param0 ^ -17308);
        ((lc) this).field_c.a(10992);
    }

    final void a(long param0, int param1) throws IOException {
        if ((long)param1 > param0) {
            throw new IOException();
        }
        ((lc) this).field_a = param0;
    }

    lc(eg param0, int param1, int param2) throws IOException {
        ((lc) this).field_d = -1L;
        ((lc) this).field_k = 0;
        ((lc) this).field_h = -1L;
        try {
            ((lc) this).field_c = param0;
            long dupTemp$0 = param0.a((byte) -89);
            ((lc) this).field_b = dupTemp$0;
            ((lc) this).field_r = dupTemp$0;
            ((lc) this).field_o = new byte[param2];
            ((lc) this).field_a = 0L;
            ((lc) this).field_i = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "RuneScape clan";
        field_n = new int[128];
        field_l = "Public chat is unavailable while setting up a rated game.";
    }
}

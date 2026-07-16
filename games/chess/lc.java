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
        ((lc) this).a(param1, -19616, param0, param1.length);
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        if (param0 == 17357) {
          L0: {
            if (0L == (((lc) this).field_h ^ -1L)) {
              break L0;
            } else {
              L1: {
                if ((((lc) this).field_p ^ -1L) != (((lc) this).field_h ^ -1L)) {
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
                if ((((lc) this).field_p ^ -1L) >= (((lc) this).field_b ^ -1L)) {
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
                  if ((((lc) this).field_h ^ -1L) > (((lc) this).field_d ^ -1L)) {
                    break L4;
                  } else {
                    if ((((lc) this).field_d + (long)((lc) this).field_j ^ -1L) >= (((lc) this).field_h ^ -1L)) {
                      break L4;
                    } else {
                      var2 = ((lc) this).field_h;
                      break L3;
                    }
                  }
                }
                if ((((lc) this).field_h ^ -1L) < (((lc) this).field_d ^ -1L)) {
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
                if ((((lc) this).field_h ^ -1L) <= ((long)((lc) this).field_j + ((lc) this).field_d ^ -1L)) {
                  break L5;
                } else {
                  if (((long)((lc) this).field_j + ((lc) this).field_d ^ -1L) >= ((long)((lc) this).field_k + ((lc) this).field_h ^ -1L)) {
                    var4 = (long)((lc) this).field_j + ((lc) this).field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (0L <= (var2 ^ -1L)) {
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

    final static void a(int param0) {
        cd.field_x = new w(ki.field_P, dc.field_s, gd.field_b, qn.field_P, (ci) (Object) kj.field_g, sj.field_k);
        int var1 = -28 % ((param0 - 15) / 59);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
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
              if (0L == (((lc) this).field_h ^ -1L)) {
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
                if (((long)param1 + ((lc) this).field_a ^ -1L) >= ((long)((lc) this).field_o.length + ((lc) this).field_h ^ -1L)) {
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
                if ((((lc) this).field_p ^ -1L) == (((lc) this).field_a ^ -1L)) {
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
                  if ((((lc) this).field_a ^ -1L) > (((lc) this).field_d ^ -1L)) {
                    break L8;
                  } else {
                    if (((long)((lc) this).field_j + ((lc) this).field_d ^ -1L) >= (((lc) this).field_a ^ -1L)) {
                      break L8;
                    } else {
                      var5_long = ((lc) this).field_a;
                      break L7;
                    }
                  }
                }
                if ((((lc) this).field_d ^ -1L) > (((lc) this).field_a ^ -1L)) {
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
                    if (((long)param1 + ((lc) this).field_a ^ -1L) >= (((lc) this).field_d - -(long)((lc) this).field_j ^ -1L)) {
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
                  if ((((lc) this).field_a - -(long)param1 ^ -1L) <= (((lc) this).field_d + (long)((lc) this).field_j ^ -1L)) {
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
                decompiledRegionSelector0 = 0;
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
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((lc) this).field_p = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, boolean param5) {
        ld var6 = new ld(param2, param0, param3, param1, param4);
        if (param5) {
            field_n = null;
        }
        ml.a((byte) 29, var6);
    }

    final long c(byte param0) {
        if (param0 != 109) {
            return 91L;
        }
        return ((lc) this).field_r;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Throwable decompiledCaughtException = null;
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
                  if ((((lc) this).field_a ^ -1L) > (((lc) this).field_d ^ -1L)) {
                    break L2;
                  } else {
                    if (((long)((lc) this).field_j + ((lc) this).field_d ^ -1L) >= (((lc) this).field_a ^ -1L)) {
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
                        this.c(0);
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
                      if ((param3 ^ -1) >= -1) {
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
                      if ((((lc) this).field_h ^ -1L) >= (((lc) this).field_a ^ -1L)) {
                        break L8;
                      } else {
                        if ((param3 ^ -1) >= -1) {
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
                              int incrementValue$1 = param2;
                              param2++;
                              param0[incrementValue$1] = (byte) 0;
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
                        if ((var5_long ^ -1L) < (((lc) this).field_h ^ -1L)) {
                          break L12;
                        } else {
                          if (((long)var8 + var5_long ^ -1L) < (((lc) this).field_h ^ -1L)) {
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
                      if ((((lc) this).field_h ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
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
                    if (0L <= (var9 ^ -1L)) {
                      break L7;
                    } else {
                      if ((var11 ^ -1L) >= (var9 ^ -1L)) {
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
                break L0;
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
        }
        if (0 < param3) {
          throw new EOFException();
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        if (param0 != -9) {
            field_q = false;
        }
        field_l = null;
        field_e = null;
        field_m = null;
        field_f = null;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          ((lc) this).field_j = param0;
          if ((((lc) this).field_p ^ -1L) != (((lc) this).field_a ^ -1L)) {
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
        ((lc) this).field_c = param0;
        long dupTemp$0 = param0.a((byte) -89);
        ((lc) this).field_b = dupTemp$0;
        ((lc) this).field_r = dupTemp$0;
        ((lc) this).field_o = new byte[param2];
        ((lc) this).field_a = 0L;
        ((lc) this).field_i = new byte[param1];
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

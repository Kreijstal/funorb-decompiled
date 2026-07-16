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
              if ((((nh) this).field_g ^ -1L) >= (((nh) this).field_q ^ -1L)) {
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
                  if ((((nh) this).field_m ^ -1L) <= (((nh) this).field_f - -(long)((nh) this).field_k ^ -1L)) {
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
                if ((((nh) this).field_f ^ -1L) <= ((long)((nh) this).field_p + ((nh) this).field_m ^ -1L)) {
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
              if ((((nh) this).field_m ^ -1L) <= (((nh) this).field_f + (long)((nh) this).field_k ^ -1L)) {
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
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
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
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Throwable decompiledCaughtException = null;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 + param0 <= param2.length) {
              L1: {
                if (((nh) this).field_m == -1L) {
                  break L1;
                } else {
                  if ((((nh) this).field_j ^ -1L) > (((nh) this).field_m ^ -1L)) {
                    break L1;
                  } else {
                    if (((long)param1 + ((nh) this).field_j ^ -1L) < (((nh) this).field_m - -(long)((nh) this).field_p ^ -1L)) {
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
                    if (-1 <= (param1 ^ -1)) {
                      break L4;
                    } else {
                      L6: {
                        this.b(17460);
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
                        if (-1 > (param1 ^ -1)) {
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
                              int incrementValue$1 = param0;
                              param0++;
                              param2[incrementValue$1] = (byte) 0;
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
                        if ((var5_long ^ -1L) < (((nh) this).field_m ^ -1L)) {
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
                      if ((((nh) this).field_m ^ -1L) < (var5_long ^ -1L)) {
                        break L11;
                      } else {
                        if ((((nh) this).field_m + (long)((nh) this).field_p ^ -1L) >= (var5_long ^ -1L)) {
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
                    if ((var9 ^ -1L) >= 0L) {
                      break L7;
                    } else {
                      if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                        break L7;
                      } else {
                        var13 = (int)(-var9 + var11);
                        ek.a(((nh) this).field_i, (int)(-((nh) this).field_m + var9), param2, var7 + (int)(var9 - var5_long), var13);
                        if ((((nh) this).field_j ^ -1L) <= (var11 ^ -1L)) {
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
                break L0;
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
        }
        if ((param1 ^ -1) < -1) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        ((nh) this).a(0, param1.length, param1, (byte) 124);
        if (param0 != -102) {
            ((nh) this).field_m = 89L;
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        ((nh) this).field_k = 0;
        if ((((nh) this).field_j ^ -1L) != (((nh) this).field_g ^ -1L)) {
            ((nh) this).field_h.a(-100, ((nh) this).field_j);
            ((nh) this).field_g = ((nh) this).field_j;
        }
        if (param0 != 17460) {
            ((nh) this).field_i = null;
        }
        ((nh) this).field_f = ((nh) this).field_j;
        while (((nh) this).field_k < ((nh) this).field_e.length) {
            var2 = -((nh) this).field_k + ((nh) this).field_e.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((nh) this).field_h.a(var2, ((nh) this).field_k, 1, ((nh) this).field_e);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((nh) this).field_k = ((nh) this).field_k + var3;
            ((nh) this).field_g = ((nh) this).field_g + (long)var3;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 0) {
        }
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((nh) this).field_j = param0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
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
              if ((((nh) this).field_m ^ -1L) == 0L) {
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
                  if ((((nh) this).field_j ^ -1L) > (((nh) this).field_f ^ -1L)) {
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
                if ((((nh) this).field_j ^ -1L) < (((nh) this).field_f ^ -1L)) {
                  break L6;
                } else {
                  if ((((nh) this).field_f ^ -1L) <= ((long)param2 + ((nh) this).field_j ^ -1L)) {
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
                  if ((((nh) this).field_j - -(long)param2 ^ -1L) >= (((nh) this).field_f ^ -1L)) {
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
                if ((var5_long ^ -1L) >= 0L) {
                  break L10;
                } else {
                  if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
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
                  if (0L == (((nh) this).field_m ^ -1L)) {
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
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((nh) this).field_g = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        if (param0) {
            field_r = null;
        }
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
        ((nh) this).field_h = param0;
        long dupTemp$0 = param0.a((byte) 104);
        ((nh) this).field_q = dupTemp$0;
        ((nh) this).field_b = dupTemp$0;
        ((nh) this).field_i = new byte[param2];
        ((nh) this).field_e = new byte[param1];
        ((nh) this).field_j = 0L;
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

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class il {
    private int field_c;
    static th field_e;
    private long field_d;
    private byte[] field_h;
    private long field_g;
    private tc field_m;
    private int field_f;
    private long field_j;
    private byte[] field_a;
    private long field_k;
    private long field_i;
    static qj[] field_l;
    private long field_b;

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
        var14 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.length < param1 + param2) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
            } else {
              L1: {
                if (((il) this).field_j == -1L) {
                  break L1;
                } else {
                  if (((il) this).field_b < ((il) this).field_j) {
                    break L1;
                  } else {
                    if ((long)((il) this).field_f + ((il) this).field_j < ((il) this).field_b + (long)param1) {
                      break L1;
                    } else {
                      pd.a(((il) this).field_h, (int)(((il) this).field_b + -((il) this).field_j), param0, param2, param1);
                      ((il) this).field_b = ((il) this).field_b + (long)param1;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((il) this).field_b;
                var7 = param2;
                var8 = param1;
                if ((((il) this).field_b ^ -1L) > (((il) this).field_d ^ -1L)) {
                  break L2;
                } else {
                  if ((((il) this).field_d + (long)((il) this).field_c ^ -1L) < (((il) this).field_b ^ -1L)) {
                    L3: {
                      var9_int = (int)((long)((il) this).field_c - ((il) this).field_b - -((il) this).field_d);
                      if (param1 < var9_int) {
                        var9_int = param1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    pd.a(((il) this).field_a, (int)(((il) this).field_b + -((il) this).field_d), param0, param2, var9_int);
                    param1 = param1 - var9_int;
                    ((il) this).field_b = ((il) this).field_b + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (param1 > ((il) this).field_a.length) {
                  ((il) this).field_m.a(true, ((il) this).field_b);
                  ((il) this).field_i = ((il) this).field_b;
                  L5: while (true) {
                    if (0 >= param1) {
                      break L4;
                    } else {
                      var9_int = ((il) this).field_m.a(param0, (byte) 74, param2, param1);
                      if (-1 == var9_int) {
                        break L4;
                      } else {
                        param2 = param2 + var9_int;
                        ((il) this).field_i = ((il) this).field_i + (long)var9_int;
                        param1 = param1 - var9_int;
                        ((il) this).field_b = ((il) this).field_b + (long)var9_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param1 <= 0) {
                    break L4;
                  } else {
                    L6: {
                      this.b((byte) 66);
                      var9_int = param1;
                      if (var9_int <= ((il) this).field_c) {
                        break L6;
                      } else {
                        var9_int = ((il) this).field_c;
                        break L6;
                      }
                    }
                    pd.a(((il) this).field_a, 0, param0, param2, var9_int);
                    param1 = param1 - var9_int;
                    ((il) this).field_b = ((il) this).field_b + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L4;
                  }
                }
              }
              L7: {
                if (0L == (((il) this).field_j ^ -1L)) {
                  break L7;
                } else {
                  L8: {
                    if ((((il) this).field_b ^ -1L) <= (((il) this).field_j ^ -1L)) {
                      break L8;
                    } else {
                      if (0 >= param1) {
                        break L8;
                      } else {
                        L9: {
                          var9_int = param2 + (int)(((il) this).field_j - ((il) this).field_b);
                          if (var9_int <= param2 + param1) {
                            break L9;
                          } else {
                            var9_int = param1 + param2;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var9_int <= param2) {
                            break L8;
                          } else {
                            param1--;
                            int incrementValue$1 = param2;
                            param2++;
                            param0[incrementValue$1] = (byte) 0;
                            ((il) this).field_b = ((il) this).field_b + 1L;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var9 = -1L;
                      if (((il) this).field_j < var5_long) {
                        break L12;
                      } else {
                        if (var5_long + (long)var8 <= ((il) this).field_j) {
                          break L12;
                        } else {
                          var9 = ((il) this).field_j;
                          break L11;
                        }
                      }
                    }
                    if (var5_long < ((il) this).field_j) {
                      break L11;
                    } else {
                      if ((long)((il) this).field_f + ((il) this).field_j > var5_long) {
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
                      if ((var5_long ^ -1L) <= (((il) this).field_j + (long)((il) this).field_f ^ -1L)) {
                        break L14;
                      } else {
                        if (((long)var8 + var5_long ^ -1L) > (((il) this).field_j + (long)((il) this).field_f ^ -1L)) {
                          break L14;
                        } else {
                          var11 = ((il) this).field_j - -(long)((il) this).field_f;
                          break L13;
                        }
                      }
                    }
                    if (((il) this).field_j >= var5_long - -(long)var8) {
                      break L13;
                    } else {
                      if ((var5_long - -(long)var8 ^ -1L) < (((il) this).field_j - -(long)((il) this).field_f ^ -1L)) {
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
                    if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                      break L7;
                    } else {
                      var13 = (int)(-var9 + var11);
                      pd.a(((il) this).field_h, (int)(var9 - ((il) this).field_j), param0, (int)(var9 - var5_long) + var7, var13);
                      if ((((il) this).field_b ^ -1L) > (var11 ^ -1L)) {
                        param1 = (int)((long)param1 - (var11 + -((il) this).field_b));
                        ((il) this).field_b = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((il) this).field_i = -1L;
          throw var5;
        }
        if (param3 < param1) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 > -29) {
            return null;
        }
        return oe.a(param1, (byte) -70, false);
    }

    final void a(long param0, boolean param1) throws IOException {
        if (!((param0 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        ((il) this).field_b = param0;
        if (!param1) {
            ((il) this).field_g = -51L;
        }
    }

    final long a(byte param0) {
        if (param0 >= -72) {
            return 9L;
        }
        return ((il) this).field_k;
    }

    final void d(int param0) throws IOException {
        this.a(-120);
        ((il) this).field_m.a(-31576);
        if (param0 != 0) {
            int discarded$0 = il.c(57);
        }
    }

    final static int c(int param0) {
        if (param0 != -14496) {
            il.b(-115);
        }
        return (int)(1000000000L / ba.field_f);
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        if (param0 > -110) {
          return;
        } else {
          L0: {
            if (-1L == ((il) this).field_j) {
              break L0;
            } else {
              L1: {
                if ((((il) this).field_j ^ -1L) != (((il) this).field_i ^ -1L)) {
                  ((il) this).field_m.a(true, ((il) this).field_j);
                  ((il) this).field_i = ((il) this).field_j;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((il) this).field_m.a(0, ((il) this).field_f, 0, ((il) this).field_h);
                ((il) this).field_i = ((il) this).field_i + (long)((il) this).field_f;
                if ((((il) this).field_g ^ -1L) <= (((il) this).field_i ^ -1L)) {
                  break L2;
                } else {
                  ((il) this).field_g = ((il) this).field_i;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (((il) this).field_d > ((il) this).field_j) {
                    break L4;
                  } else {
                    if (((il) this).field_j >= ((il) this).field_d + (long)((il) this).field_c) {
                      break L4;
                    } else {
                      var2 = ((il) this).field_j;
                      break L3;
                    }
                  }
                }
                if (((il) this).field_j > ((il) this).field_d) {
                  break L3;
                } else {
                  if ((((il) this).field_d ^ -1L) > ((long)((il) this).field_f + ((il) this).field_j ^ -1L)) {
                    var2 = ((il) this).field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((il) this).field_d >= ((il) this).field_j + (long)((il) this).field_f) {
                    break L6;
                  } else {
                    if (((il) this).field_d + (long)((il) this).field_c >= (long)((il) this).field_f + ((il) this).field_j) {
                      var4 = (long)((il) this).field_f + ((il) this).field_j;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((long)((il) this).field_c + ((il) this).field_d <= ((il) this).field_j) {
                  break L5;
                } else {
                  if (((il) this).field_j - -(long)((il) this).field_f >= (long)((il) this).field_c + ((il) this).field_d) {
                    var4 = ((il) this).field_d - -(long)((il) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (-1L >= var2) {
                  break L7;
                } else {
                  if ((var4 ^ -1L) < (var2 ^ -1L)) {
                    var6 = (int)(-var2 + var4);
                    pd.a(((il) this).field_h, (int)(-((il) this).field_j + var2), ((il) this).field_a, (int)(-((il) this).field_d + var2), var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              ((il) this).field_f = 0;
              ((il) this).field_j = -1L;
              break L0;
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != -1) {
            il.b(-44);
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 <= 26) {
          return;
        } else {
          L0: {
            ((il) this).field_c = 0;
            if ((((il) this).field_b ^ -1L) != (((il) this).field_i ^ -1L)) {
              ((il) this).field_m.a(true, ((il) this).field_b);
              ((il) this).field_i = ((il) this).field_b;
              break L0;
            } else {
              break L0;
            }
          }
          ((il) this).field_d = ((il) this).field_b;
          L1: while (true) {
            L2: {
              if (((il) this).field_c >= ((il) this).field_a.length) {
                break L2;
              } else {
                L3: {
                  var2 = ((il) this).field_a.length + -((il) this).field_c;
                  if (200000000 >= var2) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = ((il) this).field_m.a(((il) this).field_a, (byte) 74, ((il) this).field_c, var2);
                if (-1 == var3) {
                  break L2;
                } else {
                  ((il) this).field_i = ((il) this).field_i + (long)var3;
                  ((il) this).field_c = ((il) this).field_c + var3;
                  continue L1;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((il) this).field_k < ((il) this).field_b + (long)param0) {
                ((il) this).field_k = ((il) this).field_b + (long)param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1L == ((il) this).field_j) {
                break L2;
              } else {
                if (((il) this).field_b >= ((il) this).field_j) {
                  if (((il) this).field_b <= ((il) this).field_j + (long)((il) this).field_f) {
                    break L2;
                  } else {
                    this.a(-114);
                    break L2;
                  }
                } else {
                  this.a(-114);
                  break L2;
                }
              }
            }
            L3: {
              if (((il) this).field_j == -1L) {
                break L3;
              } else {
                if (((long)((il) this).field_h.length + ((il) this).field_j ^ -1L) > ((long)param0 + ((il) this).field_b ^ -1L)) {
                  var5_int = (int)(((il) this).field_j - (((il) this).field_b - (long)((il) this).field_h.length));
                  pd.a(param2, param3, ((il) this).field_h, (int)(((il) this).field_b - ((il) this).field_j), var5_int);
                  param0 = param0 - var5_int;
                  ((il) this).field_b = ((il) this).field_b + (long)var5_int;
                  param3 = param3 + var5_int;
                  ((il) this).field_f = ((il) this).field_h.length;
                  this.a(-113);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (((il) this).field_h.length >= param0) {
              if ((param0 ^ -1) >= param1) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L4: {
                  if (0L != (((il) this).field_j ^ -1L)) {
                    break L4;
                  } else {
                    ((il) this).field_j = ((il) this).field_b;
                    break L4;
                  }
                }
                L5: {
                  pd.a(param2, param3, ((il) this).field_h, (int)(-((il) this).field_j + ((il) this).field_b), param0);
                  ((il) this).field_b = ((il) this).field_b + (long)param0;
                  if (-((il) this).field_j + ((il) this).field_b <= (long)((il) this).field_f) {
                    break L5;
                  } else {
                    ((il) this).field_f = (int)(((il) this).field_b - ((il) this).field_j);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L6: {
                if ((((il) this).field_i ^ -1L) == (((il) this).field_b ^ -1L)) {
                  break L6;
                } else {
                  ((il) this).field_m.a(true, ((il) this).field_b);
                  ((il) this).field_i = ((il) this).field_b;
                  break L6;
                }
              }
              L7: {
                ((il) this).field_m.a(0, param0, param3, param2);
                ((il) this).field_i = ((il) this).field_i + (long)param0;
                if ((((il) this).field_g ^ -1L) <= (((il) this).field_i ^ -1L)) {
                  break L7;
                } else {
                  ((il) this).field_g = ((il) this).field_i;
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((il) this).field_b < ((il) this).field_d) {
                    break L9;
                  } else {
                    if (((il) this).field_d + (long)((il) this).field_c <= ((il) this).field_b) {
                      break L9;
                    } else {
                      var5_long = ((il) this).field_b;
                      break L8;
                    }
                  }
                }
                if (((il) this).field_d < ((il) this).field_b) {
                  break L8;
                } else {
                  if (((il) this).field_d >= (long)param0 + ((il) this).field_b) {
                    break L8;
                  } else {
                    var5_long = ((il) this).field_d;
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  if (((il) this).field_b - -(long)param0 <= ((il) this).field_d) {
                    break L11;
                  } else {
                    if (((il) this).field_b + (long)param0 > ((il) this).field_d - -(long)((il) this).field_c) {
                      break L11;
                    } else {
                      var7 = ((il) this).field_b + (long)param0;
                      break L10;
                    }
                  }
                }
                if ((((il) this).field_b ^ -1L) <= (((il) this).field_d - -(long)((il) this).field_c ^ -1L)) {
                  break L10;
                } else {
                  if ((((il) this).field_d + (long)((il) this).field_c ^ -1L) < (((il) this).field_b - -(long)param0 ^ -1L)) {
                    break L10;
                  } else {
                    var7 = (long)((il) this).field_c + ((il) this).field_d;
                    break L10;
                  }
                }
              }
              L12: {
                if (var5_long <= -1L) {
                  break L12;
                } else {
                  if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                    break L12;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    pd.a(param2, (int)((long)param3 + var5_long - ((il) this).field_b), ((il) this).field_a, (int)(var5_long + -((il) this).field_d), var9);
                    break L12;
                  }
                }
              }
              ((il) this).field_b = ((il) this).field_b + (long)param0;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((il) this).field_i = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    il(tc param0, int param1, int param2) throws IOException {
        ((il) this).field_d = -1L;
        ((il) this).field_j = -1L;
        ((il) this).field_f = 0;
        ((il) this).field_m = param0;
        long dupTemp$0 = param0.a((byte) 121);
        ((il) this).field_g = dupTemp$0;
        ((il) this).field_k = dupTemp$0;
        ((il) this).field_b = 0L;
        ((il) this).field_h = new byte[param2];
        ((il) this).field_a = new byte[param1];
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 > -113) {
            il.b(46);
        }
        ((il) this).a(param1, param1.length, 0, 0);
    }

    static {
    }
}

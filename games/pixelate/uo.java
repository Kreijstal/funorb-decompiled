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
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
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
                  if ((((uo) this).field_n ^ -1L) >= (((uo) this).field_g - -(long)((uo) this).field_c ^ -1L)) {
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
                if (((long)param0 + ((uo) this).field_n ^ -1L) >= (((uo) this).field_g - -(long)((uo) this).field_l.length ^ -1L)) {
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
                if ((((uo) this).field_p ^ -1L) == (((uo) this).field_n ^ -1L)) {
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
                  if ((((uo) this).field_n ^ -1L) > (((uo) this).field_f ^ -1L)) {
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
                  if ((((uo) this).field_f ^ -1L) > ((long)param0 + ((uo) this).field_n ^ -1L)) {
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
                  if ((((uo) this).field_f ^ -1L) <= (((uo) this).field_n + (long)param0 ^ -1L)) {
                    break L9;
                  } else {
                    if (((long)param0 + ((uo) this).field_n ^ -1L) >= (((uo) this).field_f + (long)((uo) this).field_e ^ -1L)) {
                      var7 = ((uo) this).field_n + (long)param0;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (((long)((uo) this).field_e + ((uo) this).field_f ^ -1L) >= (((uo) this).field_n ^ -1L)) {
                  break L8;
                } else {
                  if ((((uo) this).field_n + (long)param0 ^ -1L) > (((uo) this).field_f - -(long)((uo) this).field_e ^ -1L)) {
                    break L8;
                  } else {
                    var7 = (long)((uo) this).field_e + ((uo) this).field_f;
                    break L8;
                  }
                }
              }
              L10: {
                if ((var5_long ^ -1L) >= 0L) {
                  break L10;
                } else {
                  if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
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
                if ((param0 ^ -1) >= -1) {
                  decompiledRegionSelector0 = 0;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
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
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param0.length >= param3 - -param2) {
              L1: {
                if (0L == (((uo) this).field_g ^ -1L)) {
                  break L1;
                } else {
                  if ((((uo) this).field_g ^ -1L) < (((uo) this).field_n ^ -1L)) {
                    break L1;
                  } else {
                    if (((long)param2 + ((uo) this).field_n ^ -1L) >= ((long)((uo) this).field_c + ((uo) this).field_g ^ -1L)) {
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
                if ((((uo) this).field_n ^ -1L) > (((uo) this).field_f ^ -1L)) {
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
                    if (-1 <= (param2 ^ -1)) {
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
                      if ((((uo) this).field_n ^ -1L) <= (((uo) this).field_g ^ -1L)) {
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
                        if ((((uo) this).field_g ^ -1L) > (var5_long ^ -1L)) {
                          break L12;
                        } else {
                          if ((((uo) this).field_g ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                            var9 = ((uo) this).field_g;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if ((((uo) this).field_g ^ -1L) < (var5_long ^ -1L)) {
                        break L11;
                      } else {
                        if ((var5_long ^ -1L) > (((uo) this).field_g - -(long)((uo) this).field_c ^ -1L)) {
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
                          if (((long)((uo) this).field_c + ((uo) this).field_g ^ -1L) < (var5_long + (long)var8 ^ -1L)) {
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
                break L0;
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
        }
        if (0 >= param2) {
          return;
        } else {
          throw new EOFException();
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
        int var3 = 0;
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param0 != -58) {
            field_a = 111;
        }
        int var2 = param1.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return gm.field_f;
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
          if (0L != (((uo) this).field_g ^ -1L)) {
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
                  if ((((uo) this).field_g ^ -1L) <= (((uo) this).field_f - -(long)((uo) this).field_e ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((uo) this).field_g;
                    break L3;
                  }
                }
              }
              if ((((uo) this).field_g ^ -1L) < (((uo) this).field_f ^ -1L)) {
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
                  if ((((uo) this).field_f - -(long)((uo) this).field_e ^ -1L) <= (((uo) this).field_g + (long)((uo) this).field_c ^ -1L)) {
                    var4 = (long)((uo) this).field_c + ((uo) this).field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((((uo) this).field_g ^ -1L) <= ((long)((uo) this).field_e + ((uo) this).field_f ^ -1L)) {
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
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
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
        L8: {
          if (param0 == 28) {
            break L8;
          } else {
            uo.b(9);
            break L8;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        ((uo) this).a(param0, (byte) 24, param0.length, 0);
        if (param1 != 0) {
            uo.b(-16);
        }
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        ((uo) this).field_e = 0;
        if ((((uo) this).field_n ^ -1L) != (((uo) this).field_p ^ -1L)) {
            ((uo) this).field_h.a(false, ((uo) this).field_n);
            ((uo) this).field_p = ((uo) this).field_n;
        }
        if (param0 != 200000000) {
            uo.b(1);
        }
        ((uo) this).field_f = ((uo) this).field_n;
        while ((((uo) this).field_e ^ -1) > (((uo) this).field_k.length ^ -1)) {
            var2 = ((uo) this).field_k.length - ((uo) this).field_e;
            if (!((var2 ^ -1) >= -200000001)) {
                var2 = 200000000;
            }
            var3 = ((uo) this).field_h.a(false, ((uo) this).field_e, var2, ((uo) this).field_k);
            if (0 == (var3 ^ -1)) {
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
        ((uo) this).field_h = param0;
        long dupTemp$0 = param0.b((byte) -25);
        ((uo) this).field_q = dupTemp$0;
        ((uo) this).field_o = dupTemp$0;
        ((uo) this).field_l = new byte[param2];
        ((uo) this).field_k = new byte[param1];
        ((uo) this).field_n = 0L;
    }

    final static void b(boolean param0) {
        he.field_f = null;
        if (param0) {
            uo.b(-78);
        }
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

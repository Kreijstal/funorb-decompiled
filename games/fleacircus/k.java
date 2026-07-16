/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k {
    private long field_k;
    private byte[] field_f;
    private long field_g;
    private int field_h;
    static int[] field_l;
    static bi[] field_c;
    private long field_n;
    private rl field_m;
    private byte[] field_b;
    private int field_i;
    private long field_j;
    static int field_a;
    private long field_d;
    static String field_e;
    private long field_o;

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
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.length >= param2 + param1) {
              L1: {
                if (param3 == 6520) {
                  break L1;
                } else {
                  ((k) this).field_n = -84L;
                  break L1;
                }
              }
              L2: {
                if (((k) this).field_j == -1L) {
                  break L2;
                } else {
                  if (((k) this).field_d < ((k) this).field_j) {
                    break L2;
                  } else {
                    if ((long)((k) this).field_h + ((k) this).field_j >= (long)param2 + ((k) this).field_d) {
                      dm.a(((k) this).field_b, (int)(-((k) this).field_j + ((k) this).field_d), param0, param1, param2);
                      ((k) this).field_d = ((k) this).field_d + (long)param2;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var5_long = ((k) this).field_d;
                var7 = param1;
                var8 = param2;
                if ((((k) this).field_d ^ -1L) > (((k) this).field_g ^ -1L)) {
                  break L3;
                } else {
                  if (((long)((k) this).field_i + ((k) this).field_g ^ -1L) >= (((k) this).field_d ^ -1L)) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)((long)((k) this).field_i - (-((k) this).field_g + ((k) this).field_d));
                      if (param2 >= var9_int) {
                        break L4;
                      } else {
                        var9_int = param2;
                        break L4;
                      }
                    }
                    dm.a(((k) this).field_f, (int)(-((k) this).field_g + ((k) this).field_d), param0, param1, var9_int);
                    param2 = param2 - var9_int;
                    param1 = param1 + var9_int;
                    ((k) this).field_d = ((k) this).field_d + (long)var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (param2 > ((k) this).field_f.length) {
                  ((k) this).field_m.a(((k) this).field_d, (byte) -127);
                  ((k) this).field_k = ((k) this).field_d;
                  L6: while (true) {
                    if (0 >= param2) {
                      break L5;
                    } else {
                      var9_int = ((k) this).field_m.a(param0, param1, 0, param2);
                      if (0 != (var9_int ^ -1)) {
                        ((k) this).field_k = ((k) this).field_k + (long)var9_int;
                        ((k) this).field_d = ((k) this).field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        continue L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                } else {
                  if ((param2 ^ -1) >= -1) {
                    break L5;
                  } else {
                    L7: {
                      this.b(98);
                      var9_int = param2;
                      if (((k) this).field_i >= var9_int) {
                        break L7;
                      } else {
                        var9_int = ((k) this).field_i;
                        break L7;
                      }
                    }
                    dm.a(((k) this).field_f, 0, param0, param1, var9_int);
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    ((k) this).field_d = ((k) this).field_d + (long)var9_int;
                    break L5;
                  }
                }
              }
              L8: {
                if (-1L != ((k) this).field_j) {
                  L9: {
                    if ((((k) this).field_d ^ -1L) <= (((k) this).field_j ^ -1L)) {
                      break L9;
                    } else {
                      if (0 >= param2) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = (int)(-((k) this).field_d + ((k) this).field_j) + param1;
                          if (param2 + param1 >= var9_int) {
                            break L10;
                          } else {
                            var9_int = param1 + param2;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param1) {
                            break L9;
                          } else {
                            int incrementValue$1 = param1;
                            param1++;
                            param0[incrementValue$1] = (byte) 0;
                            param2--;
                            ((k) this).field_d = ((k) this).field_d + 1L;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var9 = -1L;
                      var11 = -1L;
                      if ((((k) this).field_j ^ -1L) > (var5_long ^ -1L)) {
                        break L13;
                      } else {
                        if ((long)var8 + var5_long > ((k) this).field_j) {
                          var9 = ((k) this).field_j;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (((k) this).field_j > var5_long) {
                      break L12;
                    } else {
                      if ((var5_long ^ -1L) > (((k) this).field_j + (long)((k) this).field_h ^ -1L)) {
                        var9 = var5_long;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if ((var5_long ^ -1L) <= (((k) this).field_j - -(long)((k) this).field_h ^ -1L)) {
                        break L15;
                      } else {
                        if ((var5_long + (long)var8 ^ -1L) <= (((k) this).field_j - -(long)((k) this).field_h ^ -1L)) {
                          var11 = (long)((k) this).field_h + ((k) this).field_j;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if ((long)var8 + var5_long <= ((k) this).field_j) {
                      break L14;
                    } else {
                      if (((long)var8 + var5_long ^ -1L) < (((k) this).field_j + (long)((k) this).field_h ^ -1L)) {
                        break L14;
                      } else {
                        var11 = (long)var8 + var5_long;
                        break L14;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L8;
                  } else {
                    if (var11 <= var9) {
                      break L8;
                    } else {
                      var13 = (int)(-var9 + var11);
                      dm.a(((k) this).field_b, (int)(var9 - ((k) this).field_j), param0, var7 - -(int)(var9 - var5_long), var13);
                      if ((var11 ^ -1L) < (((k) this).field_d ^ -1L)) {
                        param2 = (int)((long)param2 - (var11 - ((k) this).field_d));
                        ((k) this).field_d = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              break L0;
            } else {
              throw new ArrayIndexOutOfBoundsException(param2 + (param1 + -param0.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((k) this).field_k = -1L;
          throw var5;
        }
        if (param2 > 0) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        if (param0 != -40) {
            field_a = 108;
        }
        df.field_b.d(param2, param1);
        if (!param3) {
        } else {
            var4 = 2 * (bf.field_b % df.field_b.field_w);
            if (df.field_b.field_w <= var4) {
                var4 = -var4 - (-df.field_b.field_w - df.field_b.field_w);
            }
            if (var4 < 10) {
                var4 = 10;
            } else {
                if (!(-40 + df.field_b.field_w >= var4)) {
                    var4 = -40 + df.field_b.field_w;
                }
            }
            qe.a(0, 30, df.field_b, 0, var4, param1, 80, 5120, param2);
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = -66 / ((29 - param3) / 41);
              if (((k) this).field_o < (long)param2 + ((k) this).field_d) {
                ((k) this).field_o = ((k) this).field_d + (long)param2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((k) this).field_j == -1L) {
                break L2;
              } else {
                L3: {
                  if ((((k) this).field_d ^ -1L) > (((k) this).field_j ^ -1L)) {
                    break L3;
                  } else {
                    if (((k) this).field_d > ((k) this).field_j - -(long)((k) this).field_h) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a((byte) -109);
                break L2;
              }
            }
            L4: {
              if (((k) this).field_j == -1L) {
                break L4;
              } else {
                if (((k) this).field_d - -(long)param2 <= ((k) this).field_j - -(long)((k) this).field_b.length) {
                  break L4;
                } else {
                  var6_int = (int)(-((k) this).field_d - (-((k) this).field_j - (long)((k) this).field_b.length));
                  dm.a(param1, param0, ((k) this).field_b, (int)(-((k) this).field_j + ((k) this).field_d), var6_int);
                  param0 = param0 + var6_int;
                  ((k) this).field_d = ((k) this).field_d + (long)var6_int;
                  param2 = param2 - var6_int;
                  ((k) this).field_h = ((k) this).field_b.length;
                  this.a((byte) 41);
                  break L4;
                }
              }
            }
            if (((k) this).field_b.length < param2) {
              L5: {
                if (((k) this).field_d == ((k) this).field_k) {
                  break L5;
                } else {
                  ((k) this).field_m.a(((k) this).field_d, (byte) -114);
                  ((k) this).field_k = ((k) this).field_d;
                  break L5;
                }
              }
              L6: {
                ((k) this).field_m.a((byte) 110, param2, param0, param1);
                ((k) this).field_k = ((k) this).field_k + (long)param2;
                if (((k) this).field_n < ((k) this).field_k) {
                  ((k) this).field_n = ((k) this).field_k;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  var6 = -1L;
                  var8 = -1L;
                  if (((k) this).field_d < ((k) this).field_g) {
                    break L8;
                  } else {
                    if ((((k) this).field_g + (long)((k) this).field_i ^ -1L) >= (((k) this).field_d ^ -1L)) {
                      break L8;
                    } else {
                      var6 = ((k) this).field_d;
                      break L7;
                    }
                  }
                }
                if ((((k) this).field_g ^ -1L) > (((k) this).field_d ^ -1L)) {
                  break L7;
                } else {
                  if ((((k) this).field_g ^ -1L) > ((long)param2 + ((k) this).field_d ^ -1L)) {
                    var6 = ((k) this).field_g;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  if ((((k) this).field_g ^ -1L) <= ((long)param2 + ((k) this).field_d ^ -1L)) {
                    break L10;
                  } else {
                    if ((long)((k) this).field_i + ((k) this).field_g < ((k) this).field_d - -(long)param2) {
                      break L10;
                    } else {
                      var8 = (long)param2 + ((k) this).field_d;
                      break L9;
                    }
                  }
                }
                if (((k) this).field_d >= (long)((k) this).field_i + ((k) this).field_g) {
                  break L9;
                } else {
                  if (((long)((k) this).field_i + ((k) this).field_g ^ -1L) >= (((k) this).field_d + (long)param2 ^ -1L)) {
                    var8 = ((k) this).field_g + (long)((k) this).field_i;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (0L <= (var6 ^ -1L)) {
                  break L11;
                } else {
                  if ((var6 ^ -1L) > (var8 ^ -1L)) {
                    var10 = (int)(-var6 + var8);
                    dm.a(param1, (int)((long)param0 - (-var6 - -((k) this).field_d)), ((k) this).field_f, (int)(-((k) this).field_g + var6), var10);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((k) this).field_d = ((k) this).field_d + (long)param2;
              return;
            } else {
              if (param2 > 0) {
                L12: {
                  if ((((k) this).field_j ^ -1L) != 0L) {
                    break L12;
                  } else {
                    ((k) this).field_j = ((k) this).field_d;
                    break L12;
                  }
                }
                L13: {
                  dm.a(param1, param0, ((k) this).field_b, (int)(-((k) this).field_j + ((k) this).field_d), param2);
                  ((k) this).field_d = ((k) this).field_d + (long)param2;
                  if (((long)((k) this).field_h ^ -1L) <= (((k) this).field_d - ((k) this).field_j ^ -1L)) {
                    break L13;
                  } else {
                    ((k) this).field_h = (int)(((k) this).field_d + -((k) this).field_j);
                    break L13;
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
          ((k) this).field_k = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void c(int param0) {
        if (param0 != -28354) {
            return;
        }
        if (!(sg.field_h == null)) {
            sg.field_h.h(param0 ^ -28354);
            sg.field_h = null;
        }
    }

    public static void a(int param0) {
        if (param0 != -40) {
            k.c(70);
        }
        field_e = null;
        field_l = null;
        field_c = null;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          var2 = 50 / ((param0 - -24) / 54);
          if (-1L != ((k) this).field_j) {
            L1: {
              if ((((k) this).field_k ^ -1L) == (((k) this).field_j ^ -1L)) {
                break L1;
              } else {
                ((k) this).field_m.a(((k) this).field_j, (byte) -114);
                ((k) this).field_k = ((k) this).field_j;
                break L1;
              }
            }
            L2: {
              ((k) this).field_m.a((byte) 109, ((k) this).field_h, 0, ((k) this).field_b);
              ((k) this).field_k = ((k) this).field_k + (long)((k) this).field_h;
              if (((k) this).field_k > ((k) this).field_n) {
                ((k) this).field_n = ((k) this).field_k;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if ((((k) this).field_j ^ -1L) > (((k) this).field_g ^ -1L)) {
                  break L4;
                } else {
                  if (((k) this).field_j >= ((k) this).field_g - -(long)((k) this).field_i) {
                    break L4;
                  } else {
                    var3 = ((k) this).field_j;
                    break L3;
                  }
                }
              }
              if ((((k) this).field_j ^ -1L) < (((k) this).field_g ^ -1L)) {
                break L3;
              } else {
                if (((long)((k) this).field_h + ((k) this).field_j ^ -1L) >= (((k) this).field_g ^ -1L)) {
                  break L3;
                } else {
                  var3 = ((k) this).field_g;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((((k) this).field_g ^ -1L) <= ((long)((k) this).field_h + ((k) this).field_j ^ -1L)) {
                  break L6;
                } else {
                  if (((long)((k) this).field_h + ((k) this).field_j ^ -1L) >= (((k) this).field_g - -(long)((k) this).field_i ^ -1L)) {
                    var5 = (long)((k) this).field_h + ((k) this).field_j;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((long)((k) this).field_i + ((k) this).field_g ^ -1L) >= (((k) this).field_j ^ -1L)) {
                break L5;
              } else {
                if (((long)((k) this).field_h + ((k) this).field_j ^ -1L) <= (((k) this).field_g + (long)((k) this).field_i ^ -1L)) {
                  var5 = ((k) this).field_g + (long)((k) this).field_i;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var3 <= -1L) {
                break L7;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  dm.a(((k) this).field_b, (int)(var3 - ((k) this).field_j), ((k) this).field_f, (int)(-((k) this).field_g + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((k) this).field_h = 0;
            ((k) this).field_j = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 < 47) {
            k.a(92, 3, 126, true);
        }
        ((k) this).field_i = 0;
        if (!((((k) this).field_d ^ -1L) == (((k) this).field_k ^ -1L))) {
            ((k) this).field_m.a(((k) this).field_d, (byte) -121);
            ((k) this).field_k = ((k) this).field_d;
        }
        ((k) this).field_g = ((k) this).field_d;
        while (((k) this).field_f.length > ((k) this).field_i) {
            var2 = -((k) this).field_i + ((k) this).field_f.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((k) this).field_m.a(((k) this).field_f, ((k) this).field_i, 0, var2);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((k) this).field_k = ((k) this).field_k + (long)var3;
            ((k) this).field_i = ((k) this).field_i + var3;
        }
    }

    final static void a(int param0, wk param1) {
        uc.a((byte) 5, true, param1);
        if (param0 != 0) {
            k.a(-15, -38, 84, true);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (-1L < (param1 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            if (param0 <= -103) {
              break L0;
            } else {
              ((k) this).field_b = null;
              break L0;
            }
          }
          ((k) this).field_d = param1;
          return;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((k) this).a(param1, 0, param1.length, 6520);
        if (param0 != 631) {
            ((k) this).field_b = null;
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) 74);
        if (param0 != -70) {
            k.a(-30, -73, -71, false);
        }
        ((k) this).field_m.b(-1);
    }

    final long c(byte param0) {
        if (param0 >= -46) {
            return 49L;
        }
        return ((k) this).field_o;
    }

    k(rl param0, int param1, int param2) throws IOException {
        ((k) this).field_g = -1L;
        ((k) this).field_h = 0;
        ((k) this).field_j = -1L;
        ((k) this).field_m = param0;
        long dupTemp$0 = param0.c(2049105808);
        ((k) this).field_n = dupTemp$0;
        ((k) this).field_o = dupTemp$0;
        ((k) this).field_b = new byte[param2];
        ((k) this).field_f = new byte[param1];
        ((k) this).field_d = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_a = 16777215;
        field_e = "Please try again in a few minutes.";
    }
}

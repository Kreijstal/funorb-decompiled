/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me {
    static ea[] field_k;
    private byte[] field_o;
    private long field_g;
    private long field_b;
    static int field_j;
    private an field_f;
    private long field_n;
    private byte[] field_a;
    private long field_d;
    static String field_l;
    static int field_h;
    private int field_c;
    private long field_i;
    private long field_e;
    private int field_m;

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        if (param0 < 105) {
            return;
        }
        ((me) this).field_g = param1;
    }

    final static int[] a(int param0, int[] param1, int[] param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param0 != 8) {
            field_k = null;
        }
        int[] var6 = new int[8];
        int[] var3 = var6;
        for (var4 = 0; 8 > var4; var4++) {
            var6[var4] = c.a(param1[var4], param2[var4] ^ -1);
        }
        return var3;
    }

    final long a(byte param0) {
        if (param0 >= -35) {
            field_k = null;
        }
        return ((me) this).field_b;
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        Throwable decompiledCaughtException = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if ((long)param1 + ((me) this).field_g > ((me) this).field_b) {
                ((me) this).field_b = ((me) this).field_g - -(long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((me) this).field_e == -1L) {
                break L2;
              } else {
                L3: {
                  if (((me) this).field_e > ((me) this).field_g) {
                    break L3;
                  } else {
                    if ((((me) this).field_g ^ -1L) < (((me) this).field_e - -(long)((me) this).field_c ^ -1L)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(26021);
                break L2;
              }
            }
            L4: {
              if (0L == (((me) this).field_e ^ -1L)) {
                break L4;
              } else {
                if (((me) this).field_e - -(long)((me) this).field_a.length >= ((me) this).field_g - -(long)param1) {
                  break L4;
                } else {
                  var5_int = (int)((long)((me) this).field_a.length + (((me) this).field_e + -((me) this).field_g));
                  ai.a(param0, param2, ((me) this).field_a, (int)(((me) this).field_g + -((me) this).field_e), var5_int);
                  ((me) this).field_g = ((me) this).field_g + (long)var5_int;
                  param1 = param1 - var5_int;
                  param2 = param2 + var5_int;
                  ((me) this).field_c = ((me) this).field_a.length;
                  this.a(26021);
                  break L4;
                }
              }
            }
            if (param1 <= ((me) this).field_a.length) {
              if (0 >= param1) {
                L5: {
                  if (param3) {
                    break L5;
                  } else {
                    me.a(108, true);
                    break L5;
                  }
                }
                break L0;
              } else {
                L6: {
                  if ((((me) this).field_e ^ -1L) == 0L) {
                    ((me) this).field_e = ((me) this).field_g;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  ai.a(param0, param2, ((me) this).field_a, (int)(-((me) this).field_e + ((me) this).field_g), param1);
                  ((me) this).field_g = ((me) this).field_g + (long)param1;
                  if ((long)((me) this).field_c < ((me) this).field_g - ((me) this).field_e) {
                    ((me) this).field_c = (int)(((me) this).field_g + -((me) this).field_e);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              L8: {
                if (((me) this).field_g != ((me) this).field_d) {
                  ((me) this).field_f.a(0, ((me) this).field_g);
                  ((me) this).field_d = ((me) this).field_g;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((me) this).field_f.a(param2, param1, param0, 107);
                ((me) this).field_d = ((me) this).field_d + (long)param1;
                if (((me) this).field_n < ((me) this).field_d) {
                  ((me) this).field_n = ((me) this).field_d;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((me) this).field_g < ((me) this).field_i) {
                    break L11;
                  } else {
                    if ((long)((me) this).field_m + ((me) this).field_i > ((me) this).field_g) {
                      var5_long = ((me) this).field_g;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (((me) this).field_i < ((me) this).field_g) {
                  break L10;
                } else {
                  if ((((me) this).field_i ^ -1L) <= (((me) this).field_g - -(long)param1 ^ -1L)) {
                    break L10;
                  } else {
                    var5_long = ((me) this).field_i;
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if ((((me) this).field_g + (long)param1 ^ -1L) >= (((me) this).field_i ^ -1L)) {
                    break L13;
                  } else {
                    if ((((me) this).field_g - -(long)param1 ^ -1L) >= ((long)((me) this).field_m + ((me) this).field_i ^ -1L)) {
                      var7 = ((me) this).field_g - -(long)param1;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if ((((me) this).field_i + (long)((me) this).field_m ^ -1L) >= (((me) this).field_g ^ -1L)) {
                  break L12;
                } else {
                  if (((me) this).field_g + (long)param1 < (long)((me) this).field_m + ((me) this).field_i) {
                    break L12;
                  } else {
                    var7 = ((me) this).field_i + (long)((me) this).field_m;
                    break L12;
                  }
                }
              }
              L14: {
                if (var5_long <= -1L) {
                  break L14;
                } else {
                  if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                    break L14;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    ai.a(param0, (int)((long)param2 - (-var5_long + ((me) this).field_g)), ((me) this).field_o, (int)(-((me) this).field_i + var5_long), var9);
                    break L14;
                  }
                }
              }
              ((me) this).field_g = ((me) this).field_g + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((me) this).field_d = -1L;
          throw var5;
        }
    }

    public static void b(byte param0) {
        int var1 = 63 % ((50 - param0) / 63);
        field_l = null;
        field_k = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
        ((me) this).a(param0, 0, param0.length, -1);
        if (param1 <= 111) {
            me.a(-92, true);
        }
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
        var14 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0.length >= param2 + param1) {
              L1: {
                if (((me) this).field_e == (long)param3) {
                  break L1;
                } else {
                  if ((((me) this).field_e ^ -1L) < (((me) this).field_g ^ -1L)) {
                    break L1;
                  } else {
                    if ((((me) this).field_e - -(long)((me) this).field_c ^ -1L) <= ((long)param2 + ((me) this).field_g ^ -1L)) {
                      ai.a(((me) this).field_a, (int)(-((me) this).field_e + ((me) this).field_g), param0, param1, param2);
                      ((me) this).field_g = ((me) this).field_g + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((me) this).field_g;
                var7 = param1;
                var8 = param2;
                if (((me) this).field_g < ((me) this).field_i) {
                  break L2;
                } else {
                  if (((long)((me) this).field_m + ((me) this).field_i ^ -1L) >= (((me) this).field_g ^ -1L)) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)(((me) this).field_i + -((me) this).field_g + (long)((me) this).field_m);
                      if (var9_int > param2) {
                        var9_int = param2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ai.a(((me) this).field_o, (int)(((me) this).field_g - ((me) this).field_i), param0, param1, var9_int);
                    ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (((me) this).field_o.length >= param2) {
                  if (0 >= param2) {
                    break L4;
                  } else {
                    L5: {
                      this.c(20);
                      var9_int = param2;
                      if (var9_int > ((me) this).field_m) {
                        var9_int = ((me) this).field_m;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ai.a(((me) this).field_o, 0, param0, param1, var9_int);
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                    break L4;
                  }
                } else {
                  ((me) this).field_f.a(0, ((me) this).field_g);
                  ((me) this).field_d = ((me) this).field_g;
                  L6: while (true) {
                    if (-1 <= (param2 ^ -1)) {
                      break L4;
                    } else {
                      var9_int = ((me) this).field_f.b(32, param2, param0, param1);
                      if (var9_int != -1) {
                        ((me) this).field_d = ((me) this).field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                        param2 = param2 - var9_int;
                        continue L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L7: {
                if (0L == (((me) this).field_e ^ -1L)) {
                  break L7;
                } else {
                  L8: {
                    if ((((me) this).field_e ^ -1L) >= (((me) this).field_g ^ -1L)) {
                      break L8;
                    } else {
                      if (-1 > (param2 ^ -1)) {
                        L9: {
                          var9_int = param1 - -(int)(-((me) this).field_g + ((me) this).field_e);
                          if (var9_int <= param1 + param2) {
                            break L9;
                          } else {
                            var9_int = param1 + param2;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param1 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$1 = param1;
                            param1++;
                            param0[incrementValue$1] = (byte) 0;
                            param2--;
                            ((me) this).field_g = ((me) this).field_g + 1L;
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
                      if ((((me) this).field_e ^ -1L) > (var5_long ^ -1L)) {
                        break L12;
                      } else {
                        if (var5_long - -(long)var8 > ((me) this).field_e) {
                          var9 = ((me) this).field_e;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if ((((me) this).field_e ^ -1L) < (var5_long ^ -1L)) {
                      break L11;
                    } else {
                      if (var5_long >= ((me) this).field_e - -(long)((me) this).field_c) {
                        break L11;
                      } else {
                        var9 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (var5_long >= (long)((me) this).field_c + ((me) this).field_e) {
                        break L14;
                      } else {
                        if ((var5_long + (long)var8 ^ -1L) > ((long)((me) this).field_c + ((me) this).field_e ^ -1L)) {
                          break L14;
                        } else {
                          var11 = ((me) this).field_e - -(long)((me) this).field_c;
                          break L13;
                        }
                      }
                    }
                    if ((long)var8 + var5_long <= ((me) this).field_e) {
                      break L13;
                    } else {
                      if (((long)((me) this).field_c + ((me) this).field_e ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                        var11 = (long)var8 + var5_long;
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
                      ai.a(((me) this).field_a, (int)(-((me) this).field_e + var9), param0, var7 - -(int)(-var5_long + var9), var13);
                      if (var11 <= ((me) this).field_g) {
                        break L7;
                      } else {
                        param2 = (int)((long)param2 - (var11 - ((me) this).field_g));
                        ((me) this).field_g = var11;
                        break L7;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              throw new ArrayIndexOutOfBoundsException(param2 + param1 + -param0.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((me) this).field_d = -1L;
          throw var5;
        }
        if (param2 > 0) {
          throw new EOFException();
        } else {
          return;
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (0L == (((me) this).field_e ^ -1L)) {
            break L0;
          } else {
            L1: {
              if ((((me) this).field_d ^ -1L) == (((me) this).field_e ^ -1L)) {
                break L1;
              } else {
                ((me) this).field_f.a(0, ((me) this).field_e);
                ((me) this).field_d = ((me) this).field_e;
                break L1;
              }
            }
            L2: {
              ((me) this).field_f.a(0, ((me) this).field_c, ((me) this).field_a, param0 + -25931);
              ((me) this).field_d = ((me) this).field_d + (long)((me) this).field_c;
              if (((me) this).field_n >= ((me) this).field_d) {
                break L2;
              } else {
                ((me) this).field_n = ((me) this).field_d;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((((me) this).field_e ^ -1L) > (((me) this).field_i ^ -1L)) {
                  break L4;
                } else {
                  if (((long)((me) this).field_m + ((me) this).field_i ^ -1L) < (((me) this).field_e ^ -1L)) {
                    var2 = ((me) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((me) this).field_e ^ -1L) < (((me) this).field_i ^ -1L)) {
                break L3;
              } else {
                if (((long)((me) this).field_c + ((me) this).field_e ^ -1L) < (((me) this).field_i ^ -1L)) {
                  var2 = ((me) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((me) this).field_i >= (long)((me) this).field_c + ((me) this).field_e) {
                  break L6;
                } else {
                  if ((long)((me) this).field_c + ((me) this).field_e <= ((me) this).field_i + (long)((me) this).field_m) {
                    var4 = ((me) this).field_e - -(long)((me) this).field_c;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((me) this).field_e >= ((me) this).field_i + (long)((me) this).field_m) {
                break L5;
              } else {
                if ((long)((me) this).field_m + ((me) this).field_i > ((me) this).field_e - -(long)((me) this).field_c) {
                  break L5;
                } else {
                  var4 = (long)((me) this).field_m + ((me) this).field_i;
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var2 >= var4) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  ai.a(((me) this).field_a, (int)(-((me) this).field_e + var2), ((me) this).field_o, (int)(-((me) this).field_i + var2), var6);
                  break L7;
                }
              }
            }
            ((me) this).field_e = -1L;
            ((me) this).field_c = 0;
            break L0;
          }
        }
        L8: {
          if (param0 == 26021) {
            break L8;
          } else {
            ((me) this).field_m = 24;
            break L8;
          }
        }
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          ((me) this).field_m = 0;
          if ((((me) this).field_d ^ -1L) != (((me) this).field_g ^ -1L)) {
            ((me) this).field_f.a(0, ((me) this).field_g);
            ((me) this).field_d = ((me) this).field_g;
            break L0;
          } else {
            break L0;
          }
        }
        ((me) this).field_i = ((me) this).field_g;
        var2 = 94 % ((-66 - param0) / 53);
        L1: while (true) {
          L2: {
            if (((me) this).field_o.length <= ((me) this).field_m) {
              break L2;
            } else {
              L3: {
                var3 = -((me) this).field_m + ((me) this).field_o.length;
                if (200000000 < var3) {
                  var3 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = ((me) this).field_f.b(6, var3, ((me) this).field_o, ((me) this).field_m);
              if ((var4 ^ -1) == 0) {
                break L2;
              } else {
                ((me) this).field_m = ((me) this).field_m + var4;
                ((me) this).field_d = ((me) this).field_d + (long)var4;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void b(int param0) throws IOException {
        this.a(param0 ^ -7618);
        ((me) this).field_f.b(-110);
        if (param0 != -30821) {
            me.a(-62, false);
        }
    }

    final static void a(int param0, boolean param1) {
        if (-1 == (param0 ^ -1)) {
            mm.a(false, df.field_b, 2, 1, true, 2);
        }
        if (!(1 != param0)) {
            mm.a(false, hl.field_a, 2, 1, true, 2);
        }
        if (param1) {
            me.a(7, false);
        }
    }

    me(an param0, int param1, int param2) throws IOException {
        ((me) this).field_c = 0;
        ((me) this).field_e = -1L;
        ((me) this).field_i = -1L;
        ((me) this).field_f = param0;
        long dupTemp$0 = param0.a((byte) 122);
        ((me) this).field_n = dupTemp$0;
        ((me) this).field_b = dupTemp$0;
        ((me) this).field_o = new byte[param1];
        ((me) this).field_g = 0L;
        ((me) this).field_a = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_l = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_k = new ea[2];
    }
}

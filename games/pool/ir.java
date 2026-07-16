/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ir {
    private long field_f;
    private long field_j;
    static String[][] field_p;
    private int field_o;
    private byte[] field_k;
    private long field_d;
    private long field_e;
    private long field_m;
    static int field_n;
    static int field_h;
    static String field_b;
    private long field_g;
    static String field_i;
    static vh field_a;
    private v field_l;
    private byte[] field_c;
    private int field_q;

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (((ir) this).field_e < ((ir) this).field_f - -(long)param0) {
                ((ir) this).field_e = ((ir) this).field_f - -(long)param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ir) this).field_j == -1L) {
                break L2;
              } else {
                L3: {
                  if ((((ir) this).field_f ^ -1L) > (((ir) this).field_j ^ -1L)) {
                    break L3;
                  } else {
                    if ((((ir) this).field_f ^ -1L) < (((ir) this).field_j + (long)((ir) this).field_q ^ -1L)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(false);
                break L2;
              }
            }
            L4: {
              if (-1L == ((ir) this).field_j) {
                break L4;
              } else {
                if (((long)((ir) this).field_k.length + ((ir) this).field_j ^ -1L) > (((ir) this).field_f - -(long)param0 ^ -1L)) {
                  var5_int = (int)(-((ir) this).field_f - (-((ir) this).field_j - (long)((ir) this).field_k.length));
                  qn.a(param1, param2, ((ir) this).field_k, (int)(((ir) this).field_f + -((ir) this).field_j), var5_int);
                  param0 = param0 - var5_int;
                  ((ir) this).field_f = ((ir) this).field_f + (long)var5_int;
                  param2 = param2 + var5_int;
                  ((ir) this).field_q = ((ir) this).field_k.length;
                  this.a(false);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (((ir) this).field_k.length >= param0) {
              if ((param0 ^ -1) < param3) {
                L5: {
                  if (0L == (((ir) this).field_j ^ -1L)) {
                    ((ir) this).field_j = ((ir) this).field_f;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  qn.a(param1, param2, ((ir) this).field_k, (int)(-((ir) this).field_j + ((ir) this).field_f), param0);
                  ((ir) this).field_f = ((ir) this).field_f + (long)param0;
                  if (((long)((ir) this).field_q ^ -1L) <= (((ir) this).field_f - ((ir) this).field_j ^ -1L)) {
                    break L6;
                  } else {
                    ((ir) this).field_q = (int)(((ir) this).field_f - ((ir) this).field_j);
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              L7: {
                if (((ir) this).field_f == ((ir) this).field_g) {
                  break L7;
                } else {
                  ((ir) this).field_l.a(-1, ((ir) this).field_f);
                  ((ir) this).field_g = ((ir) this).field_f;
                  break L7;
                }
              }
              L8: {
                ((ir) this).field_l.a(param2, 25354, param0, param1);
                ((ir) this).field_g = ((ir) this).field_g + (long)param0;
                if (((ir) this).field_g > ((ir) this).field_m) {
                  ((ir) this).field_m = ((ir) this).field_g;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  if ((((ir) this).field_d ^ -1L) < (((ir) this).field_f ^ -1L)) {
                    break L10;
                  } else {
                    if (((long)((ir) this).field_o + ((ir) this).field_d ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                      break L10;
                    } else {
                      var5_long = ((ir) this).field_f;
                      break L9;
                    }
                  }
                }
                if (((ir) this).field_f > ((ir) this).field_d) {
                  break L9;
                } else {
                  if ((((ir) this).field_f - -(long)param0 ^ -1L) < (((ir) this).field_d ^ -1L)) {
                    var5_long = ((ir) this).field_d;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  var7 = -1L;
                  if ((((ir) this).field_d ^ -1L) <= (((ir) this).field_f - -(long)param0 ^ -1L)) {
                    break L12;
                  } else {
                    if (((long)param0 + ((ir) this).field_f ^ -1L) < (((ir) this).field_d + (long)((ir) this).field_o ^ -1L)) {
                      break L12;
                    } else {
                      var7 = (long)param0 + ((ir) this).field_f;
                      break L11;
                    }
                  }
                }
                if (((long)((ir) this).field_o + ((ir) this).field_d ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                  break L11;
                } else {
                  if (((ir) this).field_f + (long)param0 >= ((ir) this).field_d - -(long)((ir) this).field_o) {
                    var7 = ((ir) this).field_d - -(long)((ir) this).field_o;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L13: {
                if ((var5_long ^ -1L) >= 0L) {
                  break L13;
                } else {
                  if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                    break L13;
                  } else {
                    var9 = (int)(var7 + -var5_long);
                    qn.a(param1, (int)((long)param2 + (var5_long - ((ir) this).field_f)), ((ir) this).field_c, (int)(-((ir) this).field_d + var5_long), var9);
                    break L13;
                  }
                }
              }
              ((ir) this).field_f = ((ir) this).field_f + (long)param0;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ir) this).field_g = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) throws IOException {
        this.a(false);
        ((ir) this).field_l.c((byte) 101);
        if (param0 <= 34) {
            ir.a((byte) -96);
        }
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pool.field_O;
        ((ir) this).field_o = 0;
        if (param0 != -28) {
        }
        if (!(((ir) this).field_f == ((ir) this).field_g)) {
            ((ir) this).field_l.a(-1, ((ir) this).field_f);
            ((ir) this).field_g = ((ir) this).field_f;
        }
        ((ir) this).field_d = ((ir) this).field_f;
        while (((ir) this).field_o < ((ir) this).field_c.length) {
            var2 = -((ir) this).field_o + ((ir) this).field_c.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((ir) this).field_l.a(((ir) this).field_c, 20859, var2, ((ir) this).field_o);
            if (var3 == -1) {
                break;
            }
            ((ir) this).field_o = ((ir) this).field_o + var3;
            ((ir) this).field_g = ((ir) this).field_g + (long)var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
            throw new IOException();
        }
        if (param0 != 0) {
            return;
        }
        ((ir) this).field_f = param1;
    }

    final static double[][] a(int param0, double[] param1) {
        if (param0 > -90) {
          return null;
        } else {
          return new double[][]{param1, new double[6]};
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
        var14 = Pool.field_O;
        try {
          L0: {
            if (param1 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
            } else {
              L1: {
                if ((((ir) this).field_j ^ -1L) == 0L) {
                  break L1;
                } else {
                  if (((ir) this).field_j > ((ir) this).field_f) {
                    break L1;
                  } else {
                    if (((long)param1 + ((ir) this).field_f ^ -1L) < ((long)((ir) this).field_q + ((ir) this).field_j ^ -1L)) {
                      break L1;
                    } else {
                      qn.a(((ir) this).field_k, (int)(-((ir) this).field_j + ((ir) this).field_f), param3, param2, param1);
                      ((ir) this).field_f = ((ir) this).field_f + (long)param1;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((ir) this).field_f;
                var7 = param2;
                var8 = param1;
                if ((((ir) this).field_d ^ -1L) < (((ir) this).field_f ^ -1L)) {
                  break L2;
                } else {
                  if ((((ir) this).field_d - -(long)((ir) this).field_o ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)((long)((ir) this).field_o - (-((ir) this).field_d + ((ir) this).field_f));
                      if (var9_int <= param1) {
                        break L3;
                      } else {
                        var9_int = param1;
                        break L3;
                      }
                    }
                    qn.a(((ir) this).field_c, (int)(-((ir) this).field_d + ((ir) this).field_f), param3, param2, var9_int);
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    ((ir) this).field_f = ((ir) this).field_f + (long)var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (param0 < -109) {
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (((ir) this).field_c.length >= param1) {
                  if (0 >= param1) {
                    break L5;
                  } else {
                    L6: {
                      this.c((byte) -28);
                      var9_int = param1;
                      if (var9_int <= ((ir) this).field_o) {
                        break L6;
                      } else {
                        var9_int = ((ir) this).field_o;
                        break L6;
                      }
                    }
                    qn.a(((ir) this).field_c, 0, param3, param2, var9_int);
                    param1 = param1 - var9_int;
                    param2 = param2 + var9_int;
                    ((ir) this).field_f = ((ir) this).field_f + (long)var9_int;
                    break L5;
                  }
                } else {
                  ((ir) this).field_l.a(-1, ((ir) this).field_f);
                  ((ir) this).field_g = ((ir) this).field_f;
                  L7: while (true) {
                    if (param1 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((ir) this).field_l.a(param3, 20859, param1, param2);
                      if (0 == (var9_int ^ -1)) {
                        break L5;
                      } else {
                        ((ir) this).field_f = ((ir) this).field_f + (long)var9_int;
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        ((ir) this).field_g = ((ir) this).field_g + (long)var9_int;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                if (-1L == ((ir) this).field_j) {
                  break L8;
                } else {
                  L9: {
                    if ((((ir) this).field_j ^ -1L) >= (((ir) this).field_f ^ -1L)) {
                      break L9;
                    } else {
                      if (param1 <= 0) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = (int)(-((ir) this).field_f + ((ir) this).field_j) + param2;
                          if (var9_int <= param1 + param2) {
                            break L10;
                          } else {
                            var9_int = param1 + param2;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (param2 >= var9_int) {
                            break L9;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param3[incrementValue$1] = (byte) 0;
                            param1--;
                            ((ir) this).field_f = ((ir) this).field_f + 1L;
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
                      if (var5_long > ((ir) this).field_j) {
                        break L13;
                      } else {
                        if ((long)var8 + var5_long <= ((ir) this).field_j) {
                          break L13;
                        } else {
                          var9 = ((ir) this).field_j;
                          break L12;
                        }
                      }
                    }
                    if ((var5_long ^ -1L) > (((ir) this).field_j ^ -1L)) {
                      break L12;
                    } else {
                      if ((long)((ir) this).field_q + ((ir) this).field_j <= var5_long) {
                        break L12;
                      } else {
                        var9 = var5_long;
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if (var5_long >= (long)((ir) this).field_q + ((ir) this).field_j) {
                        break L15;
                      } else {
                        if ((var5_long - -(long)var8 ^ -1L) <= (((ir) this).field_j + (long)((ir) this).field_q ^ -1L)) {
                          var11 = ((ir) this).field_j + (long)((ir) this).field_q;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var5_long - -(long)var8 <= ((ir) this).field_j) {
                      break L14;
                    } else {
                      if (((long)((ir) this).field_q + ((ir) this).field_j ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                        break L14;
                      } else {
                        var11 = var5_long - -(long)var8;
                        break L14;
                      }
                    }
                  }
                  if (0L <= (var9 ^ -1L)) {
                    break L8;
                  } else {
                    if (var9 >= var11) {
                      break L8;
                    } else {
                      var13 = (int)(-var9 + var11);
                      qn.a(((ir) this).field_k, (int)(-((ir) this).field_j + var9), param3, var7 + (int)(-var5_long + var9), var13);
                      if ((((ir) this).field_f ^ -1L) <= (var11 ^ -1L)) {
                        break L8;
                      } else {
                        param1 = (int)((long)param1 - (var11 - ((ir) this).field_f));
                        ((ir) this).field_f = var11;
                        break L8;
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
          ((ir) this).field_g = -1L;
          throw var5;
        }
        if (param1 > 0) {
          throw new EOFException();
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        int var1 = -55 / ((62 - param0) / 40);
        field_p = null;
        field_b = null;
    }

    final long d(byte param0) {
        if (param0 != 17) {
            Object var3 = null;
            double[][] discarded$0 = ir.a(54, (double[]) null);
        }
        return ((ir) this).field_e;
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 < 65) {
            ((ir) this).field_e = 36L;
        }
        ((ir) this).a((byte) -126, param1.length, 0, param1);
    }

    private final void a(boolean param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          if ((((ir) this).field_j ^ -1L) != 0L) {
            L1: {
              if ((((ir) this).field_j ^ -1L) == (((ir) this).field_g ^ -1L)) {
                break L1;
              } else {
                ((ir) this).field_l.a(-1, ((ir) this).field_j);
                ((ir) this).field_g = ((ir) this).field_j;
                break L1;
              }
            }
            L2: {
              ((ir) this).field_l.a(0, 25354, ((ir) this).field_q, ((ir) this).field_k);
              ((ir) this).field_g = ((ir) this).field_g + (long)((ir) this).field_q;
              if ((((ir) this).field_m ^ -1L) <= (((ir) this).field_g ^ -1L)) {
                break L2;
              } else {
                ((ir) this).field_m = ((ir) this).field_g;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((((ir) this).field_d ^ -1L) < (((ir) this).field_j ^ -1L)) {
                  break L4;
                } else {
                  if (((ir) this).field_j >= ((ir) this).field_d - -(long)((ir) this).field_o) {
                    break L4;
                  } else {
                    var2 = ((ir) this).field_j;
                    break L3;
                  }
                }
              }
              if ((((ir) this).field_j ^ -1L) < (((ir) this).field_d ^ -1L)) {
                break L3;
              } else {
                if ((((ir) this).field_d ^ -1L) <= ((long)((ir) this).field_q + ((ir) this).field_j ^ -1L)) {
                  break L3;
                } else {
                  var2 = ((ir) this).field_d;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((ir) this).field_d ^ -1L) <= ((long)((ir) this).field_q + ((ir) this).field_j ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((ir) this).field_q + ((ir) this).field_j <= ((ir) this).field_d + (long)((ir) this).field_o) {
                    var4 = (long)((ir) this).field_q + ((ir) this).field_j;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((long)((ir) this).field_o + ((ir) this).field_d ^ -1L) >= (((ir) this).field_j ^ -1L)) {
                break L5;
              } else {
                if (((ir) this).field_j + (long)((ir) this).field_q >= (long)((ir) this).field_o + ((ir) this).field_d) {
                  var4 = ((ir) this).field_d + (long)((ir) this).field_o;
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
                if (var4 > var2) {
                  var6 = (int)(var4 + -var2);
                  qn.a(((ir) this).field_k, (int)(var2 + -((ir) this).field_j), ((ir) this).field_c, (int)(var2 - ((ir) this).field_d), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ir) this).field_q = 0;
            ((ir) this).field_j = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (!param0) {
            break L8;
          } else {
            ir.a((byte) 126);
            break L8;
          }
        }
    }

    ir(v param0, int param1, int param2) throws IOException {
        ((ir) this).field_j = -1L;
        ((ir) this).field_d = -1L;
        ((ir) this).field_q = 0;
        ((ir) this).field_l = param0;
        long dupTemp$0 = param0.a(false);
        ((ir) this).field_m = dupTemp$0;
        ((ir) this).field_e = dupTemp$0;
        ((ir) this).field_f = 0L;
        ((ir) this).field_c = new byte[param1];
        ((ir) this).field_k = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20;
        field_i = "Please try again in a few minutes.";
    }
}

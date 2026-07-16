/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class p {
    static int field_m;
    private long field_k;
    private int field_j;
    private byte[] field_e;
    private byte[] field_l;
    private long field_g;
    static String field_c;
    private sa field_h;
    private long field_a;
    private long field_b;
    private int field_f;
    private long field_i;
    private long field_d;

    final long b(int param0) {
        if (param0 != -200000001) {
            ((p) this).field_d = 63L;
        }
        return ((p) this).field_i;
    }

    final void a(int param0) throws IOException {
        this.a((byte) 66);
        ((p) this).field_h.b(0);
        if (param0 != -1) {
            ((p) this).field_f = -5;
        }
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
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if ((long)param3 + ((p) this).field_k <= ((p) this).field_i) {
                break L1;
              } else {
                ((p) this).field_i = ((p) this).field_k - -(long)param3;
                break L1;
              }
            }
            L2: {
              if (((p) this).field_b == -1L) {
                break L2;
              } else {
                L3: {
                  if (((p) this).field_b > ((p) this).field_k) {
                    break L3;
                  } else {
                    if (((p) this).field_b - -(long)((p) this).field_f < ((p) this).field_k) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a((byte) 66);
                break L2;
              }
            }
            L4: {
              if (param0 == -19735) {
                break L4;
              } else {
                p.b((byte) -23);
                break L4;
              }
            }
            L5: {
              if (0L == (((p) this).field_b ^ -1L)) {
                break L5;
              } else {
                if (((p) this).field_b - -(long)((p) this).field_e.length >= ((p) this).field_k - -(long)param3) {
                  break L5;
                } else {
                  var5_int = (int)((long)((p) this).field_e.length - (-((p) this).field_b + ((p) this).field_k));
                  rd.a(param1, param2, ((p) this).field_e, (int)(-((p) this).field_b + ((p) this).field_k), var5_int);
                  ((p) this).field_k = ((p) this).field_k + (long)var5_int;
                  param2 = param2 + var5_int;
                  param3 = param3 - var5_int;
                  ((p) this).field_f = ((p) this).field_e.length;
                  this.a((byte) 66);
                  break L5;
                }
              }
            }
            if (((p) this).field_e.length < param3) {
              L6: {
                if (((p) this).field_k == ((p) this).field_g) {
                  break L6;
                } else {
                  ((p) this).field_h.a(((p) this).field_k, false);
                  ((p) this).field_g = ((p) this).field_k;
                  break L6;
                }
              }
              L7: {
                ((p) this).field_h.a(param0 + 19649, param2, param1, param3);
                ((p) this).field_g = ((p) this).field_g + (long)param3;
                if (((p) this).field_g > ((p) this).field_a) {
                  ((p) this).field_a = ((p) this).field_g;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  if ((((p) this).field_d ^ -1L) < (((p) this).field_k ^ -1L)) {
                    break L9;
                  } else {
                    if ((((p) this).field_d + (long)((p) this).field_j ^ -1L) < (((p) this).field_k ^ -1L)) {
                      var5_long = ((p) this).field_k;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if ((((p) this).field_d ^ -1L) > (((p) this).field_k ^ -1L)) {
                  break L8;
                } else {
                  if (((long)param3 + ((p) this).field_k ^ -1L) < (((p) this).field_d ^ -1L)) {
                    var5_long = ((p) this).field_d;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  var7 = -1L;
                  if ((((p) this).field_d ^ -1L) <= (((p) this).field_k - -(long)param3 ^ -1L)) {
                    break L11;
                  } else {
                    if ((long)((p) this).field_j + ((p) this).field_d < (long)param3 + ((p) this).field_k) {
                      break L11;
                    } else {
                      var7 = (long)param3 + ((p) this).field_k;
                      break L10;
                    }
                  }
                }
                if (((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                  break L10;
                } else {
                  if ((long)param3 + ((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                    var7 = (long)((p) this).field_j + ((p) this).field_d;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (-1L >= var5_long) {
                  break L12;
                } else {
                  if (var5_long < var7) {
                    var9 = (int)(-var5_long + var7);
                    rd.a(param1, (int)(var5_long + ((long)param2 + -((p) this).field_k)), ((p) this).field_l, (int)(-((p) this).field_d + var5_long), var9);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((p) this).field_k = ((p) this).field_k + (long)param3;
              return;
            } else {
              if (param3 <= 0) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L13: {
                  if ((((p) this).field_b ^ -1L) != 0L) {
                    break L13;
                  } else {
                    ((p) this).field_b = ((p) this).field_k;
                    break L13;
                  }
                }
                L14: {
                  rd.a(param1, param2, ((p) this).field_e, (int)(-((p) this).field_b + ((p) this).field_k), param3);
                  ((p) this).field_k = ((p) this).field_k + (long)param3;
                  if ((-((p) this).field_b + ((p) this).field_k ^ -1L) >= ((long)((p) this).field_f ^ -1L)) {
                    break L14;
                  } else {
                    ((p) this).field_f = (int)(((p) this).field_k - ((p) this).field_b);
                    break L14;
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
          ((p) this).field_g = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        ((p) this).field_j = 0;
        if (!((((p) this).field_g ^ -1L) == (((p) this).field_k ^ -1L))) {
            ((p) this).field_h.a(((p) this).field_k, false);
            ((p) this).field_g = ((p) this).field_k;
        }
        if (!param0) {
            ((p) this).field_i = -73L;
        }
        ((p) this).field_d = ((p) this).field_k;
        while ((((p) this).field_l.length ^ -1) < (((p) this).field_j ^ -1)) {
            var2 = ((p) this).field_l.length - ((p) this).field_j;
            if (!((var2 ^ -1) >= -200000001)) {
                var2 = 200000000;
            }
            var3 = ((p) this).field_h.a(var2, ((p) this).field_j, ((p) this).field_l, (byte) 115);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((p) this).field_j = ((p) this).field_j + var3;
            ((p) this).field_g = ((p) this).field_g + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -80) {
            field_m = 19;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = la.a(il.a(-23718, param0), true);
        if (var2 == null) {
            var2 = "";
        }
        if (param1 != 43) {
            field_m = 25;
        }
        return var2;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        if (param0 == 66) {
          L0: {
            if (0L != (((p) this).field_b ^ -1L)) {
              L1: {
                if ((((p) this).field_b ^ -1L) == (((p) this).field_g ^ -1L)) {
                  break L1;
                } else {
                  ((p) this).field_h.a(((p) this).field_b, false);
                  ((p) this).field_g = ((p) this).field_b;
                  break L1;
                }
              }
              L2: {
                ((p) this).field_h.a(-128, 0, ((p) this).field_e, ((p) this).field_f);
                ((p) this).field_g = ((p) this).field_g + (long)((p) this).field_f;
                if ((((p) this).field_g ^ -1L) < (((p) this).field_a ^ -1L)) {
                  ((p) this).field_a = ((p) this).field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if ((((p) this).field_b ^ -1L) > (((p) this).field_d ^ -1L)) {
                    break L4;
                  } else {
                    if ((((p) this).field_b ^ -1L) <= (((p) this).field_d - -(long)((p) this).field_j ^ -1L)) {
                      break L4;
                    } else {
                      var2 = ((p) this).field_b;
                      break L3;
                    }
                  }
                }
                if (((p) this).field_b > ((p) this).field_d) {
                  break L3;
                } else {
                  if ((((p) this).field_b - -(long)((p) this).field_f ^ -1L) >= (((p) this).field_d ^ -1L)) {
                    break L3;
                  } else {
                    var2 = ((p) this).field_d;
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((long)((p) this).field_f + ((p) this).field_b ^ -1L) >= (((p) this).field_d ^ -1L)) {
                    break L6;
                  } else {
                    if (((p) this).field_d - -(long)((p) this).field_j >= ((p) this).field_b + (long)((p) this).field_f) {
                      var4 = (long)((p) this).field_f + ((p) this).field_b;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((((p) this).field_d - -(long)((p) this).field_j ^ -1L) >= (((p) this).field_b ^ -1L)) {
                  break L5;
                } else {
                  if (((p) this).field_b + (long)((p) this).field_f >= (long)((p) this).field_j + ((p) this).field_d) {
                    var4 = ((p) this).field_d + (long)((p) this).field_j;
                    break L5;
                  } else {
                    L7: {
                      if (-1L >= var2) {
                        break L7;
                      } else {
                        if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                          break L7;
                        } else {
                          var6 = (int)(var4 - var2);
                          rd.a(((p) this).field_e, (int)(var2 - ((p) this).field_b), ((p) this).field_l, (int)(var2 - ((p) this).field_d), var6);
                          break L7;
                        }
                      }
                    }
                    ((p) this).field_f = 0;
                    ((p) this).field_b = -1L;
                    break L0;
                  }
                }
              }
              L8: {
                if (-1L >= var2) {
                  break L8;
                } else {
                  if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                    break L8;
                  } else {
                    var6 = (int)(var4 - var2);
                    rd.a(((p) this).field_e, (int)(var2 - ((p) this).field_b), ((p) this).field_l, (int)(var2 - ((p) this).field_d), var6);
                    break L8;
                  }
                }
              }
              ((p) this).field_f = 0;
              ((p) this).field_b = -1L;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != 66) {
            return;
        }
        ((p) this).a(param0, param0.length, 0, (byte) 120);
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
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
        var14 = TetraLink.field_J;
        try {
          L0: {
            if (param1 + param2 <= param0.length) {
              L1: {
                if (-1L == ((p) this).field_b) {
                  break L1;
                } else {
                  if ((((p) this).field_b ^ -1L) < (((p) this).field_k ^ -1L)) {
                    break L1;
                  } else {
                    if ((((p) this).field_b - -(long)((p) this).field_f ^ -1L) <= ((long)param1 + ((p) this).field_k ^ -1L)) {
                      rd.a(((p) this).field_e, (int)(((p) this).field_k + -((p) this).field_b), param0, param2, param1);
                      ((p) this).field_k = ((p) this).field_k + (long)param1;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((p) this).field_k;
                var7 = param2;
                if (param3 > 31) {
                  break L2;
                } else {
                  field_m = -43;
                  break L2;
                }
              }
              L3: {
                var8 = param1;
                if ((((p) this).field_d ^ -1L) < (((p) this).field_k ^ -1L)) {
                  break L3;
                } else {
                  if (((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)(-((p) this).field_k + (((p) this).field_d + (long)((p) this).field_j));
                      if (param1 >= var9_int) {
                        break L4;
                      } else {
                        var9_int = param1;
                        break L4;
                      }
                    }
                    rd.a(((p) this).field_l, (int)(((p) this).field_k - ((p) this).field_d), param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (param1 <= ((p) this).field_l.length) {
                  if (-1 <= (param1 ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      this.a(true);
                      var9_int = param1;
                      if (var9_int > ((p) this).field_j) {
                        var9_int = ((p) this).field_j;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    rd.a(((p) this).field_l, 0, param0, param2, var9_int);
                    ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                    param1 = param1 - var9_int;
                    param2 = param2 + var9_int;
                    break L5;
                  }
                } else {
                  ((p) this).field_h.a(((p) this).field_k, false);
                  ((p) this).field_g = ((p) this).field_k;
                  L7: while (true) {
                    if ((param1 ^ -1) >= -1) {
                      break L5;
                    } else {
                      var9_int = ((p) this).field_h.a(param1, param2, param0, (byte) -121);
                      if (-1 == var9_int) {
                        break L5;
                      } else {
                        param1 = param1 - var9_int;
                        ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((p) this).field_g = ((p) this).field_g + (long)var9_int;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                if (0L == (((p) this).field_b ^ -1L)) {
                  break L8;
                } else {
                  L9: {
                    if ((((p) this).field_k ^ -1L) <= (((p) this).field_b ^ -1L)) {
                      break L9;
                    } else {
                      if ((param1 ^ -1) >= -1) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = param2 - -(int)(((p) this).field_b - ((p) this).field_k);
                          if (var9_int <= param1 + param2) {
                            break L10;
                          } else {
                            var9_int = param1 + param2;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param2) {
                            break L9;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param0[incrementValue$1] = (byte) 0;
                            param1--;
                            ((p) this).field_k = ((p) this).field_k + 1L;
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
                      if (var5_long > ((p) this).field_b) {
                        break L13;
                      } else {
                        if (var5_long - -(long)var8 > ((p) this).field_b) {
                          var9 = ((p) this).field_b;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var5_long < ((p) this).field_b) {
                      break L12;
                    } else {
                      if ((long)((p) this).field_f + ((p) this).field_b > var5_long) {
                        var9 = var5_long;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if ((var5_long ^ -1L) <= ((long)((p) this).field_f + ((p) this).field_b ^ -1L)) {
                        break L15;
                      } else {
                        if (((long)var8 + var5_long ^ -1L) <= (((p) this).field_b + (long)((p) this).field_f ^ -1L)) {
                          var11 = ((p) this).field_b - -(long)((p) this).field_f;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if ((((p) this).field_b ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                      break L14;
                    } else {
                      if (((p) this).field_b - -(long)((p) this).field_f >= var5_long + (long)var8) {
                        var11 = var5_long - -(long)var8;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L8;
                  } else {
                    if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                      break L8;
                    } else {
                      var13 = (int)(-var9 + var11);
                      rd.a(((p) this).field_e, (int)(-((p) this).field_b + var9), param0, var7 + (int)(-var5_long + var9), var13);
                      if ((var11 ^ -1L) >= (((p) this).field_k ^ -1L)) {
                        break L8;
                      } else {
                        param1 = (int)((long)param1 - (var11 - ((p) this).field_k));
                        ((p) this).field_k = var11;
                        break L8;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              throw new ArrayIndexOutOfBoundsException(param2 - -param1 + -param0.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((p) this).field_g = -1L;
          throw var5;
        }
        if (param1 > 0) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (-1L < (param0 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            ((p) this).field_k = param0;
            if (param1 == 0) {
              break L0;
            } else {
              ((p) this).field_b = -9L;
              break L0;
            }
          }
          return;
        }
    }

    p(sa param0, int param1, int param2) throws IOException {
        ((p) this).field_b = -1L;
        ((p) this).field_f = 0;
        ((p) this).field_d = -1L;
        ((p) this).field_h = param0;
        long dupTemp$0 = param0.a(-1);
        ((p) this).field_a = dupTemp$0;
        ((p) this).field_i = dupTemp$0;
        ((p) this).field_l = new byte[param1];
        ((p) this).field_e = new byte[param2];
        ((p) this).field_k = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The invitation has been withdrawn.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc {
    private long field_c;
    private long field_l;
    private byte[] field_h;
    private kb field_f;
    private long field_b;
    private int field_d;
    private long field_e;
    private byte[] field_k;
    private long field_a;
    static int field_g;
    private long field_i;
    private int field_j;
    static boolean field_m;

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
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
        var14 = stellarshard.field_B;
        try {
          L0: {
            if (param0 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param2 + param0 - param3.length);
            } else {
              L1: {
                if (0L == (((pc) this).field_l ^ -1L)) {
                  break L1;
                } else {
                  if (((pc) this).field_c < ((pc) this).field_l) {
                    break L1;
                  } else {
                    if ((long)param0 + ((pc) this).field_c <= (long)((pc) this).field_d + ((pc) this).field_l) {
                      ri.a(((pc) this).field_k, (int)(((pc) this).field_c - ((pc) this).field_l), param3, param2, param0);
                      ((pc) this).field_c = ((pc) this).field_c + (long)param0;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((pc) this).field_c;
                var7 = param2;
                var8 = param0;
                if (((pc) this).field_b > ((pc) this).field_c) {
                  break L2;
                } else {
                  if (((pc) this).field_c < ((pc) this).field_b - -(long)((pc) this).field_j) {
                    L3: {
                      var9_int = (int)(((pc) this).field_b - ((pc) this).field_c + (long)((pc) this).field_j);
                      if (var9_int <= param0) {
                        break L3;
                      } else {
                        var9_int = param0;
                        break L3;
                      }
                    }
                    ri.a(((pc) this).field_h, (int)(-((pc) this).field_b + ((pc) this).field_c), param3, param2, var9_int);
                    param2 = param2 + var9_int;
                    ((pc) this).field_c = ((pc) this).field_c + (long)var9_int;
                    param0 = param0 - var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (param0 > ((pc) this).field_h.length) {
                  ((pc) this).field_f.a(((pc) this).field_c, param1 + 2298);
                  ((pc) this).field_i = ((pc) this).field_c;
                  L5: while (true) {
                    if ((param0 ^ -1) >= -1) {
                      break L4;
                    } else {
                      var9_int = ((pc) this).field_f.a(param0, param2, param3, 1);
                      if ((var9_int ^ -1) != 0) {
                        ((pc) this).field_i = ((pc) this).field_i + (long)var9_int;
                        ((pc) this).field_c = ((pc) this).field_c + (long)var9_int;
                        param2 = param2 + var9_int;
                        param0 = param0 - var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (0 >= param0) {
                    break L4;
                  } else {
                    L6: {
                      this.b(param1 ^ -5);
                      var9_int = param0;
                      if (((pc) this).field_j < var9_int) {
                        var9_int = ((pc) this).field_j;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ri.a(((pc) this).field_h, 0, param3, param2, var9_int);
                    param0 = param0 - var9_int;
                    ((pc) this).field_c = ((pc) this).field_c + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L4;
                  }
                }
              }
              if (param1 == -93) {
                L7: {
                  if (0L == (((pc) this).field_l ^ -1L)) {
                    break L7;
                  } else {
                    L8: {
                      if (((pc) this).field_l <= ((pc) this).field_c) {
                        break L8;
                      } else {
                        if ((param0 ^ -1) >= -1) {
                          break L8;
                        } else {
                          L9: {
                            var9_int = (int)(((pc) this).field_l - ((pc) this).field_c) + param2;
                            if (param2 + param0 >= var9_int) {
                              break L9;
                            } else {
                              var9_int = param2 - -param0;
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (var9_int <= param2) {
                              break L8;
                            } else {
                              param0--;
                              int incrementValue$1 = param2;
                              param2++;
                              param3[incrementValue$1] = (byte) 0;
                              ((pc) this).field_c = ((pc) this).field_c + 1L;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      L12: {
                        var9 = -1L;
                        var11 = -1L;
                        if (((pc) this).field_l < var5_long) {
                          break L12;
                        } else {
                          if ((var5_long + (long)var8 ^ -1L) >= (((pc) this).field_l ^ -1L)) {
                            break L12;
                          } else {
                            var9 = ((pc) this).field_l;
                            break L11;
                          }
                        }
                      }
                      if (var5_long < ((pc) this).field_l) {
                        break L11;
                      } else {
                        if (var5_long >= ((pc) this).field_l + (long)((pc) this).field_d) {
                          break L11;
                        } else {
                          var9 = var5_long;
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (((pc) this).field_l + (long)((pc) this).field_d <= var5_long) {
                          break L14;
                        } else {
                          if (var5_long - -(long)var8 >= (long)((pc) this).field_d + ((pc) this).field_l) {
                            var11 = (long)((pc) this).field_d + ((pc) this).field_l;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if ((((pc) this).field_l ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                        break L13;
                      } else {
                        if ((long)var8 + var5_long <= (long)((pc) this).field_d + ((pc) this).field_l) {
                          var11 = (long)var8 + var5_long;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (0L <= (var9 ^ -1L)) {
                      break L7;
                    } else {
                      if ((var9 ^ -1L) > (var11 ^ -1L)) {
                        var13 = (int)(-var9 + var11);
                        ri.a(((pc) this).field_k, (int)(var9 + -((pc) this).field_l), param3, (int)(var9 - var5_long) + var7, var13);
                        if ((((pc) this).field_c ^ -1L) <= (var11 ^ -1L)) {
                          break L7;
                        } else {
                          param0 = (int)((long)param0 - (-((pc) this).field_c + var11));
                          ((pc) this).field_c = var11;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((pc) this).field_i = -1L;
          throw var5;
        }
        if ((param0 ^ -1) < -1) {
          throw new EOFException();
        } else {
          return;
        }
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = stellarshard.field_B;
          if (((pc) this).field_l != -1L) {
            L1: {
              if ((((pc) this).field_i ^ -1L) == (((pc) this).field_l ^ -1L)) {
                break L1;
              } else {
                ((pc) this).field_f.a(((pc) this).field_l, 2205);
                ((pc) this).field_i = ((pc) this).field_l;
                break L1;
              }
            }
            L2: {
              ((pc) this).field_f.a(((pc) this).field_k, false, 0, ((pc) this).field_d);
              ((pc) this).field_i = ((pc) this).field_i + (long)((pc) this).field_d;
              if ((((pc) this).field_e ^ -1L) > (((pc) this).field_i ^ -1L)) {
                ((pc) this).field_e = ((pc) this).field_i;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((pc) this).field_b ^ -1L) < (((pc) this).field_l ^ -1L)) {
                  break L4;
                } else {
                  if ((((pc) this).field_l ^ -1L) > ((long)((pc) this).field_j + ((pc) this).field_b ^ -1L)) {
                    var2 = ((pc) this).field_l;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((pc) this).field_l ^ -1L) < (((pc) this).field_b ^ -1L)) {
                break L3;
              } else {
                if (((pc) this).field_l + (long)((pc) this).field_d <= ((pc) this).field_b) {
                  break L3;
                } else {
                  var2 = ((pc) this).field_b;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((pc) this).field_b >= ((pc) this).field_l - -(long)((pc) this).field_d) {
                  break L6;
                } else {
                  if ((((pc) this).field_l - -(long)((pc) this).field_d ^ -1L) < (((pc) this).field_b - -(long)((pc) this).field_j ^ -1L)) {
                    break L6;
                  } else {
                    var4 = ((pc) this).field_l - -(long)((pc) this).field_d;
                    break L5;
                  }
                }
              }
              if (((pc) this).field_b + (long)((pc) this).field_j <= ((pc) this).field_l) {
                break L5;
              } else {
                if (((long)((pc) this).field_d + ((pc) this).field_l ^ -1L) > (((pc) this).field_b + (long)((pc) this).field_j ^ -1L)) {
                  break L5;
                } else {
                  var4 = ((pc) this).field_b + (long)((pc) this).field_j;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(var4 - var2);
                  ri.a(((pc) this).field_k, (int)(var2 - ((pc) this).field_l), ((pc) this).field_h, (int)(var2 - ((pc) this).field_b), var6);
                  break L7;
                }
              }
            }
            ((pc) this).field_l = -1L;
            ((pc) this).field_d = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 >= 92) {
            break L8;
          } else {
            field_g = 104;
            break L8;
          }
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 != 0) {
            return;
        }
        ((pc) this).field_c = param0;
    }

    final long c(int param0) {
        if (param0 < 54) {
            ((pc) this).field_k = null;
        }
        return ((pc) this).field_a;
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = stellarshard.field_B;
        ((pc) this).field_j = 0;
        if (!(((pc) this).field_c == ((pc) this).field_i)) {
            ((pc) this).field_f.a(((pc) this).field_c, 2205);
            ((pc) this).field_i = ((pc) this).field_c;
        }
        ((pc) this).field_b = ((pc) this).field_c;
        if (param0 <= 84) {
            ((pc) this).field_f = null;
        }
        while (((pc) this).field_j < ((pc) this).field_h.length) {
            var2 = ((pc) this).field_h.length - ((pc) this).field_j;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((pc) this).field_f.a(var2, ((pc) this).field_j, ((pc) this).field_h, 1);
            if (0 == (var3 ^ -1)) {
                break;
            }
            ((pc) this).field_i = ((pc) this).field_i + (long)var3;
            ((pc) this).field_j = ((pc) this).field_j + var3;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((pc) this).a(param1.length, (byte) -93, param0, param1);
    }

    final static ub a(int param0, pf param1, pf param2, byte param3, int param4) {
        if (param3 == -39) {
          if (!tl.a(param2, (byte) -5, param0, param4)) {
            return null;
          } else {
            return we.a(param1.a(param4, 16, param0), 1);
          }
        } else {
          return null;
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != -4506) {
            ((pc) this).field_f = null;
        }
        this.a((byte) 101);
        ((pc) this).field_f.a(param0 ^ 4590);
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
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (((long)param0 + ((pc) this).field_c ^ -1L) >= (((pc) this).field_a ^ -1L)) {
                break L1;
              } else {
                ((pc) this).field_a = ((pc) this).field_c + (long)param0;
                break L1;
              }
            }
            L2: {
              if (0L == (((pc) this).field_l ^ -1L)) {
                break L2;
              } else {
                L3: {
                  if (((pc) this).field_l > ((pc) this).field_c) {
                    break L3;
                  } else {
                    if ((((pc) this).field_c ^ -1L) < ((long)((pc) this).field_d + ((pc) this).field_l ^ -1L)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a((byte) 108);
                break L2;
              }
            }
            L4: {
              if (0L == (((pc) this).field_l ^ -1L)) {
                break L4;
              } else {
                if (((long)((pc) this).field_k.length + ((pc) this).field_l ^ -1L) > ((long)param0 + ((pc) this).field_c ^ -1L)) {
                  var5_int = (int)(-((pc) this).field_c + (((pc) this).field_l + (long)((pc) this).field_k.length));
                  ri.a(param3, param1, ((pc) this).field_k, (int)(-((pc) this).field_l + ((pc) this).field_c), var5_int);
                  param1 = param1 + var5_int;
                  ((pc) this).field_c = ((pc) this).field_c + (long)var5_int;
                  param0 = param0 - var5_int;
                  ((pc) this).field_d = ((pc) this).field_k.length;
                  this.a((byte) 108);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param0 <= ((pc) this).field_k.length) {
              if ((param0 ^ -1) < param2) {
                L5: {
                  if ((((pc) this).field_l ^ -1L) == 0L) {
                    ((pc) this).field_l = ((pc) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  ri.a(param3, param1, ((pc) this).field_k, (int)(((pc) this).field_c + -((pc) this).field_l), param0);
                  ((pc) this).field_c = ((pc) this).field_c + (long)param0;
                  if (((long)((pc) this).field_d ^ -1L) <= (-((pc) this).field_l + ((pc) this).field_c ^ -1L)) {
                    break L6;
                  } else {
                    ((pc) this).field_d = (int)(((pc) this).field_c - ((pc) this).field_l);
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
                if (((pc) this).field_i == ((pc) this).field_c) {
                  break L7;
                } else {
                  ((pc) this).field_f.a(((pc) this).field_c, param2 ^ -2206);
                  ((pc) this).field_i = ((pc) this).field_c;
                  break L7;
                }
              }
              L8: {
                ((pc) this).field_f.a(param3, false, param1, param0);
                ((pc) this).field_i = ((pc) this).field_i + (long)param0;
                if ((((pc) this).field_e ^ -1L) > (((pc) this).field_i ^ -1L)) {
                  ((pc) this).field_e = ((pc) this).field_i;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  if ((((pc) this).field_c ^ -1L) > (((pc) this).field_b ^ -1L)) {
                    break L10;
                  } else {
                    if (((long)((pc) this).field_j + ((pc) this).field_b ^ -1L) < (((pc) this).field_c ^ -1L)) {
                      var5_long = ((pc) this).field_c;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((pc) this).field_c > ((pc) this).field_b) {
                  break L9;
                } else {
                  if ((((pc) this).field_b ^ -1L) > (((pc) this).field_c + (long)param0 ^ -1L)) {
                    var5_long = ((pc) this).field_b;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  var7 = -1L;
                  if ((((pc) this).field_b ^ -1L) <= ((long)param0 + ((pc) this).field_c ^ -1L)) {
                    break L12;
                  } else {
                    if ((long)param0 + ((pc) this).field_c <= (long)((pc) this).field_j + ((pc) this).field_b) {
                      var7 = ((pc) this).field_c - -(long)param0;
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (((pc) this).field_b + (long)((pc) this).field_j <= ((pc) this).field_c) {
                  break L11;
                } else {
                  if ((long)((pc) this).field_j + ((pc) this).field_b > (long)param0 + ((pc) this).field_c) {
                    break L11;
                  } else {
                    var7 = ((pc) this).field_b + (long)((pc) this).field_j;
                    break L11;
                  }
                }
              }
              L13: {
                if (var5_long <= -1L) {
                  break L13;
                } else {
                  if (var5_long >= var7) {
                    break L13;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    ri.a(param3, (int)(-((pc) this).field_c + ((long)param1 + var5_long)), ((pc) this).field_h, (int)(var5_long + -((pc) this).field_b), var9);
                    break L13;
                  }
                }
              }
              ((pc) this).field_c = ((pc) this).field_c + (long)param0;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((pc) this).field_i = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pc(kb param0, int param1, int param2) throws IOException {
        ((pc) this).field_b = -1L;
        ((pc) this).field_l = -1L;
        ((pc) this).field_d = 0;
        ((pc) this).field_f = param0;
        long dupTemp$0 = param0.b(-106);
        ((pc) this).field_e = dupTemp$0;
        ((pc) this).field_a = dupTemp$0;
        ((pc) this).field_h = new byte[param1];
        ((pc) this).field_k = new byte[param2];
        ((pc) this).field_c = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 50;
    }
}

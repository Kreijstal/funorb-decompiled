/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class o {
    private byte[] field_a;
    private long field_k;
    private long field_l;
    private long field_e;
    private long field_h;
    private byte[] field_g;
    private long field_f;
    private int field_b;
    private long field_i;
    static String field_c;
    private int field_j;
    private ue field_d;

    private final void c(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if ((((o) this).field_e ^ -1L) != 0L) {
            L1: {
              if ((((o) this).field_e ^ -1L) != (((o) this).field_h ^ -1L)) {
                ((o) this).field_d.a(-2, ((o) this).field_e);
                ((o) this).field_h = ((o) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((o) this).field_d.a(((o) this).field_b, 2, 0, ((o) this).field_g);
              ((o) this).field_h = ((o) this).field_h + (long)((o) this).field_b;
              if ((((o) this).field_k ^ -1L) > (((o) this).field_h ^ -1L)) {
                ((o) this).field_k = ((o) this).field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((o) this).field_e < ((o) this).field_f) {
                  break L4;
                } else {
                  if (((o) this).field_e < (long)((o) this).field_j + ((o) this).field_f) {
                    var2 = ((o) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((o) this).field_e > ((o) this).field_f) {
                break L3;
              } else {
                if (((o) this).field_f < ((o) this).field_e + (long)((o) this).field_b) {
                  var2 = ((o) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((((o) this).field_f ^ -1L) <= ((long)((o) this).field_b + ((o) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  if ((((o) this).field_e - -(long)((o) this).field_b ^ -1L) < (((o) this).field_f + (long)((o) this).field_j ^ -1L)) {
                    break L6;
                  } else {
                    var4 = ((o) this).field_e - -(long)((o) this).field_b;
                    break L5;
                  }
                }
              }
              if (((o) this).field_f - -(long)((o) this).field_j <= ((o) this).field_e) {
                break L5;
              } else {
                if ((((o) this).field_e - -(long)((o) this).field_b ^ -1L) <= ((long)((o) this).field_j + ((o) this).field_f ^ -1L)) {
                  var4 = ((o) this).field_f + (long)((o) this).field_j;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  dk.a(((o) this).field_g, (int)(var2 - ((o) this).field_e), ((o) this).field_a, (int)(-((o) this).field_f + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((o) this).field_b = 0;
            ((o) this).field_e = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 > 45) {
            break L8;
          } else {
            o.b(77);
            break L8;
          }
        }
    }

    final long b(boolean param0) {
        if (!param0) {
            return -35L;
        }
        return ((o) this).field_l;
    }

    final void a(boolean param0) throws IOException {
        this.c(116);
        ((o) this).field_d.a((byte) -118);
        if (param0) {
        }
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
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (((o) this).field_i + (long)param1 > ((o) this).field_l) {
                ((o) this).field_l = (long)param1 + ((o) this).field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((((o) this).field_e ^ -1L) == 0L) {
                break L2;
              } else {
                if (((o) this).field_i >= ((o) this).field_e) {
                  if (((o) this).field_e + (long)((o) this).field_b >= ((o) this).field_i) {
                    break L2;
                  } else {
                    this.c(100);
                    break L2;
                  }
                } else {
                  this.c(100);
                  break L2;
                }
              }
            }
            L3: {
              if (0L == (((o) this).field_e ^ -1L)) {
                break L3;
              } else {
                if ((((o) this).field_i + (long)param1 ^ -1L) < ((long)((o) this).field_g.length + ((o) this).field_e ^ -1L)) {
                  var5_int = (int)((long)((o) this).field_g.length - (((o) this).field_i + -((o) this).field_e));
                  dk.a(param3, param2, ((o) this).field_g, (int)(((o) this).field_i - ((o) this).field_e), var5_int);
                  param1 = param1 - var5_int;
                  ((o) this).field_i = ((o) this).field_i + (long)var5_int;
                  param2 = param2 + var5_int;
                  ((o) this).field_b = ((o) this).field_g.length;
                  this.c(55);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (((o) this).field_g.length >= param1) {
              if (param1 > 0) {
                L4: {
                  if (((o) this).field_e != -1L) {
                    break L4;
                  } else {
                    ((o) this).field_e = ((o) this).field_i;
                    break L4;
                  }
                }
                L5: {
                  dk.a(param3, param2, ((o) this).field_g, (int)(-((o) this).field_e + ((o) this).field_i), param1);
                  ((o) this).field_i = ((o) this).field_i + (long)param1;
                  if (((long)((o) this).field_b ^ -1L) <= (-((o) this).field_e + ((o) this).field_i ^ -1L)) {
                    break L5;
                  } else {
                    ((o) this).field_b = (int)(((o) this).field_i - ((o) this).field_e);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              L6: {
                if (((o) this).field_i != ((o) this).field_h) {
                  ((o) this).field_d.a(-2, ((o) this).field_i);
                  ((o) this).field_h = ((o) this).field_i;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ((o) this).field_d.a(param1, 2, param2, param3);
                ((o) this).field_h = ((o) this).field_h + (long)param1;
                if ((((o) this).field_h ^ -1L) < (((o) this).field_k ^ -1L)) {
                  ((o) this).field_k = ((o) this).field_h;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  if (((o) this).field_i < ((o) this).field_f) {
                    break L9;
                  } else {
                    if ((((o) this).field_f + (long)((o) this).field_j ^ -1L) >= (((o) this).field_i ^ -1L)) {
                      break L9;
                    } else {
                      var5_long = ((o) this).field_i;
                      break L8;
                    }
                  }
                }
                if (((o) this).field_i > ((o) this).field_f) {
                  break L8;
                } else {
                  if ((((o) this).field_i + (long)param1 ^ -1L) < (((o) this).field_f ^ -1L)) {
                    var5_long = ((o) this).field_f;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  var7 = -1L;
                  if (((o) this).field_i - -(long)param1 <= ((o) this).field_f) {
                    break L11;
                  } else {
                    if (((long)param1 + ((o) this).field_i ^ -1L) >= ((long)((o) this).field_j + ((o) this).field_f ^ -1L)) {
                      var7 = (long)param1 + ((o) this).field_i;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (((o) this).field_f + (long)((o) this).field_j <= ((o) this).field_i) {
                  break L10;
                } else {
                  if ((long)param1 + ((o) this).field_i < ((o) this).field_f + (long)((o) this).field_j) {
                    break L10;
                  } else {
                    var7 = (long)((o) this).field_j + ((o) this).field_f;
                    break L10;
                  }
                }
              }
              L12: {
                if (var5_long <= -1L) {
                  break L12;
                } else {
                  if ((var5_long ^ -1L) > (var7 ^ -1L)) {
                    var9 = (int)(var7 + -var5_long);
                    dk.a(param3, (int)((long)param2 - -var5_long + -((o) this).field_i), ((o) this).field_a, (int)(-((o) this).field_f + var5_long), var9);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((o) this).field_i = ((o) this).field_i + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((o) this).field_h = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          L13: {
            if (param0 == -1) {
              break L13;
            } else {
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_c = null;
        }
        field_c = null;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Torquing.field_u;
        ((o) this).field_j = 0;
        if (!(((o) this).field_i == ((o) this).field_h)) {
            ((o) this).field_d.a(-2, ((o) this).field_i);
            ((o) this).field_h = ((o) this).field_i;
        }
        ((o) this).field_f = ((o) this).field_i;
        if (param0 >= -54) {
        }
        while (((o) this).field_a.length > ((o) this).field_j) {
            var2 = -((o) this).field_j + ((o) this).field_a.length;
            if (!((var2 ^ -1) >= -200000001)) {
                var2 = 200000000;
            }
            var3 = ((o) this).field_d.a(var2, ((o) this).field_j, ((o) this).field_a, 15389);
            if ((var3 ^ -1) == 0) {
                break;
            }
            ((o) this).field_h = ((o) this).field_h + (long)var3;
            ((o) this).field_j = ((o) this).field_j + var3;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        Throwable decompiledCaughtException = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            if (param1.length < param2 + param0) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
            } else {
              L1: {
                if (-1L == ((o) this).field_e) {
                  break L1;
                } else {
                  if (((o) this).field_i < ((o) this).field_e) {
                    break L1;
                  } else {
                    if (((o) this).field_e - -(long)((o) this).field_b >= ((o) this).field_i - -(long)param2) {
                      dk.a(((o) this).field_g, (int)(-((o) this).field_e + ((o) this).field_i), param1, param0, param2);
                      ((o) this).field_i = ((o) this).field_i + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var8 = 76 / ((param3 - 1) / 44);
                var5_long = ((o) this).field_i;
                var7 = param0;
                var9 = param2;
                if ((((o) this).field_f ^ -1L) < (((o) this).field_i ^ -1L)) {
                  break L2;
                } else {
                  if ((long)((o) this).field_j + ((o) this).field_f <= ((o) this).field_i) {
                    break L2;
                  } else {
                    L3: {
                      var10_int = (int)(((o) this).field_f + -((o) this).field_i + (long)((o) this).field_j);
                      if (var10_int <= param2) {
                        break L3;
                      } else {
                        var10_int = param2;
                        break L3;
                      }
                    }
                    dk.a(((o) this).field_a, (int)(-((o) this).field_f + ((o) this).field_i), param1, param0, var10_int);
                    ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                    param2 = param2 - var10_int;
                    param0 = param0 + var10_int;
                    break L2;
                  }
                }
              }
              L4: {
                if ((((o) this).field_a.length ^ -1) <= (param2 ^ -1)) {
                  if (0 >= param2) {
                    break L4;
                  } else {
                    L5: {
                      this.a(-70);
                      var10_int = param2;
                      if (var10_int > ((o) this).field_j) {
                        var10_int = ((o) this).field_j;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    dk.a(((o) this).field_a, 0, param1, param0, var10_int);
                    param2 = param2 - var10_int;
                    ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                    param0 = param0 + var10_int;
                    break L4;
                  }
                } else {
                  ((o) this).field_d.a(-2, ((o) this).field_i);
                  ((o) this).field_h = ((o) this).field_i;
                  L6: while (true) {
                    if ((param2 ^ -1) >= -1) {
                      break L4;
                    } else {
                      var10_int = ((o) this).field_d.a(param2, param0, param1, 15389);
                      if (0 != (var10_int ^ -1)) {
                        param0 = param0 + var10_int;
                        ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                        param2 = param2 - var10_int;
                        ((o) this).field_h = ((o) this).field_h + (long)var10_int;
                        continue L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L7: {
                if (((o) this).field_e != -1L) {
                  L8: {
                    if (((o) this).field_i >= ((o) this).field_e) {
                      break L8;
                    } else {
                      if (-1 > (param2 ^ -1)) {
                        L9: {
                          var10_int = (int)(((o) this).field_e - ((o) this).field_i) + param0;
                          if ((param2 + param0 ^ -1) > (var10_int ^ -1)) {
                            var10_int = param2 + param0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var10_int <= param0) {
                            break L8;
                          } else {
                            param2--;
                            int incrementValue$1 = param0;
                            param0++;
                            param1[incrementValue$1] = (byte) 0;
                            ((o) this).field_i = ((o) this).field_i + 1L;
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
                      var10 = -1L;
                      var12 = -1L;
                      if (var5_long > ((o) this).field_e) {
                        break L12;
                      } else {
                        if ((((o) this).field_e ^ -1L) <= ((long)var9 + var5_long ^ -1L)) {
                          break L12;
                        } else {
                          var10 = ((o) this).field_e;
                          break L11;
                        }
                      }
                    }
                    if (var5_long < ((o) this).field_e) {
                      break L11;
                    } else {
                      if ((var5_long ^ -1L) <= (((o) this).field_e + (long)((o) this).field_b ^ -1L)) {
                        break L11;
                      } else {
                        var10 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if ((((o) this).field_e - -(long)((o) this).field_b ^ -1L) >= (var5_long ^ -1L)) {
                        break L14;
                      } else {
                        if (((o) this).field_e + (long)((o) this).field_b <= var5_long - -(long)var9) {
                          var12 = ((o) this).field_e - -(long)((o) this).field_b;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if ((long)var9 + var5_long <= ((o) this).field_e) {
                      break L13;
                    } else {
                      if ((long)((o) this).field_b + ((o) this).field_e < var5_long + (long)var9) {
                        break L13;
                      } else {
                        var12 = var5_long + (long)var9;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if ((var10 ^ -1L) >= 0L) {
                      break L15;
                    } else {
                      if (var10 >= var12) {
                        break L15;
                      } else {
                        var14 = (int)(-var10 + var12);
                        dk.a(((o) this).field_g, (int)(-((o) this).field_e + var10), param1, var7 - -(int)(var10 - var5_long), var14);
                        if (((o) this).field_i >= var12) {
                          break L15;
                        } else {
                          param2 = (int)((long)param2 - (-((o) this).field_i + var12));
                          ((o) this).field_i = var12;
                          break L15;
                        }
                      }
                    }
                  }
                  break L7;
                } else {
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((o) this).field_h = -1L;
          throw var5;
        }
        if ((param2 ^ -1) < -1) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        ((o) this).field_i = param1;
        if (param0) {
            o.b(116);
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 != -1) {
            field_c = null;
        }
        ((o) this).a(0, param1, param1.length, -78);
    }

    o(ue param0, int param1, int param2) throws IOException {
        ((o) this).field_e = -1L;
        ((o) this).field_f = -1L;
        ((o) this).field_b = 0;
        ((o) this).field_d = param0;
        long dupTemp$0 = param0.b((byte) 94);
        ((o) this).field_k = dupTemp$0;
        ((o) this).field_l = dupTemp$0;
        ((o) this).field_i = 0L;
        ((o) this).field_g = new byte[param2];
        ((o) this).field_a = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Your email address is used to identify this account";
    }
}

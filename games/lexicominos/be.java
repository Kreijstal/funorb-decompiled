/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    private long field_m;
    private long field_g;
    static String field_i;
    private int field_a;
    private ea field_n;
    private long field_h;
    private byte[] field_j;
    static db[] field_b;
    private int field_c;
    static sc field_q;
    private long field_o;
    private long field_e;
    private byte[] field_p;
    static db field_d;
    private long field_k;
    static int field_l;
    static byte[][] field_f;

    private final void b(int param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          var2 = -124 % ((param0 - -13) / 50);
          if (((be) this).field_g != -1L) {
            L1: {
              if (~((be) this).field_e == ~((be) this).field_g) {
                break L1;
              } else {
                ((be) this).field_n.a((byte) -55, ((be) this).field_g);
                ((be) this).field_e = ((be) this).field_g;
                break L1;
              }
            }
            L2: {
              ((be) this).field_n.a(1, 0, ((be) this).field_p, ((be) this).field_a);
              ((be) this).field_e = ((be) this).field_e + (long)((be) this).field_a;
              if (~((be) this).field_e < ~((be) this).field_m) {
                ((be) this).field_m = ((be) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if (~((be) this).field_k < ~((be) this).field_g) {
                  break L4;
                } else {
                  if (((be) this).field_g >= ((be) this).field_k - -(long)((be) this).field_c) {
                    break L4;
                  } else {
                    var3 = ((be) this).field_g;
                    break L3;
                  }
                }
              }
              if (~((be) this).field_k > ~((be) this).field_g) {
                break L3;
              } else {
                if (~((be) this).field_k > ~(((be) this).field_g + (long)((be) this).field_a)) {
                  var3 = ((be) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var5 = -1L;
                if (~(((be) this).field_g - -(long)((be) this).field_a) >= ~((be) this).field_k) {
                  break L6;
                } else {
                  if (~(((be) this).field_k - -(long)((be) this).field_c) <= ~((long)((be) this).field_a + ((be) this).field_g)) {
                    var5 = (long)((be) this).field_a + ((be) this).field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((be) this).field_g >= (long)((be) this).field_c + ((be) this).field_k) {
                break L5;
              } else {
                if (~((long)((be) this).field_c + ((be) this).field_k) >= ~(((be) this).field_g - -(long)((be) this).field_a)) {
                  var5 = (long)((be) this).field_c + ((be) this).field_k;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var3) {
                break L7;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  o.a(((be) this).field_p, (int)(var3 + -((be) this).field_g), ((be) this).field_j, (int)(-((be) this).field_k + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((be) this).field_a = 0;
            ((be) this).field_g = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 3 % ((-62 - param0) / 41);
        field_i = null;
        field_b = null;
        field_q = null;
        field_f = null;
        field_d = null;
    }

    final void c(int param0) throws IOException {
        this.b(126);
        ((be) this).field_n.a(true);
        if (param0 != 0) {
        }
    }

    private final void a() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          ((be) this).field_c = 0;
          if (~((be) this).field_h == ~((be) this).field_e) {
            break L0;
          } else {
            ((be) this).field_n.a((byte) -55, ((be) this).field_h);
            ((be) this).field_e = ((be) this).field_h;
            break L0;
          }
        }
        ((be) this).field_k = ((be) this).field_h;
        L1: while (true) {
          L2: {
            if (((be) this).field_c >= ((be) this).field_j.length) {
              break L2;
            } else {
              L3: {
                var2 = -((be) this).field_c + ((be) this).field_j.length;
                if (200000000 < var2) {
                  var2 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = ((be) this).field_n.a(var2, ((be) this).field_c, (byte) 116, ((be) this).field_j);
              if (-1 == var3) {
                break L2;
              } else {
                ((be) this).field_e = ((be) this).field_e + (long)var3;
                ((be) this).field_c = ((be) this).field_c + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
            throw new IOException();
        }
        if (param0 != 40) {
            return;
        }
        ((be) this).field_h = param1;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            ((be) this).a(param1, param0, param0.length, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "be.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long a(byte param0) {
        if (param0 != -122) {
            be.b((byte) 125);
        }
        return ((be) this).field_o;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1.length >= param0 + param2) {
              L1: {
                if (-1L == ((be) this).field_g) {
                  break L1;
                } else {
                  if (~((be) this).field_h > ~((be) this).field_g) {
                    break L1;
                  } else {
                    if (((be) this).field_h - -(long)param2 <= (long)((be) this).field_a + ((be) this).field_g) {
                      o.a(((be) this).field_p, (int)(-((be) this).field_g + ((be) this).field_h), param1, param0, param2);
                      ((be) this).field_h = ((be) this).field_h + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((be) this).field_h;
                var7 = param0;
                var8 = param2;
                if (((be) this).field_k > ((be) this).field_h) {
                  break L2;
                } else {
                  if (~((be) this).field_h > ~((long)((be) this).field_c + ((be) this).field_k)) {
                    L3: {
                      var9_int = (int)((long)((be) this).field_c - -((be) this).field_k - ((be) this).field_h);
                      if (var9_int > param2) {
                        var9_int = param2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    o.a(((be) this).field_j, (int)(-((be) this).field_k + ((be) this).field_h), param1, param0, var9_int);
                    param2 = param2 - var9_int;
                    ((be) this).field_h = ((be) this).field_h + (long)var9_int;
                    param0 = param0 + var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (((be) this).field_j.length < param2) {
                  ((be) this).field_n.a((byte) -55, ((be) this).field_h);
                  ((be) this).field_e = ((be) this).field_h;
                  L5: while (true) {
                    if (0 >= param2) {
                      break L4;
                    } else {
                      var9_int = ((be) this).field_n.a(param2, param0, (byte) -121, param1);
                      if (var9_int == -1) {
                        break L4;
                      } else {
                        param2 = param2 - var9_int;
                        ((be) this).field_e = ((be) this).field_e + (long)var9_int;
                        ((be) this).field_h = ((be) this).field_h + (long)var9_int;
                        param0 = param0 + var9_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param2 > 0) {
                    L6: {
                      int discarded$2 = -29960;
                      this.a();
                      var9_int = param2;
                      if (((be) this).field_c >= var9_int) {
                        break L6;
                      } else {
                        var9_int = ((be) this).field_c;
                        break L6;
                      }
                    }
                    o.a(((be) this).field_j, 0, param1, param0, var9_int);
                    param0 = param0 + var9_int;
                    ((be) this).field_h = ((be) this).field_h + (long)var9_int;
                    param2 = param2 - var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (((be) this).field_g != (long)param3) {
                  L8: {
                    if (((be) this).field_h >= ((be) this).field_g) {
                      break L8;
                    } else {
                      if (0 < param2) {
                        L9: {
                          var9_int = param0 - -(int)(-((be) this).field_h + ((be) this).field_g);
                          if (param2 + param0 < var9_int) {
                            var9_int = param2 + param0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var9_int <= param0) {
                            break L8;
                          } else {
                            param2--;
                            int incrementValue$3 = param0;
                            param0++;
                            param1[incrementValue$3] = (byte) 0;
                            ((be) this).field_h = ((be) this).field_h + 1L;
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
                      if (~((be) this).field_g > ~var5_long) {
                        break L12;
                      } else {
                        if (((be) this).field_g >= var5_long - -(long)var8) {
                          break L12;
                        } else {
                          var9 = ((be) this).field_g;
                          break L11;
                        }
                      }
                    }
                    if (var5_long < ((be) this).field_g) {
                      break L11;
                    } else {
                      if (~var5_long > ~(((be) this).field_g - -(long)((be) this).field_a)) {
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
                      if (~var5_long <= ~((long)((be) this).field_a + ((be) this).field_g)) {
                        break L14;
                      } else {
                        if (((be) this).field_g - -(long)((be) this).field_a > (long)var8 + var5_long) {
                          break L14;
                        } else {
                          var11 = ((be) this).field_g + (long)((be) this).field_a;
                          break L13;
                        }
                      }
                    }
                    if (~(var5_long + (long)var8) >= ~((be) this).field_g) {
                      break L13;
                    } else {
                      if (((be) this).field_g - -(long)((be) this).field_a >= (long)var8 + var5_long) {
                        var11 = (long)var8 + var5_long;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (-1L >= var9) {
                    break L7;
                  } else {
                    if (~var11 >= ~var9) {
                      break L7;
                    } else {
                      var13 = (int)(var11 - var9);
                      o.a(((be) this).field_p, (int)(-((be) this).field_g + var9), param1, (int)(var9 - var5_long) + var7, var13);
                      if (((be) this).field_h >= var11) {
                        break L7;
                      } else {
                        param2 = (int)((long)param2 - (-((be) this).field_h + var11));
                        ((be) this).field_h = var11;
                        break L7;
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              if (param2 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param2 + param0 + -param1.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((be) this).field_e = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("be.H(").append(param0).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L15;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L15;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~((be) this).field_o <= ~(((be) this).field_h - -(long)param2)) {
                break L1;
              } else {
                ((be) this).field_o = (long)param2 + ((be) this).field_h;
                break L1;
              }
            }
            L2: {
              if (param3 == -31593) {
                break L2;
              } else {
                be.b((byte) -7);
                break L2;
              }
            }
            L3: {
              if (((be) this).field_g == -1L) {
                break L3;
              } else {
                if (~((be) this).field_g >= ~((be) this).field_h) {
                  if (~(((be) this).field_g + (long)((be) this).field_a) <= ~((be) this).field_h) {
                    break L3;
                  } else {
                    this.b(65);
                    break L3;
                  }
                } else {
                  this.b(65);
                  break L3;
                }
              }
            }
            L4: {
              if (((be) this).field_g == -1L) {
                break L4;
              } else {
                if (~((long)param2 + ((be) this).field_h) >= ~((long)((be) this).field_p.length + ((be) this).field_g)) {
                  break L4;
                } else {
                  var5_int = (int)((long)((be) this).field_p.length + (((be) this).field_g + -((be) this).field_h));
                  o.a(param1, param0, ((be) this).field_p, (int)(-((be) this).field_g + ((be) this).field_h), var5_int);
                  param0 = param0 + var5_int;
                  ((be) this).field_h = ((be) this).field_h + (long)var5_int;
                  param2 = param2 - var5_int;
                  ((be) this).field_a = ((be) this).field_p.length;
                  this.b(93);
                  break L4;
                }
              }
            }
            if (((be) this).field_p.length >= param2) {
              if (param2 <= 0) {
                break L0;
              } else {
                L5: {
                  if (((be) this).field_g != -1L) {
                    break L5;
                  } else {
                    ((be) this).field_g = ((be) this).field_h;
                    break L5;
                  }
                }
                L6: {
                  o.a(param1, param0, ((be) this).field_p, (int)(-((be) this).field_g + ((be) this).field_h), param2);
                  ((be) this).field_h = ((be) this).field_h + (long)param2;
                  if (~(-((be) this).field_g + ((be) this).field_h) < ~(long)((be) this).field_a) {
                    ((be) this).field_a = (int)(-((be) this).field_g + ((be) this).field_h);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (~((be) this).field_h == ~((be) this).field_e) {
                  break L7;
                } else {
                  ((be) this).field_n.a((byte) -55, ((be) this).field_h);
                  ((be) this).field_e = ((be) this).field_h;
                  break L7;
                }
              }
              L8: {
                ((be) this).field_n.a(1, param0, param1, param2);
                ((be) this).field_e = ((be) this).field_e + (long)param2;
                if (((be) this).field_m < ((be) this).field_e) {
                  ((be) this).field_m = ((be) this).field_e;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((be) this).field_k > ((be) this).field_h) {
                    break L10;
                  } else {
                    if (~((be) this).field_h > ~(((be) this).field_k + (long)((be) this).field_c)) {
                      var5_long = ((be) this).field_h;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (~((be) this).field_k > ~((be) this).field_h) {
                  break L9;
                } else {
                  if (((be) this).field_h - -(long)param2 <= ((be) this).field_k) {
                    break L9;
                  } else {
                    var5_long = ((be) this).field_k;
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  if (~(((be) this).field_h - -(long)param2) >= ~((be) this).field_k) {
                    break L12;
                  } else {
                    if (~(((be) this).field_k - -(long)((be) this).field_c) <= ~(((be) this).field_h - -(long)param2)) {
                      var7 = (long)param2 + ((be) this).field_h;
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (~(((be) this).field_k - -(long)((be) this).field_c) >= ~((be) this).field_h) {
                  break L11;
                } else {
                  if ((long)((be) this).field_c + ((be) this).field_k <= (long)param2 + ((be) this).field_h) {
                    var7 = (long)((be) this).field_c + ((be) this).field_k;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L13: {
                if (var5_long <= -1L) {
                  break L13;
                } else {
                  if (~var7 < ~var5_long) {
                    var9 = (int)(var7 - var5_long);
                    o.a(param1, (int)(-((be) this).field_h + ((long)param0 + var5_long)), ((be) this).field_j, (int)(var5_long - ((be) this).field_k), var9);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              ((be) this).field_h = ((be) this).field_h + (long)param2;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((be) this).field_e = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("be.D(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L14;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    be(ea param0, int param1, int param2) throws IOException {
        ((be) this).field_a = 0;
        ((be) this).field_g = -1L;
        ((be) this).field_k = -1L;
        try {
            ((be) this).field_n = param0;
            long dupTemp$0 = param0.a(-45);
            ((be) this).field_m = dupTemp$0;
            ((be) this).field_o = dupTemp$0;
            ((be) this).field_h = 0L;
            ((be) this).field_j = new byte[param1];
            ((be) this).field_p = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Log in";
        field_q = new sc();
        field_d = new db(540, 140);
    }
}

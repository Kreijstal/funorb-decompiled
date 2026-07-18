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
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var14 = stellarshard.field_B;
        try {
          L0: {
            if (param0 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param2 + param0 - param3.length);
            } else {
              L1: {
                if (((pc) this).field_l == -1L) {
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
                    if (param0 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((pc) this).field_f.a(param0, param2, param3, 1);
                      if (var9_int != -1) {
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
                  if (((pc) this).field_l == -1L) {
                    break L7;
                  } else {
                    L8: {
                      if (((pc) this).field_l <= ((pc) this).field_c) {
                        break L8;
                      } else {
                        if (param0 <= 0) {
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
                          if (~(var5_long + (long)var8) >= ~((pc) this).field_l) {
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
                      if (~((pc) this).field_l <= ~(var5_long + (long)var8)) {
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
                    if (var9 <= -1L) {
                      break L7;
                    } else {
                      if (~var9 > ~var11) {
                        var13 = (int)(-var9 + var11);
                        ri.a(((pc) this).field_k, (int)(var9 + -((pc) this).field_l), param3, (int)(var9 - var5_long) + var7, var13);
                        if (~((pc) this).field_c <= ~var11) {
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
                if (param0 > 0) {
                  throw new EOFException();
                } else {
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
          ((pc) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("pc.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param3 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L15;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L15;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ')');
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
              if (~((pc) this).field_i == ~((pc) this).field_l) {
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
              if (~((pc) this).field_e > ~((pc) this).field_i) {
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
                if (~((pc) this).field_b < ~((pc) this).field_l) {
                  break L4;
                } else {
                  if (~((pc) this).field_l > ~((long)((pc) this).field_j + ((pc) this).field_b)) {
                    var2 = ((pc) this).field_l;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((pc) this).field_l < ~((pc) this).field_b) {
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
                  if (~(((pc) this).field_l - -(long)((pc) this).field_d) < ~(((pc) this).field_b - -(long)((pc) this).field_j)) {
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
                if (~((long)((pc) this).field_d + ((pc) this).field_l) > ~(((pc) this).field_b + (long)((pc) this).field_j)) {
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
                if (~var2 <= ~var4) {
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
        if (!(param0 >= 0L)) {
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
            if (var3 == -1) {
                break;
            }
            ((pc) this).field_i = ((pc) this).field_i + (long)var3;
            ((pc) this).field_j = ((pc) this).field_j + var3;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((pc) this).a(param1.length, (byte) -93, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ub a(int param0, pf param1, pf param2, byte param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        ub stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (tl.a(param2, (byte) -5, param0, param4)) {
              stackOut_5_0 = we.a(param1.a(param4, 16, param0), 1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ub) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("pc.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -39 + ',' + param4 + ')');
        }
        return stackIn_6_0;
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
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (~((long)param0 + ((pc) this).field_c) >= ~((pc) this).field_a) {
                break L1;
              } else {
                ((pc) this).field_a = ((pc) this).field_c + (long)param0;
                break L1;
              }
            }
            L2: {
              if (((pc) this).field_l == -1L) {
                break L2;
              } else {
                L3: {
                  if (((pc) this).field_l > ((pc) this).field_c) {
                    break L3;
                  } else {
                    if (~((pc) this).field_c < ~((long)((pc) this).field_d + ((pc) this).field_l)) {
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
              if (((pc) this).field_l == -1L) {
                break L4;
              } else {
                if (~((long)((pc) this).field_k.length + ((pc) this).field_l) > ~((long)param0 + ((pc) this).field_c)) {
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
              if (~param0 < param2) {
                L5: {
                  if (((pc) this).field_l == -1L) {
                    ((pc) this).field_l = ((pc) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  ri.a(param3, param1, ((pc) this).field_k, (int)(((pc) this).field_c + -((pc) this).field_l), param0);
                  ((pc) this).field_c = ((pc) this).field_c + (long)param0;
                  if (~(long)((pc) this).field_d <= ~(-((pc) this).field_l + ((pc) this).field_c)) {
                    break L6;
                  } else {
                    ((pc) this).field_d = (int)(((pc) this).field_c - ((pc) this).field_l);
                    break L6;
                  }
                }
                return;
              } else {
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
                if (~((pc) this).field_e > ~((pc) this).field_i) {
                  ((pc) this).field_e = ((pc) this).field_i;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  if (~((pc) this).field_c > ~((pc) this).field_b) {
                    break L10;
                  } else {
                    if (~((long)((pc) this).field_j + ((pc) this).field_b) < ~((pc) this).field_c) {
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
                  if (~((pc) this).field_b > ~(((pc) this).field_c + (long)param0)) {
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
                  if (~((pc) this).field_b <= ~((long)param0 + ((pc) this).field_c)) {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5_ref;
            stackOut_49_1 = new StringBuilder().append("pc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L14;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L14;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
    }

    pc(kb param0, int param1, int param2) throws IOException {
        ((pc) this).field_b = -1L;
        ((pc) this).field_l = -1L;
        ((pc) this).field_d = 0;
        try {
            ((pc) this).field_f = param0;
            long dupTemp$0 = param0.b(-106);
            ((pc) this).field_e = dupTemp$0;
            ((pc) this).field_a = dupTemp$0;
            ((pc) this).field_h = new byte[param1];
            ((pc) this).field_k = new byte[param2];
            ((pc) this).field_c = 0L;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 50;
    }
}

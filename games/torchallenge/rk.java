/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;

final class rk {
    private long field_i;
    static cf field_n;
    private int field_l;
    private long field_b;
    private long field_q;
    static int[] field_a;
    private long field_k;
    private byte[] field_r;
    private byte[] field_d;
    private nd field_j;
    private int field_f;
    private long field_m;
    private long field_o;
    static sl field_g;
    static String field_h;
    static int[] field_p;
    static boolean field_e;
    static String field_c;

    final long a(int param0) {
        int var2 = 25 % ((param0 - -62) / 44);
        return ((rk) this).field_m;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((rk) this).field_m >= ((rk) this).field_q - -(long)param3) {
                break L1;
              } else {
                ((rk) this).field_m = (long)param3 + ((rk) this).field_q;
                break L1;
              }
            }
            L2: {
              if (((rk) this).field_o == -1L) {
                break L2;
              } else {
                L3: {
                  if (~((rk) this).field_q > ~((rk) this).field_o) {
                    break L3;
                  } else {
                    if (((rk) this).field_q > ((rk) this).field_o - -(long)((rk) this).field_l) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(true);
                break L2;
              }
            }
            L4: {
              if (((rk) this).field_o == -1L) {
                break L4;
              } else {
                if ((long)param3 + ((rk) this).field_q > ((rk) this).field_o + (long)((rk) this).field_d.length) {
                  var5_int = (int)((long)((rk) this).field_d.length - -((rk) this).field_o - ((rk) this).field_q);
                  he.a(param2, param1, ((rk) this).field_d, (int)(-((rk) this).field_o + ((rk) this).field_q), var5_int);
                  ((rk) this).field_q = ((rk) this).field_q + (long)var5_int;
                  param3 = param3 - var5_int;
                  param1 = param1 + var5_int;
                  ((rk) this).field_l = ((rk) this).field_d.length;
                  this.a(true);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (((rk) this).field_d.length < param3) {
              L5: {
                if (~((rk) this).field_q == ~((rk) this).field_b) {
                  break L5;
                } else {
                  ((rk) this).field_j.a(((rk) this).field_q, false);
                  ((rk) this).field_b = ((rk) this).field_q;
                  break L5;
                }
              }
              L6: {
                ((rk) this).field_j.a(param2, param1, param3, (byte) -59);
                ((rk) this).field_b = ((rk) this).field_b + (long)param3;
                if (((rk) this).field_b <= ((rk) this).field_k) {
                  break L6;
                } else {
                  ((rk) this).field_k = ((rk) this).field_b;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (~((rk) this).field_q > ~((rk) this).field_i) {
                    break L8;
                  } else {
                    if (((rk) this).field_i + (long)((rk) this).field_f > ((rk) this).field_q) {
                      var5_long = ((rk) this).field_q;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (((rk) this).field_i < ((rk) this).field_q) {
                  break L7;
                } else {
                  if (~((rk) this).field_i > ~(((rk) this).field_q + (long)param3)) {
                    var5_long = ((rk) this).field_i;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (((rk) this).field_q - -(long)param3 <= ((rk) this).field_i) {
                    break L10;
                  } else {
                    if ((long)((rk) this).field_f + ((rk) this).field_i >= (long)param3 + ((rk) this).field_q) {
                      var7 = ((rk) this).field_q - -(long)param3;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((rk) this).field_q >= (long)((rk) this).field_f + ((rk) this).field_i) {
                  break L9;
                } else {
                  if ((long)param3 + ((rk) this).field_q < (long)((rk) this).field_f + ((rk) this).field_i) {
                    break L9;
                  } else {
                    var7 = ((rk) this).field_i + (long)((rk) this).field_f;
                    break L9;
                  }
                }
              }
              L11: {
                if (var5_long <= -1L) {
                  break L11;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(-var5_long + var7);
                    he.a(param2, (int)(var5_long + (long)param1 + -((rk) this).field_q), ((rk) this).field_r, (int)(var5_long + -((rk) this).field_i), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((rk) this).field_q = ((rk) this).field_q + (long)param3;
              return;
            } else {
              L12: {
                if (param0 == -4573) {
                  break L12;
                } else {
                  rk.b(false);
                  break L12;
                }
              }
              if (param3 <= 0) {
                break L0;
              } else {
                L13: {
                  if (((rk) this).field_o != -1L) {
                    break L13;
                  } else {
                    ((rk) this).field_o = ((rk) this).field_q;
                    break L13;
                  }
                }
                L14: {
                  he.a(param2, param1, ((rk) this).field_d, (int)(((rk) this).field_q + -((rk) this).field_o), param3);
                  ((rk) this).field_q = ((rk) this).field_q + (long)param3;
                  if (~(long)((rk) this).field_l <= ~(((rk) this).field_q - ((rk) this).field_o)) {
                    break L14;
                  } else {
                    ((rk) this).field_l = (int)(-((rk) this).field_o + ((rk) this).field_q);
                    break L14;
                  }
                }
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((rk) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5_ref;
            stackOut_50_1 = new StringBuilder().append("rk.G(").append(param0).append(',').append(param1).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L15;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_g = null;
        field_p = null;
        field_h = null;
        field_n = null;
        if (!param0) {
            field_n = null;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param3.length >= param1 + param0) {
              L1: {
                if (-1L == ((rk) this).field_o) {
                  break L1;
                } else {
                  if (((rk) this).field_o > ((rk) this).field_q) {
                    break L1;
                  } else {
                    if (~(((rk) this).field_o + (long)((rk) this).field_l) > ~(((rk) this).field_q + (long)param1)) {
                      break L1;
                    } else {
                      he.a(((rk) this).field_d, (int)(((rk) this).field_q + -((rk) this).field_o), param3, param0, param1);
                      ((rk) this).field_q = ((rk) this).field_q + (long)param1;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((rk) this).field_q;
                var7 = param0;
                var8 = param1;
                if (~((rk) this).field_q > ~((rk) this).field_i) {
                  break L2;
                } else {
                  if (((rk) this).field_q >= ((rk) this).field_i + (long)((rk) this).field_f) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)((long)((rk) this).field_f + -((rk) this).field_q + ((rk) this).field_i);
                      if (var9_int <= param1) {
                        break L3;
                      } else {
                        var9_int = param1;
                        break L3;
                      }
                    }
                    he.a(((rk) this).field_r, (int)(((rk) this).field_q - ((rk) this).field_i), param3, param0, var9_int);
                    param1 = param1 - var9_int;
                    ((rk) this).field_q = ((rk) this).field_q + (long)var9_int;
                    param0 = param0 + var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (((rk) this).field_r.length < param1) {
                  ((rk) this).field_j.a(((rk) this).field_q, false);
                  ((rk) this).field_b = ((rk) this).field_q;
                  L5: while (true) {
                    if (param1 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((rk) this).field_j.a(param0, param1, false, param3);
                      if (var9_int != -1) {
                        param1 = param1 - var9_int;
                        ((rk) this).field_b = ((rk) this).field_b + (long)var9_int;
                        ((rk) this).field_q = ((rk) this).field_q + (long)var9_int;
                        param0 = param0 + var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (param1 <= 0) {
                    break L4;
                  } else {
                    L6: {
                      this.b((byte) -127);
                      var9_int = param1;
                      if (((rk) this).field_f < var9_int) {
                        var9_int = ((rk) this).field_f;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    he.a(((rk) this).field_r, 0, param3, param0, var9_int);
                    param0 = param0 + var9_int;
                    ((rk) this).field_q = ((rk) this).field_q + (long)var9_int;
                    param1 = param1 - var9_int;
                    break L4;
                  }
                }
              }
              L7: {
                if (-1L == ((rk) this).field_o) {
                  break L7;
                } else {
                  L8: {
                    if (((rk) this).field_o <= ((rk) this).field_q) {
                      break L8;
                    } else {
                      if (param1 > 0) {
                        L9: {
                          var9_int = (int)(((rk) this).field_o - ((rk) this).field_q) + param0;
                          if (param1 + param0 < var9_int) {
                            var9_int = param1 + param0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param0 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$1 = param0;
                            param0++;
                            param3[incrementValue$1] = (byte) 0;
                            param1--;
                            ((rk) this).field_q = ((rk) this).field_q + 1L;
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
                      if (~((rk) this).field_o > ~var5_long) {
                        break L12;
                      } else {
                        if (~((rk) this).field_o <= ~(var5_long - -(long)var8)) {
                          break L12;
                        } else {
                          var9 = ((rk) this).field_o;
                          break L11;
                        }
                      }
                    }
                    if (var5_long < ((rk) this).field_o) {
                      break L11;
                    } else {
                      if ((long)((rk) this).field_l + ((rk) this).field_o <= var5_long) {
                        break L11;
                      } else {
                        var9 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (~var5_long <= ~(((rk) this).field_o - -(long)((rk) this).field_l)) {
                        break L14;
                      } else {
                        if (~(((rk) this).field_o + (long)((rk) this).field_l) < ~(var5_long - -(long)var8)) {
                          break L14;
                        } else {
                          var11 = (long)((rk) this).field_l + ((rk) this).field_o;
                          break L13;
                        }
                      }
                    }
                    if (((rk) this).field_o >= var5_long - -(long)var8) {
                      break L13;
                    } else {
                      if (~(var5_long + (long)var8) < ~(((rk) this).field_o - -(long)((rk) this).field_l)) {
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
                    if (var9 >= var11) {
                      break L7;
                    } else {
                      var13 = (int)(var11 + -var9);
                      he.a(((rk) this).field_d, (int)(var9 - ((rk) this).field_o), param3, (int)(-var5_long + var9) + var7, var13);
                      if (((rk) this).field_q < var11) {
                        param1 = (int)((long)param1 - (var11 - ((rk) this).field_q));
                        ((rk) this).field_q = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              L15: {
                if (param2 >= 5) {
                  break L15;
                } else {
                  break L15;
                }
              }
              if (0 < param1) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0 - (-param1 - -param3.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((rk) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("rk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param3 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L16;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L16;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 != 0) {
            return;
        }
        ((rk) this).field_q = param0;
    }

    final static int a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 5;
            var5 = 34 % ((param0 - -42) / 63);
            var4 = 0;
            L1: while (true) {
              if (6 <= var4) {
                stackOut_9_0 = var2_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var3) {
                    var4++;
                    continue L1;
                  } else {
                    L3: {
                      if ((1 << var6 & param1[var4]) <= 0) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("rk.I(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    private final void a(boolean param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (((rk) this).field_o != -1L) {
            L1: {
              if (~((rk) this).field_o == ~((rk) this).field_b) {
                break L1;
              } else {
                ((rk) this).field_j.a(((rk) this).field_o, false);
                ((rk) this).field_b = ((rk) this).field_o;
                break L1;
              }
            }
            L2: {
              ((rk) this).field_j.a(((rk) this).field_d, 0, ((rk) this).field_l, (byte) -59);
              ((rk) this).field_b = ((rk) this).field_b + (long)((rk) this).field_l;
              if (~((rk) this).field_b < ~((rk) this).field_k) {
                ((rk) this).field_k = ((rk) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (~((rk) this).field_i < ~((rk) this).field_o) {
                  break L4;
                } else {
                  if (~(((rk) this).field_i + (long)((rk) this).field_f) < ~((rk) this).field_o) {
                    var2 = ((rk) this).field_o;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((rk) this).field_i < ((rk) this).field_o) {
                break L3;
              } else {
                if ((long)((rk) this).field_l + ((rk) this).field_o > ((rk) this).field_i) {
                  var2 = ((rk) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((rk) this).field_o + (long)((rk) this).field_l <= ((rk) this).field_i) {
                  break L6;
                } else {
                  if (~((long)((rk) this).field_l + ((rk) this).field_o) < ~((long)((rk) this).field_f + ((rk) this).field_i)) {
                    break L6;
                  } else {
                    var4 = (long)((rk) this).field_l + ((rk) this).field_o;
                    break L5;
                  }
                }
              }
              if (~((long)((rk) this).field_f + ((rk) this).field_i) >= ~((rk) this).field_o) {
                break L5;
              } else {
                if (~(((rk) this).field_i + (long)((rk) this).field_f) >= ~(((rk) this).field_o + (long)((rk) this).field_l)) {
                  var4 = ((rk) this).field_i - -(long)((rk) this).field_f;
                  break L5;
                } else {
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
                  var6 = (int)(-var2 + var4);
                  he.a(((rk) this).field_d, (int)(-((rk) this).field_o + var2), ((rk) this).field_r, (int)(var2 - ((rk) this).field_i), var6);
                  break L7;
                }
              }
            }
            ((rk) this).field_l = 0;
            ((rk) this).field_o = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte param0) throws IOException {
        this.a(true);
        if (param0 != -57) {
            Object var3 = null;
            rk.a((byte) 19, (java.awt.Canvas) null);
        }
        ((rk) this).field_j.a((byte) 47);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              sd.a((byte) 69, (java.awt.Component) (Object) param1);
              kb.a((byte) -25, (java.awt.Component) (Object) param1);
              var2_int = 59 / ((24 - param0) / 36);
              if (ef.field_l == null) {
                break L1;
              } else {
                ef.field_l.a((byte) 118, (java.awt.Component) (Object) param1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("rk.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          ((rk) this).field_f = 0;
          var2 = -1;
          if (((rk) this).field_q != ((rk) this).field_b) {
            ((rk) this).field_j.a(((rk) this).field_q, false);
            ((rk) this).field_b = ((rk) this).field_q;
            break L0;
          } else {
            break L0;
          }
        }
        ((rk) this).field_i = ((rk) this).field_q;
        L1: while (true) {
          L2: {
            if (((rk) this).field_r.length <= ((rk) this).field_f) {
              break L2;
            } else {
              L3: {
                var3 = -((rk) this).field_f + ((rk) this).field_r.length;
                if (200000000 < var3) {
                  var3 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = ((rk) this).field_j.a(((rk) this).field_f, var3, false, ((rk) this).field_r);
              if (var4 == -1) {
                break L2;
              } else {
                ((rk) this).field_b = ((rk) this).field_b + (long)var4;
                ((rk) this).field_f = ((rk) this).field_f + var4;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((rk) this).a(0, param1.length, (byte) 125, param1);
              if (param0 <= -92) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            java.net.URL stackOut_41_0 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            var9 = TorChallenge.field_F ? 1 : 0;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int < 0) {
                        break L3;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if (param2 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param0 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param2 == null) {
                      break L7;
                    } else {
                      if (param2.length() < -1) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param2);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param0 == null) {
                      break L8;
                    } else {
                      if (-1 < param0.length()) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() <= var6) {
                      StringBuilder discarded$12 = var7.append('/');
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_39_0 = new java.net.URL(param4, var7.toString());
                      stackIn_40_0 = stackOut_39_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_41_0 = (java.net.URL) param4;
                    stackIn_42_0 = stackOut_41_0;
                    return stackIn_42_0;
                  }
                  return stackIn_40_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) var5;
                stackOut_43_1 = new StringBuilder().append("rk.K(");
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param0 == null) {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L11;
                } else {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L11;
                }
              }
              L12: {
                stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(-1).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param2 == null) {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L12;
                } else {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L12;
                }
              }
              L13: {
                stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(-1).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param4 == null) {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L13;
                } else {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L13;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rk(nd param0, int param1, int param2) throws IOException {
        ((rk) this).field_l = 0;
        ((rk) this).field_i = -1L;
        ((rk) this).field_o = -1L;
        try {
            ((rk) this).field_j = param0;
            long dupTemp$0 = param0.a(true);
            ((rk) this).field_k = dupTemp$0;
            ((rk) this).field_m = dupTemp$0;
            ((rk) this).field_d = new byte[param2];
            ((rk) this).field_q = 0L;
            ((rk) this).field_r = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{4, 8};
        field_n = new cf();
        field_e = true;
        field_c = "Email is valid";
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    private long field_c;
    private long field_b;
    private byte[] field_h;
    private long field_l;
    private long field_i;
    private long field_g;
    private qaa field_k;
    private int field_j;
    private int field_f;
    private long field_e;
    static ht field_d;
    private byte[] field_a;

    final static void a(byte param0) {
        if (gm.field_k) {
            dg.g(dg.field_f, dg.field_j, dg.field_h + -dg.field_f, -dg.field_j + dg.field_k);
            fo.field_a.a(false, 7802);
        }
        if (param0 != -50) {
            field_d = null;
        }
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
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if ((long)param3 + ((v) this).field_g > ((v) this).field_i) {
                ((v) this).field_i = ((v) this).field_g + (long)param3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1L == ((v) this).field_e) {
                break L2;
              } else {
                if (~((v) this).field_e >= ~((v) this).field_g) {
                  if (((v) this).field_g <= (long)((v) this).field_j + ((v) this).field_e) {
                    break L2;
                  } else {
                    this.b((byte) 50);
                    break L2;
                  }
                } else {
                  this.b((byte) 50);
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < -52) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((v) this).field_e == -1L) {
                break L4;
              } else {
                if (~(((v) this).field_e + (long)((v) this).field_a.length) <= ~(((v) this).field_g + (long)param3)) {
                  break L4;
                } else {
                  var5_int = (int)(-((v) this).field_g - -((v) this).field_e + (long)((v) this).field_a.length);
                  bl.a(param2, param1, ((v) this).field_a, (int)(-((v) this).field_e + ((v) this).field_g), var5_int);
                  param3 = param3 - var5_int;
                  ((v) this).field_g = ((v) this).field_g + (long)var5_int;
                  param1 = param1 + var5_int;
                  ((v) this).field_j = ((v) this).field_a.length;
                  this.b((byte) 50);
                  break L4;
                }
              }
            }
            if (param3 > ((v) this).field_a.length) {
              L5: {
                if (~((v) this).field_b == ~((v) this).field_g) {
                  break L5;
                } else {
                  ((v) this).field_k.a(((v) this).field_g, false);
                  ((v) this).field_b = ((v) this).field_g;
                  break L5;
                }
              }
              L6: {
                ((v) this).field_k.a(param1, param3, param2, (byte) 124);
                ((v) this).field_b = ((v) this).field_b + (long)param3;
                if (~((v) this).field_b >= ~((v) this).field_l) {
                  break L6;
                } else {
                  ((v) this).field_l = ((v) this).field_b;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (((v) this).field_c > ((v) this).field_g) {
                    break L8;
                  } else {
                    if (((v) this).field_g >= ((v) this).field_c + (long)((v) this).field_f) {
                      break L8;
                    } else {
                      var5_long = ((v) this).field_g;
                      break L7;
                    }
                  }
                }
                if (~((v) this).field_c > ~((v) this).field_g) {
                  break L7;
                } else {
                  if ((long)param3 + ((v) this).field_g > ((v) this).field_c) {
                    var5_long = ((v) this).field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (~(((v) this).field_g - -(long)param3) >= ~((v) this).field_c) {
                    break L10;
                  } else {
                    if (((v) this).field_c + (long)((v) this).field_f < ((v) this).field_g + (long)param3) {
                      break L10;
                    } else {
                      var7 = (long)param3 + ((v) this).field_g;
                      break L9;
                    }
                  }
                }
                if (~((v) this).field_g <= ~(((v) this).field_c - -(long)((v) this).field_f)) {
                  break L9;
                } else {
                  if ((long)param3 + ((v) this).field_g >= ((v) this).field_c - -(long)((v) this).field_f) {
                    var7 = (long)((v) this).field_f + ((v) this).field_c;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (-1L >= var5_long) {
                  break L11;
                } else {
                  if (~var7 < ~var5_long) {
                    var9 = (int)(var7 + -var5_long);
                    bl.a(param2, (int)((long)param1 + var5_long + -((v) this).field_g), ((v) this).field_h, (int)(var5_long + -((v) this).field_c), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((v) this).field_g = ((v) this).field_g + (long)param3;
              return;
            } else {
              if (0 >= param3) {
                break L0;
              } else {
                L12: {
                  if (((v) this).field_e != -1L) {
                    break L12;
                  } else {
                    ((v) this).field_e = ((v) this).field_g;
                    break L12;
                  }
                }
                L13: {
                  bl.a(param2, param1, ((v) this).field_a, (int)(((v) this).field_g - ((v) this).field_e), param3);
                  ((v) this).field_g = ((v) this).field_g + (long)param3;
                  if (~(((v) this).field_g + -((v) this).field_e) >= ~(long)((v) this).field_j) {
                    break L13;
                  } else {
                    ((v) this).field_j = (int)(((v) this).field_g + -((v) this).field_e);
                    break L13;
                  }
                }
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((v) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5_ref;
            stackOut_50_1 = new StringBuilder().append("v.C(").append(param0).append(',').append(param1).append(',');
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
              break L14;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param3 + ')');
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (((v) this).field_e == -1L) {
            break L0;
          } else {
            L1: {
              if (((v) this).field_b == ((v) this).field_e) {
                break L1;
              } else {
                ((v) this).field_k.a(((v) this).field_e, false);
                ((v) this).field_b = ((v) this).field_e;
                break L1;
              }
            }
            L2: {
              ((v) this).field_k.a(0, ((v) this).field_j, ((v) this).field_a, (byte) 115);
              ((v) this).field_b = ((v) this).field_b + (long)((v) this).field_j;
              if (((v) this).field_b <= ((v) this).field_l) {
                break L2;
              } else {
                ((v) this).field_l = ((v) this).field_b;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((v) this).field_c > ((v) this).field_e) {
                  break L4;
                } else {
                  if (~((v) this).field_e <= ~(((v) this).field_c - -(long)((v) this).field_f)) {
                    break L4;
                  } else {
                    var2 = ((v) this).field_e;
                    break L3;
                  }
                }
              }
              if (((v) this).field_e > ((v) this).field_c) {
                break L3;
              } else {
                if ((long)((v) this).field_j + ((v) this).field_e > ((v) this).field_c) {
                  var2 = ((v) this).field_c;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~((long)((v) this).field_j + ((v) this).field_e) >= ~((v) this).field_c) {
                  break L6;
                } else {
                  if (~((long)((v) this).field_j + ((v) this).field_e) >= ~(((v) this).field_c - -(long)((v) this).field_f)) {
                    var4 = (long)((v) this).field_j + ((v) this).field_e;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((v) this).field_e <= ~(((v) this).field_c + (long)((v) this).field_f)) {
                break L5;
              } else {
                if ((long)((v) this).field_j + ((v) this).field_e >= (long)((v) this).field_f + ((v) this).field_c) {
                  var4 = (long)((v) this).field_f + ((v) this).field_c;
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
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  bl.a(((v) this).field_a, (int)(var2 + -((v) this).field_e), ((v) this).field_h, (int)(var2 + -((v) this).field_c), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((v) this).field_e = -1L;
            ((v) this).field_j = 0;
            break L0;
          }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            int var3_int = -69 / ((80 - param0) / 40);
            ((v) this).a(param1.length, 0, -1, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "v.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -203) {
            field_d = null;
        }
        field_d = null;
    }

    final long b(int param0) {
        if (param0 != -1) {
            return 71L;
        }
        return ((v) this).field_i;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 == -1) {
            break L0;
          } else {
            v.a((byte) -81);
            break L0;
          }
        }
        L1: {
          ((v) this).field_f = 0;
          if (((v) this).field_b == ((v) this).field_g) {
            break L1;
          } else {
            ((v) this).field_k.a(((v) this).field_g, false);
            ((v) this).field_b = ((v) this).field_g;
            break L1;
          }
        }
        ((v) this).field_c = ((v) this).field_g;
        L2: while (true) {
          L3: {
            if (((v) this).field_h.length <= ((v) this).field_f) {
              break L3;
            } else {
              L4: {
                var2 = ((v) this).field_h.length - ((v) this).field_f;
                if (var2 <= 200000000) {
                  break L4;
                } else {
                  var2 = 200000000;
                  break L4;
                }
              }
              var3 = ((v) this).field_k.a(((v) this).field_h, var2, ((v) this).field_f, ~param0);
              if (-1 == var3) {
                break L3;
              } else {
                ((v) this).field_f = ((v) this).field_f + var3;
                ((v) this).field_b = ((v) this).field_b + (long)var3;
                continue L2;
              }
            }
          }
          return;
        }
    }

    final void d(int param0) throws IOException {
        int var2 = 108 / ((-72 - param0) / 38);
        this.b((byte) 50);
        ((v) this).field_k.a(true);
    }

    final void a(long param0, byte param1) throws IOException {
        if (param1 > -84) {
            v.a(-19);
        }
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        ((v) this).field_g = param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        Object var15 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            if (param3.length >= param0 + param1) {
              L1: {
                if (((v) this).field_e == -1L) {
                  break L1;
                } else {
                  if (~((v) this).field_e < ~((v) this).field_g) {
                    break L1;
                  } else {
                    if (~(((v) this).field_g - -(long)param0) >= ~(((v) this).field_e - -(long)((v) this).field_j)) {
                      bl.a(((v) this).field_a, (int)(-((v) this).field_e + ((v) this).field_g), param3, param1, param0);
                      ((v) this).field_g = ((v) this).field_g + (long)param0;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((v) this).field_g;
                if (param2 == -1) {
                  break L2;
                } else {
                  var15 = null;
                  v.a(-89, (byte) -81, -71, (lda) null, (lda) null, 78);
                  break L2;
                }
              }
              L3: {
                var7 = param1;
                var8 = param0;
                if (~((v) this).field_g > ~((v) this).field_c) {
                  break L3;
                } else {
                  if (((v) this).field_g < (long)((v) this).field_f + ((v) this).field_c) {
                    L4: {
                      var9_int = (int)(-((v) this).field_g + (((v) this).field_c + (long)((v) this).field_f));
                      if (var9_int <= param0) {
                        break L4;
                      } else {
                        var9_int = param0;
                        break L4;
                      }
                    }
                    bl.a(((v) this).field_h, (int)(((v) this).field_g - ((v) this).field_c), param3, param1, var9_int);
                    param0 = param0 - var9_int;
                    param1 = param1 + var9_int;
                    ((v) this).field_g = ((v) this).field_g + (long)var9_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (((v) this).field_h.length < param0) {
                  ((v) this).field_k.a(((v) this).field_g, false);
                  ((v) this).field_b = ((v) this).field_g;
                  L6: while (true) {
                    if (param0 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((v) this).field_k.a(param3, param0, param1, 0);
                      if (-1 == var9_int) {
                        break L5;
                      } else {
                        ((v) this).field_b = ((v) this).field_b + (long)var9_int;
                        ((v) this).field_g = ((v) this).field_g + (long)var9_int;
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        continue L6;
                      }
                    }
                  }
                } else {
                  if (param0 <= 0) {
                    break L5;
                  } else {
                    L7: {
                      this.c(param2);
                      var9_int = param0;
                      if (((v) this).field_f >= var9_int) {
                        break L7;
                      } else {
                        var9_int = ((v) this).field_f;
                        break L7;
                      }
                    }
                    bl.a(((v) this).field_h, 0, param3, param1, var9_int);
                    ((v) this).field_g = ((v) this).field_g + (long)var9_int;
                    param1 = param1 + var9_int;
                    param0 = param0 - var9_int;
                    break L5;
                  }
                }
              }
              L8: {
                if (((v) this).field_e == -1L) {
                  break L8;
                } else {
                  L9: {
                    if (~((v) this).field_e >= ~((v) this).field_g) {
                      break L9;
                    } else {
                      if (param0 <= 0) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = param1 + (int)(-((v) this).field_g + ((v) this).field_e);
                          if (param1 - -param0 < var9_int) {
                            var9_int = param0 + param1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (param1 >= var9_int) {
                            break L9;
                          } else {
                            int incrementValue$1 = param1;
                            param1++;
                            param3[incrementValue$1] = (byte) 0;
                            param0--;
                            ((v) this).field_g = ((v) this).field_g + 1L;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var9 = -1L;
                      if (var5_long > ((v) this).field_e) {
                        break L13;
                      } else {
                        if (~((long)var8 + var5_long) >= ~((v) this).field_e) {
                          break L13;
                        } else {
                          var9 = ((v) this).field_e;
                          break L12;
                        }
                      }
                    }
                    if (~var5_long > ~((v) this).field_e) {
                      break L12;
                    } else {
                      if (~var5_long > ~(((v) this).field_e - -(long)((v) this).field_j)) {
                        var9 = var5_long;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      var11 = -1L;
                      if (((v) this).field_e - -(long)((v) this).field_j <= var5_long) {
                        break L15;
                      } else {
                        if ((long)var8 + var5_long >= ((v) this).field_e - -(long)((v) this).field_j) {
                          var11 = (long)((v) this).field_j + ((v) this).field_e;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if ((long)var8 + var5_long <= ((v) this).field_e) {
                      break L14;
                    } else {
                      if (~(var5_long + (long)var8) < ~(((v) this).field_e + (long)((v) this).field_j)) {
                        break L14;
                      } else {
                        var11 = var5_long + (long)var8;
                        break L14;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L8;
                  } else {
                    if (var11 > var9) {
                      var13 = (int)(-var9 + var11);
                      bl.a(((v) this).field_a, (int)(var9 - ((v) this).field_e), param3, (int)(-var5_long + var9) + var7, var13);
                      if (((v) this).field_g < var11) {
                        param0 = (int)((long)param0 - (var11 - ((v) this).field_g));
                        ((v) this).field_g = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
              }
              if (0 >= param0) {
                break L0;
              } else {
                throw new EOFException();
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param0 + param1));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((v) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5_ref;
            stackOut_59_1 = new StringBuilder().append("v.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param3 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L16;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, lda param3, lda param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              hna.field_k = param2;
              pba.field_r = param5;
              aka.field_x = param3;
              raa.field_J = param0;
              nj.field_j = param4;
              if (param1 > 19) {
                break L1;
              } else {
                v.a(-48);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("v.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param5 + ')');
        }
    }

    v(qaa param0, int param1, int param2) throws IOException {
        ((v) this).field_c = -1L;
        ((v) this).field_e = -1L;
        ((v) this).field_j = 0;
        try {
            ((v) this).field_k = param0;
            long dupTemp$0 = param0.a((byte) 24);
            ((v) this).field_l = dupTemp$0;
            ((v) this).field_i = dupTemp$0;
            ((v) this).field_a = new byte[param2];
            ((v) this).field_g = 0L;
            ((v) this).field_h = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}

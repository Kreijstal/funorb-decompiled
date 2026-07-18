/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class of {
    private long field_m;
    static ja[] field_e;
    private long field_j;
    private byte[] field_i;
    private long field_b;
    private int field_n;
    private long field_c;
    private mc field_o;
    static ja field_k;
    private int field_a;
    static ma field_d;
    private long field_h;
    private byte[] field_f;
    static String field_p;
    static int field_g;
    private long field_l;

    final void a(long param0, byte param1) throws IOException {
        Object var5 = null;
        L0: {
          if (param1 == -70) {
            break L0;
          } else {
            var5 = null;
            of.a(-66, (java.awt.Component) null);
            break L0;
          }
        }
        if (param0 < 0L) {
          throw new IOException();
        } else {
          ((of) this).field_h = param0;
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2.length >= param0 + param1) {
              L1: {
                if (-1L == ((of) this).field_m) {
                  break L1;
                } else {
                  if (~((of) this).field_m < ~((of) this).field_h) {
                    break L1;
                  } else {
                    if (((of) this).field_h - -(long)param0 > (long)((of) this).field_a + ((of) this).field_m) {
                      break L1;
                    } else {
                      d.a(((of) this).field_f, (int)(((of) this).field_h - ((of) this).field_m), param2, param1, param0);
                      ((of) this).field_h = ((of) this).field_h + (long)param0;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_int = -124 / ((param3 - -37) / 57);
                var6 = ((of) this).field_h;
                var8 = param1;
                var9 = param0;
                if (~((of) this).field_h > ~((of) this).field_l) {
                  break L2;
                } else {
                  if (~(((of) this).field_l + (long)((of) this).field_n) < ~((of) this).field_h) {
                    L3: {
                      var10_int = (int)(-((of) this).field_h + (((of) this).field_l + (long)((of) this).field_n));
                      if (param0 < var10_int) {
                        var10_int = param0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    d.a(((of) this).field_i, (int)(-((of) this).field_l + ((of) this).field_h), param2, param1, var10_int);
                    ((of) this).field_h = ((of) this).field_h + (long)var10_int;
                    param1 = param1 + var10_int;
                    param0 = param0 - var10_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (((of) this).field_i.length < param0) {
                  ((of) this).field_o.a((byte) -127, ((of) this).field_h);
                  ((of) this).field_c = ((of) this).field_h;
                  L5: while (true) {
                    if (param0 <= 0) {
                      break L4;
                    } else {
                      var10_int = ((of) this).field_o.a(param0, param2, -1, param1);
                      if (var10_int == -1) {
                        break L4;
                      } else {
                        param0 = param0 - var10_int;
                        ((of) this).field_h = ((of) this).field_h + (long)var10_int;
                        ((of) this).field_c = ((of) this).field_c + (long)var10_int;
                        param1 = param1 + var10_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (0 < param0) {
                    L6: {
                      int discarded$2 = -8855;
                      this.b();
                      var10_int = param0;
                      if (var10_int <= ((of) this).field_n) {
                        break L6;
                      } else {
                        var10_int = ((of) this).field_n;
                        break L6;
                      }
                    }
                    d.a(((of) this).field_i, 0, param2, param1, var10_int);
                    param0 = param0 - var10_int;
                    param1 = param1 + var10_int;
                    ((of) this).field_h = ((of) this).field_h + (long)var10_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (((of) this).field_m != -1L) {
                  L8: {
                    if (~((of) this).field_m >= ~((of) this).field_h) {
                      break L8;
                    } else {
                      if (param0 > 0) {
                        L9: {
                          var10_int = param1 + (int)(-((of) this).field_h + ((of) this).field_m);
                          if (param1 + param0 >= var10_int) {
                            break L9;
                          } else {
                            var10_int = param1 + param0;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var10_int <= param1) {
                            break L8;
                          } else {
                            param0--;
                            int incrementValue$3 = param1;
                            param1++;
                            param2[incrementValue$3] = (byte) 0;
                            ((of) this).field_h = ((of) this).field_h + 1L;
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
                      if (~var6 < ~((of) this).field_m) {
                        break L12;
                      } else {
                        if (((of) this).field_m < var6 + (long)var9) {
                          var10 = ((of) this).field_m;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~var6 > ~((of) this).field_m) {
                      break L11;
                    } else {
                      if (~((long)((of) this).field_a + ((of) this).field_m) < ~var6) {
                        var10 = var6;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var12 = -1L;
                      if (~var6 <= ~(((of) this).field_m - -(long)((of) this).field_a)) {
                        break L14;
                      } else {
                        if ((long)var9 + var6 < (long)((of) this).field_a + ((of) this).field_m) {
                          break L14;
                        } else {
                          var12 = (long)((of) this).field_a + ((of) this).field_m;
                          break L13;
                        }
                      }
                    }
                    if (~((of) this).field_m <= ~(var6 + (long)var9)) {
                      break L13;
                    } else {
                      if (~((long)((of) this).field_a + ((of) this).field_m) <= ~(var6 + (long)var9)) {
                        var12 = var6 + (long)var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (-1L >= var10) {
                    break L7;
                  } else {
                    if (var12 > var10) {
                      var14 = (int)(-var10 + var12);
                      d.a(((of) this).field_f, (int)(-((of) this).field_m + var10), param2, (int)(-var6 + var10) + var8, var14);
                      if (((of) this).field_h < var12) {
                        param0 = (int)((long)param0 - (var12 - ((of) this).field_h));
                        ((of) this).field_h = var12;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              if (param0 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1 - (-param0 + param2.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((of) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("of.L(").append(param0).append(',').append(param1).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param3 + ')');
        }
    }

    final static void b(byte param0) {
        we.field_k = new th();
        if (param0 < 97) {
            Object var2 = null;
            of.a(116, (java.awt.Component) null);
        }
    }

    final void a(byte param0) throws IOException {
        int discarded$0 = -23;
        this.c();
        ((of) this).field_o.b((byte) 38);
        if (param0 >= -84) {
            of.a(-119);
        }
    }

    private final void c() throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((of) this).field_m == -1L) {
            break L0;
          } else {
            L1: {
              if (~((of) this).field_c == ~((of) this).field_m) {
                break L1;
              } else {
                ((of) this).field_o.a((byte) -127, ((of) this).field_m);
                ((of) this).field_c = ((of) this).field_m;
                break L1;
              }
            }
            L2: {
              ((of) this).field_o.a((byte) 74, 0, ((of) this).field_a, ((of) this).field_f);
              ((of) this).field_c = ((of) this).field_c + (long)((of) this).field_a;
              if (~((of) this).field_c < ~((of) this).field_b) {
                ((of) this).field_b = ((of) this).field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (~((of) this).field_m > ~((of) this).field_l) {
                  break L4;
                } else {
                  if (~((of) this).field_m > ~((long)((of) this).field_n + ((of) this).field_l)) {
                    var2 = ((of) this).field_m;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((of) this).field_l < ((of) this).field_m) {
                break L3;
              } else {
                if (~((long)((of) this).field_a + ((of) this).field_m) >= ~((of) this).field_l) {
                  break L3;
                } else {
                  var2 = ((of) this).field_l;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~((of) this).field_l <= ~((long)((of) this).field_a + ((of) this).field_m)) {
                  break L6;
                } else {
                  if ((long)((of) this).field_n + ((of) this).field_l >= ((of) this).field_m - -(long)((of) this).field_a) {
                    var4 = ((of) this).field_m - -(long)((of) this).field_a;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((of) this).field_l + (long)((of) this).field_n <= ((of) this).field_m) {
                break L5;
              } else {
                if (((of) this).field_m - -(long)((of) this).field_a >= ((of) this).field_l + (long)((of) this).field_n) {
                  var4 = ((of) this).field_l - -(long)((of) this).field_n;
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
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  d.a(((of) this).field_f, (int)(-((of) this).field_m + var2), ((of) this).field_i, (int)(-((of) this).field_l + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((of) this).field_a = 0;
            ((of) this).field_m = -1L;
            break L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((of) this).field_j < ((of) this).field_h - -(long)param1) {
                ((of) this).field_j = ((of) this).field_h + (long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((of) this).field_m == -1L) {
                break L2;
              } else {
                L3: {
                  if (((of) this).field_m > ((of) this).field_h) {
                    break L3;
                  } else {
                    if (~((of) this).field_h >= ~((long)((of) this).field_a + ((of) this).field_m)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                int discarded$2 = -23;
                this.c();
                break L2;
              }
            }
            L4: {
              if (((of) this).field_m == (long)param0) {
                break L4;
              } else {
                if (((of) this).field_h - -(long)param1 > (long)((of) this).field_f.length + ((of) this).field_m) {
                  var5_int = (int)(-((of) this).field_h + (((of) this).field_m + (long)((of) this).field_f.length));
                  d.a(param3, param2, ((of) this).field_f, (int)(((of) this).field_h + -((of) this).field_m), var5_int);
                  param2 = param2 + var5_int;
                  param1 = param1 - var5_int;
                  ((of) this).field_h = ((of) this).field_h + (long)var5_int;
                  ((of) this).field_a = ((of) this).field_f.length;
                  int discarded$3 = -23;
                  this.c();
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param1 > ((of) this).field_f.length) {
              L5: {
                if (~((of) this).field_h == ~((of) this).field_c) {
                  break L5;
                } else {
                  ((of) this).field_o.a((byte) -126, ((of) this).field_h);
                  ((of) this).field_c = ((of) this).field_h;
                  break L5;
                }
              }
              L6: {
                ((of) this).field_o.a((byte) 110, param2, param1, param3);
                ((of) this).field_c = ((of) this).field_c + (long)param1;
                if (((of) this).field_b < ((of) this).field_c) {
                  ((of) this).field_b = ((of) this).field_c;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (~((of) this).field_l < ~((of) this).field_h) {
                    break L8;
                  } else {
                    if (((of) this).field_h >= ((of) this).field_l + (long)((of) this).field_n) {
                      break L8;
                    } else {
                      var5_long = ((of) this).field_h;
                      break L7;
                    }
                  }
                }
                if (((of) this).field_h > ((of) this).field_l) {
                  break L7;
                } else {
                  if (((of) this).field_l < (long)param1 + ((of) this).field_h) {
                    var5_long = ((of) this).field_l;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (((of) this).field_l >= (long)param1 + ((of) this).field_h) {
                    break L10;
                  } else {
                    if (~(((of) this).field_l - -(long)((of) this).field_n) <= ~(((of) this).field_h - -(long)param1)) {
                      var7 = (long)param1 + ((of) this).field_h;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((of) this).field_h >= ((of) this).field_l - -(long)((of) this).field_n) {
                  break L9;
                } else {
                  if (((of) this).field_l - -(long)((of) this).field_n <= ((of) this).field_h + (long)param1) {
                    var7 = ((of) this).field_l - -(long)((of) this).field_n;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (var5_long <= -1L) {
                  break L11;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(var7 + -var5_long);
                    d.a(param3, (int)(-((of) this).field_h + (var5_long + (long)param2)), ((of) this).field_i, (int)(-((of) this).field_l + var5_long), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((of) this).field_h = ((of) this).field_h + (long)param1;
              return;
            } else {
              if (0 < param1) {
                L12: {
                  if (((of) this).field_m != -1L) {
                    break L12;
                  } else {
                    ((of) this).field_m = ((of) this).field_h;
                    break L12;
                  }
                }
                L13: {
                  d.a(param3, param2, ((of) this).field_f, (int)(((of) this).field_h - ((of) this).field_m), param1);
                  ((of) this).field_h = ((of) this).field_h + (long)param1;
                  if ((long)((of) this).field_a >= -((of) this).field_m + ((of) this).field_h) {
                    break L13;
                  } else {
                    ((of) this).field_a = (int)(((of) this).field_h - ((of) this).field_m);
                    break L13;
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((of) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("of.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            ((of) this).a(param0.length, 0, param0, -117);
            int var3_int = -85 % ((70 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "of.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          ((of) this).field_n = 0;
          if (~((of) this).field_h == ~((of) this).field_c) {
            break L0;
          } else {
            ((of) this).field_o.a((byte) -128, ((of) this).field_h);
            ((of) this).field_c = ((of) this).field_h;
            break L0;
          }
        }
        ((of) this).field_l = ((of) this).field_h;
        L1: while (true) {
          L2: {
            if (((of) this).field_n >= ((of) this).field_i.length) {
              break L2;
            } else {
              L3: {
                var2 = -((of) this).field_n + ((of) this).field_i.length;
                if (var2 > 200000000) {
                  var2 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = ((of) this).field_o.a(var2, ((of) this).field_i, -1, ((of) this).field_n);
              if (-1 == var3) {
                break L2;
              } else {
                ((of) this).field_c = ((of) this).field_c + (long)var3;
                ((of) this).field_n = ((of) this).field_n + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_g = 68;
        }
        field_k = null;
        field_p = null;
        field_d = null;
        field_e = null;
    }

    final long c(int param0) {
        if (param0 != -1) {
            ((of) this).field_j = -25L;
        }
        return ((of) this).field_j;
    }

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
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
              param1.removeMouseListener((java.awt.event.MouseListener) (Object) on.field_Z);
              param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) on.field_Z);
              param1.removeFocusListener((java.awt.event.FocusListener) (Object) on.field_Z);
              hh.field_e = 0;
              if (param0 == -1693) {
                break L1;
              } else {
                field_e = null;
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
            stackOut_3_1 = new StringBuilder().append("of.E(").append(param0).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    of(mc param0, int param1, int param2) throws IOException {
        ((of) this).field_m = -1L;
        ((of) this).field_a = 0;
        ((of) this).field_l = -1L;
        try {
            ((of) this).field_o = param0;
            long dupTemp$0 = param0.a(-111);
            ((of) this).field_b = dupTemp$0;
            ((of) this).field_j = dupTemp$0;
            ((of) this).field_f = new byte[param2];
            ((of) this).field_i = new byte[param1];
            ((of) this).field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static gh d(int param0) {
        if (mp.field_b != id.field_B) {
          if (param0 == 0) {
            if (oi.field_j != id.field_B) {
              return null;
            } else {
              id.field_B = mp.field_b;
              return iq.field_c;
            }
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ja[5];
        field_p = "Friends";
        field_d = new ma();
    }
}

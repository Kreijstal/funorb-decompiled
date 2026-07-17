/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gdb {
    static asb field_i;
    static String field_d;
    private byte[] field_h;
    private long field_a;
    private int field_j;
    private long field_c;
    private byte[] field_f;
    private long field_e;
    private au field_m;
    private long field_b;
    private long field_g;
    private long field_k;
    private int field_l;

    final void a(int param0, byte[] param1) throws IOException {
        try {
            if (param0 >= -80) {
            }
            ((gdb) this).a(param1, param1.length, 0, -30541);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gdb.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final long b(int param0) {
        if (param0 != 0) {
            ((gdb) this).field_m = null;
        }
        return ((gdb) this).field_b;
    }

    public static void a() {
        field_i = null;
        field_d = null;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 == -200000001) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((gdb) this).field_l = 0;
          if (((gdb) this).field_a == ((gdb) this).field_c) {
            break L1;
          } else {
            ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_a);
            ((gdb) this).field_c = ((gdb) this).field_a;
            break L1;
          }
        }
        ((gdb) this).field_e = ((gdb) this).field_a;
        L2: while (true) {
          L3: {
            if (((gdb) this).field_h.length <= ((gdb) this).field_l) {
              break L3;
            } else {
              L4: {
                var2 = -((gdb) this).field_l + ((gdb) this).field_h.length;
                if (var2 <= 200000000) {
                  break L4;
                } else {
                  var2 = 200000000;
                  break L4;
                }
              }
              var3 = ((gdb) this).field_m.a((byte) -60, var2, ((gdb) this).field_h, ((gdb) this).field_l);
              if (var3 == -1) {
                break L3;
              } else {
                ((gdb) this).field_l = ((gdb) this).field_l + var3;
                ((gdb) this).field_c = ((gdb) this).field_c + (long)var3;
                continue L2;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          L0: {
            ((gdb) this).field_a = param1;
            if (param0 == 0) {
              break L0;
            } else {
              ((gdb) this).field_a = 43L;
              break L0;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if ((long)param0 + ((gdb) this).field_a > ((gdb) this).field_b) {
                ((gdb) this).field_b = ((gdb) this).field_a - -(long)param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 <= -66) {
                break L2;
              } else {
                gdb.b(34, -32L);
                break L2;
              }
            }
            L3: {
              if (-1L == ((gdb) this).field_g) {
                break L3;
              } else {
                if (~((gdb) this).field_g >= ~((gdb) this).field_a) {
                  if (~((gdb) this).field_a >= ~((long)((gdb) this).field_j + ((gdb) this).field_g)) {
                    break L3;
                  } else {
                    this.a((byte) -123);
                    break L3;
                  }
                } else {
                  this.a((byte) -123);
                  break L3;
                }
              }
            }
            L4: {
              if (((gdb) this).field_g == -1L) {
                break L4;
              } else {
                if (~(((gdb) this).field_a + (long)param0) >= ~(((gdb) this).field_g + (long)((gdb) this).field_f.length)) {
                  break L4;
                } else {
                  var5_int = (int)((long)((gdb) this).field_f.length + -((gdb) this).field_a + ((gdb) this).field_g);
                  cua.a(param3, param1, ((gdb) this).field_f, (int)(((gdb) this).field_a + -((gdb) this).field_g), var5_int);
                  ((gdb) this).field_a = ((gdb) this).field_a + (long)var5_int;
                  param0 = param0 - var5_int;
                  param1 = param1 + var5_int;
                  ((gdb) this).field_j = ((gdb) this).field_f.length;
                  this.a((byte) -120);
                  break L4;
                }
              }
            }
            if (param0 <= ((gdb) this).field_f.length) {
              if (param0 <= 0) {
                break L0;
              } else {
                L5: {
                  if (-1L != ((gdb) this).field_g) {
                    break L5;
                  } else {
                    ((gdb) this).field_g = ((gdb) this).field_a;
                    break L5;
                  }
                }
                L6: {
                  cua.a(param3, param1, ((gdb) this).field_f, (int)(-((gdb) this).field_g + ((gdb) this).field_a), param0);
                  ((gdb) this).field_a = ((gdb) this).field_a + (long)param0;
                  if (~(long)((gdb) this).field_j > ~(((gdb) this).field_a - ((gdb) this).field_g)) {
                    ((gdb) this).field_j = (int)(((gdb) this).field_a - ((gdb) this).field_g);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (((gdb) this).field_a == ((gdb) this).field_c) {
                  break L7;
                } else {
                  ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_a);
                  ((gdb) this).field_c = ((gdb) this).field_a;
                  break L7;
                }
              }
              L8: {
                ((gdb) this).field_m.a(param0, -14394, param3, param1);
                ((gdb) this).field_c = ((gdb) this).field_c + (long)param0;
                if (~((gdb) this).field_k <= ~((gdb) this).field_c) {
                  break L8;
                } else {
                  ((gdb) this).field_k = ((gdb) this).field_c;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((gdb) this).field_e > ((gdb) this).field_a) {
                    break L10;
                  } else {
                    if ((long)((gdb) this).field_l + ((gdb) this).field_e > ((gdb) this).field_a) {
                      var5_long = ((gdb) this).field_a;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (~((gdb) this).field_a < ~((gdb) this).field_e) {
                  break L9;
                } else {
                  if (~((gdb) this).field_e > ~(((gdb) this).field_a + (long)param0)) {
                    var5_long = ((gdb) this).field_e;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  if ((long)param0 + ((gdb) this).field_a <= ((gdb) this).field_e) {
                    break L12;
                  } else {
                    if (((gdb) this).field_a - -(long)param0 <= ((gdb) this).field_e - -(long)((gdb) this).field_l) {
                      var7 = ((gdb) this).field_a - -(long)param0;
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (~((gdb) this).field_a <= ~(((gdb) this).field_e + (long)((gdb) this).field_l)) {
                  break L11;
                } else {
                  if (~(((gdb) this).field_e - -(long)((gdb) this).field_l) < ~(((gdb) this).field_a + (long)param0)) {
                    break L11;
                  } else {
                    var7 = (long)((gdb) this).field_l + ((gdb) this).field_e;
                    break L11;
                  }
                }
              }
              L13: {
                if (var5_long <= -1L) {
                  break L13;
                } else {
                  if (var7 <= var5_long) {
                    break L13;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    cua.a(param3, (int)(var5_long + (long)param1 + -((gdb) this).field_a), ((gdb) this).field_h, (int)(var5_long + -((gdb) this).field_e), var9);
                    break L13;
                  }
                }
              }
              ((gdb) this).field_a = ((gdb) this).field_a + (long)param0;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((gdb) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5_ref;
            stackOut_50_1 = new StringBuilder().append("gdb.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    final void a(boolean param0) throws IOException {
        this.a((byte) -123);
        if (!param0) {
            gdb.b(-67, 17L);
        }
        ((gdb) this).field_m.a(false);
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param0 <= -51) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          if (-1L == ((gdb) this).field_g) {
            break L1;
          } else {
            L2: {
              if (~((gdb) this).field_g == ~((gdb) this).field_c) {
                break L2;
              } else {
                ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_g);
                ((gdb) this).field_c = ((gdb) this).field_g;
                break L2;
              }
            }
            L3: {
              ((gdb) this).field_m.a(((gdb) this).field_j, -14394, ((gdb) this).field_f, 0);
              ((gdb) this).field_c = ((gdb) this).field_c + (long)((gdb) this).field_j;
              if (((gdb) this).field_k >= ((gdb) this).field_c) {
                break L3;
              } else {
                ((gdb) this).field_k = ((gdb) this).field_c;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (((gdb) this).field_g < ((gdb) this).field_e) {
                  break L5;
                } else {
                  if (((gdb) this).field_g < (long)((gdb) this).field_l + ((gdb) this).field_e) {
                    var2 = ((gdb) this).field_g;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (~((gdb) this).field_e > ~((gdb) this).field_g) {
                break L4;
              } else {
                if (~((gdb) this).field_e > ~(((gdb) this).field_g - -(long)((gdb) this).field_j)) {
                  var2 = ((gdb) this).field_e;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((gdb) this).field_g + (long)((gdb) this).field_j <= ((gdb) this).field_e) {
                  break L7;
                } else {
                  if (~((long)((gdb) this).field_l + ((gdb) this).field_e) > ~((long)((gdb) this).field_j + ((gdb) this).field_g)) {
                    break L7;
                  } else {
                    var4 = ((gdb) this).field_g - -(long)((gdb) this).field_j;
                    break L6;
                  }
                }
              }
              if (((gdb) this).field_g >= (long)((gdb) this).field_l + ((gdb) this).field_e) {
                break L6;
              } else {
                if (~((long)((gdb) this).field_l + ((gdb) this).field_e) < ~(((gdb) this).field_g + (long)((gdb) this).field_j)) {
                  break L6;
                } else {
                  var4 = (long)((gdb) this).field_l + ((gdb) this).field_e;
                  break L6;
                }
              }
            }
            L8: {
              if (var2 <= -1L) {
                break L8;
              } else {
                if (var4 <= var2) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  cua.a(((gdb) this).field_f, (int)(-((gdb) this).field_g + var2), ((gdb) this).field_h, (int)(-((gdb) this).field_e + var2), var6);
                  break L8;
                }
              }
            }
            ((gdb) this).field_j = 0;
            ((gdb) this).field_g = -1L;
            break L1;
          }
        }
    }

    final static void b(int param0, long param1) {
        int var3 = -66 / ((param0 - -8) / 38);
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L == 0L) {
            hg.a((byte) 90, -1L + param1);
            hg.a((byte) 90, 1L);
        } else {
            hg.a((byte) 90, param1);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var14 = VoidHunters.field_G;
        try {
          L0: {
            if (param0.length >= param2 - -param1) {
              L1: {
                if (-1L == ((gdb) this).field_g) {
                  break L1;
                } else {
                  if (~((gdb) this).field_a > ~((gdb) this).field_g) {
                    break L1;
                  } else {
                    if (~((long)((gdb) this).field_j + ((gdb) this).field_g) <= ~(((gdb) this).field_a - -(long)param1)) {
                      cua.a(((gdb) this).field_f, (int)(((gdb) this).field_a + -((gdb) this).field_g), param0, param2, param1);
                      ((gdb) this).field_a = ((gdb) this).field_a + (long)param1;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((gdb) this).field_a;
                var7 = param2;
                var8 = param1;
                if (~((gdb) this).field_e < ~((gdb) this).field_a) {
                  break L2;
                } else {
                  if ((long)((gdb) this).field_l + ((gdb) this).field_e <= ((gdb) this).field_a) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)((long)((gdb) this).field_l - ((gdb) this).field_a + ((gdb) this).field_e);
                      if (var9_int <= param1) {
                        break L3;
                      } else {
                        var9_int = param1;
                        break L3;
                      }
                    }
                    cua.a(((gdb) this).field_h, (int)(-((gdb) this).field_e + ((gdb) this).field_a), param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    ((gdb) this).field_a = ((gdb) this).field_a + (long)var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (param1 > ((gdb) this).field_h.length) {
                  ((gdb) this).field_m.a((byte) -38, ((gdb) this).field_a);
                  ((gdb) this).field_c = ((gdb) this).field_a;
                  L5: while (true) {
                    if (param1 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((gdb) this).field_m.a((byte) -60, param1, param0, param2);
                      if (-1 != var9_int) {
                        ((gdb) this).field_c = ((gdb) this).field_c + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((gdb) this).field_a = ((gdb) this).field_a + (long)var9_int;
                        param1 = param1 - var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (param1 > 0) {
                    L6: {
                      this.c(param3 + -199969460);
                      var9_int = param1;
                      if (var9_int <= ((gdb) this).field_l) {
                        break L6;
                      } else {
                        var9_int = ((gdb) this).field_l;
                        break L6;
                      }
                    }
                    cua.a(((gdb) this).field_h, 0, param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    ((gdb) this).field_a = ((gdb) this).field_a + (long)var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (((gdb) this).field_g == -1L) {
                  break L7;
                } else {
                  L8: {
                    if (~((gdb) this).field_g >= ~((gdb) this).field_a) {
                      break L8;
                    } else {
                      if (0 >= param1) {
                        break L8;
                      } else {
                        L9: {
                          var9_int = (int)(-((gdb) this).field_a + ((gdb) this).field_g) + param2;
                          if (param2 + param1 < var9_int) {
                            var9_int = param1 + param2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param2 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param0[incrementValue$1] = (byte) 0;
                            param1--;
                            ((gdb) this).field_a = ((gdb) this).field_a + 1L;
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
                      if (~((gdb) this).field_g > ~var5_long) {
                        break L12;
                      } else {
                        if (((gdb) this).field_g >= (long)var8 + var5_long) {
                          break L12;
                        } else {
                          var9 = ((gdb) this).field_g;
                          break L11;
                        }
                      }
                    }
                    if (~((gdb) this).field_g < ~var5_long) {
                      break L11;
                    } else {
                      if (~((long)((gdb) this).field_j + ((gdb) this).field_g) >= ~var5_long) {
                        break L11;
                      } else {
                        var9 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (~var5_long <= ~(((gdb) this).field_g + (long)((gdb) this).field_j)) {
                        break L14;
                      } else {
                        if ((long)((gdb) this).field_j + ((gdb) this).field_g > var5_long - -(long)var8) {
                          break L14;
                        } else {
                          var11 = ((gdb) this).field_g - -(long)((gdb) this).field_j;
                          break L13;
                        }
                      }
                    }
                    if (var5_long + (long)var8 <= ((gdb) this).field_g) {
                      break L13;
                    } else {
                      if (~((long)var8 + var5_long) >= ~((long)((gdb) this).field_j + ((gdb) this).field_g)) {
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
                      cua.a(((gdb) this).field_f, (int)(-((gdb) this).field_g + var9), param0, var7 + (int)(var9 + -var5_long), var13);
                      if (~((gdb) this).field_a > ~var11) {
                        param1 = (int)((long)param1 - (var11 + -((gdb) this).field_a));
                        ((gdb) this).field_a = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L15: {
                if (param3 == -30541) {
                  break L15;
                } else {
                  ((gdb) this).field_m = null;
                  break L15;
                }
              }
              if (0 < param1) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param1 + param2);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((gdb) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("gdb.B(");
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L16;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L16;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    gdb(au param0, int param1, int param2) throws IOException {
        ((gdb) this).field_j = 0;
        ((gdb) this).field_e = -1L;
        ((gdb) this).field_g = -1L;
        try {
            ((gdb) this).field_m = param0;
            long dupTemp$0 = param0.a(1);
            ((gdb) this).field_k = dupTemp$0;
            ((gdb) this).field_b = dupTemp$0;
            ((gdb) this).field_f = new byte[param2];
            ((gdb) this).field_h = new byte[param1];
            ((gdb) this).field_a = 0L;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gdb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Accept unrated rematch";
    }
}

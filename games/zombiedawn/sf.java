/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sf {
    private long field_g;
    private long field_h;
    private byte[] field_b;
    private long field_c;
    private int field_a;
    static vo field_n;
    static pf field_j;
    private int field_m;
    private long field_e;
    static int[] field_d;
    private long field_l;
    private byte[] field_i;
    private long field_f;
    private qn field_k;

    public static void c(int param0) {
        field_n = null;
        field_j = null;
        if (param0 != 0) {
            field_j = null;
        }
        field_d = null;
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          L0: {
            ((sf) this).field_e = param1;
            if (param0 == 0) {
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 463) {
            sf.c(64);
        }
        int discarded$0 = -115;
        this.a();
        ((sf) this).field_k.c(-88);
    }

    final long a(int param0) {
        if (param0 != -1) {
            ((sf) this).field_l = 45L;
        }
        return ((sf) this).field_g;
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) throws IOException {
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
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            if (param2 + param0 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param0 + (param2 + -param3.length));
            } else {
              L1: {
                if (((sf) this).field_h == -1L) {
                  break L1;
                } else {
                  if (~((sf) this).field_e > ~((sf) this).field_h) {
                    break L1;
                  } else {
                    if (~(((sf) this).field_h + (long)((sf) this).field_m) <= ~((long)param0 + ((sf) this).field_e)) {
                      gp.a(((sf) this).field_b, (int)(-((sf) this).field_h + ((sf) this).field_e), param3, param2, param0);
                      ((sf) this).field_e = ((sf) this).field_e + (long)param0;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((sf) this).field_e;
                var7 = param2;
                if (!param1) {
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8 = param0;
                if (((sf) this).field_e < ((sf) this).field_l) {
                  break L3;
                } else {
                  if (((sf) this).field_l + (long)((sf) this).field_a <= ((sf) this).field_e) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)((long)((sf) this).field_a - (-((sf) this).field_l + ((sf) this).field_e));
                      if (var9_int > param0) {
                        var9_int = param0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    gp.a(((sf) this).field_i, (int)(-((sf) this).field_l + ((sf) this).field_e), param3, param2, var9_int);
                    param2 = param2 + var9_int;
                    ((sf) this).field_e = ((sf) this).field_e + (long)var9_int;
                    param0 = param0 - var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (param0 <= ((sf) this).field_i.length) {
                  if (0 >= param0) {
                    break L5;
                  } else {
                    L6: {
                      this.a(true);
                      var9_int = param0;
                      if (var9_int <= ((sf) this).field_a) {
                        break L6;
                      } else {
                        var9_int = ((sf) this).field_a;
                        break L6;
                      }
                    }
                    gp.a(((sf) this).field_i, 0, param3, param2, var9_int);
                    param0 = param0 - var9_int;
                    ((sf) this).field_e = ((sf) this).field_e + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L5;
                  }
                } else {
                  ((sf) this).field_k.a((byte) -113, ((sf) this).field_e);
                  ((sf) this).field_c = ((sf) this).field_e;
                  L7: while (true) {
                    if (0 >= param0) {
                      break L5;
                    } else {
                      var9_int = ((sf) this).field_k.a(param2, param3, param0, (byte) -118);
                      if (var9_int == -1) {
                        break L5;
                      } else {
                        param0 = param0 - var9_int;
                        ((sf) this).field_c = ((sf) this).field_c + (long)var9_int;
                        ((sf) this).field_e = ((sf) this).field_e + (long)var9_int;
                        param2 = param2 + var9_int;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                if (((sf) this).field_h != -1L) {
                  L9: {
                    if (~((sf) this).field_e <= ~((sf) this).field_h) {
                      break L9;
                    } else {
                      if (param0 <= 0) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = (int)(-((sf) this).field_e + ((sf) this).field_h) + param2;
                          if (var9_int > param2 - -param0) {
                            var9_int = param0 + param2;
                            break L10;
                          } else {
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
                            param0--;
                            ((sf) this).field_e = ((sf) this).field_e + 1L;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var9 = -1L;
                      if (~var5_long < ~((sf) this).field_h) {
                        break L13;
                      } else {
                        if (~((long)var8 + var5_long) >= ~((sf) this).field_h) {
                          break L13;
                        } else {
                          var9 = ((sf) this).field_h;
                          break L12;
                        }
                      }
                    }
                    if (~var5_long > ~((sf) this).field_h) {
                      break L12;
                    } else {
                      if ((long)((sf) this).field_m + ((sf) this).field_h <= var5_long) {
                        break L12;
                      } else {
                        var9 = var5_long;
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      var11 = -1L;
                      if (((sf) this).field_h + (long)((sf) this).field_m <= var5_long) {
                        break L15;
                      } else {
                        if (~(var5_long + (long)var8) > ~((long)((sf) this).field_m + ((sf) this).field_h)) {
                          break L15;
                        } else {
                          var11 = ((sf) this).field_h + (long)((sf) this).field_m;
                          break L14;
                        }
                      }
                    }
                    if (((sf) this).field_h >= var5_long - -(long)var8) {
                      break L14;
                    } else {
                      if (var5_long - -(long)var8 > ((sf) this).field_h + (long)((sf) this).field_m) {
                        break L14;
                      } else {
                        var11 = (long)var8 + var5_long;
                        break L14;
                      }
                    }
                  }
                  if (-1L >= var9) {
                    break L8;
                  } else {
                    if (var9 < var11) {
                      var13 = (int)(var11 + -var9);
                      gp.a(((sf) this).field_b, (int)(var9 + -((sf) this).field_h), param3, var7 + (int)(-var5_long + var9), var13);
                      if (var11 <= ((sf) this).field_e) {
                        break L8;
                      } else {
                        param0 = (int)((long)param0 - (var11 + -((sf) this).field_e));
                        ((sf) this).field_e = var11;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (param0 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((sf) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("sf.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw sh.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 41);
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((sf) this).a(param1.length, false, 0, param1);
            int var3_int = 105 / ((-64 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "sf.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (~(((sf) this).field_e + (long)param3) >= ~((sf) this).field_g) {
                break L1;
              } else {
                ((sf) this).field_g = ((sf) this).field_e + (long)param3;
                break L1;
              }
            }
            L2: {
              if (((sf) this).field_h == -1L) {
                break L2;
              } else {
                L3: {
                  if (((sf) this).field_h > ((sf) this).field_e) {
                    break L3;
                  } else {
                    if (((sf) this).field_e > ((sf) this).field_h - -(long)((sf) this).field_m) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                int discarded$2 = -115;
                this.a();
                break L2;
              }
            }
            L4: {
              if (((sf) this).field_h == -1L) {
                break L4;
              } else {
                if ((long)param3 + ((sf) this).field_e > ((sf) this).field_h + (long)((sf) this).field_b.length) {
                  var5_int = (int)(((sf) this).field_h - (((sf) this).field_e - (long)((sf) this).field_b.length));
                  gp.a(param1, param2, ((sf) this).field_b, (int)(-((sf) this).field_h + ((sf) this).field_e), var5_int);
                  param2 = param2 + var5_int;
                  ((sf) this).field_e = ((sf) this).field_e + (long)var5_int;
                  param3 = param3 - var5_int;
                  ((sf) this).field_m = ((sf) this).field_b.length;
                  int discarded$3 = -115;
                  this.a();
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param3 > ((sf) this).field_b.length) {
              L5: {
                if (~((sf) this).field_c != ~((sf) this).field_e) {
                  ((sf) this).field_k.a((byte) -104, ((sf) this).field_e);
                  ((sf) this).field_c = ((sf) this).field_e;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                ((sf) this).field_k.a(0, param3, param1, param2);
                ((sf) this).field_c = ((sf) this).field_c + (long)param3;
                if (~((sf) this).field_f <= ~((sf) this).field_c) {
                  break L6;
                } else {
                  ((sf) this).field_f = ((sf) this).field_c;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (~((sf) this).field_e > ~((sf) this).field_l) {
                    break L8;
                  } else {
                    if (~((long)((sf) this).field_a + ((sf) this).field_l) < ~((sf) this).field_e) {
                      var5_long = ((sf) this).field_e;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (((sf) this).field_e > ((sf) this).field_l) {
                  break L7;
                } else {
                  if (~((long)param3 + ((sf) this).field_e) >= ~((sf) this).field_l) {
                    break L7;
                  } else {
                    var5_long = ((sf) this).field_l;
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (((sf) this).field_l >= ((sf) this).field_e - -(long)param3) {
                    break L10;
                  } else {
                    if ((long)((sf) this).field_a + ((sf) this).field_l < ((sf) this).field_e - -(long)param3) {
                      break L10;
                    } else {
                      var7 = (long)param3 + ((sf) this).field_e;
                      break L9;
                    }
                  }
                }
                if (((sf) this).field_e >= (long)((sf) this).field_a + ((sf) this).field_l) {
                  break L9;
                } else {
                  if ((long)param3 + ((sf) this).field_e < (long)((sf) this).field_a + ((sf) this).field_l) {
                    break L9;
                  } else {
                    var7 = (long)((sf) this).field_a + ((sf) this).field_l;
                    break L9;
                  }
                }
              }
              L11: {
                if (-1L >= var5_long) {
                  break L11;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(var7 - var5_long);
                    gp.a(param1, (int)(-((sf) this).field_e + (long)param2 - -var5_long), ((sf) this).field_i, (int)(-((sf) this).field_l + var5_long), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((sf) this).field_e = ((sf) this).field_e + (long)param3;
              return;
            } else {
              if (0 < param3) {
                L12: {
                  if (((sf) this).field_h != -1L) {
                    break L12;
                  } else {
                    ((sf) this).field_h = ((sf) this).field_e;
                    break L12;
                  }
                }
                L13: {
                  gp.a(param1, param2, ((sf) this).field_b, (int)(((sf) this).field_e + -((sf) this).field_h), param3);
                  ((sf) this).field_e = ((sf) this).field_e + (long)param3;
                  if (~(-((sf) this).field_h + ((sf) this).field_e) < ~(long)((sf) this).field_m) {
                    ((sf) this).field_m = (int)(((sf) this).field_e - ((sf) this).field_h);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              } else {
                L14: {
                  if (param0 >= 40) {
                    break L14;
                  } else {
                    sf.c(17);
                    break L14;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((sf) this).field_c = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("sf.G(").append(param0).append(44);
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
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L15;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a() throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (((sf) this).field_h == -1L) {
            break L0;
          } else {
            L1: {
              if (~((sf) this).field_c == ~((sf) this).field_h) {
                break L1;
              } else {
                ((sf) this).field_k.a((byte) -104, ((sf) this).field_h);
                ((sf) this).field_c = ((sf) this).field_h;
                break L1;
              }
            }
            L2: {
              ((sf) this).field_k.a(0, ((sf) this).field_m, ((sf) this).field_b, 0);
              ((sf) this).field_c = ((sf) this).field_c + (long)((sf) this).field_m;
              if (~((sf) this).field_c < ~((sf) this).field_f) {
                ((sf) this).field_f = ((sf) this).field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((sf) this).field_h < ((sf) this).field_l) {
                  break L4;
                } else {
                  if (~((sf) this).field_h > ~((long)((sf) this).field_a + ((sf) this).field_l)) {
                    var2 = ((sf) this).field_h;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((sf) this).field_h < ~((sf) this).field_l) {
                break L3;
              } else {
                if (~((sf) this).field_l > ~(((sf) this).field_h + (long)((sf) this).field_m)) {
                  var2 = ((sf) this).field_l;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((sf) this).field_l <= ~(((sf) this).field_h - -(long)((sf) this).field_m)) {
                  break L6;
                } else {
                  if (~((long)((sf) this).field_a + ((sf) this).field_l) > ~(((sf) this).field_h - -(long)((sf) this).field_m)) {
                    break L6;
                  } else {
                    var4 = ((sf) this).field_h - -(long)((sf) this).field_m;
                    break L5;
                  }
                }
              }
              if (((sf) this).field_h >= ((sf) this).field_l - -(long)((sf) this).field_a) {
                break L5;
              } else {
                if (~((long)((sf) this).field_a + ((sf) this).field_l) >= ~((long)((sf) this).field_m + ((sf) this).field_h)) {
                  var4 = (long)((sf) this).field_a + ((sf) this).field_l;
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
                if (var4 <= var2) {
                  break L7;
                } else {
                  var6 = (int)(var4 + -var2);
                  gp.a(((sf) this).field_b, (int)(var2 - ((sf) this).field_h), ((sf) this).field_i, (int)(-((sf) this).field_l + var2), var6);
                  break L7;
                }
              }
            }
            ((sf) this).field_m = 0;
            ((sf) this).field_h = -1L;
            break L0;
          }
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        ((sf) this).field_a = 0;
        if (!(((sf) this).field_c == ((sf) this).field_e)) {
            ((sf) this).field_k.a((byte) -101, ((sf) this).field_e);
            ((sf) this).field_c = ((sf) this).field_e;
        }
        ((sf) this).field_l = ((sf) this).field_e;
        while (((sf) this).field_i.length > ((sf) this).field_a) {
            var2 = ((sf) this).field_i.length - ((sf) this).field_a;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((sf) this).field_k.a(((sf) this).field_a, ((sf) this).field_i, var2, (byte) -103);
            if (var3 == -1) {
                break;
            }
            ((sf) this).field_a = ((sf) this).field_a + var3;
            ((sf) this).field_c = ((sf) this).field_c + (long)var3;
        }
    }

    sf(qn param0, int param1, int param2) throws IOException {
        ((sf) this).field_h = -1L;
        ((sf) this).field_m = 0;
        ((sf) this).field_l = -1L;
        try {
            ((sf) this).field_k = param0;
            long dupTemp$0 = param0.b(100);
            ((sf) this).field_f = dupTemp$0;
            ((sf) this).field_g = dupTemp$0;
            ((sf) this).field_i = new byte[param1];
            ((sf) this).field_b = new byte[param2];
            ((sf) this).field_e = 0L;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "sf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = null;
        field_d = new int[]{26, 182, 370, 463};
    }
}

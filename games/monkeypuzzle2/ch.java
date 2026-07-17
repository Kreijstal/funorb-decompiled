/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ch {
    private pl field_b;
    private long field_n;
    private long field_h;
    private int field_m;
    private long field_a;
    private int field_l;
    private long field_e;
    private long field_g;
    private byte[] field_k;
    private long field_f;
    static java.awt.Color field_i;
    private byte[] field_c;
    static ad field_j;
    static lk field_d;

    final void a(int param0, byte[] param1) throws IOException {
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
              ((ch) this).a(param1, param1.length, 0, (byte) 117);
              if (param0 == 3805) {
                break L1;
              } else {
                ((ch) this).field_k = null;
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
            stackOut_3_1 = new StringBuilder().append("ch.A(").append(param0).append(44);
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            em.field_B = 480;
            fg.field_b = 0;
            L1: while (true) {
              if (mb.field_e.b(127) <= 0) {
                L2: {
                  if (param0 <= -106) {
                    break L2;
                  } else {
                    field_j = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                ug discarded$2 = mb.field_e.d(4011);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ch.K(" + param0 + 41);
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ch) this).field_h - -(long)param3 > ((ch) this).field_n) {
                ((ch) this).field_n = (long)param3 + ((ch) this).field_h;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ch) this).field_a == -1L) {
                break L2;
              } else {
                if (((ch) this).field_h >= ((ch) this).field_a) {
                  if ((long)((ch) this).field_l + ((ch) this).field_a >= ((ch) this).field_h) {
                    break L2;
                  } else {
                    this.b((byte) -109);
                    break L2;
                  }
                } else {
                  this.b((byte) -109);
                  break L2;
                }
              }
            }
            L3: {
              if (((ch) this).field_a == -1L) {
                break L3;
              } else {
                if (((ch) this).field_a + (long)((ch) this).field_c.length < (long)param3 + ((ch) this).field_h) {
                  var5_int = (int)(-((ch) this).field_h - (-((ch) this).field_a - (long)((ch) this).field_c.length));
                  gl.a(param0, param1, ((ch) this).field_c, (int)(((ch) this).field_h + -((ch) this).field_a), var5_int);
                  ((ch) this).field_h = ((ch) this).field_h + (long)var5_int;
                  param1 = param1 + var5_int;
                  param3 = param3 - var5_int;
                  ((ch) this).field_l = ((ch) this).field_c.length;
                  this.b((byte) -109);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (((ch) this).field_c.length >= param3) {
              if (param2 >= 31) {
                if (param3 <= 0) {
                  break L0;
                } else {
                  L4: {
                    if (((ch) this).field_a != -1L) {
                      break L4;
                    } else {
                      ((ch) this).field_a = ((ch) this).field_h;
                      break L4;
                    }
                  }
                  L5: {
                    gl.a(param0, param1, ((ch) this).field_c, (int)(((ch) this).field_h - ((ch) this).field_a), param3);
                    ((ch) this).field_h = ((ch) this).field_h + (long)param3;
                    if ((long)((ch) this).field_l < -((ch) this).field_a + ((ch) this).field_h) {
                      ((ch) this).field_l = (int)(((ch) this).field_h - ((ch) this).field_a);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              L6: {
                if (~((ch) this).field_h == ~((ch) this).field_g) {
                  break L6;
                } else {
                  ((ch) this).field_b.a(0, ((ch) this).field_h);
                  ((ch) this).field_g = ((ch) this).field_h;
                  break L6;
                }
              }
              L7: {
                ((ch) this).field_b.a(param1, (byte) 68, param0, param3);
                ((ch) this).field_g = ((ch) this).field_g + (long)param3;
                if (~((ch) this).field_f <= ~((ch) this).field_g) {
                  break L7;
                } else {
                  ((ch) this).field_f = ((ch) this).field_g;
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((ch) this).field_h < ((ch) this).field_e) {
                    break L9;
                  } else {
                    if (~((ch) this).field_h > ~(((ch) this).field_e + (long)((ch) this).field_m)) {
                      var5_long = ((ch) this).field_h;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (~((ch) this).field_h < ~((ch) this).field_e) {
                  break L8;
                } else {
                  if (~((long)param3 + ((ch) this).field_h) < ~((ch) this).field_e) {
                    var5_long = ((ch) this).field_e;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  if (~(((ch) this).field_h - -(long)param3) >= ~((ch) this).field_e) {
                    break L11;
                  } else {
                    if (~(((ch) this).field_h - -(long)param3) >= ~((long)((ch) this).field_m + ((ch) this).field_e)) {
                      var7 = ((ch) this).field_h + (long)param3;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if ((long)((ch) this).field_m + ((ch) this).field_e <= ((ch) this).field_h) {
                  break L10;
                } else {
                  if (~(((ch) this).field_e + (long)((ch) this).field_m) >= ~(((ch) this).field_h + (long)param3)) {
                    var7 = (long)((ch) this).field_m + ((ch) this).field_e;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (var5_long <= -1L) {
                  break L12;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(-var5_long + var7);
                    gl.a(param0, (int)(-((ch) this).field_h + (var5_long + (long)param1)), ((ch) this).field_k, (int)(-((ch) this).field_e + var5_long), var9);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((ch) this).field_h = ((ch) this).field_h + (long)param3;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ch) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var5_ref;
            stackOut_53_1 = new StringBuilder().append("ch.C(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L13;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L13;
            }
          }
          throw la.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 0;
        field_d = null;
        field_j = null;
    }

    final long c(byte param0) {
        if (param0 > -66) {
            return -86L;
        }
        return ((ch) this).field_n;
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
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
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 > 18) {
              if (param0.length >= param1 + param2) {
                L1: {
                  if (((ch) this).field_a == -1L) {
                    break L1;
                  } else {
                    if (((ch) this).field_h < ((ch) this).field_a) {
                      break L1;
                    } else {
                      if (~(((ch) this).field_h - -(long)param1) >= ~((long)((ch) this).field_l + ((ch) this).field_a)) {
                        gl.a(((ch) this).field_c, (int)(-((ch) this).field_a + ((ch) this).field_h), param0, param2, param1);
                        ((ch) this).field_h = ((ch) this).field_h + (long)param1;
                        return;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  var5_long = ((ch) this).field_h;
                  var7 = param2;
                  var8 = param1;
                  if (((ch) this).field_h < ((ch) this).field_e) {
                    break L2;
                  } else {
                    if (~((long)((ch) this).field_m + ((ch) this).field_e) < ~((ch) this).field_h) {
                      L3: {
                        var9_int = (int)((long)((ch) this).field_m - ((ch) this).field_h - -((ch) this).field_e);
                        if (param1 >= var9_int) {
                          break L3;
                        } else {
                          var9_int = param1;
                          break L3;
                        }
                      }
                      gl.a(((ch) this).field_k, (int)(((ch) this).field_h + -((ch) this).field_e), param0, param2, var9_int);
                      param1 = param1 - var9_int;
                      param2 = param2 + var9_int;
                      ((ch) this).field_h = ((ch) this).field_h + (long)var9_int;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (param1 <= ((ch) this).field_k.length) {
                    if (param1 > 0) {
                      L5: {
                        this.a(-119);
                        var9_int = param1;
                        if (((ch) this).field_m >= var9_int) {
                          break L5;
                        } else {
                          var9_int = ((ch) this).field_m;
                          break L5;
                        }
                      }
                      gl.a(((ch) this).field_k, 0, param0, param2, var9_int);
                      param1 = param1 - var9_int;
                      ((ch) this).field_h = ((ch) this).field_h + (long)var9_int;
                      param2 = param2 + var9_int;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    ((ch) this).field_b.a(0, ((ch) this).field_h);
                    ((ch) this).field_g = ((ch) this).field_h;
                    L6: while (true) {
                      if (param1 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((ch) this).field_b.a(param2, param0, (byte) -128, param1);
                        if (var9_int == -1) {
                          break L4;
                        } else {
                          param2 = param2 + var9_int;
                          ((ch) this).field_g = ((ch) this).field_g + (long)var9_int;
                          param1 = param1 - var9_int;
                          ((ch) this).field_h = ((ch) this).field_h + (long)var9_int;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (((ch) this).field_a != -1L) {
                    L8: {
                      if (~((ch) this).field_h <= ~((ch) this).field_a) {
                        break L8;
                      } else {
                        if (param1 > 0) {
                          L9: {
                            var9_int = (int)(-((ch) this).field_h + ((ch) this).field_a) + param2;
                            if (var9_int <= param2 + param1) {
                              break L9;
                            } else {
                              var9_int = param1 + param2;
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (param2 >= var9_int) {
                              break L8;
                            } else {
                              param1--;
                              int incrementValue$1 = param2;
                              param2++;
                              param0[incrementValue$1] = (byte) 0;
                              ((ch) this).field_h = ((ch) this).field_h + 1L;
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
                        if (~((ch) this).field_a > ~var5_long) {
                          break L12;
                        } else {
                          if (~((ch) this).field_a <= ~(var5_long - -(long)var8)) {
                            break L12;
                          } else {
                            var9 = ((ch) this).field_a;
                            break L11;
                          }
                        }
                      }
                      if (((ch) this).field_a > var5_long) {
                        break L11;
                      } else {
                        if (~(((ch) this).field_a - -(long)((ch) this).field_l) >= ~var5_long) {
                          break L11;
                        } else {
                          var9 = var5_long;
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (~(((ch) this).field_a - -(long)((ch) this).field_l) >= ~var5_long) {
                          break L14;
                        } else {
                          if (~((long)var8 + var5_long) <= ~((long)((ch) this).field_l + ((ch) this).field_a)) {
                            var11 = ((ch) this).field_a - -(long)((ch) this).field_l;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (~(var5_long + (long)var8) >= ~((ch) this).field_a) {
                        break L13;
                      } else {
                        if (((ch) this).field_a - -(long)((ch) this).field_l < var5_long - -(long)var8) {
                          break L13;
                        } else {
                          var11 = var5_long + (long)var8;
                          break L13;
                        }
                      }
                    }
                    if (-1L >= var9) {
                      break L7;
                    } else {
                      if (~var9 <= ~var11) {
                        break L7;
                      } else {
                        var13 = (int)(var11 - var9);
                        gl.a(((ch) this).field_c, (int)(var9 - ((ch) this).field_a), param0, var7 - -(int)(-var5_long + var9), var13);
                        if (~((ch) this).field_h > ~var11) {
                          param1 = (int)((long)param1 - (-((ch) this).field_h + var11));
                          ((ch) this).field_h = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                if (0 < param1) {
                  throw new EOFException();
                } else {
                  break L0;
                }
              } else {
                throw new ArrayIndexOutOfBoundsException(-param0.length + (param2 + param1));
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ch) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("ch.H(");
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
          throw la.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ((ch) this).field_m = 0;
        if (!(((ch) this).field_h == ((ch) this).field_g)) {
            ((ch) this).field_b.a(0, ((ch) this).field_h);
            ((ch) this).field_g = ((ch) this).field_h;
        }
        ((ch) this).field_e = ((ch) this).field_h;
        while (((ch) this).field_k.length > ((ch) this).field_m) {
            var2 = ((ch) this).field_k.length + -((ch) this).field_m;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((ch) this).field_b.a(((ch) this).field_m, ((ch) this).field_k, (byte) -126, var2);
            if (var3 == -1) {
                break;
            }
            ((ch) this).field_m = ((ch) this).field_m + var3;
            ((ch) this).field_g = ((ch) this).field_g + (long)var3;
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (((ch) this).field_a != -1L) {
            L1: {
              if (((ch) this).field_g != ((ch) this).field_a) {
                ((ch) this).field_b.a(0, ((ch) this).field_a);
                ((ch) this).field_g = ((ch) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((ch) this).field_b.a(0, (byte) 68, ((ch) this).field_c, ((ch) this).field_l);
              ((ch) this).field_g = ((ch) this).field_g + (long)((ch) this).field_l;
              if (((ch) this).field_f >= ((ch) this).field_g) {
                break L2;
              } else {
                ((ch) this).field_f = ((ch) this).field_g;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((ch) this).field_a < ((ch) this).field_e) {
                  break L4;
                } else {
                  if (~(((ch) this).field_e - -(long)((ch) this).field_m) < ~((ch) this).field_a) {
                    var2 = ((ch) this).field_a;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((ch) this).field_e > ~((ch) this).field_a) {
                break L3;
              } else {
                if (((ch) this).field_e >= (long)((ch) this).field_l + ((ch) this).field_a) {
                  break L3;
                } else {
                  var2 = ((ch) this).field_e;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~(((ch) this).field_a - -(long)((ch) this).field_l) >= ~((ch) this).field_e) {
                  break L6;
                } else {
                  if (~(((ch) this).field_e - -(long)((ch) this).field_m) <= ~(((ch) this).field_a + (long)((ch) this).field_l)) {
                    var4 = (long)((ch) this).field_l + ((ch) this).field_a;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((ch) this).field_a <= ~((long)((ch) this).field_m + ((ch) this).field_e)) {
                break L5;
              } else {
                if (~(((ch) this).field_e - -(long)((ch) this).field_m) >= ~((long)((ch) this).field_l + ((ch) this).field_a)) {
                  var4 = ((ch) this).field_e - -(long)((ch) this).field_m;
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
                  gl.a(((ch) this).field_c, (int)(var2 - ((ch) this).field_a), ((ch) this).field_k, (int)(-((ch) this).field_e + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ch) this).field_a = -1L;
            ((ch) this).field_l = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    ch(pl param0, int param1, int param2) throws IOException {
        ((ch) this).field_e = -1L;
        ((ch) this).field_l = 0;
        ((ch) this).field_a = -1L;
        try {
            ((ch) this).field_b = param0;
            long dupTemp$0 = param0.c((byte) 124);
            ((ch) this).field_f = dupTemp$0;
            ((ch) this).field_n = dupTemp$0;
            ((ch) this).field_h = 0L;
            ((ch) this).field_k = new byte[param1];
            ((ch) this).field_c = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ch.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((ch) this).field_h = param1;
        if (param0 < 82) {
            ch.b(-87);
        }
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        rb stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_19_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null != pj.field_a) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var6 = (CharSequence) (Object) param0;
                var2 = pl.a((byte) 109, var6);
                if (param1 == -1) {
                  if (var2 != null) {
                    var3 = (rb) (Object) pj.field_a.a((long)var2.hashCode(), false);
                    L0: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) (Object) var3.field_db;
                        var4 = pl.a((byte) 126, var7);
                        if (var4.equals((Object) (Object) var2)) {
                          stackOut_19_0 = (rb) var3;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          var3 = (rb) (Object) pj.field_a.b(-34);
                          continue L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (rb) (Object) stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (rb) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2_ref;
            stackOut_23_1 = new StringBuilder().append("ch.I(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        this.b((byte) -109);
        ((ch) this).field_b.a(19808);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new java.awt.Color(10040319);
    }
}

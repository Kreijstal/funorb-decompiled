/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im {
    private long field_a;
    private byte[] field_o;
    private long field_d;
    static fe[] field_c;
    static int field_h;
    private long field_e;
    private bj field_f;
    private long field_k;
    private long field_n;
    private long field_i;
    private int field_l;
    private byte[] field_m;
    private int field_b;
    static boolean field_g;
    static cr field_j;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((im) this).field_d + (long)param1 > ((im) this).field_a) {
                ((im) this).field_a = ((im) this).field_d - -(long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 0) {
              L2: {
                if (((im) this).field_e == -1L) {
                  break L2;
                } else {
                  L3: {
                    if (((im) this).field_e > ((im) this).field_d) {
                      break L3;
                    } else {
                      if (((im) this).field_d > (long)((im) this).field_l + ((im) this).field_e) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a((byte) 58);
                  break L2;
                }
              }
              L4: {
                if (((im) this).field_e == -1L) {
                  break L4;
                } else {
                  if ((long)param1 + ((im) this).field_d <= ((im) this).field_e - -(long)((im) this).field_m.length) {
                    break L4;
                  } else {
                    var5_int = (int)(-((im) this).field_d - (-((im) this).field_e - (long)((im) this).field_m.length));
                    qq.a(param3, param2, ((im) this).field_m, (int)(((im) this).field_d + -((im) this).field_e), var5_int);
                    ((im) this).field_d = ((im) this).field_d + (long)var5_int;
                    param1 = param1 - var5_int;
                    param2 = param2 + var5_int;
                    ((im) this).field_l = ((im) this).field_m.length;
                    this.a((byte) 100);
                    break L4;
                  }
                }
              }
              if (((im) this).field_m.length < param1) {
                L5: {
                  if (((im) this).field_n == ((im) this).field_d) {
                    break L5;
                  } else {
                    ((im) this).field_f.a(((im) this).field_d, false);
                    ((im) this).field_n = ((im) this).field_d;
                    break L5;
                  }
                }
                L6: {
                  ((im) this).field_f.a(param1, param2, param3, false);
                  ((im) this).field_n = ((im) this).field_n + (long)param1;
                  if (((im) this).field_i < ((im) this).field_n) {
                    ((im) this).field_i = ((im) this).field_n;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var5_long = -1L;
                    if (~((im) this).field_k < ~((im) this).field_d) {
                      break L8;
                    } else {
                      if (~((long)((im) this).field_b + ((im) this).field_k) >= ~((im) this).field_d) {
                        break L8;
                      } else {
                        var5_long = ((im) this).field_d;
                        break L7;
                      }
                    }
                  }
                  if (((im) this).field_k < ((im) this).field_d) {
                    break L7;
                  } else {
                    if (~((im) this).field_k > ~(((im) this).field_d + (long)param1)) {
                      var5_long = ((im) this).field_k;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  L10: {
                    var7 = -1L;
                    if (~(((im) this).field_d + (long)param1) >= ~((im) this).field_k) {
                      break L10;
                    } else {
                      if (((im) this).field_k - -(long)((im) this).field_b >= ((im) this).field_d + (long)param1) {
                        var7 = (long)param1 + ((im) this).field_d;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (~(((im) this).field_k + (long)((im) this).field_b) >= ~((im) this).field_d) {
                    break L9;
                  } else {
                    if (((im) this).field_d + (long)param1 >= ((im) this).field_k + (long)((im) this).field_b) {
                      var7 = (long)((im) this).field_b + ((im) this).field_k;
                      break L9;
                    } else {
                      L11: {
                        if (var5_long <= -1L) {
                          break L11;
                        } else {
                          if (var7 <= var5_long) {
                            break L11;
                          } else {
                            var9 = (int)(-var5_long + var7);
                            qq.a(param3, (int)((long)param2 - (-var5_long - -((im) this).field_d)), ((im) this).field_o, (int)(-((im) this).field_k + var5_long), var9);
                            break L11;
                          }
                        }
                      }
                      ((im) this).field_d = ((im) this).field_d + (long)param1;
                      return;
                    }
                  }
                }
                L12: {
                  if (var5_long <= -1L) {
                    break L12;
                  } else {
                    if (var7 <= var5_long) {
                      break L12;
                    } else {
                      var9 = (int)(-var5_long + var7);
                      qq.a(param3, (int)((long)param2 - (-var5_long - -((im) this).field_d)), ((im) this).field_o, (int)(-((im) this).field_k + var5_long), var9);
                      break L12;
                    }
                  }
                }
                ((im) this).field_d = ((im) this).field_d + (long)param1;
                return;
              } else {
                if (param1 > 0) {
                  L13: {
                    if (((im) this).field_e == -1L) {
                      ((im) this).field_e = ((im) this).field_d;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    qq.a(param3, param2, ((im) this).field_m, (int)(((im) this).field_d - ((im) this).field_e), param1);
                    ((im) this).field_d = ((im) this).field_d + (long)param1;
                    if (~(long)((im) this).field_l <= ~(((im) this).field_d - ((im) this).field_e)) {
                      break L14;
                    } else {
                      ((im) this).field_l = (int)(-((im) this).field_e + ((im) this).field_d);
                      break L14;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((im) this).field_n = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var5_ref;
            stackOut_55_1 = new StringBuilder().append("im.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 + param1 <= param2.length) {
              L1: {
                if (((im) this).field_e == -1L) {
                  break L1;
                } else {
                  if (~((im) this).field_d > ~((im) this).field_e) {
                    break L1;
                  } else {
                    if ((long)((im) this).field_l + ((im) this).field_e >= (long)param3 + ((im) this).field_d) {
                      qq.a(((im) this).field_m, (int)(-((im) this).field_e + ((im) this).field_d), param2, param1, param3);
                      ((im) this).field_d = ((im) this).field_d + (long)param3;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5_long = ((im) this).field_d;
              if (param0 < -82) {
                L2: {
                  var7 = param1;
                  var8 = param3;
                  if (((im) this).field_k > ((im) this).field_d) {
                    break L2;
                  } else {
                    if (((im) this).field_d < ((im) this).field_k - -(long)((im) this).field_b) {
                      L3: {
                        var9_int = (int)((long)((im) this).field_b - (((im) this).field_d + -((im) this).field_k));
                        if (var9_int > param3) {
                          var9_int = param3;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      qq.a(((im) this).field_o, (int)(((im) this).field_d - ((im) this).field_k), param2, param1, var9_int);
                      param1 = param1 + var9_int;
                      param3 = param3 - var9_int;
                      ((im) this).field_d = ((im) this).field_d + (long)var9_int;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (param3 > ((im) this).field_o.length) {
                    ((im) this).field_f.a(((im) this).field_d, false);
                    ((im) this).field_n = ((im) this).field_d;
                    L5: while (true) {
                      if (param3 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((im) this).field_f.a(param3, (byte) -84, param2, param1);
                        if (var9_int != -1) {
                          ((im) this).field_n = ((im) this).field_n + (long)var9_int;
                          param1 = param1 + var9_int;
                          ((im) this).field_d = ((im) this).field_d + (long)var9_int;
                          param3 = param3 - var9_int;
                          continue L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (param3 > 0) {
                      L6: {
                        this.d(-122);
                        var9_int = param3;
                        if (((im) this).field_b < var9_int) {
                          var9_int = ((im) this).field_b;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      qq.a(((im) this).field_o, 0, param2, param1, var9_int);
                      param1 = param1 + var9_int;
                      ((im) this).field_d = ((im) this).field_d + (long)var9_int;
                      param3 = param3 - var9_int;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L7: {
                  if (((im) this).field_e != -1L) {
                    L8: {
                      if (~((im) this).field_e >= ~((im) this).field_d) {
                        break L8;
                      } else {
                        if (param3 > 0) {
                          L9: {
                            var9_int = (int)(-((im) this).field_d + ((im) this).field_e) + param1;
                            if (param1 + param3 < var9_int) {
                              var9_int = param1 - -param3;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (var9_int <= param1) {
                              break L8;
                            } else {
                              param3--;
                              int incrementValue$1 = param1;
                              param1++;
                              param2[incrementValue$1] = (byte) 0;
                              ((im) this).field_d = ((im) this).field_d + 1L;
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
                        if (~((im) this).field_e > ~var5_long) {
                          break L12;
                        } else {
                          if (~((im) this).field_e <= ~(var5_long - -(long)var8)) {
                            break L12;
                          } else {
                            var9 = ((im) this).field_e;
                            break L11;
                          }
                        }
                      }
                      if (var5_long < ((im) this).field_e) {
                        break L11;
                      } else {
                        if (~((long)((im) this).field_l + ((im) this).field_e) >= ~var5_long) {
                          break L11;
                        } else {
                          var9 = var5_long;
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (((im) this).field_e + (long)((im) this).field_l <= var5_long) {
                          break L14;
                        } else {
                          if (~((long)((im) this).field_l + ((im) this).field_e) >= ~((long)var8 + var5_long)) {
                            var11 = (long)((im) this).field_l + ((im) this).field_e;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (~(var5_long + (long)var8) >= ~((im) this).field_e) {
                        break L13;
                      } else {
                        if (~((long)var8 + var5_long) >= ~(((im) this).field_e - -(long)((im) this).field_l)) {
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
                      if (var11 <= var9) {
                        break L7;
                      } else {
                        var13 = (int)(-var9 + var11);
                        qq.a(((im) this).field_m, (int)(var9 + -((im) this).field_e), param2, (int)(var9 - var5_long) + var7, var13);
                        if (~((im) this).field_d <= ~var11) {
                          break L7;
                        } else {
                          param3 = (int)((long)param3 - (-((im) this).field_d + var11));
                          ((im) this).field_d = var11;
                          break L7;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                if (param3 <= 0) {
                  break L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1 + (param3 + -param2.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((im) this).field_n = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var5_ref;
            stackOut_63_1 = new StringBuilder().append("im.A(").append(param0).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L15;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L15;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + ',' + param3 + ')');
        }
    }

    final long c(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = im.a(90);
        }
        return ((im) this).field_a;
    }

    final void b(int param0) throws IOException {
        this.a((byte) 31);
        if (param0 != -22473) {
            ((im) this).field_e = -20L;
        }
        ((im) this).field_f.a(0);
    }

    final void a(int param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        if (param0 != -23669) {
            field_h = 5;
        }
        ((im) this).field_d = param1;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((im) this).a(-102, param0, param1, param1.length);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "im.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            im.e(-33);
        }
        return !hj.field_b ? true : false;
    }

    public static void e(int param0) {
        if (param0 < 7) {
            return;
        }
        field_c = null;
        field_j = null;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (((im) this).field_e != -1L) {
            L1: {
              if (((im) this).field_n != ((im) this).field_e) {
                ((im) this).field_f.a(((im) this).field_e, false);
                ((im) this).field_n = ((im) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((im) this).field_f.a(((im) this).field_l, 0, ((im) this).field_m, false);
              ((im) this).field_n = ((im) this).field_n + (long)((im) this).field_l;
              if (((im) this).field_n <= ((im) this).field_i) {
                break L2;
              } else {
                ((im) this).field_i = ((im) this).field_n;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (~((im) this).field_k < ~((im) this).field_e) {
                  break L4;
                } else {
                  if (((im) this).field_e >= (long)((im) this).field_b + ((im) this).field_k) {
                    break L4;
                  } else {
                    var2 = ((im) this).field_e;
                    break L3;
                  }
                }
              }
              if (~((im) this).field_k > ~((im) this).field_e) {
                break L3;
              } else {
                if (((im) this).field_k < (long)((im) this).field_l + ((im) this).field_e) {
                  var2 = ((im) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((im) this).field_k <= ~((long)((im) this).field_l + ((im) this).field_e)) {
                  break L6;
                } else {
                  if (((im) this).field_k + (long)((im) this).field_b < ((im) this).field_e - -(long)((im) this).field_l) {
                    break L6;
                  } else {
                    var4 = ((im) this).field_e - -(long)((im) this).field_l;
                    break L5;
                  }
                }
              }
              if (~((long)((im) this).field_b + ((im) this).field_k) >= ~((im) this).field_e) {
                break L5;
              } else {
                if (~(((im) this).field_k + (long)((im) this).field_b) >= ~(((im) this).field_e - -(long)((im) this).field_l)) {
                  var4 = (long)((im) this).field_b + ((im) this).field_k;
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
                if (~var4 < ~var2) {
                  var6 = (int)(var4 - var2);
                  qq.a(((im) this).field_m, (int)(-((im) this).field_e + var2), ((im) this).field_o, (int)(var2 + -((im) this).field_k), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((im) this).field_l = 0;
            ((im) this).field_e = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 >= 20) {
            break L8;
          } else {
            break L8;
          }
        }
    }

    im(bj param0, int param1, int param2) throws IOException {
        ((im) this).field_k = -1L;
        ((im) this).field_l = 0;
        ((im) this).field_e = -1L;
        try {
            ((im) this).field_f = param0;
            long dupTemp$0 = param0.b(0);
            ((im) this).field_i = dupTemp$0;
            ((im) this).field_a = dupTemp$0;
            ((im) this).field_m = new byte[param2];
            ((im) this).field_o = new byte[param1];
            ((im) this).field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        ((im) this).field_b = 0;
        if (~((im) this).field_n != ~((im) this).field_d) {
            ((im) this).field_f.a(((im) this).field_d, false);
            ((im) this).field_n = ((im) this).field_d;
        }
        ((im) this).field_k = ((im) this).field_d;
        int var2 = 0;
        while (((im) this).field_o.length > ((im) this).field_b) {
            var3 = -((im) this).field_b + ((im) this).field_o.length;
            if (!(var3 <= 200000000)) {
                var3 = 200000000;
            }
            var4 = ((im) this).field_f.a(var3, (byte) -90, ((im) this).field_o, ((im) this).field_b);
            if (var4 == -1) {
                break;
            }
            ((im) this).field_b = ((im) this).field_b + var4;
            ((im) this).field_n = ((im) this).field_n + (long)var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 480;
    }
}

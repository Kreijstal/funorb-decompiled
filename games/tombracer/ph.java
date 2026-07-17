/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph {
    private long field_d;
    private int field_a;
    private ml field_b;
    static float[] field_c;
    static String field_k;
    private long field_i;
    private int field_f;
    private byte[] field_e;
    static float[] field_n;
    private byte[] field_h;
    private long field_m;
    private long field_g;
    private long field_j;
    private long field_l;

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (((ph) this).field_l != -1L) {
            L1: {
              if (((ph) this).field_j == ((ph) this).field_l) {
                break L1;
              } else {
                ((ph) this).field_b.a(0, ((ph) this).field_l);
                ((ph) this).field_j = ((ph) this).field_l;
                break L1;
              }
            }
            L2: {
              ((ph) this).field_b.a(0, 0, ((ph) this).field_f, ((ph) this).field_e);
              ((ph) this).field_j = ((ph) this).field_j + (long)((ph) this).field_f;
              if (~((ph) this).field_j >= ~((ph) this).field_i) {
                break L2;
              } else {
                ((ph) this).field_i = ((ph) this).field_j;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((ph) this).field_l < ((ph) this).field_m) {
                  break L4;
                } else {
                  if (~(((ph) this).field_m - -(long)((ph) this).field_a) < ~((ph) this).field_l) {
                    var2 = ((ph) this).field_l;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((ph) this).field_l > ((ph) this).field_m) {
                break L3;
              } else {
                if (~((long)((ph) this).field_f + ((ph) this).field_l) >= ~((ph) this).field_m) {
                  break L3;
                } else {
                  var2 = ((ph) this).field_m;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~(((ph) this).field_l - -(long)((ph) this).field_f) >= ~((ph) this).field_m) {
                  break L6;
                } else {
                  if (((ph) this).field_l - -(long)((ph) this).field_f <= ((ph) this).field_m - -(long)((ph) this).field_a) {
                    var4 = (long)((ph) this).field_f + ((ph) this).field_l;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((long)((ph) this).field_a + ((ph) this).field_m <= ((ph) this).field_l) {
                break L5;
              } else {
                if (~((long)((ph) this).field_a + ((ph) this).field_m) < ~((long)((ph) this).field_f + ((ph) this).field_l)) {
                  break L5;
                } else {
                  var4 = ((ph) this).field_m + (long)((ph) this).field_a;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (~var4 >= ~var2) {
                  break L7;
                } else {
                  var6 = (int)(var4 - var2);
                  lua.a(((ph) this).field_e, (int)(-((ph) this).field_l + var2), ((ph) this).field_h, (int)(-((ph) this).field_m + var2), var6);
                  break L7;
                }
              }
            }
            ((ph) this).field_f = 0;
            ((ph) this).field_l = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) -16);
        ((ph) this).field_b.b((byte) -127);
        if (param0 >= -14) {
            ph.a(false);
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          ((ph) this).field_a = 0;
          if (((ph) this).field_g != ((ph) this).field_j) {
            ((ph) this).field_b.a(0, ((ph) this).field_g);
            ((ph) this).field_j = ((ph) this).field_g;
            break L0;
          } else {
            break L0;
          }
        }
        ((ph) this).field_m = ((ph) this).field_g;
        L1: while (true) {
          L2: {
            if (((ph) this).field_a >= ((ph) this).field_h.length) {
              break L2;
            } else {
              L3: {
                var2 = ((ph) this).field_h.length + -((ph) this).field_a;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((ph) this).field_b.a((byte) 69, ((ph) this).field_h, var2, ((ph) this).field_a);
              if (-1 == var3) {
                break L2;
              } else {
                ((ph) this).field_j = ((ph) this).field_j + (long)var3;
                ((ph) this).field_a = ((ph) this).field_a + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            ((ph) this).a(param0, param0.length, param1, (byte) -112);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ph.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final long b(boolean param0) {
        if (!param0) {
            return -88L;
        }
        return ((ph) this).field_d;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_k = null;
        field_c = null;
        if (!param0) {
            ph.a(false);
        }
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ph) this).field_g - -(long)param3 > ((ph) this).field_d) {
                ((ph) this).field_d = (long)param3 + ((ph) this).field_g;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1L == ((ph) this).field_l) {
                break L2;
              } else {
                if (~((ph) this).field_g <= ~((ph) this).field_l) {
                  if (~((long)((ph) this).field_f + ((ph) this).field_l) <= ~((ph) this).field_g) {
                    break L2;
                  } else {
                    this.a((byte) -16);
                    break L2;
                  }
                } else {
                  this.a((byte) -16);
                  break L2;
                }
              }
            }
            L3: {
              if (((ph) this).field_l == -1L) {
                break L3;
              } else {
                if (~(((ph) this).field_l - -(long)((ph) this).field_e.length) > ~((long)param3 + ((ph) this).field_g)) {
                  var5_int = (int)((long)((ph) this).field_e.length - (-((ph) this).field_l + ((ph) this).field_g));
                  lua.a(param0, param1, ((ph) this).field_e, (int)(((ph) this).field_g - ((ph) this).field_l), var5_int);
                  ((ph) this).field_g = ((ph) this).field_g + (long)var5_int;
                  param1 = param1 + var5_int;
                  param3 = param3 - var5_int;
                  ((ph) this).field_f = ((ph) this).field_e.length;
                  this.a((byte) -16);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (((ph) this).field_e.length >= param3) {
              if (param3 > 0) {
                L4: {
                  if (((ph) this).field_l != -1L) {
                    break L4;
                  } else {
                    ((ph) this).field_l = ((ph) this).field_g;
                    break L4;
                  }
                }
                L5: {
                  lua.a(param0, param1, ((ph) this).field_e, (int)(-((ph) this).field_l + ((ph) this).field_g), param3);
                  ((ph) this).field_g = ((ph) this).field_g + (long)param3;
                  if (~(-((ph) this).field_l + ((ph) this).field_g) >= ~(long)((ph) this).field_f) {
                    break L5;
                  } else {
                    ((ph) this).field_f = (int)(((ph) this).field_g + -((ph) this).field_l);
                    break L5;
                  }
                }
                return;
              } else {
                L6: {
                  if (param2 == -17) {
                    break L6;
                  } else {
                    ((ph) this).field_b = null;
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              L7: {
                if (((ph) this).field_g != ((ph) this).field_j) {
                  ((ph) this).field_b.a(0, ((ph) this).field_g);
                  ((ph) this).field_j = ((ph) this).field_g;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                ((ph) this).field_b.a(param1, 0, param3, param0);
                ((ph) this).field_j = ((ph) this).field_j + (long)param3;
                if (~((ph) this).field_i <= ~((ph) this).field_j) {
                  break L8;
                } else {
                  ((ph) this).field_i = ((ph) this).field_j;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((ph) this).field_g < ((ph) this).field_m) {
                    break L10;
                  } else {
                    if (~(((ph) this).field_m - -(long)((ph) this).field_a) >= ~((ph) this).field_g) {
                      break L10;
                    } else {
                      var5_long = ((ph) this).field_g;
                      break L9;
                    }
                  }
                }
                if (((ph) this).field_m < ((ph) this).field_g) {
                  break L9;
                } else {
                  if (~((ph) this).field_m > ~(((ph) this).field_g + (long)param3)) {
                    var5_long = ((ph) this).field_m;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  if (~((ph) this).field_m <= ~((long)param3 + ((ph) this).field_g)) {
                    break L12;
                  } else {
                    if (~(((ph) this).field_m + (long)((ph) this).field_a) > ~((long)param3 + ((ph) this).field_g)) {
                      break L12;
                    } else {
                      var7 = ((ph) this).field_g - -(long)param3;
                      break L11;
                    }
                  }
                }
                if (~((long)((ph) this).field_a + ((ph) this).field_m) >= ~((ph) this).field_g) {
                  break L11;
                } else {
                  if (~((long)param3 + ((ph) this).field_g) <= ~((long)((ph) this).field_a + ((ph) this).field_m)) {
                    var7 = ((ph) this).field_m - -(long)((ph) this).field_a;
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
                  if (~var7 >= ~var5_long) {
                    break L13;
                  } else {
                    var9 = (int)(var7 + -var5_long);
                    lua.a(param0, (int)((long)param1 + (var5_long - ((ph) this).field_g)), ((ph) this).field_h, (int)(-((ph) this).field_m + var5_long), var9);
                    break L13;
                  }
                }
              }
              ((ph) this).field_g = ((ph) this).field_g + (long)param3;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ph) this).field_j = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("ph.C(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
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
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 + param2 <= param0.length) {
              L1: {
                if (((ph) this).field_l == -1L) {
                  break L1;
                } else {
                  if (~((ph) this).field_g > ~((ph) this).field_l) {
                    break L1;
                  } else {
                    if (~(((ph) this).field_l + (long)((ph) this).field_f) <= ~((long)param1 + ((ph) this).field_g)) {
                      lua.a(((ph) this).field_e, (int)(-((ph) this).field_l + ((ph) this).field_g), param0, param2, param1);
                      ((ph) this).field_g = ((ph) this).field_g + (long)param1;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param3 <= -22) {
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var5_long = ((ph) this).field_g;
                var7 = param2;
                var8 = param1;
                if (((ph) this).field_m > ((ph) this).field_g) {
                  break L3;
                } else {
                  if (((ph) this).field_g >= ((ph) this).field_m + (long)((ph) this).field_a) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)(-((ph) this).field_g - -((ph) this).field_m + (long)((ph) this).field_a);
                      if (var9_int <= param1) {
                        break L4;
                      } else {
                        var9_int = param1;
                        break L4;
                      }
                    }
                    lua.a(((ph) this).field_h, (int)(-((ph) this).field_m + ((ph) this).field_g), param0, param2, var9_int);
                    ((ph) this).field_g = ((ph) this).field_g + (long)var9_int;
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (((ph) this).field_h.length < param1) {
                  ((ph) this).field_b.a(0, ((ph) this).field_g);
                  ((ph) this).field_j = ((ph) this).field_g;
                  L6: while (true) {
                    if (param1 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((ph) this).field_b.a((byte) 80, param0, param1, param2);
                      if (var9_int == -1) {
                        break L5;
                      } else {
                        param2 = param2 + var9_int;
                        ((ph) this).field_j = ((ph) this).field_j + (long)var9_int;
                        ((ph) this).field_g = ((ph) this).field_g + (long)var9_int;
                        param1 = param1 - var9_int;
                        continue L6;
                      }
                    }
                  }
                } else {
                  if (param1 > 0) {
                    L7: {
                      this.a(-1);
                      var9_int = param1;
                      if (((ph) this).field_a < var9_int) {
                        var9_int = ((ph) this).field_a;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    lua.a(((ph) this).field_h, 0, param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    ((ph) this).field_g = ((ph) this).field_g + (long)var9_int;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L8: {
                if (((ph) this).field_l != -1L) {
                  L9: {
                    if (((ph) this).field_g >= ((ph) this).field_l) {
                      break L9;
                    } else {
                      if (param1 > 0) {
                        L10: {
                          var9_int = param2 - -(int)(((ph) this).field_l - ((ph) this).field_g);
                          if (param1 + param2 >= var9_int) {
                            break L10;
                          } else {
                            var9_int = param2 - -param1;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param2) {
                            break L9;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param0[incrementValue$1] = (byte) 0;
                            param1--;
                            ((ph) this).field_g = ((ph) this).field_g + 1L;
                            continue L11;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var9 = -1L;
                      var11 = -1L;
                      if (var5_long > ((ph) this).field_l) {
                        break L13;
                      } else {
                        if (~((ph) this).field_l > ~(var5_long + (long)var8)) {
                          var9 = ((ph) this).field_l;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var5_long < ((ph) this).field_l) {
                      break L12;
                    } else {
                      if (~var5_long > ~((long)((ph) this).field_f + ((ph) this).field_l)) {
                        var9 = var5_long;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if (var5_long >= ((ph) this).field_l - -(long)((ph) this).field_f) {
                        break L15;
                      } else {
                        if (~((long)var8 + var5_long) > ~((long)((ph) this).field_f + ((ph) this).field_l)) {
                          break L15;
                        } else {
                          var11 = (long)((ph) this).field_f + ((ph) this).field_l;
                          break L14;
                        }
                      }
                    }
                    if (var5_long + (long)var8 <= ((ph) this).field_l) {
                      break L14;
                    } else {
                      if (~((long)((ph) this).field_f + ((ph) this).field_l) <= ~(var5_long + (long)var8)) {
                        var11 = var5_long - -(long)var8;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (-1L >= var9) {
                    break L8;
                  } else {
                    if (~var9 > ~var11) {
                      var13 = (int)(var11 + -var9);
                      lua.a(((ph) this).field_e, (int)(-((ph) this).field_l + var9), param0, var7 - -(int)(-var5_long + var9), var13);
                      if (((ph) this).field_g >= var11) {
                        break L8;
                      } else {
                        param1 = (int)((long)param1 - (var11 + -((ph) this).field_g));
                        ((ph) this).field_g = var11;
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
              if (0 < param1) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1 + param2 + -param0.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ph) this).field_j = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5_ref;
            stackOut_62_1 = new StringBuilder().append("ph.A(");
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L16;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L16;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    ph(ml param0, int param1, int param2) throws IOException {
        ((ph) this).field_m = -1L;
        ((ph) this).field_l = -1L;
        ((ph) this).field_f = 0;
        try {
            ((ph) this).field_b = param0;
            long dupTemp$0 = param0.a(false);
            ((ph) this).field_i = dupTemp$0;
            ((ph) this).field_d = dupTemp$0;
            ((ph) this).field_g = 0L;
            ((ph) this).field_e = new byte[param2];
            ((ph) this).field_h = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ph.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((ph) this).field_g = param1;
        int var4 = -100 % ((param0 - -58) / 50);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_c = new float[16384];
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_n[var2] = (float)Math.sin(var0 * (double)var2);
            field_c[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}

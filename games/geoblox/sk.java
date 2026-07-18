/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    private int field_i;
    private long field_c;
    private int field_d;
    private long field_e;
    private pa field_a;
    private long field_k;
    private long field_g;
    private byte[] field_j;
    private byte[] field_h;
    private long field_b;
    private long field_f;

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Geoblox.field_C;
          if (((sk) this).field_c == -1L) {
            break L0;
          } else {
            L1: {
              if (~((sk) this).field_b != ~((sk) this).field_c) {
                ((sk) this).field_a.a(((sk) this).field_c, true);
                ((sk) this).field_b = ((sk) this).field_c;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((sk) this).field_a.a(((sk) this).field_j, 0, 90, ((sk) this).field_d);
              ((sk) this).field_b = ((sk) this).field_b + (long)((sk) this).field_d;
              if (~((sk) this).field_b >= ~((sk) this).field_e) {
                break L2;
              } else {
                ((sk) this).field_e = ((sk) this).field_b;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((sk) this).field_c < ((sk) this).field_g) {
                  break L4;
                } else {
                  if (~((long)((sk) this).field_i + ((sk) this).field_g) < ~((sk) this).field_c) {
                    var2 = ((sk) this).field_c;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((sk) this).field_c > ((sk) this).field_g) {
                break L3;
              } else {
                if (~((sk) this).field_g > ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                  var2 = ((sk) this).field_g;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~((sk) this).field_g <= ~(((sk) this).field_c + (long)((sk) this).field_d)) {
                  break L6;
                } else {
                  if (((sk) this).field_g - -(long)((sk) this).field_i < (long)((sk) this).field_d + ((sk) this).field_c) {
                    break L6;
                  } else {
                    var4 = (long)((sk) this).field_d + ((sk) this).field_c;
                    break L5;
                  }
                }
              }
              if (~((long)((sk) this).field_i + ((sk) this).field_g) >= ~((sk) this).field_c) {
                break L5;
              } else {
                if (~(((sk) this).field_c + (long)((sk) this).field_d) > ~((long)((sk) this).field_i + ((sk) this).field_g)) {
                  break L5;
                } else {
                  var4 = ((sk) this).field_g - -(long)((sk) this).field_i;
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
                  sf.a(((sk) this).field_j, (int)(-((sk) this).field_c + var2), ((sk) this).field_h, (int)(-((sk) this).field_g + var2), var6);
                  break L7;
                }
              }
            }
            ((sk) this).field_d = 0;
            ((sk) this).field_c = -1L;
            break L0;
          }
        }
        L8: {
          if (param0 > 60) {
            break L8;
          } else {
            ((sk) this).field_e = 28L;
            break L8;
          }
        }
    }

    final void b(int param0) throws IOException {
        this.b((byte) 91);
        ((sk) this).field_a.a((byte) -5);
        if (param0 != 27034) {
        }
    }

    final long a(byte param0) {
        if (param0 != 46) {
            ((sk) this).field_h = null;
        }
        return ((sk) this).field_k;
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
        var14 = Geoblox.field_C;
        try {
          L0: {
            if (param1 + param2 > param0.length) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
            } else {
              L1: {
                if (-1L == ((sk) this).field_c) {
                  break L1;
                } else {
                  if (((sk) this).field_f < ((sk) this).field_c) {
                    break L1;
                  } else {
                    if ((long)((sk) this).field_d + ((sk) this).field_c >= (long)param1 + ((sk) this).field_f) {
                      sf.a(((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), param0, param2, param1);
                      ((sk) this).field_f = ((sk) this).field_f + (long)param1;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((sk) this).field_f;
                var7 = param2;
                var8 = param1;
                if (param3 == 9868) {
                  break L2;
                } else {
                  boolean discarded$3 = sk.a(-115);
                  break L2;
                }
              }
              L3: {
                if (~((sk) this).field_f > ~((sk) this).field_g) {
                  break L3;
                } else {
                  if (~((long)((sk) this).field_i + ((sk) this).field_g) >= ~((sk) this).field_f) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)((long)((sk) this).field_i - ((sk) this).field_f - -((sk) this).field_g);
                      if (param1 >= var9_int) {
                        break L4;
                      } else {
                        var9_int = param1;
                        break L4;
                      }
                    }
                    sf.a(((sk) this).field_h, (int)(-((sk) this).field_g + ((sk) this).field_f), param0, param2, var9_int);
                    param1 = param1 - var9_int;
                    ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (((sk) this).field_h.length >= param1) {
                  if (param1 <= 0) {
                    break L5;
                  } else {
                    L6: {
                      int discarded$4 = 1;
                      this.a();
                      var9_int = param1;
                      if (((sk) this).field_i < var9_int) {
                        var9_int = ((sk) this).field_i;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    sf.a(((sk) this).field_h, 0, param0, param2, var9_int);
                    param1 = param1 - var9_int;
                    param2 = param2 + var9_int;
                    ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                    break L5;
                  }
                } else {
                  ((sk) this).field_a.a(((sk) this).field_f, true);
                  ((sk) this).field_b = ((sk) this).field_f;
                  L7: while (true) {
                    if (param1 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((sk) this).field_a.a(param1, param0, param2, false);
                      if (-1 != var9_int) {
                        ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                        ((sk) this).field_b = ((sk) this).field_b + (long)var9_int;
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        continue L7;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L8: {
                if (-1L != ((sk) this).field_c) {
                  L9: {
                    if (~((sk) this).field_c >= ~((sk) this).field_f) {
                      break L9;
                    } else {
                      if (param1 <= 0) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = param2 + (int)(-((sk) this).field_f + ((sk) this).field_c);
                          if (param2 + param1 < var9_int) {
                            var9_int = param2 + param1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param2) {
                            break L9;
                          } else {
                            param1--;
                            int incrementValue$5 = param2;
                            param2++;
                            param0[incrementValue$5] = (byte) 0;
                            ((sk) this).field_f = ((sk) this).field_f + 1L;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var9 = -1L;
                      if (~((sk) this).field_c > ~var5_long) {
                        break L13;
                      } else {
                        if (~((sk) this).field_c <= ~((long)var8 + var5_long)) {
                          break L13;
                        } else {
                          var9 = ((sk) this).field_c;
                          break L12;
                        }
                      }
                    }
                    if (~((sk) this).field_c < ~var5_long) {
                      break L12;
                    } else {
                      if (var5_long < ((sk) this).field_c - -(long)((sk) this).field_d) {
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
                      if (~var5_long <= ~((long)((sk) this).field_d + ((sk) this).field_c)) {
                        break L15;
                      } else {
                        if ((long)var8 + var5_long < (long)((sk) this).field_d + ((sk) this).field_c) {
                          break L15;
                        } else {
                          var11 = ((sk) this).field_c + (long)((sk) this).field_d;
                          break L14;
                        }
                      }
                    }
                    if (((sk) this).field_c >= var5_long - -(long)var8) {
                      break L14;
                    } else {
                      if (~(var5_long + (long)var8) < ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                        break L14;
                      } else {
                        var11 = (long)var8 + var5_long;
                        break L14;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L8;
                  } else {
                    if (var9 < var11) {
                      var13 = (int)(-var9 + var11);
                      sf.a(((sk) this).field_j, (int)(var9 - ((sk) this).field_c), param0, var7 + (int)(-var5_long + var9), var13);
                      if (var11 <= ((sk) this).field_f) {
                        break L8;
                      } else {
                        param1 = (int)((long)param1 - (var11 - ((sk) this).field_f));
                        ((sk) this).field_f = var11;
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
              if (param1 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((sk) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("sk.B(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L16;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L16;
            }
          }
          throw t.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        pa stackIn_18_0 = null;
        long stackIn_18_1 = 0L;
        pa stackIn_19_0 = null;
        long stackIn_19_1 = 0L;
        pa stackIn_20_0 = null;
        long stackIn_20_1 = 0L;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        pa stackOut_17_0 = null;
        long stackOut_17_1 = 0L;
        pa stackOut_19_0 = null;
        long stackOut_19_1 = 0L;
        int stackOut_19_2 = 0;
        pa stackOut_18_0 = null;
        long stackOut_18_1 = 0L;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (~((sk) this).field_k <= ~((long)param0 + ((sk) this).field_f)) {
                break L1;
              } else {
                ((sk) this).field_k = (long)param0 + ((sk) this).field_f;
                break L1;
              }
            }
            L2: {
              if (-1L == ((sk) this).field_c) {
                break L2;
              } else {
                if (~((sk) this).field_c >= ~((sk) this).field_f) {
                  if (~((sk) this).field_f >= ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                    break L2;
                  } else {
                    this.b((byte) 99);
                    break L2;
                  }
                } else {
                  this.b((byte) 99);
                  break L2;
                }
              }
            }
            L3: {
              if (-1L == ((sk) this).field_c) {
                break L3;
              } else {
                if ((long)param0 + ((sk) this).field_f <= (long)((sk) this).field_j.length + ((sk) this).field_c) {
                  break L3;
                } else {
                  var5_int = (int)((long)((sk) this).field_j.length + ((sk) this).field_c + -((sk) this).field_f);
                  sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), var5_int);
                  ((sk) this).field_f = ((sk) this).field_f + (long)var5_int;
                  param1 = param1 + var5_int;
                  param0 = param0 - var5_int;
                  ((sk) this).field_d = ((sk) this).field_j.length;
                  this.b((byte) 127);
                  break L3;
                }
              }
            }
            if (!param3) {
              if (param0 > ((sk) this).field_j.length) {
                L4: {
                  if (((sk) this).field_f == ((sk) this).field_b) {
                    break L4;
                  } else {
                    L5: {
                      stackOut_17_0 = ((sk) this).field_a;
                      stackOut_17_1 = ((sk) this).field_f;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (param3) {
                        stackOut_19_0 = (pa) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L5;
                      } else {
                        stackOut_18_0 = (pa) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L5;
                      }
                    }
                    ((pa) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2 != 0);
                    ((sk) this).field_b = ((sk) this).field_f;
                    break L4;
                  }
                }
                L6: {
                  ((sk) this).field_a.a(param2, param1, 90, param0);
                  ((sk) this).field_b = ((sk) this).field_b + (long)param0;
                  if (~((sk) this).field_b < ~((sk) this).field_e) {
                    ((sk) this).field_e = ((sk) this).field_b;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var5_long = -1L;
                    var7 = -1L;
                    if (~((sk) this).field_g < ~((sk) this).field_f) {
                      break L8;
                    } else {
                      if (~((sk) this).field_f > ~(((sk) this).field_g - -(long)((sk) this).field_i)) {
                        var5_long = ((sk) this).field_f;
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (~((sk) this).field_g > ~((sk) this).field_f) {
                    break L7;
                  } else {
                    if (~((sk) this).field_g <= ~(((sk) this).field_f - -(long)param0)) {
                      break L7;
                    } else {
                      var5_long = ((sk) this).field_g;
                      break L7;
                    }
                  }
                }
                L9: {
                  L10: {
                    if (~((sk) this).field_g <= ~((long)param0 + ((sk) this).field_f)) {
                      break L10;
                    } else {
                      if (~((long)((sk) this).field_i + ((sk) this).field_g) > ~(((sk) this).field_f + (long)param0)) {
                        break L10;
                      } else {
                        var7 = ((sk) this).field_f - -(long)param0;
                        break L9;
                      }
                    }
                  }
                  if (((sk) this).field_f >= ((sk) this).field_g - -(long)((sk) this).field_i) {
                    break L9;
                  } else {
                    if (~(((sk) this).field_g + (long)((sk) this).field_i) < ~(((sk) this).field_f - -(long)param0)) {
                      break L9;
                    } else {
                      var7 = (long)((sk) this).field_i + ((sk) this).field_g;
                      break L9;
                    }
                  }
                }
                L11: {
                  if (var5_long <= -1L) {
                    break L11;
                  } else {
                    if (~var5_long > ~var7) {
                      var9 = (int)(-var5_long + var7);
                      sf.a(param2, (int)(var5_long + ((long)param1 + -((sk) this).field_f)), ((sk) this).field_h, (int)(var5_long + -((sk) this).field_g), var9);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                return;
              } else {
                if (param0 <= 0) {
                  break L0;
                } else {
                  L12: {
                    if (((sk) this).field_c != -1L) {
                      break L12;
                    } else {
                      ((sk) this).field_c = ((sk) this).field_f;
                      break L12;
                    }
                  }
                  L13: {
                    sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), param0);
                    ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                    if (~(long)((sk) this).field_d <= ~(-((sk) this).field_c + ((sk) this).field_f)) {
                      break L13;
                    } else {
                      ((sk) this).field_d = (int)(((sk) this).field_f + -((sk) this).field_c);
                      break L13;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((sk) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5_ref;
            stackOut_52_1 = new StringBuilder().append("sk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L14;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L14;
            }
          }
          throw t.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            ((sk) this).a(param1, param1.length, 0, 9868);
            int var3_int = -83 / ((param0 - -9) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          ((sk) this).field_i = 0;
          if (~((sk) this).field_b == ~((sk) this).field_f) {
            break L0;
          } else {
            ((sk) this).field_a.a(((sk) this).field_f, true);
            ((sk) this).field_b = ((sk) this).field_f;
            break L0;
          }
        }
        ((sk) this).field_g = ((sk) this).field_f;
        L1: while (true) {
          L2: {
            if (((sk) this).field_i >= ((sk) this).field_h.length) {
              break L2;
            } else {
              L3: {
                var2 = -((sk) this).field_i + ((sk) this).field_h.length;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((sk) this).field_a.a(var2, ((sk) this).field_h, ((sk) this).field_i, false);
              if (var3 == -1) {
                break L2;
              } else {
                ((sk) this).field_i = ((sk) this).field_i + var3;
                ((sk) this).field_b = ((sk) this).field_b + (long)var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        int var4 = -65 / ((-57 - param0) / 37);
        ((sk) this).field_f = param1;
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        float var2 = 0.0f;
        ja var3 = null;
        wd var3_ref = null;
        wd var4 = null;
        int var5 = 0;
        ja var6 = null;
        int var7 = 0;
        ja var8 = null;
        ja var9 = null;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_4_0 = 0;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                boolean discarded$1 = sk.a(3);
                break L1;
              }
            }
            if (!el.field_o.field_H) {
              bk.field_a.e();
              if (ld.a(-61)) {
                el.field_o.d((byte) 116);
                sh.field_y.a(255);
                var1_ref = (ja) (Object) a.field_d.a(false);
                var2 = (-320.0f + var1_ref.field_o) * (-320.0f + var1_ref.field_o) + (var1_ref.field_v - 240.0f) * (var1_ref.field_v - 240.0f);
                var3 = (ja) (Object) a.field_d.a(false);
                L2: while (true) {
                  if (var3 == null) {
                    var3_ref = new wd();
                    var4 = new wd();
                    var5 = 0;
                    var3_ref.a((rc) (Object) var1_ref, false);
                    L3: while (true) {
                      var6 = (ja) (Object) var3_ref.a(true);
                      if (var6 == null) {
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0 != 0;
                      } else {
                        var6.field_z = 6;
                        var6.field_r = var5;
                        var5 += 50;
                        var4.a((rc) (Object) var6, false);
                        var7 = 0;
                        L4: while (true) {
                          if (var7 >= var6.field_L) {
                            continue L3;
                          } else {
                            var8 = var6.field_n[var7];
                            var9 = (ja) (Object) var4.c((byte) 121);
                            L5: while (true) {
                              L6: {
                                if (var9 == null) {
                                  var9 = (ja) (Object) var3_ref.c((byte) 121);
                                  L7: while (true) {
                                    if (var9 == null) {
                                      var3_ref.a(-82, (rc) (Object) var8);
                                      break L6;
                                    } else {
                                      if (var9 != var8) {
                                        var9 = (ja) (Object) var3_ref.a(69);
                                        continue L7;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                } else {
                                  if (var9 != var8) {
                                    var9 = (ja) (Object) var4.a(param0 ^ 24);
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var7++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L8: {
                      if (var2 < (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (-240.0f + var3.field_v) * (-240.0f + var3.field_v)) {
                        var2 = (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (var3.field_v - 240.0f) * (-240.0f + var3.field_v);
                        var1_ref = var3;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var3 = (ja) (Object) a.field_d.b(0);
                    continue L2;
                  }
                }
              } else {
                sh.field_y.a(255);
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "sk.D(" + param0 + ')');
        }
        return stackIn_33_0 != 0;
    }

    sk(pa param0, int param1, int param2) throws IOException {
        ((sk) this).field_d = 0;
        ((sk) this).field_c = -1L;
        ((sk) this).field_g = -1L;
        try {
            ((sk) this).field_a = param0;
            long dupTemp$0 = param0.a(1);
            ((sk) this).field_e = dupTemp$0;
            ((sk) this).field_k = dupTemp$0;
            ((sk) this).field_j = new byte[param2];
            ((sk) this).field_h = new byte[param1];
            ((sk) this).field_f = 0L;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}

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
        RuntimeException var2 = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (((sk) this).field_c == -1L) {
                break L1;
              } else {
                L2: {
                  if (~((sk) this).field_b != ~((sk) this).field_c) {
                    ((sk) this).field_a.a(((sk) this).field_c, true);
                    ((sk) this).field_b = ((sk) this).field_c;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  ((sk) this).field_a.a(((sk) this).field_j, 0, 90, ((sk) this).field_d);
                  ((sk) this).field_b = ((sk) this).field_b + (long)((sk) this).field_d;
                  if (~((sk) this).field_b >= ~((sk) this).field_e) {
                    break L3;
                  } else {
                    ((sk) this).field_e = ((sk) this).field_b;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    L6: {
                      var2_long = -1L;
                      var4 = -1L;
                      if (((sk) this).field_c < ((sk) this).field_g) {
                        break L6;
                      } else {
                        if (~((long)((sk) this).field_i + ((sk) this).field_g) < ~((sk) this).field_c) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (((sk) this).field_c > ((sk) this).field_g) {
                      break L4;
                    } else {
                      if (~((sk) this).field_g > ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                        var2_long = ((sk) this).field_g;
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_long = ((sk) this).field_c;
                  break L4;
                }
                L7: {
                  L8: {
                    if (~((sk) this).field_g <= ~(((sk) this).field_c + (long)((sk) this).field_d)) {
                      break L8;
                    } else {
                      if (((sk) this).field_g - -(long)((sk) this).field_i < (long)((sk) this).field_d + ((sk) this).field_c) {
                        break L8;
                      } else {
                        var4 = (long)((sk) this).field_d + ((sk) this).field_c;
                        if (var7 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  if (~((long)((sk) this).field_i + ((sk) this).field_g) >= ~((sk) this).field_c) {
                    break L7;
                  } else {
                    if (~(((sk) this).field_c + (long)((sk) this).field_d) > ~((long)((sk) this).field_i + ((sk) this).field_g)) {
                      break L7;
                    } else {
                      var4 = ((sk) this).field_g - -(long)((sk) this).field_i;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var2_long <= -1L) {
                    break L9;
                  } else {
                    if (var4 <= var2_long) {
                      break L9;
                    } else {
                      var6 = (int)(var4 + -var2_long);
                      sf.a(((sk) this).field_j, (int)(-((sk) this).field_c + var2_long), ((sk) this).field_h, (int)(-((sk) this).field_g + var2_long), var6);
                      break L9;
                    }
                  }
                }
                ((sk) this).field_d = 0;
                ((sk) this).field_c = -1L;
                break L1;
              }
            }
            L10: {
              if (param0 > 60) {
                break L10;
              } else {
                ((sk) this).field_e = 28L;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sk.H(" + param0 + ')');
        }
    }

    final void b(int param0) throws IOException {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b((byte) 91);
              ((sk) this).field_a.a((byte) -5);
              if (param0 == 27034) {
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sk.A(" + param0 + ')');
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        try {
          L0: {
            L1: {
              if (param0 == 46) {
                break L1;
              } else {
                ((sk) this).field_h = null;
                break L1;
              }
            }
            stackOut_3_0 = ((sk) this).field_k;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sk.E(" + param0 + ')');
        }
        return stackIn_4_0;
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
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var14 = Geoblox.field_C;
        try {
          L0: {
            if (~(param1 + param2) < ~param0.length) {
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
                  boolean discarded$2 = sk.a(-115);
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
                      if (~param1 <= ~var9_int) {
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
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        if (((sk) this).field_h.length >= param1) {
                          break L9;
                        } else {
                          ((sk) this).field_a.a(((sk) this).field_f, true);
                          ((sk) this).field_b = ((sk) this).field_f;
                          L10: while (true) {
                            if (param1 <= 0) {
                              break L8;
                            } else {
                              var9_int = ((sk) this).field_a.a(param1, param0, param2, false);
                              stackOut_30_0 = -1;
                              stackOut_30_1 = var9_int;
                              stackIn_50_0 = stackOut_30_0;
                              stackIn_50_1 = stackOut_30_1;
                              stackIn_31_0 = stackOut_30_0;
                              stackIn_31_1 = stackOut_30_1;
                              if (var14 != 0) {
                                break L7;
                              } else {
                                L11: {
                                  if (stackIn_31_0 != stackIn_31_1) {
                                    break L11;
                                  } else {
                                    if (var14 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                                ((sk) this).field_b = ((sk) this).field_b + (long)var9_int;
                                param1 = param1 - var9_int;
                                param2 = param2 + var9_int;
                                if (var14 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1 <= 0) {
                        break L8;
                      } else {
                        L12: {
                          this.a(true);
                          var9_int = param1;
                          if (((sk) this).field_i < var9_int) {
                            var9_int = ((sk) this).field_i;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        sf.a(((sk) this).field_h, 0, param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                        break L8;
                      }
                    }
                    if (-1L != ((sk) this).field_c) {
                      if (~((sk) this).field_c >= ~((sk) this).field_f) {
                        break L6;
                      } else {
                        stackOut_48_0 = -1;
                        stackOut_48_1 = ~param1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        break L7;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (stackIn_50_0 <= stackIn_50_1) {
                    break L6;
                  } else {
                    L13: {
                      var9_int = param2 + (int)(-((sk) this).field_f + ((sk) this).field_c);
                      if (param2 + param1 < var9_int) {
                        var9_int = param2 + param1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: while (true) {
                      if (~var9_int >= ~param2) {
                        break L6;
                      } else {
                        param1--;
                        int incrementValue$3 = param2;
                        param2++;
                        param0[incrementValue$3] = (byte) 0;
                        ((sk) this).field_f = ((sk) this).field_f + 1L;
                        if (var14 != 0) {
                          break L5;
                        } else {
                          if (var14 == 0) {
                            continue L14;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                }
                L15: {
                  L16: {
                    var9 = -1L;
                    if (~((sk) this).field_c > ~var5_long) {
                      break L16;
                    } else {
                      if (~((sk) this).field_c <= ~((long)var8 + var5_long)) {
                        break L16;
                      } else {
                        var9 = ((sk) this).field_c;
                        if (var14 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  if (~((sk) this).field_c < ~var5_long) {
                    break L15;
                  } else {
                    if (var5_long < ((sk) this).field_c - -(long)((sk) this).field_d) {
                      var9 = var5_long;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  L18: {
                    var11 = -1L;
                    if (~var5_long <= ~((long)((sk) this).field_d + ((sk) this).field_c)) {
                      break L18;
                    } else {
                      if ((long)var8 + var5_long < (long)((sk) this).field_d + ((sk) this).field_c) {
                        break L18;
                      } else {
                        var11 = ((sk) this).field_c + (long)((sk) this).field_d;
                        if (var14 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  if (((sk) this).field_c >= var5_long - -(long)var8) {
                    break L17;
                  } else {
                    if (~(var5_long + (long)var8) < ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                      break L17;
                    } else {
                      var11 = (long)var8 + var5_long;
                      break L17;
                    }
                  }
                }
                if (var9 <= -1L) {
                  break L5;
                } else {
                  if (var9 < var11) {
                    var13 = (int)(-var9 + var11);
                    sf.a(((sk) this).field_j, (int)(var9 - ((sk) this).field_c), param0, var7 + (int)(-var5_long + var9), var13);
                    if (var11 <= ((sk) this).field_f) {
                      break L5;
                    } else {
                      param1 = (int)((long)param1 - (var11 - ((sk) this).field_f));
                      ((sk) this).field_f = var11;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
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
          L19: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var5_ref;
            stackOut_101_1 = new StringBuilder().append("sk.B(");
            stackIn_104_0 = stackOut_101_0;
            stackIn_104_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param0 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L19;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_105_0 = stackOut_102_0;
              stackIn_105_1 = stackOut_102_1;
              stackIn_105_2 = stackOut_102_2;
              break L19;
            }
          }
          throw t.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        pa stackIn_25_0 = null;
        long stackIn_25_1 = 0L;
        pa stackIn_27_0 = null;
        long stackIn_27_1 = 0L;
        pa stackIn_29_0 = null;
        long stackIn_29_1 = 0L;
        pa stackIn_30_0 = null;
        long stackIn_30_1 = 0L;
        int stackIn_30_2 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        Throwable decompiledCaughtException = null;
        pa stackOut_24_0 = null;
        long stackOut_24_1 = 0L;
        pa stackOut_29_0 = null;
        long stackOut_29_1 = 0L;
        int stackOut_29_2 = 0;
        pa stackOut_25_0 = null;
        long stackOut_25_1 = 0L;
        pa stackOut_27_0 = null;
        long stackOut_27_1 = 0L;
        int stackOut_27_2 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
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
                L3: {
                  if (~((sk) this).field_c < ~((sk) this).field_f) {
                    break L3;
                  } else {
                    if (~((sk) this).field_f >= ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.b((byte) 99);
                break L2;
              }
            }
            L4: {
              if (-1L == ((sk) this).field_c) {
                break L4;
              } else {
                if ((long)param0 + ((sk) this).field_f <= (long)((sk) this).field_j.length + ((sk) this).field_c) {
                  break L4;
                } else {
                  var5_int = (int)((long)((sk) this).field_j.length + ((sk) this).field_c + -((sk) this).field_f);
                  sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), var5_int);
                  ((sk) this).field_f = ((sk) this).field_f + (long)var5_int;
                  param1 = param1 + var5_int;
                  param0 = param0 - var5_int;
                  ((sk) this).field_d = ((sk) this).field_j.length;
                  this.b((byte) 127);
                  break L4;
                }
              }
            }
            if (!param3) {
              if (param0 > ((sk) this).field_j.length) {
                L5: {
                  if (((sk) this).field_f == ((sk) this).field_b) {
                    break L5;
                  } else {
                    L6: {
                      stackOut_24_0 = ((sk) this).field_a;
                      stackOut_24_1 = ((sk) this).field_f;
                      stackIn_29_0 = stackOut_24_0;
                      stackIn_29_1 = stackOut_24_1;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      if (param3) {
                        stackOut_29_0 = (pa) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        break L6;
                      } else {
                        stackOut_25_0 = (pa) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackOut_27_0 = (pa) (Object) stackIn_27_0;
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = 1;
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        break L6;
                      }
                    }
                    ((pa) (Object) stackIn_30_0).a(stackIn_30_1, stackIn_30_2 != 0);
                    ((sk) this).field_b = ((sk) this).field_f;
                    break L5;
                  }
                }
                L7: {
                  ((sk) this).field_a.a(param2, param1, 90, param0);
                  ((sk) this).field_b = ((sk) this).field_b + (long)param0;
                  if (~((sk) this).field_b < ~((sk) this).field_e) {
                    ((sk) this).field_e = ((sk) this).field_b;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    L10: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (~((sk) this).field_g < ~((sk) this).field_f) {
                        break L10;
                      } else {
                        if (~((sk) this).field_f > ~(((sk) this).field_g - -(long)((sk) this).field_i)) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (~((sk) this).field_g > ~((sk) this).field_f) {
                      break L8;
                    } else {
                      if (~((sk) this).field_g <= ~(((sk) this).field_f - -(long)param0)) {
                        break L8;
                      } else {
                        var5_long = ((sk) this).field_g;
                        if (var10 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  var5_long = ((sk) this).field_f;
                  break L8;
                }
                L11: {
                  L12: {
                    if (~((sk) this).field_g <= ~((long)param0 + ((sk) this).field_f)) {
                      break L12;
                    } else {
                      if (~((long)((sk) this).field_i + ((sk) this).field_g) > ~(((sk) this).field_f + (long)param0)) {
                        break L12;
                      } else {
                        var7 = ((sk) this).field_f - -(long)param0;
                        if (var10 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (((sk) this).field_f >= ((sk) this).field_g - -(long)((sk) this).field_i) {
                    break L11;
                  } else {
                    if (~(((sk) this).field_g + (long)((sk) this).field_i) < ~(((sk) this).field_f - -(long)param0)) {
                      break L11;
                    } else {
                      var7 = (long)((sk) this).field_i + ((sk) this).field_g;
                      break L11;
                    }
                  }
                }
                L13: {
                  if (var5_long <= -1L) {
                    break L13;
                  } else {
                    if (~var5_long > ~var7) {
                      var9 = (int)(-var5_long + var7);
                      sf.a(param2, (int)(var5_long + ((long)param1 + -((sk) this).field_f)), ((sk) this).field_h, (int)(var5_long + -((sk) this).field_g), var9);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                return;
              } else {
                if (param0 <= 0) {
                  break L0;
                } else {
                  L14: {
                    if (((sk) this).field_c != -1L) {
                      break L14;
                    } else {
                      ((sk) this).field_c = ((sk) this).field_f;
                      break L14;
                    }
                  }
                  L15: {
                    sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), param0);
                    ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                    if (~(long)((sk) this).field_d <= ~(-((sk) this).field_c + ((sk) this).field_f)) {
                      break L15;
                    } else {
                      ((sk) this).field_d = (int)(((sk) this).field_f + -((sk) this).field_c);
                      break L15;
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
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) var5_ref;
            stackOut_81_1 = new StringBuilder().append("sk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_84_0 = stackOut_81_0;
            stackIn_84_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param2 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L16;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_85_0 = stackOut_82_0;
              stackIn_85_1 = stackOut_82_1;
              stackIn_85_2 = stackOut_82_2;
              break L16;
            }
          }
          throw t.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((sk) this).a(param1, param1.length, 0, 9868);
            var3_int = -83 / ((param0 - -9) / 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("sk.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (param0) {
              L1: {
                ((sk) this).field_i = 0;
                if (~((sk) this).field_b == ~((sk) this).field_f) {
                  break L1;
                } else {
                  ((sk) this).field_a.a(((sk) this).field_f, true);
                  ((sk) this).field_b = ((sk) this).field_f;
                  break L1;
                }
              }
              ((sk) this).field_g = ((sk) this).field_f;
              L2: while (true) {
                L3: {
                  L4: {
                    if (((sk) this).field_i >= ((sk) this).field_h.length) {
                      break L4;
                    } else {
                      var2_int = -((sk) this).field_i + ((sk) this).field_h.length;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (var2_int <= 200000000) {
                            break L5;
                          } else {
                            var2_int = 200000000;
                            break L5;
                          }
                        }
                        var3 = ((sk) this).field_a.a(var2_int, ((sk) this).field_h, ((sk) this).field_i, false);
                        if (var3 == -1) {
                          break L4;
                        } else {
                          ((sk) this).field_i = ((sk) this).field_i + var3;
                          ((sk) this).field_b = ((sk) this).field_b + (long)var3;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "sk.G(" + param0 + ')');
        }
    }

    final void a(int param0, long param1) throws IOException {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < 0L) {
              throw new IOException();
            } else {
              var4_int = -65 / ((-57 - param0) / 37);
              ((sk) this).field_f = param1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "sk.F(" + param0 + ',' + param1 + ')');
        }
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
        int stackIn_6_0 = 0;
        ja stackIn_19_0 = null;
        int stackIn_21_0 = 0;
        ja stackIn_24_0 = null;
        ja stackIn_27_0 = null;
        ja stackIn_27_1 = null;
        ja stackIn_37_0 = null;
        ja stackIn_37_1 = null;
        ja stackIn_38_0 = null;
        ja stackIn_38_1 = null;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_5_0 = 0;
        ja stackOut_18_0 = null;
        int stackOut_20_0 = 0;
        ja stackOut_23_0 = null;
        ja stackOut_26_0 = null;
        ja stackOut_26_1 = null;
        ja stackOut_36_0 = null;
        ja stackOut_36_1 = null;
        ja stackOut_37_0 = null;
        ja stackOut_37_1 = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        boolean discarded$1 = sk.a(3);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!el.field_o.field_H) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        bk.field_a.e();
                        if (ld.a(-61)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        el.field_o.d((byte) 116);
                        sh.field_y.a(255);
                        var1_ref = (ja) (Object) a.field_d.a(false);
                        var2 = (-320.0f + var1_ref.field_o) * (-320.0f + var1_ref.field_o) + (var1_ref.field_v - 240.0f) * (var1_ref.field_v - 240.0f);
                        var3 = (ja) (Object) a.field_d.a(false);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == var3) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 < (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (-240.0f + var3.field_v) * (-240.0f + var3.field_v)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2 = (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (var3.field_v - 240.0f) * (-240.0f + var3.field_v);
                        var1_ref = var3;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = (ja) (Object) a.field_d.b(0);
                        if (var10 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3_ref = new wd();
                        var4 = new wd();
                        var5 = 0;
                        var3_ref.a((rc) (Object) var1_ref, false);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (ja) (Object) var3_ref.a(true);
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = stackIn_19_0;
                        if (null == var6) {
                            statePc = 46;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6.field_z = 6;
                        var6.field_r = var5;
                        var5 += 50;
                        var4.a((rc) (Object) var6, false);
                        stackOut_20_0 = 0;
                        stackIn_47_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var10 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (~var7 <= ~var6.field_L) {
                            statePc = 45;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = var6.field_n[var7];
                        stackOut_23_0 = (ja) (Object) var4.c((byte) 121);
                        stackIn_19_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var10 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null == var9) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = (ja) var9;
                        stackOut_26_1 = (ja) var8;
                        stackIn_37_0 = stackOut_26_0;
                        stackIn_37_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (var10 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != stackIn_27_1) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var10 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (ja) (Object) var4.a(param0 ^ 24);
                        if (var10 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = (ja) (Object) var3_ref.c((byte) 121);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == var9) {
                            statePc = 43;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = (ja) var9;
                        stackOut_36_1 = (ja) var8;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (ja) (Object) stackIn_37_0;
                        stackOut_37_1 = (ja) (Object) stackIn_37_1;
                        stackIn_27_0 = stackOut_37_0;
                        stackIn_27_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (var10 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 != stackIn_38_1) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var10 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = (ja) (Object) var3_ref.a(69);
                        if (var10 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3_ref.a(-82, (rc) (Object) var8);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var10 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = 1;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0 != 0;
                }
                case 48: {
                    try {
                        sh.field_y.a(255);
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0 != 0;
                }
                case 50: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "sk.D(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sk(pa param0, int param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((sk) this).field_d = 0;
        ((sk) this).field_c = -1L;
        ((sk) this).field_g = -1L;
        try {
          L0: {
            ((sk) this).field_a = param0;
            long dupTemp$3 = param0.a(1);
            ((sk) this).field_e = dupTemp$3;
            ((sk) this).field_k = dupTemp$3;
            ((sk) this).field_j = new byte[param2];
            ((sk) this).field_h = new byte[param1];
            ((sk) this).field_f = 0L;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}

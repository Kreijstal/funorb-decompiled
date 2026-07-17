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
                L5: {
                  var2 = -1L;
                  var4 = -1L;
                  if (((sk) this).field_c < ((sk) this).field_g) {
                    break L5;
                  } else {
                    if (~((long)((sk) this).field_i + ((sk) this).field_g) < ~((sk) this).field_c) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (((sk) this).field_c > ((sk) this).field_g) {
                  break L3;
                } else {
                  if (~((sk) this).field_g > ~(((sk) this).field_c - -(long)((sk) this).field_d)) {
                    var2 = ((sk) this).field_g;
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var2 = ((sk) this).field_c;
              break L3;
            }
            L6: {
              L7: {
                if (~((sk) this).field_g <= ~(((sk) this).field_c + (long)((sk) this).field_d)) {
                  break L7;
                } else {
                  if (((sk) this).field_g - -(long)((sk) this).field_i < (long)((sk) this).field_d + ((sk) this).field_c) {
                    break L7;
                  } else {
                    var4 = (long)((sk) this).field_d + ((sk) this).field_c;
                    if (var7 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (~((long)((sk) this).field_i + ((sk) this).field_g) >= ~((sk) this).field_c) {
                break L6;
              } else {
                if (~(((sk) this).field_c + (long)((sk) this).field_d) > ~((long)((sk) this).field_i + ((sk) this).field_g)) {
                  break L6;
                } else {
                  var4 = ((sk) this).field_g - -(long)((sk) this).field_i;
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
                  sf.a(((sk) this).field_j, (int)(-((sk) this).field_c + var2), ((sk) this).field_h, (int)(-((sk) this).field_g + var2), var6);
                  break L8;
                }
              }
            }
            ((sk) this).field_d = 0;
            ((sk) this).field_c = -1L;
            break L0;
          }
        }
        L9: {
          if (param0 > 60) {
            break L9;
          } else {
            ((sk) this).field_e = 28L;
            break L9;
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
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
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
                              stackOut_20_0 = -1;
                              stackOut_20_1 = var9_int;
                              stackIn_34_0 = stackOut_20_0;
                              stackIn_34_1 = stackOut_20_1;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              if (var14 != 0) {
                                break L7;
                              } else {
                                L11: {
                                  if (stackIn_21_0 != stackIn_21_1) {
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
                        stackOut_33_0 = -1;
                        stackOut_33_1 = ~param1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L7;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (stackIn_34_0 <= stackIn_34_1) {
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
                      if (var9_int <= param2) {
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
                          continue L14;
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
            stackOut_66_0 = (RuntimeException) var5_ref;
            stackOut_66_1 = new StringBuilder().append("sk.B(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          throw t.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
                    L9: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (~((sk) this).field_g < ~((sk) this).field_f) {
                        break L9;
                      } else {
                        if (~((sk) this).field_f > ~(((sk) this).field_g - -(long)((sk) this).field_i)) {
                          break L8;
                        } else {
                          break L9;
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
                        if (var10 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var5_long = ((sk) this).field_f;
                  break L7;
                }
                L10: {
                  L11: {
                    if (~((sk) this).field_g <= ~((long)param0 + ((sk) this).field_f)) {
                      break L11;
                    } else {
                      if (~((long)((sk) this).field_i + ((sk) this).field_g) > ~(((sk) this).field_f + (long)param0)) {
                        break L11;
                      } else {
                        var7 = ((sk) this).field_f - -(long)param0;
                        if (var10 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  if (((sk) this).field_f >= ((sk) this).field_g - -(long)((sk) this).field_i) {
                    break L10;
                  } else {
                    if (~(((sk) this).field_g + (long)((sk) this).field_i) < ~(((sk) this).field_f - -(long)param0)) {
                      break L10;
                    } else {
                      var7 = (long)((sk) this).field_i + ((sk) this).field_g;
                      break L10;
                    }
                  }
                }
                L12: {
                  if (var5_long <= -1L) {
                    break L12;
                  } else {
                    if (~var5_long > ~var7) {
                      var9 = (int)(-var5_long + var7);
                      sf.a(param2, (int)(var5_long + ((long)param1 + -((sk) this).field_f)), ((sk) this).field_h, (int)(var5_long + -((sk) this).field_g), var9);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                return;
              } else {
                if (param0 <= 0) {
                  break L0;
                } else {
                  L13: {
                    if (((sk) this).field_c != -1L) {
                      break L13;
                    } else {
                      ((sk) this).field_c = ((sk) this).field_f;
                      break L13;
                    }
                  }
                  L14: {
                    sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), param0);
                    ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                    if (~(long)((sk) this).field_d <= ~(-((sk) this).field_c + ((sk) this).field_f)) {
                      break L14;
                    } else {
                      ((sk) this).field_d = (int)(((sk) this).field_f + -((sk) this).field_c);
                      break L14;
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
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5_ref;
            stackOut_52_1 = new StringBuilder().append("sk.C(").append(param0).append(44).append(param1).append(44);
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
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw t.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param3 + 41);
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            ((sk) this).a(param1, param1.length, 0, 9868);
            int var3_int = -83 / ((param0 - -9) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sk.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0) throws IOException {
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
              var2 = -((sk) this).field_i + ((sk) this).field_h.length;
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
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
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
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
        ja stackIn_16_0 = null;
        int stackIn_18_0 = 0;
        ja stackIn_21_0 = null;
        ja stackIn_24_0 = null;
        ja stackIn_24_1 = null;
        ja stackIn_30_0 = null;
        ja stackIn_30_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_4_0 = 0;
        ja stackOut_15_0 = null;
        int stackOut_17_0 = 0;
        ja stackOut_20_0 = null;
        ja stackOut_23_0 = null;
        ja stackOut_23_1 = null;
        ja stackOut_29_0 = null;
        ja stackOut_29_1 = null;
        ja stackOut_30_0 = null;
        ja stackOut_30_1 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        boolean discarded$1 = sk.a(3);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!el.field_o.field_H) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        bk.field_a.e();
                        if (ld.a(-61)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        el.field_o.d((byte) 116);
                        sh.field_y.a(255);
                        var1_ref = (ja) (Object) a.field_d.a(false);
                        var2 = (-320.0f + var1_ref.field_o) * (-320.0f + var1_ref.field_o) + (var1_ref.field_v - 240.0f) * (var1_ref.field_v - 240.0f);
                        var3 = (ja) (Object) a.field_d.a(false);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var3 == null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2 < (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (-240.0f + var3.field_v) * (-240.0f + var3.field_v)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2 = (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (var3.field_v - 240.0f) * (-240.0f + var3.field_v);
                        var1_ref = var3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = (ja) (Object) a.field_d.b(0);
                        if (var10 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_ref = new wd();
                        var4 = new wd();
                        var5 = 0;
                        var3_ref.a((rc) (Object) var1_ref, false);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (ja) (Object) var3_ref.a(true);
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = stackIn_16_0;
                        if (var6 == null) {
                            statePc = 35;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6.field_z = 6;
                        var6.field_r = var5;
                        var5 += 50;
                        var4.a((rc) (Object) var6, false);
                        stackOut_17_0 = 0;
                        stackIn_36_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var10 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 >= var6.field_L) {
                            statePc = 34;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = var6.field_n[var7];
                        stackOut_20_0 = (ja) (Object) var4.c((byte) 121);
                        stackIn_16_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var10 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 == null) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (ja) var9;
                        stackOut_23_1 = (ja) var8;
                        stackIn_30_0 = stackOut_23_0;
                        stackIn_30_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (var10 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 != stackIn_24_1) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var10 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = (ja) (Object) var4.a(param0 ^ 24);
                        if (var10 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = (ja) (Object) var3_ref.c((byte) 121);
                        if (var9 == null) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (ja) var9;
                        stackOut_29_1 = (ja) var8;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (ja) (Object) stackIn_30_0;
                        stackOut_30_1 = (ja) (Object) stackIn_30_1;
                        stackIn_24_0 = stackOut_30_0;
                        stackIn_24_1 = stackOut_30_1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_ref.a(-82, (rc) (Object) var8);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var10 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = 1;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0 != 0;
                }
                case 37: {
                    try {
                        sh.field_y.a(255);
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0 != 0;
                }
                case 39: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "sk.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
            throw t.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
    }
}

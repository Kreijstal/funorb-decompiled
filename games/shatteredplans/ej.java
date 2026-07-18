/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej {
    private int field_a;
    static int field_m;
    static String field_f;
    private byte[] field_k;
    private int field_b;
    private long field_g;
    private ra field_c;
    private long field_h;
    static String field_j;
    private long field_d;
    private long field_l;
    private long field_n;
    private long field_i;
    private byte[] field_o;
    static int field_e;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~((long)param1 + ((ej) this).field_d) < ~((ej) this).field_h) {
                ((ej) this).field_h = ((ej) this).field_d - -(long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ej) this).field_n == -1L) {
                break L2;
              } else {
                L3: {
                  if (((ej) this).field_n > ((ej) this).field_d) {
                    break L3;
                  } else {
                    if (((ej) this).field_n + (long)((ej) this).field_b < ((ej) this).field_d) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.e(-117);
                break L2;
              }
            }
            L4: {
              if (((ej) this).field_n == -1L) {
                break L4;
              } else {
                if (((ej) this).field_d - -(long)param1 <= (long)((ej) this).field_o.length + ((ej) this).field_n) {
                  break L4;
                } else {
                  var5_int = (int)((long)((ej) this).field_o.length - -((ej) this).field_n - ((ej) this).field_d);
                  ps.a(param3, param2, ((ej) this).field_o, (int)(-((ej) this).field_n + ((ej) this).field_d), var5_int);
                  ((ej) this).field_d = ((ej) this).field_d + (long)var5_int;
                  param1 = param1 - var5_int;
                  param2 = param2 + var5_int;
                  ((ej) this).field_b = ((ej) this).field_o.length;
                  this.e(-117);
                  break L4;
                }
              }
            }
            var5_int = -125 % ((32 - param0) / 43);
            if (~((ej) this).field_o.length <= ~param1) {
              if (param1 <= 0) {
                break L0;
              } else {
                L5: {
                  if (-1L != ((ej) this).field_n) {
                    break L5;
                  } else {
                    ((ej) this).field_n = ((ej) this).field_d;
                    break L5;
                  }
                }
                L6: {
                  ps.a(param3, param2, ((ej) this).field_o, (int)(-((ej) this).field_n + ((ej) this).field_d), param1);
                  ((ej) this).field_d = ((ej) this).field_d + (long)param1;
                  if ((long)((ej) this).field_b < ((ej) this).field_d + -((ej) this).field_n) {
                    ((ej) this).field_b = (int)(-((ej) this).field_n + ((ej) this).field_d);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (((ej) this).field_g != ((ej) this).field_d) {
                  ((ej) this).field_c.a(((ej) this).field_d, (byte) 59);
                  ((ej) this).field_g = ((ej) this).field_d;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                ((ej) this).field_c.a(param3, param1, (byte) 11, param2);
                ((ej) this).field_g = ((ej) this).field_g + (long)param1;
                if (~((ej) this).field_g >= ~((ej) this).field_l) {
                  break L8;
                } else {
                  ((ej) this).field_l = ((ej) this).field_g;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var6 = -1L;
                  if (~((ej) this).field_d > ~((ej) this).field_i) {
                    break L10;
                  } else {
                    if (((ej) this).field_d >= ((ej) this).field_i - -(long)((ej) this).field_a) {
                      break L10;
                    } else {
                      var6 = ((ej) this).field_d;
                      if (var11 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (~((ej) this).field_i > ~((ej) this).field_d) {
                  break L9;
                } else {
                  if (((ej) this).field_i >= ((ej) this).field_d - -(long)param1) {
                    break L9;
                  } else {
                    var6 = ((ej) this).field_i;
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  L13: {
                    var8 = -1L;
                    if (((ej) this).field_d + (long)param1 <= ((ej) this).field_i) {
                      break L13;
                    } else {
                      if ((long)((ej) this).field_a + ((ej) this).field_i >= ((ej) this).field_d + (long)param1) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (((ej) this).field_i - -(long)((ej) this).field_a <= ((ej) this).field_d) {
                    break L11;
                  } else {
                    if (~(((ej) this).field_d + (long)param1) <= ~((long)((ej) this).field_a + ((ej) this).field_i)) {
                      var8 = (long)((ej) this).field_a + ((ej) this).field_i;
                      if (var11 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                var8 = (long)param1 + ((ej) this).field_d;
                break L11;
              }
              L14: {
                if (var6 <= -1L) {
                  break L14;
                } else {
                  if (var6 < var8) {
                    var10 = (int)(var8 + -var6);
                    ps.a(param3, (int)(var6 + (long)param2 - ((ej) this).field_d), ((ej) this).field_k, (int)(var6 + -((ej) this).field_i), var10);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              ((ej) this).field_d = ((ej) this).field_d + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ej) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var5_ref;
            stackOut_79_1 = new StringBuilder().append("ej.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L15;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L15;
            }
          }
          throw r.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_f = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ej.C(" + param0 + ')');
        }
    }

    private final void a(int param0) throws IOException {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ej) this).field_a = 0;
              if (~((ej) this).field_d == ~((ej) this).field_g) {
                break L1;
              } else {
                ((ej) this).field_c.a(((ej) this).field_d, (byte) 98);
                ((ej) this).field_g = ((ej) this).field_d;
                break L1;
              }
            }
            if (param0 < -107) {
              ((ej) this).field_i = ((ej) this).field_d;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((ej) this).field_k.length >= ~((ej) this).field_a) {
                      break L4;
                    } else {
                      var2_int = ((ej) this).field_k.length - ((ej) this).field_a;
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
                        var3 = ((ej) this).field_c.a(var2_int, ((ej) this).field_a, 0, ((ej) this).field_k);
                        if (var3 == -1) {
                          break L4;
                        } else {
                          ((ej) this).field_a = ((ej) this).field_a + var3;
                          ((ej) this).field_g = ((ej) this).field_g + (long)var3;
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
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "ej.B(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        hd var1 = null;
        int var2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (cb.field_h == null) {
              return;
            } else {
              L1: {
                var1 = (hd) (Object) cb.field_h.d(0);
                if (var1 != null) {
                  L2: {
                    int fieldTemp$3 = var1.field_h + 1;
                    var1.field_h = var1.field_h + 1;
                    if (fieldTemp$3 != 300) {
                      break L2;
                    } else {
                      ra.field_e = ra.field_e + (float)var1.field_i.field_w;
                      var1.b((byte) -63);
                      break L2;
                    }
                  }
                  var1 = (hd) (Object) cb.field_h.a((byte) -71);
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var1) {
                      break L5;
                    } else {
                      int fieldTemp$4 = var1.field_h + 1;
                      var1.field_h = var1.field_h + 1;
                      stackOut_12_0 = fieldTemp$4;
                      stackOut_12_1 = 75;
                      stackIn_20_0 = stackOut_12_0;
                      stackIn_20_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (var2 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_13_0 <= stackIn_13_1) {
                            break L6;
                          } else {
                            var1.field_h = 75;
                            break L6;
                          }
                        }
                        var1 = (hd) (Object) cb.field_h.a((byte) -71);
                        if (var2 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = param0;
                  stackOut_19_1 = -126;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L4;
                }
                L7: {
                  if (stackIn_20_0 <= stackIn_20_1) {
                    break L7;
                  } else {
                    field_m = 62;
                    break L7;
                  }
                }
                L8: {
                  if (0.0f < ra.field_e) {
                    ra.field_e = ra.field_e * 0.8999999761581421f;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "ej.G(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.length >= param0 + param3) {
              L1: {
                if (((ej) this).field_n == -1L) {
                  break L1;
                } else {
                  if (((ej) this).field_d < ((ej) this).field_n) {
                    break L1;
                  } else {
                    if (~((long)((ej) this).field_b + ((ej) this).field_n) > ~(((ej) this).field_d + (long)param0)) {
                      break L1;
                    } else {
                      ps.a(((ej) this).field_o, (int)(-((ej) this).field_n + ((ej) this).field_d), param1, param3, param0);
                      ((ej) this).field_d = ((ej) this).field_d + (long)param0;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((ej) this).field_d;
                var7 = param3;
                var8 = param0;
                if (((ej) this).field_i > ((ej) this).field_d) {
                  break L2;
                } else {
                  if ((long)((ej) this).field_a + ((ej) this).field_i <= ((ej) this).field_d) {
                    break L2;
                  } else {
                    L3: {
                      var9 = (int)((long)((ej) this).field_a + (-((ej) this).field_d + ((ej) this).field_i));
                      if (~param0 <= ~var9) {
                        break L3;
                      } else {
                        var9 = param0;
                        break L3;
                      }
                    }
                    ps.a(((ej) this).field_k, (int)(((ej) this).field_d + -((ej) this).field_i), param1, param3, var9);
                    ((ej) this).field_d = ((ej) this).field_d + (long)var9;
                    param0 = param0 - var9;
                    param3 = param3 + var9;
                    break L2;
                  }
                }
              }
              L4: {
                L5: {
                  L6: {
                    var9 = 87 % ((param2 - 2) / 39);
                    if (param0 > ((ej) this).field_k.length) {
                      break L6;
                    } else {
                      if (param0 <= 0) {
                        break L5;
                      } else {
                        L7: {
                          this.a(-110);
                          var10_int = param0;
                          if (var10_int <= ((ej) this).field_a) {
                            break L7;
                          } else {
                            var10_int = ((ej) this).field_a;
                            break L7;
                          }
                        }
                        ps.a(((ej) this).field_k, 0, param1, param3, var10_int);
                        ((ej) this).field_d = ((ej) this).field_d + (long)var10_int;
                        param0 = param0 - var10_int;
                        param3 = param3 + var10_int;
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((ej) this).field_c.a(((ej) this).field_d, (byte) 108);
                  ((ej) this).field_g = ((ej) this).field_d;
                  L8: while (true) {
                    if (param0 <= 0) {
                      break L5;
                    } else {
                      var10_int = ((ej) this).field_c.a(param0, param3, 0, param1);
                      stackOut_30_0 = 0;
                      stackOut_30_1 = ~var10_int;
                      stackIn_91_0 = stackOut_30_0;
                      stackIn_91_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (var15 != 0) {
                        break L4;
                      } else {
                        L9: {
                          if (stackIn_31_0 != stackIn_31_1) {
                            break L9;
                          } else {
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param0 = param0 - var10_int;
                        ((ej) this).field_g = ((ej) this).field_g + (long)var10_int;
                        ((ej) this).field_d = ((ej) this).field_d + (long)var10_int;
                        param3 = param3 + var10_int;
                        if (var15 == 0) {
                          continue L8;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (((ej) this).field_n == -1L) {
                    break L10;
                  } else {
                    L11: {
                      if (((ej) this).field_n <= ((ej) this).field_d) {
                        break L11;
                      } else {
                        if (param0 > 0) {
                          L12: {
                            var10_int = (int)(-((ej) this).field_d + ((ej) this).field_n) + param3;
                            if (~(param0 + param3) <= ~var10_int) {
                              break L12;
                            } else {
                              var10_int = param0 + param3;
                              break L12;
                            }
                          }
                          L13: while (true) {
                            if (var10_int <= param3) {
                              break L11;
                            } else {
                              param0--;
                              int incrementValue$1 = param3;
                              param3++;
                              param1[incrementValue$1] = (byte) 0;
                              ((ej) this).field_d = ((ej) this).field_d + 1L;
                              if (var15 != 0) {
                                break L10;
                              } else {
                                if (var15 == 0) {
                                  continue L13;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    L14: {
                      L15: {
                        var10 = -1L;
                        if (((ej) this).field_n < var5_long) {
                          break L15;
                        } else {
                          if (((ej) this).field_n >= var5_long + (long)var8) {
                            break L15;
                          } else {
                            var10 = ((ej) this).field_n;
                            if (var15 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      if (~((ej) this).field_n < ~var5_long) {
                        break L14;
                      } else {
                        if (~((long)((ej) this).field_b + ((ej) this).field_n) < ~var5_long) {
                          var10 = var5_long;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      L17: {
                        L18: {
                          var12 = -1L;
                          if (~((long)((ej) this).field_b + ((ej) this).field_n) >= ~var5_long) {
                            break L18;
                          } else {
                            if (((ej) this).field_n - -(long)((ej) this).field_b <= (long)var8 + var5_long) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (~((ej) this).field_n <= ~((long)var8 + var5_long)) {
                          break L16;
                        } else {
                          if ((long)var8 + var5_long > ((ej) this).field_n + (long)((ej) this).field_b) {
                            break L16;
                          } else {
                            var12 = var5_long - -(long)var8;
                            if (var15 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      var12 = ((ej) this).field_n + (long)((ej) this).field_b;
                      break L16;
                    }
                    if (-1L >= var10) {
                      break L10;
                    } else {
                      if (~var10 <= ~var12) {
                        break L10;
                      } else {
                        var14 = (int)(var12 - var10);
                        ps.a(((ej) this).field_o, (int)(var10 - ((ej) this).field_n), param1, var7 - -(int)(var10 - var5_long), var14);
                        if (((ej) this).field_d < var12) {
                          param0 = (int)((long)param0 - (var12 + -((ej) this).field_d));
                          ((ej) this).field_d = var12;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                stackOut_90_0 = ~param0;
                stackOut_90_1 = -1;
                stackIn_91_0 = stackOut_90_0;
                stackIn_91_1 = stackOut_90_1;
                break L4;
              }
              if (stackIn_91_0 >= stackIn_91_1) {
                break L0;
              } else {
                throw new EOFException();
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param0));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ej) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L19: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var5_ref;
            stackOut_95_1 = new StringBuilder().append("ej.L(").append(param0).append(',');
            stackIn_98_0 = stackOut_95_0;
            stackIn_98_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L19;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_99_0 = stackOut_96_0;
              stackIn_99_1 = stackOut_96_1;
              stackIn_99_2 = stackOut_96_2;
              break L19;
            }
          }
          throw r.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte[] param0, boolean param1) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              ((ej) this).a(param0.length, param0, (byte) -83, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ej.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (bj.field_K == null) {
              return;
            } else {
              L1: {
                hs.a((java.awt.Canvas) (Object) bj.field_K, (byte) 9);
                bj.field_K.a(fa.field_W, -17115);
                bj.field_K = null;
                if (null != bh.field_p) {
                  bh.field_p.c(-119);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  field_j = null;
                  break L2;
                }
              }
              tm.field_i.requestFocus();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ej.E(" + param0 + ')');
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
              if (param0 <= -65) {
                break L1;
              } else {
                ((ej) this).field_g = -112L;
                break L1;
              }
            }
            stackOut_3_0 = ((ej) this).field_h;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "ej.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, long param1) throws IOException {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 25 % ((param0 - 26) / 38);
            if (param1 < 0L) {
              throw new IOException();
            } else {
              ((ej) this).field_d = param1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "ej.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        try {
            this.e(85);
            int var2_int = 115 % ((param0 - 72) / 44);
            ((ej) this).field_c.c(10);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ej.I(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        sl var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        rk var4 = null;
        int var4_int = 0;
        int var5 = 0;
        aq var5_ref_aq = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = sa.field_a;
            if (param0 == -523) {
              L1: {
                L2: {
                  var2 = var1_ref.j(-78);
                  var3 = var1_ref.j(-127);
                  if (var2 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (1 != var2) {
                        break L3;
                      } else {
                        var4_int = var1_ref.d((byte) -122);
                        var5_ref_aq = (aq) (Object) dc.field_E.d(0);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var5_ref_aq == null) {
                                break L6;
                              } else {
                                stackOut_9_0 = var5_ref_aq.field_m;
                                stackOut_9_1 = var3;
                                stackIn_21_0 = stackOut_9_0;
                                stackIn_21_1 = stackOut_9_1;
                                stackIn_10_0 = stackOut_9_0;
                                stackIn_10_1 = stackOut_9_1;
                                if (var8 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (stackIn_10_0 != stackIn_10_1) {
                                      break L7;
                                    } else {
                                      if (~var5_ref_aq.field_l == ~var4_int) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var5_ref_aq = (aq) (Object) dc.field_E.a((byte) -71);
                                  if (var8 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (null == var5_ref_aq) {
                              stackOut_20_0 = param0;
                              stackOut_20_1 = 611;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              break L5;
                            } else {
                              var5_ref_aq.b((byte) -119);
                              if (var8 == 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          q.g(stackIn_21_0 ^ stackIn_21_1);
                          return;
                        }
                      }
                    }
                    jq.a(-29901, (Throwable) null, "LR1: " + w.a(16738));
                    q.g(-113);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = (rk) (Object) na.field_J.d(0);
                if (var4 == null) {
                  q.g(-108);
                  return;
                } else {
                  L8: {
                    var5 = rr.field_t - var1_ref.field_j;
                    var6 = var4.field_i;
                    if (var5 > var6.length << 2) {
                      var5 = var6.length << 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var7 = 0;
                  L9: while (true) {
                    L10: {
                      if (~var5 >= ~var7) {
                        break L10;
                      } else {
                        var6[var7 >> 2] = var6[var7 >> 2] + (var1_ref.j(-106) << (we.a(3, var7) << 8));
                        var7++;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          if (var8 == 0) {
                            continue L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    var4.b((byte) -86);
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ej.M(" + param0 + ')');
        }
    }

    private final void e(int param0) throws IOException {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -106 / ((-62 - param0) / 53);
              if (((ej) this).field_n != -1L) {
                L2: {
                  if (~((ej) this).field_g != ~((ej) this).field_n) {
                    ((ej) this).field_c.a(((ej) this).field_n, (byte) 33);
                    ((ej) this).field_g = ((ej) this).field_n;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  ((ej) this).field_c.a(((ej) this).field_o, ((ej) this).field_b, (byte) 11, 0);
                  ((ej) this).field_g = ((ej) this).field_g + (long)((ej) this).field_b;
                  if (~((ej) this).field_l <= ~((ej) this).field_g) {
                    break L3;
                  } else {
                    ((ej) this).field_l = ((ej) this).field_g;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = -1L;
                    if (((ej) this).field_i > ((ej) this).field_n) {
                      break L5;
                    } else {
                      if (((ej) this).field_n >= (long)((ej) this).field_a + ((ej) this).field_i) {
                        break L5;
                      } else {
                        var3 = ((ej) this).field_n;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (((ej) this).field_n > ((ej) this).field_i) {
                    break L4;
                  } else {
                    if (~(((ej) this).field_n + (long)((ej) this).field_b) >= ~((ej) this).field_i) {
                      break L4;
                    } else {
                      var3 = ((ej) this).field_i;
                      break L4;
                    }
                  }
                }
                L6: {
                  L7: {
                    var5 = -1L;
                    if (~((ej) this).field_i <= ~(((ej) this).field_n - -(long)((ej) this).field_b)) {
                      break L7;
                    } else {
                      if (~(((ej) this).field_i - -(long)((ej) this).field_a) > ~(((ej) this).field_n - -(long)((ej) this).field_b)) {
                        break L7;
                      } else {
                        var5 = (long)((ej) this).field_b + ((ej) this).field_n;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (~((long)((ej) this).field_a + ((ej) this).field_i) >= ~((ej) this).field_n) {
                    break L6;
                  } else {
                    if (~((long)((ej) this).field_b + ((ej) this).field_n) > ~(((ej) this).field_i - -(long)((ej) this).field_a)) {
                      break L6;
                    } else {
                      var5 = ((ej) this).field_i - -(long)((ej) this).field_a;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (-1L >= var3) {
                    break L8;
                  } else {
                    if (~var5 >= ~var3) {
                      break L8;
                    } else {
                      var7 = (int)(var5 + -var3);
                      ps.a(((ej) this).field_o, (int)(-((ej) this).field_n + var3), ((ej) this).field_k, (int)(var3 - ((ej) this).field_i), var7);
                      break L8;
                    }
                  }
                }
                ((ej) this).field_b = 0;
                ((ej) this).field_n = -1L;
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
          throw r.a((Throwable) (Object) var2, "ej.D(" + param0 + ')');
        }
    }

    ej(ra param0, int param1, int param2) throws IOException {
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
        ((ej) this).field_b = 0;
        ((ej) this).field_i = -1L;
        ((ej) this).field_n = -1L;
        try {
          L0: {
            ((ej) this).field_c = param0;
            long dupTemp$3 = param0.b(3);
            ((ej) this).field_l = dupTemp$3;
            ((ej) this).field_h = dupTemp$3;
            ((ej) this).field_o = new byte[param2];
            ((ej) this).field_k = new byte[param1];
            ((ej) this).field_d = 0L;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ej.<init>(");
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
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, sr param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_40_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = rj.c(param0 ^ -85, (param4 - param3) * 3);
              var6 = 3 * param3;
              ah.g((byte) 111);
              var7 = -10 + var5_int;
              if (param2.field_o <= 0) {
                break L1;
              } else {
                if (null == param2.field_p) {
                  break L1;
                } else {
                  mf.e(param0 ^ -97);
                  break L1;
                }
              }
            }
            qj.field_e = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var8 <= ~param2.field_u) {
                    break L4;
                  } else {
                    var9 = param2.field_s[var8];
                    var10 = param2.field_i[var8];
                    var11 = param2.field_B[var8];
                    stackOut_9_0 = param1;
                    stackIn_41_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_10_0) {
                            break L6;
                          } else {
                            var12 = ul.field_Cb[var9];
                            var13 = he.field_i[var9];
                            var14 = -var12 + ul.field_Cb[var10];
                            var15 = -var12 + ul.field_Cb[var11];
                            var16 = he.field_i[var10] - var13;
                            var17 = -var13 + he.field_i[var11];
                            if (var17 * var14 + -(var16 * var15) >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var12 = no.field_c[var9];
                        if (var12 == -2147483648) {
                          break L5;
                        } else {
                          var13 = no.field_c[var10];
                          if (var13 == -2147483648) {
                            break L5;
                          } else {
                            var14 = no.field_c[var11];
                            if (var14 == -2147483648) {
                              break L5;
                            } else {
                              L7: {
                                var15 = var13 + var12 - (-var14 - -var6);
                                if (var7 >= 0) {
                                  stackOut_20_0 = var15 >> var7;
                                  stackIn_21_0 = stackOut_20_0;
                                  break L7;
                                } else {
                                  stackOut_18_0 = var15 << -var7;
                                  stackIn_21_0 = stackOut_18_0;
                                  break L7;
                                }
                              }
                              var16 = -stackIn_21_0 + -1 + gd.field_b.length;
                              var17 = gd.field_b[var16];
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if (var17 >> 4 == 0) {
                                      break L10;
                                    } else {
                                      var16--;
                                      stackOut_23_0 = var16;
                                      stackIn_32_0 = stackOut_23_0;
                                      stackIn_24_0 = stackOut_23_0;
                                      if (var19 != 0) {
                                        break L9;
                                      } else {
                                        L11: {
                                          if (stackIn_24_0 >= 0) {
                                            break L11;
                                          } else {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        var17 = gd.field_b[var16];
                                        if (var19 == 0) {
                                          continue L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_31_0 = (var16 << 4) - -var17;
                                  stackIn_32_0 = stackOut_31_0;
                                  break L9;
                                }
                                L12: {
                                  var18 = stackIn_32_0;
                                  jl.field_M[var18] = var8;
                                  gd.field_b[var16] = var17 - -1;
                                  if (param2.field_o <= 0) {
                                    break L12;
                                  } else {
                                    if (param2.field_p == null) {
                                      break L12;
                                    } else {
                                      uo.field_h[param2.field_p[var8]] = uo.field_h[param2.field_p[var8]] + 1;
                                      break L12;
                                    }
                                  }
                                }
                                qj.field_e = qj.field_e + 1;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_40_0 = ~param2.field_o;
                stackIn_41_0 = stackOut_40_0;
                break L3;
              }
              L13: {
                L14: {
                  if (stackIn_41_0 >= -1) {
                    break L14;
                  } else {
                    if (param2.field_p == null) {
                      break L14;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L15: while (true) {
                        if (uo.field_h.length <= var9) {
                          break L14;
                        } else {
                          var10 = uo.field_h[var9];
                          uo.field_h[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L13;
                          } else {
                            if (var19 == 0) {
                              continue L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param0 == -27) {
                  break L13;
                } else {
                  field_j = null;
                  break L13;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var5;
            stackOut_55_1 = new StringBuilder().append("ej.H(").append(param0).append(',').append(param1).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param2 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L16;
            }
          }
          throw r.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Reject <%0> from this game";
        field_j = ".";
        field_e = -1;
    }
}

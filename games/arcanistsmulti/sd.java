/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sd {
    private byte[] field_e;
    static String field_g;
    private kb field_b;
    private long field_d;
    private int field_a;
    private long field_h;
    private int field_f;
    private long field_i;
    private byte[] field_j;
    static String field_l;
    private long field_k;
    private long field_m;
    private long field_c;

    private final void a(byte param0) throws IOException {
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((sd) this).field_a = 0;
        if (~((sd) this).field_i != ~((sd) this).field_d) {
          ((sd) this).field_b.a((byte) -123, ((sd) this).field_d);
          ((sd) this).field_i = ((sd) this).field_d;
          return;
        } else {
          return;
        }
    }

    final static eg a(int param0, byte param1) {
        if (param1 < 5) {
            return null;
        }
        return me.a(param0, true, 2097152, false, 1, false);
    }

    final void c(byte param0) throws IOException {
        if (param0 >= -30) {
            ((sd) this).field_f = -28;
        }
        this.a(-1);
        ((sd) this).field_b.c(105);
    }

    final long b(byte param0) {
        if (param0 != -30) {
            eg discarded$0 = sd.a(87, (byte) 121);
        }
        return ((sd) this).field_h;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) throws IOException {
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
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~((sd) this).field_h <= ~((long)param3 + ((sd) this).field_d)) {
                break L1;
              } else {
                ((sd) this).field_h = ((sd) this).field_d - -(long)param3;
                break L1;
              }
            }
            L2: {
              if (((sd) this).field_c == -1L) {
                break L2;
              } else {
                L3: {
                  if (~((sd) this).field_c < ~((sd) this).field_d) {
                    break L3;
                  } else {
                    if (~((sd) this).field_d < ~(((sd) this).field_c - -(long)((sd) this).field_f)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(param0 + 52);
                break L2;
              }
            }
            L4: {
              if (param0 == -53) {
                break L4;
              } else {
                ((sd) this).field_f = -91;
                break L4;
              }
            }
            L5: {
              if (((sd) this).field_c == -1L) {
                break L5;
              } else {
                if (~(((sd) this).field_c - -(long)((sd) this).field_j.length) <= ~(((sd) this).field_d + (long)param3)) {
                  break L5;
                } else {
                  var5_int = (int)(-((sd) this).field_d + ((sd) this).field_c + (long)((sd) this).field_j.length);
                  sf.a(param2, param1, ((sd) this).field_j, (int)(-((sd) this).field_c + ((sd) this).field_d), var5_int);
                  param3 = param3 - var5_int;
                  param1 = param1 + var5_int;
                  ((sd) this).field_d = ((sd) this).field_d + (long)var5_int;
                  ((sd) this).field_f = ((sd) this).field_j.length;
                  this.a(-1);
                  break L5;
                }
              }
            }
            if (((sd) this).field_j.length >= param3) {
              if (param3 > 0) {
                L6: {
                  if (-1L != ((sd) this).field_c) {
                    break L6;
                  } else {
                    ((sd) this).field_c = ((sd) this).field_d;
                    break L6;
                  }
                }
                L7: {
                  sf.a(param2, param1, ((sd) this).field_j, (int)(-((sd) this).field_c + ((sd) this).field_d), param3);
                  ((sd) this).field_d = ((sd) this).field_d + (long)param3;
                  if (~(((sd) this).field_d + -((sd) this).field_c) >= ~(long)((sd) this).field_f) {
                    break L7;
                  } else {
                    ((sd) this).field_f = (int)(((sd) this).field_d - ((sd) this).field_c);
                    break L7;
                  }
                }
                return;
              } else {
                break L0;
              }
            } else {
              L8: {
                if (((sd) this).field_d == ((sd) this).field_i) {
                  break L8;
                } else {
                  ((sd) this).field_b.a((byte) -123, ((sd) this).field_d);
                  ((sd) this).field_i = ((sd) this).field_d;
                  break L8;
                }
              }
              L9: {
                ((sd) this).field_b.a(param0 + 54, param1, param3, param2);
                ((sd) this).field_i = ((sd) this).field_i + (long)param3;
                if (~((sd) this).field_i < ~((sd) this).field_m) {
                  ((sd) this).field_m = ((sd) this).field_i;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (~((sd) this).field_d > ~((sd) this).field_k) {
                    break L11;
                  } else {
                    if (((sd) this).field_d < (long)((sd) this).field_a + ((sd) this).field_k) {
                      var5_long = ((sd) this).field_d;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (~((sd) this).field_k > ~((sd) this).field_d) {
                  break L10;
                } else {
                  if ((long)param3 + ((sd) this).field_d > ((sd) this).field_k) {
                    var5_long = ((sd) this).field_k;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if ((long)param3 + ((sd) this).field_d <= ((sd) this).field_k) {
                    break L13;
                  } else {
                    if (~((long)((sd) this).field_a + ((sd) this).field_k) <= ~(((sd) this).field_d - -(long)param3)) {
                      var7 = ((sd) this).field_d + (long)param3;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (~((sd) this).field_d <= ~(((sd) this).field_k + (long)((sd) this).field_a)) {
                  break L12;
                } else {
                  if ((long)((sd) this).field_a + ((sd) this).field_k <= (long)param3 + ((sd) this).field_d) {
                    var7 = (long)((sd) this).field_a + ((sd) this).field_k;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (var5_long <= -1L) {
                  break L14;
                } else {
                  if (var5_long < var7) {
                    var9 = (int)(var7 + -var5_long);
                    sf.a(param2, (int)((long)param1 + (var5_long + -((sd) this).field_d)), ((sd) this).field_e, (int)(var5_long + -((sd) this).field_k), var9);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              ((sd) this).field_d = ((sd) this).field_d + (long)param3;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((sd) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("sd.J(").append(param0).append(44).append(param1).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if ((long)param0 != ((sd) this).field_c) {
            L1: {
              if (((sd) this).field_i == ((sd) this).field_c) {
                break L1;
              } else {
                ((sd) this).field_b.a((byte) -123, ((sd) this).field_c);
                ((sd) this).field_i = ((sd) this).field_c;
                break L1;
              }
            }
            L2: {
              ((sd) this).field_b.a(1, 0, ((sd) this).field_f, ((sd) this).field_j);
              ((sd) this).field_i = ((sd) this).field_i + (long)((sd) this).field_f;
              if (((sd) this).field_m >= ((sd) this).field_i) {
                break L2;
              } else {
                ((sd) this).field_m = ((sd) this).field_i;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((sd) this).field_k > ((sd) this).field_c) {
                  break L4;
                } else {
                  if (((sd) this).field_k + (long)((sd) this).field_a > ((sd) this).field_c) {
                    var2 = ((sd) this).field_c;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((sd) this).field_k < ((sd) this).field_c) {
                break L3;
              } else {
                if (((sd) this).field_k < ((sd) this).field_c + (long)((sd) this).field_f) {
                  var2 = ((sd) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((sd) this).field_k >= (long)((sd) this).field_f + ((sd) this).field_c) {
                  break L6;
                } else {
                  if (((sd) this).field_k - -(long)((sd) this).field_a < (long)((sd) this).field_f + ((sd) this).field_c) {
                    break L6;
                  } else {
                    var4 = (long)((sd) this).field_f + ((sd) this).field_c;
                    break L5;
                  }
                }
              }
              if (((sd) this).field_c >= (long)((sd) this).field_a + ((sd) this).field_k) {
                break L5;
              } else {
                if ((long)((sd) this).field_a + ((sd) this).field_k <= ((sd) this).field_c - -(long)((sd) this).field_f) {
                  var4 = ((sd) this).field_k + (long)((sd) this).field_a;
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
                  var6 = (int)(-var2 + var4);
                  sf.a(((sd) this).field_j, (int)(-((sd) this).field_c + var2), ((sd) this).field_e, (int)(-((sd) this).field_k + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((sd) this).field_f = 0;
            ((sd) this).field_c = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

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
              ((sd) this).a(param1.length, param1, (byte) -39, 0);
              if (param0 == -13848) {
                break L1;
              } else {
                ((sd) this).field_c = 25L;
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
            stackOut_3_1 = new StringBuilder().append("sd.E(").append(param0).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
        Object var15 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (~(param3 - -param0) >= ~param1.length) {
              L1: {
                if (-1L == ((sd) this).field_c) {
                  break L1;
                } else {
                  if (~((sd) this).field_c < ~((sd) this).field_d) {
                    break L1;
                  } else {
                    if (~(((sd) this).field_d + (long)param0) < ~((long)((sd) this).field_f + ((sd) this).field_c)) {
                      break L1;
                    } else {
                      sf.a(((sd) this).field_j, (int)(((sd) this).field_d - ((sd) this).field_c), param1, param3, param0);
                      ((sd) this).field_d = ((sd) this).field_d + (long)param0;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((sd) this).field_d;
                if (param2 == -39) {
                  break L2;
                } else {
                  var15 = null;
                  sd.a(10, (String) null, -35, 66, 53, (String) null);
                  break L2;
                }
              }
              L3: {
                var7 = param3;
                var8 = param0;
                if (((sd) this).field_d < ((sd) this).field_k) {
                  break L3;
                } else {
                  if (~((sd) this).field_d <= ~((long)((sd) this).field_a + ((sd) this).field_k)) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)((long)((sd) this).field_a - (-((sd) this).field_k + ((sd) this).field_d));
                      if (~var9_int >= ~param0) {
                        break L4;
                      } else {
                        var9_int = param0;
                        break L4;
                      }
                    }
                    sf.a(((sd) this).field_e, (int)(((sd) this).field_d - ((sd) this).field_k), param1, param3, var9_int);
                    ((sd) this).field_d = ((sd) this).field_d + (long)var9_int;
                    param3 = param3 + var9_int;
                    param0 = param0 - var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (~param0 >= ~((sd) this).field_e.length) {
                  if (param0 > 0) {
                    L6: {
                      this.a((byte) 0);
                      var9_int = param0;
                      if (~((sd) this).field_a > ~var9_int) {
                        var9_int = ((sd) this).field_a;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    sf.a(((sd) this).field_e, 0, param1, param3, var9_int);
                    param0 = param0 - var9_int;
                    ((sd) this).field_d = ((sd) this).field_d + (long)var9_int;
                    param3 = param3 + var9_int;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  ((sd) this).field_b.a((byte) -123, ((sd) this).field_d);
                  ((sd) this).field_i = ((sd) this).field_d;
                  L7: while (true) {
                    if (param0 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((sd) this).field_b.a(param1, false, param0, param3);
                      if (var9_int != -1) {
                        param3 = param3 + var9_int;
                        param0 = param0 - var9_int;
                        ((sd) this).field_i = ((sd) this).field_i + (long)var9_int;
                        ((sd) this).field_d = ((sd) this).field_d + (long)var9_int;
                        continue L7;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (((sd) this).field_c == -1L) {
                    break L9;
                  } else {
                    L10: {
                      if (~((sd) this).field_d <= ~((sd) this).field_c) {
                        break L10;
                      } else {
                        if (0 >= param0) {
                          break L10;
                        } else {
                          L11: {
                            var9_int = param3 + (int)(-((sd) this).field_d + ((sd) this).field_c);
                            if (param3 + param0 < var9_int) {
                              var9_int = param0 + param3;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: while (true) {
                            if (var9_int <= param3) {
                              break L10;
                            } else {
                              param0--;
                              int incrementValue$1 = param3;
                              param3++;
                              param1[incrementValue$1] = (byte) 0;
                              ((sd) this).field_d = ((sd) this).field_d + 1L;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      L14: {
                        var9 = -1L;
                        if (~((sd) this).field_c > ~var5_long) {
                          break L14;
                        } else {
                          if (((sd) this).field_c >= var5_long - -(long)var8) {
                            break L14;
                          } else {
                            var9 = ((sd) this).field_c;
                            break L13;
                          }
                        }
                      }
                      if (~((sd) this).field_c < ~var5_long) {
                        break L13;
                      } else {
                        if (~(((sd) this).field_c - -(long)((sd) this).field_f) >= ~var5_long) {
                          break L13;
                        } else {
                          var9 = var5_long;
                          break L13;
                        }
                      }
                    }
                    L15: {
                      L16: {
                        var11 = -1L;
                        if (var5_long >= ((sd) this).field_c + (long)((sd) this).field_f) {
                          break L16;
                        } else {
                          if (~((long)var8 + var5_long) <= ~(((sd) this).field_c - -(long)((sd) this).field_f)) {
                            var11 = (long)((sd) this).field_f + ((sd) this).field_c;
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (~(var5_long + (long)var8) >= ~((sd) this).field_c) {
                        break L15;
                      } else {
                        if ((long)((sd) this).field_f + ((sd) this).field_c >= var5_long + (long)var8) {
                          var11 = (long)var8 + var5_long;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var9 <= -1L) {
                      break L9;
                    } else {
                      if (~var11 >= ~var9) {
                        break L9;
                      } else {
                        var13 = (int)(var11 - var9);
                        sf.a(((sd) this).field_j, (int)(var9 + -((sd) this).field_c), param1, var7 - -(int)(-var5_long + var9), var13);
                        if (var11 > ((sd) this).field_d) {
                          param0 = (int)((long)param0 - (var11 - ((sd) this).field_d));
                          ((sd) this).field_d = var11;
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                break L8;
              }
              if (0 >= param0) {
                break L0;
              } else {
                throw new EOFException();
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((sd) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5_ref;
            stackOut_59_1 = new StringBuilder().append("sd.C(").append(param0).append(44);
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L17;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L17;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(long param0, int param1) throws IOException {
        Object var5 = null;
        L0: {
          if (param1 < -85) {
            break L0;
          } else {
            var5 = null;
            sd.a(-98, (String) null, 53, 5, -83, (String) null);
            break L0;
          }
        }
        if (0L > param0) {
          throw new IOException();
        } else {
          ((sd) this).field_d = param0;
          return;
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, String param5) {
        ab var9 = null;
        int var7 = 0;
        try {
            var9 = he.field_e;
            var9.b((byte) -58, param3);
            var9.field_g = var9.field_g + 1;
            if (param2 <= 60) {
                Object var8 = null;
                sd.a(-27, (String) null, 28, 54, -6, (String) null);
            }
            var7 = var9.field_g;
            var9.f(param4, (byte) -71);
            if (!(param4 != 2)) {
                var9.a(param5, 23333);
            }
            if (param1 == null) {
                var9.c(param0, (byte) -119);
            } else {
                int discarded$0 = jh.a((wk) (Object) var9, (byte) 127, param1);
            }
            var9.b(-var7 + var9.field_g, (byte) 43);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sd.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_l = null;
    }

    sd(kb param0, int param1, int param2) throws IOException {
        ((sd) this).field_k = -1L;
        ((sd) this).field_c = -1L;
        ((sd) this).field_f = 0;
        try {
            ((sd) this).field_b = param0;
            long dupTemp$0 = param0.a(-2775);
            ((sd) this).field_m = dupTemp$0;
            ((sd) this).field_h = dupTemp$0;
            ((sd) this).field_e = new byte[param1];
            ((sd) this).field_j = new byte[param2];
            ((sd) this).field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Sound: ";
        field_l = "You cannot add yourself!";
    }
}

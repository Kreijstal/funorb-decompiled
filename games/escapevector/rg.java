/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rg {
    private long field_f;
    private long field_d;
    static String field_c;
    private long field_i;
    private long field_k;
    private long field_a;
    private byte[] field_h;
    private long field_e;
    private byte[] field_g;
    private int field_l;
    private int field_j;
    private ma field_b;

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (~((rg) this).field_e > ~(((rg) this).field_d + (long)param3)) {
                ((rg) this).field_e = (long)param3 + ((rg) this).field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((rg) this).field_a == -1L) {
                break L2;
              } else {
                if (~((rg) this).field_a >= ~((rg) this).field_d) {
                  if (~((long)((rg) this).field_l + ((rg) this).field_a) <= ~((rg) this).field_d) {
                    break L2;
                  } else {
                    this.b(118);
                    break L2;
                  }
                } else {
                  this.b(118);
                  break L2;
                }
              }
            }
            L3: {
              if (((rg) this).field_a == -1L) {
                break L3;
              } else {
                if (((rg) this).field_d - -(long)param3 <= ((rg) this).field_a + (long)((rg) this).field_h.length) {
                  break L3;
                } else {
                  var5_int = (int)(((rg) this).field_a + -((rg) this).field_d + (long)((rg) this).field_h.length);
                  qg.a(param2, param1, ((rg) this).field_h, (int)(((rg) this).field_d - ((rg) this).field_a), var5_int);
                  param1 = param1 + var5_int;
                  ((rg) this).field_d = ((rg) this).field_d + (long)var5_int;
                  param3 = param3 - var5_int;
                  ((rg) this).field_l = ((rg) this).field_h.length;
                  this.b(115);
                  break L3;
                }
              }
            }
            if (((rg) this).field_h.length < param3) {
              L4: {
                if (~((rg) this).field_k != ~((rg) this).field_d) {
                  ((rg) this).field_b.a(((rg) this).field_d, 1);
                  ((rg) this).field_k = ((rg) this).field_d;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                ((rg) this).field_b.a(param2, param3, param1, -15814);
                ((rg) this).field_k = ((rg) this).field_k + (long)param3;
                if (~((rg) this).field_i <= ~((rg) this).field_k) {
                  break L5;
                } else {
                  ((rg) this).field_i = ((rg) this).field_k;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var5_long = -1L;
                  if (((rg) this).field_f > ((rg) this).field_d) {
                    break L7;
                  } else {
                    if (((rg) this).field_f + (long)((rg) this).field_j > ((rg) this).field_d) {
                      var5_long = ((rg) this).field_d;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (~((rg) this).field_f > ~((rg) this).field_d) {
                  break L6;
                } else {
                  if (~((rg) this).field_f > ~((long)param3 + ((rg) this).field_d)) {
                    var5_long = ((rg) this).field_f;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                L9: {
                  var7 = -1L;
                  if (~(((rg) this).field_d + (long)param3) >= ~((rg) this).field_f) {
                    break L9;
                  } else {
                    if (~((long)((rg) this).field_j + ((rg) this).field_f) > ~(((rg) this).field_d + (long)param3)) {
                      break L9;
                    } else {
                      var7 = (long)param3 + ((rg) this).field_d;
                      break L8;
                    }
                  }
                }
                if (~(((rg) this).field_f + (long)((rg) this).field_j) >= ~((rg) this).field_d) {
                  break L8;
                } else {
                  if (~((long)((rg) this).field_j + ((rg) this).field_f) < ~((long)param3 + ((rg) this).field_d)) {
                    break L8;
                  } else {
                    var7 = ((rg) this).field_f + (long)((rg) this).field_j;
                    break L8;
                  }
                }
              }
              L10: {
                if (var5_long <= -1L) {
                  break L10;
                } else {
                  if (var5_long >= var7) {
                    break L10;
                  } else {
                    var9 = (int)(var7 - var5_long);
                    qg.a(param2, (int)(var5_long + (long)param1 + -((rg) this).field_d), ((rg) this).field_g, (int)(var5_long + -((rg) this).field_f), var9);
                    break L10;
                  }
                }
              }
              ((rg) this).field_d = ((rg) this).field_d + (long)param3;
              return;
            } else {
              if (param3 <= 0) {
                L11: {
                  if (param0) {
                    break L11;
                  } else {
                    ((rg) this).field_g = null;
                    break L11;
                  }
                }
                break L0;
              } else {
                L12: {
                  if (((rg) this).field_a == -1L) {
                    ((rg) this).field_a = ((rg) this).field_d;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  qg.a(param2, param1, ((rg) this).field_h, (int)(((rg) this).field_d - ((rg) this).field_a), param3);
                  ((rg) this).field_d = ((rg) this).field_d + (long)param3;
                  if (((rg) this).field_d + -((rg) this).field_a > (long)((rg) this).field_l) {
                    ((rg) this).field_l = (int)(((rg) this).field_d + -((rg) this).field_a);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((rg) this).field_k = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5_ref;
            stackOut_52_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
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

    final void a(byte param0) throws IOException {
        if (param0 != -111) {
            field_c = null;
        }
        this.b(125);
        ((rg) this).field_b.a(0);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (((rg) this).field_a != -1L) {
            L1: {
              if (((rg) this).field_a != ((rg) this).field_k) {
                ((rg) this).field_b.a(((rg) this).field_a, 1);
                ((rg) this).field_k = ((rg) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((rg) this).field_b.a(((rg) this).field_h, ((rg) this).field_l, 0, -15814);
              ((rg) this).field_k = ((rg) this).field_k + (long)((rg) this).field_l;
              if (((rg) this).field_i >= ((rg) this).field_k) {
                break L2;
              } else {
                ((rg) this).field_i = ((rg) this).field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                if (((rg) this).field_a < ((rg) this).field_f) {
                  break L4;
                } else {
                  if (((rg) this).field_f - -(long)((rg) this).field_j <= ((rg) this).field_a) {
                    break L4;
                  } else {
                    var2_long = ((rg) this).field_a;
                    break L3;
                  }
                }
              }
              if (~((rg) this).field_f > ~((rg) this).field_a) {
                break L3;
              } else {
                if (~((rg) this).field_f > ~(((rg) this).field_a + (long)((rg) this).field_l)) {
                  var2_long = ((rg) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((long)((rg) this).field_l + ((rg) this).field_a) >= ~((rg) this).field_f) {
                  break L6;
                } else {
                  if ((long)((rg) this).field_j + ((rg) this).field_f < ((rg) this).field_a - -(long)((rg) this).field_l) {
                    break L6;
                  } else {
                    var4 = (long)((rg) this).field_l + ((rg) this).field_a;
                    break L5;
                  }
                }
              }
              if (~((rg) this).field_a <= ~(((rg) this).field_f + (long)((rg) this).field_j)) {
                break L5;
              } else {
                if (~(((rg) this).field_f + (long)((rg) this).field_j) < ~(((rg) this).field_a + (long)((rg) this).field_l)) {
                  break L5;
                } else {
                  var4 = ((rg) this).field_f + (long)((rg) this).field_j;
                  break L5;
                }
              }
            }
            L7: {
              if (var2_long <= -1L) {
                break L7;
              } else {
                if (~var2_long > ~var4) {
                  var6 = (int)(-var2_long + var4);
                  qg.a(((rg) this).field_h, (int)(-((rg) this).field_a + var2_long), ((rg) this).field_g, (int)(-((rg) this).field_f + var2_long), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((rg) this).field_l = 0;
            ((rg) this).field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 81 / ((56 - param0) / 50);
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((rg) this).field_d = param1;
    }

    final long a(int param0) {
        if (param0 != 16034) {
            rg.b((byte) -75);
        }
        return ((rg) this).field_e;
    }

    private final void a() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        ((rg) this).field_j = 0;
        if (!(((rg) this).field_d == ((rg) this).field_k)) {
            ((rg) this).field_b.a(((rg) this).field_d, 1);
            ((rg) this).field_k = ((rg) this).field_d;
        }
        ((rg) this).field_f = ((rg) this).field_d;
        while (((rg) this).field_g.length > ((rg) this).field_j) {
            var2 = ((rg) this).field_g.length + -((rg) this).field_j;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((rg) this).field_b.a(var2, (byte) 127, ((rg) this).field_g, ((rg) this).field_j);
            if (var3 == -1) {
                break;
            }
            ((rg) this).field_j = ((rg) this).field_j + var3;
            ((rg) this).field_k = ((rg) this).field_k + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = -78 / ((-11 - param0) / 41);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        var14 = EscapeVector.field_A;
        try {
          L0: {
            if (param2 == 101) {
              if (~(param0 - -param1) < ~param3.length) {
                throw new ArrayIndexOutOfBoundsException(param1 + (param0 + -param3.length));
              } else {
                L1: {
                  if (((rg) this).field_a == -1L) {
                    break L1;
                  } else {
                    if (~((rg) this).field_d > ~((rg) this).field_a) {
                      break L1;
                    } else {
                      if ((long)((rg) this).field_l + ((rg) this).field_a < (long)param1 + ((rg) this).field_d) {
                        break L1;
                      } else {
                        qg.a(((rg) this).field_h, (int)(-((rg) this).field_a + ((rg) this).field_d), param3, param0, param1);
                        ((rg) this).field_d = ((rg) this).field_d + (long)param1;
                        return;
                      }
                    }
                  }
                }
                L2: {
                  var5_long = ((rg) this).field_d;
                  var7 = param0;
                  var8 = param1;
                  if (~((rg) this).field_f < ~((rg) this).field_d) {
                    break L2;
                  } else {
                    if (((rg) this).field_d >= ((rg) this).field_f - -(long)((rg) this).field_j) {
                      break L2;
                    } else {
                      L3: {
                        var9_int = (int)(-((rg) this).field_d - -((rg) this).field_f + (long)((rg) this).field_j);
                        if (~param1 <= ~var9_int) {
                          break L3;
                        } else {
                          var9_int = param1;
                          break L3;
                        }
                      }
                      qg.a(((rg) this).field_g, (int)(((rg) this).field_d - ((rg) this).field_f), param3, param0, var9_int);
                      param0 = param0 + var9_int;
                      param1 = param1 - var9_int;
                      ((rg) this).field_d = ((rg) this).field_d + (long)var9_int;
                      break L2;
                    }
                  }
                }
                L4: {
                  if (~param1 < ~((rg) this).field_g.length) {
                    ((rg) this).field_b.a(((rg) this).field_d, 1);
                    ((rg) this).field_k = ((rg) this).field_d;
                    L5: while (true) {
                      if (param1 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((rg) this).field_b.a(param1, (byte) 125, param3, param0);
                        if (var9_int == -1) {
                          break L4;
                        } else {
                          param0 = param0 + var9_int;
                          ((rg) this).field_d = ((rg) this).field_d + (long)var9_int;
                          param1 = param1 - var9_int;
                          ((rg) this).field_k = ((rg) this).field_k + (long)var9_int;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    if (param1 <= 0) {
                      break L4;
                    } else {
                      L6: {
                        int discarded$2 = 1;
                        this.a();
                        var9_int = param1;
                        if (var9_int > ((rg) this).field_j) {
                          var9_int = ((rg) this).field_j;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      qg.a(((rg) this).field_g, 0, param3, param0, var9_int);
                      ((rg) this).field_d = ((rg) this).field_d + (long)var9_int;
                      param1 = param1 - var9_int;
                      param0 = param0 + var9_int;
                      break L4;
                    }
                  }
                }
                L7: {
                  L8: {
                    if (((rg) this).field_a == -1L) {
                      break L8;
                    } else {
                      L9: {
                        if (~((rg) this).field_a >= ~((rg) this).field_d) {
                          break L9;
                        } else {
                          if (0 >= param1) {
                            break L9;
                          } else {
                            L10: {
                              var9_int = param0 + (int)(((rg) this).field_a + -((rg) this).field_d);
                              if (var9_int <= param0 + param1) {
                                break L10;
                              } else {
                                var9_int = param1 + param0;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (~param0 <= ~var9_int) {
                                break L9;
                              } else {
                                int incrementValue$3 = param0;
                                param0++;
                                param3[incrementValue$3] = (byte) 0;
                                param1--;
                                ((rg) this).field_d = ((rg) this).field_d + 1L;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var9 = -1L;
                          var11 = -1L;
                          if (var5_long > ((rg) this).field_a) {
                            break L13;
                          } else {
                            if (((rg) this).field_a < var5_long + (long)var8) {
                              var9 = ((rg) this).field_a;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (~((rg) this).field_a < ~var5_long) {
                          break L12;
                        } else {
                          if (~var5_long <= ~((long)((rg) this).field_l + ((rg) this).field_a)) {
                            break L12;
                          } else {
                            var9 = var5_long;
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (~var5_long <= ~((long)((rg) this).field_l + ((rg) this).field_a)) {
                            break L15;
                          } else {
                            if (((rg) this).field_a + (long)((rg) this).field_l > var5_long + (long)var8) {
                              break L15;
                            } else {
                              var11 = (long)((rg) this).field_l + ((rg) this).field_a;
                              break L14;
                            }
                          }
                        }
                        if (var5_long + (long)var8 <= ((rg) this).field_a) {
                          break L14;
                        } else {
                          if (~(((rg) this).field_a - -(long)((rg) this).field_l) > ~((long)var8 + var5_long)) {
                            break L14;
                          } else {
                            var11 = var5_long - -(long)var8;
                            break L14;
                          }
                        }
                      }
                      if (var9 <= -1L) {
                        break L8;
                      } else {
                        if (~var11 < ~var9) {
                          var13 = (int)(var11 + -var9);
                          qg.a(((rg) this).field_h, (int)(-((rg) this).field_a + var9), param3, var7 + (int)(var9 - var5_long), var13);
                          if (~((rg) this).field_d <= ~var11) {
                            break L8;
                          } else {
                            param1 = (int)((long)param1 - (var11 + -((rg) this).field_d));
                            ((rg) this).field_d = var11;
                            break L8;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L7;
                }
                if (param1 > 0) {
                  throw new EOFException();
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
          ((rg) this).field_k = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("rg.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ')');
        }
    }

    final static short[] a(c param0, int param1, short[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = param0.j(16, 8);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (var4_int != param2.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param2 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.j(4, 8);
                var6 = (short)param0.j(16, 8);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (short)(var6 + param0.j(var5, 8));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) param2;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("rg.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(16).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + -1 + ')');
        }
        return stackIn_16_0;
    }

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        dm var4_ref_dm = null;
        int var4 = 0;
        int var5_int = 0;
        dm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = EscapeVector.field_A;
        try {
          if (ck.field_t != al.field_d) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            var2_long = td.b(128);
            L0: {
              L1: {
                if (vj.field_a == 0) {
                  break L1;
                } else {
                  if (eh.field_a < 0) {
                    L2: {
                      var4_ref_dm = (dm) (Object) bb.field_L.a(false);
                      if (var4_ref_dm == null) {
                        break L2;
                      } else {
                        if (~var4_ref_dm.field_g > ~var2_long) {
                          var4_ref_dm.c((byte) -67);
                          hi.field_r = var4_ref_dm.field_j.length;
                          om.field_g.field_m = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= hi.field_r) {
                              g.field_q = f.field_t;
                              f.field_t = jj.field_b;
                              jj.field_b = cd.field_v;
                              cd.field_v = var4_ref_dm.field_i;
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0 != 0;
                            } else {
                              om.field_g.field_g[var5_int] = var4_ref_dm.field_j[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_19_0 = eh.field_a;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_18_0 = eh.field_a;
              stackIn_21_0 = stackOut_18_0;
              break L0;
            }
            L4: while (true) {
              L5: {
                if (stackIn_21_0 >= 0) {
                  break L5;
                } else {
                  om.field_g.field_m = 0;
                  if (bo.a(30000, 1)) {
                    eh.field_a = om.field_g.k(8);
                    om.field_g.field_m = 0;
                    hi.field_r = param0[eh.field_a];
                    break L5;
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
                  }
                }
              }
              if (ll.d(10550)) {
                if (vj.field_a != 0) {
                  L6: {
                    var4 = vj.field_a;
                    if (pd.field_a == 0.0) {
                      break L6;
                    } else {
                      var4 = (int)((double)var4 + gk.field_a.nextGaussian() * pd.field_a);
                      if (var4 >= 0) {
                        break L6;
                      } else {
                        var4 = 0;
                        break L6;
                      }
                    }
                  }
                  var5 = new dm(var2_long - -(long)var4, eh.field_a, new byte[hi.field_r]);
                  var6 = 0;
                  L7: while (true) {
                    if (var6 >= hi.field_r) {
                      bb.field_L.a(-12328, (hg) (Object) var5);
                      eh.field_a = -1;
                      stackOut_20_0 = eh.field_a;
                      stackIn_21_0 = stackOut_20_0;
                      continue L4;
                    } else {
                      var5.field_j[var6] = om.field_g.field_g[var6];
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  g.field_q = f.field_t;
                  f.field_t = jj.field_b;
                  jj.field_b = cd.field_v;
                  cd.field_v = eh.field_a;
                  eh.field_a = -1;
                  stackOut_30_0 = 1;
                  stackIn_31_0 = stackOut_30_0;
                  return stackIn_31_0 != 0;
                }
              } else {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                return stackIn_28_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("rg.A(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + 109 + ')');
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            if (param0 < 31) {
            }
            ((rg) this).a(0, param1.length, (byte) 101, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "rg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rg(ma param0, int param1, int param2) throws IOException {
        ((rg) this).field_f = -1L;
        ((rg) this).field_a = -1L;
        ((rg) this).field_l = 0;
        try {
            ((rg) this).field_b = param0;
            long dupTemp$0 = param0.c(-26510);
            ((rg) this).field_i = dupTemp$0;
            ((rg) this).field_e = dupTemp$0;
            ((rg) this).field_d = 0L;
            ((rg) this).field_g = new byte[param1];
            ((rg) this).field_h = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static lm a(String[] args, byte param1) {
        lm var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        lm stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -53) {
              var2 = new lm(false);
              var2.field_c = args;
              stackOut_3_0 = (lm) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("rg.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (args == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Names cannot contain consecutive spaces";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private byte[] field_e;
    private long field_k;
    private int field_j;
    private long field_m;
    private byte[] field_l;
    private long field_a;
    private long field_d;
    private long field_b;
    private int field_f;
    private fm field_g;
    private long field_c;
    static int[] field_h;
    static String field_i;

    final void c(int param0) throws IOException {
        this.a(0);
        ((pf) this).field_g.b(0);
        if (param0 >= -77) {
            ((pf) this).field_a = -48L;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == 9) {
              L1: {
                if (~(((pf) this).field_c - -(long)param0) < ~((pf) this).field_m) {
                  ((pf) this).field_m = (long)param0 + ((pf) this).field_c;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((pf) this).field_a == -1L) {
                  break L2;
                } else {
                  if (~((pf) this).field_c <= ~((pf) this).field_a) {
                    if (((pf) this).field_c <= ((pf) this).field_a + (long)((pf) this).field_f) {
                      break L2;
                    } else {
                      this.a(0);
                      break L2;
                    }
                  } else {
                    this.a(0);
                    break L2;
                  }
                }
              }
              L3: {
                if (((pf) this).field_a == -1L) {
                  break L3;
                } else {
                  if (~((long)((pf) this).field_l.length + ((pf) this).field_a) > ~((long)param0 + ((pf) this).field_c)) {
                    var5_int = (int)(((pf) this).field_a - (((pf) this).field_c - (long)((pf) this).field_l.length));
                    lj.a(param3, param2, ((pf) this).field_l, (int)(((pf) this).field_c + -((pf) this).field_a), var5_int);
                    param0 = param0 - var5_int;
                    param2 = param2 + var5_int;
                    ((pf) this).field_c = ((pf) this).field_c + (long)var5_int;
                    ((pf) this).field_f = ((pf) this).field_l.length;
                    this.a(0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (((pf) this).field_l.length < param0) {
                L4: {
                  if (~((pf) this).field_c != ~((pf) this).field_b) {
                    ((pf) this).field_g.a(-54, ((pf) this).field_c);
                    ((pf) this).field_b = ((pf) this).field_c;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((pf) this).field_g.a(-20832, param0, param3, param2);
                  ((pf) this).field_b = ((pf) this).field_b + (long)param0;
                  if (((pf) this).field_k < ((pf) this).field_b) {
                    ((pf) this).field_k = ((pf) this).field_b;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var5_long = -1L;
                    if (((pf) this).field_c < ((pf) this).field_d) {
                      break L7;
                    } else {
                      if (~((long)((pf) this).field_j + ((pf) this).field_d) < ~((pf) this).field_c) {
                        var5_long = ((pf) this).field_c;
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (((pf) this).field_d < ((pf) this).field_c) {
                    break L6;
                  } else {
                    if (((pf) this).field_c - -(long)param0 <= ((pf) this).field_d) {
                      break L6;
                    } else {
                      var5_long = ((pf) this).field_d;
                      break L6;
                    }
                  }
                }
                L8: {
                  L9: {
                    var7 = -1L;
                    if (~((long)param0 + ((pf) this).field_c) >= ~((pf) this).field_d) {
                      break L9;
                    } else {
                      if (~(((pf) this).field_c + (long)param0) < ~(((pf) this).field_d + (long)((pf) this).field_j)) {
                        break L9;
                      } else {
                        var7 = ((pf) this).field_c + (long)param0;
                        break L8;
                      }
                    }
                  }
                  if (((pf) this).field_c >= (long)((pf) this).field_j + ((pf) this).field_d) {
                    break L8;
                  } else {
                    if (((pf) this).field_c + (long)param0 >= (long)((pf) this).field_j + ((pf) this).field_d) {
                      var7 = ((pf) this).field_d - -(long)((pf) this).field_j;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  if (var5_long <= -1L) {
                    break L10;
                  } else {
                    if (~var7 >= ~var5_long) {
                      break L10;
                    } else {
                      var9 = (int)(var7 - var5_long);
                      lj.a(param3, (int)((long)param2 + var5_long - ((pf) this).field_c), ((pf) this).field_e, (int)(var5_long + -((pf) this).field_d), var9);
                      break L10;
                    }
                  }
                }
                ((pf) this).field_c = ((pf) this).field_c + (long)param0;
                return;
              } else {
                if (param0 > 0) {
                  L11: {
                    if (-1L == ((pf) this).field_a) {
                      ((pf) this).field_a = ((pf) this).field_c;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    lj.a(param3, param2, ((pf) this).field_l, (int)(((pf) this).field_c + -((pf) this).field_a), param0);
                    ((pf) this).field_c = ((pf) this).field_c + (long)param0;
                    if (~(-((pf) this).field_a + ((pf) this).field_c) >= ~(long)((pf) this).field_f) {
                      break L12;
                    } else {
                      ((pf) this).field_f = (int)(-((pf) this).field_a + ((pf) this).field_c);
                      break L12;
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
          ((pf) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var5_ref;
            stackOut_54_1 = new StringBuilder().append("pf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L13;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L13;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        Object var5 = null;
        if (0L > param1) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == 123) {
              break L0;
            } else {
              var5 = null;
              String discarded$2 = pf.a(-121, (CharSequence[]) null);
              break L0;
            }
          }
          ((pf) this).field_c = param1;
          return;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 11739) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = pf.a(-18, (CharSequence[]) null);
                break L1;
              }
            }
            stackOut_2_0 = fc.a(param1, -2, 0, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pf.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final long b(byte param0) {
        if (param0 < 95) {
            Object var3 = null;
            String discarded$0 = pf.a(-91, (CharSequence[]) null);
        }
        return ((pf) this).field_m;
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
        var14 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 83) {
                break L1;
              } else {
                ((pf) this).field_g = null;
                break L1;
              }
            }
            try {
              L2: {
                if (param1.length >= param0 + param3) {
                  L3: {
                    if (((pf) this).field_a == -1L) {
                      break L3;
                    } else {
                      if (((pf) this).field_c < ((pf) this).field_a) {
                        break L3;
                      } else {
                        if (~((long)param3 + ((pf) this).field_c) < ~(((pf) this).field_a + (long)((pf) this).field_f)) {
                          break L3;
                        } else {
                          lj.a(((pf) this).field_l, (int)(((pf) this).field_c + -((pf) this).field_a), param1, param0, param3);
                          ((pf) this).field_c = ((pf) this).field_c + (long)param3;
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var5_long = ((pf) this).field_c;
                    var7 = param0;
                    var8 = param3;
                    if (~((pf) this).field_c > ~((pf) this).field_d) {
                      break L4;
                    } else {
                      if (~((pf) this).field_c > ~(((pf) this).field_d - -(long)((pf) this).field_j)) {
                        L5: {
                          var9_int = (int)((long)((pf) this).field_j + (((pf) this).field_d + -((pf) this).field_c));
                          if (param3 >= var9_int) {
                            break L5;
                          } else {
                            var9_int = param3;
                            break L5;
                          }
                        }
                        lj.a(((pf) this).field_e, (int)(-((pf) this).field_d + ((pf) this).field_c), param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((pf) this).field_c = ((pf) this).field_c + (long)var9_int;
                        param3 = param3 - var9_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (((pf) this).field_e.length < param3) {
                      ((pf) this).field_g.a(100, ((pf) this).field_c);
                      ((pf) this).field_b = ((pf) this).field_c;
                      L7: while (true) {
                        if (param3 <= 0) {
                          break L6;
                        } else {
                          var9_int = ((pf) this).field_g.a(false, param1, param0, param3);
                          if (var9_int != -1) {
                            param3 = param3 - var9_int;
                            param0 = param0 + var9_int;
                            ((pf) this).field_b = ((pf) this).field_b + (long)var9_int;
                            ((pf) this).field_c = ((pf) this).field_c + (long)var9_int;
                            continue L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    } else {
                      if (param3 <= 0) {
                        break L6;
                      } else {
                        L8: {
                          int discarded$2 = -55;
                          this.a();
                          var9_int = param3;
                          if (var9_int <= ((pf) this).field_j) {
                            break L8;
                          } else {
                            var9_int = ((pf) this).field_j;
                            break L8;
                          }
                        }
                        lj.a(((pf) this).field_e, 0, param1, param0, var9_int);
                        ((pf) this).field_c = ((pf) this).field_c + (long)var9_int;
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (((pf) this).field_a != -1L) {
                      L10: {
                        if (~((pf) this).field_c <= ~((pf) this).field_a) {
                          break L10;
                        } else {
                          if (param3 > 0) {
                            L11: {
                              var9_int = param0 - -(int)(((pf) this).field_a + -((pf) this).field_c);
                              if (var9_int > param3 + param0) {
                                var9_int = param0 - -param3;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (param0 >= var9_int) {
                                break L10;
                              } else {
                                int incrementValue$3 = param0;
                                param0++;
                                param1[incrementValue$3] = (byte) 0;
                                param3--;
                                ((pf) this).field_c = ((pf) this).field_c + 1L;
                                continue L12;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          var9 = -1L;
                          if (var5_long > ((pf) this).field_a) {
                            break L14;
                          } else {
                            if (~((pf) this).field_a > ~(var5_long - -(long)var8)) {
                              var9 = ((pf) this).field_a;
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (~((pf) this).field_a < ~var5_long) {
                          break L13;
                        } else {
                          if ((long)((pf) this).field_f + ((pf) this).field_a <= var5_long) {
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
                          if (((pf) this).field_a + (long)((pf) this).field_f <= var5_long) {
                            break L16;
                          } else {
                            if (~(var5_long + (long)var8) <= ~(((pf) this).field_a + (long)((pf) this).field_f)) {
                              var11 = (long)((pf) this).field_f + ((pf) this).field_a;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (~((pf) this).field_a <= ~(var5_long - -(long)var8)) {
                          break L15;
                        } else {
                          if (((pf) this).field_a + (long)((pf) this).field_f >= (long)var8 + var5_long) {
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
                        if (~var9 > ~var11) {
                          var13 = (int)(-var9 + var11);
                          lj.a(((pf) this).field_l, (int)(-((pf) this).field_a + var9), param1, var7 + (int)(var9 - var5_long), var13);
                          if (~var11 < ~((pf) this).field_c) {
                            param3 = (int)((long)param3 - (var11 - ((pf) this).field_c));
                            ((pf) this).field_c = var11;
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  break L2;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param0 + (param3 - param1.length));
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              ((pf) this).field_b = -1L;
              throw var5;
            }
            if (param3 > 0) {
              throw new EOFException();
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var5_ref;
            stackOut_63_1 = new StringBuilder().append("pf.J(").append(param0).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param1 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L17;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L17;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != -4) {
            return;
        }
        try {
            ((pf) this).a(0, param0, (byte) 123, param0.length);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "pf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        ((pf) this).field_j = 0;
        if (((pf) this).field_c != ((pf) this).field_b) {
            ((pf) this).field_g.a(-125, ((pf) this).field_c);
            ((pf) this).field_b = ((pf) this).field_c;
        }
        ((pf) this).field_d = ((pf) this).field_c;
        while (((pf) this).field_j < ((pf) this).field_e.length) {
            var2 = ((pf) this).field_e.length - ((pf) this).field_j;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((pf) this).field_g.a(false, ((pf) this).field_e, ((pf) this).field_j, var2);
            if (var3 == -1) {
                break;
            }
            ((pf) this).field_j = ((pf) this).field_j + var3;
            ((pf) this).field_b = ((pf) this).field_b + (long)var3;
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (-1L != ((pf) this).field_a) {
            L1: {
              if (~((pf) this).field_b != ~((pf) this).field_a) {
                ((pf) this).field_g.a(113, ((pf) this).field_a);
                ((pf) this).field_b = ((pf) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((pf) this).field_g.a(-20832, ((pf) this).field_f, ((pf) this).field_l, 0);
              ((pf) this).field_b = ((pf) this).field_b + (long)((pf) this).field_f;
              if (~((pf) this).field_k > ~((pf) this).field_b) {
                ((pf) this).field_k = ((pf) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((pf) this).field_d > ((pf) this).field_a) {
                  break L4;
                } else {
                  if (~((long)((pf) this).field_j + ((pf) this).field_d) >= ~((pf) this).field_a) {
                    break L4;
                  } else {
                    var2 = ((pf) this).field_a;
                    break L3;
                  }
                }
              }
              if (((pf) this).field_a > ((pf) this).field_d) {
                break L3;
              } else {
                if (~((pf) this).field_d <= ~(((pf) this).field_a - -(long)((pf) this).field_f)) {
                  break L3;
                } else {
                  var2 = ((pf) this).field_d;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((pf) this).field_d <= ~((long)((pf) this).field_f + ((pf) this).field_a)) {
                  break L6;
                } else {
                  if (~(((pf) this).field_a - -(long)((pf) this).field_f) < ~(((pf) this).field_d + (long)((pf) this).field_j)) {
                    break L6;
                  } else {
                    var4 = ((pf) this).field_a - -(long)((pf) this).field_f;
                    break L5;
                  }
                }
              }
              if ((long)((pf) this).field_j + ((pf) this).field_d <= ((pf) this).field_a) {
                break L5;
              } else {
                if (~((long)((pf) this).field_j + ((pf) this).field_d) >= ~(((pf) this).field_a + (long)((pf) this).field_f)) {
                  var4 = (long)((pf) this).field_j + ((pf) this).field_d;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (~var2 > ~var4) {
                  var6 = (int)(var4 - var2);
                  lj.a(((pf) this).field_l, (int)(var2 + -((pf) this).field_a), ((pf) this).field_e, (int)(var2 - ((pf) this).field_d), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((pf) this).field_f = 0;
            ((pf) this).field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 > -42) {
            return;
        }
        field_i = null;
        field_h = null;
    }

    pf(fm param0, int param1, int param2) throws IOException {
        ((pf) this).field_a = -1L;
        ((pf) this).field_f = 0;
        ((pf) this).field_d = -1L;
        try {
            ((pf) this).field_g = param0;
            long dupTemp$0 = param0.a((byte) -115);
            ((pf) this).field_k = dupTemp$0;
            ((pf) this).field_m = dupTemp$0;
            ((pf) this).field_l = new byte[param2];
            ((pf) this).field_c = 0L;
            ((pf) this).field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{0, 0, 640, 0, 640, 376, 0, 376};
        field_i = "Hold <col=FFFFFF>Ctrl</col> to fire!";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td {
    static ai field_o;
    private long field_h;
    static String field_j;
    private long field_d;
    private byte[] field_g;
    private byte[] field_i;
    private long field_l;
    private long field_n;
    private cb field_b;
    static String[] field_f;
    private int field_a;
    private int field_c;
    private long field_k;
    static int field_p;
    private long field_e;
    static int field_m;

    final void a(long param0, int param1) throws IOException {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < 0L) {
              throw new IOException();
            } else {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              ((td) this).field_l = param0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var4, "td.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -79 / ((52 - param0) / 50);
              if (((td) this).field_d == -1L) {
                break L1;
              } else {
                L2: {
                  if (((td) this).field_h == ((td) this).field_d) {
                    break L2;
                  } else {
                    ((td) this).field_b.a(0, ((td) this).field_d);
                    ((td) this).field_h = ((td) this).field_d;
                    break L2;
                  }
                }
                L3: {
                  ((td) this).field_b.a(0, ((td) this).field_i, 494, ((td) this).field_c);
                  ((td) this).field_h = ((td) this).field_h + (long)((td) this).field_c;
                  if (((td) this).field_h > ((td) this).field_k) {
                    ((td) this).field_k = ((td) this).field_h;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = -1L;
                    var5 = -1L;
                    if (~((td) this).field_d > ~((td) this).field_e) {
                      break L5;
                    } else {
                      if (~((td) this).field_d <= ~((long)((td) this).field_a + ((td) this).field_e)) {
                        break L5;
                      } else {
                        var3 = ((td) this).field_d;
                        break L4;
                      }
                    }
                  }
                  if (~((td) this).field_d < ~((td) this).field_e) {
                    break L4;
                  } else {
                    if (((td) this).field_d - -(long)((td) this).field_c <= ((td) this).field_e) {
                      break L4;
                    } else {
                      var3 = ((td) this).field_e;
                      break L4;
                    }
                  }
                }
                L6: {
                  L7: {
                    if ((long)((td) this).field_c + ((td) this).field_d <= ((td) this).field_e) {
                      break L7;
                    } else {
                      if ((long)((td) this).field_c + ((td) this).field_d <= ((td) this).field_e - -(long)((td) this).field_a) {
                        var5 = (long)((td) this).field_c + ((td) this).field_d;
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (~(((td) this).field_e + (long)((td) this).field_a) >= ~((td) this).field_d) {
                    break L6;
                  } else {
                    if (~(((td) this).field_d + (long)((td) this).field_c) <= ~((long)((td) this).field_a + ((td) this).field_e)) {
                      var5 = ((td) this).field_e + (long)((td) this).field_a;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var3 <= -1L) {
                    break L8;
                  } else {
                    if (~var3 <= ~var5) {
                      break L8;
                    } else {
                      var7 = (int)(-var3 + var5);
                      ug.a(((td) this).field_i, (int)(var3 - ((td) this).field_d), ((td) this).field_g, (int)(var3 - ((td) this).field_e), var7);
                      break L8;
                    }
                  }
                }
                ((td) this).field_d = -1L;
                ((td) this).field_c = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "td.J(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (null != bg.field_c) {
              L1: {
                if (~param0 > ~nh.field_f) {
                  break L1;
                } else {
                  if (bg.field_c.field_u + nh.field_f <= param0) {
                    break L1;
                  } else {
                    if (param1 < lf.field_Z) {
                      break L1;
                    } else {
                      if (~param1 <= ~(lf.field_Z + bg.field_c.field_v)) {
                        break L1;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                }
              }
              L2: {
                if (~param0 > ~qf.field_e) {
                  break L2;
                } else {
                  if (~(qf.field_e + bg.field_c.field_u) >= ~param0) {
                    break L2;
                  } else {
                    if (mf.field_d > param1) {
                      break L2;
                    } else {
                      if (mf.field_d + bg.field_c.field_v <= param1) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      }
                    }
                  }
                }
              }
              if (param2) {
                stackOut_30_0 = -1;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              } else {
                stackOut_28_0 = 95;
                stackIn_29_0 = stackOut_28_0;
                return stackIn_29_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "td.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_31_0;
    }

    final void a(int param0, int param1, boolean param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              if ((long)param1 + ((td) this).field_l > ((td) this).field_n) {
                ((td) this).field_n = (long)param1 + ((td) this).field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                field_j = null;
                break L2;
              }
            }
            L3: {
              if (((td) this).field_d == -1L) {
                break L3;
              } else {
                L4: {
                  if (((td) this).field_l < ((td) this).field_d) {
                    break L4;
                  } else {
                    if (~((td) this).field_l >= ~(((td) this).field_d + (long)((td) this).field_c)) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.a((byte) -53);
                break L3;
              }
            }
            L5: {
              if (((td) this).field_d == -1L) {
                break L5;
              } else {
                if (((td) this).field_d + (long)((td) this).field_i.length >= (long)param1 + ((td) this).field_l) {
                  break L5;
                } else {
                  var5_int = (int)((long)((td) this).field_i.length + ((td) this).field_d + -((td) this).field_l);
                  ug.a(param3, param0, ((td) this).field_i, (int)(-((td) this).field_d + ((td) this).field_l), var5_int);
                  ((td) this).field_l = ((td) this).field_l + (long)var5_int;
                  param1 = param1 - var5_int;
                  param0 = param0 + var5_int;
                  ((td) this).field_c = ((td) this).field_i.length;
                  this.a((byte) 125);
                  break L5;
                }
              }
            }
            if (~((td) this).field_i.length > ~param1) {
              L6: {
                if (~((td) this).field_l == ~((td) this).field_h) {
                  break L6;
                } else {
                  ((td) this).field_b.a(0, ((td) this).field_l);
                  ((td) this).field_h = ((td) this).field_l;
                  break L6;
                }
              }
              L7: {
                ((td) this).field_b.a(param0, param3, 494, param1);
                ((td) this).field_h = ((td) this).field_h + (long)param1;
                if (~((td) this).field_k > ~((td) this).field_h) {
                  ((td) this).field_k = ((td) this).field_h;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  if (~((td) this).field_e < ~((td) this).field_l) {
                    break L9;
                  } else {
                    if (((td) this).field_l < (long)((td) this).field_a + ((td) this).field_e) {
                      var5_long = ((td) this).field_l;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (((td) this).field_l > ((td) this).field_e) {
                  break L8;
                } else {
                  if (~((long)param1 + ((td) this).field_l) >= ~((td) this).field_e) {
                    break L8;
                  } else {
                    var5_long = ((td) this).field_e;
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  var7 = -1L;
                  if (((td) this).field_e >= (long)param1 + ((td) this).field_l) {
                    break L11;
                  } else {
                    if (~(((td) this).field_e - -(long)((td) this).field_a) <= ~((long)param1 + ((td) this).field_l)) {
                      var7 = (long)param1 + ((td) this).field_l;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (~(((td) this).field_e + (long)((td) this).field_a) >= ~((td) this).field_l) {
                  break L10;
                } else {
                  if (~((long)param1 + ((td) this).field_l) > ~((long)((td) this).field_a + ((td) this).field_e)) {
                    break L10;
                  } else {
                    var7 = (long)((td) this).field_a + ((td) this).field_e;
                    break L10;
                  }
                }
              }
              L12: {
                if (var5_long <= -1L) {
                  break L12;
                } else {
                  if (var5_long < var7) {
                    var9 = (int)(-var5_long + var7);
                    ug.a(param3, (int)(-((td) this).field_l + ((long)param0 - -var5_long)), ((td) this).field_g, (int)(var5_long - ((td) this).field_e), var9);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((td) this).field_l = ((td) this).field_l + (long)param1;
              return;
            } else {
              if (param1 <= 0) {
                break L0;
              } else {
                L13: {
                  if (((td) this).field_d == -1L) {
                    ((td) this).field_d = ((td) this).field_l;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  ug.a(param3, param0, ((td) this).field_i, (int)(((td) this).field_l + -((td) this).field_d), param1);
                  ((td) this).field_l = ((td) this).field_l + (long)param1;
                  if ((long)((td) this).field_c >= -((td) this).field_d + ((td) this).field_l) {
                    break L14;
                  } else {
                    ((td) this).field_c = (int)(((td) this).field_l + -((td) this).field_d);
                    break L14;
                  }
                }
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((td) this).field_h = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5_ref;
            stackOut_78_1 = new StringBuilder().append("td.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param3 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L15;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L15;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ')');
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((td) this).field_a = 0;
              if (~((td) this).field_h == ~((td) this).field_l) {
                break L1;
              } else {
                ((td) this).field_b.a(0, ((td) this).field_l);
                ((td) this).field_h = ((td) this).field_l;
                break L1;
              }
            }
            L2: {
              ((td) this).field_e = ((td) this).field_l;
              if (!param0) {
                break L2;
              } else {
                field_m = 126;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (~((td) this).field_a <= ~((td) this).field_g.length) {
                  break L4;
                } else {
                  L5: {
                    var2_int = ((td) this).field_g.length + -((td) this).field_a;
                    if (var2_int <= 200000000) {
                      break L5;
                    } else {
                      var2_int = 200000000;
                      break L5;
                    }
                  }
                  var3 = ((td) this).field_b.a(((td) this).field_g, ((td) this).field_a, var2_int, (byte) -93);
                  if (var3 == -1) {
                    break L4;
                  } else {
                    ((td) this).field_a = ((td) this).field_a + var3;
                    ((td) this).field_h = ((td) this).field_h + (long)var3;
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "td.K(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != -12539) {
            return;
        }
        try {
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "td.A(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        try {
            eh.field_j = oe.c(param0 + -35671);
            ti.field_b = new tc();
            ba.a(true, true, 2);
            if (param0 != 30000) {
                int discarded$0 = td.a(105, -112, false);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "td.I(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        try {
          L0: {
            if (param2 - -param3 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(param3 + param2 - param1.length);
            } else {
              L1: {
                if (((td) this).field_d == -1L) {
                  break L1;
                } else {
                  if (~((td) this).field_d < ~((td) this).field_l) {
                    break L1;
                  } else {
                    if (((td) this).field_d + (long)((td) this).field_c < (long)param3 + ((td) this).field_l) {
                      break L1;
                    } else {
                      ug.a(((td) this).field_i, (int)(((td) this).field_l - ((td) this).field_d), param1, param2, param3);
                      ((td) this).field_l = ((td) this).field_l + (long)param3;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((td) this).field_l;
                var7 = param2;
                var8 = param3;
                if (param0 == 0) {
                  break L2;
                } else {
                  field_o = null;
                  break L2;
                }
              }
              L3: {
                if (~((td) this).field_l > ~((td) this).field_e) {
                  break L3;
                } else {
                  if (~((td) this).field_l <= ~((long)((td) this).field_a + ((td) this).field_e)) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)((long)((td) this).field_a - ((td) this).field_l + ((td) this).field_e);
                      if (param3 >= var9_int) {
                        break L4;
                      } else {
                        var9_int = param3;
                        break L4;
                      }
                    }
                    ug.a(((td) this).field_g, (int)(((td) this).field_l - ((td) this).field_e), param1, param2, var9_int);
                    param2 = param2 + var9_int;
                    param3 = param3 - var9_int;
                    ((td) this).field_l = ((td) this).field_l + (long)var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (~((td) this).field_g.length <= ~param3) {
                  if (param3 > 0) {
                    L6: {
                      this.a(false);
                      var9_int = param3;
                      if (((td) this).field_a < var9_int) {
                        var9_int = ((td) this).field_a;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ug.a(((td) this).field_g, 0, param1, param2, var9_int);
                    param2 = param2 + var9_int;
                    param3 = param3 - var9_int;
                    ((td) this).field_l = ((td) this).field_l + (long)var9_int;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  ((td) this).field_b.a(0, ((td) this).field_l);
                  ((td) this).field_h = ((td) this).field_l;
                  L7: while (true) {
                    if (param3 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((td) this).field_b.a(param1, param2, param3, (byte) -109);
                      if (var9_int != -1) {
                        ((td) this).field_h = ((td) this).field_h + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        ((td) this).field_l = ((td) this).field_l + (long)var9_int;
                        continue L7;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L8: {
                if (-1L != ((td) this).field_d) {
                  L9: {
                    if (~((td) this).field_d >= ~((td) this).field_l) {
                      break L9;
                    } else {
                      if (0 < param3) {
                        L10: {
                          var9_int = (int)(-((td) this).field_l + ((td) this).field_d) + param2;
                          if (var9_int > param3 + param2) {
                            var9_int = param2 - -param3;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param2) {
                            break L9;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param1[incrementValue$1] = (byte) 0;
                            param3--;
                            ((td) this).field_l = ((td) this).field_l + 1L;
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
                      if (((td) this).field_d < var5_long) {
                        break L13;
                      } else {
                        if (~(var5_long - -(long)var8) >= ~((td) this).field_d) {
                          break L13;
                        } else {
                          var9 = ((td) this).field_d;
                          break L12;
                        }
                      }
                    }
                    if (~var5_long > ~((td) this).field_d) {
                      break L12;
                    } else {
                      if (((td) this).field_d + (long)((td) this).field_c > var5_long) {
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
                      if (var5_long >= ((td) this).field_d - -(long)((td) this).field_c) {
                        break L15;
                      } else {
                        if (~(var5_long - -(long)var8) <= ~((long)((td) this).field_c + ((td) this).field_d)) {
                          var11 = ((td) this).field_d + (long)((td) this).field_c;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (~((long)var8 + var5_long) >= ~((td) this).field_d) {
                      break L14;
                    } else {
                      if (var5_long + (long)var8 <= ((td) this).field_d - -(long)((td) this).field_c) {
                        var11 = (long)var8 + var5_long;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L8;
                  } else {
                    if (~var11 >= ~var9) {
                      break L8;
                    } else {
                      var13 = (int)(-var9 + var11);
                      ug.a(((td) this).field_i, (int)(-((td) this).field_d + var9), param1, (int)(var9 - var5_long) + var7, var13);
                      if (~var11 < ~((td) this).field_l) {
                        param3 = (int)((long)param3 - (var11 + -((td) this).field_l));
                        ((td) this).field_l = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (param3 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((td) this).field_h = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var5_ref;
            stackOut_95_1 = new StringBuilder().append("td.C(").append(param0).append(',');
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
              break L16;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_99_0 = stackOut_96_0;
              stackIn_99_1 = stackOut_96_1;
              stackIn_99_2 = stackOut_96_2;
              break L16;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ((td) this).a(0, param0, 0, param0.length);
              if (param1 > 11) {
                break L1;
              } else {
                ((td) this).field_g = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("td.G(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 0;
                if (param0 < 0) {
                  break L2;
                } else {
                  if (65536 > param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param0 = param0 >>> 16;
              var2_int += 16;
              break L1;
            }
            L3: {
              if (param0 < 256) {
                break L3;
              } else {
                param0 = param0 >>> 8;
                var2_int += 8;
                break L3;
              }
            }
            L4: {
              if (param0 < 16) {
                break L4;
              } else {
                param0 = param0 >>> 4;
                var2_int += 4;
                break L4;
              }
            }
            L5: {
              if (param0 < 4) {
                break L5;
              } else {
                var2_int += 2;
                param0 = param0 >>> 2;
                break L5;
              }
            }
            L6: {
              if (param1 >= 23) {
                break L6;
              } else {
                field_f = null;
                break L6;
              }
            }
            L7: {
              if (1 > param0) {
                break L7;
              } else {
                var2_int++;
                param0 = param0 >>> 1;
                break L7;
              }
            }
            stackOut_16_0 = var2_int + param0;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "td.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final long b(boolean param0) {
        RuntimeException var2 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        long stackOut_1_0 = 0L;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = ((td) this).field_n;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -41L;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "td.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0) throws IOException {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a((byte) -56);
              if (param0 >= 36) {
                break L1;
              } else {
                int discarded$2 = td.a(-31, (byte) 62);
                break L1;
              }
            }
            ((td) this).field_b.a(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "td.L(" + param0 + ')');
        }
    }

    td(cb param0, int param1, int param2) throws IOException {
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
        ((td) this).field_d = -1L;
        ((td) this).field_c = 0;
        ((td) this).field_e = -1L;
        try {
          L0: {
            ((td) this).field_b = param0;
            long dupTemp$3 = param0.c(-38);
            ((td) this).field_k = dupTemp$3;
            ((td) this).field_n = dupTemp$3;
            ((td) this).field_i = new byte[param2];
            ((td) this).field_g = new byte[param1];
            ((td) this).field_l = 0L;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("td.<init>(");
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "HARD";
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}

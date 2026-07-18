/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gh {
    private long field_e;
    private long field_k;
    private long field_h;
    static String field_o;
    private byte[] field_g;
    private byte[] field_n;
    private long field_d;
    private long field_l;
    static ia field_i;
    private int field_c;
    private int field_a;
    static vb field_f;
    private long field_b;
    static gb field_j;
    private fs field_m;

    private final void a(int param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          var2 = -57 / ((83 - param0) / 41);
          if (((gh) this).field_e != -1L) {
            L1: {
              if (~((gh) this).field_d == ~((gh) this).field_e) {
                break L1;
              } else {
                ((gh) this).field_m.a(((gh) this).field_e, true);
                ((gh) this).field_d = ((gh) this).field_e;
                break L1;
              }
            }
            L2: {
              ((gh) this).field_m.a(((gh) this).field_g, 0, 66, ((gh) this).field_c);
              ((gh) this).field_d = ((gh) this).field_d + (long)((gh) this).field_c;
              if (~((gh) this).field_d < ~((gh) this).field_h) {
                ((gh) this).field_h = ((gh) this).field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if (((gh) this).field_e < ((gh) this).field_l) {
                  break L4;
                } else {
                  if (~((long)((gh) this).field_a + ((gh) this).field_l) < ~((gh) this).field_e) {
                    var3 = ((gh) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((gh) this).field_l > ~((gh) this).field_e) {
                break L3;
              } else {
                if (~((gh) this).field_l > ~(((gh) this).field_e + (long)((gh) this).field_c)) {
                  var3 = ((gh) this).field_l;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~((gh) this).field_l <= ~((long)((gh) this).field_c + ((gh) this).field_e)) {
                  break L6;
                } else {
                  if (((gh) this).field_l - -(long)((gh) this).field_a < (long)((gh) this).field_c + ((gh) this).field_e) {
                    break L6;
                  } else {
                    var5 = ((gh) this).field_e - -(long)((gh) this).field_c;
                    break L5;
                  }
                }
              }
              if (((gh) this).field_e >= (long)((gh) this).field_a + ((gh) this).field_l) {
                break L5;
              } else {
                if (~(((gh) this).field_l - -(long)((gh) this).field_a) >= ~(((gh) this).field_e + (long)((gh) this).field_c)) {
                  var5 = ((gh) this).field_l - -(long)((gh) this).field_a;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var3 <= -1L) {
                break L7;
              } else {
                if (~var3 > ~var5) {
                  var7 = (int)(-var3 + var5);
                  au.a(((gh) this).field_g, (int)(-((gh) this).field_e + var3), ((gh) this).field_n, (int)(var3 + -((gh) this).field_l), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((gh) this).field_e = -1L;
            ((gh) this).field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != 106) {
            return;
        }
        this.a(param0 ^ 22);
        ((gh) this).field_m.a(19260);
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
        var14 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 + param3 > param2.length) {
              throw new ArrayIndexOutOfBoundsException(param3 - (-param1 - -param2.length));
            } else {
              L1: {
                if (((gh) this).field_e == -1L) {
                  break L1;
                } else {
                  if (~((gh) this).field_e < ~((gh) this).field_k) {
                    break L1;
                  } else {
                    if ((long)((gh) this).field_c + ((gh) this).field_e < ((gh) this).field_k - -(long)param1) {
                      break L1;
                    } else {
                      au.a(((gh) this).field_g, (int)(-((gh) this).field_e + ((gh) this).field_k), param2, param3, param1);
                      ((gh) this).field_k = ((gh) this).field_k + (long)param1;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((gh) this).field_k;
                if (param0 == 0) {
                  break L2;
                } else {
                  ((gh) this).field_n = null;
                  break L2;
                }
              }
              L3: {
                var7 = param3;
                var8 = param1;
                if (((gh) this).field_k < ((gh) this).field_l) {
                  break L3;
                } else {
                  if ((long)((gh) this).field_a + ((gh) this).field_l > ((gh) this).field_k) {
                    L4: {
                      var9_int = (int)(-((gh) this).field_k + (((gh) this).field_l + (long)((gh) this).field_a));
                      if (var9_int <= param1) {
                        break L4;
                      } else {
                        var9_int = param1;
                        break L4;
                      }
                    }
                    au.a(((gh) this).field_n, (int)(-((gh) this).field_l + ((gh) this).field_k), param2, param3, var9_int);
                    param3 = param3 + var9_int;
                    param1 = param1 - var9_int;
                    ((gh) this).field_k = ((gh) this).field_k + (long)var9_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (((gh) this).field_n.length >= param1) {
                  if (0 >= param1) {
                    break L5;
                  } else {
                    L6: {
                      this.d(0);
                      var9_int = param1;
                      if (var9_int > ((gh) this).field_a) {
                        var9_int = ((gh) this).field_a;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    au.a(((gh) this).field_n, 0, param2, param3, var9_int);
                    param1 = param1 - var9_int;
                    ((gh) this).field_k = ((gh) this).field_k + (long)var9_int;
                    param3 = param3 + var9_int;
                    break L5;
                  }
                } else {
                  ((gh) this).field_m.a(((gh) this).field_k, true);
                  ((gh) this).field_d = ((gh) this).field_k;
                  L7: while (true) {
                    if (param1 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((gh) this).field_m.a(param1, (byte) 53, param3, param2);
                      if (var9_int != -1) {
                        param1 = param1 - var9_int;
                        ((gh) this).field_k = ((gh) this).field_k + (long)var9_int;
                        param3 = param3 + var9_int;
                        ((gh) this).field_d = ((gh) this).field_d + (long)var9_int;
                        continue L7;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L8: {
                if (((gh) this).field_e != -1L) {
                  L9: {
                    if (((gh) this).field_e <= ((gh) this).field_k) {
                      break L9;
                    } else {
                      if (param1 <= 0) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = (int)(-((gh) this).field_k + ((gh) this).field_e) + param3;
                          if (var9_int > param3 + param1) {
                            var9_int = param3 - -param1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (param3 >= var9_int) {
                            break L9;
                          } else {
                            param1--;
                            int incrementValue$1 = param3;
                            param3++;
                            param2[incrementValue$1] = (byte) 0;
                            ((gh) this).field_k = ((gh) this).field_k + 1L;
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
                      if (((gh) this).field_e < var5_long) {
                        break L13;
                      } else {
                        if (~((gh) this).field_e > ~((long)var8 + var5_long)) {
                          var9 = ((gh) this).field_e;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (~((gh) this).field_e < ~var5_long) {
                      break L12;
                    } else {
                      if (~((long)((gh) this).field_c + ((gh) this).field_e) < ~var5_long) {
                        var9 = var5_long;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if (~((long)((gh) this).field_c + ((gh) this).field_e) >= ~var5_long) {
                        break L15;
                      } else {
                        if (((gh) this).field_e + (long)((gh) this).field_c > (long)var8 + var5_long) {
                          break L15;
                        } else {
                          var11 = ((gh) this).field_e - -(long)((gh) this).field_c;
                          break L14;
                        }
                      }
                    }
                    if (~((long)var8 + var5_long) >= ~((gh) this).field_e) {
                      break L14;
                    } else {
                      if ((long)var8 + var5_long > (long)((gh) this).field_c + ((gh) this).field_e) {
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
                    if (~var11 >= ~var9) {
                      break L8;
                    } else {
                      var13 = (int)(-var9 + var11);
                      au.a(((gh) this).field_g, (int)(var9 + -((gh) this).field_e), param2, (int)(-var5_long + var9) + var7, var13);
                      if (((gh) this).field_k >= var11) {
                        break L8;
                      } else {
                        param1 = (int)((long)param1 - (var11 + -((gh) this).field_k));
                        ((gh) this).field_k = var11;
                        break L8;
                      }
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
          ((gh) this).field_d = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("gh.H(").append(param0).append(',').append(param1).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2) {
        return 0 != (65536 & param2);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 16 / ((param3 - 21) / 45);
              if (((gh) this).field_b < ((gh) this).field_k + (long)param0) {
                ((gh) this).field_b = (long)param0 + ((gh) this).field_k;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((gh) this).field_e == -1L) {
                break L2;
              } else {
                if (~((gh) this).field_e >= ~((gh) this).field_k) {
                  if (~(((gh) this).field_e + (long)((gh) this).field_c) <= ~((gh) this).field_k) {
                    break L2;
                  } else {
                    this.a(-125);
                    break L2;
                  }
                } else {
                  this.a(-125);
                  break L2;
                }
              }
            }
            L3: {
              if (((gh) this).field_e == -1L) {
                break L3;
              } else {
                if (~((long)param0 + ((gh) this).field_k) >= ~(((gh) this).field_e - -(long)((gh) this).field_g.length)) {
                  break L3;
                } else {
                  var6_int = (int)(((gh) this).field_e - (((gh) this).field_k - (long)((gh) this).field_g.length));
                  au.a(param1, param2, ((gh) this).field_g, (int)(((gh) this).field_k + -((gh) this).field_e), var6_int);
                  ((gh) this).field_k = ((gh) this).field_k + (long)var6_int;
                  param2 = param2 + var6_int;
                  param0 = param0 - var6_int;
                  ((gh) this).field_c = ((gh) this).field_g.length;
                  this.a(-39);
                  break L3;
                }
              }
            }
            if (((gh) this).field_g.length >= param0) {
              if (param0 <= 0) {
                break L0;
              } else {
                L4: {
                  if (((gh) this).field_e == -1L) {
                    ((gh) this).field_e = ((gh) this).field_k;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  au.a(param1, param2, ((gh) this).field_g, (int)(((gh) this).field_k + -((gh) this).field_e), param0);
                  ((gh) this).field_k = ((gh) this).field_k + (long)param0;
                  if (~(-((gh) this).field_e + ((gh) this).field_k) < ~(long)((gh) this).field_c) {
                    ((gh) this).field_c = (int)(-((gh) this).field_e + ((gh) this).field_k);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              L6: {
                if (((gh) this).field_d == ((gh) this).field_k) {
                  break L6;
                } else {
                  ((gh) this).field_m.a(((gh) this).field_k, true);
                  ((gh) this).field_d = ((gh) this).field_k;
                  break L6;
                }
              }
              L7: {
                ((gh) this).field_m.a(param1, param2, 80, param0);
                ((gh) this).field_d = ((gh) this).field_d + (long)param0;
                if (((gh) this).field_d <= ((gh) this).field_h) {
                  break L7;
                } else {
                  ((gh) this).field_h = ((gh) this).field_d;
                  break L7;
                }
              }
              L8: {
                L9: {
                  var6 = -1L;
                  var8 = -1L;
                  if (~((gh) this).field_k > ~((gh) this).field_l) {
                    break L9;
                  } else {
                    if (~(((gh) this).field_l + (long)((gh) this).field_a) >= ~((gh) this).field_k) {
                      break L9;
                    } else {
                      var6 = ((gh) this).field_k;
                      break L8;
                    }
                  }
                }
                if (((gh) this).field_l < ((gh) this).field_k) {
                  break L8;
                } else {
                  if (~(((gh) this).field_k - -(long)param0) >= ~((gh) this).field_l) {
                    break L8;
                  } else {
                    var6 = ((gh) this).field_l;
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  if (((gh) this).field_l >= ((gh) this).field_k - -(long)param0) {
                    break L11;
                  } else {
                    if ((long)param0 + ((gh) this).field_k <= (long)((gh) this).field_a + ((gh) this).field_l) {
                      var8 = ((gh) this).field_k + (long)param0;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (~(((gh) this).field_l - -(long)((gh) this).field_a) >= ~((gh) this).field_k) {
                  break L10;
                } else {
                  if ((long)((gh) this).field_a + ((gh) this).field_l <= (long)param0 + ((gh) this).field_k) {
                    var8 = ((gh) this).field_l + (long)((gh) this).field_a;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (-1L >= var6) {
                  break L12;
                } else {
                  if (var8 > var6) {
                    var10 = (int)(var8 + -var6);
                    au.a(param1, (int)(-((gh) this).field_k + var6 + (long)param2), ((gh) this).field_n, (int)(-((gh) this).field_l + var6), var10);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((gh) this).field_k = ((gh) this).field_k + (long)param0;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((gh) this).field_d = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5_ref;
            stackOut_49_1 = new StringBuilder().append("gh.I(").append(param0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L13;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L13;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (!(0L <= param1)) {
            throw new IOException();
        }
        ((gh) this).field_k = param1;
        if (!param0) {
            Object var5 = null;
            boolean discarded$0 = gh.a((byte) 37, (gk) null);
        }
    }

    public static void b(int param0) {
        field_o = null;
        field_i = null;
        field_j = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 13541) {
            return;
        }
        try {
            ((gh) this).a(0, param0.length, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, gk param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 == 15) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = gh.a((byte) 52, (gk) null);
                break L1;
              }
            }
            stackOut_2_0 = param1.b(0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gh.K(").append(param0).append(',');
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
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final long c(int param0) {
        int var2 = 54 % ((param0 - -8) / 45);
        return ((gh) this).field_b;
    }

    private final void d(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ((gh) this).field_a = 0;
        if (!(((gh) this).field_k == ((gh) this).field_d)) {
            ((gh) this).field_m.a(((gh) this).field_k, true);
            ((gh) this).field_d = ((gh) this).field_k;
        }
        ((gh) this).field_l = ((gh) this).field_k;
        while (((gh) this).field_n.length > ((gh) this).field_a) {
            var2 = -((gh) this).field_a + ((gh) this).field_n.length;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((gh) this).field_m.a(var2, (byte) 53, ((gh) this).field_a, ((gh) this).field_n);
            if (var3 == -1) {
                break;
            }
            ((gh) this).field_a = ((gh) this).field_a + var3;
            ((gh) this).field_d = ((gh) this).field_d + (long)var3;
        }
    }

    gh(fs param0, int param1, int param2) throws IOException {
        ((gh) this).field_l = -1L;
        ((gh) this).field_c = 0;
        ((gh) this).field_e = -1L;
        try {
            ((gh) this).field_m = param0;
            long dupTemp$0 = param0.a(false);
            ((gh) this).field_h = dupTemp$0;
            ((gh) this).field_b = dupTemp$0;
            ((gh) this).field_n = new byte[param1];
            ((gh) this).field_g = new byte[param2];
            ((gh) this).field_k = 0L;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Email is valid";
        field_i = new ia();
        field_f = null;
        field_j = new gb(2.0, 15, 0, 100, 2, 6.0, 12.0, 16, 0);
    }
}

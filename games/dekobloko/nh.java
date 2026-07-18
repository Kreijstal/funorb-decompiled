/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private long field_b;
    private long field_k;
    private long field_n;
    private long field_j;
    private long field_e;
    private hf field_h;
    private int field_m;
    private byte[] field_g;
    private long field_o;
    private byte[] field_d;
    private int field_c;
    static qm field_i;
    static boolean field_a;
    static char[] field_l;
    static String field_f;

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 != -73) {
            return;
        }
        field_i = null;
    }

    final void a(long param0, byte param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        } else {
          L0: {
            ((nh) this).field_j = param0;
            if (param1 == -109) {
              break L0;
            } else {
              nh.a((byte) 91);
              break L0;
            }
          }
          return;
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var2 = 75 / ((param0 - -55) / 40);
          if (((nh) this).field_e != -1L) {
            L1: {
              if (~((nh) this).field_e != ~((nh) this).field_b) {
                ((nh) this).field_h.a(((nh) this).field_e, 80);
                ((nh) this).field_b = ((nh) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((nh) this).field_h.a(((nh) this).field_d, 117, 0, ((nh) this).field_c);
              ((nh) this).field_b = ((nh) this).field_b + (long)((nh) this).field_c;
              if (~((nh) this).field_k > ~((nh) this).field_b) {
                ((nh) this).field_k = ((nh) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if (~((nh) this).field_e > ~((nh) this).field_o) {
                  break L4;
                } else {
                  if (~((nh) this).field_e > ~(((nh) this).field_o + (long)((nh) this).field_m)) {
                    var3 = ((nh) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((nh) this).field_e < ~((nh) this).field_o) {
                break L3;
              } else {
                if (~((long)((nh) this).field_c + ((nh) this).field_e) < ~((nh) this).field_o) {
                  var3 = ((nh) this).field_o;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var5 = -1L;
                if (~((nh) this).field_o <= ~((long)((nh) this).field_c + ((nh) this).field_e)) {
                  break L6;
                } else {
                  if ((long)((nh) this).field_m + ((nh) this).field_o >= (long)((nh) this).field_c + ((nh) this).field_e) {
                    var5 = ((nh) this).field_e + (long)((nh) this).field_c;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((long)((nh) this).field_m + ((nh) this).field_o <= ((nh) this).field_e) {
                break L5;
              } else {
                if (((nh) this).field_o + (long)((nh) this).field_m <= ((nh) this).field_e + (long)((nh) this).field_c) {
                  var5 = ((nh) this).field_o + (long)((nh) this).field_m;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var3) {
                break L7;
              } else {
                if (~var3 > ~var5) {
                  var7 = (int)(var5 - var3);
                  an.a(((nh) this).field_d, (int)(-((nh) this).field_e + var3), ((nh) this).field_g, (int)(-((nh) this).field_o + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((nh) this).field_e = -1L;
            ((nh) this).field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final long b(int param0) {
        int var2 = 93 / ((-25 - param0) / 62);
        return ((nh) this).field_n;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        ((nh) this).field_m = 0;
        if (!(((nh) this).field_b == ((nh) this).field_j)) {
            ((nh) this).field_h.a(((nh) this).field_j, 123);
            ((nh) this).field_b = ((nh) this).field_j;
        }
        ((nh) this).field_o = ((nh) this).field_j;
        while (((nh) this).field_m < ((nh) this).field_g.length) {
            var2 = -((nh) this).field_m + ((nh) this).field_g.length;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((nh) this).field_h.a(((nh) this).field_g, (byte) -103, ((nh) this).field_m, var2);
            if (-1 == var3) {
                break;
            }
            ((nh) this).field_m = ((nh) this).field_m + var3;
            ((nh) this).field_b = ((nh) this).field_b + (long)var3;
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
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 741) {
                break L1;
              } else {
                nh.a((byte) 18, 18);
                break L1;
              }
            }
            if (param1.length < param0 - -param3) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
            } else {
              L2: {
                if (((nh) this).field_e == -1L) {
                  break L2;
                } else {
                  if (((nh) this).field_j < ((nh) this).field_e) {
                    break L2;
                  } else {
                    if (((nh) this).field_j + (long)param3 > (long)((nh) this).field_c + ((nh) this).field_e) {
                      break L2;
                    } else {
                      an.a(((nh) this).field_d, (int)(-((nh) this).field_e + ((nh) this).field_j), param1, param0, param3);
                      ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                      return;
                    }
                  }
                }
              }
              L3: {
                var5_long = ((nh) this).field_j;
                var7 = param0;
                var8 = param3;
                if (~((nh) this).field_j > ~((nh) this).field_o) {
                  break L3;
                } else {
                  if (((nh) this).field_j < (long)((nh) this).field_m + ((nh) this).field_o) {
                    L4: {
                      var9_int = (int)((long)((nh) this).field_m + (-((nh) this).field_j - -((nh) this).field_o));
                      if (param3 >= var9_int) {
                        break L4;
                      } else {
                        var9_int = param3;
                        break L4;
                      }
                    }
                    an.a(((nh) this).field_g, (int)(((nh) this).field_j - ((nh) this).field_o), param1, param0, var9_int);
                    ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                    param3 = param3 - var9_int;
                    param0 = param0 + var9_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (param3 <= ((nh) this).field_g.length) {
                  if (param3 <= 0) {
                    break L5;
                  } else {
                    L6: {
                      this.a(0);
                      var9_int = param3;
                      if (((nh) this).field_m < var9_int) {
                        var9_int = ((nh) this).field_m;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    an.a(((nh) this).field_g, 0, param1, param0, var9_int);
                    param0 = param0 + var9_int;
                    param3 = param3 - var9_int;
                    ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                    break L5;
                  }
                } else {
                  ((nh) this).field_h.a(((nh) this).field_j, 23);
                  ((nh) this).field_b = ((nh) this).field_j;
                  L7: while (true) {
                    if (0 >= param3) {
                      break L5;
                    } else {
                      var9_int = ((nh) this).field_h.a(param1, (byte) -38, param0, param3);
                      if (var9_int == -1) {
                        break L5;
                      } else {
                        ((nh) this).field_b = ((nh) this).field_b + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                if (((nh) this).field_e != -1L) {
                  L9: {
                    if (((nh) this).field_j >= ((nh) this).field_e) {
                      break L9;
                    } else {
                      if (param3 > 0) {
                        L10: {
                          var9_int = param0 - -(int)(((nh) this).field_e - ((nh) this).field_j);
                          if (var9_int <= param0 - -param3) {
                            break L10;
                          } else {
                            var9_int = param3 + param0;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param0) {
                            break L9;
                          } else {
                            param3--;
                            int incrementValue$1 = param0;
                            param0++;
                            param1[incrementValue$1] = (byte) 0;
                            ((nh) this).field_j = ((nh) this).field_j + 1L;
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
                      if (~var5_long < ~((nh) this).field_e) {
                        break L13;
                      } else {
                        if (((nh) this).field_e >= var5_long - -(long)var8) {
                          break L13;
                        } else {
                          var9 = ((nh) this).field_e;
                          break L12;
                        }
                      }
                    }
                    if (~((nh) this).field_e < ~var5_long) {
                      break L12;
                    } else {
                      if (~var5_long > ~((long)((nh) this).field_c + ((nh) this).field_e)) {
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
                      if ((long)((nh) this).field_c + ((nh) this).field_e <= var5_long) {
                        break L15;
                      } else {
                        if (~((long)var8 + var5_long) <= ~((long)((nh) this).field_c + ((nh) this).field_e)) {
                          var11 = ((nh) this).field_e - -(long)((nh) this).field_c;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (((nh) this).field_e >= (long)var8 + var5_long) {
                      break L14;
                    } else {
                      if (~((long)((nh) this).field_c + ((nh) this).field_e) <= ~(var5_long + (long)var8)) {
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
                      var13 = (int)(var11 - var9);
                      an.a(((nh) this).field_d, (int)(-((nh) this).field_e + var9), param1, var7 + (int)(-var5_long + var9), var13);
                      if (~var11 >= ~((nh) this).field_j) {
                        break L8;
                      } else {
                        param3 = (int)((long)param3 - (-((nh) this).field_j + var11));
                        ((nh) this).field_j = var11;
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (param3 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((nh) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("nh.H(").append(param0).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(byte param0) throws IOException {
        this.b((byte) -99);
        ((nh) this).field_h.a(-82);
        if (param0 < 113) {
            field_l = null;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~((nh) this).field_n <= ~(((nh) this).field_j - -(long)param3)) {
                break L1;
              } else {
                ((nh) this).field_n = (long)param3 + ((nh) this).field_j;
                break L1;
              }
            }
            L2: {
              if (-1L == ((nh) this).field_e) {
                break L2;
              } else {
                L3: {
                  if (~((nh) this).field_j > ~((nh) this).field_e) {
                    break L3;
                  } else {
                    if (~((nh) this).field_j < ~(((nh) this).field_e - -(long)((nh) this).field_c)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b((byte) -120);
                break L2;
              }
            }
            L4: {
              if (((nh) this).field_e == -1L) {
                break L4;
              } else {
                if (((nh) this).field_j + (long)param3 <= ((nh) this).field_e - -(long)((nh) this).field_d.length) {
                  break L4;
                } else {
                  var5_int = (int)((long)((nh) this).field_d.length + (((nh) this).field_e + -((nh) this).field_j));
                  an.a(param0, param2, ((nh) this).field_d, (int)(((nh) this).field_j - ((nh) this).field_e), var5_int);
                  param2 = param2 + var5_int;
                  param3 = param3 - var5_int;
                  ((nh) this).field_j = ((nh) this).field_j + (long)var5_int;
                  ((nh) this).field_c = ((nh) this).field_d.length;
                  this.b((byte) -15);
                  break L4;
                }
              }
            }
            if (((nh) this).field_d.length < param3) {
              L5: {
                if (~((nh) this).field_j == ~((nh) this).field_b) {
                  break L5;
                } else {
                  ((nh) this).field_h.a(((nh) this).field_j, 47);
                  ((nh) this).field_b = ((nh) this).field_j;
                  break L5;
                }
              }
              L6: {
                ((nh) this).field_h.a(param0, 83, param2, param3);
                ((nh) this).field_b = ((nh) this).field_b + (long)param3;
                if (((nh) this).field_b <= ((nh) this).field_k) {
                  break L6;
                } else {
                  ((nh) this).field_k = ((nh) this).field_b;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (~((nh) this).field_o < ~((nh) this).field_j) {
                    break L8;
                  } else {
                    if (((nh) this).field_j >= ((nh) this).field_o + (long)((nh) this).field_m) {
                      break L8;
                    } else {
                      var5_long = ((nh) this).field_j;
                      break L7;
                    }
                  }
                }
                if (((nh) this).field_o < ((nh) this).field_j) {
                  break L7;
                } else {
                  if (((nh) this).field_o < (long)param3 + ((nh) this).field_j) {
                    var5_long = ((nh) this).field_o;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (((nh) this).field_o >= ((nh) this).field_j - -(long)param3) {
                    break L10;
                  } else {
                    if ((long)((nh) this).field_m + ((nh) this).field_o >= (long)param3 + ((nh) this).field_j) {
                      var7 = ((nh) this).field_j + (long)param3;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if ((long)((nh) this).field_m + ((nh) this).field_o <= ((nh) this).field_j) {
                  break L9;
                } else {
                  if (~(((nh) this).field_o - -(long)((nh) this).field_m) >= ~((long)param3 + ((nh) this).field_j)) {
                    var7 = ((nh) this).field_o - -(long)((nh) this).field_m;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (var5_long <= -1L) {
                  break L11;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(-var5_long + var7);
                    an.a(param0, (int)(var5_long + ((long)param2 + -((nh) this).field_j)), ((nh) this).field_g, (int)(-((nh) this).field_o + var5_long), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((nh) this).field_j = ((nh) this).field_j + (long)param3;
              return;
            } else {
              L12: {
                if (param1 > 91) {
                  break L12;
                } else {
                  field_f = null;
                  break L12;
                }
              }
              if (param3 <= 0) {
                break L0;
              } else {
                L13: {
                  if (((nh) this).field_e == -1L) {
                    ((nh) this).field_e = ((nh) this).field_j;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  an.a(param0, param2, ((nh) this).field_d, (int)(((nh) this).field_j - ((nh) this).field_e), param3);
                  ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                  if (~(((nh) this).field_j + -((nh) this).field_e) < ~(long)((nh) this).field_c) {
                    ((nh) this).field_c = (int)(-((nh) this).field_e + ((nh) this).field_j);
                    break L14;
                  } else {
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
          ((nh) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("nh.C(");
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
          throw dh.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 != 12) {
          return;
        } else {
          L0: {
            qk.field_i = 3 & param1 >> 4;
            wh.field_d = (13 & param1) >> 2;
            if (2 >= qk.field_i) {
              break L0;
            } else {
              qk.field_i = 2;
              break L0;
            }
          }
          L1: {
            wl.field_o = 3 & param1;
            if (wh.field_d <= 2) {
              break L1;
            } else {
              wh.field_d = 2;
              break L1;
            }
          }
          L2: {
            if (wl.field_o <= 2) {
              break L2;
            } else {
              wl.field_o = 2;
              break L2;
            }
          }
          return;
        }
    }

    nh(hf param0, int param1, int param2) throws IOException {
        ((nh) this).field_o = -1L;
        ((nh) this).field_e = -1L;
        ((nh) this).field_c = 0;
        try {
            ((nh) this).field_h = param0;
            long dupTemp$0 = param0.a((byte) -50);
            ((nh) this).field_k = dupTemp$0;
            ((nh) this).field_n = dupTemp$0;
            ((nh) this).field_g = new byte[param1];
            ((nh) this).field_j = 0L;
            ((nh) this).field_d = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            ((nh) this).a(0, param0, 741, param0.length);
            int var3_int = 38 / ((param1 - 70) / 44);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "nh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = new qm(0, 2, 2, 1);
        field_f = "Show all lobby chat";
        field_l = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}

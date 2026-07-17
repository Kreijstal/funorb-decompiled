/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud {
    private long field_f;
    private byte[] field_k;
    private long field_b;
    private long field_i;
    private byte[] field_l;
    private long field_m;
    private int field_e;
    static String field_q;
    private bg field_g;
    static go[] field_h;
    private int field_c;
    static uf field_o;
    static volatile boolean field_n;
    static String field_j;
    private long field_p;
    private long field_a;
    static int field_d;

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        ((ud) this).field_e = 0;
        if (!(~((ud) this).field_m == ~((ud) this).field_b)) {
            ((ud) this).field_g.a((byte) 102, ((ud) this).field_m);
            ((ud) this).field_b = ((ud) this).field_m;
        }
        ((ud) this).field_p = ((ud) this).field_m;
        while (~((ud) this).field_e > ~((ud) this).field_k.length) {
            var2 = ((ud) this).field_k.length - ((ud) this).field_e;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((ud) this).field_g.b(((ud) this).field_e, ((ud) this).field_k, var2, 11812);
            if (var3 == -1) {
                break;
            }
            ((ud) this).field_e = ((ud) this).field_e + var3;
            ((ud) this).field_b = ((ud) this).field_b + (long)var3;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param3 == -85) {
                break L1;
              } else {
                var9 = null;
                ud.a(78, -120, -127, (byte) -20, (int[]) null);
                break L1;
              }
            }
            L2: while (true) {
              param0--;
              if (param0 < 0) {
                break L0;
              } else {
                var10 = param4;
                var5 = var10;
                var6 = param1;
                var7 = param2;
                var10[var6] = var7 + pk.a(8355711, var10[var6] >> 1);
                param1++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("ud.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          if (param0 == -1) {
            break L0;
          } else {
            ((ud) this).field_i = -96L;
            break L0;
          }
        }
        L1: {
          if (((ud) this).field_a != -1L) {
            L2: {
              if (((ud) this).field_a != ((ud) this).field_b) {
                ((ud) this).field_g.a((byte) 66, ((ud) this).field_a);
                ((ud) this).field_b = ((ud) this).field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((ud) this).field_g.a(((ud) this).field_c, ((ud) this).field_l, 0, param0 ^ 17173);
              ((ud) this).field_b = ((ud) this).field_b + (long)((ud) this).field_c;
              if (((ud) this).field_i >= ((ud) this).field_b) {
                break L3;
              } else {
                ((ud) this).field_i = ((ud) this).field_b;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (~((ud) this).field_p < ~((ud) this).field_a) {
                  break L5;
                } else {
                  if ((long)((ud) this).field_e + ((ud) this).field_p > ((ud) this).field_a) {
                    var2 = ((ud) this).field_a;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (~((ud) this).field_p > ~((ud) this).field_a) {
                break L4;
              } else {
                if (((ud) this).field_p < ((ud) this).field_a + (long)((ud) this).field_c) {
                  var2 = ((ud) this).field_p;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((ud) this).field_a - -(long)((ud) this).field_c <= ((ud) this).field_p) {
                  break L7;
                } else {
                  if ((long)((ud) this).field_e + ((ud) this).field_p < ((ud) this).field_a + (long)((ud) this).field_c) {
                    break L7;
                  } else {
                    var4 = (long)((ud) this).field_c + ((ud) this).field_a;
                    break L6;
                  }
                }
              }
              if (((ud) this).field_p + (long)((ud) this).field_e <= ((ud) this).field_a) {
                break L6;
              } else {
                if (~(((ud) this).field_p - -(long)((ud) this).field_e) < ~(((ud) this).field_a - -(long)((ud) this).field_c)) {
                  break L6;
                } else {
                  var4 = (long)((ud) this).field_e + ((ud) this).field_p;
                  break L6;
                }
              }
            }
            L8: {
              if (var2 <= -1L) {
                break L8;
              } else {
                if (var2 >= var4) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  bc.a(((ud) this).field_l, (int)(-((ud) this).field_a + var2), ((ud) this).field_k, (int)(-((ud) this).field_p + var2), var6);
                  break L8;
                }
              }
            }
            ((ud) this).field_c = 0;
            ((ud) this).field_a = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if ((long)param1 + ((ud) this).field_m <= ((ud) this).field_f) {
                break L1;
              } else {
                ((ud) this).field_f = (long)param1 + ((ud) this).field_m;
                break L1;
              }
            }
            L2: {
              if (-1L == ((ud) this).field_a) {
                break L2;
              } else {
                L3: {
                  if (~((ud) this).field_a < ~((ud) this).field_m) {
                    break L3;
                  } else {
                    if (~((ud) this).field_m < ~(((ud) this).field_a - -(long)((ud) this).field_c)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b(-1);
                break L2;
              }
            }
            L4: {
              if (((ud) this).field_a == -1L) {
                break L4;
              } else {
                if ((long)param1 + ((ud) this).field_m > ((ud) this).field_a - -(long)((ud) this).field_l.length) {
                  var5_int = (int)(((ud) this).field_a - (((ud) this).field_m - (long)((ud) this).field_l.length));
                  bc.a(param3, param2, ((ud) this).field_l, (int)(((ud) this).field_m + -((ud) this).field_a), var5_int);
                  param1 = param1 - var5_int;
                  ((ud) this).field_m = ((ud) this).field_m + (long)var5_int;
                  param2 = param2 + var5_int;
                  ((ud) this).field_c = ((ud) this).field_l.length;
                  this.b(-1);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 >= 124) {
                break L5;
              } else {
                break L5;
              }
            }
            if (((ud) this).field_l.length >= param1) {
              if (param1 <= 0) {
                break L0;
              } else {
                L6: {
                  if (-1L == ((ud) this).field_a) {
                    ((ud) this).field_a = ((ud) this).field_m;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  bc.a(param3, param2, ((ud) this).field_l, (int)(-((ud) this).field_a + ((ud) this).field_m), param1);
                  ((ud) this).field_m = ((ud) this).field_m + (long)param1;
                  if ((long)((ud) this).field_c < ((ud) this).field_m - ((ud) this).field_a) {
                    ((ud) this).field_c = (int)(-((ud) this).field_a + ((ud) this).field_m);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              L8: {
                if (~((ud) this).field_m == ~((ud) this).field_b) {
                  break L8;
                } else {
                  ((ud) this).field_g.a((byte) 84, ((ud) this).field_m);
                  ((ud) this).field_b = ((ud) this).field_m;
                  break L8;
                }
              }
              L9: {
                ((ud) this).field_g.a(param1, param3, param2, -17174);
                ((ud) this).field_b = ((ud) this).field_b + (long)param1;
                if (~((ud) this).field_b >= ~((ud) this).field_i) {
                  break L9;
                } else {
                  ((ud) this).field_i = ((ud) this).field_b;
                  break L9;
                }
              }
              L10: {
                L11: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (~((ud) this).field_p < ~((ud) this).field_m) {
                    break L11;
                  } else {
                    if ((long)((ud) this).field_e + ((ud) this).field_p > ((ud) this).field_m) {
                      var5_long = ((ud) this).field_m;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (~((ud) this).field_p > ~((ud) this).field_m) {
                  break L10;
                } else {
                  if ((long)param1 + ((ud) this).field_m <= ((ud) this).field_p) {
                    break L10;
                  } else {
                    var5_long = ((ud) this).field_p;
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if (~(((ud) this).field_m - -(long)param1) >= ~((ud) this).field_p) {
                    break L13;
                  } else {
                    if (((ud) this).field_p - -(long)((ud) this).field_e >= ((ud) this).field_m + (long)param1) {
                      var7 = ((ud) this).field_m - -(long)param1;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (~((ud) this).field_m <= ~(((ud) this).field_p - -(long)((ud) this).field_e)) {
                  break L12;
                } else {
                  if (((ud) this).field_p + (long)((ud) this).field_e > (long)param1 + ((ud) this).field_m) {
                    break L12;
                  } else {
                    var7 = (long)((ud) this).field_e + ((ud) this).field_p;
                    break L12;
                  }
                }
              }
              L14: {
                if (var5_long <= -1L) {
                  break L14;
                } else {
                  if (~var5_long > ~var7) {
                    var9 = (int)(var7 + -var5_long);
                    bc.a(param3, (int)((long)param2 + (var5_long - ((ud) this).field_m)), ((ud) this).field_k, (int)(var5_long - ((ud) this).field_p), var9);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              ((ud) this).field_m = ((ud) this).field_m + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ud) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5_ref;
            stackOut_50_1 = new StringBuilder().append("ud.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L15;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    final long c(int param0) {
        if (param0 != -32261) {
            field_n = false;
        }
        return ((ud) this).field_f;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            ((ud) this).a(-1, param1, param0.length, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ud.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void d(int param0) throws IOException {
        this.b(param0);
        ((ud) this).field_g.a((byte) 20);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 - -param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
            } else {
              L1: {
                if (((ud) this).field_a == (long)param0) {
                  break L1;
                } else {
                  if (~((ud) this).field_a < ~((ud) this).field_m) {
                    break L1;
                  } else {
                    if (~((long)((ud) this).field_c + ((ud) this).field_a) <= ~((long)param2 + ((ud) this).field_m)) {
                      bc.a(((ud) this).field_l, (int)(-((ud) this).field_a + ((ud) this).field_m), param3, param1, param2);
                      ((ud) this).field_m = ((ud) this).field_m + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((ud) this).field_m;
                var7 = param1;
                var8 = param2;
                if (~((ud) this).field_m > ~((ud) this).field_p) {
                  break L2;
                } else {
                  if (((ud) this).field_p - -(long)((ud) this).field_e > ((ud) this).field_m) {
                    L3: {
                      var9_int = (int)((long)((ud) this).field_e + (((ud) this).field_p + -((ud) this).field_m));
                      if (var9_int > param2) {
                        var9_int = param2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    bc.a(((ud) this).field_k, (int)(((ud) this).field_m + -((ud) this).field_p), param3, param1, var9_int);
                    ((ud) this).field_m = ((ud) this).field_m + (long)var9_int;
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (((ud) this).field_k.length < param2) {
                  ((ud) this).field_g.a((byte) 47, ((ud) this).field_m);
                  ((ud) this).field_b = ((ud) this).field_m;
                  L5: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((ud) this).field_g.b(param1, param3, param2, 11812);
                      if (-1 != var9_int) {
                        param1 = param1 + var9_int;
                        ((ud) this).field_m = ((ud) this).field_m + (long)var9_int;
                        ((ud) this).field_b = ((ud) this).field_b + (long)var9_int;
                        param2 = param2 - var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (param2 <= 0) {
                    break L4;
                  } else {
                    L6: {
                      this.a(-1);
                      var9_int = param2;
                      if (var9_int <= ((ud) this).field_e) {
                        break L6;
                      } else {
                        var9_int = ((ud) this).field_e;
                        break L6;
                      }
                    }
                    bc.a(((ud) this).field_k, 0, param3, param1, var9_int);
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    ((ud) this).field_m = ((ud) this).field_m + (long)var9_int;
                    break L4;
                  }
                }
              }
              L7: {
                if (((ud) this).field_a != -1L) {
                  L8: {
                    if (~((ud) this).field_m <= ~((ud) this).field_a) {
                      break L8;
                    } else {
                      if (0 < param2) {
                        L9: {
                          var9_int = param1 - -(int)(((ud) this).field_a - ((ud) this).field_m);
                          if (var9_int <= param2 + param1) {
                            break L9;
                          } else {
                            var9_int = param2 + param1;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var9_int <= param1) {
                            break L8;
                          } else {
                            int incrementValue$1 = param1;
                            param1++;
                            param3[incrementValue$1] = (byte) 0;
                            param2--;
                            ((ud) this).field_m = ((ud) this).field_m + 1L;
                            continue L10;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var9 = -1L;
                      if (~var5_long < ~((ud) this).field_a) {
                        break L12;
                      } else {
                        if (var5_long - -(long)var8 > ((ud) this).field_a) {
                          var9 = ((ud) this).field_a;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~((ud) this).field_a < ~var5_long) {
                      break L11;
                    } else {
                      if (((ud) this).field_a + (long)((ud) this).field_c <= var5_long) {
                        break L11;
                      } else {
                        var9 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var11 = -1L;
                      if (~((long)((ud) this).field_c + ((ud) this).field_a) >= ~var5_long) {
                        break L14;
                      } else {
                        if (~((long)var8 + var5_long) > ~(((ud) this).field_a - -(long)((ud) this).field_c)) {
                          break L14;
                        } else {
                          var11 = ((ud) this).field_a + (long)((ud) this).field_c;
                          break L13;
                        }
                      }
                    }
                    if (~((ud) this).field_a <= ~(var5_long - -(long)var8)) {
                      break L13;
                    } else {
                      if (((ud) this).field_a - -(long)((ud) this).field_c >= var5_long + (long)var8) {
                        var11 = var5_long + (long)var8;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L7;
                  } else {
                    if (var11 > var9) {
                      var13 = (int)(-var9 + var11);
                      bc.a(((ud) this).field_l, (int)(var9 + -((ud) this).field_a), param3, var7 + (int)(-var5_long + var9), var13);
                      if (((ud) this).field_m < var11) {
                        param2 = (int)((long)param2 - (-((ud) this).field_m + var11));
                        ((ud) this).field_m = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              if (param2 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ud) this).field_b = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("ud.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param3 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L15;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L15;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 41);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == 25971) {
              break L0;
            } else {
              break L0;
            }
          }
          ((ud) this).field_m = param1;
          return;
        }
    }

    public static void a() {
        field_o = null;
        field_h = null;
        field_q = null;
        field_j = null;
    }

    ud(bg param0, int param1, int param2) throws IOException {
        ((ud) this).field_c = 0;
        ((ud) this).field_p = -1L;
        ((ud) this).field_a = -1L;
        try {
            ((ud) this).field_g = param0;
            long dupTemp$0 = param0.a(false);
            ((ud) this).field_i = dupTemp$0;
            ((ud) this).field_f = dupTemp$0;
            ((ud) this).field_l = new byte[param2];
            ((ud) this).field_m = 0L;
            ((ud) this).field_k = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ud.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Visit the Account Management section on the main site to view.";
        field_n = false;
        field_j = "That name is not available";
        field_d = 1;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    private long field_g;
    private int field_a;
    private byte[] field_e;
    private long field_c;
    private long field_i;
    private di field_k;
    static String field_b;
    private int field_m;
    private long field_f;
    static dk field_j;
    private long field_n;
    static nf[] field_l;
    private byte[] field_d;
    private long field_h;

    final void a(long param0, byte param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 > -119) {
            return;
        }
        ((we) this).field_f = param0;
    }

    final void a(byte param0) throws IOException {
        if (param0 > -24) {
            return;
        }
        this.a(false);
        ((we) this).field_k.a(false);
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int[] param8, byte param9, int param10) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var20 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var11_int = 16711935 & param1;
            var12 = 65280 & param1;
            var13 = -param2;
            L1: while (true) {
              if (var13 >= 0) {
                break L0;
              } else {
                var14 = -param6;
                L2: while (true) {
                  if (var14 >= 0) {
                    param0 = param0 + param4;
                    param10 = param10 + param5;
                    var13++;
                    continue L1;
                  } else {
                    L3: {
                      int incrementValue$2 = param0;
                      param0++;
                      param7 = param3[incrementValue$2];
                      if (0 == param7) {
                        param10++;
                        break L3;
                      } else {
                        var15 = param7 & 255;
                        var16 = -var15 + 256;
                        var17 = param8[param10];
                        var18 = var17 & 16711935;
                        var19 = var17 & 65280;
                        int incrementValue$3 = param10;
                        param10++;
                        param8[incrementValue$3] = cl.b(vg.c(16711708, var19 * var16 + var12 * var15) >> 8, vg.c(var15 * var11_int + var18 * var16 >> 8, 16711935));
                        break L3;
                      }
                    }
                    var14++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var11 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var11;
            stackOut_11_1 = new StringBuilder().append("we.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param8 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -53 + ',' + param10 + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        if (param0 != -11509) {
            we.a(45);
        }
        field_b = null;
    }

    final long b(byte param0) {
        if (param0 != 36) {
            return 67L;
        }
        return ((we) this).field_n;
    }

    private final void b(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        ((we) this).field_a = 0;
        if (!(~((we) this).field_f == ~((we) this).field_i)) {
            ((we) this).field_k.a(false, ((we) this).field_f);
            ((we) this).field_i = ((we) this).field_f;
        }
        ((we) this).field_h = ((we) this).field_f;
        while (((we) this).field_a < ((we) this).field_e.length) {
            var2 = -((we) this).field_a + ((we) this).field_e.length;
            if (200000000 < var2) {
                var2 = 200000000;
            }
            var3 = ((we) this).field_k.a(((we) this).field_e, true, var2, ((we) this).field_a);
            if (var3 == -1) {
                break;
            }
            ((we) this).field_i = ((we) this).field_i + (long)var3;
            ((we) this).field_a = ((we) this).field_a + var3;
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        return og.field_c[var4];
    }

    final static ti[] a(int param0, int param1, int param2, int param3) {
        if (param1 <= 110) {
            we.a(49);
        }
        return ad.a(param0, param3, param2, 127, 1);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((we) this).field_n < ((we) this).field_f + (long)param1) {
                ((we) this).field_n = ((we) this).field_f + (long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((we) this).field_c == -1L) {
                break L2;
              } else {
                L3: {
                  if (((we) this).field_c > ((we) this).field_f) {
                    break L3;
                  } else {
                    if (~(((we) this).field_c + (long)((we) this).field_m) > ~((we) this).field_f) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(false);
                break L2;
              }
            }
            L4: {
              if (param2 > 52) {
                break L4;
              } else {
                we.a(48);
                break L4;
              }
            }
            L5: {
              if (-1L == ((we) this).field_c) {
                break L5;
              } else {
                if (((we) this).field_f - -(long)param1 > ((we) this).field_c + (long)((we) this).field_d.length) {
                  var5_int = (int)(-((we) this).field_f + (((we) this).field_c + (long)((we) this).field_d.length));
                  ji.a(param0, param3, ((we) this).field_d, (int)(-((we) this).field_c + ((we) this).field_f), var5_int);
                  param1 = param1 - var5_int;
                  ((we) this).field_f = ((we) this).field_f + (long)var5_int;
                  param3 = param3 + var5_int;
                  ((we) this).field_m = ((we) this).field_d.length;
                  this.a(false);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            if (((we) this).field_d.length < param1) {
              L6: {
                if (~((we) this).field_i == ~((we) this).field_f) {
                  break L6;
                } else {
                  ((we) this).field_k.a(false, ((we) this).field_f);
                  ((we) this).field_i = ((we) this).field_f;
                  break L6;
                }
              }
              L7: {
                ((we) this).field_k.a((byte) 63, param0, param1, param3);
                ((we) this).field_i = ((we) this).field_i + (long)param1;
                if (~((we) this).field_i >= ~((we) this).field_g) {
                  break L7;
                } else {
                  ((we) this).field_g = ((we) this).field_i;
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((we) this).field_h > ((we) this).field_f) {
                    break L9;
                  } else {
                    if ((long)((we) this).field_a + ((we) this).field_h > ((we) this).field_f) {
                      var5_long = ((we) this).field_f;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (~((we) this).field_f < ~((we) this).field_h) {
                  break L8;
                } else {
                  if (~((long)param1 + ((we) this).field_f) < ~((we) this).field_h) {
                    var5_long = ((we) this).field_h;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  if (((we) this).field_f - -(long)param1 <= ((we) this).field_h) {
                    break L11;
                  } else {
                    if ((long)((we) this).field_a + ((we) this).field_h >= ((we) this).field_f + (long)param1) {
                      var7 = ((we) this).field_f - -(long)param1;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if ((long)((we) this).field_a + ((we) this).field_h <= ((we) this).field_f) {
                  break L10;
                } else {
                  if (~((long)param1 + ((we) this).field_f) > ~((long)((we) this).field_a + ((we) this).field_h)) {
                    break L10;
                  } else {
                    var7 = ((we) this).field_h + (long)((we) this).field_a;
                    break L10;
                  }
                }
              }
              L12: {
                if (var5_long <= -1L) {
                  break L12;
                } else {
                  if (~var7 < ~var5_long) {
                    var9 = (int)(-var5_long + var7);
                    ji.a(param0, (int)(-((we) this).field_f + (var5_long + (long)param3)), ((we) this).field_e, (int)(var5_long - ((we) this).field_h), var9);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((we) this).field_f = ((we) this).field_f + (long)param1;
              return;
            } else {
              if (param1 <= 0) {
                break L0;
              } else {
                L13: {
                  if (-1L != ((we) this).field_c) {
                    break L13;
                  } else {
                    ((we) this).field_c = ((we) this).field_f;
                    break L13;
                  }
                }
                L14: {
                  ji.a(param0, param3, ((we) this).field_d, (int)(((we) this).field_f - ((we) this).field_c), param1);
                  ((we) this).field_f = ((we) this).field_f + (long)param1;
                  if (-((we) this).field_c + ((we) this).field_f > (long)((we) this).field_m) {
                    ((we) this).field_m = (int)(-((we) this).field_c + ((we) this).field_f);
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
          ((we) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5_ref;
            stackOut_52_1 = new StringBuilder().append("we.F(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Transmogrify.field_A ? 1 : 0;
          if (((we) this).field_c == -1L) {
            break L0;
          } else {
            L1: {
              if (~((we) this).field_i == ~((we) this).field_c) {
                break L1;
              } else {
                ((we) this).field_k.a(false, ((we) this).field_c);
                ((we) this).field_i = ((we) this).field_c;
                break L1;
              }
            }
            L2: {
              ((we) this).field_k.a((byte) 71, ((we) this).field_d, ((we) this).field_m, 0);
              ((we) this).field_i = ((we) this).field_i + (long)((we) this).field_m;
              if (~((we) this).field_i >= ~((we) this).field_g) {
                break L2;
              } else {
                ((we) this).field_g = ((we) this).field_i;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((we) this).field_h > ((we) this).field_c) {
                  break L4;
                } else {
                  if (((we) this).field_h - -(long)((we) this).field_a <= ((we) this).field_c) {
                    break L4;
                  } else {
                    var2 = ((we) this).field_c;
                    break L3;
                  }
                }
              }
              if (((we) this).field_c > ((we) this).field_h) {
                break L3;
              } else {
                if (~((we) this).field_h <= ~((long)((we) this).field_m + ((we) this).field_c)) {
                  break L3;
                } else {
                  var2 = ((we) this).field_h;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((long)((we) this).field_m + ((we) this).field_c <= ((we) this).field_h) {
                  break L6;
                } else {
                  if ((long)((we) this).field_a + ((we) this).field_h >= (long)((we) this).field_m + ((we) this).field_c) {
                    var4 = ((we) this).field_c - -(long)((we) this).field_m;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((we) this).field_c <= ~((long)((we) this).field_a + ((we) this).field_h)) {
                break L5;
              } else {
                if (~((long)((we) this).field_m + ((we) this).field_c) <= ~((long)((we) this).field_a + ((we) this).field_h)) {
                  var4 = (long)((we) this).field_a + ((we) this).field_h;
                  break L5;
                } else {
                  L7: {
                    if (var2 <= -1L) {
                      break L7;
                    } else {
                      if (var4 <= var2) {
                        break L7;
                      } else {
                        var6 = (int)(var4 - var2);
                        ji.a(((we) this).field_d, (int)(-((we) this).field_c + var2), ((we) this).field_e, (int)(-((we) this).field_h + var2), var6);
                        break L7;
                      }
                    }
                  }
                  ((we) this).field_c = -1L;
                  ((we) this).field_m = 0;
                  break L0;
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
                  var6 = (int)(var4 - var2);
                  ji.a(((we) this).field_d, (int)(-((we) this).field_c + var2), ((we) this).field_e, (int)(-((we) this).field_h + var2), var6);
                  break L8;
                }
              }
            }
            ((we) this).field_c = -1L;
            ((we) this).field_m = 0;
            break L0;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param2.length >= param1 + param0) {
              L1: {
                if (-1L == ((we) this).field_c) {
                  break L1;
                } else {
                  if (~((we) this).field_c < ~((we) this).field_f) {
                    break L1;
                  } else {
                    if (((we) this).field_c + (long)((we) this).field_m >= ((we) this).field_f - -(long)param1) {
                      ji.a(((we) this).field_d, (int)(-((we) this).field_c + ((we) this).field_f), param2, param0, param1);
                      ((we) this).field_f = ((we) this).field_f + (long)param1;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5_long = ((we) this).field_f;
              var7 = param0;
              if (param3 == 0) {
                L2: {
                  var8 = param1;
                  if (~((we) this).field_f > ~((we) this).field_h) {
                    break L2;
                  } else {
                    if ((long)((we) this).field_a + ((we) this).field_h <= ((we) this).field_f) {
                      break L2;
                    } else {
                      L3: {
                        var9_int = (int)((long)((we) this).field_a + (((we) this).field_h + -((we) this).field_f));
                        if (var9_int > param1) {
                          var9_int = param1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ji.a(((we) this).field_e, (int)(-((we) this).field_h + ((we) this).field_f), param2, param0, var9_int);
                      param0 = param0 + var9_int;
                      ((we) this).field_f = ((we) this).field_f + (long)var9_int;
                      param1 = param1 - var9_int;
                      break L2;
                    }
                  }
                }
                L4: {
                  if (((we) this).field_e.length < param1) {
                    ((we) this).field_k.a(false, ((we) this).field_f);
                    ((we) this).field_i = ((we) this).field_f;
                    L5: while (true) {
                      if (param1 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((we) this).field_k.a(param2, true, param1, param0);
                        if (var9_int != -1) {
                          param0 = param0 + var9_int;
                          ((we) this).field_f = ((we) this).field_f + (long)var9_int;
                          ((we) this).field_i = ((we) this).field_i + (long)var9_int;
                          param1 = param1 - var9_int;
                          continue L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (param1 <= 0) {
                      break L4;
                    } else {
                      L6: {
                        this.b(false);
                        var9_int = param1;
                        if (var9_int > ((we) this).field_a) {
                          var9_int = ((we) this).field_a;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ji.a(((we) this).field_e, 0, param2, param0, var9_int);
                      param1 = param1 - var9_int;
                      ((we) this).field_f = ((we) this).field_f + (long)var9_int;
                      param0 = param0 + var9_int;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (-1L == ((we) this).field_c) {
                    break L7;
                  } else {
                    L8: {
                      if (((we) this).field_f >= ((we) this).field_c) {
                        break L8;
                      } else {
                        if (param1 <= 0) {
                          break L8;
                        } else {
                          L9: {
                            var9_int = (int)(-((we) this).field_f + ((we) this).field_c) + param0;
                            if (var9_int <= param0 - -param1) {
                              break L9;
                            } else {
                              var9_int = param0 + param1;
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (param0 >= var9_int) {
                              break L8;
                            } else {
                              param1--;
                              int incrementValue$1 = param0;
                              param0++;
                              param2[incrementValue$1] = (byte) 0;
                              ((we) this).field_f = ((we) this).field_f + 1L;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      L12: {
                        var9 = -1L;
                        if (var5_long > ((we) this).field_c) {
                          break L12;
                        } else {
                          if (((we) this).field_c < (long)var8 + var5_long) {
                            var9 = ((we) this).field_c;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (((we) this).field_c > var5_long) {
                        break L11;
                      } else {
                        if (((we) this).field_c - -(long)((we) this).field_m <= var5_long) {
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
                        if ((long)((we) this).field_m + ((we) this).field_c <= var5_long) {
                          break L14;
                        } else {
                          if (~(((we) this).field_c - -(long)((we) this).field_m) >= ~(var5_long - -(long)var8)) {
                            var11 = (long)((we) this).field_m + ((we) this).field_c;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (((we) this).field_c >= var5_long + (long)var8) {
                        break L13;
                      } else {
                        if ((long)var8 + var5_long > (long)((we) this).field_m + ((we) this).field_c) {
                          break L13;
                        } else {
                          var11 = var5_long - -(long)var8;
                          break L13;
                        }
                      }
                    }
                    if (var9 <= -1L) {
                      break L7;
                    } else {
                      if (~var9 <= ~var11) {
                        break L7;
                      } else {
                        var13 = (int)(var11 + -var9);
                        ji.a(((we) this).field_d, (int)(var9 + -((we) this).field_c), param2, (int)(-var5_long + var9) + var7, var13);
                        if (~var11 < ~((we) this).field_f) {
                          param1 = (int)((long)param1 - (var11 + -((we) this).field_f));
                          ((we) this).field_f = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                if (param1 > 0) {
                  throw new EOFException();
                } else {
                  break L0;
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1 + param0 - param2.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((we) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param2 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L15;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L15;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param3 + ')');
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            if (param1 != 16711708) {
                ti[] discarded$0 = we.a(-44, -9, 23, -38);
            }
            ((we) this).a(0, param0.length, param0, (byte) 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "we.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    we(di param0, int param1, int param2) throws IOException {
        ((we) this).field_c = -1L;
        ((we) this).field_m = 0;
        ((we) this).field_h = -1L;
        try {
            ((we) this).field_k = param0;
            long dupTemp$0 = param0.a(16);
            ((we) this).field_g = dupTemp$0;
            ((we) this).field_n = dupTemp$0;
            ((we) this).field_d = new byte[param2];
            ((we) this).field_f = 0L;
            ((we) this).field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Log in / Create account";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa {
    private byte[] field_a;
    private byte[] field_b;
    static int[] field_i;
    private gl field_m;
    private long field_n;
    private int field_e;
    private long field_c;
    private long field_g;
    static String field_h;
    private long field_d;
    private long field_k;
    private long field_l;
    private int field_f;
    static boolean field_j;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param1.length >= param3 + param2) {
              L1: {
                if (((qa) this).field_n == -1L) {
                  break L1;
                } else {
                  if (~((qa) this).field_g > ~((qa) this).field_n) {
                    break L1;
                  } else {
                    if ((long)((qa) this).field_e + ((qa) this).field_n >= ((qa) this).field_g + (long)param3) {
                      eg.a(((qa) this).field_a, (int)(-((qa) this).field_n + ((qa) this).field_g), param1, param2, param3);
                      ((qa) this).field_g = ((qa) this).field_g + (long)param3;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((qa) this).field_g;
                var7 = param2;
                var8 = param3;
                if (~((qa) this).field_g > ~((qa) this).field_k) {
                  break L2;
                } else {
                  if (~((qa) this).field_g <= ~(((qa) this).field_k - -(long)((qa) this).field_f)) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)((long)((qa) this).field_f - -((qa) this).field_k - ((qa) this).field_g);
                      if (param3 < var9_int) {
                        var9_int = param3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    eg.a(((qa) this).field_b, (int)(-((qa) this).field_k + ((qa) this).field_g), param1, param2, var9_int);
                    param2 = param2 + var9_int;
                    ((qa) this).field_g = ((qa) this).field_g + (long)var9_int;
                    param3 = param3 - var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (((qa) this).field_b.length >= param3) {
                  if (param3 <= 0) {
                    break L4;
                  } else {
                    L5: {
                      this.c(-1);
                      var9_int = param3;
                      if (((qa) this).field_f < var9_int) {
                        var9_int = ((qa) this).field_f;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    eg.a(((qa) this).field_b, 0, param1, param2, var9_int);
                    ((qa) this).field_g = ((qa) this).field_g + (long)var9_int;
                    param3 = param3 - var9_int;
                    param2 = param2 + var9_int;
                    break L4;
                  }
                } else {
                  ((qa) this).field_m.a(((qa) this).field_g, param0 + -224);
                  ((qa) this).field_l = ((qa) this).field_g;
                  L6: while (true) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((qa) this).field_m.a(param1, param2, param3, (byte) -68);
                      if (var9_int != -1) {
                        param3 = param3 - var9_int;
                        ((qa) this).field_l = ((qa) this).field_l + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((qa) this).field_g = ((qa) this).field_g + (long)var9_int;
                        continue L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L7: {
                if (-1L != ((qa) this).field_n) {
                  L8: {
                    if (((qa) this).field_g >= ((qa) this).field_n) {
                      break L8;
                    } else {
                      if (param3 > 0) {
                        L9: {
                          var9_int = (int)(((qa) this).field_n + -((qa) this).field_g) + param2;
                          if (param3 + param2 >= var9_int) {
                            break L9;
                          } else {
                            var9_int = param2 + param3;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var9_int <= param2) {
                            break L8;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param1[incrementValue$1] = (byte) 0;
                            param3--;
                            ((qa) this).field_g = ((qa) this).field_g + 1L;
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
                      if (~((qa) this).field_n > ~var5_long) {
                        break L12;
                      } else {
                        if (((qa) this).field_n < (long)var8 + var5_long) {
                          var9 = ((qa) this).field_n;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~((qa) this).field_n < ~var5_long) {
                      break L11;
                    } else {
                      if (var5_long >= ((qa) this).field_n + (long)((qa) this).field_e) {
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
                      if (~var5_long <= ~((long)((qa) this).field_e + ((qa) this).field_n)) {
                        break L14;
                      } else {
                        if (~((long)((qa) this).field_e + ((qa) this).field_n) < ~(var5_long - -(long)var8)) {
                          break L14;
                        } else {
                          var11 = ((qa) this).field_n - -(long)((qa) this).field_e;
                          break L13;
                        }
                      }
                    }
                    if (((qa) this).field_n >= var5_long + (long)var8) {
                      break L13;
                    } else {
                      if ((long)((qa) this).field_e + ((qa) this).field_n >= var5_long + (long)var8) {
                        var11 = var5_long - -(long)var8;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L7;
                  } else {
                    if (~var11 >= ~var9) {
                      break L7;
                    } else {
                      var13 = (int)(var11 + -var9);
                      eg.a(((qa) this).field_a, (int)(-((qa) this).field_n + var9), param1, var7 + (int)(var9 + -var5_long), var13);
                      if (((qa) this).field_g >= var11) {
                        break L7;
                      } else {
                        param3 = (int)((long)param3 - (var11 - ((qa) this).field_g));
                        ((qa) this).field_g = var11;
                        break L7;
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L15: {
                if (param0 == 106) {
                  break L15;
                } else {
                  break L15;
                }
              }
              if (param3 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param3 + param2);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((qa) this).field_l = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("qa.F(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        if (param0 <= 80) {
          return;
        } else {
          L0: {
            if (((qa) this).field_n == -1L) {
              break L0;
            } else {
              L1: {
                if (((qa) this).field_l != ((qa) this).field_n) {
                  ((qa) this).field_m.a(((qa) this).field_n, -88);
                  ((qa) this).field_l = ((qa) this).field_n;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((qa) this).field_m.a(120, 0, ((qa) this).field_e, ((qa) this).field_a);
                ((qa) this).field_l = ((qa) this).field_l + (long)((qa) this).field_e;
                if (~((qa) this).field_l >= ~((qa) this).field_c) {
                  break L2;
                } else {
                  ((qa) this).field_c = ((qa) this).field_l;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (((qa) this).field_k > ((qa) this).field_n) {
                    break L4;
                  } else {
                    if (((qa) this).field_n < ((qa) this).field_k - -(long)((qa) this).field_f) {
                      var2 = ((qa) this).field_n;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((qa) this).field_k < ((qa) this).field_n) {
                  break L3;
                } else {
                  if (~((qa) this).field_k > ~(((qa) this).field_n + (long)((qa) this).field_e)) {
                    var2 = ((qa) this).field_k;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((qa) this).field_n + (long)((qa) this).field_e <= ((qa) this).field_k) {
                    break L6;
                  } else {
                    if (((qa) this).field_k + (long)((qa) this).field_f >= ((qa) this).field_n + (long)((qa) this).field_e) {
                      var4 = ((qa) this).field_n - -(long)((qa) this).field_e;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((qa) this).field_k - -(long)((qa) this).field_f <= ((qa) this).field_n) {
                  break L5;
                } else {
                  if (((qa) this).field_k - -(long)((qa) this).field_f > ((qa) this).field_n - -(long)((qa) this).field_e) {
                    break L5;
                  } else {
                    var4 = ((qa) this).field_k + (long)((qa) this).field_f;
                    break L5;
                  }
                }
              }
              L7: {
                if (var2 <= -1L) {
                  break L7;
                } else {
                  if (var2 >= var4) {
                    break L7;
                  } else {
                    var6 = (int)(var4 - var2);
                    eg.a(((qa) this).field_a, (int)(var2 - ((qa) this).field_n), ((qa) this).field_b, (int)(var2 + -((qa) this).field_k), var6);
                    break L7;
                  }
                }
              }
              ((qa) this).field_n = -1L;
              ((qa) this).field_e = 0;
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 > -69) {
            return;
        }
        try {
            ((qa) this).a((byte) 106, param0, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qa.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (0L > param0) {
            throw new IOException();
        }
        if (param1 != -1) {
            return;
        }
        ((qa) this).field_g = param0;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        ((qa) this).field_f = 0;
        if (!(((qa) this).field_g == ((qa) this).field_l)) {
            ((qa) this).field_m.a(((qa) this).field_g, -90);
            ((qa) this).field_l = ((qa) this).field_g;
        }
        ((qa) this).field_k = ((qa) this).field_g;
        while (((qa) this).field_f < ((qa) this).field_b.length) {
            var2 = -((qa) this).field_f + ((qa) this).field_b.length;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((qa) this).field_m.a(((qa) this).field_b, ((qa) this).field_f, var2, (byte) -63);
            if (var3 == -1) {
                break;
            }
            ((qa) this).field_f = ((qa) this).field_f + var3;
            ((qa) this).field_l = ((qa) this).field_l + (long)var3;
        }
    }

    final void d(int param0) throws IOException {
        if (param0 != -200000001) {
            return;
        }
        this.a((byte) 88);
        ((qa) this).field_m.d(91);
    }

    final long b(int param0) {
        if (param0 != 0) {
            ((qa) this).field_d = 73L;
        }
        return ((qa) this).field_d;
    }

    final static dp a(byte param0, int param1) {
        dp var2 = new dp();
        if (param0 != 121) {
            field_h = null;
        }
        pm.field_c.b(0, (jb) (Object) var2);
        eq.b(param0 ^ 123, param1);
        return var2;
    }

    qa(gl param0, int param1, int param2) throws IOException {
        ((qa) this).field_n = -1L;
        ((qa) this).field_e = 0;
        ((qa) this).field_k = -1L;
        try {
            ((qa) this).field_m = param0;
            long dupTemp$0 = param0.a(48);
            ((qa) this).field_c = dupTemp$0;
            ((qa) this).field_d = dupTemp$0;
            ((qa) this).field_a = new byte[param2];
            ((qa) this).field_b = new byte[param1];
            ((qa) this).field_g = 0L;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
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
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (~(((qa) this).field_g - -(long)param3) < ~((qa) this).field_d) {
                ((qa) this).field_d = ((qa) this).field_g - -(long)param3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((qa) this).field_n == -1L) {
                break L2;
              } else {
                L3: {
                  if (~((qa) this).field_n < ~((qa) this).field_g) {
                    break L3;
                  } else {
                    if (((qa) this).field_g > (long)((qa) this).field_e + ((qa) this).field_n) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a((byte) 103);
                break L2;
              }
            }
            L4: {
              if (((qa) this).field_n == -1L) {
                break L4;
              } else {
                if (~(((qa) this).field_g - -(long)param3) < ~(((qa) this).field_n + (long)((qa) this).field_a.length)) {
                  var5_int = (int)(-((qa) this).field_g + ((qa) this).field_n + (long)((qa) this).field_a.length);
                  eg.a(param1, param2, ((qa) this).field_a, (int)(((qa) this).field_g - ((qa) this).field_n), var5_int);
                  ((qa) this).field_g = ((qa) this).field_g + (long)var5_int;
                  param3 = param3 - var5_int;
                  param2 = param2 + var5_int;
                  ((qa) this).field_e = ((qa) this).field_a.length;
                  this.a((byte) 95);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            var5_int = 7 / ((82 - param0) / 36);
            if (param3 <= ((qa) this).field_a.length) {
              if (0 >= param3) {
                break L0;
              } else {
                L5: {
                  if (((qa) this).field_n == -1L) {
                    ((qa) this).field_n = ((qa) this).field_g;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  eg.a(param1, param2, ((qa) this).field_a, (int)(-((qa) this).field_n + ((qa) this).field_g), param3);
                  ((qa) this).field_g = ((qa) this).field_g + (long)param3;
                  if (~(long)((qa) this).field_e <= ~(-((qa) this).field_n + ((qa) this).field_g)) {
                    break L6;
                  } else {
                    ((qa) this).field_e = (int)(-((qa) this).field_n + ((qa) this).field_g);
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (~((qa) this).field_l != ~((qa) this).field_g) {
                  ((qa) this).field_m.a(((qa) this).field_g, -99);
                  ((qa) this).field_l = ((qa) this).field_g;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                ((qa) this).field_m.a(120, param2, param3, param1);
                ((qa) this).field_l = ((qa) this).field_l + (long)param3;
                if (((qa) this).field_l > ((qa) this).field_c) {
                  ((qa) this).field_c = ((qa) this).field_l;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var6 = -1L;
                  var8 = -1L;
                  if (~((qa) this).field_g > ~((qa) this).field_k) {
                    break L10;
                  } else {
                    if (~((long)((qa) this).field_f + ((qa) this).field_k) < ~((qa) this).field_g) {
                      var6 = ((qa) this).field_g;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (~((qa) this).field_k > ~((qa) this).field_g) {
                  break L9;
                } else {
                  if (((qa) this).field_k < (long)param3 + ((qa) this).field_g) {
                    var6 = ((qa) this).field_k;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  if (~(((qa) this).field_g - -(long)param3) >= ~((qa) this).field_k) {
                    break L12;
                  } else {
                    if (((qa) this).field_g + (long)param3 <= (long)((qa) this).field_f + ((qa) this).field_k) {
                      var8 = (long)param3 + ((qa) this).field_g;
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (((qa) this).field_k - -(long)((qa) this).field_f <= ((qa) this).field_g) {
                  break L11;
                } else {
                  if (((qa) this).field_k + (long)((qa) this).field_f > (long)param3 + ((qa) this).field_g) {
                    break L11;
                  } else {
                    var8 = ((qa) this).field_k + (long)((qa) this).field_f;
                    break L11;
                  }
                }
              }
              L13: {
                if (var6 <= -1L) {
                  break L13;
                } else {
                  if (~var8 < ~var6) {
                    var10 = (int)(var8 + -var6);
                    eg.a(param1, (int)(-((qa) this).field_g + ((long)param2 + var6)), ((qa) this).field_b, (int)(-((qa) this).field_k + var6), var10);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              ((qa) this).field_g = ((qa) this).field_g + (long)param3;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((qa) this).field_l = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("qa.C(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L14;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        if (param0 != -6142) {
            dp discarded$0 = qa.a((byte) -3, -85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
        field_h = "You can make him move using the keys indicated above.";
    }
}

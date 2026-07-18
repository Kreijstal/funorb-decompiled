/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me {
    static ea[] field_k;
    private byte[] field_o;
    private long field_g;
    private long field_b;
    static int field_j;
    private an field_f;
    private long field_n;
    private byte[] field_a;
    private long field_d;
    static String field_l;
    static int field_h;
    private int field_c;
    private long field_i;
    private long field_e;
    private int field_m;

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        if (param0 < 105) {
            return;
        }
        ((me) this).field_g = param1;
    }

    final static int[] a(int param0, int[] param1, int[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var6 = new int[8];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (8 <= var4) {
                stackOut_4_0 = (int[]) var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var6[var4] = c.a(param1[var4], ~param2[var4]);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("me.I(").append(8).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final long a(byte param0) {
        if (param0 >= -35) {
            field_k = null;
        }
        return ((me) this).field_b;
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) throws IOException {
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
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if ((long)param1 + ((me) this).field_g > ((me) this).field_b) {
                ((me) this).field_b = ((me) this).field_g - -(long)param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((me) this).field_e == -1L) {
                break L2;
              } else {
                L3: {
                  if (((me) this).field_e > ((me) this).field_g) {
                    break L3;
                  } else {
                    if (~((me) this).field_g < ~(((me) this).field_e - -(long)((me) this).field_c)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(26021);
                break L2;
              }
            }
            L4: {
              if (((me) this).field_e == -1L) {
                break L4;
              } else {
                if (((me) this).field_e - -(long)((me) this).field_a.length >= ((me) this).field_g - -(long)param1) {
                  break L4;
                } else {
                  var5_int = (int)((long)((me) this).field_a.length + (((me) this).field_e + -((me) this).field_g));
                  ai.a(param0, param2, ((me) this).field_a, (int)(((me) this).field_g + -((me) this).field_e), var5_int);
                  ((me) this).field_g = ((me) this).field_g + (long)var5_int;
                  param1 = param1 - var5_int;
                  param2 = param2 + var5_int;
                  ((me) this).field_c = ((me) this).field_a.length;
                  this.a(26021);
                  break L4;
                }
              }
            }
            if (param1 <= ((me) this).field_a.length) {
              if (0 >= param1) {
                L5: {
                  if (param3) {
                    break L5;
                  } else {
                    me.a(108, true);
                    break L5;
                  }
                }
                break L0;
              } else {
                L6: {
                  if (((me) this).field_e == -1L) {
                    ((me) this).field_e = ((me) this).field_g;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  ai.a(param0, param2, ((me) this).field_a, (int)(-((me) this).field_e + ((me) this).field_g), param1);
                  ((me) this).field_g = ((me) this).field_g + (long)param1;
                  if ((long)((me) this).field_c < ((me) this).field_g - ((me) this).field_e) {
                    ((me) this).field_c = (int)(((me) this).field_g + -((me) this).field_e);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              L8: {
                if (((me) this).field_g != ((me) this).field_d) {
                  ((me) this).field_f.a(0, ((me) this).field_g);
                  ((me) this).field_d = ((me) this).field_g;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((me) this).field_f.a(param2, param1, param0, 107);
                ((me) this).field_d = ((me) this).field_d + (long)param1;
                if (((me) this).field_n < ((me) this).field_d) {
                  ((me) this).field_n = ((me) this).field_d;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (((me) this).field_g < ((me) this).field_i) {
                    break L11;
                  } else {
                    if ((long)((me) this).field_m + ((me) this).field_i > ((me) this).field_g) {
                      var5_long = ((me) this).field_g;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (((me) this).field_i < ((me) this).field_g) {
                  break L10;
                } else {
                  if (~((me) this).field_i <= ~(((me) this).field_g - -(long)param1)) {
                    break L10;
                  } else {
                    var5_long = ((me) this).field_i;
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if (~(((me) this).field_g + (long)param1) >= ~((me) this).field_i) {
                    break L13;
                  } else {
                    if (~(((me) this).field_g - -(long)param1) >= ~((long)((me) this).field_m + ((me) this).field_i)) {
                      var7 = ((me) this).field_g - -(long)param1;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (~(((me) this).field_i + (long)((me) this).field_m) >= ~((me) this).field_g) {
                  break L12;
                } else {
                  if (((me) this).field_g + (long)param1 < (long)((me) this).field_m + ((me) this).field_i) {
                    break L12;
                  } else {
                    var7 = ((me) this).field_i + (long)((me) this).field_m;
                    break L12;
                  }
                }
              }
              L14: {
                if (var5_long <= -1L) {
                  break L14;
                } else {
                  if (~var5_long <= ~var7) {
                    break L14;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    ai.a(param0, (int)((long)param2 - (-var5_long + ((me) this).field_g)), ((me) this).field_o, (int)(-((me) this).field_i + var5_long), var9);
                    break L14;
                  }
                }
              }
              ((me) this).field_g = ((me) this).field_g + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((me) this).field_d = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("me.H(");
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
          throw lj.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b() {
        int var1 = 1;
        field_l = null;
        field_k = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
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
              ((me) this).a(param0, 0, param0.length, -1);
              if (param1 > 111) {
                break L1;
              } else {
                me.a(-92, true);
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
            stackOut_3_1 = new StringBuilder().append("me.J(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var14 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0.length >= param2 + param1) {
              L1: {
                if (((me) this).field_e == (long)param3) {
                  break L1;
                } else {
                  if (~((me) this).field_e < ~((me) this).field_g) {
                    break L1;
                  } else {
                    if (~(((me) this).field_e - -(long)((me) this).field_c) <= ~((long)param2 + ((me) this).field_g)) {
                      ai.a(((me) this).field_a, (int)(-((me) this).field_e + ((me) this).field_g), param0, param1, param2);
                      ((me) this).field_g = ((me) this).field_g + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((me) this).field_g;
                var7 = param1;
                var8 = param2;
                if (((me) this).field_g < ((me) this).field_i) {
                  break L2;
                } else {
                  if (~((long)((me) this).field_m + ((me) this).field_i) >= ~((me) this).field_g) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)(((me) this).field_i + -((me) this).field_g + (long)((me) this).field_m);
                      if (var9_int > param2) {
                        var9_int = param2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ai.a(((me) this).field_o, (int)(((me) this).field_g - ((me) this).field_i), param0, param1, var9_int);
                    ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (((me) this).field_o.length >= param2) {
                  if (0 >= param2) {
                    break L4;
                  } else {
                    L5: {
                      int discarded$2 = 20;
                      this.c();
                      var9_int = param2;
                      if (var9_int > ((me) this).field_m) {
                        var9_int = ((me) this).field_m;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ai.a(((me) this).field_o, 0, param0, param1, var9_int);
                    param1 = param1 + var9_int;
                    param2 = param2 - var9_int;
                    ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                    break L4;
                  }
                } else {
                  ((me) this).field_f.a(0, ((me) this).field_g);
                  ((me) this).field_d = ((me) this).field_g;
                  L6: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((me) this).field_f.b(32, param2, param0, param1);
                      if (var9_int != -1) {
                        ((me) this).field_d = ((me) this).field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        ((me) this).field_g = ((me) this).field_g + (long)var9_int;
                        param2 = param2 - var9_int;
                        continue L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L7: {
                if (((me) this).field_e == -1L) {
                  break L7;
                } else {
                  L8: {
                    if (~((me) this).field_e >= ~((me) this).field_g) {
                      break L8;
                    } else {
                      if (param2 > 0) {
                        L9: {
                          var9_int = param1 - -(int)(-((me) this).field_g + ((me) this).field_e);
                          if (var9_int <= param1 + param2) {
                            break L9;
                          } else {
                            var9_int = param1 + param2;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param1 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$3 = param1;
                            param1++;
                            param0[incrementValue$3] = (byte) 0;
                            param2--;
                            ((me) this).field_g = ((me) this).field_g + 1L;
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
                      var11 = -1L;
                      if (~((me) this).field_e > ~var5_long) {
                        break L12;
                      } else {
                        if (var5_long - -(long)var8 > ((me) this).field_e) {
                          var9 = ((me) this).field_e;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~((me) this).field_e < ~var5_long) {
                      break L11;
                    } else {
                      if (var5_long >= ((me) this).field_e - -(long)((me) this).field_c) {
                        break L11;
                      } else {
                        var9 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (var5_long >= (long)((me) this).field_c + ((me) this).field_e) {
                        break L14;
                      } else {
                        if (~(var5_long + (long)var8) > ~((long)((me) this).field_c + ((me) this).field_e)) {
                          break L14;
                        } else {
                          var11 = ((me) this).field_e - -(long)((me) this).field_c;
                          break L13;
                        }
                      }
                    }
                    if ((long)var8 + var5_long <= ((me) this).field_e) {
                      break L13;
                    } else {
                      if (~((long)((me) this).field_c + ((me) this).field_e) <= ~((long)var8 + var5_long)) {
                        var11 = (long)var8 + var5_long;
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
                      var13 = (int)(-var9 + var11);
                      ai.a(((me) this).field_a, (int)(-((me) this).field_e + var9), param0, var7 - -(int)(-var5_long + var9), var13);
                      if (var11 <= ((me) this).field_g) {
                        break L7;
                      } else {
                        param2 = (int)((long)param2 - (var11 - ((me) this).field_g));
                        ((me) this).field_g = var11;
                        break L7;
                      }
                    }
                  }
                }
              }
              if (param2 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param2 + param1 + -param0.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((me) this).field_d = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("me.E(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L15;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L15;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (((me) this).field_e == -1L) {
            break L0;
          } else {
            L1: {
              if (~((me) this).field_d == ~((me) this).field_e) {
                break L1;
              } else {
                ((me) this).field_f.a(0, ((me) this).field_e);
                ((me) this).field_d = ((me) this).field_e;
                break L1;
              }
            }
            L2: {
              ((me) this).field_f.a(0, ((me) this).field_c, ((me) this).field_a, param0 + -25931);
              ((me) this).field_d = ((me) this).field_d + (long)((me) this).field_c;
              if (((me) this).field_n >= ((me) this).field_d) {
                break L2;
              } else {
                ((me) this).field_n = ((me) this).field_d;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (~((me) this).field_e > ~((me) this).field_i) {
                  break L4;
                } else {
                  if (~((long)((me) this).field_m + ((me) this).field_i) < ~((me) this).field_e) {
                    var2 = ((me) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((me) this).field_e < ~((me) this).field_i) {
                break L3;
              } else {
                if (~((long)((me) this).field_c + ((me) this).field_e) < ~((me) this).field_i) {
                  var2 = ((me) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((me) this).field_i >= (long)((me) this).field_c + ((me) this).field_e) {
                  break L6;
                } else {
                  if ((long)((me) this).field_c + ((me) this).field_e <= ((me) this).field_i + (long)((me) this).field_m) {
                    var4 = ((me) this).field_e - -(long)((me) this).field_c;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((me) this).field_e >= ((me) this).field_i + (long)((me) this).field_m) {
                break L5;
              } else {
                if ((long)((me) this).field_m + ((me) this).field_i > ((me) this).field_e - -(long)((me) this).field_c) {
                  break L5;
                } else {
                  var4 = (long)((me) this).field_m + ((me) this).field_i;
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var2 >= var4) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  ai.a(((me) this).field_a, (int)(-((me) this).field_e + var2), ((me) this).field_o, (int)(-((me) this).field_i + var2), var6);
                  break L7;
                }
              }
            }
            ((me) this).field_e = -1L;
            ((me) this).field_c = 0;
            break L0;
          }
        }
        L8: {
          if (param0 == 26021) {
            break L8;
          } else {
            ((me) this).field_m = 24;
            break L8;
          }
        }
    }

    private final void c() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          ((me) this).field_m = 0;
          if (~((me) this).field_d != ~((me) this).field_g) {
            ((me) this).field_f.a(0, ((me) this).field_g);
            ((me) this).field_d = ((me) this).field_g;
            break L0;
          } else {
            break L0;
          }
        }
        ((me) this).field_i = ((me) this).field_g;
        var2 = 0;
        L1: while (true) {
          L2: {
            if (((me) this).field_o.length <= ((me) this).field_m) {
              break L2;
            } else {
              L3: {
                var3 = -((me) this).field_m + ((me) this).field_o.length;
                if (200000000 < var3) {
                  var3 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = ((me) this).field_f.b(6, var3, ((me) this).field_o, ((me) this).field_m);
              if (var4 == -1) {
                break L2;
              } else {
                ((me) this).field_m = ((me) this).field_m + var4;
                ((me) this).field_d = ((me) this).field_d + (long)var4;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void b(int param0) throws IOException {
        this.a(param0 ^ -7618);
        ((me) this).field_f.b(-110);
        if (param0 != -30821) {
            me.a(-62, false);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 0) {
            int discarded$0 = 2;
            int discarded$1 = 1;
            mm.a(false, df.field_b, 2, 1);
        }
        if (!(1 != param0)) {
            int discarded$2 = 2;
            int discarded$3 = 1;
            mm.a(false, hl.field_a, 2, 1);
        }
        if (param1) {
            me.a(7, false);
        }
    }

    me(an param0, int param1, int param2) throws IOException {
        ((me) this).field_c = 0;
        ((me) this).field_e = -1L;
        ((me) this).field_i = -1L;
        try {
            ((me) this).field_f = param0;
            long dupTemp$0 = param0.a((byte) 122);
            ((me) this).field_n = dupTemp$0;
            ((me) this).field_b = dupTemp$0;
            ((me) this).field_o = new byte[param1];
            ((me) this).field_g = 0L;
            ((me) this).field_a = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_l = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_k = new ea[2];
    }
}

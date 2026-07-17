/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class p {
    static int field_m;
    private long field_k;
    private int field_j;
    private byte[] field_e;
    private byte[] field_l;
    private long field_g;
    static String field_c;
    private sa field_h;
    private long field_a;
    private long field_b;
    private int field_f;
    private long field_i;
    private long field_d;

    final long b(int param0) {
        if (param0 != -200000001) {
            ((p) this).field_d = 63L;
        }
        return ((p) this).field_i;
    }

    final void a(int param0) throws IOException {
        this.a((byte) 66);
        ((p) this).field_h.b(0);
        if (param0 != -1) {
            ((p) this).field_f = -5;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if ((long)param3 + ((p) this).field_k <= ((p) this).field_i) {
                break L1;
              } else {
                ((p) this).field_i = ((p) this).field_k - -(long)param3;
                break L1;
              }
            }
            L2: {
              if (((p) this).field_b == -1L) {
                break L2;
              } else {
                L3: {
                  if (((p) this).field_b > ((p) this).field_k) {
                    break L3;
                  } else {
                    if (((p) this).field_b - -(long)((p) this).field_f < ((p) this).field_k) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a((byte) 66);
                break L2;
              }
            }
            L4: {
              if (param0 == -19735) {
                break L4;
              } else {
                p.b((byte) -23);
                break L4;
              }
            }
            L5: {
              if (((p) this).field_b == -1L) {
                break L5;
              } else {
                if (((p) this).field_b - -(long)((p) this).field_e.length >= ((p) this).field_k - -(long)param3) {
                  break L5;
                } else {
                  var5_int = (int)((long)((p) this).field_e.length - (-((p) this).field_b + ((p) this).field_k));
                  rd.a(param1, param2, ((p) this).field_e, (int)(-((p) this).field_b + ((p) this).field_k), var5_int);
                  ((p) this).field_k = ((p) this).field_k + (long)var5_int;
                  param2 = param2 + var5_int;
                  param3 = param3 - var5_int;
                  ((p) this).field_f = ((p) this).field_e.length;
                  this.a((byte) 66);
                  break L5;
                }
              }
            }
            if (((p) this).field_e.length < param3) {
              L6: {
                if (((p) this).field_k == ((p) this).field_g) {
                  break L6;
                } else {
                  ((p) this).field_h.a(((p) this).field_k, false);
                  ((p) this).field_g = ((p) this).field_k;
                  break L6;
                }
              }
              L7: {
                ((p) this).field_h.a(param0 + 19649, param2, param1, param3);
                ((p) this).field_g = ((p) this).field_g + (long)param3;
                if (((p) this).field_g > ((p) this).field_a) {
                  ((p) this).field_a = ((p) this).field_g;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                L9: {
                  var5_long = -1L;
                  if (~((p) this).field_d < ~((p) this).field_k) {
                    break L9;
                  } else {
                    if (~(((p) this).field_d + (long)((p) this).field_j) < ~((p) this).field_k) {
                      var5_long = ((p) this).field_k;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (~((p) this).field_d > ~((p) this).field_k) {
                  break L8;
                } else {
                  if (~((long)param3 + ((p) this).field_k) < ~((p) this).field_d) {
                    var5_long = ((p) this).field_d;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                L11: {
                  var7 = -1L;
                  if (~((p) this).field_d <= ~(((p) this).field_k - -(long)param3)) {
                    break L11;
                  } else {
                    if ((long)((p) this).field_j + ((p) this).field_d < (long)param3 + ((p) this).field_k) {
                      break L11;
                    } else {
                      var7 = (long)param3 + ((p) this).field_k;
                      break L10;
                    }
                  }
                }
                if (((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                  break L10;
                } else {
                  if ((long)param3 + ((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                    var7 = (long)((p) this).field_j + ((p) this).field_d;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (-1L >= var5_long) {
                  break L12;
                } else {
                  if (var5_long < var7) {
                    var9 = (int)(-var5_long + var7);
                    rd.a(param1, (int)(var5_long + ((long)param2 + -((p) this).field_k)), ((p) this).field_l, (int)(-((p) this).field_d + var5_long), var9);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              ((p) this).field_k = ((p) this).field_k + (long)param3;
              return;
            } else {
              if (param3 <= 0) {
                break L0;
              } else {
                L13: {
                  if (((p) this).field_b != -1L) {
                    break L13;
                  } else {
                    ((p) this).field_b = ((p) this).field_k;
                    break L13;
                  }
                }
                L14: {
                  rd.a(param1, param2, ((p) this).field_e, (int)(-((p) this).field_b + ((p) this).field_k), param3);
                  ((p) this).field_k = ((p) this).field_k + (long)param3;
                  if (~(-((p) this).field_b + ((p) this).field_k) >= ~(long)((p) this).field_f) {
                    break L14;
                  } else {
                    ((p) this).field_f = (int)(((p) this).field_k - ((p) this).field_b);
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
          ((p) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var5_ref;
            stackOut_50_1 = new StringBuilder().append("p.E(").append(param0).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        ((p) this).field_j = 0;
        if (!(~((p) this).field_g == ~((p) this).field_k)) {
            ((p) this).field_h.a(((p) this).field_k, false);
            ((p) this).field_g = ((p) this).field_k;
        }
        ((p) this).field_d = ((p) this).field_k;
        while (~((p) this).field_l.length < ~((p) this).field_j) {
            var2 = ((p) this).field_l.length - ((p) this).field_j;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((p) this).field_h.a(var2, ((p) this).field_j, ((p) this).field_l, (byte) 115);
            if (var3 == -1) {
                break;
            }
            ((p) this).field_j = ((p) this).field_j + var3;
            ((p) this).field_g = ((p) this).field_g + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -80) {
            field_m = 19;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
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
              var2 = la.a(il.a(-23718, param0), true);
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            stackOut_2_0 = (String) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("p.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 43 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (((p) this).field_b != -1L) {
            L1: {
              if (~((p) this).field_b == ~((p) this).field_g) {
                break L1;
              } else {
                ((p) this).field_h.a(((p) this).field_b, false);
                ((p) this).field_g = ((p) this).field_b;
                break L1;
              }
            }
            L2: {
              ((p) this).field_h.a(-128, 0, ((p) this).field_e, ((p) this).field_f);
              ((p) this).field_g = ((p) this).field_g + (long)((p) this).field_f;
              if (~((p) this).field_g < ~((p) this).field_a) {
                ((p) this).field_a = ((p) this).field_g;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (~((p) this).field_b > ~((p) this).field_d) {
                  break L4;
                } else {
                  if (~((p) this).field_b <= ~(((p) this).field_d - -(long)((p) this).field_j)) {
                    break L4;
                  } else {
                    var2 = ((p) this).field_b;
                    break L3;
                  }
                }
              }
              if (((p) this).field_b > ((p) this).field_d) {
                break L3;
              } else {
                if (~(((p) this).field_b - -(long)((p) this).field_f) >= ~((p) this).field_d) {
                  break L3;
                } else {
                  var2 = ((p) this).field_d;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((long)((p) this).field_f + ((p) this).field_b) >= ~((p) this).field_d) {
                  break L6;
                } else {
                  if (((p) this).field_d - -(long)((p) this).field_j >= ((p) this).field_b + (long)((p) this).field_f) {
                    var4 = (long)((p) this).field_f + ((p) this).field_b;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~(((p) this).field_d - -(long)((p) this).field_j) >= ~((p) this).field_b) {
                break L5;
              } else {
                if (((p) this).field_b + (long)((p) this).field_f >= (long)((p) this).field_j + ((p) this).field_d) {
                  var4 = ((p) this).field_d + (long)((p) this).field_j;
                  break L5;
                } else {
                  L7: {
                    if (-1L >= var2) {
                      break L7;
                    } else {
                      if (~var2 <= ~var4) {
                        break L7;
                      } else {
                        var6 = (int)(var4 - var2);
                        rd.a(((p) this).field_e, (int)(var2 - ((p) this).field_b), ((p) this).field_l, (int)(var2 - ((p) this).field_d), var6);
                        break L7;
                      }
                    }
                  }
                  ((p) this).field_f = 0;
                  ((p) this).field_b = -1L;
                  break L0;
                }
              }
            }
            L8: {
              if (-1L >= var2) {
                break L8;
              } else {
                if (~var2 <= ~var4) {
                  break L8;
                } else {
                  var6 = (int)(var4 - var2);
                  rd.a(((p) this).field_e, (int)(var2 - ((p) this).field_b), ((p) this).field_l, (int)(var2 - ((p) this).field_d), var6);
                  break L8;
                }
              }
            }
            ((p) this).field_f = 0;
            ((p) this).field_b = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != 66) {
            return;
        }
        try {
            ((p) this).a(param0, param0.length, 0, (byte) 120);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "p.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
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
        var14 = TetraLink.field_J;
        try {
          L0: {
            if (param1 + param2 <= param0.length) {
              L1: {
                if (-1L == ((p) this).field_b) {
                  break L1;
                } else {
                  if (~((p) this).field_b < ~((p) this).field_k) {
                    break L1;
                  } else {
                    if (~(((p) this).field_b - -(long)((p) this).field_f) <= ~((long)param1 + ((p) this).field_k)) {
                      rd.a(((p) this).field_e, (int)(((p) this).field_k + -((p) this).field_b), param0, param2, param1);
                      ((p) this).field_k = ((p) this).field_k + (long)param1;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((p) this).field_k;
                var7 = param2;
                if (param3 > 31) {
                  break L2;
                } else {
                  field_m = -43;
                  break L2;
                }
              }
              L3: {
                var8 = param1;
                if (~((p) this).field_d < ~((p) this).field_k) {
                  break L3;
                } else {
                  if (((p) this).field_k >= (long)((p) this).field_j + ((p) this).field_d) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)(-((p) this).field_k + (((p) this).field_d + (long)((p) this).field_j));
                      if (param1 >= var9_int) {
                        break L4;
                      } else {
                        var9_int = param1;
                        break L4;
                      }
                    }
                    rd.a(((p) this).field_l, (int)(((p) this).field_k - ((p) this).field_d), param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    param1 = param1 - var9_int;
                    ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (param1 <= ((p) this).field_l.length) {
                  if (param1 <= 0) {
                    break L5;
                  } else {
                    L6: {
                      this.a(true);
                      var9_int = param1;
                      if (var9_int > ((p) this).field_j) {
                        var9_int = ((p) this).field_j;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    rd.a(((p) this).field_l, 0, param0, param2, var9_int);
                    ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                    param1 = param1 - var9_int;
                    param2 = param2 + var9_int;
                    break L5;
                  }
                } else {
                  ((p) this).field_h.a(((p) this).field_k, false);
                  ((p) this).field_g = ((p) this).field_k;
                  L7: while (true) {
                    if (param1 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((p) this).field_h.a(param1, param2, param0, (byte) -121);
                      if (-1 == var9_int) {
                        break L5;
                      } else {
                        param1 = param1 - var9_int;
                        ((p) this).field_k = ((p) this).field_k + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((p) this).field_g = ((p) this).field_g + (long)var9_int;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                if (((p) this).field_b == -1L) {
                  break L8;
                } else {
                  L9: {
                    if (~((p) this).field_k <= ~((p) this).field_b) {
                      break L9;
                    } else {
                      if (param1 <= 0) {
                        break L9;
                      } else {
                        L10: {
                          var9_int = param2 - -(int)(((p) this).field_b - ((p) this).field_k);
                          if (var9_int <= param1 + param2) {
                            break L10;
                          } else {
                            var9_int = param1 + param2;
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (var9_int <= param2) {
                            break L9;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param0[incrementValue$1] = (byte) 0;
                            param1--;
                            ((p) this).field_k = ((p) this).field_k + 1L;
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
                      if (var5_long > ((p) this).field_b) {
                        break L13;
                      } else {
                        if (var5_long - -(long)var8 > ((p) this).field_b) {
                          var9 = ((p) this).field_b;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (var5_long < ((p) this).field_b) {
                      break L12;
                    } else {
                      if ((long)((p) this).field_f + ((p) this).field_b > var5_long) {
                        var9 = var5_long;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if (~var5_long <= ~((long)((p) this).field_f + ((p) this).field_b)) {
                        break L15;
                      } else {
                        if (~((long)var8 + var5_long) <= ~(((p) this).field_b + (long)((p) this).field_f)) {
                          var11 = ((p) this).field_b - -(long)((p) this).field_f;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (~((p) this).field_b <= ~((long)var8 + var5_long)) {
                      break L14;
                    } else {
                      if (((p) this).field_b - -(long)((p) this).field_f >= var5_long + (long)var8) {
                        var11 = var5_long - -(long)var8;
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
                      rd.a(((p) this).field_e, (int)(-((p) this).field_b + var9), param0, var7 + (int)(-var5_long + var9), var13);
                      if (~var11 >= ~((p) this).field_k) {
                        break L8;
                      } else {
                        param1 = (int)((long)param1 - (var11 - ((p) this).field_k));
                        ((p) this).field_k = var11;
                        break L8;
                      }
                    }
                  }
                }
              }
              if (param1 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param2 - -param1 + -param0.length);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((p) this).field_g = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("p.C(");
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
          throw oi.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        } else {
          L0: {
            ((p) this).field_k = param0;
            if (param1 == 0) {
              break L0;
            } else {
              ((p) this).field_b = -9L;
              break L0;
            }
          }
          return;
        }
    }

    p(sa param0, int param1, int param2) throws IOException {
        ((p) this).field_b = -1L;
        ((p) this).field_f = 0;
        ((p) this).field_d = -1L;
        try {
            ((p) this).field_h = param0;
            long dupTemp$0 = param0.a(-1);
            ((p) this).field_a = dupTemp$0;
            ((p) this).field_i = dupTemp$0;
            ((p) this).field_l = new byte[param1];
            ((p) this).field_e = new byte[param2];
            ((p) this).field_k = 0L;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "p.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The invitation has been withdrawn.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class gj {
    private byte[] field_e;
    private long field_k;
    private byte[] field_i;
    private long field_d;
    private long field_b;
    private int field_h;
    private long field_c;
    private sr field_j;
    private long field_g;
    private int field_f;
    private long field_a;

    final static void c(int param0) {
        bw.a(false, ra.c(param0 ^ 2));
        if (param0 != 0) {
            Object var2 = null;
            gj.a(42L, (java.applet.Applet) null, false, (String) null, (String) null);
        }
    }

    final static void a(long param0, java.applet.Applet param1, boolean param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              try {
                L0: {
                  var8 = param1.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  if (param2) {
                    L1: {
                      var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param0 < 0L) {
                        var7 = var9 + "; Discard;";
                        break L1;
                      } else {
                        int discarded$1 = 1;
                        var7 = var9 + "; Expires=" + fi.a(param0 * 1000L + wq.a(-123)) + "; Max-Age=" + param0;
                        break L1;
                      }
                    }
                    tw.a("document.cookie=\"" + var7 + "\"", -15428, param1);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var6 = decompiledCaughtException;
                  break L2;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var6_ref;
                stackOut_9_1 = new StringBuilder().append("gj.H(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
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
              L4: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              L5: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 + param1 <= param2.length) {
              L1: {
                if (((gj) this).field_g == -1L) {
                  break L1;
                } else {
                  if (((gj) this).field_d < ((gj) this).field_g) {
                    break L1;
                  } else {
                    if (~(((gj) this).field_d + (long)param0) < ~((long)((gj) this).field_h + ((gj) this).field_g)) {
                      break L1;
                    } else {
                      la.a(((gj) this).field_i, (int)(-((gj) this).field_g + ((gj) this).field_d), param2, param1, param0);
                      ((gj) this).field_d = ((gj) this).field_d + (long)param0;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((gj) this).field_d;
                var7 = param1;
                var8 = param0;
                if (~((gj) this).field_d > ~((gj) this).field_b) {
                  break L2;
                } else {
                  if (((gj) this).field_d < ((gj) this).field_b + (long)((gj) this).field_f) {
                    L3: {
                      var9_int = (int)((long)((gj) this).field_f + (-((gj) this).field_d - -((gj) this).field_b));
                      if (param0 >= var9_int) {
                        break L3;
                      } else {
                        var9_int = param0;
                        break L3;
                      }
                    }
                    la.a(((gj) this).field_e, (int)(((gj) this).field_d - ((gj) this).field_b), param2, param1, var9_int);
                    param1 = param1 + var9_int;
                    ((gj) this).field_d = ((gj) this).field_d + (long)var9_int;
                    param0 = param0 - var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (param0 <= ((gj) this).field_e.length) {
                  if (param0 > 0) {
                    L5: {
                      int discarded$2 = -1;
                      this.a();
                      var9_int = param0;
                      if (((gj) this).field_f < var9_int) {
                        var9_int = ((gj) this).field_f;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    la.a(((gj) this).field_e, 0, param2, param1, var9_int);
                    ((gj) this).field_d = ((gj) this).field_d + (long)var9_int;
                    param1 = param1 + var9_int;
                    param0 = param0 - var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  ((gj) this).field_j.a((byte) -100, ((gj) this).field_d);
                  ((gj) this).field_k = ((gj) this).field_d;
                  L6: while (true) {
                    if (param0 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((gj) this).field_j.b(param2, 2, param0, param1);
                      if (var9_int == -1) {
                        break L4;
                      } else {
                        ((gj) this).field_d = ((gj) this).field_d + (long)var9_int;
                        ((gj) this).field_k = ((gj) this).field_k + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        continue L6;
                      }
                    }
                  }
                }
              }
              if (param3 < -51) {
                L7: {
                  if (((gj) this).field_g != -1L) {
                    L8: {
                      if (~((gj) this).field_d <= ~((gj) this).field_g) {
                        break L8;
                      } else {
                        if (param0 > 0) {
                          L9: {
                            var9_int = (int)(-((gj) this).field_d + ((gj) this).field_g) + param1;
                            if (param0 + param1 < var9_int) {
                              var9_int = param0 + param1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (param1 >= var9_int) {
                              break L8;
                            } else {
                              param0--;
                              int incrementValue$3 = param1;
                              param1++;
                              param2[incrementValue$3] = (byte) 0;
                              ((gj) this).field_d = ((gj) this).field_d + 1L;
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
                        if (var5_long > ((gj) this).field_g) {
                          break L12;
                        } else {
                          if (~((long)var8 + var5_long) < ~((gj) this).field_g) {
                            var9 = ((gj) this).field_g;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (((gj) this).field_g > var5_long) {
                        break L11;
                      } else {
                        if (var5_long < (long)((gj) this).field_h + ((gj) this).field_g) {
                          var9 = var5_long;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (var5_long >= (long)((gj) this).field_h + ((gj) this).field_g) {
                          break L14;
                        } else {
                          if ((long)var8 + var5_long < ((gj) this).field_g + (long)((gj) this).field_h) {
                            break L14;
                          } else {
                            var11 = (long)((gj) this).field_h + ((gj) this).field_g;
                            break L13;
                          }
                        }
                      }
                      if (~((gj) this).field_g <= ~(var5_long + (long)var8)) {
                        break L13;
                      } else {
                        if (((gj) this).field_g + (long)((gj) this).field_h < var5_long + (long)var8) {
                          break L13;
                        } else {
                          var11 = (long)var8 + var5_long;
                          break L13;
                        }
                      }
                    }
                    if (-1L >= var9) {
                      break L7;
                    } else {
                      if (var9 >= var11) {
                        break L7;
                      } else {
                        var13 = (int)(var11 - var9);
                        la.a(((gj) this).field_i, (int)(-((gj) this).field_g + var9), param2, (int)(var9 - var5_long) + var7, var13);
                        if (~var11 < ~((gj) this).field_d) {
                          param0 = (int)((long)param0 - (var11 - ((gj) this).field_d));
                          ((gj) this).field_d = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                if (param0 <= 0) {
                  break L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1 + (param0 + -param2.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((gj) this).field_k = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param3 + ')');
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (((gj) this).field_g == -1L) {
            break L0;
          } else {
            L1: {
              if (((gj) this).field_k != ((gj) this).field_g) {
                ((gj) this).field_j.a((byte) -115, ((gj) this).field_g);
                ((gj) this).field_k = ((gj) this).field_g;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((gj) this).field_j.a(((gj) this).field_i, 0, ((gj) this).field_h, 1);
              ((gj) this).field_k = ((gj) this).field_k + (long)((gj) this).field_h;
              if (((gj) this).field_k <= ((gj) this).field_c) {
                break L2;
              } else {
                ((gj) this).field_c = ((gj) this).field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                var4 = -1L;
                if (((gj) this).field_g < ((gj) this).field_b) {
                  break L4;
                } else {
                  if (~(((gj) this).field_b + (long)((gj) this).field_f) >= ~((gj) this).field_g) {
                    break L4;
                  } else {
                    var2_long = ((gj) this).field_g;
                    break L3;
                  }
                }
              }
              if (~((gj) this).field_b > ~((gj) this).field_g) {
                break L3;
              } else {
                if (((gj) this).field_g + (long)((gj) this).field_h > ((gj) this).field_b) {
                  var2_long = ((gj) this).field_b;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((gj) this).field_b >= ((gj) this).field_g + (long)((gj) this).field_h) {
                  break L6;
                } else {
                  if ((long)((gj) this).field_f + ((gj) this).field_b < ((gj) this).field_g + (long)((gj) this).field_h) {
                    break L6;
                  } else {
                    var4 = ((gj) this).field_g + (long)((gj) this).field_h;
                    break L5;
                  }
                }
              }
              if ((long)((gj) this).field_f + ((gj) this).field_b <= ((gj) this).field_g) {
                break L5;
              } else {
                if (~(((gj) this).field_b - -(long)((gj) this).field_f) >= ~((long)((gj) this).field_h + ((gj) this).field_g)) {
                  var4 = (long)((gj) this).field_f + ((gj) this).field_b;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2_long <= -1L) {
                break L7;
              } else {
                if (~var2_long <= ~var4) {
                  break L7;
                } else {
                  var6 = (int)(-var2_long + var4);
                  la.a(((gj) this).field_i, (int)(-((gj) this).field_g + var2_long), ((gj) this).field_e, (int)(-((gj) this).field_b + var2_long), var6);
                  break L7;
                }
              }
            }
            ((gj) this).field_g = -1L;
            ((gj) this).field_h = 0;
            break L0;
          }
        }
        var2 = -14 / ((67 - param0) / 34);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~((long)param1 + ((gj) this).field_d) < ~((gj) this).field_a) {
                ((gj) this).field_a = (long)param1 + ((gj) this).field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((gj) this).field_g == -1L) {
                break L2;
              } else {
                L3: {
                  if (((gj) this).field_g > ((gj) this).field_d) {
                    break L3;
                  } else {
                    if (~((long)((gj) this).field_h + ((gj) this).field_g) > ~((gj) this).field_d) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b((byte) 115);
                break L2;
              }
            }
            L4: {
              if (((gj) this).field_g == -1L) {
                break L4;
              } else {
                if (((gj) this).field_g + (long)((gj) this).field_i.length >= ((gj) this).field_d + (long)param1) {
                  break L4;
                } else {
                  var5_int = (int)(((gj) this).field_g + -((gj) this).field_d + (long)((gj) this).field_i.length);
                  la.a(param0, param3, ((gj) this).field_i, (int)(-((gj) this).field_g + ((gj) this).field_d), var5_int);
                  ((gj) this).field_d = ((gj) this).field_d + (long)var5_int;
                  param1 = param1 - var5_int;
                  param3 = param3 + var5_int;
                  ((gj) this).field_h = ((gj) this).field_i.length;
                  this.b((byte) 109);
                  break L4;
                }
              }
            }
            if (((gj) this).field_i.length >= param1) {
              if (0 >= param1) {
                var5_int = -89 % ((20 - param2) / 41);
                break L0;
              } else {
                L5: {
                  if (((gj) this).field_g == -1L) {
                    ((gj) this).field_g = ((gj) this).field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  la.a(param0, param3, ((gj) this).field_i, (int)(-((gj) this).field_g + ((gj) this).field_d), param1);
                  ((gj) this).field_d = ((gj) this).field_d + (long)param1;
                  if (((gj) this).field_d + -((gj) this).field_g > (long)((gj) this).field_h) {
                    ((gj) this).field_h = (int)(((gj) this).field_d + -((gj) this).field_g);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (~((gj) this).field_d == ~((gj) this).field_k) {
                  break L7;
                } else {
                  ((gj) this).field_j.a((byte) -99, ((gj) this).field_d);
                  ((gj) this).field_k = ((gj) this).field_d;
                  break L7;
                }
              }
              L8: {
                ((gj) this).field_j.a(param0, param3, param1, 1);
                ((gj) this).field_k = ((gj) this).field_k + (long)param1;
                if (((gj) this).field_k > ((gj) this).field_c) {
                  ((gj) this).field_c = ((gj) this).field_k;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  if (((gj) this).field_b > ((gj) this).field_d) {
                    break L10;
                  } else {
                    if (~((long)((gj) this).field_f + ((gj) this).field_b) >= ~((gj) this).field_d) {
                      break L10;
                    } else {
                      var5_long = ((gj) this).field_d;
                      break L9;
                    }
                  }
                }
                if (~((gj) this).field_d < ~((gj) this).field_b) {
                  break L9;
                } else {
                  if ((long)param1 + ((gj) this).field_d <= ((gj) this).field_b) {
                    break L9;
                  } else {
                    var5_long = ((gj) this).field_b;
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  var7 = -1L;
                  if (((gj) this).field_b >= (long)param1 + ((gj) this).field_d) {
                    break L12;
                  } else {
                    if (~(((gj) this).field_b + (long)((gj) this).field_f) > ~(((gj) this).field_d - -(long)param1)) {
                      break L12;
                    } else {
                      var7 = (long)param1 + ((gj) this).field_d;
                      break L11;
                    }
                  }
                }
                if (~((gj) this).field_d <= ~((long)((gj) this).field_f + ((gj) this).field_b)) {
                  break L11;
                } else {
                  if (~((long)((gj) this).field_f + ((gj) this).field_b) < ~((long)param1 + ((gj) this).field_d)) {
                    break L11;
                  } else {
                    var7 = (long)((gj) this).field_f + ((gj) this).field_b;
                    break L11;
                  }
                }
              }
              L13: {
                if (var5_long <= -1L) {
                  break L13;
                } else {
                  if (var7 > var5_long) {
                    var9 = (int)(var7 - var5_long);
                    la.a(param0, (int)(-((gj) this).field_d + (var5_long + (long)param3)), ((gj) this).field_e, (int)(var5_long + -((gj) this).field_b), var9);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              ((gj) this).field_d = ((gj) this).field_d + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((gj) this).field_k = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var5_ref;
            stackOut_48_1 = new StringBuilder().append("gj.D(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L14;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L14;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) throws IOException {
        this.b((byte) -114);
        if (param0 != -1) {
            gj.c(-23);
        }
        ((gj) this).field_j.b(0);
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            int var3_int = 47 / ((84 - param1) / 39);
            ((gj) this).a(param0.length, 0, param0, -127);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "gj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == -7564) {
              break L0;
            } else {
              ((gj) this).field_g = -40L;
              break L0;
            }
          }
          ((gj) this).field_d = param1;
          return;
        }
    }

    final long a(byte param0) {
        if (param0 != -60) {
            return 111L;
        }
        return ((gj) this).field_a;
    }

    private final void a() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          ((gj) this).field_f = 0;
          if (((gj) this).field_k == ((gj) this).field_d) {
            break L0;
          } else {
            ((gj) this).field_j.a((byte) 54, ((gj) this).field_d);
            ((gj) this).field_k = ((gj) this).field_d;
            break L0;
          }
        }
        ((gj) this).field_b = ((gj) this).field_d;
        L1: while (true) {
          L2: {
            if (((gj) this).field_f >= ((gj) this).field_e.length) {
              break L2;
            } else {
              L3: {
                var2 = ((gj) this).field_e.length - ((gj) this).field_f;
                if (var2 > 200000000) {
                  var2 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = ((gj) this).field_j.b(((gj) this).field_e, 2, var2, ((gj) this).field_f);
              if (var3 == -1) {
                break L2;
              } else {
                ((gj) this).field_k = ((gj) this).field_k + (long)var3;
                ((gj) this).field_f = ((gj) this).field_f + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    gj(sr param0, int param1, int param2) throws IOException {
        ((gj) this).field_h = 0;
        ((gj) this).field_b = -1L;
        ((gj) this).field_g = -1L;
        try {
            ((gj) this).field_j = param0;
            long dupTemp$0 = param0.a(100);
            ((gj) this).field_c = dupTemp$0;
            ((gj) this).field_a = dupTemp$0;
            ((gj) this).field_i = new byte[param2];
            ((gj) this).field_e = new byte[param1];
            ((gj) this).field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -84) {
            int discarded$0 = gj.a((byte) 37, 116);
        }
        int discarded$1 = -96;
        return fi.a(param1, iv.field_b);
    }

    static {
    }
}

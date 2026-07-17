/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jf {
    private byte[] field_m;
    private long field_k;
    private long field_i;
    private ok field_d;
    static sb field_h;
    private byte[] field_j;
    private long field_c;
    private long field_b;
    private long field_l;
    private int field_f;
    private int field_e;
    private long field_a;
    static String field_g;

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((jf) this).b(param0, param1, param1.length, 11842);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "jf.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = jg.a(param0, true);
        int var4 = tk.a(-822, param0);
        if (param1) {
            field_g = null;
        }
        int var5 = jg.a(param2, true);
        int var6 = tk.a(-822, param2);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final void d(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Bounce.field_N;
        ((jf) this).field_e = 0;
        if (!(~((jf) this).field_b == ~((jf) this).field_l)) {
            ((jf) this).field_d.a(((jf) this).field_b, 20663);
            ((jf) this).field_l = ((jf) this).field_b;
        }
        ((jf) this).field_k = ((jf) this).field_b;
        while (((jf) this).field_j.length > ((jf) this).field_e) {
            var2 = -((jf) this).field_e + ((jf) this).field_j.length;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((jf) this).field_d.a(((jf) this).field_j, var2, ((jf) this).field_e, -1);
            if (var3 == -1) {
                break;
            }
            ((jf) this).field_e = ((jf) this).field_e + var3;
            ((jf) this).field_l = ((jf) this).field_l + (long)var3;
        }
        if (param0 != 16324) {
            ((jf) this).field_k = 86L;
        }
    }

    public static void e() {
        field_g = null;
        field_h = null;
    }

    final static int b() {
        return 1;
    }

    final long c(boolean param0) {
        if (!param0) {
            Object var3 = null;
            jf.a((byte) 94, (String[]) null, -48, (String) null);
        }
        return ((jf) this).field_c;
    }

    final static String a(String param0, String[] param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = Bounce.field_N;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 > var6_int) {
                L2: {
                  var6 = new StringBuilder(var4);
                  if (param2 == -126) {
                    break L2;
                  } else {
                    jf.c(94);
                    break L2;
                  }
                }
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (var8 < 0) {
                    StringBuilder discarded$5 = var6.append(param0.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    var5 = var8 + 2;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!kf.a(-49, param0.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      int discarded$6 = 10;
                      if (!qi.a((CharSequence) (Object) var9)) {
                        continue L3;
                      } else {
                        if (var5 >= var3_int) {
                          continue L3;
                        } else {
                          if (62 == param0.charAt(var5)) {
                            var5++;
                            var10 = gf.a(10, (CharSequence) (Object) var9);
                            StringBuilder discarded$7 = var6.append(param0.substring(var7, var8));
                            StringBuilder discarded$8 = var6.append(param1[var10]);
                            var7 = var5;
                            continue L3;
                          } else {
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = var6_int - -2;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!kf.a(-49, param0.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  int discarded$9 = 10;
                  if (qi.a((CharSequence) (Object) var7_ref_String)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (62 == param0.charAt(var5)) {
                        var5++;
                        var8 = gf.a(10, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (param1[var8].length() + var6_int + -var5);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("jf.O(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_27_0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if ((long)param2 + ((jf) this).field_b > ((jf) this).field_c) {
                ((jf) this).field_c = ((jf) this).field_b + (long)param2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((jf) this).field_a == -1L) {
                break L2;
              } else {
                L3: {
                  if (~((jf) this).field_b > ~((jf) this).field_a) {
                    break L3;
                  } else {
                    if (~(((jf) this).field_a + (long)((jf) this).field_f) > ~((jf) this).field_b) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(-1);
                break L2;
              }
            }
            L4: {
              if (((jf) this).field_a == -1L) {
                break L4;
              } else {
                if ((long)((jf) this).field_m.length + ((jf) this).field_a < (long)param2 + ((jf) this).field_b) {
                  var5_int = (int)((long)((jf) this).field_m.length - -((jf) this).field_a - ((jf) this).field_b);
                  cb.a(param1, param3, ((jf) this).field_m, (int)(-((jf) this).field_a + ((jf) this).field_b), var5_int);
                  ((jf) this).field_b = ((jf) this).field_b + (long)var5_int;
                  param3 = param3 + var5_int;
                  param2 = param2 - var5_int;
                  ((jf) this).field_f = ((jf) this).field_m.length;
                  this.a(~param0);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param2 > ((jf) this).field_m.length) {
              L5: {
                if (((jf) this).field_l == ((jf) this).field_b) {
                  break L5;
                } else {
                  ((jf) this).field_d.a(((jf) this).field_b, param0 ^ 20663);
                  ((jf) this).field_l = ((jf) this).field_b;
                  break L5;
                }
              }
              L6: {
                ((jf) this).field_d.a(1, param3, param2, param1);
                ((jf) this).field_l = ((jf) this).field_l + (long)param2;
                if (((jf) this).field_i >= ((jf) this).field_l) {
                  break L6;
                } else {
                  ((jf) this).field_i = ((jf) this).field_l;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (~((jf) this).field_b > ~((jf) this).field_k) {
                    break L8;
                  } else {
                    if (((jf) this).field_b < ((jf) this).field_k - -(long)((jf) this).field_e) {
                      var5_long = ((jf) this).field_b;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (~((jf) this).field_b < ~((jf) this).field_k) {
                  break L7;
                } else {
                  if (((jf) this).field_b + (long)param2 <= ((jf) this).field_k) {
                    break L7;
                  } else {
                    var5_long = ((jf) this).field_k;
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (((jf) this).field_b - -(long)param2 <= ((jf) this).field_k) {
                    break L10;
                  } else {
                    if (((jf) this).field_b - -(long)param2 <= ((jf) this).field_k + (long)((jf) this).field_e) {
                      var7 = ((jf) this).field_b + (long)param2;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((jf) this).field_k - -(long)((jf) this).field_e <= ((jf) this).field_b) {
                  break L9;
                } else {
                  if ((long)param2 + ((jf) this).field_b >= ((jf) this).field_k + (long)((jf) this).field_e) {
                    var7 = (long)((jf) this).field_e + ((jf) this).field_k;
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
                  if (~var7 < ~var5_long) {
                    var9 = (int)(-var5_long + var7);
                    cb.a(param1, (int)(var5_long + ((long)param3 + -((jf) this).field_b)), ((jf) this).field_j, (int)(var5_long - ((jf) this).field_k), var9);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              ((jf) this).field_b = ((jf) this).field_b + (long)param2;
              return;
            } else {
              if (param2 <= 0) {
                L12: {
                  if (param0 == 0) {
                    break L12;
                  } else {
                    int discarded$2 = 0;
                    int discarded$3 = jf.b();
                    break L12;
                  }
                }
                break L0;
              } else {
                L13: {
                  if (-1L != ((jf) this).field_a) {
                    break L13;
                  } else {
                    ((jf) this).field_a = ((jf) this).field_b;
                    break L13;
                  }
                }
                L14: {
                  cb.a(param1, param3, ((jf) this).field_m, (int)(-((jf) this).field_a + ((jf) this).field_b), param2);
                  ((jf) this).field_b = ((jf) this).field_b + (long)param2;
                  if (((jf) this).field_b + -((jf) this).field_a <= (long)((jf) this).field_f) {
                    break L14;
                  } else {
                    ((jf) this).field_f = (int)(-((jf) this).field_a + ((jf) this).field_b);
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
          ((jf) this).field_l = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("jf.D(").append(param0).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(byte param0, String[] param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param0 == -52) {
                break L1;
              } else {
                int[] discarded$3 = jf.a(30, true, 104);
                break L1;
              }
            }
            L2: {
              fh.field_B = he.field_p;
              if (param2 == 255) {
                L3: {
                  stackOut_9_0 = 5579;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (13 <= cg.field_a) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L3;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L3;
                  }
                }
                ci.field_L = r.a(stackIn_12_0, stackIn_12_1 != 0);
                break L2;
              } else {
                L4: {
                  if (param2 < 100) {
                    break L4;
                  } else {
                    if (param2 <= 105) {
                      ci.field_L = qj.a(false, param1);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                ci.field_L = wb.a(param2, 1, param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("jf.L(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var14 = Bounce.field_N;
        try {
          L0: {
            if (param2 + param0 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param2));
            } else {
              L1: {
                if (((jf) this).field_a == -1L) {
                  break L1;
                } else {
                  if (((jf) this).field_b < ((jf) this).field_a) {
                    break L1;
                  } else {
                    if (((jf) this).field_a - -(long)((jf) this).field_f < ((jf) this).field_b - -(long)param2) {
                      break L1;
                    } else {
                      cb.a(((jf) this).field_m, (int)(((jf) this).field_b - ((jf) this).field_a), param1, param0, param2);
                      ((jf) this).field_b = ((jf) this).field_b + (long)param2;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((jf) this).field_b;
                var7 = param0;
                var8 = param2;
                if (~((jf) this).field_b > ~((jf) this).field_k) {
                  break L2;
                } else {
                  if (((jf) this).field_k - -(long)((jf) this).field_e <= ((jf) this).field_b) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)(-((jf) this).field_b - -((jf) this).field_k + (long)((jf) this).field_e);
                      if (var9_int <= param2) {
                        break L3;
                      } else {
                        var9_int = param2;
                        break L3;
                      }
                    }
                    cb.a(((jf) this).field_j, (int)(((jf) this).field_b - ((jf) this).field_k), param1, param0, var9_int);
                    param2 = param2 - var9_int;
                    ((jf) this).field_b = ((jf) this).field_b + (long)var9_int;
                    param0 = param0 + var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (param2 <= ((jf) this).field_j.length) {
                  if (param2 > 0) {
                    L5: {
                      this.d(param3 + 4482);
                      var9_int = param2;
                      if (((jf) this).field_e >= var9_int) {
                        break L5;
                      } else {
                        var9_int = ((jf) this).field_e;
                        break L5;
                      }
                    }
                    cb.a(((jf) this).field_j, 0, param1, param0, var9_int);
                    ((jf) this).field_b = ((jf) this).field_b + (long)var9_int;
                    param2 = param2 - var9_int;
                    param0 = param0 + var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  ((jf) this).field_d.a(((jf) this).field_b, 20663);
                  ((jf) this).field_l = ((jf) this).field_b;
                  L6: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((jf) this).field_d.a(param1, param2, param0, -1);
                      if (var9_int == -1) {
                        break L4;
                      } else {
                        ((jf) this).field_b = ((jf) this).field_b + (long)var9_int;
                        ((jf) this).field_l = ((jf) this).field_l + (long)var9_int;
                        param2 = param2 - var9_int;
                        param0 = param0 + var9_int;
                        continue L6;
                      }
                    }
                  }
                }
              }
              L7: {
                if (((jf) this).field_a != -1L) {
                  L8: {
                    if (~((jf) this).field_b <= ~((jf) this).field_a) {
                      break L8;
                    } else {
                      if (param2 > 0) {
                        L9: {
                          var9_int = param0 - -(int)(-((jf) this).field_b + ((jf) this).field_a);
                          if (var9_int <= param2 + param0) {
                            break L9;
                          } else {
                            var9_int = param2 + param0;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param0 >= var9_int) {
                            break L8;
                          } else {
                            param2--;
                            int incrementValue$1 = param0;
                            param0++;
                            param1[incrementValue$1] = (byte) 0;
                            ((jf) this).field_b = ((jf) this).field_b + 1L;
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
                      if (~var5_long < ~((jf) this).field_a) {
                        break L12;
                      } else {
                        if (~((long)var8 + var5_long) >= ~((jf) this).field_a) {
                          break L12;
                        } else {
                          var9 = ((jf) this).field_a;
                          break L11;
                        }
                      }
                    }
                    if (~((jf) this).field_a < ~var5_long) {
                      break L11;
                    } else {
                      if (var5_long < (long)((jf) this).field_f + ((jf) this).field_a) {
                        var9 = var5_long;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (~(((jf) this).field_a - -(long)((jf) this).field_f) >= ~var5_long) {
                        break L14;
                      } else {
                        if (((jf) this).field_a - -(long)((jf) this).field_f <= (long)var8 + var5_long) {
                          var11 = (long)((jf) this).field_f + ((jf) this).field_a;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (~(var5_long - -(long)var8) >= ~((jf) this).field_a) {
                      break L13;
                    } else {
                      if (~((long)var8 + var5_long) >= ~(((jf) this).field_a - -(long)((jf) this).field_f)) {
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
                    if (~var9 <= ~var11) {
                      break L7;
                    } else {
                      var13 = (int)(var11 + -var9);
                      cb.a(((jf) this).field_m, (int)(-((jf) this).field_a + var9), param1, (int)(-var5_long + var9) + var7, var13);
                      if (((jf) this).field_b >= var11) {
                        break L7;
                      } else {
                        param2 = (int)((long)param2 - (-((jf) this).field_b + var11));
                        ((jf) this).field_b = var11;
                        break L7;
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              if (param3 == 11842) {
                if (0 >= param2) {
                  break L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((jf) this).field_l = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5_ref;
            stackOut_59_1 = new StringBuilder().append("jf.I(").append(param0).append(44);
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L15;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L15;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static rg a() {
        if (!(fh.field_B != wj.field_a)) {
            throw new IllegalStateException();
        }
        if (fh.field_B != he.field_p) {
            return null;
        }
        fh.field_B = wj.field_a;
        return ci.field_L;
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((jf) this).field_b = param1;
        if (param0 != 57) {
            int discarded$0 = 1;
            rg discarded$1 = jf.a();
        }
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Bounce.field_N;
          if (((jf) this).field_a == (long)param0) {
            break L0;
          } else {
            L1: {
              if (((jf) this).field_l == ((jf) this).field_a) {
                break L1;
              } else {
                ((jf) this).field_d.a(((jf) this).field_a, 20663);
                ((jf) this).field_l = ((jf) this).field_a;
                break L1;
              }
            }
            L2: {
              ((jf) this).field_d.a(1, 0, ((jf) this).field_f, ((jf) this).field_m);
              ((jf) this).field_l = ((jf) this).field_l + (long)((jf) this).field_f;
              if (((jf) this).field_l <= ((jf) this).field_i) {
                break L2;
              } else {
                ((jf) this).field_i = ((jf) this).field_l;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (((jf) this).field_a < ((jf) this).field_k) {
                  break L4;
                } else {
                  if (~((jf) this).field_a > ~((long)((jf) this).field_e + ((jf) this).field_k)) {
                    var2 = ((jf) this).field_a;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((jf) this).field_k > ~((jf) this).field_a) {
                break L3;
              } else {
                if (~((jf) this).field_k > ~((long)((jf) this).field_f + ((jf) this).field_a)) {
                  var2 = ((jf) this).field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((jf) this).field_k >= (long)((jf) this).field_f + ((jf) this).field_a) {
                  break L6;
                } else {
                  if (((jf) this).field_k + (long)((jf) this).field_e >= (long)((jf) this).field_f + ((jf) this).field_a) {
                    var4 = ((jf) this).field_a + (long)((jf) this).field_f;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((long)((jf) this).field_e + ((jf) this).field_k) >= ~((jf) this).field_a) {
                break L5;
              } else {
                if (((jf) this).field_a - -(long)((jf) this).field_f >= ((jf) this).field_k + (long)((jf) this).field_e) {
                  var4 = (long)((jf) this).field_e + ((jf) this).field_k;
                  break L5;
                } else {
                  L7: {
                    if (var2 <= -1L) {
                      break L7;
                    } else {
                      if (var4 <= var2) {
                        break L7;
                      } else {
                        var6 = (int)(-var2 + var4);
                        cb.a(((jf) this).field_m, (int)(-((jf) this).field_a + var2), ((jf) this).field_j, (int)(-((jf) this).field_k + var2), var6);
                        break L7;
                      }
                    }
                  }
                  ((jf) this).field_f = 0;
                  ((jf) this).field_a = -1L;
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
                  var6 = (int)(-var2 + var4);
                  cb.a(((jf) this).field_m, (int)(-((jf) this).field_a + var2), ((jf) this).field_j, (int)(-((jf) this).field_k + var2), var6);
                  break L8;
                }
              }
            }
            ((jf) this).field_f = 0;
            ((jf) this).field_a = -1L;
            break L0;
          }
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != -747969087) {
            return;
        }
        this.a(-1);
        ((jf) this).field_d.b(1337);
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        jk var4_ref_jk = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        jk var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Bounce.field_N;
        try {
          L0: {
            qh.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, param0, 0, 65536};
            var1_int = q.field_G.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (~var3 <= ~var1_int) {
                L2: {
                  var3 = qh.field_g[9] >> 8;
                  var4 = qh.field_g[10] >> 8;
                  var5 = qh.field_g[11] >> 8;
                  var6 = oa.field_a << 4;
                  var7 = 0;
                  var8 = jg.a(var6, true) >> 8;
                  var9 = tk.a(-822, var6) >> 8;
                  if (uc.field_C == -1) {
                    break L2;
                  } else {
                    if (ll.field_y == -1) {
                      break L2;
                    } else {
                      var7 = -320 + uc.field_C;
                      var8 = 240 - ll.field_y;
                      var9 = -128;
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var7 * var7 - -(var8 * var8) + var9 * var9));
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var12 = var7 - var3;
                var13 = var8 - var4;
                var14 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 + var14 * var14)));
                var14 = (int)((double)var14 * var10);
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L3: while (true) {
                  if (~var15 <= ~q.field_G.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (q.field_G.length <= var17_int) {
                        var2[var16] = -2147483648;
                        var17 = q.field_G[var16];
                        gk.b(var16, -1);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            ui.a(-99, false, false, qh.field_g, il.field_e, true, var17);
                            eh.a(var17, var12, var13, var7, var9, var14, var8, -111);
                            var15++;
                            continue L3;
                          } else {
                            il.field_e[var18] = il.field_e[var18] + li.field_e[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (~var23[var16] > ~var23[var17_int]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_jk = q.field_G[var3];
                var4_ref_jk.a(true);
                gk.b(var3, -1);
                var5 = var4_ref_jk.field_e + var4_ref_jk.field_n >> 1;
                var6 = var4_ref_jk.field_N + var4_ref_jk.field_H >> 1;
                var7 = var4_ref_jk.field_D - -var4_ref_jk.field_R >> 1;
                var8 = qh.field_g[9] >> 2;
                var9 = qh.field_g[10] >> 2;
                var10_int = qh.field_g[11] >> 2;
                var11 = var10_int * il.field_e[5] + (var8 * il.field_e[3] + il.field_e[4] * var9) >> 14;
                var12 = il.field_e[6] * var8 + (var9 * il.field_e[7] - -(il.field_e[8] * var10_int)) >> 14;
                var13 = var10_int * il.field_e[11] + (var9 * il.field_e[10] + il.field_e[9] * var8) >> 14;
                var2[var3] = var13 * var7 + var12 * var6 + var5 * var11 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "jf.F(" + param0 + 41);
        }
    }

    jf(ok param0, int param1, int param2) throws IOException {
        ((jf) this).field_k = -1L;
        ((jf) this).field_f = 0;
        ((jf) this).field_a = -1L;
        try {
            ((jf) this).field_d = param0;
            long dupTemp$0 = param0.a(126);
            ((jf) this).field_i = dupTemp$0;
            ((jf) this).field_c = dupTemp$0;
            ((jf) this).field_m = new byte[param2];
            ((jf) this).field_j = new byte[param1];
            ((jf) this).field_b = 0L;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "jf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new sb(3);
        field_g = "Orb points: <%0>";
    }
}

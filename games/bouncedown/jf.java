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
        ((jf) this).b(param0, param1, param1.length, 11842);
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = jg.a(param0, true);
        int var4 = tk.a(-822, param0);
        if (param1) {
            field_g = null;
        }
        int var5 = jg.a(param2, true);
        int var6 = tk.a(-822, param2);
        int var7 = (int)((long)var5 * (long)var3 >> 1224937488);
        int var8 = (int)((long)var3 * (long)var6 >> -1608551216);
        int var9 = (int)((long)var4 * (long)var5 >> 855485008);
        int var10 = (int)((long)var6 * (long)var4 >> -1954463088);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final void d(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Bounce.field_N;
        ((jf) this).field_e = 0;
        if (!((((jf) this).field_b ^ -1L) == (((jf) this).field_l ^ -1L))) {
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

    public static void e(int param0) {
        field_g = null;
        field_h = null;
        if (param0 != -18695) {
            int discarded$0 = jf.b(false);
        }
    }

    final static int b(boolean param0) {
        if (param0) {
            field_g = null;
            return 1;
        }
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (0 > var6_int) {
            L1: {
              var6 = new StringBuilder(var4);
              if (param2 == -126) {
                break L1;
              } else {
                jf.c(94);
                break L1;
              }
            }
            var7 = 0;
            var5 = 0;
            L2: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (var8 < 0) {
                StringBuilder discarded$3 = var6.append(param0.substring(var7));
                return var6.toString();
              } else {
                var5 = var8 + 2;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!kf.a(-49, param0.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (!qi.a((CharSequence) (Object) var9, 10)) {
                    continue L2;
                  } else {
                    if (var5 >= var3) {
                      continue L2;
                    } else {
                      if (62 == param0.charAt(var5)) {
                        var5++;
                        var10 = gf.a(10, (CharSequence) (Object) var9);
                        StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                        StringBuilder discarded$5 = var6.append(param1[var10]);
                        var7 = var5;
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var5 = var6_int - -2;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!kf.a(-49, param0.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param0.substring(var6_int + 2, var5);
              if (qi.a((CharSequence) (Object) var7_ref, 10)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (62 == param0.charAt(var5)) {
                    var5++;
                    var8 = gf.a(10, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (param1[var8].length() + var6_int + -var5);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            if ((long)param2 + ((jf) this).field_b > ((jf) this).field_c) {
              ((jf) this).field_c = ((jf) this).field_b + (long)param2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((jf) this).field_a == -1L) {
              break L1;
            } else {
              L2: {
                if ((((jf) this).field_b ^ -1L) > (((jf) this).field_a ^ -1L)) {
                  break L2;
                } else {
                  if ((((jf) this).field_a + (long)((jf) this).field_f ^ -1L) > (((jf) this).field_b ^ -1L)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              this.a(-1);
              break L1;
            }
          }
          L3: {
            if ((((jf) this).field_a ^ -1L) == 0L) {
              break L3;
            } else {
              if ((long)((jf) this).field_m.length + ((jf) this).field_a < (long)param2 + ((jf) this).field_b) {
                var5_int = (int)((long)((jf) this).field_m.length - -((jf) this).field_a - ((jf) this).field_b);
                cb.a(param1, param3, ((jf) this).field_m, (int)(-((jf) this).field_a + ((jf) this).field_b), var5_int);
                ((jf) this).field_b = ((jf) this).field_b + (long)var5_int;
                param3 = param3 + var5_int;
                param2 = param2 - var5_int;
                ((jf) this).field_f = ((jf) this).field_m.length;
                this.a(param0 ^ -1);
                break L3;
              } else {
                break L3;
              }
            }
          }
          if (param2 > ((jf) this).field_m.length) {
            L4: {
              if (((jf) this).field_l == ((jf) this).field_b) {
                break L4;
              } else {
                ((jf) this).field_d.a(((jf) this).field_b, param0 ^ 20663);
                ((jf) this).field_l = ((jf) this).field_b;
                break L4;
              }
            }
            L5: {
              ((jf) this).field_d.a(1, param3, param2, param1);
              ((jf) this).field_l = ((jf) this).field_l + (long)param2;
              if (((jf) this).field_i >= ((jf) this).field_l) {
                break L5;
              } else {
                ((jf) this).field_i = ((jf) this).field_l;
                break L5;
              }
            }
            L6: {
              L7: {
                var5_long = -1L;
                if ((((jf) this).field_b ^ -1L) > (((jf) this).field_k ^ -1L)) {
                  break L7;
                } else {
                  if (((jf) this).field_b < ((jf) this).field_k - -(long)((jf) this).field_e) {
                    var5_long = ((jf) this).field_b;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if ((((jf) this).field_b ^ -1L) < (((jf) this).field_k ^ -1L)) {
                break L6;
              } else {
                if (((jf) this).field_b + (long)param2 <= ((jf) this).field_k) {
                  break L6;
                } else {
                  var5_long = ((jf) this).field_k;
                  break L6;
                }
              }
            }
            L8: {
              L9: {
                var7 = -1L;
                if (((jf) this).field_b - -(long)param2 <= ((jf) this).field_k) {
                  break L9;
                } else {
                  if (((jf) this).field_b - -(long)param2 <= ((jf) this).field_k + (long)((jf) this).field_e) {
                    var7 = ((jf) this).field_b + (long)param2;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (((jf) this).field_k - -(long)((jf) this).field_e <= ((jf) this).field_b) {
                break L8;
              } else {
                if ((long)param2 + ((jf) this).field_b >= ((jf) this).field_k + (long)((jf) this).field_e) {
                  var7 = (long)((jf) this).field_e + ((jf) this).field_k;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (0L <= (var5_long ^ -1L)) {
                break L10;
              } else {
                if ((var7 ^ -1L) < (var5_long ^ -1L)) {
                  var9 = (int)(-var5_long + var7);
                  cb.a(param1, (int)(var5_long + ((long)param3 + -((jf) this).field_b)), ((jf) this).field_j, (int)(var5_long - ((jf) this).field_k), var9);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            ((jf) this).field_b = ((jf) this).field_b + (long)param2;
            return;
          } else {
            if (-1 <= (param2 ^ -1)) {
              decompiledRegionSelector0 = 0;
            } else {
              L11: {
                if (-1L != ((jf) this).field_a) {
                  break L11;
                } else {
                  ((jf) this).field_a = ((jf) this).field_b;
                  break L11;
                }
              }
              L12: {
                cb.a(param1, param3, ((jf) this).field_m, (int)(-((jf) this).field_a + ((jf) this).field_b), param2);
                ((jf) this).field_b = ((jf) this).field_b + (long)param2;
                if (((jf) this).field_b + -((jf) this).field_a <= (long)((jf) this).field_f) {
                  break L12;
                } else {
                  ((jf) this).field_f = (int)(-((jf) this).field_a + ((jf) this).field_b);
                  break L12;
                }
              }
              decompiledRegionSelector0 = 1;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((jf) this).field_l = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          L13: {
            if (param0 == 0) {
              break L13;
            } else {
              int discarded$1 = jf.b(false);
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String[] param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var5 = Bounce.field_N;
          if (param0 == -52) {
            break L0;
          } else {
            int[] discarded$2 = jf.a(30, true, 104);
            break L0;
          }
        }
        L1: {
          fh.field_B = he.field_p;
          if (-256 == (param2 ^ -1)) {
            L2: {
              stackOut_8_0 = 5579;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (13 <= cg.field_a) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L2;
              }
            }
            ci.field_L = r.a(stackIn_11_0, stackIn_11_1 != 0);
            break L1;
          } else {
            L3: {
              if ((param2 ^ -1) > -101) {
                break L3;
              } else {
                if (param2 <= 105) {
                  ci.field_L = qj.a(false, param1);
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            ci.field_L = wb.a(param2, 1, param3);
            break L1;
          }
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Throwable decompiledCaughtException = null;
        var14 = Bounce.field_N;
        try {
          if (param2 + param0 > param1.length) {
            throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param2));
          } else {
            L0: {
              if (((jf) this).field_a == -1L) {
                break L0;
              } else {
                if (((jf) this).field_b < ((jf) this).field_a) {
                  break L0;
                } else {
                  if (((jf) this).field_a - -(long)((jf) this).field_f < ((jf) this).field_b - -(long)param2) {
                    break L0;
                  } else {
                    cb.a(((jf) this).field_m, (int)(((jf) this).field_b - ((jf) this).field_a), param1, param0, param2);
                    ((jf) this).field_b = ((jf) this).field_b + (long)param2;
                    return;
                  }
                }
              }
            }
            L1: {
              var5_long = ((jf) this).field_b;
              var7 = param0;
              var8 = param2;
              if ((((jf) this).field_b ^ -1L) > (((jf) this).field_k ^ -1L)) {
                break L1;
              } else {
                if (((jf) this).field_k - -(long)((jf) this).field_e <= ((jf) this).field_b) {
                  break L1;
                } else {
                  L2: {
                    var9_int = (int)(-((jf) this).field_b - -((jf) this).field_k + (long)((jf) this).field_e);
                    if (var9_int <= param2) {
                      break L2;
                    } else {
                      var9_int = param2;
                      break L2;
                    }
                  }
                  cb.a(((jf) this).field_j, (int)(((jf) this).field_b - ((jf) this).field_k), param1, param0, var9_int);
                  param2 = param2 - var9_int;
                  ((jf) this).field_b = ((jf) this).field_b + (long)var9_int;
                  param0 = param0 + var9_int;
                  break L1;
                }
              }
            }
            L3: {
              if (param2 <= ((jf) this).field_j.length) {
                if ((param2 ^ -1) < -1) {
                  L4: {
                    this.d(param3 + 4482);
                    var9_int = param2;
                    if (((jf) this).field_e >= var9_int) {
                      break L4;
                    } else {
                      var9_int = ((jf) this).field_e;
                      break L4;
                    }
                  }
                  cb.a(((jf) this).field_j, 0, param1, param0, var9_int);
                  ((jf) this).field_b = ((jf) this).field_b + (long)var9_int;
                  param2 = param2 - var9_int;
                  param0 = param0 + var9_int;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                ((jf) this).field_d.a(((jf) this).field_b, 20663);
                ((jf) this).field_l = ((jf) this).field_b;
                L5: while (true) {
                  if (param2 <= 0) {
                    break L3;
                  } else {
                    var9_int = ((jf) this).field_d.a(param1, param2, param0, -1);
                    if (0 == (var9_int ^ -1)) {
                      break L3;
                    } else {
                      ((jf) this).field_b = ((jf) this).field_b + (long)var9_int;
                      ((jf) this).field_l = ((jf) this).field_l + (long)var9_int;
                      param2 = param2 - var9_int;
                      param0 = param0 + var9_int;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (((jf) this).field_a != -1L) {
                L7: {
                  if ((((jf) this).field_b ^ -1L) <= (((jf) this).field_a ^ -1L)) {
                    break L7;
                  } else {
                    if (-1 > (param2 ^ -1)) {
                      L8: {
                        var9_int = param0 - -(int)(-((jf) this).field_b + ((jf) this).field_a);
                        if (var9_int <= param2 + param0) {
                          break L8;
                        } else {
                          var9_int = param2 + param0;
                          break L8;
                        }
                      }
                      L9: while (true) {
                        if (param0 >= var9_int) {
                          break L7;
                        } else {
                          param2--;
                          param0++;
                          param1[param0] = (byte) 0;
                          ((jf) this).field_b = ((jf) this).field_b + 1L;
                          continue L9;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                L10: {
                  L11: {
                    var9 = -1L;
                    var11 = -1L;
                    if ((var5_long ^ -1L) < (((jf) this).field_a ^ -1L)) {
                      break L11;
                    } else {
                      if (((long)var8 + var5_long ^ -1L) >= (((jf) this).field_a ^ -1L)) {
                        break L11;
                      } else {
                        var9 = ((jf) this).field_a;
                        break L10;
                      }
                    }
                  }
                  if ((((jf) this).field_a ^ -1L) < (var5_long ^ -1L)) {
                    break L10;
                  } else {
                    if (var5_long < (long)((jf) this).field_f + ((jf) this).field_a) {
                      var9 = var5_long;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  L13: {
                    if ((((jf) this).field_a - -(long)((jf) this).field_f ^ -1L) >= (var5_long ^ -1L)) {
                      break L13;
                    } else {
                      if (((jf) this).field_a - -(long)((jf) this).field_f <= (long)var8 + var5_long) {
                        var11 = (long)((jf) this).field_f + ((jf) this).field_a;
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if ((var5_long - -(long)var8 ^ -1L) >= (((jf) this).field_a ^ -1L)) {
                    break L12;
                  } else {
                    if (((long)var8 + var5_long ^ -1L) >= (((jf) this).field_a - -(long)((jf) this).field_f ^ -1L)) {
                      var11 = var5_long + (long)var8;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                if ((var9 ^ -1L) >= 0L) {
                  break L6;
                } else {
                  if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                    break L6;
                  } else {
                    var13 = (int)(var11 + -var9);
                    cb.a(((jf) this).field_m, (int)(-((jf) this).field_a + var9), param1, (int)(-var5_long + var9) + var7, var13);
                    if (((jf) this).field_b >= var11) {
                      break L6;
                    } else {
                      param2 = (int)((long)param2 - (-((jf) this).field_b + var11));
                      ((jf) this).field_b = var11;
                      break L6;
                    }
                  }
                }
              } else {
                break L6;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((jf) this).field_l = -1L;
          throw var5;
        }
        if (param3 == 11842) {
          if (0 >= param2) {
            return;
          } else {
            throw new EOFException();
          }
        } else {
          return;
        }
    }

    final static rg a(boolean param0) {
        if (!param0) {
            field_g = null;
        }
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
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        ((jf) this).field_b = param1;
        if (param0 != 57) {
            rg discarded$0 = jf.a(true);
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
                  if ((((jf) this).field_a ^ -1L) > ((long)((jf) this).field_e + ((jf) this).field_k ^ -1L)) {
                    var2 = ((jf) this).field_a;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((jf) this).field_k ^ -1L) > (((jf) this).field_a ^ -1L)) {
                break L3;
              } else {
                if ((((jf) this).field_k ^ -1L) > ((long)((jf) this).field_f + ((jf) this).field_a ^ -1L)) {
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
              if (((long)((jf) this).field_e + ((jf) this).field_k ^ -1L) >= (((jf) this).field_a ^ -1L)) {
                break L5;
              } else {
                if (((jf) this).field_a - -(long)((jf) this).field_f >= ((jf) this).field_k + (long)((jf) this).field_e) {
                  var4 = (long)((jf) this).field_e + ((jf) this).field_k;
                  break L5;
                } else {
                  L7: {
                    if ((var2 ^ -1L) >= 0L) {
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
              if ((var2 ^ -1L) >= 0L) {
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
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        jk var4_ref_jk = null;
        int var4 = 0;
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
        var19 = Bounce.field_N;
        qh.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, param0, 0, 65536};
        var1 = q.field_G.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = qh.field_g[9] >> -970515192;
              var4 = qh.field_g[10] >> 622964424;
              var5 = qh.field_g[11] >> 1650742536;
              var6 = oa.field_a << -1553123804;
              var7 = 0;
              var8 = jg.a(var6, true) >> 2044676936;
              var9 = tk.a(-822, var6) >> 962947528;
              if (0 == uc.field_C) {
                break L1;
              } else {
                if (0 == ll.field_y) {
                  break L1;
                } else {
                  var7 = -320 + uc.field_C;
                  var8 = 240 - ll.field_y;
                  var9 = -128;
                  break L1;
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
            L2: while (true) {
              if (var15 >= q.field_G.length) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L3: while (true) {
                  if (q.field_G.length <= var17_int) {
                    var2[var16] = -2147483648;
                    var17 = q.field_G[var16];
                    gk.b(var16, -1);
                    var18 = 0;
                    L4: while (true) {
                      if (var18 >= 3) {
                        ui.a(-99, false, false, qh.field_g, il.field_e, true, var17);
                        eh.a(var17, var12, var13, var7, var9, var14, var8, -111);
                        var15++;
                        continue L2;
                      } else {
                        il.field_e[var18] = il.field_e[var18] + li.field_e[var15][var18];
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L3;
                    } else {
                      var17_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_jk = q.field_G[var3];
            var4_ref_jk.a(true);
            gk.b(var3, -1);
            var5 = var4_ref_jk.field_e + var4_ref_jk.field_n >> 408201633;
            var6 = var4_ref_jk.field_N + var4_ref_jk.field_H >> -747969087;
            var7 = var4_ref_jk.field_D - -var4_ref_jk.field_R >> -766665631;
            var8 = qh.field_g[9] >> 1944339394;
            var9 = qh.field_g[10] >> -1554143870;
            var10_int = qh.field_g[11] >> -752174430;
            var11 = var10_int * il.field_e[5] + (var8 * il.field_e[3] + il.field_e[4] * var9) >> 1835573902;
            var12 = il.field_e[6] * var8 + (var9 * il.field_e[7] - -(il.field_e[8] * var10_int)) >> -1682414898;
            var13 = var10_int * il.field_e[11] + (var9 * il.field_e[10] + il.field_e[9] * var8) >> -1600715538;
            var2[var3] = var13 * var7 + var12 * var6 + var5 * var11 >> -176444208;
            var3++;
            continue L0;
          }
        }
    }

    jf(ok param0, int param1, int param2) throws IOException {
        ((jf) this).field_k = -1L;
        ((jf) this).field_f = 0;
        ((jf) this).field_a = -1L;
        ((jf) this).field_d = param0;
        ((jf) this).field_i = param0.a(126);
        ((jf) this).field_c = param0.a(126);
        ((jf) this).field_m = new byte[param2];
        ((jf) this).field_j = new byte[param1];
        ((jf) this).field_b = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new sb(3);
        field_g = "Orb points: <%0>";
    }
}

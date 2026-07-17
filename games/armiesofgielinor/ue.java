/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    private long field_i;
    private ei field_j;
    private long field_n;
    private byte[] field_b;
    private long field_l;
    private long field_m;
    private int field_c;
    static String field_a;
    private byte[] field_f;
    private long field_g;
    static String field_e;
    private long field_h;
    private int field_d;
    static wk[] field_k;

    final static int a(long param0, long param1, byte param2) {
        return (int)((param0 << 16) / param1);
    }

    final static boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (0 > param3) {
          return true;
        } else {
          if (ve.field_a[param0][param3] < 0) {
            return false;
          } else {
            if (!param2) {
              L0: {
                if (param4 == -1208926000) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              if (param1 >= el.field_f[param0][param3]) {
                if (ve.field_a[param0][param3] >= 0) {
                  if (ve.field_a[param0][param3] == (param5 & ve.field_a[param0][param3])) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final long a(boolean param0) {
        if (!param0) {
            ue.a((byte) 77);
        }
        return ((ue) this).field_g;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((long)param0 + ((ue) this).field_h <= ((ue) this).field_g) {
                break L1;
              } else {
                ((ue) this).field_g = (long)param0 + ((ue) this).field_h;
                break L1;
              }
            }
            L2: {
              if (((ue) this).field_m == -1L) {
                break L2;
              } else {
                L3: {
                  if (((ue) this).field_h < ((ue) this).field_m) {
                    break L3;
                  } else {
                    if (~(((ue) this).field_m + (long)((ue) this).field_c) > ~((ue) this).field_h) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.d((byte) 111);
                break L2;
              }
            }
            L4: {
              if (((ue) this).field_m == -1L) {
                break L4;
              } else {
                if (((ue) this).field_m + (long)((ue) this).field_b.length >= ((ue) this).field_h + (long)param0) {
                  break L4;
                } else {
                  var5_int = (int)(-((ue) this).field_h + ((ue) this).field_m + (long)((ue) this).field_b.length);
                  vm.a(param3, param1, ((ue) this).field_b, (int)(-((ue) this).field_m + ((ue) this).field_h), var5_int);
                  param1 = param1 + var5_int;
                  ((ue) this).field_h = ((ue) this).field_h + (long)var5_int;
                  param0 = param0 - var5_int;
                  ((ue) this).field_c = ((ue) this).field_b.length;
                  this.d((byte) 111);
                  break L4;
                }
              }
            }
            if (param0 > ((ue) this).field_b.length) {
              L5: {
                if (((ue) this).field_h == ((ue) this).field_l) {
                  break L5;
                } else {
                  ((ue) this).field_j.a(((ue) this).field_h, 113);
                  ((ue) this).field_l = ((ue) this).field_h;
                  break L5;
                }
              }
              L6: {
                ((ue) this).field_j.a(1, param1, param0, param3);
                ((ue) this).field_l = ((ue) this).field_l + (long)param0;
                if (((ue) this).field_l <= ((ue) this).field_n) {
                  break L6;
                } else {
                  ((ue) this).field_n = ((ue) this).field_l;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  if (((ue) this).field_i > ((ue) this).field_h) {
                    break L8;
                  } else {
                    if (((ue) this).field_h < ((ue) this).field_i + (long)((ue) this).field_d) {
                      var5_long = ((ue) this).field_h;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (~((ue) this).field_i > ~((ue) this).field_h) {
                  break L7;
                } else {
                  if (~((ue) this).field_i > ~((long)param0 + ((ue) this).field_h)) {
                    var5_long = ((ue) this).field_i;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  var7 = -1L;
                  if (~(((ue) this).field_h - -(long)param0) >= ~((ue) this).field_i) {
                    break L10;
                  } else {
                    if ((long)((ue) this).field_d + ((ue) this).field_i < (long)param0 + ((ue) this).field_h) {
                      break L10;
                    } else {
                      var7 = (long)param0 + ((ue) this).field_h;
                      break L9;
                    }
                  }
                }
                if (((ue) this).field_h >= (long)((ue) this).field_d + ((ue) this).field_i) {
                  break L9;
                } else {
                  if (~(((ue) this).field_i - -(long)((ue) this).field_d) >= ~((long)param0 + ((ue) this).field_h)) {
                    var7 = ((ue) this).field_i - -(long)((ue) this).field_d;
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
                  if (~var5_long <= ~var7) {
                    break L11;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    vm.a(param3, (int)(-((ue) this).field_h + ((long)param1 - -var5_long)), ((ue) this).field_f, (int)(var5_long + -((ue) this).field_i), var9);
                    break L11;
                  }
                }
              }
              ((ue) this).field_h = ((ue) this).field_h + (long)param0;
              return;
            } else {
              if (0 >= param0) {
                L12: {
                  if (param2 > 0) {
                    break L12;
                  } else {
                    ue.a((byte) -46);
                    break L12;
                  }
                }
                break L0;
              } else {
                L13: {
                  if (((ue) this).field_m != -1L) {
                    break L13;
                  } else {
                    ((ue) this).field_m = ((ue) this).field_h;
                    break L13;
                  }
                }
                L14: {
                  vm.a(param3, param1, ((ue) this).field_b, (int)(-((ue) this).field_m + ((ue) this).field_h), param0);
                  ((ue) this).field_h = ((ue) this).field_h + (long)param0;
                  if (~(((ue) this).field_h - ((ue) this).field_m) < ~(long)((ue) this).field_c) {
                    ((ue) this).field_c = (int)(-((ue) this).field_m + ((ue) this).field_h);
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
          ((ue) this).field_l = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5_ref;
            stackOut_49_1 = new StringBuilder().append("ue.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L15;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 41);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static nc a(kl param0, int param1, kl param2, byte param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        nc stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param3 < -10) {
              if (kp.a(false, param1, param0, param4)) {
                stackOut_6_0 = lq.a(param2.a((byte) 103, param4, param1), 0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ue.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_7_0;
    }

    public static void b(byte param0) {
        if (param0 <= 40) {
            field_k = null;
        }
        field_a = null;
        field_k = null;
        field_e = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((ue) this).a(param0, param1, (byte) -103, param1.length);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ue.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 != 81) {
            ((ue) this).field_c = 28;
        }
        this.d((byte) 111);
        ((ue) this).field_j.b(param0 + 702);
    }

    final static wk[] a(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            ue.b((byte) 15);
        }
        return cq.a(param1, 1, param0, (byte) 58, param3);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 + param3 <= param1.length) {
              L1: {
                if (((ue) this).field_m == -1L) {
                  break L1;
                } else {
                  if (((ue) this).field_m > ((ue) this).field_h) {
                    break L1;
                  } else {
                    if (~((long)((ue) this).field_c + ((ue) this).field_m) > ~((long)param3 + ((ue) this).field_h)) {
                      break L1;
                    } else {
                      vm.a(((ue) this).field_b, (int)(-((ue) this).field_m + ((ue) this).field_h), param1, param0, param3);
                      ((ue) this).field_h = ((ue) this).field_h + (long)param3;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((ue) this).field_h;
                var7 = param0;
                var8 = param3;
                if (((ue) this).field_h < ((ue) this).field_i) {
                  break L2;
                } else {
                  if (~((long)((ue) this).field_d + ((ue) this).field_i) < ~((ue) this).field_h) {
                    L3: {
                      var9_int = (int)(((ue) this).field_i + -((ue) this).field_h + (long)((ue) this).field_d);
                      if (param3 >= var9_int) {
                        break L3;
                      } else {
                        var9_int = param3;
                        break L3;
                      }
                    }
                    vm.a(((ue) this).field_f, (int)(-((ue) this).field_i + ((ue) this).field_h), param1, param0, var9_int);
                    param0 = param0 + var9_int;
                    param3 = param3 - var9_int;
                    ((ue) this).field_h = ((ue) this).field_h + (long)var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (((ue) this).field_f.length < param3) {
                  ((ue) this).field_j.a(((ue) this).field_h, 112);
                  ((ue) this).field_l = ((ue) this).field_h;
                  L5: while (true) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((ue) this).field_j.a(param3, -78, param1, param0);
                      if (var9_int == -1) {
                        break L4;
                      } else {
                        ((ue) this).field_l = ((ue) this).field_l + (long)var9_int;
                        param0 = param0 + var9_int;
                        ((ue) this).field_h = ((ue) this).field_h + (long)var9_int;
                        param3 = param3 - var9_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (0 >= param3) {
                    break L4;
                  } else {
                    L6: {
                      this.e((byte) -42);
                      var9_int = param3;
                      if (((ue) this).field_d >= var9_int) {
                        break L6;
                      } else {
                        var9_int = ((ue) this).field_d;
                        break L6;
                      }
                    }
                    vm.a(((ue) this).field_f, 0, param1, param0, var9_int);
                    param3 = param3 - var9_int;
                    param0 = param0 + var9_int;
                    ((ue) this).field_h = ((ue) this).field_h + (long)var9_int;
                    break L4;
                  }
                }
              }
              L7: {
                if (((ue) this).field_m == -1L) {
                  break L7;
                } else {
                  L8: {
                    if (~((ue) this).field_m >= ~((ue) this).field_h) {
                      break L8;
                    } else {
                      if (param3 > 0) {
                        L9: {
                          var9_int = param0 + (int)(((ue) this).field_m + -((ue) this).field_h);
                          if (param3 + param0 < var9_int) {
                            var9_int = param3 + param0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param0 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$1 = param0;
                            param0++;
                            param1[incrementValue$1] = (byte) 0;
                            param3--;
                            ((ue) this).field_h = ((ue) this).field_h + 1L;
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
                      if (((ue) this).field_m < var5_long) {
                        break L12;
                      } else {
                        if ((long)var8 + var5_long > ((ue) this).field_m) {
                          var9 = ((ue) this).field_m;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (((ue) this).field_m > var5_long) {
                      break L11;
                    } else {
                      if (var5_long >= ((ue) this).field_m - -(long)((ue) this).field_c) {
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
                      if (var5_long >= ((ue) this).field_m - -(long)((ue) this).field_c) {
                        break L14;
                      } else {
                        if (~(((ue) this).field_m - -(long)((ue) this).field_c) >= ~(var5_long + (long)var8)) {
                          var11 = (long)((ue) this).field_c + ((ue) this).field_m;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if ((long)var8 + var5_long <= ((ue) this).field_m) {
                      break L13;
                    } else {
                      if (~(((ue) this).field_m + (long)((ue) this).field_c) <= ~((long)var8 + var5_long)) {
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
                    if (~var11 < ~var9) {
                      var13 = (int)(-var9 + var11);
                      vm.a(((ue) this).field_b, (int)(-((ue) this).field_m + var9), param1, (int)(-var5_long + var9) + var7, var13);
                      if (~var11 >= ~((ue) this).field_h) {
                        break L7;
                      } else {
                        param3 = (int)((long)param3 - (var11 + -((ue) this).field_h));
                        ((ue) this).field_h = var11;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (param3 > 0) {
                throw new EOFException();
              } else {
                L15: {
                  if (param2 == -103) {
                    break L15;
                  } else {
                    field_e = null;
                    break L15;
                  }
                }
                break L0;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param0 + param3);
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ue) this).field_l = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("ue.O(").append(param0).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L16;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L16;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != -1) {
            return;
        }
        if (!(0L <= param1)) {
            throw new IOException();
        }
        ((ue) this).field_h = param1;
    }

    private final void e(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((ue) this).field_d = 0;
          if (~((ue) this).field_l == ~((ue) this).field_h) {
            break L0;
          } else {
            ((ue) this).field_j.a(((ue) this).field_h, 110);
            ((ue) this).field_l = ((ue) this).field_h;
            break L0;
          }
        }
        ((ue) this).field_i = ((ue) this).field_h;
        L1: while (true) {
          L2: {
            if (((ue) this).field_f.length <= ((ue) this).field_d) {
              break L2;
            } else {
              L3: {
                var2 = ((ue) this).field_f.length - ((ue) this).field_d;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((ue) this).field_j.a(var2, -118, ((ue) this).field_f, ((ue) this).field_d);
              if (var3 == -1) {
                break L2;
              } else {
                ((ue) this).field_l = ((ue) this).field_l + (long)var3;
                ((ue) this).field_d = ((ue) this).field_d + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final static void a(byte param0) {
        t.field_c = kv.k(5);
        if (param0 < 78) {
            wk[] discarded$0 = ue.a(59, -15, 35, -65);
        }
        ee.field_v = new gk();
        ci.h((byte) 74);
    }

    private final void d(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ue) this).field_m != -1L) {
            L1: {
              if (~((ue) this).field_m == ~((ue) this).field_l) {
                break L1;
              } else {
                ((ue) this).field_j.a(((ue) this).field_m, 114);
                ((ue) this).field_l = ((ue) this).field_m;
                break L1;
              }
            }
            L2: {
              ((ue) this).field_j.a(1, 0, ((ue) this).field_c, ((ue) this).field_b);
              ((ue) this).field_l = ((ue) this).field_l + (long)((ue) this).field_c;
              if (~((ue) this).field_l < ~((ue) this).field_n) {
                ((ue) this).field_n = ((ue) this).field_l;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (~((ue) this).field_i < ~((ue) this).field_m) {
                  break L4;
                } else {
                  if (~((long)((ue) this).field_d + ((ue) this).field_i) < ~((ue) this).field_m) {
                    var2 = ((ue) this).field_m;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (~((ue) this).field_i > ~((ue) this).field_m) {
                break L3;
              } else {
                if (((ue) this).field_m + (long)((ue) this).field_c > ((ue) this).field_i) {
                  var2 = ((ue) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((ue) this).field_i <= ~((long)((ue) this).field_c + ((ue) this).field_m)) {
                  break L6;
                } else {
                  if (((ue) this).field_i - -(long)((ue) this).field_d < (long)((ue) this).field_c + ((ue) this).field_m) {
                    break L6;
                  } else {
                    var4 = (long)((ue) this).field_c + ((ue) this).field_m;
                    break L5;
                  }
                }
              }
              if (~((ue) this).field_m <= ~((long)((ue) this).field_d + ((ue) this).field_i)) {
                break L5;
              } else {
                if (~(((ue) this).field_m - -(long)((ue) this).field_c) <= ~((long)((ue) this).field_d + ((ue) this).field_i)) {
                  var4 = ((ue) this).field_i + (long)((ue) this).field_d;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (~var4 < ~var2) {
                  var6 = (int)(var4 + -var2);
                  vm.a(((ue) this).field_b, (int)(-((ue) this).field_m + var2), ((ue) this).field_f, (int)(var2 - ((ue) this).field_i), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ue) this).field_m = -1L;
            ((ue) this).field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    ue(ei param0, int param1, int param2) throws IOException {
        ((ue) this).field_m = -1L;
        ((ue) this).field_i = -1L;
        ((ue) this).field_c = 0;
        try {
            ((ue) this).field_j = param0;
            long dupTemp$0 = param0.a(true);
            ((ue) this).field_n = dupTemp$0;
            ((ue) this).field_g = dupTemp$0;
            ((ue) this).field_f = new byte[param1];
            ((ue) this).field_b = new byte[param2];
            ((ue) this).field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ue.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The '<%0>' setting needs to be changed.";
    }
}

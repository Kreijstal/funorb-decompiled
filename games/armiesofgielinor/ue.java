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
        if (param2 != 97) {
            field_a = (String) null;
        }
        return (int)((param0 << -1208926000) / param1);
    }

    final static boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (0 > param3) {
          return true;
        } else {
          if (-1 < (ve.field_a[param0][param3] ^ -1)) {
            return false;
          } else {
            if (!param2) {
              L0: {
                if (param4 == -1208926000) {
                  break L0;
                } else {
                  field_a = (String) null;
                  break L0;
                }
              }
              if (param1 >= el.field_f[param0][param3]) {
                if ((ve.field_a[param0][param3] ^ -1) <= -1) {
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
        return this.field_g;
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
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
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
            try {
              L1: {
                L2: {
                  if ((long)param0 + this.field_h <= this.field_g) {
                    break L2;
                  } else {
                    this.field_g = (long)param0 + this.field_h;
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_m ^ -1L) == 0L) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_h < this.field_m) {
                        break L4;
                      } else {
                        if ((this.field_m + (long)this.field_c ^ -1L) > (this.field_h ^ -1L)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.d((byte) 111);
                    break L3;
                  }
                }
                L5: {
                  if (0L == (this.field_m ^ -1L)) {
                    break L5;
                  } else {
                    if (this.field_m + (long)this.field_b.length >= this.field_h + (long)param0) {
                      break L5;
                    } else {
                      var5_int = (int)(-this.field_h + this.field_m + (long)this.field_b.length);
                      vm.a(param3, param1, this.field_b, (int)(-this.field_m + this.field_h), var5_int);
                      param1 = param1 + var5_int;
                      this.field_h = this.field_h + (long)var5_int;
                      param0 = param0 - var5_int;
                      this.field_c = this.field_b.length;
                      this.d((byte) 111);
                      break L5;
                    }
                  }
                }
                if (param0 > this.field_b.length) {
                  L6: {
                    if (this.field_h == this.field_l) {
                      break L6;
                    } else {
                      this.field_j.a(this.field_h, 113);
                      this.field_l = this.field_h;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_j.a(1, param1, param0, param3);
                    this.field_l = this.field_l + (long)param0;
                    if (this.field_l <= this.field_n) {
                      break L7;
                    } else {
                      this.field_n = this.field_l;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      L10: {
                        var5_long = -1L;
                        if (this.field_i > this.field_h) {
                          break L10;
                        } else {
                          if (this.field_h < this.field_i + (long)this.field_d) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if ((this.field_i ^ -1L) > (this.field_h ^ -1L)) {
                        break L8;
                      } else {
                        if ((this.field_i ^ -1L) > ((long)param0 + this.field_h ^ -1L)) {
                          var5_long = this.field_i;
                          if (var10 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    var5_long = this.field_h;
                    break L8;
                  }
                  L11: {
                    L12: {
                      var7 = -1L;
                      if ((this.field_h - -(long)param0 ^ -1L) >= (this.field_i ^ -1L)) {
                        break L12;
                      } else {
                        if ((long)this.field_d + this.field_i < (long)param0 + this.field_h) {
                          break L12;
                        } else {
                          var7 = (long)param0 + this.field_h;
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    if (this.field_h >= (long)this.field_d + this.field_i) {
                      break L11;
                    } else {
                      if ((this.field_i - -(long)this.field_d ^ -1L) >= ((long)param0 + this.field_h ^ -1L)) {
                        var7 = this.field_i - -(long)this.field_d;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L13;
                    } else {
                      if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                        break L13;
                      } else {
                        var9 = (int)(-var5_long + var7);
                        vm.a(param3, (int)(-this.field_h + ((long)param1 - -var5_long)), this.field_f, (int)(var5_long + -this.field_i), var9);
                        break L13;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (0 >= param0) {
                    L14: {
                      if (param2 > 0) {
                        break L14;
                      } else {
                        ue.a((byte) -46);
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    L15: {
                      if ((this.field_m ^ -1L) != 0L) {
                        break L15;
                      } else {
                        this.field_m = this.field_h;
                        break L15;
                      }
                    }
                    L16: {
                      vm.a(param3, param1, this.field_b, (int)(-this.field_m + this.field_h), param0);
                      this.field_h = this.field_h + (long)param0;
                      if ((this.field_h - this.field_m ^ -1L) < ((long)this.field_c ^ -1L)) {
                        this.field_c = (int)(-this.field_m + this.field_h);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_l = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var5_ref);
            stackOut_49_1 = new StringBuilder().append("ue.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static nc a(kl param0, int param1, kl param2, byte param3, int param4) {
        RuntimeException var5 = null;
        nc stackIn_2_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_6_0 = null;
        nc stackOut_1_0 = null;
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
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ue.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void b(byte param0) {
        if (param0 <= 40) {
            field_k = (wk[]) null;
        }
        field_a = null;
        field_k = null;
        field_e = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            this.a(param0, param1, (byte) -103, param1.length);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ue.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 != 81) {
            this.field_c = 28;
        }
        this.d((byte) 111);
        this.field_j.b(param0 + 702);
    }

    final static wk[] a(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            ue.b((byte) 15);
        }
        return cq.a(param1, 1, param0, (byte) 58, param3);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int incrementValue$1 = 0;
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
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param0 + param3 <= param1.length) {
                  L2: {
                    if (0L == (this.field_m ^ -1L)) {
                      break L2;
                    } else {
                      if (this.field_m > this.field_h) {
                        break L2;
                      } else {
                        if (((long)this.field_c + this.field_m ^ -1L) > ((long)param3 + this.field_h ^ -1L)) {
                          break L2;
                        } else {
                          vm.a(this.field_b, (int)(-this.field_m + this.field_h), param1, param0, param3);
                          this.field_h = this.field_h + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_h;
                    var7 = param0;
                    var8 = param3;
                    if (this.field_h < this.field_i) {
                      break L3;
                    } else {
                      if (((long)this.field_d + this.field_i ^ -1L) < (this.field_h ^ -1L)) {
                        L4: {
                          var9_int = (int)(this.field_i + -this.field_h + (long)this.field_d);
                          if (param3 >= var9_int) {
                            break L4;
                          } else {
                            var9_int = param3;
                            break L4;
                          }
                        }
                        vm.a(this.field_f, (int)(-this.field_i + this.field_h), param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      L7: {
                        if (this.field_f.length < param3) {
                          break L7;
                        } else {
                          if (0 >= param3) {
                            break L6;
                          } else {
                            L8: {
                              this.e((byte) -42);
                              var9_int = param3;
                              if (this.field_d >= var9_int) {
                                break L8;
                              } else {
                                var9_int = this.field_d;
                                break L8;
                              }
                            }
                            vm.a(this.field_f, 0, param1, param0, var9_int);
                            param3 = param3 - var9_int;
                            param0 = param0 + var9_int;
                            this.field_h = this.field_h + (long)var9_int;
                            if (var14 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      this.field_j.a(this.field_h, 112);
                      this.field_l = this.field_h;
                      L9: while (true) {
                        if (-1 <= (param3 ^ -1)) {
                          break L6;
                        } else {
                          var9_int = this.field_j.a(param3, -78, param1, param0);
                          stackOut_21_0 = var9_int ^ -1;
                          stackIn_25_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var14 != 0) {
                            break L5;
                          } else {
                            if (stackIn_22_0 == 0) {
                              break L6;
                            } else {
                              this.field_l = this.field_l + (long)var9_int;
                              param0 = param0 + var9_int;
                              this.field_h = this.field_h + (long)var9_int;
                              param3 = param3 - var9_int;
                              if (var14 == 0) {
                                continue L9;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_24_0 = (this.field_m < -1L ? -1 : (this.field_m == -1L ? 0 : 1));
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  }
                  L10: {
                    if (stackIn_25_0 == 0) {
                      break L10;
                    } else {
                      L11: {
                        if ((this.field_m ^ -1L) >= (this.field_h ^ -1L)) {
                          break L11;
                        } else {
                          if ((param3 ^ -1) < -1) {
                            L12: {
                              var9_int = param0 + (int)(this.field_m + -this.field_h);
                              if (param3 + param0 < var9_int) {
                                var9_int = param3 + param0;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            L13: while (true) {
                              if (param0 >= var9_int) {
                                break L11;
                              } else {
                                incrementValue$1 = param0;
                                param0++;
                                param1[incrementValue$1] = (byte) 0;
                                param3--;
                                this.field_h = this.field_h + 1L;
                                if (var14 != 0) {
                                  break L10;
                                } else {
                                  continue L13;
                                }
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          L16: {
                            var9 = -1L;
                            if (this.field_m < var5_long) {
                              break L16;
                            } else {
                              if ((long)var8 + var5_long > this.field_m) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (this.field_m > var5_long) {
                            break L14;
                          } else {
                            if (var5_long >= this.field_m - -(long)this.field_c) {
                              break L14;
                            } else {
                              var9 = var5_long;
                              if (var14 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        var9 = this.field_m;
                        break L14;
                      }
                      L17: {
                        L18: {
                          L19: {
                            var11 = -1L;
                            if (var5_long >= this.field_m - -(long)this.field_c) {
                              break L19;
                            } else {
                              if ((this.field_m - -(long)this.field_c ^ -1L) >= (var5_long + (long)var8 ^ -1L)) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if ((long)var8 + var5_long <= this.field_m) {
                            break L17;
                          } else {
                            if ((this.field_m + (long)this.field_c ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                              var11 = (long)var8 + var5_long;
                              if (var14 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        var11 = (long)this.field_c + this.field_m;
                        break L17;
                      }
                      if ((var9 ^ -1L) >= 0L) {
                        break L10;
                      } else {
                        if ((var11 ^ -1L) < (var9 ^ -1L)) {
                          var13 = (int)(-var9 + var11);
                          vm.a(this.field_b, (int)(-this.field_m + var9), param1, (int)(-var5_long + var9) + var7, var13);
                          if ((var11 ^ -1L) >= (this.field_h ^ -1L)) {
                            break L10;
                          } else {
                            param3 = (int)((long)param3 - (var11 + -this.field_h));
                            this.field_h = var11;
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(-param1.length + param0 + param3);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_l = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (-1 > (param3 ^ -1)) {
                throw new EOFException();
              } else {
                L20: {
                  if (param2 == -103) {
                    break L20;
                  } else {
                    field_e = (String) null;
                    break L20;
                  }
                }
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L21: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var5_ref);
            stackOut_64_1 = new StringBuilder().append("ue.O(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L21;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L21;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != -1) {
            return;
        }
        if (!(0L <= param1)) {
            throw new IOException();
        }
        this.field_h = param1;
    }

    private final void e(byte param0) throws IOException {
        nc discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kl var5 = null;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_d = 0;
          if (param0 == -42) {
            break L0;
          } else {
            var5 = (kl) null;
            discarded$2 = ue.a((kl) null, 70, (kl) null, (byte) -40, 15);
            break L0;
          }
        }
        L1: {
          if ((this.field_l ^ -1L) == (this.field_h ^ -1L)) {
            break L1;
          } else {
            this.field_j.a(this.field_h, 110);
            this.field_l = this.field_h;
            break L1;
          }
        }
        this.field_i = this.field_h;
        L2: while (true) {
          L3: {
            if (this.field_f.length <= this.field_d) {
              break L3;
            } else {
              var2 = this.field_f.length - this.field_d;
              if (var4 != 0) {
                break L3;
              } else {
                L4: {
                  if (var2 <= 200000000) {
                    break L4;
                  } else {
                    var2 = 200000000;
                    break L4;
                  }
                }
                var3 = this.field_j.a(var2, -118, this.field_f, this.field_d);
                if ((var3 ^ -1) == 0) {
                  break L3;
                } else {
                  this.field_l = this.field_l + (long)var3;
                  this.field_d = this.field_d + var3;
                  if (var4 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final static void a(byte param0) {
        wk[] discarded$0 = null;
        t.field_c = kv.k(5);
        if (param0 < 78) {
            discarded$0 = ue.a(59, -15, 35, -65);
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
          if (param0 == 111) {
            break L0;
          } else {
            field_k = (wk[]) null;
            break L0;
          }
        }
        L1: {
          if (this.field_m != -1L) {
            L2: {
              if ((this.field_m ^ -1L) == (this.field_l ^ -1L)) {
                break L2;
              } else {
                this.field_j.a(this.field_m, 114);
                this.field_l = this.field_m;
                break L2;
              }
            }
            L3: {
              this.field_j.a(1, 0, this.field_c, this.field_b);
              this.field_l = this.field_l + (long)this.field_c;
              if ((this.field_l ^ -1L) < (this.field_n ^ -1L)) {
                this.field_n = this.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  var2 = -1L;
                  if ((this.field_i ^ -1L) < (this.field_m ^ -1L)) {
                    break L6;
                  } else {
                    if (((long)this.field_d + this.field_i ^ -1L) < (this.field_m ^ -1L)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((this.field_i ^ -1L) > (this.field_m ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_m + (long)this.field_c > this.field_i) {
                    var2 = this.field_i;
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var2 = this.field_m;
              break L4;
            }
            L7: {
              L8: {
                var4 = -1L;
                if ((this.field_i ^ -1L) <= ((long)this.field_c + this.field_m ^ -1L)) {
                  break L8;
                } else {
                  if (this.field_i - -(long)this.field_d < (long)this.field_c + this.field_m) {
                    break L8;
                  } else {
                    var4 = (long)this.field_c + this.field_m;
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              if ((this.field_m ^ -1L) <= ((long)this.field_d + this.field_i ^ -1L)) {
                break L7;
              } else {
                if ((this.field_m - -(long)this.field_c ^ -1L) <= ((long)this.field_d + this.field_i ^ -1L)) {
                  var4 = this.field_i + (long)this.field_d;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if ((var2 ^ -1L) >= 0L) {
                break L9;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 + -var2);
                  vm.a(this.field_b, (int)(-this.field_m + var2), this.field_f, (int)(var2 - this.field_i), var6);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            this.field_m = -1L;
            this.field_c = 0;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ue(ei param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_i = -1L;
        this.field_c = 0;
        try {
            this.field_j = param0;
            dupTemp$0 = param0.a(true);
            this.field_n = dupTemp$0;
            this.field_g = dupTemp$0;
            this.field_f = new byte[param1];
            this.field_b = new byte[param2];
            this.field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "The '<%0>' setting needs to be changed.";
    }
}

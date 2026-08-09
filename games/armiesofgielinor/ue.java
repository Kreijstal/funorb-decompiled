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
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
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
                      var5_long = -1L;
                      if (this.field_i > this.field_h) {
                        break L9;
                      } else {
                        if (this.field_h < this.field_i + (long)this.field_d) {
                          var5_long = this.field_h;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((this.field_i ^ -1L) > (this.field_h ^ -1L)) {
                      break L8;
                    } else {
                      if ((this.field_i ^ -1L) > ((long)param0 + this.field_h ^ -1L)) {
                        var5_long = this.field_i;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var7 = -1L;
                      if ((this.field_h - -(long)param0 ^ -1L) >= (this.field_i ^ -1L)) {
                        break L11;
                      } else {
                        if ((long)this.field_d + this.field_i < (long)param0 + this.field_h) {
                          break L11;
                        } else {
                          var7 = (long)param0 + this.field_h;
                          break L10;
                        }
                      }
                    }
                    if (this.field_h >= (long)this.field_d + this.field_i) {
                      break L10;
                    } else {
                      if ((this.field_i - -(long)this.field_d ^ -1L) >= ((long)param0 + this.field_h ^ -1L)) {
                        var7 = this.field_i - -(long)this.field_d;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L12;
                    } else {
                      if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                        break L12;
                      } else {
                        var9 = (int)(-var5_long + var7);
                        vm.a(param3, (int)(-this.field_h + ((long)param1 - -var5_long)), this.field_f, (int)(var5_long + -this.field_i), var9);
                        break L12;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (0 >= param0) {
                    L13: {
                      if (param2 > 0) {
                        break L13;
                      } else {
                        ue.a((byte) -46);
                        break L13;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    L14: {
                      if ((this.field_m ^ -1L) != 0L) {
                        break L14;
                      } else {
                        this.field_m = this.field_h;
                        break L14;
                      }
                    }
                    L15: {
                      vm.a(param3, param1, this.field_b, (int)(-this.field_m + this.field_h), param0);
                      this.field_h = this.field_h + (long)param0;
                      if ((this.field_h - this.field_m ^ -1L) < ((long)this.field_c ^ -1L)) {
                        this.field_c = (int)(-this.field_m + this.field_h);
                        break L15;
                      } else {
                        break L15;
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
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var5_ref);

            stackIn_51_1 = new StringBuilder().append("ue.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L16;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L16;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 < -10) {
              if (kp.a(false, param1, param0, param4)) {
                stackIn_7_0 = lq.a(param2.a((byte) 103, param4, param1), 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ue.L(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
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
        int incrementValue$0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
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
                    if (this.field_f.length < param3) {
                      this.field_j.a(this.field_h, 112);
                      this.field_l = this.field_h;
                      L6: while (true) {
                        if (-1 <= (param3 ^ -1)) {
                          break L5;
                        } else {
                          var9_int = this.field_j.a(param3, -78, param1, param0);
                          if ((var9_int ^ -1) == 0) {
                            break L5;
                          } else {
                            this.field_l = this.field_l + (long)var9_int;
                            param0 = param0 + var9_int;
                            this.field_h = this.field_h + (long)var9_int;
                            param3 = param3 - var9_int;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      if (0 >= param3) {
                        break L5;
                      } else {
                        L7: {
                          this.e((byte) -42);
                          var9_int = param3;
                          if (this.field_d >= var9_int) {
                            break L7;
                          } else {
                            var9_int = this.field_d;
                            break L7;
                          }
                        }
                        vm.a(this.field_f, 0, param1, param0, var9_int);
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (this.field_m == -1L) {
                      break L8;
                    } else {
                      L9: {
                        if ((this.field_m ^ -1L) >= (this.field_h ^ -1L)) {
                          break L9;
                        } else {
                          if ((param3 ^ -1) < -1) {
                            L10: {
                              var9_int = param0 + (int)(this.field_m + -this.field_h);
                              if (param3 + param0 < var9_int) {
                                var9_int = param3 + param0;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (param0 >= var9_int) {
                                break L9;
                              } else {
                                incrementValue$0 = param0;
                                param0++;
                                param1[incrementValue$0] = (byte) 0;
                                param3--;
                                this.field_h = this.field_h + 1L;
                                continue L11;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var9 = -1L;
                          if (this.field_m < var5_long) {
                            break L13;
                          } else {
                            if ((long)var8 + var5_long > this.field_m) {
                              var9 = this.field_m;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (this.field_m > var5_long) {
                          break L12;
                        } else {
                          if (var5_long >= this.field_m - -(long)this.field_c) {
                            break L12;
                          } else {
                            var9 = var5_long;
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          var11 = -1L;
                          if (var5_long >= this.field_m - -(long)this.field_c) {
                            break L15;
                          } else {
                            if ((this.field_m - -(long)this.field_c ^ -1L) >= (var5_long + (long)var8 ^ -1L)) {
                              var11 = (long)this.field_c + this.field_m;
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if ((long)var8 + var5_long <= this.field_m) {
                          break L14;
                        } else {
                          if ((this.field_m + (long)this.field_c ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            var11 = (long)var8 + var5_long;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if ((var9 ^ -1L) >= 0L) {
                        break L8;
                      } else {
                        if ((var11 ^ -1L) < (var9 ^ -1L)) {
                          var13 = (int)(-var9 + var11);
                          vm.a(this.field_b, (int)(-this.field_m + var9), param1, (int)(-var5_long + var9) + var7, var13);
                          if ((var11 ^ -1L) >= (this.field_h ^ -1L)) {
                            break L8;
                          } else {
                            param3 = (int)((long)param3 - (var11 + -this.field_h));
                            this.field_h = var11;
                            break L8;
                          }
                        } else {
                          break L8;
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
                L16: {
                  if (param2 == -103) {
                    break L16;
                  } else {
                    field_e = (String) null;
                    break L16;
                  }
                }
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var5_ref);

            stackIn_62_1 = new StringBuilder().append("ue.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L17;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L17;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ')');
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
        int var2;
        int var3;
        int var4;
        kl var5;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_d = 0;
          if (param0 == -42) {
            break L0;
          } else {
            var5 = (kl) null;
            ue.a((kl) null, 70, (kl) null, (byte) -40, 15);
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
              L4: {
                var2 = this.field_f.length - this.field_d;
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
                continue L2;
              }
            }
          }
          return;
        }
    }

    final static void a(byte param0) {
        t.field_c = kv.k(5);
        if (param0 < 78) {
            ue.a(59, -15, 35, -65);
        }
        ee.field_v = new gk();
        ci.h((byte) 74);
    }

    private final void d(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
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
                var2 = -1L;
                if ((this.field_i ^ -1L) < (this.field_m ^ -1L)) {
                  break L5;
                } else {
                  if (((long)this.field_d + this.field_i ^ -1L) < (this.field_m ^ -1L)) {
                    var2 = this.field_m;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((this.field_i ^ -1L) > (this.field_m ^ -1L)) {
                break L4;
              } else {
                if (this.field_m + (long)this.field_c > this.field_i) {
                  var2 = this.field_i;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                var4 = -1L;
                if ((this.field_i ^ -1L) <= ((long)this.field_c + this.field_m ^ -1L)) {
                  break L7;
                } else {
                  if (this.field_i - -(long)this.field_d < (long)this.field_c + this.field_m) {
                    break L7;
                  } else {
                    var4 = (long)this.field_c + this.field_m;
                    break L6;
                  }
                }
              }
              if ((this.field_m ^ -1L) <= ((long)this.field_d + this.field_i ^ -1L)) {
                break L6;
              } else {
                if ((this.field_m - -(long)this.field_c ^ -1L) <= ((long)this.field_d + this.field_i ^ -1L)) {
                  var4 = this.field_i + (long)this.field_d;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if ((var2 ^ -1L) >= 0L) {
                break L8;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 + -var2);
                  vm.a(this.field_b, (int)(-this.field_m + var2), this.field_f, (int)(var2 - this.field_i), var6);
                  break L8;
                } else {
                  break L8;
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

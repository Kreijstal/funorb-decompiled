/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im {
    private long field_a;
    private byte[] field_o;
    private long field_d;
    static fe[] field_c;
    static int field_h;
    private long field_e;
    private bj field_f;
    private long field_k;
    private long field_n;
    private long field_i;
    private int field_l;
    private byte[] field_m;
    private int field_b;
    static boolean field_g;
    static cr field_j;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_d + (long)param1 > this.field_a) {
                    this.field_a = this.field_d - -(long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0 == 0) {
                  L3: {
                    if ((this.field_e ^ -1L) == 0L) {
                      break L3;
                    } else {
                      L4: {
                        if (this.field_e > this.field_d) {
                          break L4;
                        } else {
                          if (this.field_d > (long)this.field_l + this.field_e) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.a((byte) 58);
                      break L3;
                    }
                  }
                  L5: {
                    if (this.field_e == -1L) {
                      break L5;
                    } else {
                      if ((long)param1 + this.field_d <= this.field_e - -(long)this.field_m.length) {
                        break L5;
                      } else {
                        var5_int = (int)(-this.field_d - (-this.field_e - (long)this.field_m.length));
                        qq.a(param3, param2, this.field_m, (int)(this.field_d + -this.field_e), var5_int);
                        this.field_d = this.field_d + (long)var5_int;
                        param1 = param1 - var5_int;
                        param2 = param2 + var5_int;
                        this.field_l = this.field_m.length;
                        this.a((byte) 100);
                        break L5;
                      }
                    }
                  }
                  if (this.field_m.length < param1) {
                    L6: {
                      if (this.field_n == this.field_d) {
                        break L6;
                      } else {
                        this.field_f.a(this.field_d, false);
                        this.field_n = this.field_d;
                        break L6;
                      }
                    }
                    L7: {
                      this.field_f.a(param1, param2, param3, false);
                      this.field_n = this.field_n + (long)param1;
                      if (this.field_i < this.field_n) {
                        this.field_i = this.field_n;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var5_long = -1L;
                        if ((this.field_k ^ -1L) < (this.field_d ^ -1L)) {
                          break L9;
                        } else {
                          if (((long)this.field_b + this.field_k ^ -1L) >= (this.field_d ^ -1L)) {
                            break L9;
                          } else {
                            var5_long = this.field_d;
                            break L8;
                          }
                        }
                      }
                      if (this.field_k < this.field_d) {
                        break L8;
                      } else {
                        if ((this.field_k ^ -1L) > (this.field_d + (long)param1 ^ -1L)) {
                          var5_long = this.field_k;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L10: {
                      L11: {
                        var7 = -1L;
                        if ((this.field_d + (long)param1 ^ -1L) >= (this.field_k ^ -1L)) {
                          break L11;
                        } else {
                          if (this.field_k - -(long)this.field_b >= this.field_d + (long)param1) {
                            var7 = (long)param1 + this.field_d;
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if ((this.field_k + (long)this.field_b ^ -1L) >= (this.field_d ^ -1L)) {
                        break L10;
                      } else {
                        if (this.field_d + (long)param1 >= this.field_k + (long)this.field_b) {
                          var7 = (long)this.field_b + this.field_k;
                          break L10;
                        } else {
                          L12: {
                            if ((var5_long ^ -1L) >= 0L) {
                              break L12;
                            } else {
                              if (var7 <= var5_long) {
                                break L12;
                              } else {
                                var9 = (int)(-var5_long + var7);
                                qq.a(param3, (int)((long)param2 - (-var5_long - -this.field_d)), this.field_o, (int)(-this.field_k + var5_long), var9);
                                break L12;
                              }
                            }
                          }
                          this.field_d = this.field_d + (long)param1;
                          return;
                        }
                      }
                    }
                    L13: {
                      if ((var5_long ^ -1L) >= 0L) {
                        break L13;
                      } else {
                        if (var7 <= var5_long) {
                          break L13;
                        } else {
                          var9 = (int)(-var5_long + var7);
                          qq.a(param3, (int)((long)param2 - (-var5_long - -this.field_d)), this.field_o, (int)(-this.field_k + var5_long), var9);
                          break L13;
                        }
                      }
                    }
                    this.field_d = this.field_d + (long)param1;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    if ((param1 ^ -1) < -1) {
                      L14: {
                        if (this.field_e == -1L) {
                          this.field_e = this.field_d;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        qq.a(param3, param2, this.field_m, (int)(this.field_d - this.field_e), param1);
                        this.field_d = this.field_d + (long)param1;
                        if (((long)this.field_l ^ -1L) <= (this.field_d - this.field_e ^ -1L)) {
                          break L15;
                        } else {
                          this.field_l = (int)(-this.field_e + this.field_d);
                          break L15;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_n = -1L;
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
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var5_ref);
            stackOut_55_1 = new StringBuilder().append("im.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L16;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param3 + param1 <= param2.length) {
                  L2: {
                    if ((this.field_e ^ -1L) == 0L) {
                      break L2;
                    } else {
                      if ((this.field_d ^ -1L) > (this.field_e ^ -1L)) {
                        break L2;
                      } else {
                        if ((long)this.field_l + this.field_e >= (long)param3 + this.field_d) {
                          qq.a(this.field_m, (int)(-this.field_e + this.field_d), param2, param1, param3);
                          this.field_d = this.field_d + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var5_long = this.field_d;
                  if (param0 < -82) {
                    L3: {
                      var7 = param1;
                      var8 = param3;
                      if (this.field_k > this.field_d) {
                        break L3;
                      } else {
                        if (this.field_d < this.field_k - -(long)this.field_b) {
                          L4: {
                            var9_int = (int)((long)this.field_b - (this.field_d + -this.field_k));
                            if (var9_int > param3) {
                              var9_int = param3;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          qq.a(this.field_o, (int)(this.field_d - this.field_k), param2, param1, var9_int);
                          param1 = param1 + var9_int;
                          param3 = param3 - var9_int;
                          this.field_d = this.field_d + (long)var9_int;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (param3 > this.field_o.length) {
                        this.field_f.a(this.field_d, false);
                        this.field_n = this.field_d;
                        L6: while (true) {
                          if ((param3 ^ -1) >= -1) {
                            break L5;
                          } else {
                            var9_int = this.field_f.a(param3, (byte) -84, param2, param1);
                            if ((var9_int ^ -1) != 0) {
                              this.field_n = this.field_n + (long)var9_int;
                              param1 = param1 + var9_int;
                              this.field_d = this.field_d + (long)var9_int;
                              param3 = param3 - var9_int;
                              continue L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                      } else {
                        if (param3 > 0) {
                          L7: {
                            this.d(-122);
                            var9_int = param3;
                            if (this.field_b < var9_int) {
                              var9_int = this.field_b;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          qq.a(this.field_o, 0, param2, param1, var9_int);
                          param1 = param1 + var9_int;
                          this.field_d = this.field_d + (long)var9_int;
                          param3 = param3 - var9_int;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if ((this.field_e ^ -1L) != 0L) {
                        L9: {
                          if ((this.field_e ^ -1L) >= (this.field_d ^ -1L)) {
                            break L9;
                          } else {
                            if (-1 > (param3 ^ -1)) {
                              L10: {
                                var9_int = (int)(-this.field_d + this.field_e) + param1;
                                if (param1 + param3 < var9_int) {
                                  var9_int = param1 - -param3;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (var9_int <= param1) {
                                  break L9;
                                } else {
                                  param3--;
                                  incrementValue$1 = param1;
                                  param1++;
                                  param2[incrementValue$1] = (byte) 0;
                                  this.field_d = this.field_d + 1L;
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
                            var11 = -1L;
                            if ((this.field_e ^ -1L) > (var5_long ^ -1L)) {
                              break L13;
                            } else {
                              if ((this.field_e ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                                break L13;
                              } else {
                                var9 = this.field_e;
                                break L12;
                              }
                            }
                          }
                          if (var5_long < this.field_e) {
                            break L12;
                          } else {
                            if (((long)this.field_l + this.field_e ^ -1L) >= (var5_long ^ -1L)) {
                              break L12;
                            } else {
                              var9 = var5_long;
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if (this.field_e + (long)this.field_l <= var5_long) {
                              break L15;
                            } else {
                              if (((long)this.field_l + this.field_e ^ -1L) >= ((long)var8 + var5_long ^ -1L)) {
                                var11 = (long)this.field_l + this.field_e;
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if ((var5_long + (long)var8 ^ -1L) >= (this.field_e ^ -1L)) {
                            break L14;
                          } else {
                            if (((long)var8 + var5_long ^ -1L) >= (this.field_e - -(long)this.field_l ^ -1L)) {
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
                          if (var11 <= var9) {
                            break L8;
                          } else {
                            var13 = (int)(-var9 + var11);
                            qq.a(this.field_m, (int)(var9 + -this.field_e), param2, (int)(var9 - var5_long) + var7, var13);
                            if ((this.field_d ^ -1L) <= (var11 ^ -1L)) {
                              break L8;
                            } else {
                              param3 = (int)((long)param3 - (-this.field_d + var11));
                              this.field_d = var11;
                              break L8;
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  throw new ArrayIndexOutOfBoundsException(param1 + (param3 + -param2.length));
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_n = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 2;
                break L0;
              } else {
                if (-1 <= (param3 ^ -1)) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  throw new EOFException();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var5_ref);
            stackOut_63_1 = new StringBuilder().append("im.A(").append(param0).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L16;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L16;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param3 + ')');
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

    final long c(int param0) {
        boolean discarded$0 = false;
        if (param0 != -1) {
            discarded$0 = im.a(90);
        }
        return this.field_a;
    }

    final void b(int param0) throws IOException {
        this.a((byte) 31);
        if (param0 != -22473) {
            this.field_e = -20L;
        }
        this.field_f.a(0);
    }

    final void a(int param0, long param1) throws IOException {
        if (!((param1 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        if (param0 != -23669) {
            field_h = 5;
        }
        this.field_d = param1;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            this.a(-102, param0, param1, param1.length);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "im.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            im.e(-33);
        }
        return !hj.field_b ? true : false;
    }

    public static void e(int param0) {
        if (param0 < 7) {
            return;
        }
        field_c = null;
        field_j = null;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if ((this.field_e ^ -1L) != 0L) {
            L1: {
              if (this.field_n != this.field_e) {
                this.field_f.a(this.field_e, false);
                this.field_n = this.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_f.a(this.field_l, 0, this.field_m, false);
              this.field_n = this.field_n + (long)this.field_l;
              if (this.field_n <= this.field_i) {
                break L2;
              } else {
                this.field_i = this.field_n;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((this.field_k ^ -1L) < (this.field_e ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_e >= (long)this.field_b + this.field_k) {
                    break L4;
                  } else {
                    var2 = this.field_e;
                    break L3;
                  }
                }
              }
              if ((this.field_k ^ -1L) > (this.field_e ^ -1L)) {
                break L3;
              } else {
                if (this.field_k < (long)this.field_l + this.field_e) {
                  var2 = this.field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((this.field_k ^ -1L) <= ((long)this.field_l + this.field_e ^ -1L)) {
                  break L6;
                } else {
                  if (this.field_k + (long)this.field_b < this.field_e - -(long)this.field_l) {
                    break L6;
                  } else {
                    var4 = this.field_e - -(long)this.field_l;
                    break L5;
                  }
                }
              }
              if (((long)this.field_b + this.field_k ^ -1L) >= (this.field_e ^ -1L)) {
                break L5;
              } else {
                if ((this.field_k + (long)this.field_b ^ -1L) >= (this.field_e - -(long)this.field_l ^ -1L)) {
                  var4 = (long)this.field_b + this.field_k;
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
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 - var2);
                  qq.a(this.field_m, (int)(-this.field_e + var2), this.field_o, (int)(var2 + -this.field_k), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_l = 0;
            this.field_e = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 >= 20) {
            break L8;
          } else {
            break L8;
          }
        }
    }

    im(bj param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_k = -1L;
        this.field_l = 0;
        this.field_e = -1L;
        try {
            this.field_f = param0;
            dupTemp$0 = param0.b(0);
            this.field_i = dupTemp$0;
            this.field_a = dupTemp$0;
            this.field_m = new byte[param2];
            this.field_o = new byte[param1];
            this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        this.field_b = 0;
        if ((this.field_n ^ -1L) != (this.field_d ^ -1L)) {
            this.field_f.a(this.field_d, false);
            this.field_n = this.field_d;
        }
        this.field_k = this.field_d;
        int var2 = 15 % ((param0 - 69) / 57);
        while (this.field_o.length > this.field_b) {
            var3 = -this.field_b + this.field_o.length;
            if (!(var3 <= 200000000)) {
                var3 = 200000000;
            }
            var4 = this.field_f.a(var3, (byte) -90, this.field_o, this.field_b);
            if (0 == (var4 ^ -1)) {
                break;
            }
            this.field_b = this.field_b + var4;
            this.field_n = this.field_n + (long)var4;
        }
    }

    static {
        field_h = 480;
    }
}

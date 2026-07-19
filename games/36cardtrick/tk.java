/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk {
    static int field_c;
    private wk field_n;
    private long field_g;
    private int field_m;
    private long field_f;
    private long field_p;
    private long field_k;
    private long field_i;
    private byte[] field_h;
    private byte[] field_e;
    static int field_a;
    static java.applet.Applet field_o;
    private int field_d;
    private long field_j;
    static ml field_b;
    static String field_l;
    static boolean field_q;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = Main.field_T;
        try {
          L0: {
            try {
              L1: {
                if (param1.length < param3 + param2) {
                  throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param2));
                } else {
                  if (param0 == -118) {
                    L2: {
                      if ((this.field_g ^ -1L) == 0L) {
                        break L2;
                      } else {
                        if ((this.field_i ^ -1L) > (this.field_g ^ -1L)) {
                          break L2;
                        } else {
                          if ((long)this.field_d + this.field_g >= this.field_i - -(long)param3) {
                            og.a(this.field_h, (int)(-this.field_g + this.field_i), param1, param2, param3);
                            this.field_i = this.field_i + (long)param3;
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L3: {
                      var5_long = this.field_i;
                      var7 = param2;
                      var8 = param3;
                      if ((this.field_i ^ -1L) > (this.field_p ^ -1L)) {
                        break L3;
                      } else {
                        if ((this.field_i ^ -1L) <= (this.field_p + (long)this.field_m ^ -1L)) {
                          break L3;
                        } else {
                          L4: {
                            var9_int = (int)(this.field_p - (this.field_i - (long)this.field_m));
                            if (var9_int > param3) {
                              var9_int = param3;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          og.a(this.field_e, (int)(this.field_i + -this.field_p), param1, param2, var9_int);
                          param3 = param3 - var9_int;
                          param2 = param2 + var9_int;
                          this.field_i = this.field_i + (long)var9_int;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (param3 > this.field_e.length) {
                        this.field_n.a(this.field_i, false);
                        this.field_f = this.field_i;
                        L6: while (true) {
                          if (param3 <= 0) {
                            break L5;
                          } else {
                            var9_int = this.field_n.a(param3, param1, param2, param0 + 117);
                            if (-1 == var9_int) {
                              break L5;
                            } else {
                              this.field_f = this.field_f + (long)var9_int;
                              param2 = param2 + var9_int;
                              this.field_i = this.field_i + (long)var9_int;
                              param3 = param3 - var9_int;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        if ((param3 ^ -1) < -1) {
                          L7: {
                            this.b(param0 + 118);
                            var9_int = param3;
                            if (this.field_m < var9_int) {
                              var9_int = this.field_m;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          og.a(this.field_e, 0, param1, param2, var9_int);
                          this.field_i = this.field_i + (long)var9_int;
                          param2 = param2 + var9_int;
                          param3 = param3 - var9_int;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if ((this.field_g ^ -1L) != 0L) {
                        L9: {
                          if (this.field_i >= this.field_g) {
                            break L9;
                          } else {
                            if (param3 > 0) {
                              L10: {
                                var9_int = (int)(-this.field_i + this.field_g) + param2;
                                if (param3 + param2 >= var9_int) {
                                  break L10;
                                } else {
                                  var9_int = param3 + param2;
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (var9_int <= param2) {
                                  break L9;
                                } else {
                                  incrementValue$1 = param2;
                                  param2++;
                                  param1[incrementValue$1] = (byte) 0;
                                  param3--;
                                  this.field_i = this.field_i + 1L;
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
                            if (var5_long > this.field_g) {
                              break L13;
                            } else {
                              if ((long)var8 + var5_long > this.field_g) {
                                var9 = this.field_g;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (var5_long < this.field_g) {
                            break L12;
                          } else {
                            if (var5_long < (long)this.field_d + this.field_g) {
                              var9 = var5_long;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if (var5_long >= this.field_g + (long)this.field_d) {
                              break L15;
                            } else {
                              if ((long)var8 + var5_long < (long)this.field_d + this.field_g) {
                                break L15;
                              } else {
                                var11 = this.field_g - -(long)this.field_d;
                                break L14;
                              }
                            }
                          }
                          if ((var5_long - -(long)var8 ^ -1L) >= (this.field_g ^ -1L)) {
                            break L14;
                          } else {
                            if ((this.field_g - -(long)this.field_d ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                              var11 = var5_long + (long)var8;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (-1L >= var9) {
                          break L8;
                        } else {
                          if (var11 <= var9) {
                            break L8;
                          } else {
                            var13 = (int)(var11 - var9);
                            og.a(this.field_h, (int)(var9 - this.field_g), param1, (int)(var9 - var5_long) + var7, var13);
                            if (this.field_i >= var11) {
                              break L8;
                            } else {
                              param3 = (int)((long)param3 - (-this.field_i + var11));
                              this.field_i = var11;
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
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_f = -1L;
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
                if (-1 > (param3 ^ -1)) {
                  throw new EOFException();
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var5_ref);
            stackOut_63_1 = new StringBuilder().append("tk.I(").append(param0).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param2 + ',' + param3 + ')');
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

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var10 = Main.field_T;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_j ^ -1L) > (this.field_i + (long)param2 ^ -1L)) {
                    this.field_j = (long)param2 + this.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_g ^ -1L) == 0L) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_g ^ -1L) < (this.field_i ^ -1L)) {
                        break L4;
                      } else {
                        if ((this.field_i ^ -1L) < ((long)this.field_d + this.field_g ^ -1L)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.c(param3 + 102);
                    break L3;
                  }
                }
                L5: {
                  if ((long)param3 == this.field_g) {
                    break L5;
                  } else {
                    if ((long)this.field_h.length + this.field_g >= (long)param2 + this.field_i) {
                      break L5;
                    } else {
                      var5_int = (int)((long)this.field_h.length + -this.field_i + this.field_g);
                      og.a(param0, param1, this.field_h, (int)(-this.field_g + this.field_i), var5_int);
                      param2 = param2 - var5_int;
                      param1 = param1 + var5_int;
                      this.field_i = this.field_i + (long)var5_int;
                      this.field_d = this.field_h.length;
                      this.c(-122);
                      break L5;
                    }
                  }
                }
                if (this.field_h.length < param2) {
                  L6: {
                    if ((this.field_i ^ -1L) == (this.field_f ^ -1L)) {
                      break L6;
                    } else {
                      this.field_n.a(this.field_i, false);
                      this.field_f = this.field_i;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_n.b(param1, param0, 0, param2);
                    this.field_f = this.field_f + (long)param2;
                    if ((this.field_f ^ -1L) >= (this.field_k ^ -1L)) {
                      break L7;
                    } else {
                      this.field_k = this.field_f;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      if ((this.field_i ^ -1L) > (this.field_p ^ -1L)) {
                        break L9;
                      } else {
                        if (this.field_p + (long)this.field_m <= this.field_i) {
                          break L9;
                        } else {
                          var5_long = this.field_i;
                          break L8;
                        }
                      }
                    }
                    if (this.field_i > this.field_p) {
                      break L8;
                    } else {
                      if (this.field_i - -(long)param2 <= this.field_p) {
                        break L8;
                      } else {
                        var5_long = this.field_p;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var7 = -1L;
                      if (((long)param2 + this.field_i ^ -1L) >= (this.field_p ^ -1L)) {
                        break L11;
                      } else {
                        if (((long)this.field_m + this.field_p ^ -1L) <= (this.field_i - -(long)param2 ^ -1L)) {
                          var7 = (long)param2 + this.field_i;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if ((this.field_i ^ -1L) <= (this.field_p + (long)this.field_m ^ -1L)) {
                      break L10;
                    } else {
                      if (this.field_i - -(long)param2 < (long)this.field_m + this.field_p) {
                        break L10;
                      } else {
                        var7 = (long)this.field_m + this.field_p;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L12;
                    } else {
                      if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                        break L12;
                      } else {
                        var9 = (int)(-var5_long + var7);
                        og.a(param0, (int)((long)param1 + (var5_long + -this.field_i)), this.field_e, (int)(var5_long + -this.field_p), var9);
                        break L12;
                      }
                    }
                  }
                  this.field_i = this.field_i + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (0 < param2) {
                    L13: {
                      if (this.field_g == -1L) {
                        this.field_g = this.field_i;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      og.a(param0, param1, this.field_h, (int)(this.field_i + -this.field_g), param2);
                      this.field_i = this.field_i + (long)param2;
                      if (((long)this.field_d ^ -1L) > (this.field_i + -this.field_g ^ -1L)) {
                        this.field_d = (int)(this.field_i - this.field_g);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_f = -1L;
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
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var5_ref);
            stackOut_48_1 = new StringBuilder().append("tk.H(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L15;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L15;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final long b(byte param0) {
        if (param0 != -95) {
            return 121L;
        }
        return this.field_j;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            this.a((byte) -118, param1, param0, param1.length);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "tk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Main.field_T;
          if (-1L != this.field_g) {
            L1: {
              if (this.field_f == this.field_g) {
                break L1;
              } else {
                this.field_n.a(this.field_g, false);
                this.field_f = this.field_g;
                break L1;
              }
            }
            L2: {
              this.field_n.b(0, this.field_h, 0, this.field_d);
              this.field_f = this.field_f + (long)this.field_d;
              if ((this.field_k ^ -1L) <= (this.field_f ^ -1L)) {
                break L2;
              } else {
                this.field_k = this.field_f;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                var4 = -1L;
                if ((this.field_p ^ -1L) < (this.field_g ^ -1L)) {
                  break L4;
                } else {
                  if ((this.field_g ^ -1L) > (this.field_p - -(long)this.field_m ^ -1L)) {
                    var2_long = this.field_g;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((this.field_g ^ -1L) < (this.field_p ^ -1L)) {
                break L3;
              } else {
                if ((this.field_p ^ -1L) > (this.field_g + (long)this.field_d ^ -1L)) {
                  var2_long = this.field_p;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((this.field_g - -(long)this.field_d ^ -1L) >= (this.field_p ^ -1L)) {
                  break L6;
                } else {
                  if (((long)this.field_m + this.field_p ^ -1L) <= ((long)this.field_d + this.field_g ^ -1L)) {
                    var4 = (long)this.field_d + this.field_g;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (this.field_g >= (long)this.field_m + this.field_p) {
                break L5;
              } else {
                if (this.field_g + (long)this.field_d >= this.field_p + (long)this.field_m) {
                  var4 = this.field_p - -(long)this.field_m;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2_long ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var2_long < var4) {
                  var6 = (int)(var4 + -var2_long);
                  og.a(this.field_h, (int)(var2_long + -this.field_g), this.field_e, (int)(-this.field_p + var2_long), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_g = -1L;
            this.field_d = 0;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = -69 / ((param0 - 38) / 54);
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -1) {
              L1: {
                oc.a((java.awt.Component) ((Object) param0), (byte) 6);
                qa.a((java.awt.Component) ((Object) param0), (byte) 119);
                if (Main.field_V == null) {
                  break L1;
                } else {
                  Main.field_V.a(0, (java.awt.Component) ((Object) param0));
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("tk.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        field_b = null;
        if (param0 != -1) {
            field_q = false;
        }
    }

    tk(wk param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_p = -1L;
        this.field_d = 0;
        try {
            this.field_n = param0;
            dupTemp$0 = param0.a(11311);
            this.field_k = dupTemp$0;
            this.field_j = dupTemp$0;
            this.field_i = 0L;
            this.field_h = new byte[param2];
            this.field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) throws IOException {
        this.c(-44);
        if (param0 > -25) {
            field_c = -80;
        }
        this.field_n.a((byte) 15);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Main.field_T;
          this.field_m = param0;
          if ((this.field_f ^ -1L) != (this.field_i ^ -1L)) {
            this.field_n.a(this.field_i, false);
            this.field_f = this.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_p = this.field_i;
        L1: while (true) {
          L2: {
            if (this.field_m >= this.field_e.length) {
              break L2;
            } else {
              L3: {
                var2 = this.field_e.length - this.field_m;
                if (var2 > 200000000) {
                  var2 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = this.field_n.a(var2, this.field_e, this.field_m, -1);
              if (-1 == var3) {
                break L2;
              } else {
                this.field_m = this.field_m + var3;
                this.field_f = this.field_f + (long)var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = -66 / ((-27 - param1) / 35);
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        this.field_i = param0;
    }

    static {
        field_c = 1;
        field_a = 1;
        field_b = new ml();
        field_q = false;
        field_l = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private byte[] field_e;
    private long field_k;
    private int field_j;
    private long field_m;
    private byte[] field_l;
    private long field_a;
    private long field_d;
    private long field_b;
    private int field_f;
    private fm field_g;
    private long field_c;
    static int[] field_h;
    static String field_i;

    final void c(int param0) throws IOException {
        this.a(0);
        this.field_g.b(0);
        if (param0 >= -77) {
            this.field_a = -48L;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
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
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == 9) {
              try {
                L1: {
                  L2: {
                    if ((this.field_c - -(long)param0 ^ -1L) < (this.field_m ^ -1L)) {
                      this.field_m = (long)param0 + this.field_c;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (this.field_a == -1L) {
                      break L3;
                    } else {
                      if ((this.field_c ^ -1L) <= (this.field_a ^ -1L)) {
                        if (this.field_c <= this.field_a + (long)this.field_f) {
                          break L3;
                        } else {
                          this.a(0);
                          break L3;
                        }
                      } else {
                        this.a(0);
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (0L == (this.field_a ^ -1L)) {
                      break L4;
                    } else {
                      if (((long)this.field_l.length + this.field_a ^ -1L) > ((long)param0 + this.field_c ^ -1L)) {
                        var5_int = (int)(this.field_a - (this.field_c - (long)this.field_l.length));
                        lj.a(param3, param2, this.field_l, (int)(this.field_c + -this.field_a), var5_int);
                        param0 = param0 - var5_int;
                        param2 = param2 + var5_int;
                        this.field_c = this.field_c + (long)var5_int;
                        this.field_f = this.field_l.length;
                        this.a(0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (this.field_l.length < param0) {
                    L5: {
                      if ((this.field_c ^ -1L) != (this.field_b ^ -1L)) {
                        this.field_g.a(-54, this.field_c);
                        this.field_b = this.field_c;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      this.field_g.a(-20832, param0, param3, param2);
                      this.field_b = this.field_b + (long)param0;
                      if (this.field_k < this.field_b) {
                        this.field_k = this.field_b;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var5_long = -1L;
                        if (this.field_c < this.field_d) {
                          break L8;
                        } else {
                          if (((long)this.field_j + this.field_d ^ -1L) < (this.field_c ^ -1L)) {
                            var5_long = this.field_c;
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (this.field_d < this.field_c) {
                        break L7;
                      } else {
                        if (this.field_c - -(long)param0 <= this.field_d) {
                          break L7;
                        } else {
                          var5_long = this.field_d;
                          break L7;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        var7 = -1L;
                        if (((long)param0 + this.field_c ^ -1L) >= (this.field_d ^ -1L)) {
                          break L10;
                        } else {
                          if ((this.field_c + (long)param0 ^ -1L) < (this.field_d + (long)this.field_j ^ -1L)) {
                            break L10;
                          } else {
                            var7 = this.field_c + (long)param0;
                            break L9;
                          }
                        }
                      }
                      if (this.field_c >= (long)this.field_j + this.field_d) {
                        break L9;
                      } else {
                        if (this.field_c + (long)param0 >= (long)this.field_j + this.field_d) {
                          var7 = this.field_d - -(long)this.field_j;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (0L <= (var5_long ^ -1L)) {
                        break L11;
                      } else {
                        if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                          break L11;
                        } else {
                          var9 = (int)(var7 - var5_long);
                          lj.a(param3, (int)((long)param2 + var5_long - this.field_c), this.field_e, (int)(var5_long + -this.field_d), var9);
                          break L11;
                        }
                      }
                    }
                    this.field_c = this.field_c + (long)param0;
                    decompiledRegionSelector0 = 0;
                    break L1;
                  } else {
                    if (param0 > 0) {
                      L12: {
                        if (-1L == this.field_a) {
                          this.field_a = this.field_c;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        lj.a(param3, param2, this.field_l, (int)(this.field_c + -this.field_a), param0);
                        this.field_c = this.field_c + (long)param0;
                        if ((-this.field_a + this.field_c ^ -1L) >= ((long)this.field_f ^ -1L)) {
                          break L13;
                        } else {
                          this.field_f = (int)(-this.field_a + this.field_c);
                          break L13;
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
                this.field_b = -1L;
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
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var5_ref);

            stackIn_56_1 = new StringBuilder().append("pf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L14;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L14;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ')');
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

    final void a(byte param0, long param1) throws IOException {
        CharSequence[] var5;
        if (0L > param1) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == 123) {
              break L0;
            } else {
              var5 = (CharSequence[]) null;
              pf.a(-121, (CharSequence[]) null);
              break L0;
            }
          }
          this.field_c = param1;
          return;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        CharSequence[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11739) {
                break L1;
              } else {
                var3 = (CharSequence[]) null;
                pf.a(-18, (CharSequence[]) null);
                break L1;
              }
            }
            stackIn_3_0 = fc.a(param1, -2, 0, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pf.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final long b(byte param0) {
        if (param0 < 95) {
            CharSequence[] var3 = (CharSequence[]) null;
            pf.a(-91, (CharSequence[]) null);
        }
        return this.field_m;
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
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
        var14 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 83) {
                break L1;
              } else {
                this.field_g = (fm) null;
                break L1;
              }
            }
            try {
              L2: {
                if (param1.length >= param0 + param3) {
                  L3: {
                    if ((this.field_a ^ -1L) == 0L) {
                      break L3;
                    } else {
                      if (this.field_c < this.field_a) {
                        break L3;
                      } else {
                        if (((long)param3 + this.field_c ^ -1L) < (this.field_a + (long)this.field_f ^ -1L)) {
                          break L3;
                        } else {
                          lj.a(this.field_l, (int)(this.field_c + -this.field_a), param1, param0, param3);
                          this.field_c = this.field_c + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      }
                    }
                  }
                  L4: {
                    var5_long = this.field_c;
                    var7 = param0;
                    var8 = param3;
                    if ((this.field_c ^ -1L) > (this.field_d ^ -1L)) {
                      break L4;
                    } else {
                      if ((this.field_c ^ -1L) > (this.field_d - -(long)this.field_j ^ -1L)) {
                        L5: {
                          var9_int = (int)((long)this.field_j + (this.field_d + -this.field_c));
                          if (param3 >= var9_int) {
                            break L5;
                          } else {
                            var9_int = param3;
                            break L5;
                          }
                        }
                        lj.a(this.field_e, (int)(-this.field_d + this.field_c), param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        this.field_c = this.field_c + (long)var9_int;
                        param3 = param3 - var9_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (this.field_e.length < param3) {
                      this.field_g.a(100, this.field_c);
                      this.field_b = this.field_c;
                      L7: while (true) {
                        if ((param3 ^ -1) >= -1) {
                          break L6;
                        } else {
                          var9_int = this.field_g.a(false, param1, param0, param3);
                          if (var9_int != -1) {
                            param3 = param3 - var9_int;
                            param0 = param0 + var9_int;
                            this.field_b = this.field_b + (long)var9_int;
                            this.field_c = this.field_c + (long)var9_int;
                            continue L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    } else {
                      if ((param3 ^ -1) >= -1) {
                        break L6;
                      } else {
                        L8: {
                          this.a((byte) -55);
                          var9_int = param3;
                          if (var9_int <= this.field_j) {
                            break L8;
                          } else {
                            var9_int = this.field_j;
                            break L8;
                          }
                        }
                        lj.a(this.field_e, 0, param1, param0, var9_int);
                        this.field_c = this.field_c + (long)var9_int;
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if ((this.field_a ^ -1L) != 0L) {
                      L10: {
                        if ((this.field_c ^ -1L) <= (this.field_a ^ -1L)) {
                          break L10;
                        } else {
                          if (-1 > (param3 ^ -1)) {
                            L11: {
                              var9_int = param0 - -(int)(this.field_a + -this.field_c);
                              if (var9_int > param3 + param0) {
                                var9_int = param0 - -param3;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (param0 >= var9_int) {
                                break L10;
                              } else {
                                incrementValue$0 = param0;
                                param0++;
                                param1[incrementValue$0] = (byte) 0;
                                param3--;
                                this.field_c = this.field_c + 1L;
                                continue L12;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          var9 = -1L;
                          if (var5_long > this.field_a) {
                            break L14;
                          } else {
                            if ((this.field_a ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                              var9 = this.field_a;
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if ((this.field_a ^ -1L) < (var5_long ^ -1L)) {
                          break L13;
                        } else {
                          if ((long)this.field_f + this.field_a <= var5_long) {
                            break L13;
                          } else {
                            var9 = var5_long;
                            break L13;
                          }
                        }
                      }
                      L15: {
                        L16: {
                          var11 = -1L;
                          if (this.field_a + (long)this.field_f <= var5_long) {
                            break L16;
                          } else {
                            if ((var5_long + (long)var8 ^ -1L) <= (this.field_a + (long)this.field_f ^ -1L)) {
                              var11 = (long)this.field_f + this.field_a;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if ((this.field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                          break L15;
                        } else {
                          if (this.field_a + (long)this.field_f >= (long)var8 + var5_long) {
                            var11 = (long)var8 + var5_long;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (var9 <= -1L) {
                        break L9;
                      } else {
                        if ((var9 ^ -1L) > (var11 ^ -1L)) {
                          var13 = (int)(-var9 + var11);
                          lj.a(this.field_l, (int)(-this.field_a + var9), param1, var7 + (int)(var9 - var5_long), var13);
                          if ((var11 ^ -1L) < (this.field_c ^ -1L)) {
                            param3 = (int)((long)param3 - (var11 - this.field_c));
                            this.field_c = var11;
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L2;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param0 + (param3 - param1.length));
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_b = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var5_ref);

            stackIn_65_1 = new StringBuilder().append("pf.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L17;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L17;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != -4) {
            return;
        }
        try {
            this.a(0, param0, (byte) 123, param0.length);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "pf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        this.field_j = 0;
        if (this.field_c != this.field_b) {
            this.field_g.a(-125, this.field_c);
            this.field_b = this.field_c;
        }
        if (param0 >= -31) {
            this.field_e = (byte[]) null;
        }
        this.field_d = this.field_c;
        while (this.field_j < this.field_e.length) {
            var2 = this.field_e.length - this.field_j;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = this.field_g.a(false, this.field_e, this.field_j, var2);
            if ((var3 ^ -1) == 0) {
                break;
            }
            this.field_j = this.field_j + var3;
            this.field_b = this.field_b + (long)var3;
        }
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (-1L != this.field_a) {
            L1: {
              if ((this.field_b ^ -1L) != (this.field_a ^ -1L)) {
                this.field_g.a(113, this.field_a);
                this.field_b = this.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_g.a(-20832, this.field_f, this.field_l, 0);
              this.field_b = this.field_b + (long)this.field_f;
              if ((this.field_k ^ -1L) > (this.field_b ^ -1L)) {
                this.field_k = this.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (this.field_d > this.field_a) {
                  break L4;
                } else {
                  if (((long)this.field_j + this.field_d ^ -1L) >= (this.field_a ^ -1L)) {
                    break L4;
                  } else {
                    var2 = this.field_a;
                    break L3;
                  }
                }
              }
              if (this.field_a > this.field_d) {
                break L3;
              } else {
                if ((this.field_d ^ -1L) <= (this.field_a - -(long)this.field_f ^ -1L)) {
                  break L3;
                } else {
                  var2 = this.field_d;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((this.field_d ^ -1L) <= ((long)this.field_f + this.field_a ^ -1L)) {
                  break L6;
                } else {
                  if ((this.field_a - -(long)this.field_f ^ -1L) < (this.field_d + (long)this.field_j ^ -1L)) {
                    break L6;
                  } else {
                    var4 = this.field_a - -(long)this.field_f;
                    break L5;
                  }
                }
              }
              if ((long)this.field_j + this.field_d <= this.field_a) {
                break L5;
              } else {
                if (((long)this.field_j + this.field_d ^ -1L) >= (this.field_a + (long)this.field_f ^ -1L)) {
                  var4 = (long)this.field_j + this.field_d;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if ((var2 ^ -1L) > (var4 ^ -1L)) {
                  var6 = (int)(var4 - var2);
                  lj.a(this.field_l, (int)(var2 + -this.field_a), this.field_e, (int)(var2 - this.field_d), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_f = 0;
            this.field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 == 0) {
            break L8;
          } else {
            this.field_f = -20;
            break L8;
          }
        }
    }

    public static void b(int param0) {
        if (param0 > -42) {
            return;
        }
        field_i = null;
        field_h = null;
    }

    pf(fm param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = -1L;
        this.field_f = 0;
        this.field_d = -1L;
        try {
            this.field_g = param0;
            dupTemp$0 = param0.a((byte) -115);
            this.field_k = dupTemp$0;
            this.field_m = dupTemp$0;
            this.field_l = new byte[param2];
            this.field_c = 0L;
            this.field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = new int[]{0, 0, 640, 0, 640, 376, 0, 376};
        field_i = "Hold <col=FFFFFF>Ctrl</col> to fire!";
    }
}

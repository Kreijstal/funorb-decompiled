/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class of {
    private long field_m;
    static ja[] field_e;
    private long field_j;
    private byte[] field_i;
    private long field_b;
    private int field_n;
    private long field_c;
    private mc field_o;
    static ja field_k;
    private int field_a;
    static ma field_d;
    private long field_h;
    private byte[] field_f;
    static String field_p;
    static int field_g;
    private long field_l;

    final void a(long param0, byte param1) throws IOException {
        java.awt.Component var5;
        L0: {
          if (param1 == -70) {
            break L0;
          } else {
            var5 = (java.awt.Component) null;
            of.a(-66, (java.awt.Component) null);
            break L0;
          }
        }
        if ((param0 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          this.field_h = param0;
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param2.length >= param0 + param1) {
                  L2: {
                    if (-1L == this.field_m) {
                      break L2;
                    } else {
                      if ((this.field_m ^ -1L) < (this.field_h ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_h - -(long)param0 > (long)this.field_a + this.field_m) {
                          break L2;
                        } else {
                          d.a(this.field_f, (int)(this.field_h - this.field_m), param2, param1, param0);
                          this.field_h = this.field_h + (long)param0;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_int = -124 / ((param3 - -37) / 57);
                    var6 = this.field_h;
                    var8 = param1;
                    var9 = param0;
                    if ((this.field_h ^ -1L) > (this.field_l ^ -1L)) {
                      break L3;
                    } else {
                      if ((this.field_l + (long)this.field_n ^ -1L) < (this.field_h ^ -1L)) {
                        L4: {
                          var10_int = (int)(-this.field_h + (this.field_l + (long)this.field_n));
                          if (param0 < var10_int) {
                            var10_int = param0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        d.a(this.field_i, (int)(-this.field_l + this.field_h), param2, param1, var10_int);
                        this.field_h = this.field_h + (long)var10_int;
                        param1 = param1 + var10_int;
                        param0 = param0 - var10_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (this.field_i.length < param0) {
                      this.field_o.a((byte) -127, this.field_h);
                      this.field_c = this.field_h;
                      L6: while (true) {
                        if (param0 <= 0) {
                          break L5;
                        } else {
                          var10_int = this.field_o.a(param0, param2, -1, param1);
                          if ((var10_int ^ -1) == 0) {
                            break L5;
                          } else {
                            param0 = param0 - var10_int;
                            this.field_h = this.field_h + (long)var10_int;
                            this.field_c = this.field_c + (long)var10_int;
                            param1 = param1 + var10_int;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      if (0 < param0) {
                        L7: {
                          this.b(-8855);
                          var10_int = param0;
                          if (var10_int <= this.field_n) {
                            break L7;
                          } else {
                            var10_int = this.field_n;
                            break L7;
                          }
                        }
                        d.a(this.field_i, 0, param2, param1, var10_int);
                        param0 = param0 - var10_int;
                        param1 = param1 + var10_int;
                        this.field_h = this.field_h + (long)var10_int;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (0L != (this.field_m ^ -1L)) {
                      L9: {
                        if ((this.field_m ^ -1L) >= (this.field_h ^ -1L)) {
                          break L9;
                        } else {
                          if (-1 > (param0 ^ -1)) {
                            L10: {
                              var10_int = param1 + (int)(-this.field_h + this.field_m);
                              if (param1 + param0 >= var10_int) {
                                break L10;
                              } else {
                                var10_int = param1 + param0;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (var10_int <= param1) {
                                break L9;
                              } else {
                                param0--;
                                incrementValue$0 = param1;
                                param1++;
                                param2[incrementValue$0] = (byte) 0;
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
                          var10 = -1L;
                          if ((var6 ^ -1L) < (this.field_m ^ -1L)) {
                            break L13;
                          } else {
                            if (this.field_m < var6 + (long)var9) {
                              var10 = this.field_m;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if ((var6 ^ -1L) > (this.field_m ^ -1L)) {
                          break L12;
                        } else {
                          if (((long)this.field_a + this.field_m ^ -1L) < (var6 ^ -1L)) {
                            var10 = var6;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          var12 = -1L;
                          if ((var6 ^ -1L) <= (this.field_m - -(long)this.field_a ^ -1L)) {
                            break L15;
                          } else {
                            if ((long)var9 + var6 < (long)this.field_a + this.field_m) {
                              break L15;
                            } else {
                              var12 = (long)this.field_a + this.field_m;
                              break L14;
                            }
                          }
                        }
                        if ((this.field_m ^ -1L) <= (var6 + (long)var9 ^ -1L)) {
                          break L14;
                        } else {
                          if (((long)this.field_a + this.field_m ^ -1L) <= (var6 + (long)var9 ^ -1L)) {
                            var12 = var6 + (long)var9;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (-1L >= var10) {
                        break L8;
                      } else {
                        if (var12 > var10) {
                          var14 = (int)(-var10 + var12);
                          d.a(this.field_f, (int)(-this.field_m + var10), param2, (int)(-var6 + var10) + var8, var14);
                          if (this.field_h < var12) {
                            param0 = (int)((long)param0 - (var12 - this.field_h));
                            this.field_h = var12;
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param1 - (-param0 + param2.length));
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_c = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if ((param0 ^ -1) < -1) {
                throw new EOFException();
              } else {
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var5_ref);

            stackIn_63_1 = new StringBuilder().append("of.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L16;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L16;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        we.field_k = new th();
        if (param0 < 97) {
            java.awt.Component var2 = (java.awt.Component) null;
            of.a(116, (java.awt.Component) null);
        }
    }

    final void a(byte param0) throws IOException {
        this.c((byte) -23);
        this.field_o.b((byte) 38);
        if (param0 >= -84) {
            of.a(-119);
        }
    }

    private final void c(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_m == -1L) {
            break L0;
          } else {
            L1: {
              if ((this.field_c ^ -1L) == (this.field_m ^ -1L)) {
                break L1;
              } else {
                this.field_o.a((byte) -127, this.field_m);
                this.field_c = this.field_m;
                break L1;
              }
            }
            L2: {
              this.field_o.a((byte) 74, 0, this.field_a, this.field_f);
              this.field_c = this.field_c + (long)this.field_a;
              if ((this.field_c ^ -1L) < (this.field_b ^ -1L)) {
                this.field_b = this.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((this.field_m ^ -1L) > (this.field_l ^ -1L)) {
                  break L4;
                } else {
                  if ((this.field_m ^ -1L) > ((long)this.field_n + this.field_l ^ -1L)) {
                    var2 = this.field_m;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (this.field_l < this.field_m) {
                break L3;
              } else {
                if (((long)this.field_a + this.field_m ^ -1L) >= (this.field_l ^ -1L)) {
                  break L3;
                } else {
                  var2 = this.field_l;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((this.field_l ^ -1L) <= ((long)this.field_a + this.field_m ^ -1L)) {
                  break L6;
                } else {
                  if ((long)this.field_n + this.field_l >= this.field_m - -(long)this.field_a) {
                    var4 = this.field_m - -(long)this.field_a;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (this.field_l + (long)this.field_n <= this.field_m) {
                break L5;
              } else {
                if (this.field_m - -(long)this.field_a >= this.field_l + (long)this.field_n) {
                  var4 = this.field_l - -(long)this.field_n;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (0L <= (var2 ^ -1L)) {
                break L7;
              } else {
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  d.a(this.field_f, (int)(-this.field_m + var2), this.field_i, (int)(-this.field_l + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_a = 0;
            this.field_m = -1L;
            break L0;
          }
        }
        L8: {
          if (param0 == -23) {
            break L8;
          } else {
            of.a(34);
            break L8;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_j < this.field_h - -(long)param1) {
                    this.field_j = this.field_h + (long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0L == (this.field_m ^ -1L)) {
                    break L3;
                  } else {
                    if (this.field_m <= this.field_h) {
                      if ((this.field_h ^ -1L) >= ((long)this.field_a + this.field_m ^ -1L)) {
                        break L3;
                      } else {
                        this.c((byte) -23);
                        break L3;
                      }
                    } else {
                      this.c((byte) -23);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_m == (long)param0) {
                    break L4;
                  } else {
                    if (this.field_h - -(long)param1 > (long)this.field_f.length + this.field_m) {
                      var5_int = (int)(-this.field_h + (this.field_m + (long)this.field_f.length));
                      d.a(param3, param2, this.field_f, (int)(this.field_h + -this.field_m), var5_int);
                      param2 = param2 + var5_int;
                      param1 = param1 - var5_int;
                      this.field_h = this.field_h + (long)var5_int;
                      this.field_a = this.field_f.length;
                      this.c((byte) -23);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (param1 > this.field_f.length) {
                  L5: {
                    if ((this.field_h ^ -1L) == (this.field_c ^ -1L)) {
                      break L5;
                    } else {
                      this.field_o.a((byte) -126, this.field_h);
                      this.field_c = this.field_h;
                      break L5;
                    }
                  }
                  L6: {
                    this.field_o.a((byte) 110, param2, param1, param3);
                    this.field_c = this.field_c + (long)param1;
                    if (this.field_b < this.field_c) {
                      this.field_b = this.field_c;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var5_long = -1L;
                      if ((this.field_l ^ -1L) < (this.field_h ^ -1L)) {
                        break L8;
                      } else {
                        if (this.field_h >= this.field_l + (long)this.field_n) {
                          break L8;
                        } else {
                          var5_long = this.field_h;
                          break L7;
                        }
                      }
                    }
                    if (this.field_h > this.field_l) {
                      break L7;
                    } else {
                      if (this.field_l < (long)param1 + this.field_h) {
                        var5_long = this.field_l;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      var7 = -1L;
                      if (this.field_l >= (long)param1 + this.field_h) {
                        break L10;
                      } else {
                        if ((this.field_l - -(long)this.field_n ^ -1L) <= (this.field_h - -(long)param1 ^ -1L)) {
                          var7 = (long)param1 + this.field_h;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (this.field_h >= this.field_l - -(long)this.field_n) {
                      break L9;
                    } else {
                      if (this.field_l - -(long)this.field_n <= this.field_h + (long)param1) {
                        var7 = this.field_l - -(long)this.field_n;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L11;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(var7 + -var5_long);
                        d.a(param3, (int)(-this.field_h + (var5_long + (long)param2)), this.field_i, (int)(-this.field_l + var5_long), var9);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (0 < param1) {
                    L12: {
                      if ((this.field_m ^ -1L) != 0L) {
                        break L12;
                      } else {
                        this.field_m = this.field_h;
                        break L12;
                      }
                    }
                    L13: {
                      d.a(param3, param2, this.field_f, (int)(this.field_h - this.field_m), param1);
                      this.field_h = this.field_h + (long)param1;
                      if ((long)this.field_a >= -this.field_m + this.field_h) {
                        break L13;
                      } else {
                        this.field_a = (int)(this.field_h - this.field_m);
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
              this.field_c = -1L;
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
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var5_ref);

            stackIn_54_1 = new StringBuilder().append("of.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L14;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
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

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            this.a(param0.length, 0, param0, -117);
            int var3_int = -85 % ((70 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "of.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_n = 0;
          if ((this.field_h ^ -1L) == (this.field_c ^ -1L)) {
            break L0;
          } else {
            this.field_o.a((byte) -128, this.field_h);
            this.field_c = this.field_h;
            break L0;
          }
        }
        this.field_l = this.field_h;
        L1: while (true) {
          L2: {
            if (this.field_n >= this.field_i.length) {
              break L2;
            } else {
              L3: {
                var2 = -this.field_n + this.field_i.length;
                if (-200000001 > (var2 ^ -1)) {
                  var2 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = this.field_o.a(var2, this.field_i, -1, this.field_n);
              if (-1 == var3) {
                break L2;
              } else {
                this.field_c = this.field_c + (long)var3;
                this.field_n = this.field_n + var3;
                continue L1;
              }
            }
          }
          L4: {
            if (param0 == -8855) {
              break L4;
            } else {
              of.d(56);
              break L4;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_g = 68;
        }
        field_k = null;
        field_p = null;
        field_d = null;
        field_e = null;
    }

    final long c(int param0) {
        if (param0 != -1) {
            this.field_j = -25L;
        }
        return this.field_j;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(on.field_Z);
            param1.removeMouseMotionListener(on.field_Z);
            param1.removeFocusListener(on.field_Z);
            hh.field_e = 0;
            if (param0 != -1693) {
                field_e = (ja[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "of.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    of(mc param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_a = 0;
        this.field_l = -1L;
        try {
            this.field_o = param0;
            dupTemp$0 = param0.a(-111);
            this.field_b = dupTemp$0;
            this.field_j = dupTemp$0;
            this.field_f = new byte[param2];
            this.field_i = new byte[param1];
            this.field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static gh d(int param0) {
        if (mp.field_b != id.field_B) {
          if (param0 == 0) {
            if (oi.field_j != id.field_B) {
              return null;
            } else {
              id.field_B = mp.field_b;
              return iq.field_c;
            }
          } else {
            return (gh) null;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        field_e = new ja[5];
        field_p = "Friends";
        field_d = new ma();
    }
}

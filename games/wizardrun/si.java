/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si {
    private long field_m;
    static String field_b;
    private long field_p;
    private byte[] field_k;
    private byte[] field_a;
    static int field_h;
    private long field_n;
    static String field_g;
    static int field_f;
    private long field_d;
    static hi field_q;
    private int field_l;
    static je[] field_j;
    private int field_i;
    private long field_c;
    private ri field_o;
    private long field_e;

    final void a(byte[] param0, int param1) throws IOException {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(0, param0, param0.length, (byte) 47);
              if (param1 == 9350) {
                break L1;
              } else {
                field_j = (je[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("si.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(long param0, byte param1) throws IOException {
        int var4 = -121 / ((param1 - -9) / 48);
        if (!(0L <= param0)) {
            throw new IOException();
        }
        this.field_e = param0;
    }

    public static void a(byte param0) {
        kl discarded$0 = null;
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 != -92) {
            discarded$0 = si.a(-38, 97);
        }
        field_q = null;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = wizardrun.field_H;
        try {
          L0: {
            try {
              L1: {
                if (param0 == 18729) {
                  L2: {
                    if (((long)param2 + this.field_e ^ -1L) < (this.field_n ^ -1L)) {
                      this.field_n = (long)param2 + this.field_e;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (0L == (this.field_m ^ -1L)) {
                      break L3;
                    } else {
                      L4: {
                        if ((this.field_e ^ -1L) > (this.field_m ^ -1L)) {
                          break L4;
                        } else {
                          if ((this.field_m + (long)this.field_i ^ -1L) <= (this.field_e ^ -1L)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.b(param0 + -24430);
                      break L3;
                    }
                  }
                  L5: {
                    if (this.field_m == -1L) {
                      break L5;
                    } else {
                      if ((long)this.field_k.length + this.field_m < (long)param2 + this.field_e) {
                        var5_int = (int)(-this.field_e + (this.field_m + (long)this.field_k.length));
                        g.a(param1, param3, this.field_k, (int)(this.field_e + -this.field_m), var5_int);
                        param2 = param2 - var5_int;
                        this.field_e = this.field_e + (long)var5_int;
                        param3 = param3 + var5_int;
                        this.field_i = this.field_k.length;
                        this.b(param0 ^ -24430);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (this.field_k.length < param2) {
                    L6: {
                      if (this.field_p == this.field_e) {
                        break L6;
                      } else {
                        this.field_o.a(this.field_e, (byte) -24);
                        this.field_p = this.field_e;
                        break L6;
                      }
                    }
                    L7: {
                      this.field_o.a(param2, param1, true, param3);
                      this.field_p = this.field_p + (long)param2;
                      if (this.field_d >= this.field_p) {
                        break L7;
                      } else {
                        this.field_d = this.field_p;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var5_long = -1L;
                        var7 = -1L;
                        if (this.field_e < this.field_c) {
                          break L9;
                        } else {
                          if ((this.field_c - -(long)this.field_l ^ -1L) < (this.field_e ^ -1L)) {
                            var5_long = this.field_e;
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (this.field_e > this.field_c) {
                        break L8;
                      } else {
                        if (this.field_c >= this.field_e + (long)param2) {
                          break L8;
                        } else {
                          var5_long = this.field_c;
                          break L8;
                        }
                      }
                    }
                    L10: {
                      L11: {
                        if ((this.field_e - -(long)param2 ^ -1L) >= (this.field_c ^ -1L)) {
                          break L11;
                        } else {
                          if (((long)param2 + this.field_e ^ -1L) >= (this.field_c - -(long)this.field_l ^ -1L)) {
                            var7 = (long)param2 + this.field_e;
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (((long)this.field_l + this.field_c ^ -1L) >= (this.field_e ^ -1L)) {
                        break L10;
                      } else {
                        if ((this.field_c - -(long)this.field_l ^ -1L) >= ((long)param2 + this.field_e ^ -1L)) {
                          var7 = (long)this.field_l + this.field_c;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L12: {
                      if ((var5_long ^ -1L) >= 0L) {
                        break L12;
                      } else {
                        if (var7 > var5_long) {
                          var9 = (int)(var7 - var5_long);
                          g.a(param1, (int)(var5_long + (long)param3 - this.field_e), this.field_a, (int)(var5_long - this.field_c), var9);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_e = this.field_e + (long)param2;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    if (0 >= param2) {
                      decompiledRegionSelector0 = 2;
                      break L1;
                    } else {
                      L13: {
                        if (this.field_m == -1L) {
                          this.field_m = this.field_e;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        g.a(param1, param3, this.field_k, (int)(this.field_e + -this.field_m), param2);
                        this.field_e = this.field_e + (long)param2;
                        if (this.field_e + -this.field_m <= (long)this.field_i) {
                          break L14;
                        } else {
                          this.field_i = (int)(-this.field_m + this.field_e);
                          break L14;
                        }
                      }
                      decompiledRegionSelector0 = 3;
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
              this.field_p = -1L;
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
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var5_ref);
            stackOut_52_1 = new StringBuilder().append("si.I(").append(param0).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param2 + ',' + param3 + ')');
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

    private final void b(int param0) throws IOException {
        kl discarded$1 = null;
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          if (param0 == -5701) {
            break L0;
          } else {
            discarded$1 = si.a(-93, 38);
            break L0;
          }
        }
        L1: {
          if (0L == (this.field_m ^ -1L)) {
            break L1;
          } else {
            L2: {
              if ((this.field_p ^ -1L) != (this.field_m ^ -1L)) {
                this.field_o.a(this.field_m, (byte) -24);
                this.field_p = this.field_m;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_o.a(this.field_i, this.field_k, true, 0);
              this.field_p = this.field_p + (long)this.field_i;
              if (this.field_d >= this.field_p) {
                break L3;
              } else {
                this.field_d = this.field_p;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if ((this.field_c ^ -1L) < (this.field_m ^ -1L)) {
                  break L5;
                } else {
                  if ((this.field_m ^ -1L) <= (this.field_c - -(long)this.field_l ^ -1L)) {
                    break L5;
                  } else {
                    var2 = this.field_m;
                    break L4;
                  }
                }
              }
              if (this.field_m > this.field_c) {
                break L4;
              } else {
                if ((this.field_m + (long)this.field_i ^ -1L) >= (this.field_c ^ -1L)) {
                  break L4;
                } else {
                  var2 = this.field_c;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if ((this.field_m + (long)this.field_i ^ -1L) >= (this.field_c ^ -1L)) {
                  break L7;
                } else {
                  if ((long)this.field_i + this.field_m > (long)this.field_l + this.field_c) {
                    break L7;
                  } else {
                    var4 = (long)this.field_i + this.field_m;
                    break L6;
                  }
                }
              }
              if ((this.field_m ^ -1L) <= ((long)this.field_l + this.field_c ^ -1L)) {
                break L6;
              } else {
                if ((long)this.field_l + this.field_c <= (long)this.field_i + this.field_m) {
                  var4 = this.field_c - -(long)this.field_l;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (0L <= (var2 ^ -1L)) {
                break L8;
              } else {
                if (var4 > var2) {
                  var6 = (int)(var4 - var2);
                  g.a(this.field_k, (int)(var2 + -this.field_m), this.field_a, (int)(-this.field_c + var2), var6);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_i = 0;
            this.field_m = -1L;
            break L1;
          }
        }
    }

    final long b(byte param0) {
        if (param0 != 79) {
            field_h = -71;
        }
        return this.field_n;
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 >= -85) {
          return;
        } else {
          L0: {
            this.field_l = 0;
            if (this.field_p == this.field_e) {
              break L0;
            } else {
              this.field_o.a(this.field_e, (byte) -24);
              this.field_p = this.field_e;
              break L0;
            }
          }
          this.field_c = this.field_e;
          L1: while (true) {
            L2: {
              if (this.field_a.length <= this.field_l) {
                break L2;
              } else {
                L3: {
                  var2 = -this.field_l + this.field_a.length;
                  if (var2 > 200000000) {
                    var2 = 200000000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = this.field_o.a(this.field_a, 4836, this.field_l, var2);
                if (var3 == -1) {
                  break L2;
                } else {
                  this.field_p = this.field_p + (long)var3;
                  this.field_l = this.field_l + var3;
                  continue L1;
                }
              }
            }
            return;
          }
        }
    }

    final static kl a(int param0, int param1) {
        int var2 = -72 / ((-23 - param0) / 63);
        return sc.a(param1, 12000, 1, false, false, true);
    }

    final void a(int param0) throws IOException {
        this.b(param0 ^ 5700);
        this.field_o.a(param0);
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
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
        var14 = wizardrun.field_H;
        try {
          L0: {
            try {
              L1: {
                if (param2 + param0 > param1.length) {
                  throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param0));
                } else {
                  L2: {
                    if (this.field_m == -1L) {
                      break L2;
                    } else {
                      if ((this.field_m ^ -1L) < (this.field_e ^ -1L)) {
                        break L2;
                      } else {
                        if ((this.field_m - -(long)this.field_i ^ -1L) <= (this.field_e - -(long)param2 ^ -1L)) {
                          g.a(this.field_k, (int)(this.field_e + -this.field_m), param1, param0, param2);
                          this.field_e = this.field_e + (long)param2;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_e;
                    var7 = param0;
                    var8 = param2;
                    if ((this.field_e ^ -1L) > (this.field_c ^ -1L)) {
                      break L3;
                    } else {
                      if (this.field_e >= (long)this.field_l + this.field_c) {
                        break L3;
                      } else {
                        L4: {
                          var9_int = (int)(-this.field_e + this.field_c + (long)this.field_l);
                          if (var9_int <= param2) {
                            break L4;
                          } else {
                            var9_int = param2;
                            break L4;
                          }
                        }
                        g.a(this.field_a, (int)(-this.field_c + this.field_e), param1, param0, var9_int);
                        this.field_e = this.field_e + (long)var9_int;
                        param2 = param2 - var9_int;
                        param0 = param0 + var9_int;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (this.field_a.length >= param2) {
                      if ((param2 ^ -1) < -1) {
                        L6: {
                          this.c((byte) -121);
                          var9_int = param2;
                          if (this.field_l < var9_int) {
                            var9_int = this.field_l;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        g.a(this.field_a, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        this.field_e = this.field_e + (long)var9_int;
                        param2 = param2 - var9_int;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      this.field_o.a(this.field_e, (byte) -24);
                      this.field_p = this.field_e;
                      L7: while (true) {
                        if (0 >= param2) {
                          break L5;
                        } else {
                          var9_int = this.field_o.a(param1, param3 ^ 4811, param0, param2);
                          if ((var9_int ^ -1) != 0) {
                            this.field_e = this.field_e + (long)var9_int;
                            param0 = param0 + var9_int;
                            param2 = param2 - var9_int;
                            this.field_p = this.field_p + (long)var9_int;
                            continue L7;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (param3 == 47) {
                      break L8;
                    } else {
                      si.a((byte) -46);
                      break L8;
                    }
                  }
                  L9: {
                    if (0L != (this.field_m ^ -1L)) {
                      L10: {
                        if (this.field_m <= this.field_e) {
                          break L10;
                        } else {
                          if (param2 > 0) {
                            L11: {
                              var9_int = param0 - -(int)(-this.field_e + this.field_m);
                              if (var9_int > param0 + param2) {
                                var9_int = param0 + param2;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (param0 >= var9_int) {
                                break L10;
                              } else {
                                incrementValue$1 = param0;
                                param0++;
                                param1[incrementValue$1] = (byte) 0;
                                param2--;
                                this.field_e = this.field_e + 1L;
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
                          if ((this.field_m ^ -1L) > (var5_long ^ -1L)) {
                            break L14;
                          } else {
                            if (var5_long - -(long)var8 > this.field_m) {
                              var9 = this.field_m;
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if ((this.field_m ^ -1L) < (var5_long ^ -1L)) {
                          break L13;
                        } else {
                          if ((var5_long ^ -1L) > (this.field_m - -(long)this.field_i ^ -1L)) {
                            var9 = var5_long;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        L16: {
                          var11 = -1L;
                          if ((long)this.field_i + this.field_m <= var5_long) {
                            break L16;
                          } else {
                            if (((long)var8 + var5_long ^ -1L) > ((long)this.field_i + this.field_m ^ -1L)) {
                              break L16;
                            } else {
                              var11 = this.field_m - -(long)this.field_i;
                              break L15;
                            }
                          }
                        }
                        if (((long)var8 + var5_long ^ -1L) >= (this.field_m ^ -1L)) {
                          break L15;
                        } else {
                          if ((long)this.field_i + this.field_m < (long)var8 + var5_long) {
                            break L15;
                          } else {
                            var11 = (long)var8 + var5_long;
                            break L15;
                          }
                        }
                      }
                      if (-1L >= var9) {
                        break L9;
                      } else {
                        if (var9 >= var11) {
                          break L9;
                        } else {
                          var13 = (int)(-var9 + var11);
                          g.a(this.field_k, (int)(var9 + -this.field_m), param1, (int)(-var5_long + var9) + var7, var13);
                          if ((this.field_e ^ -1L) > (var11 ^ -1L)) {
                            param2 = (int)((long)param2 - (-this.field_e + var11));
                            this.field_e = var11;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_p = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (-1 <= (param2 ^ -1)) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var5_ref);
            stackOut_63_1 = new StringBuilder().append("si.G(").append(param0).append(',');
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
              break L17;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L17;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    si(ri param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_i = 0;
        this.field_c = -1L;
        try {
            this.field_o = param0;
            dupTemp$0 = param0.b(0);
            this.field_d = dupTemp$0;
            this.field_n = dupTemp$0;
            this.field_a = new byte[param1];
            this.field_e = 0L;
            this.field_k = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = 0;
        field_g = "Level not yet reached";
        field_b = "From only <%0>/month";
        field_j = new je[31];
    }
}

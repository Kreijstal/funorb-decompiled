/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jg {
    static long field_k;
    private byte[] field_e;
    private long field_h;
    static String field_p;
    static jp field_a;
    private long field_m;
    private long field_l;
    private long field_i;
    private long field_o;
    static mf field_d;
    private long field_j;
    static String field_q;
    private byte[] field_g;
    private int field_b;
    private rn field_n;
    private int field_f;
    static byte[] field_c;

    final void a(int param0, long param1) throws IOException {
        if (param1 < (long)param0) {
            throw new IOException();
        }
        this.field_l = param1;
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (null != sq.field_c) {
                break L1;
              } else {
                if (!nq.field_p) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 200000000) {
          return;
        } else {
          L0: {
            this.field_f = 0;
            if (this.field_j == this.field_l) {
              break L0;
            } else {
              this.field_n.a(-58, this.field_l);
              this.field_j = this.field_l;
              break L0;
            }
          }
          this.field_i = this.field_l;
          L1: while (true) {
            L2: {
              if (this.field_f >= this.field_g.length) {
                break L2;
              } else {
                L3: {
                  var2 = this.field_g.length - this.field_f;
                  if (-200000001 <= (var2 ^ -1)) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = this.field_n.a(this.field_f, this.field_g, var2, (byte) 123);
                if (var3 != -1) {
                  this.field_f = this.field_f + var3;
                  this.field_j = this.field_j + (long)var3;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        lj var15 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param3.length >= param0 + param1) {
                  L2: {
                    if ((this.field_o ^ -1L) == 0L) {
                      break L2;
                    } else {
                      if (this.field_l < this.field_o) {
                        break L2;
                      } else {
                        if ((long)this.field_b + this.field_o < this.field_l + (long)param0) {
                          break L2;
                        } else {
                          pm.a(this.field_e, (int)(this.field_l + -this.field_o), param3, param1, param0);
                          this.field_l = this.field_l + (long)param0;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 > 116) {
                      break L3;
                    } else {
                      var15 = (lj) null;
                      jg.a(36, (j) null, (lj) null, -113, -57, 112);
                      break L3;
                    }
                  }
                  L4: {
                    var5_long = this.field_l;
                    var7 = param1;
                    var8 = param0;
                    if (this.field_l < this.field_i) {
                      break L4;
                    } else {
                      if (this.field_l >= this.field_i + (long)this.field_f) {
                        break L4;
                      } else {
                        L5: {
                          var9_int = (int)((long)this.field_f + (this.field_i + -this.field_l));
                          if (var9_int > param0) {
                            var9_int = param0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        pm.a(this.field_g, (int)(this.field_l - this.field_i), param3, param1, var9_int);
                        this.field_l = this.field_l + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (this.field_g.length < param0) {
                      this.field_n.a(-18, this.field_l);
                      this.field_j = this.field_l;
                      L7: while (true) {
                        if (-1 <= (param0 ^ -1)) {
                          break L6;
                        } else {
                          var9_int = this.field_n.a(param1, param3, param0, (byte) 120);
                          if ((var9_int ^ -1) == 0) {
                            break L6;
                          } else {
                            this.field_j = this.field_j + (long)var9_int;
                            param0 = param0 - var9_int;
                            this.field_l = this.field_l + (long)var9_int;
                            param1 = param1 + var9_int;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      if ((param0 ^ -1) < -1) {
                        L8: {
                          this.b(200000000);
                          var9_int = param0;
                          if (var9_int <= this.field_f) {
                            break L8;
                          } else {
                            var9_int = this.field_f;
                            break L8;
                          }
                        }
                        pm.a(this.field_g, 0, param3, param1, var9_int);
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        this.field_l = this.field_l + (long)var9_int;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (0L != (this.field_o ^ -1L)) {
                      L10: {
                        if (this.field_o <= this.field_l) {
                          break L10;
                        } else {
                          if ((param0 ^ -1) < -1) {
                            L11: {
                              var9_int = (int)(-this.field_l + this.field_o) + param1;
                              if (var9_int <= param0 + param1) {
                                break L11;
                              } else {
                                var9_int = param1 - -param0;
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (param1 >= var9_int) {
                                break L10;
                              } else {
                                incrementValue$1 = param1;
                                param1++;
                                param3[incrementValue$1] = (byte) 0;
                                param0--;
                                this.field_l = this.field_l + 1L;
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
                          var11 = -1L;
                          if ((var5_long ^ -1L) < (this.field_o ^ -1L)) {
                            break L14;
                          } else {
                            if (this.field_o >= var5_long + (long)var8) {
                              break L14;
                            } else {
                              var9 = this.field_o;
                              break L13;
                            }
                          }
                        }
                        if ((this.field_o ^ -1L) < (var5_long ^ -1L)) {
                          break L13;
                        } else {
                          if (var5_long < (long)this.field_b + this.field_o) {
                            var9 = var5_long;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        L16: {
                          if (((long)this.field_b + this.field_o ^ -1L) >= (var5_long ^ -1L)) {
                            break L16;
                          } else {
                            if ((var5_long - -(long)var8 ^ -1L) > ((long)this.field_b + this.field_o ^ -1L)) {
                              break L16;
                            } else {
                              var11 = this.field_o - -(long)this.field_b;
                              break L15;
                            }
                          }
                        }
                        if ((this.field_o ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                          break L15;
                        } else {
                          if ((long)this.field_b + this.field_o >= (long)var8 + var5_long) {
                            var11 = (long)var8 + var5_long;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (-1L >= var9) {
                        break L9;
                      } else {
                        if (var11 <= var9) {
                          break L9;
                        } else {
                          var13 = (int)(-var9 + var11);
                          pm.a(this.field_e, (int)(var9 + -this.field_o), param3, var7 - -(int)(var9 + -var5_long), var13);
                          if (var11 <= this.field_l) {
                            break L9;
                          } else {
                            param0 = (int)((long)param0 - (var11 + -this.field_l));
                            this.field_l = var11;
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
                } else {
                  throw new ArrayIndexOutOfBoundsException(param0 + param1 - param3.length);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_j = -1L;
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
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) (var5_ref);
            stackOut_59_1 = new StringBuilder().append("jg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param3 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L17;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L17;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (this.field_o != (long)param0) {
            L1: {
              if (this.field_j != this.field_o) {
                this.field_n.a(-19, this.field_o);
                this.field_j = this.field_o;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_n.a(0, (byte) -125, this.field_e, this.field_b);
              this.field_j = this.field_j + (long)this.field_b;
              if ((this.field_j ^ -1L) < (this.field_h ^ -1L)) {
                this.field_h = this.field_j;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((this.field_o ^ -1L) > (this.field_i ^ -1L)) {
                  break L4;
                } else {
                  if ((this.field_o ^ -1L) > ((long)this.field_f + this.field_i ^ -1L)) {
                    var2 = this.field_o;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((this.field_o ^ -1L) < (this.field_i ^ -1L)) {
                break L3;
              } else {
                if (this.field_i < (long)this.field_b + this.field_o) {
                  var2 = this.field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (this.field_o + (long)this.field_b <= this.field_i) {
                  break L6;
                } else {
                  if ((long)this.field_f + this.field_i < this.field_o + (long)this.field_b) {
                    break L6;
                  } else {
                    var4 = this.field_o - -(long)this.field_b;
                    break L5;
                  }
                }
              }
              if (this.field_o >= (long)this.field_f + this.field_i) {
                break L5;
              } else {
                if (this.field_i + (long)this.field_f <= this.field_o - -(long)this.field_b) {
                  var4 = (long)this.field_f + this.field_i;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  pm.a(this.field_e, (int)(-this.field_o + var2), this.field_g, (int)(var2 - this.field_i), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_b = 0;
            this.field_o = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            if (param1 != -29) {
                this.field_o = -84L;
            }
            this.a(param0.length, 0, 127, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "jg.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 27 % ((62 - param0) / 62);
        field_q = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_p = null;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_m ^ -1L) > (this.field_l - -(long)param2 ^ -1L)) {
                    this.field_m = this.field_l - -(long)param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_o == (long)param3) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_l ^ -1L) > (this.field_o ^ -1L)) {
                        break L4;
                      } else {
                        if (this.field_l > (long)this.field_b + this.field_o) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.c(param3 ^ 0);
                    break L3;
                  }
                }
                L5: {
                  if (-1L == this.field_o) {
                    break L5;
                  } else {
                    if (((long)this.field_e.length + this.field_o ^ -1L) > (this.field_l - -(long)param2 ^ -1L)) {
                      var5_int = (int)(-this.field_l - -this.field_o + (long)this.field_e.length);
                      pm.a(param0, param1, this.field_e, (int)(this.field_l - this.field_o), var5_int);
                      param2 = param2 - var5_int;
                      this.field_l = this.field_l + (long)var5_int;
                      param1 = param1 + var5_int;
                      this.field_b = this.field_e.length;
                      this.c(param3 ^ 0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (param2 > this.field_e.length) {
                  L6: {
                    if ((this.field_l ^ -1L) == (this.field_j ^ -1L)) {
                      break L6;
                    } else {
                      this.field_n.a(-98, this.field_l);
                      this.field_j = this.field_l;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_n.a(param1, (byte) -125, param0, param2);
                    this.field_j = this.field_j + (long)param2;
                    if (this.field_j > this.field_h) {
                      this.field_h = this.field_j;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (this.field_l < this.field_i) {
                        break L9;
                      } else {
                        if (this.field_i + (long)this.field_f > this.field_l) {
                          var5_long = this.field_l;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((this.field_i ^ -1L) > (this.field_l ^ -1L)) {
                      break L8;
                    } else {
                      if (this.field_l + (long)param2 > this.field_i) {
                        var5_long = this.field_i;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if ((this.field_l + (long)param2 ^ -1L) >= (this.field_i ^ -1L)) {
                        break L11;
                      } else {
                        if ((this.field_l + (long)param2 ^ -1L) < (this.field_i - -(long)this.field_f ^ -1L)) {
                          break L11;
                        } else {
                          var7 = (long)param2 + this.field_l;
                          break L10;
                        }
                      }
                    }
                    if ((this.field_i - -(long)this.field_f ^ -1L) >= (this.field_l ^ -1L)) {
                      break L10;
                    } else {
                      if (this.field_i - -(long)this.field_f <= this.field_l + (long)param2) {
                        var7 = (long)this.field_f + this.field_i;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (-1L >= var5_long) {
                      break L12;
                    } else {
                      if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                        break L12;
                      } else {
                        var9 = (int)(var7 + -var5_long);
                        pm.a(param0, (int)(var5_long + ((long)param1 + -this.field_l)), this.field_g, (int)(-this.field_i + var5_long), var9);
                        break L12;
                      }
                    }
                  }
                  this.field_l = this.field_l + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if ((param2 ^ -1) >= -1) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L13: {
                      if (0L != (this.field_o ^ -1L)) {
                        break L13;
                      } else {
                        this.field_o = this.field_l;
                        break L13;
                      }
                    }
                    L14: {
                      pm.a(param0, param1, this.field_e, (int)(this.field_l - this.field_o), param2);
                      this.field_l = this.field_l + (long)param2;
                      if ((long)this.field_b >= this.field_l - this.field_o) {
                        break L14;
                      } else {
                        this.field_b = (int)(this.field_l - this.field_o);
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_j = -1L;
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
            stackOut_49_0 = (RuntimeException) (var5_ref);
            stackOut_49_1 = new StringBuilder().append("jg.E(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L15;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final void a(boolean param0) throws IOException {
        this.c(-1);
        if (param0) {
        }
        this.field_n.c(-100);
    }

    final long a(byte param0) {
        if (param0 <= 20) {
            field_d = (mf) null;
        }
        return this.field_m;
    }

    jg(rn param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_o = -1L;
        this.field_i = -1L;
        this.field_b = 0;
        try {
            this.field_n = param0;
            dupTemp$0 = param0.d(-122);
            this.field_h = dupTemp$0;
            this.field_m = dupTemp$0;
            this.field_g = new byte[param1];
            this.field_e = new byte[param2];
            this.field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, j param1, lj param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        jp var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param1.field_mb / (param3 << -638410783) + param0;
              var7 = param1.field_wb / (param3 << -1086848543) + param1.field_wb / (param3 << 1570560707) + param5;
              var8 = gg.field_p[param2.field_o];
              var9 = 96;
              var10 = 512;
              if (param2.field_m < param4) {
                var10 = (param2.field_m << 1189081577) / 25;
                var7 = var7 + (-param2.field_m + 25 << -174657566) / param3;
                var9 = (param2.field_m << -153948473) / 25;
                break L1;
              } else {
                if (50 <= param2.field_m) {
                  var9 = (75 + -param2.field_m << -549751161) / 25;
                  var10 = (75 + -param2.field_m << 1350351017) / 25;
                  var7 = var7 - (param2.field_m + -50 << 529196066) / param3;
                  break L1;
                } else {
                  var9 = 128;
                  break L1;
                }
              }
            }
            var11 = (var10 * var8.field_D >> -1612968089) / param3;
            var12 = (var10 * var8.field_C >> 863296263) / param3;
            var8.b(-(var11 >> -1535437119) + var6_int, var7 + -(var12 >> 682530657), var11, var12, var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("jg.B(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_k = 0L;
        field_q = "OFF";
        field_p = "Drawn";
    }
}

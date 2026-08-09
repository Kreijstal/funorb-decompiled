/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class gj {
    private byte[] field_e;
    private long field_k;
    private byte[] field_i;
    private long field_d;
    private long field_b;
    private int field_h;
    private long field_c;
    private sr field_j;
    private long field_g;
    private int field_f;
    private long field_a;

    final static void c(int param0) {
        bw.a(false, ra.c(param0 ^ 2));
        if (param0 != 0) {
            String var2 = (String) null;
            gj.a(42L, (java.applet.Applet) null, false, (String) null, (String) null);
        }
    }

    final static void a(long param0, java.applet.Applet param1, boolean param2, String param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    var8 = param1.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    if (param2) {
                      L2: {
                        var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                        var7 = var9;
                        var7 = var9;
                        if ((param0 ^ -1L) > -1L) {
                          var7 = var9 + "; Discard;";
                          break L2;
                        } else {
                          var7 = var9 + "; Expires=" + fi.a(param0 * 1000L + wq.a(-123), true) + "; Max-Age=" + param0;
                          break L2;
                        }
                      }
                      tw.a("document.cookie=\"" + var7 + "\"", -15428, param1);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("gj.H(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param0 + param1 <= param2.length) {
                  L2: {
                    if ((this.field_g ^ -1L) == 0L) {
                      break L2;
                    } else {
                      if (this.field_d < this.field_g) {
                        break L2;
                      } else {
                        if ((this.field_d + (long)param0 ^ -1L) < ((long)this.field_h + this.field_g ^ -1L)) {
                          break L2;
                        } else {
                          la.a(this.field_i, (int)(-this.field_g + this.field_d), param2, param1, param0);
                          this.field_d = this.field_d + (long)param0;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_d;
                    var7 = param1;
                    var8 = param0;
                    if ((this.field_d ^ -1L) > (this.field_b ^ -1L)) {
                      break L3;
                    } else {
                      if (this.field_d < this.field_b + (long)this.field_f) {
                        L4: {
                          var9_int = (int)((long)this.field_f + (-this.field_d - -this.field_b));
                          if (param0 >= var9_int) {
                            break L4;
                          } else {
                            var9_int = param0;
                            break L4;
                          }
                        }
                        la.a(this.field_e, (int)(this.field_d - this.field_b), param2, param1, var9_int);
                        param1 = param1 + var9_int;
                        this.field_d = this.field_d + (long)var9_int;
                        param0 = param0 - var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param0 <= this.field_e.length) {
                      if ((param0 ^ -1) < -1) {
                        L6: {
                          this.a(-1);
                          var9_int = param0;
                          if (this.field_f < var9_int) {
                            var9_int = this.field_f;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        la.a(this.field_e, 0, param2, param1, var9_int);
                        this.field_d = this.field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      this.field_j.a((byte) -100, this.field_d);
                      this.field_k = this.field_d;
                      L7: while (true) {
                        if (-1 <= (param0 ^ -1)) {
                          break L5;
                        } else {
                          var9_int = this.field_j.b(param2, 2, param0, param1);
                          if ((var9_int ^ -1) == 0) {
                            break L5;
                          } else {
                            this.field_d = this.field_d + (long)var9_int;
                            this.field_k = this.field_k + (long)var9_int;
                            param1 = param1 + var9_int;
                            param0 = param0 - var9_int;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  if (param3 < -51) {
                    L8: {
                      if (this.field_g != -1L) {
                        L9: {
                          if ((this.field_d ^ -1L) <= (this.field_g ^ -1L)) {
                            break L9;
                          } else {
                            if (-1 > (param0 ^ -1)) {
                              L10: {
                                var9_int = (int)(-this.field_d + this.field_g) + param1;
                                if (param0 + param1 < var9_int) {
                                  var9_int = param0 + param1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (param1 >= var9_int) {
                                  break L9;
                                } else {
                                  param0--;
                                  incrementValue$0 = param1;
                                  param1++;
                                  param2[incrementValue$0] = (byte) 0;
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
                            if (var5_long > this.field_g) {
                              break L13;
                            } else {
                              if (((long)var8 + var5_long ^ -1L) < (this.field_g ^ -1L)) {
                                var9 = this.field_g;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (this.field_g > var5_long) {
                            break L12;
                          } else {
                            if (var5_long < (long)this.field_h + this.field_g) {
                              var9 = var5_long;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if (var5_long >= (long)this.field_h + this.field_g) {
                              break L15;
                            } else {
                              if ((long)var8 + var5_long < this.field_g + (long)this.field_h) {
                                break L15;
                              } else {
                                var11 = (long)this.field_h + this.field_g;
                                break L14;
                              }
                            }
                          }
                          if ((this.field_g ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            break L14;
                          } else {
                            if (this.field_g + (long)this.field_h < var5_long + (long)var8) {
                              break L14;
                            } else {
                              var11 = (long)var8 + var5_long;
                              break L14;
                            }
                          }
                        }
                        if (-1L >= var9) {
                          break L8;
                        } else {
                          if (var9 >= var11) {
                            break L8;
                          } else {
                            var13 = (int)(var11 - var9);
                            la.a(this.field_i, (int)(-this.field_g + var9), param2, (int)(var9 - var5_long) + var7, var13);
                            if ((var11 ^ -1L) < (this.field_d ^ -1L)) {
                              param0 = (int)((long)param0 - (var11 - this.field_d));
                              this.field_d = var11;
                              break L8;
                            } else {
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
                  throw new ArrayIndexOutOfBoundsException(param1 + (param0 + -param2.length));
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_k = -1L;
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
                if (param0 <= 0) {
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
            stackIn_63_0 = (RuntimeException) (var5_ref);

            stackIn_63_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param3 + ')');
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

    private final void b(byte param0) throws IOException {
        long var2_long;
        int var2;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if ((this.field_g ^ -1L) == 0L) {
            break L0;
          } else {
            L1: {
              if (this.field_k != this.field_g) {
                this.field_j.a((byte) -115, this.field_g);
                this.field_k = this.field_g;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_j.a(this.field_i, 0, this.field_h, 1);
              this.field_k = this.field_k + (long)this.field_h;
              if (this.field_k <= this.field_c) {
                break L2;
              } else {
                this.field_c = this.field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                var4 = -1L;
                if (this.field_g < this.field_b) {
                  break L4;
                } else {
                  if ((this.field_b + (long)this.field_f ^ -1L) >= (this.field_g ^ -1L)) {
                    break L4;
                  } else {
                    var2_long = this.field_g;
                    break L3;
                  }
                }
              }
              if ((this.field_b ^ -1L) > (this.field_g ^ -1L)) {
                break L3;
              } else {
                if (this.field_g + (long)this.field_h > this.field_b) {
                  var2_long = this.field_b;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (this.field_b >= this.field_g + (long)this.field_h) {
                  break L6;
                } else {
                  if ((long)this.field_f + this.field_b < this.field_g + (long)this.field_h) {
                    break L6;
                  } else {
                    var4 = this.field_g + (long)this.field_h;
                    break L5;
                  }
                }
              }
              if ((long)this.field_f + this.field_b <= this.field_g) {
                break L5;
              } else {
                if ((this.field_b - -(long)this.field_f ^ -1L) >= ((long)this.field_h + this.field_g ^ -1L)) {
                  var4 = (long)this.field_f + this.field_b;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (0L <= (var2_long ^ -1L)) {
                break L7;
              } else {
                if ((var2_long ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(-var2_long + var4);
                  la.a(this.field_i, (int)(-this.field_g + var2_long), this.field_e, (int)(-this.field_b + var2_long), var6);
                  break L7;
                }
              }
            }
            this.field_g = -1L;
            this.field_h = 0;
            break L0;
          }
        }
        var2 = -14 / ((67 - param0) / 34);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (((long)param1 + this.field_d ^ -1L) < (this.field_a ^ -1L)) {
                    this.field_a = (long)param1 + this.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0L == (this.field_g ^ -1L)) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_g > this.field_d) {
                        break L4;
                      } else {
                        if (((long)this.field_h + this.field_g ^ -1L) > (this.field_d ^ -1L)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.b((byte) 115);
                    break L3;
                  }
                }
                L5: {
                  if (0L == (this.field_g ^ -1L)) {
                    break L5;
                  } else {
                    if (this.field_g + (long)this.field_i.length >= this.field_d + (long)param1) {
                      break L5;
                    } else {
                      var5_int = (int)(this.field_g + -this.field_d + (long)this.field_i.length);
                      la.a(param0, param3, this.field_i, (int)(-this.field_g + this.field_d), var5_int);
                      this.field_d = this.field_d + (long)var5_int;
                      param1 = param1 - var5_int;
                      param3 = param3 + var5_int;
                      this.field_h = this.field_i.length;
                      this.b((byte) 109);
                      break L5;
                    }
                  }
                }
                if (this.field_i.length >= param1) {
                  if (0 >= param1) {
                    var5_int = -89 % ((20 - param2) / 41);
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    L6: {
                      if (0L == (this.field_g ^ -1L)) {
                        this.field_g = this.field_d;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      la.a(param0, param3, this.field_i, (int)(-this.field_g + this.field_d), param1);
                      this.field_d = this.field_d + (long)param1;
                      if (this.field_d + -this.field_g > (long)this.field_h) {
                        this.field_h = (int)(this.field_d + -this.field_g);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  L8: {
                    if ((this.field_d ^ -1L) == (this.field_k ^ -1L)) {
                      break L8;
                    } else {
                      this.field_j.a((byte) -99, this.field_d);
                      this.field_k = this.field_d;
                      break L8;
                    }
                  }
                  L9: {
                    this.field_j.a(param0, param3, param1, 1);
                    this.field_k = this.field_k + (long)param1;
                    if (this.field_k > this.field_c) {
                      this.field_c = this.field_k;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var5_long = -1L;
                      if (this.field_b > this.field_d) {
                        break L11;
                      } else {
                        if (((long)this.field_f + this.field_b ^ -1L) >= (this.field_d ^ -1L)) {
                          break L11;
                        } else {
                          var5_long = this.field_d;
                          break L10;
                        }
                      }
                    }
                    if ((this.field_d ^ -1L) < (this.field_b ^ -1L)) {
                      break L10;
                    } else {
                      if ((long)param1 + this.field_d <= this.field_b) {
                        break L10;
                      } else {
                        var5_long = this.field_b;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var7 = -1L;
                      if (this.field_b >= (long)param1 + this.field_d) {
                        break L13;
                      } else {
                        if ((this.field_b + (long)this.field_f ^ -1L) > (this.field_d - -(long)param1 ^ -1L)) {
                          break L13;
                        } else {
                          var7 = (long)param1 + this.field_d;
                          break L12;
                        }
                      }
                    }
                    if ((this.field_d ^ -1L) <= ((long)this.field_f + this.field_b ^ -1L)) {
                      break L12;
                    } else {
                      if (((long)this.field_f + this.field_b ^ -1L) < ((long)param1 + this.field_d ^ -1L)) {
                        break L12;
                      } else {
                        var7 = (long)this.field_f + this.field_b;
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L14;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(var7 - var5_long);
                        la.a(param0, (int)(-this.field_d + (var5_long + (long)param3)), this.field_e, (int)(var5_long + -this.field_b), var9);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.field_d = this.field_d + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_k = -1L;
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
            stackIn_50_0 = (RuntimeException) (var5_ref);

            stackIn_50_1 = new StringBuilder().append("gj.D(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L15;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L15;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final void b(int param0) throws IOException {
        this.b((byte) -114);
        if (param0 != -1) {
            gj.c(-23);
        }
        this.field_j.b(0);
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            int var3_int = 47 / ((84 - param1) / 39);
            this.a(param0.length, 0, param0, -127);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (-1L < (param1 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == -7564) {
              break L0;
            } else {
              this.field_g = -40L;
              break L0;
            }
          }
          this.field_d = param1;
          return;
        }
    }

    final long a(byte param0) {
        if (param0 != -60) {
            return 111L;
        }
        return this.field_a;
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        String var5;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          this.field_f = 0;
          if (this.field_k == this.field_d) {
            break L0;
          } else {
            this.field_j.a((byte) 54, this.field_d);
            this.field_k = this.field_d;
            break L0;
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            var5 = (String) null;
            gj.a(20L, (java.applet.Applet) null, true, (String) null, (String) null);
            break L1;
          }
        }
        this.field_b = this.field_d;
        L2: while (true) {
          L3: {
            if (this.field_f >= this.field_e.length) {
              break L3;
            } else {
              L4: {
                var2 = this.field_e.length - this.field_f;
                if (var2 > 200000000) {
                  var2 = 200000000;
                  break L4;
                } else {
                  break L4;
                }
              }
              var3 = this.field_j.b(this.field_e, 2, var2, this.field_f);
              if ((var3 ^ -1) == 0) {
                break L3;
              } else {
                this.field_k = this.field_k + (long)var3;
                this.field_f = this.field_f + var3;
                continue L2;
              }
            }
          }
          return;
        }
    }

    gj(sr param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_h = 0;
        this.field_b = -1L;
        this.field_g = -1L;
        try {
            this.field_j = param0;
            dupTemp$0 = param0.a(100);
            this.field_c = dupTemp$0;
            this.field_a = dupTemp$0;
            this.field_i = new byte[param2];
            this.field_e = new byte[param1];
            this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -84) {
            gj.a((byte) 37, 116);
        }
        return fi.a(param1, iv.field_b, (byte) -96);
    }

    static {
    }
}

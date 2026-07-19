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
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var8 = param1.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    if (param2) {
                      L2: {
                        L3: {
                          var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                          var7 = var9;
                          var7 = var9;
                          var7 = var9;
                          if ((param0 ^ -1L) > -1L) {
                            break L3;
                          } else {
                            var7 = var9 + "; Expires=" + fi.a(param0 * 1000L + wq.a(-123), true) + "; Max-Age=" + param0;
                            if (!Sumoblitz.field_L) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7 = var7 + "; Discard;";
                        break L2;
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
                  L4: {
                    var6 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
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
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var6_ref);
                stackOut_9_1 = new StringBuilder().append("gj.H(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              L7: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
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
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
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
                    L6: {
                      L7: {
                        if (param0 <= this.field_e.length) {
                          break L7;
                        } else {
                          this.field_j.a((byte) -100, this.field_d);
                          this.field_k = this.field_d;
                          L8: while (true) {
                            if (-1 <= (param0 ^ -1)) {
                              break L6;
                            } else {
                              var9_int = this.field_j.b(param2, 2, param0, param1);
                              stackOut_17_0 = var9_int ^ -1;
                              stackIn_27_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var14 != 0) {
                                break L5;
                              } else {
                                if (stackIn_18_0 == 0) {
                                  break L6;
                                } else {
                                  this.field_d = this.field_d + (long)var9_int;
                                  this.field_k = this.field_k + (long)var9_int;
                                  param1 = param1 + var9_int;
                                  param0 = param0 - var9_int;
                                  if (var14 == 0) {
                                    continue L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if ((param0 ^ -1) < -1) {
                        L9: {
                          this.a(-1);
                          var9_int = param0;
                          if (this.field_f < var9_int) {
                            var9_int = this.field_f;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        la.a(this.field_e, 0, param2, param1, var9_int);
                        this.field_d = this.field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    stackOut_26_0 = param3;
                    stackIn_27_0 = stackOut_26_0;
                    break L5;
                  }
                  if (stackIn_27_0 < -51) {
                    L10: {
                      if (this.field_g != -1L) {
                        L11: {
                          if ((this.field_d ^ -1L) <= (this.field_g ^ -1L)) {
                            break L11;
                          } else {
                            if (-1 > (param0 ^ -1)) {
                              L12: {
                                var9_int = (int)(-this.field_d + this.field_g) + param1;
                                if (param0 + param1 < var9_int) {
                                  var9_int = param0 + param1;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: while (true) {
                                if (param1 >= var9_int) {
                                  break L11;
                                } else {
                                  param0--;
                                  incrementValue$1 = param1;
                                  param1++;
                                  param2[incrementValue$1] = (byte) 0;
                                  this.field_d = this.field_d + 1L;
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
                              var11 = -1L;
                              if (var5_long > this.field_g) {
                                break L16;
                              } else {
                                if (((long)var8 + var5_long ^ -1L) < (this.field_g ^ -1L)) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if (this.field_g > var5_long) {
                              break L14;
                            } else {
                              if (var5_long < (long)this.field_h + this.field_g) {
                                var9 = var5_long;
                                if (var14 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                          var9 = this.field_g;
                          break L14;
                        }
                        L17: {
                          L18: {
                            if (var5_long >= (long)this.field_h + this.field_g) {
                              break L18;
                            } else {
                              if ((long)var8 + var5_long < this.field_g + (long)this.field_h) {
                                break L18;
                              } else {
                                var11 = (long)this.field_h + this.field_g;
                                if (var14 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          if ((this.field_g ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            break L17;
                          } else {
                            if (this.field_g + (long)this.field_h < var5_long + (long)var8) {
                              break L17;
                            } else {
                              var11 = (long)var8 + var5_long;
                              break L17;
                            }
                          }
                        }
                        if (-1L >= var9) {
                          break L10;
                        } else {
                          if (var9 >= var11) {
                            break L10;
                          } else {
                            var13 = (int)(var11 - var9);
                            la.a(this.field_i, (int)(-this.field_g + var9), param2, (int)(var9 - var5_long) + var7, var13);
                            if ((var11 ^ -1L) < (this.field_d ^ -1L)) {
                              param0 = (int)((long)param0 - (var11 - this.field_d));
                              this.field_d = var11;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                      } else {
                        break L10;
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
          L19: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var5_ref);
            stackOut_65_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L19;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L19;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param3 + ')');
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
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
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
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
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
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
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
                          if (var10 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
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
                          if (var10 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
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
            stackOut_48_0 = (RuntimeException) (var5_ref);
            stackOut_48_1 = new StringBuilder().append("gj.D(");
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
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
              var2 = this.field_e.length - this.field_f;
              if (var4 != 0) {
                break L3;
              } else {
                L4: {
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
        int discarded$0 = 0;
        if (param0 != -84) {
            discarded$0 = gj.a((byte) 37, 116);
        }
        return fi.a(param1, iv.field_b, (byte) -96);
    }

    static {
    }
}

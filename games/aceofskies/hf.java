/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf extends un {
    private vf field_s;
    static int field_r;

    private final void a(boolean param0, boolean param1) {
        try {
            ll[] discarded$2 = null;
            IOException iOException = null;
            Exception var4 = null;
            gk var5 = null;
            rb stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            rb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            rb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            rb stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            rb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            rb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (this.field_s != null) {
              try {
                L0: {
                  L1: {
                    this.field_l.field_g = 0;
                    stackOut_2_0 = this.field_l;
                    stackOut_2_1 = -1336879960;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (param0) {
                      stackOut_4_0 = (rb) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (rb) ((Object) stackIn_3_0);
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  ((rb) (Object) stackIn_5_0).b(stackIn_5_1, stackIn_5_2);
                  this.field_l.a((byte) -64, 0L);
                  this.field_s.a(this.field_l.field_f.length, 0, -104, this.field_l.field_f);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_s.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_e = -2;
                  this.field_s = null;
                  this.field_j = this.field_j + 1;
                  break L2;
                }
              }
              L5: {
                if (param1) {
                  break L5;
                } else {
                  var5 = (gk) null;
                  discarded$2 = hf.a(120, (gk) null, -58, -76);
                  break L5;
                }
              }
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            gp var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            var6 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_s) {
                    try {
                      L2: {
                        this.field_s.a(1);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_s = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  this.field_s = (vf) (param2);
                  this.d((byte) -116);
                  if (param0 == 3006) {
                    break L4;
                  } else {
                    this.d((byte) 116);
                    break L4;
                  }
                }
                this.a(param1, true);
                this.field_a = null;
                this.field_h.field_g = 0;
                L5: while (true) {
                  var4_ref3 = (gp) ((Object) this.field_g.b(param0 ^ -17386));
                  if (var4_ref3 != null) {
                    this.field_b.a(2, var4_ref3);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref3 = (gp) ((Object) this.field_n.b(-18520));
                      if (var4_ref3 == null) {
                        L7: {
                          if (this.field_k == 0) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_l.field_g = 0;
                                this.field_l.b(-1336879960, 4);
                                this.field_l.b(param0 + -1336882966, (int) this.field_k);
                                this.field_l.a((byte) 87, 0);
                                this.field_s.a(this.field_l.field_f.length, 0, 35, this.field_l.field_f);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_s.a(1);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_j = this.field_j + 1;
                                this.field_e = -2;
                                this.field_s = null;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_p = 0;
                        this.field_m = kh.a(-59);
                        break L0;
                      } else {
                        this.field_d.a(2, var4_ref3);
                        continue L6;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) (var4_ref2);
                stackOut_25_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',');
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param2 == null) {
                  stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L12;
                } else {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L12;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int incrementValue$2 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var12 = new char[param1];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            var7 = -15 / ((-55 - param0) / 53);
            L1: while (true) {
              if (param1 <= var6) {
                stackOut_13_0 = new String(var12, 0, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  var8 = 255 & param3[var6 + param2];
                  if (-1 != (var8 ^ -1)) {
                    L3: {
                      if (var8 < 128) {
                        break L3;
                      } else {
                        if (160 <= var8) {
                          break L3;
                        } else {
                          L4: {
                            var9 = te.field_e[-128 + var8];
                            if (var9 == 0) {
                              var9 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var8 = var9;
                          break L3;
                        }
                      }
                    }
                    incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4_ref);
            stackOut_15_1 = new StringBuilder().append("hf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final void c(byte param0) {
        try {
            this.field_s.a(1);
        } catch (Exception exception) {
        }
        this.field_e = -1;
        int var2 = 25 % ((39 - param0) / 57);
        this.field_j = this.field_j + 1;
        this.field_s = null;
        this.field_k = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public hf() {
    }

    final boolean f(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            gp var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            gp var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_84_0 = 0;
            L0: {
              var16 = AceOfSkies.field_G ? 1 : 0;
              if (this.field_s != null) {
                L1: {
                  var2_long = kh.a(-97);
                  var4 = (int)(-this.field_m + var2_long);
                  if ((var4 ^ -1) < -201) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_m = var2_long;
                this.field_p = this.field_p + var4;
                if (30000 < this.field_p) {
                  try {
                    L2: {
                      this.field_s.a(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_s = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (this.field_s == null) {
              L4: {
                if (0 != this.b(param0 + -1048142560)) {
                  break L4;
                } else {
                  if (this.c(-77) != 0) {
                    break L4;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              try {
                L5: {
                  this.field_s.b((byte) 107);
                  var2_ref = (gp) ((Object) this.field_b.b((byte) 123));
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (gp) ((Object) this.field_d.b((byte) 69));
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = param0;
                          L8: while (true) {
                            L9: {
                              if (-101 >= (var2_int ^ -1)) {
                                break L9;
                              } else {
                                var3_int = this.field_s.b(-125);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (0 == var3_int) {
                                    break L9;
                                  } else {
                                    L10: {
                                      this.field_p = 0;
                                      var4 = 0;
                                      if (this.field_a == null) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (this.field_a.field_x == 0) {
                                          var4 = 1;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if ((var4 ^ -1) < -1) {
                                        L12: {
                                          var5 = var4 - this.field_h.field_g;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          this.field_s.a(this.field_h.field_g, var5, this.field_h.field_f, true);
                                          if (0 != this.field_k) {
                                            var6 = 0;
                                            L14: while (true) {
                                              if (var6 >= var5) {
                                                break L13;
                                              } else {
                                                this.field_h.field_f[var6 + this.field_h.field_g] = (byte)id.a((int) this.field_h.field_f[var6 + this.field_h.field_g], (int) this.field_k);
                                                var6++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        this.field_h.field_g = this.field_h.field_g + var5;
                                        if (this.field_h.field_g < var4) {
                                          break L11;
                                        } else {
                                          if (this.field_a != null) {
                                            if (this.field_a.field_x != 0) {
                                              throw new IOException();
                                            } else {
                                              if (0 == (this.field_h.field_f[0] ^ -1)) {
                                                this.field_h.field_g = 0;
                                                this.field_a.field_x = 1;
                                                break L11;
                                              } else {
                                                this.field_a = null;
                                                break L11;
                                              }
                                            }
                                          } else {
                                            L15: {
                                              this.field_h.field_g = 0;
                                              var6 = this.field_h.g(-72);
                                              var7 = this.field_h.a((byte) 125);
                                              var8 = this.field_h.g(-104);
                                              var9 = this.field_h.a((byte) 127);
                                              var10 = var8 & 127;
                                              if ((128 & var8) == 0) {
                                                stackOut_61_0 = 0;
                                                stackIn_62_0 = stackOut_61_0;
                                                break L15;
                                              } else {
                                                stackOut_60_0 = 1;
                                                stackIn_62_0 = stackOut_60_0;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              var11 = stackIn_62_0;
                                              var12 = (long)var7 + ((long)var6 << -1100582816);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (gp) ((Object) this.field_n.b((byte) 86));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var12 == var14_ref.field_i) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (gp) ((Object) this.field_n.e(param0 ^ 31542));
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (gp) ((Object) this.field_g.b((byte) 81));
                                                L18: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var12 == var14_ref.field_i) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (gp) ((Object) this.field_g.e(31542));
                                                      continue L18;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L19: {
                                                this.field_a = var14_ref;
                                                if (var10 == 0) {
                                                  stackOut_76_0 = 5;
                                                  stackIn_77_0 = stackOut_76_0;
                                                  break L19;
                                                } else {
                                                  stackOut_75_0 = 9;
                                                  stackIn_77_0 = stackOut_75_0;
                                                  break L19;
                                                }
                                              }
                                              var15 = stackIn_77_0;
                                              this.field_a.field_u = new rb(this.field_a.field_z + var9 + var15);
                                              this.field_a.field_u.b(-1336879960, var10);
                                              this.field_a.field_u.a((byte) 79, var9);
                                              this.field_a.field_x = 10;
                                              this.field_h.field_g = 0;
                                              break L11;
                                            }
                                          }
                                        }
                                      } else {
                                        L20: {
                                          var5 = this.field_a.field_u.field_f.length + -this.field_a.field_z;
                                          var6 = 512 - this.field_a.field_x;
                                          if (var6 <= var5 + -this.field_a.field_u.field_g) {
                                            break L20;
                                          } else {
                                            var6 = -this.field_a.field_u.field_g + var5;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var6 <= var3_int) {
                                            break L21;
                                          } else {
                                            var6 = var3_int;
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          this.field_s.a(this.field_a.field_u.field_g, var6, this.field_a.field_u.field_f, true);
                                          if (-1 != (this.field_k ^ -1)) {
                                            var7 = 0;
                                            L23: while (true) {
                                              if (var7 >= var6) {
                                                break L22;
                                              } else {
                                                this.field_a.field_u.field_f[var7 + this.field_a.field_u.field_g] = (byte)id.a((int) this.field_a.field_u.field_f[var7 + this.field_a.field_u.field_g], (int) this.field_k);
                                                var7++;
                                                continue L23;
                                              }
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                        this.field_a.field_u.field_g = this.field_a.field_u.field_g + var6;
                                        this.field_a.field_x = this.field_a.field_x + var6;
                                        if (var5 == this.field_a.field_u.field_g) {
                                          this.field_a.d(-125);
                                          this.field_a.field_p = false;
                                          this.field_a = null;
                                          break L11;
                                        } else {
                                          if ((this.field_a.field_x ^ -1) == -513) {
                                            this.field_a.field_x = 0;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                            stackOut_84_0 = 1;
                            stackIn_85_0 = stackOut_84_0;
                            break L5;
                          }
                        } else {
                          this.field_l.field_g = 0;
                          this.field_l.b(-1336879960, 0);
                          this.field_l.a((byte) -59, var2_ref.field_i);
                          this.field_s.a(this.field_l.field_f.length, 0, 52, this.field_l.field_f);
                          this.field_n.a(param0 + 2, var2_ref);
                          var2_ref = (gp) ((Object) this.field_d.e(31542));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_l.field_g = 0;
                      this.field_l.b(-1336879960, 1);
                      this.field_l.a((byte) -106, var2_ref.field_i);
                      this.field_s.a(this.field_l.field_f.length, 0, -103, this.field_l.field_f);
                      this.field_g.a(param0 + 2, var2_ref);
                      var2_ref = (gp) ((Object) this.field_b.e(31542));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_s.a(param0 + 1);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  this.field_e = -2;
                  this.field_s = null;
                  this.field_j = this.field_j + 1;
                  if (-1 != (this.b(-1048142560) ^ -1)) {
                    break L26;
                  } else {
                    if (this.c(-113) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_85_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (this.field_s == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_l.field_g = 0;
                    if (param0 <= -19) {
                      break L1;
                    } else {
                      field_r = -17;
                      break L1;
                    }
                  }
                  this.field_l.b(-1336879960, 6);
                  this.field_l.c(0, 3);
                  this.field_l.a(0, 23385);
                  this.field_s.a(this.field_l.field_f.length, 0, 60, this.field_l.field_f);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_s.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_s = null;
                  this.field_e = -2;
                  this.field_j = this.field_j + 1;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (null != this.field_s) {
            this.field_s.a(1);
        }
        if (param0 > -101) {
            this.field_s = (vf) null;
        }
    }

    final static ll[] a(int param0, gk param1, int param2, int param3) {
        RuntimeException var4 = null;
        ll[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_r = 92;
                break L1;
              }
            }
            if (tn.a(param1, (byte) -127, param3, param2)) {
              stackOut_5_0 = gl.a(param0 ^ 1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("hf.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    static {
    }
}

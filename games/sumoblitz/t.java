/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t extends gd {
    static boolean[] field_p;
    private dt field_r;
    static String field_s;
    static int field_q;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            fv var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            String stackIn_34_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            var6 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_r == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_r.a((byte) -67);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_r = null;
                    break L1;
                  }
                }
                this.field_r = (dt) (param2);
                this.e(0);
                this.a(71, param0);
                this.field_i = null;
                this.field_b.field_p = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      var4_ref3 = (fv) ((Object) this.field_h.b((byte) 72));
                      if (var4_ref3 == null) {
                        break L6;
                      } else {
                        this.field_l.a((pj) (var4_ref3), (byte) -128);
                        if (var6 != 0) {
                          L7: while (true) {
                            L8: {
                              L9: {
                                if (var4_ref3 != null) {
                                  break L9;
                                } else {
                                  if (var6 != 0) {
                                    break L8;
                                  } else {
                                    if (var6 == 0) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              this.field_f.a((pj) (var4_ref3), (byte) -101);
                              break L8;
                            }
                            if (var6 == 0) {
                              var4_ref3 = (fv) ((Object) this.field_g.b((byte) 72));
                              continue L7;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          if (var6 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L10: while (true) {
                      var4_ref3 = (fv) ((Object) this.field_g.b((byte) 72));
                      L11: {
                        L12: {
                          if (var4_ref3 != null) {
                            break L12;
                          } else {
                            if (var6 != 0) {
                              break L11;
                            } else {
                              if (var6 == 0) {
                                break L5;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        this.field_f.a((pj) (var4_ref3), (byte) -101);
                        break L11;
                      }
                      if (var6 == 0) {
                        continue L10;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (param1 > 90) {
                    L13: {
                      if (this.field_m != 0) {
                        try {
                          L14: {
                            this.field_n.field_p = 0;
                            this.field_n.b((byte) 89, 4);
                            this.field_n.b((byte) 36, (int) this.field_m);
                            this.field_n.e(48, 0);
                            this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                            break L14;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L15: {
                            var4_ref = (IOException) (Object) decompiledCaughtException;
                            try {
                              L16: {
                                this.field_r.a((byte) -73);
                                break L16;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L17: {
                                var5 = (Exception) (Object) decompiledCaughtException;
                                break L17;
                              }
                            }
                            this.field_r = null;
                            this.field_j = -2;
                            this.field_d = this.field_d + 1;
                            break L15;
                          }
                        }
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    this.field_c = 0;
                    this.field_e = wq.a(-78);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L18: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_31_0 = (RuntimeException) (var4_ref2);
                stackOut_31_1 = new StringBuilder().append("t.F(").append(param0).append(',').append(param1).append(',');
                stackIn_33_0 = stackOut_31_0;
                stackIn_33_1 = stackOut_31_1;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                if (param2 == null) {
                  stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
                  stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
                  stackOut_33_2 = "null";
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  break L18;
                } else {
                  stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
                  stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
                  stackOut_32_2 = "{...}";
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  break L18;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    public static void f(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 1) {
            t.f(-122);
        }
    }

    final void b(int param0) {
        try {
            this.field_r.a((byte) -65);
        } catch (Exception exception) {
        }
        this.field_j = -1;
        this.field_d = this.field_d + 1;
        this.field_r = null;
        this.field_m = (byte)(int)(1.0 + Math.random() * 255.0);
        if (param0 != 14702) {
            field_q = -47;
        }
    }

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fv var2_ref = null;
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
            fv var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_31_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_107_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_30_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_106_0 = 0;
            var16 = Sumoblitz.field_L ? 1 : 0;
            if (param0 > 78) {
              L0: {
                if (this.field_r != null) {
                  L1: {
                    var2_long = wq.a(-113);
                    var4 = (int)(var2_long + -this.field_e);
                    if (var4 <= 200) {
                      break L1;
                    } else {
                      var4 = 200;
                      break L1;
                    }
                  }
                  this.field_e = var2_long;
                  this.field_c = this.field_c + var4;
                  if (30000 < this.field_c) {
                    try {
                      L2: {
                        this.field_r.a((byte) -72);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_r = null;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              if (this.field_r == null) {
                if (-1 == (this.d(-2115911413) ^ -1)) {
                  if (0 != this.a((byte) -86)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                try {
                  L4: {
                    this.field_r.b(-120);
                    var2_ref = (fv) ((Object) this.field_l.a(32));
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var2_ref == null) {
                            break L7;
                          } else {
                            this.field_n.field_p = 0;
                            this.field_n.b((byte) 55, 1);
                            this.field_n.b(var2_ref.field_l, 1105594440);
                            this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                            this.field_h.a((pj) (var2_ref), (byte) -107);
                            var2_ref = (fv) ((Object) this.field_l.d(-2));
                            if (var16 != 0) {
                              break L6;
                            } else {
                              if (var16 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var2_ref = (fv) ((Object) this.field_f.a(37));
                        break L6;
                      }
                      L8: while (true) {
                        L9: {
                          if (var2_ref == null) {
                            break L9;
                          } else {
                            this.field_n.field_p = 0;
                            this.field_n.b((byte) 86, 0);
                            this.field_n.b(var2_ref.field_l, 1105594440);
                            this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                            this.field_g.a((pj) (var2_ref), (byte) -103);
                            var2_ref = (fv) ((Object) this.field_f.d(-2));
                            if (var16 == 0) {
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var2_int = 0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var2_int >= 100) {
                                break L12;
                              } else {
                                var3_int = this.field_r.c(-128);
                                stackOut_30_0 = -1;
                                stackIn_107_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var16 != 0) {
                                  break L11;
                                } else {
                                  if (stackIn_31_0 < (var3_int ^ -1)) {
                                    throw new IOException();
                                  } else {
                                    if (var3_int == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        L14: {
                                          this.field_c = 0;
                                          var4 = 0;
                                          if (this.field_i == null) {
                                            break L14;
                                          } else {
                                            if (0 == this.field_i.field_x) {
                                              var4 = 1;
                                              if (var16 == 0) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var4 = 10;
                                        break L13;
                                      }
                                      L15: {
                                        L16: {
                                          if (-1 > (var4 ^ -1)) {
                                            break L16;
                                          } else {
                                            L17: {
                                              var5 = this.field_i.field_w.field_n.length + -this.field_i.field_z;
                                              var6 = -this.field_i.field_x + 512;
                                              if (var6 <= var5 - this.field_i.field_w.field_p) {
                                                break L17;
                                              } else {
                                                var6 = var5 - this.field_i.field_w.field_p;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              if (var3_int >= var6) {
                                                break L18;
                                              } else {
                                                var6 = var3_int;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              L20: {
                                                this.field_r.a(-115, this.field_i.field_w.field_p, var6, this.field_i.field_w.field_n);
                                                if (-1 != (this.field_m ^ -1)) {
                                                  var7 = 0;
                                                  L21: while (true) {
                                                    if (var7 >= var6) {
                                                      break L20;
                                                    } else {
                                                      this.field_i.field_w.field_n[this.field_i.field_w.field_p + var7] = (byte)jg.a((int) this.field_i.field_w.field_n[this.field_i.field_w.field_p + var7], (int) this.field_m);
                                                      var7++;
                                                      if (var16 != 0) {
                                                        break L19;
                                                      } else {
                                                        continue L21;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              this.field_i.field_x = this.field_i.field_x + var6;
                                              this.field_i.field_w.field_p = this.field_i.field_w.field_p + var6;
                                              break L19;
                                            }
                                            L22: {
                                              if (var5 != this.field_i.field_w.field_p) {
                                                break L22;
                                              } else {
                                                this.field_i.c(-5106);
                                                this.field_i.field_u = false;
                                                this.field_i = null;
                                                if (var16 == 0) {
                                                  break L15;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            if (this.field_i.field_x == 512) {
                                              this.field_i.field_x = 0;
                                              if (var16 == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        L23: {
                                          var5 = -this.field_b.field_p + var4;
                                          if (var3_int >= var5) {
                                            break L23;
                                          } else {
                                            var5 = var3_int;
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          L25: {
                                            this.field_r.a(-114, this.field_b.field_p, var5, this.field_b.field_n);
                                            if (0 != this.field_m) {
                                              var6 = 0;
                                              L26: while (true) {
                                                if (var6 >= var5) {
                                                  break L25;
                                                } else {
                                                  this.field_b.field_n[var6 + this.field_b.field_p] = (byte)jg.a((int) this.field_b.field_n[var6 + this.field_b.field_p], (int) this.field_m);
                                                  var6++;
                                                  if (var16 != 0) {
                                                    break L24;
                                                  } else {
                                                    continue L26;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L25;
                                            }
                                          }
                                          this.field_b.field_p = this.field_b.field_p + var5;
                                          break L24;
                                        }
                                        L27: {
                                          if (this.field_b.field_p >= var4) {
                                            break L27;
                                          } else {
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L28: {
                                          if (null == this.field_i) {
                                            L29: {
                                              this.field_b.field_p = 0;
                                              var6 = this.field_b.e(-31302);
                                              var7 = this.field_b.c(true);
                                              var8 = this.field_b.e(-31302);
                                              var9 = this.field_b.c(true);
                                              var10 = 127 & var8;
                                              if (0 == (128 & var8)) {
                                                stackOut_76_0 = 0;
                                                stackIn_77_0 = stackOut_76_0;
                                                break L29;
                                              } else {
                                                stackOut_75_0 = 1;
                                                stackIn_77_0 = stackOut_75_0;
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              L31: {
                                                var11 = stackIn_77_0;
                                                var12 = ((long)var6 << 1826556384) - -(long)var7;
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (fv) ((Object) this.field_g.a(64));
                                                  L32: while (true) {
                                                    if (var14_ref == null) {
                                                      break L31;
                                                    } else {
                                                      stackOut_87_0 = (var14_ref.field_l < var12 ? -1 : (var14_ref.field_l == var12 ? 0 : 1));
                                                      stackIn_94_0 = stackOut_87_0;
                                                      stackIn_88_0 = stackOut_87_0;
                                                      if (var16 != 0) {
                                                        break L30;
                                                      } else {
                                                        if (stackIn_88_0 == 0) {
                                                          break L31;
                                                        } else {
                                                          var14_ref = (fv) ((Object) this.field_g.d(-2));
                                                          if (var16 == 0) {
                                                            continue L32;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (fv) ((Object) this.field_h.a(66));
                                                  L33: while (true) {
                                                    if (var14_ref == null) {
                                                      break L31;
                                                    } else {
                                                      stackOut_80_0 = ((var12 ^ -1L) < (var14_ref.field_l ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_l ^ -1L) ? 0 : 1));
                                                      stackIn_94_0 = stackOut_80_0;
                                                      stackIn_81_0 = stackOut_80_0;
                                                      if (var16 != 0) {
                                                        break L30;
                                                      } else {
                                                        L34: {
                                                          if (stackIn_81_0 != 0) {
                                                            break L34;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L31;
                                                            } else {
                                                              break L34;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (fv) ((Object) this.field_h.d(-2));
                                                        continue L33;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                stackOut_93_0 = 0;
                                                stackIn_94_0 = stackOut_93_0;
                                                break L30;
                                              }
                                            }
                                            L35: {
                                              if (stackIn_94_0 == var10) {
                                                stackOut_96_0 = 5;
                                                stackIn_97_0 = stackOut_96_0;
                                                break L35;
                                              } else {
                                                stackOut_95_0 = 9;
                                                stackIn_97_0 = stackOut_95_0;
                                                break L35;
                                              }
                                            }
                                            var15 = stackIn_97_0;
                                            this.field_i = var14_ref;
                                            this.field_i.field_w = new fs(this.field_i.field_z + var15 + var9);
                                            this.field_i.field_w.b((byte) 37, var10);
                                            this.field_i.field_w.e(48, var9);
                                            this.field_i.field_x = 10;
                                            this.field_b.field_p = 0;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        L36: {
                                          if (0 != this.field_i.field_x) {
                                            break L36;
                                          } else {
                                            L37: {
                                              if (0 == (this.field_b.field_n[0] ^ -1)) {
                                                break L37;
                                              } else {
                                                this.field_i = null;
                                                if (var16 == 0) {
                                                  break L15;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                            }
                                            this.field_i.field_x = 1;
                                            this.field_b.field_p = 0;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                        throw new IOException();
                                      }
                                      var2_int++;
                                      if (var16 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_106_0 = 1;
                            stackIn_107_0 = stackOut_106_0;
                            break L11;
                          }
                          break L4;
                        }
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L38: {
                      this.field_r.a((byte) -60);
                      break L38;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    L39: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L39;
                    }
                  }
                  this.field_r = null;
                  this.field_d = this.field_d + 1;
                  this.field_j = -2;
                  if (0 == this.d(-2115911413)) {
                    if (-1 == (this.a((byte) -122) ^ -1)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
                return stackIn_107_0 != 0;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            fs stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            fs stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            fs stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            fs stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            fs stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            fs stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_n.field_p = 0;
                    stackOut_3_0 = this.field_n;
                    stackOut_3_1 = 46;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (!param1) {
                      stackOut_5_0 = (fs) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (fs) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((fs) (Object) stackIn_6_0).b((byte) stackIn_6_1, stackIn_6_2);
                  this.field_n.b(0L, 1105594440);
                  if (param0 >= 63) {
                    this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_r.a((byte) -93);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_j = -2;
                  this.field_d = this.field_d + 1;
                  this.field_r = null;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_n.field_p = param0;
                  this.field_n.b((byte) 19, 6);
                  this.field_n.d(3, param0 + 102);
                  this.field_n.b(param0 + 127, 0);
                  this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_r.a((byte) -94);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_d = this.field_d + 1;
                  this.field_j = -2;
                  this.field_r = null;
                  break L1;
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

    public t() {
    }

    final void c(int param0) {
        if (param0 > -61) {
            field_q = 32;
        }
        if (null != this.field_r) {
            this.field_r.a((byte) -46);
        }
    }

    static {
        field_p = new boolean[25];
        field_s = null;
    }
}

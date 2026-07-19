/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae extends bp {
    static String field_w;
    static String field_v;
    private hi field_t;
    static String field_x;
    static String field_s;
    static kl field_u;

    final void c(int param0) {
        if (param0 != -5758) {
            this.d((byte) 55);
        }
        if (null != this.field_t) {
            this.field_t.c((byte) -45);
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param1);
        var2.b(1, 2);
        var2.b(param0 + -895, 4);
        var2.b(1, gm.f(3));
        if (param0 != 896) {
            field_s = (String) null;
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            int var4_int = 0;
            IOException var5 = null;
            jf var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            String stackIn_31_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == this.field_t) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_t.c((byte) -45);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_t = null;
                    break L1;
                  }
                }
                this.field_t = (hi) (param0);
                this.d((byte) 116);
                this.a(82, param1);
                this.field_a = null;
                var4_int = -66 / ((param2 - 25) / 57);
                this.field_h.field_q = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      var5_ref = (jf) ((Object) this.field_n.b(11));
                      if (var5_ref == null) {
                        break L6;
                      } else {
                        this.field_b.a(var5_ref, false);
                        if (var7 != 0) {
                          L7: while (true) {
                            L8: {
                              L9: {
                                if (var5_ref != null) {
                                  break L9;
                                } else {
                                  if (var7 != 0) {
                                    break L8;
                                  } else {
                                    if (var7 == 0) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              this.field_f.a(var5_ref, false);
                              break L8;
                            }
                            if (var7 == 0) {
                              var5_ref = (jf) ((Object) this.field_g.b(11));
                              continue L7;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          if (var7 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L10: while (true) {
                      var5_ref = (jf) ((Object) this.field_g.b(11));
                      L11: {
                        L12: {
                          if (var5_ref != null) {
                            break L12;
                          } else {
                            if (var7 != 0) {
                              break L11;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        this.field_f.a(var5_ref, false);
                        break L11;
                      }
                      if (var7 == 0) {
                        continue L10;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L13: {
                    if (-1 == (this.field_i ^ -1)) {
                      break L13;
                    } else {
                      try {
                        L14: {
                          this.field_o.field_q = 0;
                          this.field_o.b(1, 4);
                          this.field_o.b(1, (int) this.field_i);
                          this.field_o.a((byte) -59, 0);
                          this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L15: {
                          var5 = (IOException) (Object) decompiledCaughtException;
                          try {
                            L16: {
                              this.field_t.c((byte) -45);
                              break L16;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            L17: {
                              var6 = (Exception) (Object) decompiledCaughtException;
                              break L17;
                            }
                          }
                          this.field_q = this.field_q + 1;
                          this.field_t = null;
                          this.field_p = -2;
                          break L15;
                        }
                      }
                      break L13;
                    }
                  }
                  this.field_l = 0;
                  this.field_r = vi.b(80);
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L18: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_28_0 = (RuntimeException) (var4_ref);
                stackOut_28_1 = new StringBuilder().append("ae.K(");
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                if (param0 == null) {
                  stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
                  stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
                  stackOut_30_2 = "null";
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  break L18;
                } else {
                  stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackOut_29_2 = "{...}";
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  stackIn_31_2 = stackOut_29_2;
                  break L18;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_s = null;
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != -4096) {
            field_w = (String) null;
        }
        field_w = null;
    }

    final static void a(long param0, int param1) {
        try {
            int discarded$0 = 0;
            try {
                Thread.sleep(param0);
            } catch (InterruptedException interruptedException) {
            }
            if (param1 <= 3) {
                discarded$0 = ae.b(90, 21);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ae() {
    }

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            jf var2_ref = null;
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
            jf var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_28_0 = 0;
            int stackIn_72_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_83_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_104_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_27_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_70_0 = 0;
            int stackOut_82_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_103_0 = 0;
            L0: {
              var16 = ArmiesOfGielinor.field_M ? 1 : 0;
              if (null == this.field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = vi.b(-75);
                  var4 = (int)(-this.field_r + var2_long);
                  this.field_r = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_l = this.field_l + var4;
                if (30000 < this.field_l) {
                  try {
                    L2: {
                      this.field_t.c((byte) -45);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_t != null) {
              try {
                L4: {
                  this.field_t.a(param0);
                  var2_ref = (jf) ((Object) this.field_b.a((byte) -117));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_o.field_q = 0;
                          this.field_o.b(1, 1);
                          this.field_o.a(true, var2_ref.field_q);
                          this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                          this.field_n.a(var2_ref, false);
                          var2_ref = (jf) ((Object) this.field_b.c(24));
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
                      var2_ref = (jf) ((Object) this.field_f.a((byte) -123));
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_o.field_q = 0;
                          this.field_o.b(1, 0);
                          this.field_o.a(true, var2_ref.field_q);
                          this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                          this.field_g.a(var2_ref, false);
                          var2_ref = (jf) ((Object) this.field_f.c(24));
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
                              var3_int = this.field_t.d((byte) 43);
                              stackOut_27_0 = var3_int;
                              stackIn_104_0 = stackOut_27_0;
                              stackIn_28_0 = stackOut_27_0;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_28_0 < 0) {
                                  throw new IOException();
                                } else {
                                  L13: {
                                    if (var3_int != 0) {
                                      break L13;
                                    } else {
                                      if (var16 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      this.field_l = 0;
                                      var4 = 0;
                                      if (this.field_a != null) {
                                        break L15;
                                      } else {
                                        var4 = 10;
                                        if (var16 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (this.field_a.field_F != 0) {
                                      break L14;
                                    } else {
                                      var4 = 1;
                                      break L14;
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      if ((var4 ^ -1) < -1) {
                                        break L17;
                                      } else {
                                        L18: {
                                          var5 = -this.field_a.field_B + this.field_a.field_E.field_o.length;
                                          var6 = 512 + -this.field_a.field_F;
                                          if (-this.field_a.field_E.field_q + var5 >= var6) {
                                            break L18;
                                          } else {
                                            var6 = var5 - this.field_a.field_E.field_q;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          if (var6 <= var3_int) {
                                            break L19;
                                          } else {
                                            var6 = var3_int;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          L21: {
                                            this.field_t.a(0, this.field_a.field_E.field_q, var6, this.field_a.field_E.field_o);
                                            if (0 == this.field_i) {
                                              break L21;
                                            } else {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var6 <= var7) {
                                                  break L21;
                                                } else {
                                                  this.field_a.field_E.field_o[this.field_a.field_E.field_q - -var7] = (byte)kf.b((int) this.field_a.field_E.field_o[this.field_a.field_E.field_q + var7], (int) this.field_i);
                                                  var7++;
                                                  if (var16 != 0) {
                                                    break L20;
                                                  } else {
                                                    continue L22;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          this.field_a.field_F = this.field_a.field_F + var6;
                                          this.field_a.field_E.field_q = this.field_a.field_E.field_q + var6;
                                          break L20;
                                        }
                                        L23: {
                                          if (this.field_a.field_E.field_q == var5) {
                                            break L23;
                                          } else {
                                            if ((this.field_a.field_F ^ -1) == -513) {
                                              this.field_a.field_F = 0;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L23;
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        this.field_a.c((byte) -76);
                                        this.field_a.field_x = false;
                                        this.field_a = null;
                                        if (var16 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L24: {
                                      var5 = -this.field_h.field_q + var4;
                                      if (var5 <= var3_int) {
                                        break L24;
                                      } else {
                                        var5 = var3_int;
                                        break L24;
                                      }
                                    }
                                    L25: {
                                      L26: {
                                        this.field_t.a(0, this.field_h.field_q, var5, this.field_h.field_o);
                                        if (0 != this.field_i) {
                                          var6 = 0;
                                          L27: while (true) {
                                            if (var6 >= var5) {
                                              break L26;
                                            } else {
                                              this.field_h.field_o[this.field_h.field_q - -var6] = (byte)kf.b((int) this.field_h.field_o[this.field_h.field_q + var6], (int) this.field_i);
                                              var6++;
                                              if (var16 != 0) {
                                                break L25;
                                              } else {
                                                continue L27;
                                              }
                                            }
                                          }
                                        } else {
                                          break L26;
                                        }
                                      }
                                      this.field_h.field_q = this.field_h.field_q + var5;
                                      break L25;
                                    }
                                    if (var4 > this.field_h.field_q) {
                                      break L16;
                                    } else {
                                      L28: {
                                        if (null == this.field_a) {
                                          L29: {
                                            this.field_h.field_q = 0;
                                            var6 = this.field_h.k(0);
                                            var7 = this.field_h.i(1);
                                            var8 = this.field_h.k(0);
                                            var9 = this.field_h.i(1);
                                            var10 = 127 & var8;
                                            if (-1 == (var8 & 128 ^ -1)) {
                                              stackOut_71_0 = 0;
                                              stackIn_72_0 = stackOut_71_0;
                                              break L29;
                                            } else {
                                              stackOut_70_0 = 1;
                                              stackIn_72_0 = stackOut_70_0;
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            L31: {
                                              var11 = stackIn_72_0;
                                              var12 = (long)var7 + ((long)var6 << -1036793568);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (jf) ((Object) this.field_g.a((byte) -110));
                                                L32: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_82_0 = (var12 < var14_ref.field_q ? -1 : (var12 == var14_ref.field_q ? 0 : 1));
                                                    stackIn_90_0 = stackOut_82_0;
                                                    stackIn_83_0 = stackOut_82_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      L33: {
                                                        if (stackIn_83_0 != 0) {
                                                          break L33;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L31;
                                                          } else {
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (jf) ((Object) this.field_g.c(24));
                                                      if (var16 == 0) {
                                                        continue L32;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (jf) ((Object) this.field_n.a((byte) -106));
                                                L34: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_75_0 = (var12 < var14_ref.field_q ? -1 : (var12 == var14_ref.field_q ? 0 : 1));
                                                    stackIn_90_0 = stackOut_75_0;
                                                    stackIn_76_0 = stackOut_75_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      L35: {
                                                        if (stackIn_76_0 != 0) {
                                                          break L35;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L31;
                                                          } else {
                                                            break L35;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (jf) ((Object) this.field_n.c(24));
                                                      continue L34;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              this.field_a = var14_ref;
                                              stackOut_89_0 = var10;
                                              stackIn_90_0 = stackOut_89_0;
                                              break L30;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                          L36: {
                                            if (stackIn_90_0 == 0) {
                                              stackOut_92_0 = 5;
                                              stackIn_93_0 = stackOut_92_0;
                                              break L36;
                                            } else {
                                              stackOut_91_0 = 9;
                                              stackIn_93_0 = stackOut_91_0;
                                              break L36;
                                            }
                                          }
                                          var15 = stackIn_93_0;
                                          this.field_a.field_E = new vh(var15 + var9 - -this.field_a.field_B);
                                          this.field_a.field_E.b(1, var10);
                                          this.field_a.field_E.a((byte) -77, var9);
                                          this.field_h.field_q = 0;
                                          this.field_a.field_F = 10;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L37: {
                                        if (-1 == (this.field_a.field_F ^ -1)) {
                                          L38: {
                                            if (this.field_h.field_o[0] != -1) {
                                              break L38;
                                            } else {
                                              this.field_a.field_F = 1;
                                              this.field_h.field_q = 0;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          this.field_a = null;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L37;
                                          }
                                        } else {
                                          break L37;
                                        }
                                      }
                                      throw new IOException();
                                    }
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
                          stackOut_103_0 = 1;
                          stackIn_104_0 = stackOut_103_0;
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
                  L39: {
                    this.field_t.c((byte) -45);
                    break L39;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L40: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L40;
                  }
                }
                this.field_p = -2;
                this.field_q = this.field_q + 1;
                this.field_t = null;
                if (-1 == (this.a(106) ^ -1)) {
                  if (-1 != (this.b(-109) ^ -1)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_104_0 != 0;
            } else {
              if (-1 == (this.a(127) ^ -1)) {
                if (this.b(-110) != 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
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
            if (param0 > 70) {
              if (null == this.field_t) {
                return;
              } else {
                try {
                  L0: {
                    this.field_o.field_q = 0;
                    this.field_o.b(1, 6);
                    this.field_o.a(3, (byte) 58);
                    this.field_o.b(true, 0);
                    this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_t.c((byte) -45);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_p = -2;
                    this.field_t = null;
                    this.field_q = this.field_q + 1;
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
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
            vh stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            vh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            vh stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            vh stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            vh stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            vh stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    if (param0 > 5) {
                      break L1;
                    } else {
                      this.a(-74, true);
                      break L1;
                    }
                  }
                  L2: {
                    this.field_o.field_q = 0;
                    stackOut_4_0 = this.field_o;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (!param1) {
                      stackOut_6_0 = (vh) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 3;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (vh) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((vh) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2);
                  this.field_o.a(true, 0L);
                  this.field_t.a(this.field_o.field_o, (byte) 20, 0, this.field_o.field_o.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_t.c((byte) -45);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_q = this.field_q + 1;
                  this.field_t = null;
                  this.field_p = -2;
                  break L3;
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

    final static int b(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          param0 = param0 & 8191;
          if (param1 == 100) {
            break L0;
          } else {
            field_v = (String) null;
            break L0;
          }
        }
        if (param0 < 4096) {
          L1: {
            if ((param0 ^ -1) > -2049) {
              stackOut_9_0 = e.field_a[param0];
              stackIn_10_0 = stackOut_9_0;
              break L1;
            } else {
              stackOut_8_0 = e.field_a[-param0 + 4096];
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          }
          return stackIn_10_0;
        } else {
          L2: {
            if ((param0 ^ -1) <= -6145) {
              stackOut_5_0 = -e.field_a[8192 - param0];
              stackIn_6_0 = stackOut_5_0;
              break L2;
            } else {
              stackOut_4_0 = -e.field_a[-4096 + param0];
              stackIn_6_0 = stackOut_4_0;
              break L2;
            }
          }
          return stackIn_6_0;
        }
    }

    final void b(byte param0) {
        if (param0 != 4) {
            return;
        }
        try {
            this.field_t.c((byte) -45);
        } catch (Exception exception) {
        }
        this.field_t = null;
        this.field_p = -1;
        this.field_q = this.field_q + 1;
        this.field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static void a(byte param0, wk[] param1, wk param2) {
        try {
            vg.field_q = param1;
            vg.field_q[0].i();
            vg.field_q[1].i();
            tr.field_z = param2;
            ac.field_m = vg.field_q[0].field_v;
            if (param0 < 118) {
                field_x = (String) null;
            }
            cm.field_b = vg.field_q[0].field_y;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ae.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "This can be used from turn <%0> onwards.";
        field_x = "Click on the gold-rimmed icons to navigate through the equipment.";
        field_v = "Show all private chat";
        field_s = "Service unavailable";
    }
}

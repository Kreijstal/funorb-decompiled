/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qf extends wb {
    static String field_s;
    private ge field_r;
    static int[] field_q;

    final void b(int param0) {
        boolean discarded$0 = false;
        if (!(null == this.field_r)) {
            this.field_r.b(param0 ^ 80);
        }
        if (param0 != 0) {
            discarded$0 = this.a((byte) 59);
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_13_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_9_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param1.equals("B")) {
              if (!param1.equals("I")) {
                L1: {
                  if (param0 == -4174) {
                    break L1;
                  } else {
                    field_q = (int[]) null;
                    break L1;
                  }
                }
                if (!param1.equals("S")) {
                  if (param1.equals("J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (param1.equals("C")) {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = Integer.TYPE;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("qf.M(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void f(int param0) {
        if (!(ug.field_A == null)) {
            ug.field_A.g(false);
        }
        if (param0 != -28390) {
            qf.g(-118);
        }
        if (qj.field_fb != null) {
            qj.field_fb.h(param0 + 4239142);
        }
        cb.a((byte) -52);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wf stackIn_4_0 = null;
            wf stackIn_5_0 = null;
            wf stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            wf stackOut_3_0 = null;
            wf stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            wf stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (null == this.field_r) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_h = 0;
                    stackOut_3_0 = this.field_b;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param1) {
                      stackOut_5_0 = (wf) ((Object) stackIn_5_0);
                      stackOut_5_1 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (wf) ((Object) stackIn_4_0);
                      stackOut_4_1 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((wf) (Object) stackIn_6_0).c(stackIn_6_1, -1);
                  if (param0 < -53) {
                    this.field_b.a(0L, 687419600);
                    this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 54, 0);
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
                      this.field_r.b(33);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_r = null;
                  this.field_j = -2;
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

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            dc var2_ref = null;
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
            dc var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_29_0 = 0;
            int stackIn_72_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_103_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_28_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_70_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_102_0 = 0;
            L0: {
              var16 = Lexicominos.field_L ? 1 : 0;
              if (this.field_r == null) {
                break L0;
              } else {
                L1: {
                  var2_long = rf.c(0);
                  var4 = (int)(-this.field_n + var2_long);
                  this.field_n = var2_long;
                  if ((var4 ^ -1) >= -201) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_e = this.field_e + var4;
                if ((this.field_e ^ -1) < -30001) {
                  try {
                    L2: {
                      this.field_r.b(75);
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
              }
            }
            if (null == this.field_r) {
              if (-1 == (this.c((byte) 67) ^ -1)) {
                if (this.a(true) == 0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              try {
                L4: {
                  this.field_r.a(0);
                  var2_ref = (dc) ((Object) this.field_l.a(true));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_b.field_h = 0;
                          this.field_b.c(1, -1);
                          this.field_b.a(var2_ref.field_j, 687419600);
                          this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 58, 0);
                          this.field_k.a(85, var2_ref);
                          var2_ref = (dc) ((Object) this.field_l.a(-256));
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
                      var2_ref = (dc) ((Object) this.field_d.a(true));
                      break L6;
                    }
                    var3_int = 98 % ((-74 - param0) / 48);
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_b.field_h = 0;
                          this.field_b.c(0, -1);
                          this.field_b.a(var2_ref.field_j, 687419600);
                          this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, -124, 0);
                          this.field_f.a(82, var2_ref);
                          var2_ref = (dc) ((Object) this.field_d.a(-256));
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
                              var3_int = this.field_r.d(-6448);
                              stackOut_28_0 = -1;
                              stackIn_103_0 = stackOut_28_0;
                              stackIn_29_0 = stackOut_28_0;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_29_0 < (var3_int ^ -1)) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L12;
                                  } else {
                                    L13: {
                                      L14: {
                                        this.field_e = 0;
                                        var4 = 0;
                                        if (null == this.field_o) {
                                          break L14;
                                        } else {
                                          if (this.field_o.field_w == 0) {
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
                                        if (0 < var4) {
                                          break L16;
                                        } else {
                                          L17: {
                                            var5 = -this.field_o.field_A + this.field_o.field_x.field_j.length;
                                            var6 = -this.field_o.field_w + 512;
                                            if (var6 > -this.field_o.field_x.field_h + var5) {
                                              var6 = var5 + -this.field_o.field_x.field_h;
                                              break L17;
                                            } else {
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
                                              this.field_r.a(this.field_o.field_x.field_j, (byte) -109, var6, this.field_o.field_x.field_h);
                                              if (0 == this.field_a) {
                                                break L20;
                                              } else {
                                                var7 = 0;
                                                L21: while (true) {
                                                  if (var6 <= var7) {
                                                    break L20;
                                                  } else {
                                                    this.field_o.field_x.field_j[this.field_o.field_x.field_h - -var7] = (byte)dg.a((int) this.field_o.field_x.field_j[this.field_o.field_x.field_h + var7], (int) this.field_a);
                                                    var7++;
                                                    if (var16 != 0) {
                                                      break L19;
                                                    } else {
                                                      continue L21;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            this.field_o.field_w = this.field_o.field_w + var6;
                                            this.field_o.field_x.field_h = this.field_o.field_x.field_h + var6;
                                            break L19;
                                          }
                                          L22: {
                                            if (this.field_o.field_x.field_h == var5) {
                                              break L22;
                                            } else {
                                              if (-513 != (this.field_o.field_w ^ -1)) {
                                                break L15;
                                              } else {
                                                this.field_o.field_w = 0;
                                                if (var16 == 0) {
                                                  break L15;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                          }
                                          this.field_o.b(12);
                                          this.field_o.field_v = false;
                                          this.field_o = null;
                                          if (var16 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L23: {
                                        var5 = var4 - this.field_h.field_h;
                                        if (var5 <= var3_int) {
                                          break L23;
                                        } else {
                                          var5 = var3_int;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        L25: {
                                          this.field_r.a(this.field_h.field_j, (byte) -109, var5, this.field_h.field_h);
                                          if (this.field_a != 0) {
                                            var6 = 0;
                                            L26: while (true) {
                                              if (var5 <= var6) {
                                                break L25;
                                              } else {
                                                this.field_h.field_j[var6 + this.field_h.field_h] = (byte)dg.a((int) this.field_h.field_j[var6 + this.field_h.field_h], (int) this.field_a);
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
                                        this.field_h.field_h = this.field_h.field_h + var5;
                                        break L24;
                                      }
                                      if (this.field_h.field_h < var4) {
                                        break L15;
                                      } else {
                                        L27: {
                                          if (null != this.field_o) {
                                            break L27;
                                          } else {
                                            L28: {
                                              this.field_h.field_h = 0;
                                              var6 = this.field_h.d(true);
                                              var7 = this.field_h.d((byte) 19);
                                              var8 = this.field_h.d(true);
                                              var9 = this.field_h.d((byte) 19);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_71_0 = 0;
                                                stackIn_72_0 = stackOut_71_0;
                                                break L28;
                                              } else {
                                                stackOut_70_0 = 1;
                                                stackIn_72_0 = stackOut_70_0;
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              L30: {
                                                var11 = stackIn_72_0;
                                                var12 = ((long)var6 << 323021600) + (long)var7;
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (dc) ((Object) this.field_k.a(true));
                                                  L31: while (true) {
                                                    if (var14_ref == null) {
                                                      break L30;
                                                    } else {
                                                      stackOut_80_0 = ((var12 ^ -1L) < (var14_ref.field_j ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_j ^ -1L) ? 0 : 1));
                                                      stackIn_89_0 = stackOut_80_0;
                                                      stackIn_81_0 = stackOut_80_0;
                                                      if (var16 != 0) {
                                                        break L29;
                                                      } else {
                                                        L32: {
                                                          if (stackIn_81_0 != 0) {
                                                            break L32;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L30;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (dc) ((Object) this.field_k.a(-256));
                                                        if (var16 == 0) {
                                                          continue L31;
                                                        } else {
                                                          break L30;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (dc) ((Object) this.field_f.a(true));
                                                  L33: while (true) {
                                                    if (var14_ref == null) {
                                                      break L30;
                                                    } else {
                                                      stackOut_75_0 = (var14_ref.field_j < var12 ? -1 : (var14_ref.field_j == var12 ? 0 : 1));
                                                      stackIn_89_0 = stackOut_75_0;
                                                      stackIn_76_0 = stackOut_75_0;
                                                      if (var16 != 0) {
                                                        break L29;
                                                      } else {
                                                        if (stackIn_76_0 == 0) {
                                                          break L30;
                                                        } else {
                                                          var14_ref = (dc) ((Object) this.field_f.a(-256));
                                                          continue L33;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                this.field_o = var14_ref;
                                                stackOut_88_0 = 0;
                                                stackIn_89_0 = stackOut_88_0;
                                                break L29;
                                              }
                                            }
                                            L34: {
                                              if (stackIn_89_0 != var10) {
                                                stackOut_91_0 = 9;
                                                stackIn_92_0 = stackOut_91_0;
                                                break L34;
                                              } else {
                                                stackOut_90_0 = 5;
                                                stackIn_92_0 = stackOut_90_0;
                                                break L34;
                                              }
                                            }
                                            var15 = stackIn_92_0;
                                            this.field_o.field_x = new wf(this.field_o.field_A + var15 + var9);
                                            this.field_o.field_x.c(var10, -1);
                                            this.field_o.field_x.f(var9, -32287);
                                            this.field_o.field_w = 10;
                                            this.field_h.field_h = 0;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L35: {
                                          if (this.field_o.field_w == 0) {
                                            L36: {
                                              if (0 == (this.field_h.field_j[0] ^ -1)) {
                                                break L36;
                                              } else {
                                                this.field_o = null;
                                                if (var16 == 0) {
                                                  break L15;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            this.field_o.field_w = 1;
                                            this.field_h.field_h = 0;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L35;
                                            }
                                          } else {
                                            break L35;
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
                          }
                          stackOut_102_0 = 1;
                          stackIn_103_0 = stackOut_102_0;
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
                  L37: {
                    this.field_r.b(41);
                    break L37;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L38: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L38;
                  }
                }
                this.field_j = -2;
                this.field_p = this.field_p + 1;
                this.field_r = null;
                if (this.c((byte) 67) == 0) {
                  if (-1 != (this.a(true) ^ -1)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_103_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        if (param0 != -15) {
            qf.g(49);
        }
        field_q = null;
        field_s = null;
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null == this.field_r) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_h = 0;
                    if (param0 == -108) {
                      break L1;
                    } else {
                      field_s = (String) null;
                      break L1;
                    }
                  }
                  this.field_b.c(6, -1);
                  this.field_b.d(3, 48);
                  this.field_b.e(97, 0);
                  this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, param0 ^ -124, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_r.b(param0 + 235);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_r = null;
                  this.field_j = -2;
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

    final static void g(int param0) {
        if (null != jj.field_a) {
            jj.field_a.g(true);
        }
        hd.field_a = new r();
        di.field_x.b(122, hd.field_a);
        if (param0 >= -15) {
            field_q = (int[]) null;
        }
    }

    final static void a(Lexicominos param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              qc.field_c[5] = qc.field_c[5] + 43;
              qc.field_a[5] = new int[]{2};
              vg.field_d[5] = new sg(param0, 5);
              qc.field_a[1] = new int[]{21, 2};
              vg.field_d[1] = new sg(param0, 1);
              if (param1 >= 108) {
                break L1;
              } else {
                qf.e((byte) 68);
                break L1;
              }
            }
            L2: {
              if (0 >= jd.field_c) {
                break L2;
              } else {
                if (!pk.a(jh.field_a, -104)) {
                  break L2;
                } else {
                  qc.field_a[2] = new int[]{6, 4, 7, 10, 8, 11};
                  qc.field_c[2] = -(43 * qc.field_a[2].length / 2) + 225;
                  vg.field_d[2] = new sg(param0, 2);
                  qc.field_a[14] = new int[]{19, 4, 7, 10, 8, 20};
                  qc.field_c[14] = -(qc.field_a[14].length * 43 / 2) + 225;
                  vg.field_d[14] = new sg(param0, 14);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("qf.N(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            dc var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            var6 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_r) {
                    try {
                      L2: {
                        this.field_r.b(17);
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
                  } else {
                    break L1;
                  }
                }
                this.field_r = (ge) (param2);
                this.d((byte) -108);
                this.a(-82, param0);
                this.field_o = null;
                this.field_h.field_h = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      var4_ref3 = (dc) ((Object) this.field_k.a((byte) 100));
                      if (var4_ref3 == null) {
                        break L6;
                      } else {
                        this.field_l.a(-72, var4_ref3);
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
                              this.field_d.a(-74, var4_ref3);
                              break L8;
                            }
                            if (var6 == 0) {
                              var4_ref3 = (dc) ((Object) this.field_f.a((byte) 100));
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
                      var4_ref3 = (dc) ((Object) this.field_f.a((byte) 100));
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
                        this.field_d.a(-74, var4_ref3);
                        break L11;
                      }
                      if (var6 == 0) {
                        continue L10;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L13: {
                    if (-1 == (this.field_a ^ -1)) {
                      break L13;
                    } else {
                      try {
                        L14: {
                          this.field_b.field_h = 0;
                          this.field_b.c(4, -1);
                          this.field_b.c((int) this.field_a, -1);
                          this.field_b.f(0, -32287);
                          this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 67, 0);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L15: {
                          var4_ref = (IOException) (Object) decompiledCaughtException;
                          try {
                            L16: {
                              this.field_r.b(84);
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
                          this.field_p = this.field_p + 1;
                          break L15;
                        }
                      }
                      break L13;
                    }
                  }
                  L18: {
                    this.field_e = 0;
                    this.field_n = rf.c(0);
                    if (param1 <= -87) {
                      break L18;
                    } else {
                      this.a(1, false);
                      break L18;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_30_0 = (RuntimeException) (var4_ref2);
                stackOut_30_1 = new StringBuilder().append("qf.D(").append(param0).append(',').append(param1).append(',');
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param2 == null) {
                  stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
                  stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
                  stackOut_32_2 = "null";
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L19;
                } else {
                  stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
                  stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
                  stackOut_31_2 = "{...}";
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  break L19;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        try {
            this.field_r.b(16);
        } catch (Exception exception) {
        }
        if (param0 != -28488) {
            discarded$0 = this.a((byte) 46);
        }
        this.field_j = -1;
        this.field_r = null;
        this.field_p = this.field_p + 1;
        this.field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    public qf() {
    }

    static {
        field_s = "Waiting for graphics";
        field_q = new int[8192];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qf extends wb {
    static String field_s;
    private ge field_r;
    static int[] field_q;

    final void b(int param0) {
        if (!(null == this.field_r)) {
            this.field_r.b(param0 ^ 80);
        }
        if (param0 != 0) {
            this.a((byte) 59);
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackIn_21_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (param1.equals("C")) {
                            stackIn_28_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackIn_24_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("qf.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
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
            wf stackIn_5_0 = null;
            wf stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null == this.field_r) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_h = 0;
                    stackIn_5_0 = this.field_b;

                    if (param1) {
                      stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                      stackIn_6_1 = 2;
                      break L1;
                    } else {
                      stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                      stackIn_6_1 = 3;
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
            int stackIn_58_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            dc var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
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
              L4: {
                if (-1 != (this.c((byte) 67) ^ -1)) {
                  break L4;
                } else {
                  if (this.a(true) != 0) {
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
                  this.field_r.a(0);
                  var2 = (dc) ((Object) this.field_l.a(true));
                  L6: while (true) {
                    if (var2 == null) {
                      var2 = (dc) ((Object) this.field_d.a(true));
                      var3_int = 98 % ((-74 - param0) / 48);
                      L7: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (var2_int >= 100) {
                                break L9;
                              } else {
                                var3_int = this.field_r.d(-6448);
                                if (-1 < (var3_int ^ -1)) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L9;
                                  } else {
                                    L10: {
                                      this.field_e = 0;
                                      var4 = 0;
                                      if (null == this.field_o) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (this.field_o.field_w == 0) {
                                          var4 = 1;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (0 < var4) {
                                        L12: {
                                          var5 = var4 - this.field_h.field_h;
                                          if (var5 <= var3_int) {
                                            break L12;
                                          } else {
                                            var5 = var3_int;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          this.field_r.a(this.field_h.field_j, (byte) -109, var5, this.field_h.field_h);
                                          if (this.field_a != 0) {
                                            var6 = 0;
                                            L14: while (true) {
                                              if (var5 <= var6) {
                                                break L13;
                                              } else {
                                                this.field_h.field_j[var6 + this.field_h.field_h] = (byte)dg.a((int) this.field_h.field_j[var6 + this.field_h.field_h], (int) this.field_a);
                                                var6++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        this.field_h.field_h = this.field_h.field_h + var5;
                                        if (this.field_h.field_h < var4) {
                                          break L11;
                                        } else {
                                          if (null != this.field_o) {
                                            if (this.field_o.field_w == 0) {
                                              if (0 == (this.field_h.field_j[0] ^ -1)) {
                                                this.field_o.field_w = 1;
                                                this.field_h.field_h = 0;
                                                break L11;
                                              } else {
                                                this.field_o = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L15: {
                                              this.field_h.field_h = 0;
                                              var6 = this.field_h.d(true);
                                              var7 = this.field_h.d((byte) 19);
                                              var8 = this.field_h.d(true);
                                              var9 = this.field_h.d((byte) 19);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackIn_58_0 = 0;
                                                break L15;
                                              } else {
                                                stackIn_58_0 = 1;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              var11 = stackIn_58_0;
                                              var12 = ((long)var6 << 323021600) + (long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (dc) ((Object) this.field_k.a(true));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if ((var12 ^ -1L) != (var14_ref.field_j ^ -1L)) {
                                                      var14_ref = (dc) ((Object) this.field_k.a(-256));
                                                      continue L17;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (dc) ((Object) this.field_f.a(true));
                                                L18: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var14_ref.field_j == var12) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (dc) ((Object) this.field_f.a(-256));
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
                                                this.field_o = var14_ref;
                                                if (0 != var10) {
                                                  stackIn_74_0 = 9;
                                                  break L19;
                                                } else {
                                                  stackIn_74_0 = 5;
                                                  break L19;
                                                }
                                              }
                                              var15 = stackIn_74_0;
                                              this.field_o.field_x = new wf(this.field_o.field_A + var15 + var9);
                                              this.field_o.field_x.c(var10, -1);
                                              this.field_o.field_x.f(var9, -32287);
                                              this.field_o.field_w = 10;
                                              this.field_h.field_h = 0;
                                              break L11;
                                            }
                                          }
                                        }
                                      } else {
                                        L20: {
                                          var5 = -this.field_o.field_A + this.field_o.field_x.field_j.length;
                                          var6 = -this.field_o.field_w + 512;
                                          if (var6 > -this.field_o.field_x.field_h + var5) {
                                            var6 = var5 + -this.field_o.field_x.field_h;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var3_int >= var6) {
                                            break L21;
                                          } else {
                                            var6 = var3_int;
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          this.field_r.a(this.field_o.field_x.field_j, (byte) -109, var6, this.field_o.field_x.field_h);
                                          if (0 == this.field_a) {
                                            break L22;
                                          } else {
                                            var7 = 0;
                                            L23: while (true) {
                                              if (var6 <= var7) {
                                                break L22;
                                              } else {
                                                this.field_o.field_x.field_j[this.field_o.field_x.field_h - -var7] = (byte)dg.a((int) this.field_o.field_x.field_j[this.field_o.field_x.field_h + var7], (int) this.field_a);
                                                var7++;
                                                continue L23;
                                              }
                                            }
                                          }
                                        }
                                        this.field_o.field_w = this.field_o.field_w + var6;
                                        this.field_o.field_x.field_h = this.field_o.field_x.field_h + var6;
                                        if (this.field_o.field_x.field_h == var5) {
                                          this.field_o.b(12);
                                          this.field_o.field_v = false;
                                          this.field_o = null;
                                          break L11;
                                        } else {
                                          if (-513 != (this.field_o.field_w ^ -1)) {
                                            break L11;
                                          } else {
                                            this.field_o.field_w = 0;
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
                            stackIn_83_0 = 1;
                            break L5;
                          }
                        } else {
                          this.field_b.field_h = 0;
                          this.field_b.c(0, -1);
                          this.field_b.a(var2.field_j, 687419600);
                          this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, -124, 0);
                          this.field_f.a(82, var2);
                          var2 = (dc) ((Object) this.field_d.a(-256));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_b.field_h = 0;
                      this.field_b.c(1, -1);
                      this.field_b.a(var2.field_j, 687419600);
                      this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 58, 0);
                      this.field_k.a(85, var2);
                      var2 = (dc) ((Object) this.field_l.a(-256));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_r.b(41);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                this.field_j = -2;
                this.field_p = this.field_p + 1;
                this.field_r = null;
                if (this.c((byte) 67) != 0) {
                  return false;
                } else {
                  if (-1 == (this.a(true) ^ -1)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              return stackIn_83_0 != 0;
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
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
              L3: {
                if (0 >= jd.field_c) {
                  break L3;
                } else {
                  if (!pk.a(jh.field_a, -104)) {
                    break L3;
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
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("qf.N(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, Object param2) {
        try {
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            dc var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
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
                  var4_ref = (dc) ((Object) this.field_k.a((byte) 100));
                  if (var4_ref == null) {
                    L5: while (true) {
                      var4_ref = (dc) ((Object) this.field_f.a((byte) 100));
                      if (var4_ref != null) {
                        this.field_d.a(-74, var4_ref);
                        continue L5;
                      } else {
                        L6: {
                          if (-1 == (this.field_a ^ -1)) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_b.field_h = 0;
                                this.field_b.c(4, -1);
                                this.field_b.c((int) this.field_a, -1);
                                this.field_b.f(0, -32287);
                                this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 67, 0);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_r.b(84);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_r = null;
                                this.field_j = -2;
                                this.field_p = this.field_p + 1;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        L11: {
                          this.field_e = 0;
                          this.field_n = rf.c(0);
                          if (param1 <= -87) {
                            break L11;
                          } else {
                            this.a(1, false);
                            break L11;
                          }
                        }
                        break L0;
                      }
                    }
                  } else {
                    this.field_l.a(-72, var4_ref);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_26_0 = (RuntimeException) (var4_ref3);

                stackIn_26_1 = new StringBuilder().append("qf.D(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackIn_27_2 = "null";
                  break L12;
                } else {
                  stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackIn_27_2 = "{...}";
                  break L12;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        try {
            this.field_r.b(16);
        } catch (Exception exception) {
        }
        if (param0 != -28488) {
            this.a((byte) 46);
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

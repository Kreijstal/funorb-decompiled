/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl extends na {
    static si[] field_o;
    private hi field_p;
    static int field_r;
    static ji[] field_q;

    final void a(boolean param0) {
        try {
            this.field_p.b((byte) 76);
        } catch (Exception exception) {
        }
        this.field_p = null;
        this.field_k = this.field_k + 1;
        this.field_n = -1;
        this.field_h = (byte)(int)(1.0 + 255.0 * Math.random());
        if (!param0) {
            field_o = (si[]) null;
        }
    }

    final static vi d(byte param0) {
        if (param0 <= 124) {
            sl.e(-10);
        }
        return ol.field_c;
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fi var2_ref = null;
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
            fi var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_20_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_87_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_19_0 = 0;
            L0: {
              var16 = wizardrun.field_H;
              if (null != this.field_p) {
                L1: {
                  var2_long = d.a((byte) 79);
                  var4 = (int)(var2_long - this.field_d);
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_d = var2_long;
                this.field_f = this.field_f + var4;
                if (this.field_f <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_p.b((byte) 76);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_p = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != this.field_p) {
              try {
                L4: {
                  this.field_p.a(param0 ^ 0);
                  var2_ref = (fi) ((Object) this.field_b.a(0));
                  L5: while (true) {
                    if (var2_ref == null) {
                      if (param0 == 0) {
                        var2_ref = (fi) ((Object) this.field_j.a(0));
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (100 <= var2_int) {
                                  break L8;
                                } else {
                                  var3_int = this.field_p.c((byte) 89);
                                  if (-1 >= (var3_int ^ -1)) {
                                    if (-1 == (var3_int ^ -1)) {
                                      break L8;
                                    } else {
                                      L9: {
                                        this.field_f = 0;
                                        var4 = 0;
                                        if (null == this.field_c) {
                                          var4 = 10;
                                          break L9;
                                        } else {
                                          if (0 != this.field_c.field_z) {
                                            break L9;
                                          } else {
                                            var4 = 1;
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (var4 <= 0) {
                                          L11: {
                                            var5 = this.field_c.field_C.field_k.length + -this.field_c.field_D;
                                            var6 = 512 - this.field_c.field_z;
                                            if (var5 - this.field_c.field_C.field_m < var6) {
                                              var6 = var5 + -this.field_c.field_C.field_m;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (var6 <= var3_int) {
                                              break L12;
                                            } else {
                                              var6 = var3_int;
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            this.field_p.a(this.field_c.field_C.field_k, -124, var6, this.field_c.field_C.field_m);
                                            if (this.field_h != 0) {
                                              var17 = 0;
                                              var7 = var17;
                                              L14: while (true) {
                                                if (var17 >= var6) {
                                                  break L13;
                                                } else {
                                                  this.field_c.field_C.field_k[this.field_c.field_C.field_m - -var17] = (byte)sg.a((int) this.field_c.field_C.field_k[this.field_c.field_C.field_m + var17], (int) this.field_h);
                                                  var17++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                          this.field_c.field_C.field_m = this.field_c.field_C.field_m + var6;
                                          this.field_c.field_z = this.field_c.field_z + var6;
                                          if (this.field_c.field_C.field_m != var5) {
                                            if (this.field_c.field_z == 512) {
                                              this.field_c.field_z = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            this.field_c.b(false);
                                            this.field_c.field_s = false;
                                            this.field_c = null;
                                            break L10;
                                          }
                                        } else {
                                          L15: {
                                            var5 = var4 + -this.field_g.field_m;
                                            if (var3_int >= var5) {
                                              break L15;
                                            } else {
                                              var5 = var3_int;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            this.field_p.a(this.field_g.field_k, param0 + -105, var5, this.field_g.field_m);
                                            if (this.field_h == 0) {
                                              break L16;
                                            } else {
                                              var6 = 0;
                                              L17: while (true) {
                                                if (var5 <= var6) {
                                                  break L16;
                                                } else {
                                                  this.field_g.field_k[this.field_g.field_m - -var6] = (byte)sg.a((int) this.field_g.field_k[this.field_g.field_m + var6], (int) this.field_h);
                                                  var6++;
                                                  continue L17;
                                                }
                                              }
                                            }
                                          }
                                          this.field_g.field_m = this.field_g.field_m + var5;
                                          if (this.field_g.field_m >= var4) {
                                            if (null == this.field_c) {
                                              L18: {
                                                this.field_g.field_m = 0;
                                                var6 = this.field_g.f(255);
                                                var7 = this.field_g.i(param0 ^ 255);
                                                var8 = this.field_g.f(255);
                                                var9 = this.field_g.i(255);
                                                var10 = var8 & 127;
                                                if (-1 == (128 & var8 ^ -1)) {
                                                  stackOut_46_0 = 0;
                                                  stackIn_47_0 = stackOut_46_0;
                                                  break L18;
                                                } else {
                                                  stackOut_45_0 = 1;
                                                  stackIn_47_0 = stackOut_45_0;
                                                  break L18;
                                                }
                                              }
                                              L19: {
                                                var11 = stackIn_47_0;
                                                var12 = ((long)var6 << -1806274016) - -(long)var7;
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (fi) ((Object) this.field_a.a(0));
                                                  L20: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if (var12 == var14_ref.field_o) {
                                                        break L19;
                                                      } else {
                                                        var14_ref = (fi) ((Object) this.field_a.d(42));
                                                        continue L20;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (fi) ((Object) this.field_m.a(0));
                                                  L21: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if ((var12 ^ -1L) != (var14_ref.field_o ^ -1L)) {
                                                        var14_ref = (fi) ((Object) this.field_m.d(87));
                                                        continue L21;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                L22: {
                                                  if (-1 != (var10 ^ -1)) {
                                                    stackOut_62_0 = 9;
                                                    stackIn_63_0 = stackOut_62_0;
                                                    break L22;
                                                  } else {
                                                    stackOut_61_0 = 5;
                                                    stackIn_63_0 = stackOut_61_0;
                                                    break L22;
                                                  }
                                                }
                                                var15 = stackIn_63_0;
                                                this.field_c = var14_ref;
                                                this.field_c.field_C = new va(this.field_c.field_D + var9 - -var15);
                                                this.field_c.field_C.b((byte) 11, var10);
                                                this.field_c.field_C.f(var9, 613003928);
                                                this.field_c.field_z = 10;
                                                this.field_g.field_m = 0;
                                                break L10;
                                              }
                                            } else {
                                              if (0 == this.field_c.field_z) {
                                                if ((this.field_g.field_k[0] ^ -1) == 0) {
                                                  this.field_g.field_m = 0;
                                                  this.field_c.field_z = 1;
                                                  break L10;
                                                } else {
                                                  this.field_c = null;
                                                  break L10;
                                                }
                                              } else {
                                                throw new IOException();
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    }
                                  } else {
                                    throw new IOException();
                                  }
                                }
                              }
                              stackOut_86_0 = 1;
                              stackIn_87_0 = stackOut_86_0;
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          } else {
                            this.field_i.field_m = 0;
                            this.field_i.b((byte) 11, 0);
                            this.field_i.a(var2_ref.field_o, (byte) 123);
                            this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
                            this.field_m.a(var2_ref, 14);
                            var2_ref = (fi) ((Object) this.field_j.d(94));
                            continue L6;
                          }
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    } else {
                      this.field_i.field_m = 0;
                      this.field_i.b((byte) 11, 1);
                      this.field_i.a(var2_ref.field_o, (byte) 122);
                      this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
                      this.field_a.a(var2_ref, 14);
                      var2_ref = (fi) ((Object) this.field_b.d(14));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_p.b((byte) 76);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  this.field_k = this.field_k + 1;
                  this.field_p = null;
                  this.field_n = -2;
                  if (0 != this.d(param0 + -14289)) {
                    break L25;
                  } else {
                    if (-1 == (this.c((byte) -74) ^ -1)) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_87_0 != 0;
              }
            } else {
              if (this.d(-14289) != 0) {
                return false;
              } else {
                if (this.c((byte) -96) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Exception var4 = null;
            Throwable decompiledCaughtException = null;
            var2 = 66 / ((17 - param0) / 48);
            if (null != this.field_p) {
              try {
                L0: {
                  this.field_i.field_m = 0;
                  this.field_i.b((byte) 11, 6);
                  this.field_i.a(3, false);
                  this.field_i.b(-1947079288, 0);
                  this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_p.b((byte) 76);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_n = -2;
                  this.field_k = this.field_k + 1;
                  this.field_p = null;
                  break L1;
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

    final static void a(int param0, int param1, int param2) {
        if (param2 >= -126) {
            return;
        }
        sf.field_h = 7;
        hk.field_Y = param1;
        n.field_c = param0;
    }

    final void a(byte param0) {
        if (null != this.field_p) {
            this.field_p.b((byte) 76);
        }
        if (param0 > -73) {
            field_q = (ji[]) null;
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_o = null;
        if (param0 != -1) {
            sl.a(-54, 7, -58);
        }
    }

    final static o g(int param0) {
        int var4_int = 0;
        int var5 = wizardrun.field_H;
        int var1 = tf.field_b[0] * cg.field_k[0];
        byte[] var2 = mf.field_j[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = ic.field_b[kl.b((int) var2[var4_int], 255)];
        }
        o var4 = new o(hk.field_bb, eg.field_v, ph.field_q[0], ne.field_h[0], cg.field_k[param0], tf.field_b[0], var3);
        eb.a(param0 ^ 0);
        return var4;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            va stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            va stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            va stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            va stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            va stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            va stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (null != this.field_p) {
              try {
                L0: {
                  L1: {
                    if (param0 == 3) {
                      break L1;
                    } else {
                      this.field_p = (hi) null;
                      break L1;
                    }
                  }
                  L2: {
                    this.field_i.field_m = 0;
                    stackOut_4_0 = this.field_i;
                    stackOut_4_1 = 11;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (param1) {
                      stackOut_6_0 = (va) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (va) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((va) (Object) stackIn_7_0).b((byte) stackIn_7_1, stackIn_7_2);
                  this.field_i.a(0L, (byte) 106);
                  this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, param0 ^ 2, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_p.b((byte) 76);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_k = this.field_k + 1;
                  this.field_p = null;
                  this.field_n = -2;
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

    public sl() {
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            fi var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            var6 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  if (null != this.field_p) {
                    try {
                      L2: {
                        this.field_p.b((byte) 76);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_p = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 > 118) {
                  this.field_p = (hi) (param1);
                  this.f(-73);
                  this.a(3, param0);
                  this.field_g.field_m = 0;
                  this.field_c = null;
                  L4: while (true) {
                    var4_ref3 = (fi) ((Object) this.field_a.b(58));
                    if (var4_ref3 != null) {
                      this.field_b.a(var4_ref3, 14);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref3 = (fi) ((Object) this.field_m.b(70));
                        if (var4_ref3 == null) {
                          L6: {
                            if (this.field_h == 0) {
                              break L6;
                            } else {
                              try {
                                L7: {
                                  this.field_i.field_m = 0;
                                  this.field_i.b((byte) 11, 4);
                                  this.field_i.b((byte) 11, (int) this.field_h);
                                  this.field_i.f(0, 613003928);
                                  this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
                                  break L7;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L8: {
                                  var4_ref = (IOException) (Object) decompiledCaughtException;
                                  try {
                                    L9: {
                                      this.field_p.b((byte) 76);
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                                    decompiledCaughtException = decompiledCaughtParameter2;
                                    L10: {
                                      var5 = (Exception) (Object) decompiledCaughtException;
                                      break L10;
                                    }
                                  }
                                  this.field_k = this.field_k + 1;
                                  this.field_n = -2;
                                  this.field_p = null;
                                  break L8;
                                }
                              }
                              break L6;
                            }
                          }
                          this.field_f = 0;
                          this.field_d = d.a((byte) 50);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_j.a(var4_ref3, 14);
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) (var4_ref2);
                stackOut_25_1 = new StringBuilder().append("sl.A(").append(param0).append(',');
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param1 == null) {
                  stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L11;
                } else {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L11;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
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

    static {
    }
}

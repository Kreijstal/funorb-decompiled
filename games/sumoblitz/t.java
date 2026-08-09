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
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            fv var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
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
                  var4_ref = (fv) ((Object) this.field_h.b((byte) 72));
                  if (var4_ref == null) {
                    L5: while (true) {
                      var4_ref = (fv) ((Object) this.field_g.b((byte) 72));
                      if (var4_ref != null) {
                        this.field_f.a((pj) (var4_ref), (byte) -101);
                        continue L5;
                      } else {
                        if (param1 > 90) {
                          L6: {
                            if (this.field_m != 0) {
                              try {
                                L7: {
                                  this.field_n.field_p = 0;
                                  this.field_n.b((byte) 89, 4);
                                  this.field_n.b((byte) 36, (int) this.field_m);
                                  this.field_n.e(48, 0);
                                  this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                                  break L7;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L8: {
                                  var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                  try {
                                    L9: {
                                      this.field_r.a((byte) -73);
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
                                  this.field_d = this.field_d + 1;
                                  break L8;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
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
                  } else {
                    this.field_l.a((pj) (var4_ref), (byte) -128);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_27_0 = (RuntimeException) (var4_ref3);

                stackIn_27_1 = new StringBuilder().append("t.F(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackIn_28_2 = "null";
                  break L11;
                } else {
                  stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackIn_28_2 = "{...}";
                  break L11;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            fv var2 = null;
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
            fv var14_ref = null;
            int var15 = 0;
            int var16 = 0;
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
                if (-1 != (this.d(-2115911413) ^ -1)) {
                  return false;
                } else {
                  if (0 == this.a((byte) -86)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                try {
                  L4: {
                    this.field_r.b(-120);
                    var2 = (fv) ((Object) this.field_l.a(32));
                    L5: while (true) {
                      if (var2 == null) {
                        var2 = (fv) ((Object) this.field_f.a(37));
                        L6: while (true) {
                          if (var2 == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (var2_int >= 100) {
                                  break L8;
                                } else {
                                  var3_int = this.field_r.c(-128);
                                  if (-1 < (var3_int ^ -1)) {
                                    throw new IOException();
                                  } else {
                                    if (var3_int == 0) {
                                      break L8;
                                    } else {
                                      L9: {
                                        this.field_c = 0;
                                        var4 = 0;
                                        if (this.field_i == null) {
                                          var4 = 10;
                                          break L9;
                                        } else {
                                          if (0 == this.field_i.field_x) {
                                            var4 = 1;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (-1 > (var4 ^ -1)) {
                                          L11: {
                                            var5 = -this.field_b.field_p + var4;
                                            if (var3_int >= var5) {
                                              break L11;
                                            } else {
                                              var5 = var3_int;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            this.field_r.a(-114, this.field_b.field_p, var5, this.field_b.field_n);
                                            if (0 != this.field_m) {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var6 >= var5) {
                                                  break L12;
                                                } else {
                                                  this.field_b.field_n[var6 + this.field_b.field_p] = (byte)jg.a((int) this.field_b.field_n[var6 + this.field_b.field_p], (int) this.field_m);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          this.field_b.field_p = this.field_b.field_p + var5;
                                          if (this.field_b.field_p >= var4) {
                                            if (null == this.field_i) {
                                              L14: {
                                                this.field_b.field_p = 0;
                                                var6 = this.field_b.e(-31302);
                                                var7 = this.field_b.c(true);
                                                var8 = this.field_b.e(-31302);
                                                var9 = this.field_b.c(true);
                                                var10 = 127 & var8;
                                                if (0 == (128 & var8)) {
                                                  stackIn_65_0 = 0;
                                                  break L14;
                                                } else {
                                                  stackIn_65_0 = 1;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_65_0;
                                                var12 = ((long)var6 << 1826556384) - -(long)var7;
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (fv) ((Object) this.field_g.a(64));
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (var14_ref.field_l == var12) {
                                                        break L15;
                                                      } else {
                                                        var14_ref = (fv) ((Object) this.field_g.d(-2));
                                                        continue L16;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (fv) ((Object) this.field_h.a(66));
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if ((var12 ^ -1L) != (var14_ref.field_l ^ -1L)) {
                                                        var14_ref = (fv) ((Object) this.field_h.d(-2));
                                                        continue L17;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                L18: {
                                                  if (0 == var10) {
                                                    stackIn_81_0 = 5;
                                                    break L18;
                                                  } else {
                                                    stackIn_81_0 = 9;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_81_0;
                                                this.field_i = var14_ref;
                                                this.field_i.field_w = new fs(this.field_i.field_z + var15 + var9);
                                                this.field_i.field_w.b((byte) 37, var10);
                                                this.field_i.field_w.e(48, var9);
                                                this.field_i.field_x = 10;
                                                this.field_b.field_p = 0;
                                                break L10;
                                              }
                                            } else {
                                              if (0 != this.field_i.field_x) {
                                                throw new IOException();
                                              } else {
                                                if (0 == (this.field_b.field_n[0] ^ -1)) {
                                                  this.field_i.field_x = 1;
                                                  this.field_b.field_p = 0;
                                                  break L10;
                                                } else {
                                                  this.field_i = null;
                                                  break L10;
                                                }
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          L19: {
                                            var5 = this.field_i.field_w.field_n.length + -this.field_i.field_z;
                                            var6 = -this.field_i.field_x + 512;
                                            if (var6 <= var5 - this.field_i.field_w.field_p) {
                                              break L19;
                                            } else {
                                              var6 = var5 - this.field_i.field_w.field_p;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            if (var3_int >= var6) {
                                              break L20;
                                            } else {
                                              var6 = var3_int;
                                              break L20;
                                            }
                                          }
                                          L21: {
                                            this.field_r.a(-115, this.field_i.field_w.field_p, var6, this.field_i.field_w.field_n);
                                            if (-1 != (this.field_m ^ -1)) {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var7 >= var6) {
                                                  break L21;
                                                } else {
                                                  this.field_i.field_w.field_n[this.field_i.field_w.field_p + var7] = (byte)jg.a((int) this.field_i.field_w.field_n[this.field_i.field_w.field_p + var7], (int) this.field_m);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                          this.field_i.field_x = this.field_i.field_x + var6;
                                          this.field_i.field_w.field_p = this.field_i.field_w.field_p + var6;
                                          if (var5 != this.field_i.field_w.field_p) {
                                            if (this.field_i.field_x == 512) {
                                              this.field_i.field_x = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            this.field_i.c(-5106);
                                            this.field_i.field_u = false;
                                            this.field_i = null;
                                            break L10;
                                          }
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                              stackIn_89_0 = 1;
                              break L4;
                            }
                          } else {
                            this.field_n.field_p = 0;
                            this.field_n.b((byte) 86, 0);
                            this.field_n.b(var2.field_l, 1105594440);
                            this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                            this.field_g.a((pj) (var2), (byte) -103);
                            var2 = (fv) ((Object) this.field_f.d(-2));
                            continue L6;
                          }
                        }
                      } else {
                        this.field_n.field_p = 0;
                        this.field_n.b((byte) 55, 1);
                        this.field_n.b(var2.field_l, 1105594440);
                        this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
                        this.field_h.a((pj) (var2), (byte) -107);
                        var2 = (fv) ((Object) this.field_l.d(-2));
                        continue L5;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2_ref = (IOException) (Object) decompiledCaughtException;
                  try {
                    L23: {
                      this.field_r.a((byte) -60);
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
                    this.field_r = null;
                    this.field_d = this.field_d + 1;
                    this.field_j = -2;
                    if (0 != this.d(-2115911413)) {
                      break L25;
                    } else {
                      if (-1 != (this.a((byte) -122) ^ -1)) {
                        break L25;
                      } else {
                        return true;
                      }
                    }
                  }
                  return false;
                }
                return stackIn_89_0 != 0;
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
            fs stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            fs stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_n.field_p = 0;
                    stackIn_5_0 = this.field_n;

                    stackIn_5_1 = 46;

                    if (!param1) {
                      stackIn_6_0 = (fs) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 3;
                      break L1;
                    } else {
                      stackIn_6_0 = (fs) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 2;
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
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
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

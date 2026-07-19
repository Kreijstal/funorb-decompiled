/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eg extends tk {
    static er[] field_r;
    static String field_t;
    private pm field_u;
    static String field_q;
    static int[][] field_s;

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ia var2_ref = null;
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
            ia var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_88_0 = 0;
            L0: {
              var16 = Vertigo2.field_L ? 1 : 0;
              if (param0 == -3599) {
                break L0;
              } else {
                field_q = (String) null;
                break L0;
              }
            }
            L1: {
              if (this.field_u == null) {
                break L1;
              } else {
                L2: {
                  var2_long = gk.a(param0 + 3686);
                  var4 = (int)(-this.field_k + var2_long);
                  if (-201 > (var4 ^ -1)) {
                    var4 = 200;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_k = var2_long;
                this.field_o = this.field_o + var4;
                if ((this.field_o ^ -1) >= -30001) {
                  break L1;
                } else {
                  try {
                    L3: {
                      this.field_u.b(0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_u = null;
                  break L1;
                }
              }
            }
            if (null == this.field_u) {
              if (-1 != (this.d((byte) -109) ^ -1)) {
                return false;
              } else {
                if (0 == this.b(param0 ^ 3598)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L5: {
                  this.field_u.c(-26206);
                  var2_ref = (ia) ((Object) this.field_b.b((byte) -50));
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ia) ((Object) this.field_d.b((byte) -50));
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if ((var2_int ^ -1) <= -101) {
                                break L9;
                              } else {
                                var3_int = this.field_u.a(15166);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (-1 != (var3_int ^ -1)) {
                                    L10: {
                                      this.field_o = 0;
                                      var4 = 0;
                                      if (null == this.field_h) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (this.field_h.field_F != 0) {
                                          break L10;
                                        } else {
                                          var4 = 1;
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (-1 <= (var4 ^ -1)) {
                                        L12: {
                                          var5 = this.field_h.field_J.field_p.length + -this.field_h.field_B;
                                          var6 = -this.field_h.field_F + 512;
                                          if (var5 - this.field_h.field_J.field_u < var6) {
                                            var6 = -this.field_h.field_J.field_u + var5;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var3_int < var6) {
                                            var6 = var3_int;
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          this.field_u.a(this.field_h.field_J.field_p, false, var6, this.field_h.field_J.field_u);
                                          if (-1 != (this.field_l ^ -1)) {
                                            var17 = 0;
                                            var7 = var17;
                                            L15: while (true) {
                                              if (var17 >= var6) {
                                                break L14;
                                              } else {
                                                this.field_h.field_J.field_p[this.field_h.field_J.field_u + var17] = (byte)tk.a((int) this.field_h.field_J.field_p[this.field_h.field_J.field_u + var17], (int) this.field_l);
                                                var17++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        this.field_h.field_F = this.field_h.field_F + var6;
                                        this.field_h.field_J.field_u = this.field_h.field_J.field_u + var6;
                                        if (this.field_h.field_J.field_u != var5) {
                                          if ((this.field_h.field_F ^ -1) != -513) {
                                            break L11;
                                          } else {
                                            this.field_h.field_F = 0;
                                            break L11;
                                          }
                                        } else {
                                          this.field_h.a(param0 ^ 3700);
                                          this.field_h.field_z = false;
                                          this.field_h = null;
                                          break L11;
                                        }
                                      } else {
                                        L16: {
                                          var5 = var4 + -this.field_i.field_u;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          this.field_u.a(this.field_i.field_p, false, var5, this.field_i.field_u);
                                          if (this.field_l != 0) {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var6 >= var5) {
                                                break L17;
                                              } else {
                                                this.field_i.field_p[var6 + this.field_i.field_u] = (byte)tk.a((int) this.field_i.field_p[var6 + this.field_i.field_u], (int) this.field_l);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        this.field_i.field_u = this.field_i.field_u + var5;
                                        if (var4 <= this.field_i.field_u) {
                                          if (this.field_h != null) {
                                            if (this.field_h.field_F != 0) {
                                              throw new IOException();
                                            } else {
                                              if (-1 != this.field_i.field_p[0]) {
                                                this.field_h = null;
                                                break L11;
                                              } else {
                                                this.field_h.field_F = 1;
                                                this.field_i.field_u = 0;
                                                break L11;
                                              }
                                            }
                                          } else {
                                            L19: {
                                              this.field_i.field_u = 0;
                                              var6 = this.field_i.h(param0 + 3588);
                                              var7 = this.field_i.b(true);
                                              var8 = this.field_i.h(-11);
                                              var9 = this.field_i.b(true);
                                              var10 = var8 & 127;
                                              if (-1 == (128 & var8 ^ -1)) {
                                                stackOut_49_0 = 0;
                                                stackIn_50_0 = stackOut_49_0;
                                                break L19;
                                              } else {
                                                stackOut_48_0 = 1;
                                                stackIn_50_0 = stackOut_48_0;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_50_0;
                                              var12 = (long)var7 + ((long)var6 << -1130058336);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (ia) ((Object) this.field_a.b((byte) -50));
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if ((var14_ref.field_n ^ -1L) != (var12 ^ -1L)) {
                                                      var14_ref = (ia) ((Object) this.field_a.a(true));
                                                      continue L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ia) ((Object) this.field_g.b((byte) -50));
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if ((var12 ^ -1L) == (var14_ref.field_n ^ -1L)) {
                                                      break L20;
                                                    } else {
                                                      var14_ref = (ia) ((Object) this.field_g.a(true));
                                                      continue L22;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L23: {
                                                this.field_h = var14_ref;
                                                if (0 == var10) {
                                                  stackOut_65_0 = 5;
                                                  stackIn_66_0 = stackOut_65_0;
                                                  break L23;
                                                } else {
                                                  stackOut_64_0 = 9;
                                                  stackIn_66_0 = stackOut_64_0;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              this.field_h.field_J = new ed(var9 + (var15 - -this.field_h.field_B));
                                              this.field_h.field_J.f(var10, -127);
                                              this.field_h.field_J.e(var9, param0 + 3599);
                                              this.field_h.field_F = 10;
                                              this.field_i.field_u = 0;
                                              break L11;
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            stackOut_88_0 = 1;
                            stackIn_89_0 = stackOut_88_0;
                            break L5;
                          }
                        } else {
                          this.field_f.field_u = 0;
                          this.field_f.f(0, 93);
                          this.field_f.b((byte) 125, var2_ref.field_n);
                          this.field_u.a(0, this.field_f.field_p.length, -93, this.field_f.field_p);
                          this.field_g.a(false, var2_ref);
                          var2_ref = (ia) ((Object) this.field_d.a(true));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_f.field_u = 0;
                      this.field_f.f(1, param0 ^ -3703);
                      this.field_f.b((byte) 90, var2_ref.field_n);
                      this.field_u.a(0, this.field_f.field_p.length, param0 ^ -3646, this.field_f.field_p);
                      this.field_a.a(false, var2_ref);
                      var2_ref = (ia) ((Object) this.field_b.a(true));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_u.b(param0 ^ -3599);
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
                  this.field_m = this.field_m + 1;
                  this.field_j = -2;
                  this.field_u = null;
                  if (-1 != (this.d((byte) -102) ^ -1)) {
                    break L26;
                  } else {
                    if (this.b(-1) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_89_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            int var4_int = 0;
            ia var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var6 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_u == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_u.b(0);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_u = null;
                    break L1;
                  }
                }
                this.field_u = (pm) (param0);
                this.g(0);
                this.a(param1, (byte) -50);
                this.field_h = null;
                this.field_i.field_u = 0;
                L4: while (true) {
                  var4_ref3 = (ia) ((Object) this.field_a.a(-67));
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (ia) ((Object) this.field_g.a(-75));
                      if (var4_ref3 == null) {
                        L6: {
                          if (-1 != (this.field_l ^ -1)) {
                            try {
                              L7: {
                                this.field_f.field_u = 0;
                                this.field_f.f(4, -84);
                                this.field_f.f((int) this.field_l, 115);
                                this.field_f.e(0, 0);
                                this.field_u.a(0, this.field_f.field_p.length, -87, this.field_f.field_p);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_u.b(0);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_m = this.field_m + 1;
                                this.field_j = -2;
                                this.field_u = null;
                                break L8;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.field_o = 0;
                        this.field_k = gk.a(111);
                        var4_int = 76 / ((0 - param2) / 43);
                        break L0;
                      } else {
                        this.field_d.a(false, var4_ref3);
                        continue L5;
                      }
                    }
                  } else {
                    this.field_b.a(false, var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var4_ref2);
                stackOut_22_1 = new StringBuilder().append("eg.G(");
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L11;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L11;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        if (param0 != 3) {
            eg.h(116);
        }
        field_s = (int[][]) null;
        field_q = null;
        field_t = null;
        field_r = null;
    }

    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (param0) {
            if (on.field_e[param1] >= on.field_e[param3]) {
              if (on.field_e[param1] > on.field_e[param3]) {
                return false;
              } else {
                if (hm.field_A[param1] < hm.field_A[param3]) {
                  return true;
                } else {
                  if (hm.field_A[param1] <= hm.field_A[param3]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            if (hm.field_A[param3] <= hm.field_A[param1]) {
              if (hm.field_A[param1] > hm.field_A[param3]) {
                return false;
              } else {
                if (on.field_e[param1] >= on.field_e[param3]) {
                  if (on.field_e[param3] >= on.field_e[param1]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          }
        }
        var4 = jf.field_N[param1] + li.field_g[param1] - -ub.field_p[param1];
        var5 = jf.field_N[param3] + li.field_g[param3] - -ub.field_p[param3];
        if (var5 > var4) {
          return true;
        } else {
          if (var5 >= var4) {
            L1: {
              var6 = -30 / ((param2 - 0) / 39);
              if (param3 <= param1) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L1;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L1;
              }
            }
            return stackIn_28_0 != 0;
          } else {
            return false;
          }
        }
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null == this.field_u) {
              return;
            } else {
              try {
                L0: {
                  this.field_f.field_u = 0;
                  this.field_f.f(6, 118);
                  this.field_f.i(param0 ^ -1725083856, 3);
                  this.field_f.d(0, param0 ^ -1783);
                  this.field_u.a(param0, this.field_f.field_p.length, 34, this.field_f.field_p);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_u.b(param0 + 0);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_m = this.field_m + 1;
                  this.field_u = null;
                  this.field_j = -2;
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

    final void e(int param0) {
        try {
            this.field_u.b(param0);
        } catch (Exception exception) {
        }
        this.field_u = null;
        this.field_m = this.field_m + 1;
        this.field_j = -1;
        this.field_l = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void a(int param0, ra param1) {
        if (param0 <= 76) {
            return;
        }
        try {
            il.field_g.b(param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "eg.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public eg() {
    }

    final void b(byte param0) {
        if (!(null == this.field_u)) {
            this.field_u.b(0);
        }
        if (param0 != 9) {
            field_q = (String) null;
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ed stackIn_6_0 = null;
            ed stackIn_7_0 = null;
            ed stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            Throwable decompiledCaughtException = null;
            ed stackOut_5_0 = null;
            ed stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            ed stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            if (this.field_u == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_f.field_u = 0;
                    if (param1 < 0) {
                      break L1;
                    } else {
                      field_s = (int[][]) null;
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_5_0 = this.field_f;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (!param0) {
                      stackOut_7_0 = (ed) ((Object) stackIn_7_0);
                      stackOut_7_1 = 3;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (ed) ((Object) stackIn_6_0);
                      stackOut_6_1 = 2;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((ed) (Object) stackIn_8_0).f(stackIn_8_1, 100);
                  this.field_f.b((byte) 50, 0L);
                  this.field_u.a(0, this.field_f.field_p.length, 26, this.field_f.field_p);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_u.b(0);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_m = this.field_m + 1;
                  this.field_j = -2;
                  this.field_u = null;
                  break L3;
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

    static {
        field_t = null;
        field_q = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = new int[][]{new int[]{0, 0, 1, 6}, new int[]{0, 0, 1, 7}, new int[]{0, 0, 1, 5, 2, 2}, new int[]{0, 1, 1, 7, 2, 2}};
    }
}

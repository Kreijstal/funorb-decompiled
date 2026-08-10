/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea extends va {
    private ad field_r;
    static String field_q;
    static int[] field_p;
    static int field_o;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            ic var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_r != null) {
                    try {
                      L2: {
                        this.field_r.d(param1 + -104);
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
                L4: {
                  this.field_r = (ad) (param2);
                  if (param1 == 106) {
                    break L4;
                  } else {
                    this.c(false);
                    break L4;
                  }
                }
                this.c(true);
                this.a(param0, false);
                this.field_a = null;
                this.field_h.field_m = 0;
                L5: while (true) {
                  var4_ref = (ic) ((Object) this.field_i.c(param1 ^ 106));
                  if (var4_ref != null) {
                    this.field_m.a(var4_ref, 0);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref = (ic) ((Object) this.field_k.c(0));
                      if (var4_ref == null) {
                        L7: {
                          if (this.field_n != 0) {
                            try {
                              L8: {
                                this.field_e.field_m = 0;
                                this.field_e.c(95, 4);
                                this.field_e.c(7, (int) this.field_n);
                                this.field_e.b(0, false);
                                this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_r.d(2);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_l = this.field_l + 1;
                                this.field_r = null;
                                this.field_c = -2;
                                break L9;
                              }
                            }
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        this.field_j = 0;
                        this.field_b = je.a(1);
                        break L0;
                      } else {
                        this.field_d.a(var4_ref, 0);
                        continue L6;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_28_0 = (RuntimeException) (var4_ref3);

                stackIn_28_1 = new StringBuilder().append("ea.K(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackIn_29_2 = "null";
                  break L12;
                } else {
                  stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackIn_29_2 = "{...}";
                  break L12;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od e(byte param0) {
        int var1 = -72 / ((param0 - 13) / 63);
        od var2 = new od(kl.field_a, we.field_e, ph.field_h[0], qf.field_d[0], sa.field_l[0], uj.field_b[0], jc.field_c[0], ig.field_H);
        og.a((byte) -97);
        return var2;
    }

    public static void d(boolean param0) {
        field_p = null;
        if (param0) {
            ea.e((byte) 96);
        }
        field_q = null;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            gb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_e.field_m = 0;
                    stackIn_5_0 = this.field_e;

                    stackIn_5_1 = 31;

                    if (param0) {
                      stackIn_6_0 = (gb) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 2;
                      break L1;
                    } else {
                      stackIn_6_0 = (gb) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 3;
                      break L1;
                    }
                  }
                  L2: {
                    ((gb) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2);
                    if (!param1) {
                      break L2;
                    } else {
                      ea.d(false);
                      break L2;
                    }
                  }
                  this.field_e.a(0L, 25576);
                  this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_r.d(2);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_l = this.field_l + 1;
                  this.field_c = -2;
                  this.field_r = null;
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

    final boolean d(byte param0) {
        try {
            int stackIn_48_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            ic var2 = null;
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
            ic var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            L0: {
              var16 = SolKnight.field_L ? 1 : 0;
              if (null == this.field_r) {
                break L0;
              } else {
                L1: {
                  var2_long = je.a(1);
                  var4 = (int)(-this.field_b + var2_long);
                  this.field_b = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_j = this.field_j + var4;
                if (this.field_j > 30000) {
                  try {
                    L2: {
                      this.field_r.d(2);
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
                if (0 != this.b(false)) {
                  break L4;
                } else {
                  if (this.c(param0 ^ -25) != 0) {
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
                  this.field_r.a(true);
                  var2 = (ic) ((Object) this.field_m.d(122));
                  L6: while (true) {
                    if (var2 == null) {
                      L7: {
                        if (param0 == 0) {
                          break L7;
                        } else {
                          ea.d(false);
                          break L7;
                        }
                      }
                      var2 = (ic) ((Object) this.field_d.d(123));
                      L8: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L9: while (true) {
                            if ((var2_int ^ -1) <= -101) {
                              stackIn_85_0 = 1;
                              break L5;
                            } else {
                              var3_int = this.field_r.b(-30119);
                              if (0 <= var3_int) {
                                if (-1 != (var3_int ^ -1)) {
                                  L10: {
                                    this.field_j = 0;
                                    var4 = 0;
                                    if (null == this.field_a) {
                                      var4 = 10;
                                      break L10;
                                    } else {
                                      if (0 != this.field_a.field_s) {
                                        break L10;
                                      } else {
                                        var4 = 1;
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var4 <= 0) {
                                      L12: {
                                        var5 = -this.field_a.field_y + this.field_a.field_v.field_l.length;
                                        var6 = -this.field_a.field_s + 512;
                                        if (-this.field_a.field_v.field_m + var5 >= var6) {
                                          break L12;
                                        } else {
                                          var6 = -this.field_a.field_v.field_m + var5;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (var6 > var3_int) {
                                          var6 = var3_int;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        this.field_r.a((byte) 44, this.field_a.field_v.field_m, var6, this.field_a.field_v.field_l);
                                        if (this.field_n != 0) {
                                          var17 = 0;
                                          var7 = var17;
                                          L15: while (true) {
                                            if (var6 <= var17) {
                                              break L14;
                                            } else {
                                              this.field_a.field_v.field_l[this.field_a.field_v.field_m + var17] = (byte)wa.a((int) this.field_a.field_v.field_l[this.field_a.field_v.field_m + var17], (int) this.field_n);
                                              var17++;
                                              continue L15;
                                            }
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                      this.field_a.field_v.field_m = this.field_a.field_v.field_m + var6;
                                      this.field_a.field_s = this.field_a.field_s + var6;
                                      if (var5 != this.field_a.field_v.field_m) {
                                        if (this.field_a.field_s != 512) {
                                          break L11;
                                        } else {
                                          this.field_a.field_s = 0;
                                          break L11;
                                        }
                                      } else {
                                        this.field_a.a(97);
                                        this.field_a.field_m = false;
                                        this.field_a = null;
                                        break L11;
                                      }
                                    } else {
                                      L16: {
                                        var5 = -this.field_h.field_m + var4;
                                        if (var5 > var3_int) {
                                          var5 = var3_int;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        this.field_r.a((byte) 39, this.field_h.field_m, var5, this.field_h.field_l);
                                        if (this.field_n == 0) {
                                          break L17;
                                        } else {
                                          var6 = 0;
                                          L18: while (true) {
                                            if (var6 >= var5) {
                                              break L17;
                                            } else {
                                              this.field_h.field_l[var6 + this.field_h.field_m] = (byte)wa.a((int) this.field_h.field_l[var6 + this.field_h.field_m], (int) this.field_n);
                                              var6++;
                                              continue L18;
                                            }
                                          }
                                        }
                                      }
                                      this.field_h.field_m = this.field_h.field_m + var5;
                                      if (this.field_h.field_m >= var4) {
                                        if (this.field_a != null) {
                                          if (this.field_a.field_s != 0) {
                                            throw new IOException();
                                          } else {
                                            if (this.field_h.field_l[0] != -1) {
                                              this.field_a = null;
                                              break L11;
                                            } else {
                                              this.field_h.field_m = 0;
                                              this.field_a.field_s = 1;
                                              break L11;
                                            }
                                          }
                                        } else {
                                          L19: {
                                            this.field_h.field_m = 0;
                                            var6 = this.field_h.j(255);
                                            var7 = this.field_h.e(true);
                                            var8 = this.field_h.j(255);
                                            var9 = this.field_h.e(true);
                                            var10 = var8 & 127;
                                            if ((128 & var8) == 0) {
                                              stackIn_48_0 = 0;
                                              break L19;
                                            } else {
                                              stackIn_48_0 = 1;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            var11 = stackIn_48_0;
                                            var12 = (long)var7 + ((long)var6 << -959417440);
                                            var14 = null;
                                            if (var11 == 0) {
                                              var14_ref = (ic) ((Object) this.field_i.d(124));
                                              L21: while (true) {
                                                if (var14_ref == null) {
                                                  break L20;
                                                } else {
                                                  if ((var14_ref.field_l ^ -1L) == (var12 ^ -1L)) {
                                                    break L20;
                                                  } else {
                                                    var14_ref = (ic) ((Object) this.field_i.b(-1));
                                                    continue L21;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (ic) ((Object) this.field_k.d(122));
                                              L22: while (true) {
                                                if (var14_ref == null) {
                                                  break L20;
                                                } else {
                                                  if ((var12 ^ -1L) == (var14_ref.field_l ^ -1L)) {
                                                    break L20;
                                                  } else {
                                                    var14_ref = (ic) ((Object) this.field_k.b(-1));
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
                                              if (0 != var10) {
                                                stackIn_63_0 = 9;
                                                break L23;
                                              } else {
                                                stackIn_63_0 = 5;
                                                break L23;
                                              }
                                            }
                                            var15 = stackIn_63_0;
                                            this.field_a = var14_ref;
                                            this.field_a.field_v = new gb(var9 + (var15 - -this.field_a.field_y));
                                            this.field_a.field_v.c(param0 + 53, var10);
                                            this.field_a.field_v.b(var9, false);
                                            this.field_h.field_m = 0;
                                            this.field_a.field_s = 10;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var2_int++;
                                  continue L9;
                                } else {
                                  return true;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        } else {
                          this.field_e.field_m = 0;
                          this.field_e.c(117, 0);
                          this.field_e.a(var2.field_l, 25576);
                          this.field_r.a(param0 ^ -28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                          this.field_k.a(var2, 0);
                          var2 = (ic) ((Object) this.field_d.b(-1));
                          continue L8;
                        }
                      }
                    } else {
                      this.field_e.field_m = 0;
                      this.field_e.c(param0 ^ 71, 1);
                      this.field_e.a(var2.field_l, param0 ^ 25576);
                      this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                      this.field_i.a(var2, 0);
                      var2 = (ic) ((Object) this.field_m.b(param0 ^ -1));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_r.d(param0 + 2);
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
                  this.field_r = null;
                  this.field_c = -2;
                  this.field_l = this.field_l + 1;
                  if (0 != this.b(false)) {
                    break L26;
                  } else {
                    if (this.c(param0 ^ -128) != 0) {
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

    private final void c(boolean param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_e.field_m = 0;
                  this.field_e.c(-128, 6);
                  this.field_e.d(3, 2132504424);
                  this.field_e.a(param0, 0);
                  this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_r.d(2);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_l = this.field_l + 1;
                  this.field_r = null;
                  this.field_c = -2;
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

    final void c(byte param0) {
        try {
            this.field_r.d(2);
        } catch (Exception exception) {
        }
        this.field_l = this.field_l + 1;
        this.field_r = null;
        if (param0 != 59) {
            return;
        }
        this.field_c = -1;
        this.field_n = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    public ea() {
    }

    final void a(byte param0) {
        if (param0 != 92) {
            field_q = (String) null;
        }
        if (!(null == this.field_r)) {
            this.field_r.d(2);
        }
    }

    static {
        field_q = "Instructions";
        field_p = new int[]{96, 96, 96, 112, 124, 192, 96, 96};
    }
}

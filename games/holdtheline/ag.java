/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag extends wj {
    static go field_r;
    static String field_p;
    private nn field_q;

    public static void c(boolean param0) {
        field_p = null;
        if (!param0) {
            return;
        }
        field_r = null;
    }

    private final void f(int param0) {
        try {
            IOException var2 = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != this.field_q) {
              try {
                L0: {
                  L1: {
                    this.field_b.field_l = 0;
                    this.field_b.f(111, 6);
                    this.field_b.a(3, false);
                    this.field_b.b(-652561784, 0);
                    this.field_q.a(this.field_b.field_i.length, this.field_b.field_i, 0, 1);
                    if (param0 > 5) {
                      break L1;
                    } else {
                      field_p = (String) null;
                      break L1;
                    }
                  }
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.d(21135);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_f = -2;
                  this.field_c = this.field_c + 1;
                  this.field_q = null;
                  break L2;
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

    private final void a(boolean param0, int param1) {
        try {
            boolean discarded$3 = false;
            IOException iOException = null;
            Exception var4 = null;
            th stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            th stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            th stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            th stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            th stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            th stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (null != this.field_q) {
              try {
                L0: {
                  L1: {
                    this.field_b.field_l = 0;
                    stackOut_2_0 = this.field_b;
                    stackOut_2_1 = 111;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (!param0) {
                      stackOut_4_0 = (th) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (th) ((Object) stackIn_3_0);
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  L2: {
                    ((th) (Object) stackIn_5_0).f(stackIn_5_1, stackIn_5_2);
                    if (param1 == -11526) {
                      break L2;
                    } else {
                      discarded$3 = ag.a(77, 'J');
                      break L2;
                    }
                  }
                  this.field_b.b(-483502376, 0L);
                  this.field_q.a(this.field_b.field_i.length, this.field_b.field_i, 0, 1);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_q.d(21135);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_f = -2;
                  this.field_q = null;
                  this.field_c = this.field_c + 1;
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            cc var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var6 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  if (this.field_q != null) {
                    try {
                      L2: {
                        this.field_q.d(param2 ^ 21147);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_q = (nn) (param0);
                this.f(param2 + 83);
                this.a(param1, -11526);
                this.field_k.field_l = 0;
                this.field_m = null;
                L4: while (true) {
                  var4_ref3 = (cc) ((Object) this.field_i.a((byte) 85));
                  if (var4_ref3 == null) {
                    L5: {
                      if (param2 == 20) {
                        break L5;
                      } else {
                        field_r = (go) null;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      var4_ref3 = (cc) ((Object) this.field_e.a((byte) 84));
                      if (var4_ref3 == null) {
                        L7: {
                          if (-1 == (this.field_l ^ -1)) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_b.field_l = 0;
                                this.field_b.f(111, 4);
                                this.field_b.f(111, (int) this.field_l);
                                this.field_b.a((byte) -58, 0);
                                this.field_q.a(this.field_b.field_i.length, this.field_b.field_i, 0, 1);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_q.d(param2 + 21115);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_c = this.field_c + 1;
                                this.field_q = null;
                                this.field_f = -2;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_h = 0;
                        this.field_j = bb.b(-1);
                        break L0;
                      } else {
                        this.field_g.a(-35, var4_ref3);
                        continue L6;
                      }
                    }
                  } else {
                    this.field_d.a(-85, var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) (var4_ref2);
                stackOut_24_1 = new StringBuilder().append("ag.H(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L12;
                } else {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L12;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        try {
            if (!(sb.field_c == null)) {
                sb.field_c.h((byte) -98);
            }
            lh.field_a = new vg(param2, param0, param1, true, true);
            sm.field_c.a((n) (lh.field_a), (byte) -99);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ag.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            Exception var3 = null;
            cc var3_ref = null;
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
            int var12 = 0;
            long var13 = 0L;
            Object var15 = null;
            cc var15_ref = null;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int stackIn_46_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_80_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_79_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
            L0: {
              var17 = HoldTheLine.field_D;
              if (this.field_q != null) {
                L1: {
                  var2_long = bb.b(-1);
                  var4 = (int)(-this.field_j + var2_long);
                  this.field_j = var2_long;
                  if ((var4 ^ -1) >= -201) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_h = this.field_h + var4;
                if ((this.field_h ^ -1) >= -30001) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_q.d(21135);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_q = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null == this.field_q) {
              if (-1 == (this.b(20) ^ -1)) {
                if (this.b(false) == 0) {
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
                  var2_int = 51 % ((param0 - 24) / 56);
                  this.field_q.c(true);
                  var3_ref = (cc) ((Object) this.field_d.c(105));
                  L5: while (true) {
                    if (var3_ref == null) {
                      var3_ref = (cc) ((Object) this.field_g.c(79));
                      L6: while (true) {
                        if (var3_ref == null) {
                          var3_int = 0;
                          L7: while (true) {
                            if (-101 >= (var3_int ^ -1)) {
                              stackOut_79_0 = 1;
                              stackIn_80_0 = stackOut_79_0;
                              break L4;
                            } else {
                              var4 = this.field_q.b(false);
                              if ((var4 ^ -1) <= -1) {
                                if (-1 != (var4 ^ -1)) {
                                  L8: {
                                    this.field_h = 0;
                                    var5 = 0;
                                    if (null != this.field_m) {
                                      if (this.field_m.field_x != 0) {
                                        break L8;
                                      } else {
                                        var5 = 1;
                                        break L8;
                                      }
                                    } else {
                                      var5 = 10;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (var5 <= 0) {
                                      L10: {
                                        var6 = -this.field_m.field_B + this.field_m.field_z.field_i.length;
                                        var7 = -this.field_m.field_x + 512;
                                        if (-this.field_m.field_z.field_l + var6 >= var7) {
                                          break L10;
                                        } else {
                                          var7 = var6 + -this.field_m.field_z.field_l;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (var4 >= var7) {
                                          break L11;
                                        } else {
                                          var7 = var4;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        this.field_q.a(this.field_m.field_z.field_i, var7, this.field_m.field_z.field_l, -54);
                                        if (0 == this.field_l) {
                                          break L12;
                                        } else {
                                          var18 = 0;
                                          var8 = var18;
                                          L13: while (true) {
                                            if (var7 <= var18) {
                                              break L12;
                                            } else {
                                              this.field_m.field_z.field_i[this.field_m.field_z.field_l + var18] = (byte)wb.a((int) this.field_m.field_z.field_i[this.field_m.field_z.field_l + var18], (int) this.field_l);
                                              var18++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      }
                                      this.field_m.field_z.field_l = this.field_m.field_z.field_l + var7;
                                      this.field_m.field_x = this.field_m.field_x + var7;
                                      if (var6 != this.field_m.field_z.field_l) {
                                        if (-513 != (this.field_m.field_x ^ -1)) {
                                          break L9;
                                        } else {
                                          this.field_m.field_x = 0;
                                          break L9;
                                        }
                                      } else {
                                        this.field_m.a((byte) -42);
                                        this.field_m.field_u = false;
                                        this.field_m = null;
                                        break L9;
                                      }
                                    } else {
                                      L14: {
                                        var6 = -this.field_k.field_l + var5;
                                        if (var6 <= var4) {
                                          break L14;
                                        } else {
                                          var6 = var4;
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        this.field_q.a(this.field_k.field_i, var6, this.field_k.field_l, 14);
                                        if (0 == this.field_l) {
                                          break L15;
                                        } else {
                                          var7 = 0;
                                          L16: while (true) {
                                            if (var6 <= var7) {
                                              break L15;
                                            } else {
                                              this.field_k.field_i[var7 + this.field_k.field_l] = (byte)wb.a((int) this.field_k.field_i[var7 + this.field_k.field_l], (int) this.field_l);
                                              var7++;
                                              continue L16;
                                            }
                                          }
                                        }
                                      }
                                      this.field_k.field_l = this.field_k.field_l + var6;
                                      if (var5 > this.field_k.field_l) {
                                        break L9;
                                      } else {
                                        if (null == this.field_m) {
                                          L17: {
                                            this.field_k.field_l = 0;
                                            var7 = this.field_k.f((byte) -105);
                                            var8 = this.field_k.a(94);
                                            var9 = this.field_k.f((byte) -55);
                                            var10 = this.field_k.a(127);
                                            var11 = 127 & var9;
                                            if ((128 & var9) == 0) {
                                              stackOut_45_0 = 0;
                                              stackIn_46_0 = stackOut_45_0;
                                              break L17;
                                            } else {
                                              stackOut_44_0 = 1;
                                              stackIn_46_0 = stackOut_44_0;
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            var12 = stackIn_46_0;
                                            var13 = ((long)var7 << -814256224) + (long)var8;
                                            var15 = null;
                                            if (var12 == 0) {
                                              var15_ref = (cc) ((Object) this.field_i.c(96));
                                              L19: while (true) {
                                                if (var15_ref == null) {
                                                  break L18;
                                                } else {
                                                  if (var13 == var15_ref.field_i) {
                                                    break L18;
                                                  } else {
                                                    var15_ref = (cc) ((Object) this.field_i.e(57));
                                                    continue L19;
                                                  }
                                                }
                                              }
                                            } else {
                                              var15_ref = (cc) ((Object) this.field_e.c(71));
                                              L20: while (true) {
                                                if (var15_ref == null) {
                                                  break L18;
                                                } else {
                                                  if (var13 == var15_ref.field_i) {
                                                    break L18;
                                                  } else {
                                                    var15_ref = (cc) ((Object) this.field_e.e(95));
                                                    continue L20;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var15_ref != null) {
                                            L21: {
                                              if (0 != var11) {
                                                stackOut_59_0 = 9;
                                                stackIn_60_0 = stackOut_59_0;
                                                break L21;
                                              } else {
                                                stackOut_58_0 = 5;
                                                stackIn_60_0 = stackOut_58_0;
                                                break L21;
                                              }
                                            }
                                            var16 = stackIn_60_0;
                                            this.field_m = var15_ref;
                                            this.field_m.field_z = new th(this.field_m.field_B + var10 + var16);
                                            this.field_m.field_z.f(111, var11);
                                            this.field_m.field_z.a((byte) -58, var10);
                                            this.field_k.field_l = 0;
                                            this.field_m.field_x = 10;
                                            break L9;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (this.field_m.field_x != 0) {
                                            throw new IOException();
                                          } else {
                                            if (0 == (this.field_k.field_i[0] ^ -1)) {
                                              this.field_m.field_x = 1;
                                              this.field_k.field_l = 0;
                                              break L9;
                                            } else {
                                              this.field_m = null;
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var3_int++;
                                  continue L7;
                                } else {
                                  return true;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        } else {
                          this.field_b.field_l = 0;
                          this.field_b.f(111, 0);
                          this.field_b.b(-483502376, var3_ref.field_i);
                          this.field_q.a(this.field_b.field_i.length, this.field_b.field_i, 0, 1);
                          this.field_e.a(126, var3_ref);
                          var3_ref = (cc) ((Object) this.field_g.e(-54));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_b.field_l = 0;
                      this.field_b.f(111, 1);
                      this.field_b.b(-483502376, var3_ref.field_i);
                      this.field_q.a(this.field_b.field_i.length, this.field_b.field_i, 0, 1);
                      this.field_i.a(123, var3_ref);
                      var3_ref = (cc) ((Object) this.field_d.e(-100));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L22: {
                    this.field_q.d(21135);
                    break L22;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L23: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L23;
                  }
                }
                this.field_f = -2;
                this.field_q = null;
                this.field_c = this.field_c + 1;
                if (-1 == (this.b(126) ^ -1)) {
                  if (this.b(false) != 0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_80_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != -2821) {
          return false;
        } else {
          L0: {
            L1: {
              if (160 == param1) {
                break L1;
              } else {
                if (param1 == 32) {
                  break L1;
                } else {
                  if (95 == param1) {
                    break L1;
                  } else {
                    if (45 != param1) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        }
    }

    final void e(int param0) {
        if (param0 != 1) {
            this.field_q = (nn) null;
        }
        if (!(null == this.field_q)) {
            this.field_q.d(21135);
        }
    }

    public ag() {
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        try {
            this.field_q.d(21135);
        } catch (Exception exception) {
        }
        this.field_c = this.field_c + 1;
        this.field_f = -1;
        this.field_q = null;
        if (param0) {
            discarded$0 = this.a((byte) -72);
        }
        this.field_l = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    static {
        field_p = "<%0> kills remaining.";
    }
}

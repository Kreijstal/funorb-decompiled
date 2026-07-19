/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends vb {
    private uh field_k;
    private int field_q;
    private tg field_i;
    static int field_v;
    private nm field_y;
    private byte[] field_A;
    static boolean field_p;
    private int field_n;
    private byte[] field_h;
    private uh field_e;
    static ea field_t;
    private g field_w;
    private ch field_j;
    private int field_u;
    static pl field_o;
    private em field_z;
    private boolean field_g;
    private ta field_x;
    private boolean field_m;
    private int field_l;
    private ta field_r;
    private long field_s;
    private boolean field_f;

    final static ed a(int param0, String param1, boolean param2) {
        ed var3 = null;
        RuntimeException var3_ref = null;
        ed stackIn_2_0 = null;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_3_0 = null;
        ed stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new ed(false);
            if (param2) {
              var3.field_h = param1;
              var3.field_e = param0;
              stackOut_3_0 = (ed) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ed) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("ij.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final byte[] a(int param0, int param1) {
        em var3 = this.a(124, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c((byte) -115);
        int var5 = 22 / ((-32 - param0) / 34);
        var3.b(34);
        return var4;
    }

    final g a(byte param0) {
        vl discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        if (this.field_w == null) {
          L0: {
            if (this.field_z != null) {
              break L0;
            } else {
              if (!this.field_j.d((byte) -111)) {
                this.field_z = (em) ((Object) this.field_j.a((byte) 0, -21, true, this.field_u, 255));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_z.field_C) {
            if (param0 == 53) {
              L1: {
                var8 = this.field_z.c((byte) -115);
                var6 = var8;
                var5 = var6;
                var9 = var5;
                var7 = var9;
                var2 = var7;
                if (this.field_z instanceof vl) {
                  try {
                    L2: {
                      if (var2 != null) {
                        this.field_w = new g(var9, this.field_q, this.field_h);
                        if (this.field_n != this.field_w.field_r) {
                          throw new RuntimeException();
                        } else {
                          break L2;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_w = null;
                      if (this.field_j.d((byte) -111)) {
                        this.field_z = null;
                        break L3;
                      } else {
                        this.field_z = (em) ((Object) this.field_j.a((byte) 0, -21, true, this.field_u, 255));
                        break L3;
                      }
                    }
                    return null;
                  }
                  break L1;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_w = new g(var8, this.field_q, this.field_h);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_j.d(20);
                      this.field_w = null;
                      if (!this.field_j.d((byte) -111)) {
                        this.field_z = (em) ((Object) this.field_j.a((byte) 0, param0 + -74, true, this.field_u, 255));
                        break L5;
                      } else {
                        this.field_z = null;
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (null == this.field_e) {
                    break L1;
                  } else {
                    discarded$1 = this.field_y.a(this.field_e, false, var8, this.field_u);
                    break L1;
                  }
                }
              }
              L6: {
                if (this.field_k != null) {
                  this.field_A = new byte[this.field_w.field_c];
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_z = null;
              return this.field_w;
            } else {
              return (g) null;
            }
          } else {
            return null;
          }
        } else {
          return this.field_w;
        }
    }

    final void c(int param0) {
        em discarded$4 = null;
        em discarded$5 = null;
        em discarded$6 = null;
        em discarded$7 = null;
        int var2_int = 0;
        em var2 = null;
        pi var3 = null;
        int var4 = 0;
        int var5 = 0;
        pi var6 = null;
        pi var7 = null;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (null != this.field_x) {
            if (this.a((byte) 53) != null) {
              if (this.field_g) {
                var2_int = 1;
                var3 = this.field_x.b(72);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_l >= this.field_w.field_d.length) {
                          break L3;
                        } else {
                          if (this.field_w.field_d[this.field_l] != 0) {
                            if (250 > this.field_y.field_b) {
                              L4: {
                                if (this.field_A[this.field_l] == 0) {
                                  discarded$4 = this.a(param0 + 112, 1, this.field_l);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              L5: {
                                if (this.field_A[this.field_l] == 0) {
                                  var7 = new pi();
                                  var7.field_d = (long)this.field_l;
                                  var2_int = 0;
                                  this.field_x.a((byte) -114, var7);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              this.field_l = this.field_l + 1;
                              continue L2;
                            } else {
                              var2_int = 0;
                              break L3;
                            }
                          } else {
                            this.field_l = this.field_l + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        this.field_l = 0;
                        this.field_g = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_d;
                      if (this.field_A[var4] != 0) {
                        break L6;
                      } else {
                        discarded$5 = this.a(113, 1, var4);
                        break L6;
                      }
                    }
                    L7: {
                      if (0 == this.field_A[var4]) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.b(34);
                        break L7;
                      }
                    }
                    var3 = this.field_x.b((byte) 56);
                    continue L1;
                  }
                }
              } else {
                if (!this.field_m) {
                  this.field_x = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = this.field_x.b(71);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_l >= this.field_w.field_d.length) {
                            break L10;
                          } else {
                            if (-1 != (this.field_w.field_d[this.field_l] ^ -1)) {
                              if (this.field_j.c((byte) -46)) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L11: {
                                  if (1 != this.field_A[this.field_l]) {
                                    discarded$6 = this.a(param0 ^ 124, 2, this.field_l);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (1 == this.field_A[this.field_l]) {
                                    break L12;
                                  } else {
                                    var6 = new pi();
                                    var6.field_d = (long)this.field_l;
                                    var2_int = 0;
                                    this.field_x.a((byte) -116, var6);
                                    break L12;
                                  }
                                }
                                this.field_l = this.field_l + 1;
                                continue L9;
                              }
                            } else {
                              this.field_l = this.field_l + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_m = false;
                          this.field_l = 0;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_d;
                        if (this.field_A[var4] != 1) {
                          discarded$7 = this.a(param0 + 116, 2, var4);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if ((this.field_A[var4] ^ -1) != -2) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.b(34);
                          break L14;
                        }
                      }
                      var3 = this.field_x.b((byte) 56);
                      continue L8;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (!this.field_f) {
            break L15;
          } else {
            if ((sf.a((byte) -111) ^ -1L) > (this.field_s ^ -1L)) {
              break L15;
            } else {
              var2 = (em) ((Object) this.field_i.a(param0 ^ -16545));
              L16: while (true) {
                if (var2 == null) {
                  this.field_s = sf.a((byte) 101) + 1000L;
                  break L15;
                } else {
                  L17: {
                    if (!var2.field_C) {
                      if (!var2.field_z) {
                        var2.field_z = true;
                        break L17;
                      } else {
                        if (!var2.field_v) {
                          throw new RuntimeException();
                        } else {
                          var2.b(param0 ^ 34);
                          break L17;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  var2 = (em) ((Object) this.field_i.a(true));
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          if (param0 == 0) {
            break L18;
          } else {
            this.c(-80);
            break L18;
          }
        }
    }

    final static void a(boolean param0, sb param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            var5 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null != w.field_W) {
                    try {
                      L2: {
                        w.field_W.a((byte) 120, 0L);
                        w.field_W.a(var6, 119);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var6[var3_int] != 0) {
                                break L4;
                              } else {
                                var3_int++;
                                continue L3;
                              }
                            }
                          }
                          if ((var3_int ^ -1) > -25) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if ((var4 ^ -1) <= -25) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param1.a(0, 24, param0, var2);
                    break L1;
                  } else {
                    param1.a(0, 24, param0, var2);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) (var2_ref);
                stackOut_15_1 = new StringBuilder().append("ij.E(").append(param0).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        em discarded$2 = null;
        em discarded$3 = null;
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (null != this.field_x) {
          if (this.a((byte) 53) != null) {
            var2 = this.field_r.b(111);
            L0: while (true) {
              if (var2 == null) {
                L1: {
                  if (param0 >= 1) {
                    break L1;
                  } else {
                    this.field_w = (g) null;
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_d;
                  if (-1 >= (var3 ^ -1)) {
                    if (this.field_w.field_c > var3) {
                      if (this.field_w.field_d[var3] == 0) {
                        var2.b(34);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_A[var3] == 0) {
                            discarded$2 = this.a(103, 1, var3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (-1 == this.field_A[var3]) {
                            discarded$3 = this.a(92, 2, var3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (1 == this.field_A[var3]) {
                          var2.b(34);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var2.b(34);
                      break L2;
                    }
                  } else {
                    var2.b(34);
                    break L2;
                  }
                }
                var2 = this.field_r.b((byte) 56);
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2 = -5 / ((33 - param0) / 58);
        if (null == this.field_k) {
            return;
        }
        this.field_m = true;
        if (null == this.field_x) {
            this.field_x = new ta();
        }
    }

    private final em a(int param0, int param1, int param2) {
        vl discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        em var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = MinerDisturbance.field_ab;
          if (param0 >= 86) {
            break L0;
          } else {
            this.b(-36);
            break L0;
          }
        }
        L1: {
          var12 = (em) ((Object) this.field_i.a((long)param2, -27109));
          var4 = var12;
          if (var12 == null) {
            break L1;
          } else {
            if (0 != param1) {
              break L1;
            } else {
              if (var12.field_v) {
                break L1;
              } else {
                if (!var12.field_C) {
                  break L1;
                } else {
                  var12.b(34);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              if (0 != param1) {
                if ((param1 ^ -1) != -2) {
                  if (param1 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (null != this.field_k) {
                      if ((this.field_A[param2] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_j.c((byte) -68)) {
                          var4 = this.field_j.a((byte) 2, -21, false, param2, this.field_u);
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } else {
                  if (this.field_k != null) {
                    var4 = this.field_y.a(param2, false, this.field_k);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L4: {
                  if (null == this.field_k) {
                    break L4;
                  } else {
                    if (-1 != this.field_A[param2]) {
                      var4 = this.field_y.a((byte) 54, param2, this.field_k);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_j.d((byte) -111)) {
                  var4 = this.field_j.a((byte) 2, -21, true, param2, this.field_u);
                  break L3;
                } else {
                  return null;
                }
              }
            }
            this.field_i.a(0, (long)param2, (pi) (var4));
            break L2;
          }
        }
        if (!((em) (var4)).field_C) {
          var18 = ((em) (var4)).c((byte) -115);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof vl)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (-3 > (var18.length ^ -1)) {
                      wa.field_b.reset();
                      wa.field_b.update(var5, 0, var18.length + -2);
                      var6_int = (int)wa.field_b.getValue();
                      if (this.field_w.field_h[param2] == var6_int) {
                        L7: {
                          if (null == this.field_w.field_l) {
                            break L7;
                          } else {
                            if (null == this.field_w.field_l[param2]) {
                              break L7;
                            } else {
                              var30 = this.field_w.field_l[param2];
                              var29 = wb.a(var18.length + -2, 0, var18, 18738);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (64 <= var11) {
                                  break L7;
                                } else {
                                  if (var29[var11] == var30[var11]) {
                                    var11++;
                                    continue L8;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_j.field_o = 0;
                        this.field_j.field_j = 0;
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_j.d(20);
              ((em) (var4)).b(34);
              if (((em) (var4)).field_v) {
                if (!this.field_j.d((byte) -111)) {
                  var4 = this.field_j.a((byte) 2, -21, true, param2, this.field_u);
                  this.field_i.a(0, (long)param2, (pi) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L9: {
              var5[-2 + var18.length] = (byte)(this.field_w.field_q[param2] >>> 800997800);
              var5[-1 + var18.length] = (byte)this.field_w.field_q[param2];
              if (null != this.field_k) {
                discarded$1 = this.field_y.a(this.field_k, false, var18, param2);
                if (this.field_A[param2] == 1) {
                  break L9;
                } else {
                  this.field_A[param2] = (byte) 1;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((em) (var4)).field_v) {
                break L10;
              } else {
                ((em) (var4)).b(34);
                break L10;
              }
            }
            return (em) (var4);
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 < var18.length) {
                      wa.field_b.reset();
                      wa.field_b.update(var5, 0, -2 + var18.length);
                      var6_int = (int)wa.field_b.getValue();
                      if (this.field_w.field_h[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (this.field_w.field_l == null) {
                            break L13;
                          } else {
                            if (this.field_w.field_l[param2] != null) {
                              var27 = this.field_w.field_l[param2];
                              var28 = wb.a(var18.length + -2, 0, var18, 18738);
                              var9 = 0;
                              L14: while (true) {
                                if ((var9 ^ -1) <= -65) {
                                  break L13;
                                } else {
                                  if (var27[var9] == var28[var9]) {
                                    var9++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var7 = ((255 & var5[var18.length - 2]) << -1987179032) - -(255 & var5[-1 + var18.length]);
                        if (var7 != (this.field_w.field_q[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (1 != this.field_A[param2]) {
                              L16: {
                                if (this.field_A[param2] == 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              this.field_A[param2] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (!((em) (var4)).field_v) {
                              ((em) (var4)).b(34);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L11;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_A[param2] = (byte)-1;
                ((em) (var4)).b(34);
                if (((em) (var4)).field_v) {
                  if (!this.field_j.d((byte) -111)) {
                    var4 = this.field_j.a((byte) 2, -21, true, param2, this.field_u);
                    this.field_i.a(0, (long)param2, (pi) (var4));
                    break L18;
                  } else {
                    return null;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (em) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_t = null;
        if (!param0) {
            field_t = (ea) null;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 < 62) {
            this.c(25);
        }
        em var3 = (em) ((Object) this.field_i.a((long)param1, -27109));
        if (var3 == null) {
            return 0;
        }
        return var3.f(100);
    }

    ij(int param0, uh param1, uh param2, ch param3, nm param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        this.field_i = new tg(16);
        this.field_l = 0;
        this.field_r = new ta();
        this.field_s = 0L;
        try {
          L0: {
            L1: {
              this.field_u = param0;
              this.field_k = param1;
              if (this.field_k != null) {
                this.field_g = true;
                this.field_x = new ta();
                break L1;
              } else {
                this.field_g = false;
                break L1;
              }
            }
            L2: {
              this.field_j = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ij) (this)).field_f = stackIn_7_1 != 0;
              this.field_n = param7;
              this.field_e = param2;
              this.field_y = param4;
              this.field_q = param5;
              this.field_h = param6;
              if (this.field_e == null) {
                break L3;
              } else {
                this.field_z = (em) ((Object) this.field_y.a((byte) -74, this.field_u, this.field_e));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_v = 0;
        field_o = null;
    }
}

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
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ic var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            String stackIn_35_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
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
                  L6: {
                    L7: {
                      L8: {
                        var4_ref3 = (ic) ((Object) this.field_i.c(param1 ^ 106));
                        if (var4_ref3 != null) {
                          break L8;
                        } else {
                          if (var6 != 0) {
                            break L7;
                          } else {
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      this.field_m.a(var4_ref3, 0);
                      break L7;
                    }
                    if (var6 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                  L9: while (true) {
                    L10: {
                      L11: {
                        var4_ref3 = (ic) ((Object) this.field_k.c(0));
                        if (var4_ref3 == null) {
                          break L11;
                        } else {
                          this.field_d.a(var4_ref3, 0);
                          if (var6 != 0) {
                            break L10;
                          } else {
                            if (var6 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      if (this.field_n != 0) {
                        try {
                          L12: {
                            this.field_e.field_m = 0;
                            this.field_e.c(95, 4);
                            this.field_e.c(7, (int) this.field_n);
                            this.field_e.b(0, false);
                            this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                            break L12;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L13: {
                            var4_ref = (IOException) (Object) decompiledCaughtException;
                            try {
                              L14: {
                                this.field_r.d(2);
                                break L14;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L15: {
                                var5 = (Exception) (Object) decompiledCaughtException;
                                break L15;
                              }
                            }
                            this.field_l = this.field_l + 1;
                            this.field_r = null;
                            this.field_c = -2;
                            break L13;
                          }
                        }
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    this.field_j = 0;
                    this.field_b = je.a(1);
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L16: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_32_0 = (RuntimeException) (var4_ref2);
                stackOut_32_1 = new StringBuilder().append("ea.K(").append(param0).append(',').append(param1).append(',');
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                if (param2 == null) {
                  stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
                  stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
                  stackOut_34_2 = "null";
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  break L16;
                } else {
                  stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
                  stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
                  stackOut_33_2 = "{...}";
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  break L16;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
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
        od discarded$0 = null;
        field_p = null;
        if (param0) {
            discarded$0 = ea.e((byte) 96);
        }
        field_q = null;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            gb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            gb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            gb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            gb stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            gb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_e.field_m = 0;
                    stackOut_3_0 = this.field_e;
                    stackOut_3_1 = 31;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param0) {
                      stackOut_5_0 = (gb) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (gb) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
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
            IOException var2 = null;
            long var2_long = 0L;
            ic var2_ref = null;
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
            ic var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_31_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_104_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_30_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_103_0 = 0;
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
              if (0 == this.b(false)) {
                if (this.c(param0 ^ -25) == 0) {
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
                  this.field_r.a(true);
                  var2_ref = (ic) ((Object) this.field_m.d(122));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_e.field_m = 0;
                          this.field_e.c(param0 ^ 71, 1);
                          this.field_e.a(var2_ref.field_l, param0 ^ 25576);
                          this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                          this.field_i.a(var2_ref, 0);
                          var2_ref = (ic) ((Object) this.field_m.b(param0 ^ -1));
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
                      if (param0 == 0) {
                        break L6;
                      } else {
                        ea.d(false);
                        break L6;
                      }
                    }
                    var2_ref = (ic) ((Object) this.field_d.d(123));
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_e.field_m = 0;
                          this.field_e.c(117, 0);
                          this.field_e.a(var2_ref.field_l, 25576);
                          this.field_r.a(param0 ^ -28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                          this.field_k.a(var2_ref, 0);
                          var2_ref = (ic) ((Object) this.field_d.b(-1));
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
                            if ((var2_int ^ -1) <= -101) {
                              break L12;
                            } else {
                              var3_int = this.field_r.b(-30119);
                              stackOut_30_0 = 0;
                              stackIn_104_0 = stackOut_30_0;
                              stackIn_31_0 = stackOut_30_0;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_31_0 <= var3_int) {
                                  L13: {
                                    if (-1 != (var3_int ^ -1)) {
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
                                      this.field_j = 0;
                                      var4 = 0;
                                      if (null == this.field_a) {
                                        break L15;
                                      } else {
                                        if (0 != this.field_a.field_s) {
                                          break L14;
                                        } else {
                                          var4 = 1;
                                          if (var16 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var4 = 10;
                                    break L14;
                                  }
                                  L16: {
                                    if (var4 <= 0) {
                                      L17: {
                                        var5 = -this.field_a.field_y + this.field_a.field_v.field_l.length;
                                        var6 = -this.field_a.field_s + 512;
                                        if (-this.field_a.field_v.field_m + var5 >= var6) {
                                          break L17;
                                        } else {
                                          var6 = -this.field_a.field_v.field_m + var5;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (var6 > var3_int) {
                                          var6 = var3_int;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        L20: {
                                          this.field_r.a((byte) 44, this.field_a.field_v.field_m, var6, this.field_a.field_v.field_l);
                                          if (this.field_n != 0) {
                                            var7 = 0;
                                            L21: while (true) {
                                              if (var6 <= var7) {
                                                break L20;
                                              } else {
                                                this.field_a.field_v.field_l[this.field_a.field_v.field_m + var7] = (byte)wa.a((int) this.field_a.field_v.field_l[this.field_a.field_v.field_m + var7], (int) this.field_n);
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
                                        this.field_a.field_v.field_m = this.field_a.field_v.field_m + var6;
                                        this.field_a.field_s = this.field_a.field_s + var6;
                                        break L19;
                                      }
                                      L22: {
                                        if (var5 != this.field_a.field_v.field_m) {
                                          break L22;
                                        } else {
                                          this.field_a.a(97);
                                          this.field_a.field_m = false;
                                          this.field_a = null;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                      if (this.field_a.field_s != 512) {
                                        break L16;
                                      } else {
                                        this.field_a.field_s = 0;
                                        break L16;
                                      }
                                    } else {
                                      L23: {
                                        var5 = -this.field_h.field_m + var4;
                                        if (var5 > var3_int) {
                                          var5 = var3_int;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        L25: {
                                          this.field_r.a((byte) 39, this.field_h.field_m, var5, this.field_h.field_l);
                                          if (this.field_n == 0) {
                                            break L25;
                                          } else {
                                            var6 = 0;
                                            L26: while (true) {
                                              if (var6 >= var5) {
                                                break L25;
                                              } else {
                                                this.field_h.field_l[var6 + this.field_h.field_m] = (byte)wa.a((int) this.field_h.field_l[var6 + this.field_h.field_m], (int) this.field_n);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L24;
                                                } else {
                                                  continue L26;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_h.field_m = this.field_h.field_m + var5;
                                        break L24;
                                      }
                                      L27: {
                                        if (this.field_h.field_m >= var4) {
                                          break L27;
                                        } else {
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      L28: {
                                        if (this.field_a != null) {
                                          break L28;
                                        } else {
                                          L29: {
                                            this.field_h.field_m = 0;
                                            var6 = this.field_h.j(255);
                                            var7 = this.field_h.e(true);
                                            var8 = this.field_h.j(255);
                                            var9 = this.field_h.e(true);
                                            var10 = var8 & 127;
                                            if ((128 & var8) == 0) {
                                              stackOut_57_0 = 0;
                                              stackIn_58_0 = stackOut_57_0;
                                              break L29;
                                            } else {
                                              stackOut_56_0 = 1;
                                              stackIn_58_0 = stackOut_56_0;
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            L31: {
                                              var11 = stackIn_58_0;
                                              var12 = (long)var7 + ((long)var6 << -959417440);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (ic) ((Object) this.field_i.d(124));
                                                L32: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_66_0 = ((var14_ref.field_l ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_l ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                    stackIn_73_0 = stackOut_66_0;
                                                    stackIn_67_0 = stackOut_66_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      if (stackIn_67_0 == 0) {
                                                        break L31;
                                                      } else {
                                                        var14_ref = (ic) ((Object) this.field_i.b(-1));
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
                                                var14_ref = (ic) ((Object) this.field_k.d(122));
                                                L33: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_61_0 = ((var12 ^ -1L) < (var14_ref.field_l ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_l ^ -1L) ? 0 : 1));
                                                    stackIn_73_0 = stackOut_61_0;
                                                    stackIn_62_0 = stackOut_61_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      if (stackIn_62_0 == 0) {
                                                        break L31;
                                                      } else {
                                                        var14_ref = (ic) ((Object) this.field_k.b(-1));
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
                                              stackOut_72_0 = 0;
                                              stackIn_73_0 = stackOut_72_0;
                                              break L30;
                                            }
                                          }
                                          L34: {
                                            if (stackIn_73_0 != var10) {
                                              stackOut_75_0 = 9;
                                              stackIn_76_0 = stackOut_75_0;
                                              break L34;
                                            } else {
                                              stackOut_74_0 = 5;
                                              stackIn_76_0 = stackOut_74_0;
                                              break L34;
                                            }
                                          }
                                          var15 = stackIn_76_0;
                                          this.field_a = var14_ref;
                                          this.field_a.field_v = new gb(var9 + (var15 - -this.field_a.field_y));
                                          this.field_a.field_v.c(param0 + 53, var10);
                                          this.field_a.field_v.b(var9, false);
                                          this.field_h.field_m = 0;
                                          this.field_a.field_s = 10;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L35: {
                                        if (this.field_a.field_s != 0) {
                                          break L35;
                                        } else {
                                          L36: {
                                            if (this.field_h.field_l[0] != -1) {
                                              break L36;
                                            } else {
                                              this.field_h.field_m = 0;
                                              this.field_a.field_s = 1;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L36;
                                              }
                                            }
                                          }
                                          this.field_a = null;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L35;
                                          }
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
                                } else {
                                  throw new IOException();
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
                  L37: {
                    this.field_r.d(param0 + 2);
                    break L37;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L38: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L38;
                  }
                }
                this.field_r = null;
                this.field_c = -2;
                this.field_l = this.field_l + 1;
                if (0 == this.b(false)) {
                  if (this.c(param0 ^ -128) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_104_0 != 0;
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
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
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
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            this.field_r.d(2);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
        this.field_l = this.field_l + 1;
        this.field_r = null;
        if (param0 != 59) {
          return;
        } else {
          this.field_c = -1;
          this.field_n = (byte)(int)(255.0 * Math.random() + 1.0);
          return;
        }
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

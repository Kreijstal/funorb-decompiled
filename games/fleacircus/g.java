/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class g extends w {
    static int field_s;
    private td field_v;
    static String field_t;
    static double field_u;

    public g() {
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
            field_s = 92;
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            fk var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_v) {
                    try {
                      L2: {
                        this.field_v.h(0);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_v = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 == 105) {
                  this.field_v = (td) (param0);
                  this.g(-79);
                  this.a(param2 + 5, param1);
                  this.field_p = null;
                  this.field_f.field_i = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        L7: {
                          var4_ref3 = (fk) ((Object) this.field_q.a(param2 ^ -30));
                          if (var4_ref3 != null) {
                            break L7;
                          } else {
                            if (var6 != 0) {
                              break L6;
                            } else {
                              if (var6 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        this.field_o.a(var4_ref3, -1089421886);
                        break L6;
                      }
                      if (var6 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                    L8: while (true) {
                      L9: {
                        L10: {
                          L11: {
                            var4_ref3 = (fk) ((Object) this.field_h.a(-122));
                            if (var4_ref3 != null) {
                              break L11;
                            } else {
                              if (var6 != 0) {
                                break L10;
                              } else {
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          this.field_n.a(var4_ref3, param2 ^ -1089421909);
                          break L10;
                        }
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                      L12: {
                        if (this.field_g != 0) {
                          try {
                            L13: {
                              this.field_d.field_i = 0;
                              this.field_d.a(-11, 4);
                              this.field_d.a(param2 + -116, (int) this.field_g);
                              this.field_d.a(0, (byte) -58);
                              this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
                              break L13;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L14: {
                              var4_ref = (IOException) (Object) decompiledCaughtException;
                              try {
                                L15: {
                                  this.field_v.h(0);
                                  break L15;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter2) {
                                decompiledCaughtException = decompiledCaughtParameter2;
                                L16: {
                                  var5 = (Exception) (Object) decompiledCaughtException;
                                  break L16;
                                }
                              }
                              this.field_b = -2;
                              this.field_c = this.field_c + 1;
                              this.field_v = null;
                              break L14;
                            }
                          }
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      this.field_k = 0;
                      this.field_m = lj.a((byte) -67);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L17: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) (var4_ref2);
                stackOut_34_1 = new StringBuilder().append("g.L(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L17;
                } else {
                  stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L17;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
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

    private final void a(int param0, boolean param1) {
        try {
            boolean discarded$3 = false;
            IOException iOException = null;
            Exception var4 = null;
            ni stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ni stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ni stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            ni stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            ni stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            ni stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (this.field_v != null) {
              try {
                L0: {
                  L1: {
                    this.field_d.field_i = 0;
                    if (param0 > 48) {
                      break L1;
                    } else {
                      discarded$3 = this.b((byte) 48);
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_4_0 = this.field_d;
                    stackOut_4_1 = -11;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (param1) {
                      stackOut_6_0 = (ni) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (ni) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((ni) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                  this.field_d.a(0L, (byte) -39);
                  this.field_v.a((byte) -118, this.field_d.field_k.length, 0, this.field_d.field_k);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_v.h(0);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_v = null;
                  this.field_b = -2;
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

    final void a(byte param0) {
        try {
            this.field_v.h(0);
        } catch (Exception exception) {
        }
        this.field_c = this.field_c + 1;
        this.field_b = -1;
        this.field_v = null;
        this.field_g = (byte)(int)(1.0 + Math.random() * 255.0);
        int var2 = 116 / ((param0 - -29) / 47);
    }

    final void d(int param0) {
        if (null != this.field_v) {
            this.field_v.h(param0 + 14835);
        }
        if (param0 != -14835) {
            this.d(-128);
        }
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var3 = jc.a(param2, 116);
        int var4 = we.a((byte) 75, param2);
        int var5 = jc.a(param1, 117);
        int var6 = 104 % ((53 - param0) / 58);
        int var7 = we.a((byte) 101, param1);
        int var8 = (int)((long)var5 * (long)var3 >> 922083344);
        int var9 = (int)((long)var7 * (long)var3 >> -961792752);
        int var10 = (int)((long)var4 * (long)var5 >> 21370448);
        int var11 = (int)((long)var7 * (long)var4 >> 484235664);
        return new int[]{0, 0, 0, var7, 0, var5, var8, var4, -var9, -var10, var3, var11};
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (this.field_v != null) {
              L0: {
                if (param0 <= -33) {
                  break L0;
                } else {
                  field_t = (String) null;
                  break L0;
                }
              }
              try {
                L1: {
                  this.field_d.field_i = 0;
                  this.field_d.a(-11, 6);
                  this.field_d.a(false, 3);
                  this.field_d.b((byte) 75, 0);
                  this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_v.h(0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_b = -2;
                  this.field_v = null;
                  this.field_c = this.field_c + 1;
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

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fk var2_ref = null;
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
            fk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_31_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_69_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_106_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_30_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_105_0 = 0;
            L0: {
              var16 = fleas.field_A ? 1 : 0;
              if (null != this.field_v) {
                L1: {
                  var2_long = lj.a((byte) -24);
                  var4 = (int)(-this.field_m + var2_long);
                  if ((var4 ^ -1) >= -201) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_m = var2_long;
                this.field_k = this.field_k + var4;
                if (this.field_k > 30000) {
                  try {
                    L2: {
                      this.field_v.h(0);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_v = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null == this.field_v) {
              if (this.f(1) == 0) {
                if (this.e(-53) != 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              try {
                L4: {
                  this.field_v.c(0);
                  var2_ref = (fk) ((Object) this.field_o.b((byte) 113));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_d.field_i = 0;
                          this.field_d.a(-11, 1);
                          this.field_d.a(var2_ref.field_j, (byte) -39);
                          this.field_v.a((byte) -122, this.field_d.field_k.length, 0, this.field_d.field_k);
                          this.field_q.a(var2_ref, -1089421886);
                          var2_ref = (fk) ((Object) this.field_o.c((byte) 67));
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
                      if (param0 == 66) {
                        break L6;
                      } else {
                        this.g(-76);
                        break L6;
                      }
                    }
                    var2_ref = (fk) ((Object) this.field_n.b((byte) 120));
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_d.field_i = 0;
                          this.field_d.a(-11, 0);
                          this.field_d.a(var2_ref.field_j, (byte) -39);
                          this.field_v.a((byte) -103, this.field_d.field_k.length, 0, this.field_d.field_k);
                          this.field_h.a(var2_ref, -1089421886);
                          var2_ref = (fk) ((Object) this.field_n.c((byte) 117));
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
                              var3_int = this.field_v.e(-120);
                              stackOut_30_0 = 0;
                              stackIn_106_0 = stackOut_30_0;
                              stackIn_31_0 = stackOut_30_0;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_31_0 > var3_int) {
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
                                      this.field_k = 0;
                                      var4 = 0;
                                      if (this.field_p != null) {
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
                                    if (this.field_p.field_y != 0) {
                                      break L14;
                                    } else {
                                      var4 = 1;
                                      break L14;
                                    }
                                  }
                                  L16: {
                                    if (var4 <= 0) {
                                      L17: {
                                        var5 = this.field_p.field_A.field_k.length + -this.field_p.field_E;
                                        var6 = -this.field_p.field_y + 512;
                                        if (var5 - this.field_p.field_A.field_i < var6) {
                                          var6 = -this.field_p.field_A.field_i + var5;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (var6 <= var3_int) {
                                          break L18;
                                        } else {
                                          var6 = var3_int;
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        L20: {
                                          this.field_v.a(var6, this.field_p.field_A.field_k, this.field_p.field_A.field_i, false);
                                          if (0 == this.field_g) {
                                            break L20;
                                          } else {
                                            var7 = 0;
                                            L21: while (true) {
                                              if (var7 >= var6) {
                                                break L20;
                                              } else {
                                                this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i] = (byte)df.a((int) this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i], (int) this.field_g);
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
                                        this.field_p.field_y = this.field_p.field_y + var6;
                                        this.field_p.field_A.field_i = this.field_p.field_A.field_i + var6;
                                        break L19;
                                      }
                                      L22: {
                                        if (this.field_p.field_A.field_i == var5) {
                                          break L22;
                                        } else {
                                          if (512 != this.field_p.field_y) {
                                            break L16;
                                          } else {
                                            this.field_p.field_y = 0;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                      this.field_p.e(-100);
                                      this.field_p.field_q = false;
                                      this.field_p = null;
                                      break L16;
                                    } else {
                                      L23: {
                                        var5 = var4 + -this.field_f.field_i;
                                        if (var3_int < var5) {
                                          var5 = var3_int;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        L25: {
                                          this.field_v.a(var5, this.field_f.field_k, this.field_f.field_i, false);
                                          if (-1 != (this.field_g ^ -1)) {
                                            var6 = 0;
                                            L26: while (true) {
                                              if (var6 >= var5) {
                                                break L25;
                                              } else {
                                                this.field_f.field_k[var6 + this.field_f.field_i] = (byte)df.a((int) this.field_f.field_k[var6 + this.field_f.field_i], (int) this.field_g);
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
                                        this.field_f.field_i = this.field_f.field_i + var5;
                                        break L24;
                                      }
                                      if (this.field_f.field_i < var4) {
                                        break L16;
                                      } else {
                                        L27: {
                                          if (this.field_p != null) {
                                            break L27;
                                          } else {
                                            L28: {
                                              this.field_f.field_i = 0;
                                              var6 = this.field_f.e(false);
                                              var7 = this.field_f.c((byte) 25);
                                              var8 = this.field_f.e(false);
                                              var9 = this.field_f.c((byte) 124);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_57_0 = 0;
                                                stackIn_58_0 = stackOut_57_0;
                                                break L28;
                                              } else {
                                                stackOut_56_0 = 1;
                                                stackIn_58_0 = stackOut_56_0;
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              L30: {
                                                var11 = stackIn_58_0;
                                                var12 = (long)var7 + ((long)var6 << -919735392);
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (fk) ((Object) this.field_h.b((byte) 120));
                                                  L31: while (true) {
                                                    if (var14_ref == null) {
                                                      break L30;
                                                    } else {
                                                      stackOut_68_0 = ((var14_ref.field_j ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_j ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                      stackIn_75_0 = stackOut_68_0;
                                                      stackIn_69_0 = stackOut_68_0;
                                                      if (var16 != 0) {
                                                        break L29;
                                                      } else {
                                                        if (stackIn_69_0 == 0) {
                                                          break L30;
                                                        } else {
                                                          var14_ref = (fk) ((Object) this.field_h.c((byte) 97));
                                                          if (var16 == 0) {
                                                            continue L31;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (fk) ((Object) this.field_q.b((byte) 117));
                                                  L32: while (true) {
                                                    if (var14_ref == null) {
                                                      break L30;
                                                    } else {
                                                      stackOut_61_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                                                      stackIn_75_0 = stackOut_61_0;
                                                      stackIn_62_0 = stackOut_61_0;
                                                      if (var16 != 0) {
                                                        break L29;
                                                      } else {
                                                        L33: {
                                                          if (stackIn_62_0 != 0) {
                                                            break L33;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L30;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (fk) ((Object) this.field_q.c((byte) 71));
                                                        continue L32;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                stackOut_74_0 = var10 ^ -1;
                                                stackIn_75_0 = stackOut_74_0;
                                                break L29;
                                              }
                                            }
                                            L34: {
                                              if (stackIn_75_0 != -1) {
                                                stackOut_77_0 = 9;
                                                stackIn_78_0 = stackOut_77_0;
                                                break L34;
                                              } else {
                                                stackOut_76_0 = 5;
                                                stackIn_78_0 = stackOut_76_0;
                                                break L34;
                                              }
                                            }
                                            var15 = stackIn_78_0;
                                            this.field_p = var14_ref;
                                            this.field_p.field_A = new ni(this.field_p.field_E + var9 + var15);
                                            this.field_p.field_A.a(-11, var10);
                                            this.field_p.field_A.a(var9, (byte) -106);
                                            this.field_f.field_i = 0;
                                            this.field_p.field_y = 10;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L35: {
                                          if (-1 == (this.field_p.field_y ^ -1)) {
                                            L36: {
                                              if ((this.field_f.field_k[0] ^ -1) == 0) {
                                                break L36;
                                              } else {
                                                this.field_p = null;
                                                if (var16 == 0) {
                                                  break L16;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            this.field_f.field_i = 0;
                                            this.field_p.field_y = 1;
                                            if (var16 == 0) {
                                              break L16;
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
                          stackOut_105_0 = 1;
                          stackIn_106_0 = stackOut_105_0;
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
                    this.field_v.h(0);
                    break L37;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L38: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L38;
                  }
                }
                this.field_c = this.field_c + 1;
                this.field_b = -2;
                this.field_v = null;
                if (0 == this.f(1)) {
                  if (this.e(-64) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_106_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_s = 0;
        field_t = "Fleas get in each others' way, and can even climb over each other. If you have too many fleas together, be careful, as they can sometimes overflow out of the confined space they are in. On some levels you need to do this to win!";
        field_u = 0.0;
    }
}

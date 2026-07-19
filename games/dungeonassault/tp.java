/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tp extends bb {
    static String field_z;
    static ef field_B;
    static String[] field_A;
    private rk field_D;
    static String field_u;
    static String[] field_C;
    static String field_w;
    static ad field_y;
    static String field_v;
    static String field_x;

    public static void h(int param0) {
        field_C = null;
        field_y = null;
        field_u = null;
        field_z = null;
        field_B = null;
        field_x = null;
        field_w = null;
        field_A = null;
        if (param0 < 0) {
            field_B = (ef) null;
        }
        field_v = null;
    }

    final void f(int param0) {
        try {
            this.field_D.c(-6624);
        } catch (Exception exception) {
        }
        this.field_c = -1;
        this.field_D = null;
        int var2 = 57 % ((-81 - param0) / 36);
        this.field_h = this.field_h + 1;
        this.field_j = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final static boolean c(byte param0) {
        if (param0 >= -10) {
            return true;
        }
        return in.field_E;
    }

    final void a(int param0) {
        if (!(null == this.field_D)) {
            this.field_D.c(-6624);
        }
        if (param0 != -1016) {
            field_u = (String) null;
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            em var2_ref = null;
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
            em var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_18_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_88_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_62_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_17_0 = 0;
            L0: {
              var16 = DungeonAssault.field_K;
              if (null != this.field_D) {
                L1: {
                  var2_long = kd.c(-2456);
                  var4 = (int)(-this.field_n + var2_long);
                  this.field_n = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_a = this.field_a + var4;
                if ((this.field_a ^ -1) < -30001) {
                  try {
                    L2: {
                      this.field_D.c(-6624);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_D = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != this.field_D) {
              try {
                L4: {
                  if (param0 > 6) {
                    this.field_D.b(-89);
                    var2_ref = (em) ((Object) this.field_g.c(13395));
                    L5: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (em) ((Object) this.field_d.c(13395));
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (-101 >= (var2_int ^ -1)) {
                                  break L8;
                                } else {
                                  var3_int = this.field_D.a(0);
                                  if (-1 >= (var3_int ^ -1)) {
                                    if (var3_int == 0) {
                                      break L8;
                                    } else {
                                      L9: {
                                        this.field_a = 0;
                                        var4 = 0;
                                        if (null != this.field_i) {
                                          if (this.field_i.field_G == 0) {
                                            var4 = 1;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          var4 = 10;
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (var4 > 0) {
                                          L11: {
                                            var5 = var4 + -this.field_m.field_o;
                                            if (var3_int < var5) {
                                              var5 = var3_int;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            this.field_D.a(this.field_m.field_m, false, var5, this.field_m.field_o);
                                            if (-1 == (this.field_j ^ -1)) {
                                              break L12;
                                            } else {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var6 >= var5) {
                                                  break L12;
                                                } else {
                                                  this.field_m.field_m[var6 + this.field_m.field_o] = (byte)md.b((int) this.field_m.field_m[var6 + this.field_m.field_o], (int) this.field_j);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            }
                                          }
                                          this.field_m.field_o = this.field_m.field_o + var5;
                                          if (var4 > this.field_m.field_o) {
                                            break L10;
                                          } else {
                                            if (this.field_i != null) {
                                              if (this.field_i.field_G != 0) {
                                                throw new IOException();
                                              } else {
                                                if (-1 == this.field_m.field_m[0]) {
                                                  this.field_m.field_o = 0;
                                                  this.field_i.field_G = 1;
                                                  break L10;
                                                } else {
                                                  this.field_i = null;
                                                  break L10;
                                                }
                                              }
                                            } else {
                                              L14: {
                                                this.field_m.field_o = 0;
                                                var6 = this.field_m.c(true);
                                                var7 = this.field_m.h(-87);
                                                var8 = this.field_m.c(true);
                                                var9 = this.field_m.h(-100);
                                                var10 = var8 & 127;
                                                if (-1 == (128 & var8 ^ -1)) {
                                                  stackOut_62_0 = 0;
                                                  stackIn_63_0 = stackOut_62_0;
                                                  break L14;
                                                } else {
                                                  stackOut_61_0 = 1;
                                                  stackIn_63_0 = stackOut_61_0;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_63_0;
                                                var12 = (long)var7 + ((long)var6 << -1492136096);
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (em) ((Object) this.field_p.c(13395));
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if ((var14_ref.field_o ^ -1L) != (var12 ^ -1L)) {
                                                        var14_ref = (em) ((Object) this.field_p.a((byte) 117));
                                                        continue L16;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (em) ((Object) this.field_s.c(13395));
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if ((var12 ^ -1L) != (var14_ref.field_o ^ -1L)) {
                                                        var14_ref = (em) ((Object) this.field_s.a((byte) 66));
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
                                                  if (var10 != 0) {
                                                    stackOut_79_0 = 9;
                                                    stackIn_80_0 = stackOut_79_0;
                                                    break L18;
                                                  } else {
                                                    stackOut_78_0 = 5;
                                                    stackIn_80_0 = stackOut_78_0;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_80_0;
                                                this.field_i = var14_ref;
                                                this.field_i.field_D = new ec(this.field_i.field_E + var15 + var9);
                                                this.field_i.field_D.a(6, var10);
                                                this.field_i.field_D.a((byte) 63, var9);
                                                this.field_i.field_G = 10;
                                                this.field_m.field_o = 0;
                                                break L10;
                                              }
                                            }
                                          }
                                        } else {
                                          L19: {
                                            var5 = this.field_i.field_D.field_m.length + -this.field_i.field_E;
                                            var6 = 512 - this.field_i.field_G;
                                            if (var6 <= var5 + -this.field_i.field_D.field_o) {
                                              break L19;
                                            } else {
                                              var6 = -this.field_i.field_D.field_o + var5;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            if (var3_int < var6) {
                                              var6 = var3_int;
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          L21: {
                                            this.field_D.a(this.field_i.field_D.field_m, false, var6, this.field_i.field_D.field_o);
                                            if (this.field_j != 0) {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var6 <= var7) {
                                                  break L21;
                                                } else {
                                                  this.field_i.field_D.field_m[this.field_i.field_D.field_o - -var7] = (byte)md.b((int) this.field_i.field_D.field_m[this.field_i.field_D.field_o + var7], (int) this.field_j);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                          this.field_i.field_G = this.field_i.field_G + var6;
                                          this.field_i.field_D.field_o = this.field_i.field_D.field_o + var6;
                                          if (this.field_i.field_D.field_o != var5) {
                                            if ((this.field_i.field_G ^ -1) == -513) {
                                              this.field_i.field_G = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            this.field_i.b((byte) -2);
                                            this.field_i.field_v = false;
                                            this.field_i = null;
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
                              stackOut_87_0 = 1;
                              stackIn_88_0 = stackOut_87_0;
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          } else {
                            this.field_o.field_o = 0;
                            this.field_o.a(6, 0);
                            this.field_o.a(var2_ref.field_o, 836);
                            this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
                            this.field_s.a(var2_ref, -32711);
                            var2_ref = (em) ((Object) this.field_d.a((byte) 102));
                            continue L6;
                          }
                        }
                      } else {
                        this.field_o.field_o = 0;
                        this.field_o.a(6, 1);
                        this.field_o.a(var2_ref.field_o, 836);
                        this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
                        this.field_p.a(var2_ref, -32711);
                        var2_ref = (em) ((Object) this.field_g.a((byte) 111));
                        continue L5;
                      }
                    }
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_18_0 = stackOut_17_0;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_D.c(-6624);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                this.field_c = -2;
                this.field_h = this.field_h + 1;
                this.field_D = null;
                if (this.c(20) != 0) {
                  return false;
                } else {
                  if (0 == this.e(20)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_88_0 != 0;
              }
            } else {
              L25: {
                if (this.c(20) != 0) {
                  break L25;
                } else {
                  if (0 != this.e(20)) {
                    break L25;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        try {
            eh discarded$2 = null;
            IOException var2 = null;
            Exception var3 = null;
            String var4 = null;
            Throwable decompiledCaughtException = null;
            if (null == this.field_D) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_o.field_o = 0;
                    this.field_o.a(6, 6);
                    this.field_o.b((byte) -106, 3);
                    this.field_o.i(0, -95);
                    this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
                    if (param0 == -30001) {
                      break L1;
                    } else {
                      var4 = (String) null;
                      discarded$2 = tp.a((nh) null, (String) null, (String) null, -28);
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
                      this.field_D.c(-6624);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_c = -2;
                  this.field_D = null;
                  this.field_h = this.field_h + 1;
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

    final static void a(int param0, float param1, String param2) {
        try {
            lj.field_e = param2;
            if (param0 != 10) {
                tp.h(-5);
            }
            lc.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "tp.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            em var4_ref3 = null;
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
            var6 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  if (null == this.field_D) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_D.c(param2 ^ -6570);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_D = null;
                    break L1;
                  }
                }
                L4: {
                  this.field_D = (rk) (param0);
                  this.g(-30001);
                  this.a(param1, 5391);
                  if (param2 == 118) {
                    break L4;
                  } else {
                    field_x = (String) null;
                    break L4;
                  }
                }
                this.field_i = null;
                this.field_m.field_o = 0;
                L5: while (true) {
                  var4_ref3 = (em) ((Object) this.field_p.a(-8));
                  if (var4_ref3 != null) {
                    this.field_g.a(var4_ref3, -32711);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref3 = (em) ((Object) this.field_s.a(121));
                      if (var4_ref3 == null) {
                        L7: {
                          if (this.field_j == 0) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_o.field_o = 0;
                                this.field_o.a(6, 4);
                                this.field_o.a(6, (int) this.field_j);
                                this.field_o.a((byte) 63, 0);
                                this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_D.c(-6624);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_D = null;
                                this.field_c = -2;
                                this.field_h = this.field_h + 1;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_a = 0;
                        this.field_n = kd.c(-2456);
                        break L0;
                      } else {
                        this.field_d.a(var4_ref3, -32711);
                        continue L6;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) (var4_ref2);
                stackOut_24_1 = new StringBuilder().append("tp.C(");
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
              throw vk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ec stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            ec stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            ec stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            ec stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            ec stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            ec stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (this.field_D != null) {
              try {
                L0: {
                  L1: {
                    this.field_o.field_o = 0;
                    stackOut_2_0 = this.field_o;
                    stackOut_2_1 = 6;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (param0) {
                      stackOut_4_0 = (ec) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (ec) ((Object) stackIn_3_0);
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  ((ec) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2);
                  this.field_o.a(0L, 836);
                  this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_D.c(param1 + -12015);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_h = this.field_h + 1;
                  this.field_D = null;
                  this.field_c = -2;
                  break L2;
                }
              }
              L5: {
                if (param1 == 5391) {
                  break L5;
                } else {
                  field_x = (String) null;
                  break L5;
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

    public tp() {
    }

    final static eh a(nh param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        ec var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        eh var11 = null;
        eh var13 = null;
        byte[] var16 = null;
        eh stackIn_6_0 = null;
        eh stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        eh stackOut_7_0 = null;
        eh stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var11 = new eh();
            var13 = var11;
            var13.field_i = param1;
            var13.field_b = param2;
            var13.field_d = param0;
            var16 = param0.a("config", param2 + "/" + param1, (byte) -128);
            var6 = new ec(var16);
            var13.field_c = (var16.length + -4) / 2;
            var13.field_j = new int[var13.field_c];
            var13.field_l = null;
            var13.field_f = 0;
            var13.field_k = new int[var13.field_c];
            var13.field_g = var6.k(0);
            var13.field_m = var6.k(0);
            var7 = 0;
            L1: while (true) {
              if (var13.field_c <= var7) {
                if (param3 == -1998) {
                  stackOut_7_0 = (eh) (var13);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_5_0 = (eh) null;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var8 = var6.c(true);
                var9 = 10 * var6.c(true);
                var11.field_k[var7] = var8;
                var11.field_j[var7] = var9;
                var13.field_f = var13.field_f + var9;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("tp.Q(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_z = "Orb of Majesty";
        field_A = new String[]{null, "After selecting your target, you now need to choose which <%raiders> will form the party to send out. Select up to four <%raiders> by <col=FF0000>left-clicking on them</col>, then <col=FF0000>click 'Raid' to continue</col>. Remember to take a selection of <%raiders> with skills to overcome any form of defence you might encounter."};
        field_u = "DUNGEON ASSAULT";
        field_C = new String[]{"Surprise", "There are other aspects to combat between raiders and monsters; first is the element of <%highlight>surprise</col>. If your raider succeeds in surprising the monster, it will be able to <%highlight>strike first</col> - coupled with a high <%attack> skill, your raider may be able to defeat the monster before it gets a chance to strike back."};
        field_B = new ef();
        field_w = "Sort rooms by <%0>";
        field_y = new ad(2, 4, 4, 0);
        field_x = "This password contains your email address, and would be easy to guess";
    }
}

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
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            fk var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
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
                    var4_ref = (fk) ((Object) this.field_q.a(param2 ^ -30));
                    if (var4_ref != null) {
                      this.field_o.a(var4_ref, -1089421886);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref = (fk) ((Object) this.field_h.a(-122));
                        if (var4_ref != null) {
                          this.field_n.a(var4_ref, param2 ^ -1089421909);
                          continue L5;
                        } else {
                          L6: {
                            if (this.field_g != 0) {
                              try {
                                L7: {
                                  this.field_d.field_i = 0;
                                  this.field_d.a(-11, 4);
                                  this.field_d.a(param2 + -116, (int) this.field_g);
                                  this.field_d.a(0, (byte) -58);
                                  this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
                                  break L7;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L8: {
                                  var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                  try {
                                    L9: {
                                      this.field_v.h(0);
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                                    decompiledCaughtException = decompiledCaughtParameter2;
                                    L10: {
                                      var5 = (Exception) (Object) decompiledCaughtException;
                                      break L10;
                                    }
                                  }
                                  this.field_b = -2;
                                  this.field_c = this.field_c + 1;
                                  this.field_v = null;
                                  break L8;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          this.field_k = 0;
                          this.field_m = lj.a((byte) -67);
                          decompiledRegionSelector0 = 1;
                          break L0;
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
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_29_0 = (RuntimeException) (var4_ref3);

                stackIn_29_1 = new StringBuilder().append("g.L(");

                if (param0 == null) {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackIn_30_2 = "null";
                  break L11;
                } else {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackIn_30_2 = "{...}";
                  break L11;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
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
            IOException iOException = null;
            ni stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ni stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_v != null) {
              try {
                L0: {
                  L1: {
                    this.field_d.field_i = 0;
                    if (param0 > 48) {
                      break L1;
                    } else {
                      this.b((byte) 48);
                      break L1;
                    }
                  }
                  L2: {
                    stackIn_6_0 = this.field_d;

                    stackIn_6_1 = -11;

                    if (param1) {
                      stackIn_7_0 = (ni) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 2;
                      break L2;
                    } else {
                      stackIn_7_0 = (ni) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 3;
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
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
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
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_88_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            fk var2 = null;
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
            fk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
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
              if (this.f(1) != 0) {
                return false;
              } else {
                if (this.e(-53) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_v.c(0);
                  var2 = (fk) ((Object) this.field_o.b((byte) 113));
                  L5: while (true) {
                    if (var2 == null) {
                      L6: {
                        if (param0 == 66) {
                          break L6;
                        } else {
                          this.g(-76);
                          break L6;
                        }
                      }
                      var2 = (fk) ((Object) this.field_n.b((byte) 120));
                      L7: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (var2_int >= 100) {
                                break L9;
                              } else {
                                var3_int = this.field_v.e(-120);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L10: {
                                      this.field_k = 0;
                                      var4 = 0;
                                      if (this.field_p != null) {
                                        if (this.field_p.field_y != 0) {
                                          break L10;
                                        } else {
                                          var4 = 1;
                                          break L10;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (var4 <= 0) {
                                        L12: {
                                          var5 = this.field_p.field_A.field_k.length + -this.field_p.field_E;
                                          var6 = -this.field_p.field_y + 512;
                                          if (var5 - this.field_p.field_A.field_i < var6) {
                                            var6 = -this.field_p.field_A.field_i + var5;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var6 <= var3_int) {
                                            break L13;
                                          } else {
                                            var6 = var3_int;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          this.field_v.a(var6, this.field_p.field_A.field_k, this.field_p.field_A.field_i, false);
                                          if (0 == this.field_g) {
                                            break L14;
                                          } else {
                                            var7 = 0;
                                            L15: while (true) {
                                              if (var7 >= var6) {
                                                break L14;
                                              } else {
                                                this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i] = (byte)df.a((int) this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i], (int) this.field_g);
                                                var7++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                        this.field_p.field_y = this.field_p.field_y + var6;
                                        this.field_p.field_A.field_i = this.field_p.field_A.field_i + var6;
                                        if (this.field_p.field_A.field_i == var5) {
                                          this.field_p.e(-100);
                                          this.field_p.field_q = false;
                                          this.field_p = null;
                                          break L11;
                                        } else {
                                          if (512 != this.field_p.field_y) {
                                            break L11;
                                          } else {
                                            this.field_p.field_y = 0;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        L16: {
                                          var5 = var4 + -this.field_f.field_i;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          this.field_v.a(var5, this.field_f.field_k, this.field_f.field_i, false);
                                          if (-1 != (this.field_g ^ -1)) {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var6 >= var5) {
                                                break L17;
                                              } else {
                                                this.field_f.field_k[var6 + this.field_f.field_i] = (byte)df.a((int) this.field_f.field_k[var6 + this.field_f.field_i], (int) this.field_g);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        this.field_f.field_i = this.field_f.field_i + var5;
                                        if (this.field_f.field_i < var4) {
                                          break L11;
                                        } else {
                                          if (this.field_p != null) {
                                            if (-1 == (this.field_p.field_y ^ -1)) {
                                              if ((this.field_f.field_k[0] ^ -1) == 0) {
                                                this.field_f.field_i = 0;
                                                this.field_p.field_y = 1;
                                                break L11;
                                              } else {
                                                this.field_p = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L19: {
                                              this.field_f.field_i = 0;
                                              var6 = this.field_f.e(false);
                                              var7 = this.field_f.c((byte) 25);
                                              var8 = this.field_f.e(false);
                                              var9 = this.field_f.c((byte) 124);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackIn_50_0 = 0;
                                                break L19;
                                              } else {
                                                stackIn_50_0 = 1;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_50_0;
                                              var12 = (long)var7 + ((long)var6 << -919735392);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (fk) ((Object) this.field_h.b((byte) 120));
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if ((var14_ref.field_j ^ -1L) == (var12 ^ -1L)) {
                                                      break L20;
                                                    } else {
                                                      var14_ref = (fk) ((Object) this.field_h.c((byte) 97));
                                                      continue L21;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (fk) ((Object) this.field_q.b((byte) 117));
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var12 != var14_ref.field_j) {
                                                      var14_ref = (fk) ((Object) this.field_q.c((byte) 71));
                                                      continue L22;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L23: {
                                                if (var10 != 0) {
                                                  stackIn_66_0 = 9;
                                                  break L23;
                                                } else {
                                                  stackIn_66_0 = 5;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              this.field_p = var14_ref;
                                              this.field_p.field_A = new ni(this.field_p.field_E + var9 + var15);
                                              this.field_p.field_A.a(-11, var10);
                                              this.field_p.field_A.a(var9, (byte) -106);
                                              this.field_f.field_i = 0;
                                              this.field_p.field_y = 10;
                                              break L11;
                                            }
                                          }
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
                            stackIn_88_0 = 1;
                            break L4;
                          }
                        } else {
                          this.field_d.field_i = 0;
                          this.field_d.a(-11, 0);
                          this.field_d.a(var2.field_j, (byte) -39);
                          this.field_v.a((byte) -103, this.field_d.field_k.length, 0, this.field_d.field_k);
                          this.field_h.a(var2, -1089421886);
                          var2 = (fk) ((Object) this.field_n.c((byte) 117));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_d.field_i = 0;
                      this.field_d.a(-11, 1);
                      this.field_d.a(var2.field_j, (byte) -39);
                      this.field_v.a((byte) -122, this.field_d.field_k.length, 0, this.field_d.field_k);
                      this.field_q.a(var2, -1089421886);
                      var2 = (fk) ((Object) this.field_o.c((byte) 67));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_v.h(0);
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
                  this.field_c = this.field_c + 1;
                  this.field_b = -2;
                  this.field_v = null;
                  if (0 != this.f(1)) {
                    break L26;
                  } else {
                    if (this.e(-64) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_88_0 != 0;
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

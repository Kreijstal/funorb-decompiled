/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ih extends ej {
    static vl field_x;
    static String field_z;
    static String field_u;
    static bd field_v;
    static volatile boolean field_s;
    private td field_t;
    static int field_w;
    static oc[] field_y;

    final boolean e(int param0) {
        try {
            int stackIn_49_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            lm var2 = null;
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
            lm var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            L0: {
              var16 = HostileSpawn.field_I ? 1 : 0;
              if (null == this.field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = hn.a((byte) 80);
                  var4 = (int)(-this.field_c + var2_long);
                  if (-201 > (var4 ^ -1)) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_c = var2_long;
                this.field_f = this.field_f + var4;
                if (this.field_f > 30000) {
                  try {
                    L2: {
                      this.field_t.a(37);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (param0 < -75) {
              if (this.field_t != null) {
                try {
                  L4: {
                    this.field_t.a((byte) -55);
                    var2 = (lm) ((Object) this.field_b.d((byte) -35));
                    L5: while (true) {
                      if (var2 == null) {
                        var2 = (lm) ((Object) this.field_l.d((byte) -35));
                        L6: while (true) {
                          if (var2 == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (100 <= var2_int) {
                                  break L8;
                                } else {
                                  var3_int = this.field_t.b((byte) 59);
                                  if (-1 >= (var3_int ^ -1)) {
                                    if (-1 == (var3_int ^ -1)) {
                                      break L8;
                                    } else {
                                      L9: {
                                        this.field_f = 0;
                                        var4 = 0;
                                        if (null != this.field_p) {
                                          if (this.field_p.field_x == 0) {
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
                                        if (-1 <= (var4 ^ -1)) {
                                          L11: {
                                            var5 = this.field_p.field_C.field_n.length + -this.field_p.field_B;
                                            var6 = -this.field_p.field_x + 512;
                                            if (var5 - this.field_p.field_C.field_i >= var6) {
                                              break L11;
                                            } else {
                                              var6 = -this.field_p.field_C.field_i + var5;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (var3_int >= var6) {
                                              break L12;
                                            } else {
                                              var6 = var3_int;
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            this.field_t.a(-1, this.field_p.field_C.field_n, this.field_p.field_C.field_i, var6);
                                            if (this.field_r != 0) {
                                              var17 = 0;
                                              var7 = var17;
                                              L14: while (true) {
                                                if (var17 >= var6) {
                                                  break L13;
                                                } else {
                                                  this.field_p.field_C.field_n[this.field_p.field_C.field_i - -var17] = (byte)bm.a((int) this.field_p.field_C.field_n[this.field_p.field_C.field_i + var17], (int) this.field_r);
                                                  var17++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                          this.field_p.field_x = this.field_p.field_x + var6;
                                          this.field_p.field_C.field_i = this.field_p.field_C.field_i + var6;
                                          if (this.field_p.field_C.field_i != var5) {
                                            if (-513 == (this.field_p.field_x ^ -1)) {
                                              this.field_p.field_x = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            this.field_p.c(-1);
                                            this.field_p.field_v = false;
                                            this.field_p = null;
                                            break L10;
                                          }
                                        } else {
                                          L15: {
                                            var5 = var4 - this.field_i.field_i;
                                            if (var5 > var3_int) {
                                              var5 = var3_int;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            this.field_t.a(-1, this.field_i.field_n, this.field_i.field_i, var5);
                                            if (this.field_r != 0) {
                                              var6 = 0;
                                              L17: while (true) {
                                                if (var5 <= var6) {
                                                  break L16;
                                                } else {
                                                  this.field_i.field_n[var6 + this.field_i.field_i] = (byte)bm.a((int) this.field_i.field_n[var6 + this.field_i.field_i], (int) this.field_r);
                                                  var6++;
                                                  continue L17;
                                                }
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                          this.field_i.field_i = this.field_i.field_i + var5;
                                          if (this.field_i.field_i >= var4) {
                                            if (null == this.field_p) {
                                              L18: {
                                                this.field_i.field_i = 0;
                                                var6 = this.field_i.l(32270);
                                                var7 = this.field_i.d(8195);
                                                var8 = this.field_i.l(32270);
                                                var9 = this.field_i.d(8195);
                                                var10 = var8 & 127;
                                                if (-1 == (128 & var8 ^ -1)) {
                                                  stackIn_49_0 = 0;
                                                  break L18;
                                                } else {
                                                  stackIn_49_0 = 1;
                                                  break L18;
                                                }
                                              }
                                              L19: {
                                                var11 = stackIn_49_0;
                                                var12 = ((long)var6 << 745888864) - -(long)var7;
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (lm) ((Object) this.field_a.d((byte) -35));
                                                  L20: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if ((var12 ^ -1L) == (var14_ref.field_h ^ -1L)) {
                                                        break L19;
                                                      } else {
                                                        var14_ref = (lm) ((Object) this.field_a.b((byte) -18));
                                                        continue L20;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (lm) ((Object) this.field_j.d((byte) -35));
                                                  L21: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if (var14_ref.field_h == var12) {
                                                        break L19;
                                                      } else {
                                                        var14_ref = (lm) ((Object) this.field_j.b((byte) -52));
                                                        continue L21;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref != null) {
                                                L22: {
                                                  if (var10 != 0) {
                                                    stackIn_63_0 = 9;
                                                    break L22;
                                                  } else {
                                                    stackIn_63_0 = 5;
                                                    break L22;
                                                  }
                                                }
                                                var15 = stackIn_63_0;
                                                this.field_p = var14_ref;
                                                this.field_p.field_C = new vi(var15 + (var9 - -this.field_p.field_B));
                                                this.field_p.field_C.d(122, var10);
                                                this.field_p.field_C.b(var9, 25251);
                                                this.field_p.field_x = 10;
                                                this.field_i.field_i = 0;
                                                break L10;
                                              } else {
                                                throw new IOException();
                                              }
                                            } else {
                                              if (this.field_p.field_x != 0) {
                                                throw new IOException();
                                              } else {
                                                if (this.field_i.field_n[0] != -1) {
                                                  this.field_p = null;
                                                  break L10;
                                                } else {
                                                  this.field_i.field_i = 0;
                                                  this.field_p.field_x = 1;
                                                  break L10;
                                                }
                                              }
                                            }
                                          } else {
                                            var2_int++;
                                            continue L7;
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
                              stackIn_85_0 = 1;
                              break L4;
                            }
                          } else {
                            this.field_m.field_i = 0;
                            this.field_m.d(100, 0);
                            this.field_m.a(-127, var2.field_h);
                            this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) -127, 0);
                            this.field_a.a(var2, 56);
                            var2 = (lm) ((Object) this.field_l.b((byte) -114));
                            continue L6;
                          }
                        }
                      } else {
                        this.field_m.field_i = 0;
                        this.field_m.d(124, 1);
                        this.field_m.a(-113, var2.field_h);
                        this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) -63, 0);
                        this.field_j.a(var2, -126);
                        var2 = (lm) ((Object) this.field_b.b((byte) -59));
                        continue L5;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2_ref = (IOException) (Object) decompiledCaughtException;
                  try {
                    L23: {
                      this.field_t.a(-98);
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
                    this.field_t = null;
                    this.field_k = this.field_k + 1;
                    this.field_e = -2;
                    if (this.c((byte) 122) != 0) {
                      break L25;
                    } else {
                      if (0 != this.b((byte) -34)) {
                        break L25;
                      } else {
                        return true;
                      }
                    }
                  }
                  return false;
                }
                return stackIn_85_0 != 0;
              } else {
                L26: {
                  if (this.c((byte) 122) != 0) {
                    break L26;
                  } else {
                    if (this.b((byte) -34) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        if (null != this.field_t) {
            this.field_t.a(-105);
        }
        int var2 = -92 % ((param0 - -63) / 63);
    }

    final void c(int param0) {
        try {
            if (param0 != 194) {
                this.e(57);
            }
            this.field_t.a(-114);
        } catch (Exception exception) {
        }
        this.field_e = -1;
        this.field_t = null;
        this.field_k = this.field_k + 1;
        this.field_r = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (this.field_t == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_m.field_i = 0;
                  this.field_m.d(param0 + 74, 6);
                  this.field_m.e(3, -91);
                  this.field_m.a((byte) -119, 0);
                  this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) 32, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_t.a(-54);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_k = this.field_k + 1;
                  this.field_t = null;
                  this.field_e = -2;
                  break L1;
                }
              }
              L4: {
                if (param0 == 24) {
                  break L4;
                } else {
                  this.field_t = (td) null;
                  break L4;
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

    final void a(boolean param0, byte param1, Object param2) {
        try {
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            lm var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_t) {
                    try {
                      L2: {
                        this.field_t.a(-98);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_t = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_t = (td) (param2);
                this.g(24);
                this.a((byte) 47, param0);
                this.field_p = null;
                this.field_i.field_i = 0;
                L4: while (true) {
                  var4_ref = (lm) ((Object) this.field_j.a((byte) 27));
                  if (var4_ref != null) {
                    this.field_b.a(var4_ref, 40);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref = (lm) ((Object) this.field_a.a((byte) 27));
                      if (var4_ref != null) {
                        this.field_l.a(var4_ref, -127);
                        continue L5;
                      } else {
                        L6: {
                          if (param1 == 75) {
                            break L6;
                          } else {
                            field_v = (bd) null;
                            break L6;
                          }
                        }
                        L7: {
                          if (this.field_r == 0) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_m.field_i = 0;
                                this.field_m.d(106, 4);
                                this.field_m.d(param1 ^ 52, (int) this.field_r);
                                this.field_m.b(0, 25251);
                                this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) 87, 0);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_t.a(-95);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_k = this.field_k + 1;
                                this.field_e = -2;
                                this.field_t = null;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_f = 0;
                        this.field_c = hn.a((byte) 80);
                        break L0;
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

                stackIn_28_1 = new StringBuilder().append("ih.C(").append(param0).append(',').append(param1).append(',');

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
              throw wg.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = 24 + uj.field_p.field_e;
            var6 = uj.field_p.field_g;
            if (param0 == -15587) {
              var2_int = 0;
              L1: while (true) {
                if (rc.field_e <= var2_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = re.field_n[var2_int];
                  var3 = -var5 + (int)(24.0 * ((double)var7.field_j.field_e + var7.field_l.field_f));
                  var4 = -var6 + (int)((var7.field_l.field_a + (double)var7.field_j.field_g) * 24.0);
                  if (95 >= (var3 ^ -1)) {
                    if ((var4 ^ -1) <= 95) {
                      if (var3 <= 736) {
                        if (576 >= var4) {
                          L2: {
                            if (0 == ue.field_d) {
                              L3: {
                                var9 = var7.field_i;
                                if (-130 == (var9 ^ -1)) {
                                  break L3;
                                } else {
                                  if (var9 != 131) {
                                    if ((var9 ^ -1) == -134) {
                                      break L3;
                                    } else {
                                      L4: {
                                        if (var9 == 128) {
                                          break L4;
                                        } else {
                                          if ((var9 ^ -1) == -131) {
                                            break L4;
                                          } else {
                                            if (var9 == 132) {
                                              break L4;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                      L5: {
                                        var3 = var7.field_j.field_e * 24 - var5;
                                        var4 = 24 * var7.field_j.field_g - var6;
                                        var3 += 24;
                                        var4 += 12;
                                        var8 = var7.field_e / 2;
                                        if ((var8 ^ -1) <= -7) {
                                          var8 = 5;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      var7.field_H[var8].a(true, 128, 0, var3, var4);
                                      var7.field_u.a(true, 128, 0, var3, var4);
                                      break L2;
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L6: {
                                var3 = var7.field_j.field_e * 24 + -var5;
                                var4 = 24 * var7.field_j.field_g + -var6;
                                var3 += 12;
                                var8 = var7.field_e / 2;
                                if (-7 >= (var8 ^ -1)) {
                                  var8 = 5;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var7.field_H[var8].a(true, 128, 64, var3, var4);
                              var7.field_u.a(true, 128, 0, var3, var4);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          var2_int++;
                          continue L1;
                        } else {
                          var2_int++;
                          continue L1;
                        }
                      } else {
                        var2_int++;
                        continue L1;
                      }
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "ih.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            vi stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            vi stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    this.field_m.field_i = 0;
                    stackIn_4_0 = this.field_m;

                    stackIn_4_1 = 123;

                    if (param1) {
                      stackIn_5_0 = (vi) ((Object) stackIn_4_0);
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = 2;
                      break L1;
                    } else {
                      stackIn_5_0 = (vi) ((Object) stackIn_4_0);
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = 3;
                      break L1;
                    }
                  }
                  ((vi) (Object) stackIn_5_0).d(stackIn_5_1, stackIn_5_2);
                  this.field_m.a(-121, 0L);
                  this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) -105, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_t.a(param0 ^ 127);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_e = -2;
                  this.field_k = this.field_k + 1;
                  this.field_t = null;
                  break L2;
                }
              }
              L5: {
                if (param0 == 47) {
                  break L5;
                } else {
                  this.a((byte) -29);
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

    public static void f(int param0) {
        if (param0 != 200) {
            field_x = (vl) null;
        }
        field_x = null;
        field_u = null;
        field_z = null;
        field_y = null;
        field_v = null;
    }

    public ih() {
    }

    final static int a(oc param0, byte param1, oc param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                ih.a(-70, -116);
                break L1;
              }
            }
            L2: {
              if (param0.field_g >= param2.field_g) {
                stackIn_5_0 = param0.field_g + -param2.field_g;
                break L2;
              } else {
                stackIn_5_0 = param2.field_g + -param0.field_g;
                break L2;
              }
            }
            L3: {


              if (param2.field_e > param0.field_e) {

                stackIn_8_1 = -param0.field_e + param2.field_e;
                break L3;
              } else {

                stackIn_8_1 = -param2.field_e + param0.field_e;
                break L3;
              }
            }
            stackIn_9_0 = stackIn_5_0 + stackIn_8_1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ih.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_u = "Activate the reactor on this level, or seal off the breach from environmental controls.";
        field_s = false;
        field_z = "This door is sealed from the other side. I'll have to find another way around.";
        field_x = new vl();
        field_w = 9;
    }
}

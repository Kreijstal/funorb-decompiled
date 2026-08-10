/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tj extends uh {
    static int[] field_w;
    private gj field_x;
    static String field_t;
    static String field_A;
    static int field_u;
    static ti field_s;
    static String field_z;
    static int field_y;
    static String field_v;

    final boolean c(byte param0) {
        try {
            int stackIn_18_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            pj var2 = null;
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
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = Transmogrify.field_A ? 1 : 0;
              if (null == this.field_x) {
                break L0;
              } else {
                L1: {
                  var2_long = lk.a(0);
                  var4 = (int)(-this.field_l + var2_long);
                  this.field_l = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_b = this.field_b + var4;
                if (this.field_b <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_x.a(true);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_x = null;
                  break L0;
                }
              }
            }
            if (null == this.field_x) {
              if (0 != this.a((byte) -68)) {
                return false;
              } else {
                if (this.e(-10236) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_x.d(-60);
                  if (param0 > 115) {
                    var2 = (pj) ((Object) this.field_c.b((byte) 125));
                    L5: while (true) {
                      if (var2 == null) {
                        var2 = (pj) ((Object) this.field_a.b((byte) 114));
                        L6: while (true) {
                          if (var2 == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (100 <= var2_int) {
                                  break L8;
                                } else {
                                  var3_int = this.field_x.a((byte) -119);
                                  if (0 > var3_int) {
                                    throw new IOException();
                                  } else {
                                    if (0 != var3_int) {
                                      L9: {
                                        this.field_b = 0;
                                        var4 = 0;
                                        if (this.field_e != null) {
                                          if (-1 != (this.field_e.field_C ^ -1)) {
                                            break L9;
                                          } else {
                                            var4 = 1;
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
                                            var5 = -this.field_g.field_h + var4;
                                            if (var5 > var3_int) {
                                              var5 = var3_int;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            this.field_x.a(this.field_g.field_h, var5, this.field_g.field_g, 5768);
                                            if (this.field_m != 0) {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var5 <= var6) {
                                                  break L12;
                                                } else {
                                                  this.field_g.field_g[var6 + this.field_g.field_h] = (byte)ak.a((int) this.field_g.field_g[var6 + this.field_g.field_h], (int) this.field_m);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          this.field_g.field_h = this.field_g.field_h + var5;
                                          if (var4 > this.field_g.field_h) {
                                            break L10;
                                          } else {
                                            if (this.field_e == null) {
                                              L14: {
                                                this.field_g.field_h = 0;
                                                var6 = this.field_g.d((byte) 56);
                                                var7 = this.field_g.c((byte) -125);
                                                var8 = this.field_g.d((byte) 90);
                                                var9 = this.field_g.c((byte) -104);
                                                var10 = 127 & var8;
                                                if ((var8 & 128) == 0) {
                                                  stackIn_65_0 = 0;
                                                  break L14;
                                                } else {
                                                  stackIn_65_0 = 1;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_65_0;
                                                var12 = ((long)var6 << 1160970720) - -(long)var7;
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (pj) ((Object) this.field_h.b((byte) 124));
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (var12 != var14_ref.field_j) {
                                                        var14_ref = (pj) ((Object) this.field_h.a(119));
                                                        continue L16;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (pj) ((Object) this.field_n.b((byte) 127));
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if ((var12 ^ -1L) != (var14_ref.field_j ^ -1L)) {
                                                        var14_ref = (pj) ((Object) this.field_n.a(83));
                                                        continue L17;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref != null) {
                                                L18: {
                                                  this.field_e = var14_ref;
                                                  if (var10 == 0) {
                                                    stackIn_81_0 = 5;
                                                    break L18;
                                                  } else {
                                                    stackIn_81_0 = 9;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_81_0;
                                                this.field_e.field_B = new oa(var15 + (var9 + this.field_e.field_z));
                                                this.field_e.field_B.f(6389, var10);
                                                this.field_e.field_B.a(-112, var9);
                                                this.field_g.field_h = 0;
                                                this.field_e.field_C = 10;
                                                break L10;
                                              } else {
                                                throw new IOException();
                                              }
                                            } else {
                                              if (0 != this.field_e.field_C) {
                                                throw new IOException();
                                              } else {
                                                if ((this.field_g.field_g[0] ^ -1) == 0) {
                                                  this.field_g.field_h = 0;
                                                  this.field_e.field_C = 1;
                                                  break L10;
                                                } else {
                                                  this.field_e = null;
                                                  break L10;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L19: {
                                            var5 = -this.field_e.field_z + this.field_e.field_B.field_g.length;
                                            var6 = -this.field_e.field_C + 512;
                                            if (var5 - this.field_e.field_B.field_h >= var6) {
                                              break L19;
                                            } else {
                                              var6 = var5 + -this.field_e.field_B.field_h;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            if (var6 <= var3_int) {
                                              break L20;
                                            } else {
                                              var6 = var3_int;
                                              break L20;
                                            }
                                          }
                                          L21: {
                                            this.field_x.a(this.field_e.field_B.field_h, var6, this.field_e.field_B.field_g, 5768);
                                            if (this.field_m != 0) {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var7 >= var6) {
                                                  break L21;
                                                } else {
                                                  this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h] = (byte)ak.a((int) this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h], (int) this.field_m);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                          this.field_e.field_B.field_h = this.field_e.field_B.field_h + var6;
                                          this.field_e.field_C = this.field_e.field_C + var6;
                                          if (this.field_e.field_B.field_h != var5) {
                                            if (-513 == (this.field_e.field_C ^ -1)) {
                                              this.field_e.field_C = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            this.field_e.b((byte) -79);
                                            this.field_e.field_m = false;
                                            this.field_e = null;
                                            break L10;
                                          }
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              stackIn_89_0 = 1;
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          } else {
                            this.field_i.field_h = 0;
                            this.field_i.f(6389, 0);
                            this.field_i.a(var2.field_j, true);
                            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                            this.field_n.a((byte) -128, var2);
                            var2 = (pj) ((Object) this.field_a.a(104));
                            continue L6;
                          }
                        }
                      } else {
                        this.field_i.field_h = 0;
                        this.field_i.f(6389, 1);
                        this.field_i.a(var2.field_j, true);
                        this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                        this.field_h.a((byte) -128, var2);
                        var2 = (pj) ((Object) this.field_c.a(97));
                        continue L5;
                      }
                    }
                  } else {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_x.a(true);
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
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
                  this.field_x = null;
                  if (this.a((byte) 87) != 0) {
                    break L25;
                  } else {
                    if (this.e(-10236) == 0) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_89_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            pj var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_x != null) {
                    try {
                      L2: {
                        this.field_x.a(true);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_x = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_x = (gj) (param1);
                this.a(false);
                this.a(3, param0);
                this.field_e = null;
                if (param2 == 20) {
                  this.field_g.field_h = 0;
                  L4: while (true) {
                    var4_ref = (pj) ((Object) this.field_h.d(-31914));
                    if (var4_ref != null) {
                      this.field_c.a((byte) -128, var4_ref);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref = (pj) ((Object) this.field_n.d(param2 + -31934));
                        if (var4_ref != null) {
                          this.field_a.a((byte) -128, var4_ref);
                          continue L5;
                        } else {
                          L6: {
                            if (this.field_m != 0) {
                              try {
                                L7: {
                                  this.field_i.field_h = 0;
                                  this.field_i.f(6389, 4);
                                  this.field_i.f(6389, (int) this.field_m);
                                  this.field_i.a(-122, 0);
                                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                                  break L7;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L8: {
                                  var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                  try {
                                    L9: {
                                      this.field_x.a(true);
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                                    decompiledCaughtException = decompiledCaughtParameter2;
                                    L10: {
                                      var5 = (Exception) (Object) decompiledCaughtException;
                                      break L10;
                                    }
                                  }
                                  this.field_p = this.field_p + 1;
                                  this.field_k = -2;
                                  this.field_x = null;
                                  break L8;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          this.field_b = 0;
                          this.field_l = lk.a(param2 + -20);
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

                stackIn_29_1 = new StringBuilder().append("tj.D(").append(param0).append(',');

                if (param1 == null) {
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
              throw ch.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
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

    final void d(int param0) {
        try {
            this.field_x.a(true);
            int var2_int = 19 % ((81 - param0) / 34);
        } catch (Exception exception) {
        }
        this.field_k = -1;
        this.field_x = null;
        this.field_p = this.field_p + 1;
        this.field_m = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            oa stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            oa stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_x != null) {
              try {
                L0: {
                  L1: {
                    if (param0 == 3) {
                      break L1;
                    } else {
                      this.a(-2, false);
                      break L1;
                    }
                  }
                  L2: {
                    this.field_i.field_h = 0;
                    stackIn_6_0 = this.field_i;

                    stackIn_6_1 = 6389;

                    if (param1) {
                      stackIn_7_0 = (oa) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 2;
                      break L2;
                    } else {
                      stackIn_7_0 = (oa) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 3;
                      break L2;
                    }
                  }
                  ((oa) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                  this.field_i.a(0L, true);
                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_x.a(true);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
                  this.field_x = null;
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

    private final void a(boolean param0) {
        try {
            IOException iOException = null;
            gj stackIn_10_0 = null;
            gj stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            L0: {
              if (!param0) {
                break L0;
              } else {
                this.a(-105);
                break L0;
              }
            }
            if (this.field_x == null) {
              return;
            } else {
              try {
                L1: {
                  this.field_i.field_h = 0;
                  this.field_i.f(6389, 6);
                  this.field_i.i(3, 45);
                  this.field_i.c(0, -159688920);
                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      L4: {
                        stackIn_10_0 = this.field_x;

                        if (param0) {
                          stackIn_11_0 = (gj) ((Object) stackIn_10_0);
                          stackIn_11_1 = 0;
                          break L4;
                        } else {
                          stackIn_11_0 = (gj) ((Object) stackIn_10_0);
                          stackIn_11_1 = 1;
                          break L4;
                        }
                      }
                      ((gj) (Object) stackIn_11_0).a(stackIn_11_1 != 0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_x = null;
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
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

    final void a(int param0) {
        if (!(null == this.field_x)) {
            this.field_x.a(true);
        }
        if (param0 != -2025316960) {
            field_A = (String) null;
        }
    }

    public tj() {
    }

    public static void d(byte param0) {
        field_z = null;
        field_w = null;
        field_v = null;
        int var1 = 109 % ((49 - param0) / 45);
        field_t = null;
        field_A = null;
        field_s = null;
    }

    static {
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = "Create a free account to start using this feature";
        field_z = "Submit for ";
        field_A = "Please enter your age in years";
        field_v = null;
    }
}

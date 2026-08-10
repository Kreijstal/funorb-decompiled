/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ge {
    static String[] field_v;
    static int[] field_t;
    static String field_u;
    private cb field_q;
    static int field_r;
    static int[] field_s;

    final boolean e(int param0) {
        try {
            int stackIn_24_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_88_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            cd var2 = null;
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
            cd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = OrbDefence.field_D ? 1 : 0;
              if (null != this.field_q) {
                L1: {
                  var2_long = ji.b(param0 + -278);
                  var4 = (int)(var2_long + -this.field_j);
                  this.field_j = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_e = this.field_e + var4;
                if ((this.field_e ^ -1) < -30001) {
                  try {
                    L2: {
                      this.field_q.a(1);
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
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (this.field_q == null) {
              L4: {
                if (this.g(-128) != 0) {
                  break L4;
                } else {
                  if (-1 != (this.b(84) ^ -1)) {
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
                  this.field_q.b(-120);
                  var2 = (cd) ((Object) this.field_d.b((byte) 46));
                  L6: while (true) {
                    if (var2 == null) {
                      var2 = (cd) ((Object) this.field_k.b((byte) 46));
                      L7: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          if (param0 == 255) {
                            L8: while (true) {
                              if ((var2_int ^ -1) <= -101) {
                                stackIn_88_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L5;
                              } else {
                                var3_int = this.field_q.b((byte) 101);
                                if (-1 < (var3_int ^ -1)) {
                                  throw new IOException();
                                } else {
                                  if (-1 != (var3_int ^ -1)) {
                                    L9: {
                                      this.field_e = 0;
                                      var4 = 0;
                                      if (null == this.field_a) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (-1 != (this.field_a.field_v ^ -1)) {
                                          break L9;
                                        } else {
                                          var4 = 1;
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var4 > 0) {
                                        L11: {
                                          var5 = -this.field_m.field_i + var4;
                                          if (var5 > var3_int) {
                                            var5 = var3_int;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          this.field_q.a(this.field_m.field_i, var5, -117, this.field_m.field_j);
                                          if (this.field_h == 0) {
                                            break L12;
                                          } else {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var6 >= var5) {
                                                break L12;
                                              } else {
                                                this.field_m.field_j[this.field_m.field_i - -var6] = (byte)gi.a((int) this.field_m.field_j[this.field_m.field_i + var6], (int) this.field_h);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                        this.field_m.field_i = this.field_m.field_i + var5;
                                        if (this.field_m.field_i >= var4) {
                                          if (this.field_a == null) {
                                            L14: {
                                              this.field_m.field_i = 0;
                                              var6 = this.field_m.b((byte) 90);
                                              var7 = this.field_m.l(0);
                                              var8 = this.field_m.b((byte) 90);
                                              var9 = this.field_m.l(param0 + -255);
                                              var10 = 127 & var8;
                                              if (0 == (128 & var8)) {
                                                stackIn_62_0 = 0;
                                                break L14;
                                              } else {
                                                stackIn_62_0 = 1;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_62_0;
                                              var12 = ((long)var6 << 1096479136) - -(long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (cd) ((Object) this.field_p.b((byte) 46));
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if ((var14_ref.field_h ^ -1L) != (var12 ^ -1L)) {
                                                      var14_ref = (cd) ((Object) this.field_p.b(0));
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (cd) ((Object) this.field_f.b((byte) 46));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if ((var14_ref.field_h ^ -1L) != (var12 ^ -1L)) {
                                                      var14_ref = (cd) ((Object) this.field_f.b(0));
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
                                                this.field_a = var14_ref;
                                                if (var10 == 0) {
                                                  stackIn_79_0 = 5;
                                                  break L18;
                                                } else {
                                                  stackIn_79_0 = 9;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_79_0;
                                              this.field_a.field_u = new mg(this.field_a.field_s + var9 + var15);
                                              this.field_a.field_u.a(var10, -99);
                                              this.field_a.field_u.b(var9, -1);
                                              this.field_a.field_v = 10;
                                              this.field_m.field_i = 0;
                                              break L10;
                                            }
                                          } else {
                                            if (0 == this.field_a.field_v) {
                                              if ((this.field_m.field_j[0] ^ -1) == 0) {
                                                this.field_m.field_i = 0;
                                                this.field_a.field_v = 1;
                                                break L10;
                                              } else {
                                                this.field_a = null;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        L19: {
                                          var5 = this.field_a.field_u.field_j.length + -this.field_a.field_s;
                                          var6 = 512 - this.field_a.field_v;
                                          if (var5 - this.field_a.field_u.field_i >= var6) {
                                            break L19;
                                          } else {
                                            var6 = var5 - this.field_a.field_u.field_i;
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
                                          this.field_q.a(this.field_a.field_u.field_i, var6, 87, this.field_a.field_u.field_j);
                                          if (this.field_h == 0) {
                                            break L21;
                                          } else {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var6 <= var7) {
                                                break L21;
                                              } else {
                                                this.field_a.field_u.field_j[this.field_a.field_u.field_i - -var7] = (byte)gi.a((int) this.field_a.field_u.field_j[this.field_a.field_u.field_i + var7], (int) this.field_h);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          }
                                        }
                                        this.field_a.field_v = this.field_a.field_v + var6;
                                        this.field_a.field_u.field_i = this.field_a.field_u.field_i + var6;
                                        if (this.field_a.field_u.field_i == var5) {
                                          this.field_a.c(-1);
                                          this.field_a.field_l = false;
                                          this.field_a = null;
                                          break L10;
                                        } else {
                                          if (-513 != (this.field_a.field_v ^ -1)) {
                                            break L10;
                                          } else {
                                            this.field_a.field_v = 0;
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                          } else {
                            stackIn_24_0 = 1;
                            decompiledRegionSelector0 = 0;
                            break L5;
                          }
                        } else {
                          this.field_l.field_i = 0;
                          this.field_l.a(0, -74);
                          this.field_l.b(115, var2.field_h);
                          this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                          this.field_f.a(-90, var2);
                          var2 = (cd) ((Object) this.field_k.b(0));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_l.field_i = 0;
                      this.field_l.a(1, -41);
                      this.field_l.b(123, var2.field_h);
                      this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                      this.field_p.a(param0 ^ -143, var2);
                      var2 = (cd) ((Object) this.field_d.b(0));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_q.a(1);
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
                  this.field_q = null;
                  this.field_b = this.field_b + 1;
                  this.field_n = -2;
                  if (-1 != (this.g(-113) ^ -1)) {
                    break L25;
                  } else {
                    if (this.b(param0 + -207) != 0) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_24_0 != 0;
              } else {
                return stackIn_88_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_q.a(1);
              if (param0 <= -5) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        this.field_n = -1;
        this.field_b = this.field_b + 1;
        this.field_q = null;
        this.field_h = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static rg a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        md var4 = null;
        md stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -55 % ((-3 - param2) / 32);
            var4 = new md();
            ((rg) ((Object) var4)).field_b = param0;
            ((rg) ((Object) var4)).field_a = param1;
            stackIn_1_0 = (md) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("a.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return (rg) ((Object) stackIn_1_0);
    }

    private final void b(byte param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (null != this.field_q) {
              try {
                L0: {
                  L1: {
                    this.field_l.field_i = 0;
                    this.field_l.a(6, -32);
                    if (param0 <= -73) {
                      break L1;
                    } else {
                      field_s = (int[]) null;
                      break L1;
                    }
                  }
                  this.field_l.c(3, 127);
                  this.field_l.b((byte) -60, 0);
                  this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_q = null;
                  this.field_b = this.field_b + 1;
                  this.field_n = -2;
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

    public static void a(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        int var1 = -22 / ((param0 - -30) / 37);
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            mg stackIn_6_0 = null;
            mg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (param0 <= -49) {
              if (null != this.field_q) {
                try {
                  L0: {
                    L1: {
                      this.field_l.field_i = 0;
                      stackIn_6_0 = this.field_l;

                      if (param1) {
                        stackIn_7_0 = (mg) ((Object) stackIn_6_0);
                        stackIn_7_1 = 2;
                        break L1;
                      } else {
                        stackIn_7_0 = (mg) ((Object) stackIn_6_0);
                        stackIn_7_1 = 3;
                        break L1;
                      }
                    }
                    ((mg) (Object) stackIn_7_0).a(stackIn_7_1, -105);
                    this.field_l.b(106, 0L);
                    this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        this.field_q.a(1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    this.field_n = -2;
                    this.field_q = null;
                    this.field_b = this.field_b + 1;
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static db[] a(be param0, int param1) {
        db[] stackIn_3_0 = null;
        db[] stackIn_9_0 = null;
        db[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        db[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        db var7 = null;
        int var8 = 0;
        eb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0.b((byte) -120)) {
              var9 = param0.a((byte) 31);
              L1: while (true) {
                if (0 != var9.field_a) {
                  if (var9.field_a != 2) {
                    var11 = (int[]) (var9.field_g);
                    var10 = var11;
                    var3 = var10;
                    var4 = new db[var11.length >> -517371230];
                    var5 = 16 / ((param1 - -29) / 44);
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var4.length) {
                        stackIn_14_0 = (db[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var7 = new db();
                        var4[var6] = var7;
                        var7.field_d = var3[var6 << 167270370];
                        var7.field_b = var3[1 + (var6 << 908315682)];
                        var7.field_e = var3[(var6 << 239281666) + 2];
                        var7.field_a = var3[3 + (var6 << 1061708130)];
                        var6++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_9_0 = new db[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  hb.a(10L, 103);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = new db[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("a.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final void c(int param0) {
        if (param0 != 1) {
            return;
        }
        if (!(this.field_q == null)) {
            this.field_q.a(1);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            cd var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_q) {
                    try {
                      L2: {
                        this.field_q.a(param1 + -19);
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
                this.field_q = (cb) (param0);
                this.b((byte) -103);
                this.a(-54, param2);
                this.field_a = null;
                this.field_m.field_i = 0;
                L4: while (true) {
                  var4_ref = (cd) ((Object) this.field_p.c(30664));
                  if (var4_ref != null) {
                    this.field_d.a(-79, var4_ref);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref = (cd) ((Object) this.field_f.c(30664));
                      if (var4_ref != null) {
                        this.field_k.a(-63, var4_ref);
                        continue L5;
                      } else {
                        L6: {
                          if (this.field_h != 0) {
                            try {
                              L7: {
                                this.field_l.field_i = 0;
                                this.field_l.a(4, -80);
                                this.field_l.a((int) this.field_h, -85);
                                this.field_l.b(0, -1);
                                this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_q.a(1);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_b = this.field_b + 1;
                                this.field_n = -2;
                                this.field_q = null;
                                break L8;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L11: {
                          this.field_e = 0;
                          this.field_j = ji.b(107);
                          if (param1 == 20) {
                            break L11;
                          } else {
                            field_s = (int[]) null;
                            break L11;
                          }
                        }
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

                stackIn_28_1 = new StringBuilder().append("a.G(");

                if (param0 == null) {
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
              throw dd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public a() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        kk.field_U[rc.field_d] = param0;
        bc.field_o[rc.field_d] = rc.field_d;
        tl.field_d[rc.field_d] = param3;
        if (!(param3 <= hc.field_j)) {
            jl.field_d = param3;
        }
        if (am.field_e > param3) {
            qh.field_a = param3;
        }
        vl.field_g[rc.field_d] = param5;
        th.field_f[rc.field_d] = param1;
        ld.field_b[rc.field_d] = param4;
        int var6 = param4 + (param5 - -param1);
        int var7 = -1 == (var6 ^ -1) ? 0 : 1000 * param5 / var6;
        rh.field_c[rc.field_d] = var7;
        if (param2 != 9664) {
            field_t = (int[]) null;
        }
        if (!(var7 <= jl.field_d)) {
            jl.field_d = var7;
        }
        rc.field_d = rc.field_d + 1;
        if (qh.field_a > var7) {
            qh.field_a = var7;
        }
    }

    static {
        field_v = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new int[8192];
        field_u = "Confirm Email:";
        field_s = new int[8192];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ih {
    static dh field_u;
    static String field_t;
    static jp[] field_s;
    private wh field_q;
    static String field_r;

    final static void a(int param0, ak param1, j param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jp var4 = null;
        jp var5 = null;
        int var6 = 0;
        jp[] var7 = null;
        jp var9 = null;
        jp var10 = null;
        try {
          L0: {
            if (oa.field_Sb == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = 256 * km.field_i / 32;
                var4 = oa.field_Sb.c((byte) -123);
                if (var4 == null) {
                  break L1;
                } else {
                  if (-1 == (km.field_i ^ -1)) {
                    var4.c(-var4.field_x + 640, 470 - var4.field_z);
                    break L1;
                  } else {
                    var4.b(-var4.field_x + 640, 470 - var4.field_z, 256 + -var3_int);
                    break L1;
                  }
                }
              }
              L2: {
                if (param0 == 640) {
                  break L2;
                } else {
                  field_r = (String) null;
                  break L2;
                }
              }
              L3: {
                if (-1 <= (km.field_i ^ -1)) {
                  break L3;
                } else {
                  if (ih.field_k != null) {
                    ih.field_k.b(640 + -ih.field_k.field_x, 480 + -ih.field_k.field_z - 10, var3_int);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var5 = nm.field_f[param2.field_y];
                if (var4 == null) {
                  break L4;
                } else {
                  var5.c(-3 + (640 + -((var4.field_x - -var5.field_x) / 2)), -var4.field_z + 480 + -10 + 45);
                  break L4;
                }
              }
              L5: {
                var6 = kb.a(param1, 0, 100, param2);
                var7 = oa.field_Sb.b(param0 ^ -746);
                if (var7 != null) {
                  var9 = var7[var6];
                  var9.c(-20 + (-var9.field_x + 640), 520 - var9.field_z);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (km.field_i <= 0) {
                    break L7;
                  } else {
                    if (null != fq.field_c) {
                      var10 = fq.field_c[var6];
                      var10.b(-var10.field_x + 620, 40 + (-var10.field_z + 480), var3_int);
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                break L6;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("a.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_q == null) {
              return;
            } else {
              var2 = 74 % ((param0 - 14) / 57);
              try {
                L0: {
                  this.field_m.field_l = 0;
                  this.field_m.a(44, 6);
                  this.field_m.a((byte) 47, 3);
                  this.field_m.b((byte) 125, 0);
                  this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_q.a((byte) 112);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_f = -2;
                  this.field_q = null;
                  this.field_i = this.field_i + 1;
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

    final boolean b(int param0) {
        try {
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_90_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            da var2 = null;
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
            da var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = BrickABrac.field_J ? 1 : 0;
              if (this.field_q != null) {
                L1: {
                  var2_long = ue.a(false);
                  var4 = (int)(var2_long - this.field_o);
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_o = var2_long;
                this.field_b = this.field_b + var4;
                if (this.field_b > 30000) {
                  try {
                    L2: {
                      this.field_q.a((byte) 120);
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
              if (0 != this.e((byte) -67)) {
                return false;
              } else {
                if (this.c((byte) -105) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_q.c(-1);
                  var2 = (da) ((Object) this.field_g.a(true));
                  L5: while (true) {
                    if (var2 == null) {
                      var2 = (da) ((Object) this.field_a.a(true));
                      L6: while (true) {
                        if (var2 == null) {
                          L7: {
                            if (param0 > 10) {
                              break L7;
                            } else {
                              a.h((byte) -19);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (100 <= var2_int) {
                                break L9;
                              } else {
                                var3_int = this.field_q.d(10434);
                                if (-1 >= (var3_int ^ -1)) {
                                  if (0 == var3_int) {
                                    break L9;
                                  } else {
                                    L10: {
                                      this.field_b = 0;
                                      var4 = 0;
                                      if (null == this.field_e) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (0 != this.field_e.field_K) {
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
                                          var5 = -this.field_e.field_F + this.field_e.field_D.field_k.length;
                                          var6 = 512 - this.field_e.field_K;
                                          if (var6 > var5 + -this.field_e.field_D.field_l) {
                                            var6 = var5 - this.field_e.field_D.field_l;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var3_int < var6) {
                                            var6 = var3_int;
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          this.field_q.a(25826, this.field_e.field_D.field_k, var6, this.field_e.field_D.field_l);
                                          if (this.field_h != 0) {
                                            var7 = 0;
                                            L15: while (true) {
                                              if (var7 >= var6) {
                                                break L14;
                                              } else {
                                                this.field_e.field_D.field_k[var7 + this.field_e.field_D.field_l] = (byte)pn.a((int) this.field_e.field_D.field_k[var7 + this.field_e.field_D.field_l], (int) this.field_h);
                                                var7++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        this.field_e.field_K = this.field_e.field_K + var6;
                                        this.field_e.field_D.field_l = this.field_e.field_D.field_l + var6;
                                        if (var5 != this.field_e.field_D.field_l) {
                                          if (this.field_e.field_K != 512) {
                                            break L11;
                                          } else {
                                            this.field_e.field_K = 0;
                                            break L11;
                                          }
                                        } else {
                                          this.field_e.d(3);
                                          this.field_e.field_u = false;
                                          this.field_e = null;
                                          break L11;
                                        }
                                      } else {
                                        L16: {
                                          var5 = var4 + -this.field_l.field_l;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          this.field_q.a(25826, this.field_l.field_k, var5, this.field_l.field_l);
                                          if (0 != this.field_h) {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var6 >= var5) {
                                                break L17;
                                              } else {
                                                this.field_l.field_k[this.field_l.field_l - -var6] = (byte)pn.a((int) this.field_l.field_k[this.field_l.field_l + var6], (int) this.field_h);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        this.field_l.field_l = this.field_l.field_l + var5;
                                        if (this.field_l.field_l >= var4) {
                                          if (null == this.field_e) {
                                            L19: {
                                              this.field_l.field_l = 0;
                                              var6 = this.field_l.l(255);
                                              var7 = this.field_l.e(255);
                                              var8 = this.field_l.l(255);
                                              var9 = this.field_l.e(255);
                                              var10 = var8 & 127;
                                              if (0 == (var8 & 128)) {
                                                stackIn_50_0 = 0;
                                                break L19;
                                              } else {
                                                stackIn_50_0 = 1;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_50_0;
                                              var12 = (long)var7 + ((long)var6 << 1273502368);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (da) ((Object) this.field_n.a(true));
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var14_ref.field_j != var12) {
                                                      var14_ref = (da) ((Object) this.field_n.e(-8394));
                                                      continue L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (da) ((Object) this.field_c.a(true));
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var12 != var14_ref.field_j) {
                                                      var14_ref = (da) ((Object) this.field_c.e(-8394));
                                                      continue L22;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L23: {
                                                if (-1 != (var10 ^ -1)) {
                                                  stackIn_66_0 = 9;
                                                  break L23;
                                                } else {
                                                  stackIn_66_0 = 5;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              this.field_e = var14_ref;
                                              this.field_e.field_D = new wq(var9 - -var15 - -this.field_e.field_F);
                                              this.field_e.field_D.a(-107, var10);
                                              this.field_e.field_D.a(var9, (byte) -79);
                                              this.field_e.field_K = 10;
                                              this.field_l.field_l = 0;
                                              break L11;
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            if (0 == this.field_e.field_K) {
                                              if ((this.field_l.field_k[0] ^ -1) == 0) {
                                                this.field_l.field_l = 0;
                                                this.field_e.field_K = 1;
                                                break L11;
                                              } else {
                                                this.field_e = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            stackIn_90_0 = 1;
                            break L4;
                          }
                        } else {
                          this.field_m.field_l = 0;
                          this.field_m.a(-128, 0);
                          this.field_m.a(var2.field_j, (byte) -32);
                          this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
                          this.field_c.a(var2, false);
                          var2 = (da) ((Object) this.field_a.e(-8394));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_m.field_l = 0;
                      this.field_m.a(-102, 1);
                      this.field_m.a(var2.field_j, (byte) -32);
                      this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
                      this.field_n.a(var2, false);
                      var2 = (da) ((Object) this.field_g.e(-8394));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_q.a((byte) 119);
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
                  this.field_f = -2;
                  this.field_q = null;
                  this.field_i = this.field_i + 1;
                  if (this.e((byte) -41) != 0) {
                    break L26;
                  } else {
                    if (0 != this.c((byte) 101)) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_90_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, mp param1, mp param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2.field_Sb - param1.field_Sb;
              if (rk.field_Tb != param2.field_Ub) {
                if (null == param2.field_Ub) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            if (param0 == 200) {
              L2: {
                if (rk.field_Tb == param1.field_Ub) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (param1.field_Ub != null) {
                    break L2;
                  } else {
                    var3_int -= 200;
                    break L2;
                  }
                }
              }
              L3: {
                if (-1 <= (var3_int ^ -1)) {
                  stackIn_16_0 = 0;
                  break L3;
                } else {
                  stackIn_16_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("a.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final void a(byte param0) {
        try {
            this.field_q.a((byte) 113);
        } catch (Exception exception) {
        }
        this.field_i = this.field_i + 1;
        if (param0 != 8) {
            return;
        }
        this.field_f = -1;
        this.field_q = null;
        this.field_h = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void h(byte param0) {
        field_r = null;
        if (param0 > -92) {
            a.h((byte) 64);
        }
        field_u = null;
        field_s = null;
        field_t = null;
    }

    final static void f(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = fi.field_w[0];
              if (param0 == 94) {
                break L1;
              } else {
                a.f((byte) 52);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (fi.field_w.length <= var2) {
                break L0;
              } else {
                var3 = fi.field_w[var2];
                pm.a(ek.field_jb, var2 << 1493467876, ek.field_jb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "a.F(" + param0 + ')');
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            da var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_q != null) {
                    try {
                      L2: {
                        this.field_q.a((byte) 114);
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
                L4: {
                  this.field_q = (wh) (param0);
                  this.g((byte) 116);
                  this.a(param1, false);
                  if (param2 == 12) {
                    break L4;
                  } else {
                    this.a((byte) -71);
                    break L4;
                  }
                }
                this.field_l.field_l = 0;
                this.field_e = null;
                L5: while (true) {
                  var4_ref = (da) ((Object) this.field_n.a(25609));
                  if (var4_ref == null) {
                    L6: while (true) {
                      var4_ref = (da) ((Object) this.field_c.a(param2 + 25597));
                      if (var4_ref == null) {
                        L7: {
                          if (this.field_h == 0) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_m.field_l = 0;
                                this.field_m.a(param2 + 50, 4);
                                this.field_m.a(40, (int) this.field_h);
                                this.field_m.a(0, (byte) -79);
                                this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_q.a((byte) 116);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_i = this.field_i + 1;
                                this.field_q = null;
                                this.field_f = -2;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_b = 0;
                        this.field_o = ue.a(false);
                        break L0;
                      } else {
                        this.field_a.a(var4_ref, false);
                        continue L6;
                      }
                    }
                  } else {
                    this.field_g.a(var4_ref, false);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_26_0 = (RuntimeException) (var4_ref3);

                stackIn_26_1 = new StringBuilder().append("a.E(");

                if (param0 == null) {
                  stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackIn_27_2 = "null";
                  break L12;
                } else {
                  stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackIn_27_2 = "{...}";
                  break L12;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (!(this.field_q == null)) {
            this.field_q.a((byte) 111);
        }
        if (param0 != 30) {
            this.g((byte) -72);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            wq stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            wq stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_q != null) {
              try {
                L0: {
                  this.field_m.field_l = 0;
                  if (!param1) {
                    L1: {
                      stackIn_6_0 = this.field_m;

                      stackIn_6_1 = 37;

                      if (!param0) {
                        stackIn_7_0 = (wq) ((Object) stackIn_6_0);
                        stackIn_7_1 = stackIn_6_1;
                        stackIn_7_2 = 3;
                        break L1;
                      } else {
                        stackIn_7_0 = (wq) ((Object) stackIn_6_0);
                        stackIn_7_1 = stackIn_6_1;
                        stackIn_7_2 = 2;
                        break L1;
                      }
                    }
                    ((wq) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                    this.field_m.a(0L, (byte) -32);
                    this.field_q.a(this.field_m.field_k, true, this.field_m.field_k.length, 0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.a((byte) 117);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_f = -2;
                  this.field_i = this.field_i + 1;
                  this.field_q = null;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
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

    public a() {
    }

    static {
        field_t = "Enter name of friend to add to list";
        field_r = "Music: ";
    }
}

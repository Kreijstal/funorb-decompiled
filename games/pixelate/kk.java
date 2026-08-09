/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private int field_d;
    int field_u;
    private int field_z;
    private int field_A;
    private int field_h;
    private int field_r;
    private int field_j;
    private hd field_B;
    private int field_o;
    private int field_n;
    int field_t;
    private int field_e;
    private bb field_q;
    private int field_v;
    private int field_x;
    private int[] field_m;
    private tf field_c;
    private int field_i;
    private int field_g;
    private int field_p;
    private int field_w;
    static int field_s;
    static bd field_b;
    static String field_l;
    static int field_y;
    private int field_f;
    static int field_k;
    static int field_a;

    final static void a(int param0, pm param1) {
        int var2_int = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        w.field_v = param1;
        io.a(qj.field_e, (byte) -108);
        jb.field_b = new bi[dn.field_a.length];
        if (param0 != 1) {
            return;
        }
        try {
            for (var2_int = 0; var2_int < dn.field_a.length; var2_int++) {
                jb.field_b[var2_int] = new bi(gh.field_w[var2_int], dn.field_a[var2_int], (var2_int ^ -1) == -6 ? true : false);
            }
            ql.field_m = -1;
            lb.field_D = 15;
            pl.field_S = 0;
            of.field_d = -1;
            le.field_j = 45;
            tn.field_i = -1;
            sd.field_N = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "kk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        tk var7;
        var6 = Pixelate.field_H ? 1 : 0;
        var7 = (tk) ((Object) this.field_q.c(1504642273));
        L0: while (true) {
          if (var7 == null) {
            L1: {
              if (param0 < -18) {
                break L1;
              } else {
                this.a(-66, 3, -15, (byte) 3, 14);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (var2 >= -1 + this.field_j) {
                L3: {
                  if ((this.field_z ^ -1) >= -1) {
                    break L3;
                  } else {
                    fieldTemp$0 = this.field_z;
                    this.field_z = this.field_z + 1;
                    if ((fieldTemp$0 ^ -1) >= -31) {
                      break L3;
                    } else {
                      this.field_z = 0;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 < this.field_i) {
                    fieldTemp$1 = this.field_i;
                    this.field_i = this.field_i + 1;
                    if (this.field_n <= fieldTemp$1) {
                      this.field_i = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (this.field_i != 0) {
                    break L5;
                  } else {
                    if ((this.field_v ^ -1) >= -1) {
                      break L5;
                    } else {
                      if (this.field_r == 0) {
                        L6: {
                          if (this.field_v == 2) {
                            mc.a(131, -125);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        fieldTemp$2 = this.field_v;
                        this.field_v = this.field_v + 1;
                        if (fieldTemp$2 >= this.field_w) {
                          this.field_v = 0;
                          break L5;
                        } else {
                          this.e(2);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L7: {
                  if (-1 != (this.field_i ^ -1)) {
                    break L7;
                  } else {
                    if (0 < this.field_r) {
                      fieldTemp$3 = this.field_r;
                      this.field_r = this.field_r + 1;
                      if (-31 > (fieldTemp$3 ^ -1)) {
                        this.field_r = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                return;
              } else {
                var3 = 1;
                L8: while (true) {
                  if (var3 >= -1 + this.field_h) {
                    var2++;
                    continue L2;
                  } else {
                    var4 = var3 + var2 * this.field_h;
                    var5 = this.field_m[var4];
                    if (-1 > (var5 ^ -1)) {
                      if ((var5 ^ -1) > -49) {
                        this.field_m[var4] = this.field_m[var4] + 2;
                        var3++;
                        continue L8;
                      } else {
                        this.field_m[var4] = 48;
                        var3++;
                        continue L8;
                      }
                    } else {
                      var3++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            var7.e(-123);
            var7 = (tk) ((Object) this.field_q.f(1504642273));
            continue L0;
          }
        }
    }

    final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var6;
        int var5;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 == -16) {
          var2 = this.field_B.field_h;
          L0: while (true) {
            if (var2 >= this.field_B.field_h + 2) {
              return;
            } else {
              var3 = this.field_B.field_e;
              L1: while (true) {
                if (var3 >= this.field_B.field_e + 2) {
                  var2++;
                  continue L0;
                } else {
                  var4 = var3 + this.field_h * var2;
                  this.field_m[var4] = 1;
                  if ((this.field_B.field_r[var4] & 4 ^ -1) != -1) {
                    var5 = -1 + (3 & this.field_B.field_r[var4]);
                    this.field_q.a(22125, new tk(16 + (this.field_t - -(var3 * 32)), var2 * 32 + (this.field_u - -16), var5, 0));
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        this.field_i = param0;
        this.field_z = param2;
        if (param3 >= -59) {
            this.field_j = -51;
        }
        this.field_v = param1;
        this.field_r = param4;
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = 1;
        L0: while (true) {
          if (-1 + this.field_j <= var2) {
            if (param0 > 41) {
              this.field_c.c();
              t.d();
              this.a(-20, 0, 0);
              qa.field_f.a(19692);
              var2 = 1;
              L1: while (true) {
                if (-1 + this.field_h <= var2) {
                  this.field_i = 1;
                  this.field_n = this.field_h * 6;
                  this.field_v = 1;
                  return;
                } else {
                  var6 = 1;
                  var3 = var6;
                  L2: while (true) {
                    if (this.field_j + -1 <= var6) {
                      var2++;
                      continue L1;
                    } else {
                      var4 = this.field_B.field_r[this.field_h * var6 + var2];
                      if (0 != (4 & var4)) {
                        this.field_q.a(22125, new tk(32 * var2 + (16 + this.field_t), 32 * var6 + (16 + this.field_u), -1 + (3 & var4), var2 * 6 + -6));
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var3 = 1;
            L3: while (true) {
              if (var3 >= this.field_h - 1) {
                var2++;
                continue L0;
              } else {
                this.field_m[var3 + this.field_h * var2] = 48;
                var3++;
                continue L3;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != 6) {
            field_y = 31;
        }
        return (this.field_i ^ -1) == -1 ? true : false;
    }

    final static ld a(fm param0, String param1, int param2, String param3, fm param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ld stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_k = -40;
                break L1;
              }
            }
            var5_int = param0.a(param2 + 123, param1);
            var6 = param0.a((byte) -112, param3, var5_int);
            stackIn_3_0 = lh.a(param0, var5_int, 48077700, param4, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("kk.O(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = Pixelate.field_H ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_j) {
            L1: {
              if (param0 == -20) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (this.field_h <= var5) {
                var4++;
                continue L0;
              } else {
                var6 = this.field_B.field_r[var5 + var4 * this.field_h];
                var7 = var6 & 3;
                if (-1 != var6) {
                  if (var7 != 0) {
                    L3: {
                      if (-1 != (var5 ^ -1)) {
                        if (-1 != (var4 ^ -1)) {
                          if (var5 != -1 + this.field_h) {
                            if (var4 == this.field_j + -1) {
                              stackIn_18_0 = 1;
                              break L3;
                            } else {
                              stackIn_18_0 = 0;
                              break L3;
                            }
                          } else {
                            stackIn_18_0 = 1;
                            break L3;
                          }
                        } else {
                          stackIn_18_0 = 1;
                          break L3;
                        }
                      } else {
                        stackIn_18_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_18_0;
                      if ((var6 & 4) == 0) {
                        stackIn_21_0 = 0;
                        break L4;
                      } else {
                        stackIn_21_0 = 1;
                        break L4;
                      }
                    }
                    var9 = stackIn_21_0;
                    var10 = var5 * 32 + param2;
                    var11 = var4 * 32 + param1;
                    if (var7 != 0) {
                      L5: {
                        if (fq.field_o == null) {
                          stackIn_26_0 = 0;
                          break L5;
                        } else {
                          stackIn_26_0 = fo.field_t;
                          break L5;
                        }
                      }
                      L6: {
                        var12 = stackIn_26_0;
                        if (var12 == 0) {
                          rg.field_e.field_k[var7 + -1].f(var10, var11);
                          break L6;
                        } else {
                          if ((var12 ^ -1) != -257) {
                            rg.field_e.field_k[-1 + var7].f(var10, var11);
                            fq.field_o.field_k[var7 + -1].a(var10, var11, var12);
                            break L6;
                          } else {
                            fq.field_o.field_k[var7 + -1].f(var10, var11);
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        var13 = this.field_m[var4 * this.field_h - -var5];
                        if (var9 == 0) {
                          t.a(var10, var11, 32, 32, 0, 64 + var13);
                          var5++;
                          continue L2;
                        } else {
                          if ((var13 ^ -1) > -49) {
                            t.a(var10, var11, 32, 32, 0, -var13 + 48);
                            var5++;
                            continue L2;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 < -103) {
            break L0;
          } else {
            this.field_u = -108;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 < this.field_z) {
              break L2;
            } else {
              if (0 < this.field_r) {
                break L2;
              } else {
                if ((this.field_v ^ -1) < -1) {
                  break L2;
                } else {
                  if ((this.field_i ^ -1) >= -1) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            kk.b(true);
        }
        field_l = null;
        field_b = null;
    }

    final void a(boolean param0) {
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        Object var16;
        tk var17;
        L0: {
          var16 = null;
          var15 = Pixelate.field_H ? 1 : 0;
          var2 = this.field_t;
          var3 = this.field_u;
          if (this.field_z <= 0) {
            if (-1 > (this.field_r ^ -1)) {
              var4 = this.field_r;
              var4 = var4 * (var4 * 480) / 900;
              var3 = var3 - var4;
              break L0;
            } else {
              break L0;
            }
          } else {
            var4 = 30 + -this.field_z;
            var4 = var4 * (var4 * 480) / 900;
            var3 = var3 + var4;
            break L0;
          }
        }
        var4 = -this.field_f + this.field_h;
        var5 = -this.field_e + this.field_j;
        var6 = this.field_p;
        L1: while (true) {
          if (var5 < var6) {
            var6 = this.field_g;
            L2: while (true) {
              if (var4 < var6) {
                L3: {
                  if (this.c(-108)) {
                    L4: {
                      t.a(f.field_d);
                      if (-1 != (this.field_i ^ -1)) {
                        break L4;
                      } else {
                        if (-1 > (this.field_v ^ -1)) {
                          t.f(-4 + (this.field_A + this.field_t), this.field_u - -this.field_x - 4, 640, 480);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_c.b(var2, var3);
                    t.b(f.field_d);
                    break L3;
                  } else {
                    this.a(-20, var3, var2);
                    break L3;
                  }
                }
                var6 = 0;
                L5: while (true) {
                  if (var6 >= this.field_j) {
                    L6: {
                      if (!param0) {
                        break L6;
                      } else {
                        this.field_h = 38;
                        break L6;
                      }
                    }
                    var17 = (tk) ((Object) this.field_q.c(1504642273));
                    L7: while (true) {
                      if (var17 == null) {
                        L8: {
                          if (0 >= this.field_v) {
                            break L8;
                          } else {
                            if (-1 != (this.field_i ^ -1)) {
                              break L8;
                            } else {
                              if (0 == this.field_r) {
                                t.a(f.field_d);
                                t.f(var2 + this.field_g * 32, this.field_p * 32 + var3, (this.field_h - this.field_f) * 32 + var2, var3 + 32 * (-this.field_e + this.field_j));
                                var6 = 0;
                                L9: while (true) {
                                  if (20 <= var6) {
                                    t.b(f.field_d);
                                    break L8;
                                  } else {
                                    fi.a(this.field_g * 32 + (this.field_t - (-this.field_A + -(var6 * 2) + 40)), -20 + var3, this.field_A + 32 * this.field_g + this.field_t + -(2 * (-var6 + 20)), this.field_j * 32 + var3 - -20, 4, var6 * 3, sd.field_Q);
                                    fi.a(var2 - 20, -(2 * (-var6 + 20)) + this.field_x + (this.field_u - -(this.field_p * 32)), this.field_h * 32 + (var2 + 20), var6 * 2 - 40 + (this.field_p * 32 + this.field_u) - -this.field_x, 4, 3 * var6, sd.field_Q);
                                    var6 += 3;
                                    continue L9;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        var17.a((byte) -127);
                        var17 = (tk) ((Object) this.field_q.f(1504642273));
                        continue L7;
                      }
                    }
                  } else {
                    var7 = 0;
                    L10: while (true) {
                      if (var7 >= this.field_h) {
                        var6++;
                        continue L5;
                      } else {
                        var8 = this.field_B.field_r[this.field_h * var6 + var7];
                        if (var8 != -1) {
                          L11: {
                            if (var7 != 0) {
                              if (-1 != (var6 ^ -1)) {
                                if (-1 + this.field_h != var7) {
                                  if (-1 + this.field_j == var6) {
                                    stackIn_34_0 = 1;
                                    break L11;
                                  } else {
                                    stackIn_34_0 = 0;
                                    break L11;
                                  }
                                } else {
                                  stackIn_34_0 = 1;
                                  break L11;
                                }
                              } else {
                                stackIn_34_0 = 1;
                                break L11;
                              }
                            } else {
                              stackIn_34_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            var9 = stackIn_34_0;
                            if ((3 & var8) == 0) {
                              if (jc.field_d) {
                                stackIn_40_0 = 1;
                                break L12;
                              } else {
                                stackIn_40_0 = 0;
                                break L12;
                              }
                            } else {
                              stackIn_40_0 = 0;
                              break L12;
                            }
                          }
                          L13: {
                            var10 = stackIn_40_0;
                            var11 = var7 * 32 + var2;
                            var12 = var3 + var6 * 32;
                            var13 = 33;
                            if (var9 == 0) {
                              if (var10 == 0) {
                                break L13;
                              } else {
                                fi.a(var11, var12, var13, var13, 16777215, 40);
                                break L13;
                              }
                            } else {
                              t.a(var11, var12, var13, var13, 0, 192);
                              break L13;
                            }
                          }
                          L14: {
                            if (var9 != 0) {
                              stackIn_47_0 = 16777215;
                              break L14;
                            } else {
                              stackIn_47_0 = 11184810;
                              break L14;
                            }
                          }
                          var14 = stackIn_47_0;
                          t.e(var11 - -1, var12 + 1, -1 + var13, var14, 100);
                          t.f(var11 - -1, 2 + var12, -2 + var13, var14, 100);
                          t.a(var11, var12, var13, var13, 0);
                          var7++;
                          continue L10;
                        } else {
                          var7++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                t.h(var2 + 32 * var6, this.field_p * 32 + -16 + var3, var2 - -(var6 * 32), 32 * var5 + var3 - -16, 0, 100);
                var6++;
                continue L2;
              }
            }
          } else {
            t.h(32 * this.field_g + var2 - 16, var3 + 32 * var6, 16 + (var4 * 32 + var2), var3 + var6 * 32, 0, 100);
            var6++;
            continue L1;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != -61) {
            field_y = -99;
        }
        l.b(19854, param1);
        jk.a(param1, (byte) 83);
    }

    final void a(byte param0) {
        this.field_v = 0;
        if (param0 != 71) {
            return;
        }
        this.field_r = 1;
    }

    private final void e(int param0) {
        this.field_A = -4 - -(this.field_d * this.field_v / this.field_w);
        this.field_x = this.field_o * this.field_v / this.field_w + -4;
        if (param0 != 2) {
            this.a((byte) 112);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              t.b(param0, param2, param3 + 1, 10000536);
              t.b(param0, param1 + param2, 1 + param3, 12105912);
              var5_int = 1;
              if (param2 + var5_int < t.field_f) {
                var5_int = t.field_f + -param2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param1;
              if (param4 == -51) {
                break L2;
              } else {
                field_s = -43;
                break L2;
              }
            }
            L3: {
              if (t.field_a >= param2 - -var6) {
                break L3;
              } else {
                var6 = t.field_a + -param2;
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 + var7 * 48 / param1;
                var9 = var8 | (var8 << -1040429304 | var8 << 197771184);
                t.field_k[t.field_j * (param2 + var7) + param0] = var9;
                t.field_k[param0 + (param2 + var7) * t.field_j + param3] = var9;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "kk.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kk(hd param0, int param1, int param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        this.field_r = 0;
        this.field_v = 0;
        this.field_i = 0;
        try {
          L0: {
            L1: {
              this.field_B = param0;
              this.field_m = new int[this.field_B.field_r.length];
              this.field_t = -(32 * this.field_B.field_i >> 1013697409) + param1;
              this.field_u = param2 - (this.field_B.field_a * 32 >> -1796777183);
              this.field_j = this.field_B.field_a;
              this.field_h = this.field_B.field_i;
              this.field_q = new bb();
              this.field_c = new tf(this.field_h * 32, 32 * this.field_j);
              this.field_z = 1;
              var4_int = this.field_B.b((byte) -60);
              stackIn_3_0 = this;

              if ((2 & var4_int) == 0) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((kk) (this)).field_g = stackIn_4_1;
              stackIn_6_0 = this;

              if (0 != (var4_int & 4)) {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              }
            }
            L3: {
              ((kk) (this)).field_p = stackIn_7_1;
              stackIn_9_0 = this;

              if (-1 == (var4_int & 16 ^ -1)) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((kk) (this)).field_e = stackIn_10_1;
              stackIn_12_0 = this;

              if ((var4_int & 8) != 0) {
                stackIn_13_0 = this;
                stackIn_13_1 = 1;
                break L4;
              } else {
                stackIn_13_0 = this;
                stackIn_13_1 = 0;
                break L4;
              }
            }
            L5: {
              ((kk) (this)).field_f = stackIn_13_1;
              this.field_t = this.field_t + 16 * (-this.field_g + this.field_f);
              this.field_o = 44 + 32 * (this.field_j - this.field_p + -this.field_e);
              this.field_d = 4 + (40 + (this.field_h + -this.field_g - this.field_f) * 32);
              this.field_u = this.field_u + (-this.field_p + this.field_e) * 16;
              stackIn_15_0 = this;

              if (this.field_d <= this.field_o) {
                stackIn_16_0 = this;
                stackIn_16_1 = this.field_o;
                break L5;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = this.field_d;
                break L5;
              }
            }
            ((kk) (this)).field_w = stackIn_16_1 / 6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("kk.<init>(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new bd();
        field_l = "achievements to collect";
        field_y = 2;
        field_k = 0;
    }
}

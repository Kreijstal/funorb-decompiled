/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends sp {
    private boolean field_w;
    private wj field_n;
    private boolean field_x;
    private wj field_r;
    private int[] field_z;
    private rj field_s;
    private rj field_v;
    static vo field_m;
    static long field_p;
    private int[] field_q;
    private wj field_l;
    private int field_o;
    private int field_u;
    private rj field_t;
    private int field_y;
    private int field_A;

    final synchronized void a(int param0, boolean param1, int param2, int param3, int param4, wj param5) {
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_29_0 = 0;
        rj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        wj stackIn_40_2 = null;
        rj stackIn_41_0;
        int stackIn_41_1;
        wj stackIn_41_2;
        int stackIn_41_3;
        rj stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        wj stackIn_49_2 = null;
        rj stackIn_50_0;
        int stackIn_50_1;
        wj stackIn_50_2;
        int stackIn_50_3;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (!this.field_x) {
                break L1;
              } else {
                if (!param1) {
                  break L1;
                } else {
                  L2: {
                    if (-1 <= (this.field_A ^ -1)) {
                      L3: {
                        if (null == this.field_r) {
                          break L3;
                        } else {
                          this.field_t.c(28013);
                          break L3;
                        }
                      }
                      this.field_r = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        this.field_t.a((byte) -22, param5, false);
                        this.a(param2, param3, this.field_t, -1);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_l == null) {
                          break L4;
                        } else {
                          this.field_v.c(28013);
                          break L4;
                        }
                      }
                      this.field_l = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        this.field_v.a((byte) -22, param5, false);
                        this.a(param2, param3, this.field_v, -1);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              stackIn_15_0 = this;

              if (!param1) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L5;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L5;
              }
            }
            ((tp) (this)).field_x = stackIn_16_1 != 0;
            if (param5 != this.field_l) {
              if (param5 != this.field_r) {
                if (param4 < -46) {
                  L6: {
                    if (this.field_l == null) {
                      var7_int = 1;
                      break L6;
                    } else {
                      if (null == this.field_r) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if (-524289 >= (this.field_u ^ -1)) {
                            stackIn_29_0 = 0;
                            break L7;
                          } else {
                            stackIn_29_0 = 1;
                            break L7;
                          }
                        }
                        var7_int = stackIn_29_0;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (var7_int != 0) {
                      L9: {
                        if (this.field_l != null) {
                          this.field_v.c(28013);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        this.field_l = param5;
                        if (param5 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackIn_49_0 = this.field_v;

                            stackIn_49_1 = -22;

                            stackIn_49_2 = (wj) (param5);

                            if (param1) {
                              stackIn_50_0 = (rj) ((Object) stackIn_49_0);
                              stackIn_50_1 = stackIn_49_1;
                              stackIn_50_2 = (wj) ((Object) stackIn_49_2);
                              stackIn_50_3 = 0;
                              break L11;
                            } else {
                              stackIn_50_0 = (rj) ((Object) stackIn_49_0);
                              stackIn_50_1 = stackIn_49_1;
                              stackIn_50_2 = (wj) ((Object) stackIn_49_2);
                              stackIn_50_3 = 1;
                              break L11;
                            }
                          }
                          ((rj) (Object) stackIn_50_0).a((byte) stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0);
                          this.a(param2, param3, this.field_v, -1);
                          break L10;
                        }
                      }
                      this.field_A = param0;
                      break L8;
                    } else {
                      L12: {
                        if (this.field_r != null) {
                          this.field_t.c(28013);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        this.field_r = param5;
                        if (param5 != null) {
                          L14: {
                            stackIn_40_0 = this.field_t;

                            stackIn_40_1 = -22;

                            stackIn_40_2 = (wj) (param5);

                            if (param1) {
                              stackIn_41_0 = (rj) ((Object) stackIn_40_0);
                              stackIn_41_1 = stackIn_40_1;
                              stackIn_41_2 = (wj) ((Object) stackIn_40_2);
                              stackIn_41_3 = 0;
                              break L14;
                            } else {
                              stackIn_41_0 = (rj) ((Object) stackIn_40_0);
                              stackIn_41_1 = stackIn_40_1;
                              stackIn_41_2 = (wj) ((Object) stackIn_40_2);
                              stackIn_41_3 = 1;
                              break L14;
                            }
                          }
                          ((rj) (Object) stackIn_41_0).a((byte) stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0);
                          this.a(param2, param3, this.field_t, -1);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      this.field_A = -param0;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                this.field_A = -param0;
                this.a(param2, param3, this.field_t, -1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_A = param0;
              this.a(param2, param3, this.field_v, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var7);

            stackIn_55_1 = new StringBuilder().append("tp.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L15;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L15;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            if (-1 <= (this.field_y ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_x) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_A <= 0) {
                      break L2;
                    } else {
                      if (this.field_v.c((byte) -34)) {
                        break L2;
                      } else {
                        this.field_l = null;
                        this.field_A = -this.field_A;
                        this.field_x = false;
                        break L1;
                      }
                    }
                  }
                  if ((this.field_A ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (!this.field_t.c((byte) -34)) {
                      this.field_r = null;
                      this.field_A = -this.field_A;
                      this.field_x = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = this.field_y * (this.field_u >> -1456846036) / 256;
                var5 = this.field_y + -var4_int;
                if (-1 == (this.field_A ^ -1)) {
                  break L3;
                } else {
                  this.field_u = this.field_u + param2 * this.field_A;
                  if (-1048577 >= (this.field_u ^ -1)) {
                    this.field_u = 1048576;
                    if (!this.field_x) {
                      this.field_A = 0;
                      if (!this.field_w) {
                        L4: {
                          if (null != this.field_r) {
                            this.field_t.c(28013);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_r = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (-1 > (this.field_u ^ -1)) {
                      break L3;
                    } else {
                      this.field_u = 0;
                      if (!this.field_x) {
                        this.field_A = 0;
                        if (this.field_w) {
                          break L3;
                        } else {
                          L5: {
                            if (this.field_l == null) {
                              break L5;
                            } else {
                              this.field_v.c(28013);
                              break L5;
                            }
                          }
                          this.field_l = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (qf.field_l) {
                  stackIn_33_0 = param2 << 1513838049;
                  break L6;
                } else {
                  stackIn_33_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (-257 < (this.field_o ^ -1)) {
                  L8: {
                    if (this.field_l != null) {
                      break L8;
                    } else {
                      if (this.field_r == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if ((var4_int ^ -1) == -257) {
                    this.field_v.a(param0, param1, param2);
                    break L7;
                  } else {
                    if ((var5 ^ -1) != -257) {
                      L9: {
                        L10: {
                          if (this.field_z == null) {
                            break L10;
                          } else {
                            if (var6 <= this.field_z.length) {
                              gp.a(this.field_z, 0, var6);
                              gp.a(this.field_q, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_z = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_v.a(this.field_z, 0, param2);
                        this.field_t.a(this.field_q, 0, param2);
                        if (qf.field_l) {
                          param1 = param1 << 1;
                          stackIn_49_0 = param1 << 1;
                          break L11;
                        } else {
                          stackIn_49_0 = param1;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (this.field_q[var8] * var5 + var4_int * this.field_z[var8] >> -1076011224);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_t.a(param0, param1, param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null == this.field_n) {
                  break L13;
                } else {
                  if (this.field_o != 0) {
                    L14: {
                      L15: {
                        if (null == this.field_z) {
                          break L15;
                        } else {
                          if (var6 <= this.field_z.length) {
                            gp.a(this.field_z, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_z = new int[var6];
                      this.field_q = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_s.a(this.field_z, 0, param2);
                      if (qf.field_l) {
                        param1 = param1 << 1;
                        stackIn_64_0 = param1 << 1;
                        break L16;
                      } else {
                        stackIn_64_0 = param1;
                        break L16;
                      }
                    }
                    var7 = stackIn_64_0;
                    var8 = this.field_o * this.field_y / 256;
                    var9 = -var8 + this.field_y;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var10 + var7] = param0[var7 - -var10] * var9 - -(var8 * this.field_z[var10]) >> 832242696;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var4);

            stackIn_70_1 = new StringBuilder().append("tp.J(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L18;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L18;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, dj param1) {
        mb var2 = null;
        if (param0 <= 120) {
            return;
        }
        try {
            mb.a(param1.a("", -121, "headers.packvorbis"));
            var2 = mb.a(param1, "jagex logo2.packvorbis", "");
            var2.b();
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "tp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final sp c() {
        return null;
    }

    final static ji c(byte param0) {
        if (param0 != 0) {
            field_p = -26L;
        }
        return new ji(ra.e((byte) -16), df.a(1));
    }

    final static fn b(byte param0, int param1) {
        if (4 <= rm.field_e.d(-56)) {
            return null;
        }
        if (param0 < 20) {
            field_m = (vo) null;
        }
        tm var2 = new tm(param1);
        rm.field_e.a(0, var2);
        return var2.field_j;
    }

    private final void a(int param0, int param1, rj param2, int param3) {
        try {
            param2.a(param0, true, param3);
            param2.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "tp.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static vf c(int param0) {
        if (!(null != jo.field_Ob)) {
            jo.field_Ob = new vf(ii.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, ii.field_a.field_I, -1, 2147483647, true);
        }
        int var1 = -78 / ((param0 - 59) / 48);
        return jo.field_Ob;
    }

    final static void a(int param0, boolean param1, wj param2) {
        try {
            i.a(256, param1, (byte) -115, param2);
            int var3_int = -119 / ((-38 - param0) / 47);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "tp.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final static void a(vn[] param0, int param1) {
        try {
            si.field_Ub = new vn[7];
            vh.field_e = new vn[7];
            pl.field_p = new vn(300, 200);
            si.field_Ub[0] = param0[0];
            vh.field_e[0] = new vn(param0[0].field_w - -20, param0[0].field_t - param1);
            si.field_Ub[1] = param0[1];
            vh.field_e[1] = new vn(10 + param0[1].field_w, 10 + param0[1].field_t);
            si.field_Ub[2] = new vn(150, 100);
            vh.field_e[2] = new vn(150, 100);
            si.field_Ub[3] = new vn(120, 50);
            vh.field_e[3] = new vn(120, 50);
            si.field_Ub[4] = new vn(300, 50);
            vh.field_e[4] = new vn(300, 50);
            si.field_Ub[5] = new vn(200, 90);
            vh.field_e[5] = new vn(200, 90);
            si.field_Ub[6] = new vn(200, 50);
            vh.field_e[6] = new vn(200, 50);
            vh.field_e[0].a();
            si.field_Ub[0].h(5, 5, 16777215);
            oc.a((byte) 70);
            si.field_Ub[0].h(5, 5, 0);
            vh.field_e[1].a();
            si.field_Ub[1].h(-35, 5, 16777215);
            so.a(16777215);
            oc.a((byte) -115);
            si.field_Ub[1].h(-35, 5, 0);
            cn.field_f.b(89);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "tp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final sp d() {
        return null;
    }

    final synchronized void a(byte param0, int param1) {
        this.field_y = param1;
        if (param0 != 122) {
            this.field_y = -6;
        }
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = ZombieDawn.field_J;
          if (0 < this.field_u) {
            if (this.field_l != null) {
              this.field_v.a(param0);
              if (1048576 > this.field_u) {
                if (this.field_r != null) {
                  this.field_t.a(param0);
                  if (0 >= this.field_o) {
                    break L0;
                  } else {
                    if (null == this.field_n) {
                      break L0;
                    } else {
                      this.field_s.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_o) {
                    break L0;
                  } else {
                    if (null == this.field_n) {
                      break L0;
                    } else {
                      this.field_s.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_o) {
                  break L0;
                } else {
                  if (null == this.field_n) {
                    break L0;
                  } else {
                    this.field_s.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (1048576 > this.field_u) {
                if (this.field_r != null) {
                  this.field_t.a(param0);
                  if (0 >= this.field_o) {
                    break L0;
                  } else {
                    if (null == this.field_n) {
                      break L0;
                    } else {
                      this.field_s.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= this.field_o) {
                    break L0;
                  } else {
                    if (null == this.field_n) {
                      break L0;
                    } else {
                      this.field_s.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= this.field_o) {
                  break L0;
                } else {
                  if (null == this.field_n) {
                    break L0;
                  } else {
                    this.field_s.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (1048576 <= this.field_u) {
              if (0 >= this.field_o) {
                break L0;
              } else {
                if (null != this.field_n) {
                  this.field_s.a(param0);
                  break L0;
                } else {
                  if (0 >= this.field_o) {
                    break L0;
                  } else {
                    if (null == this.field_n) {
                      break L0;
                    } else {
                      this.field_s.a(param0);
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (0 >= this.field_o) {
                break L0;
              } else {
                if (null == this.field_n) {
                  break L0;
                } else {
                  this.field_s.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (!this.field_x) {
            break L1;
          } else {
            L2: {
              if (0 >= this.field_A) {
                break L2;
              } else {
                if (this.field_v.c((byte) -34)) {
                  break L2;
                } else {
                  this.field_l = null;
                  this.field_x = false;
                  this.field_A = -this.field_A;
                  break L1;
                }
              }
            }
            if ((this.field_A ^ -1) <= -1) {
              break L1;
            } else {
              if (!this.field_t.c((byte) -34)) {
                this.field_x = false;
                this.field_A = -this.field_A;
                this.field_r = null;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (-1 != (this.field_A ^ -1)) {
            this.field_u = this.field_u + this.field_A * param0;
            if (1048576 <= this.field_u) {
              this.field_u = 1048576;
              if (!this.field_x) {
                this.field_A = 0;
                if (!this.field_w) {
                  L4: {
                    if (null == this.field_r) {
                      break L4;
                    } else {
                      this.field_t.c(28013);
                      break L4;
                    }
                  }
                  this.field_r = null;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (-1 > (this.field_u ^ -1)) {
                break L3;
              } else {
                this.field_u = 0;
                if (this.field_x) {
                  break L3;
                } else {
                  this.field_A = 0;
                  if (!this.field_w) {
                    L5: {
                      if (this.field_l == null) {
                        break L5;
                      } else {
                        this.field_v.c(28013);
                        break L5;
                      }
                    }
                    this.field_l = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
          } else {
            break L3;
          }
        }
    }

    private tp() throws Throwable {
        throw new Error();
    }

    static {
    }
}

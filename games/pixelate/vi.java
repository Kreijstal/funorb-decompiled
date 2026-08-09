/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends sj {
    static long field_F;
    static String field_y;
    private int[] field_v;
    private int[] field_B;
    private ua field_q;
    static uo field_p;
    private boolean field_r;
    private ti field_t;
    private ua field_A;
    private boolean field_w;
    static byte[] field_K;
    ti field_x;
    private int field_I;
    static String field_E;
    static String field_s;
    static String field_J;
    private int field_z;
    private ua field_G;
    private int field_u;
    static pc field_o;
    private int field_D;
    static String field_L;
    ti field_H;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            gj.a("", param0, true);
            if (param1 != 22770) {
                vi.b((byte) -76);
            }
            vf.a(param0, param1 ^ 21565);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, ua param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        ti stackIn_41_0 = null;
        ua stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        ti stackIn_42_0;
        ua stackIn_42_1;
        int stackIn_42_2;
        int stackIn_42_3;
        ti stackIn_50_0 = null;
        ua stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        ti stackIn_51_0;
        ua stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_r) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if ((this.field_u ^ -1) < -1) {
                      L3: {
                        if (null != this.field_q) {
                          this.field_x.g(-84);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_q = param4;
                      if (param4 != null) {
                        this.field_x.a(param4, -39, false);
                        this.a(-24762, param5, param0, this.field_x);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_A == null) {
                          break L4;
                        } else {
                          this.field_H.g(-29);
                          break L4;
                        }
                      }
                      this.field_A = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        this.field_H.a(param4, -39, false);
                        this.a(-24762, param5, param0, this.field_H);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackIn_18_0 = this;

              if (!param1) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L5;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L5;
              }
            }
            ((vi) (this)).field_r = stackIn_19_1 != 0;
            if (param4 == this.field_q) {
              this.field_u = param2;
              this.a(-24762, param5, param0, this.field_x);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_A != param4) {
                L6: {
                  if (param3 >= 110) {
                    break L6;
                  } else {
                    this.field_B = (int[]) null;
                    break L6;
                  }
                }
                L7: {
                  if (this.field_q != null) {
                    if (null != this.field_A) {
                      L8: {
                        if (-524289 >= (this.field_z ^ -1)) {
                          stackIn_34_0 = 0;
                          break L8;
                        } else {
                          stackIn_34_0 = 1;
                          break L8;
                        }
                      }
                      var7_int = stackIn_34_0;
                      break L7;
                    } else {
                      var7_int = 0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (null != this.field_A) {
                        this.field_H.g(-8);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_A = param4;
                      if (param4 == null) {
                        break L11;
                      } else {
                        L12: {
                          stackIn_50_0 = this.field_H;

                          stackIn_50_1 = (ua) (param4);

                          stackIn_50_2 = -39;

                          if (param1) {
                            stackIn_51_0 = (ti) ((Object) stackIn_50_0);
                            stackIn_51_1 = (ua) ((Object) stackIn_50_1);
                            stackIn_51_2 = stackIn_50_2;
                            stackIn_51_3 = 0;
                            break L12;
                          } else {
                            stackIn_51_0 = (ti) ((Object) stackIn_50_0);
                            stackIn_51_1 = (ua) ((Object) stackIn_50_1);
                            stackIn_51_2 = stackIn_50_2;
                            stackIn_51_3 = 1;
                            break L12;
                          }
                        }
                        ((ti) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, stackIn_51_3 != 0);
                        this.a(-24762, param5, param0, this.field_H);
                        break L11;
                      }
                    }
                    this.field_u = -param2;
                    break L9;
                  } else {
                    L13: {
                      if (null == this.field_q) {
                        break L13;
                      } else {
                        this.field_x.g(127);
                        break L13;
                      }
                    }
                    L14: {
                      this.field_q = param4;
                      if (param4 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackIn_41_0 = this.field_x;

                          stackIn_41_1 = (ua) (param4);

                          stackIn_41_2 = -39;

                          if (param1) {
                            stackIn_42_0 = (ti) ((Object) stackIn_41_0);
                            stackIn_42_1 = (ua) ((Object) stackIn_41_1);
                            stackIn_42_2 = stackIn_41_2;
                            stackIn_42_3 = 0;
                            break L15;
                          } else {
                            stackIn_42_0 = (ti) ((Object) stackIn_41_0);
                            stackIn_42_1 = (ua) ((Object) stackIn_41_1);
                            stackIn_42_2 = stackIn_41_2;
                            stackIn_42_3 = 1;
                            break L15;
                          }
                        }
                        ((ti) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3 != 0);
                        this.a(-24762, param5, param0, this.field_x);
                        break L14;
                      }
                    }
                    this.field_u = param2;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_u = -param2;
                this.a(-24762, param5, param0, this.field_H);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("vi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L16;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L16;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    final synchronized int a() {
        return 2;
    }

    final static int b(byte param0) {
        if (param0 < 118) {
            return -17;
        }
        return um.field_r;
    }

    final sj b() {
        return null;
    }

    private final void a(int param0, int param1, int param2, ti param3) {
        try {
            if (param0 != -24762) {
                java.applet.Applet var6 = (java.applet.Applet) null;
                vi.a((java.applet.Applet) null, -8);
            }
            param3.b(param1, false, -1);
            param3.c(param2, 274191016);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vi.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_s = null;
        field_L = null;
        field_p = null;
        int var1 = 125 / ((-3 - param0) / 52);
        field_o = null;
        field_K = null;
        field_J = null;
        field_E = null;
    }

    private final void a(ti param0, byte param1, ti param2) {
        try {
            this.field_x = param0;
            this.field_H = param2;
            if (param1 != 26) {
                ti var5 = (ti) null;
                this.a(-61, 2, 126, (ti) null);
            }
            this.field_z = 1048576;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vi.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 2) {
            field_y = (String) null;
        }
        this.field_D = param0;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if ((this.field_z ^ -1) >= -1) {
            break L0;
          } else {
            if (null != this.field_q) {
              this.field_x.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= this.field_z) {
            if (-1 <= (this.field_I ^ -1)) {
              break L1;
            } else {
              if (this.field_G == null) {
                break L1;
              } else {
                this.field_t.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= (this.field_I ^ -1)) {
              break L1;
            } else {
              if (this.field_G == null) {
                break L1;
              } else {
                this.field_t.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.field_r) {
            L3: {
              if ((this.field_u ^ -1) >= -1) {
                break L3;
              } else {
                if (!this.field_x.a((byte) -76)) {
                  this.field_r = false;
                  this.field_u = -this.field_u;
                  this.field_q = null;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-1 >= (this.field_u ^ -1)) {
              break L2;
            } else {
              if (!this.field_H.a((byte) 112)) {
                this.field_r = false;
                this.field_u = -this.field_u;
                this.field_A = null;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (this.field_u == 0) {
            break L4;
          } else {
            this.field_z = this.field_z + this.field_u * param0;
            if (this.field_z < 1048576) {
              if (this.field_z <= 0) {
                this.field_z = 0;
                if (this.field_r) {
                  break L4;
                } else {
                  this.field_u = 0;
                  if (this.field_w) {
                    break L4;
                  } else {
                    L5: {
                      if (null != this.field_q) {
                        this.field_x.g(-104);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_q = null;
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            } else {
              this.field_z = 1048576;
              if (this.field_r) {
                break L4;
              } else {
                this.field_u = 0;
                if (!this.field_w) {
                  L6: {
                    if (this.field_A != null) {
                      this.field_H.g(-3);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_A = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final static tf[] a(fm param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tf[] stackIn_2_0 = null;
        tf[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param0.a(127, param3);
            var5 = param0.a((byte) -114, param2, var4_int);
            if (param1 == 20049) {
              stackIn_4_0 = se.a(var5, var4_int, 1000, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (tf[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("vi.L(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 == -109) {
          L0: {
            if (mc.field_r == null) {
              break L0;
            } else {
              var1 = mc.field_r;
              synchronized (var1) {
                L1: {
                  mc.field_r = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final sj d() {
        return null;
    }

    final static void f(int param0) {
        pj[] var1 = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = up.field_n;
              var2 = 0;
              if (param0 > 31) {
                break L1;
              } else {
                field_E = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var1.length <= var2) {
                break L0;
              } else {
                var3 = var1[var2];
                var3.a((byte) -70);
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "vi.J(" + param0 + ')');
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_31_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
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
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (0 < this.field_D) {
              L1: {
                if (!this.field_r) {
                  break L1;
                } else {
                  L2: {
                    if (-1 <= (this.field_u ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_x.a((byte) 105)) {
                        break L2;
                      } else {
                        this.field_q = null;
                        this.field_r = false;
                        this.field_u = -this.field_u;
                        break L1;
                      }
                    }
                  }
                  if ((this.field_u ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (!this.field_H.a((byte) -83)) {
                      this.field_u = -this.field_u;
                      this.field_A = null;
                      this.field_r = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_z >> -2133077076) * this.field_D / 256;
                var5 = -var4_int + this.field_D;
                if (this.field_u == 0) {
                  break L3;
                } else {
                  this.field_z = this.field_z + this.field_u * param2;
                  if (1048576 <= this.field_z) {
                    this.field_z = 1048576;
                    if (this.field_r) {
                      break L3;
                    } else {
                      this.field_u = 0;
                      if (!this.field_w) {
                        L4: {
                          if (this.field_A == null) {
                            break L4;
                          } else {
                            this.field_H.g(126);
                            break L4;
                          }
                        }
                        this.field_A = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (this.field_z > 0) {
                      break L3;
                    } else {
                      this.field_z = 0;
                      if (this.field_r) {
                        break L3;
                      } else {
                        this.field_u = 0;
                        if (!this.field_w) {
                          L5: {
                            if (this.field_q != null) {
                              this.field_x.g(126);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_q = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (!mm.field_o) {
                  stackIn_31_0 = param2;
                  break L6;
                } else {
                  stackIn_31_0 = param2 << -1864950303;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_31_0;
                if (this.field_I >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (this.field_q != null) {
                      break L8;
                    } else {
                      if (null != this.field_A) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if ((var5 ^ -1) != -257) {
                      L9: {
                        L10: {
                          if (null == this.field_v) {
                            break L10;
                          } else {
                            if (var6 > this.field_v.length) {
                              break L10;
                            } else {
                              qb.a(this.field_v, 0, var6);
                              qb.a(this.field_B, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_B = new int[var6];
                        this.field_v = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_x.b(this.field_v, 0, param2);
                        this.field_H.b(this.field_B, 0, param2);
                        if (!mm.field_o) {
                          stackIn_46_0 = param1;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackIn_46_0 = param1 << 1;
                          break L11;
                        }
                      }
                      var7 = stackIn_46_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (this.field_v[var8] * var4_int + var5 * this.field_B[var8] >> 580127528);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      this.field_H.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    this.field_x.b(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (null == this.field_G) {
                  break L13;
                } else {
                  if (this.field_I != 0) {
                    L14: {
                      L15: {
                        if (null == this.field_v) {
                          break L15;
                        } else {
                          if (this.field_v.length >= var6) {
                            qb.a(this.field_v, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_v = new int[var6];
                      this.field_B = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_t.b(this.field_v, 0, param2);
                      if (!mm.field_o) {
                        stackIn_60_0 = param1;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackIn_60_0 = param1 << 1;
                        break L16;
                      }
                    }
                    var7 = stackIn_60_0;
                    var8 = this.field_D * this.field_I / 256;
                    var9 = this.field_D - var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var7 + var10] = var9 * param0[var7 + var10] + var8 * this.field_v[var10] >> 1369621256;
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
            } else {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var4);

            stackIn_66_1 = new StringBuilder().append("vi.A(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L18;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L18;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public vi() {
        this.field_w = false;
        this.field_I = 0;
        this.field_D = 256;
        ti var1 = new ti();
        this.a(var1, (byte) 26, new ti(var1));
    }

    static {
        field_K = new byte[520];
        field_y = "Passwords must be between 5 and 20 characters long";
        field_J = "Continue";
        field_E = "Perfect Drops: ";
        field_L = "Name is available";
        field_s = "FULL ACCESS";
    }
}

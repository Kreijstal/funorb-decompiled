/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qd {
    private int field_s;
    static int[] field_n;
    private boolean field_E;
    static int field_C;
    private int[] field_q;
    private vm field_o;
    private int field_u;
    private vm field_r;
    private vm field_t;
    private ie field_D;
    private int field_p;
    private ie field_z;
    private int[] field_G;
    private int field_y;
    private ie field_x;
    static String field_B;
    private boolean field_v;
    static gq field_m;
    static volatile boolean field_A;
    static String field_w;

    final qd d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
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
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (-1 <= (this.field_p ^ -1)) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_v) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_y <= 0) {
                      break L2;
                    } else {
                      if (this.field_D.d(-1)) {
                        break L2;
                      } else {
                        this.field_r = null;
                        this.field_v = false;
                        this.field_y = -this.field_y;
                        break L1;
                      }
                    }
                  }
                  if ((this.field_y ^ -1) <= -1) {
                    break L1;
                  } else {
                    if (this.field_x.d(-1)) {
                      break L1;
                    } else {
                      this.field_y = -this.field_y;
                      this.field_o = null;
                      this.field_v = false;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = (this.field_s >> 1587168844) * this.field_p / 256;
                var5 = -var4_int + this.field_p;
                if (this.field_y == 0) {
                  break L3;
                } else {
                  this.field_s = this.field_s + this.field_y * param2;
                  if (1048576 > this.field_s) {
                    if ((this.field_s ^ -1) >= -1) {
                      this.field_s = 0;
                      if (!this.field_v) {
                        this.field_y = 0;
                        if (!this.field_E) {
                          L4: {
                            if (null == this.field_r) {
                              break L4;
                            } else {
                              this.field_D.f(-24774);
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
                      break L3;
                    }
                  } else {
                    this.field_s = 1048576;
                    if (this.field_v) {
                      break L3;
                    } else {
                      this.field_y = 0;
                      if (!this.field_E) {
                        L5: {
                          if (null != this.field_o) {
                            this.field_x.f(-24774);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_o = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (!tj.field_g) {
                  stackIn_33_0 = param2;
                  break L6;
                } else {
                  stackIn_33_0 = param2 << -1963262239;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (-257 < (this.field_u ^ -1)) {
                  L8: {
                    if (this.field_r != null) {
                      break L8;
                    } else {
                      if (this.field_o == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (256 == var5) {
                      this.field_x.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_q == null) {
                            break L10;
                          } else {
                            if (var6 <= this.field_q.length) {
                              pm.a(this.field_q, 0, var6);
                              pm.a(this.field_G, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_G = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_D.b(this.field_q, 0, param2);
                        this.field_x.b(this.field_G, 0, param2);
                        if (!tj.field_g) {
                          stackIn_49_0 = param1;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackIn_49_0 = param1 << 1;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var5 * this.field_G[var8] + this.field_q[var8] * var4_int >> 845287688);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_D.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (null == this.field_t) {
                    break L14;
                  } else {
                    if (this.field_u != 0) {
                      L15: {
                        L16: {
                          if (this.field_q == null) {
                            break L16;
                          } else {
                            if (this.field_q.length < var6) {
                              break L16;
                            } else {
                              pm.a(this.field_q, 0, var6);
                              break L15;
                            }
                          }
                        }
                        this.field_G = new int[var6];
                        this.field_q = new int[var6];
                        break L15;
                      }
                      L17: {
                        this.field_z.b(this.field_q, 0, param2);
                        if (tj.field_g) {
                          param1 = param1 << 1;
                          stackIn_63_0 = param1 << 1;
                          break L17;
                        } else {
                          stackIn_63_0 = param1;
                          break L17;
                        }
                      }
                      var7 = stackIn_63_0;
                      var8 = this.field_u * this.field_p / 256;
                      var9 = -var8 + this.field_p;
                      var10 = 0;
                      L18: while (true) {
                        if (var6 <= var10) {
                          break L14;
                        } else {
                          param0[var10 + var7] = var8 * this.field_q[var10] + param0[var7 - -var10] * var9 >> -1943340440;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var4);

            stackIn_69_1 = new StringBuilder().append("tn.D(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L19;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final qd a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (this.field_s > 0) {
            if (null != this.field_r) {
              this.field_D.a(param0);
              if (-1048577 >= (this.field_s ^ -1)) {
                break L0;
              } else {
                if (null == this.field_o) {
                  break L0;
                } else {
                  this.field_x.a(param0);
                  break L0;
                }
              }
            } else {
              if (-1048577 >= (this.field_s ^ -1)) {
                break L0;
              } else {
                if (null == this.field_o) {
                  break L0;
                } else {
                  this.field_x.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (-1048577 >= (this.field_s ^ -1)) {
              break L0;
            } else {
              if (null == this.field_o) {
                break L0;
              } else {
                this.field_x.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (this.field_u <= 0) {
            break L1;
          } else {
            if (null != this.field_t) {
              this.field_z.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_v) {
            break L2;
          } else {
            L3: {
              if (-1 <= (this.field_y ^ -1)) {
                break L3;
              } else {
                if (!this.field_D.d(-1)) {
                  this.field_v = false;
                  this.field_r = null;
                  this.field_y = -this.field_y;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= this.field_y) {
              break L2;
            } else {
              if (!this.field_x.d(-1)) {
                this.field_v = false;
                this.field_y = -this.field_y;
                this.field_o = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (this.field_y == 0) {
            break L4;
          } else {
            this.field_s = this.field_s + param0 * this.field_y;
            if ((this.field_s ^ -1) > -1048577) {
              if (-1 > (this.field_s ^ -1)) {
                break L4;
              } else {
                this.field_s = 0;
                if (this.field_v) {
                  break L4;
                } else {
                  this.field_y = 0;
                  if (!this.field_E) {
                    L5: {
                      if (this.field_r == null) {
                        break L5;
                      } else {
                        this.field_D.f(-24774);
                        break L5;
                      }
                    }
                    this.field_r = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            } else {
              this.field_s = 1048576;
              if (this.field_v) {
                break L4;
              } else {
                this.field_y = 0;
                if (!this.field_E) {
                  L6: {
                    if (null == this.field_o) {
                      break L6;
                    } else {
                      this.field_x.f(-24774);
                      break L6;
                    }
                  }
                  this.field_o = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, int param4, vm param5) {
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        ie stackIn_42_0 = null;
        vm stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        ie stackIn_43_0;
        vm stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        ie stackIn_52_0 = null;
        vm stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        ie stackIn_53_0;
        vm stackIn_53_1;
        int stackIn_53_2;
        int stackIn_53_3;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_v) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (0 < this.field_y) {
                      L3: {
                        if (null != this.field_r) {
                          this.field_D.f(-24774);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_r = param5;
                      if (param5 != null) {
                        this.field_D.a(param5, 127, false);
                        this.a(param0, false, this.field_D, param4);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_o == null) {
                          break L4;
                        } else {
                          this.field_x.f(-24774);
                          break L4;
                        }
                      }
                      this.field_o = param5;
                      if (param5 != null) {
                        this.field_x.a(param5, -66, false);
                        this.a(param0, false, this.field_x, param4);
                        break L2;
                      } else {
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
              stackIn_19_0 = this;

              if (!param1) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L5;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L5;
              }
            }
            ((tn) (this)).field_v = stackIn_20_1 != 0;
            if (param5 != this.field_r) {
              if (param5 != this.field_o) {
                L6: {
                  if (param3 == 22) {
                    break L6;
                  } else {
                    this.b();
                    break L6;
                  }
                }
                L7: {
                  if (this.field_r == null) {
                    var7_int = 1;
                    break L7;
                  } else {
                    if (null == this.field_o) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (this.field_s >= 524288) {
                          stackIn_33_0 = 0;
                          break L8;
                        } else {
                          stackIn_33_0 = 1;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (null != this.field_r) {
                        this.field_D.f(-24774);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_r = param5;
                      if (param5 != null) {
                        L12: {
                          stackIn_52_0 = this.field_D;

                          stackIn_52_1 = (vm) (param5);

                          stackIn_52_2 = 126;

                          if (param1) {
                            stackIn_53_0 = (ie) ((Object) stackIn_52_0);
                            stackIn_53_1 = (vm) ((Object) stackIn_52_1);
                            stackIn_53_2 = stackIn_52_2;
                            stackIn_53_3 = 0;
                            break L12;
                          } else {
                            stackIn_53_0 = (ie) ((Object) stackIn_52_0);
                            stackIn_53_1 = (vm) ((Object) stackIn_52_1);
                            stackIn_53_2 = stackIn_52_2;
                            stackIn_53_3 = 1;
                            break L12;
                          }
                        }
                        ((ie) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3 != 0);
                        this.a(param0, false, this.field_D, param4);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.field_y = param2;
                    break L9;
                  } else {
                    L13: {
                      if (this.field_o == null) {
                        break L13;
                      } else {
                        this.field_x.f(-24774);
                        break L13;
                      }
                    }
                    L14: {
                      this.field_o = param5;
                      if (param5 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackIn_42_0 = this.field_x;

                          stackIn_42_1 = (vm) (param5);

                          stackIn_42_2 = 126;

                          if (param1) {
                            stackIn_43_0 = (ie) ((Object) stackIn_42_0);
                            stackIn_43_1 = (vm) ((Object) stackIn_42_1);
                            stackIn_43_2 = stackIn_42_2;
                            stackIn_43_3 = 0;
                            break L15;
                          } else {
                            stackIn_43_0 = (ie) ((Object) stackIn_42_0);
                            stackIn_43_1 = (vm) ((Object) stackIn_42_1);
                            stackIn_43_2 = stackIn_42_2;
                            stackIn_43_3 = 1;
                            break L15;
                          }
                        }
                        ((ie) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3 != 0);
                        this.a(param0, false, this.field_x, param4);
                        break L14;
                      }
                    }
                    this.field_y = -param2;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_y = -param2;
                this.a(param0, false, this.field_x, param4);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_y = param2;
              this.a(param0, false, this.field_D, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var7);

            stackIn_58_1 = new StringBuilder().append("tn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L16;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L16;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ')');
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

    final synchronized int b() {
        return 2;
    }

    public static void c(int param0) {
        if (param0 > -18) {
            tn.c(-21);
        }
        field_B = null;
        field_m = null;
        field_n = null;
        field_w = null;
    }

    final synchronized void a(boolean param0, int param1) {
        this.field_p = param1;
        if (!param0) {
            this.b();
        }
    }

    private final void a(int param0, boolean param1, ie param2, int param3) {
        try {
            param2.e(param0, -1, 16);
            param2.b(param3, -606970073);
            if (param1) {
                this.field_E = false;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "tn.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        b.field_c = param1;
        if (param2 != 256) {
            return;
        }
        so.field_b = param0;
        ae.field_f = param3;
        pe.field_s = param4;
    }

    private tn() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_B = "Highscores";
        field_n = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 979869185));
            var4 = (long)((var0 << -1076818687) - 1);
            var3 = (int)(-32768L + (var6 * var6 >> 662387538));
            var2 = (int)(-32768L + (var4 * var4 >> 234206930));
            if (!(field_n.length > var3)) {
                var3 = -1 + field_n.length;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var3 >= var1; var1++) {
                field_n[var1] = var0;
            }
        }
        field_A = false;
        field_w = "Speed up: increases the speed of any ball in play.";
    }
}

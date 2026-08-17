/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ag {
    private int field_v;
    private lc field_k;
    private lc field_l;
    private boolean field_p;
    private lc field_s;
    private int[] field_r;
    private int field_o;
    private pl field_w;
    private int field_x;
    static tf field_m;
    private int[] field_q;
    private boolean field_t;
    private int field_z;
    static qj field_u;
    private pl field_y;
    private pl field_n;

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if ((this.field_v ^ -1) >= -1) {
              this.d(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_t) {
                  L2: {
                    if (-1 <= (this.field_z ^ -1)) {
                      break L2;
                    } else {
                      if (!this.field_s.a((byte) -88)) {
                        this.field_z = -this.field_z;
                        this.field_y = null;
                        this.field_t = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_z >= 0) {
                    break L1;
                  } else {
                    if (!this.field_k.a((byte) -125)) {
                      this.field_w = null;
                      this.field_z = -this.field_z;
                      this.field_t = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (this.field_o >> 1423531820) * this.field_v / 256;
                var5 = -var4_int + this.field_v;
                if (this.field_z != 0) {
                  this.field_o = this.field_o + this.field_z * param2;
                  if (this.field_o < 1048576) {
                    if (-1 > (this.field_o ^ -1)) {
                      break L3;
                    } else {
                      this.field_o = 0;
                      if (this.field_t) {
                        break L3;
                      } else {
                        this.field_z = 0;
                        if (this.field_p) {
                          break L3;
                        } else {
                          L4: {
                            if (null == this.field_y) {
                              break L4;
                            } else {
                              this.field_s.f(16);
                              break L4;
                            }
                          }
                          this.field_y = null;
                          break L3;
                        }
                      }
                    }
                  } else {
                    this.field_o = 1048576;
                    if (this.field_t) {
                      break L3;
                    } else {
                      this.field_z = 0;
                      if (!this.field_p) {
                        L5: {
                          if (null == this.field_w) {
                            break L5;
                          } else {
                            this.field_k.f(16);
                            break L5;
                          }
                        }
                        this.field_w = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (qh.field_g) {
                  stackIn_33_0 = param2 << -1141439167;
                  break L6;
                } else {
                  stackIn_33_0 = param2;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (this.field_x < 256) {
                  L8: {
                    if (null != this.field_y) {
                      break L8;
                    } else {
                      if (this.field_w == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if ((var5 ^ -1) == -257) {
                      this.field_k.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (null == this.field_q) {
                            break L10;
                          } else {
                            if (this.field_q.length < var6) {
                              break L10;
                            } else {
                              ji.a(this.field_q, 0, var6);
                              ji.a(this.field_r, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_r = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_s.b(this.field_q, 0, param2);
                        this.field_k.b(this.field_r, 0, param2);
                        if (!qh.field_g) {
                          stackIn_48_0 = param1;
                          break L11;
                        } else {
                          localTemp$0 = param1 << 1;
                          param1 = localTemp$0;
                          stackIn_48_0 = localTemp$0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (this.field_r[var8] * var5 + this.field_q[var8] * var4_int >> 306189320);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_s.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null == this.field_n) {
                  break L13;
                } else {
                  if (this.field_x == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (this.field_q == null) {
                          break L15;
                        } else {
                          if (var6 <= this.field_q.length) {
                            ji.a(this.field_q, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_r = new int[var6];
                      this.field_q = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_l.b(this.field_q, 0, param2);
                      if (!qh.field_g) {
                        stackIn_62_0 = param1;
                        break L16;
                      } else {
                        localTemp$1 = param1 << 1;
                        param1 = localTemp$1;
                        stackIn_62_0 = localTemp$1;
                        break L16;
                      }
                    }
                    var7 = stackIn_62_0;
                    var8 = this.field_x * this.field_v / 256;
                    var9 = this.field_v - var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var8 * this.field_q[var10] + var9 * param0[var10 + var7] >> 769063560;
                        var10++;
                        continue L17;
                      }
                    }
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
            stackIn_68_0 = (RuntimeException) (var4);

            stackIn_68_1 = new StringBuilder().append("oj.K(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L18;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L18;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 <= 35) {
            field_u = (qj) null;
        }
        field_u = null;
    }

    final synchronized int b() {
        return 2;
    }

    final static void a(ti param0, int param1) {
        try {
            og.a((byte) 92);
            if (param1 != 256) {
                oj.a((byte) 117);
            }
            sb.a(param0.field_w, param0.field_r, param0.field_s);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, int param3, pl param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        lc stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        lc stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        lc stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        lc stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
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
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (0 < this.field_z) {
                      L3: {
                        if (this.field_y != null) {
                          this.field_s.f(16);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.field_y = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        this.field_s.a(123, false, param4);
                        this.a(param3, (byte) -99, this.field_s, param2);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (this.field_w == null) {
                          break L4;
                        } else {
                          this.field_k.f(16);
                          break L4;
                        }
                      }
                      this.field_w = param4;
                      if (param4 != null) {
                        this.field_k.a(-68, false, param4);
                        this.a(param3, (byte) -62, this.field_k, param2);
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
            ((oj) (this)).field_t = stackIn_19_1 != 0;
            if (param4 == this.field_y) {
              this.field_z = param0;
              this.a(param3, (byte) -91, this.field_s, param2);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_w != param4) {
                L6: {
                  if (null != this.field_y) {
                    if (this.field_w == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (524288 <= this.field_o) {
                          stackIn_31_0 = 0;
                          break L7;
                        } else {
                          stackIn_31_0 = 1;
                          break L7;
                        }
                      }
                      var7_int = stackIn_31_0;
                      break L6;
                    }
                  } else {
                    var7_int = 1;
                    break L6;
                  }
                }
                L8: {
                  if (var7_int != 0) {
                    L9: {
                      if (this.field_y == null) {
                        break L9;
                      } else {
                        this.field_s.f(16);
                        break L9;
                      }
                    }
                    L10: {
                      this.field_y = param4;
                      if (param4 != null) {
                        L11: {
                          stackIn_49_0 = this.field_s;

                          stackIn_49_1 = 125;

                          if (param1) {
                            stackIn_50_0 = (lc) ((Object) stackIn_49_0);
                            stackIn_50_1 = stackIn_49_1;
                            stackIn_50_2 = 0;
                            break L11;
                          } else {
                            stackIn_50_0 = (lc) ((Object) stackIn_49_0);
                            stackIn_50_1 = stackIn_49_1;
                            stackIn_50_2 = 1;
                            break L11;
                          }
                        }
                        ((lc) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, param4);
                        this.a(param3, (byte) -61, this.field_s, param2);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    this.field_z = param0;
                    break L8;
                  } else {
                    L12: {
                      if (null == this.field_w) {
                        break L12;
                      } else {
                        this.field_k.f(16);
                        break L12;
                      }
                    }
                    L13: {
                      this.field_w = param4;
                      if (param4 != null) {
                        L14: {
                          stackIn_40_0 = this.field_k;

                          stackIn_40_1 = 124;

                          if (param1) {
                            stackIn_41_0 = (lc) ((Object) stackIn_40_0);
                            stackIn_41_1 = stackIn_40_1;
                            stackIn_41_2 = 0;
                            break L14;
                          } else {
                            stackIn_41_0 = (lc) ((Object) stackIn_40_0);
                            stackIn_41_1 = stackIn_40_1;
                            stackIn_41_2 = 1;
                            break L14;
                          }
                        }
                        ((lc) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, param4);
                        this.a(param3, (byte) -96, this.field_k, param2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    this.field_z = -param0;
                    break L8;
                  }
                }
                var8 = 100 / ((25 - param5) / 62);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_z = -param0;
                this.a(param3, (byte) -126, this.field_k, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("oj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L15;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L15;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param5 + ')');
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

    final ag a() {
        return null;
    }

    final static uj a(byte param0) {
        if (jh.field_n == rh.field_v) {
            throw new IllegalStateException();
        }
        if (rh.field_v == gd.field_l) {
            rh.field_v = jh.field_n;
            return q.field_h;
        }
        if (param0 == 32) {
            return null;
        }
        field_m = (tf) null;
        return null;
    }

    final synchronized void d(int param0) {
        int var3;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (0 < this.field_o) {
            L1: {
              if (null != this.field_y) {
                this.field_s.d(param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (-1048577 >= (this.field_o ^ -1)) {
              break L0;
            } else {
              if (this.field_w == null) {
                break L0;
              } else {
                this.field_k.d(param0);
                break L0;
              }
            }
          } else {
            if (-1048577 >= (this.field_o ^ -1)) {
              break L0;
            } else {
              if (this.field_w == null) {
                break L0;
              } else {
                this.field_k.d(param0);
                break L0;
              }
            }
          }
        }
        L2: {
          if (0 >= this.field_x) {
            break L2;
          } else {
            if (null != this.field_n) {
              this.field_l.d(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_t) {
            if ((this.field_z ^ -1) < -1) {
              if (!this.field_s.a((byte) -35)) {
                this.field_z = -this.field_z;
                this.field_y = null;
                this.field_t = false;
                break L3;
              } else {
                if (this.field_z >= 0) {
                  break L3;
                } else {
                  if (this.field_k.a((byte) -110)) {
                    break L3;
                  } else {
                    this.field_w = null;
                    this.field_t = false;
                    this.field_z = -this.field_z;
                    break L3;
                  }
                }
              }
            } else {
              if (this.field_z >= 0) {
                break L3;
              } else {
                if (this.field_k.a((byte) -110)) {
                  break L3;
                } else {
                  this.field_w = null;
                  this.field_t = false;
                  this.field_z = -this.field_z;
                  break L3;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_z == 0) {
            break L4;
          } else {
            this.field_o = this.field_o + param0 * this.field_z;
            if (1048576 > this.field_o) {
              if ((this.field_o ^ -1) < -1) {
                break L4;
              } else {
                this.field_o = 0;
                if (this.field_t) {
                  break L4;
                } else {
                  this.field_z = 0;
                  if (this.field_p) {
                    break L4;
                  } else {
                    L5: {
                      if (null == this.field_y) {
                        break L5;
                      } else {
                        this.field_s.f(16);
                        break L5;
                      }
                    }
                    this.field_y = null;
                    break L4;
                  }
                }
              }
            } else {
              this.field_o = 1048576;
              if (this.field_t) {
                break L4;
              } else {
                this.field_z = 0;
                if (this.field_p) {
                  break L4;
                } else {
                  L6: {
                    if (this.field_w != null) {
                      this.field_k.f(16);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_w = null;
                  break L4;
                }
              }
            }
          }
        }
    }

    final ag d() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (param1) {
            this.field_q = (int[]) null;
        }
        this.field_v = param0;
    }

    private final void a(int param0, byte param1, lc param2, int param3) {
        try {
            if (param1 > -58) {
                this.d();
            }
            param2.c(-1, param3, 0);
            param2.a(true, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oj.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private oj() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new tf(11, 0, 1, 2);
        field_u = new qj();
    }
}

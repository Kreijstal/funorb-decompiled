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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
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
                    L3: {
                      if (-1 <= (this.field_z ^ -1)) {
                        break L3;
                      } else {
                        if (!this.field_s.a((byte) -88)) {
                          break L2;
                        } else {
                          break L3;
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
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_z = -this.field_z;
                  this.field_y = null;
                  this.field_t = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              L4: {
                var4_int = (this.field_o >> 1423531820) * this.field_v / 256;
                var5 = -var4_int + this.field_v;
                if (this.field_z != 0) {
                  L5: {
                    this.field_o = this.field_o + this.field_z * param2;
                    if (this.field_o < 1048576) {
                      break L5;
                    } else {
                      this.field_o = 1048576;
                      if (this.field_t) {
                        break L4;
                      } else {
                        this.field_z = 0;
                        if (!this.field_p) {
                          L6: {
                            if (null == this.field_w) {
                              break L6;
                            } else {
                              this.field_k.f(16);
                              break L6;
                            }
                          }
                          this.field_w = null;
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (-1 > (this.field_o ^ -1)) {
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
                        L7: {
                          if (null == this.field_y) {
                            break L7;
                          } else {
                            this.field_s.f(16);
                            break L7;
                          }
                        }
                        this.field_y = null;
                        break L4;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              L8: {
                if (qh.field_g) {
                  stackOut_32_0 = param2 << -1141439167;
                  stackIn_33_0 = stackOut_32_0;
                  break L8;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L8;
                }
              }
              L9: {
                var6 = stackIn_33_0;
                if (this.field_x < 256) {
                  L10: {
                    if (null != this.field_y) {
                      break L10;
                    } else {
                      if (this.field_w == null) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var4_int != 256) {
                      break L11;
                    } else {
                      this.field_s.b(param0, param1, param2);
                      if (var11 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if ((var5 ^ -1) == -257) {
                      break L12;
                    } else {
                      L13: {
                        L14: {
                          if (null == this.field_q) {
                            break L14;
                          } else {
                            if (this.field_q.length < var6) {
                              break L14;
                            } else {
                              ji.a(this.field_q, 0, var6);
                              ji.a(this.field_r, 0, var6);
                              if (var11 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        this.field_q = new int[var6];
                        this.field_r = new int[var6];
                        break L13;
                      }
                      L15: {
                        this.field_s.b(this.field_q, 0, param2);
                        this.field_k.b(this.field_r, 0, param2);
                        if (!qh.field_g) {
                          stackOut_49_0 = param1;
                          stackIn_50_0 = stackOut_49_0;
                          break L15;
                        } else {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L15;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L16: while (true) {
                        if (var8 >= var6) {
                          if (var11 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (this.field_r[var8] * var5 + this.field_q[var8] * var4_int >> 306189320);
                          var8++;
                          if (var11 != 0) {
                            break L9;
                          } else {
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  this.field_k.b(param0, param1, param2);
                  break L9;
                } else {
                  break L9;
                }
              }
              L17: {
                if (null == this.field_n) {
                  break L17;
                } else {
                  if (this.field_x == 0) {
                    break L17;
                  } else {
                    L18: {
                      L19: {
                        L20: {
                          if (this.field_q == null) {
                            break L20;
                          } else {
                            if (var6 <= this.field_q.length) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        this.field_r = new int[var6];
                        this.field_q = new int[var6];
                        if (var11 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                      ji.a(this.field_q, 0, var6);
                      break L18;
                    }
                    L21: {
                      this.field_l.b(this.field_q, 0, param2);
                      if (!qh.field_g) {
                        stackOut_67_0 = param1;
                        stackIn_68_0 = stackOut_67_0;
                        break L21;
                      } else {
                        param1 = param1 << 1;
                        stackOut_66_0 = param1 << 1;
                        stackIn_68_0 = stackOut_66_0;
                        break L21;
                      }
                    }
                    var7 = stackIn_68_0;
                    var8 = this.field_x * this.field_v / 256;
                    var9 = this.field_v - var8;
                    var10 = 0;
                    L22: while (true) {
                      if (var6 <= var10) {
                        break L17;
                      } else {
                        param0[var10 + var7] = var8 * this.field_q[var10] + var9 * param0[var10 + var7] >> 769063560;
                        var10++;
                        if (var11 != 0) {
                          break L17;
                        } else {
                          continue L22;
                        }
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
          L23: {
            var4 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var4);
            stackOut_74_1 = new StringBuilder().append("oj.K(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param1 + ',' + param2 + ')');
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
        uj discarded$0 = null;
        try {
            og.a((byte) 92);
            if (param1 != 256) {
                discarded$0 = oj.a((byte) 117);
            }
            sb.a(param0.field_w, param0.field_r, param0.field_s);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, int param3, pl param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        lc stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        lc stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        lc stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        lc stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        lc stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        lc stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        lc stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        lc stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        lc stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        lc stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        lc stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        lc stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    L3: {
                      if (0 < this.field_z) {
                        break L3;
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
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (this.field_y != null) {
                        this.field_s.f(16);
                        break L5;
                      } else {
                        break L5;
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
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param1) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
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
                L7: {
                  L8: {
                    if (null != this.field_y) {
                      break L8;
                    } else {
                      var7_int = 1;
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (this.field_w == null) {
                      break L9;
                    } else {
                      L10: {
                        if (524288 <= this.field_o) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L10;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_31_0 = stackOut_29_0;
                          break L10;
                        }
                      }
                      var7_int = stackIn_31_0;
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7_int = 0;
                  break L7;
                }
                L11: {
                  L12: {
                    if (var7_int != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (null == this.field_w) {
                          break L13;
                        } else {
                          this.field_k.f(16);
                          break L13;
                        }
                      }
                      L14: {
                        this.field_w = param4;
                        if (param4 != null) {
                          L15: {
                            stackOut_38_0 = this.field_k;
                            stackOut_38_1 = 124;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            if (param1) {
                              stackOut_40_0 = (lc) ((Object) stackIn_40_0);
                              stackOut_40_1 = stackIn_40_1;
                              stackOut_40_2 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              stackIn_41_2 = stackOut_40_2;
                              break L15;
                            } else {
                              stackOut_39_0 = (lc) ((Object) stackIn_39_0);
                              stackOut_39_1 = stackIn_39_1;
                              stackOut_39_2 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              break L15;
                            }
                          }
                          ((lc) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, param4);
                          this.a(param3, (byte) -96, this.field_k, param2);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      this.field_z = -param0;
                      if (var9 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L16: {
                    if (this.field_y == null) {
                      break L16;
                    } else {
                      this.field_s.f(16);
                      break L16;
                    }
                  }
                  L17: {
                    this.field_y = param4;
                    if (param4 != null) {
                      L18: {
                        stackOut_47_0 = this.field_s;
                        stackOut_47_1 = 125;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (param1) {
                          stackOut_49_0 = (lc) ((Object) stackIn_49_0);
                          stackOut_49_1 = stackIn_49_1;
                          stackOut_49_2 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          stackIn_50_2 = stackOut_49_2;
                          break L18;
                        } else {
                          stackOut_48_0 = (lc) ((Object) stackIn_48_0);
                          stackOut_48_1 = stackIn_48_1;
                          stackOut_48_2 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_50_2 = stackOut_48_2;
                          break L18;
                        }
                      }
                      ((lc) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, param4);
                      this.a(param3, (byte) -61, this.field_s, param2);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  this.field_z = param0;
                  break L11;
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
          L19: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var7);
            stackOut_54_1 = new StringBuilder().append("oj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param4 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L19;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L19;
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
        if (jh.field_n != rh.field_v) {
          if (rh.field_v != gd.field_l) {
            if (param0 == 32) {
              return null;
            } else {
              field_m = (tf) null;
              return null;
            }
          } else {
            rh.field_v = jh.field_n;
            return q.field_h;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (0 >= this.field_o) {
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
        L1: {
          if (0 >= this.field_x) {
            break L1;
          } else {
            if (null != this.field_n) {
              this.field_l.d(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (this.field_t) {
            if ((this.field_z ^ -1) < -1) {
              if (!this.field_s.a((byte) -35)) {
                this.field_z = -this.field_z;
                this.field_y = null;
                this.field_t = false;
                if (var3 == 0) {
                  break L2;
                } else {
                  if (this.field_z >= 0) {
                    break L2;
                  } else {
                    if (this.field_k.a((byte) -110)) {
                      break L2;
                    } else {
                      this.field_w = null;
                      this.field_t = false;
                      this.field_z = -this.field_z;
                      break L2;
                    }
                  }
                }
              } else {
                if (this.field_z >= 0) {
                  break L2;
                } else {
                  if (this.field_k.a((byte) -110)) {
                    break L2;
                  } else {
                    this.field_w = null;
                    this.field_t = false;
                    this.field_z = -this.field_z;
                    break L2;
                  }
                }
              }
            } else {
              if (this.field_z >= 0) {
                break L2;
              } else {
                if (this.field_k.a((byte) -110)) {
                  break L2;
                } else {
                  this.field_w = null;
                  this.field_t = false;
                  this.field_z = -this.field_z;
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_z == 0) {
            break L3;
          } else {
            L4: {
              this.field_o = this.field_o + param0 * this.field_z;
              if (1048576 > this.field_o) {
                break L4;
              } else {
                this.field_o = 1048576;
                if (this.field_t) {
                  break L3;
                } else {
                  this.field_z = 0;
                  if (this.field_p) {
                    break L3;
                  } else {
                    L5: {
                      if (this.field_w != null) {
                        this.field_k.f(16);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_w = null;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            if ((this.field_o ^ -1) < -1) {
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
                  L6: {
                    if (null == this.field_y) {
                      break L6;
                    } else {
                      this.field_s.f(16);
                      break L6;
                    }
                  }
                  this.field_y = null;
                  break L3;
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
        ag discarded$0 = null;
        try {
            if (param1 > -58) {
                discarded$0 = this.d();
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

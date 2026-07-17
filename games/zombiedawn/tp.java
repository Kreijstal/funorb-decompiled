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
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_29_0 = 0;
        rj stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        wj stackIn_39_2 = null;
        rj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        wj stackIn_40_2 = null;
        rj stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        wj stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        rj stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        wj stackIn_48_2 = null;
        rj stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        wj stackIn_49_2 = null;
        rj stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        wj stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        rj stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        wj stackOut_47_2 = null;
        rj stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        wj stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        rj stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        wj stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        rj stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        wj stackOut_38_2 = null;
        rj stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        wj stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        rj stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        wj stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (!((tp) this).field_x) {
                break L1;
              } else {
                if (!param1) {
                  break L1;
                } else {
                  L2: {
                    if (((tp) this).field_A <= 0) {
                      L3: {
                        if (null == ((tp) this).field_r) {
                          break L3;
                        } else {
                          ((tp) this).field_t.c(28013);
                          break L3;
                        }
                      }
                      ((tp) this).field_r = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        ((tp) this).field_t.a((byte) -22, param5, false);
                        int discarded$6 = -1;
                        this.a(param2, param3, ((tp) this).field_t);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((tp) this).field_l == null) {
                          break L4;
                        } else {
                          ((tp) this).field_v.c(28013);
                          break L4;
                        }
                      }
                      ((tp) this).field_l = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        ((tp) this).field_v.a((byte) -22, param5, false);
                        int discarded$7 = -1;
                        this.a(param2, param3, ((tp) this).field_v);
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L5: {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!param1) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            ((tp) this).field_x = stackIn_16_1 != 0;
            if (param5 != ((tp) this).field_l) {
              if (param5 != ((tp) this).field_r) {
                if (param4 < -46) {
                  L6: {
                    if (((tp) this).field_l == null) {
                      var7_int = 1;
                      break L6;
                    } else {
                      if (null == ((tp) this).field_r) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if (((tp) this).field_u >= 524288) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L7;
                          } else {
                            stackOut_27_0 = 1;
                            stackIn_29_0 = stackOut_27_0;
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
                        if (((tp) this).field_l != null) {
                          ((tp) this).field_v.c(28013);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        ((tp) this).field_l = param5;
                        if (param5 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackOut_47_0 = ((tp) this).field_v;
                            stackOut_47_1 = -22;
                            stackOut_47_2 = (wj) param5;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            stackIn_49_2 = stackOut_47_2;
                            stackIn_48_0 = stackOut_47_0;
                            stackIn_48_1 = stackOut_47_1;
                            stackIn_48_2 = stackOut_47_2;
                            if (param1) {
                              stackOut_49_0 = (rj) (Object) stackIn_49_0;
                              stackOut_49_1 = stackIn_49_1;
                              stackOut_49_2 = (wj) (Object) stackIn_49_2;
                              stackOut_49_3 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              stackIn_50_2 = stackOut_49_2;
                              stackIn_50_3 = stackOut_49_3;
                              break L11;
                            } else {
                              stackOut_48_0 = (rj) (Object) stackIn_48_0;
                              stackOut_48_1 = stackIn_48_1;
                              stackOut_48_2 = (wj) (Object) stackIn_48_2;
                              stackOut_48_3 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              stackIn_50_2 = stackOut_48_2;
                              stackIn_50_3 = stackOut_48_3;
                              break L11;
                            }
                          }
                          ((rj) (Object) stackIn_50_0).a((byte) stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0);
                          int discarded$8 = -1;
                          this.a(param2, param3, ((tp) this).field_v);
                          break L10;
                        }
                      }
                      ((tp) this).field_A = param0;
                      break L8;
                    } else {
                      L12: {
                        if (((tp) this).field_r != null) {
                          ((tp) this).field_t.c(28013);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        ((tp) this).field_r = param5;
                        if (param5 != null) {
                          L14: {
                            stackOut_38_0 = ((tp) this).field_t;
                            stackOut_38_1 = -22;
                            stackOut_38_2 = (wj) param5;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_40_2 = stackOut_38_2;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            if (param1) {
                              stackOut_40_0 = (rj) (Object) stackIn_40_0;
                              stackOut_40_1 = stackIn_40_1;
                              stackOut_40_2 = (wj) (Object) stackIn_40_2;
                              stackOut_40_3 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              stackIn_41_2 = stackOut_40_2;
                              stackIn_41_3 = stackOut_40_3;
                              break L14;
                            } else {
                              stackOut_39_0 = (rj) (Object) stackIn_39_0;
                              stackOut_39_1 = stackIn_39_1;
                              stackOut_39_2 = (wj) (Object) stackIn_39_2;
                              stackOut_39_3 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              stackIn_41_3 = stackOut_39_3;
                              break L14;
                            }
                          }
                          ((rj) (Object) stackIn_41_0).a((byte) stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0);
                          int discarded$9 = -1;
                          this.a(param2, param3, ((tp) this).field_t);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      ((tp) this).field_A = -param0;
                      break L8;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                ((tp) this).field_A = -param0;
                int discarded$10 = -1;
                this.a(param2, param3, ((tp) this).field_t);
                return;
              }
            } else {
              ((tp) this).field_A = param0;
              int discarded$11 = -1;
              this.a(param2, param3, ((tp) this).field_v);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var7;
            stackOut_53_1 = new StringBuilder().append("tp.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L15;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L15;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    final void a(int[] param0, int param1, int param2) {
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
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            if (((tp) this).field_y <= 0) {
              ((tp) this).a(param2);
              return;
            } else {
              L1: {
                if (!((tp) this).field_x) {
                  break L1;
                } else {
                  L2: {
                    if (((tp) this).field_A <= 0) {
                      break L2;
                    } else {
                      if (((tp) this).field_v.c((byte) -34)) {
                        break L2;
                      } else {
                        ((tp) this).field_l = null;
                        ((tp) this).field_A = -((tp) this).field_A;
                        ((tp) this).field_x = false;
                        break L1;
                      }
                    }
                  }
                  if (((tp) this).field_A >= 0) {
                    break L1;
                  } else {
                    if (!((tp) this).field_t.c((byte) -34)) {
                      ((tp) this).field_r = null;
                      ((tp) this).field_A = -((tp) this).field_A;
                      ((tp) this).field_x = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = ((tp) this).field_y * (((tp) this).field_u >> 12) / 256;
                var5 = ((tp) this).field_y + -var4_int;
                if (-1 == ((tp) this).field_A) {
                  break L3;
                } else {
                  ((tp) this).field_u = ((tp) this).field_u + param2 * ((tp) this).field_A;
                  if (-1048577 <= ((tp) this).field_u) {
                    ((tp) this).field_u = 1048576;
                    if (!((tp) this).field_x) {
                      ((tp) this).field_A = 0;
                      if (!((tp) this).field_w) {
                        L4: {
                          if (null != ((tp) this).field_r) {
                            ((tp) this).field_t.c(28013);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((tp) this).field_r = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (((tp) this).field_u > 0) {
                      break L3;
                    } else {
                      ((tp) this).field_u = 0;
                      if (!((tp) this).field_x) {
                        ((tp) this).field_A = 0;
                        if (((tp) this).field_w) {
                          break L3;
                        } else {
                          L5: {
                            if (((tp) this).field_l == null) {
                              break L5;
                            } else {
                              ((tp) this).field_v.c(28013);
                              break L5;
                            }
                          }
                          ((tp) this).field_l = null;
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
                  stackOut_32_0 = param2 << 1;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (((tp) this).field_o < 256) {
                  L8: {
                    if (((tp) this).field_l != null) {
                      break L8;
                    } else {
                      if (((tp) this).field_r == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((tp) this).field_v.a(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (((tp) this).field_z == null) {
                            break L10;
                          } else {
                            if (var6 <= ((tp) this).field_z.length) {
                              gp.a(((tp) this).field_z, 0, var6);
                              gp.a(((tp) this).field_q, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((tp) this).field_q = new int[var6];
                        ((tp) this).field_z = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((tp) this).field_v.a(((tp) this).field_z, 0, param2);
                        ((tp) this).field_t.a(((tp) this).field_q, 0, param2);
                        if (qf.field_l) {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          stackOut_47_0 = param1;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (((tp) this).field_q[var8] * var5 + var4_int * ((tp) this).field_z[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((tp) this).field_t.a(param0, param1, param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null == ((tp) this).field_n) {
                  break L13;
                } else {
                  if (((tp) this).field_o != 0) {
                    L14: {
                      L15: {
                        if (null == ((tp) this).field_z) {
                          break L15;
                        } else {
                          if (var6 <= ((tp) this).field_z.length) {
                            gp.a(((tp) this).field_z, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((tp) this).field_z = new int[var6];
                      ((tp) this).field_q = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((tp) this).field_s.a(((tp) this).field_z, 0, param2);
                      if (qf.field_l) {
                        param1 = param1 << 1;
                        stackOut_63_0 = param1 << 1;
                        stackIn_64_0 = stackOut_63_0;
                        break L16;
                      } else {
                        stackOut_62_0 = param1;
                        stackIn_64_0 = stackOut_62_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_64_0;
                    var8 = ((tp) this).field_o * ((tp) this).field_y / 256;
                    var9 = -var8 + ((tp) this).field_y;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var10 + var7] = param0[var7 - -var10] * var9 - -(var8 * ((tp) this).field_z[var10]) >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var4;
            stackOut_68_1 = new StringBuilder().append("tp.J(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0, dj param1) {
        mb var2 = null;
        try {
            mb.a(param1.a("", -121, "headers.packvorbis"));
            var2 = mb.a(param1, "jagex logo2.packvorbis", "");
            gi discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "tp.C(" + 124 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final sp c() {
        return null;
    }

    final static ji c(byte param0) {
        int discarded$0 = 1;
        return new ji(ra.e((byte) -16), df.a());
    }

    final static fn b(byte param0, int param1) {
        if (4 <= rm.field_e.d(-56)) {
            return null;
        }
        if (param0 < 20) {
            field_m = null;
        }
        tm var2 = new tm(param1);
        rm.field_e.a(0, (le) (Object) var2);
        return var2.field_j;
    }

    private final void a(int param0, int param1, rj param2) {
        try {
            param2.a(param0, true, -1);
            param2.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "tp.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + -1 + 41);
        }
    }

    final static vf c(int param0) {
        if (!(null != jo.field_Ob)) {
            jo.field_Ob = new vf(ii.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, ii.field_a.field_I, -1, 2147483647, true);
        }
        int var1 = -78;
        return jo.field_Ob;
    }

    final static void a(int param0, boolean param1, wj param2) {
        try {
            i.a(256, param1, (byte) -115, param2);
            int var3_int = -119 / ((-38 - param0) / 47);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "tp.O(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void d(int param0) {
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final static void a(vn[] param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            si.field_Ub = new vn[7];
            vh.field_e = new vn[7];
            pl.field_p = new vn(300, 200);
            si.field_Ub[0] = param0[0];
            vh.field_e[0] = new vn(param0[0].field_w - -20, param0[0].field_t - -10);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("tp.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -10 + 41);
        }
    }

    final sp d() {
        return null;
    }

    final synchronized void a(byte param0, int param1) {
        ((tp) this).field_y = param1;
        if (param0 != 122) {
            ((tp) this).field_y = -6;
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (0 < ((tp) this).field_u) {
            if (((tp) this).field_l != null) {
              ((tp) this).field_v.a(param0);
              if (1048576 > ((tp) this).field_u) {
                if (((tp) this).field_r != null) {
                  ((tp) this).field_t.a(param0);
                  if (0 >= ((tp) this).field_o) {
                    break L0;
                  } else {
                    if (null == ((tp) this).field_n) {
                      break L0;
                    } else {
                      ((tp) this).field_s.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= ((tp) this).field_o) {
                    break L0;
                  } else {
                    if (null == ((tp) this).field_n) {
                      break L0;
                    } else {
                      ((tp) this).field_s.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= ((tp) this).field_o) {
                  break L0;
                } else {
                  if (null == ((tp) this).field_n) {
                    break L0;
                  } else {
                    ((tp) this).field_s.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (1048576 > ((tp) this).field_u) {
                if (((tp) this).field_r != null) {
                  ((tp) this).field_t.a(param0);
                  if (0 >= ((tp) this).field_o) {
                    break L0;
                  } else {
                    if (null == ((tp) this).field_n) {
                      break L0;
                    } else {
                      ((tp) this).field_s.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= ((tp) this).field_o) {
                    break L0;
                  } else {
                    if (null == ((tp) this).field_n) {
                      break L0;
                    } else {
                      ((tp) this).field_s.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= ((tp) this).field_o) {
                  break L0;
                } else {
                  if (null == ((tp) this).field_n) {
                    break L0;
                  } else {
                    ((tp) this).field_s.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (1048576 <= ((tp) this).field_u) {
              if (0 >= ((tp) this).field_o) {
                break L0;
              } else {
                if (null != ((tp) this).field_n) {
                  ((tp) this).field_s.a(param0);
                  break L0;
                } else {
                  if (0 >= ((tp) this).field_o) {
                    break L0;
                  } else {
                    if (null == ((tp) this).field_n) {
                      break L0;
                    } else {
                      ((tp) this).field_s.a(param0);
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (0 >= ((tp) this).field_o) {
                break L0;
              } else {
                if (null == ((tp) this).field_n) {
                  break L0;
                } else {
                  ((tp) this).field_s.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (!((tp) this).field_x) {
            break L1;
          } else {
            L2: {
              if (0 >= ((tp) this).field_A) {
                break L2;
              } else {
                if (((tp) this).field_v.c((byte) -34)) {
                  break L2;
                } else {
                  ((tp) this).field_l = null;
                  ((tp) this).field_x = false;
                  ((tp) this).field_A = -((tp) this).field_A;
                  break L1;
                }
              }
            }
            if (((tp) this).field_A >= 0) {
              break L1;
            } else {
              if (!((tp) this).field_t.c((byte) -34)) {
                ((tp) this).field_x = false;
                ((tp) this).field_A = -((tp) this).field_A;
                ((tp) this).field_r = null;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (((tp) this).field_A != 0) {
            ((tp) this).field_u = ((tp) this).field_u + ((tp) this).field_A * param0;
            if (1048576 <= ((tp) this).field_u) {
              ((tp) this).field_u = 1048576;
              if (!((tp) this).field_x) {
                ((tp) this).field_A = 0;
                if (!((tp) this).field_w) {
                  L4: {
                    if (null == ((tp) this).field_r) {
                      break L4;
                    } else {
                      ((tp) this).field_t.c(28013);
                      break L4;
                    }
                  }
                  ((tp) this).field_r = null;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (((tp) this).field_u > 0) {
                break L3;
              } else {
                ((tp) this).field_u = 0;
                if (((tp) this).field_x) {
                  break L3;
                } else {
                  ((tp) this).field_A = 0;
                  if (!((tp) this).field_w) {
                    L5: {
                      if (((tp) this).field_l == null) {
                        break L5;
                      } else {
                        ((tp) this).field_v.c(28013);
                        break L5;
                      }
                    }
                    ((tp) this).field_l = null;
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

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
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (((oj) this).field_v <= 0) {
              ((oj) this).d(param2);
              return;
            } else {
              L1: {
                if (((oj) this).field_t) {
                  L2: {
                    if (((oj) this).field_z <= 0) {
                      break L2;
                    } else {
                      if (!((oj) this).field_s.a((byte) -88)) {
                        ((oj) this).field_z = -((oj) this).field_z;
                        ((oj) this).field_y = null;
                        ((oj) this).field_t = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((oj) this).field_z >= 0) {
                    break L1;
                  } else {
                    if (!((oj) this).field_k.a((byte) -125)) {
                      ((oj) this).field_w = null;
                      ((oj) this).field_z = -((oj) this).field_z;
                      ((oj) this).field_t = false;
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
                var4_int = (((oj) this).field_o >> 12) * ((oj) this).field_v / 256;
                var5 = -var4_int + ((oj) this).field_v;
                if (((oj) this).field_z != 0) {
                  ((oj) this).field_o = ((oj) this).field_o + ((oj) this).field_z * param2;
                  if (((oj) this).field_o < 1048576) {
                    if (((oj) this).field_o > 0) {
                      break L3;
                    } else {
                      ((oj) this).field_o = 0;
                      if (((oj) this).field_t) {
                        break L3;
                      } else {
                        ((oj) this).field_z = 0;
                        if (((oj) this).field_p) {
                          break L3;
                        } else {
                          L4: {
                            if (null == ((oj) this).field_y) {
                              break L4;
                            } else {
                              ((oj) this).field_s.f(16);
                              break L4;
                            }
                          }
                          ((oj) this).field_y = null;
                          break L3;
                        }
                      }
                    }
                  } else {
                    ((oj) this).field_o = 1048576;
                    if (((oj) this).field_t) {
                      break L3;
                    } else {
                      ((oj) this).field_z = 0;
                      if (!((oj) this).field_p) {
                        L5: {
                          if (null == ((oj) this).field_w) {
                            break L5;
                          } else {
                            ((oj) this).field_k.f(16);
                            break L5;
                          }
                        }
                        ((oj) this).field_w = null;
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
                if (((oj) this).field_x < 256) {
                  L8: {
                    if (null != ((oj) this).field_y) {
                      break L8;
                    } else {
                      if (((oj) this).field_w == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 == 256) {
                      ((oj) this).field_k.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (null == ((oj) this).field_q) {
                            break L10;
                          } else {
                            if (~((oj) this).field_q.length > ~var6) {
                              break L10;
                            } else {
                              ji.a(((oj) this).field_q, 0, var6);
                              ji.a(((oj) this).field_r, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((oj) this).field_q = new int[var6];
                        ((oj) this).field_r = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((oj) this).field_s.b(((oj) this).field_q, 0, param2);
                        ((oj) this).field_k.b(((oj) this).field_r, 0, param2);
                        if (!qh.field_g) {
                          stackOut_47_0 = param1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (((oj) this).field_r[var8] * var5 + ((oj) this).field_q[var8] * var4_int >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((oj) this).field_s.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null == ((oj) this).field_n) {
                  break L13;
                } else {
                  if (((oj) this).field_x == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((oj) this).field_q == null) {
                          break L15;
                        } else {
                          if (~var6 >= ~((oj) this).field_q.length) {
                            ji.a(((oj) this).field_q, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((oj) this).field_r = new int[var6];
                      ((oj) this).field_q = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((oj) this).field_l.b(((oj) this).field_q, 0, param2);
                      if (!qh.field_g) {
                        stackOut_61_0 = param1;
                        stackIn_62_0 = stackOut_61_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_60_0 = param1 << 1;
                        stackIn_62_0 = stackOut_60_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_62_0;
                    var8 = ((oj) this).field_x * ((oj) this).field_v / 256;
                    var9 = ((oj) this).field_v - var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var8 * ((oj) this).field_q[var10] + var9 * param0[var10 + var7] >> 8;
                        var10++;
                        continue L17;
                      }
                    }
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
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("oj.K(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L18;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 <= 35) {
            field_u = null;
        }
        field_u = null;
    }

    final synchronized int b() {
        return 2;
    }

    final static void a(ti param0) {
        try {
            og.a((byte) 92);
            sb.a(param0.field_w, param0.field_r, param0.field_s);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "oj.D(" + (param0 != null ? "{...}" : "null") + 44 + 256 + 41);
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        lc stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        lc stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        lc stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        lc stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        lc stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        lc stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
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
              if (!((oj) this).field_t) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    if (0 < ((oj) this).field_z) {
                      L3: {
                        if (((oj) this).field_y != null) {
                          ((oj) this).field_s.f(16);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((oj) this).field_y = param4;
                      if (param4 == null) {
                        break L2;
                      } else {
                        ((oj) this).field_s.a(123, false, param4);
                        this.a(param3, (byte) -99, ((oj) this).field_s, param2);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((oj) this).field_w == null) {
                          break L4;
                        } else {
                          ((oj) this).field_k.f(16);
                          break L4;
                        }
                      }
                      ((oj) this).field_w = param4;
                      if (param4 != null) {
                        ((oj) this).field_k.a(-68, false, param4);
                        this.a(param3, (byte) -62, ((oj) this).field_k, param2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param1) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L5;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
            ((oj) this).field_t = stackIn_19_1 != 0;
            if (param4 == ((oj) this).field_y) {
              ((oj) this).field_z = param0;
              this.a(param3, (byte) -91, ((oj) this).field_s, param2);
              return;
            } else {
              if (((oj) this).field_w != param4) {
                L6: {
                  if (null != ((oj) this).field_y) {
                    if (((oj) this).field_w == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (524288 <= ((oj) this).field_o) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L7;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_31_0 = stackOut_29_0;
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
                      if (((oj) this).field_y == null) {
                        break L9;
                      } else {
                        ((oj) this).field_s.f(16);
                        break L9;
                      }
                    }
                    L10: {
                      ((oj) this).field_y = param4;
                      if (param4 != null) {
                        L11: {
                          stackOut_47_0 = ((oj) this).field_s;
                          stackOut_47_1 = 125;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          if (param1) {
                            stackOut_49_0 = (lc) (Object) stackIn_49_0;
                            stackOut_49_1 = stackIn_49_1;
                            stackOut_49_2 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            stackIn_50_2 = stackOut_49_2;
                            break L11;
                          } else {
                            stackOut_48_0 = (lc) (Object) stackIn_48_0;
                            stackOut_48_1 = stackIn_48_1;
                            stackOut_48_2 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            stackIn_50_1 = stackOut_48_1;
                            stackIn_50_2 = stackOut_48_2;
                            break L11;
                          }
                        }
                        ((lc) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, param4);
                        this.a(param3, (byte) -61, ((oj) this).field_s, param2);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((oj) this).field_z = param0;
                    break L8;
                  } else {
                    L12: {
                      if (null == ((oj) this).field_w) {
                        break L12;
                      } else {
                        ((oj) this).field_k.f(16);
                        break L12;
                      }
                    }
                    L13: {
                      ((oj) this).field_w = param4;
                      if (param4 != null) {
                        L14: {
                          stackOut_38_0 = ((oj) this).field_k;
                          stackOut_38_1 = 124;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          if (param1) {
                            stackOut_40_0 = (lc) (Object) stackIn_40_0;
                            stackOut_40_1 = stackIn_40_1;
                            stackOut_40_2 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            break L14;
                          } else {
                            stackOut_39_0 = (lc) (Object) stackIn_39_0;
                            stackOut_39_1 = stackIn_39_1;
                            stackOut_39_2 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            break L14;
                          }
                        }
                        ((lc) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, param4);
                        this.a(param3, (byte) -96, ((oj) this).field_k, param2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ((oj) this).field_z = -param0;
                    break L8;
                  }
                }
                var8 = 100 / ((25 - param5) / 62);
                break L0;
              } else {
                ((oj) this).field_z = -param0;
                this.a(param3, (byte) -126, ((oj) this).field_k, param2);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var7;
            stackOut_54_1 = new StringBuilder().append("oj.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param4 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L15;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L15;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param5 + 41);
        }
    }

    final ag a() {
        return null;
    }

    final static uj a(byte param0) {
        if (jh.field_n == rh.field_v) {
            throw new IllegalStateException();
        }
        if (rh.field_v != gd.field_l) {
            return null;
        }
        rh.field_v = jh.field_n;
        return q.field_h;
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (0 >= ((oj) this).field_o) {
            if (-1048577 <= ((oj) this).field_o) {
              break L0;
            } else {
              if (((oj) this).field_w == null) {
                break L0;
              } else {
                ((oj) this).field_k.d(param0);
                break L0;
              }
            }
          } else {
            if (-1048577 >= ((oj) this).field_o) {
              break L0;
            } else {
              if (((oj) this).field_w == null) {
                break L0;
              } else {
                ((oj) this).field_k.d(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((oj) this).field_x) {
            break L1;
          } else {
            if (null != ((oj) this).field_n) {
              ((oj) this).field_l.d(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((oj) this).field_t) {
            if (((oj) this).field_z > 0) {
              if (!((oj) this).field_s.a((byte) -35)) {
                ((oj) this).field_z = -((oj) this).field_z;
                ((oj) this).field_y = null;
                ((oj) this).field_t = false;
                break L2;
              } else {
                if (((oj) this).field_z >= 0) {
                  break L2;
                } else {
                  if (((oj) this).field_k.a((byte) -110)) {
                    break L2;
                  } else {
                    ((oj) this).field_w = null;
                    ((oj) this).field_t = false;
                    ((oj) this).field_z = -((oj) this).field_z;
                    break L2;
                  }
                }
              }
            } else {
              if (((oj) this).field_z >= 0) {
                break L2;
              } else {
                if (((oj) this).field_k.a((byte) -110)) {
                  break L2;
                } else {
                  ((oj) this).field_w = null;
                  ((oj) this).field_t = false;
                  ((oj) this).field_z = -((oj) this).field_z;
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (((oj) this).field_z == 0) {
            break L3;
          } else {
            ((oj) this).field_o = ((oj) this).field_o + param0 * ((oj) this).field_z;
            if (1048576 > ((oj) this).field_o) {
              if (((oj) this).field_o > 0) {
                break L3;
              } else {
                ((oj) this).field_o = 0;
                if (((oj) this).field_t) {
                  break L3;
                } else {
                  ((oj) this).field_z = 0;
                  if (((oj) this).field_p) {
                    break L3;
                  } else {
                    L4: {
                      if (null == ((oj) this).field_y) {
                        break L4;
                      } else {
                        ((oj) this).field_s.f(16);
                        break L4;
                      }
                    }
                    ((oj) this).field_y = null;
                    break L3;
                  }
                }
              }
            } else {
              ((oj) this).field_o = 1048576;
              if (((oj) this).field_t) {
                break L3;
              } else {
                ((oj) this).field_z = 0;
                if (((oj) this).field_p) {
                  break L3;
                } else {
                  L5: {
                    if (((oj) this).field_w != null) {
                      ((oj) this).field_k.f(16);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((oj) this).field_w = null;
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
            ((oj) this).field_q = null;
        }
        ((oj) this).field_v = param0;
    }

    private final void a(int param0, byte param1, lc param2, int param3) {
        try {
            if (param1 > -58) {
                ag discarded$0 = ((oj) this).d();
            }
            param2.c(-1, param3, 0);
            param2.a(true, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "oj.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private oj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new tf(11, 0, 1, 2);
        field_u = new qj();
    }
}

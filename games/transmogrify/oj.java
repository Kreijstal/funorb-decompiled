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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        if (((oj) this).field_v >= -1) {
          ((oj) this).d(param2);
          return;
        } else {
          L0: {
            if (((oj) this).field_t) {
              L1: {
                if (-1 >= ((oj) this).field_z) {
                  break L1;
                } else {
                  if (!((oj) this).field_s.a((byte) -88)) {
                    ((oj) this).field_z = -((oj) this).field_z;
                    ((oj) this).field_y = null;
                    ((oj) this).field_t = false;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((oj) this).field_z >= 0) {
                break L0;
              } else {
                if (!((oj) this).field_k.a((byte) -125)) {
                  ((oj) this).field_w = null;
                  ((oj) this).field_z = -((oj) this).field_z;
                  ((oj) this).field_t = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = (((oj) this).field_o >> 1423531820) * ((oj) this).field_v / 256;
            var5 = -var4 + ((oj) this).field_v;
            if (((oj) this).field_z != 0) {
              ((oj) this).field_o = ((oj) this).field_o + ((oj) this).field_z * param2;
              if (((oj) this).field_o < 1048576) {
                if (-1 > (((oj) this).field_o ^ -1)) {
                  break L2;
                } else {
                  ((oj) this).field_o = 0;
                  if (((oj) this).field_t) {
                    break L2;
                  } else {
                    ((oj) this).field_z = 0;
                    if (((oj) this).field_p) {
                      break L2;
                    } else {
                      L3: {
                        if (null == ((oj) this).field_y) {
                          break L3;
                        } else {
                          ((oj) this).field_s.f(16);
                          break L3;
                        }
                      }
                      ((oj) this).field_y = null;
                      break L2;
                    }
                  }
                }
              } else {
                ((oj) this).field_o = 1048576;
                if (((oj) this).field_t) {
                  break L2;
                } else {
                  ((oj) this).field_z = 0;
                  if (!((oj) this).field_p) {
                    L4: {
                      if (null == ((oj) this).field_w) {
                        break L4;
                      } else {
                        ((oj) this).field_k.f(16);
                        break L4;
                      }
                    }
                    ((oj) this).field_w = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (qh.field_g) {
              stackOut_30_0 = param2 << -1141439167;
              stackIn_31_0 = stackOut_30_0;
              break L5;
            } else {
              stackOut_29_0 = param2;
              stackIn_31_0 = stackOut_29_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_31_0;
            if (((oj) this).field_x < 256) {
              L7: {
                if (null != ((oj) this).field_y) {
                  break L7;
                } else {
                  if (((oj) this).field_w == null) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (var4 != 256) {
                if ((var5 ^ -1) == -257) {
                  ((oj) this).field_k.b(param0, param1, param2);
                  break L6;
                } else {
                  L8: {
                    L9: {
                      if (null == ((oj) this).field_q) {
                        break L9;
                      } else {
                        if (((oj) this).field_q.length < var6) {
                          break L9;
                        } else {
                          ji.a(((oj) this).field_q, 0, var6);
                          ji.a(((oj) this).field_r, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((oj) this).field_q = new int[var6];
                    ((oj) this).field_r = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((oj) this).field_s.b(((oj) this).field_q, 0, param2);
                    ((oj) this).field_k.b(((oj) this).field_r, 0, param2);
                    if (!qh.field_g) {
                      stackOut_45_0 = param1;
                      stackIn_46_0 = stackOut_45_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_44_0 = param1 << 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_46_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((oj) this).field_r[var8] * var5 + ((oj) this).field_q[var8] * var4 >> 306189320);
                      var8++;
                      continue L11;
                    }
                  }
                }
              } else {
                ((oj) this).field_s.b(param0, param1, param2);
                break L6;
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (null == ((oj) this).field_n) {
              break L12;
            } else {
              if (((oj) this).field_x == 0) {
                break L12;
              } else {
                L13: {
                  L14: {
                    if (((oj) this).field_q == null) {
                      break L14;
                    } else {
                      if (var6 <= ((oj) this).field_q.length) {
                        ji.a(((oj) this).field_q, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((oj) this).field_r = new int[var6];
                  ((oj) this).field_q = new int[var6];
                  break L13;
                }
                L15: {
                  ((oj) this).field_l.b(((oj) this).field_q, 0, param2);
                  if (!qh.field_g) {
                    stackOut_59_0 = param1;
                    stackIn_60_0 = stackOut_59_0;
                    break L15;
                  } else {
                    param1 = param1 << 1;
                    stackOut_58_0 = param1 << 1;
                    stackIn_60_0 = stackOut_58_0;
                    break L15;
                  }
                }
                var7 = stackIn_60_0;
                var8 = ((oj) this).field_x * ((oj) this).field_v / 256;
                var9 = ((oj) this).field_v - var8;
                var10 = 0;
                L16: while (true) {
                  if (var6 <= var10) {
                    break L12;
                  } else {
                    param0[var10 + var7] = var8 * ((oj) this).field_q[var10] + var9 * param0[var10 + var7] >> 769063560;
                    var10++;
                    continue L16;
                  }
                }
              }
            }
          }
          return;
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

    final static void a(ti param0, int param1) {
        og.a((byte) 92);
        if (param1 != 256) {
            uj discarded$0 = oj.a((byte) 117);
        }
        sb.a(param0.field_w, param0.field_r, param0.field_s);
    }

    final synchronized void a(int param0, boolean param1, int param2, int param3, pl param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_28_0 = 0;
        lc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        lc stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        lc stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        lc stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        lc stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        lc stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        lc stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        lc stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        lc stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        lc stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        lc stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        lc stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        L0: {
          var9 = Transmogrify.field_A ? 1 : 0;
          if (!((oj) this).field_t) {
            break L0;
          } else {
            if (param1) {
              L1: {
                if (0 < ((oj) this).field_z) {
                  L2: {
                    if (((oj) this).field_y != null) {
                      ((oj) this).field_s.f(16);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((oj) this).field_y = param4;
                  if (param4 == null) {
                    break L1;
                  } else {
                    ((oj) this).field_s.a(123, false, param4);
                    this.a(param3, (byte) -99, ((oj) this).field_s, param2);
                    break L1;
                  }
                } else {
                  L3: {
                    if (((oj) this).field_w == null) {
                      break L3;
                    } else {
                      ((oj) this).field_k.f(16);
                      break L3;
                    }
                  }
                  ((oj) this).field_w = param4;
                  if (param4 != null) {
                    ((oj) this).field_k.a(-68, false, param4);
                    this.a(param3, (byte) -62, ((oj) this).field_k, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param1) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L4;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L4;
          }
        }
        ((oj) this).field_t = stackIn_18_1 != 0;
        if (param4 == ((oj) this).field_y) {
          ((oj) this).field_z = param0;
          this.a(param3, (byte) -91, ((oj) this).field_s, param2);
          return;
        } else {
          if (((oj) this).field_w != param4) {
            L5: {
              if (null != ((oj) this).field_y) {
                if (((oj) this).field_w == null) {
                  var7 = 0;
                  break L5;
                } else {
                  L6: {
                    if (524288 <= ((oj) this).field_o) {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      break L6;
                    } else {
                      stackOut_26_0 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      break L6;
                    }
                  }
                  var7 = stackIn_28_0;
                  break L5;
                }
              } else {
                var7 = 1;
                break L5;
              }
            }
            L7: {
              if (var7 != 0) {
                L8: {
                  if (((oj) this).field_y == null) {
                    break L8;
                  } else {
                    ((oj) this).field_s.f(16);
                    break L8;
                  }
                }
                L9: {
                  ((oj) this).field_y = param4;
                  if (param4 != null) {
                    L10: {
                      stackOut_44_0 = ((oj) this).field_s;
                      stackOut_44_1 = 125;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      if (param1) {
                        stackOut_46_0 = (lc) (Object) stackIn_46_0;
                        stackOut_46_1 = stackIn_46_1;
                        stackOut_46_2 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        break L10;
                      } else {
                        stackOut_45_0 = (lc) (Object) stackIn_45_0;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        stackIn_47_2 = stackOut_45_2;
                        break L10;
                      }
                    }
                    ((lc) (Object) stackIn_47_0).a(stackIn_47_1, stackIn_47_2 != 0, param4);
                    this.a(param3, (byte) -61, ((oj) this).field_s, param2);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((oj) this).field_z = param0;
                break L7;
              } else {
                L11: {
                  if (null == ((oj) this).field_w) {
                    break L11;
                  } else {
                    ((oj) this).field_k.f(16);
                    break L11;
                  }
                }
                L12: {
                  ((oj) this).field_w = param4;
                  if (param4 != null) {
                    L13: {
                      stackOut_35_0 = ((oj) this).field_k;
                      stackOut_35_1 = 124;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      if (param1) {
                        stackOut_37_0 = (lc) (Object) stackIn_37_0;
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        break L13;
                      } else {
                        stackOut_36_0 = (lc) (Object) stackIn_36_0;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        break L13;
                      }
                    }
                    ((lc) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2 != 0, param4);
                    this.a(param3, (byte) -96, ((oj) this).field_k, param2);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                ((oj) this).field_z = -param0;
                break L7;
              }
            }
            var8 = 100 / ((25 - param5) / 62);
            return;
          } else {
            ((oj) this).field_z = -param0;
            this.a(param3, (byte) -126, ((oj) this).field_k, param2);
            return;
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
        field_m = null;
        return null;
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
            if ((((oj) this).field_z ^ -1) < -1) {
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
              if ((((oj) this).field_o ^ -1) < -1) {
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
        if (param1 > -58) {
            ag discarded$0 = ((oj) this).d();
        }
        param2.c(-1, param3, 0);
        param2.a(true, param0);
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

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
        gj.a("", param0, true);
        if (param1 != 22770) {
            int discarded$0 = vi.b((byte) -76);
        }
        vf.a(param0, param1 ^ 21565);
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, ua param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_31_0 = 0;
        ti stackIn_37_0 = null;
        ua stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        ti stackIn_38_0 = null;
        ua stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        ti stackIn_39_0 = null;
        ua stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        ti stackIn_46_0 = null;
        ua stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        ti stackIn_47_0 = null;
        ua stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        ti stackIn_48_0 = null;
        ua stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        ti stackOut_45_0 = null;
        ua stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        ti stackOut_47_0 = null;
        ua stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        ti stackOut_46_0 = null;
        ua stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        ti stackOut_36_0 = null;
        ua stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        ti stackOut_38_0 = null;
        ua stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        ti stackOut_37_0 = null;
        ua stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (!((vi) this).field_r) {
            break L0;
          } else {
            if (param1) {
              L1: {
                if ((((vi) this).field_u ^ -1) < -1) {
                  L2: {
                    if (null != ((vi) this).field_q) {
                      ((vi) this).field_x.g(-84);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((vi) this).field_q = param4;
                  if (param4 != null) {
                    ((vi) this).field_x.a(param4, -39, false);
                    this.a(-24762, param5, param0, ((vi) this).field_x);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (((vi) this).field_A == null) {
                      break L3;
                    } else {
                      ((vi) this).field_H.g(-29);
                      break L3;
                    }
                  }
                  ((vi) this).field_A = param4;
                  if (param4 == null) {
                    return;
                  } else {
                    ((vi) this).field_H.a(param4, -39, false);
                    this.a(-24762, param5, param0, ((vi) this).field_H);
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
        ((vi) this).field_r = stackIn_18_1 != 0;
        if (param4 == ((vi) this).field_q) {
          ((vi) this).field_u = param2;
          this.a(-24762, param5, param0, ((vi) this).field_x);
          return;
        } else {
          if (((vi) this).field_A != param4) {
            L5: {
              if (param3 >= 110) {
                break L5;
              } else {
                ((vi) this).field_B = null;
                break L5;
              }
            }
            L6: {
              if (((vi) this).field_q != null) {
                if (null != ((vi) this).field_A) {
                  L7: {
                    if (-524289 >= (((vi) this).field_z ^ -1)) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L7;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_31_0;
                  break L6;
                } else {
                  var7 = 0;
                  break L6;
                }
              } else {
                var7 = 1;
                break L6;
              }
            }
            L8: {
              if (var7 == 0) {
                L9: {
                  if (null != ((vi) this).field_A) {
                    ((vi) this).field_H.g(-8);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((vi) this).field_A = param4;
                  if (param4 == null) {
                    break L10;
                  } else {
                    L11: {
                      stackOut_45_0 = ((vi) this).field_H;
                      stackOut_45_1 = (ua) param4;
                      stackOut_45_2 = -39;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_47_2 = stackOut_45_2;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      stackIn_46_2 = stackOut_45_2;
                      if (param1) {
                        stackOut_47_0 = (ti) (Object) stackIn_47_0;
                        stackOut_47_1 = (ua) (Object) stackIn_47_1;
                        stackOut_47_2 = stackIn_47_2;
                        stackOut_47_3 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        stackIn_48_3 = stackOut_47_3;
                        break L11;
                      } else {
                        stackOut_46_0 = (ti) (Object) stackIn_46_0;
                        stackOut_46_1 = (ua) (Object) stackIn_46_1;
                        stackOut_46_2 = stackIn_46_2;
                        stackOut_46_3 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_48_2 = stackOut_46_2;
                        stackIn_48_3 = stackOut_46_3;
                        break L11;
                      }
                    }
                    ((ti) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2, stackIn_48_3 != 0);
                    this.a(-24762, param5, param0, ((vi) this).field_H);
                    break L10;
                  }
                }
                ((vi) this).field_u = -param2;
                break L8;
              } else {
                L12: {
                  if (null == ((vi) this).field_q) {
                    break L12;
                  } else {
                    ((vi) this).field_x.g(127);
                    break L12;
                  }
                }
                L13: {
                  ((vi) this).field_q = param4;
                  if (param4 == null) {
                    break L13;
                  } else {
                    L14: {
                      stackOut_36_0 = ((vi) this).field_x;
                      stackOut_36_1 = (ua) param4;
                      stackOut_36_2 = -39;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      if (param1) {
                        stackOut_38_0 = (ti) (Object) stackIn_38_0;
                        stackOut_38_1 = (ua) (Object) stackIn_38_1;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        stackIn_39_3 = stackOut_38_3;
                        break L14;
                      } else {
                        stackOut_37_0 = (ti) (Object) stackIn_37_0;
                        stackOut_37_1 = (ua) (Object) stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        break L14;
                      }
                    }
                    ((ti) (Object) stackIn_39_0).a(stackIn_39_1, stackIn_39_2, stackIn_39_3 != 0);
                    this.a(-24762, param5, param0, ((vi) this).field_x);
                    break L13;
                  }
                }
                ((vi) this).field_u = param2;
                break L8;
              }
            }
            return;
          } else {
            ((vi) this).field_u = -param2;
            this.a(-24762, param5, param0, ((vi) this).field_H);
            return;
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
        if (param0 != -24762) {
            Object var6 = null;
            vi.a((java.applet.Applet) null, -8);
        }
        param3.b(param1, false, -1);
        param3.c(param2, 274191016);
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
        ((vi) this).field_x = param0;
        ((vi) this).field_H = param2;
        if (param1 != 26) {
            Object var5 = null;
            this.a(-61, 2, 126, (ti) null);
        }
        ((vi) this).field_z = 1048576;
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 2) {
            field_y = null;
        }
        ((vi) this).field_D = param0;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if ((((vi) this).field_z ^ -1) >= -1) {
            break L0;
          } else {
            if (null != ((vi) this).field_q) {
              ((vi) this).field_x.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= ((vi) this).field_z) {
            break L1;
          } else {
            if (null != ((vi) this).field_A) {
              ((vi) this).field_H.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (-1 <= (((vi) this).field_I ^ -1)) {
            break L2;
          } else {
            if (((vi) this).field_G == null) {
              break L2;
            } else {
              ((vi) this).field_t.a(param0);
              break L2;
            }
          }
        }
        L3: {
          if (((vi) this).field_r) {
            L4: {
              if ((((vi) this).field_u ^ -1) >= -1) {
                break L4;
              } else {
                if (!((vi) this).field_x.a((byte) -76)) {
                  ((vi) this).field_r = false;
                  ((vi) this).field_u = -((vi) this).field_u;
                  ((vi) this).field_q = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (-1 >= (((vi) this).field_u ^ -1)) {
              break L3;
            } else {
              if (!((vi) this).field_H.a((byte) 112)) {
                ((vi) this).field_r = false;
                ((vi) this).field_u = -((vi) this).field_u;
                ((vi) this).field_A = null;
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if ((((vi) this).field_u ^ -1) == -1) {
            break L5;
          } else {
            L6: {
              ((vi) this).field_z = ((vi) this).field_z + ((vi) this).field_u * param0;
              if (((vi) this).field_z < 1048576) {
                if (((vi) this).field_z <= 0) {
                  ((vi) this).field_z = 0;
                  if (((vi) this).field_r) {
                    break L6;
                  } else {
                    ((vi) this).field_u = 0;
                    if (((vi) this).field_w) {
                      break L6;
                    } else {
                      L7: {
                        if (null != ((vi) this).field_q) {
                          ((vi) this).field_x.g(-104);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((vi) this).field_q = null;
                      break L6;
                    }
                  }
                } else {
                  break L5;
                }
              } else {
                ((vi) this).field_z = 1048576;
                if (((vi) this).field_r) {
                  break L6;
                } else {
                  ((vi) this).field_u = 0;
                  if (!((vi) this).field_w) {
                    L8: {
                      if (((vi) this).field_A != null) {
                        ((vi) this).field_H.g(-3);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((vi) this).field_A = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            break L5;
          }
        }
    }

    final static tf[] a(fm param0, int param1, String param2, String param3) {
        int var4 = param0.a(127, param3);
        int var5 = param0.a((byte) -114, param2, var4);
        if (param1 != 20049) {
            return null;
        }
        return se.a(var5, var4, 1000, param0);
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == -109) {
          L0: {
            if (mc.field_r == null) {
              break L0;
            } else {
              var1 = (Object) (Object) mc.field_r;
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
        pj var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        pj[] var1 = up.field_n;
        int var2 = 0;
        if (param0 <= 31) {
            field_E = null;
        }
        while (var1.length > var2) {
            var3 = var1[var2];
            var3.a((byte) -70);
            var2++;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_29_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        if (0 < ((vi) this).field_D) {
          L0: {
            if (!((vi) this).field_r) {
              break L0;
            } else {
              L1: {
                if (-1 <= (((vi) this).field_u ^ -1)) {
                  break L1;
                } else {
                  if (((vi) this).field_x.a((byte) 105)) {
                    break L1;
                  } else {
                    ((vi) this).field_q = null;
                    ((vi) this).field_r = false;
                    ((vi) this).field_u = -((vi) this).field_u;
                    break L0;
                  }
                }
              }
              if ((((vi) this).field_u ^ -1) <= -1) {
                break L0;
              } else {
                if (!((vi) this).field_H.a((byte) -83)) {
                  ((vi) this).field_u = -((vi) this).field_u;
                  ((vi) this).field_A = null;
                  ((vi) this).field_r = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = (((vi) this).field_z >> -2133077076) * ((vi) this).field_D / 256;
            var5 = -var4 + ((vi) this).field_D;
            if (((vi) this).field_u == 0) {
              break L2;
            } else {
              ((vi) this).field_z = ((vi) this).field_z + ((vi) this).field_u * param2;
              if (1048576 <= ((vi) this).field_z) {
                ((vi) this).field_z = 1048576;
                if (((vi) this).field_r) {
                  break L2;
                } else {
                  ((vi) this).field_u = 0;
                  if (!((vi) this).field_w) {
                    L3: {
                      if (((vi) this).field_A == null) {
                        break L3;
                      } else {
                        ((vi) this).field_H.g(126);
                        break L3;
                      }
                    }
                    ((vi) this).field_A = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                if (((vi) this).field_z > 0) {
                  break L2;
                } else {
                  ((vi) this).field_z = 0;
                  if (((vi) this).field_r) {
                    break L2;
                  } else {
                    ((vi) this).field_u = 0;
                    if (!((vi) this).field_w) {
                      L4: {
                        if (((vi) this).field_q != null) {
                          ((vi) this).field_x.g(126);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((vi) this).field_q = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (!mm.field_o) {
              stackOut_28_0 = param2;
              stackIn_29_0 = stackOut_28_0;
              break L5;
            } else {
              stackOut_27_0 = param2 << -1864950303;
              stackIn_29_0 = stackOut_27_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_29_0;
            if (((vi) this).field_I >= 256) {
              break L6;
            } else {
              L7: {
                if (((vi) this).field_q != null) {
                  break L7;
                } else {
                  if (null != ((vi) this).field_A) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              if (var4 != 256) {
                if ((var5 ^ -1) != -257) {
                  L8: {
                    L9: {
                      if (null == ((vi) this).field_v) {
                        break L9;
                      } else {
                        if (var6 > ((vi) this).field_v.length) {
                          break L9;
                        } else {
                          qb.a(((vi) this).field_v, 0, var6);
                          qb.a(((vi) this).field_B, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((vi) this).field_B = new int[var6];
                    ((vi) this).field_v = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((vi) this).field_x.b(((vi) this).field_v, 0, param2);
                    ((vi) this).field_H.b(((vi) this).field_B, 0, param2);
                    if (!mm.field_o) {
                      stackOut_43_0 = param1;
                      stackIn_44_0 = stackOut_43_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_42_0 = param1 << 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_44_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((vi) this).field_v[var8] * var4 + var5 * ((vi) this).field_B[var8] >> 580127528);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((vi) this).field_H.b(param0, param1, param2);
                  break L6;
                }
              } else {
                ((vi) this).field_x.b(param0, param1, param2);
                break L6;
              }
            }
          }
          L12: {
            if (null == ((vi) this).field_G) {
              break L12;
            } else {
              if (((vi) this).field_I != 0) {
                L13: {
                  L14: {
                    if (null == ((vi) this).field_v) {
                      break L14;
                    } else {
                      if (((vi) this).field_v.length >= var6) {
                        qb.a(((vi) this).field_v, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((vi) this).field_v = new int[var6];
                  ((vi) this).field_B = new int[var6];
                  break L13;
                }
                L15: {
                  ((vi) this).field_t.b(((vi) this).field_v, 0, param2);
                  if (!mm.field_o) {
                    stackOut_57_0 = param1;
                    stackIn_58_0 = stackOut_57_0;
                    break L15;
                  } else {
                    param1 = param1 << 1;
                    stackOut_56_0 = param1 << 1;
                    stackIn_58_0 = stackOut_56_0;
                    break L15;
                  }
                }
                var7 = stackIn_58_0;
                var8 = ((vi) this).field_D * ((vi) this).field_I / 256;
                var9 = ((vi) this).field_D - var8;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var7 + var10] = var9 * param0[var7 + var10] + var8 * ((vi) this).field_v[var10] >> 1369621256;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        } else {
          ((vi) this).a(param2);
          return;
        }
    }

    public vi() {
        ((vi) this).field_w = false;
        ((vi) this).field_I = 0;
        ((vi) this).field_D = 256;
        ti var1 = new ti();
        this.a(var1, (byte) 26, new ti(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new byte[520];
        field_y = "Passwords must be between 5 and 20 characters long";
        field_J = "Continue";
        field_E = "Perfect Drops: ";
        field_L = "Name is available";
        field_s = "FULL ACCESS";
    }
}

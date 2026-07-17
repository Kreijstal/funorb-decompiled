/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends um {
    private di field_A;
    private int field_C;
    private wh field_F;
    static String field_r;
    private int field_D;
    static String field_x;
    private di field_J;
    private boolean field_I;
    private int[] field_G;
    static int field_y;
    private boolean field_v;
    private wh field_u;
    private int field_B;
    private di field_w;
    private int field_t;
    static int field_z;
    private int[] field_H;
    static boolean[] field_s;
    private wh field_E;

    final synchronized void a(boolean param0, wh param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        di stackIn_38_0 = null;
        di stackIn_39_0 = null;
        di stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        di stackIn_47_0 = null;
        di stackIn_48_0 = null;
        di stackIn_49_0 = null;
        int stackIn_49_1 = 0;
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
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        di stackOut_46_0 = null;
        di stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        di stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        di stackOut_37_0 = null;
        di stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        di stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (!((vd) this).field_I) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    if (((vd) this).field_C > 0) {
                      L3: {
                        if (null == ((vd) this).field_F) {
                          break L3;
                        } else {
                          ((vd) this).field_A.c((byte) 108);
                          break L3;
                        }
                      }
                      ((vd) this).field_F = param1;
                      if (param1 != null) {
                        ((vd) this).field_A.a(false, param1, (byte) 2);
                        this.a(param5, param3, (byte) -117, ((vd) this).field_A);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((vd) this).field_E == null) {
                          break L4;
                        } else {
                          ((vd) this).field_J.c((byte) 108);
                          break L4;
                        }
                      }
                      ((vd) this).field_E = param1;
                      if (param1 != null) {
                        ((vd) this).field_J.a(false, param1, (byte) 2);
                        this.a(param5, param3, (byte) -117, ((vd) this).field_J);
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
              if (!param2) {
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
            ((vd) this).field_I = stackIn_19_1 != 0;
            if (param1 == ((vd) this).field_F) {
              ((vd) this).field_C = param4;
              this.a(param5, param3, (byte) -117, ((vd) this).field_A);
              return;
            } else {
              if (((vd) this).field_E != param1) {
                L6: {
                  if (null == ((vd) this).field_F) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (((vd) this).field_E == null) {
                      var7_int = 0;
                      break L6;
                    } else {
                      L7: {
                        if (((vd) this).field_t >= 524288) {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L7;
                        } else {
                          stackOut_28_0 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_30_0;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var7_int == 0) {
                    L9: {
                      if (((vd) this).field_E != null) {
                        ((vd) this).field_J.c((byte) 108);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      ((vd) this).field_E = param1;
                      if (param1 == null) {
                        break L10;
                      } else {
                        L11: {
                          stackOut_46_0 = ((vd) this).field_J;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_47_0 = stackOut_46_0;
                          if (param2) {
                            stackOut_48_0 = (di) (Object) stackIn_48_0;
                            stackOut_48_1 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            break L11;
                          } else {
                            stackOut_47_0 = (di) (Object) stackIn_47_0;
                            stackOut_47_1 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            break L11;
                          }
                        }
                        ((di) (Object) stackIn_49_0).a(stackIn_49_1 != 0, param1, (byte) 2);
                        this.a(param5, param3, (byte) -117, ((vd) this).field_J);
                        break L10;
                      }
                    }
                    ((vd) this).field_C = -param4;
                    break L8;
                  } else {
                    L12: {
                      if (((vd) this).field_F == null) {
                        break L12;
                      } else {
                        ((vd) this).field_A.c((byte) 108);
                        break L12;
                      }
                    }
                    L13: {
                      ((vd) this).field_F = param1;
                      if (param1 == null) {
                        break L13;
                      } else {
                        L14: {
                          stackOut_37_0 = ((vd) this).field_A;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_38_0 = stackOut_37_0;
                          if (param2) {
                            stackOut_39_0 = (di) (Object) stackIn_39_0;
                            stackOut_39_1 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            break L14;
                          } else {
                            stackOut_38_0 = (di) (Object) stackIn_38_0;
                            stackOut_38_1 = 1;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            break L14;
                          }
                        }
                        ((di) (Object) stackIn_40_0).a(stackIn_40_1 != 0, param1, (byte) 2);
                        this.a(param5, param3, (byte) -117, ((vd) this).field_A);
                        break L13;
                      }
                    }
                    ((vd) this).field_C = param4;
                    break L8;
                  }
                }
                L15: {
                  if (!param0) {
                    break L15;
                  } else {
                    ((vd) this).field_G = null;
                    break L15;
                  }
                }
                break L0;
              } else {
                ((vd) this).field_C = -param4;
                this.a(param5, param3, (byte) -117, ((vd) this).field_J);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var7;
            stackOut_54_1 = new StringBuilder().append("vd.F(").append(param0).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param1 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L16;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L16;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void a(int param0, int param1, byte param2, di param3) {
        try {
            param3.a(param0, true, -1);
            param3.c(param1, -102);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "vd.B(" + param0 + 44 + param1 + 44 + -117 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized void a(int param0, int param1) {
        ((vd) this).field_B = param1;
        if (param0 < 43) {
            ((vd) this).field_G = null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
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
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) lb.field_y);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lb.field_y);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) lb.field_y);
            qd.field_J = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vd.H(").append(-106).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          if (((vd) this).field_t <= 0) {
            if (1048576 > ((vd) this).field_t) {
              if (null == ((vd) this).field_E) {
                break L0;
              } else {
                ((vd) this).field_J.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= ((vd) this).field_t) {
                break L0;
              } else {
                if (null == ((vd) this).field_E) {
                  break L0;
                } else {
                  ((vd) this).field_J.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 <= ((vd) this).field_t) {
              break L0;
            } else {
              if (null == ((vd) this).field_E) {
                break L0;
              } else {
                ((vd) this).field_J.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((vd) this).field_D) {
            break L1;
          } else {
            if (((vd) this).field_u == null) {
              break L1;
            } else {
              ((vd) this).field_w.a(param0);
              break L1;
            }
          }
        }
        L2: {
          if (((vd) this).field_I) {
            L3: {
              if (((vd) this).field_C <= 0) {
                break L3;
              } else {
                if (((vd) this).field_A.b((byte) -114)) {
                  break L3;
                } else {
                  ((vd) this).field_I = false;
                  ((vd) this).field_F = null;
                  ((vd) this).field_C = -((vd) this).field_C;
                  break L2;
                }
              }
            }
            if (((vd) this).field_C >= 0) {
              break L2;
            } else {
              if (!((vd) this).field_J.b((byte) -114)) {
                ((vd) this).field_C = -((vd) this).field_C;
                ((vd) this).field_E = null;
                ((vd) this).field_I = false;
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
          if (0 == ((vd) this).field_C) {
            break L4;
          } else {
            ((vd) this).field_t = ((vd) this).field_t + ((vd) this).field_C * param0;
            if (((vd) this).field_t < 1048576) {
              if (((vd) this).field_t > 0) {
                break L4;
              } else {
                ((vd) this).field_t = 0;
                if (((vd) this).field_I) {
                  break L4;
                } else {
                  ((vd) this).field_C = 0;
                  if (((vd) this).field_v) {
                    break L4;
                  } else {
                    L5: {
                      if (null != ((vd) this).field_F) {
                        ((vd) this).field_A.c((byte) 108);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((vd) this).field_F = null;
                    break L4;
                  }
                }
              }
            } else {
              ((vd) this).field_t = 1048576;
              if (!((vd) this).field_I) {
                ((vd) this).field_C = 0;
                if (((vd) this).field_v) {
                  break L4;
                } else {
                  L6: {
                    if (null == ((vd) this).field_E) {
                      break L6;
                    } else {
                      ((vd) this).field_J.c((byte) 108);
                      break L6;
                    }
                  }
                  ((vd) this).field_E = null;
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    final synchronized int d() {
        return 2;
    }

    final um c() {
        return null;
    }

    public static void e() {
        field_s = null;
        int var1 = 7;
        field_x = null;
        field_r = null;
    }

    final um b() {
        return null;
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
        int stackIn_38_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (((vd) this).field_B <= 0) {
              ((vd) this).a(param2);
              return;
            } else {
              L1: {
                if (!((vd) this).field_I) {
                  break L1;
                } else {
                  L2: {
                    if (((vd) this).field_C <= 0) {
                      break L2;
                    } else {
                      if (!((vd) this).field_A.b((byte) -114)) {
                        ((vd) this).field_F = null;
                        ((vd) this).field_I = false;
                        ((vd) this).field_C = -((vd) this).field_C;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((vd) this).field_C >= 0) {
                    break L1;
                  } else {
                    if (!((vd) this).field_J.b((byte) -114)) {
                      ((vd) this).field_E = null;
                      ((vd) this).field_I = false;
                      ((vd) this).field_C = -((vd) this).field_C;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = ((vd) this).field_B * (((vd) this).field_t >> 12) / 256;
                var5 = ((vd) this).field_B - var4_int;
                if (0 != ((vd) this).field_C) {
                  ((vd) this).field_t = ((vd) this).field_t + param2 * ((vd) this).field_C;
                  if (((vd) this).field_t >= 1048576) {
                    ((vd) this).field_t = 1048576;
                    if (!((vd) this).field_I) {
                      ((vd) this).field_C = 0;
                      if (!((vd) this).field_v) {
                        L4: {
                          if (((vd) this).field_E != null) {
                            ((vd) this).field_J.c((byte) 108);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((vd) this).field_E = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (((vd) this).field_t <= 0) {
                      ((vd) this).field_t = 0;
                      if (!((vd) this).field_I) {
                        ((vd) this).field_C = 0;
                        if (!((vd) this).field_v) {
                          L5: {
                            if (((vd) this).field_F != null) {
                              ((vd) this).field_A.c((byte) 108);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((vd) this).field_F = null;
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
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (fj.field_u) {
                  stackOut_37_0 = param2 << 1;
                  stackIn_38_0 = stackOut_37_0;
                  break L6;
                } else {
                  stackOut_36_0 = param2;
                  stackIn_38_0 = stackOut_36_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_38_0;
                if (256 <= ((vd) this).field_D) {
                  break L7;
                } else {
                  L8: {
                    if (((vd) this).field_F != null) {
                      break L8;
                    } else {
                      if (((vd) this).field_E == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == ((vd) this).field_G) {
                            break L10;
                          } else {
                            if (((vd) this).field_G.length < var6) {
                              break L10;
                            } else {
                              ai.a(((vd) this).field_G, 0, var6);
                              ai.a(((vd) this).field_H, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((vd) this).field_G = new int[var6];
                        ((vd) this).field_H = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((vd) this).field_A.a(((vd) this).field_G, 0, param2);
                        ((vd) this).field_J.a(((vd) this).field_H, 0, param2);
                        if (!fj.field_u) {
                          stackOut_52_0 = param1;
                          stackIn_53_0 = stackOut_52_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_51_0 = param1 << 1;
                          stackIn_53_0 = stackOut_51_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_53_0;
                      var8 = 0;
                      L12: while (true) {
                        if (~var6 >= ~var8) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (((vd) this).field_H[var8] * var5 + var4_int * ((vd) this).field_G[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((vd) this).field_J.a(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    ((vd) this).field_A.a(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (null == ((vd) this).field_u) {
                  break L13;
                } else {
                  if (((vd) this).field_D == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((vd) this).field_G == null) {
                          break L15;
                        } else {
                          if (~var6 >= ~((vd) this).field_G.length) {
                            ai.a(((vd) this).field_G, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((vd) this).field_G = new int[var6];
                      ((vd) this).field_H = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((vd) this).field_w.a(((vd) this).field_G, 0, param2);
                      if (!fj.field_u) {
                        stackOut_65_0 = param1;
                        stackIn_66_0 = stackOut_65_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_64_0 = param1 << 1;
                        stackIn_66_0 = stackOut_64_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_66_0;
                    var8 = ((vd) this).field_B * ((vd) this).field_D / 256;
                    var9 = -var8 + ((vd) this).field_B;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = ((vd) this).field_G[var10] * var8 + param0[var10 + var7] * var9 >> 8;
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
            stackOut_70_0 = (RuntimeException) var4;
            stackOut_70_1 = new StringBuilder().append("vd.R(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L18;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L18;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, mj param2) {
        ld var3 = null;
        try {
            var3 = sn.field_c;
            var3.d((byte) -93, 7);
            var3.c(param2.field_r, 25564);
            var3.c(param2.field_q, 25564);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "vd.A(" + 7 + 44 + -3450 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private vd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Please enter your age in years";
        field_y = -1;
        field_s = new boolean[35];
        field_s[30] = false;
        field_s[31] = false;
        field_s[23] = true;
        field_s[13] = true;
        field_s[20] = true;
        field_s[9] = true;
        field_s[7] = true;
        field_s[24] = false;
        field_s[12] = true;
        field_s[8] = true;
        field_s[3] = true;
        field_s[10] = true;
        field_s[21] = true;
        field_s[0] = true;
        field_s[1] = true;
        field_s[17] = true;
        field_s[6] = true;
        field_s[2] = true;
        field_s[25] = false;
        field_s[14] = true;
        field_s[26] = false;
        field_s[5] = true;
        field_s[4] = true;
        field_s[29] = false;
        field_s[22] = true;
        field_s[32] = false;
        field_s[15] = true;
        field_s[28] = false;
        field_s[11] = true;
        field_s[16] = true;
        field_s[18] = true;
        field_s[27] = false;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.Applet;

final class gd extends wi {
    static ja field_q;
    private int field_y;
    private id field_v;
    private int field_o;
    private ae field_g;
    static qj field_p;
    private int field_m;
    private hf field_w;
    static oi field_f;
    static boolean field_x;
    private byte[] field_d;
    private tk field_t;
    private pc field_e;
    private sd field_i;
    private byte[] field_u;
    private hf field_n;
    private boolean field_j;
    private boolean field_z;
    private ja field_s;
    private int field_k;
    private ja field_r;
    private boolean field_h;
    private long field_l;

    final int b(int param0, int param1) {
        tk var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -21770) {
                break L1;
              } else {
                ((gd) this).field_w = null;
                break L1;
              }
            }
            var3 = (tk) (Object) ((gd) this).field_v.a(8434, (long)param0);
            if (var3 != null) {
              stackOut_6_0 = var3.a((byte) 43);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3_ref, "gd.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        fc var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((gd) this).field_r) {
              L1: {
                if (param0 == -41) {
                  break L1;
                } else {
                  ((gd) this).b(true);
                  break L1;
                }
              }
              if (((gd) this).a(9) == null) {
                return;
              } else {
                var2_ref = ((gd) this).field_s.b(param0 + 43);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_b;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (((gd) this).field_e.field_n <= var3) {
                                    break L7;
                                  } else {
                                    if (((gd) this).field_e.field_l[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(-33);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((gd) this).field_d[var3] == 0) {
                                tk discarded$2 = this.a(1, (byte) -128, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((gd) this).field_d[var3] == -1) {
                                tk discarded$3 = this.a(2, (byte) -8, var3);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((gd) this).field_d[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.a(-108);
                              break L5;
                            }
                          }
                          var2_ref = ((gd) this).field_s.a(10);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "gd.G(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ((gd) this).field_w) {
              L1: {
                if (param0 == 6054) {
                  break L1;
                } else {
                  ((gd) this).field_t = null;
                  break L1;
                }
              }
              L2: {
                ((gd) this).field_z = true;
                if (((gd) this).field_r == null) {
                  ((gd) this).field_r = new ja();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "gd.E(" + param0 + ')');
        }
    }

    final static java.applet.Applet b(byte param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        re stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        re stackOut_6_0 = null;
        java.applet.Applet stackOut_1_0 = null;
        try {
          L0: {
            if (null == q.field_c) {
              L1: {
                if (param0 == 77) {
                  break L1;
                } else {
                  java.applet.Applet discarded$2 = gd.b((byte) -108);
                  break L1;
                }
              }
              stackOut_6_0 = f.field_c;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = q.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "gd.I(" + param0 + ')');
        }
        return (java.applet.Applet) (Object) stackIn_7_0;
    }

    final byte[] a(int param0, int param1) {
        tk var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            var3 = this.a(0, (byte) 98, param1);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                var4 = var3.g(param0 + 513);
                var3.a(-86);
                if (param0 == -1) {
                  break L1;
                } else {
                  ((gd) this).field_n = null;
                  break L1;
                }
              }
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3_ref, "gd.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_p = null;
              if (param0 == -3) {
                break L1;
              } else {
                java.applet.Applet discarded$2 = gd.b((byte) -10);
                break L1;
              }
            }
            field_q = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "gd.D(" + param0 + ')');
        }
    }

    final pc a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pc stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_45_0 = null;
        pc stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_30_0 = null;
        pc stackOut_55_0 = null;
        Object stackOut_14_0 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((gd) this).field_e) {
              stackOut_4_0 = ((gd) this).field_e;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (null != ((gd) this).field_t) {
                  break L1;
                } else {
                  if (!((gd) this).field_g.d(-18316)) {
                    ((gd) this).field_t = (tk) (Object) ((gd) this).field_g.a(255, true, false, ((gd) this).field_m, (byte) 0);
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (pc) (Object) stackIn_11_0;
                  }
                }
              }
              if (!((gd) this).field_t.field_w) {
                L2: {
                  var2_array = ((gd) this).field_t.g(512);
                  if (!(((gd) this).field_t instanceof lh)) {
                    try {
                      L3: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((gd) this).field_e = new pc(var2_array, ((gd) this).field_o, ((gd) this).field_u);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var3 = decompiledCaughtException;
                          ((gd) this).field_g.b((byte) 107);
                          ((gd) this).field_e = null;
                          if (!((gd) this).field_g.d(param0 ^ -18307)) {
                            break L5;
                          } else {
                            ((gd) this).field_t = null;
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((gd) this).field_t = (tk) (Object) ((gd) this).field_g.a(255, true, false, ((gd) this).field_m, (byte) 0);
                        break L4;
                      }
                      stackOut_44_0 = null;
                      stackIn_45_0 = stackOut_44_0;
                      return (pc) (Object) stackIn_45_0;
                    }
                    if (null == ((gd) this).field_n) {
                      break L2;
                    } else {
                      lh discarded$1 = ((gd) this).field_i.a(((gd) this).field_m, var2_array, ((gd) this).field_n, (byte) 117);
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (null != var2_array) {
                          ((gd) this).field_e = new pc(var2_array, ((gd) this).field_o, ((gd) this).field_u);
                          if (~((gd) this).field_y == ~((gd) this).field_e.field_k) {
                            break L6;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        L8: {
                          var3 = decompiledCaughtException;
                          ((gd) this).field_e = null;
                          if (((gd) this).field_g.d(-18316)) {
                            break L8;
                          } else {
                            ((gd) this).field_t = (tk) (Object) ((gd) this).field_g.a(255, true, false, ((gd) this).field_m, (byte) 0);
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((gd) this).field_t = null;
                        break L7;
                      }
                      stackOut_30_0 = null;
                      stackIn_31_0 = stackOut_30_0;
                      return (pc) (Object) stackIn_31_0;
                    }
                    break L2;
                  }
                }
                L9: {
                  if (((gd) this).field_w == null) {
                    break L9;
                  } else {
                    ((gd) this).field_d = new byte[((gd) this).field_e.field_n];
                    break L9;
                  }
                }
                L10: {
                  if (param0 == 9) {
                    break L10;
                  } else {
                    ((gd) this).b(true);
                    break L10;
                  }
                }
                ((gd) this).field_t = null;
                stackOut_55_0 = ((gd) this).field_e;
                stackIn_56_0 = stackOut_55_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (pc) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "gd.H(" + param0 + ')');
        }
        return stackIn_56_0;
    }

    private final tk a(int param0, byte param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var8_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_63_0 = null;
        byte stackIn_83_0 = 0;
        byte stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        Object stackIn_144_0 = null;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        Object stackIn_156_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_54_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        Object stackOut_143_0 = null;
        byte stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        Object stackOut_155_0 = null;
        byte stackOut_82_0 = 0;
        byte stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_111_0 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (tk) (Object) ((gd) this).field_v.a(8434, (long)param2);
              if (null == var4) {
                break L1;
              } else {
                if (0 != param0) {
                  break L1;
                } else {
                  if (((tk) var4).field_q) {
                    break L1;
                  } else {
                    if (((tk) var4).field_w) {
                      ((tk) var4).a(-120);
                      var4 = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4) {
                L3: {
                  if (0 == param0) {
                    L4: {
                      L5: {
                        if (((gd) this).field_w == null) {
                          break L5;
                        } else {
                          if (((gd) this).field_d[param2] != -1) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (!((gd) this).field_g.d(-18316)) {
                        var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, true, false, param2, (byte) 2);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_54_0 = null;
                        stackIn_55_0 = stackOut_54_0;
                        return (tk) (Object) stackIn_55_0;
                      }
                    }
                    var4 = (Object) (Object) ((gd) this).field_i.a((byte) 93, param2, ((gd) this).field_w);
                    break L3;
                  } else {
                    L6: {
                      if (param0 != 1) {
                        break L6;
                      } else {
                        if (null == ((gd) this).field_w) {
                          throw new RuntimeException();
                        } else {
                          var4 = (Object) (Object) ((gd) this).field_i.a(true, param2, ((gd) this).field_w);
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param0 != 2) {
                        break L7;
                      } else {
                        if (null == ((gd) this).field_w) {
                          throw new RuntimeException();
                        } else {
                          if (((gd) this).field_d[param2] != -1) {
                            throw new RuntimeException();
                          } else {
                            if (!((gd) this).field_g.c(-28419)) {
                              var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, false, false, param2, (byte) 2);
                              if (var11 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            } else {
                              stackOut_42_0 = null;
                              stackIn_43_0 = stackOut_42_0;
                              return (tk) (Object) stackIn_43_0;
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                }
                ((gd) this).field_v.a(false, (long)param2, (fc) var4);
                break L2;
              } else {
                break L2;
              }
            }
            if (((tk) var4).field_w) {
              stackOut_62_0 = null;
              stackIn_63_0 = stackOut_62_0;
              return (tk) (Object) stackIn_63_0;
            } else {
              var6 = 72 % ((-59 - param1) / 50);
              var5 = ((tk) var4).g(512);
              if (!(var4 instanceof lh)) {
                try {
                  L8: {
                    L9: {
                      if (null == var5) {
                        break L9;
                      } else {
                        if (var5.length > 2) {
                          q.field_k.reset();
                          q.field_k.update(var5, 0, var5.length - 2);
                          var7_int = (int)q.field_k.getValue();
                          if (var7_int != ((gd) this).field_e.field_b[param2]) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((gd) this).field_e.field_g == null) {
                                break L10;
                              } else {
                                if (((gd) this).field_e.field_g[param2] == null) {
                                  break L10;
                                } else {
                                  var8 = ((gd) this).field_e.field_g[param2];
                                  var9 = cf.a(0, var5, var5.length + -2, -6196);
                                  var10 = 0;
                                  L11: while (true) {
                                    if (var10 >= 64) {
                                      break L10;
                                    } else {
                                      stackOut_129_0 = ~var9[var10];
                                      stackOut_129_1 = ~var8[var10];
                                      stackIn_148_0 = stackOut_129_0;
                                      stackIn_148_1 = stackOut_129_1;
                                      stackIn_130_0 = stackOut_129_0;
                                      stackIn_130_1 = stackOut_129_1;
                                      if (var11 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L8;
                                      } else {
                                        if (stackIn_130_0 != stackIn_130_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var10++;
                                          if (var11 == 0) {
                                            continue L11;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((gd) this).field_g.field_e = 0;
                            ((gd) this).field_g.field_b = 0;
                            decompiledRegionSelector0 = 1;
                            break L8;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L12: {
                    var7_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((gd) this).field_g.b((byte) 113);
                    ((tk) var4).a(-90);
                    if (((tk) var4).field_q) {
                      if (((gd) this).field_g.d(-18316)) {
                        break L12;
                      } else {
                        var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, true, false, param2, (byte) 2);
                        ((gd) this).field_v.a(false, (long)param2, (fc) var4);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  stackOut_143_0 = null;
                  stackIn_144_0 = stackOut_143_0;
                  return (tk) (Object) stackIn_144_0;
                }
                L13: {
                  L14: {
                    if (decompiledRegionSelector0 == 0) {
                      break L14;
                    } else {
                      var5[-2 + var5.length] = (byte)(((gd) this).field_e.field_d[param2] >>> -190136440);
                      var5[var5.length - 1] = (byte)((gd) this).field_e.field_d[param2];
                      if (null == ((gd) this).field_w) {
                        break L13;
                      } else {
                        lh discarded$1 = ((gd) this).field_i.a(param2, var5, ((gd) this).field_w, (byte) 92);
                        stackOut_146_0 = ((gd) this).field_d[param2];
                        stackOut_146_1 = 1;
                        stackIn_148_0 = stackOut_146_0;
                        stackIn_148_1 = stackOut_146_1;
                        break L14;
                      }
                    }
                  }
                  if (stackIn_148_0 == stackIn_148_1) {
                    break L13;
                  } else {
                    ((gd) this).field_d[param2] = (byte) 1;
                    break L13;
                  }
                }
                L15: {
                  if (!((tk) var4).field_q) {
                    ((tk) var4).a(-52);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                stackOut_155_0 = var4;
                stackIn_156_0 = stackOut_155_0;
                break L0;
              } else {
                try {
                  L16: {
                    L17: {
                      if (null == var5) {
                        break L17;
                      } else {
                        if (var5.length <= 2) {
                          break L17;
                        } else {
                          q.field_k.reset();
                          q.field_k.update(var5, 0, -2 + var5.length);
                          var7_int = (int)q.field_k.getValue();
                          if (var7_int != ((gd) this).field_e.field_b[param2]) {
                            throw new RuntimeException();
                          } else {
                            L18: {
                              L19: {
                                if (null == ((gd) this).field_e.field_g) {
                                  break L19;
                                } else {
                                  if (((gd) this).field_e.field_g[param2] == null) {
                                    break L19;
                                  } else {
                                    var8 = ((gd) this).field_e.field_g[param2];
                                    var9 = cf.a(0, var5, -2 + var5.length, -6196);
                                    var10 = 0;
                                    L20: while (true) {
                                      if (var10 >= 64) {
                                        break L19;
                                      } else {
                                        stackOut_82_0 = var9[var10];
                                        stackOut_82_1 = var8[var10];
                                        stackIn_90_0 = stackOut_82_0;
                                        stackIn_90_1 = stackOut_82_1;
                                        stackIn_83_0 = stackOut_82_0;
                                        stackIn_83_1 = stackOut_82_1;
                                        if (var11 != 0) {
                                          break L18;
                                        } else {
                                          if (stackIn_83_0 == stackIn_83_1) {
                                            var10++;
                                            if (var11 == 0) {
                                              continue L20;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_89_0 = var5[-1 + var5.length] & 255;
                              stackOut_89_1 = var5[var5.length + -2] << 466316104 & 65280;
                              stackIn_90_0 = stackOut_89_0;
                              stackIn_90_1 = stackOut_89_1;
                              break L18;
                            }
                            var8_int = stackIn_90_0 + stackIn_90_1;
                            if ((((gd) this).field_e.field_d[param2] & 65535) == var8_int) {
                              L21: {
                                if (((gd) this).field_d[param2] == 1) {
                                  break L21;
                                } else {
                                  L22: {
                                    if (((gd) this).field_d[param2] == 0) {
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  ((gd) this).field_d[param2] = (byte) 1;
                                  break L21;
                                }
                              }
                              L23: {
                                if (!((tk) var4).field_q) {
                                  ((tk) var4).a(-59);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              stackOut_102_0 = var4;
                              stackIn_103_0 = stackOut_102_0;
                              break L16;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L24: {
                    var7 = (Exception) (Object) decompiledCaughtException;
                    ((gd) this).field_d[param2] = (byte) -1;
                    ((tk) var4).a(-122);
                    if (!((tk) var4).field_q) {
                      break L24;
                    } else {
                      if (!((gd) this).field_g.d(-18316)) {
                        var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, true, false, param2, (byte) 2);
                        ((gd) this).field_v.a(false, (long)param2, (fc) var4);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  stackOut_111_0 = null;
                  stackIn_112_0 = stackOut_111_0;
                  return (tk) (Object) stackIn_112_0;
                }
                return (tk) (Object) stackIn_103_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw sl.a((Throwable) var4, "gd.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (tk) (Object) stackIn_156_0;
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        tk var2_ref = null;
        fc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        byte stackIn_58_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_57_0 = 0;
        byte stackOut_57_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_92_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((gd) this).field_r) {
                break L1;
              } else {
                if (((gd) this).a(9) != null) {
                  L2: {
                    if (((gd) this).field_j) {
                      break L2;
                    } else {
                      L3: {
                        if (((gd) this).field_z) {
                          break L3;
                        } else {
                          ((gd) this).field_r = null;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2_int = 1;
                      var3 = ((gd) this).field_r.b(2);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_13_0 = ~((gd) this).field_d[var4];
                                stackOut_13_1 = -2;
                                stackIn_26_0 = stackOut_13_0;
                                stackIn_26_1 = stackOut_13_1;
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_26_0 >= stackIn_26_1) {
                                      break L6;
                                    } else {
                                      stackOut_27_0 = ~((gd) this).field_e.field_l[((gd) this).field_k];
                                      stackIn_51_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackIn_30_0 = stackOut_28_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_30_0 != -1) {
                                              break L10;
                                            } else {
                                              ((gd) this).field_k = ((gd) this).field_k + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((gd) this).field_g.c(-28419)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((gd) this).field_d[((gd) this).field_k] == 1) {
                                              break L12;
                                            } else {
                                              tk discarded$4 = this.a(2, (byte) -120, ((gd) this).field_k);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((gd) this).field_d[((gd) this).field_k] != 1) {
                                              var3 = new fc();
                                              var3.field_b = (long)((gd) this).field_k;
                                              ((gd) this).field_r.a((byte) -110, var3);
                                              var2_int = 0;
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((gd) this).field_k = ((gd) this).field_k + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_25_0 = ~((gd) this).field_e.field_l.length;
                                        stackOut_25_1 = ~((gd) this).field_k;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_14_0 != stackIn_14_1) {
                                      tk discarded$5 = this.a(2, (byte) 104, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((gd) this).field_d[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.a(-76);
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L15;
                                  }
                                  var3 = ((gd) this).field_r.a(10);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_25_0 = ~((gd) this).field_e.field_l.length;
                              stackOut_25_1 = ~((gd) this).field_k;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              if (stackIn_26_0 >= stackIn_26_1) {
                                break L6;
                              } else {
                                stackOut_27_0 = ~((gd) this).field_e.field_l[((gd) this).field_k];
                                stackIn_51_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_28_0 = stackIn_28_0;
                                  stackIn_30_0 = stackOut_28_0;
                                  L18: {
                                    if (stackIn_30_0 != -1) {
                                      break L18;
                                    } else {
                                      ((gd) this).field_k = ((gd) this).field_k + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((gd) this).field_g.c(-28419)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((gd) this).field_d[((gd) this).field_k] == 1) {
                                      break L20;
                                    } else {
                                      tk discarded$4 = this.a(2, (byte) -120, ((gd) this).field_k);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((gd) this).field_d[((gd) this).field_k] != 1) {
                                      var3 = new fc();
                                      var3.field_b = (long)((gd) this).field_k;
                                      ((gd) this).field_r.a((byte) -110, var3);
                                      var2_int = 0;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((gd) this).field_k = ((gd) this).field_k + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_50_0 = var2_int;
                          stackIn_51_0 = stackOut_50_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_51_0 != 0) {
                            ((gd) this).field_k = 0;
                            ((gd) this).field_z = false;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((gd) this).field_r.b(2);
                  L23: while (true) {
                    L24: {
                      L25: {
                        L26: {
                          if (var3 == null) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_57_0 = 0;
                            stackOut_57_1 = ((gd) this).field_d[var4];
                            stackIn_69_0 = stackOut_57_0;
                            stackIn_69_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_69_0 >= stackIn_69_1) {
                                  break L25;
                                } else {
                                  stackOut_70_0 = -1;
                                  stackIn_93_0 = stackOut_70_0;
                                  stackIn_71_0 = stackOut_70_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_71_0 = stackIn_71_0;
                                    stackIn_73_0 = stackOut_71_0;
                                    L28: {
                                      L29: {
                                        if (stackIn_73_0 != ~((gd) this).field_e.field_l[((gd) this).field_k]) {
                                          break L29;
                                        } else {
                                          ((gd) this).field_k = ((gd) this).field_k + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((gd) this).field_i.field_a < 250) {
                                          break L30;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((gd) this).field_d[((gd) this).field_k] == 0) {
                                          tk discarded$6 = this.a(1, (byte) 2, ((gd) this).field_k);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((gd) this).field_d[((gd) this).field_k] == 0) {
                                          var3 = new fc();
                                          var3.field_b = (long)((gd) this).field_k;
                                          var2_int = 0;
                                          ((gd) this).field_r.a((byte) -128, var3);
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      ((gd) this).field_k = ((gd) this).field_k + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_68_0 = ~((gd) this).field_e.field_l.length;
                                    stackOut_68_1 = ~((gd) this).field_k;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_58_0 == stackIn_58_1) {
                                  tk discarded$7 = this.a(1, (byte) 90, var4);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (((gd) this).field_d[var4] != 0) {
                                    break L35;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var3.a(-47);
                                break L34;
                              }
                              var3 = ((gd) this).field_r.a(10);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_68_0 = ~((gd) this).field_e.field_l.length;
                          stackOut_68_1 = ~((gd) this).field_k;
                          stackIn_69_0 = stackOut_68_0;
                          stackIn_69_1 = stackOut_68_1;
                          if (stackIn_69_0 >= stackIn_69_1) {
                            break L25;
                          } else {
                            stackOut_70_0 = -1;
                            stackIn_93_0 = stackOut_70_0;
                            stackIn_71_0 = stackOut_70_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              stackOut_71_0 = stackIn_71_0;
                              stackIn_73_0 = stackOut_71_0;
                              L37: {
                                if (stackIn_73_0 != ~((gd) this).field_e.field_l[((gd) this).field_k]) {
                                  break L37;
                                } else {
                                  ((gd) this).field_k = ((gd) this).field_k + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((gd) this).field_i.field_a < 250) {
                                  break L38;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((gd) this).field_d[((gd) this).field_k] == 0) {
                                  tk discarded$6 = this.a(1, (byte) 2, ((gd) this).field_k);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (((gd) this).field_d[((gd) this).field_k] == 0) {
                                  var3 = new fc();
                                  var3.field_b = (long)((gd) this).field_k;
                                  var2_int = 0;
                                  ((gd) this).field_r.a((byte) -128, var3);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              ((gd) this).field_k = ((gd) this).field_k + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      stackOut_92_0 = var2_int;
                      stackIn_93_0 = stackOut_92_0;
                      break L24;
                    }
                    if (stackIn_93_0 == 0) {
                      break L1;
                    } else {
                      ((gd) this).field_k = 0;
                      ((gd) this).field_j = false;
                      break L1;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L41: {
              if (!param0) {
                break L41;
              } else {
                ((gd) this).field_j = false;
                break L41;
              }
            }
            L42: {
              if (!((gd) this).field_h) {
                break L42;
              } else {
                if (qg.a(false) < ((gd) this).field_l) {
                  break L42;
                } else {
                  var2_ref = (tk) (Object) ((gd) this).field_v.b(-49);
                  L43: while (true) {
                    L44: {
                      if (null == var2_ref) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_w) {
                              break L45;
                            } else {
                              L46: {
                                if (var2_ref.field_v) {
                                  break L46;
                                } else {
                                  var2_ref.field_v = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (!var2_ref.field_q) {
                                throw new RuntimeException();
                              } else {
                                var2_ref.a(-109);
                                break L45;
                              }
                            }
                          }
                          var2_ref = (tk) (Object) ((gd) this).field_v.a((byte) 91);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((gd) this).field_l = qg.a(false) + 1000L;
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "gd.B(" + param0 + ')');
        }
    }

    gd(int param0, hf param1, hf param2, ae param3, sd param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((gd) this).field_v = new id(16);
        ((gd) this).field_k = 0;
        ((gd) this).field_s = new ja();
        ((gd) this).field_l = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((gd) this).field_m = param0;
                ((gd) this).field_w = param1;
                if (null == ((gd) this).field_w) {
                  break L2;
                } else {
                  ((gd) this).field_j = true;
                  ((gd) this).field_r = new ja();
                  if (!TrackController.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((gd) this).field_j = false;
              break L1;
            }
            L3: {
              ((gd) this).field_h = param8;
              ((gd) this).field_o = param5;
              ((gd) this).field_y = param7;
              ((gd) this).field_n = param2;
              ((gd) this).field_u = param6;
              ((gd) this).field_g = param3;
              ((gd) this).field_i = param4;
              if (null == ((gd) this).field_n) {
                break L3;
              } else {
                ((gd) this).field_t = (tk) (Object) ((gd) this).field_i.a((byte) -113, ((gd) this).field_m, ((gd) this).field_n);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("gd.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new ja();
        field_x = false;
        field_f = new oi();
    }
}

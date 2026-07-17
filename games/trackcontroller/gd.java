/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (param1 != -21770) {
            ((gd) this).field_w = null;
        }
        tk var3 = (tk) (Object) ((gd) this).field_v.a(8434, (long)param0);
        if (var3 == null) {
            return 0;
        }
        return var3.a((byte) 43);
    }

    final void a(byte param0) {
        fc var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != ((gd) this).field_r) {
          L0: {
            if (param0 == -41) {
              break L0;
            } else {
              ((gd) this).b(true);
              break L0;
            }
          }
          if (((gd) this).a(9) == null) {
            return;
          } else {
            var2 = ((gd) this).field_s.b(param0 + 43);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_b;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (((gd) this).field_e.field_n <= var3) {
                              break L5;
                            } else {
                              if (((gd) this).field_e.field_l[var3] == 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.a(-33);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((gd) this).field_d[var3] == 0) {
                          tk discarded$4 = this.a(1, (byte) -128, var3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((gd) this).field_d[var3] == -1) {
                          tk discarded$5 = this.a(2, (byte) -8, var3);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (((gd) this).field_d[var3] != 1) {
                        break L3;
                      } else {
                        var2.a(-108);
                        break L3;
                      }
                    }
                    var2 = ((gd) this).field_s.a(10);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (null == ((gd) this).field_w) {
            return;
        }
        if (param0 != 6054) {
            ((gd) this).field_t = null;
        }
        ((gd) this).field_z = true;
        if (!(((gd) this).field_r != null)) {
            ((gd) this).field_r = new ja();
        }
    }

    final static java.applet.Applet b(byte param0) {
        if (null != q.field_c) {
            return q.field_c;
        }
        if (param0 != 77) {
            java.applet.Applet discarded$0 = gd.b((byte) -108);
        }
        return (java.applet.Applet) (Object) f.field_c;
    }

    final byte[] a(int param0, int param1) {
        tk var3 = this.a(0, (byte) 98, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g(param0 + 513);
        var3.a(-86);
        if (param0 != -1) {
            ((gd) this).field_n = null;
        }
        return var4;
    }

    public static void c(int param0) {
        field_p = null;
        if (param0 != -3) {
            java.applet.Applet discarded$0 = gd.b((byte) -10);
        }
        field_q = null;
        field_f = null;
    }

    final pc a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != ((gd) this).field_e) {
          return ((gd) this).field_e;
        } else {
          L0: {
            if (null != ((gd) this).field_t) {
              break L0;
            } else {
              if (!((gd) this).field_g.d(-18316)) {
                ((gd) this).field_t = (tk) (Object) ((gd) this).field_g.a(255, true, false, ((gd) this).field_m, (byte) 0);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((gd) this).field_t.field_w) {
            L1: {
              var5 = ((gd) this).field_t.g(512);
              var2 = var5;
              if (!(((gd) this).field_t instanceof lh)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((gd) this).field_e = new pc(var5, ((gd) this).field_o, ((gd) this).field_u);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    ((gd) this).field_g.b((byte) 107);
                    ((gd) this).field_e = null;
                    if (!((gd) this).field_g.d(param0 ^ -18307)) {
                      break L3;
                    } else {
                      ((gd) this).field_t = null;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((gd) this).field_t = (tk) (Object) ((gd) this).field_g.a(255, true, false, ((gd) this).field_m, (byte) 0);
                  return null;
                }
                if (null == ((gd) this).field_n) {
                  break L1;
                } else {
                  lh discarded$1 = ((gd) this).field_i.a(((gd) this).field_m, var5, ((gd) this).field_n, (byte) 117);
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      ((gd) this).field_e = new pc(var5, ((gd) this).field_o, ((gd) this).field_u);
                      if (~((gd) this).field_y == ~((gd) this).field_e.field_k) {
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    ((gd) this).field_e = null;
                    if (((gd) this).field_g.d(-18316)) {
                      break L5;
                    } else {
                      ((gd) this).field_t = (tk) (Object) ((gd) this).field_g.a(255, true, false, ((gd) this).field_m, (byte) 0);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((gd) this).field_t = null;
                  return null;
                }
                break L1;
              }
            }
            L6: {
              if (((gd) this).field_w == null) {
                break L6;
              } else {
                ((gd) this).field_d = new byte[((gd) this).field_e.field_n];
                break L6;
              }
            }
            L7: {
              if (param0 == 9) {
                break L7;
              } else {
                ((gd) this).b(true);
                break L7;
              }
            }
            ((gd) this).field_t = null;
            return ((gd) this).field_e;
          } else {
            return null;
          }
        }
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
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        byte stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_61_0 = null;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          var4 = (Object) (Object) (tk) (Object) ((gd) this).field_v.a(8434, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((tk) var4).field_q) {
                break L0;
              } else {
                if (((tk) var4).field_w) {
                  ((tk) var4).a(-120);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (0 == param0) {
                L3: {
                  L4: {
                    if (((gd) this).field_w == null) {
                      break L4;
                    } else {
                      if (((gd) this).field_d[param2] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((gd) this).field_g.d(-18316)) {
                    var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, true, false, param2, (byte) 2);
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return null;
                  }
                }
                var4 = (Object) (Object) ((gd) this).field_i.a((byte) 93, param2, ((gd) this).field_w);
                break L2;
              } else {
                L5: {
                  if (param0 != 1) {
                    break L5;
                  } else {
                    if (null == ((gd) this).field_w) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((gd) this).field_i.a(true, param2, ((gd) this).field_w);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (param0 != 2) {
                    break L6;
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
                            break L2;
                          } else {
                            break L6;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            }
            ((gd) this).field_v.a(false, (long)param2, (fc) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((tk) var4).field_w) {
          var6 = 72 % ((-59 - param1) / 50);
          var5 = ((tk) var4).g(512);
          if (!(var4 instanceof lh)) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      q.field_k.reset();
                      q.field_k.update(var5, 0, var5.length - 2);
                      var7_int = (int)q.field_k.getValue();
                      if (var7_int != ((gd) this).field_e.field_b[param2]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          if (((gd) this).field_e.field_g == null) {
                            break L9;
                          } else {
                            if (((gd) this).field_e.field_g[param2] == null) {
                              break L9;
                            } else {
                              var8 = ((gd) this).field_e.field_g[param2];
                              var9 = cf.a(0, var5, var5.length + -2, -6196);
                              var10 = 0;
                              L10: while (true) {
                                if (var10 >= 64) {
                                  break L9;
                                } else {
                                  stackOut_80_0 = ~var9[var10];
                                  stackOut_80_1 = ~var8[var10];
                                  stackIn_95_0 = stackOut_80_0;
                                  stackIn_95_1 = stackOut_80_1;
                                  stackIn_81_0 = stackOut_80_0;
                                  stackIn_81_1 = stackOut_80_1;
                                  if (var11 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L7;
                                  } else {
                                    if (stackIn_81_0 != stackIn_81_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var10++;
                                      if (var11 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
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
                        break L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L11: {
                var7_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((gd) this).field_g.b((byte) 113);
                ((tk) var4).a(-90);
                if (((tk) var4).field_q) {
                  if (!((gd) this).field_g.d(-18316)) {
                    var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, true, false, param2, (byte) 2);
                    ((gd) this).field_v.a(false, (long)param2, (fc) var4);
                    break L11;
                  } else {
                    return null;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            L12: {
              L13: {
                if (decompiledRegionSelector0 == 0) {
                  break L13;
                } else {
                  var5[-2 + var5.length] = (byte)(((gd) this).field_e.field_d[param2] >>> 8);
                  var5[var5.length - 1] = (byte)((gd) this).field_e.field_d[param2];
                  if (null == ((gd) this).field_w) {
                    break L12;
                  } else {
                    lh discarded$1 = ((gd) this).field_i.a(param2, var5, ((gd) this).field_w, (byte) 92);
                    stackOut_94_0 = ((gd) this).field_d[param2];
                    stackOut_94_1 = 1;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    break L13;
                  }
                }
              }
              if (stackIn_95_0 == stackIn_95_1) {
                break L12;
              } else {
                ((gd) this).field_d[param2] = (byte) 1;
                break L12;
              }
            }
            L14: {
              if (!((tk) var4).field_q) {
                ((tk) var4).a(-52);
                break L14;
              } else {
                break L14;
              }
            }
            return (tk) var4;
          } else {
            try {
              L15: {
                L16: {
                  if (var5 == null) {
                    break L16;
                  } else {
                    if (var5.length <= 2) {
                      break L16;
                    } else {
                      q.field_k.reset();
                      q.field_k.update(var5, 0, -2 + var5.length);
                      var7_int = (int)q.field_k.getValue();
                      if (var7_int != ((gd) this).field_e.field_b[param2]) {
                        throw new RuntimeException();
                      } else {
                        L17: {
                          L18: {
                            if (null == ((gd) this).field_e.field_g) {
                              break L18;
                            } else {
                              if (((gd) this).field_e.field_g[param2] == null) {
                                break L18;
                              } else {
                                var8 = ((gd) this).field_e.field_g[param2];
                                var9 = cf.a(0, var5, -2 + var5.length, -6196);
                                var10 = 0;
                                L19: while (true) {
                                  if (var10 >= 64) {
                                    break L18;
                                  } else {
                                    stackOut_47_0 = var9[var10];
                                    stackOut_47_1 = var8[var10];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var11 != 0) {
                                      break L17;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
                                        var10++;
                                        if (var11 == 0) {
                                          continue L19;
                                        } else {
                                          break L18;
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
                          stackOut_51_0 = var5[-1 + var5.length] & 255;
                          stackOut_51_1 = var5[var5.length + -2] << 8 & 65280;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L17;
                        }
                        var8_int = stackIn_52_0 + stackIn_52_1;
                        if ((((gd) this).field_e.field_d[param2] & 65535) == var8_int) {
                          L20: {
                            if (((gd) this).field_d[param2] == 1) {
                              break L20;
                            } else {
                              L21: {
                                if (((gd) this).field_d[param2] == 0) {
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              ((gd) this).field_d[param2] = (byte) 1;
                              break L20;
                            }
                          }
                          L22: {
                            if (!((tk) var4).field_q) {
                              ((tk) var4).a(-59);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          stackOut_61_0 = var4;
                          stackIn_62_0 = stackOut_61_0;
                          break L15;
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
              var7 = (Exception) (Object) decompiledCaughtException;
              ((gd) this).field_d[param2] = (byte) -1;
              ((tk) var4).a(-122);
              if (((tk) var4).field_q) {
                L23: {
                  if (!((gd) this).field_g.d(-18316)) {
                    var4 = (Object) (Object) ((gd) this).field_g.a(((gd) this).field_m, true, false, param2, (byte) 2);
                    ((gd) this).field_v.a(false, (long)param2, (fc) var4);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (tk) (Object) stackIn_62_0;
          }
        } else {
          return null;
        }
    }

    final void b(boolean param0) {
        int var2_int = 0;
        tk var2 = null;
        fc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        byte stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_41_0 = 0;
        byte stackOut_41_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_65_0 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (null == ((gd) this).field_r) {
            break L0;
          } else {
            if (((gd) this).a(9) != null) {
              L1: {
                if (((gd) this).field_j) {
                  break L1;
                } else {
                  L2: {
                    if (((gd) this).field_z) {
                      break L2;
                    } else {
                      ((gd) this).field_r = null;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((gd) this).field_r.b(2);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_9_0 = ~((gd) this).field_d[var4];
                            stackOut_9_1 = -2;
                            stackIn_20_0 = stackOut_9_0;
                            stackIn_20_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_20_0 >= stackIn_20_1) {
                                  break L5;
                                } else {
                                  stackOut_21_0 = ~((gd) this).field_e.field_l[((gd) this).field_k];
                                  stackIn_35_0 = stackOut_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_22_0 != -1) {
                                          break L9;
                                        } else {
                                          ((gd) this).field_k = ((gd) this).field_k + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (((gd) this).field_g.c(-28419)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (((gd) this).field_d[((gd) this).field_k] == 1) {
                                          break L11;
                                        } else {
                                          tk discarded$6 = this.a(2, (byte) -120, ((gd) this).field_k);
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((gd) this).field_d[((gd) this).field_k] != 1) {
                                          var3 = new fc();
                                          var3.field_b = (long)((gd) this).field_k;
                                          ((gd) this).field_r.a((byte) -110, var3);
                                          var2_int = 0;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      ((gd) this).field_k = ((gd) this).field_k + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_19_0 = ~((gd) this).field_e.field_l.length;
                                    stackOut_19_1 = ~((gd) this).field_k;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_10_0 != stackIn_10_1) {
                                  tk discarded$7 = this.a(2, (byte) 104, var4);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((gd) this).field_d[var4] != 1) {
                                    break L15;
                                  } else {
                                    var3.a(-76);
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L14;
                              }
                              var3 = ((gd) this).field_r.a(10);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_134_0 = ~((gd) this).field_e.field_l.length;
                          stackOut_134_1 = ~((gd) this).field_k;
                          stackIn_132_0 = stackOut_134_0;
                          stackIn_132_1 = stackOut_134_1;
                          if (stackIn_132_0 >= stackIn_132_1) {
                            break L5;
                          } else {
                            stackOut_130_0 = ~((gd) this).field_e.field_l[((gd) this).field_k];
                            stackIn_35_0 = stackOut_130_0;
                            stackIn_131_0 = stackOut_130_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              stackOut_131_0 = stackIn_131_0;
                              stackIn_128_0 = stackOut_131_0;
                              L17: {
                                if (stackIn_128_0 != -1) {
                                  break L17;
                                } else {
                                  ((gd) this).field_k = ((gd) this).field_k + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (((gd) this).field_g.c(-28419)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (((gd) this).field_d[((gd) this).field_k] == 1) {
                                  break L19;
                                } else {
                                  tk discarded$8 = this.a(2, (byte) -120, ((gd) this).field_k);
                                  break L19;
                                }
                              }
                              L20: {
                                if (((gd) this).field_d[((gd) this).field_k] != 1) {
                                  var3 = new fc();
                                  var3.field_b = (long)((gd) this).field_k;
                                  ((gd) this).field_r.a((byte) -110, var3);
                                  var2_int = 0;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ((gd) this).field_k = ((gd) this).field_k + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_34_0 = var2_int;
                      stackIn_35_0 = stackOut_34_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_35_0 != 0) {
                        ((gd) this).field_k = 0;
                        ((gd) this).field_z = false;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_int = 1;
              var3 = ((gd) this).field_r.b(2);
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      if (var3 == null) {
                        break L25;
                      } else {
                        var4 = (int)var3.field_b;
                        stackOut_41_0 = 0;
                        stackOut_41_1 = ((gd) this).field_d[var4];
                        stackIn_51_0 = stackOut_41_0;
                        stackIn_51_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var5 != 0) {
                          L26: while (true) {
                            if (stackIn_51_0 >= stackIn_51_1) {
                              break L24;
                            } else {
                              stackOut_52_0 = -1;
                              stackIn_66_0 = stackOut_52_0;
                              stackIn_53_0 = stackOut_52_0;
                              if (var5 != 0) {
                                break L23;
                              } else {
                                L27: {
                                  L28: {
                                    if (stackIn_53_0 != ~((gd) this).field_e.field_l[((gd) this).field_k]) {
                                      break L28;
                                    } else {
                                      ((gd) this).field_k = ((gd) this).field_k + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if (((gd) this).field_i.field_a < 250) {
                                      break L29;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L24;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  L30: {
                                    if (((gd) this).field_d[((gd) this).field_k] == 0) {
                                      tk discarded$9 = this.a(1, (byte) 2, ((gd) this).field_k);
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (((gd) this).field_d[((gd) this).field_k] == 0) {
                                      var3 = new fc();
                                      var3.field_b = (long)((gd) this).field_k;
                                      var2_int = 0;
                                      ((gd) this).field_r.a((byte) -128, var3);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  ((gd) this).field_k = ((gd) this).field_k + 1;
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L24;
                                  }
                                }
                                stackOut_50_0 = ~((gd) this).field_e.field_l.length;
                                stackOut_50_1 = ~((gd) this).field_k;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                continue L26;
                              }
                            }
                          }
                        } else {
                          L32: {
                            if (stackIn_42_0 == stackIn_42_1) {
                              tk discarded$10 = this.a(1, (byte) 90, var4);
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (((gd) this).field_d[var4] != 0) {
                                break L34;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            var3.a(-47);
                            break L33;
                          }
                          var3 = ((gd) this).field_r.a(10);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L35: while (true) {
                      stackOut_110_0 = ~((gd) this).field_e.field_l.length;
                      stackOut_110_1 = ~((gd) this).field_k;
                      stackIn_108_0 = stackOut_110_0;
                      stackIn_108_1 = stackOut_110_1;
                      if (stackIn_108_0 >= stackIn_108_1) {
                        break L24;
                      } else {
                        stackOut_106_0 = -1;
                        stackIn_66_0 = stackOut_106_0;
                        stackIn_107_0 = stackOut_106_0;
                        if (var5 != 0) {
                          break L23;
                        } else {
                          stackOut_107_0 = stackIn_107_0;
                          stackIn_104_0 = stackOut_107_0;
                          L36: {
                            if (stackIn_104_0 != ~((gd) this).field_e.field_l[((gd) this).field_k]) {
                              break L36;
                            } else {
                              ((gd) this).field_k = ((gd) this).field_k + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (((gd) this).field_i.field_a < 250) {
                              break L37;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L24;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (((gd) this).field_d[((gd) this).field_k] == 0) {
                              tk discarded$11 = this.a(1, (byte) 2, ((gd) this).field_k);
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (((gd) this).field_d[((gd) this).field_k] == 0) {
                              var3 = new fc();
                              var3.field_b = (long)((gd) this).field_k;
                              var2_int = 0;
                              ((gd) this).field_r.a((byte) -128, var3);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          ((gd) this).field_k = ((gd) this).field_k + 1;
                          if (var5 == 0) {
                            continue L35;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  stackOut_65_0 = var2_int;
                  stackIn_66_0 = stackOut_65_0;
                  break L23;
                }
                if (stackIn_66_0 == 0) {
                  break L0;
                } else {
                  ((gd) this).field_k = 0;
                  ((gd) this).field_j = false;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        }
        L40: {
          if (!param0) {
            break L40;
          } else {
            ((gd) this).field_j = false;
            break L40;
          }
        }
        L41: {
          if (!((gd) this).field_h) {
            break L41;
          } else {
            L42: {
              if (qg.a(false) < ((gd) this).field_l) {
                break L42;
              } else {
                var2 = (tk) (Object) ((gd) this).field_v.b(-49);
                L43: while (true) {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L42;
                      } else {
                        L45: {
                          if (var2.field_w) {
                            break L45;
                          } else {
                            L46: {
                              if (var2.field_v) {
                                break L46;
                              } else {
                                var2.field_v = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (!var2.field_q) {
                              throw new RuntimeException();
                            } else {
                              var2.a(-109);
                              break L45;
                            }
                          }
                        }
                        var2 = (tk) (Object) ((gd) this).field_v.a((byte) 91);
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
            break L41;
          }
        }
    }

    gd(int param0, hf param1, hf param2, ae param3, sd param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((gd) this).field_h = stackIn_7_1 != 0;
              ((gd) this).field_o = param5;
              ((gd) this).field_y = param7;
              ((gd) this).field_n = param2;
              ((gd) this).field_u = param6;
              ((gd) this).field_g = param3;
              ((gd) this).field_i = param4;
              if (null == ((gd) this).field_n) {
                break L4;
              } else {
                ((gd) this).field_t = (tk) (Object) ((gd) this).field_i.a((byte) -113, ((gd) this).field_m, ((gd) this).field_n);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("gd.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends bc {
    static int[] field_t;
    static dh field_y;
    private ve field_B;
    private ih field_j;
    private byte[] field_i;
    private hb field_s;
    private int field_A;
    private si field_l;
    private ko field_v;
    private byte[] field_e;
    private ve field_g;
    static vl field_n;
    private int field_h;
    static int field_r;
    static int field_p;
    private int field_o;
    private kg field_u;
    private boolean field_f;
    private int field_m;
    private vl field_x;
    private vl field_z;
    private boolean field_k;
    private long field_q;
    private boolean field_w;

    final int a(byte param0, int param1) {
        hb var3 = (hb) (Object) ((jq) this).field_l.a(-117, (long)param1);
        if (param0 >= -60) {
            ((jq) this).field_k = true;
        }
        if (var3 != null) {
            return var3.f(-21546);
        }
        return 0;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ta var9 = null;
        int var10 = 0;
        int stackIn_12_0 = 0;
        String stackIn_12_1 = null;
        int stackIn_13_0 = 0;
        String stackIn_13_1 = null;
        int stackIn_14_0 = 0;
        String stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        ta stackIn_18_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        String stackOut_11_1 = null;
        int stackOut_13_0 = 0;
        String stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_12_0 = 0;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        ta stackOut_17_0 = null;
        ta stackOut_16_0 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = -nc.field_k + lk.field_p;
            if (param0 == -16085) {
              nc.field_k = cc.field_J + -(var1_int >> 1);
              mi.field_d = ea.field_e - (bg.field_r >> 1);
              lk.field_p = var1_int + nc.field_k;
              var2 = mi.field_d;
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (~var3 <= ~kn.field_E.length) {
                    break L2;
                  } else {
                    var4 = re.field_q[var3];
                    if (var10 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          if (var4 < 0) {
                            break L4;
                          } else {
                            L5: {
                              if (fi.field_r.field_j != var4) {
                                break L5;
                              } else {
                                var5 = om.field_hc;
                                if (var10 == 0) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var5 = ug.field_I;
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = qh.field_d;
                        break L3;
                      }
                      L6: {
                        var6 = kn.field_E[var3];
                        stackOut_11_0 = 0;
                        stackOut_11_1 = (String) var6;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var4 < 0) {
                          stackOut_13_0 = stackIn_13_0;
                          stackOut_13_1 = (String) (Object) stackIn_13_1;
                          stackOut_13_2 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L6;
                        } else {
                          stackOut_12_0 = stackIn_12_0;
                          stackOut_12_1 = (String) (Object) stackIn_12_1;
                          stackOut_12_2 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = pl.a(stackIn_14_0, stackIn_14_1, stackIn_14_2 != 0);
                        var8 = cc.field_J + -(var7 >> 1);
                        if (var4 < 0) {
                          break L7;
                        } else {
                          L8: {
                            var2 = var2 + dj.field_g;
                            if (fi.field_r.field_j != var4) {
                              stackOut_17_0 = ag.field_F;
                              stackIn_18_0 = stackOut_17_0;
                              break L8;
                            } else {
                              stackOut_16_0 = uc.field_l;
                              stackIn_18_0 = stackOut_16_0;
                              break L8;
                            }
                          }
                          L9: {
                            var9 = stackIn_18_0;
                            if (var9 != null) {
                              var9.a((ek.field_lb << 1) + var7, (wg.field_f << 1) + nq.field_i, -ek.field_lb + var8, false, var2);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var2 = var2 + wg.field_f;
                          break L7;
                        }
                      }
                      L10: {
                        L11: {
                          if (var4 >= 0) {
                            break L11;
                          } else {
                            oc.field_m.c(var6, var8, gp.field_b + var2, var5, -1);
                            var2 = var2 + wh.field_m;
                            if (var10 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        lj.field_r.c(var6, var8, lj.field_i + var2, var5, -1);
                        var2 = var2 + (nq.field_i + dj.field_g + wg.field_f);
                        break L10;
                      }
                      var3++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "jq.J(" + param0 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        nm var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null != ((jq) this).field_z) {
          L0: {
            if (param0 == 20312) {
              break L0;
            } else {
              ((jq) this).field_o = -97;
              break L0;
            }
          }
          if (((jq) this).b((byte) -112) == null) {
            return;
          } else {
            var2 = ((jq) this).field_x.d(-9);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_g;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (~((jq) this).field_v.field_f >= ~var3) {
                              break L5;
                            } else {
                              if (((jq) this).field_v.field_m[var3] != 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.b((byte) 111);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((jq) this).field_e[var3] != 0) {
                          break L6;
                        } else {
                          hb discarded$4 = this.a(1, var3, (byte) -109);
                          break L6;
                        }
                      }
                      L7: {
                        if (((jq) this).field_e[var3] != -1) {
                          break L7;
                        } else {
                          hb discarded$5 = this.a(2, var3, (byte) -116);
                          break L7;
                        }
                      }
                      if (((jq) this).field_e[var3] == 1) {
                        var2.b((byte) 111);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((jq) this).field_x.a((byte) 116);
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

    final void f(int param0) {
        if (param0 != -10476) {
            ((jq) this).field_v = null;
        }
        if (null == ((jq) this).field_B) {
            return;
        }
        ((jq) this).field_f = true;
        if (!(((jq) this).field_z != null)) {
            ((jq) this).field_z = new vl();
        }
    }

    final static void e(int param0) {
        int var1 = -91 / ((33 - param0) / 48);
        cb.a(uc.e((byte) -119), 9);
    }

    final byte[] a(int param0, byte param1) {
        hb var3 = this.a(0, param0, (byte) -110);
        if (param1 > -33) {
            ((jq) this).field_h = 38;
        }
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c((byte) -85);
        var3.b((byte) 111);
        return var4;
    }

    final void c(int param0) {
        hb var2 = null;
        int var2_int = 0;
        nm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        byte stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_70_0 = false;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        byte stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_80_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        L0: {
          L1: {
            var5 = BrickABrac.field_J ? 1 : 0;
            if (null == ((jq) this).field_z) {
              break L1;
            } else {
              if (((jq) this).b((byte) -112) != null) {
                L2: {
                  if (!((jq) this).field_k) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((jq) this).field_z.d(-101);
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var3 == null) {
                            break L5;
                          } else {
                            var4 = (int)var3.field_g;
                            stackOut_6_0 = ~((jq) this).field_e[var4];
                            stackOut_6_1 = -1;
                            stackIn_17_0 = stackOut_6_0;
                            stackIn_17_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var5 != 0) {
                              L6: while (true) {
                                if (stackIn_17_0 >= stackIn_17_1) {
                                  break L4;
                                } else {
                                  stackOut_18_0 = 0;
                                  stackOut_18_1 = ((jq) this).field_v.field_m[((jq) this).field_m];
                                  stackIn_82_0 = stackOut_18_0;
                                  stackIn_82_1 = stackOut_18_1;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_19_0 != stackIn_19_1) {
                                          break L8;
                                        } else {
                                          ((jq) this).field_m = ((jq) this).field_m + 1;
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (250 > ((jq) this).field_u.field_c) {
                                          break L9;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                          hb discarded$6 = this.a(1, ((jq) this).field_m, (byte) -119);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                          var3 = new nm();
                                          var3.field_g = (long)((jq) this).field_m;
                                          ((jq) this).field_z.a(var3, (byte) 3);
                                          var2_int = 0;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      ((jq) this).field_m = ((jq) this).field_m + 1;
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    stackOut_16_0 = ((jq) this).field_m;
                                    stackOut_16_1 = ((jq) this).field_v.field_m.length;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L12: {
                                if (stackIn_7_0 == stackIn_7_1) {
                                  hb discarded$7 = this.a(1, var4, (byte) -118);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  if (((jq) this).field_e[var4] == 0) {
                                    break L14;
                                  } else {
                                    var3.b((byte) 111);
                                    if (var5 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L13;
                              }
                              var3 = ((jq) this).field_z.a((byte) 116);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L15: while (true) {
                          stackOut_130_0 = ((jq) this).field_m;
                          stackOut_130_1 = ((jq) this).field_v.field_m.length;
                          stackIn_128_0 = stackOut_130_0;
                          stackIn_128_1 = stackOut_130_1;
                          if (stackIn_128_0 >= stackIn_128_1) {
                            break L4;
                          } else {
                            stackOut_126_0 = 0;
                            stackOut_126_1 = ((jq) this).field_v.field_m[((jq) this).field_m];
                            stackIn_82_0 = stackOut_126_0;
                            stackIn_82_1 = stackOut_126_1;
                            stackIn_127_0 = stackOut_126_0;
                            stackIn_127_1 = stackOut_126_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_127_0 = stackIn_127_0;
                              stackOut_127_1 = stackIn_127_1;
                              stackIn_124_0 = stackOut_127_0;
                              stackIn_124_1 = stackOut_127_1;
                              L16: {
                                if (stackIn_124_0 != stackIn_124_1) {
                                  break L16;
                                } else {
                                  ((jq) this).field_m = ((jq) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (250 > ((jq) this).field_u.field_c) {
                                  break L17;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                  hb discarded$8 = this.a(1, ((jq) this).field_m, (byte) -119);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                  var3 = new nm();
                                  var3.field_g = (long)((jq) this).field_m;
                                  ((jq) this).field_z.a(var3, (byte) 3);
                                  var2_int = 0;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((jq) this).field_m = ((jq) this).field_m + 1;
                              if (var5 == 0) {
                                continue L15;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (var2_int == 0) {
                          break L20;
                        } else {
                          ((jq) this).field_m = 0;
                          ((jq) this).field_k = false;
                          break L20;
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
                L21: {
                  if (!((jq) this).field_f) {
                    break L21;
                  } else {
                    var2_int = 1;
                    var3 = ((jq) this).field_z.d(-127);
                    L22: while (true) {
                      L23: {
                        L24: {
                          L25: {
                            if (var3 == null) {
                              break L25;
                            } else {
                              var4 = (int)var3.field_g;
                              stackOut_37_0 = ((jq) this).field_e[var4];
                              stackOut_37_1 = 1;
                              stackIn_46_0 = stackOut_37_0;
                              stackIn_46_1 = stackOut_37_1;
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              if (var5 != 0) {
                                L26: while (true) {
                                  if (stackIn_46_0 <= stackIn_46_1) {
                                    break L24;
                                  } else {
                                    stackOut_47_0 = ((jq) this).field_v.field_m[((jq) this).field_m];
                                    stackIn_59_0 = stackOut_47_0;
                                    stackIn_48_0 = stackOut_47_0;
                                    if (var5 != 0) {
                                      break L23;
                                    } else {
                                      L27: {
                                        L28: {
                                          if (stackIn_48_0 == 0) {
                                            ((jq) this).field_m = ((jq) this).field_m + 1;
                                            if (var5 == 0) {
                                              break L27;
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            break L28;
                                          }
                                        }
                                        L29: {
                                          if (!((jq) this).field_j.d((byte) 101)) {
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
                                          if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                            break L30;
                                          } else {
                                            hb discarded$9 = this.a(2, ((jq) this).field_m, (byte) -121);
                                            break L30;
                                          }
                                        }
                                        L31: {
                                          if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                            break L31;
                                          } else {
                                            var3 = new nm();
                                            var3.field_g = (long)((jq) this).field_m;
                                            ((jq) this).field_z.a(var3, (byte) 3);
                                            var2_int = 0;
                                            break L31;
                                          }
                                        }
                                        ((jq) this).field_m = ((jq) this).field_m + 1;
                                        if (var5 == 0) {
                                          break L27;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      stackOut_45_0 = ((jq) this).field_v.field_m.length;
                                      stackOut_45_1 = ((jq) this).field_m;
                                      stackIn_46_0 = stackOut_45_0;
                                      stackIn_46_1 = stackOut_45_1;
                                      continue L26;
                                    }
                                  }
                                }
                              } else {
                                L32: {
                                  if (stackIn_38_0 == stackIn_38_1) {
                                    break L32;
                                  } else {
                                    hb discarded$10 = this.a(2, var4, (byte) -118);
                                    break L32;
                                  }
                                }
                                L33: {
                                  L34: {
                                    if (1 == ((jq) this).field_e[var4]) {
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
                                  var3.b((byte) 111);
                                  break L33;
                                }
                                var3 = ((jq) this).field_z.a((byte) 116);
                                if (var5 == 0) {
                                  continue L22;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          L35: while (true) {
                            stackOut_106_0 = ((jq) this).field_v.field_m.length;
                            stackOut_106_1 = ((jq) this).field_m;
                            stackIn_104_0 = stackOut_106_0;
                            stackIn_104_1 = stackOut_106_1;
                            if (stackIn_104_0 <= stackIn_104_1) {
                              break L24;
                            } else {
                              stackOut_102_0 = ((jq) this).field_v.field_m[((jq) this).field_m];
                              stackIn_59_0 = stackOut_102_0;
                              stackIn_103_0 = stackOut_102_0;
                              if (var5 != 0) {
                                break L23;
                              } else {
                                stackOut_103_0 = stackIn_103_0;
                                stackIn_100_0 = stackOut_103_0;
                                L36: {
                                  if (stackIn_100_0 == 0) {
                                    ((jq) this).field_m = ((jq) this).field_m + 1;
                                    if (var5 == 0) {
                                      continue L35;
                                    } else {
                                      break L36;
                                    }
                                  } else {
                                    break L36;
                                  }
                                }
                                L37: {
                                  if (!((jq) this).field_j.d((byte) 101)) {
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
                                  if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                    break L38;
                                  } else {
                                    hb discarded$11 = this.a(2, ((jq) this).field_m, (byte) -121);
                                    break L38;
                                  }
                                }
                                L39: {
                                  if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                    break L39;
                                  } else {
                                    var3 = new nm();
                                    var3.field_g = (long)((jq) this).field_m;
                                    ((jq) this).field_z.a(var3, (byte) 3);
                                    var2_int = 0;
                                    break L39;
                                  }
                                }
                                ((jq) this).field_m = ((jq) this).field_m + 1;
                                if (var5 == 0) {
                                  continue L35;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                        stackOut_58_0 = var2_int;
                        stackIn_59_0 = stackOut_58_0;
                        break L23;
                      }
                      L40: {
                        if (stackIn_59_0 != 0) {
                          ((jq) this).field_f = false;
                          ((jq) this).field_m = 0;
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
                ((jq) this).field_z = null;
                break L1;
              } else {
                return;
              }
            }
          }
          L41: {
            L42: {
              if (!((jq) this).field_w) {
                break L42;
              } else {
                if (~((jq) this).field_q >= ~ue.a(false)) {
                  var2 = (hb) (Object) ((jq) this).field_l.b(-15519);
                  L43: while (true) {
                    L44: {
                      if (var2 == null) {
                        break L44;
                      } else {
                        stackOut_69_0 = var2.field_u;
                        stackIn_81_0 = stackOut_69_0 ? 1 : 0;
                        stackIn_70_0 = stackOut_69_0;
                        if (var5 != 0) {
                          break L41;
                        } else {
                          L45: {
                            L46: {
                              if (!stackIn_70_0) {
                                break L46;
                              } else {
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L47: {
                              if (!var2.field_v) {
                                break L47;
                              } else {
                                if (var2.field_B) {
                                  var2.b((byte) 111);
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                            var2.field_v = true;
                            break L45;
                          }
                          var2 = (hb) (Object) ((jq) this).field_l.a(true);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((jq) this).field_q = ue.a(false) + 1000L;
                    break L42;
                  }
                } else {
                  break L42;
                }
              }
            }
            stackOut_80_0 = param0;
            stackIn_81_0 = stackOut_80_0;
            break L41;
          }
          stackOut_81_0 = stackIn_81_0;
          stackOut_81_1 = 1;
          stackIn_82_0 = stackOut_81_0;
          stackIn_82_1 = stackOut_81_1;
          break L0;
        }
        L48: {
          if (stackIn_82_0 == stackIn_82_1) {
            break L48;
          } else {
            ((jq) this).b(-33);
            break L48;
          }
        }
    }

    private final hb a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        Object stackOut_61_0 = null;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          var4 = (Object) (Object) (hb) (Object) ((jq) this).field_l.a(-48, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((hb) var4).field_B) {
                break L0;
              } else {
                if (!((hb) var4).field_u) {
                  break L0;
                } else {
                  ((hb) var4).b((byte) 111);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  if (param0 == 1) {
                    if (null == ((jq) this).field_B) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((jq) this).field_u.a(param1, ((jq) this).field_B, (byte) -114);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (param0 == 2) {
                      if (((jq) this).field_B == null) {
                        throw new RuntimeException();
                      } else {
                        if (-1 != ((jq) this).field_e[param1]) {
                          throw new RuntimeException();
                        } else {
                          if (!((jq) this).field_j.d((byte) 101)) {
                            var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, false);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              L4: {
                if (((jq) this).field_B == null) {
                  break L4;
                } else {
                  if (((jq) this).field_e[param1] == -1) {
                    break L4;
                  } else {
                    var4 = (Object) (Object) ((jq) this).field_u.a(((jq) this).field_B, param1, 125);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (!((jq) this).field_j.a(2)) {
                var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, true);
                break L2;
              } else {
                return null;
              }
            }
            ((jq) this).field_l.a(34, (nm) var4, (long)param1);
            break L1;
          }
        }
        if (!((hb) var4).field_u) {
          if (param2 <= -104) {
            var5 = ((hb) var4).c((byte) -74);
            if (!(var4 instanceof kj)) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (var5.length <= 2) {
                        break L6;
                      } else {
                        fq.field_a.reset();
                        fq.field_a.update(var5, 0, -2 + var5.length);
                        var6_int = (int)fq.field_a.getValue();
                        if (var6_int == ((jq) this).field_v.field_p[param1]) {
                          L7: {
                            if (((jq) this).field_v.field_c == null) {
                              break L7;
                            } else {
                              if (((jq) this).field_v.field_c[param1] == null) {
                                break L7;
                              } else {
                                var7 = ((jq) this).field_v.field_c[param1];
                                var8 = jd.a(var5, 0, -14970, -2 + var5.length);
                                var9 = 0;
                                L8: while (true) {
                                  if (64 <= var9) {
                                    break L7;
                                  } else {
                                    stackOut_79_0 = ~var7[var9];
                                    stackOut_79_1 = ~var8[var9];
                                    stackIn_95_0 = stackOut_79_0;
                                    stackIn_95_1 = stackOut_79_1;
                                    stackIn_80_0 = stackOut_79_0;
                                    stackIn_80_1 = stackOut_79_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L5;
                                    } else {
                                      if (stackIn_80_0 != stackIn_80_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ((jq) this).field_j.field_i = 0;
                          ((jq) this).field_j.field_f = 0;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                  ((jq) this).field_j.a((byte) 8);
                  ((hb) var4).b((byte) 111);
                  if (((hb) var4).field_B) {
                    if (!((jq) this).field_j.a(2)) {
                      var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, true);
                      ((jq) this).field_l.a(34, (nm) var4, (long)param1);
                      break L9;
                    } else {
                      return null;
                    }
                  } else {
                    break L9;
                  }
                }
                return null;
              }
              L10: {
                L11: {
                  if (decompiledRegionSelector0 == 0) {
                    break L11;
                  } else {
                    var5[var5.length + -2] = (byte)(((jq) this).field_v.field_r[param1] >>> 8);
                    var5[var5.length + -1] = (byte)((jq) this).field_v.field_r[param1];
                    if (((jq) this).field_B != null) {
                      kj discarded$1 = ((jq) this).field_u.a(param1, false, var5, ((jq) this).field_B);
                      stackOut_94_0 = -2;
                      stackOut_94_1 = ~((jq) this).field_e[param1];
                      stackIn_95_0 = stackOut_94_0;
                      stackIn_95_1 = stackOut_94_1;
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                if (stackIn_95_0 == stackIn_95_1) {
                  break L10;
                } else {
                  ((jq) this).field_e[param1] = (byte) 1;
                  break L10;
                }
              }
              L12: {
                if (((hb) var4).field_B) {
                  break L12;
                } else {
                  ((hb) var4).b((byte) 111);
                  break L12;
                }
              }
              return (hb) var4;
            } else {
              try {
                L13: {
                  L14: {
                    if (var5 == null) {
                      break L14;
                    } else {
                      if (2 < var5.length) {
                        fq.field_a.reset();
                        fq.field_a.update(var5, 0, -2 + var5.length);
                        var6_int = (int)fq.field_a.getValue();
                        if (var6_int == ((jq) this).field_v.field_p[param1]) {
                          L15: {
                            L16: {
                              if (((jq) this).field_v.field_c == null) {
                                break L16;
                              } else {
                                if (((jq) this).field_v.field_c[param1] != null) {
                                  var7 = ((jq) this).field_v.field_c[param1];
                                  var8 = jd.a(var5, 0, -14970, -2 + var5.length);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (var9 >= 64) {
                                      break L16;
                                    } else {
                                      stackOut_47_0 = var8[var9];
                                      stackOut_47_1 = var7[var9];
                                      stackIn_53_0 = stackOut_47_0;
                                      stackIn_53_1 = stackOut_47_1;
                                      stackIn_48_0 = stackOut_47_0;
                                      stackIn_48_1 = stackOut_47_1;
                                      if (var10 != 0) {
                                        break L15;
                                      } else {
                                        if (stackIn_48_0 != stackIn_48_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L17;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            stackOut_52_0 = (var5[-2 + var5.length] & 255) << 8;
                            stackOut_52_1 = -(255 & var5[var5.length + -1]);
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            break L15;
                          }
                          var7_int = stackIn_53_0 - stackIn_53_1;
                          if (~var7_int == ~(65535 & ((jq) this).field_v.field_r[param1])) {
                            L18: {
                              if (((jq) this).field_e[param1] != 1) {
                                L19: {
                                  if (((jq) this).field_e[param1] != 0) {
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                ((jq) this).field_e[param1] = (byte) 1;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L20: {
                              if (((hb) var4).field_B) {
                                break L20;
                              } else {
                                ((hb) var4).b((byte) 111);
                                break L20;
                              }
                            }
                            stackOut_61_0 = var4;
                            stackIn_62_0 = stackOut_61_0;
                            break L13;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L21: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  ((jq) this).field_e[param1] = (byte) -1;
                  ((hb) var4).b((byte) 111);
                  if (((hb) var4).field_B) {
                    if (!((jq) this).field_j.a(2)) {
                      var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, true);
                      ((jq) this).field_l.a(34, (nm) var4, (long)param1);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                return null;
              }
              return (hb) (Object) stackIn_62_0;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final ko b(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (((jq) this).field_v == null) {
          L0: {
            if (((jq) this).field_s == null) {
              if (!((jq) this).field_j.a(2)) {
                ((jq) this).field_s = (hb) (Object) ((jq) this).field_j.a(-952050528, 255, (byte) 0, ((jq) this).field_h, true);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((jq) this).field_s.field_u) {
            L1: {
              L2: {
                var5 = ((jq) this).field_s.c((byte) 99);
                var2 = var5;
                if (((jq) this).field_s instanceof kj) {
                  break L2;
                } else {
                  try {
                    L3: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((jq) this).field_v = new ko(var5, ((jq) this).field_A, ((jq) this).field_i);
                        break L3;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = decompiledCaughtException;
                      ((jq) this).field_j.a((byte) 8);
                      ((jq) this).field_v = null;
                      if (!((jq) this).field_j.a(2)) {
                        break L4;
                      } else {
                        ((jq) this).field_s = null;
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((jq) this).field_s = (hb) (Object) ((jq) this).field_j.a(-952050528, 255, (byte) 0, ((jq) this).field_h, true);
                    return null;
                  }
                  if (null != ((jq) this).field_g) {
                    kj discarded$1 = ((jq) this).field_u.a(((jq) this).field_h, false, var5, ((jq) this).field_g);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((jq) this).field_v = new ko(var5, ((jq) this).field_A, ((jq) this).field_i);
                    if (((jq) this).field_o != ((jq) this).field_v.field_a) {
                      throw new RuntimeException();
                    } else {
                      break L5;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L6: {
                  var3 = decompiledCaughtException;
                  ((jq) this).field_v = null;
                  if (((jq) this).field_j.a(param0 ^ -110)) {
                    break L6;
                  } else {
                    ((jq) this).field_s = (hb) (Object) ((jq) this).field_j.a(param0 ^ 952050480, 255, (byte) 0, ((jq) this).field_h, true);
                    if (var4 != 0) {
                      break L6;
                    } else {
                      return null;
                    }
                  }
                }
                ((jq) this).field_s = null;
                return null;
              }
              break L1;
            }
            L7: {
              if (null != ((jq) this).field_B) {
                ((jq) this).field_e = new byte[((jq) this).field_v.field_f];
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param0 == -112) {
                break L8;
              } else {
                ((jq) this).f(-85);
                break L8;
              }
            }
            ((jq) this).field_s = null;
            return ((jq) this).field_v;
          } else {
            return null;
          }
        } else {
          return ((jq) this).field_v;
        }
    }

    public static void c(byte param0) {
        field_y = null;
        field_t = null;
        if (param0 != 56) {
            field_r = 120;
        }
        field_n = null;
    }

    jq(int param0, ve param1, ve param2, ih param3, kg param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((jq) this).field_l = new si(16);
        ((jq) this).field_m = 0;
        ((jq) this).field_x = new vl();
        ((jq) this).field_q = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((jq) this).field_B = param1;
                ((jq) this).field_h = param0;
                if (null == ((jq) this).field_B) {
                  break L2;
                } else {
                  ((jq) this).field_k = true;
                  ((jq) this).field_z = new vl();
                  if (!BrickABrac.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((jq) this).field_k = false;
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
              ((jq) this).field_w = stackIn_7_1 != 0;
              ((jq) this).field_i = param6;
              ((jq) this).field_A = param5;
              ((jq) this).field_j = param3;
              ((jq) this).field_o = param7;
              ((jq) this).field_u = param4;
              ((jq) this).field_g = param2;
              if (((jq) this).field_g == null) {
                break L4;
              } else {
                ((jq) this).field_s = (hb) (Object) ((jq) this).field_u.a(((jq) this).field_g, ((jq) this).field_h, -25);
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
            stackOut_10_1 = new StringBuilder().append("jq.<init>(").append(param0).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[]{510};
        field_p = 0;
    }
}

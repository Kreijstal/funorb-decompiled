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
        hb var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (hb) (Object) ((jq) this).field_l.a(-117, (long)param1);
              if (param0 < -60) {
                break L1;
              } else {
                ((jq) this).field_k = true;
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.f(-21546);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3_ref, "jq.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
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
        int stackIn_16_0 = 0;
        String stackIn_16_1 = null;
        int stackIn_18_0 = 0;
        String stackIn_18_1 = null;
        int stackIn_19_0 = 0;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        ta stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        String stackOut_15_1 = null;
        int stackOut_18_0 = 0;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_16_0 = 0;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        ta stackOut_23_0 = null;
        ta stackOut_21_0 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = -nc.field_k + lk.field_p;
            if (param0 == -16085) {
              nc.field_k = cc.field_J + -(var1_int >> 1072208929);
              mi.field_d = ea.field_e - (bg.field_r >> 1129237025);
              lk.field_p = var1_int + nc.field_k;
              var2 = mi.field_d;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~kn.field_E.length) {
                      break L3;
                    } else {
                      var4 = re.field_q[var3];
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (var4 < 0) {
                              break L5;
                            } else {
                              L6: {
                                if (fi.field_r.field_j != var4) {
                                  break L6;
                                } else {
                                  var5 = om.field_hc;
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var5 = ug.field_I;
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = qh.field_d;
                          break L4;
                        }
                        L7: {
                          var6 = kn.field_E[var3];
                          stackOut_15_0 = 0;
                          stackOut_15_1 = (String) var6;
                          stackIn_18_0 = stackOut_15_0;
                          stackIn_18_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var4 < 0) {
                            stackOut_18_0 = stackIn_18_0;
                            stackOut_18_1 = (String) (Object) stackIn_18_1;
                            stackOut_18_2 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            stackIn_19_2 = stackOut_18_2;
                            break L7;
                          } else {
                            stackOut_16_0 = stackIn_16_0;
                            stackOut_16_1 = (String) (Object) stackIn_16_1;
                            stackOut_16_2 = 1;
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_19_1 = stackOut_16_1;
                            stackIn_19_2 = stackOut_16_2;
                            break L7;
                          }
                        }
                        L8: {
                          var7 = pl.a(stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0);
                          var8 = cc.field_J + -(var7 >> 1576465057);
                          if (var4 < 0) {
                            break L8;
                          } else {
                            L9: {
                              var2 = var2 + dj.field_g;
                              if (fi.field_r.field_j != var4) {
                                stackOut_23_0 = ag.field_F;
                                stackIn_24_0 = stackOut_23_0;
                                break L9;
                              } else {
                                stackOut_21_0 = uc.field_l;
                                stackIn_24_0 = stackOut_21_0;
                                break L9;
                              }
                            }
                            L10: {
                              var9 = stackIn_24_0;
                              if (null != var9) {
                                var9.a((ek.field_lb << -1009580127) + var7, (wg.field_f << 1567437633) + nq.field_i, -ek.field_lb + var8, false, var2);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var2 = var2 + wg.field_f;
                            break L8;
                          }
                        }
                        L11: {
                          L12: {
                            if (var4 >= 0) {
                              break L12;
                            } else {
                              oc.field_m.c(var6, var8, gp.field_b + var2, var5, -1);
                              var2 = var2 + wh.field_m;
                              if (var10 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          lj.field_r.c(var6, var8, lj.field_i + var2, var5, -1);
                          var2 = var2 + (nq.field_i + dj.field_g + wg.field_f);
                          break L11;
                        }
                        var3++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "jq.J(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        nm var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (null != ((jq) this).field_z) {
              L1: {
                if (param0 == 20312) {
                  break L1;
                } else {
                  ((jq) this).field_o = -97;
                  break L1;
                }
              }
              if (((jq) this).b((byte) -112) == null) {
                return;
              } else {
                var2_ref = ((jq) this).field_x.d(-9);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_g;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~((jq) this).field_v.field_f >= ~var3) {
                                    break L7;
                                  } else {
                                    if (((jq) this).field_v.field_m[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.b((byte) 111);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((jq) this).field_e[var3] != 0) {
                                break L8;
                              } else {
                                hb discarded$2 = this.a(1, var3, (byte) -109);
                                break L8;
                              }
                            }
                            L9: {
                              if (((jq) this).field_e[var3] != -1) {
                                break L9;
                              } else {
                                hb discarded$3 = this.a(2, var3, (byte) -116);
                                break L9;
                              }
                            }
                            if (((jq) this).field_e[var3] == 1) {
                              var2_ref.b((byte) 111);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((jq) this).field_x.a((byte) 116);
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
          throw qb.a((Throwable) (Object) var2, "jq.L(" + param0 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -10476) {
                break L1;
              } else {
                ((jq) this).field_v = null;
                break L1;
              }
            }
            if (null != ((jq) this).field_B) {
              L2: {
                ((jq) this).field_f = true;
                if (((jq) this).field_z == null) {
                  ((jq) this).field_z = new vl();
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
          throw qb.a((Throwable) (Object) var2, "jq.M(" + param0 + ')');
        }
    }

    final static void e(int param0) {
        try {
            int var1_int = -91 / ((33 - param0) / 48);
            cb.a(uc.e((byte) -119), 9);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "jq.H(" + param0 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
        hb var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var3 = this.a(0, param0, (byte) -110);
              if (param1 <= -33) {
                break L1;
              } else {
                ((jq) this).field_h = 38;
                break L1;
              }
            }
            if (var3 != null) {
              var4 = var3.c((byte) -85);
              var3.b((byte) 111);
              stackOut_6_0 = (byte[]) var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3_ref, "jq.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        hb var2_ref = null;
        int var2_int = 0;
        nm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        byte stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_84_0 = 0;
        boolean stackIn_99_0 = false;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        byte stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_83_0 = 0;
        boolean stackOut_98_0 = false;
        int stackOut_118_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((jq) this).field_z) {
                  break L2;
                } else {
                  if (((jq) this).b((byte) -112) != null) {
                    L3: {
                      if (!((jq) this).field_k) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((jq) this).field_z.d(-101);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var3 == null) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_g;
                                stackOut_7_0 = ~((jq) this).field_e[var4];
                                stackOut_7_1 = -1;
                                stackIn_20_0 = stackOut_7_0;
                                stackIn_20_1 = stackOut_7_1;
                                stackIn_8_0 = stackOut_7_0;
                                stackIn_8_1 = stackOut_7_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_20_0 >= stackIn_20_1) {
                                      break L5;
                                    } else {
                                      stackOut_21_0 = 0;
                                      stackOut_21_1 = ((jq) this).field_v.field_m[((jq) this).field_m];
                                      stackIn_120_0 = stackOut_21_0;
                                      stackIn_120_1 = stackOut_21_1;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackIn_22_1 = stackOut_21_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_22_0 = stackIn_22_0;
                                        stackOut_22_1 = stackIn_22_1;
                                        stackIn_24_0 = stackOut_22_0;
                                        stackIn_24_1 = stackOut_22_1;
                                        L8: {
                                          L9: {
                                            if (stackIn_24_0 != stackIn_24_1) {
                                              break L9;
                                            } else {
                                              ((jq) this).field_m = ((jq) this).field_m + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (250 > ((jq) this).field_u.field_c) {
                                              break L10;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                              hb discarded$4 = this.a(1, ((jq) this).field_m, (byte) -119);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                              var3 = new nm();
                                              var3.field_g = (long)((jq) this).field_m;
                                              ((jq) this).field_z.a(var3, (byte) 3);
                                              var2_int = 0;
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((jq) this).field_m = ((jq) this).field_m + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_19_0 = ((jq) this).field_m;
                                        stackOut_19_1 = ((jq) this).field_v.field_m.length;
                                        stackIn_20_0 = stackOut_19_0;
                                        stackIn_20_1 = stackOut_19_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_8_0 == stackIn_8_1) {
                                      hb discarded$5 = this.a(1, var4, (byte) -118);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((jq) this).field_e[var4] == 0) {
                                        break L15;
                                      } else {
                                        var3.b((byte) 111);
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
                                  var3 = ((jq) this).field_z.a((byte) 116);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_19_0 = ((jq) this).field_m;
                              stackOut_19_1 = ((jq) this).field_v.field_m.length;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              if (stackIn_20_0 >= stackIn_20_1) {
                                break L5;
                              } else {
                                stackOut_21_0 = 0;
                                stackOut_21_1 = ((jq) this).field_v.field_m[((jq) this).field_m];
                                stackIn_120_0 = stackOut_21_0;
                                stackIn_120_1 = stackOut_21_1;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_22_0 = stackIn_22_0;
                                  stackOut_22_1 = stackIn_22_1;
                                  stackIn_24_0 = stackOut_22_0;
                                  stackIn_24_1 = stackOut_22_1;
                                  L17: {
                                    if (stackIn_24_0 != stackIn_24_1) {
                                      break L17;
                                    } else {
                                      ((jq) this).field_m = ((jq) this).field_m + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (250 > ((jq) this).field_u.field_c) {
                                      break L18;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                      hb discarded$4 = this.a(1, ((jq) this).field_m, (byte) -119);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((jq) this).field_e[((jq) this).field_m] == 0) {
                                      var3 = new nm();
                                      var3.field_g = (long)((jq) this).field_m;
                                      ((jq) this).field_z.a(var3, (byte) 3);
                                      var2_int = 0;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((jq) this).field_m = ((jq) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            if (var2_int == 0) {
                              break L21;
                            } else {
                              ((jq) this).field_m = 0;
                              ((jq) this).field_k = false;
                              break L21;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L22: {
                      if (!((jq) this).field_f) {
                        break L22;
                      } else {
                        var2_int = 1;
                        var3 = ((jq) this).field_z.d(-127);
                        L23: while (true) {
                          L24: {
                            L25: {
                              L26: {
                                if (var3 == null) {
                                  break L26;
                                } else {
                                  var4 = (int)var3.field_g;
                                  stackOut_52_0 = ((jq) this).field_e[var4];
                                  stackOut_52_1 = 1;
                                  stackIn_64_0 = stackOut_52_0;
                                  stackIn_64_1 = stackOut_52_1;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackIn_53_1 = stackOut_52_1;
                                  if (var5 != 0) {
                                    L27: while (true) {
                                      if (stackIn_64_0 <= stackIn_64_1) {
                                        break L25;
                                      } else {
                                        stackOut_65_0 = ((jq) this).field_v.field_m[((jq) this).field_m];
                                        stackIn_84_0 = stackOut_65_0;
                                        stackIn_66_0 = stackOut_65_0;
                                        if (var5 != 0) {
                                          break L24;
                                        } else {
                                          stackOut_66_0 = stackIn_66_0;
                                          stackIn_68_0 = stackOut_66_0;
                                          L28: {
                                            L29: {
                                              if (stackIn_68_0 == 0) {
                                                ((jq) this).field_m = ((jq) this).field_m + 1;
                                                if (var5 == 0) {
                                                  break L28;
                                                } else {
                                                  break L29;
                                                }
                                              } else {
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              if (!((jq) this).field_j.d((byte) 101)) {
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
                                              if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                                break L31;
                                              } else {
                                                hb discarded$6 = this.a(2, ((jq) this).field_m, (byte) -121);
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                                break L32;
                                              } else {
                                                var3 = new nm();
                                                var3.field_g = (long)((jq) this).field_m;
                                                ((jq) this).field_z.a(var3, (byte) 3);
                                                var2_int = 0;
                                                break L32;
                                              }
                                            }
                                            ((jq) this).field_m = ((jq) this).field_m + 1;
                                            if (var5 == 0) {
                                              break L28;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          stackOut_63_0 = ((jq) this).field_v.field_m.length;
                                          stackOut_63_1 = ((jq) this).field_m;
                                          stackIn_64_0 = stackOut_63_0;
                                          stackIn_64_1 = stackOut_63_1;
                                          continue L27;
                                        }
                                      }
                                    }
                                  } else {
                                    L33: {
                                      if (stackIn_53_0 == stackIn_53_1) {
                                        break L33;
                                      } else {
                                        hb discarded$7 = this.a(2, var4, (byte) -118);
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      L35: {
                                        if (1 == ((jq) this).field_e[var4]) {
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
                                      var3.b((byte) 111);
                                      break L34;
                                    }
                                    var3 = ((jq) this).field_z.a((byte) 116);
                                    if (var5 == 0) {
                                      continue L23;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              L36: while (true) {
                                stackOut_63_0 = ((jq) this).field_v.field_m.length;
                                stackOut_63_1 = ((jq) this).field_m;
                                stackIn_64_0 = stackOut_63_0;
                                stackIn_64_1 = stackOut_63_1;
                                if (stackIn_64_0 <= stackIn_64_1) {
                                  break L25;
                                } else {
                                  stackOut_65_0 = ((jq) this).field_v.field_m[((jq) this).field_m];
                                  stackIn_84_0 = stackOut_65_0;
                                  stackIn_66_0 = stackOut_65_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_66_0 = stackIn_66_0;
                                    stackIn_68_0 = stackOut_66_0;
                                    L37: {
                                      if (stackIn_68_0 == 0) {
                                        ((jq) this).field_m = ((jq) this).field_m + 1;
                                        if (var5 == 0) {
                                          continue L36;
                                        } else {
                                          break L37;
                                        }
                                      } else {
                                        break L37;
                                      }
                                    }
                                    L38: {
                                      if (!((jq) this).field_j.d((byte) 101)) {
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
                                      if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                        break L39;
                                      } else {
                                        hb discarded$6 = this.a(2, ((jq) this).field_m, (byte) -121);
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (1 == ((jq) this).field_e[((jq) this).field_m]) {
                                        break L40;
                                      } else {
                                        var3 = new nm();
                                        var3.field_g = (long)((jq) this).field_m;
                                        ((jq) this).field_z.a(var3, (byte) 3);
                                        var2_int = 0;
                                        break L40;
                                      }
                                    }
                                    ((jq) this).field_m = ((jq) this).field_m + 1;
                                    if (var5 == 0) {
                                      continue L36;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_83_0 = var2_int;
                            stackIn_84_0 = stackOut_83_0;
                            break L24;
                          }
                          L41: {
                            if (stackIn_84_0 != 0) {
                              ((jq) this).field_f = false;
                              ((jq) this).field_m = 0;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    ((jq) this).field_z = null;
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              L42: {
                L43: {
                  if (!((jq) this).field_w) {
                    break L43;
                  } else {
                    if (~((jq) this).field_q >= ~ue.a(false)) {
                      var2_ref = (hb) (Object) ((jq) this).field_l.b(-15519);
                      L44: while (true) {
                        L45: {
                          if (null == var2_ref) {
                            break L45;
                          } else {
                            stackOut_98_0 = var2_ref.field_u;
                            stackIn_119_0 = stackOut_98_0 ? 1 : 0;
                            stackIn_99_0 = stackOut_98_0;
                            if (var5 != 0) {
                              break L42;
                            } else {
                              L46: {
                                L47: {
                                  if (!stackIn_99_0) {
                                    break L47;
                                  } else {
                                    if (var5 == 0) {
                                      break L46;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                                L48: {
                                  if (!var2_ref.field_v) {
                                    break L48;
                                  } else {
                                    if (var2_ref.field_B) {
                                      var2_ref.b((byte) 111);
                                      if (var5 == 0) {
                                        break L46;
                                      } else {
                                        break L48;
                                      }
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                                var2_ref.field_v = true;
                                break L46;
                              }
                              var2_ref = (hb) (Object) ((jq) this).field_l.a(true);
                              if (var5 == 0) {
                                continue L44;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                        ((jq) this).field_q = ue.a(false) + 1000L;
                        break L43;
                      }
                    } else {
                      break L43;
                    }
                  }
                }
                stackOut_118_0 = param0;
                stackIn_119_0 = stackOut_118_0;
                break L42;
              }
              stackOut_119_0 = stackIn_119_0;
              stackOut_119_1 = 1;
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              break L1;
            }
            L49: {
              if (stackIn_120_0 == stackIn_120_1) {
                break L49;
              } else {
                ((jq) this).b(-33);
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "jq.K(" + param0 + ')');
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
        Object stackIn_35_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_62_0 = null;
        byte stackIn_82_0 = 0;
        byte stackIn_82_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_110_0 = null;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        Object stackIn_142_0 = null;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        Object stackIn_154_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_34_0 = null;
        Object stackOut_51_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        Object stackOut_153_0 = null;
        byte stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_109_0 = null;
        Object stackOut_61_0 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (hb) (Object) ((jq) this).field_l.a(-48, (long)param1);
              if (null == var4) {
                break L1;
              } else {
                if (0 != param0) {
                  break L1;
                } else {
                  if (((hb) var4).field_B) {
                    break L1;
                  } else {
                    if (!((hb) var4).field_u) {
                      break L1;
                    } else {
                      ((hb) var4).b((byte) 111);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 != null) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param0 == 0) {
                      break L4;
                    } else {
                      if (param0 == 1) {
                        if (null == ((jq) this).field_B) {
                          throw new RuntimeException();
                        } else {
                          var4 = (Object) (Object) ((jq) this).field_u.a(param1, ((jq) this).field_B, (byte) -114);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
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
                              L5: {
                                if (((jq) this).field_j.d((byte) 101)) {
                                  break L5;
                                } else {
                                  var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, false);
                                  if (var10 == 0) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              stackOut_34_0 = null;
                              stackIn_35_0 = stackOut_34_0;
                              return (hb) (Object) stackIn_35_0;
                            }
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  L6: {
                    if (((jq) this).field_B == null) {
                      break L6;
                    } else {
                      if (((jq) this).field_e[param1] == -1) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((jq) this).field_u.a(((jq) this).field_B, param1, 125);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (!((jq) this).field_j.a(2)) {
                    var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, true);
                    break L3;
                  } else {
                    stackOut_51_0 = null;
                    stackIn_52_0 = stackOut_51_0;
                    return (hb) (Object) stackIn_52_0;
                  }
                }
                ((jq) this).field_l.a(34, (nm) var4, (long)param1);
                break L2;
              }
            }
            if (((hb) var4).field_u) {
              stackOut_58_0 = null;
              stackIn_59_0 = stackOut_58_0;
              return (hb) (Object) stackIn_59_0;
            } else {
              if (param2 <= -104) {
                var5 = ((hb) var4).c((byte) -74);
                if (!(var4 instanceof kj)) {
                  try {
                    L7: {
                      L8: {
                        if (null == var5) {
                          break L8;
                        } else {
                          if (var5.length <= 2) {
                            break L8;
                          } else {
                            fq.field_a.reset();
                            fq.field_a.update(var5, 0, -2 + var5.length);
                            var6_int = (int)fq.field_a.getValue();
                            if (var6_int == ((jq) this).field_v.field_p[param1]) {
                              L9: {
                                if (((jq) this).field_v.field_c == null) {
                                  break L9;
                                } else {
                                  if (((jq) this).field_v.field_c[param1] == null) {
                                    break L9;
                                  } else {
                                    var7 = ((jq) this).field_v.field_c[param1];
                                    var8 = jd.a(var5, 0, -14970, -2 + var5.length);
                                    var9 = 0;
                                    L10: while (true) {
                                      if (64 <= var9) {
                                        break L9;
                                      } else {
                                        stackOut_127_0 = ~var7[var9];
                                        stackOut_127_1 = ~var8[var9];
                                        stackIn_147_0 = stackOut_127_0;
                                        stackIn_147_1 = stackOut_127_1;
                                        stackIn_128_0 = stackOut_127_0;
                                        stackIn_128_1 = stackOut_127_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L7;
                                        } else {
                                          if (stackIn_128_0 != stackIn_128_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
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
                              ((jq) this).field_j.field_i = 0;
                              ((jq) this).field_j.field_f = 0;
                              decompiledRegionSelector0 = 1;
                              break L7;
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
                    L11: {
                      var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                      ((jq) this).field_j.a((byte) 8);
                      ((hb) var4).b((byte) 111);
                      if (((hb) var4).field_B) {
                        if (((jq) this).field_j.a(2)) {
                          break L11;
                        } else {
                          var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, true);
                          ((jq) this).field_l.a(34, (nm) var4, (long)param1);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    stackOut_141_0 = null;
                    stackIn_142_0 = stackOut_141_0;
                    return (hb) (Object) stackIn_142_0;
                  }
                  L12: {
                    L13: {
                      if (decompiledRegionSelector0 == 0) {
                        break L13;
                      } else {
                        var5[var5.length + -2] = (byte)(((jq) this).field_v.field_r[param1] >>> 709958760);
                        var5[var5.length + -1] = (byte)((jq) this).field_v.field_r[param1];
                        if (((jq) this).field_B != null) {
                          kj discarded$1 = ((jq) this).field_u.a(param1, false, var5, ((jq) this).field_B);
                          stackOut_146_0 = -2;
                          stackOut_146_1 = ~((jq) this).field_e[param1];
                          stackIn_147_0 = stackOut_146_0;
                          stackIn_147_1 = stackOut_146_1;
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (stackIn_147_0 == stackIn_147_1) {
                      break L12;
                    } else {
                      ((jq) this).field_e[param1] = (byte) 1;
                      break L12;
                    }
                  }
                  L14: {
                    if (((hb) var4).field_B) {
                      break L14;
                    } else {
                      ((hb) var4).b((byte) 111);
                      break L14;
                    }
                  }
                  stackOut_153_0 = var4;
                  stackIn_154_0 = stackOut_153_0;
                  break L0;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null == var5) {
                          break L16;
                        } else {
                          if (2 < var5.length) {
                            fq.field_a.reset();
                            fq.field_a.update(var5, 0, -2 + var5.length);
                            var6_int = (int)fq.field_a.getValue();
                            if (var6_int == ((jq) this).field_v.field_p[param1]) {
                              L17: {
                                L18: {
                                  if (((jq) this).field_v.field_c == null) {
                                    break L18;
                                  } else {
                                    if (((jq) this).field_v.field_c[param1] != null) {
                                      var7 = ((jq) this).field_v.field_c[param1];
                                      var8 = jd.a(var5, 0, -14970, -2 + var5.length);
                                      var9 = 0;
                                      L19: while (true) {
                                        if (var9 >= 64) {
                                          break L18;
                                        } else {
                                          stackOut_81_0 = var8[var9];
                                          stackOut_81_1 = var7[var9];
                                          stackIn_89_0 = stackOut_81_0;
                                          stackIn_89_1 = stackOut_81_1;
                                          stackIn_82_0 = stackOut_81_0;
                                          stackIn_82_1 = stackOut_81_1;
                                          if (var10 != 0) {
                                            break L17;
                                          } else {
                                            if (stackIn_82_0 != stackIn_82_1) {
                                              throw new RuntimeException();
                                            } else {
                                              var9++;
                                              if (var10 == 0) {
                                                continue L19;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                stackOut_88_0 = (var5[-2 + var5.length] & 255) << 817052584;
                                stackOut_88_1 = -(255 & var5[var5.length + -1]);
                                stackIn_89_0 = stackOut_88_0;
                                stackIn_89_1 = stackOut_88_1;
                                break L17;
                              }
                              var7_int = stackIn_89_0 - stackIn_89_1;
                              if (~var7_int == ~(65535 & ((jq) this).field_v.field_r[param1])) {
                                L20: {
                                  if (((jq) this).field_e[param1] != 1) {
                                    L21: {
                                      if (((jq) this).field_e[param1] != 0) {
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    ((jq) this).field_e[param1] = (byte) 1;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L22: {
                                  if (((hb) var4).field_B) {
                                    break L22;
                                  } else {
                                    ((hb) var4).b((byte) 111);
                                    break L22;
                                  }
                                }
                                stackOut_100_0 = var4;
                                stackIn_101_0 = stackOut_100_0;
                                break L15;
                              } else {
                                throw new RuntimeException();
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L23: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      ((jq) this).field_e[param1] = (byte) -1;
                      ((hb) var4).b((byte) 111);
                      if (((hb) var4).field_B) {
                        if (!((jq) this).field_j.a(2)) {
                          var4 = (Object) (Object) ((jq) this).field_j.a(-952050528, ((jq) this).field_h, (byte) 2, param1, true);
                          ((jq) this).field_l.a(34, (nm) var4, (long)param1);
                          break L23;
                        } else {
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    stackOut_109_0 = null;
                    stackIn_110_0 = stackOut_109_0;
                    return (hb) (Object) stackIn_110_0;
                  }
                  return (hb) (Object) stackIn_101_0;
                }
              } else {
                stackOut_61_0 = null;
                stackIn_62_0 = stackOut_61_0;
                return (hb) (Object) stackIn_62_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw qb.a((Throwable) var4, "jq.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (hb) (Object) stackIn_154_0;
    }

    final ko b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ko stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_50_0 = null;
        ko stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_49_0 = null;
        ko stackOut_58_0 = null;
        Object stackOut_14_0 = null;
        ko stackOut_2_0 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (((jq) this).field_v == null) {
              L1: {
                if (((jq) this).field_s == null) {
                  if (((jq) this).field_j.a(2)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (ko) (Object) stackIn_11_0;
                  } else {
                    ((jq) this).field_s = (hb) (Object) ((jq) this).field_j.a(-952050528, 255, (byte) 0, ((jq) this).field_h, true);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (!((jq) this).field_s.field_u) {
                L2: {
                  L3: {
                    var2_array = ((jq) this).field_s.c((byte) 99);
                    if (((jq) this).field_s instanceof kj) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((jq) this).field_v = new ko(var2_array, ((jq) this).field_A, ((jq) this).field_i);
                            break L4;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var3 = decompiledCaughtException;
                            ((jq) this).field_j.a((byte) 8);
                            ((jq) this).field_v = null;
                            if (!((jq) this).field_j.a(2)) {
                              break L6;
                            } else {
                              ((jq) this).field_s = null;
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((jq) this).field_s = (hb) (Object) ((jq) this).field_j.a(-952050528, 255, (byte) 0, ((jq) this).field_h, true);
                          break L5;
                        }
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        return (ko) (Object) stackIn_30_0;
                      }
                      if (null != ((jq) this).field_g) {
                        kj discarded$1 = ((jq) this).field_u.a(((jq) this).field_h, false, var2_array, ((jq) this).field_g);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L7: {
                      if (null != var2_array) {
                        ((jq) this).field_v = new ko(var2_array, ((jq) this).field_A, ((jq) this).field_i);
                        if (((jq) this).field_o != ((jq) this).field_v.field_a) {
                          throw new RuntimeException();
                        } else {
                          break L7;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var3 = decompiledCaughtException;
                        ((jq) this).field_v = null;
                        if (((jq) this).field_j.a(param0 ^ -110)) {
                          break L9;
                        } else {
                          ((jq) this).field_s = (hb) (Object) ((jq) this).field_j.a(param0 ^ 952050480, 255, (byte) 0, ((jq) this).field_h, true);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((jq) this).field_s = null;
                      break L8;
                    }
                    stackOut_49_0 = null;
                    stackIn_50_0 = stackOut_49_0;
                    return (ko) (Object) stackIn_50_0;
                  }
                  break L2;
                }
                L10: {
                  if (null != ((jq) this).field_B) {
                    ((jq) this).field_e = new byte[((jq) this).field_v.field_f];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0 == -112) {
                    break L11;
                  } else {
                    ((jq) this).f(-85);
                    break L11;
                  }
                }
                ((jq) this).field_s = null;
                stackOut_58_0 = ((jq) this).field_v;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (ko) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((jq) this).field_v;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "jq.C(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_y = null;
              field_t = null;
              if (param0 == 56) {
                break L1;
              } else {
                field_r = 120;
                break L1;
              }
            }
            field_n = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "jq.I(" + param0 + ')');
        }
    }

    jq(int param0, ve param1, ve param2, ih param3, kg param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((jq) this).field_w = param8;
              ((jq) this).field_i = param6;
              ((jq) this).field_A = param5;
              ((jq) this).field_j = param3;
              ((jq) this).field_o = param7;
              ((jq) this).field_u = param4;
              ((jq) this).field_g = param2;
              if (((jq) this).field_g == null) {
                break L3;
              } else {
                ((jq) this).field_s = (hb) (Object) ((jq) this).field_u.a(((jq) this).field_g, ((jq) this).field_h, -25);
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
            stackOut_9_1 = new StringBuilder().append("jq.<init>(").append(param0).append(',');
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
          throw qb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
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

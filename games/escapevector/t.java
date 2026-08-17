/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    wc field_b;
    boolean field_c;
    private int field_d;
    static ka field_a;
    private int[] field_e;

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 62) {
                break L1;
              } else {
                this.b(103, false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.field_c) {
                  break L3;
                } else {
                  this.field_d = 8;
                  if (EscapeVector.field_A == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_d = 9;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.G(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 9) {
                break L1;
              } else {
                field_a = (ka) null;
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) < (param0 ^ -1)) {
                stackIn_7_0 = param1;
                break L2;
              } else {
                stackIn_7_0 = param0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "t.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0) {
        int var3 = 0;
        boolean stackIn_11_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            L1: while (true) {
              L2: {
                if (!pn.p(-111)) {
                  this.field_b.a(param0 + -400, 240, 192, 24, param0);
                  stackIn_11_0 = this.a(-13169, true);
                  break L2;
                } else {
                  this.field_b.c((byte) 6);
                  stackIn_11_0 = this.a(param0 + -13569, false);

                  if (var3 != 0) {
                    break L2;
                  } else {

                    if (stackIn_11_0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      continue L1;
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
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, byte param2, boolean param3) {
        int stackIn_8_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_63_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (5 * param0 > mj.field_d) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                mj.field_b.g();
                em.d();
                if (!param3) {
                  stackIn_8_0 = 6340704;
                  break L1;
                } else {
                  stackIn_8_0 = 16777215;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_8_0;
                if (param2 == -34) {
                  break L2;
                } else {
                  this.field_e = (int[]) null;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var6 = mj.field_b.field_A / 2;
                  if ((param0 ^ -1) != -1) {
                    break L4;
                  } else {
                    fh.field_g.c(of.field_e, var6, 22, var5_int, -1);
                    if (var11 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-2 == (param0 ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (param0 != 2) {
                        break L6;
                      } else {
                        fh.field_g.c(mc.field_a, var6, 22, var5_int, -1);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((param0 ^ -1) != -4) {
                        break L7;
                      } else {
                        L8: {
                          var7 = fh.field_g.b(oi.field_N);
                          var8 = fh.field_g.b(ee.field_d);
                          if (var8 < var7) {
                            stackIn_31_0 = var7;
                            break L8;
                          } else {
                            stackIn_31_0 = var8;
                            break L8;
                          }
                        }
                        var9 = stackIn_31_0;
                        var10 = (var9 - 68) / 2 + var6;
                        fh.field_g.b(oi.field_N, var10, 22, var5_int, -1);
                        r.a(var10, 13202, 4, qm.field_c, var5_int);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (4 == param0) {
                        break L9;
                      } else {
                        L10: {
                          if (5 != param0) {
                            break L10;
                          } else {
                            fh.field_g.c(an.field_b, var6, 22, var5_int, -1);
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (param0 == 6) {
                            break L11;
                          } else {
                            L12: {
                              if ((param0 ^ -1) == -8) {
                                break L12;
                              } else {
                                if ((param0 ^ -1) == -9) {
                                  fh.field_g.c(uf.field_s, var6, 22, var5_int, -1);
                                  if (var11 == 0) {
                                    break L3;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            fh.field_g.c(da.field_a, var6, 22, var5_int, -1);
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                        fh.field_g.c(na.field_m, var6, 22, var5_int, -1);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L13: {
                      var7 = fh.field_g.b(oi.field_N);
                      var8 = fh.field_g.b(ee.field_d);
                      if ((var8 ^ -1) <= (var7 ^ -1)) {
                        stackIn_63_0 = var8;
                        break L13;
                      } else {
                        stackIn_63_0 = var7;
                        break L13;
                      }
                    }
                    var9 = stackIn_63_0;
                    var10 = (-68 + var9) / 2 + var6;
                    fh.field_g.b(ee.field_d, var10, 22, var5_int, -1);
                    r.a(var10, 13202, 4, kc.field_b, var5_int);
                    if (var11 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                fh.field_g.c(EscapeVector.field_z, var6, 22, var5_int, -1);
                break L3;
              }
              L14: {
                L15: {
                  md.field_D.a(112);
                  cf.a(mj.field_b, true, 1);
                  mj.field_b.h(5267536);
                  var7 = -mj.field_d + 30 + 5 * param0;
                  if (var7 <= 0) {
                    break L15;
                  } else {
                    mf.a(param1, (-mj.field_b.field_A + 640) / 2, var7, mj.field_b, param2 ^ 120);
                    if (var11 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                mj.field_b.e((-mj.field_b.field_A + 640) / 2, param1);
                break L14;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "t.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static rn a(Throwable param0, String param1) {
        rn var2;
        RuntimeException var2_ref;
        L0: {
          if (param0 instanceof rn) {
            var2 = (rn) ((Object) param0);
            var2.field_g = var2.field_g + ' ' + param1;
            break L0;
          } else {
            var2 = new rn(param0, param1);
            break L0;
          }
        }
        return var2;
    }

    public static void b(byte param0) {
        if (param0 >= -24) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "t.D(" + param0 + ')');
        }
    }

    private final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 52) {
                break L1;
              } else {
                t.b((byte) -84);
                break L1;
              }
            }
            L2: {
              if (this.field_b.field_h < 0) {
                break L2;
              } else {
                if ((this.field_e.length ^ -1) < (this.field_b.field_h ^ -1)) {
                  stackIn_10_0 = this.field_e[this.field_b.field_h];
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackIn_8_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 192) {
              L1: {
                if ((param1 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param1 < this.field_e.length) {
                    stackIn_10_0 = this.field_e[param1];
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_8_0 = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 121;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "t.I(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final void a(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_20_0;
        Object stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        Object stackIn_27_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            em.d();
            od.b(2);
            if (mj.a((byte) 117)) {
              L1: {
                var2_int = dn.a(0) / 2 - -20;
                var3 = 15 + ea.d((byte) -122) / 2;
                if (mj.field_d >= 40) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  stackIn_8_0 = -mj.field_d + 40;
                  break L1;
                }
              }
              fc.a(stackIn_8_0, -var2_int + 320, var2_int + 321, 301 - -var3, true, 29788, true, 6324320, 3162160, 0, 300 - var3, true);
              en.c(param0 ^ -16);
              pb.a(4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (-41 >= (mj.field_d ^ -1)) {
                  stackIn_14_0 = 0;
                  break L2;
                } else {
                  stackIn_14_0 = -mj.field_d + 40;
                  break L2;
                }
              }
              fc.a(stackIn_14_0, 240, 400, 16 + (192 + this.field_d * 24), true, 29788, true, 6324320, 3162160, 0, 176, true);
              pb.a(param0 ^ -12);
              var2_int = 0;
              var3 = 192;
              L3: while (true) {
                L4: {
                  L5: {
                    L6: {
                      if ((this.field_e.length ^ -1) >= (var2_int ^ -1)) {
                        break L6;
                      } else {
                        var4 = this.a(192, var2_int);
                        stackIn_27_0 = this;

                        if (var5 != 0) {
                          break L5;
                        } else {
                          L7: {
                            stackIn_22_0 = this;

                            stackIn_22_1 = var4;

                            stackIn_22_2 = var3;

                            stackIn_22_3 = -34;

                            if ((var4 ^ -1) != (this.b(69) ^ -1)) {
                              stackIn_23_0 = this;
                              stackIn_23_1 = stackIn_22_1;
                              stackIn_23_2 = stackIn_22_2;
                              stackIn_23_3 = stackIn_22_3;
                              stackIn_23_4 = 0;
                              break L7;
                            } else {
                              stackIn_20_0 = this;



                              stackIn_23_0 = this;
                              stackIn_23_1 = stackIn_22_1;
                              stackIn_23_2 = stackIn_22_2;
                              stackIn_23_3 = stackIn_22_3;
                              stackIn_23_4 = 1;
                              break L7;
                            }
                          }
                          this.a(stackIn_23_1, stackIn_23_2, (byte) stackIn_23_3, stackIn_23_4 != 0);
                          var3 += 24;
                          var2_int++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (param0 == -16) {
                      break L4;
                    } else {
                      stackIn_27_0 = this;
                      break L5;
                    }
                  }
                  ((t) (this)).field_b = (wc) null;
                  break L4;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != -26480) {
            return;
        }
        try {
            this.field_b.a(this.field_b.a((byte) 115, 192, dh.field_d, 24, 400, bj.field_y, 240), param1, 4767999);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "t.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_c) {
                  break L2;
                } else {
                  this.field_e = new int[]{0, 2, 3, 4, 5, 6, 7, 8};
                  if (EscapeVector.field_A == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_e = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
              break L1;
            }
            L3: {
              if (param0 == 22) {
                break L3;
              } else {
                field_a = (ka) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.H(" + param0 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_182_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        o var4_ref_o = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        o var9 = null;
        int var10 = 0;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (!this.field_b.field_e) {
                break L1;
              } else {
                rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, 8192);
                break L1;
              }
            }
            L2: {
              var3_int = this.b(123);
              if ((var3_int ^ -1) != -1) {
                break L2;
              } else {
                if (!this.field_b.b((byte) -18)) {
                  break L2;
                } else {
                  oe.c(param1, 2560);
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if ((var3_int ^ -1) != -2) {
                break L3;
              } else {
                if (!this.field_b.b((byte) -18)) {
                  break L3;
                } else {
                  wk.field_c = true;
                  aj.field_a.a(param1, (byte) 47);
                  mj.field_d = 0;
                  break L3;
                }
              }
            }
            L4: {
              if ((var3_int ^ -1) != -3) {
                break L4;
              } else {
                if (this.field_b.b((byte) -18)) {
                  ek.a(this.field_b.field_j, false);
                  stackIn_23_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (-4 == (var3_int ^ -1)) {
                L6: {
                  if (!this.field_b.g(param0 + 13072)) {
                    break L6;
                  } else {
                    if (qm.field_c <= 0) {
                      break L6;
                    } else {
                      L7: {
                        qm.field_c = qm.field_c - 8;
                        if (0 > qm.field_c) {
                          qm.field_c = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ce.d(8192);
                      break L6;
                    }
                  }
                }
                L8: {
                  if (!this.field_b.b(-98)) {
                    break L8;
                  } else {
                    if (qm.field_c >= 64) {
                      break L8;
                    } else {
                      L9: {
                        qm.field_c = qm.field_c + 8;
                        if (-65 > (qm.field_c ^ -1)) {
                          qm.field_c = 64;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ce.d(8192);
                      break L8;
                    }
                  }
                }
                L10: {
                  if (this.field_b.d(-10809)) {
                    qm.field_c = 0;
                    ce.d(8192);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (this.field_b.e(0)) {
                    qm.field_c = 64;
                    ce.d(8192);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (this.field_b.a(false)) {
                    break L12;
                  } else {
                    if (this.field_b.b((byte) -18)) {
                      ce.d(param0 ^ -4977);
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L12;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L13: {
                  var4 = fh.field_g.b(oi.field_N);
                  var5 = fh.field_g.b(ee.field_d);
                  if ((var4 ^ -1) >= (var5 ^ -1)) {
                    stackIn_68_0 = var5;
                    break L13;
                  } else {
                    stackIn_68_0 = var4;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var6 = stackIn_68_0;
                    var7 = 320 + (var6 - 68) / 2;
                    var8 = -var7 - 2 + dh.field_d;
                    if (-1 < (var8 ^ -1)) {
                      break L15;
                    } else {
                      if (-65 <= (var8 ^ -1)) {
                        break L14;
                      } else {
                        var8 = 64;
                        if (var10 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  var8 = 0;
                  break L14;
                }
                L16: {
                  if (this.field_b.b((byte) -18)) {
                    break L16;
                  } else {
                    if ((qm.field_c ^ -1) != (var8 ^ -1)) {
                      break L16;
                    } else {
                      break L5;
                    }
                  }
                }
                qm.field_c = var8;
                ce.d(8192);
                break L5;
              } else {
                break L5;
              }
            }
            L17: {
              if ((var3_int ^ -1) == -5) {
                L18: {
                  if (!this.field_b.g(116)) {
                    break L18;
                  } else {
                    if (kc.field_b <= 0) {
                      break L18;
                    } else {
                      L19: {
                        kc.field_b = kc.field_b - 8;
                        if (kc.field_b >= 0) {
                          break L19;
                        } else {
                          kc.field_b = 0;
                          break L19;
                        }
                      }
                      var4_ref_o = ni.field_N;
                      if (null != var4_ref_o) {
                        var4_ref_o.d(kn.field_b * kc.field_b / 64);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                L20: {
                  if (!this.field_b.b(-98)) {
                    break L20;
                  } else {
                    if (-65 < (kc.field_b ^ -1)) {
                      L21: {
                        kc.field_b = kc.field_b + 8;
                        if (64 < kc.field_b) {
                          kc.field_b = 64;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var4_ref_o = ni.field_N;
                      if (null != var4_ref_o) {
                        var4_ref_o.d(kn.field_b * kc.field_b / 64);
                        break L20;
                      } else {
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if (!this.field_b.d(-10809)) {
                    break L22;
                  } else {
                    kc.field_b = 0;
                    var4_ref_o = ni.field_N;
                    if (var4_ref_o != null) {
                      var4_ref_o.d(kc.field_b * kn.field_b / 64);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (this.field_b.e(0)) {
                    kc.field_b = 64;
                    var4_ref_o = ni.field_N;
                    if (var4_ref_o == null) {
                      break L23;
                    } else {
                      var4_ref_o.d(kn.field_b * kc.field_b / 64);
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                if (this.field_b.a(false)) {
                  L24: {
                    var4 = fh.field_g.b(oi.field_N);
                    var5 = fh.field_g.b(ee.field_d);
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                      stackIn_129_0 = var5;
                      break L24;
                    } else {
                      stackIn_129_0 = var4;
                      break L24;
                    }
                  }
                  L25: {
                    L26: {
                      var6 = stackIn_129_0;
                      var7 = 320 - -((-68 + var6) / 2);
                      var8 = dh.field_d + -2 + -var7;
                      if (0 <= var8) {
                        break L26;
                      } else {
                        var8 = 0;
                        if (var10 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (-65 > (var8 ^ -1)) {
                      var8 = 64;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  kc.field_b = var8;
                  var9 = ni.field_N;
                  if (var9 == null) {
                    break L17;
                  } else {
                    var9.d(kn.field_b * kc.field_b / 64);
                    break L17;
                  }
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L27: {
              if (-6 != (var3_int ^ -1)) {
                break L27;
              } else {
                if (!this.field_b.b((byte) -18)) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      if (null == df.field_d) {
                        break L29;
                      } else {
                        ri.a(param0 + -11954);
                        if (var10 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    eo.a(24, param1);
                    break L28;
                  }
                  stackIn_153_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            L30: {
              if (-7 != (var3_int ^ -1)) {
                break L30;
              } else {
                if (this.field_b.b((byte) -18)) {
                  kh.a(this.field_b.field_j, -1230, false);
                  mj.field_d = 0;
                  gi.a((byte) -96);
                  stackIn_161_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (-8 != (var3_int ^ -1)) {
                break L31;
              } else {
                if (!this.field_b.b((byte) -18)) {
                  break L31;
                } else {
                  nf.a(param0 + 13193, this.field_b.field_j);
                  mj.field_d = 0;
                  gi.a((byte) -94);
                  stackIn_167_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            L32: {
              if (param0 == -13169) {
                break L32;
              } else {
                this.b(2, false);
                break L32;
              }
            }
            L33: {
              if (8 != var3_int) {
                break L33;
              } else {
                if (!this.field_b.b((byte) -18)) {
                  break L33;
                } else {
                  L34: {
                    if (df.field_d == null) {
                      break L34;
                    } else {
                      ri.a(-25123);
                      break L34;
                    }
                  }
                  gk.a(-9787, oc.d((byte) -122));
                  break L33;
                }
              }
            }
            stackIn_182_0 = 0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "t.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_153_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_161_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_167_0 != 0;
                } else {
                  return stackIn_182_0 != 0;
                }
              }
            }
          }
        }
    }

    t() {
        try {
            this.field_c = bj.e((byte) 117);
            this.c((byte) 62);
            this.c(22);
            this.field_b = new wc(this.field_d);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "t.<init>()");
        }
    }

    static {
        field_a = new ka();
    }
}

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
        if (param0 != 62) {
            ((t) this).b(103, false);
        }
        if (((t) this).field_c) {
            ((t) this).field_d = 8;
        } else {
            ((t) this).field_d = 9;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 < 9) {
            field_a = null;
        }
        return (param1 ^ -1) >= (param0 ^ -1) ? param0 : param1;
    }

    final void a(int param0) {
        int var3 = 0;
        var3 = EscapeVector.field_A;
        L0: while (true) {
          if (pn.p(-111)) {
            ((t) this).field_b.c((byte) 6);
            if (this.a(param0 + -13569, false)) {
              return;
            } else {
              continue L0;
            }
          } else {
            ((t) this).field_b.a(param0 + -400, 240, 192, 24, param0);
            boolean discarded$2 = this.a(-13169, true);
            return;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var11 = EscapeVector.field_A;
        if (5 * param0 > mj.field_d) {
          return;
        } else {
          L0: {
            mj.field_b.g();
            em.d();
            if (!param3) {
              stackOut_5_0 = 6340704;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = 16777215;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_6_0;
            if (param2 == -34) {
              break L1;
            } else {
              ((t) this).field_e = null;
              break L1;
            }
          }
          L2: {
            var6 = mj.field_b.field_A / 2;
            if (param0 != -1) {
              if (-2 == param0) {
                fh.field_g.c(EscapeVector.field_z, var6, 22, var5, -1);
                break L2;
              } else {
                if (param0 != 2) {
                  if ((param0 ^ -1) != -4) {
                    if (4 == param0) {
                      L3: {
                        var7 = fh.field_g.b(oi.field_N);
                        var8 = fh.field_g.b(ee.field_d);
                        if (var8 >= var7) {
                          stackOut_30_0 = var8;
                          stackIn_31_0 = stackOut_30_0;
                          break L3;
                        } else {
                          stackOut_29_0 = var7;
                          stackIn_31_0 = stackOut_29_0;
                          break L3;
                        }
                      }
                      var9 = stackIn_31_0;
                      var10 = (-68 + var9) / 2 + var6;
                      fh.field_g.b(ee.field_d, var10, 22, var5, -1);
                      r.a(var10, 13202, 4, kc.field_b, var5);
                      break L2;
                    } else {
                      if (5 != param0) {
                        if (param0 == 6) {
                          fh.field_g.c(na.field_m, var6, 22, var5, -1);
                          break L2;
                        } else {
                          if ((param0 ^ -1) == -8) {
                            fh.field_g.c(da.field_a, var6, 22, var5, -1);
                            break L2;
                          } else {
                            if ((param0 ^ -1) == -9) {
                              fh.field_g.c(uf.field_s, var6, 22, var5, -1);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        fh.field_g.c(an.field_b, var6, 22, var5, -1);
                        break L2;
                      }
                    }
                  } else {
                    L4: {
                      var7 = fh.field_g.b(oi.field_N);
                      var8 = fh.field_g.b(ee.field_d);
                      if (var8 < var7) {
                        stackOut_16_0 = var7;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = var8;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    var9 = stackIn_17_0;
                    var10 = (var9 - 68) / 2 + var6;
                    fh.field_g.b(oi.field_N, var10, 22, var5, -1);
                    r.a(var10, 13202, 4, qm.field_c, var5);
                    break L2;
                  }
                } else {
                  fh.field_g.c(mc.field_a, var6, 22, var5, -1);
                  break L2;
                }
              }
            } else {
              fh.field_g.c(of.field_e, var6, 22, var5, -1);
              break L2;
            }
          }
          L5: {
            md.field_D.a(112);
            cf.a(mj.field_b, true, 1);
            mj.field_b.h(5267536);
            var7 = -mj.field_d + 30 + 5 * param0;
            if (var7 <= 0) {
              mj.field_b.e((-mj.field_b.field_A + 640) / 2, param1);
              break L5;
            } else {
              mf.a(param1, (-mj.field_b.field_A + 640) / 2, var7, mj.field_b, param2 ^ 120);
              break L5;
            }
          }
          return;
        }
    }

    final static rn a(Throwable param0, String param1) {
        rn var2_ref = null;
        rn var2 = null;
        if (!(param0 instanceof rn)) {
            var2 = new rn(param0, param1);
        } else {
            var2_ref = (rn) (Object) param0;
            var2_ref.field_g = var2_ref.field_g + 32 + param1;
        }
        return var2_ref;
    }

    public static void b(byte param0) {
        if (param0 >= -24) {
            return;
        }
        field_a = null;
    }

    private final int b(int param0) {
        L0: {
          if (param0 >= 52) {
            break L0;
          } else {
            t.b((byte) -84);
            break L0;
          }
        }
        if (((t) this).field_b.field_h >= 0) {
          if (((t) this).field_e.length <= ((t) this).field_b.field_h) {
            return -1;
          } else {
            return ((t) this).field_e[((t) this).field_b.field_h];
          }
        } else {
          return -1;
        }
    }

    private final int a(int param0, int param1) {
        if (param0 == 192) {
          if ((param1 ^ -1) <= -1) {
            if (param1 >= ((t) this).field_e.length) {
              return -1;
            } else {
              return ((t) this).field_e[param1];
            }
          } else {
            return -1;
          }
        } else {
          return 121;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        var5 = EscapeVector.field_A;
        em.d();
        od.b(2);
        if (mj.a((byte) 117)) {
          L0: {
            var2 = dn.a(0) / 2 - -20;
            var3 = 15 + ea.d((byte) -122) / 2;
            if (mj.field_d >= 40) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = -mj.field_d + 40;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          fc.a(stackIn_5_0, -var2 + 320, var2 + 321, 301 - -var3, true, 29788, true, 6324320, 3162160, 0, 300 - var3, true);
          en.c(param0 ^ -16);
          pb.a(4);
          return;
        } else {
          L1: {
            if (-41 >= (mj.field_d ^ -1)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = -mj.field_d + 40;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          }
          fc.a(stackIn_9_0, 240, 400, 16 + (192 + ((t) this).field_d * 24), true, 29788, true, 6324320, 3162160, 0, 176, true);
          pb.a(param0 ^ -12);
          var2 = 0;
          var3 = 192;
          L2: while (true) {
            if (((t) this).field_e.length <= var2) {
              L3: {
                if (param0 == -16) {
                  break L3;
                } else {
                  ((t) this).field_b = null;
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var4 = this.a(192, var2);
                stackOut_11_0 = this;
                stackOut_11_1 = var4;
                stackOut_11_2 = var3;
                stackOut_11_3 = -34;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                if (var4 != this.b(69)) {
                  stackOut_13_0 = this;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  stackIn_14_4 = stackOut_13_4;
                  break L4;
                } else {
                  stackOut_12_0 = this;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  break L4;
                }
              }
              this.a(stackIn_14_1, stackIn_14_2, (byte) stackIn_14_3, stackIn_14_4 != 0);
              var3 += 24;
              var2++;
              continue L2;
            }
          }
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != -26480) {
          return;
        } else {
          ((t) this).field_b.a(((t) this).field_b.a((byte) 115, 192, dh.field_d, 24, 400, bj.field_y, 240), param1, 4767999);
          return;
        }
    }

    private final void c(int param0) {
        if (((t) this).field_c) {
            ((t) this).field_e = new int[]{0, 2, 3, 4, 5, 6, 7, 8};
        } else {
            ((t) this).field_e = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        }
        if (param0 != 22) {
            field_a = null;
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        o var9 = null;
        int var10 = 0;
        o var11 = null;
        o var12 = null;
        o var13 = null;
        o var14 = null;
        int stackIn_44_0 = 0;
        int stackIn_83_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        L0: {
          var10 = EscapeVector.field_A;
          if (!((t) this).field_b.field_e) {
            break L0;
          } else {
            rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, 8192);
            break L0;
          }
        }
        L1: {
          var3 = this.b(123);
          if (var3 != 0) {
            if ((var3 ^ -1) == -2) {
              if (!((t) this).field_b.b((byte) -18)) {
                break L1;
              } else {
                wk.field_c = true;
                aj.field_a.a(param1, (byte) 47);
                mj.field_d = 0;
                break L1;
              }
            } else {
              if ((var3 ^ -1) != -2) {
                break L1;
              } else {
                if (!((t) this).field_b.b((byte) -18)) {
                  break L1;
                } else {
                  wk.field_c = true;
                  aj.field_a.a(param1, (byte) 47);
                  mj.field_d = 0;
                  break L1;
                }
              }
            }
          } else {
            if ((var3 ^ -1) != -2) {
              break L1;
            } else {
              if (!((t) this).field_b.b((byte) -18)) {
                break L1;
              } else {
                wk.field_c = true;
                aj.field_a.a(param1, (byte) 47);
                mj.field_d = 0;
                break L1;
              }
            }
          }
        }
        L2: {
          if (var3 != -3) {
            break L2;
          } else {
            if (((t) this).field_b.b((byte) -18)) {
              ek.a(((t) this).field_b.field_j, false);
              return true;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (-4 == var3) {
            L4: {
              if (!((t) this).field_b.g(param0 + 13072)) {
                break L4;
              } else {
                if (qm.field_c <= 0) {
                  break L4;
                } else {
                  L5: {
                    qm.field_c = qm.field_c - 8;
                    if (0 > qm.field_c) {
                      qm.field_c = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ce.d(8192);
                  break L4;
                }
              }
            }
            L6: {
              if (!((t) this).field_b.b(-98)) {
                break L6;
              } else {
                if (qm.field_c >= 64) {
                  break L6;
                } else {
                  L7: {
                    qm.field_c = qm.field_c + 8;
                    if (-65 > (qm.field_c ^ -1)) {
                      qm.field_c = 64;
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
              if (((t) this).field_b.d(-10809)) {
                qm.field_c = 0;
                ce.d(8192);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((t) this).field_b.e(0)) {
                qm.field_c = 64;
                ce.d(8192);
                break L9;
              } else {
                break L9;
              }
            }
            if (((t) this).field_b.a(false)) {
              L10: {
                var4 = fh.field_g.b(oi.field_N);
                var5 = fh.field_g.b(ee.field_d);
                if (var4 <= var5) {
                  stackOut_43_0 = var5;
                  stackIn_44_0 = stackOut_43_0;
                  break L10;
                } else {
                  stackOut_42_0 = var4;
                  stackIn_44_0 = stackOut_42_0;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_44_0;
                var7 = 320 + (var6 - 68) / 2;
                var8 = -var7 - 2 + dh.field_d;
                if (-1 < var8) {
                  var8 = 0;
                  break L11;
                } else {
                  if (-65 >= var8) {
                    break L11;
                  } else {
                    var8 = 64;
                    break L11;
                  }
                }
              }
              L12: {
                if (((t) this).field_b.b((byte) -18)) {
                  break L12;
                } else {
                  if (qm.field_c != var8) {
                    break L12;
                  } else {
                    break L3;
                  }
                }
              }
              qm.field_c = var8;
              ce.d(8192);
              break L3;
            } else {
              if (((t) this).field_b.b((byte) -18)) {
                ce.d(param0 ^ -4977);
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L13: {
          if ((var3 ^ -1) == -5) {
            L14: {
              if (!((t) this).field_b.g(116)) {
                break L14;
              } else {
                if (kc.field_b <= 0) {
                  break L14;
                } else {
                  L15: {
                    kc.field_b = kc.field_b - 8;
                    if (kc.field_b >= 0) {
                      break L15;
                    } else {
                      kc.field_b = 0;
                      break L15;
                    }
                  }
                  var11 = ni.field_N;
                  if (var11 != null) {
                    var11.d(kn.field_b * kc.field_b / 64);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L16: {
              if (!((t) this).field_b.b(-98)) {
                break L16;
              } else {
                if (-65 < (kc.field_b ^ -1)) {
                  L17: {
                    kc.field_b = kc.field_b + 8;
                    if (64 < kc.field_b) {
                      kc.field_b = 64;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  var12 = ni.field_N;
                  if (var12 != null) {
                    var12.d(kn.field_b * kc.field_b / 64);
                    break L16;
                  } else {
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
            }
            L18: {
              if (!((t) this).field_b.d(-10809)) {
                break L18;
              } else {
                kc.field_b = 0;
                var13 = ni.field_N;
                if (var13 != null) {
                  var13.d(kc.field_b * kn.field_b / 64);
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (((t) this).field_b.e(0)) {
                kc.field_b = 64;
                var14 = ni.field_N;
                if (var14 == null) {
                  break L19;
                } else {
                  var14.d(kn.field_b * kc.field_b / 64);
                  break L19;
                }
              } else {
                break L19;
              }
            }
            if (((t) this).field_b.a(false)) {
              L20: {
                var4 = fh.field_g.b(oi.field_N);
                var5 = fh.field_g.b(ee.field_d);
                if (var4 <= var5) {
                  stackOut_82_0 = var5;
                  stackIn_83_0 = stackOut_82_0;
                  break L20;
                } else {
                  stackOut_81_0 = var4;
                  stackIn_83_0 = stackOut_81_0;
                  break L20;
                }
              }
              L21: {
                var6 = stackIn_83_0;
                var7 = 320 - -((-68 + var6) / 2);
                var8 = dh.field_d + -2 + -var7;
                if (0 <= var8) {
                  if (-65 > (var8 ^ -1)) {
                    var8 = 64;
                    break L21;
                  } else {
                    break L21;
                  }
                } else {
                  var8 = 0;
                  break L21;
                }
              }
              kc.field_b = var8;
              var9 = ni.field_N;
              if (var9 == null) {
                break L13;
              } else {
                var9.d(kn.field_b * kc.field_b / 64);
                break L13;
              }
            } else {
              break L13;
            }
          } else {
            break L13;
          }
        }
        L22: {
          if (-6 != (var3 ^ -1)) {
            break L22;
          } else {
            if (!((t) this).field_b.b((byte) -18)) {
              break L22;
            } else {
              L23: {
                if (null == df.field_d) {
                  eo.a(24, param1);
                  break L23;
                } else {
                  ri.a(param0 + -11954);
                  break L23;
                }
              }
              return true;
            }
          }
        }
        L24: {
          if (-7 != (var3 ^ -1)) {
            break L24;
          } else {
            if (((t) this).field_b.b((byte) -18)) {
              kh.a(((t) this).field_b.field_j, -1230, false);
              mj.field_d = 0;
              gi.a((byte) -96);
              return true;
            } else {
              break L24;
            }
          }
        }
        if (-8 == (var3 ^ -1)) {
          if (((t) this).field_b.b((byte) -18)) {
            nf.a(param0 + 13193, ((t) this).field_b.field_j);
            mj.field_d = 0;
            gi.a((byte) -94);
            return true;
          } else {
            L25: {
              if (param0 == -13169) {
                break L25;
              } else {
                ((t) this).b(2, false);
                break L25;
              }
            }
            L26: {
              if (8 != var3) {
                break L26;
              } else {
                if (!((t) this).field_b.b((byte) -18)) {
                  break L26;
                } else {
                  L27: {
                    if (df.field_d == null) {
                      break L27;
                    } else {
                      ri.a(-25123);
                      break L27;
                    }
                  }
                  gk.a(-9787, oc.d((byte) -122));
                  break L26;
                }
              }
            }
            return false;
          }
        } else {
          L28: {
            if (param0 == -13169) {
              break L28;
            } else {
              ((t) this).b(2, false);
              break L28;
            }
          }
          L29: {
            if (8 != var3) {
              break L29;
            } else {
              if (!((t) this).field_b.b((byte) -18)) {
                break L29;
              } else {
                L30: {
                  if (df.field_d == null) {
                    break L30;
                  } else {
                    ri.a(-25123);
                    break L30;
                  }
                }
                gk.a(-9787, oc.d((byte) -122));
                break L29;
              }
            }
          }
          return false;
        }
    }

    t() {
        ((t) this).field_c = bj.e((byte) 117);
        this.c((byte) 62);
        this.c(22);
        ((t) this).field_b = new wc(((t) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ka();
    }
}

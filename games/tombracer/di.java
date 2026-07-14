/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private boolean field_e;
    private ei[] field_b;
    private d field_c;
    static boolean[] field_f;
    iqa field_i;
    static int field_a;
    static boolean[] field_g;
    static String field_h;
    static iw field_d;

    final void a(int param0, ei[] param1) {
        if (param0 != 0) {
            return;
        }
        if (!(param1 == ((di) this).field_b)) {
            if (-1 != (param1.length ^ -1)) {
                ((di) this).field_e = false;
                ((di) this).field_b = param1;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != -22765) {
            return;
        }
        field_h = null;
        field_d = null;
    }

    di(d param0, ei[] param1) {
        this(tba.a((byte) 98), cfa.e(-1), param0, dsa.field_c, param1);
    }

    final boolean b(int param0) {
        if (param0 != 100663296) {
            return false;
        }
        return this.a(-101, kw.b((byte) -97));
    }

    final static void a(byte param0, boolean param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = TombRacer.field_G ? 1 : 0;
            if (param1) {
              break L1;
            } else {
              if (uu.field_a != null) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          tla.field_e = false;
          break L0;
        }
        L2: {
          if (param1) {
            if (mla.field_a > 0) {
              mla.field_a = mla.field_a - 1;
              break L2;
            } else {
              if ((gt.field_a ^ -1) < -1) {
                gt.field_a = gt.field_a - 1;
                break L2;
              } else {
                if ((fp.field_e ^ -1) >= -1) {
                  break L2;
                } else {
                  fp.field_e = fp.field_e - 1;
                  break L2;
                }
              }
            }
          } else {
            if (null == uu.field_a) {
              if (ifa.field_n == null) {
                tla.field_e = false;
                if (0 < gt.field_a) {
                  gt.field_a = gt.field_a - 1;
                  break L2;
                } else {
                  if (0 < fp.field_e) {
                    fp.field_e = fp.field_e - 1;
                    break L2;
                  } else {
                    if (mla.field_a < pna.field_q) {
                      L3: {
                        if (mla.field_a != 0) {
                          break L3;
                        } else {
                          csa.a(false);
                          break L3;
                        }
                      }
                      mla.field_a = mla.field_a + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                if (-1 > (mla.field_a ^ -1)) {
                  mla.field_a = mla.field_a - 1;
                  break L2;
                } else {
                  if (fp.field_e <= 0) {
                    if (pna.field_q <= gt.field_a) {
                      break L2;
                    } else {
                      iw.a((byte) -64, true);
                      gt.field_a = gt.field_a + 1;
                      break L2;
                    }
                  } else {
                    fp.field_e = fp.field_e - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (0 < mla.field_a) {
                mla.field_a = mla.field_a - 1;
                break L2;
              } else {
                if ((gt.field_a ^ -1) < -1) {
                  gt.field_a = gt.field_a - 1;
                  break L2;
                } else {
                  if (fp.field_e < pna.field_q) {
                    L4: {
                      if (0 != fp.field_e) {
                        break L4;
                      } else {
                        iw.a((byte) -64, false);
                        break L4;
                      }
                    }
                    fp.field_e = fp.field_e + 1;
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
          if (param0 == -98) {
            break L5;
          } else {
            java.applet.Applet discarded$1 = di.a(57);
            break L5;
          }
        }
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        soa var3 = null;
        int var4 = 0;
        ei[] var5 = null;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        iqa var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        ha var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = null;
        var4 = -34 / ((53 - param1) / 58);
        var5 = ((di) this).field_b;
        var6 = 0;
        L0: while (true) {
          if (var5.length > var6) {
            var7 = var5[var6];
            if (var7.field_c) {
              L1: {
                L2: {
                  var8 = var7.field_b;
                  if (-1 != (var8 ^ -1)) {
                    if (var8 == 5) {
                      if (lga.field_B.b(-35)) {
                        var8 = sma.a("hw3d", 28893);
                        if (0 != var8) {
                          if (var8 >= 100) {
                            var9_int = sma.a("jaclib", 28893);
                            if (var9_int != 0) {
                              if (-101 > var9_int) {
                                return;
                              } else {
                                var10 = sma.a("jaggl", 28893);
                                if (0 != (var10 ^ -1)) {
                                  if (var10 < 100) {
                                    return;
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  var7.field_c = false;
                                  var6++;
                                  continue L0;
                                }
                              }
                            } else {
                              var7.field_c = false;
                              var6++;
                              continue L0;
                            }
                          } else {
                            return;
                          }
                        } else {
                          var7.field_c = false;
                          var6++;
                          continue L0;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (1 != var8) {
                        if (var8 != 3) {
                          if (var8 == -3) {
                            if (!lga.field_B.b(-63)) {
                              return;
                            } else {
                              var8 = sma.a("jaclib", 28893);
                              if (-1 == var8) {
                                break L1;
                              } else {
                                if (100 > var8) {
                                  return;
                                } else {
                                  var9_int = sma.a("sw3d", 28893);
                                  if (var9_int != 0) {
                                    if (-101 <= var9_int) {
                                      break L2;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    var7.field_c = false;
                                    var6++;
                                    continue L0;
                                  }
                                }
                              }
                            }
                          } else {
                            throw new IllegalStateException("UT" + var7.field_b);
                          }
                        } else {
                          if (!lga.field_B.b(-63)) {
                            return;
                          } else {
                            var8 = sma.a("jaclib", 28893);
                            if (0 != var8) {
                              if (-101 <= var8) {
                                var9_int = sma.a("jagdx", 28893);
                                if (var9_int == -1) {
                                  break L1;
                                } else {
                                  if (100 <= var9_int) {
                                    var10 = sma.a("hw3d", 28893);
                                    if (-1 == var10) {
                                      break L1;
                                    } else {
                                      if (var10 < 100) {
                                        return;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            } else {
                              var7.field_c = false;
                              var6++;
                              continue L0;
                            }
                          }
                        }
                      } else {
                        if (lga.field_B.b(-53)) {
                          var8 = sma.a("jaclib", 28893);
                          if ((var8 ^ -1) == 0) {
                            break L1;
                          } else {
                            if (100 > var8) {
                              return;
                            } else {
                              var9_int = sma.a("jaggl", 28893);
                              if (-1 != var9_int) {
                                if (var9_int < 100) {
                                  return;
                                } else {
                                  break L2;
                                }
                              } else {
                                var7.field_c = false;
                                var6++;
                                continue L0;
                              }
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == ((di) this).field_i) {
                    break L3;
                  } else {
                    L4: {
                      if (!((di) this).field_i.field_b.a(var7, 55)) {
                        break L4;
                      } else {
                        if (null == ((di) this).field_i.field_d) {
                          break L4;
                        } else {
                          if (((di) this).field_i.field_a != param0) {
                            break L4;
                          } else {
                            if (!var7.a(((di) this).field_i, (byte) -126)) {
                              break L4;
                            } else {
                              ((di) this).field_e = true;
                              return;
                            }
                          }
                        }
                      }
                    }
                    if (((di) this).field_i.field_b.field_b != var7.field_b) {
                      break L3;
                    } else {
                      if (((di) this).field_i.field_d == null) {
                        break L3;
                      } else {
                        var3 = ((di) this).field_i.a((byte) -43);
                        ((di) this).field_i.field_d.a(true);
                        ((di) this).field_i = null;
                        break L3;
                      }
                    }
                  }
                }
                var12 = nw.a(var7.field_a, -29355, ((di) this).field_c, var7.field_b, ck.field_a, param0);
                if (var12 != null) {
                  var9 = new iqa(var12, var7, param0);
                  if (!var7.a(var9, (byte) -126)) {
                    break L1;
                  } else {
                    if (((di) this).field_i != null) {
                      if (var9.field_d == ((di) this).field_i.field_d) {
                        if (((di) this).field_i.field_a == var9.field_a) {
                          ((di) this).field_e = true;
                          ((di) this).field_i = var9;
                          return;
                        } else {
                          L5: {
                            var3 = ((di) this).field_i.a((byte) -124);
                            ((di) this).field_i.field_d.a(true);
                            if (!var9.field_d.j()) {
                              break L5;
                            } else {
                              var9.field_d.a(var9.field_d.a(100663296));
                              break L5;
                            }
                          }
                          L6: {
                            if (var3 == null) {
                              var9.field_f = bva.b((byte) -107);
                              break L6;
                            } else {
                              var3.a((byte) -77, var9);
                              break L6;
                            }
                          }
                          ((di) this).field_e = true;
                          ((di) this).field_i = var9;
                          return;
                        }
                      } else {
                        L7: {
                          var3 = ((di) this).field_i.a((byte) -124);
                          ((di) this).field_i.field_d.a(true);
                          if (!var9.field_d.j()) {
                            break L7;
                          } else {
                            var9.field_d.a(var9.field_d.a(100663296));
                            break L7;
                          }
                        }
                        L8: {
                          if (var3 == null) {
                            var9.field_f = bva.b((byte) -107);
                            break L8;
                          } else {
                            var3.a((byte) -77, var9);
                            break L8;
                          }
                        }
                        ((di) this).field_e = true;
                        ((di) this).field_i = var9;
                        return;
                      }
                    } else {
                      L9: {
                        if (!var9.field_d.j()) {
                          break L9;
                        } else {
                          var9.field_d.a(var9.field_d.a(100663296));
                          break L9;
                        }
                      }
                      L10: {
                        if (var3 == null) {
                          var9.field_f = bva.b((byte) -107);
                          break L10;
                        } else {
                          var3.a((byte) -77, var9);
                          break L10;
                        }
                      }
                      ((di) this).field_e = true;
                      ((di) this).field_i = var9;
                      return;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var7.field_c = false;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          } else {
            return;
          }
        }
    }

    private final boolean a(int param0, java.awt.Canvas param1) {
        iqa var3 = null;
        int stackIn_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          if (param0 == -101) {
            break L0;
          } else {
            ((di) this).field_e = true;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((di) this).field_i;
            if (var3 == null) {
              break L2;
            } else {
              if (!((di) this).field_e) {
                break L2;
              } else {
                if (var3.field_a == param1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          this.a(param1, (byte) -70);
          break L1;
        }
        L3: {
          if (null != ((di) this).field_i) {
            ((di) this).field_i.field_d.c((int)(bva.b((byte) -107) - ((di) this).field_i.field_f));
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          L5: {
            if (null == ((di) this).field_i) {
              break L5;
            } else {
              L6: {
                if (var3 == null) {
                  break L6;
                } else {
                  if (var3.field_d == ((di) this).field_i.field_d) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_16_0 = stackOut_14_0;
              break L4;
            }
          }
          stackOut_15_0 = 0;
          stackIn_16_0 = stackOut_15_0;
          break L4;
        }
        return stackIn_16_0 != 0;
    }

    private di(cn param0, cn param1, d param2, fia param3, ei[] param4) {
        ((di) this).field_e = false;
        ((di) this).field_c = param2;
        ck.field_a = param1;
        lga.field_B = param0;
        vsa.a(param0, param3, -55);
        ((di) this).a(0, param4);
    }

    final static boolean a(uia param0, byte param1) {
        int var2 = param0.h(255);
        if (param1 != 107) {
            field_g = null;
        }
        int var3 = (var2 ^ -1) == -2 ? 1 : 0;
        return var3 != 0;
    }

    final static java.applet.Applet a(int param0) {
        if (param0 <= 16) {
            field_d = null;
        }
        if (!(cba.field_a == null)) {
            return cba.field_a;
        }
        return (java.applet.Applet) (Object) kua.field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[13];
        field_g = new boolean[13];
        field_h = "Ask to join <%0>'s game";
        field_g[6] = true;
        field_g[0] = true;
        field_f[0] = true;
        field_f[6] = true;
        field_f[1] = true;
        field_f[12] = true;
        field_f[4] = true;
        field_f[10] = true;
        field_d = new iw();
    }
}

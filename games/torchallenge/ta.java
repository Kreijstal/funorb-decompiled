/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends wa implements sg {
    static am field_Db;
    private dg field_Bb;
    private boolean field_Cb;
    private boolean field_Eb;
    static String field_Ab;
    static String field_zb;

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        if (!((ta) this).field_Eb) {
          if (param4) {
            ((ta) this).field_Bb = null;
            bj.a(30);
            ((ta) this).o(77);
            return;
          } else {
            bj.a(30);
            ((ta) this).o(77);
            return;
          }
        } else {
          ee.a(false, 1, true);
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        if (param0 >= -42) {
            return true;
        }
        return null != ri.a(0, param1) ? true : false;
    }

    final boolean j(int param0) {
        ef var2 = null;
        L0: {
          if (!((ta) this).field_K) {
            break L0;
          } else {
            if (!((ta) this).field_Cb) {
              var2 = uf.d(false);
              if (var2 != null) {
                this.a(false, var2, (byte) 98);
                break L0;
              } else {
                if (param0 != 1) {
                  return true;
                } else {
                  return super.j(1);
                }
              }
            } else {
              if (param0 != 1) {
                return true;
              } else {
                return super.j(1);
              }
            }
          }
        }
        if (param0 != 1) {
          return true;
        } else {
          return super.j(1);
        }
    }

    ta(si param0, dg param1) {
        super(param0, dl.field_H, cd.field_a, false, false);
        ((ta) this).field_Bb = param1;
    }

    public static void p(int param0) {
        field_Ab = null;
        if (param0 != 255) {
            return;
        }
        field_zb = null;
        field_Db = null;
    }

    final void h(byte param0) {
        this.a(true, mg.a((byte) 122, pa.field_u, 248), (byte) 57);
        if (param0 != 21) {
            Object var3 = null;
            ((ta) this).a((ng) null, 30, -74, -95, false);
        }
    }

    private final void a(boolean param0, ef param1, byte param2) {
        sj var5 = null;
        int var6 = 0;
        String var7 = null;
        sj var8 = null;
        sj var9 = null;
        String var10 = null;
        sj var11 = null;
        String var12 = null;
        sj var13 = null;
        String var14 = null;
        sj var15 = null;
        String var16 = null;
        sj var17 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        ((ta) this).field_Cb = true;
        if (!param1.field_m) {
          if (null == param1.field_b) {
            var10 = param1.field_g;
            if (-249 == (param1.field_n ^ -1)) {
              if (param0) {
                ((ta) this).field_Eb = true;
                var12 = pa.field_u;
                var13 = new sj((wa) this, dl.field_H, var12);
                var5 = var13;
                if (param2 >= 41) {
                  if (!param1.field_m) {
                    if (!((ta) this).field_Eb) {
                      if (param1.field_n != 5) {
                        var13.a(-1, 2083, b.field_R);
                        if (-4 != (param1.field_n ^ -1)) {
                          if (6 == param1.field_n) {
                            var13.a(9, 2083, qc.field_b);
                            ((ta) this).c(0, (ee) (Object) var13);
                            return;
                          } else {
                            ((ta) this).c(0, (ee) (Object) var13);
                            return;
                          }
                        } else {
                          var13.a(7, 2083, aj.field_a);
                          ((ta) this).c(0, (ee) (Object) var13);
                          return;
                        }
                      } else {
                        var13.a(11, 2083, te.field_c);
                        var13.a(17, 2083, ph.field_f);
                        if (-4 != (param1.field_n ^ -1)) {
                          if (6 == param1.field_n) {
                            var13.a(9, 2083, qc.field_b);
                            ((ta) this).c(0, (ee) (Object) var13);
                            return;
                          } else {
                            ((ta) this).c(0, (ee) (Object) var13);
                            return;
                          }
                        } else {
                          var13.a(7, 2083, aj.field_a);
                          ((ta) this).c(0, (ee) (Object) var13);
                          return;
                        }
                      }
                    } else {
                      ng discarded$12 = var13.a((byte) 46, (gg) this, be.field_a);
                      if (-4 != (param1.field_n ^ -1)) {
                        if (6 == param1.field_n) {
                          var13.a(9, 2083, qc.field_b);
                          ((ta) this).c(0, (ee) (Object) var13);
                          return;
                        } else {
                          ((ta) this).c(0, (ee) (Object) var13);
                          return;
                        }
                      } else {
                        var13.a(7, 2083, aj.field_a);
                        ((ta) this).c(0, (ee) (Object) var13);
                        return;
                      }
                    }
                  } else {
                    if (!param1.field_c) {
                      ng discarded$13 = var13.a((byte) 46, (gg) this, be.field_a);
                      ((ta) this).c(0, (ee) (Object) var13);
                      return;
                    } else {
                      ((ta) this).c(0, (ee) (Object) new qh((ta) this));
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                qc.a(0);
                ((ta) this).field_Eb = true;
                var14 = pa.field_u;
                var15 = new sj((wa) this, dl.field_H, var14);
                var5 = var15;
                if (param2 >= 41) {
                  if (!param1.field_m) {
                    if (!((ta) this).field_Eb) {
                      if (param1.field_n != 5) {
                        var15.a(-1, 2083, b.field_R);
                        if (-4 != (param1.field_n ^ -1)) {
                          if (6 == param1.field_n) {
                            var15.a(9, 2083, qc.field_b);
                            ((ta) this).c(0, (ee) (Object) var15);
                            return;
                          } else {
                            ((ta) this).c(0, (ee) (Object) var15);
                            return;
                          }
                        } else {
                          var15.a(7, 2083, aj.field_a);
                          ((ta) this).c(0, (ee) (Object) var15);
                          return;
                        }
                      } else {
                        var15.a(11, 2083, te.field_c);
                        var15.a(17, 2083, ph.field_f);
                        if (-4 != (param1.field_n ^ -1)) {
                          if (6 == param1.field_n) {
                            var15.a(9, 2083, qc.field_b);
                            ((ta) this).c(0, (ee) (Object) var15);
                            return;
                          } else {
                            ((ta) this).c(0, (ee) (Object) var15);
                            return;
                          }
                        } else {
                          var15.a(7, 2083, aj.field_a);
                          ((ta) this).c(0, (ee) (Object) var15);
                          return;
                        }
                      }
                    } else {
                      ng discarded$14 = var15.a((byte) 46, (gg) this, be.field_a);
                      if (-4 != (param1.field_n ^ -1)) {
                        if (6 == param1.field_n) {
                          var15.a(9, 2083, qc.field_b);
                          ((ta) this).c(0, (ee) (Object) var15);
                          return;
                        } else {
                          ((ta) this).c(0, (ee) (Object) var15);
                          return;
                        }
                      } else {
                        var15.a(7, 2083, aj.field_a);
                        ((ta) this).c(0, (ee) (Object) var15);
                        return;
                      }
                    }
                  } else {
                    if (!param1.field_c) {
                      ng discarded$15 = var15.a((byte) 46, (gg) this, be.field_a);
                      ((ta) this).c(0, (ee) (Object) var15);
                      return;
                    } else {
                      ((ta) this).c(0, (ee) (Object) new qh((ta) this));
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              var11 = new sj((wa) this, dl.field_H, var10);
              if (param2 >= 41) {
                if (!param1.field_m) {
                  if (!((ta) this).field_Eb) {
                    if (param1.field_n != 5) {
                      var11.a(-1, 2083, b.field_R);
                      if (-4 != (param1.field_n ^ -1)) {
                        if (6 == param1.field_n) {
                          var11.a(9, 2083, qc.field_b);
                          ((ta) this).c(0, (ee) (Object) var11);
                          return;
                        } else {
                          ((ta) this).c(0, (ee) (Object) var11);
                          return;
                        }
                      } else {
                        var11.a(7, 2083, aj.field_a);
                        ((ta) this).c(0, (ee) (Object) var11);
                        return;
                      }
                    } else {
                      var11.a(11, 2083, te.field_c);
                      var11.a(17, 2083, ph.field_f);
                      if (-4 != (param1.field_n ^ -1)) {
                        if (6 == param1.field_n) {
                          var11.a(9, 2083, qc.field_b);
                          ((ta) this).c(0, (ee) (Object) var11);
                          return;
                        } else {
                          ((ta) this).c(0, (ee) (Object) var11);
                          return;
                        }
                      } else {
                        var11.a(7, 2083, aj.field_a);
                        ((ta) this).c(0, (ee) (Object) var11);
                        return;
                      }
                    }
                  } else {
                    ng discarded$16 = var11.a((byte) 46, (gg) this, be.field_a);
                    if (-4 != (param1.field_n ^ -1)) {
                      if (6 == param1.field_n) {
                        var11.a(9, 2083, qc.field_b);
                        ((ta) this).c(0, (ee) (Object) var11);
                        return;
                      } else {
                        ((ta) this).c(0, (ee) (Object) var11);
                        return;
                      }
                    } else {
                      var11.a(7, 2083, aj.field_a);
                      ((ta) this).c(0, (ee) (Object) var11);
                      return;
                    }
                  }
                } else {
                  if (!param1.field_c) {
                    ng discarded$17 = var11.a((byte) 46, (gg) this, be.field_a);
                    ((ta) this).c(0, (ee) (Object) var11);
                    return;
                  } else {
                    ((ta) this).c(0, (ee) (Object) new qh((ta) this));
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var7 = qb.field_f;
            if (((ta) this).field_Bb != null) {
              ((ta) this).field_Bb.a(-23128);
              var9 = new sj((wa) this, dl.field_H, var7);
              if (param2 >= 41) {
                if (!param1.field_m) {
                  L0: {
                    if (!((ta) this).field_Eb) {
                      if (param1.field_n != 5) {
                        var9.a(-1, 2083, b.field_R);
                        break L0;
                      } else {
                        var9.a(11, 2083, te.field_c);
                        var9.a(17, 2083, ph.field_f);
                        break L0;
                      }
                    } else {
                      ng discarded$18 = var9.a((byte) 46, (gg) this, be.field_a);
                      break L0;
                    }
                  }
                  if (-4 != (param1.field_n ^ -1)) {
                    if (6 == param1.field_n) {
                      var9.a(9, 2083, qc.field_b);
                      ((ta) this).c(0, (ee) (Object) var9);
                      return;
                    } else {
                      ((ta) this).c(0, (ee) (Object) var9);
                      return;
                    }
                  } else {
                    var9.a(7, 2083, aj.field_a);
                    ((ta) this).c(0, (ee) (Object) var9);
                    return;
                  }
                } else {
                  if (!param1.field_c) {
                    ng discarded$19 = var9.a((byte) 46, (gg) this, be.field_a);
                    ((ta) this).c(0, (ee) (Object) var9);
                    return;
                  } else {
                    ((ta) this).c(0, (ee) (Object) new qh((ta) this));
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              var8 = new sj((wa) this, dl.field_H, var7);
              if (param2 >= 41) {
                if (!param1.field_m) {
                  if (!((ta) this).field_Eb) {
                    if (param1.field_n != 5) {
                      var8.a(-1, 2083, b.field_R);
                      if (-4 != (param1.field_n ^ -1)) {
                        if (6 == param1.field_n) {
                          var8.a(9, 2083, qc.field_b);
                          ((ta) this).c(0, (ee) (Object) var8);
                          return;
                        } else {
                          ((ta) this).c(0, (ee) (Object) var8);
                          return;
                        }
                      } else {
                        var8.a(7, 2083, aj.field_a);
                        ((ta) this).c(0, (ee) (Object) var8);
                        return;
                      }
                    } else {
                      var8.a(11, 2083, te.field_c);
                      var8.a(17, 2083, ph.field_f);
                      if (-4 != (param1.field_n ^ -1)) {
                        if (6 == param1.field_n) {
                          var8.a(9, 2083, qc.field_b);
                          ((ta) this).c(0, (ee) (Object) var8);
                          return;
                        } else {
                          ((ta) this).c(0, (ee) (Object) var8);
                          return;
                        }
                      } else {
                        var8.a(7, 2083, aj.field_a);
                        ((ta) this).c(0, (ee) (Object) var8);
                        return;
                      }
                    }
                  } else {
                    ng discarded$20 = var8.a((byte) 46, (gg) this, be.field_a);
                    if (-4 != (param1.field_n ^ -1)) {
                      if (6 == param1.field_n) {
                        var8.a(9, 2083, qc.field_b);
                        ((ta) this).c(0, (ee) (Object) var8);
                        return;
                      } else {
                        ((ta) this).c(0, (ee) (Object) var8);
                        return;
                      }
                    } else {
                      var8.a(7, 2083, aj.field_a);
                      ((ta) this).c(0, (ee) (Object) var8);
                      return;
                    }
                  }
                } else {
                  if (!param1.field_c) {
                    ng discarded$21 = var8.a((byte) 46, (gg) this, be.field_a);
                    ((ta) this).c(0, (ee) (Object) var8);
                    return;
                  } else {
                    ((ta) this).c(0, (ee) (Object) new qh((ta) this));
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          var16 = ak.field_e;
          var17 = new sj((wa) this, dl.field_H, var16);
          if (param2 >= 41) {
            if (!param1.field_m) {
              if (!((ta) this).field_Eb) {
                if (param1.field_n != 5) {
                  var17.a(-1, 2083, b.field_R);
                  if (-4 != (param1.field_n ^ -1)) {
                    if (6 == param1.field_n) {
                      var17.a(9, 2083, qc.field_b);
                      ((ta) this).c(0, (ee) (Object) var17);
                      return;
                    } else {
                      ((ta) this).c(0, (ee) (Object) var17);
                      return;
                    }
                  } else {
                    var17.a(7, 2083, aj.field_a);
                    ((ta) this).c(0, (ee) (Object) var17);
                    return;
                  }
                } else {
                  var17.a(11, 2083, te.field_c);
                  var17.a(17, 2083, ph.field_f);
                  if (-4 != (param1.field_n ^ -1)) {
                    if (6 == param1.field_n) {
                      var17.a(9, 2083, qc.field_b);
                      ((ta) this).c(0, (ee) (Object) var17);
                      return;
                    } else {
                      ((ta) this).c(0, (ee) (Object) var17);
                      return;
                    }
                  } else {
                    var17.a(7, 2083, aj.field_a);
                    ((ta) this).c(0, (ee) (Object) var17);
                    return;
                  }
                }
              } else {
                ng discarded$22 = var17.a((byte) 46, (gg) this, be.field_a);
                if (-4 != (param1.field_n ^ -1)) {
                  if (6 == param1.field_n) {
                    var17.a(9, 2083, qc.field_b);
                    ((ta) this).c(0, (ee) (Object) var17);
                    return;
                  } else {
                    ((ta) this).c(0, (ee) (Object) var17);
                    return;
                  }
                } else {
                  var17.a(7, 2083, aj.field_a);
                  ((ta) this).c(0, (ee) (Object) var17);
                  return;
                }
              }
            } else {
              if (!param1.field_c) {
                ng discarded$23 = var17.a((byte) 46, (gg) this, be.field_a);
                ((ta) this).c(0, (ee) (Object) var17);
                return;
              } else {
                ((ta) this).c(0, (ee) (Object) new qh((ta) this));
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (param0 != 0) {
          if (param0 > param1) {
            L0: {
              var2 = 1;
              if ((param0 ^ -1) < -65536) {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) < -16) {
                param0 = param0 >> 4;
                var2 += 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param0 ^ -1) < -4) {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (1 < param0) {
                var2++;
                param0 = param0 >> 1;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if ((param0 ^ -1) <= 65535) {
                break L5;
              } else {
                param0 = param0 >> 16;
                var2 += 16;
                break L5;
              }
            }
            L6: {
              if ((param0 ^ -1) <= 255) {
                break L6;
              } else {
                param0 = param0 >> 8;
                var2 += 8;
                break L6;
              }
            }
            L7: {
              if (param0 < -16) {
                var2 += 4;
                param0 = param0 >> 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (3 >= (param0 ^ -1)) {
                break L8;
              } else {
                param0 = param0 >> 2;
                var2 += 2;
                break L8;
              }
            }
            L9: {
              if (-2 <= param0) {
                break L9;
              } else {
                param0 = param0 >> 1;
                var2++;
                break L9;
              }
            }
            return var2;
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = new am(3);
    }
}

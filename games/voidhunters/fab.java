/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fab {
    static String field_b;
    bra field_e;
    private fs[] field_c;
    private boolean field_d;
    private d field_a;

    final static void a(int param0, byte[] param1) {
        String var4 = null;
        nkb.a(false, "Reading gamedata from server");
        kc var2 = null;
        try {
            kc var2_ref = (kc) (Object) beb.a(param1, 6429, jpa.field_c);
        } catch (Exception exception) {
            var4 = ila.a(param1, param0 ^ 29411);
            var2 = new kc();
            eg.e((byte) -69);
            gna.a((Throwable) (Object) exception, "Gamedata is corrupted - " + var4, 0);
        }
        if (!(var2 != null)) {
            return;
        }
        if (!(1 >= var2.field_d)) {
            gna.a((Throwable) null, "Gamedata is for a version that doesn't exist yet (" + var2.field_d + ")! The clientdata is probably corrupted.", 0);
            return;
        }
        nkb.a(false, "Player gamedata=" + var2);
        if (var2 != null) {
            nkb.a(false, "Player gamedata blueprint=" + var2.field_f);
        }
        if (param0 != -29365) {
            field_b = null;
        }
        es.field_b = var2;
        dt.a(-118);
    }

    final static arb a(asb param0, String param1, int param2, asb param3, String param4) {
        int var5 = param3.b(param4, -95);
        int var6 = param3.a(true, var5, param1);
        if (param2 != 0) {
            field_b = null;
        }
        return le.a(param3, (byte) -35, param0, var6, var5);
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        t var3 = null;
        fs[] var4 = null;
        int var5 = 0;
        fs var6 = null;
        int var7 = 0;
        bra var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        var10 = VoidHunters.field_G;
        var3 = null;
        if (param1 < -77) {
          var4 = ((fab) this).field_c;
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4.length) {
              return;
            } else {
              var6 = var4[var5];
              if (var6.field_b) {
                L1: {
                  var7 = var6.field_a;
                  if (var7 == -1) {
                    break L1;
                  } else {
                    if (-6 != var7) {
                      if (var7 == 1) {
                        if (!akb.field_a.b((byte) 87)) {
                          return;
                        } else {
                          var7 = ada.a("jaclib", true);
                          if (var7 != 0) {
                            if (100 <= var7) {
                              var8_int = ada.a("jaggl", true);
                              if (0 != var8_int) {
                                if (-101 >= (var8_int ^ -1)) {
                                  break L1;
                                } else {
                                  return;
                                }
                              } else {
                                var6.field_b = false;
                                var5++;
                                continue L0;
                              }
                            } else {
                              return;
                            }
                          } else {
                            var6.field_b = false;
                            var5++;
                            continue L0;
                          }
                        }
                      } else {
                        if (3 == var7) {
                          if (akb.field_a.b((byte) -57)) {
                            var7 = ada.a("jaclib", true);
                            if (var7 != -1) {
                              if (-101 >= (var7 ^ -1)) {
                                var8_int = ada.a("jagdx", true);
                                if (-1 != var8_int) {
                                  if (100 <= var8_int) {
                                    var9 = ada.a("hw3d", true);
                                    if (var9 != -1) {
                                      if (var9 < 100) {
                                        return;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      var6.field_b = false;
                                      var5++;
                                      continue L0;
                                    }
                                  } else {
                                    return;
                                  }
                                } else {
                                  var6.field_b = false;
                                  var5++;
                                  continue L0;
                                }
                              } else {
                                return;
                              }
                            } else {
                              var6.field_b = false;
                              var5++;
                              continue L0;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if ((var7 ^ -1) == -3) {
                            if (akb.field_a.b((byte) -83)) {
                              var7 = ada.a("jaclib", true);
                              if (-1 != var7) {
                                if (-101 < (var7 ^ -1)) {
                                  return;
                                } else {
                                  var8_int = ada.a("sw3d", true);
                                  if (var8_int != -1) {
                                    if (var8_int >= 100) {
                                      break L1;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    var6.field_b = false;
                                    var5++;
                                    continue L0;
                                  }
                                }
                              } else {
                                var6.field_b = false;
                                var5++;
                                continue L0;
                              }
                            } else {
                              return;
                            }
                          } else {
                            throw new IllegalStateException("UT" + var6.field_a);
                          }
                        }
                      }
                    } else {
                      if (!akb.field_a.b((byte) 121)) {
                        return;
                      } else {
                        var7 = ada.a("hw3d", true);
                        if (var7 != -1) {
                          if (-101 >= (var7 ^ -1)) {
                            var8_int = ada.a("jaclib", true);
                            if (-1 != var8_int) {
                              if ((var8_int ^ -1) > -101) {
                                return;
                              } else {
                                var9 = ada.a("jaggl", true);
                                if (-1 != var9) {
                                  if (var9 < 100) {
                                    return;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  var6.field_b = false;
                                  var5++;
                                  continue L0;
                                }
                              }
                            } else {
                              var6.field_b = false;
                              var5++;
                              continue L0;
                            }
                          } else {
                            return;
                          }
                        } else {
                          var6.field_b = false;
                          var5++;
                          continue L0;
                        }
                      }
                    }
                  }
                }
                L2: {
                  if (null != ((fab) this).field_e) {
                    L3: {
                      if (!((fab) this).field_e.field_b.a((byte) -94, var6)) {
                        break L3;
                      } else {
                        if (null == ((fab) this).field_e.field_g) {
                          break L3;
                        } else {
                          if (((fab) this).field_e.field_a != param0) {
                            break L3;
                          } else {
                            if (var6.a(((fab) this).field_e, -78)) {
                              ((fab) this).field_d = true;
                              return;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    if (var6.field_a != ((fab) this).field_e.field_b.field_a) {
                      break L2;
                    } else {
                      if (((fab) this).field_e.field_g != null) {
                        var3 = ((fab) this).field_e.a((byte) -126);
                        ((fab) this).field_e.field_g.a((byte) 30);
                        ((fab) this).field_e = null;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var11 = hr.a(false, param0, var6.field_c, ((fab) this).field_a, lwa.field_xb, var6.field_a);
                if (var11 != null) {
                  var8 = new bra(var11, var6, param0);
                  if (var6.a(var8, -97)) {
                    L4: {
                      if (((fab) this).field_e == null) {
                        break L4;
                      } else {
                        L5: {
                          if (((fab) this).field_e.field_g != var8.field_g) {
                            break L5;
                          } else {
                            if (((fab) this).field_e.field_a != var8.field_a) {
                              break L5;
                            } else {
                              ((fab) this).field_d = true;
                              ((fab) this).field_e = var8;
                              return;
                            }
                          }
                        }
                        var3 = ((fab) this).field_e.a((byte) -114);
                        ((fab) this).field_e.field_g.a((byte) 30);
                        break L4;
                      }
                    }
                    L6: {
                      if (var8.field_g.a()) {
                        var8.field_g.a(var8.field_g.e(100663296));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var3 == null) {
                        var8.field_e = wt.a(false);
                        break L7;
                      } else {
                        var3.b(1, var8);
                        break L7;
                      }
                    }
                    ((fab) this).field_e = var8;
                    ((fab) this).field_d = true;
                    return;
                  } else {
                    var6.field_b = false;
                    var5++;
                    continue L0;
                  }
                } else {
                  var6.field_b = false;
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 10970) {
            field_b = null;
        }
    }

    final static void a(int param0, int param1, ds param2, byte[] param3, java.math.BigInteger param4, byte param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = VoidHunters.field_G;
          var7 = kob.a(param1, -18262);
          if (jo.field_a == null) {
            jo.field_a = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var15 = new int[4];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var8 = var12;
          if (param5 == 47) {
            break L1;
          } else {
            field_b = null;
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (4 <= var9) {
            L3: {
              L4: {
                if (null == bt.field_a) {
                  break L4;
                } else {
                  if (bt.field_a.field_h.length < var7) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              bt.field_a = new ds(var7);
              break L3;
            }
            L5: {
              L6: {
                bt.field_a.field_e = 0;
                bt.field_a.a(param0, param3, -1, param1);
                bt.field_a.b(var7, (byte) 66);
                bt.field_a.a(var15, (byte) 127);
                if (null == pha.field_o) {
                  break L6;
                } else {
                  if (pha.field_o.field_h.length < 100) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              pha.field_o = new ds(100);
              break L5;
            }
            pha.field_o.field_e = 0;
            pha.field_o.c(param5 ^ 47, 10);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if (-5 >= (var11 ^ -1)) {
                pha.field_o.a(param1, true);
                pha.field_o.a(param6, param4, 16711680);
                param2.a(0, pha.field_o.field_h, -1, pha.field_o.field_e);
                param2.a(0, bt.field_a.field_h, param5 + -48, bt.field_a.field_e);
                return;
              } else {
                pha.field_o.d(var15[var11], param5 ^ 332614567);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = jo.field_a.nextInt();
            var9++;
            continue L2;
          }
        }
    }

    final void a(boolean param0, fs[] param1) {
        if (param0) {
            fab.a(23);
        }
        if (!(param1 == ((fab) this).field_c)) {
            if (param1.length == 0) {
                throw new IllegalArgumentException();
            }
            ((fab) this).field_d = false;
            ((fab) this).field_c = param1;
        }
    }

    fab(d param0, fs[] param1) {
        this(g.a(0), qc.b(0), param0, bm.field_o, param1);
    }

    private fab(asb param0, asb param1, d param2, eab param3, fs[] param4) {
        ((fab) this).field_d = false;
        lwa.field_xb = param1;
        akb.field_a = param0;
        ((fab) this).field_a = param2;
        eu.a(param3, (byte) 127, param0);
        ((fab) this).a(false, param4);
    }

    final boolean a(byte param0, java.awt.Canvas param1) {
        bra var3 = null;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (param0 < -110) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((fab) this).field_e;
            if (var3 == null) {
              break L2;
            } else {
              if (!((fab) this).field_d) {
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
          this.a(param1, (byte) -119);
          break L1;
        }
        L3: {
          if (null == ((fab) this).field_e) {
            break L3;
          } else {
            ((fab) this).field_e.field_g.c((int)(wt.a(false) + -((fab) this).field_e.field_e));
            break L3;
          }
        }
        L4: {
          L5: {
            if (((fab) this).field_e == null) {
              break L5;
            } else {
              L6: {
                if (var3 == null) {
                  break L6;
                } else {
                  if (var3.field_g == ((fab) this).field_e.field_g) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L4;
            }
          }
          stackOut_14_0 = 0;
          stackIn_15_0 = stackOut_14_0;
          break L4;
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends t implements vn {
    private ek field_lb;
    static w field_mb;
    static String field_pb;
    static ud field_ob;
    static int field_kb;
    static w field_nb;

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (!(((ib) this).field_lb != param2)) {
            this.m((byte) -102);
        }
        if (param0 != 67) {
            field_nb = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int[] param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = client.field_A ? 1 : 0;
          if (param3 < 0) {
            break L0;
          } else {
            if (qg.field_e > param7) {
              L1: {
                if (0 <= param0) {
                  break L1;
                } else {
                  if (0 <= param6) {
                    break L1;
                  } else {
                    if (param2 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param0 < qg.field_a) {
                  break L2;
                } else {
                  if (param6 < qg.field_a) {
                    break L2;
                  } else {
                    if (qg.field_a > param2) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param5 == 117) {
                L3: {
                  L4: {
                    var14 = param3 + -param7;
                    if (param1 == param7) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var10 = param0 << 1227044752;
                          var9 = param0 << 1227044752;
                          var15 = param1 - param7;
                          var12 = (param2 + -param0 << -1797323984) / var14;
                          var11 = (param6 + -param0 << 66747280) / var15;
                          if (var11 < var12) {
                            break L6;
                          } else {
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var13 = 0;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param7 >= 0) {
                            var16 = qg.field_d[param7];
                            L9: while (true) {
                              if (param1 <= param7) {
                                break L7;
                              } else {
                                L10: {
                                  var17 = var9 >> -1892120976;
                                  if ((qg.field_a ^ -1) >= (var17 ^ -1)) {
                                    break L10;
                                  } else {
                                    L11: {
                                      var18 = (var10 >> 460376112) + -(var9 >> -775770064);
                                      if (var18 != 0) {
                                        break L11;
                                      } else {
                                        if (0 > var17) {
                                          break L10;
                                        } else {
                                          if (qg.field_a <= var17) {
                                            break L10;
                                          } else {
                                            cf.a(var17 + var16, (byte) 57, param8, param4, var18);
                                            if (0 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L12: {
                                      if (qg.field_a > var18 + var17) {
                                        break L12;
                                      } else {
                                        var18 = -1 + (-var17 + qg.field_a);
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (var17 < 0) {
                                        break L13;
                                      } else {
                                        cf.a(var16 + var17, (byte) 57, param8, param4, var18);
                                        if (0 == 0) {
                                          break L10;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    cf.a(var16, (byte) 57, param8, param4, var18 - -var17);
                                    break L10;
                                  }
                                }
                                param7++;
                                if (qg.field_e > param7) {
                                  var10 = var10 + var12;
                                  var16 = var16 + hk.field_j;
                                  var9 = var9 + var11;
                                  if (0 == 0) {
                                    continue L9;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  return;
                                }
                              }
                            }
                          } else {
                            L14: {
                              if (param1 >= 0) {
                                break L14;
                              } else {
                                param7 = param1 - param7;
                                var10 = var10 + var12 * param7;
                                var9 = var9 + var11 * param7;
                                param7 = param1;
                                if (0 == 0) {
                                  break L7;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            param7 = -param7;
                            var9 = var9 + param7 * var11;
                            var10 = var10 + param7 * var12;
                            param7 = 0;
                            break L8;
                          }
                        }
                        var16 = qg.field_d[param7];
                        L15: while (true) {
                          if (param1 <= param7) {
                            break L7;
                          } else {
                            L16: {
                              var17 = var9 >> -1892120976;
                              if ((qg.field_a ^ -1) >= (var17 ^ -1)) {
                                break L16;
                              } else {
                                L17: {
                                  var18 = (var10 >> 460376112) + -(var9 >> -775770064);
                                  if (var18 != 0) {
                                    break L17;
                                  } else {
                                    if (0 > var17) {
                                      break L16;
                                    } else {
                                      if (qg.field_a <= var17) {
                                        break L16;
                                      } else {
                                        cf.a(var17 + var16, (byte) 57, param8, param4, var18);
                                        if (0 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                                L18: {
                                  if (qg.field_a > var18 + var17) {
                                    break L18;
                                  } else {
                                    var18 = -1 + (-var17 + qg.field_a);
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (var17 < 0) {
                                    break L19;
                                  } else {
                                    cf.a(var16 + var17, (byte) 57, param8, param4, var18);
                                    if (0 == 0) {
                                      break L16;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                cf.a(var16, (byte) 57, param8, param4, var18 - -var17);
                                break L16;
                              }
                            }
                            param7++;
                            if (qg.field_e > param7) {
                              var10 = var10 + var12;
                              var16 = var16 + hk.field_j;
                              var9 = var9 + var11;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L7;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      L20: {
                        L21: {
                          var16 = param3 - param1;
                          if (var16 == 0) {
                            break L21;
                          } else {
                            L22: {
                              L23: {
                                var17 = param2 << 1532248144;
                                if (var13 != 0) {
                                  break L23;
                                } else {
                                  var9 = param6 << 146991248;
                                  if (0 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              var10 = param6 << 438867216;
                              break L22;
                            }
                            var12 = (-var10 + var17) / var16;
                            var11 = (-var9 + var17) / var16;
                            if (0 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var12 = 0;
                        var11 = 0;
                        break L20;
                      }
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L24: {
                    L25: {
                      if (param3 != param7) {
                        break L25;
                      } else {
                        var11 = 0;
                        var10 = param6 << 2007832880;
                        var12 = 0;
                        var9 = param0 << -711561136;
                        if (0 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      var15 = param3 + -param1;
                      if (param6 <= param0) {
                        break L26;
                      } else {
                        var9 = param0 << -412399376;
                        var10 = param6 << 553969200;
                        var11 = (-param0 + param2 << 2082018960) / var14;
                        var12 = (param2 + -param6 << -1002129424) / var15;
                        if (0 == 0) {
                          break L24;
                        } else {
                          break L26;
                        }
                      }
                    }
                    var12 = (param2 - param0 << -1836659600) / var14;
                    var11 = (param2 - param6 << 1634149136) / var15;
                    var9 = param6 << 1837752368;
                    var10 = param0 << -2004970288;
                    break L24;
                  }
                  var13 = 0;
                  if (param7 < 0) {
                    param7 = Math.min(-param7, param1 + -param7);
                    var10 = var10 + param7 * var12;
                    var9 = var9 + param7 * var11;
                    param7 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L27: {
                  if (param7 < 0) {
                    param7 = -param7;
                    var10 = var10 + var12 * param7;
                    var9 = var9 + param7 * var11;
                    param7 = 0;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                var15 = qg.field_d[param7];
                if (param3 > param7) {
                  L28: {
                    var16 = var9 >> 1610130064;
                    if (qg.field_a <= var16) {
                      break L28;
                    } else {
                      L29: {
                        var17 = -(var9 >> -1500555088) + (var10 >> 1540722832);
                        if (var17 != 0) {
                          break L29;
                        } else {
                          if (0 > var16) {
                            break L28;
                          } else {
                            if (qg.field_a > var16) {
                              cf.a(var16 - -var15, (byte) 57, param8, param4, var17);
                              if (0 == 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      L30: {
                        if (qg.field_a <= var17 + var16) {
                          var17 = qg.field_a + -var16 - 1;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (var16 < 0) {
                          break L31;
                        } else {
                          cf.a(var16 - -var15, (byte) 57, param8, param4, var17);
                          if (0 == 0) {
                            break L28;
                          } else {
                            break L31;
                          }
                        }
                      }
                      cf.a(var15, (byte) 57, param8, param4, var16 + var17);
                      break L28;
                    }
                  }
                  param7++;
                  if (qg.field_e <= param7) {
                    return;
                  } else {
                    var10 = var10 + var12;
                    var9 = var9 + var11;
                    var15 = var15 + hk.field_j;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final ek a(kg param0, String param1, byte param2) {
        ek var4 = new ek(param1, param0);
        var4.field_p = (gl) (Object) new fk();
        int var5 = ((ib) this).field_y + -6;
        ((ib) this).field_y = ((ib) this).field_y + 38;
        if (param2 != -90) {
            field_nb = null;
        }
        var4.b(30, -16 + (((ib) this).field_t + -14), 15, var5, param2 + -16465);
        ((ib) this).b((ce) (Object) var4, (byte) -55);
        ((ib) this).f(109);
        return var4;
    }

    private final void m(byte param0) {
        if (!(((ib) this).field_S)) {
            return;
        }
        if (param0 >= -30) {
            return;
        }
        ((ib) this).field_S = false;
    }

    final static ke a(byte param0, boolean param1) {
        int var3 = 0;
        ec var4 = null;
        ec var5_ref_ec = null;
        int var5 = 0;
        ke var6 = null;
        ec var7 = null;
        ec var8 = null;
        ke var9 = null;
        ec var10 = null;
        ec var11 = null;
        L0: {
          var6 = new ke(5);
          var9 = var6;
          var3 = 372;
          if (he.field_db) {
            var3 -= 12;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!ph.n(-30146)) {
            var6.a(new ec(22, sf.field_E[0], (mm) (Object) a.field_t), 123);
            var6.a(new ec(22, sf.field_E[1], (mm) (Object) a.field_t), 118);
            var6.a(new ec(22, sf.field_E[2], (mm) (Object) a.field_t), 111);
            var7 = var6.field_f[0];
            var4 = var7;
            var6.field_f[2].field_n = 185;
            var5_ref_ec = var6.field_f[1];
            var5_ref_ec.field_n = 185;
            var7.field_n = 185;
            var6.field_f[0].field_l = 120 + -(var6.field_f[0].field_n / 2);
            var6.field_f[1].field_l = 320 - var6.field_f[1].field_n / 2;
            var6.field_f[2].field_l = 520 + -(var6.field_f[2].field_n / 2);
            var6.field_f[2].field_m = var3;
            var6.field_f[1].field_m = var3;
            var6.field_f[0].field_m = var3;
            break L1;
          } else {
            var8 = new ec(20, qn.field_rb, (mm) (Object) a.field_t);
            var8.field_m = var3;
            var8.field_l = -(var8.field_n / 2) + 320;
            var9.a(var8, 118);
            break L1;
          }
        }
        L2: {
          var3 += 43;
          if (he.field_db) {
            var10 = new ec(3, oa.field_c, (mm) (Object) a.field_t);
            var10.field_m = var3;
            var10.field_l = -(var10.field_n / 2) + 320;
            var3 += 28;
            var9.a(var10, 122);
            break L2;
          } else {
            break L2;
          }
        }
        var11 = new ec(13, pc.field_f, (mm) (Object) a.field_t);
        var11.field_l = 320 - var11.field_n / 2;
        var11.field_m = var3;
        var9.a(var11, 126);
        var9.field_q = 272;
        var9.field_y = 500;
        var9.field_w = 70;
        var9.field_z = 76;
        var9.a(fc.field_e, param1, -129);
        var5 = -87 % ((19 - param0) / 60);
        return var9;
    }

    final static void a(byte param0, ck[] param1) {
        int var2 = 0;
        var2 = -81 / ((-23 - param0) / 37);
        d.field_h = param1;
        if (d.field_h != null) {
          if (-4 < (param1.length ^ -1)) {
            throw new IllegalArgumentException("");
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int l(int param0) {
        L0: {
          sc.field_l.a(-126);
          if (param0 > 65) {
            break L0;
          } else {
            field_ob = null;
            break L0;
          }
        }
        if (!ta.field_k.a((byte) -56)) {
          return oj.b(0);
        } else {
          return 0;
        }
    }

    ib(ka param0, ln param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ce var4 = null;
        L0: {
          var3 = null;
          if (param1 != qb.field_s) {
            if (kl.field_p == param1) {
              var3 = (Object) (Object) dc.field_g;
              ((ib) this).field_y = ((ib) this).field_y + 10;
              if (!wj.r(98)) {
                break L0;
              } else {
                ((ib) this).field_y = ((ib) this).field_y + 20;
                var3 = (Object) (Object) wm.field_g;
                break L0;
              }
            } else {
              if (gd.field_c != param1) {
                break L0;
              } else {
                ((ib) this).field_y = ((ib) this).field_y + 30;
                var3 = (Object) (Object) gd.field_i;
                break L0;
              }
            }
          } else {
            var3 = (Object) (Object) si.field_c;
            break L0;
          }
        }
        var4 = new ce((String) var3, (kg) null);
        var4.field_t = ((ib) this).field_t;
        var4.field_u = 0;
        var4.field_y = 80;
        var4.field_D = 50;
        var4.field_p = (gl) (Object) new a(bj.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((ib) this).b(var4, (byte) -55);
        ((ib) this).field_lb = this.a((kg) this, og.field_gb, (byte) -90);
    }

    public static void m(int param0) {
        field_nb = null;
        field_pb = null;
        if (param0 > -10) {
            return;
        }
        field_mb = null;
        field_ob = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = 20;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_a;
    static bi[] field_b;

    public static void a(byte param0) {
        field_b = null;
        int var1 = 36 / ((-14 - param0) / 59);
    }

    final static bi a(boolean param0, ln param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        if (param1.field_I.equalsIgnoreCase("Sol")) {
          return qe.field_j;
        } else {
          var2 = param1.field_B;
          if (var2 != 0) {
            if (1 != var2) {
              if ((var2 ^ -1) != -3) {
                if (3 != var2) {
                  if ((var2 ^ -1) != -5) {
                    if (5 != var2) {
                      if ((var2 ^ -1) != -7) {
                        if ((var2 ^ -1) != -8) {
                          if ((var2 ^ -1) != -9) {
                            throw new RuntimeException("No image for this type of system: " + param1.field_B);
                          } else {
                            return cp.field_t;
                          }
                        } else {
                          return ti.field_h;
                        }
                      } else {
                        return rk.field_k;
                      }
                    } else {
                      return kr.field_d;
                    }
                  } else {
                    return rl.field_c;
                  }
                } else {
                  return be.field_k;
                }
              } else {
                return ta.field_a;
              }
            } else {
              return tk.field_x;
            }
          } else {
            return bj.field_H;
          }
        }
    }

    final static l a(int param0, dc param1, ob param2, pf param3, fs[] param4, fs param5, byte param6, vr param7) throws jn, kr {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rd var14 = null;
        int var15_int = 0;
        l var15 = null;
        ln[] var16_ref_ln__ = null;
        int var16 = 0;
        int var17_int = 0;
        sd[] var17 = null;
        int var18 = 0;
        ln var18_ref_ln = null;
        lo[] var19 = null;
        fs var19_ref = null;
        int var20 = 0;
        ln var20_ref_ln = null;
        int var21 = 0;
        fs var21_ref = null;
        sd var21_ref_sd = null;
        int var22 = 0;
        ln var22_ref = null;
        int var23 = 0;
        ln var23_ref = null;
        int var24 = 0;
        cs var25 = null;
        int var26 = 0;
        Object var27 = null;
        fs var28 = null;
        ln var29 = null;
        fs var30 = null;
        ln var31 = null;
        lo[] var32 = null;
        ln var33 = null;
        ln var34 = null;
        ln var35 = null;
        fs[] var36 = null;
        fs var37 = null;
        L0: {
          var26 = ShatteredPlansClient.field_F ? 1 : 0;
          var8 = param2.a(16711680);
          var9 = param2.f(param6 + -20969);
          var10 = param2.f(param6 + -20969);
          var11 = param2.f(-20976);
          var12 = hl.a(-33, var9);
          var13 = sa.a(var10, -109);
          if (param6 == -7) {
            break L0;
          } else {
            var27 = null;
            bi discarded$1 = uk.a(false, (ln) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    var15_int = param0;
                    if (-1 != var15_int) {
                      break L6;
                    } else {
                      if (0 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (-3 != var15_int) {
                      break L7;
                    } else {
                      if (0 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-2 == (var15_int ^ -1)) {
                    break L4;
                  } else {
                    if (3 != var15_int) {
                      break L2;
                    } else {
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var14 = new rd(param2, var8, var12, var13, var11);
                if (0 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
              var14 = (rd) (Object) new sh(param2, var8);
              if (0 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
            var14 = (rd) (Object) new mr(param2, var8, var12, var13, var11, param4.length);
            if (0 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          throw new RuntimeException("No Received MapGenerator for gametype " + param0);
        }
        var15 = ((fo) (Object) var14).a((byte) -115);
        var16_ref_ln__ = var15.field_e;
        var17_int = 0;
        L8: while (true) {
          L9: {
            if (var16_ref_ln__.length <= var17_int) {
              break L9;
            } else {
              var18_ref_ln = var16_ref_ln__[var17_int];
              var18_ref_ln.field_t = us.a(param2, param4, 2);
              var17_int++;
              if (0 == 0) {
                continue L8;
              } else {
                break L9;
              }
            }
          }
          var16 = param2.j(-71);
          var17 = new sd[var16];
          var18 = 0;
          L10: while (true) {
            L11: {
              if (var16 <= var18) {
                break L11;
              } else {
                var28 = param4[param2.j(-123)];
                var19_ref = var28;
                var20_ref_ln = var15.field_e[param2.j(-123)];
                var17[var18] = new sd(var28, var20_ref_ln);
                var28.field_i.a((byte) -113, (oh) (Object) var17[var18]);
                var17[var18].a(param6 ^ 21772, var20_ref_ln);
                var20_ref_ln.field_R = var17[var18];
                var20_ref_ln.field_y = var19_ref;
                var21 = -1 + param2.j(-89);
                var22 = 0;
                L12: while (true) {
                  L13: {
                    if (var22 >= var21) {
                      break L13;
                    } else {
                      var29 = var15.field_e[param2.j(-90)];
                      var23_ref = var29;
                      var17[var18].a(-21771, var29);
                      var23_ref.field_R = var17[var18];
                      var23_ref.field_y = var19_ref;
                      var22++;
                      if (0 == 0) {
                        continue L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var18++;
                  if (0 == 0) {
                    continue L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            var18 = param2.j(param6 ^ 71);
            var32 = new lo[var18];
            var19 = var32;
            var20 = 0;
            L14: while (true) {
              L15: {
                if (var18 <= var20) {
                  break L15;
                } else {
                  var30 = param4[param2.j(-69)];
                  var21_ref = var30;
                  var31 = var15.field_e[param2.j(-64)];
                  var19[var20] = new lo(var30, var31);
                  var21_ref.field_m = var32[var20];
                  var32[var20].a(-21771, var31);
                  var23 = param2.j(-61) + -1;
                  var24 = 0;
                  L16: while (true) {
                    L17: {
                      if (var23 <= var24) {
                        break L17;
                      } else {
                        var33 = var15.field_e[param2.j(-60)];
                        var32[var20].a(-21771, var33);
                        var24++;
                        if (0 == 0) {
                          continue L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var20++;
                    if (0 == 0) {
                      continue L14;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              var15.b((byte) 80);
              var20 = 0;
              L18: while (true) {
                L19: {
                  if (var20 >= param4.length) {
                    break L19;
                  } else {
                    L20: {
                      L21: {
                        if (param7.field_i) {
                          break L21;
                        } else {
                          var21_ref_sd = (sd) (Object) param4[var20].field_i.d(0);
                          L22: while (true) {
                            L23: {
                              if (var21_ref_sd == null) {
                                break L23;
                              } else {
                                vf.a(127, var21_ref_sd);
                                sh.a(var21_ref_sd, -5);
                                var22_ref = var21_ref_sd.j(18229);
                                L24: while (true) {
                                  L25: {
                                    if (var22_ref == null) {
                                      break L25;
                                    } else {
                                      kd.a(param7, false, var22_ref, (byte) -2);
                                      var22_ref = var21_ref_sd.h(param6 ^ 23415);
                                      if (0 == 0) {
                                        continue L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  var21_ref_sd = (sd) (Object) param4[var20].field_i.a((byte) -71);
                                  if (0 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            if (0 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      if (null != param4[var20].field_m) {
                        vf.a(123, (sd) (Object) param4[var20].field_m);
                        sh.a((sd) (Object) param4[var20].field_m, -5);
                        var21_ref = (fs) (Object) param4[var20].field_m.j(18229);
                        L26: while (true) {
                          if (var21_ref == null) {
                            break L20;
                          } else {
                            kd.a(param7, false, (ln) (Object) var21_ref, (byte) -2);
                            var21_ref = (fs) (Object) param4[var20].field_m.h(-23410);
                            if (0 == 0) {
                              continue L26;
                            } else {
                              break L20;
                            }
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                    var20++;
                    if (0 == 0) {
                      continue L18;
                    } else {
                      break L19;
                    }
                  }
                }
                var20 = 0;
                L27: while (true) {
                  L28: {
                    if (var20 >= param4.length) {
                      break L28;
                    } else {
                      var21 = 0;
                      L29: while (true) {
                        L30: {
                          if (param4.length <= var21) {
                            break L30;
                          } else {
                            param4[var20].field_h[var21] = false;
                            var21++;
                            if (0 == 0) {
                              continue L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        var20++;
                        if (0 == 0) {
                          continue L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                  var20 = 0;
                  L31: while (true) {
                    L32: {
                      if (var20 >= param4.length) {
                        break L32;
                      } else {
                        var21 = 1 + var20;
                        L33: while (true) {
                          L34: {
                            if (param4.length <= var21) {
                              break L34;
                            } else {
                              L35: {
                                var22 = param2.g(-2852);
                                if (127 == var22) {
                                  break L35;
                                } else {
                                  param4[var20].field_h[var21] = true;
                                  param4[var21].field_h[var20] = true;
                                  param4[var20].field_f[var21] = var22;
                                  param4[var21].field_f[var20] = var22;
                                  break L35;
                                }
                              }
                              var21++;
                              if (0 == 0) {
                                continue L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          var20++;
                          if (0 == 0) {
                            continue L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                    }
                    L36: {
                      if (param5 != null) {
                        param5.field_w = param2.j(param6 ^ 98);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    var20 = 0;
                    L37: while (true) {
                      L38: {
                        if (param4.length <= var20) {
                          break L38;
                        } else {
                          var21 = 0;
                          L39: while (true) {
                            L40: {
                              if ((var21 ^ -1) <= -5) {
                                break L40;
                              } else {
                                param4[var20].field_u[var21] = param2.j(-115);
                                var21++;
                                if (0 == 0) {
                                  continue L39;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            var20++;
                            if (0 == 0) {
                              continue L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      param3.a(0);
                      var20 = param2.j(-115);
                      var21 = 0;
                      L41: while (true) {
                        if (var20 > var21) {
                          L42: {
                            var34 = gq.a(var15.field_e, -2284, param2);
                            var35 = gq.a(var15.field_e, -2284, param2);
                            if (var34 == null) {
                              break L42;
                            } else {
                              if (var35 != null) {
                                var24 = param2.j(-73);
                                var25 = new cs(var34, var35, var24);
                                param3.a((byte) -113, (oh) (Object) var25);
                                var21++;
                                if (0 == 0) {
                                  continue L41;
                                } else {
                                  param1.field_x.a(param2, (byte) -109);
                                  var21 = param2.j(param6 + -63);
                                  var22 = param2.j(param6 + -55);
                                  param1.a(var22, var21, false);
                                  var36 = param4;
                                  var24 = 0;
                                  L43: while (true) {
                                    L44: {
                                      if (var24 >= var36.length) {
                                        break L44;
                                      } else {
                                        L45: {
                                          var37 = var36[var24];
                                          var25 = (cs) (Object) var37;
                                          if (var37.field_m == null) {
                                            ((fs) (Object) var25).field_m = new lo(var37, (ln) null);
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                        var24++;
                                        if (0 == 0) {
                                          continue L43;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    return var15;
                                  }
                                }
                              } else {
                                break L42;
                              }
                            }
                          }
                          throw new kr("Tannhauser Gate is unconnected at at least one end.");
                        } else {
                          param1.field_x.a(param2, (byte) -109);
                          var21 = param2.j(param6 + -63);
                          var22 = param2.j(param6 + -55);
                          param1.a(var22, var21, false);
                          var36 = param4;
                          var24 = 0;
                          L46: while (true) {
                            L47: {
                              if (var24 >= var36.length) {
                                break L47;
                              } else {
                                L48: {
                                  var37 = var36[var24];
                                  var25 = (cs) (Object) var37;
                                  if (var37.field_m == null) {
                                    ((fs) (Object) var25).field_m = new lo(var37, (ln) null);
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                                var24++;
                                if (0 == 0) {
                                  continue L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            return var15;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int[] var8 = ((bda) this).field_i.a((byte) 66, param1);
        int[] var3 = var8;
        if (!(!((bda) this).field_i.field_d)) {
            var4 = sj.field_b[param1];
            for (var5 = 0; var5 < ns.field_g; var5++) {
                var8[var5] = this.d(param0 + 1876, ht.field_Fb[var5], var4) % 4096;
            }
        }
        if (param0 != 1) {
            Object var7 = null;
            nv discarded$0 = bda.a(true, (byte) 12, (la) null, (kh) null);
        }
        return var3;
    }

    final static nv a(boolean param0, byte param1, la param2, kh param3) {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        eq var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var4 = param3.b((byte) 44, 6);
        var5 = 81 / ((-38 - param1) / 57);
        var6_int = var4;
        if (var6_int == -1) {
          return (nv) (Object) new fra(param2, param3, param0);
        } else {
          if (-2 == var6_int) {
            return (nv) (Object) new hi(param2, param3, param0);
          } else {
            if (var6_int == 2) {
              return (nv) (Object) new rea(param2, param3, param0);
            } else {
              if (var6_int != 3) {
                if (-5 != var6_int) {
                  if (-19 != var6_int) {
                    if (var6_int == 7) {
                      return (nv) (Object) new rl(param2, param3, param0);
                    } else {
                      if (var6_int == -6) {
                        return (nv) (Object) new ef(param2, param3, param0);
                      } else {
                        if (-7 != var6_int) {
                          if (var6_int != 13) {
                            if (var6_int != -9) {
                              if (-10 == var6_int) {
                                return (nv) (Object) new lpa(param2, param3, param0);
                              } else {
                                if ((var6_int ^ -1) != -11) {
                                  if (var6_int == -18) {
                                    return (nv) (Object) new dja(param2, param3, param0);
                                  } else {
                                    if (11 == var6_int) {
                                      return (nv) (Object) new vd(param2, param3, param0);
                                    } else {
                                      if (-13 == var6_int) {
                                        return (nv) (Object) new eq(param2, param3, param0);
                                      } else {
                                        if (var6_int == -15) {
                                          return (nv) (Object) new wn(param2, param3, param0);
                                        } else {
                                          if (var6_int != 15) {
                                            if (var6_int == 16) {
                                              return (nv) (Object) new wma(param2, param3, param0);
                                            } else {
                                              if (-20 != var6_int) {
                                                if ((var6_int ^ -1) == -21) {
                                                  return (nv) (Object) new ska(param2, param3, param0);
                                                } else {
                                                  if (21 != var6_int) {
                                                    if (var6_int == 22) {
                                                      return (nv) (Object) new kj(param2, param3, param0);
                                                    } else {
                                                      if (23 == var6_int) {
                                                        return (nv) (Object) new oh(param2, param3, param0);
                                                      } else {
                                                        if (var6_int != 24) {
                                                          if (-26 != var6_int) {
                                                            if (var6_int != -27) {
                                                              if (27 == var6_int) {
                                                                return (nv) (Object) new bn(param2, param3, param0);
                                                              } else {
                                                                if (-29 == var6_int) {
                                                                  return (nv) (Object) new im(param2, param3, param0);
                                                                } else {
                                                                  if (-30 != var6_int) {
                                                                    if ((var6_int ^ -1) == -31) {
                                                                      return (nv) (Object) new wh(param2, param3, param0);
                                                                    } else {
                                                                      if ((var6_int ^ -1) != -32) {
                                                                        if (32 == var6_int) {
                                                                          return (nv) (Object) new sm(param2, param3, param0);
                                                                        } else {
                                                                          throw new IllegalStateException("Unrecognised behaviour type: " + var4);
                                                                        }
                                                                      } else {
                                                                        return (nv) (Object) new ula(param2, param3, param0);
                                                                      }
                                                                    }
                                                                  } else {
                                                                    return (nv) (Object) new mc(param2, param3, param0);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              return (nv) (Object) new th(param2, param3, param0);
                                                            }
                                                          } else {
                                                            return (nv) (Object) new ue(param2, param3, param0);
                                                          }
                                                        } else {
                                                          return (nv) (Object) new cu(param2, param3, param0);
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    return (nv) (Object) new tl(param2, param3, param0);
                                                  }
                                                }
                                              } else {
                                                return (nv) (Object) new rh(param2, param3, param0);
                                              }
                                            }
                                          } else {
                                            return (nv) (Object) new sea(param2, param3, param0);
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (7 > param2.field_E) {
                                    var6 = new eq(param2, param0);
                                    return (nv) (Object) var6;
                                  } else {
                                    return (nv) (Object) new sg(param2, param3, param0);
                                  }
                                }
                              }
                            } else {
                              return (nv) (Object) new mo(param2, param3, param0);
                            }
                          } else {
                            return (nv) (Object) new rb(param2, param3, param0);
                          }
                        } else {
                          return (nv) (Object) new ok(param2, param3, param0);
                        }
                      }
                    }
                  } else {
                    return (nv) (Object) new eia(param2, param3, param0);
                  }
                } else {
                  return (nv) (Object) new ov(param2, param3, param0);
                }
              } else {
                return (nv) (Object) new ana(param2, param3, param0);
              }
            }
          }
        }
    }

    public bda() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        if (param0 != 1877) {
            field_m = -3;
        }
        int var4 = param1 + param2 * 57;
        var4 = var4 << 871012385 ^ var4;
        return 4096 - (2147483647 & 1376312589 + (var4 * (var4 * 15731) + 789221) * var4) / 262144;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 50;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt extends mo {
    static int[][][][] field_h;
    static String field_j;
    static int[] field_f;
    boolean field_i;
    boolean field_n;
    boolean field_s;
    static bi field_t;
    static String field_m;
    int field_g;
    static String field_r;
    boolean field_q;
    static int field_w;
    boolean field_k;
    boolean field_u;
    int field_l;
    int field_p;
    boolean field_v;
    static String field_o;

    final static void a(int param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (param2 >= 96) {
          L0: {
            var4 = ws.field_c[param3][param0 - 1][2];
            var5 = ws.field_c[param3][-1 + param0][3];
            var6 = var4 * ql.field_a[0] / 896;
            var7 = var5 * ql.field_a[1] / 1344;
            if (param1 != 0) {
              var9 = var7 + (-var5 + 1344 + -ws.field_c[param3][-1 + param0][1]);
              var8 = var6 + -var4 + (896 - ws.field_c[param3][param0 - 1][0]);
              break L0;
            } else {
              var8 = var6 + ws.field_c[param3][-1 + param0][0];
              var9 = var7 + ws.field_c[param3][param0 + -1][1];
              break L0;
            }
          }
          ge.field_m[0] = Math.min(896, Math.max(0, var8));
          ge.field_m[1] = Math.min(1344, Math.max(0, var9));
          return;
        } else {
          L1: {
            field_h = null;
            var4 = ws.field_c[param3][param0 - 1][2];
            var5 = ws.field_c[param3][-1 + param0][3];
            var6 = var4 * ql.field_a[0] / 896;
            var7 = var5 * ql.field_a[1] / 1344;
            if (param1 != 0) {
              var9 = var7 + (-var5 + 1344 + -ws.field_c[param3][-1 + param0][1]);
              var8 = var6 + -var4 + (896 - ws.field_c[param3][param0 - 1][0]);
              break L1;
            } else {
              var8 = var6 + ws.field_c[param3][-1 + param0][0];
              var9 = var7 + ws.field_c[param3][param0 + -1][1];
              break L1;
            }
          }
          ge.field_m[0] = Math.min(896, Math.max(0, var8));
          ge.field_m[1] = Math.min(1344, Math.max(0, var9));
          return;
        }
    }

    final static ak c(int param0) {
        ak var2 = new ak(5);
        ak var1 = var2;
        var2.field_e = ((ot) (Object) lu.field_p[2]).h();
        return var1;
    }

    final boolean d(int param0) {
        if (param0 != 3511) {
            field_o = null;
            if (((gt) this).field_s) {
                return false;
            }
            if (((gt) this).field_v) {
                return false;
            }
            return true;
        }
        if (((gt) this).field_s) {
            return false;
        }
        if (((gt) this).field_v) {
            return false;
        }
        return true;
    }

    final void c(ml param0, int param1) {
        if (!mu.a(param0, (byte) -39)) {
            return;
        }
        try {
            ((gt) this).field_g = -1 + param0.l(3, 59);
            ((gt) this).field_p = param0.l(3, param1 ^ 58) - param1;
            ((gt) this).field_k = mu.a(param0, (byte) -39);
            ((gt) this).field_q = mu.a(param0, (byte) -39);
            ((gt) this).field_s = mu.a(param0, (byte) -39);
            ((gt) this).field_v = mu.a(param0, (byte) -39);
            ((gt) this).field_i = mu.a(param0, (byte) -39);
            ((gt) this).field_n = mu.a(param0, (byte) -39);
            ((gt) this).field_u = mu.a(param0, (byte) -39);
            ((gt) this).field_l = param0.l(8, 59);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gt.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static wh a(boolean param0, int param1, byte param2, int param3) {
        int var4 = -54 / ((param2 - 2) / 63);
        return wt.a(nm.field_i[param3], ga.field_O[param3], !em.field_e ? param0 : !param0 ? true : false, param3, param1, -123);
    }

    final void a(byte param0, mo param1) {
        gt var3 = null;
        try {
            if (param0 >= -52) {
                ((gt) this).field_g = -97;
            }
            var3 = (gt) (Object) param1;
            ((gt) this).field_q = var3.field_q;
            ((gt) this).field_l = var3.field_l;
            ((gt) this).field_i = var3.field_i;
            ((gt) this).field_v = var3.field_v;
            ((gt) this).field_s = var3.field_s;
            ((gt) this).field_g = var3.field_g;
            ((gt) this).field_k = var3.field_k;
            ((gt) this).field_p = var3.field_p;
            ((gt) this).field_n = var3.field_n;
            ((gt) this).field_u = var3.field_u;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gt.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_r = null;
        field_t = null;
        field_j = null;
        field_h = null;
        field_f = null;
        field_o = null;
        field_m = null;
    }

    public gt() {
        ((gt) this).field_u = false;
        ((gt) this).field_l = 0;
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (param0) {
          td.field_b = false;
          if (param0) {
            if (ns.field_a <= 0) {
              if (fj.field_a <= 0) {
                if (ee.field_b > 0) {
                  ee.field_b = ee.field_b - 1;
                  return;
                } else {
                  return;
                }
              } else {
                fj.field_a = fj.field_a - 1;
                return;
              }
            } else {
              ns.field_a = ns.field_a - 1;
              return;
            }
          } else {
            if (uv.field_i == null) {
              if (null == ow.field_b) {
                td.field_b = false;
                if (fj.field_a <= 0) {
                  if (0 < ee.field_b) {
                    ee.field_b = ee.field_b - 1;
                    return;
                  } else {
                    if (ns.field_a < rb.field_Bb) {
                      if (ns.field_a != 0) {
                        ns.field_a = ns.field_a + 1;
                        return;
                      } else {
                        na.h(0);
                        ns.field_a = ns.field_a + 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  fj.field_a = fj.field_a - 1;
                  return;
                }
              } else {
                if (ns.field_a > 0) {
                  ns.field_a = ns.field_a - 1;
                  return;
                } else {
                  if (ee.field_b > 0) {
                    ee.field_b = ee.field_b - 1;
                    return;
                  } else {
                    if (rb.field_Bb > fj.field_a) {
                      if (fj.field_a != 0) {
                        fj.field_a = fj.field_a + 1;
                        return;
                      } else {
                        pg.a(-35, true);
                        fj.field_a = fj.field_a + 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              if (0 < ns.field_a) {
                ns.field_a = ns.field_a - 1;
                return;
              } else {
                if (0 >= fj.field_a) {
                  if (~ee.field_b > ~rb.field_Bb) {
                    L0: {
                      if (0 == ee.field_b) {
                        pg.a(-35, false);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    ee.field_b = ee.field_b + 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  fj.field_a = fj.field_a - 1;
                  return;
                }
              }
            }
          }
        } else {
          if (null == uv.field_i) {
            L1: {
              td.field_b = false;
              if (param0) {
                if (ns.field_a <= 0) {
                  if (fj.field_a <= 0) {
                    if (ee.field_b <= 0) {
                      break L1;
                    } else {
                      ee.field_b = ee.field_b - 1;
                      return;
                    }
                  } else {
                    fj.field_a = fj.field_a - 1;
                    return;
                  }
                } else {
                  ns.field_a = ns.field_a - 1;
                  return;
                }
              } else {
                if (uv.field_i == null) {
                  if (null == ow.field_b) {
                    td.field_b = false;
                    if (fj.field_a <= 0) {
                      if (0 < ee.field_b) {
                        ee.field_b = ee.field_b - 1;
                        return;
                      } else {
                        if (ns.field_a < rb.field_Bb) {
                          if (ns.field_a != 0) {
                            ns.field_a = ns.field_a + 1;
                            return;
                          } else {
                            na.h(0);
                            ns.field_a = ns.field_a + 1;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      fj.field_a = fj.field_a - 1;
                      return;
                    }
                  } else {
                    if (ns.field_a > 0) {
                      ns.field_a = ns.field_a - 1;
                      return;
                    } else {
                      if (ee.field_b > 0) {
                        ee.field_b = ee.field_b - 1;
                        return;
                      } else {
                        if (rb.field_Bb <= fj.field_a) {
                          break L1;
                        } else {
                          if (fj.field_a != 0) {
                            fj.field_a = fj.field_a + 1;
                            return;
                          } else {
                            pg.a(-35, true);
                            fj.field_a = fj.field_a + 1;
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (0 < ns.field_a) {
                    ns.field_a = ns.field_a - 1;
                    return;
                  } else {
                    if (0 >= fj.field_a) {
                      if (~ee.field_b > ~rb.field_Bb) {
                        L2: {
                          if (0 == ee.field_b) {
                            pg.a(-35, false);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ee.field_b = ee.field_b + 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      fj.field_a = fj.field_a - 1;
                      return;
                    }
                  }
                }
              }
            }
            return;
          } else {
            if (param0) {
              if (ns.field_a <= 0) {
                if (fj.field_a <= 0) {
                  if (ee.field_b <= 0) {
                    return;
                  } else {
                    ee.field_b = ee.field_b - 1;
                    return;
                  }
                } else {
                  fj.field_a = fj.field_a - 1;
                  return;
                }
              } else {
                ns.field_a = ns.field_a - 1;
                return;
              }
            } else {
              if (uv.field_i == null) {
                if (null == ow.field_b) {
                  td.field_b = false;
                  if (fj.field_a <= 0) {
                    if (0 < ee.field_b) {
                      ee.field_b = ee.field_b - 1;
                      return;
                    } else {
                      if (ns.field_a < rb.field_Bb) {
                        if (ns.field_a != 0) {
                          ns.field_a = ns.field_a + 1;
                          return;
                        } else {
                          na.h(0);
                          ns.field_a = ns.field_a + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    fj.field_a = fj.field_a - 1;
                    return;
                  }
                } else {
                  if (ns.field_a > 0) {
                    ns.field_a = ns.field_a - 1;
                    return;
                  } else {
                    if (ee.field_b > 0) {
                      ee.field_b = ee.field_b - 1;
                      return;
                    } else {
                      if (rb.field_Bb > fj.field_a) {
                        L3: {
                          if (fj.field_a != 0) {
                            break L3;
                          } else {
                            pg.a(-35, true);
                            break L3;
                          }
                        }
                        fj.field_a = fj.field_a + 1;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                if (0 < ns.field_a) {
                  ns.field_a = ns.field_a - 1;
                  return;
                } else {
                  if (0 >= fj.field_a) {
                    if (~ee.field_b > ~rb.field_Bb) {
                      L4: {
                        if (0 == ee.field_b) {
                          pg.a(-35, false);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ee.field_b = ee.field_b + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    fj.field_a = fj.field_a - 1;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[4][5][][];
        field_h[3][0] = new int[3][4];
        field_h[3][0][0][1] = 2355;
        field_h[3][0][0][3] = 2495;
        field_h[3][0][0][0] = 2402;
        field_h[3][0][0][2] = 2384;
        field_h[3][0][1][1] = 2355;
        field_h[3][0][1][2] = 2364;
        field_h[3][0][1][0] = 2382;
        field_h[3][0][1][3] = 2362;
        field_h[3][1] = new int[3][4];
        field_h[3][0][2][3] = 60;
        field_h[3][0][2][2] = 322;
        field_h[3][0][2][0] = 340;
        field_h[3][0][2][1] = 316;
        field_h[3][1][0][1] = 2319;
        field_h[3][1][0][3] = 4496;
        field_h[3][1][0][0] = 4502;
        field_h[3][1][0][2] = 2226;
        field_h[3][1][1][2] = 3488;
        field_h[3][1][1][1] = 3481;
        field_h[3][1][1][0] = 4512;
        field_h[3][1][1][3] = 4506;
        field_h[3][1][2][0] = 4366;
        field_h[3][1][2][2] = 4495;
        field_h[3][1][2][3] = 4362;
        field_h[3][1][2][1] = 4492;
        field_h[3][2] = new int[3][4];
        field_h[3][2][0][1] = 3489;
        field_h[3][2][0][3] = 5541;
        field_h[3][2][0][2] = 3507;
        field_h[3][2][0][0] = 5425;
        field_h[3][2][1][3] = 4388;
        field_h[3][2][1][2] = 4391;
        field_h[3][2][1][0] = 4396;
        field_h[3][2][1][1] = 3362;
        field_h[3][2][2][2] = 4530;
        field_h[3][2][2][1] = 4524;
        field_h[3][2][2][0] = 5571;
        field_h[3][2][2][3] = 5559;
        field_h[3][3] = new int[3][3];
        field_h[3][3][0][0] = 2402;
        field_h[3][3][0][1] = 2355;
        field_h[3][3][0][2] = 2495;
        field_h[3][3][1][2] = 3393;
        field_h[3][3][1][1] = 2348;
        field_h[3][3][1][0] = 3404;
        field_h[3][3][2][0] = 2360;
        field_h[3][3][2][2] = 2349;
        field_h[3][3][2][1] = 2346;
        field_h[3][4] = new int[3][4];
        field_h[3][4][0][2] = 4549;
        field_h[3][4][0][1] = 3517;
        field_h[3][4][0][0] = 5594;
        field_h[3][4][0][3] = 5582;
        field_h[3][4][1][2] = 5546;
        field_h[3][4][1][1] = 4543;
        field_h[3][4][1][3] = 5554;
        field_h[3][4][1][0] = 5562;
        field_h[3][4][2][3] = 4432;
        field_h[3][4][2][0] = 4446;
        field_h[2][0] = new int[3][2];
        field_h[3][4][2][1] = 3390;
        field_h[3][4][2][2] = 4422;
        field_h[2][0][0][1] = 2475;
        field_h[2][0][0][0] = 2514;
        field_h[2][0][1][0] = 3521;
        field_h[2][0][1][1] = 3502;
        field_h[2][1] = new int[3][3];
        field_h[2][0][2][0] = 3409;
        field_h[2][0][2][1] = 3388;
        field_h[2][1][0][1] = 3506;
        field_h[2][1][0][2] = 3530;
        field_h[2][1][0][0] = 3538;
        field_h[2][1][1][2] = 3511;
        field_h[2][1][1][0] = 3521;
        field_h[2][1][1][1] = 3499;
        field_h[2][1][2][2] = 3399;
        field_h[2][1][2][0] = 3409;
        field_h[2][1][2][1] = 3386;
        field_h[2][2] = new int[3][4];
        field_h[2][2][0][1] = 1300;
        field_h[2][2][0][3] = 3347;
        field_h[2][2][0][0] = 3354;
        field_h[2][2][0][2] = 1308;
        field_h[2][2][1][2] = 3488;
        field_h[2][2][1][0] = 4512;
        field_h[2][2][1][1] = 3481;
        field_h[2][2][1][3] = 4506;
        field_h[2][2][2][1] = 4492;
        field_h[2][3] = new int[3][4];
        field_h[2][2][2][3] = 4362;
        field_h[2][2][2][0] = 4366;
        field_h[2][2][2][2] = 4495;
        field_h[2][3][0][1] = 3517;
        field_h[2][3][0][0] = 5594;
        field_h[2][3][0][2] = 4549;
        field_h[2][3][0][3] = 5582;
        field_h[2][3][1][3] = 5554;
        field_h[2][3][1][0] = 5562;
        field_h[2][3][1][2] = 5546;
        field_h[2][3][1][1] = 4543;
        field_h[2][3][2][0] = 4446;
        field_h[2][4] = new int[3][3];
        field_h[2][3][2][2] = 4422;
        field_h[2][3][2][1] = 3390;
        field_h[2][3][2][3] = 4432;
        field_h[2][4][0][1] = 3518;
        field_h[2][4][0][0] = 3538;
        field_h[2][4][0][2] = 3530;
        field_h[2][4][1][2] = 3511;
        field_h[2][4][1][1] = 3499;
        field_h[2][4][1][0] = 3521;
        field_h[2][4][2][2] = 3399;
        field_h[2][4][2][1] = 3386;
        field_h[2][4][2][0] = 3409;
        field_h[1][0] = new int[4][3];
        field_h[1][0][0][2] = 2482;
        field_h[1][0][0][1] = 2486;
        field_h[1][0][0][0] = 2489;
        field_h[1][0][1][2] = 3506;
        field_h[1][0][1][0] = 3513;
        field_h[1][0][1][1] = 3510;
        field_h[1][0][2][0] = 3520;
        field_h[1][0][2][2] = 3509;
        field_h[1][0][2][1] = 3515;
        field_h[1][0][3][2] = 0;
        field_h[1][0][3][1] = 0;
        field_h[1][0][3][0] = 0;
        field_h[1][1] = new int[3][3];
        field_h[1][1][0][2] = 3506;
        field_h[1][1][0][0] = 3513;
        field_h[1][1][0][1] = 3510;
        field_h[1][1][1][1] = 2486;
        field_h[1][1][1][2] = 2482;
        field_h[1][1][1][0] = 2489;
        field_h[1][1][2][0] = 3523;
        field_h[1][1][2][2] = 3512;
        field_h[1][1][2][1] = 3518;
        field_h[1][2] = new int[3][3];
        field_h[1][2][0][0] = 3479;
        field_h[1][2][0][2] = 3474;
        field_h[1][2][0][1] = 3477;
        field_h[1][2][1][2] = 4506;
        field_h[1][2][1][0] = 4512;
        field_h[1][2][1][1] = 4509;
        field_h[1][2][2][1] = 4502;
        field_h[1][2][2][2] = 4499;
        field_h[1][2][2][0] = 4504;
        field_h[1][3] = new int[3][2];
        field_h[1][3][0][1] = 3509;
        field_h[1][3][0][0] = 3520;
        field_h[1][3][1][1] = 2479;
        field_h[1][3][1][0] = 2489;
        field_h[1][4] = new int[3][3];
        field_h[1][3][2][0] = 3500;
        field_h[1][3][2][1] = 3492;
        field_h[1][4][0][1] = 2486;
        field_h[1][4][0][2] = 2482;
        field_h[1][4][0][0] = 2489;
        field_h[1][4][1][1] = 3510;
        field_h[1][4][1][0] = 3513;
        field_h[1][4][1][2] = 3506;
        field_h[0][0] = new int[3][4];
        field_h[1][4][2][2] = 3509;
        field_h[1][4][2][0] = 3520;
        field_h[1][4][2][1] = 3515;
        field_h[0][0][0][2] = 3478;
        field_h[0][0][0][3] = 4494;
        field_h[0][0][0][1] = 3472;
        field_h[0][0][0][0] = 4498;
        field_h[0][0][1][3] = 4508;
        field_h[0][0][1][0] = 4512;
        field_h[0][0][1][2] = 3488;
        field_h[0][0][1][1] = 3481;
        field_h[0][1] = new int[3][5];
        field_h[0][0][2][3] = 4364;
        field_h[0][0][2][0] = 4366;
        field_h[0][0][2][2] = 4495;
        field_h[0][0][2][1] = 4363;
        field_h[0][1][0][0] = 3428;
        field_h[0][1][0][4] = 1378;
        field_h[0][1][0][3] = 3414;
        field_h[0][1][0][1] = 3390;
        field_h[0][1][0][2] = 3411;
        field_h[0][1][1][2] = 3534;
        field_h[0][1][1][3] = 3531;
        field_h[0][1][1][1] = 3520;
        field_h[0][1][1][4] = 3533;
        field_h[0][1][1][0] = 3544;
        field_h[0][1][2][4] = 2503;
        field_h[0][1][2][1] = 2497;
        field_h[0][1][2][3] = 2502;
        field_h[0][1][2][0] = 2514;
        field_h[0][1][2][2] = 2504;
        field_h[0][2] = new int[3][5];
        field_h[0][2][0][2] = 3411;
        field_h[0][2][0][0] = 3557;
        field_h[0][2][0][3] = 3294;
        field_h[0][2][0][4] = 3276;
        field_h[0][2][0][1] = 3390;
        field_h[0][2][1][3] = 3256;
        field_h[0][2][1][1] = 3510;
        field_h[0][2][1][2] = 3511;
        field_h[0][2][1][0] = 3521;
        field_h[0][2][1][4] = 3249;
        field_h[0][2][2][3] = 2226;
        field_h[0][2][2][4] = 2217;
        field_h[0][2][2][2] = 2481;
        field_h[0][2][2][1] = 2479;
        field_h[0][2][2][0] = 2489;
        field_h[0][3] = new int[3][5];
        field_h[0][3][0][4] = 3478;
        field_h[0][3][0][2] = 6543;
        field_h[0][3][0][1] = 6547;
        field_h[0][3][0][3] = 3472;
        field_h[0][3][0][0] = 6551;
        field_h[0][3][1][2] = 6551;
        field_h[0][3][1][3] = 3481;
        field_h[0][3][1][0] = 4512;
        field_h[0][3][1][1] = 4506;
        field_h[0][3][1][4] = 3488;
        field_h[0][3][2][3] = 3472;
        field_h[0][3][2][2] = 4496;
        field_h[0][4] = new int[3][4];
        field_h[0][3][2][4] = 3478;
        field_h[0][3][2][1] = 4498;
        field_h[0][3][2][0] = 4502;
        field_h[0][4][0][2] = 3411;
        field_h[0][4][0][0] = 3410;
        field_h[0][4][0][1] = 3402;
        field_h[0][4][0][3] = 3385;
        field_h[0][4][1][2] = 3513;
        field_h[0][4][1][0] = 3521;
        field_h[0][4][1][3] = 3504;
        field_h[0][4][1][1] = 3516;
        field_h[0][4][2][3] = 2502;
        field_h[0][4][2][1] = 2509;
        field_h[0][4][2][2] = 2507;
        field_h[0][4][2][0] = 2514;
        field_j = "Enter name of player to add to list";
        field_f = new int[]{128, -256, 80, 873};
        field_m = "<%0> and <%1> have equal game stats. <%2> goes through <%3> by a random 50/50 chance.";
        field_r = "<%0> wins the tournament for having more successfull tackles than <%1>";
        field_o = "Asking for or providing contact information";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private int field_h;
    private boolean field_i;
    private int field_g;
    private int field_d;
    static of field_c;
    dd[] field_j;
    private int field_f;
    dd field_b;
    private int field_l;
    static hj field_e;
    static int field_k;
    static String field_a;

    final void a(int param0, pf param1) {
        param1.field_d = ((pf) this).field_d;
        if (param0 != 288) {
          float discarded$1 = pf.b(85, -110);
          param1.field_i = ((pf) this).field_i;
          param1.field_l = ((pf) this).field_l;
          param1.field_f = ((pf) this).field_f;
          param1.field_j = ((pf) this).field_j;
          param1.field_h = ((pf) this).field_h;
          param1.field_g = ((pf) this).field_g;
          param1.field_b = ((pf) this).field_b;
          return;
        } else {
          param1.field_i = ((pf) this).field_i;
          param1.field_l = ((pf) this).field_l;
          param1.field_f = ((pf) this).field_f;
          param1.field_j = ((pf) this).field_j;
          param1.field_h = ((pf) this).field_h;
          param1.field_g = ((pf) this).field_g;
          param1.field_b = ((pf) this).field_b;
          return;
        }
    }

    final static float b(int param0, int param1) {
        if (param0 <= 125) {
            float discarded$0 = pf.b(3, -70);
            return de.a(-1, 16, param1);
        }
        return de.a(-1, 16, param1);
    }

    final pf b(boolean param0, int param1) {
        ((pf) this).field_h = param1;
        if (!param0) {
            return null;
        }
        return (pf) this;
    }

    final pf a(int param0, int param1) {
        ((pf) this).field_g = param0;
        if (param1 != -1) {
            return null;
        }
        return (pf) this;
    }

    final static void a(int param0, int param1, int param2, lr param3, String param4) {
        int var5 = param3.b(param4);
        int var6 = param3.field_w + param3.field_L;
        int var7 = pa.field_H;
        if (6 + var7 - -var5 > qh.field_l) {
            var7 = -var5 + qh.field_l - 6;
        }
        int var8 = 32 + (-param3.field_L + pm.field_p);
        if (!(qh.field_f >= var8 + var6 - -6)) {
            var8 = -6 + -var6 + qh.field_f;
        }
        qh.b(var7, var8, var5 - -6, var6 + 6, param1);
        qh.f(1 + var7, var8 - -1, var5 + param2, 4 + var6, param0);
        param3.d(param4, var7 - -3, param3.field_L + (var8 - -3), param1, -1);
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (param0) {
          nr.field_bb = false;
          var2 = 110 % ((74 - param1) / 32);
          if (param0) {
            if ((hb.field_a ^ -1) < -1) {
              hb.field_a = hb.field_a - 1;
              return;
            } else {
              if (uf.field_z > 0) {
                uf.field_z = uf.field_z - 1;
                return;
              } else {
                if (0 < nj.field_b) {
                  nj.field_b = nj.field_b - 1;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (em.field_L != null) {
              if ((hb.field_a ^ -1) < -1) {
                hb.field_a = hb.field_a - 1;
                return;
              } else {
                if (uf.field_z > 0) {
                  uf.field_z = uf.field_z - 1;
                  return;
                } else {
                  if ((ir.field_h ^ -1) >= (nj.field_b ^ -1)) {
                    return;
                  } else {
                    L0: {
                      if ((nj.field_b ^ -1) == -1) {
                        db.a(27194, false);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    nj.field_b = nj.field_b + 1;
                    return;
                  }
                }
              }
            } else {
              if (tp.field_e != null) {
                if ((hb.field_a ^ -1) >= -1) {
                  if (-1 <= (nj.field_b ^ -1)) {
                    if (uf.field_z < ir.field_h) {
                      if (uf.field_z != 0) {
                        uf.field_z = uf.field_z + 1;
                        return;
                      } else {
                        db.a(27194, true);
                        uf.field_z = uf.field_z + 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    nj.field_b = nj.field_b - 1;
                    return;
                  }
                } else {
                  hb.field_a = hb.field_a - 1;
                  return;
                }
              } else {
                nr.field_bb = false;
                if (0 < uf.field_z) {
                  uf.field_z = uf.field_z - 1;
                  return;
                } else {
                  if ((nj.field_b ^ -1) < -1) {
                    nj.field_b = nj.field_b - 1;
                    return;
                  } else {
                    if ((hb.field_a ^ -1) > (ir.field_h ^ -1)) {
                      L1: {
                        if (-1 == (hb.field_a ^ -1)) {
                          cn.a(-128);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      hb.field_a = hb.field_a + 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          if (em.field_L == null) {
            nr.field_bb = false;
            var2 = 110 % ((74 - param1) / 32);
            if (param0) {
              if ((hb.field_a ^ -1) < -1) {
                hb.field_a = hb.field_a - 1;
                return;
              } else {
                if (uf.field_z > 0) {
                  uf.field_z = uf.field_z - 1;
                  return;
                } else {
                  if (0 < nj.field_b) {
                    nj.field_b = nj.field_b - 1;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (em.field_L != null) {
                if ((hb.field_a ^ -1) < -1) {
                  hb.field_a = hb.field_a - 1;
                  return;
                } else {
                  if (uf.field_z > 0) {
                    uf.field_z = uf.field_z - 1;
                    return;
                  } else {
                    if ((ir.field_h ^ -1) < (nj.field_b ^ -1)) {
                      L2: {
                        if ((nj.field_b ^ -1) == -1) {
                          db.a(27194, false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      nj.field_b = nj.field_b + 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (tp.field_e != null) {
                  if ((hb.field_a ^ -1) >= -1) {
                    if (-1 <= (nj.field_b ^ -1)) {
                      if (uf.field_z < ir.field_h) {
                        if (uf.field_z != 0) {
                          uf.field_z = uf.field_z + 1;
                          return;
                        } else {
                          db.a(27194, true);
                          uf.field_z = uf.field_z + 1;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      nj.field_b = nj.field_b - 1;
                      return;
                    }
                  } else {
                    hb.field_a = hb.field_a - 1;
                    return;
                  }
                } else {
                  nr.field_bb = false;
                  if (0 < uf.field_z) {
                    uf.field_z = uf.field_z - 1;
                    return;
                  } else {
                    L3: {
                      if ((nj.field_b ^ -1) < -1) {
                        nj.field_b = nj.field_b - 1;
                        break L3;
                      } else {
                        if ((hb.field_a ^ -1) > (ir.field_h ^ -1)) {
                          L4: {
                            if (-1 == (hb.field_a ^ -1)) {
                              cn.a(-128);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          hb.field_a = hb.field_a + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            var2 = 110 % ((74 - param1) / 32);
            if (param0) {
              if ((hb.field_a ^ -1) < -1) {
                hb.field_a = hb.field_a - 1;
                return;
              } else {
                if (uf.field_z > 0) {
                  uf.field_z = uf.field_z - 1;
                  return;
                } else {
                  if (0 < nj.field_b) {
                    nj.field_b = nj.field_b - 1;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L5: {
                if (em.field_L != null) {
                  if ((hb.field_a ^ -1) < -1) {
                    hb.field_a = hb.field_a - 1;
                    return;
                  } else {
                    if (uf.field_z > 0) {
                      uf.field_z = uf.field_z - 1;
                      return;
                    } else {
                      if ((ir.field_h ^ -1) >= (nj.field_b ^ -1)) {
                        break L5;
                      } else {
                        L6: {
                          if ((nj.field_b ^ -1) == -1) {
                            db.a(27194, false);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        nj.field_b = nj.field_b + 1;
                        break L5;
                      }
                    }
                  }
                } else {
                  if (tp.field_e != null) {
                    if ((hb.field_a ^ -1) >= -1) {
                      if (-1 <= (nj.field_b ^ -1)) {
                        if (uf.field_z < ir.field_h) {
                          if (uf.field_z == 0) {
                            db.a(27194, true);
                            uf.field_z = uf.field_z + 1;
                            break L5;
                          } else {
                            uf.field_z = uf.field_z + 1;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        nj.field_b = nj.field_b - 1;
                        break L5;
                      }
                    } else {
                      hb.field_a = hb.field_a - 1;
                      break L5;
                    }
                  } else {
                    nr.field_bb = false;
                    if (0 < uf.field_z) {
                      uf.field_z = uf.field_z - 1;
                      break L5;
                    } else {
                      if ((nj.field_b ^ -1) < -1) {
                        nj.field_b = nj.field_b - 1;
                        break L5;
                      } else {
                        if ((hb.field_a ^ -1) > (ir.field_h ^ -1)) {
                          L7: {
                            if (-1 == (hb.field_a ^ -1)) {
                              cn.a(-128);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          hb.field_a = hb.field_a + 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0) {
        ((pf) this).field_f = 0;
        ((pf) this).field_d = 256;
        ((pf) this).field_g = 0;
        int var2 = -73 / ((param0 - -15) / 36);
        ((pf) this).field_h = -1;
        ((pf) this).field_b = null;
        ((pf) this).field_j = null;
        ((pf) this).field_l = 0;
    }

    final void a(lg param0, int param1, pf param2, int param3, ei param4, int param5) {
        if (((pf) this).field_i) {
            param2.a(param1, param5, param4, param0, 117);
            param2.a(23);
        }
        if (!(((pf) this).field_l < -1)) {
            param2.field_l = ((pf) this).field_l;
        }
        if (param3 >= -95) {
            float discarded$0 = pf.b(-95, 89);
        }
        if ((((pf) this).field_h ^ -1) <= 0) {
            param2.field_h = ((pf) this).field_h;
        }
        if (null != ((pf) this).field_j) {
            param2.field_j = ((pf) this).field_j;
        }
        if (!(2147483647 == (((pf) this).field_f ^ -1))) {
            param2.field_f = ((pf) this).field_f;
        }
        if (null != ((pf) this).field_b) {
            param2.field_b = ((pf) this).field_b;
        }
        if (-2147483648 != ((pf) this).field_g) {
            param2.field_g = ((pf) this).field_g;
        }
        if (!(-2147483648 == ((pf) this).field_d)) {
            param2.field_d = ((pf) this).field_d;
        }
    }

    final pf a(dd[] param0, byte param1) {
        if (param1 < 54) {
            ((pf) this).field_l = -118;
            ((pf) this).field_j = param0;
            return (pf) this;
        }
        ((pf) this).field_j = param0;
        return (pf) this;
    }

    final pf c(int param0, int param1) {
        ((pf) this).field_l = param0;
        if (param1 <= 3) {
            field_e = null;
            return (pf) this;
        }
        return (pf) this;
    }

    final static dd a(String param0, byte param1, String param2, di param3) {
        int var4 = param3.b(param0, -1);
        if (param1 <= 29) {
            field_e = null;
        }
        int var5 = param3.a(var4, 0, param2);
        return vh.a(var4, param3, -55, var5);
    }

    final pf a(int param0, byte param1) {
        if (param1 != 90) {
            ((pf) this).field_j = null;
            ((pf) this).field_f = param0;
            return (pf) this;
        }
        ((pf) this).field_f = param0;
        return (pf) this;
    }

    final static void a(boolean param0) {
        rg.field_p = param0 ? true : false;
        hn.field_b = 0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 7) {
            return;
        }
        field_a = null;
    }

    final pf a(int param0, boolean param1) {
        if (param0 != -15359) {
            return null;
        }
        ((pf) this).field_i = param1 ? true : false;
        return (pf) this;
    }

    pf() {
        ((pf) this).field_h = -2;
        ((pf) this).field_j = null;
        ((pf) this).field_g = -2147483648;
        ((pf) this).field_d = -2147483648;
        ((pf) this).field_b = null;
        ((pf) this).field_f = -2147483648;
        ((pf) this).field_i = false;
        ((pf) this).field_l = -2;
    }

    final void a(int param0, int param1, ei param2, lg param3, int param4) {
        String var6 = null;
        int var6_int = 0;
        int var7 = 0;
        lr stackIn_19_0 = null;
        String stackIn_19_1 = null;
        lr stackIn_20_0 = null;
        String stackIn_20_1 = null;
        lr stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        lr stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        lr stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        lr stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        lr stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        lr stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        lr stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        lr stackIn_36_0 = null;
        String stackIn_36_1 = null;
        lr stackIn_37_0 = null;
        String stackIn_37_1 = null;
        lr stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        lr stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        lr stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        lr stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        lr stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        lr stackIn_43_0 = null;
        String stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_43_5 = 0;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        lr stackIn_44_0 = null;
        String stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_44_6 = 0;
        int stackIn_44_7 = 0;
        int stackIn_44_8 = 0;
        lr stackOut_35_0 = null;
        String stackOut_35_1 = null;
        lr stackOut_37_0 = null;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        lr stackOut_36_0 = null;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        lr stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        lr stackOut_40_0 = null;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        lr stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        lr stackOut_41_0 = null;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        lr stackOut_43_0 = null;
        String stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_43_6 = 0;
        int stackOut_43_7 = 0;
        int stackOut_43_8 = 0;
        lr stackOut_42_0 = null;
        String stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_42_6 = 0;
        int stackOut_42_7 = 0;
        int stackOut_42_8 = 0;
        lr stackOut_18_0 = null;
        String stackOut_18_1 = null;
        lr stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        lr stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        lr stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        lr stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        lr stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        lr stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        lr stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        lr stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        L0: {
          nj.a(((pf) this).field_j, (byte) -112, param2.field_l, param1 + param2.field_C, param0 + param2.field_D, param2.field_y);
          if (null == ((pf) this).field_b) {
            break L0;
          } else {
            L1: {
              var6_int = param2.field_C + param1 + ((pf) this).field_g;
              if ((param3.field_m ^ -1) == -2) {
                var6_int = var6_int + (param2.field_l - ((pf) this).field_b.field_w) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = param0 + (param2.field_D + ((pf) this).field_f);
              if (-2 != (param3.field_p ^ -1)) {
                break L2;
              } else {
                var7 = var7 + (param2.field_y - ((pf) this).field_b.field_y) / 2;
                break L2;
              }
            }
            L3: {
              if (2 != param3.field_m) {
                break L3;
              } else {
                var6_int = var6_int + (param2.field_l + -((pf) this).field_b.field_w);
                break L3;
              }
            }
            L4: {
              if (2 == param3.field_p) {
                var7 = var7 + (-((pf) this).field_b.field_y + param2.field_y);
                break L4;
              } else {
                break L4;
              }
            }
            ((pf) this).field_b.c(var6_int, var7);
            break L0;
          }
        }
        var6 = param3.c(-1, param2);
        if (param4 > 96) {
          if (var6 != null) {
            if (param3.field_a != null) {
              if (-1 < ((pf) this).field_l) {
                return;
              } else {
                L5: {
                  stackOut_35_0 = param3.field_a;
                  stackOut_35_1 = (String) var6;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  if (2147483647 != ((pf) this).field_g) {
                    stackOut_37_0 = (lr) (Object) stackIn_37_0;
                    stackOut_37_1 = (String) (Object) stackIn_37_1;
                    stackOut_37_2 = ((pf) this).field_g;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    break L5;
                  } else {
                    stackOut_36_0 = (lr) (Object) stackIn_36_0;
                    stackOut_36_1 = (String) (Object) stackIn_36_1;
                    stackOut_36_2 = 0;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_38_2 = stackOut_36_2;
                    break L5;
                  }
                }
                L6: {
                  stackOut_38_0 = (lr) (Object) stackIn_38_0;
                  stackOut_38_1 = (String) (Object) stackIn_38_1;
                  stackOut_38_2 = stackIn_38_2 + param3.field_i + (param2.field_C + param1);
                  stackOut_38_3 = param3.field_f + param2.field_D + param0;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  stackIn_40_3 = stackOut_38_3;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  stackIn_39_3 = stackOut_38_3;
                  if (-2147483648 != ((pf) this).field_f) {
                    stackOut_40_0 = (lr) (Object) stackIn_40_0;
                    stackOut_40_1 = (String) (Object) stackIn_40_1;
                    stackOut_40_2 = stackIn_40_2;
                    stackOut_40_3 = stackIn_40_3;
                    stackOut_40_4 = ((pf) this).field_f;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    stackIn_41_3 = stackOut_40_3;
                    stackIn_41_4 = stackOut_40_4;
                    break L6;
                  } else {
                    stackOut_39_0 = (lr) (Object) stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = stackIn_39_2;
                    stackOut_39_3 = stackIn_39_3;
                    stackOut_39_4 = 0;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    stackIn_41_3 = stackOut_39_3;
                    stackIn_41_4 = stackOut_39_4;
                    break L6;
                  }
                }
                L7: {
                  stackOut_41_0 = (lr) (Object) stackIn_41_0;
                  stackOut_41_1 = (String) (Object) stackIn_41_1;
                  stackOut_41_2 = stackIn_41_2;
                  stackOut_41_3 = stackIn_41_3 - -stackIn_41_4;
                  stackOut_41_4 = -param3.field_i + (param2.field_l + -param3.field_g);
                  stackOut_41_5 = -param3.field_j + param2.field_y + -param3.field_f;
                  stackOut_41_6 = ((pf) this).field_l;
                  stackOut_41_7 = ((pf) this).field_h;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  stackIn_43_3 = stackOut_41_3;
                  stackIn_43_4 = stackOut_41_4;
                  stackIn_43_5 = stackOut_41_5;
                  stackIn_43_6 = stackOut_41_6;
                  stackIn_43_7 = stackOut_41_7;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  stackIn_42_3 = stackOut_41_3;
                  stackIn_42_4 = stackOut_41_4;
                  stackIn_42_5 = stackOut_41_5;
                  stackIn_42_6 = stackOut_41_6;
                  stackIn_42_7 = stackOut_41_7;
                  if (2147483647 != (((pf) this).field_d ^ -1)) {
                    stackOut_43_0 = (lr) (Object) stackIn_43_0;
                    stackOut_43_1 = (String) (Object) stackIn_43_1;
                    stackOut_43_2 = stackIn_43_2;
                    stackOut_43_3 = stackIn_43_3;
                    stackOut_43_4 = stackIn_43_4;
                    stackOut_43_5 = stackIn_43_5;
                    stackOut_43_6 = stackIn_43_6;
                    stackOut_43_7 = stackIn_43_7;
                    stackOut_43_8 = ((pf) this).field_d;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    stackIn_44_3 = stackOut_43_3;
                    stackIn_44_4 = stackOut_43_4;
                    stackIn_44_5 = stackOut_43_5;
                    stackIn_44_6 = stackOut_43_6;
                    stackIn_44_7 = stackOut_43_7;
                    stackIn_44_8 = stackOut_43_8;
                    break L7;
                  } else {
                    stackOut_42_0 = (lr) (Object) stackIn_42_0;
                    stackOut_42_1 = (String) (Object) stackIn_42_1;
                    stackOut_42_2 = stackIn_42_2;
                    stackOut_42_3 = stackIn_42_3;
                    stackOut_42_4 = stackIn_42_4;
                    stackOut_42_5 = stackIn_42_5;
                    stackOut_42_6 = stackIn_42_6;
                    stackOut_42_7 = stackIn_42_7;
                    stackOut_42_8 = 256;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_44_2 = stackOut_42_2;
                    stackIn_44_3 = stackOut_42_3;
                    stackIn_44_4 = stackOut_42_4;
                    stackIn_44_5 = stackOut_42_5;
                    stackIn_44_6 = stackOut_42_6;
                    stackIn_44_7 = stackOut_42_7;
                    stackIn_44_8 = stackOut_42_8;
                    break L7;
                  }
                }
                int discarded$2 = ((lr) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, stackIn_44_5, stackIn_44_6, stackIn_44_7, stackIn_44_8, param3.field_m, param3.field_p, param3.field_b);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((pf) this).field_h = 108;
          if (var6 != null) {
            if (param3.field_a != null) {
              if (-1 < ((pf) this).field_l) {
                return;
              } else {
                L8: {
                  stackOut_18_0 = param3.field_a;
                  stackOut_18_1 = (String) var6;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  if (2147483647 != ((pf) this).field_g) {
                    stackOut_20_0 = (lr) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = ((pf) this).field_g;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    break L8;
                  } else {
                    stackOut_19_0 = (lr) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    break L8;
                  }
                }
                L9: {
                  stackOut_21_0 = (lr) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2 + param3.field_i + (param2.field_C + param1);
                  stackOut_21_3 = param3.field_f + param2.field_D + param0;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  if (-2147483648 != ((pf) this).field_f) {
                    stackOut_23_0 = (lr) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = ((pf) this).field_f;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    break L9;
                  } else {
                    stackOut_22_0 = (lr) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    break L9;
                  }
                }
                L10: {
                  stackOut_24_0 = (lr) (Object) stackIn_24_0;
                  stackOut_24_1 = (String) (Object) stackIn_24_1;
                  stackOut_24_2 = stackIn_24_2;
                  stackOut_24_3 = stackIn_24_3 - -stackIn_24_4;
                  stackOut_24_4 = -param3.field_i + (param2.field_l + -param3.field_g);
                  stackOut_24_5 = -param3.field_j + param2.field_y + -param3.field_f;
                  stackOut_24_6 = ((pf) this).field_l;
                  stackOut_24_7 = ((pf) this).field_h;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_26_5 = stackOut_24_5;
                  stackIn_26_6 = stackOut_24_6;
                  stackIn_26_7 = stackOut_24_7;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  stackIn_25_5 = stackOut_24_5;
                  stackIn_25_6 = stackOut_24_6;
                  stackIn_25_7 = stackOut_24_7;
                  if (2147483647 != (((pf) this).field_d ^ -1)) {
                    stackOut_26_0 = (lr) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = ((pf) this).field_d;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    stackIn_27_8 = stackOut_26_8;
                    break L10;
                  } else {
                    stackOut_25_0 = (lr) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = stackIn_25_5;
                    stackOut_25_6 = stackIn_25_6;
                    stackOut_25_7 = stackIn_25_7;
                    stackOut_25_8 = 256;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_27_8 = stackOut_25_8;
                    break L10;
                  }
                }
                int discarded$3 = ((lr) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param3.field_m, param3.field_p, param3.field_b);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new hj(11, 0, 1, 2);
        field_a = "Nine-ball";
    }
}

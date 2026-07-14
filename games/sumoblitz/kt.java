/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt {
    static gf field_a;

    final static float[] a(byte param0, float[] param1, float param2) {
        float[] var3 = null;
        float[] var4 = null;
        var4 = new float[2];
        var3 = var4;
        if (param0 >= -6) {
          return null;
        } else {
          var4[0] = (float)(Math.cos((double)param2) * (double)param1[0] - Math.sin((double)param2) * (double)param1[1]);
          var4[1] = (float)(Math.cos((double)param2) * (double)param1[1] + Math.sin((double)param2) * (double)param1[0]);
          return var4;
        }
    }

    final static void b(byte param0) {
        if (param0 < 99) {
            return;
        }
        tn.b((byte) -113);
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!wd.c(-105)) {
            L1: {
              nj.field_a.a(true, wg.b(jc.field_f, 1882601153, nb.field_a), wg.b(pi.field_e, 1882601153, ko.field_p));
              if (nj.field_a.d(-31260)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            var4 = -89 / ((param0 - 67) / 48);
            var3 = 0;
            if (var1 != 0) {
              if ((nj.field_a.field_g ^ -1) <= -1) {
                var3 = jo.field_b[nj.field_a.field_g];
                if (-3 == (var3 ^ -1)) {
                  ha.b(23639);
                  if (var3 == 0) {
                    if (2 == cl.field_s) {
                      var5 = -iv.field_f + wq.a(-84);
                      var7 = (int)((10999L + -var5) / 1000L);
                      if ((var7 ^ -1) >= -1) {
                        var3 = 2;
                        ou.a(true, 5, (byte) 118);
                        return var3;
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  if ((var3 ^ -1) != -6) {
                    if (var3 == 0) {
                      if (2 == cl.field_s) {
                        var5 = -iv.field_f + wq.a(-84);
                        var7 = (int)((10999L + -var5) / 1000L);
                        if ((var7 ^ -1) < -1) {
                          return var3;
                        } else {
                          var3 = 2;
                          ou.a(true, 5, (byte) 118);
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    ha.b(23639);
                    if (var3 == 0) {
                      if (2 == cl.field_s) {
                        var5 = -iv.field_f + wq.a(-84);
                        var7 = (int)((10999L + -var5) / 1000L);
                        if ((var7 ^ -1) >= -1) {
                          var3 = 2;
                          ou.a(true, 5, (byte) 118);
                          return var3;
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  }
                }
              } else {
                if (var2 != 0) {
                  if (cl.field_s != 2) {
                    ha.b(23639);
                    if (var3 == 0) {
                      if (2 == cl.field_s) {
                        var5 = -iv.field_f + wq.a(-84);
                        var7 = (int)((10999L + -var5) / 1000L);
                        if ((var7 ^ -1) < -1) {
                          return var3;
                        } else {
                          var3 = 2;
                          ou.a(true, 5, (byte) 118);
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    L2: {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (2 == cl.field_s) {
                          var5 = -iv.field_f + wq.a(-84);
                          var7 = (int)((10999L + -var5) / 1000L);
                          if ((var7 ^ -1) >= -1) {
                            var3 = 2;
                            ou.a(true, 5, (byte) 118);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    return var3;
                  }
                } else {
                  if (var3 == 0) {
                    if (2 == cl.field_s) {
                      var5 = -iv.field_f + wq.a(-84);
                      var7 = (int)((10999L + -var5) / 1000L);
                      if ((var7 ^ -1) < -1) {
                        return var3;
                      } else {
                        var3 = 2;
                        ou.a(true, 5, (byte) 118);
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            } else {
              if (var2 == 0) {
                if (var3 == 0) {
                  if (2 == cl.field_s) {
                    var5 = -iv.field_f + wq.a(-84);
                    var7 = (int)((10999L + -var5) / 1000L);
                    if ((var7 ^ -1) < -1) {
                      return var3;
                    } else {
                      var3 = 2;
                      ou.a(true, 5, (byte) 118);
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return var3;
                }
              } else {
                if (cl.field_s == 2) {
                  L3: {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (2 == cl.field_s) {
                        var5 = -iv.field_f + wq.a(-84);
                        var7 = (int)((10999L + -var5) / 1000L);
                        if ((var7 ^ -1) >= -1) {
                          var3 = 2;
                          ou.a(true, 5, (byte) 118);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  return var3;
                } else {
                  L4: {
                    ha.b(23639);
                    if (var3 != 0) {
                      break L4;
                    } else {
                      if (2 == cl.field_s) {
                        var5 = -iv.field_f + wq.a(-84);
                        var7 = (int)((10999L + -var5) / 1000L);
                        if ((var7 ^ -1) >= -1) {
                          var3 = 2;
                          ou.a(true, 5, (byte) 118);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  return var3;
                }
              }
            }
          } else {
            L5: {
              nj.field_a.a((byte) 63);
              if (!nj.field_a.d(-31260)) {
                break L5;
              } else {
                var1 = 1;
                break L5;
              }
            }
            if ((tg.field_a ^ -1) == -14) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -14) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gf();
    }
}

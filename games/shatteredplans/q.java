/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends qr {
    private qr[] field_xb;
    static int[] field_Ab;
    private qr[] field_Db;
    private qr field_yb;
    static bi field_Cb;
    int field_zb;
    static int field_Bb;

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (param5) {
            ((q) this).field_xb = null;
        }
        ((q) this).field_mb = param2;
        ((q) this).field_hb = param4;
        ((q) this).field_K = param0;
        ((q) this).field_db = param1;
        this.a(-4783, param3, param6);
    }

    public static void f(byte param0) {
        int var1 = 32 / ((param0 - 65) / 55);
        field_Cb = null;
        field_Ab = null;
    }

    final void f(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_Bb = 3;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (((q) this).field_Db.length <= var2) {
            return;
          } else {
            if (((q) this).field_zb != var2) {
              if (0 != ((q) this).field_Db[var2].field_rb) {
                ((q) this).field_Db[((q) this).field_zb].field_bb = false;
                ((q) this).field_xb[((q) this).field_zb].field_hb = ((q) this).field_xb[((q) this).field_zb].field_hb + 10000;
                ((q) this).field_zb = var2;
                ((q) this).field_Db[var2].field_bb = true;
                ((q) this).field_xb[var2].field_hb = ((q) this).field_xb[var2].field_hb - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    q(long param0, qr param1, String[] param2, qr param3, qr[] param4, int param5) {
        super(param0, (qr) null);
        int var8 = 0;
        qr var9 = null;
        ((q) this).field_Db = new qr[param2.length];
        ((q) this).field_yb = new qr(0L, param3);
        ((q) this).field_xb = param4;
        for (var8 = 0; param2.length > var8; var8++) {
            var9 = new qr(0L, param1);
            var9.field_z = param2[var8];
            ((q) this).field_Db[var8] = var9;
            ((q) this).a(4, var9);
        }
        ((q) this).a(4, ((q) this).field_yb);
        int var11 = 0;
        var8 = var11;
        while (var11 < param4.length) {
            ((q) this).field_yb.a(4, param4[var11]);
            var11++;
        }
        ((q) this).field_zb = param5;
        ((q) this).field_Db[param5].field_bb = true;
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = ShatteredPlansClient.field_F ? 1 : 0;
              if (0 >= param1) {
                break L2;
              } else {
                if (param1 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (param1 <= 255) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (param1 == 8364) {
              var2 = -128;
              break L0;
            } else {
              if (param1 == 8218) {
                var2 = -126;
                break L0;
              } else {
                if (402 != param1) {
                  if (param1 == 8222) {
                    var2 = -124;
                    break L0;
                  } else {
                    if (param1 != 8230) {
                      if (param1 == 8224) {
                        var2 = -122;
                        break L0;
                      } else {
                        if (param1 == 8225) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param1 == 710) {
                            var2 = -120;
                            break L0;
                          } else {
                            if (param1 == 8240) {
                              var2 = -119;
                              break L0;
                            } else {
                              if (param1 == 352) {
                                var2 = -118;
                                break L0;
                              } else {
                                if (8249 != param1) {
                                  if (338 == param1) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param1 == 381) {
                                      var2 = -114;
                                      break L0;
                                    } else {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (8220 != param1) {
                                            if (param1 != 8221) {
                                              if (param1 == 8226) {
                                                var2 = -107;
                                                break L0;
                                              } else {
                                                if (8211 == param1) {
                                                  var2 = -106;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8212) {
                                                    if (param1 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param1 != 8482) {
                                                        if (param1 != 353) {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                            break L0;
                                                          } else {
                                                            if (339 == param1) {
                                                              var2 = -100;
                                                              break L0;
                                                            } else {
                                                              if (param1 == 382) {
                                                                var2 = -98;
                                                                break L0;
                                                              } else {
                                                                if (param1 != 376) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L0;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L0;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  }
                } else {
                  var2 = -125;
                  break L0;
                }
              }
            }
          }
          var2 = (byte)param1;
          break L0;
        }
        if (param0 < -76) {
          return (byte) var2;
        } else {
          return (byte) 6;
        }
    }

    final static void g(int param0) {
        if (param0 > -95) {
            field_Cb = null;
        }
        if (wg.field_f != null) {
            wg.field_f.b(111);
            wg.field_f = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -4783) {
            break L0;
          } else {
            ((q) this).field_zb = -80;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((q) this).field_Db.length) {
            ((q) this).field_yb.a(((q) this).field_K, ((q) this).field_mb - param1, (byte) 56, param1, 0);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= ((q) this).field_xb.length) {
                return;
              } else {
                ((q) this).field_xb[var8].a(-(param2 * 2) + ((q) this).field_yb.field_K, ((q) this).field_yb.field_mb + -(param2 * 2), (byte) 100, param2, param2);
                if (((q) this).field_zb != var8) {
                  ((q) this).field_xb[var8].field_hb = ((q) this).field_xb[var8].field_hb + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = ((q) this).field_K * var4 / ((q) this).field_Db.length;
            var6 = (1 + var4) * ((q) this).field_K / ((q) this).field_Db.length;
            ((q) this).field_Db[var4].field_hb = var5;
            ((q) this).field_Db[var4].field_db = 0;
            ((q) this).field_Db[var4].field_K = var6 + -var5;
            ((q) this).field_Db[var4].field_mb = param1;
            var4++;
            continue L1;
          }
        }
    }

    static {
    }
}

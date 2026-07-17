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

    public static void f() {
        int var1 = 32;
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
        RuntimeException var8 = null;
        int var8_int = 0;
        qr var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ((q) this).field_Db = new qr[param2.length];
            ((q) this).field_yb = new qr(0L, param3);
            ((q) this).field_xb = param4;
            var8_int = 0;
            L1: while (true) {
              if (param2.length <= var8_int) {
                ((q) this).a(4, ((q) this).field_yb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (var11 >= param4.length) {
                    ((q) this).field_zb = param5;
                    ((q) this).field_Db[param5].field_bb = true;
                    break L0;
                  } else {
                    ((q) this).field_yb.a(4, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new qr(0L, param1);
                var9.field_z = param2[var8_int];
                ((q) this).field_Db[var8_int] = var9;
                ((q) this).a(4, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("q.<init>(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param5 + 41);
        }
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
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((q) this).field_Db.length) {
            ((q) this).field_yb.a(((q) this).field_K, ((q) this).field_mb - param1, (byte) 56, param1, 0);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((q) this).field_xb.length) {
                return;
              } else {
                ((q) this).field_xb[var8].a(-(param2 * 2) + ((q) this).field_yb.field_K, ((q) this).field_yb.field_mb + -(param2 * 2), (byte) 100, param2, param2);
                if (((q) this).field_zb != var8) {
                  ((q) this).field_xb[var8].field_hb = ((q) this).field_xb[var8].field_hb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
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
            continue L0;
          }
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static String[] field_k;
    static String field_g;
    private nh field_i;
    static int field_j;
    static int field_d;
    static int field_c;
    static int[] field_h;
    static float field_e;
    private wa field_a;
    private nh field_b;
    private wa field_f;

    private final va a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        va var8 = null;
        va var8_ref = null;
        v var9 = null;
        Object var10 = null;
        v var12 = null;
        va var13 = null;
        v var40 = null;
        va var41 = null;
        v var48 = null;
        va var49 = null;
        var5 = ((-1073737729 & param2) << -1602157724 | param2 >>> 1020622700) ^ param3;
        var5 = var5 | param2 << 288152560;
        var6 = (long)var5;
        if (param1 < -8) {
          var8 = (va) (Object) ((lc) this).field_f.a(var6, 8);
          if (var8 == null) {
            if (param0 != null) {
              if (0 < param0[0]) {
                var48 = v.a(((lc) this).field_i, param2, param3);
                if (var48 != null) {
                  var49 = var48.a();
                  var8_ref = var49;
                  ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var49.field_k.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var48 = v.a(((lc) this).field_i, param2, param3);
              if (var48 != null) {
                var49 = var48.a();
                var8_ref = var49;
                ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var49.field_k.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            return var8;
          }
        } else {
          var10 = null;
          va discarded$1 = ((lc) this).a((int[]) null, (byte) -121, -3);
          var8 = (va) (Object) ((lc) this).field_f.a(var6, 8);
          if (var8 == null) {
            if (param0 != null) {
              if (0 < param0[0]) {
                var40 = v.a(((lc) this).field_i, param2, param3);
                var9 = var40;
                if (var40 != null) {
                  var41 = var40.a();
                  var8_ref = var41;
                  ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var41.field_k.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var12 = v.a(((lc) this).field_i, param2, param3);
              var9 = var12;
              if (var12 != null) {
                var13 = var12.a();
                var8_ref = var13;
                ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var13.field_k.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            return var8;
          }
        }
    }

    final va a(String param0, byte param1, String param2) {
        if (param1 <= 101) {
            return null;
        }
        return this.a((int[]) null, param2, 48117, param0);
    }

    final va a(String param0, String param1, int param2) {
        if (param2 != 37316) {
          field_g = null;
          return this.a(param1, (int[]) null, (byte) 118, param0);
        } else {
          return this.a(param1, (int[]) null, (byte) 118, param0);
        }
    }

    final va a(int[] param0, int param1, int param2) {
        if (1 == ((lc) this).field_i.b(true)) {
          return this.a(param0, -15, 0, param1);
        } else {
          if (1 == ((lc) this).field_i.b(param1, param2 ^ param2)) {
            return this.a(param0, param2 ^ 31216, param1, 0);
          } else {
            throw new RuntimeException();
          }
        }
    }

    final va a(int[] param0, byte param1, int param2) {
        if (-2 != (((lc) this).field_b.b(true) ^ -1)) {
          if (param1 < -61) {
            if (-2 == (((lc) this).field_b.b(param2, 0) ^ -1)) {
              return this.a(-123, 0, param2, param0);
            } else {
              throw new RuntimeException();
            }
          } else {
            ((lc) this).field_f = null;
            if (-2 == (((lc) this).field_b.b(param2, 0) ^ -1)) {
              return this.a(-123, 0, param2, param0);
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return this.a(-126, param2, 0, param0);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        hm var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (nj.field_f != null) {
          if (94 < param0) {
            if (546 > param0) {
              if (-91 >= (param2 ^ -1)) {
                if ((param2 ^ -1) >= -185) {
                  param0 = param0 + (ig.b(31131) + -94);
                  var3 = (hm) (Object) nj.field_f.e(-24172);
                  L0: while (true) {
                    if (var3 != null) {
                      L1: {
                        if (var3.field_o > param0) {
                          break L1;
                        } else {
                          if (32 + var3.field_o < param0) {
                            break L1;
                          } else {
                            if (param2 < var3.field_p) {
                              break L1;
                            } else {
                              if (param2 > 32 + var3.field_p) {
                                break L1;
                              } else {
                                return var3.field_i;
                              }
                            }
                          }
                        }
                      }
                      var3 = (hm) (Object) nj.field_f.a(4);
                      continue L0;
                    } else {
                      var3_int = 65 % ((47 - param1) / 58);
                      return -1;
                    }
                  }
                } else {
                  var3_int = 65 % ((47 - param1) / 58);
                  return -1;
                }
              } else {
                var3_int = 65 % ((47 - param1) / 58);
                return -1;
              }
            } else {
              var3_int = 65 % ((47 - param1) / 58);
              return -1;
            }
          } else {
            var3_int = 65 % ((47 - param1) / 58);
            return -1;
          }
        } else {
          var3_int = 65 % ((47 - param1) / 58);
          return -1;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        ec var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new ec(param0);
                    var3 = var9.c(true);
                    var4 = var9.h(-116);
                    if (param1 == 50166) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_h = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (ql.field_j == 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > ql.field_j) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 != var3) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a((byte) -95, 0, var4, var16);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.h(-69);
                    if ((var5 ^ -1) > -1) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (ql.field_j == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (ql.field_j < var5) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (1 == var3) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = (Object) (Object) ek.field_f;
                    // monitorenter ek.field_f
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        ek.field_f.a(-109, var17, var9);
                        // monitorexit var7
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    int discarded$1 = ej.a(var17, var5, param0, var4, 9);
                    return var6;
                }
                case 21: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cn a(int param0, cn param1, int param2, int param3) {
        cn var5 = null;
        if (param1 != null) {
          var5 = new cn(param2, param3);
          if (param0 <= -114) {
            jh.a(var5);
            if (param2 < param1.field_y) {
              if (param1.field_v <= param3) {
                param1.e(param2 >> 2145105025, param3 >> -1535741631, 0, (param2 << -1600487924) / param1.field_y);
                jh.b();
                jh.b();
                jh.b();
                jh.b();
                return var5;
              } else {
                param1.b(0, 0, param2, param3);
                jh.b();
                jh.b();
                jh.b();
                return var5;
              }
            } else {
              param1.e(param2 >> 2145105025, param3 >> -1535741631, 0, (param2 << -1600487924) / param1.field_y);
              jh.b();
              jh.b();
              jh.b();
              jh.b();
              return var5;
            }
          } else {
            lc.a(true);
            jh.a(var5);
            if (param2 >= param1.field_y) {
              param1.e(param2 >> 2145105025, param3 >> -1535741631, 0, (param2 << -1600487924) / param1.field_y);
              jh.b();
              jh.b();
              jh.b();
              jh.b();
              return var5;
            } else {
              L0: {
                if (param1.field_v > param3) {
                  param1.b(0, 0, param2, param3);
                  break L0;
                } else {
                  param1.e(param2 >> 2145105025, param3 >> -1535741631, 0, (param2 << -1600487924) / param1.field_y);
                  jh.b();
                  break L0;
                }
              }
              jh.b();
              jh.b();
              jh.b();
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    final static gn[] a(int param0, String[][] param1) {
        int var2 = 0;
        gn[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        var2 = param1.length;
        var3 = new gn[var2];
        var4 = 0;
        L0: while (true) {
          if (var2 <= var4) {
            if (param0 != -27711) {
              field_h = null;
              return var3;
            } else {
              return var3;
            }
          } else {
            var3[var4] = new gn(param1[var4][0], param1[var4][1]);
            var4++;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_h = null;
          field_h = null;
          field_k = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_k = null;
          field_g = null;
          return;
        }
    }

    private final va a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        va var8 = null;
        va var8_ref = null;
        jp var9 = null;
        jp var9_ref = null;
        var5 = param1 ^ (param2 >>> -710895636 | (param2 & -268431361) << -1372026396);
        var5 = var5 | param2 << -1835826384;
        var6 = 4294967296L ^ (long)var5;
        var8 = (va) (Object) ((lc) this).field_f.a(var6, 8);
        if (var8 != null) {
          return var8;
        } else {
          if (param3 != null) {
            if (-1 > (param3[0] ^ -1)) {
              var9 = (jp) (Object) ((lc) this).field_a.a(var6, 8);
              if (param0 < -101) {
                L0: {
                  if (var9_ref != null) {
                    break L0;
                  } else {
                    var9_ref = jp.a(((lc) this).field_b, param2, param1);
                    if (var9_ref != null) {
                      ((lc) this).field_a.a((ne) (Object) var9_ref, 12460, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param3);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(false);
                  ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                  return var8_ref;
                }
              } else {
                L1: {
                  field_g = null;
                  if (var9 != null) {
                    break L1;
                  } else {
                    var9_ref = jp.a(((lc) this).field_b, param2, param1);
                    if (var9_ref != null) {
                      ((lc) this).field_a.a((ne) (Object) var9_ref, 12460, var6);
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param3);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(false);
                  ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                  return var8_ref;
                }
              }
            } else {
              return null;
            }
          } else {
            var9 = (jp) (Object) ((lc) this).field_a.a(var6, 8);
            if (param0 < -101) {
              L2: {
                if (var9_ref != null) {
                  break L2;
                } else {
                  var9_ref = jp.a(((lc) this).field_b, param2, param1);
                  if (var9_ref != null) {
                    ((lc) this).field_a.a((ne) (Object) var9_ref, 12460, var6);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(false);
                ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                return var8_ref;
              }
            } else {
              L3: {
                field_g = null;
                if (var9 != null) {
                  break L3;
                } else {
                  var9_ref = jp.a(((lc) this).field_b, param2, param1);
                  if (var9_ref != null) {
                    ((lc) this).field_a.a((ne) (Object) var9_ref, 12460, var6);
                    break L3;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(false);
                ((lc) this).field_f.a((ne) (Object) var8_ref, 12460, var6);
                return var8_ref;
              }
            }
          }
        }
    }

    private final va a(String param0, int[] param1, byte param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var5 = ((lc) this).field_i.a(param0, 1000);
        if ((var5 ^ -1) <= -1) {
          var6 = ((lc) this).field_i.a(0, param3, var5);
          if (param2 >= 85) {
            if (var6 < 0) {
              return null;
            } else {
              return this.a(param1, -100, var5, var6);
            }
          } else {
            var7 = null;
            va discarded$6 = ((lc) this).a((int[]) null, (byte) 102, -108);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(param1, -100, var5, var6);
            }
          }
        } else {
          return null;
        }
    }

    private final va a(int[] param0, String param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((lc) this).field_b.a(param1, param2 ^ 47133);
        if (var5 >= 0) {
          if (param2 == 48117) {
            var6 = ((lc) this).field_b.a(0, param3, var5);
            if (0 > var6) {
              return null;
            } else {
              return this.a(-107, var6, var5, param0);
            }
          } else {
            field_k = null;
            var6 = ((lc) this).field_b.a(0, param3, var5);
            if (0 > var6) {
              return null;
            } else {
              return this.a(-107, var6, var5, param0);
            }
          }
        } else {
          return null;
        }
    }

    lc(nh param0, nh param1) {
        ((lc) this).field_a = new wa(256);
        ((lc) this).field_f = new wa(256);
        ((lc) this).field_i = param0;
        ((lc) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_h = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_c = 0;
        field_g = "Active ability - <%0>";
    }
}

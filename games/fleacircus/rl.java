/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rl {
    private long field_f;
    static sf field_g;
    static mk field_b;
    static int[] field_e;
    static rh field_d;
    private long field_a;
    private RandomAccessFile field_c;

    final void a(long param0, byte param1) throws IOException {
        ((rl) this).field_c.seek(param0);
        ((rl) this).field_f = param0;
        if (param1 > -112) {
            Object var5 = null;
            boolean discarded$0 = rl.a((rh) null, -27);
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_g = null;
        }
        return !uc.field_c.a(-19) ? true : false;
    }

    protected final void finalize() throws Throwable {
        if (((rl) this).field_c != null) {
            System.out.println("");
            ((rl) this).b(-1);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3 = 0;
        ah.field_c = false;
        fk.field_D = false;
        if (param2 < 85) {
          return;
        } else {
          L0: {
            if (null == ok.field_x) {
              break L0;
            } else {
              if (ok.field_x.field_G) {
                L1: {
                  var3 = 1;
                  if (8 == param1) {
                    L2: {
                      if (!jg.field_d) {
                        param0 = o.field_g;
                        break L2;
                      } else {
                        param0 = me.field_c;
                        break L2;
                      }
                    }
                    param1 = 2;
                    lg.field_b.a((byte) -102, aa.field_s);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (param1 == 10) {
                    l.a(0);
                    var3 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var3 == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (!fk.field_D) {
                        break L5;
                      } else {
                        param0 = db.a(ud.field_a, new String[1], true);
                        break L5;
                      }
                    }
                    L6: {
                      if (!ud.field_c) {
                        break L6;
                      } else {
                        param0 = k.field_e;
                        break L6;
                      }
                    }
                    ok.field_x.a((byte) -97, param1, param0);
                    break L4;
                  }
                }
                if (-257 == (param1 ^ -1)) {
                  break L0;
                } else {
                  if ((param1 ^ -1) != -11) {
                    if (jg.field_d) {
                      break L0;
                    } else {
                      lg.field_b.a(-41);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        if (param2 != 0) {
            ((rl) this).field_a = -79L;
        }
        int var5 = ((rl) this).field_c.read(param0, param1, param3);
        if (-1 > (var5 ^ -1)) {
            ((rl) this).field_f = ((rl) this).field_f + (long)var5;
        }
        return var5;
    }

    final static boolean a(rh param0, int param1) {
        if (param1 != 0) {
            Object var3 = null;
            rl.a(21, -126, (int[]) null, -68, -71, 30, -52, -14, (byte) 65);
        }
        return param0.a(-77);
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        if (param0 != -930374320) {
            Object var2 = null;
            rl.a(111, -12, (int[]) null, 28, 28, 35, 6, -36, (byte) -75);
        }
        field_b = null;
        field_d = null;
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 < 87) {
            return;
        }
        if (!(((rl) this).field_a >= (long)param1 - -((rl) this).field_f)) {
            ((rl) this).field_c.seek(((rl) this).field_a);
            ((rl) this).field_c.write(1);
            throw new EOFException();
        }
        ((rl) this).field_c.write(param3, param2, param1);
        ((rl) this).field_f = ((rl) this).field_f + (long)param1;
    }

    final void b(int param0) throws IOException {
        if (param0 != -1) {
            return;
        }
        if (!(null == ((rl) this).field_c)) {
            ((rl) this).field_c.close();
            ((rl) this).field_c = null;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param1.length;
        if (param0 != 1) {
          return null;
        } else {
          var3 = new byte[var2];
          dm.a(param1, 0, var3, 0, var2);
          return var3;
        }
    }

    final static java.applet.Applet a(byte param0) {
        if (null != sd.field_j) {
            return sd.field_j;
        }
        if (param0 > -49) {
            field_d = null;
        }
        return (java.applet.Applet) (Object) pf.field_c;
    }

    final long c(int param0) throws IOException {
        if (param0 != 2049105808) {
            Object var3 = null;
            boolean discarded$0 = rl.a((rh) null, -61);
        }
        return ((rl) this).field_c.length();
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
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
          var19 = fleas.field_A ? 1 : 0;
          if (param7 < 0) {
            break L0;
          } else {
            if (bl.field_i > param1) {
              L1: {
                if (param0 >= 0) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (param3 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (bl.field_f > param0) {
                  break L2;
                } else {
                  if (bl.field_f > param6) {
                    break L2;
                  } else {
                    if (bl.field_f > param3) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param8 == -115) {
                  break L3;
                } else {
                  rl.a(125);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param7 - param1;
                  if (param4 != param1) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (param7 != param1) {
                          break L7;
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var9 = param0 << -930374320;
                          var10 = param6 << 556950736;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        var15 = -param4 + param7;
                        if (param6 <= param0) {
                          break L8;
                        } else {
                          var10 = param6 << -1455357968;
                          var11 = (param3 + -param0 << -1234607312) / var14;
                          var9 = param0 << -2146856624;
                          var12 = (param3 - param6 << 694387952) / var15;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var10 = param0 << -661359792;
                      var9 = param6 << 1593149648;
                      var12 = (-param0 + param3 << -110628944) / var14;
                      var11 = (param3 + -param6 << 1155903504) / var15;
                      break L6;
                    }
                    var13 = 0;
                    if (param1 >= 0) {
                      break L4;
                    } else {
                      param1 = Math.min(-param1, -param1 + param4);
                      var10 = var10 + var12 * param1;
                      var9 = var9 + param1 * var11;
                      param1 = 0;
                      if (0 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L9: {
                  L10: {
                    var10 = param0 << -614037232;
                    var9 = param0 << -614037232;
                    var15 = -param1 + param4;
                    var11 = (-param0 + param6 << 1988041232) / var15;
                    var12 = (param3 + -param0 << -1773292208) / var14;
                    if (var11 >= var12) {
                      break L10;
                    } else {
                      var13 = 0;
                      if (0 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var13 = 1;
                  var16 = var11;
                  var11 = var12;
                  var12 = var16;
                  break L9;
                }
                L11: {
                  L12: {
                    if (param1 >= 0) {
                      break L12;
                    } else {
                      L13: {
                        if (0 > param4) {
                          break L13;
                        } else {
                          param1 = -param1;
                          var9 = var9 + var11 * param1;
                          var10 = var10 + param1 * var12;
                          param1 = 0;
                          if (0 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      param1 = param4 + -param1;
                      var10 = var10 + param1 * var12;
                      var9 = var9 + var11 * param1;
                      param1 = param4;
                      if (0 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var16 = bl.field_b[param1];
                  L14: while (true) {
                    if (param1 >= param4) {
                      break L11;
                    } else {
                      L15: {
                        var17 = var9 >> -608062192;
                        if ((var17 ^ -1) > (bl.field_f ^ -1)) {
                          L16: {
                            var18 = (var10 >> 72852720) + -(var9 >> 2049105808);
                            if (var18 != 0) {
                              break L16;
                            } else {
                              if (var17 < 0) {
                                break L15;
                              } else {
                                if (bl.field_f <= var17) {
                                  break L15;
                                } else {
                                  rh.a(param5, var18, var17 - -var16, param2, (byte) -122);
                                  if (0 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            if (var18 + var17 < bl.field_f) {
                              break L17;
                            } else {
                              var18 = -1 + (-var17 + bl.field_f);
                              break L17;
                            }
                          }
                          L18: {
                            if (var17 < 0) {
                              break L18;
                            } else {
                              rh.a(param5, var18, var17 - -var16, param2, (byte) -84);
                              if (0 == 0) {
                                break L15;
                              } else {
                                break L18;
                              }
                            }
                          }
                          rh.a(param5, var17 + var18, var16, param2, (byte) -68);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      param1++;
                      if (param1 < bl.field_i) {
                        var10 = var10 + var12;
                        var9 = var9 + var11;
                        var16 = var16 + gb.field_d;
                        if (0 == 0) {
                          continue L14;
                        } else {
                          break L11;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L19: {
                  var16 = param7 + -param4;
                  if (var16 == 0) {
                    break L19;
                  } else {
                    L20: {
                      L21: {
                        if (var13 == 0) {
                          break L21;
                        } else {
                          var10 = param6 << -427170832;
                          if (0 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var9 = param6 << 2046612176;
                      break L20;
                    }
                    var17 = param3 << 1137524272;
                    var11 = (var17 - var9) / var16;
                    var12 = (-var10 + var17) / var16;
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L19;
                    }
                  }
                }
                var12 = 0;
                var11 = 0;
                break L4;
              }
              L22: {
                if (0 > param1) {
                  param1 = -param1;
                  var9 = var9 + param1 * var11;
                  var10 = var10 + param1 * var12;
                  param1 = 0;
                  break L22;
                } else {
                  break L22;
                }
              }
              var15 = bl.field_b[param1];
              if (param1 < param7) {
                L23: {
                  var16 = var9 >> 242346640;
                  if (var16 >= bl.field_f) {
                    break L23;
                  } else {
                    L24: {
                      var17 = -(var9 >> 1880340560) + (var10 >> 1476034800);
                      if (var17 == 0) {
                        break L24;
                      } else {
                        L25: {
                          if (bl.field_f > var16 + var17) {
                            break L25;
                          } else {
                            var17 = -1 + -var16 + bl.field_f;
                            break L25;
                          }
                        }
                        L26: {
                          if (var16 < 0) {
                            break L26;
                          } else {
                            rh.a(param5, var17, var16 - -var15, param2, (byte) -98);
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L26;
                            }
                          }
                        }
                        rh.a(param5, var16 + var17, var15, param2, (byte) -113);
                        if (0 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L23;
                    } else {
                      if (var16 < bl.field_f) {
                        rh.a(param5, var17, var15 + var16, param2, (byte) -120);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                param1++;
                if (bl.field_i <= param1) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var15 = var15 + gb.field_d;
                  var10 = var10 + var12;
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

    rl(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((rl) this).field_c = new RandomAccessFile(param0, param1);
        ((rl) this).field_a = param2;
        ((rl) this).field_f = 0L;
        int var5 = ((rl) this).field_c.read();
        if ((var5 ^ -1) != 0) {
            if (!param1.equals((Object) (Object) "r")) {
                ((rl) this).field_c.seek(0L);
                ((rl) this).field_c.write(var5);
            }
        }
        ((rl) this).field_c.seek(0L);
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static wc field_e;
    private cm field_l;
    private cm field_c;
    private uh field_i;
    static int field_g;
    static String field_h;
    static boolean field_j;
    static gk[] field_a;
    static byte[] field_f;
    static String field_k;
    static String field_b;
    private uh field_d;

    final sk a(int[] param0, int param1, int param2) {
        if (((ub) this).field_c.b((byte) -61) == 1) {
          return this.a(param1, false, 0, param0);
        } else {
          if (((ub) this).field_c.a(true, param1) == 1) {
            return this.a(0, false, param1, param0);
          } else {
            if (param2 != -6923) {
              ub.a(false, 68);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final static void a(boolean param0) {
        kd var1 = null;
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        nn.field_f = null;
        vd.field_h = 0;
        cc.field_gc = 0;
        ea.field_c.g(6);
        am.field_c.g(6);
        var1 = pi.field_a.a(114);
        L0: while (true) {
          if (var1 == null) {
            var1 = db.field_h.a(97);
            L1: while (true) {
              if (var1 == null) {
                if (param0) {
                  qc.field_P = 0;
                  return;
                } else {
                  ub.c(-100);
                  qc.field_P = 0;
                  return;
                }
              } else {
                var1.e(480);
                var1 = db.field_h.a((byte) -117);
                continue L1;
              }
            }
          } else {
            var1.e(480);
            var1 = pi.field_a.a((byte) -55);
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_k = null;
        if (param0 < 68) {
          field_b = null;
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static String a(byte param0, int param1, byte[] param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        var11 = new char[param3];
        var10 = var11;
        var9 = var10;
        var4 = var9;
        if (param0 != 37) {
          return null;
        } else {
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            if (param3 <= var6) {
              return new String(var11, 0, var5);
            } else {
              var7 = param2[var6 + param1] & 255;
              if (var7 != 0) {
                L1: {
                  if (128 > var7) {
                    break L1;
                  } else {
                    if (160 > var7) {
                      L2: {
                        var8 = gl.field_w[var7 + -128];
                        if (var8 == 0) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var5++;
                var9[var5] = (char)var7;
                var6++;
                var6++;
                continue L0;
              } else {
                var6++;
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    final sk a(byte param0, int[] param1, int param2) {
        if (param0 == -35) {
          if (-2 != (((ub) this).field_l.b((byte) 121) ^ -1)) {
            if (1 == ((ub) this).field_l.a(true, param2)) {
              return this.a(param2, 0, 0, param1);
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(0, 0, param2, param1);
          }
        } else {
          ub.a(-82);
          if (-2 != (((ub) this).field_l.b((byte) 121) ^ -1)) {
            if (1 == ((ub) this).field_l.a(true, param2)) {
              return this.a(param2, 0, 0, param1);
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(0, 0, param2, param1);
          }
        }
    }

    final static void c(int param0) {
        if (wb.field_c != null) {
          pa.a((java.awt.Canvas) (Object) wb.field_c, 9174);
          if (param0 != 0) {
            L0: {
              field_k = null;
              wb.field_c.a(hb.field_i, param0 ^ -101);
              wb.field_c = null;
              if (null != ve.field_a) {
                ve.field_a.a(15481);
                break L0;
              } else {
                break L0;
              }
            }
            sl.field_n.requestFocus();
            return;
          } else {
            L1: {
              wb.field_c.a(hb.field_i, param0 ^ -101);
              wb.field_c = null;
              if (null != ve.field_a) {
                ve.field_a.a(15481);
                break L1;
              } else {
                break L1;
              }
            }
            sl.field_n.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    private final sk a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        sk var8 = null;
        sk var8_ref = null;
        uk var9 = null;
        uk var9_ref = null;
        var5 = param2 ^ (65520 & param0 << 1816291268 | param0 >>> -657504340);
        var5 = var5 | param0 << -306872816;
        if (param1 == 0) {
          var6 = (long)var5 ^ 4294967296L;
          var8 = (sk) (Object) ((ub) this).field_d.a(var6, 127);
          if (var8 != null) {
            return var8;
          } else {
            if (param3 != null) {
              if (param3[0] > 0) {
                L0: {
                  var9 = (uk) (Object) ((ub) this).field_i.a(var6, 124);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9_ref = uk.a(((ub) this).field_l, param0, param2);
                    if (var9_ref != null) {
                      ((ub) this).field_i.a(var6, (ck) (Object) var9_ref, -1816);
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
                  var9_ref.b(4);
                  ((ub) this).field_d.a(var6, (ck) (Object) var8_ref, -1816);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (uk) (Object) ((ub) this).field_i.a(var6, 124);
                if (var9 != null) {
                  break L1;
                } else {
                  var9_ref = uk.a(((ub) this).field_l, param0, param2);
                  if (var9_ref != null) {
                    ((ub) this).field_i.a(var6, (ck) (Object) var9_ref, -1816);
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
                var9_ref.b(4);
                ((ub) this).field_d.a(var6, (ck) (Object) var8_ref, -1816);
                return var8_ref;
              }
            }
          }
        } else {
          ((ub) this).field_d = null;
          var6 = (long)var5 ^ 4294967296L;
          var8 = (sk) (Object) ((ub) this).field_d.a(var6, 127);
          if (var8 != null) {
            return var8;
          } else {
            if (param3 != null) {
              if (param3[0] > 0) {
                L2: {
                  var9 = (uk) (Object) ((ub) this).field_i.a(var6, 124);
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9_ref = uk.a(((ub) this).field_l, param0, param2);
                    if (var9_ref != null) {
                      ((ub) this).field_i.a(var6, (ck) (Object) var9_ref, -1816);
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
                  var9_ref.b(4);
                  ((ub) this).field_d.a(var6, (ck) (Object) var8_ref, -1816);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L3: {
                var9 = (uk) (Object) ((ub) this).field_i.a(var6, 124);
                if (var9 != null) {
                  break L3;
                } else {
                  var9_ref = uk.a(((ub) this).field_l, param0, param2);
                  if (var9_ref != null) {
                    ((ub) this).field_i.a(var6, (ck) (Object) var9_ref, -1816);
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
                var9_ref.b(4);
                ((ub) this).field_d.a(var6, (ck) (Object) var8_ref, -1816);
                return var8_ref;
              }
            }
          }
        }
    }

    private final sk a(String param0, int param1, String param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var5 = ((ub) this).field_c.a(param0, 103);
        if (var5 >= 0) {
          if (param1 <= -67) {
            var6 = ((ub) this).field_c.a(var5, -32759, param2);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(var6, false, var5, param3);
            }
          } else {
            var7 = null;
            sk discarded$2 = this.a((String) null, 67, (String) null, (int[]) null);
            var6 = ((ub) this).field_c.a(var5, -32759, param2);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(var6, false, var5, param3);
            }
          }
        } else {
          return null;
        }
    }

    final sk a(String param0, String param1, int param2) {
        int var4 = -34 / ((param2 - 33) / 60);
        return this.a(param1, -78, param0, (int[]) null);
    }

    private final sk a(int param0, boolean param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        sk var8 = null;
        sk var8_ref = null;
        mh var11 = null;
        sk var12 = null;
        mh var13 = null;
        sk var14 = null;
        var5 = param0 ^ (param2 >>> -489606932 | param2 << -953753500 & 65532);
        var5 = var5 | param2 << 1256070480;
        var6 = (long)var5;
        if (!param1) {
          var8 = (sk) (Object) ((ub) this).field_d.a(var6, 124);
          if (var8 == null) {
            if (param3 != null) {
              if ((param3[0] ^ -1) < -1) {
                var13 = mh.a(((ub) this).field_c, param2, param0);
                if (var13 != null) {
                  var14 = var13.b();
                  var8_ref = var14;
                  ((ub) this).field_d.a(var6, (ck) (Object) var8_ref, -1816);
                  if (param3 != null) {
                    param3[0] = param3[0] - var14.field_r.length;
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
              var11 = mh.a(((ub) this).field_c, param2, param0);
              if (var11 != null) {
                var12 = var11.b();
                var8_ref = var12;
                ((ub) this).field_d.a(var6, (ck) (Object) var8_ref, -1816);
                if (param3 != null) {
                  param3[0] = param3[0] - var12.field_r.length;
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
          return null;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param0 > 115) {
          var2 = param1;
          if (var2 != 2) {
            if (-57 != var2) {
              if (58 != var2) {
                if (-67 != var2) {
                  if (-71 != var2) {
                    if (-77 != var2) {
                      if (80 != var2) {
                        if (85 != var2) {
                          if (89 != var2) {
                            if (-94 != (var2 ^ -1)) {
                              return -1;
                            } else {
                              return 106;
                            }
                          } else {
                            return 105;
                          }
                        } else {
                          return 104;
                        }
                      } else {
                        return 103;
                      }
                    } else {
                      return 102;
                    }
                  } else {
                    return 100;
                  }
                } else {
                  return 99;
                }
              } else {
                return 98;
              }
            } else {
              return 97;
            }
          } else {
            return 96;
          }
        } else {
          field_k = null;
          var2 = param1;
          if (var2 != 2) {
            if (-57 != var2) {
              if (58 != var2) {
                if (-67 != var2) {
                  if (-71 != var2) {
                    if (-77 != var2) {
                      if (80 != var2) {
                        if (85 != var2) {
                          if (89 != var2) {
                            if (-94 == (var2 ^ -1)) {
                              return 106;
                            } else {
                              return -1;
                            }
                          } else {
                            return 105;
                          }
                        } else {
                          return 104;
                        }
                      } else {
                        return 103;
                      }
                    } else {
                      return 102;
                    }
                  } else {
                    return 100;
                  }
                } else {
                  return 99;
                }
              } else {
                return 98;
              }
            } else {
              return 97;
            }
          } else {
            return 96;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (!param0) {
          L0: {
            if (g.field_c != null) {
              l.a(g.field_c, (byte) -128);
              ef.a(1, ll.field_q * 2);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 == -1) {
            return;
          } else {
            L1: {
              if (qj.field_q[param1] != null) {
                g.field_c = em.a(qj.field_q[param1], 100, ll.field_q);
                ef.a(1, ll.field_q / 2);
                pc discarded$2 = on.a(g.field_c, -48);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int b(int param0) {
        if (param0 >= -62) {
            field_k = null;
            return km.field_f;
        }
        return km.field_f;
    }

    ub(cm param0, cm param1) {
        ((ub) this).field_i = new uh(256);
        ((ub) this).field_d = new uh(256);
        ((ub) this).field_c = param0;
        ((ub) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new wc();
        field_h = "<%0> would need a rating of <%1> to play with the current options.";
        field_j = false;
        field_g = -1;
        field_k = "Campaign: <col=ffffff><%0></col>";
        field_b = "You must be a member to play with the current options.";
    }
}

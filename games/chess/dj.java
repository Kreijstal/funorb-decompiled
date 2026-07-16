/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends l {
    int[] field_u;
    private String[] field_v;
    static String field_q;
    private int[] field_s;
    static km field_t;
    static String field_w;
    private int[][] field_r;

    final static void a(boolean param0) {
        vj.field_c = new jc();
        if (!param0) {
            field_q = null;
        }
    }

    final String e(byte param0) {
        int var3 = 0;
        int var4 = Chess.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((dj) this).field_v == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((dj) this).field_v[0]);
        for (var3 = 1; ((dj) this).field_v.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((dj) this).field_v[var3]);
        }
        if (param0 >= -102) {
            field_t = null;
        }
        return var2.toString();
    }

    final void a(p param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          if (param1) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.i(-79);
          if (0 != var3) {
            this.a(var3, 80, param0);
            continue L1;
          } else {
            return;
          }
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6_ref_byte__ = null;
        int var6 = 0;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        p var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var10 = new p(param0);
          var3 = 92 % ((61 - param1) / 50);
          var4 = var10.i(-92);
          var5 = var10.e((byte) -124);
          if (-1 < (var5 ^ -1)) {
            break L0;
          } else {
            L1: {
              if (0 == je.field_l) {
                break L1;
              } else {
                if (var5 <= je.field_l) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (var4 != 0) {
              L2: {
                var6 = var10.e((byte) -93);
                if (var6 < 0) {
                  break L2;
                } else {
                  L3: {
                    if (je.field_l == 0) {
                      break L3;
                    } else {
                      if (je.field_l < var6) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var18 = new byte[var6];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var7 = var12;
                    if ((var4 ^ -1) != -2) {
                      var8 = (Object) (Object) nc.field_N;
                      synchronized (var8) {
                        L5: {
                          nc.field_N.a(var18, (byte) -34, var10);
                          break L5;
                        }
                      }
                      break L4;
                    } else {
                      int discarded$4 = en.a(var18, var6, param0, var5, 9);
                      break L4;
                    }
                  }
                  return var7;
                }
              }
              throw new RuntimeException();
            } else {
              var17 = new byte[var5];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var6_ref_byte__ = var11;
              var10.a(var5, (byte) 124, var17, 0);
              return var6_ref_byte__;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void g(int param0) {
        hd.field_c.a(0, -(bo.field_c ? 44 + sc.field_e : 0) + bh.field_G.field_M, -2147483648, 18, 0);
        uk.field_c.a(-40 + (bh.field_G.field_M + (-sc.field_e + -2)), 42 - -sc.field_e, -2147483648, 18, 0);
        ib.field_c.a(param0, bh.field_G.field_pb - 20, 20, -3, sc.field_e, 0, bh.field_G.field_M);
    }

    final static gm h(int param0) {
        if (param0 != -13154) {
            dj.a(true);
        }
        return (gm) (Object) new kh();
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Chess.field_G;
        var2 = param0.length();
        var3 = new byte[var2];
        var4 = param1;
        L0: while (true) {
          if (var2 <= var4) {
            return var3;
          } else {
            L1: {
              L2: {
                L3: {
                  var5 = param0.charAt(var4);
                  if (0 >= var5) {
                    break L3;
                  } else {
                    if (var5 < 128) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 < 160) {
                    break L4;
                  } else {
                    if (var5 > 255) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var5 != 8364) {
                  if (8218 != var5) {
                    if (402 != var5) {
                      if (var5 != 8222) {
                        if (var5 != 8230) {
                          if (8224 == var5) {
                            var3[var4] = (byte)-122;
                            break L1;
                          } else {
                            if (var5 != 8225) {
                              if (710 != var5) {
                                if (var5 != 8240) {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L1;
                                  } else {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L1;
                                    } else {
                                      if (var5 == 338) {
                                        var3[var4] = (byte)-116;
                                        break L1;
                                      } else {
                                        if (381 == var5) {
                                          var3[var4] = (byte)-114;
                                          break L1;
                                        } else {
                                          if (var5 == 8216) {
                                            var3[var4] = (byte)-111;
                                            break L1;
                                          } else {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L1;
                                            } else {
                                              if (var5 == 8220) {
                                                var3[var4] = (byte)-109;
                                                break L1;
                                              } else {
                                                if (8221 != var5) {
                                                  if (8226 != var5) {
                                                    if (8211 != var5) {
                                                      if (var5 != 8212) {
                                                        if (732 != var5) {
                                                          if (var5 != 8482) {
                                                            if (353 == var5) {
                                                              var3[var4] = (byte)-102;
                                                              break L1;
                                                            } else {
                                                              if (8250 != var5) {
                                                                if (var5 != 339) {
                                                                  if (var5 != 382) {
                                                                    if (var5 != 376) {
                                                                      var3[var4] = (byte)63;
                                                                      break L1;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-101;
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-103;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-107;
                                                    break L1;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-119;
                                  break L1;
                                }
                              } else {
                                var3[var4] = (byte)-120;
                                break L1;
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L1;
                            }
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L1;
                        }
                      } else {
                        var3[var4] = (byte)-124;
                        break L1;
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L1;
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L1;
                  }
                } else {
                  var3[var4] = (byte)-128;
                  break L1;
                }
              }
              var3[var4] = (byte)var5;
              break L1;
            }
            var4++;
            continue L0;
          }
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = Chess.field_G;
        if (param0 != 32768) {
            return;
        }
        if (null != ((dj) this).field_u) {
            for (var2 = 0; ((dj) this).field_u.length > var2; var2++) {
                ((dj) this).field_u[var2] = s.a(((dj) this).field_u[var2], 32768);
            }
        }
    }

    public static void d(byte param0) {
        field_q = null;
        field_t = null;
        if (param0 > -25) {
            dj.a(false);
        }
        field_w = null;
    }

    private final void a(int param0, int param1, p param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hg var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = Chess.field_G;
          if (1 != param0) {
            if ((param0 ^ -1) != -3) {
              if (param0 != 3) {
                if (4 == param0) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param2.i(-103);
                ((dj) this).field_r = new int[var4][];
                ((dj) this).field_s = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param2.f(674914976);
                    var7 = li.a(var6, 0);
                    if (var7 != null) {
                      ((dj) this).field_s[var5] = var6;
                      ((dj) this).field_r[var5] = new int[var7.field_c];
                      var8 = 0;
                      L2: while (true) {
                        if (var8 < var7.field_c) {
                          ((dj) this).field_r[var5][var8] = param2.f(674914976);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var4 = param2.i(param1 + -193);
              ((dj) this).field_u = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((dj) this).field_u[var5] = param2.f(674914976);
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            ((dj) this).field_v = gl.a((byte) -118, '<', param2.d(0));
            break L0;
          }
        }
        L4: {
          if (param1 == 80) {
            break L4;
          } else {
            var10 = null;
            byte[] discarded$1 = dj.a((CharSequence) null, 106);
            break L4;
          }
        }
    }

    dj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Your request to join has been declined.";
        field_w = "Cancel unrated rematch";
    }
}

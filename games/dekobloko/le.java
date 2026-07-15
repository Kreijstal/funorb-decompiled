/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends of {
    private kh field_w;
    static int field_y;
    private byte[] field_F;
    static String field_r;
    private ng field_G;
    private im field_v;
    static w[] field_D;
    private int field_q;
    private kh field_H;
    private ad field_I;
    private sf field_p;
    private byte[] field_z;
    static tb field_o;
    private dd field_l;
    private int field_n;
    private int field_x;
    static int field_t;
    private vj field_J;
    private boolean field_u;
    private vj field_k;
    private int field_j;
    static eh field_m;
    static int field_s;
    private boolean field_B;
    static ji field_E;
    private long field_A;
    private boolean field_C;

    final ad a(boolean param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = client.field_A ? 1 : 0;
        if (null == ((le) this).field_I) {
          L0: {
            if (((le) this).field_p == null) {
              if (!((le) this).field_l.a(param0)) {
                ((le) this).field_p = (sf) (Object) ((le) this).field_l.a(true, (byte) 0, true, 255, ((le) this).field_x);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((le) this).field_p.field_z) {
            if (param0) {
              L1: {
                var9 = ((le) this).field_p.g((byte) 70);
                var8 = var9;
                var7 = var8;
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (((le) this).field_p instanceof el) {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((le) this).field_I = new ad(var9, ((le) this).field_q, ((le) this).field_z);
                    if (((le) this).field_n == ((le) this).field_I.field_m) {
                      break L1;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } else {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((le) this).field_I = new ad(var9, ((le) this).field_q, ((le) this).field_z);
                    if (((le) this).field_H != null) {
                      el discarded$1 = ((le) this).field_v.a(((le) this).field_x, ((le) this).field_H, var9, (byte) 67);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (null == ((le) this).field_w) {
                  break L2;
                } else {
                  ((le) this).field_F = new byte[((le) this).field_I.field_n];
                  break L2;
                }
              }
              ((le) this).field_p = null;
              return ((le) this).field_I;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((le) this).field_I;
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_D = null;
        field_E = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        if (((le) this).field_J == null) {
            return;
        }
        if (null == ((le) this).a(true)) {
            return;
        }
        bh var2 = ((le) this).field_k.c((byte) -113);
        while (var2 != null) {
            var3 = (int)var2.field_i;
            if (var3 < 0) {
                var2.b((byte) 105);
            } else {
                if (((le) this).field_I.field_n <= var3) {
                    var2.b((byte) 105);
                } else {
                    if (-1 == (((le) this).field_I.field_B[var3] ^ -1)) {
                        var2.b((byte) 105);
                    } else {
                        if (!(0 != ((le) this).field_F[var3])) {
                            sf discarded$0 = this.a(1, var3, (byte) -20);
                        }
                        if (!(-1 != ((le) this).field_F[var3])) {
                            sf discarded$1 = this.a(2, var3, (byte) -20);
                        }
                        if (((le) this).field_F[var3] == 1) {
                            var2.b((byte) 117);
                        }
                    }
                }
            }
            var2 = ((le) this).field_k.d(true);
        }
        if (param0 != 16322) {
            ((le) this).b(-71);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 103 % ((param1 - 5) / 58);
        sf dupTemp$0 = (sf) (Object) ((le) this).field_G.a((long)param0, 77);
        sf var5 = dupTemp$0;
        sf var3 = dupTemp$0;
        if (var5 != null) {
            return var5.a(false);
        }
        return 0;
    }

    final void b(byte param0) {
        if (!(null != ((le) this).field_w)) {
            return;
        }
        if (param0 != 0) {
            ((le) this).field_I = null;
        }
        ((le) this).field_B = true;
        if (!(((le) this).field_J != null)) {
            ((le) this).field_J = new vj();
        }
    }

    private final sf a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var23 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = client.field_A ? 1 : 0;
          sf dupTemp$2 = (sf) (Object) ((le) this).field_G.a((long)param1, 95);
          var12 = dupTemp$2;
          var4 = (Object) (Object) dupTemp$2;
          if (var12 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (var12.field_D) {
                break L0;
              } else {
                if (var12.field_z) {
                  var12.b((byte) 114);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (-1 == (param0 ^ -1)) {
                L3: {
                  if (null == ((le) this).field_w) {
                    break L3;
                  } else {
                    if (0 != (((le) this).field_F[param1] ^ -1)) {
                      var4 = (Object) (Object) ((le) this).field_v.a(param1, ((le) this).field_w, -98);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((le) this).field_l.a(true)) {
                  var4 = (Object) (Object) ((le) this).field_l.a(true, (byte) 2, true, ((le) this).field_x, param1);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 == param0) {
                  if (null != ((le) this).field_w) {
                    var4 = (Object) (Object) ((le) this).field_v.a(param1, ((le) this).field_w, (byte) 61);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (param0 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (null == ((le) this).field_w) {
                      throw new RuntimeException();
                    } else {
                      if (0 != (((le) this).field_F[param1] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        if (!((le) this).field_l.b(0)) {
                          var4 = (Object) (Object) ((le) this).field_l.a(false, (byte) 2, true, ((le) this).field_x, param1);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((le) this).field_G.a((long)param1, -1, (bh) var4);
            break L1;
          }
        }
        if (!((sf) var4).field_z) {
          L4: {
            var28 = ((sf) var4).g((byte) 79);
            var23 = var28;
            var18 = var23;
            var13 = var18;
            var5 = var13;
            if (param2 == -20) {
              break L4;
            } else {
              ((le) this).field_q = 57;
              break L4;
            }
          }
          if (!(var4 instanceof el)) {
            L5: {
              if (var5 == null) {
                break L5;
              } else {
                if (-3 > (var28.length ^ -1)) {
                  ab.field_c.reset();
                  ab.field_c.update(var5, 0, -2 + var28.length);
                  var6 = (int)ab.field_c.getValue();
                  if (((le) this).field_I.field_c[param1] != var6) {
                    throw new RuntimeException();
                  } else {
                    L6: {
                      if (((le) this).field_I.field_l == null) {
                        break L6;
                      } else {
                        if (null != ((le) this).field_I.field_l[param1]) {
                          var31 = ((le) this).field_I.field_l[param1];
                          var32 = um.a(0, var5, 0, -2 + var28.length);
                          var11 = 0;
                          var9 = var11;
                          L7: while (true) {
                            if (var11 >= 64) {
                              break L6;
                            } else {
                              if (var31[var11] != var32[var11]) {
                                throw new RuntimeException();
                              } else {
                                var11++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L8: {
                      ((le) this).field_l.field_j = 0;
                      ((le) this).field_l.field_o = 0;
                      var5[-2 + var28.length] = (byte)(((le) this).field_I.field_y[param1] >>> 967493416);
                      var5[-1 + var28.length] = (byte)((le) this).field_I.field_y[param1];
                      if (null != ((le) this).field_w) {
                        el discarded$3 = ((le) this).field_v.a(param1, ((le) this).field_w, var28, (byte) -68);
                        if ((((le) this).field_F[param1] ^ -1) == -2) {
                          break L8;
                        } else {
                          ((le) this).field_F[param1] = (byte) 1;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (!((sf) var4).field_D) {
                        ((sf) var4).b((byte) 117);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return (sf) var4;
                  }
                } else {
                  break L5;
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L10: {
                L11: {
                  if (var5 == null) {
                    break L11;
                  } else {
                    if (-3 > (var28.length ^ -1)) {
                      ab.field_c.reset();
                      ab.field_c.update(var5, 0, -2 + var28.length);
                      var6 = (int)ab.field_c.getValue();
                      if (((le) this).field_I.field_c[param1] != var6) {
                        throw new RuntimeException();
                      } else {
                        L12: {
                          if (((le) this).field_I.field_l == null) {
                            break L12;
                          } else {
                            if (null != ((le) this).field_I.field_l[param1]) {
                              var30 = ((le) this).field_I.field_l[param1];
                              var29 = um.a(0, var5, 0, var28.length - 2);
                              var9 = 0;
                              L13: while (true) {
                                if (64 <= var9) {
                                  break L12;
                                } else {
                                  if (var29[var9] == var30[var9]) {
                                    var9++;
                                    continue L13;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        var7 = ((var5[var28.length + -2] & 255) << 1262224936) - -(var5[var28.length + -1] & 255);
                        if ((((le) this).field_I.field_y[param1] & 65535) == var7) {
                          L14: {
                            if (((le) this).field_F[param1] != 1) {
                              L15: {
                                if (0 != ((le) this).field_F[param1]) {
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              ((le) this).field_F[param1] = (byte) 1;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L16: {
                            if (((sf) var4).field_D) {
                              break L16;
                            } else {
                              ((sf) var4).b((byte) 115);
                              break L16;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L10;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((le) this).field_F[param1] = (byte)-1;
              ((sf) var4).b((byte) 119);
              if (((sf) var4).field_D) {
                L17: {
                  if (!((le) this).field_l.a(true)) {
                    var4 = (Object) (Object) ((le) this).field_l.a(true, (byte) 2, true, ((le) this).field_x, param1);
                    ((le) this).field_G.a((long)param1, param2 ^ 19, (bh) var4);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (sf) (Object) stackIn_60_0;
          }
        } else {
          return null;
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 32085) {
            le.b(false);
        }
        return 500 * ((-1 + param1) * param1);
    }

    final static void a(byte param0, int param1) {
        dk.field_i = param1 * 100 / 150;
        dk.field_c = (param1 << -367606192) / 150;
        dk.field_g = param1 * 400 / 150;
        int var2 = 101 % ((8 - param0) / 52);
    }

    final void c(boolean param0) {
        sf var2 = null;
        int var2_int = 0;
        bh var3 = null;
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        bh var7 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            ((le) this).c(false);
            break L0;
          }
        }
        L1: {
          if (null == ((le) this).field_J) {
            break L1;
          } else {
            if (null == ((le) this).a(param0)) {
              return;
            } else {
              if (!((le) this).field_u) {
                if (((le) this).field_B) {
                  var2_int = 1;
                  var3 = ((le) this).field_J.c((byte) 77);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (((le) this).field_j >= ((le) this).field_I.field_B.length) {
                            break L4;
                          } else {
                            L5: {
                              if (((le) this).field_I.field_B[((le) this).field_j] == 0) {
                                break L5;
                              } else {
                                if (((le) this).field_l.b(0)) {
                                  var2_int = 0;
                                  break L4;
                                } else {
                                  L6: {
                                    if (((le) this).field_F[((le) this).field_j] != 1) {
                                      sf discarded$4 = this.a(2, ((le) this).field_j, (byte) -20);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  if (1 == ((le) this).field_F[((le) this).field_j]) {
                                    break L5;
                                  } else {
                                    var7 = new bh();
                                    var7.field_i = (long)((le) this).field_j;
                                    ((le) this).field_J.a(var7, 2777);
                                    var2_int = 0;
                                    break L5;
                                  }
                                }
                              }
                            }
                            ((le) this).field_j = ((le) this).field_j + 1;
                            continue L3;
                          }
                        }
                        if (var2_int != 0) {
                          ((le) this).field_j = 0;
                          ((le) this).field_B = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_i;
                        if (1 == ((le) this).field_F[var4]) {
                          break L7;
                        } else {
                          sf discarded$5 = this.a(2, var4, (byte) -20);
                          break L7;
                        }
                      }
                      L8: {
                        if (-2 != (((le) this).field_F[var4] ^ -1)) {
                          var2_int = 0;
                          break L8;
                        } else {
                          var3.b((byte) 102);
                          break L8;
                        }
                      }
                      var3 = ((le) this).field_J.d(true);
                      continue L2;
                    }
                  }
                } else {
                  ((le) this).field_J = null;
                  break L1;
                }
              } else {
                var2_int = 1;
                var3 = ((le) this).field_J.c((byte) 54);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (((le) this).field_j >= ((le) this).field_I.field_B.length) {
                          break L11;
                        } else {
                          L12: {
                            if (0 == ((le) this).field_I.field_B[((le) this).field_j]) {
                              break L12;
                            } else {
                              if (((le) this).field_v.field_b < 250) {
                                L13: {
                                  if (((le) this).field_F[((le) this).field_j] != 0) {
                                    break L13;
                                  } else {
                                    sf discarded$6 = this.a(1, ((le) this).field_j, (byte) -20);
                                    break L13;
                                  }
                                }
                                if (0 != ((le) this).field_F[((le) this).field_j]) {
                                  break L12;
                                } else {
                                  var6 = new bh();
                                  var6.field_i = (long)((le) this).field_j;
                                  ((le) this).field_J.a(var6, 2777);
                                  var2_int = 0;
                                  break L12;
                                }
                              } else {
                                var2_int = 0;
                                break L11;
                              }
                            }
                          }
                          ((le) this).field_j = ((le) this).field_j + 1;
                          continue L10;
                        }
                      }
                      if (var2_int == 0) {
                        break L1;
                      } else {
                        ((le) this).field_j = 0;
                        ((le) this).field_u = false;
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_i;
                      if (-1 == (((le) this).field_F[var4] ^ -1)) {
                        sf discarded$7 = this.a(1, var4, (byte) -20);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (((le) this).field_F[var4] != 0) {
                        var3.b((byte) 121);
                        break L15;
                      } else {
                        var2_int = 0;
                        break L15;
                      }
                    }
                    var3 = ((le) this).field_J.d(true);
                    continue L9;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (!((le) this).field_C) {
            break L16;
          } else {
            if ((ik.a(4) ^ -1L) > (((le) this).field_A ^ -1L)) {
              break L16;
            } else {
              var2 = (sf) (Object) ((le) this).field_G.a((byte) 126);
              L17: while (true) {
                if (var2 == null) {
                  ((le) this).field_A = ik.a(4) + 1000L;
                  break L16;
                } else {
                  L18: {
                    if (var2.field_z) {
                      break L18;
                    } else {
                      if (var2.field_A) {
                        if (!var2.field_D) {
                          throw new RuntimeException();
                        } else {
                          var2.b((byte) 101);
                          break L18;
                        }
                      } else {
                        var2.field_A = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (sf) (Object) ((le) this).field_G.b((byte) 107);
                  continue L17;
                }
              }
            }
          }
        }
    }

    final byte[] a(int param0, byte param1) {
        sf var3 = this.a(0, param0, (byte) -20);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g((byte) 126);
        var3.b((byte) 107);
        if (param1 != 91) {
            return null;
        }
        return var4;
    }

    le(int param0, kh param1, kh param2, dd param3, im param4, int param5, byte[] param6, int param7, boolean param8) {
        ((le) this).field_G = new ng(16);
        ((le) this).field_j = 0;
        ((le) this).field_k = new vj();
        ((le) this).field_A = 0L;
        ((le) this).field_w = param1;
        ((le) this).field_x = param0;
        if (null == ((le) this).field_w) {
            ((le) this).field_u = false;
        } else {
            ((le) this).field_u = true;
            ((le) this).field_J = new vj();
        }
        ((le) this).field_q = param5;
        ((le) this).field_l = param3;
        ((le) this).field_C = param8 ? true : false;
        ((le) this).field_z = param6;
        ((le) this).field_H = param2;
        ((le) this).field_n = param7;
        ((le) this).field_v = param4;
        if (null != ((le) this).field_H) {
            ((le) this).field_p = (sf) (Object) ((le) this).field_v.a(((le) this).field_x, ((le) this).field_H, -36);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "No highscores";
        field_o = new tb();
    }
}

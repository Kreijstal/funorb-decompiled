/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends lh {
    static int[] field_p;
    private int field_u;
    static int[] field_M;
    private int field_k;
    static String field_w;
    static int field_j;
    static int field_l;
    private ad field_z;
    static String field_L;
    private bm field_G;
    static String field_K;
    private byte[] field_E;
    private int field_y;
    static String field_I;
    static String field_v;
    private np field_t;
    static int field_m;
    private no field_r;
    private np field_n;
    private rn field_D;
    static String field_J;
    private gr field_H;
    private byte[] field_o;
    private int field_x;
    private boolean field_B;
    private boolean field_C;
    private ko field_q;
    private ko field_s;
    private long field_F;
    private boolean field_A;

    final void c(int param0) {
        ma var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var4 = Pool.field_O;
        if (((up) this).field_s != null) {
          if (((up) this).b((byte) -21) == null) {
            return;
          } else {
            var2 = ((up) this).field_q.c((byte) 111);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_c;
                    stackOut_7_0 = 0;
                    stackOut_7_1 = var3;
                    stackIn_25_0 = stackOut_7_0;
                    stackIn_25_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_8_0 > stackIn_8_1) {
                              break L5;
                            } else {
                              if (var3 >= ((up) this).field_z.field_d) {
                                break L5;
                              } else {
                                if (((up) this).field_z.field_s[var3] != 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var2.a((byte) -117);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (((up) this).field_E[var3] == 0) {
                            gr discarded$6 = this.a(var3, 1, (byte) 25);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if ((((up) this).field_E[var3] ^ -1) == 0) {
                            gr discarded$7 = this.a(var3, 2, (byte) 25);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (((up) this).field_E[var3] == 1) {
                          var2.a((byte) -117);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = ((up) this).field_q.f((byte) -5);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_24_0 = param0;
                stackOut_24_1 = 82;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L1;
              }
              L8: {
                if (stackIn_25_0 > stackIn_25_1) {
                  break L8;
                } else {
                  var5 = null;
                  String discarded$8 = up.a(false, (CharSequence) null, (byte) 71);
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (null == ((up) this).field_t) {
          return;
        } else {
          L0: {
            if (param0 >= 78) {
              break L0;
            } else {
              field_J = null;
              break L0;
            }
          }
          L1: {
            ((up) this).field_B = true;
            if (null == ((up) this).field_s) {
              ((up) this).field_s = new ko();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        gr var3 = null;
        L0: {
          if (param0 == -18600) {
            break L0;
          } else {
            byte[] discarded$2 = ((up) this).a(100, (byte) -43);
            break L0;
          }
        }
        var3 = (gr) (Object) ((up) this).field_G.a(false, (long)param1);
        if (var3 != null) {
          return var3.e(54);
        } else {
          return 0;
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_28_0 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_27_0 = 0;
        var8 = Pool.field_O;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (12 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = hq.a(91, param1);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L1;
                    } else {
                      L2: {
                        if (qd.a(0, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (qd.a(0, var4.charAt(var4.length() + -1))) {
                            break L2;
                          } else {
                            L3: {
                              var5 = 0;
                              if (param2 >= 96) {
                                break L3;
                              } else {
                                int discarded$2 = up.a(-125);
                                break L3;
                              }
                            }
                            var6 = 0;
                            L4: while (true) {
                              L5: {
                                L6: {
                                  if (param1.length() <= var6) {
                                    break L6;
                                  } else {
                                    var7 = param1.charAt(var6);
                                    stackOut_18_0 = qd.a(0, (char) var7);
                                    stackIn_28_0 = stackOut_18_0 ? 1 : 0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (var8 != 0) {
                                      break L5;
                                    } else {
                                      L7: {
                                        L8: {
                                          if (stackIn_19_0) {
                                            break L8;
                                          } else {
                                            var5 = 0;
                                            if (var8 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        var5++;
                                        break L7;
                                      }
                                      L9: {
                                        if (-3 < (var5 ^ -1)) {
                                          break L9;
                                        } else {
                                          if (!param0) {
                                            return oh.field_g;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var6++;
                                      if (var8 == 0) {
                                        continue L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                stackOut_27_0 = -1;
                                stackIn_28_0 = stackOut_27_0;
                                break L5;
                              }
                              if (stackIn_28_0 > (var5 ^ -1)) {
                                return lg.field_r;
                              } else {
                                return null;
                              }
                            }
                          }
                        }
                      }
                      return lg.field_r;
                    }
                  }
                }
                return gp.field_a;
              }
            }
          }
          return gp.field_a;
        } else {
          return gp.field_a;
        }
    }

    final static int a(int param0) {
        if (param0 != -21282) {
            return 111;
        }
        return (int)(1000000000L / oh.field_e);
    }

    final static dd[] a(dd[] param0, int param1) {
        int var2 = 0;
        dd var3 = null;
        int var4 = 0;
        dd[] stackIn_6_0 = null;
        dd[] stackIn_7_0 = null;
        dd[] stackOut_5_0 = null;
        var4 = Pool.field_O;
        if (param1 == 12519) {
          var2 = 0;
          L0: while (true) {
            if (param0.length > var2) {
              var3 = param0[var2];
              param0[var2].field_B = 0;
              var3.field_G = 0;
              param0[var2].field_w = param0[var2].field_z;
              stackOut_5_0 = (dd[]) param0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var4 == 0) {
                stackIn_7_0[var2].field_y = param0[var2].field_A;
                var2++;
                continue L0;
              } else {
                return stackIn_6_0;
              }
            } else {
              return param0;
            }
          }
        } else {
          return null;
        }
    }

    final ad b(byte param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = Pool.field_O;
        if (null == ((up) this).field_z) {
          L0: {
            if (null != ((up) this).field_H) {
              break L0;
            } else {
              if (!((up) this).field_r.b((byte) -125)) {
                ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((up) this).field_H.field_F) {
            var5 = ((up) this).field_H.b(false);
            var2 = var5;
            if (!(((up) this).field_H instanceof dg)) {
              if (var5 == null) {
                throw new RuntimeException();
              } else {
                L1: {
                  ((up) this).field_z = new ad(var5, ((up) this).field_y, ((up) this).field_o);
                  if (((up) this).field_n != null) {
                    dg discarded$1 = ((up) this).field_D.a(var5, ((up) this).field_n, (byte) -128, ((up) this).field_k);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 == -21) {
                    break L2;
                  } else {
                    up.a(false);
                    break L2;
                  }
                }
                L3: {
                  ((up) this).field_H = null;
                  if (((up) this).field_t == null) {
                    break L3;
                  } else {
                    ((up) this).field_E = new byte[((up) this).field_z.field_d];
                    break L3;
                  }
                }
                return ((up) this).field_z;
              }
            } else {
              if (var5 != null) {
                ((up) this).field_z = new ad(var5, ((up) this).field_y, ((up) this).field_o);
                if (((up) this).field_u != ((up) this).field_z.field_h) {
                  throw new RuntimeException();
                } else {
                  L4: {
                    if (param0 == -21) {
                      break L4;
                    } else {
                      up.a(false);
                      break L4;
                    }
                  }
                  L5: {
                    ((up) this).field_H = null;
                    if (((up) this).field_t == null) {
                      break L5;
                    } else {
                      ((up) this).field_E = new byte[((up) this).field_z.field_d];
                      break L5;
                    }
                  }
                  return ((up) this).field_z;
                }
              } else {
                throw new RuntimeException();
              }
            }
          } else {
            return null;
          }
        } else {
          return ((up) this).field_z;
        }
    }

    public static void a(boolean param0) {
        field_J = null;
        field_M = null;
        field_I = null;
        field_w = null;
        field_L = null;
        field_p = null;
        field_v = null;
        field_K = null;
        if (!param0) {
            field_w = null;
        }
    }

    private final gr a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        Object stackIn_104_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        Object stackOut_103_0 = null;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        var10 = Pool.field_O;
        var4 = (Object) (Object) (gr) (Object) ((up) this).field_G.a(false, (long)param0);
        if (param2 == 25) {
          L0: {
            if (var4 == null) {
              break L0;
            } else {
              if (param1 != 0) {
                break L0;
              } else {
                if (((gr) var4).field_x) {
                  break L0;
                } else {
                  if (!((gr) var4).field_F) {
                    break L0;
                  } else {
                    ((gr) var4).a((byte) -117);
                    var4 = null;
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
                L3: {
                  if (-1 == (param1 ^ -1)) {
                    break L3;
                  } else {
                    if (param1 == 1) {
                      if (((up) this).field_t != null) {
                        var4 = (Object) (Object) ((up) this).field_D.a((byte) 58, ((up) this).field_t, param0);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      if ((param1 ^ -1) == -3) {
                        if (((up) this).field_t == null) {
                          throw new RuntimeException();
                        } else {
                          if ((((up) this).field_E[param0] ^ -1) != 0) {
                            throw new RuntimeException();
                          } else {
                            if (!((up) this).field_r.a(param2 ^ 13)) {
                              var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, false, -154018400);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                return null;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                L4: {
                  if (null == ((up) this).field_t) {
                    break L4;
                  } else {
                    if ((((up) this).field_E[param0] ^ -1) != 0) {
                      var4 = (Object) (Object) ((up) this).field_D.a(121, ((up) this).field_t, param0);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((up) this).field_r.b((byte) -125)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, -154018400);
                  return null;
                }
              }
              ((up) this).field_G.a((byte) -114, (ma) var4, (long)param0);
              break L1;
            }
          }
          if (!((gr) var4).field_F) {
            var5 = ((gr) var4).b(false);
            if (var4 instanceof dg) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if ((var5.length ^ -1) < -3) {
                        oq.field_B.reset();
                        oq.field_B.update(var5, 0, -2 + var5.length);
                        var6_int = (int)oq.field_B.getValue();
                        if (var6_int == ((up) this).field_z.field_w[param0]) {
                          L7: {
                            L8: {
                              if (null == ((up) this).field_z.field_a) {
                                break L8;
                              } else {
                                if (null == ((up) this).field_z.field_a[param0]) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((up) this).field_z.field_a[param0];
                                  var8 = jr.a(-2 + var5.length, (byte) -83, var5, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_89_0 = var7_ref_byte__[var9] ^ -1;
                                      stackOut_89_1 = var8[var9] ^ -1;
                                      stackIn_94_0 = stackOut_89_0;
                                      stackIn_94_1 = stackOut_89_1;
                                      stackIn_90_0 = stackOut_89_0;
                                      stackIn_90_1 = stackOut_89_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_90_0 == stackIn_90_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_93_0 = var5[-1 + var5.length] & 255;
                            stackOut_93_1 = (255 & var5[-2 + var5.length]) << -1614229976;
                            stackIn_94_0 = stackOut_93_0;
                            stackIn_94_1 = stackOut_93_1;
                            break L7;
                          }
                          var7 = stackIn_94_0 + stackIn_94_1;
                          if (var7 == (((up) this).field_z.field_i[param0] & 65535)) {
                            L10: {
                              if (((up) this).field_E[param0] != 1) {
                                L11: {
                                  if (((up) this).field_E[param0] == 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((up) this).field_E[param0] = (byte) 1;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L12: {
                              if (!((gr) var4).field_x) {
                                ((gr) var4).a((byte) -117);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            stackOut_103_0 = var4;
                            stackIn_104_0 = stackOut_103_0;
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (Exception) (Object) decompiledCaughtException;
                ((up) this).field_E[param0] = (byte)-1;
                ((gr) var4).a((byte) -117);
                if (!((gr) var4).field_x) {
                  return null;
                } else {
                  L13: {
                    if (!((up) this).field_r.b((byte) -125)) {
                      var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, param2 ^ -154018375);
                      ((up) this).field_G.a((byte) -127, (ma) var4, (long)param0);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return null;
                }
              }
              return (gr) (Object) stackIn_104_0;
            } else {
              L14: {
                if (var5 == null) {
                  break L14;
                } else {
                  if (2 >= var5.length) {
                    break L14;
                  } else {
                    oq.field_B.reset();
                    oq.field_B.update(var5, 0, var5.length + -2);
                    var6_int = (int)oq.field_B.getValue();
                    if (var6_int == ((up) this).field_z.field_w[param0]) {
                      if (((up) this).field_z.field_a != null) {
                        if (null != ((up) this).field_z.field_a[param0]) {
                          var7_ref_byte__ = ((up) this).field_z.field_a[param0];
                          var8 = jr.a(var5.length + -2, (byte) -76, var5, 0);
                          var9 = 0;
                          L15: while (true) {
                            if (64 > var9) {
                              stackOut_68_0 = var7_ref_byte__[var9] ^ -1;
                              stackOut_68_1 = var8[var9] ^ -1;
                              stackIn_74_0 = stackOut_68_0;
                              stackIn_74_1 = stackOut_68_1;
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              if (var10 == 0) {
                                if (stackIn_74_0 != stackIn_74_1) {
                                  throw new RuntimeException();
                                } else {
                                  var9++;
                                  continue L15;
                                }
                              } else {
                                L16: {
                                  if (stackIn_69_0 == stackIn_69_1) {
                                    break L16;
                                  } else {
                                    ((up) this).field_E[param0] = (byte) 1;
                                    break L16;
                                  }
                                }
                                L17: {
                                  if (((gr) var4).field_x) {
                                    break L17;
                                  } else {
                                    ((gr) var4).a((byte) -117);
                                    break L17;
                                  }
                                }
                                return (gr) var4;
                              }
                            } else {
                              L18: {
                                ((up) this).field_r.field_e = 0;
                                ((up) this).field_r.field_a = 0;
                                var5[var5.length - 2] = (byte)(((up) this).field_z.field_i[param0] >>> -426587352);
                                var5[var5.length + -1] = (byte)((up) this).field_z.field_i[param0];
                                if (((up) this).field_t != null) {
                                  dg discarded$3 = ((up) this).field_D.a(var5, ((up) this).field_t, (byte) -98, param0);
                                  if ((((up) this).field_E[param0] ^ -1) == -2) {
                                    break L18;
                                  } else {
                                    ((up) this).field_E[param0] = (byte) 1;
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (((gr) var4).field_x) {
                                  break L19;
                                } else {
                                  ((gr) var4).a((byte) -117);
                                  break L19;
                                }
                              }
                              return (gr) var4;
                            }
                          }
                        } else {
                          L20: {
                            ((up) this).field_r.field_e = 0;
                            ((up) this).field_r.field_a = 0;
                            var5[var5.length - 2] = (byte)(((up) this).field_z.field_i[param0] >>> -426587352);
                            var5[var5.length + -1] = (byte)((up) this).field_z.field_i[param0];
                            if (((up) this).field_t != null) {
                              dg discarded$4 = ((up) this).field_D.a(var5, ((up) this).field_t, (byte) -98, param0);
                              if ((((up) this).field_E[param0] ^ -1) == -2) {
                                break L20;
                              } else {
                                ((up) this).field_E[param0] = (byte) 1;
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            if (((gr) var4).field_x) {
                              break L21;
                            } else {
                              ((gr) var4).a((byte) -117);
                              break L21;
                            }
                          }
                          return (gr) var4;
                        }
                      } else {
                        L22: {
                          ((up) this).field_r.field_e = 0;
                          ((up) this).field_r.field_a = 0;
                          var5[var5.length - 2] = (byte)(((up) this).field_z.field_i[param0] >>> -426587352);
                          var5[var5.length + -1] = (byte)((up) this).field_z.field_i[param0];
                          if (((up) this).field_t != null) {
                            dg discarded$5 = ((up) this).field_D.a(var5, ((up) this).field_t, (byte) -98, param0);
                            if ((((up) this).field_E[param0] ^ -1) == -2) {
                              break L22;
                            } else {
                              ((up) this).field_E[param0] = (byte) 1;
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (((gr) var4).field_x) {
                            break L23;
                          } else {
                            ((gr) var4).a((byte) -117);
                            break L23;
                          }
                        }
                        return (gr) var4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        gr var2 = null;
        ma var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        byte stackIn_38_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_69_0 = false;
        boolean stackIn_70_0 = false;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        byte stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_37_0 = 0;
        byte stackOut_37_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_68_0 = false;
        L0: {
          var5 = Pool.field_O;
          if (((up) this).field_s == null) {
            break L0;
          } else {
            if (null == ((up) this).b((byte) -21)) {
              return;
            } else {
              L1: {
                if (((up) this).field_C) {
                  break L1;
                } else {
                  L2: {
                    if (!((up) this).field_B) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((up) this).field_s.c((byte) -58);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              L7: {
                                L8: {
                                  if (var3 == null) {
                                    break L8;
                                  } else {
                                    var4 = (int)var3.field_c;
                                    stackOut_8_0 = ((up) this).field_E[var4];
                                    stackOut_8_1 = 1;
                                    stackIn_94_0 = stackOut_8_0;
                                    stackIn_94_1 = stackOut_8_1;
                                    stackIn_9_0 = stackOut_8_0;
                                    stackIn_9_1 = stackOut_8_1;
                                    if (var5 != 0) {
                                      L9: while (true) {
                                        if (stackIn_94_0 >= stackIn_94_1) {
                                          break L5;
                                        } else {
                                          stackOut_92_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                          stackIn_30_0 = stackOut_92_0;
                                          stackIn_93_0 = stackOut_92_0;
                                          if (var5 != 0) {
                                            break L4;
                                          } else {
                                            stackOut_93_0 = stackIn_93_0;
                                            stackIn_90_0 = stackOut_93_0;
                                            if (stackIn_90_0 == 0) {
                                              ((up) this).field_x = ((up) this).field_x + 1;
                                              if (var5 == 0) {
                                                stackOut_96_0 = ((up) this).field_x;
                                                stackOut_96_1 = ((up) this).field_z.field_s.length;
                                                stackIn_94_0 = stackOut_96_0;
                                                stackIn_94_1 = stackOut_96_1;
                                                continue L9;
                                              } else {
                                                break L6;
                                              }
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L10: {
                                        if (stackIn_9_0 == stackIn_9_1) {
                                          break L10;
                                        } else {
                                          gr discarded$4 = this.a(var4, 2, (byte) 25);
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        L12: {
                                          if ((((up) this).field_E[var4] ^ -1) == -2) {
                                            break L12;
                                          } else {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var3.a((byte) -117);
                                        break L11;
                                      }
                                      var3 = ((up) this).field_s.f((byte) -5);
                                      if (var5 == 0) {
                                        continue L3;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L13: while (true) {
                                  if (((up) this).field_x >= ((up) this).field_z.field_s.length) {
                                    break L5;
                                  } else {
                                    stackOut_17_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                    stackIn_30_0 = stackOut_17_0;
                                    stackIn_18_0 = stackOut_17_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      if (stackIn_18_0 == 0) {
                                        ((up) this).field_x = ((up) this).field_x + 1;
                                        if (var5 == 0) {
                                          continue L13;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              break L6;
                            }
                            L14: {
                              if (((up) this).field_r.a(20)) {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if (((up) this).field_E[((up) this).field_x] == 1) {
                                break L15;
                              } else {
                                gr discarded$5 = this.a(((up) this).field_x, 2, (byte) 25);
                                break L15;
                              }
                            }
                            L16: {
                              if (((up) this).field_E[((up) this).field_x] == 1) {
                                break L16;
                              } else {
                                var3 = new ma();
                                var3.field_c = (long)((up) this).field_x;
                                var2_int = 0;
                                ((up) this).field_s.b((byte) 96, var3);
                                break L16;
                              }
                            }
                            ((up) this).field_x = ((up) this).field_x + 1;
                            break L5;
                          }
                          stackOut_29_0 = var2_int;
                          stackIn_30_0 = stackOut_29_0;
                          break L4;
                        }
                        L17: {
                          if (stackIn_30_0 != 0) {
                            ((up) this).field_B = false;
                            ((up) this).field_x = 0;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((up) this).field_s = null;
                  break L1;
                }
              }
              var2_int = 1;
              var3 = ((up) this).field_s.c((byte) 78);
              L18: while (true) {
                L19: {
                  L20: {
                    L21: {
                      L22: {
                        L23: {
                          if (var3 == null) {
                            break L23;
                          } else {
                            var4 = (int)var3.field_c;
                            stackOut_37_0 = 0;
                            stackOut_37_1 = ((up) this).field_E[var4];
                            stackIn_85_0 = stackOut_37_0;
                            stackIn_85_1 = stackOut_37_1;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            if (var5 != 0) {
                              L24: while (true) {
                                if (stackIn_85_0 >= stackIn_85_1) {
                                  break L20;
                                } else {
                                  stackOut_83_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                  stackIn_59_0 = stackOut_83_0;
                                  stackIn_84_0 = stackOut_83_0;
                                  if (var5 != 0) {
                                    break L19;
                                  } else {
                                    stackOut_84_0 = stackIn_84_0;
                                    stackIn_81_0 = stackOut_84_0;
                                    if (stackIn_81_0 != 0) {
                                      break L21;
                                    } else {
                                      ((up) this).field_x = ((up) this).field_x + 1;
                                      if (var5 == 0) {
                                        stackOut_87_0 = ((up) this).field_x;
                                        stackOut_87_1 = ((up) this).field_z.field_s.length;
                                        stackIn_85_0 = stackOut_87_0;
                                        stackIn_85_1 = stackOut_87_1;
                                        continue L24;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L25: {
                                if (stackIn_38_0 != stackIn_38_1) {
                                  break L25;
                                } else {
                                  gr discarded$6 = this.a(var4, 1, (byte) 25);
                                  break L25;
                                }
                              }
                              L26: {
                                L27: {
                                  if (-1 != (((up) this).field_E[var4] ^ -1)) {
                                    break L27;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var3.a((byte) -117);
                                break L26;
                              }
                              var3 = ((up) this).field_s.f((byte) -5);
                              if (var5 == 0) {
                                continue L18;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        L28: while (true) {
                          if (((up) this).field_x >= ((up) this).field_z.field_s.length) {
                            break L20;
                          } else {
                            stackOut_46_0 = ((up) this).field_z.field_s[((up) this).field_x];
                            stackIn_59_0 = stackOut_46_0;
                            stackIn_47_0 = stackOut_46_0;
                            if (var5 != 0) {
                              break L19;
                            } else {
                              if (stackIn_47_0 != 0) {
                                break L21;
                              } else {
                                ((up) this).field_x = ((up) this).field_x + 1;
                                if (var5 == 0) {
                                  continue L28;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L21;
                    }
                    L29: {
                      if (((up) this).field_D.field_e >= 250) {
                        var2_int = 0;
                        if (var5 == 0) {
                          break L20;
                        } else {
                          break L29;
                        }
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (((up) this).field_E[((up) this).field_x] != 0) {
                        break L30;
                      } else {
                        gr discarded$7 = this.a(((up) this).field_x, 1, (byte) 25);
                        break L30;
                      }
                    }
                    L31: {
                      if (((up) this).field_E[((up) this).field_x] != 0) {
                        break L31;
                      } else {
                        var3 = new ma();
                        var3.field_c = (long)((up) this).field_x;
                        ((up) this).field_s.b((byte) -64, var3);
                        var2_int = 0;
                        break L31;
                      }
                    }
                    ((up) this).field_x = ((up) this).field_x + 1;
                    break L20;
                  }
                  stackOut_58_0 = var2_int;
                  stackIn_59_0 = stackOut_58_0;
                  break L19;
                }
                if (stackIn_59_0 == 0) {
                  break L0;
                } else {
                  ((up) this).field_C = false;
                  ((up) this).field_x = 0;
                  break L0;
                }
              }
            }
          }
        }
        if (((up) this).field_A) {
          if ((rl.a((byte) -124) ^ -1L) <= (((up) this).field_F ^ -1L)) {
            var2 = (gr) (Object) ((up) this).field_G.a(0);
            L32: while (true) {
              if (var2 != null) {
                stackOut_68_0 = var2.field_F;
                stackIn_70_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (var5 == 0) {
                  L33: {
                    if (stackIn_70_0) {
                      break L33;
                    } else {
                      L34: {
                        if (!var2.field_C) {
                          break L34;
                        } else {
                          if (!var2.field_x) {
                            throw new RuntimeException();
                          } else {
                            var2.a((byte) -117);
                            if (var5 == 0) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                      var2.field_C = true;
                      break L33;
                    }
                  }
                  var2 = (gr) (Object) ((up) this).field_G.b(-1);
                  continue L32;
                } else {
                  var2_int = stackIn_69_0 ? 1 : 0;
                  return;
                }
              } else {
                ((up) this).field_F = rl.a((byte) -107) + 1000L;
                var2_int = 86 % ((param0 - 82) / 40);
                return;
              }
            }
          } else {
            var2_int = 86 % ((param0 - 82) / 40);
            return;
          }
        } else {
          var2_int = 86 % ((param0 - 82) / 40);
          return;
        }
    }

    final byte[] a(int param0, byte param1) {
        gr var3 = null;
        byte[] var4 = null;
        var3 = this.a(param0, 0, (byte) 25);
        if (var3 != null) {
          if (param1 != 19) {
            return null;
          } else {
            var4 = var3.b(false);
            var3.a((byte) -117);
            return var4;
          }
        } else {
          return null;
        }
    }

    up(int param0, np param1, np param2, no param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((up) this).field_G = new bm(16);
            ((up) this).field_x = 0;
            ((up) this).field_q = new ko();
            ((up) this).field_F = 0L;
            ((up) this).field_k = param0;
            ((up) this).field_t = param1;
            if (null != ((up) this).field_t) {
              break L1;
            } else {
              ((up) this).field_C = false;
              if (Pool.field_O == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((up) this).field_C = true;
          ((up) this).field_s = new ko();
          break L0;
        }
        L2: {
          ((up) this).field_o = param6;
          ((up) this).field_n = param2;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((up) this).field_A = stackIn_6_1 != 0;
          ((up) this).field_y = param5;
          ((up) this).field_u = param7;
          ((up) this).field_r = param3;
          ((up) this).field_D = param4;
          if (((up) this).field_n == null) {
            break L3;
          } else {
            ((up) this).field_H = (gr) (Object) ((up) this).field_D.a(92, ((up) this).field_n, ((up) this).field_k);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[7];
        field_K = "The invitation has been withdrawn.";
        field_v = "Sound: ";
        field_I = "<%0> has joined your game.";
        field_L = "Press and hold the <img=0> on the cue ball to move it.";
        field_m = -1;
        field_w = "OVER <%0>";
        field_J = "Rematch";
    }
}

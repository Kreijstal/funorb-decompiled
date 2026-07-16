/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends wf {
    private gi field_h;
    static String field_z;
    private int field_A;
    private int field_g;
    private int field_E;
    static String field_l;
    private byte[] field_w;
    static int field_y;
    static pb field_s;
    private gi field_j;
    private ki field_o;
    private byte[] field_B;
    private rk field_r;
    static boolean[] field_x;
    private uh field_f;
    static java.awt.Image field_C;
    private lh field_k;
    static String field_p;
    private fb field_q;
    private int field_m;
    private oj field_v;
    private boolean field_t;
    private oj field_u;
    private boolean field_i;
    private long field_D;
    private boolean field_n;

    private final ki a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        Object stackOut_59_0 = null;
        L0: {
          var10 = stellarshard.field_B;
          if (param0 == -28529) {
            break L0;
          } else {
            ((wc) this).field_f = null;
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (ki) (Object) ((wc) this).field_f.a((long)param1, param0 + 28538);
          if (var4 == null) {
            break L1;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L1;
            } else {
              if (((ki) var4).field_u) {
                break L1;
              } else {
                if (!((ki) var4).field_w) {
                  break L1;
                } else {
                  ((ki) var4).c(20);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 == null) {
            L3: {
              L4: {
                if (param2 != 0) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      if (null == ((wc) this).field_h) {
                        break L6;
                      } else {
                        if (0 != (((wc) this).field_B[param1] ^ -1)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (!((wc) this).field_q.d(2)) {
                      var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, true, ((wc) this).field_g, true);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    } else {
                      return null;
                    }
                  }
                  var4 = (Object) (Object) ((wc) this).field_r.a(((wc) this).field_h, (byte) 90, param1);
                  break L4;
                }
              }
              L7: {
                if (param2 != 1) {
                  break L7;
                } else {
                  if (null != ((wc) this).field_h) {
                    var4 = (Object) (Object) ((wc) this).field_r.a(((wc) this).field_h, 3, param1);
                    break L7;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              if ((param2 ^ -1) == -3) {
                if (((wc) this).field_h == null) {
                  throw new RuntimeException();
                } else {
                  if (0 == (((wc) this).field_B[param1] ^ -1)) {
                    if (!((wc) this).field_q.e(-88)) {
                      var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, false, ((wc) this).field_g, true);
                      break L3;
                    } else {
                      return null;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                throw new RuntimeException();
              }
            }
            ((wc) this).field_f.a((gg) var4, (long)param1, 1);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((ki) var4).field_w) {
          var5 = ((ki) var4).g(-27203);
          if (!(var4 instanceof el)) {
            L8: {
              if (var5 == null) {
                break L8;
              } else {
                if (2 < var5.length) {
                  nj.field_q.reset();
                  nj.field_q.update(var5, 0, var5.length + -2);
                  var6 = (int)nj.field_q.getValue();
                  if (var6 != ((wc) this).field_k.field_l[param1]) {
                    throw new RuntimeException();
                  } else {
                    if (null != ((wc) this).field_k.field_h) {
                      if (null != ((wc) this).field_k.field_h[param1]) {
                        var7 = ((wc) this).field_k.field_h[param1];
                        var8 = bc.a(param0 + 28529, 0, var5.length + -2, var5);
                        var9 = 0;
                        L9: while (true) {
                          if (var9 < 64) {
                            stackOut_95_0 = var8[var9] ^ -1;
                            stackOut_95_1 = var7[var9] ^ -1;
                            stackIn_101_0 = stackOut_95_0;
                            stackIn_101_1 = stackOut_95_1;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            if (var10 == 0) {
                              if (stackIn_101_0 != stackIn_101_1) {
                                throw new RuntimeException();
                              } else {
                                var9++;
                                continue L9;
                              }
                            } else {
                              L10: {
                                if (stackIn_96_0 == stackIn_96_1) {
                                  break L10;
                                } else {
                                  ((wc) this).field_B[param1] = (byte) 1;
                                  break L10;
                                }
                              }
                              L11: {
                                if (((ki) var4).field_u) {
                                  break L11;
                                } else {
                                  ((ki) var4).c(20);
                                  break L11;
                                }
                              }
                              return (ki) var4;
                            }
                          } else {
                            ((wc) this).field_q.field_i = 0;
                            ((wc) this).field_q.field_g = 0;
                            L12: {
                              var5[-2 + var5.length] = (byte)(((wc) this).field_k.field_j[param1] >>> -1051771352);
                              var5[-1 + var5.length] = (byte)((wc) this).field_k.field_j[param1];
                              if (null == ((wc) this).field_h) {
                                break L12;
                              } else {
                                el discarded$3 = ((wc) this).field_r.a(((wc) this).field_h, -115, param1, var5);
                                stackOut_89_0 = ((wc) this).field_B[param1] ^ -1;
                                stackOut_89_1 = -2;
                                stackIn_90_0 = stackOut_89_0;
                                stackIn_90_1 = stackOut_89_1;
                                if (stackIn_90_0 == stackIn_90_1) {
                                  break L12;
                                } else {
                                  ((wc) this).field_B[param1] = (byte) 1;
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              if (((ki) var4).field_u) {
                                break L13;
                              } else {
                                ((ki) var4).c(20);
                                break L13;
                              }
                            }
                            return (ki) var4;
                          }
                        }
                      } else {
                        ((wc) this).field_q.field_i = 0;
                        ((wc) this).field_q.field_g = 0;
                        L14: {
                          var5[-2 + var5.length] = (byte)(((wc) this).field_k.field_j[param1] >>> -1051771352);
                          var5[-1 + var5.length] = (byte)((wc) this).field_k.field_j[param1];
                          if (null == ((wc) this).field_h) {
                            break L14;
                          } else {
                            el discarded$4 = ((wc) this).field_r.a(((wc) this).field_h, -115, param1, var5);
                            stackOut_107_0 = ((wc) this).field_B[param1] ^ -1;
                            stackOut_107_1 = -2;
                            stackIn_108_0 = stackOut_107_0;
                            stackIn_108_1 = stackOut_107_1;
                            if (stackIn_108_0 == stackIn_108_1) {
                              break L14;
                            } else {
                              ((wc) this).field_B[param1] = (byte) 1;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (((ki) var4).field_u) {
                            break L15;
                          } else {
                            ((ki) var4).c(20);
                            break L15;
                          }
                        }
                        return (ki) var4;
                      }
                    } else {
                      ((wc) this).field_q.field_i = 0;
                      ((wc) this).field_q.field_g = 0;
                      L16: {
                        var5[-2 + var5.length] = (byte)(((wc) this).field_k.field_j[param1] >>> -1051771352);
                        var5[-1 + var5.length] = (byte)((wc) this).field_k.field_j[param1];
                        if (null == ((wc) this).field_h) {
                          break L16;
                        } else {
                          el discarded$5 = ((wc) this).field_r.a(((wc) this).field_h, -115, param1, var5);
                          stackOut_77_0 = ((wc) this).field_B[param1] ^ -1;
                          stackOut_77_1 = -2;
                          stackIn_78_0 = stackOut_77_0;
                          stackIn_78_1 = stackOut_77_1;
                          if (stackIn_78_0 == stackIn_78_1) {
                            break L16;
                          } else {
                            ((wc) this).field_B[param1] = (byte) 1;
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (((ki) var4).field_u) {
                          break L17;
                        } else {
                          ((ki) var4).c(20);
                          break L17;
                        }
                      }
                      return (ki) var4;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L18: {
                L19: {
                  if (var5 == null) {
                    break L19;
                  } else {
                    if (-3 <= (var5.length ^ -1)) {
                      break L19;
                    } else {
                      nj.field_q.reset();
                      nj.field_q.update(var5, 0, -2 + var5.length);
                      var6 = (int)nj.field_q.getValue();
                      if (var6 == ((wc) this).field_k.field_l[param1]) {
                        L20: {
                          L21: {
                            if (((wc) this).field_k.field_h == null) {
                              break L21;
                            } else {
                              if (((wc) this).field_k.field_h[param1] != null) {
                                var7 = ((wc) this).field_k.field_h[param1];
                                var8 = bc.a(0, 0, -2 + var5.length, var5);
                                var9 = 0;
                                L22: while (true) {
                                  if (var9 >= 64) {
                                    break L21;
                                  } else {
                                    stackOut_46_0 = var7[var9] ^ -1;
                                    stackOut_46_1 = var8[var9] ^ -1;
                                    stackIn_51_0 = stackOut_46_0;
                                    stackIn_51_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      break L20;
                                    } else {
                                      if (stackIn_47_0 == stackIn_47_1) {
                                        var9++;
                                        continue L22;
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                          stackOut_50_0 = 65280 & var5[-2 + var5.length] << 88294888;
                          stackOut_50_1 = -(var5[var5.length + -1] & 255);
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L20;
                        }
                        var7_int = stackIn_51_0 - stackIn_51_1;
                        if (var7_int == (65535 & ((wc) this).field_k.field_j[param1])) {
                          L23: {
                            if ((((wc) this).field_B[param1] ^ -1) == -2) {
                              break L23;
                            } else {
                              L24: {
                                if (((wc) this).field_B[param1] != 0) {
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              ((wc) this).field_B[param1] = (byte) 1;
                              break L23;
                            }
                          }
                          L25: {
                            if (((ki) var4).field_u) {
                              break L25;
                            } else {
                              ((ki) var4).c(20);
                              break L25;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L18;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((wc) this).field_B[param1] = (byte)-1;
              ((ki) var4).c(20);
              if (((ki) var4).field_u) {
                if (((wc) this).field_q.d(2)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, true, ((wc) this).field_g, true);
                  ((wc) this).field_f.a((gg) var4, (long)param1, 1);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (ki) (Object) stackIn_60_0;
          }
        } else {
          return null;
        }
    }

    final void c(int param0) {
        gg var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = stellarshard.field_B;
        if (((wc) this).field_v != null) {
          if (null != ((wc) this).a(-100)) {
            L0: {
              if (param0 == 13596) {
                break L0;
              } else {
                ((wc) this).field_j = null;
                break L0;
              }
            }
            var2 = ((wc) this).field_u.b(-84);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_j;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (-1 < (var3 ^ -1)) {
                            break L5;
                          } else {
                            if ((var3 ^ -1) <= (((wc) this).field_k.field_e ^ -1)) {
                              break L5;
                            } else {
                              if (-1 != (((wc) this).field_k.field_p[var3] ^ -1)) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.c(20);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (0 != ((wc) this).field_B[var3]) {
                          break L6;
                        } else {
                          ki discarded$4 = this.a(-28529, var3, 1);
                          break L6;
                        }
                      }
                      L7: {
                        if (((wc) this).field_B[var3] != -1) {
                          break L7;
                        } else {
                          ki discarded$5 = this.a(-28529, var3, 2);
                          break L7;
                        }
                      }
                      if (-2 != (((wc) this).field_B[var3] ^ -1)) {
                        break L3;
                      } else {
                        var2.c(20);
                        break L3;
                      }
                    }
                    var2 = ((wc) this).field_u.b((byte) 65);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final lh a(int param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = stellarshard.field_B;
        if (null == ((wc) this).field_k) {
          L0: {
            if (((wc) this).field_o != null) {
              break L0;
            } else {
              if (!((wc) this).field_q.d(2)) {
                ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((wc) this).field_o.field_w) {
            var5 = ((wc) this).field_o.g(-27203);
            var2 = var5;
            if (!(((wc) this).field_o instanceof el)) {
              if (var5 == null) {
                throw new RuntimeException();
              } else {
                L1: {
                  ((wc) this).field_k = new lh(var5, ((wc) this).field_A, ((wc) this).field_w);
                  if (((wc) this).field_j == null) {
                    break L1;
                  } else {
                    el discarded$1 = ((wc) this).field_r.a(((wc) this).field_j, 106, ((wc) this).field_g, var5);
                    break L1;
                  }
                }
                L2: {
                  ((wc) this).field_o = null;
                  if (param0 <= -8) {
                    break L2;
                  } else {
                    wc.a(false);
                    break L2;
                  }
                }
                L3: {
                  if (null != ((wc) this).field_h) {
                    ((wc) this).field_B = new byte[((wc) this).field_k.field_e];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return ((wc) this).field_k;
              }
            } else {
              if (var5 != null) {
                ((wc) this).field_k = new lh(var5, ((wc) this).field_A, ((wc) this).field_w);
                if (((wc) this).field_k.field_r != ((wc) this).field_E) {
                  throw new RuntimeException();
                } else {
                  L4: {
                    ((wc) this).field_o = null;
                    if (param0 <= -8) {
                      break L4;
                    } else {
                      wc.a(false);
                      break L4;
                    }
                  }
                  L5: {
                    if (null != ((wc) this).field_h) {
                      ((wc) this).field_B = new byte[((wc) this).field_k.field_e];
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return ((wc) this).field_k;
                }
              } else {
                throw new RuntimeException();
              }
            }
          } else {
            return null;
          }
        } else {
          return ((wc) this).field_k;
        }
    }

    final void d(int param0) {
        if (((wc) this).field_h == null) {
          return;
        } else {
          L0: {
            ((wc) this).field_i = true;
            if (null != ((wc) this).field_v) {
              break L0;
            } else {
              ((wc) this).field_v = new oj();
              break L0;
            }
          }
          L1: {
            if (param0 == 2) {
              break L1;
            } else {
              ((wc) this).d(49);
              break L1;
            }
          }
          return;
        }
    }

    final byte[] a(byte param0, int param1) {
        ki var3 = null;
        byte[] var4 = null;
        var3 = this.a(-28529, param1, 0);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            var4 = var3.g(-27203);
            var3.c(20);
            if (param0 == 35) {
              break L0;
            } else {
              ((wc) this).c(-36);
              break L0;
            }
          }
          return var4;
        }
    }

    final int a(int param0, int param1) {
        ki var3 = null;
        L0: {
          var3 = (ki) (Object) ((wc) this).field_f.a((long)param1, 36);
          if (param0 == 0) {
            break L0;
          } else {
            ((wc) this).field_g = -63;
            break L0;
          }
        }
        if (var3 == null) {
          return 0;
        } else {
          return var3.a(true);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_s = null;
        }
        field_l = null;
        field_C = null;
        field_s = null;
        field_p = null;
        field_z = null;
        field_x = null;
    }

    final void b(boolean param0) {
        int var2_int = 0;
        ki var2 = null;
        gg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        byte stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_36_0 = 0;
        byte stackOut_36_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_57_0 = 0;
        L0: {
          var5 = stellarshard.field_B;
          if (((wc) this).field_v == null) {
            break L0;
          } else {
            if (null != ((wc) this).a(-94)) {
              L1: {
                if (!((wc) this).field_t) {
                  break L1;
                } else {
                  var2_int = 1;
                  var3 = ((wc) this).field_v.b(-87);
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_j;
                                stackOut_6_0 = ((wc) this).field_B[var4] ^ -1;
                                stackOut_6_1 = -1;
                                stackIn_99_0 = stackOut_6_0;
                                stackIn_99_1 = stackOut_6_1;
                                stackIn_7_0 = stackOut_6_0;
                                stackIn_7_1 = stackOut_6_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_99_0 <= stackIn_99_1) {
                                      break L4;
                                    } else {
                                      stackOut_97_0 = ((wc) this).field_k.field_p[((wc) this).field_m];
                                      stackIn_30_0 = stackOut_97_0;
                                      stackIn_98_0 = stackOut_97_0;
                                      if (var5 != 0) {
                                        break L3;
                                      } else {
                                        stackOut_98_0 = stackIn_98_0;
                                        stackIn_95_0 = stackOut_98_0;
                                        if (stackIn_95_0 == 0) {
                                          ((wc) this).field_m = ((wc) this).field_m + 1;
                                          if (var5 == 0) {
                                            stackOut_101_0 = ((wc) this).field_k.field_p.length;
                                            stackOut_101_1 = ((wc) this).field_m;
                                            stackIn_99_0 = stackOut_101_0;
                                            stackIn_99_1 = stackOut_101_1;
                                            continue L8;
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L9: {
                                    if (stackIn_7_0 == stackIn_7_1) {
                                      ki discarded$4 = this.a(-28529, var4, 1);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    L11: {
                                      if (((wc) this).field_B[var4] != 0) {
                                        break L11;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var3.c(20);
                                    break L10;
                                  }
                                  var3 = ((wc) this).field_v.b((byte) -113);
                                  if (var5 == 0) {
                                    continue L2;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L12: while (true) {
                              if (((wc) this).field_k.field_p.length <= ((wc) this).field_m) {
                                break L4;
                              } else {
                                stackOut_16_0 = ((wc) this).field_k.field_p[((wc) this).field_m];
                                stackIn_30_0 = stackOut_16_0;
                                stackIn_17_0 = stackOut_16_0;
                                if (var5 != 0) {
                                  break L3;
                                } else {
                                  if (stackIn_17_0 == 0) {
                                    ((wc) this).field_m = ((wc) this).field_m + 1;
                                    if (var5 == 0) {
                                      continue L12;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          break L5;
                        }
                        L13: {
                          if (250 <= ((wc) this).field_r.field_e) {
                            var2_int = 0;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (-1 != (((wc) this).field_B[((wc) this).field_m] ^ -1)) {
                            break L14;
                          } else {
                            ki discarded$5 = this.a(-28529, ((wc) this).field_m, 1);
                            break L14;
                          }
                        }
                        L15: {
                          if (0 == ((wc) this).field_B[((wc) this).field_m]) {
                            var3 = new gg();
                            var3.field_j = (long)((wc) this).field_m;
                            var2_int = 0;
                            ((wc) this).field_v.b(-93, var3);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        ((wc) this).field_m = ((wc) this).field_m + 1;
                        break L4;
                      }
                      stackOut_29_0 = var2_int;
                      stackIn_30_0 = stackOut_29_0;
                      break L3;
                    }
                    L16: {
                      if (stackIn_30_0 == 0) {
                        break L16;
                      } else {
                        ((wc) this).field_m = 0;
                        ((wc) this).field_t = false;
                        break L16;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L17: {
                if (!((wc) this).field_i) {
                  break L17;
                } else {
                  var2_int = 1;
                  var3 = ((wc) this).field_v.b(-125);
                  L18: while (true) {
                    L19: {
                      L20: {
                        L21: {
                          if (var3 == null) {
                            L22: while (true) {
                              if (((wc) this).field_m >= ((wc) this).field_k.field_p.length) {
                                break L20;
                              } else {
                                stackOut_46_0 = ((wc) this).field_k.field_p[((wc) this).field_m] ^ -1;
                                stackIn_58_0 = stackOut_46_0;
                                stackIn_47_0 = stackOut_46_0;
                                if (var5 != 0) {
                                  break L19;
                                } else {
                                  if (stackIn_47_0 == -1) {
                                    ((wc) this).field_m = ((wc) this).field_m + 1;
                                    continue L22;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          } else {
                            var4 = (int)var3.field_j;
                            stackOut_36_0 = -2;
                            stackOut_36_1 = ((wc) this).field_B[var4];
                            stackIn_90_0 = stackOut_36_0;
                            stackIn_90_1 = stackOut_36_1;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            if (var5 != 0) {
                              L23: while (true) {
                                if (stackIn_90_0 >= stackIn_90_1) {
                                  break L20;
                                } else {
                                  stackOut_88_0 = ((wc) this).field_k.field_p[((wc) this).field_m] ^ -1;
                                  stackIn_58_0 = stackOut_88_0;
                                  stackIn_89_0 = stackOut_88_0;
                                  if (var5 != 0) {
                                    break L19;
                                  } else {
                                    stackOut_89_0 = stackIn_89_0;
                                    stackIn_86_0 = stackOut_89_0;
                                    if (stackIn_86_0 == -1) {
                                      ((wc) this).field_m = ((wc) this).field_m + 1;
                                      stackOut_92_0 = ((wc) this).field_m;
                                      stackOut_92_1 = ((wc) this).field_k.field_p.length;
                                      stackIn_90_0 = stackOut_92_0;
                                      stackIn_90_1 = stackOut_92_1;
                                      continue L23;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              L24: {
                                if (stackIn_37_0 == stackIn_37_1) {
                                  break L24;
                                } else {
                                  ki discarded$6 = this.a(-28529, var4, 2);
                                  break L24;
                                }
                              }
                              L25: {
                                L26: {
                                  if (-2 != ((wc) this).field_B[var4]) {
                                    break L26;
                                  } else {
                                    var3.c(20);
                                    if (var5 == 0) {
                                      break L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L25;
                              }
                              var3 = ((wc) this).field_v.b((byte) -44);
                              continue L18;
                            }
                          }
                        }
                        L27: {
                          if (!((wc) this).field_q.e(-105)) {
                            break L27;
                          } else {
                            var2_int = 0;
                            if (var5 == 0) {
                              break L20;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if ((((wc) this).field_B[((wc) this).field_m] ^ -1) == -2) {
                            break L28;
                          } else {
                            ki discarded$7 = this.a(-28529, ((wc) this).field_m, 2);
                            break L28;
                          }
                        }
                        L29: {
                          if (((wc) this).field_B[((wc) this).field_m] == 1) {
                            break L29;
                          } else {
                            var3 = new gg();
                            var3.field_j = (long)((wc) this).field_m;
                            var2_int = 0;
                            ((wc) this).field_v.b(-80, var3);
                            break L29;
                          }
                        }
                        ((wc) this).field_m = ((wc) this).field_m + 1;
                        break L20;
                      }
                      stackOut_57_0 = var2_int;
                      stackIn_58_0 = stackOut_57_0;
                      break L19;
                    }
                    L30: {
                      if (stackIn_58_0 == 0) {
                        break L30;
                      } else {
                        ((wc) this).field_m = 0;
                        ((wc) this).field_i = false;
                        break L30;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              ((wc) this).field_v = null;
              break L0;
            } else {
              return;
            }
          }
        }
        if (!param0) {
          if (((wc) this).field_n) {
            if (ih.a((byte) -98) >= ((wc) this).field_D) {
              var2 = (ki) (Object) ((wc) this).field_f.a((byte) 104);
              L31: while (true) {
                if (var2 != null) {
                  if (var5 == 0) {
                    L32: {
                      L33: {
                        if (!var2.field_w) {
                          break L33;
                        } else {
                          if (var5 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L34: {
                        if (var2.field_y) {
                          break L34;
                        } else {
                          var2.field_y = true;
                          break L34;
                        }
                      }
                      if (var2.field_u) {
                        var2.c(20);
                        break L32;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                    var2 = (ki) (Object) ((wc) this).field_f.b((byte) 118);
                    continue L31;
                  } else {
                    return;
                  }
                } else {
                  ((wc) this).field_D = 1000L + ih.a((byte) -98);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    wc(int param0, gi param1, gi param2, fb param3, rk param4, int param5, byte[] param6, int param7, boolean param8) {
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
            ((wc) this).field_f = new uh(16);
            ((wc) this).field_m = 0;
            ((wc) this).field_u = new oj();
            ((wc) this).field_D = 0L;
            ((wc) this).field_g = param0;
            ((wc) this).field_h = param1;
            if (((wc) this).field_h == null) {
              break L1;
            } else {
              ((wc) this).field_t = true;
              ((wc) this).field_v = new oj();
              if (stellarshard.field_B == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((wc) this).field_t = false;
          break L0;
        }
        L2: {
          ((wc) this).field_E = param7;
          ((wc) this).field_A = param5;
          ((wc) this).field_j = param2;
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
          ((wc) this).field_n = stackIn_6_1 != 0;
          ((wc) this).field_w = param6;
          ((wc) this).field_q = param3;
          ((wc) this).field_r = param4;
          if (null == ((wc) this).field_j) {
            break L3;
          } else {
            ((wc) this).field_o = (ki) (Object) ((wc) this).field_r.a(((wc) this).field_j, (byte) 101, ((wc) this).field_g);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Quit to website";
        field_x = new boolean[64];
        field_l = " of 50<br>Current score : ";
        field_p = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}

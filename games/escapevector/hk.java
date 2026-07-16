/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ob {
    private byte[] field_f;
    private int field_p;
    static String[] field_r;
    private byte[] field_g;
    private int field_l;
    private f field_m;
    private int field_s;
    private sb field_t;
    private jg field_o;
    private oa field_y;
    private ib field_q;
    private kk field_k;
    private jg field_x;
    private boolean field_v;
    private cn field_e;
    private cn field_u;
    private boolean field_j;
    private int field_z;
    static int field_n;
    private long field_h;
    private boolean field_i;
    static te[] field_w;

    final void c(int param0) {
        oa var2 = null;
        int var2_int = 0;
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_31_0 = 0;
        byte stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        byte stackOut_8_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_48_0 = 0;
        byte stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_61_0 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          if (param0 < -21) {
            break L0;
          } else {
            byte[] discarded$5 = ((hk) this).a((byte) -107, 43);
            break L0;
          }
        }
        L1: {
          if (null == ((hk) this).field_u) {
            break L1;
          } else {
            if (null != ((hk) this).a(29192)) {
              L2: {
                if (!((hk) this).field_v) {
                  break L2;
                } else {
                  var2_int = 1;
                  var3 = ((hk) this).field_u.a(false);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              if (var3 == null) {
                                break L8;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_8_0 = ((hk) this).field_f[var4];
                                stackIn_99_0 = stackOut_8_0;
                                stackIn_9_0 = stackOut_8_0;
                                if (var5 != 0) {
                                  L9: while (true) {
                                    if (stackIn_99_0 <= ((hk) this).field_z) {
                                      break L5;
                                    } else {
                                      stackOut_97_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                                      stackIn_31_0 = stackOut_97_0;
                                      stackIn_98_0 = stackOut_97_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_98_0 = stackIn_98_0;
                                        stackIn_95_0 = stackOut_98_0;
                                        if (stackIn_95_0 == 0) {
                                          ((hk) this).field_z = ((hk) this).field_z + 1;
                                          if (var5 == 0) {
                                            stackOut_101_0 = ((hk) this).field_m.field_i.length;
                                            stackIn_99_0 = stackOut_101_0;
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
                                    if (stackIn_9_0 == 0) {
                                      oa discarded$6 = this.a(var4, 1, 23874);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    L12: {
                                      if (((hk) this).field_f[var4] != 0) {
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
                                    var3.c((byte) -53);
                                    break L11;
                                  }
                                  var3 = ((hk) this).field_u.b((byte) 70);
                                  if (var5 == 0) {
                                    continue L3;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L13: while (true) {
                              if (((hk) this).field_m.field_i.length <= ((hk) this).field_z) {
                                break L5;
                              } else {
                                stackOut_18_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                                stackIn_31_0 = stackOut_18_0;
                                stackIn_19_0 = stackOut_18_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  if (stackIn_19_0 == 0) {
                                    ((hk) this).field_z = ((hk) this).field_z + 1;
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
                          if (250 <= ((hk) this).field_k.field_f) {
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
                          if (0 != ((hk) this).field_f[((hk) this).field_z]) {
                            break L15;
                          } else {
                            oa discarded$7 = this.a(((hk) this).field_z, 1, 23874);
                            break L15;
                          }
                        }
                        L16: {
                          if (-1 != (((hk) this).field_f[((hk) this).field_z] ^ -1)) {
                            break L16;
                          } else {
                            var3 = new hg();
                            var3.field_e = (long)((hk) this).field_z;
                            ((hk) this).field_u.a(-12328, var3);
                            var2_int = 0;
                            break L16;
                          }
                        }
                        ((hk) this).field_z = ((hk) this).field_z + 1;
                        break L5;
                      }
                      stackOut_30_0 = var2_int;
                      stackIn_31_0 = stackOut_30_0;
                      break L4;
                    }
                    L17: {
                      if (stackIn_31_0 == 0) {
                        break L17;
                      } else {
                        ((hk) this).field_z = 0;
                        ((hk) this).field_v = false;
                        break L17;
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L18: {
                if (((hk) this).field_j) {
                  break L18;
                } else {
                  ((hk) this).field_u = null;
                  break L18;
                }
              }
              var2_int = 1;
              var3 = ((hk) this).field_u.a(false);
              L19: while (true) {
                L20: {
                  L21: {
                    L22: {
                      if (var3 == null) {
                        L23: while (true) {
                          if (((hk) this).field_z >= ((hk) this).field_m.field_i.length) {
                            break L21;
                          } else {
                            stackOut_48_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                            stackIn_62_0 = stackOut_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            if (var5 != 0) {
                              break L20;
                            } else {
                              if (stackIn_49_0 != 0) {
                                break L22;
                              } else {
                                ((hk) this).field_z = ((hk) this).field_z + 1;
                                continue L23;
                              }
                            }
                          }
                        }
                      } else {
                        var4 = (int)var3.field_e;
                        stackOut_38_0 = ((hk) this).field_f[var4];
                        stackOut_38_1 = -2;
                        stackIn_90_0 = stackOut_38_0;
                        stackIn_90_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (var5 != 0) {
                          L24: while (true) {
                            if (stackIn_90_0 >= stackIn_90_1) {
                              break L21;
                            } else {
                              stackOut_88_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                              stackIn_62_0 = stackOut_88_0;
                              stackIn_89_0 = stackOut_88_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                stackOut_89_0 = stackIn_89_0;
                                stackIn_86_0 = stackOut_89_0;
                                if (stackIn_86_0 != 0) {
                                  break L22;
                                } else {
                                  ((hk) this).field_z = ((hk) this).field_z + 1;
                                  stackOut_92_0 = ((hk) this).field_z;
                                  stackOut_92_1 = ((hk) this).field_m.field_i.length;
                                  stackIn_90_0 = stackOut_92_0;
                                  stackIn_90_1 = stackOut_92_1;
                                  continue L24;
                                }
                              }
                            }
                          }
                        } else {
                          L25: {
                            if (stackIn_39_0 == stackIn_39_1) {
                              break L25;
                            } else {
                              oa discarded$8 = this.a(var4, 2, 23874);
                              break L25;
                            }
                          }
                          L26: {
                            L27: {
                              if (-2 != ((hk) this).field_f[var4]) {
                                break L27;
                              } else {
                                var3.c((byte) -24);
                                if (var5 == 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var2_int = 0;
                            break L26;
                          }
                          var3 = ((hk) this).field_u.b((byte) 70);
                          continue L19;
                        }
                      }
                    }
                    L28: {
                      if (((hk) this).field_t.b(20)) {
                        var2_int = 0;
                        if (var5 == 0) {
                          break L21;
                        } else {
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if ((((hk) this).field_f[((hk) this).field_z] ^ -1) == -2) {
                        break L29;
                      } else {
                        oa discarded$9 = this.a(((hk) this).field_z, 2, 23874);
                        break L29;
                      }
                    }
                    L30: {
                      if (1 != ((hk) this).field_f[((hk) this).field_z]) {
                        var3 = new hg();
                        var3.field_e = (long)((hk) this).field_z;
                        var2_int = 0;
                        ((hk) this).field_u.a(-12328, var3);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    ((hk) this).field_z = ((hk) this).field_z + 1;
                    break L21;
                  }
                  stackOut_61_0 = var2_int;
                  stackIn_62_0 = stackOut_61_0;
                  break L20;
                }
                if (stackIn_62_0 == 0) {
                  break L1;
                } else {
                  ((hk) this).field_j = false;
                  ((hk) this).field_z = 0;
                  break L1;
                }
              }
            } else {
              return;
            }
          }
        }
        if (((hk) this).field_i) {
          if (td.b(128) >= ((hk) this).field_h) {
            var2 = (oa) (Object) ((hk) this).field_q.a(false);
            L31: while (true) {
              if (var2 != null) {
                if (var5 == 0) {
                  L32: {
                    L33: {
                      if (!var2.field_u) {
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
                      if (var2.field_s) {
                        break L34;
                      } else {
                        var2.field_s = true;
                        break L34;
                      }
                    }
                    if (!var2.field_r) {
                      throw new RuntimeException();
                    } else {
                      var2.c((byte) -117);
                      break L32;
                    }
                  }
                  var2 = (oa) (Object) ((hk) this).field_q.a((byte) 62);
                  continue L31;
                } else {
                  return;
                }
              } else {
                ((hk) this).field_h = td.b(128) + 1000L;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final byte[] a(byte param0, int param1) {
        oa var3 = null;
        byte[] var4 = null;
        var3 = this.a(param1, 0, 23874);
        if (var3 != null) {
          if (param0 > -9) {
            return null;
          } else {
            var4 = var3.a(true);
            var3.c((byte) -81);
            return var4;
          }
        } else {
          return null;
        }
    }

    final int a(int param0, int param1) {
        oa var3 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((hk) this).field_q = null;
            break L0;
          }
        }
        var3 = (oa) (Object) ((hk) this).field_q.a((long)param1, -1);
        if (var3 == null) {
          return 0;
        } else {
          return var3.g(100);
        }
    }

    final void b(byte param0) {
        if (!(null != ((hk) this).field_x)) {
            return;
        }
        int var2 = -123 / ((53 - param0) / 42);
        ((hk) this).field_j = true;
        if (null == ((hk) this).field_u) {
            ((hk) this).field_u = new cn();
        }
    }

    final static void b(int param0) {
        if (!bj.e((byte) 113)) {
            return;
        }
        if (!(he.field_u != null)) {
            return;
        }
        if (param0 != 2) {
            return;
        }
        if (!(he.field_u.b(0))) {
            return;
        }
        if (!he.field_u.a((byte) -119)) {
            return;
        }
        if (!(dd.field_h != null)) {
            dd.field_h = ci.a(5, 0, -1, 2);
            return;
        }
        if (!(dd.field_h.field_j != null)) {
            return;
        }
        ld.field_h = pn.a(dd.field_h.field_j, he.field_u, ld.field_h, bj.field_B, (byte) 112);
        if (se.field_b == null) {
            se.field_b = ve.a(1, he.field_u, fi.field_j, dd.field_h.field_j);
        }
        if (null != se.field_b) {
            dd.field_h = null;
            he.field_u = null;
        }
    }

    final f a(int param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = EscapeVector.field_A;
        if (((hk) this).field_m == null) {
          L0: {
            if (null == ((hk) this).field_y) {
              if (!((hk) this).field_t.c(20)) {
                ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((hk) this).field_y.field_u) {
            L1: {
              var5 = ((hk) this).field_y.a(true);
              var2 = var5;
              if (param0 == 29192) {
                break L1;
              } else {
                int discarded$2 = hk.a((byte) 93, -10, 70);
                break L1;
              }
            }
            L2: {
              if (((hk) this).field_y instanceof cm) {
                break L2;
              } else {
                if (var5 != null) {
                  ((hk) this).field_m = new f(var5, ((hk) this).field_p, ((hk) this).field_g);
                  if (((hk) this).field_o != null) {
                    cm discarded$3 = ((hk) this).field_k.a(var5, ((hk) this).field_s, param0 ^ 29194, ((hk) this).field_o);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L3: {
                        ((hk) this).field_y = null;
                        if (null == ((hk) this).field_x) {
                          break L3;
                        } else {
                          ((hk) this).field_f = new byte[((hk) this).field_m.field_k];
                          break L3;
                        }
                      }
                      return ((hk) this).field_m;
                    }
                  } else {
                    L4: {
                      ((hk) this).field_y = null;
                      if (null == ((hk) this).field_x) {
                        break L4;
                      } else {
                        ((hk) this).field_f = new byte[((hk) this).field_m.field_k];
                        break L4;
                      }
                    }
                    return ((hk) this).field_m;
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            if (var5 != null) {
              ((hk) this).field_m = new f(var5, ((hk) this).field_p, ((hk) this).field_g);
              if (((hk) this).field_m.field_n != ((hk) this).field_l) {
                throw new RuntimeException();
              } else {
                L5: {
                  ((hk) this).field_y = null;
                  if (null == ((hk) this).field_x) {
                    break L5;
                  } else {
                    ((hk) this).field_f = new byte[((hk) this).field_m.field_k];
                    break L5;
                  }
                }
                return ((hk) this).field_m;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return ((hk) this).field_m;
        }
    }

    private final oa a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        Object stackIn_64_0 = null;
        byte stackIn_102_0 = 0;
        byte stackIn_102_1 = 0;
        byte stackIn_108_0 = 0;
        byte stackIn_108_1 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_101_0 = 0;
        byte stackOut_101_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        Object stackOut_63_0 = null;
        L0: {
          var10 = EscapeVector.field_A;
          var4 = (Object) (Object) (oa) (Object) ((hk) this).field_q.a((long)param0, -1);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((oa) var4).field_r) {
                break L0;
              } else {
                if (!((oa) var4).field_u) {
                  break L0;
                } else {
                  ((oa) var4).c((byte) -16);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (param1 != 0) {
                break L2;
              } else {
                L3: {
                  if (((hk) this).field_x == null) {
                    break L3;
                  } else {
                    if (-1 != ((hk) this).field_f[param0]) {
                      var4 = (Object) (Object) ((hk) this).field_k.a(((hk) this).field_x, param2 ^ 23908, param0);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((hk) this).field_t.c(20)) {
                  var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                  if (var10 == 0) {
                    ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            L4: {
              if (param1 != 1) {
                break L4;
              } else {
                if (((hk) this).field_x == null) {
                  throw new RuntimeException();
                } else {
                  var4 = (Object) (Object) ((hk) this).field_k.a((byte) -127, ((hk) this).field_x, param0);
                  break L4;
                }
              }
            }
            if (param1 == -3) {
              if (((hk) this).field_x != null) {
                if (0 != ((hk) this).field_f[param0]) {
                  throw new RuntimeException();
                } else {
                  if (((hk) this).field_t.b(20)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, false, (byte) 0, param0, (byte) 2);
                    return null;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            break L1;
          }
        }
        if (!((oa) var4).field_u) {
          L5: {
            if (param2 == 23874) {
              break L5;
            } else {
              f discarded$4 = ((hk) this).a(1);
              break L5;
            }
          }
          var5 = ((oa) var4).a(true);
          if (!(var4 instanceof cm)) {
            L6: {
              if (var5 == null) {
                break L6;
              } else {
                if (-3 <= (var5.length ^ -1)) {
                  break L6;
                } else {
                  qf.field_m.reset();
                  qf.field_m.update(var5, 0, var5.length - 2);
                  var6 = (int)qf.field_m.getValue();
                  if (var6 != ((hk) this).field_m.field_l[param0]) {
                    throw new RuntimeException();
                  } else {
                    if (((hk) this).field_m.field_h != null) {
                      if (null != ((hk) this).field_m.field_h[param0]) {
                        var7 = ((hk) this).field_m.field_h[param0];
                        var8 = vn.a(var5, 0, -2 + var5.length, 0);
                        var9 = 0;
                        L7: while (true) {
                          if (-65 < (var9 ^ -1)) {
                            stackOut_101_0 = var8[var9];
                            stackOut_101_1 = var7[var9];
                            stackIn_108_0 = stackOut_101_0;
                            stackIn_108_1 = stackOut_101_1;
                            stackIn_102_0 = stackOut_101_0;
                            stackIn_102_1 = stackOut_101_1;
                            if (var10 == 0) {
                              if (stackIn_108_0 != stackIn_108_1) {
                                throw new RuntimeException();
                              } else {
                                var9++;
                                continue L7;
                              }
                            } else {
                              L8: {
                                if (stackIn_102_0 != stackIn_102_1) {
                                  ((hk) this).field_f[param0] = (byte) 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                if (((oa) var4).field_r) {
                                  break L9;
                                } else {
                                  ((oa) var4).c((byte) -86);
                                  break L9;
                                }
                              }
                              return (oa) var4;
                            }
                          } else {
                            ((hk) this).field_t.field_g = 0;
                            ((hk) this).field_t.field_d = 0;
                            L10: {
                              var5[var5.length - 2] = (byte)(((hk) this).field_m.field_q[param0] >>> -1549180536);
                              var5[var5.length + -1] = (byte)((hk) this).field_m.field_q[param0];
                              if (null != ((hk) this).field_x) {
                                cm discarded$5 = ((hk) this).field_k.a(var5, param0, param2 ^ 23872, ((hk) this).field_x);
                                if ((((hk) this).field_f[param0] ^ -1) != -2) {
                                  ((hk) this).field_f[param0] = (byte) 1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              if (((oa) var4).field_r) {
                                break L11;
                              } else {
                                ((oa) var4).c((byte) -86);
                                break L11;
                              }
                            }
                            return (oa) var4;
                          }
                        }
                      } else {
                        ((hk) this).field_t.field_g = 0;
                        ((hk) this).field_t.field_d = 0;
                        L12: {
                          var5[var5.length - 2] = (byte)(((hk) this).field_m.field_q[param0] >>> -1549180536);
                          var5[var5.length + -1] = (byte)((hk) this).field_m.field_q[param0];
                          if (null != ((hk) this).field_x) {
                            cm discarded$6 = ((hk) this).field_k.a(var5, param0, param2 ^ 23872, ((hk) this).field_x);
                            if ((((hk) this).field_f[param0] ^ -1) != -2) {
                              ((hk) this).field_f[param0] = (byte) 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (((oa) var4).field_r) {
                            break L13;
                          } else {
                            ((oa) var4).c((byte) -86);
                            break L13;
                          }
                        }
                        return (oa) var4;
                      }
                    } else {
                      ((hk) this).field_t.field_g = 0;
                      ((hk) this).field_t.field_d = 0;
                      L14: {
                        var5[var5.length - 2] = (byte)(((hk) this).field_m.field_q[param0] >>> -1549180536);
                        var5[var5.length + -1] = (byte)((hk) this).field_m.field_q[param0];
                        if (null != ((hk) this).field_x) {
                          cm discarded$7 = ((hk) this).field_k.a(var5, param0, param2 ^ 23872, ((hk) this).field_x);
                          if ((((hk) this).field_f[param0] ^ -1) != -2) {
                            ((hk) this).field_f[param0] = (byte) 1;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (((oa) var4).field_r) {
                          break L15;
                        } else {
                          ((oa) var4).c((byte) -86);
                          break L15;
                        }
                      }
                      return (oa) var4;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (2 < var5.length) {
                      qf.field_m.reset();
                      qf.field_m.update(var5, 0, var5.length - 2);
                      var6 = (int)qf.field_m.getValue();
                      if (var6 == ((hk) this).field_m.field_l[param0]) {
                        L18: {
                          L19: {
                            if (((hk) this).field_m.field_h == null) {
                              break L19;
                            } else {
                              if (((hk) this).field_m.field_h[param0] == null) {
                                break L19;
                              } else {
                                var7 = ((hk) this).field_m.field_h[param0];
                                var8 = vn.a(var5, 0, var5.length - 2, param2 + -23874);
                                var9 = 0;
                                L20: while (true) {
                                  if (-65 >= (var9 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackOut_48_0 = var7[var9] ^ -1;
                                    stackOut_48_1 = var8[var9] ^ -1;
                                    stackIn_53_0 = stackOut_48_0;
                                    stackIn_53_1 = stackOut_48_1;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    if (var10 != 0) {
                                      break L18;
                                    } else {
                                      if (stackIn_49_0 == stackIn_49_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
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
                          stackOut_52_0 = var5[-2 + var5.length] << 2066150792 & 65280;
                          stackOut_52_1 = -(255 & var5[-1 + var5.length]);
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          break L18;
                        }
                        var7_int = stackIn_53_0 - stackIn_53_1;
                        if (var7_int != (((hk) this).field_m.field_q[param0] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L21: {
                            if (-2 != ((hk) this).field_f[param0]) {
                              L22: {
                                if (-1 != ((hk) this).field_f[param0]) {
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              ((hk) this).field_f[param0] = (byte) 1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            if (!((oa) var4).field_r) {
                              ((oa) var4).c((byte) -93);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          stackOut_63_0 = var4;
                          stackIn_64_0 = stackOut_63_0;
                          break L16;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L24: {
                var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
                ((hk) this).field_f[param0] = (byte)-1;
                ((oa) var4).c((byte) -92);
                if (((oa) var4).field_r) {
                  if (!((hk) this).field_t.c(20)) {
                    var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                    ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                    break L24;
                  } else {
                    break L24;
                  }
                } else {
                  break L24;
                }
              }
              return null;
            }
            return (oa) (Object) stackIn_64_0;
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        hg var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (null == ((hk) this).field_u) {
          return;
        } else {
          if (((hk) this).a(29192) == null) {
            return;
          } else {
            L0: {
              if (param0 == -1) {
                break L0;
              } else {
                byte[] discarded$6 = ((hk) this).a((byte) -27, -44);
                break L0;
              }
            }
            var2 = ((hk) this).field_e.a(false);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_e;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (-1 < (var3 ^ -1)) {
                            break L5;
                          } else {
                            if (var3 >= ((hk) this).field_m.field_k) {
                              break L5;
                            } else {
                              if (-1 != (((hk) this).field_m.field_i[var3] ^ -1)) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.c((byte) -57);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((hk) this).field_f[var3] != 0) {
                          break L6;
                        } else {
                          oa discarded$7 = this.a(var3, 1, param0 ^ -23875);
                          break L6;
                        }
                      }
                      L7: {
                        if (0 == (((hk) this).field_f[var3] ^ -1)) {
                          oa discarded$8 = this.a(var3, 2, 23874);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (-2 != (((hk) this).field_f[var3] ^ -1)) {
                        break L3;
                      } else {
                        var2.c((byte) -118);
                        break L3;
                      }
                    }
                    var2 = ((hk) this).field_e.b((byte) 70);
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
          }
        }
    }

    final static ed a(mf param0, boolean param1, int param2, int param3) {
        if (!param1) {
            hk.c((byte) 80);
        }
        if (!uc.a(param0, 116, param3, param2)) {
            return null;
        }
        return je.b(100);
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 != 8) {
            field_r = null;
        }
        field_w = null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          var3 = 0;
          var4 = hi.field_o;
          if (param0 == 122) {
            break L0;
          } else {
            hk.b(91);
            break L0;
          }
        }
        L1: while (true) {
          if (s.field_I.length > var3) {
            var5 = jj.field_a[var3];
            stackOut_4_0 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var8 == 0) {
              L2: {
                L3: {
                  if (stackIn_6_0 <= var5) {
                    break L3;
                  } else {
                    var4 = var4 + je.field_b;
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = ee.a(98, s.field_I[var3], true);
                var4 = var4 + hn.field_s;
                var7 = -(var6 >> 2455489) + rn.field_e;
                if (!fl.a(param1, (en.field_k << -568138623) + ok.field_a, param0 ^ -123, var4, -fe.field_k + var7, (fe.field_k << 54019649) + var6, param2)) {
                  var4 = var4 + (hn.field_s + (en.field_k << -1476189695) + ok.field_a);
                  break L2;
                } else {
                  return var5;
                }
              }
              var3++;
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return -1;
          }
        }
    }

    hk(int param0, jg param1, jg param2, sb param3, kk param4, int param5, byte[] param6, int param7, boolean param8) {
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
            ((hk) this).field_q = new ib(16);
            ((hk) this).field_z = 0;
            ((hk) this).field_e = new cn();
            ((hk) this).field_h = 0L;
            ((hk) this).field_s = param0;
            ((hk) this).field_x = param1;
            if (null == ((hk) this).field_x) {
              break L1;
            } else {
              ((hk) this).field_v = true;
              ((hk) this).field_u = new cn();
              if (EscapeVector.field_A == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((hk) this).field_v = false;
          break L0;
        }
        L2: {
          ((hk) this).field_l = param7;
          ((hk) this).field_o = param2;
          ((hk) this).field_k = param4;
          ((hk) this).field_t = param3;
          ((hk) this).field_g = param6;
          ((hk) this).field_p = param5;
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
          ((hk) this).field_i = stackIn_6_1 != 0;
          if (((hk) this).field_o == null) {
            break L3;
          } else {
            ((hk) this).field_y = (oa) (Object) ((hk) this).field_k.a(((hk) this).field_o, 106, ((hk) this).field_s);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Belter Award", "Moon Runner", "Moon Raker", "Hero of Earth", "Star Pilot", "Ace Pilot", "Fuel Filler", "Tough Destroyer", "Speed Nitwit", "Speed Freak", "Speed Demon", "Power Pilot", "Spirit of Vengeance", "Force King", "Seeker Shaker", "Flak Dancer", "Seeker Slingshot", "G Force", "Belter Award (Normal)", "Moon Runner (Normal)", "Moon Raker (Normal)", "Hero of Earth (Normal)", "High Octane", "Ore Crusher", "Cold Fusion", "Saviour of Earth", "Heroic Pilot", "Ultimate Pilot", "Total Annihilation", "Virtual Reality", "Bouncing Around", "Free Fall"};
        ld.a(50, (byte) -6);
    }
}

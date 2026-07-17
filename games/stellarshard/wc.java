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
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
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
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
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
            if (param2 != 0) {
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
                        if (((wc) this).field_B[param1] != -1) {
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
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (param2 != 1) {
                  break L7;
                } else {
                  if (null != ((wc) this).field_h) {
                    var4 = (Object) (Object) ((wc) this).field_r.a(((wc) this).field_h, 3, param1);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              if (param2 == 2) {
                if (((wc) this).field_h == null) {
                  throw new RuntimeException();
                } else {
                  if (((wc) this).field_B[param1] == -1) {
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
            try {
              L8: {
                L9: {
                  if (var5 == null) {
                    break L9;
                  } else {
                    if (2 < var5.length) {
                      nj.field_q.reset();
                      nj.field_q.update(var5, 0, var5.length + -2);
                      var6_int = (int)nj.field_q.getValue();
                      if (var6_int != ((wc) this).field_k.field_l[param1]) {
                        throw new RuntimeException();
                      } else {
                        L10: {
                          L11: {
                            if (null == ((wc) this).field_k.field_h) {
                              break L11;
                            } else {
                              if (null != ((wc) this).field_k.field_h[param1]) {
                                var7 = ((wc) this).field_k.field_h[param1];
                                var8 = bc.a(param0 + 28529, 0, var5.length + -2, var5);
                                var9 = 0;
                                L12: while (true) {
                                  if (var9 >= 64) {
                                    break L11;
                                  } else {
                                    stackOut_79_0 = ~var8[var9];
                                    stackOut_79_1 = ~var7[var9];
                                    stackIn_95_0 = stackOut_79_0;
                                    stackIn_95_1 = stackOut_79_1;
                                    stackIn_80_0 = stackOut_79_0;
                                    stackIn_80_1 = stackOut_79_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L8;
                                    } else {
                                      if (stackIn_80_0 != stackIn_80_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((wc) this).field_q.field_i = 0;
                                ((wc) this).field_q.field_g = 0;
                                break L10;
                              }
                            }
                          }
                          ((wc) this).field_q.field_i = 0;
                          ((wc) this).field_q.field_g = 0;
                          break L10;
                        }
                        decompiledRegionSelector0 = 0;
                        break L8;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((wc) this).field_q.b(-116);
              ((ki) var4).c(param0 + 28549);
              if (!((ki) var4).field_u) {
                return null;
              } else {
                L13: {
                  if (!((wc) this).field_q.d(2)) {
                    var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, true, ((wc) this).field_g, true);
                    ((wc) this).field_f.a((gg) var4, (long)param1, 1);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return null;
              }
            }
            L14: {
              L15: {
                if (decompiledRegionSelector0 == 0) {
                  var5[-2 + var5.length] = (byte)(((wc) this).field_k.field_j[param1] >>> 8);
                  var5[-1 + var5.length] = (byte)((wc) this).field_k.field_j[param1];
                  if (null == ((wc) this).field_h) {
                    break L14;
                  } else {
                    el discarded$1 = ((wc) this).field_r.a(((wc) this).field_h, -115, param1, var5);
                    stackOut_94_0 = ~((wc) this).field_B[param1];
                    stackOut_94_1 = -2;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              if (stackIn_95_0 == stackIn_95_1) {
                break L14;
              } else {
                ((wc) this).field_B[param1] = (byte) 1;
                break L14;
              }
            }
            L16: {
              if (((ki) var4).field_u) {
                break L16;
              } else {
                ((ki) var4).c(20);
                break L16;
              }
            }
            return (ki) var4;
          } else {
            try {
              L17: {
                L18: {
                  if (var5 == null) {
                    break L18;
                  } else {
                    if (var5.length <= 2) {
                      break L18;
                    } else {
                      nj.field_q.reset();
                      nj.field_q.update(var5, 0, -2 + var5.length);
                      var6_int = (int)nj.field_q.getValue();
                      if (var6_int == ((wc) this).field_k.field_l[param1]) {
                        L19: {
                          L20: {
                            if (((wc) this).field_k.field_h == null) {
                              break L20;
                            } else {
                              if (((wc) this).field_k.field_h[param1] != null) {
                                var7 = ((wc) this).field_k.field_h[param1];
                                var8 = bc.a(0, 0, -2 + var5.length, var5);
                                var9 = 0;
                                L21: while (true) {
                                  if (var9 >= 64) {
                                    break L20;
                                  } else {
                                    stackOut_46_0 = ~var7[var9];
                                    stackOut_46_1 = ~var8[var9];
                                    stackIn_51_0 = stackOut_46_0;
                                    stackIn_51_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      break L19;
                                    } else {
                                      if (stackIn_47_0 == stackIn_47_1) {
                                        var9++;
                                        continue L21;
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                          }
                          stackOut_50_0 = 65280 & var5[-2 + var5.length] << 8;
                          stackOut_50_1 = -(var5[var5.length + -1] & 255);
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L19;
                        }
                        var7_int = stackIn_51_0 - stackIn_51_1;
                        if (var7_int == (65535 & ((wc) this).field_k.field_j[param1])) {
                          L22: {
                            if (((wc) this).field_B[param1] == 1) {
                              break L22;
                            } else {
                              L23: {
                                if (((wc) this).field_B[param1] != 0) {
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              ((wc) this).field_B[param1] = (byte) 1;
                              break L22;
                            }
                          }
                          L24: {
                            if (((ki) var4).field_u) {
                              break L24;
                            } else {
                              ((ki) var4).c(20);
                              break L24;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L17;
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
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((wc) this).field_B[param1] = (byte) -1;
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
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (~var3 <= ~((wc) this).field_k.field_e) {
                              break L5;
                            } else {
                              if (((wc) this).field_k.field_p[var3] != 0) {
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
                      if (((wc) this).field_B[var3] != 1) {
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
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var5 = ((wc) this).field_o.g(-27203);
              var2 = var5;
              if (!(((wc) this).field_o instanceof el)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((wc) this).field_k = new lh(var5, ((wc) this).field_A, ((wc) this).field_w);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = decompiledCaughtException;
                  ((wc) this).field_q.b(-127);
                  ((wc) this).field_k = null;
                  if (((wc) this).field_q.d(2)) {
                    ((wc) this).field_o = null;
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                      return null;
                    }
                  } else {
                    ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                    return null;
                  }
                }
                if (((wc) this).field_j == null) {
                  break L1;
                } else {
                  el discarded$1 = ((wc) this).field_r.a(((wc) this).field_j, 106, ((wc) this).field_g, var5);
                  break L1;
                }
              } else {
                try {
                  L3: {
                    if (var5 != null) {
                      ((wc) this).field_k = new lh(var5, ((wc) this).field_A, ((wc) this).field_w);
                      if (((wc) this).field_k.field_r == ((wc) this).field_E) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = decompiledCaughtException;
                  ((wc) this).field_k = null;
                  if (!((wc) this).field_q.d(2)) {
                    ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((wc) this).field_o = null;
                      return null;
                    }
                  } else {
                    ((wc) this).field_o = null;
                    return null;
                  }
                }
                break L1;
              }
            }
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
        field_s = null;
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
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        byte stackIn_53_1 = 0;
        int stackIn_61_0 = 0;
        byte stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_88_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_52_0 = 0;
        byte stackOut_52_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_87_0 = 0;
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
                          if (var3 == null) {
                            break L5;
                          } else {
                            var4 = (int)var3.field_j;
                            stackOut_6_0 = ~((wc) this).field_B[var4];
                            stackOut_6_1 = -1;
                            stackIn_23_0 = stackOut_6_0;
                            stackIn_23_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var5 == 0) {
                              L6: {
                                if (stackIn_23_0 == stackIn_23_1) {
                                  ki discarded$6 = this.a(-28529, var4, 1);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              L7: {
                                L8: {
                                  if (((wc) this).field_B[var4] != 0) {
                                    break L8;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var3.c(20);
                                break L7;
                              }
                              var3 = ((wc) this).field_v.b((byte) -113);
                              continue L2;
                            } else {
                              if (stackIn_7_0 <= stackIn_7_1) {
                                break L4;
                              } else {
                                stackOut_8_0 = ((wc) this).field_k.field_p[((wc) this).field_m];
                                stackIn_46_0 = stackOut_8_0;
                                stackIn_9_0 = stackOut_8_0;
                                if (var5 != 0) {
                                  break L3;
                                } else {
                                  L9: {
                                    if (stackIn_9_0 == 0) {
                                      ((wc) this).field_m = ((wc) this).field_m + 1;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (250 <= ((wc) this).field_r.field_e) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L4;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (((wc) this).field_B[((wc) this).field_m] != 0) {
                                      break L11;
                                    } else {
                                      ki discarded$7 = this.a(-28529, ((wc) this).field_m, 1);
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (0 == ((wc) this).field_B[((wc) this).field_m]) {
                                      var3 = new gg();
                                      var3.field_j = (long)((wc) this).field_m;
                                      var2_int = 0;
                                      ((wc) this).field_v.b(-93, var3);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  ((wc) this).field_m = ((wc) this).field_m + 1;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L13: while (true) {
                          if (((wc) this).field_k.field_p.length <= ((wc) this).field_m) {
                            break L4;
                          } else {
                            stackOut_32_0 = ((wc) this).field_k.field_p[((wc) this).field_m];
                            stackIn_46_0 = stackOut_32_0;
                            stackIn_33_0 = stackOut_32_0;
                            if (var5 != 0) {
                              break L3;
                            } else {
                              L14: {
                                if (stackIn_33_0 == 0) {
                                  ((wc) this).field_m = ((wc) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                if (250 <= ((wc) this).field_r.field_e) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L15;
                                }
                              }
                              L16: {
                                if (((wc) this).field_B[((wc) this).field_m] != 0) {
                                  break L16;
                                } else {
                                  ki discarded$8 = this.a(-28529, ((wc) this).field_m, 1);
                                  break L16;
                                }
                              }
                              L17: {
                                if (0 == ((wc) this).field_B[((wc) this).field_m]) {
                                  var3 = new gg();
                                  var3.field_j = (long)((wc) this).field_m;
                                  var2_int = 0;
                                  ((wc) this).field_v.b(-93, var3);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((wc) this).field_m = ((wc) this).field_m + 1;
                              if (var5 == 0) {
                                continue L13;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_45_0 = var2_int;
                      stackIn_46_0 = stackOut_45_0;
                      break L3;
                    }
                    L18: {
                      if (stackIn_46_0 == 0) {
                        break L18;
                      } else {
                        ((wc) this).field_m = 0;
                        ((wc) this).field_t = false;
                        break L18;
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
              L19: {
                if (!((wc) this).field_i) {
                  break L19;
                } else {
                  var2_int = 1;
                  var3 = ((wc) this).field_v.b(-125);
                  L20: while (true) {
                    L21: {
                      L22: {
                        L23: {
                          if (var3 == null) {
                            break L23;
                          } else {
                            var4 = (int)var3.field_j;
                            stackOut_52_0 = -2;
                            stackOut_52_1 = ((wc) this).field_B[var4];
                            stackIn_61_0 = stackOut_52_0;
                            stackIn_61_1 = stackOut_52_1;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            if (var5 != 0) {
                              if (stackIn_61_0 >= stackIn_61_1) {
                                break L22;
                              } else {
                                stackOut_62_0 = ~((wc) this).field_k.field_p[((wc) this).field_m];
                                stackIn_88_0 = stackOut_62_0;
                                stackIn_63_0 = stackOut_62_0;
                                if (var5 != 0) {
                                  break L21;
                                } else {
                                  L24: {
                                    if (stackIn_63_0 == -1) {
                                      ((wc) this).field_m = ((wc) this).field_m + 1;
                                      if (var5 == 0) {
                                        break L23;
                                      } else {
                                        break L24;
                                      }
                                    } else {
                                      break L24;
                                    }
                                  }
                                  L25: {
                                    if (!((wc) this).field_q.e(-105)) {
                                      break L25;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L22;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L26: {
                                    if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                      break L26;
                                    } else {
                                      ki discarded$9 = this.a(-28529, ((wc) this).field_m, 2);
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                      break L27;
                                    } else {
                                      var3 = new gg();
                                      var3.field_j = (long)((wc) this).field_m;
                                      var2_int = 0;
                                      ((wc) this).field_v.b(-80, var3);
                                      break L27;
                                    }
                                  }
                                  ((wc) this).field_m = ((wc) this).field_m + 1;
                                  if (var5 == 0) {
                                    break L23;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            } else {
                              L28: {
                                if (stackIn_53_0 == stackIn_53_1) {
                                  break L28;
                                } else {
                                  ki discarded$10 = this.a(-28529, var4, 2);
                                  break L28;
                                }
                              }
                              L29: {
                                L30: {
                                  if (-2 != ((wc) this).field_B[var4]) {
                                    break L30;
                                  } else {
                                    var3.c(20);
                                    if (var5 == 0) {
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L29;
                              }
                              var3 = ((wc) this).field_v.b((byte) -44);
                              continue L20;
                            }
                          }
                        }
                        L31: while (true) {
                          if (((wc) this).field_m >= ((wc) this).field_k.field_p.length) {
                            break L22;
                          } else {
                            stackOut_76_0 = ~((wc) this).field_k.field_p[((wc) this).field_m];
                            stackIn_88_0 = stackOut_76_0;
                            stackIn_77_0 = stackOut_76_0;
                            if (var5 != 0) {
                              break L21;
                            } else {
                              L32: {
                                if (stackIn_77_0 == -1) {
                                  break L32;
                                } else {
                                  L33: {
                                    if (!((wc) this).field_q.e(-105)) {
                                      break L33;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L22;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  L34: {
                                    if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                      break L34;
                                    } else {
                                      ki discarded$11 = this.a(-28529, ((wc) this).field_m, 2);
                                      break L34;
                                    }
                                  }
                                  if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                    break L32;
                                  } else {
                                    var3 = new gg();
                                    var3.field_j = (long)((wc) this).field_m;
                                    var2_int = 0;
                                    ((wc) this).field_v.b(-80, var3);
                                    break L32;
                                  }
                                }
                              }
                              ((wc) this).field_m = ((wc) this).field_m + 1;
                              continue L31;
                            }
                          }
                        }
                      }
                      stackOut_87_0 = var2_int;
                      stackIn_88_0 = stackOut_87_0;
                      break L21;
                    }
                    L35: {
                      if (stackIn_88_0 == 0) {
                        break L35;
                      } else {
                        ((wc) this).field_m = 0;
                        ((wc) this).field_i = false;
                        break L35;
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L19;
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
              L36: while (true) {
                if (var2 != null) {
                  if (var5 == 0) {
                    L37: {
                      L38: {
                        if (!var2.field_w) {
                          break L38;
                        } else {
                          if (var5 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      L39: {
                        if (var2.field_y) {
                          break L39;
                        } else {
                          var2.field_y = true;
                          if (var5 == 0) {
                            break L37;
                          } else {
                            break L39;
                          }
                        }
                      }
                      if (var2.field_u) {
                        var2.c(20);
                        break L37;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                    var2 = (ki) (Object) ((wc) this).field_f.b((byte) 118);
                    continue L36;
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
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((wc) this).field_f = new uh(16);
        ((wc) this).field_m = 0;
        ((wc) this).field_u = new oj();
        ((wc) this).field_D = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((wc) this).field_g = param0;
                ((wc) this).field_h = param1;
                if (((wc) this).field_h == null) {
                  break L2;
                } else {
                  ((wc) this).field_t = true;
                  ((wc) this).field_v = new oj();
                  if (stellarshard.field_B == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((wc) this).field_t = false;
              break L1;
            }
            L3: {
              ((wc) this).field_E = param7;
              ((wc) this).field_A = param5;
              ((wc) this).field_j = param2;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((wc) this).field_n = stackIn_7_1 != 0;
              ((wc) this).field_w = param6;
              ((wc) this).field_q = param3;
              ((wc) this).field_r = param4;
              if (null == ((wc) this).field_j) {
                break L4;
              } else {
                ((wc) this).field_o = (ki) (Object) ((wc) this).field_r.a(((wc) this).field_j, (byte) 101, ((wc) this).field_g);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("wc.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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

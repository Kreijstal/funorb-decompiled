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
        byte stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        byte stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        byte stackOut_8_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_30_0 = 0;
        byte stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_78_0 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          if (param0 < -21) {
            break L0;
          } else {
            byte[] discarded$7 = ((hk) this).a((byte) -107, 43);
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
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_8_0 = ((hk) this).field_f[var4];
                            stackIn_123_0 = stackOut_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_123_0 <= ((hk) this).field_z) {
                                  break L5;
                                } else {
                                  stackOut_121_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                                  stackIn_31_0 = stackOut_121_0;
                                  stackIn_122_0 = stackOut_121_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    stackOut_122_0 = stackIn_122_0;
                                    stackIn_119_0 = stackOut_122_0;
                                    L8: {
                                      L9: {
                                        if (stackIn_119_0 == 0) {
                                          ((hk) this).field_z = ((hk) this).field_z + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (250 <= ((hk) this).field_k.field_f) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (0 != ((hk) this).field_f[((hk) this).field_z]) {
                                          break L11;
                                        } else {
                                          oa discarded$8 = this.a(((hk) this).field_z, 1, 23874);
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((hk) this).field_f[((hk) this).field_z] != 0) {
                                          break L12;
                                        } else {
                                          var3 = new hg();
                                          var3.field_e = (long)((hk) this).field_z;
                                          ((hk) this).field_u.a(-12328, var3);
                                          var2_int = 0;
                                          break L12;
                                        }
                                      }
                                      ((hk) this).field_z = ((hk) this).field_z + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_125_0 = ((hk) this).field_m.field_i.length;
                                    stackIn_123_0 = stackOut_125_0;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_9_0 == 0) {
                                  oa discarded$9 = this.a(var4, 1, 23874);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((hk) this).field_f[var4] != 0) {
                                    break L15;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var3.c((byte) -53);
                                break L14;
                              }
                              var3 = ((hk) this).field_u.b((byte) 70);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          if (((hk) this).field_m.field_i.length <= ((hk) this).field_z) {
                            break L5;
                          } else {
                            stackOut_18_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                            stackIn_31_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              L17: {
                                if (stackIn_19_0 == 0) {
                                  ((hk) this).field_z = ((hk) this).field_z + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (250 <= ((hk) this).field_k.field_f) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (0 != ((hk) this).field_f[((hk) this).field_z]) {
                                  break L19;
                                } else {
                                  oa discarded$10 = this.a(((hk) this).field_z, 1, 23874);
                                  break L19;
                                }
                              }
                              L20: {
                                if (((hk) this).field_f[((hk) this).field_z] != 0) {
                                  break L20;
                                } else {
                                  var3 = new hg();
                                  var3.field_e = (long)((hk) this).field_z;
                                  ((hk) this).field_u.a(-12328, var3);
                                  var2_int = 0;
                                  break L20;
                                }
                              }
                              ((hk) this).field_z = ((hk) this).field_z + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_30_0 = var2_int;
                      stackIn_31_0 = stackOut_30_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_31_0 == 0) {
                        break L21;
                      } else {
                        ((hk) this).field_z = 0;
                        ((hk) this).field_v = false;
                        break L21;
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
              L22: {
                if (((hk) this).field_j) {
                  break L22;
                } else {
                  ((hk) this).field_u = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L22;
                  }
                }
              }
              var2_int = 1;
              var3 = ((hk) this).field_u.a(false);
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      if (var3 == null) {
                        break L26;
                      } else {
                        var4 = (int)var3.field_e;
                        stackOut_39_0 = ((hk) this).field_f[var4];
                        stackOut_39_1 = -2;
                        stackIn_48_0 = stackOut_39_0;
                        stackIn_48_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (var5 != 0) {
                          if (stackIn_48_0 >= stackIn_48_1) {
                            break L25;
                          } else {
                            stackOut_49_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                            stackIn_79_0 = stackOut_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              L27: {
                                if (stackIn_50_0 != 0) {
                                  break L27;
                                } else {
                                  ((hk) this).field_z = ((hk) this).field_z + 1;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L28: {
                                if (((hk) this).field_t.b(20)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L28;
                                  }
                                } else {
                                  break L28;
                                }
                              }
                              L29: {
                                if (((hk) this).field_f[((hk) this).field_z] == 1) {
                                  break L29;
                                } else {
                                  oa discarded$11 = this.a(((hk) this).field_z, 2, 23874);
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
                              if (var5 == 0) {
                                break L26;
                              } else {
                                break L25;
                              }
                            }
                          }
                        } else {
                          L31: {
                            if (stackIn_40_0 == stackIn_40_1) {
                              break L31;
                            } else {
                              oa discarded$12 = this.a(var4, 2, 23874);
                              break L31;
                            }
                          }
                          L32: {
                            L33: {
                              if (-2 != ((hk) this).field_f[var4]) {
                                break L33;
                              } else {
                                var3.c((byte) -24);
                                if (var5 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var2_int = 0;
                            break L32;
                          }
                          var3 = ((hk) this).field_u.b((byte) 70);
                          continue L23;
                        }
                      }
                    }
                    L34: while (true) {
                      if (((hk) this).field_z >= ((hk) this).field_m.field_i.length) {
                        break L25;
                      } else {
                        stackOut_65_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                        stackIn_79_0 = stackOut_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        if (var5 != 0) {
                          break L24;
                        } else {
                          if (stackIn_66_0 != 0) {
                            L35: {
                              if (((hk) this).field_t.b(20)) {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L25;
                                } else {
                                  break L35;
                                }
                              } else {
                                break L35;
                              }
                            }
                            L36: {
                              if (((hk) this).field_f[((hk) this).field_z] == 1) {
                                break L36;
                              } else {
                                oa discarded$13 = this.a(((hk) this).field_z, 2, 23874);
                                break L36;
                              }
                            }
                            L37: {
                              if (1 != ((hk) this).field_f[((hk) this).field_z]) {
                                var3 = new hg();
                                var3.field_e = (long)((hk) this).field_z;
                                var2_int = 0;
                                ((hk) this).field_u.a(-12328, var3);
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            ((hk) this).field_z = ((hk) this).field_z + 1;
                            continue L34;
                          } else {
                            ((hk) this).field_z = ((hk) this).field_z + 1;
                            continue L34;
                          }
                        }
                      }
                    }
                  }
                  stackOut_78_0 = var2_int;
                  stackIn_79_0 = stackOut_78_0;
                  break L24;
                }
                if (stackIn_79_0 == 0) {
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
            L38: while (true) {
              if (var2 != null) {
                if (var5 == 0) {
                  L39: {
                    L40: {
                      if (!var2.field_u) {
                        break L40;
                      } else {
                        if (var5 == 0) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                    L41: {
                      if (var2.field_s) {
                        break L41;
                      } else {
                        var2.field_s = true;
                        if (var5 == 0) {
                          break L39;
                        } else {
                          break L41;
                        }
                      }
                    }
                    if (!var2.field_r) {
                      throw new RuntimeException();
                    } else {
                      var2.c((byte) -117);
                      break L39;
                    }
                  }
                  var2 = (oa) (Object) ((hk) this).field_q.a((byte) 62);
                  continue L38;
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
    }

    final f a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
              L3: {
                if (((hk) this).field_y instanceof cm) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((hk) this).field_m = new f(var5, ((hk) this).field_p, ((hk) this).field_g);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((hk) this).field_t.b((byte) -125);
                    ((hk) this).field_m = null;
                    if (((hk) this).field_t.c(20)) {
                      ((hk) this).field_y = null;
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                        return null;
                      }
                    } else {
                      ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                      return null;
                    }
                  }
                  if (((hk) this).field_o != null) {
                    cm discarded$3 = ((hk) this).field_k.a(var5, ((hk) this).field_s, param0 ^ 29194, ((hk) this).field_o);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((hk) this).field_m = new f(var5, ((hk) this).field_p, ((hk) this).field_g);
                    if (((hk) this).field_m.field_n == ((hk) this).field_l) {
                      break L5;
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
                ((hk) this).field_m = null;
                if (((hk) this).field_t.c(20)) {
                  ((hk) this).field_y = null;
                  if (var4 == 0) {
                    return null;
                  } else {
                    ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                    return null;
                  }
                } else {
                  ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                  return null;
                }
              }
              break L2;
            }
            L6: {
              ((hk) this).field_y = null;
              if (null == ((hk) this).field_x) {
                break L6;
              } else {
                ((hk) this).field_f = new byte[((hk) this).field_m.field_k];
                break L6;
              }
            }
            return ((hk) this).field_m;
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
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        Object stackIn_65_0 = null;
        byte stackIn_85_0 = 0;
        byte stackIn_85_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_84_0 = 0;
        byte stackOut_84_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        Object stackOut_64_0 = null;
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
              L3: {
                if (param1 != 0) {
                  break L3;
                } else {
                  L4: {
                    if (((hk) this).field_x == null) {
                      break L4;
                    } else {
                      if (-1 != ((hk) this).field_f[param0]) {
                        var4 = (Object) (Object) ((hk) this).field_k.a(((hk) this).field_x, param2 ^ 23908, param0);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((hk) this).field_t.c(20)) {
                    var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
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
              L5: {
                if (param1 != 1) {
                  break L5;
                } else {
                  if (((hk) this).field_x == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((hk) this).field_k.a((byte) -127, ((hk) this).field_x, param0);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (param1 == -3) {
                if (((hk) this).field_x != null) {
                  if (0 != ((hk) this).field_f[param0]) {
                    throw new RuntimeException();
                  } else {
                    if (!((hk) this).field_t.b(20)) {
                      var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, false, (byte) 0, param0, (byte) 2);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                throw new RuntimeException();
              }
            }
            ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((oa) var4).field_u) {
          L6: {
            if (param2 == 23874) {
              break L6;
            } else {
              f discarded$2 = ((hk) this).a(1);
              break L6;
            }
          }
          var5 = ((oa) var4).a(true);
          if (!(var4 instanceof cm)) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length <= 2) {
                      break L8;
                    } else {
                      qf.field_m.reset();
                      qf.field_m.update(var5, 0, var5.length - 2);
                      var6_int = (int)qf.field_m.getValue();
                      if (var6_int != ((hk) this).field_m.field_l[param0]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (((hk) this).field_m.field_h == null) {
                              break L10;
                            } else {
                              if (null != ((hk) this).field_m.field_h[param0]) {
                                var7 = ((hk) this).field_m.field_h[param0];
                                var8 = vn.a(var5, 0, -2 + var5.length, 0);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_84_0 = var8[var9];
                                    stackOut_84_1 = var7[var9];
                                    stackIn_101_0 = stackOut_84_0;
                                    stackIn_101_1 = stackOut_84_1;
                                    stackIn_85_0 = stackOut_84_0;
                                    stackIn_85_1 = stackOut_84_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L7;
                                    } else {
                                      if (stackIn_85_0 != stackIn_85_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((hk) this).field_t.field_g = 0;
                                ((hk) this).field_t.field_d = 0;
                                break L9;
                              }
                            }
                          }
                          ((hk) this).field_t.field_g = 0;
                          ((hk) this).field_t.field_d = 0;
                          break L9;
                        }
                        decompiledRegionSelector0 = 0;
                        break L7;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((hk) this).field_t.b((byte) -110);
              ((oa) var4).c((byte) -86);
              if (((oa) var4).field_r) {
                if (((hk) this).field_t.c(param2 + -23854)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                  ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                  return null;
                }
              } else {
                return null;
              }
            }
            L12: {
              L13: {
                if (decompiledRegionSelector0 == 0) {
                  var5[var5.length - 2] = (byte)(((hk) this).field_m.field_q[param0] >>> 8);
                  var5[var5.length + -1] = (byte)((hk) this).field_m.field_q[param0];
                  if (null != ((hk) this).field_x) {
                    cm discarded$3 = ((hk) this).field_k.a(var5, param0, param2 ^ 23872, ((hk) this).field_x);
                    stackOut_100_0 = ~((hk) this).field_f[param0];
                    stackOut_100_1 = -2;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    break L13;
                  } else {
                    break L12;
                  }
                } else {
                  break L13;
                }
              }
              if (stackIn_101_0 != stackIn_101_1) {
                ((hk) this).field_f[param0] = (byte) 1;
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              if (((oa) var4).field_r) {
                break L14;
              } else {
                ((oa) var4).c((byte) -86);
                break L14;
              }
            }
            return (oa) var4;
          } else {
            try {
              L15: {
                L16: {
                  if (var5 == null) {
                    break L16;
                  } else {
                    if (2 < var5.length) {
                      qf.field_m.reset();
                      qf.field_m.update(var5, 0, var5.length - 2);
                      var6_int = (int)qf.field_m.getValue();
                      if (var6_int == ((hk) this).field_m.field_l[param0]) {
                        L17: {
                          L18: {
                            if (((hk) this).field_m.field_h == null) {
                              break L18;
                            } else {
                              if (((hk) this).field_m.field_h[param0] == null) {
                                break L18;
                              } else {
                                var7 = ((hk) this).field_m.field_h[param0];
                                var8 = vn.a(var5, 0, var5.length - 2, param2 + -23874);
                                var9 = 0;
                                L19: while (true) {
                                  if (var9 >= 64) {
                                    break L18;
                                  } else {
                                    stackOut_49_0 = ~var7[var9];
                                    stackOut_49_1 = ~var8[var9];
                                    stackIn_54_0 = stackOut_49_0;
                                    stackIn_54_1 = stackOut_49_1;
                                    stackIn_50_0 = stackOut_49_0;
                                    stackIn_50_1 = stackOut_49_1;
                                    if (var10 != 0) {
                                      break L17;
                                    } else {
                                      if (stackIn_50_0 == stackIn_50_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L19;
                                        } else {
                                          break L18;
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
                          stackOut_53_0 = var5[-2 + var5.length] << 8 & 65280;
                          stackOut_53_1 = -(255 & var5[-1 + var5.length]);
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          break L17;
                        }
                        var7_int = stackIn_54_0 - stackIn_54_1;
                        if (var7_int != (((hk) this).field_m.field_q[param0] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L20: {
                            if (-2 != ((hk) this).field_f[param0]) {
                              L21: {
                                if (-1 != ((hk) this).field_f[param0]) {
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              ((hk) this).field_f[param0] = (byte) 1;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L22: {
                            if (!((oa) var4).field_r) {
                              ((oa) var4).c((byte) -93);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          stackOut_64_0 = var4;
                          stackIn_65_0 = stackOut_64_0;
                          break L15;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L23: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((hk) this).field_f[param0] = (byte) -1;
                ((oa) var4).c((byte) -92);
                if (((oa) var4).field_r) {
                  if (!((hk) this).field_t.c(20)) {
                    var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                    ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                    break L23;
                  } else {
                    break L23;
                  }
                } else {
                  break L23;
                }
              }
              return null;
            }
            return (oa) (Object) stackIn_65_0;
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
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (var3 >= ((hk) this).field_m.field_k) {
                              break L5;
                            } else {
                              if (((hk) this).field_m.field_i[var3] != 0) {
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
                        if (((hk) this).field_f[var3] == -1) {
                          oa discarded$8 = this.a(var3, 2, 23874);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (((hk) this).field_f[var3] != 1) {
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
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ed stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                hk.c((byte) 80);
                break L1;
              }
            }
            if (uc.a(param0, 116, param3, param2)) {
              stackOut_5_0 = je.b(100);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ed) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("hk.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    public static void c(byte param0) {
        field_r = null;
        field_r = null;
        field_w = null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = hi.field_o;
              if (param0 == 122) {
                break L1;
              } else {
                hk.b(91);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (s.field_I.length <= var3_int) {
                  stackOut_12_0 = -1;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  var5 = jj.field_a[var3_int];
                  stackOut_4_0 = 0;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_5_0 <= var5) {
                          break L5;
                        } else {
                          var4 = var4 + je.field_b;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6 = ee.a(98, s.field_I[var3_int], true);
                      var4 = var4 + hn.field_s;
                      var7 = -(var6 >> 1) + rn.field_e;
                      if (!fl.a(param1, (en.field_k << 1) + ok.field_a, param0 ^ -123, var4, -fe.field_k + var7, (fe.field_k << 1) + var6, 70)) {
                        var4 = var4 + (hn.field_s + (en.field_k << 1) + ok.field_a);
                        break L4;
                      } else {
                        stackOut_8_0 = var5;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      }
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "hk.G(" + param0 + 44 + param1 + 44 + 70 + 41);
        }
        return stackIn_13_0;
    }

    hk(int param0, jg param1, jg param2, sb param3, kk param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((hk) this).field_q = new ib(16);
        ((hk) this).field_z = 0;
        ((hk) this).field_e = new cn();
        ((hk) this).field_h = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((hk) this).field_s = param0;
                ((hk) this).field_x = param1;
                if (null == ((hk) this).field_x) {
                  break L2;
                } else {
                  ((hk) this).field_v = true;
                  ((hk) this).field_u = new cn();
                  if (EscapeVector.field_A == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((hk) this).field_v = false;
              break L1;
            }
            L3: {
              ((hk) this).field_l = param7;
              ((hk) this).field_o = param2;
              ((hk) this).field_k = param4;
              ((hk) this).field_t = param3;
              ((hk) this).field_g = param6;
              ((hk) this).field_p = param5;
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
              ((hk) this).field_i = stackIn_7_1 != 0;
              if (((hk) this).field_o == null) {
                break L4;
              } else {
                ((hk) this).field_y = (oa) (Object) ((hk) this).field_k.a(((hk) this).field_o, 106, ((hk) this).field_s);
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
            stackOut_10_1 = new StringBuilder().append("hk.<init>(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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

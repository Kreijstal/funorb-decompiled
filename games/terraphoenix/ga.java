/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ga {
    oh field_b;
    boolean field_y;
    oh field_A;
    int field_w;
    int field_u;
    int field_d;
    int field_q;
    static jj field_k;
    int field_e;
    int field_t;
    int field_B;
    int field_v;
    static int field_j;
    static java.math.BigInteger field_o;
    int field_g;
    String field_n;
    pc field_m;
    int field_s;
    oh field_i;
    int field_h;
    String field_z;
    static String field_p;
    int field_f;
    static jj field_r;
    static String field_l;
    int field_x;
    static String field_a;
    static int field_c;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            dh var1_ref = null;
            int var1_int = 0;
            int stackIn_15_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_40_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_39_0 = 0;
            if (4 <= jg.field_kb.field_i) {
              if (jg.field_kb.field_l != -1) {
                if (-2 == jg.field_kb.field_l) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (hm.field_N == 0) {
                      bj.field_c = mc.field_b.a(lg.field_h, eb.field_B, (byte) 60);
                      hm.field_N = hm.field_N + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != hm.field_N) {
                      break L2;
                    } else {
                      if (bj.field_c.field_d == 2) {
                        stackOut_14_0 = o.a(-1, (byte) -112);
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      } else {
                        if (bj.field_c.field_d == 1) {
                          hm.field_N = hm.field_N + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (hm.field_N != 2) {
                      break L3;
                    } else {
                      gi.field_l = new tf((java.net.Socket) bj.field_c.field_e, mc.field_b);
                      var1_ref = new dh(13);
                      ej.a(ng.field_y, -25563, var1_ref, tj.field_wb, ai.field_c);
                      var1_ref.i(15, -121);
                      var1_ref.e(rf.field_v, 8959);
                      gi.field_l.a(13, 0, (byte) -97, var1_ref.field_i);
                      hm.field_N = hm.field_N + 1;
                      t.field_b = 30000L + ll.a(1000);
                      break L3;
                    }
                  }
                  L4: {
                    if (hm.field_N == 3) {
                      if (gi.field_l.a(0) > 0) {
                        var1_int = gi.field_l.b(0);
                        if (var1_int != 0) {
                          stackOut_30_0 = o.a(var1_int, (byte) -112);
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          hm.field_N = hm.field_N + 1;
                          break L4;
                        }
                      } else {
                        if (t.field_b < ll.a(1000)) {
                          stackOut_26_0 = o.a(-2, (byte) -127);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (hm.field_N == 4) {
                    jg.field_kb.a(-1456343840, (Object) (Object) gi.field_l, dg.field_b);
                    bj.field_c = null;
                    gi.field_l = null;
                    hm.field_N = 0;
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0;
                  } else {
                    L5: {
                      if (param0 <= -104) {
                        break L5;
                      } else {
                        field_l = null;
                        break L5;
                      }
                    }
                    stackOut_39_0 = -1;
                    stackIn_40_0 = stackOut_39_0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return o.a(-3, (byte) -119);
              }
              return stackIn_40_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (((ga) this).field_b != null) {
            var2 = var2 + od.field_c[((ga) this).field_b.field_g].field_s;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((ga) this).field_A == null) {
            break L1;
          } else {
            var2 = var2 + od.field_c[((ga) this).field_A.field_g].field_s;
            break L1;
          }
        }
        L2: {
          var3 = -15 / ((param0 - -30) / 42);
          if (((ga) this).field_i != null) {
            var2 = var2 + ((ga) this).field_i.field_d * od.field_c[((ga) this).field_i.field_g].field_s;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (null != ((ga) this).field_m) {
            var2 = var2 + sj.field_a[((ga) this).field_m.field_f].field_f;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          ((ga) this).field_x = var2;
          var2 = var2 - ((ga) this).field_v;
          if (var2 >= 0) {
            break L4;
          } else {
            var2 = 0;
            break L4;
          }
        }
        L5: {
          ((ga) this).field_u = var2 + ((ga) this).field_v;
          ((ga) this).field_s = ((ga) this).field_w * ((ga) this).field_v / ((ga) this).field_u;
          if (-1 < ((ga) this).field_s) {
            ((ga) this).field_s = 0;
            break L5;
          } else {
            break L5;
          }
        }
        if (-101 < ((ga) this).field_u) {
          ((ga) this).field_u = 100;
          return ((ga) this).field_x;
        } else {
          return ((ga) this).field_x;
        }
    }

    final void a(rk param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((ga) this).field_m = null;
                break L1;
              }
            }
            L2: {
              if (null != ((ga) this).field_b) {
                ((ga) this).field_b.field_d = 8;
                ((ga) this).field_b.field_c = od.field_c[((ga) this).field_b.field_g].field_o;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((ga) this).field_A == null) {
                break L3;
              } else {
                ((ga) this).field_A.field_d = 8;
                ((ga) this).field_A.field_c = od.field_c[((ga) this).field_A.field_g].field_o;
                break L3;
              }
            }
            L4: {
              if (null != ((ga) this).field_i) {
                if (((ga) this).field_i.field_d < 2) {
                  ((ga) this).field_i.field_d = 2;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ga.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        L0: {
          var2 = 97 % ((-19 - param0) / 58);
          ((ga) this).field_d = (((ga) this).field_f + ((ga) this).field_g) % 12;
          if (((ga) this).field_y) {
            L1: {
              if (((ga) this).field_d == 1) {
                ((ga) this).field_d = 3;
                break L1;
              } else {
                break L1;
              }
            }
            if (2 != ((ga) this).field_d) {
              if (((ga) this).field_d != 9) {
                break L0;
              } else {
                ((ga) this).field_d = 7;
                return;
              }
            } else {
              ((ga) this).field_d = 5;
              if (((ga) this).field_d != 9) {
                return;
              } else {
                ((ga) this).field_d = 7;
                return;
              }
            }
          } else {
            if (((ga) this).field_d != 0) {
              L2: {
                if (((ga) this).field_d == 3) {
                  ((ga) this).field_d = 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((ga) this).field_d == 4) {
                  ((ga) this).field_d = 9;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((ga) this).field_d != 5) {
                L4: {
                  if (((ga) this).field_d == 6) {
                    ((ga) this).field_d = 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((ga) this).field_d == 7) {
                    ((ga) this).field_d = 9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((ga) this).field_d != 8) {
                  if (((ga) this).field_d == 11) {
                    ((ga) this).field_d = 2;
                    if (Terraphoenix.field_V == 0) {
                      break L0;
                    } else {
                      L6: {
                        if (((ga) this).field_d == 1) {
                          ((ga) this).field_d = 3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (2 != ((ga) this).field_d) {
                        if (((ga) this).field_d != 9) {
                          return;
                        } else {
                          ((ga) this).field_d = 7;
                          return;
                        }
                      } else {
                        ((ga) this).field_d = 5;
                        if (((ga) this).field_d != 9) {
                          return;
                        } else {
                          ((ga) this).field_d = 7;
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((ga) this).field_d = 1;
                  if (((ga) this).field_d == 11) {
                    L7: {
                      ((ga) this).field_d = 2;
                      if (Terraphoenix.field_V == 0) {
                        break L7;
                      } else {
                        L8: {
                          if (((ga) this).field_d == 1) {
                            ((ga) this).field_d = 3;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (2 != ((ga) this).field_d) {
                          if (((ga) this).field_d != 9) {
                            break L7;
                          } else {
                            ((ga) this).field_d = 7;
                            return;
                          }
                        } else {
                          L9: {
                            ((ga) this).field_d = 5;
                            if (((ga) this).field_d != 9) {
                              break L9;
                            } else {
                              ((ga) this).field_d = 7;
                              break L9;
                            }
                          }
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L10: {
                  ((ga) this).field_d = 1;
                  if (((ga) this).field_d == 6) {
                    ((ga) this).field_d = 2;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (((ga) this).field_d == 7) {
                    ((ga) this).field_d = 9;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (((ga) this).field_d != 8) {
                    break L12;
                  } else {
                    ((ga) this).field_d = 1;
                    break L12;
                  }
                }
                if (((ga) this).field_d == 11) {
                  ((ga) this).field_d = 2;
                  if (Terraphoenix.field_V != 0) {
                    L13: {
                      if (((ga) this).field_d == 1) {
                        ((ga) this).field_d = 3;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (2 != ((ga) this).field_d) {
                        break L14;
                      } else {
                        ((ga) this).field_d = 5;
                        break L14;
                      }
                    }
                    if (((ga) this).field_d == 9) {
                      ((ga) this).field_d = 7;
                      return;
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
            } else {
              L15: {
                ((ga) this).field_d = 1;
                if (((ga) this).field_d == 3) {
                  ((ga) this).field_d = 2;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (((ga) this).field_d == 4) {
                  ((ga) this).field_d = 9;
                  break L16;
                } else {
                  break L16;
                }
              }
              if (((ga) this).field_d == 5) {
                L17: {
                  ((ga) this).field_d = 1;
                  if (((ga) this).field_d == 6) {
                    ((ga) this).field_d = 2;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (((ga) this).field_d == 7) {
                    ((ga) this).field_d = 9;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (((ga) this).field_d == 8) {
                  ((ga) this).field_d = 1;
                  if (((ga) this).field_d == 11) {
                    L19: {
                      ((ga) this).field_d = 2;
                      if (Terraphoenix.field_V == 0) {
                        break L19;
                      } else {
                        L20: {
                          if (((ga) this).field_d == 1) {
                            ((ga) this).field_d = 3;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (2 != ((ga) this).field_d) {
                            break L21;
                          } else {
                            ((ga) this).field_d = 5;
                            break L21;
                          }
                        }
                        if (((ga) this).field_d != 9) {
                          break L19;
                        } else {
                          ((ga) this).field_d = 7;
                          break L19;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((ga) this).field_d == 11) {
                    L22: {
                      ((ga) this).field_d = 2;
                      if (Terraphoenix.field_V == 0) {
                        break L22;
                      } else {
                        L23: {
                          if (((ga) this).field_d == 1) {
                            ((ga) this).field_d = 3;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (2 != ((ga) this).field_d) {
                            break L24;
                          } else {
                            ((ga) this).field_d = 5;
                            break L24;
                          }
                        }
                        if (((ga) this).field_d != 9) {
                          break L22;
                        } else {
                          ((ga) this).field_d = 7;
                          break L22;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L25: {
                  if (((ga) this).field_d == 6) {
                    ((ga) this).field_d = 2;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (((ga) this).field_d == 7) {
                    ((ga) this).field_d = 9;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (((ga) this).field_d != 8) {
                    break L27;
                  } else {
                    ((ga) this).field_d = 1;
                    break L27;
                  }
                }
                if (((ga) this).field_d == 11) {
                  L28: {
                    ((ga) this).field_d = 2;
                    if (Terraphoenix.field_V == 0) {
                      break L28;
                    } else {
                      L29: {
                        if (((ga) this).field_d == 1) {
                          ((ga) this).field_d = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        if (2 != ((ga) this).field_d) {
                          break L30;
                        } else {
                          ((ga) this).field_d = 5;
                          break L30;
                        }
                      }
                      if (((ga) this).field_d != 9) {
                        break L28;
                      } else {
                        ((ga) this).field_d = 7;
                        break L28;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static void b(byte param0) {
        if (null != a.field_b) {
          if (param0 < 19) {
            return;
          } else {
            L0: {
              hk.a((java.awt.Canvas) (Object) a.field_b, (byte) -91);
              a.field_b.a(nj.field_l, 4);
              a.field_b = null;
              if (ab.field_b != null) {
                ab.field_b.a(101);
                break L0;
              } else {
                break L0;
              }
            }
            ae.field_G.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    final static void d(int param0) {
        int var1 = mk.a(-1);
        int var2 = mc.a(55);
        ck.field_a.a(var1 + (nb.field_e << 1), vi.field_o + -nb.field_e, var2 - -(eb.field_D << 1), 0, -eb.field_D + jh.field_m);
        field_p = null;
        sh.a(6401);
    }

    private final void a(byte param0) {
        String[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ((ga) this).field_y = true;
        var2 = ph.field_r;
        if (((ga) this).field_d == 1) {
          L0: {
            ((ga) this).field_y = false;
            var2 = rl.field_b;
            ((ga) this).field_g = (int)(Math.random() * (double)var2.length);
            ((ga) this).field_f = (int)(Math.random() * (double)af.field_d.length);
            var3 = ((ga) this).field_g & 127;
            if (var3 <= var2.length) {
              break L0;
            } else {
              var3 = var3 % var2.length;
              break L0;
            }
          }
          L1: {
            var4 = ((ga) this).field_f;
            if (af.field_d.length >= var4) {
              break L1;
            } else {
              var4 = var4 % af.field_d.length;
              break L1;
            }
          }
          L2: {
            ((ga) this).field_n = var2[var3];
            ((ga) this).field_z = af.field_d[var4];
            if (!((ga) this).field_y) {
              break L2;
            } else {
              ((ga) this).field_g = ((ga) this).field_g | 128;
              break L2;
            }
          }
          L3: {
            if (((ga) this).field_n.compareTo("Yi") == -1) {
              break L3;
            } else {
              if (0 == ((ga) this).field_n.compareTo("Thomas")) {
                break L3;
              } else {
                return;
              }
            }
          }
          if (-1 != ((ga) this).field_z.compareTo("de Rivaz")) {
            return;
          } else {
            ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
            ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
            ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
            ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
            ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
            return;
          }
        } else {
          if (((ga) this).field_d == 2) {
            L4: {
              ((ga) this).field_y = false;
              var2 = rl.field_b;
              ((ga) this).field_g = (int)(Math.random() * (double)var2.length);
              ((ga) this).field_f = (int)(Math.random() * (double)af.field_d.length);
              var3 = ((ga) this).field_g & 127;
              if (var3 <= var2.length) {
                break L4;
              } else {
                var3 = var3 % var2.length;
                break L4;
              }
            }
            L5: {
              var4 = ((ga) this).field_f;
              if (af.field_d.length >= var4) {
                break L5;
              } else {
                var4 = var4 % af.field_d.length;
                break L5;
              }
            }
            ((ga) this).field_n = var2[var3];
            ((ga) this).field_z = af.field_d[var4];
            if (((ga) this).field_y) {
              L6: {
                ((ga) this).field_g = ((ga) this).field_g | 128;
                if (((ga) this).field_n.compareTo("Yi") == -1) {
                  break L6;
                } else {
                  if (0 == ((ga) this).field_n.compareTo("Thomas")) {
                    break L6;
                  } else {
                    return;
                  }
                }
              }
              if (-1 == ((ga) this).field_z.compareTo("de Rivaz")) {
                ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                return;
              } else {
                return;
              }
            } else {
              if (((ga) this).field_n.compareTo("Yi") != -1) {
                if (0 != ((ga) this).field_n.compareTo("Thomas")) {
                  return;
                } else {
                  L7: {
                    if (-1 != ((ga) this).field_z.compareTo("de Rivaz")) {
                      break L7;
                    } else {
                      ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                      ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                      ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                      ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                      ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  if (-1 != ((ga) this).field_z.compareTo("de Rivaz")) {
                    break L8;
                  } else {
                    ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                    ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                    ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                    ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                    ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                    break L8;
                  }
                }
                return;
              }
            }
          } else {
            if (((ga) this).field_d != 9) {
              L9: {
                ((ga) this).field_g = (int)(Math.random() * (double)var2.length);
                ((ga) this).field_f = (int)(Math.random() * (double)af.field_d.length);
                var3 = ((ga) this).field_g & 127;
                if (var3 <= var2.length) {
                  break L9;
                } else {
                  var3 = var3 % var2.length;
                  break L9;
                }
              }
              L10: {
                var4 = ((ga) this).field_f;
                if (af.field_d.length >= var4) {
                  break L10;
                } else {
                  var4 = var4 % af.field_d.length;
                  break L10;
                }
              }
              ((ga) this).field_n = var2[var3];
              ((ga) this).field_z = af.field_d[var4];
              if (!((ga) this).field_y) {
                L11: {
                  if (((ga) this).field_n.compareTo("Yi") == -1) {
                    break L11;
                  } else {
                    if (0 == ((ga) this).field_n.compareTo("Thomas")) {
                      break L11;
                    } else {
                      return;
                    }
                  }
                }
                if (-1 != ((ga) this).field_z.compareTo("de Rivaz")) {
                  return;
                } else {
                  ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                  ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                  ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                  ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                  ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                  return;
                }
              } else {
                L12: {
                  ((ga) this).field_g = ((ga) this).field_g | 128;
                  if (((ga) this).field_n.compareTo("Yi") == -1) {
                    break L12;
                  } else {
                    if (0 == ((ga) this).field_n.compareTo("Thomas")) {
                      break L12;
                    } else {
                      return;
                    }
                  }
                }
                if (-1 == ((ga) this).field_z.compareTo("de Rivaz")) {
                  ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                  ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                  ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                  ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                  ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L13: {
                ((ga) this).field_y = false;
                var2 = rl.field_b;
                ((ga) this).field_g = (int)(Math.random() * (double)var2.length);
                ((ga) this).field_f = (int)(Math.random() * (double)af.field_d.length);
                var3 = ((ga) this).field_g & 127;
                if (var3 <= var2.length) {
                  break L13;
                } else {
                  var3 = var3 % var2.length;
                  break L13;
                }
              }
              L14: {
                var4 = ((ga) this).field_f;
                if (af.field_d.length >= var4) {
                  break L14;
                } else {
                  var4 = var4 % af.field_d.length;
                  break L14;
                }
              }
              ((ga) this).field_n = var2[var3];
              ((ga) this).field_z = af.field_d[var4];
              if (!((ga) this).field_y) {
                L15: {
                  if (((ga) this).field_n.compareTo("Yi") == -1) {
                    break L15;
                  } else {
                    if (0 == ((ga) this).field_n.compareTo("Thomas")) {
                      break L15;
                    } else {
                      return;
                    }
                  }
                }
                if (-1 == ((ga) this).field_z.compareTo("de Rivaz")) {
                  ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                  ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                  ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                  ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                  ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                  return;
                } else {
                  return;
                }
              } else {
                ((ga) this).field_g = ((ga) this).field_g | 128;
                if (((ga) this).field_n.compareTo("Yi") != -1) {
                  if (0 != ((ga) this).field_n.compareTo("Thomas")) {
                    return;
                  } else {
                    L16: {
                      if (-1 != ((ga) this).field_z.compareTo("de Rivaz")) {
                        break L16;
                      } else {
                        ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                        ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                        ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                        ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                        ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    if (-1 != ((ga) this).field_z.compareTo("de Rivaz")) {
                      break L17;
                    } else {
                      ((ga) this).field_t = (int)(20.0 * Math.random()) + 50;
                      ((ga) this).field_w = 50 + (int)(20.0 * Math.random());
                      ((ga) this).field_v = 50 + (int)(20.0 * Math.random());
                      ((ga) this).field_B = (int)(Math.random() * 20.0) + 50;
                      ((ga) this).field_q = (int)(20.0 * Math.random()) + 50;
                      break L17;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_l = null;
        field_p = null;
        field_a = null;
        field_r = null;
        field_o = null;
        if (!param0) {
          return;
        } else {
          field_p = null;
          return;
        }
    }

    final static bg[] a(byte param0, int param1, fa param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bg[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (vh.a(param3, param1, param2, true)) {
              var4_int = 35 / ((-65 - param0) / 58);
              stackOut_3_0 = uc.o(-28336);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bg[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ga.L(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, int param1, cc param2) {
        try {
            qb.field_a.a((uf) (Object) param2, -16611);
            if (param0 != 7) {
                ga.d(113);
            }
            ia.a(param1, param2, -74);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ga.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(int param0) {
        String[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((128 & ((ga) this).field_g) <= 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ga) this).field_y = stackIn_3_1 != 0;
        if (param0 != 50) {
          L1: {
            ((ga) this).field_g = 19;
            var2 = ph.field_r;
            if (!((ga) this).field_y) {
              var2 = rl.field_b;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var3 = 127 & ((ga) this).field_g;
            if (var3 <= var2.length) {
              break L2;
            } else {
              var3 = var3 % var2.length;
              break L2;
            }
          }
          L3: {
            var4 = ((ga) this).field_f;
            if (af.field_d.length < var4) {
              var4 = var4 % af.field_d.length;
              break L3;
            } else {
              break L3;
            }
          }
          ((ga) this).field_n = var2[var3];
          ((ga) this).field_z = af.field_d[var4];
          return;
        } else {
          L4: {
            var2 = ph.field_r;
            if (!((ga) this).field_y) {
              var2 = rl.field_b;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var3 = 127 & ((ga) this).field_g;
            if (var3 <= var2.length) {
              break L5;
            } else {
              var3 = var3 % var2.length;
              break L5;
            }
          }
          L6: {
            var4 = ((ga) this).field_f;
            if (af.field_d.length < var4) {
              var4 = var4 % af.field_d.length;
              break L6;
            } else {
              break L6;
            }
          }
          ((ga) this).field_n = var2[var3];
          ((ga) this).field_z = af.field_d[var4];
          return;
        }
    }

    final String a(int param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Terraphoenix.field_V;
                    var3 = ((ga) this).field_n + " " + ((ga) this).field_z;
                    if (((ga) this).field_h != 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = "# " + var3;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (((ga) this).field_h != 2) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = "$ " + var3;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (((ga) this).field_h != 3) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3 = "@ " + var3;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4 = 20;
                    if (param0 == -1426) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((ga) this).field_h = 55;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param1 >= og.field_f.b(var3)) {
                        statePc = 41;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = ~var4;
                    stackOut_9_1 = -2;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var6 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 >= stackIn_10_1) {
                        statePc = 41;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 > stackIn_12_1) {
                        statePc = 52;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (param1 >= og.field_f.b(var3)) {
                        statePc = 21;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3 = mm.a(((ga) this).field_z.charAt(0), 0);
                    if (((ga) this).field_h != 1) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3 = "# " + var3;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((ga) this).field_h == 2) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var3 = "$ " + var3;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (((ga) this).field_h != 3) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3 = "@ " + var3;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return var3;
                }
                case 22: {
                    var3 = mm.a(((ga) this).field_n.charAt(0), 0);
                    var5 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var5 >= var4) {
                        statePc = 34;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = ((ga) this).field_n.length();
                    stackOut_24_1 = var5;
                    stackIn_28_0 = stackOut_24_0;
                    stackIn_28_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (var6 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 != stackIn_25_1) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (stackIn_28_0 <= stackIn_28_1) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3 = var3 + ((ga) this).field_n.charAt(var5);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var5++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 34: {
                    var3 = var3 + "." + ((ga) this).field_z;
                    if (1 != ((ga) this).field_h) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var3 = "# " + var3;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (2 != ((ga) this).field_h) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var3 = "$ " + var3;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (((ga) this).field_h != 3) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var3 = "@ " + var3;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var4--;
                    if (var6 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var4 = 20;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (param1 < og.field_f.b(var3)) {
                        statePc = 52;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (param1 >= og.field_f.b(var3)) {
                        statePc = 51;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var3 = mm.a(((ga) this).field_z.charAt(0), 0);
                    if (((ga) this).field_h != 1) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var3 = "# " + var3;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (((ga) this).field_h == 2) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var3 = "$ " + var3;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (((ga) this).field_h != 3) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var3 = "@ " + var3;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return var3;
                }
                case 52: {
                    if (var4 <= 0) {
                        statePc = 77;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var3 = ((ga) this).field_n.charAt(0) + ".";
                    var5 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var5 >= var4) {
                        statePc = 65;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = var5;
                    stackOut_55_1 = ((ga) this).field_z.length();
                    stackIn_59_0 = stackOut_55_0;
                    stackIn_59_1 = stackOut_55_1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    if (var6 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 == stackIn_56_1) {
                        statePc = 67;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 < stackIn_59_1) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3 = var3 + ((ga) this).field_z.charAt(var5);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var5++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 65: {
                    if (((ga) this).field_h == 1) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var3 = "# " + var3;
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    var3 = "# " + var3;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (2 == ((ga) this).field_h) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var3 = "$ " + var3;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var4--;
                    if (((ga) this).field_h != 3) {
                        statePc = 42;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var3 = "@ " + var3;
                    if (var6 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    return var3;
                }
                case 77: {
                    if (param1 >= og.field_f.b(var3)) {
                        statePc = 86;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var3 = mm.a(((ga) this).field_z.charAt(0), 0);
                    if (((ga) this).field_h != 1) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var3 = "# " + var3;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (((ga) this).field_h == 2) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var3 = "$ " + var3;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (((ga) this).field_h != 3) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var3 = "@ " + var3;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    return var3;
                }
                case 86: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String b(int param0) {
        if (!(param0 != ((ga) this).field_h)) {
            return og.field_g + ((ga) this).field_n + " " + ((ga) this).field_z;
        }
        if (((ga) this).field_h == 2) {
            return wj.field_d + ((ga) this).field_n + " " + ((ga) this).field_z;
        }
        if (!(((ga) this).field_h != 3)) {
            return cf.field_c + ((ga) this).field_n + " " + ((ga) this).field_z;
        }
        return ((ga) this).field_n + " " + ((ga) this).field_z;
    }

    ga() {
        ((ga) this).field_b = null;
        ((ga) this).field_A = null;
        ((ga) this).field_i = null;
        ((ga) this).field_m = null;
        ((ga) this).field_t = (int)(15.0 * Math.random()) + 25;
        ((ga) this).field_w = 40 - -(int)(Math.random() * 20.0);
        ((ga) this).field_v = (int)(Math.random() * 45.0) + 15;
        ((ga) this).field_B = 25 - -(int)(Math.random() * 35.0);
        ((ga) this).field_w = ((ga) this).field_w + ha.field_q * 5;
        ((ga) this).field_e = 0;
        ((ga) this).field_t = ((ga) this).field_t + ha.field_q * 10;
        ((ga) this).field_h = 0;
        ((ga) this).field_q = 50;
        ((ga) this).field_v = ((ga) this).field_v + 8 * ha.field_q;
        ((ga) this).field_B = ((ga) this).field_B + ha.field_q * 5;
        ((ga) this).field_d = (int)(12.0 * Math.random());
        this.a((byte) 85);
        ((ga) this).c((byte) 41);
        ((ga) this).field_b = new oh((int)(2.0 * Math.random()) + 2);
        ((ga) this).field_b.field_d = 8;
        ((ga) this).field_A = new oh(0);
        ((ga) this).field_A.field_d = 8;
        ((ga) this).field_i = new oh(5);
        ((ga) this).field_s = ((ga) this).field_w;
        ((ga) this).field_i.field_c = 2;
        ((ga) this).field_u = ((ga) this).field_v;
        ((ga) this).field_i.field_d = 2;
        ((ga) this).field_m = new pc();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new jj();
        field_j = 0;
        field_p = "Type your email address again to make sure it's correct";
        field_o = new java.math.BigInteger("65537");
        field_r = new jj();
        field_c = -1;
        field_l = "to keep fullscreen or";
        field_a = "to over <%0> great games";
    }
}

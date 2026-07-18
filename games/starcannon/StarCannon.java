/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class StarCannon extends ag {
    private int field_D;
    static int[] field_y;
    static String field_C;
    static int field_z;
    private int field_B;
    static char field_E;
    public static int field_A;

    private final void t(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != fb.field_g) {
                vb.a(fb.field_g, 30962);
                fb.field_g = null;
                tc.j(param0 ^ -23491);
                break L1;
              } else {
                break L1;
              }
            }
            lj.field_h = b.a(false, 1);
            nd.field_p = b.a(false, 2);
            if (param0 == -23523) {
              se.field_l = b.a(false, 3);
              jg.field_F = b.a(false, 4);
              cb.field_c = b.a(false, 5);
              ej.a(fi.field_f, lf.field_eb, param0 + 23396);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) (Object) runtimeException, "StarCannon.AA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bf var3_ref = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        id[] var10_ref_id__ = null;
        String var10_ref_String = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        d stackIn_4_0 = null;
        d stackIn_21_0 = null;
        Object stackIn_39_0 = null;
        d stackIn_39_1 = null;
        d stackIn_58_0 = null;
        Object stackIn_77_0 = null;
        d stackIn_77_1 = null;
        d stackIn_84_0 = null;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_204_0 = 0;
        int stackIn_204_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        d stackOut_3_0 = null;
        d stackOut_20_0 = null;
        Object stackOut_38_0 = null;
        d stackOut_38_1 = null;
        d stackOut_83_0 = null;
        Object stackOut_75_0 = null;
        d stackOut_75_1 = null;
        d stackOut_57_0 = null;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_203_0 = 0;
        int stackOut_203_1 = 0;
        var13 = field_A;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (var3_int >= 4000) {
                          break L6;
                        } else {
                          stackOut_3_0 = qc.field_c[var3_int];
                          stackIn_84_0 = stackOut_3_0;
                          stackIn_4_0 = stackOut_3_0;
                          if (var13 != 0) {
                            break L5;
                          } else {
                            L7: {
                              if (stackIn_4_0 == null) {
                                break L7;
                              } else {
                                if (qc.field_c[var3_int].field_h == 4) {
                                  qc.field_c[var3_int].a(320 + -fi.field_e.field_f, 123);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3_int++;
                            if (var13 == 0) {
                              continue L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L8: {
                        L9: {
                          param0 = 100 + -param0 >> 2113265346;
                          if (qc.field_d < 1) {
                            break L9;
                          } else {
                            fh.field_q.d(0, vd.field_j, 640, 480, 128);
                            fh.field_q.d(0, -480 + vd.field_j, 640, 480, 128);
                            if (var13 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var3_int = 0;
                        L10: while (true) {
                          if (var3_int >= 4000) {
                            break L8;
                          } else {
                            stackOut_20_0 = qc.field_c[var3_int];
                            stackIn_84_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var13 != 0) {
                              break L5;
                            } else {
                              L11: {
                                if (stackIn_21_0 == null) {
                                  break L11;
                                } else {
                                  if (qc.field_c[var3_int].field_h == 3) {
                                    qc.field_c[var3_int].a(320 + -fi.field_e.field_f, -91);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var3_int++;
                              if (var13 == 0) {
                                continue L10;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      if (param1 == 7306) {
                        var3_ref = (bf) (Object) kh.field_y.c(-3905);
                        L12: while (true) {
                          L13: {
                            if (null == var3_ref) {
                              break L13;
                            } else {
                              var3_ref.a(65535, 320 - fi.field_e.field_f);
                              var3_ref = (bf) (Object) kh.field_y.a(-16913);
                              if (var13 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var3_int = 0;
                          L14: while (true) {
                            L15: {
                              if (var3_int >= 4000) {
                                break L15;
                              } else {
                                stackOut_38_0 = null;
                                stackOut_38_1 = qc.field_c[var3_int];
                                stackIn_77_0 = stackOut_38_0;
                                stackIn_77_1 = stackOut_38_1;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                if (var13 != 0) {
                                  L16: while (true) {
                                    L17: {
                                      if (stackIn_77_0 == (Object) (Object) stackIn_77_1) {
                                        break L17;
                                      } else {
                                        if (2 == qc.field_c[var3_int].field_h) {
                                          qc.field_c[var3_int].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                                          stackOut_83_0 = qc.field_c[var3_int];
                                          stackIn_84_0 = stackOut_83_0;
                                          ((d) (Object) stackIn_84_0).a(320 - fi.field_e.field_f, -56);
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var13 == 0) {
                                      if (var3_int >= 4000) {
                                        break L4;
                                      } else {
                                        if (var13 != 0) {
                                          break L3;
                                        } else {
                                          stackOut_75_0 = null;
                                          stackOut_75_1 = qc.field_c[var3_int];
                                          stackIn_77_0 = stackOut_75_0;
                                          stackIn_77_1 = stackOut_75_1;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  L18: {
                                    if (stackIn_39_0 == (Object) (Object) stackIn_39_1) {
                                      break L18;
                                    } else {
                                      if (qc.field_c[var3_int].field_h == 2) {
                                        break L18;
                                      } else {
                                        if (qc.field_c[var3_int].field_h == 3) {
                                          break L18;
                                        } else {
                                          if (qc.field_c[var3_int].field_h != 4) {
                                            qc.field_c[var3_int].a(-fi.field_e.field_f + 320, 54);
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var3_int++;
                                  if (var13 == 0) {
                                    continue L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            var3_int = 0;
                            L19: while (true) {
                              L20: {
                                if (var3_int >= 4000) {
                                  break L20;
                                } else {
                                  stackOut_57_0 = qc.field_c[var3_int];
                                  stackIn_84_0 = stackOut_57_0;
                                  stackIn_58_0 = stackOut_57_0;
                                  if (var13 != 0) {
                                    break L5;
                                  } else {
                                    L21: {
                                      if (stackIn_58_0 == null) {
                                        break L21;
                                      } else {
                                        if (qc.field_c[var3_int].field_h == 2) {
                                          qc.field_c[var3_int].b(-fi.field_e.field_f + 320, 128);
                                          qc.field_c[var3_int].a(-fi.field_e.field_f + 320, param1 ^ 7322);
                                          break L21;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var13 == 0) {
                                      continue L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              L22: {
                                if (qc.field_d == 2) {
                                  gi.a(param1 + -7302);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              var3_int = 0;
                              L23: while (true) {
                                if (var3_int >= 4000) {
                                  break L4;
                                } else {
                                  if (var13 != 0) {
                                    break L3;
                                  } else {
                                    stackOut_75_0 = null;
                                    stackOut_75_1 = qc.field_c[var3_int];
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    L24: {
                                      if (stackIn_77_0 == (Object) (Object) stackIn_77_1) {
                                        break L24;
                                      } else {
                                        if (2 == qc.field_c[var3_int].field_h) {
                                          qc.field_c[var3_int].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                                          stackOut_83_0 = qc.field_c[var3_int];
                                          stackIn_84_0 = stackOut_83_0;
                                          ((d) (Object) stackIn_84_0).a(320 - fi.field_e.field_f, -56);
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var13 == 0) {
                                      continue L23;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                    L25: while (true) {
                      ((d) (Object) stackIn_84_0).a(320 - fi.field_e.field_f, -56);
                      L26: while (true) {
                        var3_int++;
                        if (var13 == 0) {
                          if (var3_int >= 4000) {
                            break L4;
                          } else {
                            if (var13 != 0) {
                              break L3;
                            } else {
                              stackOut_75_0 = null;
                              stackOut_75_1 = qc.field_c[var3_int];
                              stackIn_77_0 = stackOut_75_0;
                              stackIn_77_1 = stackOut_75_1;
                              if (stackIn_77_0 == (Object) (Object) stackIn_77_1) {
                                continue L26;
                              } else {
                                if (2 == qc.field_c[var3_int].field_h) {
                                  qc.field_c[var3_int].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                                  stackOut_83_0 = qc.field_c[var3_int];
                                  stackIn_84_0 = stackOut_83_0;
                                  continue L25;
                                } else {
                                  continue L26;
                                }
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (gj.field_c > -1) {
                    var3_int = af.field_y.a(vk.field_w);
                    ba.a(24, gb.field_v, (byte) -127, -var3_int + 604 - 17, 17 + var3_int, 455 + param0);
                    nb.a(param0 + 455, (byte) 122, var3_int - -17, ma.field_e, -17 + -var3_int + 604, 128, 24);
                    af.field_y.c(vk.field_w, 596, 472 + param0, 16777215, -1);
                    ba.a(24, ma.field_a, (byte) 21, 604, 35, 455 - -param0);
                    nb.a(455 - -param0, (byte) 122, 35, ha.field_a, 604, 128, 24);
                    vb.field_l.e(609, param0 + 460);
                    af.field_y.a(Integer.toString(gj.field_c), 626, 472 - -param0, 16777215, -1);
                    break L3;
                  } else {
                    break L2;
                  }
                }
                L27: {
                  var4_ref_String = be.field_b;
                  var5 = 65535;
                  var6 = 32896;
                  if (qb.field_e != 1) {
                    break L27;
                  } else {
                    var5 = 65280;
                    var6 = 32768;
                    var4_ref_String = b.field_d;
                    break L27;
                  }
                }
                L28: {
                  if (qb.field_e == 2) {
                    var4_ref_String = ve.field_g;
                    var5 = 16776960;
                    var6 = 16711680;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  var7 = 6;
                  if (rj.field_h != 1) {
                    break L29;
                  } else {
                    var7 = 10;
                    break L29;
                  }
                }
                L30: {
                  if (rj.field_h == 2) {
                    var7 = 16;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (3 == rj.field_h) {
                    var7 = 17;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                var3_int = af.field_y.a(var4_ref_String);
                ba.a(24, gb.field_v, (byte) -122, 1, var3_int - -17, 455 - -param0);
                nb.a(param0 + 455, (byte) 122, var3_int + 17, ma.field_e, 1, 128, 24);
                af.field_y.a(var4_ref_String, 10, 472 - -param0, 16777215, -1);
                var8 = 23 + var3_int;
                ba.a(24, ma.field_a, (byte) -115, var8 - 5, 10 + var7 * 5, param0 + 455);
                nb.a(param0 + 455, (byte) 122, 10 + var7 * 5, ha.field_a, var8 + -5, 128, 24);
                var9 = 0;
                L32: while (true) {
                  L33: {
                    L34: {
                      if (var7 <= var9) {
                        break L34;
                      } else {
                        stackOut_108_0 = ~var9;
                        stackOut_108_1 = ~sd.field_c;
                        stackIn_119_0 = stackOut_108_0;
                        stackIn_119_1 = stackOut_108_1;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        if (var13 != 0) {
                          break L33;
                        } else {
                          L35: {
                            L36: {
                              if (stackIn_109_0 <= stackIn_109_1) {
                                break L36;
                              } else {
                                ki.d(var8, 460 - -param0, 4, 14, var5);
                                if (var13 == 0) {
                                  break L35;
                                } else {
                                  break L36;
                                }
                              }
                            }
                            ki.d(var8, 465 + param0, 4, 4, var5);
                            break L35;
                          }
                          var8 += 5;
                          var9++;
                          if (var13 == 0) {
                            continue L32;
                          } else {
                            break L34;
                          }
                        }
                      }
                    }
                    stackOut_118_0 = ~ie.field_C;
                    stackOut_118_1 = -1;
                    stackIn_119_0 = stackOut_118_0;
                    stackIn_119_1 = stackOut_118_1;
                    break L33;
                  }
                  L37: {
                    if (stackIn_119_0 >= stackIn_119_1) {
                      break L37;
                    } else {
                      var9 = -(af.field_y.field_p / 2) + af.field_w[16 + qb.field_e].field_e + -16;
                      af.field_w[qb.field_e + 16].field_f = af.field_w[qb.field_e + 16].field_f + var9;
                      var4_ref_String = p.field_e;
                      var10_ref_id__ = new id[1];
                      var10_ref_id__[0] = af.field_w[16 + qb.field_e];
                      af.field_y.a((ne[]) (Object) var10_ref_id__, (int[]) null);
                      af.field_y.a(var4_ref_String, 319, 48, var6, -1, 256 - param0 * 10);
                      af.field_y.a(var4_ref_String, 321, 48, var5, -1, -(param0 * 10) + 256);
                      af.field_y.a(var4_ref_String, 320, 47, var5, -1, -(10 * param0) + 256);
                      af.field_y.a(var4_ref_String, 320, 49, var6, -1, -(param0 * 10) + 256);
                      af.field_y.a(var4_ref_String, 320, 48, 16777215, -1, -(param0 * 10) + 256);
                      af.field_w[qb.field_e + 16].field_f = af.field_w[qb.field_e + 16].field_f - var9;
                      break L37;
                    }
                  }
                  L38: {
                    var9 = 10 * ia.field_k;
                    if (nf.field_l == 0) {
                      var9 = var9 >> 2;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    if (nf.field_l == 2) {
                      var9 = var9 << 1;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  L40: {
                    if (!a.field_a) {
                      L41: {
                        var3_int = af.field_y.a(rd.field_o);
                        ba.a(24, gb.field_v, (byte) -118, -var3_int + 311, 17 + var3_int, -param0 + 1);
                        nb.a(1 + -param0, (byte) 122, var3_int + 17, ma.field_e, 311 - var3_int, 128, 24);
                        af.field_y.c(rd.field_o, 320, -param0 + 18, 16777215, -1);
                        var10_ref_String = Integer.toString(var9);
                        var3_int = 11 + af.field_y.a(var10_ref_String);
                        var11 = 5 - var3_int % 5;
                        if (var11 < 5) {
                          var3_int = var3_int + var11;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      ba.a(24, ma.field_a, (byte) -113, 328, var3_int, -param0 + 1);
                      nb.a(-param0 + 1, (byte) 122, var3_int, ha.field_a, 328, 128, 24);
                      af.field_y.a(var10_ref_String, 333, -param0 + 18, 16777215, -1);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  if (ua.field_c >= -2) {
                    break L2;
                  } else {
                    L42: {
                      if (gj.field_c != 0) {
                        break L42;
                      } else {
                        if (fi.field_e.field_k != 0) {
                          break L42;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L43: {
                      var10_ref_String = "";
                      if (rj.field_h == 0) {
                        var10_ref_String = eg.field_i;
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    L44: {
                      if (rj.field_h == 1) {
                        var10_ref_String = ig.field_c;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      if (2 == rj.field_h) {
                        var10_ref_String = qc.field_a;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L46: {
                      if (3 != rj.field_h) {
                        break L46;
                      } else {
                        if (nf.field_l != 2) {
                          break L46;
                        } else {
                          var10_ref_String = vf.field_a;
                          break L46;
                        }
                      }
                    }
                    L47: {
                      if (rj.field_h != 4) {
                        break L47;
                      } else {
                        L48: {
                          if (u.field_d <= 0) {
                            break L48;
                          } else {
                            L49: {
                              if (nf.field_l == 0) {
                                break L49;
                              } else {
                                L50: {
                                  if (1 == nf.field_l) {
                                    break L50;
                                  } else {
                                    var10_ref_String = jg.field_I + var9;
                                    if (var13 == 0) {
                                      break L47;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                var10_ref_String = d.field_n + var9 + eh.field_c;
                                if (var13 == 0) {
                                  break L47;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            var10_ref_String = d.field_n + var9 + jf.field_b;
                            if (var13 == 0) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        var10_ref_String = bc.field_l + var9 + sb.field_o;
                        break L47;
                      }
                    }
                    int discarded$1 = af.field_y.a(var10_ref_String, 0, 0, 640, 480, 16777215, -1, -(10 * param0) + 256, 1, 1, af.field_y.field_p);
                    break L2;
                  }
                }
              }
              L51: {
                L52: {
                  if (tj.field_C > 0) {
                    L53: {
                      L54: {
                        var3_int = 255 * dl.field_a / tj.field_C;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        if (var3_int >= 128) {
                          break L54;
                        } else {
                          var4 = 255;
                          var5 = var3_int * 2;
                          if (var13 == 0) {
                            break L53;
                          } else {
                            break L54;
                          }
                        }
                      }
                      var5 = 255;
                      var4 = -(var3_int * 2) + 256 + 255;
                      break L53;
                    }
                    var6 = (var4 << -303548560) - -(var5 << 590704456);
                    var7 = 0;
                    L55: while (true) {
                      L56: {
                        if (var7 >= var3_int) {
                          break L56;
                        } else {
                          stackOut_186_0 = ~var7;
                          stackOut_186_1 = -11;
                          stackIn_204_0 = stackOut_186_0;
                          stackIn_204_1 = stackOut_186_1;
                          stackIn_187_0 = stackOut_186_0;
                          stackIn_187_1 = stackOut_186_1;
                          if (var13 != 0) {
                            break L51;
                          } else {
                            L57: {
                              L58: {
                                if (stackIn_187_0 > stackIn_187_1) {
                                  break L58;
                                } else {
                                  if (var7 > -10 + var3_int) {
                                    break L58;
                                  } else {
                                    if (10 != var7) {
                                      break L57;
                                    } else {
                                      ki.d(-(var3_int >> -1169524703) + (320 - -var7) - 5, 27, 10 + (var3_int - 20), 11, var6);
                                      if (var13 == 0) {
                                        break L57;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                }
                              }
                              ki.c(320 + (var7 - (var3_int >> -964598463)), 32, 5, var6, 255 - Math.abs(var7 + -(var3_int >> -1593881151)));
                              break L57;
                            }
                            var7++;
                            if (var13 == 0) {
                              continue L55;
                            } else {
                              break L56;
                            }
                          }
                        }
                      }
                      af.field_y.a(s.field_h, 319, 38, 0, -1, var3_int);
                      af.field_y.a(s.field_h, 321, 38, 0, -1, var3_int);
                      af.field_y.a(s.field_h, 320, 37, 0, -1, var3_int);
                      af.field_y.a(s.field_h, 320, 39, 0, -1, var3_int);
                      af.field_y.a(s.field_h, 320, 38, 16777215, -1, var3_int);
                      break L52;
                    }
                  } else {
                    break L52;
                  }
                }
                stackOut_203_0 = 0;
                stackOut_203_1 = fi.field_e.field_k;
                stackIn_204_0 = stackOut_203_0;
                stackIn_204_1 = stackOut_203_1;
                break L51;
              }
              L59: {
                if (stackIn_204_0 != stackIn_204_1) {
                  break L59;
                } else {
                  if (gj.field_c != 0) {
                    break L59;
                  } else {
                    L60: {
                      L61: {
                        if (fi.field_e.field_r >= 25) {
                          break L61;
                        } else {
                          var3_int = fi.field_e.field_r << -1364493758;
                          if (var13 == 0) {
                            break L60;
                          } else {
                            break L61;
                          }
                        }
                      }
                      L62: {
                        if (165 >= fi.field_e.field_r) {
                          break L62;
                        } else {
                          var3_int = 190 + -fi.field_e.field_r << 1456085122;
                          if (var13 == 0) {
                            break L60;
                          } else {
                            break L62;
                          }
                        }
                      }
                      var3_int = 100;
                      break L60;
                    }
                    var4 = a.field_b.a(ne.field_i);
                    var5 = -60 + (-var4 + 640) >> 1811619073;
                    var6 = -var5 + 640;
                    var7 = var6 + -var5;
                    var8 = 210;
                    var9 = 270;
                    var10 = var9 + var8 >> 1317138177;
                    var9 = (var10 * (-var3_int + 100) - -(var3_int * var9)) / 100;
                    var8 = (var8 * var3_int + var10 * (100 - var3_int)) / 100;
                    var11 = var9 + (-var8 + 5);
                    if (var11 <= 0) {
                      break L59;
                    } else {
                      var12 = new int[4];
                      ki.a(var12);
                      ki.c(var5, var8, var5 + var7, var8 - -var11);
                      ki.b(var5 - -19, 14 + var8, var7 - 38, -28 + var11, 0, 128);
                      ba.a(var11, rd.field_p, (byte) 115, var5, var7, var8);
                      sb.a(true, var7, 10596798, 0, var8, 16711680, var5, var11 >> -162264255);
                      sb.a(true, var7, 0, 10596798, (var11 >> -679206815) + var8, 16711680, var5, -(var11 >> 278882529) + var11);
                      ki.c(var5 + 19, var8 + 14, var7 + (var5 + -19), -14 + (var11 + var8));
                      a.field_b.b(ne.field_i, 320, (a.field_b.field_p + -a.field_b.field_q >> -93328063) + 240, 16777215, -1);
                      ki.b(var12);
                      break L59;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "StarCannon.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        try {
            gj.field_c = gj.field_c + 1;
            dg.field_l = 0;
            mj.a(96, 12, 0, 23, 100);
            mj.a(255, 12, 1200, 45, 100);
            if (!param0) {
                ((StarCannon) this).q(-66);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.Q(" + param0 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!param1) {
                break L1;
              } else {
                var4_int += 4;
                break L1;
              }
            }
            L2: {
              if (param3) {
                var4_int += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                field_E = 'B';
                break L3;
              }
            }
            L4: {
              if (!param2) {
                break L4;
              } else {
                var4_int++;
                break L4;
              }
            }
            stackOut_13_0 = el.field_A[var4_int];
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var4, "StarCannon.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_A;
        try {
          L0: {
            L1: {
              L2: {
                if (ha.field_c != 0) {
                  break L2;
                } else {
                  pf.field_d = pf.field_d + 1;
                  ha.field_c = 1;
                  li.a(-119, new bf(0, -128, -24, 6));
                  li.a(param0 ^ -124, new bf(0, -128, 24, 6));
                  dg.field_l = 0;
                  mj.a(96, 12, 0, 31, 100);
                  mj.a(255, 12, 1200, 36, 100);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (ha.field_c == 1) {
                  break L3;
                } else {
                  if (1 < ha.field_c) {
                    L4: {
                      ha.field_c = ha.field_c + 1;
                      pf.field_d = pf.field_d + 1;
                      if (ha.field_c != 5) {
                        break L4;
                      } else {
                        li.a(-115, new bf(0, -128, -40, 14));
                        li.a(-126, new bf(0, -128, 40, 14));
                        if (hh.field_c == 1) {
                          ph.a(249, false, 6);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    dg.field_l = 0;
                    mj.a(96, param0 + 12, 0, 31, 100);
                    mj.a(255, 12, 1200, 36, 100);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              pf.field_d = pf.field_d + 1;
              dg.field_l = 0;
              ha.field_c = 2;
              mj.a(96, 12, 0, 31, 100);
              mj.a(255, 12, 1200, 36, 100);
              break L1;
            }
            L5: {
              if (param0 == 0) {
                break L5;
              } else {
                field_E = 'ﾌ';
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.DA(" + param0 + ')');
        }
    }

    final void q(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_A;
        try {
          L0: {
            L1: {
              if (param0 == -19049) {
                break L1;
              } else {
                StarCannon.a((ue) null, false, 0, (ue) null, (ue) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (bf.field_w != 0) {
                  break L3;
                } else {
                  bf.field_w = 1;
                  pf.field_d = pf.field_d + 1;
                  li.a(-121, new bf(0, -128, 0, 8));
                  dg.field_l = 0;
                  mj.a(96, 12, 0, 29, 100);
                  mj.a(255, param0 ^ -19045, 1200, 40, 100);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (bf.field_w != 1) {
                  break L4;
                } else {
                  bf.field_w = 2;
                  dg.field_l = 0;
                  pf.field_d = pf.field_d + 1;
                  mj.a(96, 12, 0, 29, 100);
                  mj.a(255, 12, 1200, 40, 100);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (bf.field_w >= 4) {
                  break L5;
                } else {
                  bf.field_w = bf.field_w + 1;
                  dg.field_l = 0;
                  pf.field_d = pf.field_d + 1;
                  mj.a(96, 12, 0, 29, 100);
                  mj.a(255, 12, 1200, 40, 100);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              if (hh.field_c == 0) {
                hh.field_c = 1;
                li.a(param0 ^ 18960, new bf(0, -128, 0, 13));
                dg.field_l = 0;
                mj.a(96, 12, 0, 46, 100);
                mj.a(255, param0 ^ -19045, 1200, 38, 100);
                if (ha.field_c != 5) {
                  break L2;
                } else {
                  ph.a(249, false, 6);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.P(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((StarCannon) this).a(-15028, 10, "starcannon");
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.init()");
        }
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        bf var6 = null;
        int var7 = 0;
        bf var7_ref_bf = null;
        bf var8 = null;
        int var9 = 0;
        bf stackIn_83_0 = null;
        bf stackIn_85_0 = null;
        bf stackIn_86_0 = null;
        bf stackIn_88_0 = null;
        bf stackIn_90_0 = null;
        bf stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        bf stackIn_98_0 = null;
        bf stackIn_99_0 = null;
        bf stackIn_101_0 = null;
        bf stackIn_103_0 = null;
        bf stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        bf stackIn_111_0 = null;
        bf stackIn_112_0 = null;
        bf stackIn_114_0 = null;
        bf stackIn_116_0 = null;
        bf stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        bf stackIn_123_0 = null;
        bf stackIn_125_0 = null;
        bf stackIn_126_0 = null;
        bf stackIn_128_0 = null;
        bf stackIn_130_0 = null;
        bf stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_110_0 = null;
        bf stackOut_111_0 = null;
        bf stackOut_112_0 = null;
        bf stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        bf stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        bf stackOut_122_0 = null;
        bf stackOut_123_0 = null;
        bf stackOut_125_0 = null;
        bf stackOut_126_0 = null;
        bf stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        bf stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        bf stackOut_97_0 = null;
        bf stackOut_98_0 = null;
        bf stackOut_99_0 = null;
        bf stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        bf stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        bf stackOut_82_0 = null;
        bf stackOut_83_0 = null;
        bf stackOut_85_0 = null;
        bf stackOut_86_0 = null;
        bf stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        bf stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        var9 = field_A;
        try {
          L0: {
            L1: {
              var2_int = ua.field_c - -5;
              if (~(5 + ue.field_c[rj.field_h]) <= ~var2_int) {
                break L1;
              } else {
                if (~ue.field_c[rj.field_h] > ~ua.field_c) {
                  break L1;
                } else {
                  var2_int = 5 + ue.field_c[rj.field_h];
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                L4: {
                  var3 = sh.b(-126, 640);
                  var4 = -64 + fi.field_e.field_f - -sh.b(38, 128);
                  var5 = null;
                  var7 = var2_int;
                  if (var7 == 1) {
                    break L4;
                  } else {
                    if (var7 == 2) {
                      break L4;
                    } else {
                      if (var7 == 3) {
                        break L4;
                      } else {
                        L5: {
                          if (4 != var7) {
                            break L5;
                          } else {
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var7 != 5) {
                            break L6;
                          } else {
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          L8: {
                            L9: {
                              if (9 != var7) {
                                break L9;
                              } else {
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (11 != var7) {
                                break L10;
                              } else {
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var7 != 6) {
                                break L11;
                              } else {
                                if (var9 == 0) {
                                  break L7;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (var7 == 10) {
                              nf.field_e = nf.field_e + 250;
                              var7_ref_bf = new bf(320, -256, var4, 15);
                              kh.field_y.b(69, (rf) (Object) var7_ref_bf);
                              dg.field_l = 0;
                              ua.field_c = 6;
                              mj.a(255, 12, 0, 41, 100);
                              ti.field_f.a((oa) (Object) kc.field_P);
                              kc.field_P.f();
                              kc.field_P = fl.field_h;
                              ti.field_f.b((oa) (Object) kc.field_P);
                              kc.field_P.a(mc.field_b);
                              break L2;
                            } else {
                              L12: {
                                L13: {
                                  if (7 != var7) {
                                    break L13;
                                  } else {
                                    if (var9 == 0) {
                                      nf.field_e = 0;
                                      var7 = 0;
                                      L14: while (true) {
                                        L15: {
                                          if (var7 >= 5) {
                                            break L15;
                                          } else {
                                            L16: {
                                              L17: {
                                                var8 = new bf(var3, 64 * -var7 + -64, var4, 1);
                                                stackOut_110_0 = (bf) var8;
                                                stackIn_116_0 = stackOut_110_0;
                                                stackIn_111_0 = stackOut_110_0;
                                                if (var7 == 1) {
                                                  break L17;
                                                } else {
                                                  stackOut_111_0 = (bf) (Object) stackIn_111_0;
                                                  stackIn_116_0 = stackOut_111_0;
                                                  stackIn_112_0 = stackOut_111_0;
                                                  if (var7 == 4) {
                                                    break L17;
                                                  } else {
                                                    stackOut_112_0 = (bf) (Object) stackIn_112_0;
                                                    stackIn_114_0 = stackOut_112_0;
                                                    stackOut_114_0 = (bf) (Object) stackIn_114_0;
                                                    stackOut_114_1 = 1;
                                                    stackIn_117_0 = stackOut_114_0;
                                                    stackIn_117_1 = stackOut_114_1;
                                                    break L16;
                                                  }
                                                }
                                              }
                                              stackOut_116_0 = (bf) (Object) stackIn_116_0;
                                              stackOut_116_1 = 0;
                                              stackIn_117_0 = stackOut_116_0;
                                              stackIn_117_1 = stackOut_116_1;
                                              break L16;
                                            }
                                            stackIn_117_0.field_p = stackIn_117_1 != 0;
                                            kh.field_y.b(101, (rf) (Object) var8);
                                            var7++;
                                            if (var9 == 0) {
                                              continue L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        if (var9 == 0) {
                                          break L2;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                L18: {
                                  if (var7 != 8) {
                                    break L18;
                                  } else {
                                    if (var9 == 0) {
                                      break L12;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (var7 != 13) {
                                    break L19;
                                  } else {
                                    if (var9 == 0) {
                                      break L12;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                L20: {
                                  L21: {
                                    if (var7 == 12) {
                                      break L21;
                                    } else {
                                      if (14 == var7) {
                                        break L21;
                                      } else {
                                        if (var7 != 15) {
                                          break L2;
                                        } else {
                                          if (var9 == 0) {
                                            break L20;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  nf.field_e = 175;
                                  kh.field_y.b(82, (rf) (Object) new bf(var3, -64, var4, 4));
                                  if (var9 == 0) {
                                    break L2;
                                  } else {
                                    break L20;
                                  }
                                }
                                var6 = new bf(320, -256, var4, 16);
                                kh.field_y.b(97, (rf) (Object) var6);
                                tj.field_C = var6.field_k;
                                ua.field_c = 1 + ue.field_c[rj.field_h];
                                dg.field_l = 0;
                                pf.field_d = pf.field_d + 1;
                                mj.a(255, param0 ^ -244, 0, 41, 100);
                                ti.field_f.a((oa) (Object) kc.field_P);
                                kc.field_P.f();
                                kc.field_P = fl.field_h;
                                ti.field_f.b((oa) (Object) kc.field_P);
                                kc.field_P.a(mc.field_b);
                                break L2;
                              }
                              nf.field_e = 0;
                              var4 = sh.b(-128, 128) + (var3 + -64);
                              var7 = 0;
                              L22: while (true) {
                                L23: {
                                  if (5 <= var7) {
                                    break L23;
                                  } else {
                                    var8 = new bf(var3, 64 * -var7 + -64, var4, 2);
                                    if (var9 != 0) {
                                      break L2;
                                    } else {
                                      L24: {
                                        L25: {
                                          stackOut_122_0 = (bf) var8;
                                          stackIn_130_0 = stackOut_122_0;
                                          stackIn_123_0 = stackOut_122_0;
                                          if (1 == var7) {
                                            break L25;
                                          } else {
                                            stackOut_123_0 = (bf) (Object) stackIn_123_0;
                                            stackIn_125_0 = stackOut_123_0;
                                            stackOut_125_0 = (bf) (Object) stackIn_125_0;
                                            stackIn_130_0 = stackOut_125_0;
                                            stackIn_126_0 = stackOut_125_0;
                                            if (var7 == 4) {
                                              break L25;
                                            } else {
                                              stackOut_126_0 = (bf) (Object) stackIn_126_0;
                                              stackIn_128_0 = stackOut_126_0;
                                              stackOut_128_0 = (bf) (Object) stackIn_128_0;
                                              stackOut_128_1 = 1;
                                              stackIn_131_0 = stackOut_128_0;
                                              stackIn_131_1 = stackOut_128_1;
                                              break L24;
                                            }
                                          }
                                        }
                                        stackOut_130_0 = (bf) (Object) stackIn_130_0;
                                        stackOut_130_1 = 0;
                                        stackIn_131_0 = stackOut_130_0;
                                        stackIn_131_1 = stackOut_130_1;
                                        break L24;
                                      }
                                      L26: {
                                        stackIn_131_0.field_p = stackIn_131_1 != 0;
                                        var8.field_h = (bf) var5;
                                        if (var7 != 0) {
                                          break L26;
                                        } else {
                                          var5 = (Object) (Object) var8;
                                          break L26;
                                        }
                                      }
                                      kh.field_y.b(param0 ^ -145, (rf) (Object) var8);
                                      var7++;
                                      if (var9 == 0) {
                                        continue L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                }
                                break L2;
                              }
                            }
                          }
                          nf.field_e = 0;
                          var7 = -8;
                          L27: while (true) {
                            L28: {
                              if (var7 >= 8) {
                                break L28;
                              } else {
                                L29: {
                                  L30: {
                                    var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                                    stackOut_97_0 = (bf) var8;
                                    stackIn_103_0 = stackOut_97_0;
                                    stackIn_98_0 = stackOut_97_0;
                                    if (1 == var7) {
                                      break L30;
                                    } else {
                                      stackOut_98_0 = (bf) (Object) stackIn_98_0;
                                      stackIn_103_0 = stackOut_98_0;
                                      stackIn_99_0 = stackOut_98_0;
                                      if (var7 == 4) {
                                        break L30;
                                      } else {
                                        stackOut_99_0 = (bf) (Object) stackIn_99_0;
                                        stackIn_101_0 = stackOut_99_0;
                                        stackOut_101_0 = (bf) (Object) stackIn_101_0;
                                        stackOut_101_1 = 1;
                                        stackIn_104_0 = stackOut_101_0;
                                        stackIn_104_1 = stackOut_101_1;
                                        break L29;
                                      }
                                    }
                                  }
                                  stackOut_103_0 = (bf) (Object) stackIn_103_0;
                                  stackOut_103_1 = 0;
                                  stackIn_104_0 = stackOut_103_0;
                                  stackIn_104_1 = stackOut_103_1;
                                  break L29;
                                }
                                stackIn_104_0.field_p = stackIn_104_1 != 0;
                                kh.field_y.b(123, (rf) (Object) var8);
                                var7++;
                                if (var9 == 0) {
                                  continue L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        nf.field_e = nf.field_e + 250;
                        var7_ref_bf = new bf(320, -256, var4, 11);
                        kh.field_y.b(param0 ^ -170, (rf) (Object) var7_ref_bf);
                        dg.field_l = 0;
                        ua.field_c = 2;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        break L2;
                      }
                    }
                  }
                }
                nf.field_e = var2_int * 25 + 75;
                kh.field_y.b(122, (rf) (Object) new bf(var3, -64, var4, 4));
                if (var9 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              nf.field_e = 0;
              var4 = sh.b(param0 + 129, 128) + (var3 + -64);
              var7 = 0;
              L31: while (true) {
                L32: {
                  if (var7 >= 5) {
                    break L32;
                  } else {
                    var8 = new bf(var3, 64 * -var7 - 64, var4, 2);
                    var8.field_h = (bf) var5;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L33: {
                        L34: {
                          stackOut_82_0 = (bf) var8;
                          stackIn_90_0 = stackOut_82_0;
                          stackIn_83_0 = stackOut_82_0;
                          if (var7 == 1) {
                            break L34;
                          } else {
                            stackOut_83_0 = (bf) (Object) stackIn_83_0;
                            stackIn_85_0 = stackOut_83_0;
                            stackOut_85_0 = (bf) (Object) stackIn_85_0;
                            stackIn_90_0 = stackOut_85_0;
                            stackIn_86_0 = stackOut_85_0;
                            if (var7 == 4) {
                              break L34;
                            } else {
                              stackOut_86_0 = (bf) (Object) stackIn_86_0;
                              stackIn_88_0 = stackOut_86_0;
                              stackOut_88_0 = (bf) (Object) stackIn_88_0;
                              stackOut_88_1 = 1;
                              stackIn_91_0 = stackOut_88_0;
                              stackIn_91_1 = stackOut_88_1;
                              break L33;
                            }
                          }
                        }
                        stackOut_90_0 = (bf) (Object) stackIn_90_0;
                        stackOut_90_1 = 0;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        break L33;
                      }
                      L35: {
                        stackIn_91_0.field_p = stackIn_91_1 != 0;
                        if (var7 != 0) {
                          break L35;
                        } else {
                          var5 = (Object) (Object) var8;
                          break L35;
                        }
                      }
                      kh.field_y.b(param0 ^ -138, (rf) (Object) var8);
                      var7++;
                      if (var9 == 0) {
                        continue L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                }
                break L2;
              }
            }
            L36: {
              if (param0 == -256) {
                break L36;
              } else {
                field_y = null;
                break L36;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.R(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        bf var6 = null;
        int var7 = 0;
        Object var7_ref = null;
        bf var8 = null;
        int var8_int = 0;
        bf var9 = null;
        int var10 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_144_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_139_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_144_0 = 0;
        int stackOut_144_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        var10 = field_A;
        try {
          L0: {
            L1: {
              var2_int = sh.b(-128, 3) + ua.field_c;
              if (ue.field_c[rj.field_h] >= var2_int) {
                break L1;
              } else {
                if (ue.field_c[rj.field_h] < ua.field_c) {
                  break L1;
                } else {
                  var2_int = ue.field_c[rj.field_h];
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                field_C = null;
                break L2;
              }
            }
            L3: {
              var3 = sh.b(-126, 640);
              var4 = -64 + (fi.field_e.field_f - -sh.b(91, 128));
              if (var2_int != 6) {
                break L3;
              } else {
                if (!gi.field_g) {
                  break L3;
                } else {
                  var2_int = 12;
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                L6: {
                  var7 = var2_int;
                  if (0 == var7) {
                    var4 = var3;
                    break L6;
                  } else {
                    if (var7 == 1) {
                      break L6;
                    } else {
                      if (var7 == 2) {
                        break L5;
                      } else {
                        if (var7 == 5) {
                          break L5;
                        } else {
                          L7: {
                            L8: {
                              L9: {
                                if (var7 == 3) {
                                  break L9;
                                } else {
                                  if (var7 == 9) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (var7 != 11) {
                                        break L10;
                                      } else {
                                        if (var10 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (4 == var7) {
                                      break L8;
                                    } else {
                                      L11: {
                                        if (10 != var7) {
                                          break L11;
                                        } else {
                                          if (var10 == 0) {
                                            break L8;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      L12: {
                                        if (var7 != 6) {
                                          break L12;
                                        } else {
                                          if (var10 == 0) {
                                            break L7;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        L14: {
                                          L15: {
                                            L16: {
                                              if (var7 != 7) {
                                                break L16;
                                              } else {
                                                if (var10 == 0) {
                                                  nf.field_e = 0;
                                                  var7 = 0;
                                                  L17: while (true) {
                                                    L18: {
                                                      if (var7 >= 5) {
                                                        break L18;
                                                      } else {
                                                        kh.field_y.b(126, (rf) (Object) new bf(var3, -64 + 64 * -var7, var4, 1));
                                                        var7++;
                                                        if (var10 != 0) {
                                                          break L4;
                                                        } else {
                                                          if (var10 == 0) {
                                                            continue L17;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var10 == 0) {
                                                      break L4;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L19: {
                                              if (var7 != 8) {
                                                break L19;
                                              } else {
                                                if (var10 == 0) {
                                                  break L15;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (var7 != 13) {
                                                break L20;
                                              } else {
                                                if (var10 == 0) {
                                                  break L15;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (var7 != 12) {
                                                break L21;
                                              } else {
                                                if (var10 == 0) {
                                                  break L14;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L22: {
                                              if (var7 != 14) {
                                                break L22;
                                              } else {
                                                if (var10 == 0) {
                                                  break L14;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            if (var7 == 15) {
                                              break L13;
                                            } else {
                                              break L4;
                                            }
                                          }
                                          var5 = null;
                                          nf.field_e = 0;
                                          var4 = -64 + var3 - -sh.b(-127, 128);
                                          var7 = 0;
                                          L23: while (true) {
                                            L24: {
                                              L25: {
                                                stackOut_139_0 = ~var7;
                                                stackIn_143_0 = stackOut_139_0;
                                                stackIn_140_0 = stackOut_139_0;
                                                if (2 == nf.field_l) {
                                                  stackOut_143_0 = stackIn_143_0;
                                                  stackOut_143_1 = 10;
                                                  stackIn_144_0 = stackOut_143_0;
                                                  stackIn_144_1 = stackOut_143_1;
                                                  break L25;
                                                } else {
                                                  stackOut_140_0 = stackIn_140_0;
                                                  stackOut_140_1 = 5;
                                                  stackIn_145_0 = stackOut_140_0;
                                                  stackIn_145_1 = stackOut_140_1;
                                                  stackIn_141_0 = stackOut_140_0;
                                                  stackIn_141_1 = stackOut_140_1;
                                                  if (var10 != 0) {
                                                    break L24;
                                                  } else {
                                                    stackOut_141_0 = stackIn_141_0;
                                                    stackOut_141_1 = stackIn_141_1;
                                                    stackIn_144_0 = stackOut_141_0;
                                                    stackIn_144_1 = stackOut_141_1;
                                                    break L25;
                                                  }
                                                }
                                              }
                                              stackOut_144_0 = stackIn_144_0;
                                              stackOut_144_1 = ~stackIn_144_1;
                                              stackIn_145_0 = stackOut_144_0;
                                              stackIn_145_1 = stackOut_144_1;
                                              break L24;
                                            }
                                            L26: {
                                              if (stackIn_145_0 <= stackIn_145_1) {
                                                break L26;
                                              } else {
                                                L27: {
                                                  var8 = new bf(var3, -var7 * 64 - 64, var4, 2);
                                                  var8.field_h = (bf) var5;
                                                  if (var7 == 0) {
                                                    var5 = (Object) (Object) var8;
                                                    break L27;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                                kh.field_y.b(param0 + 69, (rf) (Object) var8);
                                                var7++;
                                                if (var10 == 0) {
                                                  continue L23;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                            if (var10 == 0) {
                                              break L4;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        nf.field_e = 175;
                                        kh.field_y.b(77, (rf) (Object) new bf(var3, -64, var4, 4));
                                        if (var10 == 0) {
                                          break L4;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var6 = new bf(320, -256, var4, 11);
                                      kh.field_y.b(101, (rf) (Object) var6);
                                      tj.field_C = var6.field_k;
                                      ua.field_c = 1 + ue.field_c[rj.field_h];
                                      pf.field_d = pf.field_d + 1;
                                      dg.field_l = 0;
                                      mj.a(255, 12, 0, 41, 100);
                                      ti.field_f.a((oa) (Object) kc.field_P);
                                      kc.field_P.f();
                                      kc.field_P = fl.field_h;
                                      ti.field_f.b((oa) (Object) kc.field_P);
                                      kc.field_P.a(mc.field_b);
                                      break L4;
                                    }
                                  }
                                }
                              }
                              nf.field_e = 0;
                              var7 = -8;
                              L28: while (true) {
                                L29: {
                                  if (var7 >= 8) {
                                    break L29;
                                  } else {
                                    var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                                    var8.field_p = true;
                                    kh.field_y.b(107, (rf) (Object) var8);
                                    var7++;
                                    if (var10 != 0) {
                                      break L4;
                                    } else {
                                      if (var10 == 0) {
                                        continue L28;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            nf.field_e = 0;
                            var7 = 0;
                            L30: while (true) {
                              L31: {
                                if (var7 >= 5) {
                                  break L31;
                                } else {
                                  kh.field_y.b(param0 ^ 74, (rf) (Object) new bf(var3, -var7 * 64 - 64, var3, 1));
                                  var7++;
                                  if (var10 != 0) {
                                    break L4;
                                  } else {
                                    if (var10 == 0) {
                                      continue L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          nf.field_e = 100;
                          var7_ref = null;
                          var8_int = 0;
                          L32: while (true) {
                            L33: {
                              stackOut_123_0 = var8_int;
                              stackIn_127_0 = stackOut_123_0;
                              stackIn_124_0 = stackOut_123_0;
                              if (nf.field_l == 2) {
                                stackOut_127_0 = stackIn_127_0;
                                stackOut_127_1 = 2;
                                stackIn_128_0 = stackOut_127_0;
                                stackIn_128_1 = stackOut_127_1;
                                break L33;
                              } else {
                                stackOut_124_0 = stackIn_124_0;
                                stackOut_124_1 = 1;
                                stackIn_128_0 = stackOut_124_0;
                                stackIn_128_1 = stackOut_124_1;
                                stackIn_125_0 = stackOut_124_0;
                                stackIn_125_1 = stackOut_124_1;
                                if (var10 != 0) {
                                  break L33;
                                } else {
                                  stackOut_125_0 = stackIn_125_0;
                                  stackOut_125_1 = stackIn_125_1;
                                  stackIn_128_0 = stackOut_125_0;
                                  stackIn_128_1 = stackOut_125_1;
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (stackIn_128_0 >= stackIn_128_1) {
                                break L34;
                              } else {
                                var9 = new bf(var3, -var8_int * 64 + -64, sh.b(param0 + 76, 128) - 64, 5);
                                var9.field_h = (bf) var7_ref;
                                var9.field_p = true;
                                kh.field_y.b(125, (rf) (Object) var9);
                                var7_ref = (Object) (Object) var9;
                                var8_int++;
                                if (var10 == 0) {
                                  continue L32;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                nf.field_e = 0;
                var7 = 0;
                L35: while (true) {
                  L36: {
                    if (var7 >= 5) {
                      break L36;
                    } else {
                      var8 = new bf(var3, -64 + 64 * -var7, var4, 1);
                      var8.field_p = true;
                      kh.field_y.b(65, (rf) (Object) var8);
                      var7++;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          continue L35;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                  if (var10 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              nf.field_e = 0;
              var7_ref = null;
              var8_int = 0;
              L37: while (true) {
                L38: {
                  L39: {
                    stackOut_95_0 = ~var8_int;
                    stackIn_99_0 = stackOut_95_0;
                    stackIn_96_0 = stackOut_95_0;
                    if (nf.field_l == 2) {
                      stackOut_99_0 = stackIn_99_0;
                      stackOut_99_1 = 10;
                      stackIn_100_0 = stackOut_99_0;
                      stackIn_100_1 = stackOut_99_1;
                      break L39;
                    } else {
                      stackOut_96_0 = stackIn_96_0;
                      stackOut_96_1 = 5;
                      stackIn_101_0 = stackOut_96_0;
                      stackIn_101_1 = stackOut_96_1;
                      stackIn_97_0 = stackOut_96_0;
                      stackIn_97_1 = stackOut_96_1;
                      if (var10 != 0) {
                        break L38;
                      } else {
                        stackOut_97_0 = stackIn_97_0;
                        stackOut_97_1 = stackIn_97_1;
                        stackIn_100_0 = stackOut_97_0;
                        stackIn_100_1 = stackOut_97_1;
                        break L39;
                      }
                    }
                  }
                  stackOut_100_0 = stackIn_100_0;
                  stackOut_100_1 = ~stackIn_100_1;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  break L38;
                }
                L40: {
                  if (stackIn_101_0 <= stackIn_101_1) {
                    break L40;
                  } else {
                    L41: {
                      var9 = new bf(var3, -var8_int * 64 + -64, var4, 2);
                      var9.field_h = (bf) var7_ref;
                      var9.field_p = true;
                      kh.field_y.b(param0 ^ 102, (rf) (Object) var9);
                      if (var8_int == 0) {
                        var7_ref = (Object) (Object) var9;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    var8_int++;
                    if (var10 == 0) {
                      continue L37;
                    } else {
                      break L40;
                    }
                  }
                }
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.GA(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        hb var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        var4 = field_A;
        try {
          L0: {
            L1: {
              nb.field_f.d();
              ea.field_d.d();
              if (null == n.field_a) {
                break L1;
              } else {
                if (!n.field_a.field_b) {
                  break L1;
                } else {
                  re.a(0);
                  le.b(-36);
                  break L1;
                }
              }
            }
            L2: {
              stackOut_7_0 = this;
              stackIn_10_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (n.field_a == null) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                break L2;
              }
            }
            L3: {
              ((StarCannon) this).b(stackIn_11_1 != 0, -1);
              if (param0 == 320) {
                break L3;
              } else {
                ((StarCannon) this).a(-100);
                break L3;
              }
            }
            L4: {
              if (fa.field_E) {
                this.t(-23523);
                fa.field_E = false;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!le.c(4)) {
                break L5;
              } else {
                ((StarCannon) this).f((byte) -90);
                if (le.c(4)) {
                  L6: {
                    if (!ai.a((byte) -78)) {
                      break L6;
                    } else {
                      this.c(false, -1444);
                      break L6;
                    }
                  }
                  return;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              L8: {
                if (!ld.field_ib) {
                  break L8;
                } else {
                  L9: {
                    if (null != oh.field_a) {
                      break L9;
                    } else {
                      L10: {
                        if (!gh.f(-23093)) {
                          break L10;
                        } else {
                          L11: {
                            if (nh.field_e != 0) {
                              break L11;
                            } else {
                              L12: {
                                var2_int = bd.b(31380);
                                if (var2_int != 2) {
                                  break L12;
                                } else {
                                  re.a(0);
                                  break L12;
                                }
                              }
                              L13: {
                                if (var2_int != 3) {
                                  break L13;
                                } else {
                                  hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, (qe) (Object) a.field_b, param0 + -331, 12, true);
                                  break L13;
                                }
                              }
                              L14: {
                                if (var2_int == 4) {
                                  vc.a(0, (byte) 60, 0);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                if (gh.f(param0 + -23413)) {
                                  break L15;
                                } else {
                                  fg.field_a[field_z].b(true, 0);
                                  break L15;
                                }
                              }
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L11;
                              }
                            }
                          }
                          this.b(true);
                          if (var4 == 0) {
                            break L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L16: {
                        if (cb.a(false)) {
                          break L16;
                        } else {
                          this.b(true);
                          if (var4 == 0) {
                            break L7;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        stackOut_61_0 = this;
                        stackIn_66_0 = stackOut_61_0;
                        stackIn_62_0 = stackOut_61_0;
                        if (null == n.field_a) {
                          stackOut_66_0 = this;
                          stackOut_66_1 = 0;
                          stackIn_67_0 = stackOut_66_0;
                          stackIn_67_1 = stackOut_66_1;
                          break L17;
                        } else {
                          stackOut_62_0 = this;
                          stackIn_64_0 = stackOut_62_0;
                          stackOut_64_0 = this;
                          stackOut_64_1 = 1;
                          stackIn_67_0 = stackOut_64_0;
                          stackIn_67_1 = stackOut_64_1;
                          break L17;
                        }
                      }
                      L18: {
                        var2_int = u.a((ag) this, stackIn_67_1 != 0, (byte) 112);
                        if (var2_int == 1) {
                          re.a(0);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (var2_int != 2) {
                          break L19;
                        } else {
                          L20: {
                            if (null != n.field_a) {
                              re.a(0);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          nh.a(ll.b(72), 337033697);
                          break L19;
                        }
                      }
                      L21: {
                        if (2364824 == var2_int) {
                          ie.g(-1);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      if (var4 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (oh.field_a.field_n) {
                    eb.field_c = eb.field_c | oh.field_a.field_k;
                    jg.field_H = jg.field_H & ~oh.field_a.field_k;
                    oh.field_a = null;
                    jj.i(122);
                    cf.e((byte) -117);
                    if (field_z != 5) {
                      break L7;
                    } else {
                      if (jg.field_H != 0) {
                        break L7;
                      } else {
                        field_z = 2;
                        od.a(param0 ^ -312, 2, false);
                        if (var4 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              this.c(true, param0 ^ -1252);
              break L7;
            }
            L22: {
              if (!wk.a(34)) {
                L23: while (true) {
                  L24: {
                    L25: {
                      var2_ref = (hb) (Object) bh.field_e.a((byte) 39);
                      if (null != var2_ref) {
                        break L25;
                      } else {
                        if (var4 != 0) {
                          break L24;
                        } else {
                          if (var4 == 0) {
                            break L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    sb.a(4, (byte) -41, var2_ref);
                    break L24;
                  }
                  if (var4 == 0) {
                    continue L23;
                  } else {
                    break L22;
                  }
                }
              } else {
                break L22;
              }
            }
            nf.a(0, (byte) 95);
            L26: while (true) {
              L27: {
                if (!ll.a(s.field_k, (byte) -99)) {
                  break L27;
                } else {
                  ((StarCannon) this).a(true);
                  if (var4 == 0) {
                    continue L26;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                var2_int = 0;
                if (!se.b((byte) -91)) {
                  break L28;
                } else {
                  var3 = ((StarCannon) this).h((byte) 58);
                  if (var3 == 2) {
                    var2_int = 1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (var2_int != 0) {
                  ai.a(10, (hl[]) null, 240, af.field_y.field_r, (hl[]) null, a.field_b.field_q + a.field_b.field_r, (qe) (Object) a.field_b, 10, (qe) (Object) af.field_y, 320, 10, af.field_y.field_q + af.field_y.field_r, 25574, a.field_b.field_r);
                  break L29;
                } else {
                  break L29;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.K(" + param0 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        ja var3 = null;
        hl[] var3_array = null;
        int var4_int = 0;
        id[] var4 = null;
        hl[] var4_array = null;
        hl var5 = null;
        int var5_int = 0;
        int var6 = 0;
        hl var6_ref_hl = null;
        hl[] var7_ref_hl__ = null;
        int var7 = 0;
        hl var7_ref_hl = null;
        int var8 = 0;
        hl var8_ref_hl = null;
        hl var9 = null;
        hl[] var9_array = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = field_A;
          if (param1 == -1444) {
            break L0;
          } else {
            ((StarCannon) this).b(66);
            break L0;
          }
        }
        L1: {
          o.a(false);
          if (param0) {
            ne.b(lh.field_I, 150);
            break L1;
          } else {
            break L1;
          }
        }
        if (null != gf.field_c) {
          if (null == se.field_l) {
            if (fl.field_f == null) {
              ma.a(sj.field_C, -13923, 80.0f);
              ((StarCannon) this).d((byte) 22);
              gg.field_f = ob.a("smlships", 126, "", jg.field_F);
              nd.field_j = ob.a("destroyer", -121, "", jg.field_F);
              qc.field_e = ob.a("cruiser", param1 ^ -1484, "", jg.field_F);
              gf.field_a = ob.a("cannoneer", 116, "", jg.field_F);
              dl.field_c = ob.a("playership", param1 + 1407, "", jg.field_F);
              vc.field_m = ob.a("addons", 126, "", jg.field_F);
              hl[] discarded$5 = ob.a("glows", 118, "", jg.field_F);
              sj.field_E = ob.a("boss", -36, "", jg.field_F);
              fg.field_c = ob.a("boss2", param1 ^ 1474, "", jg.field_F);
              v.field_d = ob.a("boss3", 95, "", jg.field_F);
              af.field_w = fg.a(jg.field_F, "powerorbs", "", false);
              var3_array = ob.a("shots", -75, "", jg.field_F);
              var4_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (5 <= var4_int) {
                      break L4;
                    } else {
                      jg.field_C[var4_int] = var3_array[var4_int];
                      var4_int++;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var3_array = ob.a("shots2", -120, "", jg.field_F);
                  break L3;
                }
                var4_int = 0;
                L5: while (true) {
                  L6: {
                    if (var4_int >= 5) {
                      break L6;
                    } else {
                      jg.field_C[var4_int + 5] = var3_array[var4_int];
                      var4_int++;
                      if (var12 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var3_array = null;
                  ie.field_B = ob.a("explosion", 120, "", jg.field_F);
                  ad.field_z = ob.a("explosionb", -63, "", jg.field_F);
                  oh.field_d = ob.a("explosionc", -105, "", jg.field_F);
                  el.field_H = new hl[5];
                  var4_int = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var4_int >= 5) {
                          break L9;
                        } else {
                          hl dupTemp$6 = new hl(32, 32);
                          el.field_H[var4_int] = dupTemp$6;
                          var5 = dupTemp$6;
                          var5.e();
                          gg.field_f[-var4_int + 24].b(0, 0);
                          var5.d();
                          var4_int++;
                          if (var12 != 0) {
                            break L8;
                          } else {
                            if (var12 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      hg.field_y.b(param1 + 1333);
                      fl.field_f = ob.a("debris", 96, "", jg.field_F);
                      break L8;
                    }
                    var4_array = new hl[40];
                    var5_int = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (var5_int >= 4) {
                            break L12;
                          } else {
                            var4_array[36 + var5_int] = fl.field_f[var5_int - -12];
                            var5_int++;
                            if (var12 != 0) {
                              break L11;
                            } else {
                              if (var12 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var5_int = 0;
                        break L11;
                      }
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (var5_int >= 12) {
                              break L15;
                            } else {
                              var4_array[var5_int] = fl.field_f[var5_int];
                              var4_array[12 + var5_int] = fl.field_f[var5_int].c();
                              var4_array[12 + var5_int].a();
                              var4_array[24 + var5_int] = fl.field_f[var5_int].c();
                              var4_array[24 + var5_int].b();
                              var5_int++;
                              if (var12 != 0) {
                                break L14;
                              } else {
                                if (var12 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          fl.field_f = var4_array;
                          ma.field_e = ob.a("fr_thin_sqr_in", -49, "", jg.field_F);
                          gb.field_v = ob.a("fr_thin_sqr_ex", 119, "", jg.field_F);
                          ha.field_a = ob.a("fr_grid_sql_in", 119, "", jg.field_F);
                          ma.field_a = ob.a("fr_grid_sql_ex", 119, "", jg.field_F);
                          break L14;
                        }
                        var5 = ma.field_a[6];
                        var6_ref_hl = ma.field_a[7];
                        ma.field_a[8].field_q = 4;
                        var6_ref_hl.field_q = 4;
                        var5.field_q = 4;
                        var7_ref_hl = ha.field_a[6];
                        ha.field_a[8].field_q = 4;
                        var8_ref_hl = ha.field_a[7];
                        var8_ref_hl.field_q = 4;
                        var7_ref_hl.field_q = 4;
                        vb.field_l = vk.a("", param1 ^ -1534, "life_icon", jg.field_F);
                        pk.field_e = vk.a("", 41, "main_border", jg.field_F);
                        hf.field_i = vk.a("", 45, "main_inner", jg.field_F);
                        rd.field_p = ob.a("menu_border", param1 ^ -1532, "", jg.field_F);
                        jk.field_f = ob.a("menu_innerborder", 98, "", jg.field_F);
                        var9_array = ob.a("headers", 117, "", jg.field_F);
                        fh.field_r[0] = var9_array[0];
                        fh.field_r[3] = var9_array[3];
                        fh.field_r[4] = var9_array[4];
                        fh.field_r[2] = var9_array[2];
                        fh.field_r[1] = var9_array[1];
                        fh.field_r[5] = var9_array[5];
                        var10 = new int[256];
                        var11 = 0;
                        L16: while (true) {
                          L17: {
                            L18: {
                              if (256 <= var11) {
                                break L18;
                              } else {
                                var10[var11] = w.a(var11 << -1286819065, 65303) + var11;
                                var11++;
                                if (var12 != 0) {
                                  break L17;
                                } else {
                                  if (var12 == 0) {
                                    continue L16;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var11 = 0;
                            break L17;
                          }
                          L19: while (true) {
                            L20: {
                              L21: {
                                if (var11 >= 8) {
                                  break L21;
                                } else {
                                  if (var12 != 0) {
                                    break L20;
                                  } else {
                                    L22: {
                                      if (fh.field_r[var11] != null) {
                                        rh.field_f[var11] = cl.a(5, fh.field_r[var11], true, false, var10, 255);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var11++;
                                    if (var12 == 0) {
                                      continue L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              tc.j(param1 + 1476);
                              break L20;
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (null == kj.field_y[3]) {
                ma.a(sj.field_C, -13923, 90.0f);
                ((StarCannon) this).d((byte) 22);
                hl discarded$7 = vk.a("", 93, "mainmenubar", jg.field_F);
                ie.field_A = ob.a("zenon", 102, "", jg.field_F);
                hl discarded$8 = vk.a("", 120, "moon", jg.field_F);
                hl discarded$9 = vk.a("", param1 ^ -1487, "stars", jg.field_F);
                fh.field_q = vk.a("", param1 + 1531, "nebula", jg.field_F);
                gj.field_e = vk.a("", 125, "titlepic", jg.field_F);
                gb.field_r = vk.a("", 91, "title2", jg.field_F);
                ea.field_b[0] = vk.a("", 54, "sp0", jg.field_F);
                ea.field_b[1] = vk.a("", 116, "sp1", jg.field_F);
                ea.field_b[2] = vk.a("", 52, "sp2", jg.field_F);
                ea.field_b[3] = vk.a("", param1 + 1531, "sp3", jg.field_F);
                ea.field_b[4] = vk.a("", 43, "sp4", jg.field_F);
                ea.field_b[5] = vk.a("", 44, "sp5", jg.field_F);
                ea.field_b[6] = vk.a("", 93, "sp6", jg.field_F);
                ea.field_b[7] = vk.a("", param1 + 1497, "sp7", jg.field_F);
                ea.field_b[8] = vk.a("", 36, "sp8", jg.field_F);
                eb.field_b[0] = vk.a("", 47, "s0", jg.field_F);
                eb.field_b[1] = vk.a("", 107, "s1", jg.field_F);
                eb.field_b[2] = vk.a("", 86, "s2", jg.field_F);
                eb.field_b[3] = vk.a("", 23, "s3", jg.field_F);
                eb.field_b[4] = vk.a("", 20, "s4", jg.field_F);
                eb.field_b[5] = vk.a("", 82, "s5", jg.field_F);
                eb.field_b[6] = vk.a("", dg.a(param1, -1506), "s6", jg.field_F);
                eb.field_b[7] = vk.a("", dg.a(param1, -1419), "s7", jg.field_F);
                eb.field_b[8] = vk.a("", dg.a(param1, -1423), "s8", jg.field_F);
                eb.field_b[9] = vk.a("", 124, "s9", jg.field_F);
                eb.field_b[10] = vk.a("", param1 + 1532, "s10", jg.field_F);
                eb.field_b[11] = vk.a("", 21, "s11", jg.field_F);
                eb.field_b[12] = vk.a("", dg.a(param1, -1478), "s12", jg.field_F);
                eb.field_b[13] = vk.a("", param1 + 1523, "s13", jg.field_F);
                kj.field_y[0] = vk.a("", 76, "ap0", jg.field_F);
                kj.field_y[1] = vk.a("", 69, "ap1", jg.field_F);
                kj.field_y[2] = vk.a("", dg.a(param1, -1497), "ap2", jg.field_F);
                kj.field_y[3] = vk.a("", 100, "ap3", jg.field_F);
                tc.j(32);
                return;
              } else {
                ma.a(sj.field_C, -13923, 95.0f);
                ((StarCannon) this).d((byte) 22);
                af.field_y = od.a("", jg.field_F, "b12", param1 + 1443, cb.field_c);
                a.field_b = od.a("", jg.field_F, "font", -1, cb.field_c);
                var3_array = ob.a("screenshots", -105, "", jg.field_F);
                kk.a(vk.a("", 59, "mbfg", jg.field_F), -60, wc.field_g);
                ta.a(vk.a("", param1 ^ -1510, "mb_logo", jg.field_F), param1 + 1319);
                ed.a(0, 125, 123, (qe) (Object) a.field_b, 1500, -52, 9, 9, 16777215, 0, vk.a("", 60, "mbpb", jg.field_F));
                te.a(126, var3_array);
                lf.field_eb = null;
                var4 = new id[1];
                var4[0] = af.field_w[16 - -qb.field_e];
                af.field_y.a((ne[]) (Object) var4, (int[]) null);
                lf.field_V = vk.a("basic", 111, "unachieved", fi.field_f);
                li.a(lf.field_V, (byte) -100);
                sc.field_a = vk.a("basic", param1 ^ -1517, "locked", fi.field_f);
                li.a(sc.field_a, (byte) -100);
                var5 = vk.a("basic", 104, "orbcoin", fi.field_f);
                var6 = a.field_b.field_p - -a.field_b.field_q;
                el.field_J = new hl(var6, var6);
                el.field_J.e();
                var5.d(0, 0, var6, var6);
                j.field_c = ob.a("achievements_lrg", param1 + 1366, "", jg.field_F);
                var5 = null;
                var7_ref_hl__ = j.field_c;
                var8 = 0;
                L23: while (true) {
                  L24: {
                    L25: {
                      if (var8 >= var7_ref_hl__.length) {
                        break L25;
                      } else {
                        var9 = var7_ref_hl__[var8];
                        li.a(var9, (byte) -100);
                        var8++;
                        if (var12 != 0) {
                          break L24;
                        } else {
                          if (var12 == 0) {
                            continue L23;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    hg.field_y.b(-83);
                    jl.field_j = 5;
                    fi.field_f = null;
                    ia.field_k = 0;
                    jg.field_F = null;
                    tg.field_y = 10;
                    tj.field_G = 0;
                    pf.field_d = 1;
                    bf.field_w = 0;
                    ha.field_c = 0;
                    gj.field_c = -1;
                    jk.field_j = 0;
                    eg.field_l = 128;
                    ua.field_c = -2;
                    ha.field_d = 0;
                    vb.field_m = 1;
                    cg.field_e = 0;
                    ui.field_p = 0;
                    kd.field_C = -1;
                    fi.field_e = new bf(256, 256, 256, 0);
                    fi.field_e.field_r = 256;
                    fi.field_e.field_k = 0;
                    kh.field_y.a(-71, (rf) (Object) fi.field_e);
                    u.field_b = 0;
                    ed.field_n = 0;
                    ig.field_h = 0;
                    hc.field_c = 0;
                    nf.field_e = 0;
                    eg.field_f = new wd(fb.field_t);
                    gd.field_a = new wd(qf.field_i);
                    fl.field_h = new wd(r.field_b);
                    kc.field_P = eg.field_f;
                    kc.field_P.a(mc.field_b);
                    ti.field_f.b((oa) (Object) kc.field_P);
                    ne.a(50, 39);
                    qd.a(1, 50);
                    fg.field_a = new jl[8];
                    pc.a(-5695);
                    break L24;
                  }
                  var7 = 0;
                  L26: while (true) {
                    L27: {
                      L28: {
                        L29: {
                          if (var7 >= 8) {
                            break L29;
                          } else {
                            fg.field_a[var7] = new jl(var7);
                            var7++;
                            if (var12 != 0) {
                              break L28;
                            } else {
                              if (var12 == 0) {
                                continue L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        if (!wk.a(45)) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                      oh.field_a = og.a(4, (byte) 113);
                      break L27;
                    }
                    ld.field_ib = true;
                    tc.j(param1 + 1476);
                    return;
                  }
                }
              }
            }
          } else {
            ma.a(nc.field_d, -13923, 75.0f);
            ((StarCannon) this).d((byte) 22);
            var3 = new ja(lj.field_h, nd.field_p);
            fb.field_t = dl.a(var3, (byte) 84, "music/star cannon level 1 final", "", se.field_l);
            qf.field_i = dl.a(var3, (byte) 66, "music/star cannon level 2 final", "", se.field_l);
            r.field_b = dl.a(var3, (byte) -82, "music/star cannon boss final", "", se.field_l);
            nd.field_p = null;
            se.field_l = null;
            lj.field_h = null;
            tc.j(32);
            return;
          }
        } else {
          L30: {
            if (!lj.field_h.b((byte) 118)) {
              break L30;
            } else {
              if (!lj.field_h.a(param1 + 31185)) {
                break L30;
              } else {
                L31: {
                  if (!nd.field_p.b((byte) 95)) {
                    break L31;
                  } else {
                    if (nd.field_p.a(29741)) {
                      L32: {
                        if (!se.field_l.b((byte) 109)) {
                          break L32;
                        } else {
                          if (se.field_l.a(29741)) {
                            L33: {
                              if (!jg.field_F.b((byte) 119)) {
                                break L33;
                              } else {
                                if (jg.field_F.a(29741)) {
                                  L34: {
                                    if (!cb.field_c.b((byte) 127)) {
                                      break L34;
                                    } else {
                                      if (!cb.field_c.a(29741)) {
                                        break L34;
                                      } else {
                                        L35: {
                                          if (!fi.field_f.b((byte) 103)) {
                                            break L35;
                                          } else {
                                            if (fi.field_f.a("basic", -9883)) {
                                              ma.a(fa.field_z, -13923, 70.0f);
                                              ((StarCannon) this).d((byte) 22);
                                              if (!param0) {
                                                return;
                                              } else {
                                                jj.i(param1 ^ -1478);
                                                gf.field_c = new ud[48];
                                                gf.field_c[0] = aj.a(lj.field_h, "", "SC_bossdamage").a();
                                                gf.field_c[1] = aj.a(lj.field_h, "", "SC_bossdestroy").a();
                                                gf.field_c[2] = aj.a(lj.field_h, "", "SC_collect1").a();
                                                gf.field_c[7] = aj.a(lj.field_h, "", "SC_enemydamage2").a();
                                                gf.field_c[8] = aj.a(lj.field_h, "", "SC_enemydamage3").a();
                                                gf.field_c[9] = aj.a(lj.field_h, "", "SC_enemydestroy3").a();
                                                gf.field_c[10] = aj.a(lj.field_h, "", "SC_enemydestroy4").a();
                                                gf.field_c[3] = aj.a(lj.field_h, "", "SC_enemyfire1").a();
                                                gf.field_c[4] = aj.a(lj.field_h, "", "SC_enemyfire2").a();
                                                gf.field_c[5] = aj.a(lj.field_h, "", "SC_enemyfire3").a();
                                                gf.field_c[6] = aj.a(lj.field_h, "", "SC_enemyfire4").a();
                                                gf.field_c[19] = aj.a(lj.field_h, "", "SC_playerdestroy").a();
                                                gf.field_c[20] = aj.a(lj.field_h, "", "SC_backcannon").a();
                                                gf.field_c[21] = aj.a(lj.field_h, "", "SC_FOLLOWERFIRE").a();
                                                gf.field_c[11] = aj.a(lj.field_h, "", "SC_playerfire1").a();
                                                gf.field_c[12] = aj.a(lj.field_h, "", "SC_playerfire2").a();
                                                gf.field_c[13] = aj.a(lj.field_h, "", "SC_helix_1").a();
                                                gf.field_c[14] = aj.a(lj.field_h, "", "SC_helix_2").a();
                                                gf.field_c[15] = aj.a(lj.field_h, "", "SC_helix_3").a();
                                                gf.field_c[16] = aj.a(lj.field_h, "", "SC_lance_1").a();
                                                gf.field_c[17] = aj.a(lj.field_h, "", "SC_lance_2").a();
                                                gf.field_c[18] = aj.a(lj.field_h, "", "SC_lance_3").a();
                                                gf.field_c[22] = aj.a(lj.field_h, "", "SC_rewind_activated_part1").a();
                                                gf.field_c[23] = aj.a(lj.field_h, "", "SC_rewind_installed").a();
                                                gf.field_c[24] = aj.a(lj.field_h, "", "SC_seekermine_explode").a();
                                                gf.field_c[25] = aj.a(lj.field_h, "", "SC_shield_discharged").a();
                                                gf.field_c[26] = aj.a(lj.field_h, "", "SC_shield_rearm").a();
                                                gf.field_c[27] = aj.a(lj.field_h, "", "SC_shieldburst").a();
                                                gf.field_c[28] = aj.a(lj.field_h, "", "SC_thruster_upgrade").a();
                                                gf.field_c[29] = aj.a(lj.field_h, "", "SC_rearcannon_upgrade").a();
                                                gf.field_c[30] = aj.a(lj.field_h, "", "SC_shield_upgraded").a();
                                                gf.field_c[31] = aj.a(lj.field_h, "", "SC_sidecannons_upgrade").a();
                                                gf.field_c[46] = aj.a(lj.field_h, "", "SC_xenon_operational").a();
                                                gf.field_c[47] = aj.a(lj.field_h, "", "SC_xenonbeamshot").a();
                                                gf.field_c[32] = nj.a(nd.field_p, "", "SC_systems malfunction").c();
                                                gf.field_c[39] = nj.a(nd.field_p, "", "SC_VOC_54321").c();
                                                gf.field_c[40] = nj.a(nd.field_p, "", "SC_VOC_back cannons upgraded").c();
                                                gf.field_c[41] = nj.a(nd.field_p, "", "SC_VOC_hostile mothership approaching").c();
                                                gf.field_c[42] = nj.a(nd.field_p, "", "SC_VOC_powerup collected").c();
                                                gf.field_c[43] = nj.a(nd.field_p, "", "SC_VOC_returning to normal space").c();
                                                gf.field_c[44] = nj.a(nd.field_p, "", "SC_VOC_rewind module activated").c();
                                                gf.field_c[45] = nj.a(nd.field_p, "", "SC_VOC_rewind module installed").c();
                                                gf.field_c[33] = nj.a(nd.field_p, "", "SC_VOC_shield discharged").c();
                                                gf.field_c[34] = nj.a(nd.field_p, "", "SC_VOC_shield rearmed").c();
                                                gf.field_c[35] = nj.a(nd.field_p, "", "SC_VOC_shields upgraded").c();
                                                gf.field_c[36] = nj.a(nd.field_p, "", "SC_VOC_side cannons upgraded").c();
                                                gf.field_c[37] = nj.a(nd.field_p, "", "SC_VOC_thrusters upgraded").c();
                                                gf.field_c[38] = nj.a(nd.field_p, "", "SC_VOC_zenon beam operational").c();
                                                nd.a(272, -3763, 3278, 39);
                                                nd.a(0, -3763, 300, 11);
                                                nd.a(0, -3763, 300, 12);
                                                nd.a(50, -3763, 300, 16);
                                                nd.a(0, param1 + -2319, 100, 17);
                                                nd.a(0, param1 ^ 2833, 100, 18);
                                                tc.j(param1 ^ -1412);
                                                return;
                                              }
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        ma.a(bh.a(n.field_f, fi.field_f, (byte) -38, ae.field_a, "basic"), -13923, 60.0f);
                                        return;
                                      }
                                    }
                                  }
                                  ma.a(bh.a(s.field_g, cb.field_c, (byte) -38, sj.field_D, ""), -13923, 50.0f);
                                  return;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            ma.a(bh.a(n.field_f, jg.field_F, (byte) -38, ae.field_a, ""), param1 + -12479, 40.0f);
                            return;
                          } else {
                            break L32;
                          }
                        }
                      }
                      ma.a(bh.a(kc.field_U, se.field_l, (byte) -38, ia.field_l, ""), -13923, 30.0f);
                      return;
                    } else {
                      break L31;
                    }
                  }
                }
                ma.a(bh.a(lc.field_ib, nd.field_p, (byte) -38, bd.field_g, ""), -13923, 20.0f);
                return;
              }
            }
          }
          ma.a(bh.a(lc.field_ib, lj.field_h, (byte) -38, bd.field_g, ""), param1 ^ 13249, 10.0f);
          return;
        }
    }

    private final void m(byte param0) {
        int var2_int = 0;
        bf var2 = null;
        int var3 = 0;
        bf var3_ref_bf = null;
        int[] var3_ref_int__ = null;
        int var4_int = 0;
        ud var4 = null;
        bf var4_ref = null;
        int var5_int = 0;
        fj var5 = null;
        bf var5_ref = null;
        int var6_int = 0;
        bf var6 = null;
        int var7 = 0;
        int var8 = 0;
        bf stackIn_55_0 = null;
        bf stackIn_55_1 = null;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        bf stackIn_121_0 = null;
        bf stackIn_121_1 = null;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        bf stackIn_129_0 = null;
        bf stackIn_129_1 = null;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        boolean stackIn_408_0 = false;
        int stackIn_414_0 = 0;
        int stackIn_531_0 = 0;
        int stackIn_531_1 = 0;
        int stackIn_603_0 = 0;
        int stackIn_603_1 = 0;
        int stackIn_612_0 = 0;
        int stackIn_612_1 = 0;
        int stackIn_641_0 = 0;
        int stackIn_641_1 = 0;
        bf stackOut_54_0 = null;
        bf stackOut_54_1 = null;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        bf stackOut_120_0 = null;
        bf stackOut_120_1 = null;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        bf stackOut_128_0 = null;
        bf stackOut_128_1 = null;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        boolean stackOut_407_0 = false;
        int stackOut_413_0 = 0;
        int stackOut_530_0 = 0;
        int stackOut_530_1 = 0;
        int stackOut_602_0 = 0;
        int stackOut_602_1 = 0;
        int stackOut_611_0 = 0;
        int stackOut_611_1 = 0;
        int stackOut_640_0 = 0;
        int stackOut_640_1 = 0;
        L0: {
          var8 = field_A;
          if (ie.field_C > 0) {
            ie.field_C = ie.field_C - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gj.field_c == -1) {
            L2: {
              var2_int = 0;
              if (0 != ia.field_k) {
                break L2;
              } else {
                if (0 != jg.field_H) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (!wk.a(86)) {
                  break L4;
                } else {
                  L5: {
                    if (ia.field_k > 0) {
                      break L5;
                    } else {
                      if (jg.field_H > 0) {
                        break L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 6;
                  if (var8 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                if (0 >= jg.field_H) {
                  break L6;
                } else {
                  var2_int = 5;
                  if (var8 == 0) {
                    break L3;
                  } else {
                    break L6;
                  }
                }
              }
              if (0 < kd.field_C) {
                var2_int = 2;
                break L3;
              } else {
                break L3;
              }
            }
            od.a(-126, var2_int, false);
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (tj.field_G <= 0) {
            break L7;
          } else {
            fi.field_e.field_k = 1;
            ha.field_d = 0;
            ui.field_p = eg.field_l + -32;
            tj.field_G = tj.field_G - 1;
            if (0 >= tj.field_G) {
              ui.field_p = 0;
              mj.a(255, 12, 0, 43, 100);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          L9: {
            L10: {
              L11: {
                L12: {
                  if (fi.field_e.field_k <= 0) {
                    break L12;
                  } else {
                    L13: {
                      if (!gi.field_g) {
                        break L13;
                      } else {
                        if (2 > ua.field_c) {
                          break L13;
                        } else {
                          if (rj.field_h == 0) {
                            ia.field_k = ia.field_k + 1;
                            fc.field_e = fc.field_e + 2;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      if (ui.field_p <= 0) {
                        break L14;
                      } else {
                        L15: {
                          ui.field_p = ui.field_p + 8;
                          if (~ui.field_p >= ~eg.field_l) {
                            break L15;
                          } else {
                            dg.field_l = 0;
                            ui.field_p = 0;
                            mj.a(96, 12, 0, 25, 100);
                            mj.a(255, 12, 0, 33, 100);
                            break L15;
                          }
                        }
                        var2_int = 0;
                        L16: while (true) {
                          L17: {
                            if (var2_int >= 4000) {
                              break L17;
                            } else {
                              if (var8 != 0) {
                                break L11;
                              } else {
                                L18: {
                                  if (qc.field_c[var2_int] == null) {
                                    break L18;
                                  } else {
                                    if (qc.field_c[var2_int].field_h != 2) {
                                      break L18;
                                    } else {
                                      var3 = qc.field_c[var2_int].field_d + -fi.field_e.field_f;
                                      var4_int = qc.field_c[var2_int].field_q + -fi.field_e.field_u;
                                      var5_int = (int)Math.sqrt((double)(var4_int * var4_int + var3 * var3));
                                      if (~var5_int > ~ui.field_p) {
                                        qc.field_c[var2_int].field_h = 0;
                                        qc.field_c[var2_int].field_p = 64;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                var2_int++;
                                if (var8 == 0) {
                                  continue L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          var2 = (bf) (Object) kh.field_y.c(-3905);
                          L19: while (true) {
                            L20: {
                              if (null == var2) {
                                break L20;
                              } else {
                                stackOut_54_0 = fi.field_e;
                                stackOut_54_1 = (bf) var2;
                                stackIn_129_0 = stackOut_54_0;
                                stackIn_129_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (var8 != 0) {
                                  break L9;
                                } else {
                                  L21: {
                                    if (stackIn_55_0 == stackIn_55_1) {
                                      break L21;
                                    } else {
                                      var3 = var2.field_f + -fi.field_e.field_f;
                                      var4_int = -fi.field_e.field_u + var2.field_u;
                                      var5_int = (int)Math.sqrt((double)(var4_int * var4_int + var3 * var3));
                                      var6_int = 0;
                                      L22: while (true) {
                                        if (~ui.field_p >= ~var6_int) {
                                          break L21;
                                        } else {
                                          stackOut_59_0 = var6_int;
                                          stackOut_59_1 = var5_int;
                                          stackIn_126_0 = stackOut_59_0;
                                          stackIn_126_1 = stackOut_59_1;
                                          stackIn_60_0 = stackOut_59_0;
                                          stackIn_60_1 = stackOut_59_1;
                                          if (var8 != 0) {
                                            break L10;
                                          } else {
                                            L23: {
                                              if (stackIn_60_0 <= stackIn_60_1) {
                                                break L23;
                                              } else {
                                                if (var2.field_q != 10) {
                                                  L24: {
                                                    if (var2.field_q != 22) {
                                                      break L24;
                                                    } else {
                                                      if (var2.field_l < 36) {
                                                        break L24;
                                                      } else {
                                                        if (39 < var2.field_l) {
                                                          break L24;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L25: {
                                                    if (var3 < 0) {
                                                      var2.field_f = var2.field_f - 1;
                                                      break L25;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                  L26: {
                                                    if (0 >= var3) {
                                                      break L26;
                                                    } else {
                                                      var2.field_f = var2.field_f + 1;
                                                      break L26;
                                                    }
                                                  }
                                                  L27: {
                                                    if (var4_int < 0) {
                                                      var2.field_u = var2.field_u - 1;
                                                      break L27;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                  if (0 >= var4_int) {
                                                    break L23;
                                                  } else {
                                                    var2.field_u = var2.field_u + 1;
                                                    break L23;
                                                  }
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            var6_int++;
                                            if (var8 == 0) {
                                              continue L22;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var2 = (bf) (Object) kh.field_y.a(-16913);
                                  if (var8 == 0) {
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            if (var8 == 0) {
                              break L11;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    if (ha.field_d > 0) {
                      L28: {
                        var2_int = vb.field_m + 1;
                        if (4 == vb.field_m) {
                          var2_int++;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (vb.field_m == 5) {
                          var2_int += 2;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        ha.field_d = ha.field_d - var2_int;
                        if (null != ah.field_a) {
                          break L30;
                        } else {
                          if (vb.field_m < 4) {
                            L31: {
                              var3 = 0;
                              if (vb.field_m == 2) {
                                var3 = 28665;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            L32: {
                              if (3 == vb.field_m) {
                                var3 = 42997;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: {
                              var4 = gf.field_c[39];
                              fj dupTemp$6 = fj.a(var4, 100, 255 * nb.field_g / 100);
                              var5 = dupTemp$6;
                              ah.field_a = dupTemp$6;
                              var5.d(var3);
                              var6_int = (var2_int + ha.field_d + -1) / var2_int;
                              var7 = -300 + (var6_int * 20 + -((var4.field_i.length + -var3) * 1000 / var4.field_j));
                              if (var7 > 0) {
                                break L33;
                              } else {
                                jk.field_k.b((c) (Object) ah.field_a);
                                if (var8 == 0) {
                                  break L30;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            ok.field_tb = eg.a(29723, var7, (c) (Object) ah.field_a);
                            jk.field_k.b((c) (Object) ok.field_tb);
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L34: {
                        if (ha.field_d <= 0) {
                          ha.field_d = 0;
                          dg.field_l = 0;
                          mj.a(255, 12, 0, 34, 100);
                          mj.a(96, 12, 0, 26, 100);
                          ok.field_tb = null;
                          ah.field_a = null;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      if (var8 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                if (gj.field_c >= 0) {
                  break L11;
                } else {
                  var2_int = 0;
                  L35: while (true) {
                    L36: {
                      if (var2_int >= 4000) {
                        break L36;
                      } else {
                        qc.field_c[var2_int] = null;
                        var2_int++;
                        if (var8 != 0) {
                          break L11;
                        } else {
                          if (var8 == 0) {
                            continue L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    var2 = (bf) (Object) kh.field_y.c(-3905);
                    L37: while (true) {
                      if (null == var2) {
                        break L11;
                      } else {
                        stackOut_120_0 = fi.field_e;
                        stackOut_120_1 = (bf) var2;
                        stackIn_129_0 = stackOut_120_0;
                        stackIn_129_1 = stackOut_120_1;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          L38: {
                            if (stackIn_121_0 == stackIn_121_1) {
                              break L38;
                            } else {
                              var2.b(4);
                              break L38;
                            }
                          }
                          var2 = (bf) (Object) kh.field_y.a(-16913);
                          if (var8 == 0) {
                            continue L37;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var2 = fi.field_e;
              stackOut_125_0 = 10;
              stackOut_125_1 = u.field_b;
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              break L10;
            }
            if (stackIn_126_0 < stackIn_126_1) {
              u.field_b = 0;
              stackOut_128_0 = (bf) var2;
              stackOut_128_1 = (bf) var2;
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              break L9;
            } else {
              break L8;
            }
          }
          stackIn_129_0.field_k = stackIn_129_1.field_k + 1;
          break L8;
        }
        L39: {
          if (0 > var2.field_f) {
            var2.field_f = 0;
            var2.field_n = 50;
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          if (u.field_b < -100) {
            u.field_b = -100;
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          if (var2.field_f > 640) {
            var2.field_f = 640;
            var2.field_n = -50;
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          if (var2.field_u >= 0) {
            break L42;
          } else {
            var2.field_z = 50;
            var2.field_u = 0;
            break L42;
          }
        }
        L43: {
          if (var2.field_u > 448) {
            var2.field_z = -50;
            var2.field_u = 448;
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          if (ig.field_h <= 8) {
            break L44;
          } else {
            ig.field_h = sh.b(-6, 4);
            break L44;
          }
        }
        L45: {
          L46: {
            vd.field_j = vd.field_j + 3;
            hc.field_c = hc.field_c + 1;
            ed.field_n = ed.field_n + 1;
            if (ge.field_c[0] == 2) {
              break L46;
            } else {
              if (ge.field_c[0] == 7) {
                break L46;
              } else {
                if (ge.field_c[0] == 12) {
                  break L46;
                } else {
                  if (ua.field_c < -2) {
                    break L46;
                  } else {
                    break L45;
                  }
                }
              }
            }
          }
          vd.field_j = vd.field_j + 9;
          hc.field_c = hc.field_c + 3;
          if (ua.field_c < -2) {
            hc.field_c = hc.field_c + 3;
            ed.field_n = ed.field_n + 2;
            vd.field_j = vd.field_j + 9;
            break L45;
          } else {
            break L45;
          }
        }
        L47: {
          if (ed.field_n <= 1028) {
            break L47;
          } else {
            L48: {
              L49: {
                if (ua.field_c < ue.field_c[rj.field_h]) {
                  L50: {
                    ua.field_c = ua.field_c + 1;
                    if (ua.field_c == 9) {
                      var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                      var3_ref_bf.field_l = 5;
                      kh.field_y.b(97, (rf) (Object) var3_ref_bf);
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  L51: {
                    L52: {
                      L53: {
                        L54: {
                          L55: {
                            L56: {
                              if (rj.field_h != 0) {
                                break L56;
                              } else {
                                L57: {
                                  nf.field_e = -50;
                                  if (10 == ua.field_c) {
                                    break L57;
                                  } else {
                                    if (ua.field_c != 12) {
                                      break L56;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                var3 = sh.b(113, 640);
                                var4_int = -64 + (fi.field_e.field_f + sh.b(-126, 128));
                                var5_int = 0;
                                L58: while (true) {
                                  if (var5_int >= 5) {
                                    break L56;
                                  } else {
                                    var6 = new bf(var3, -var5_int * 64 + -64, var4_int, 17);
                                    var6.field_o = sh.b(-127, 32);
                                    kh.field_y.b(114, (rf) (Object) var6);
                                    var5_int++;
                                    if (var8 != 0) {
                                      break L55;
                                    } else {
                                      if (var8 == 0) {
                                        continue L58;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (rj.field_h == 1) {
                              break L55;
                            } else {
                              break L54;
                            }
                          }
                          L59: {
                            L60: {
                              if (ua.field_c != 4) {
                                break L60;
                              } else {
                                var3 = 36;
                                L61: while (true) {
                                  if (var3 >= 40) {
                                    break L60;
                                  } else {
                                    stackOut_179_0 = -1;
                                    stackOut_179_1 = ~(1 & var3);
                                    stackIn_189_0 = stackOut_179_0;
                                    stackIn_189_1 = stackOut_179_1;
                                    stackIn_180_0 = stackOut_179_0;
                                    stackIn_180_1 = stackOut_179_1;
                                    if (var8 != 0) {
                                      break L59;
                                    } else {
                                      L62: {
                                        if (stackIn_180_0 != stackIn_180_1) {
                                          stackOut_183_0 = 424;
                                          stackIn_184_0 = stackOut_183_0;
                                          break L62;
                                        } else {
                                          stackOut_182_0 = 296;
                                          stackIn_184_0 = stackOut_182_0;
                                          break L62;
                                        }
                                      }
                                      L63: {
                                        var4_int = stackIn_184_0;
                                        if (var3 >= 38) {
                                          stackOut_186_0 = -128;
                                          stackIn_187_0 = stackOut_186_0;
                                          break L63;
                                        } else {
                                          stackOut_185_0 = -256;
                                          stackIn_187_0 = stackOut_185_0;
                                          break L63;
                                        }
                                      }
                                      var5_int = stackIn_187_0;
                                      var6 = new bf(var4_int, var5_int, var4_int, 22);
                                      li.a(-126, var6);
                                      var6.field_l = var3;
                                      var6.field_n = 0;
                                      var6.field_z = 32;
                                      var3++;
                                      if (var8 == 0) {
                                        continue L61;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_188_0 = 5;
                            stackOut_188_1 = ua.field_c;
                            stackIn_189_0 = stackOut_188_0;
                            stackIn_189_1 = stackOut_188_1;
                            break L59;
                          }
                          L64: {
                            L65: {
                              L66: {
                                if (stackIn_189_0 == stackIn_189_1) {
                                  break L66;
                                } else {
                                  if (ua.field_c == 15) {
                                    break L66;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                              nf.field_e = -250;
                              var3 = 0;
                              L67: while (true) {
                                if (25 <= var3) {
                                  break L65;
                                } else {
                                  kh.field_y.b(99, (rf) (Object) new bf(sh.b(-128, 640), -var3 * 25 + -128, sh.b(60, 128) + fi.field_e.field_f - 64, 18));
                                  var3++;
                                  if (var8 != 0) {
                                    break L64;
                                  } else {
                                    if (var8 == 0) {
                                      continue L67;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                              }
                            }
                            L68: {
                              if (4 == ua.field_c) {
                                break L68;
                              } else {
                                if (ua.field_c == 6) {
                                  break L68;
                                } else {
                                  if (ua.field_c == 8) {
                                    break L68;
                                  } else {
                                    if (ua.field_c == 10) {
                                      break L68;
                                    } else {
                                      if (ua.field_c == 12) {
                                        break L68;
                                      } else {
                                        if (ua.field_c == 14) {
                                          break L68;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var3 = -300 + (900 * sh.b(45, 2) + 320);
                            break L64;
                          }
                          var4_int = 0;
                          L69: while (true) {
                            if (var4_int >= 5) {
                              break L54;
                            } else {
                              var5_ref = new bf(var3, 64 * -var4_int - 64, var3, 17);
                              var5_ref.field_o = sh.b(-127, 32);
                              kh.field_y.b(121, (rf) (Object) var5_ref);
                              var4_int++;
                              if (var8 != 0) {
                                break L53;
                              } else {
                                if (var8 == 0) {
                                  continue L69;
                                } else {
                                  break L54;
                                }
                              }
                            }
                          }
                        }
                        if (2 != rj.field_h) {
                          break L53;
                        } else {
                          L70: {
                            L71: {
                              L72: {
                                if (ua.field_c == 5) {
                                  break L72;
                                } else {
                                  if (10 == ua.field_c) {
                                    break L72;
                                  } else {
                                    if (ua.field_c == 15) {
                                      break L72;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                              }
                              nf.field_e = -150;
                              var3 = 0;
                              L73: while (true) {
                                if (25 <= var3) {
                                  break L71;
                                } else {
                                  kh.field_y.b(119, (rf) (Object) new bf(sh.b(76, 640), -128 + -var3 * 25, -64 + sh.b(-30, 128) + fi.field_e.field_f, 18));
                                  var3++;
                                  if (var8 != 0) {
                                    break L70;
                                  } else {
                                    if (var8 == 0) {
                                      continue L73;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                              }
                            }
                            if (ua.field_c != 16) {
                              break L70;
                            } else {
                              var3 = 48;
                              L74: while (true) {
                                if (var3 >= 640) {
                                  break L70;
                                } else {
                                  var4_ref = new bf(var3, -64 - Math.abs(-320 + var3), var3, 21);
                                  var4_ref.field_o = sh.b(-127, 32);
                                  kh.field_y.b(57, (rf) (Object) var4_ref);
                                  var3 += 96;
                                  if (var8 != 0) {
                                    break L53;
                                  } else {
                                    if (var8 == 0) {
                                      continue L74;
                                    } else {
                                      break L70;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (ua.field_c < 4) {
                            break L53;
                          } else {
                            if (ua.field_c > 14) {
                              break L53;
                            } else {
                              if (0 == (ua.field_c & 1)) {
                                var3 = sh.b(-128, 2) * 900 + 20;
                                var4_int = 0;
                                L75: while (true) {
                                  if (var4_int >= 5) {
                                    break L53;
                                  } else {
                                    var5_ref = new bf(var3, -var4_int * 64 - 64, var3, 17);
                                    var5_ref.field_o = sh.b(-126, 32);
                                    kh.field_y.b(89, (rf) (Object) var5_ref);
                                    var4_int++;
                                    if (var8 != 0) {
                                      break L52;
                                    } else {
                                      if (var8 == 0) {
                                        continue L75;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L53;
                              }
                            }
                          }
                        }
                      }
                      if (3 == rj.field_h) {
                        break L52;
                      } else {
                        break L51;
                      }
                    }
                    L76: {
                      if (ua.field_c == 5) {
                        break L76;
                      } else {
                        if (ua.field_c == 10) {
                          break L76;
                        } else {
                          break L51;
                        }
                      }
                    }
                    var3 = 0;
                    L77: while (true) {
                      if (var3 >= 25) {
                        break L51;
                      } else {
                        kh.field_y.b(115, (rf) (Object) new bf(sh.b(-126, 640), -128 + 25 * -var3, sh.b(8, 128) - (-fi.field_e.field_f + 64), 18));
                        var3++;
                        if (var8 != 0) {
                          break L48;
                        } else {
                          if (var8 == 0) {
                            continue L77;
                          } else {
                            break L51;
                          }
                        }
                      }
                    }
                  }
                  if (ua.field_c != -2) {
                    break L49;
                  } else {
                    if (rj.field_h > 0) {
                      dg.field_l = 0;
                      mj.a(255, 12, 0, 43, 100);
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                } else {
                  break L49;
                }
              }
              ed.field_n = sh.b(64, 640);
              break L48;
            }
            L78: {
              L79: {
                if (0 == rj.field_h) {
                  break L79;
                } else {
                  if (rj.field_h != 3) {
                    break L78;
                  } else {
                    break L79;
                  }
                }
              }
              L80: {
                if (ua.field_c <= 0) {
                  L81: {
                    if (2 != ge.field_c[0]) {
                      break L81;
                    } else {
                      var3_ref_int__ = ge.field_c;
                      ge.field_c[1] = 1;
                      var3_ref_int__[0] = 1;
                      break L81;
                    }
                  }
                  L82: {
                    if (ge.field_c[0] != 7) {
                      break L82;
                    } else {
                      ge.field_c[1] = 6;
                      var3_ref_int__ = ge.field_c;
                      var3_ref_int__[0] = 6;
                      break L82;
                    }
                  }
                  if (12 == ge.field_c[0]) {
                    ge.field_c[1] = 11;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 11;
                    break L80;
                  } else {
                    break L80;
                  }
                } else {
                  break L80;
                }
              }
              L83: {
                if (0 > ua.field_c) {
                  break L83;
                } else {
                  if (ua.field_c > 12) {
                    break L83;
                  } else {
                    if ((1 & ua.field_c) == 0) {
                      gd.field_d = (ua.field_c >> -985950047) + 2;
                      boolean discarded$7 = v.a(new d(sh.b(-127, 640), -156, 0, 128 + sh.b(-127, 256), 16777215, 4), -4001);
                      break L83;
                    } else {
                      break L83;
                    }
                  }
                }
              }
              L84: {
                if (ua.field_c == 12) {
                  ge.field_c[1] = 3;
                  var3_ref_int__ = ge.field_c;
                  var3_ref_int__[0] = 3;
                  break L84;
                } else {
                  break L84;
                }
              }
              if (13 != ua.field_c) {
                break L78;
              } else {
                ge.field_c[1] = 1;
                var3_ref_int__ = ge.field_c;
                var3_ref_int__[0] = 1;
                break L78;
              }
            }
            L85: {
              if (rj.field_h == 1) {
                L86: {
                  if (ua.field_c <= 0) {
                    L87: {
                      if (ge.field_c[0] == 2) {
                        var3_ref_int__ = ge.field_c;
                        ge.field_c[1] = 1;
                        var3_ref_int__[0] = 1;
                        break L87;
                      } else {
                        break L87;
                      }
                    }
                    L88: {
                      if (ge.field_c[0] == 7) {
                        ge.field_c[1] = 6;
                        var3_ref_int__ = ge.field_c;
                        var3_ref_int__[0] = 6;
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                    if (ge.field_c[0] == 12) {
                      var3_ref_int__ = ge.field_c;
                      ge.field_c[1] = 11;
                      var3_ref_int__[0] = 11;
                      break L86;
                    } else {
                      break L86;
                    }
                  } else {
                    break L86;
                  }
                }
                L89: {
                  if (1 != ua.field_c) {
                    break L89;
                  } else {
                    ge.field_c[0] = 4;
                    break L89;
                  }
                }
                L90: {
                  if (3 == ua.field_c) {
                    var3_ref_int__ = ge.field_c;
                    ge.field_c[1] = 3;
                    var3_ref_int__[0] = 3;
                    break L90;
                  } else {
                    break L90;
                  }
                }
                L91: {
                  if (ua.field_c != 6) {
                    break L91;
                  } else {
                    ge.field_c[1] = 1;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 1;
                    break L91;
                  }
                }
                L92: {
                  if (ua.field_c == 8) {
                    ge.field_c[1] = 5;
                    break L92;
                  } else {
                    break L92;
                  }
                }
                L93: {
                  if (9 != ua.field_c) {
                    break L93;
                  } else {
                    var3_ref_int__ = ge.field_c;
                    ge.field_c[1] = 13;
                    var3_ref_int__[0] = 13;
                    break L93;
                  }
                }
                L94: {
                  if (ua.field_c == 12) {
                    ge.field_c[1] = 11;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 11;
                    break L94;
                  } else {
                    break L94;
                  }
                }
                L95: {
                  if (ua.field_c == 14) {
                    ge.field_c[1] = 9;
                    break L95;
                  } else {
                    break L95;
                  }
                }
                L96: {
                  if (ua.field_c == 15) {
                    ge.field_c[1] = 8;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 8;
                    break L96;
                  } else {
                    break L96;
                  }
                }
                L97: {
                  if (ua.field_c == 18) {
                    ge.field_c[1] = 6;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 6;
                    break L97;
                  } else {
                    break L97;
                  }
                }
                if (ua.field_c != 20) {
                  break L85;
                } else {
                  ge.field_c[0] = 10;
                  break L85;
                }
              } else {
                break L85;
              }
            }
            if (rj.field_h != 2) {
              break L47;
            } else {
              L98: {
                if (0 >= ua.field_c) {
                  L99: {
                    if (2 != ge.field_c[0]) {
                      break L99;
                    } else {
                      ge.field_c[1] = 1;
                      var3_ref_int__ = ge.field_c;
                      var3_ref_int__[0] = 1;
                      break L99;
                    }
                  }
                  L100: {
                    if (7 == ge.field_c[0]) {
                      var3_ref_int__ = ge.field_c;
                      ge.field_c[1] = 6;
                      var3_ref_int__[0] = 6;
                      break L100;
                    } else {
                      break L100;
                    }
                  }
                  if (ge.field_c[0] != 12) {
                    break L98;
                  } else {
                    ge.field_c[1] = 11;
                    var3_ref_int__ = ge.field_c;
                    var3_ref_int__[0] = 11;
                    break L98;
                  }
                } else {
                  break L98;
                }
              }
              L101: {
                if (4 == ua.field_c) {
                  gd.field_d = 9;
                  boolean discarded$8 = v.a(new d(sh.b(-128, 640), -156, 0, sh.b(107, 256) - -128, 16777215, 4), -4001);
                  break L101;
                } else {
                  break L101;
                }
              }
              L102: {
                if (ua.field_c != 5) {
                  break L102;
                } else {
                  ge.field_c[1] = 8;
                  var3_ref_int__ = ge.field_c;
                  var3_ref_int__[0] = 8;
                  break L102;
                }
              }
              L103: {
                if (ua.field_c != 9) {
                  break L103;
                } else {
                  var3_ref_int__ = ge.field_c;
                  ge.field_c[1] = 6;
                  var3_ref_int__[0] = 6;
                  break L103;
                }
              }
              L104: {
                if (ua.field_c == 10) {
                  gd.field_d = 10;
                  boolean discarded$9 = v.a(new d(sh.b(8, 640), -156, 0, sh.b(-128, 256) - -128, 16777215, 4), -4001);
                  break L104;
                } else {
                  break L104;
                }
              }
              L105: {
                if (ua.field_c != 11) {
                  break L105;
                } else {
                  var3_ref_int__ = ge.field_c;
                  ge.field_c[1] = 13;
                  var3_ref_int__[0] = 13;
                  break L105;
                }
              }
              L106: {
                if (ua.field_c != 15) {
                  break L106;
                } else {
                  var3_ref_int__ = ge.field_c;
                  ge.field_c[1] = 11;
                  var3_ref_int__[0] = 11;
                  break L106;
                }
              }
              L107: {
                if (ua.field_c != 16) {
                  break L107;
                } else {
                  gd.field_d = 11;
                  boolean discarded$10 = v.a(new d(sh.b(-8, 640), -156, 0, sh.b(118, 256) + 128, 16777215, 4), -4001);
                  break L107;
                }
              }
              if (19 == ua.field_c) {
                gd.field_d = 12;
                boolean discarded$11 = v.a(new d(sh.b(-128, 640), -156, 0, 128 + sh.b(2, 256), 16777215, 4), -4001);
                break L47;
              } else {
                break L47;
              }
            }
          }
        }
        L108: {
          if (gf.field_b <= 0) {
            break L108;
          } else {
            if (rj.field_h < 3) {
              kk.field_d = kk.field_d - 1;
              if (kk.field_d > 0) {
                break L108;
              } else {
                L109: {
                  kk.field_d = 50;
                  gf.field_b = gf.field_b - 1;
                  var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                  if (gf.field_b == 0) {
                    var3_ref_bf.field_l = 4;
                    break L109;
                  } else {
                    break L109;
                  }
                }
                L110: {
                  if (gf.field_b != 1) {
                    break L110;
                  } else {
                    var3_ref_bf.field_l = 0;
                    break L110;
                  }
                }
                kh.field_y.b(69, (rf) (Object) var3_ref_bf);
                break L108;
              }
            } else {
              break L108;
            }
          }
        }
        L111: {
          if (ia.field_k >= tg.field_y) {
            L112: {
              L113: {
                if (tg.field_y < 1000) {
                  break L113;
                } else {
                  var3 = 500 + tg.field_y;
                  if (var8 == 0) {
                    break L112;
                  } else {
                    break L113;
                  }
                }
              }
              L114: {
                if (tg.field_y <= 0) {
                  break L114;
                } else {
                  var3 = tg.field_y + (tg.field_y << 373460929) / 3;
                  if (var8 == 0) {
                    break L112;
                  } else {
                    break L114;
                  }
                }
              }
              var3 = tg.field_y - -10;
              break L112;
            }
            var4_int = sh.b(-128, 640);
            tg.field_y = var3;
            kh.field_y.b(60, (rf) (Object) new bf(var4_int, -32, var4_int, 10));
            break L111;
          } else {
            break L111;
          }
        }
        L115: {
          L116: {
            if (rj.field_h == 2) {
              break L116;
            } else {
              if (rj.field_h != 3) {
                break L115;
              } else {
                break L116;
              }
            }
          }
          if (0 >= u.field_d) {
            il.field_i = il.field_i + (rj.field_h - 4);
            rj.field_h = 4;
            break L115;
          } else {
            break L115;
          }
        }
        L117: {
          if (rj.field_h != 3) {
            break L117;
          } else {
            if (nf.field_l < 2) {
              il.field_i = il.field_i + (-4 + rj.field_h);
              rj.field_h = 4;
              break L117;
            } else {
              break L117;
            }
          }
        }
        L118: {
          if (~ua.field_c < ~ue.field_c[rj.field_h]) {
            break L118;
          } else {
            if (fi.field_e.field_k <= 0) {
              break L118;
            } else {
              nf.field_e = nf.field_e + 2;
              break L118;
            }
          }
        }
        L119: {
          if (nf.field_e > 200) {
            L120: {
              if (rj.field_h != 0) {
                break L120;
              } else {
                this.o(0);
                break L120;
              }
            }
            L121: {
              if (rj.field_h != 1) {
                break L121;
              } else {
                this.l((byte) 91);
                break L121;
              }
            }
            L122: {
              if (2 != rj.field_h) {
                break L122;
              } else {
                this.k((byte) 104);
                break L122;
              }
            }
            if (rj.field_h != 3) {
              break L119;
            } else {
              this.p(-256);
              break L119;
            }
          } else {
            break L119;
          }
        }
        L123: {
          if (dg.field_l >= 96) {
            break L123;
          } else {
            dg.field_l = dg.field_l + 1;
            break L123;
          }
        }
        dl.field_a = 0;
        var3 = -64 / ((38 - param0) / 48);
        var4_ref = (bf) (Object) kh.field_y.c(-3905);
        L124: while (true) {
          L125: {
            L126: {
              if (var4_ref == null) {
                break L126;
              } else {
                stackOut_407_0 = var4_ref.a(qc.field_c, (StarCannon) this, 114);
                stackIn_414_0 = stackOut_407_0 ? 1 : 0;
                stackIn_408_0 = stackOut_407_0;
                if (var8 != 0) {
                  break L125;
                } else {
                  L127: {
                    if (!stackIn_408_0) {
                      var4_ref.b(4);
                      break L127;
                    } else {
                      break L127;
                    }
                  }
                  var4_ref = (bf) (Object) kh.field_y.a(-16913);
                  if (var8 == 0) {
                    continue L124;
                  } else {
                    break L126;
                  }
                }
              }
            }
            stackOut_413_0 = -1;
            stackIn_414_0 = stackOut_413_0;
            break L125;
          }
          L128: {
            if (stackIn_414_0 > ~tj.field_G) {
              fi.field_e.field_k = 1;
              break L128;
            } else {
              break L128;
            }
          }
          var3 = 0;
          L129: while (true) {
            L130: {
              L131: {
                if (4000 <= var3) {
                  break L131;
                } else {
                  if (var8 != 0) {
                    break L130;
                  } else {
                    L132: {
                      if (null == qc.field_c[var3]) {
                        break L132;
                      } else {
                        if (null == qc.field_c[var3].a((byte) 108)) {
                          qc.field_c[var3] = null;
                          if (~var3 > ~fi.field_d) {
                            fi.field_d = var3;
                            break L132;
                          } else {
                            break L132;
                          }
                        } else {
                          break L132;
                        }
                      }
                    }
                    var3++;
                    if (var8 == 0) {
                      continue L129;
                    } else {
                      break L131;
                    }
                  }
                }
              }
              if (vb.field_m <= 0) {
                break L130;
              } else {
                L133: {
                  var2 = fi.field_e;
                  if (rj.field_h < 4) {
                    break L133;
                  } else {
                    L134: {
                      var2.field_z = var2.field_z - (jl.field_j - -3);
                      if (var2.field_z >= -250) {
                        break L134;
                      } else {
                        var2.field_z = -250;
                        break L134;
                      }
                    }
                    L135: {
                      var2.field_f = (9 * var2.field_f - -320) / 10;
                      if (var2.field_z <= 0) {
                        break L135;
                      } else {
                        var2.field_z = -(95 * var2.field_z) / 100;
                        break L135;
                      }
                    }
                    L136: {
                      if (((StarCannon) this).field_D >= 250) {
                        break L136;
                      } else {
                        ((StarCannon) this).field_D = ((StarCannon) this).field_D + 1;
                        var2.field_u = (320 + var2.field_u * 9) / 10;
                        var2.field_z = 0;
                        break L136;
                      }
                    }
                    if (((StarCannon) this).field_D < 250) {
                      break L130;
                    } else {
                      if (64 <= var2.field_u) {
                        break L130;
                      } else {
                        tj.field_G = 0;
                        gj.field_c = -1;
                        il.field_i = il.field_i + rj.field_h;
                        var2.field_k = -1;
                        ((StarCannon) this).field_D = 0;
                        rj.field_h = 0;
                        if (field_z != -1) {
                          break L130;
                        } else {
                          var3 = 0;
                          L137: while (true) {
                            L138: {
                              L139: {
                                if (var3 >= 4000) {
                                  break L139;
                                } else {
                                  qc.field_c[var3] = null;
                                  var3++;
                                  if (var8 != 0) {
                                    break L138;
                                  } else {
                                    if (var8 == 0) {
                                      continue L137;
                                    } else {
                                      break L139;
                                    }
                                  }
                                }
                              }
                              var3_ref_bf = (bf) (Object) kh.field_y.c(-3905);
                              L140: while (true) {
                                L141: {
                                  L142: {
                                    if (var3_ref_bf == null) {
                                      break L142;
                                    } else {
                                      if (var8 != 0) {
                                        break L141;
                                      } else {
                                        L143: {
                                          if (fi.field_e != var3_ref_bf) {
                                            var3_ref_bf.b(4);
                                            break L143;
                                          } else {
                                            break L143;
                                          }
                                        }
                                        var3_ref_bf = (bf) (Object) kh.field_y.a(-16913);
                                        if (var8 == 0) {
                                          continue L140;
                                        } else {
                                          break L142;
                                        }
                                      }
                                    }
                                  }
                                  L144: {
                                    if (kd.field_C != 0) {
                                      break L144;
                                    } else {
                                      if (jg.field_H == 0) {
                                        break L144;
                                      } else {
                                        break L144;
                                      }
                                    }
                                  }
                                  hh.field_c = 0;
                                  bf.field_w = 0;
                                  ha.field_c = 0;
                                  jl.field_j = 5;
                                  vb.field_m = 2;
                                  break L141;
                                }
                                var3 = 0;
                                break L138;
                              }
                            }
                            L145: {
                              L146: {
                                if (wk.a(108)) {
                                  break L146;
                                } else {
                                  L147: {
                                    pg.a(true, (byte) -121);
                                    sa.a(nf.field_l + na.field_a * 3, 23820);
                                    fc.field_e = fc.field_e - (ia.field_k << 751856385);
                                    ia.field_k = 0;
                                    if (jg.field_H <= 0) {
                                      break L147;
                                    } else {
                                      var3 = 5;
                                      if (var8 == 0) {
                                        break L145;
                                      } else {
                                        break L147;
                                      }
                                    }
                                  }
                                  if (kd.field_C <= 0) {
                                    break L145;
                                  } else {
                                    var3 = 2;
                                    if (var8 == 0) {
                                      break L145;
                                    } else {
                                      break L146;
                                    }
                                  }
                                }
                              }
                              L148: {
                                if (kd.field_C > 0) {
                                  break L148;
                                } else {
                                  if (0 >= jg.field_H) {
                                    break L145;
                                  } else {
                                    break L148;
                                  }
                                }
                              }
                              var3 = 6;
                              break L145;
                            }
                            od.a(-106, var3, false);
                            if (var8 == 0) {
                              break L130;
                            } else {
                              break L133;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (fi.field_e.field_k > 0) {
                  L149: {
                    if (!wc.field_c[96]) {
                      break L149;
                    } else {
                      L150: {
                        var2.field_n = var2.field_n - (jl.field_j - -3);
                        if (var2.field_n >= -250) {
                          break L150;
                        } else {
                          var2.field_n = -250;
                          break L150;
                        }
                      }
                      if (var2.field_n > 0) {
                        var2.field_n = var2.field_n * 95 / 100;
                        break L149;
                      } else {
                        break L149;
                      }
                    }
                  }
                  L151: {
                    if (wc.field_c[98]) {
                      L152: {
                        var2.field_z = var2.field_z - (jl.field_j - -3);
                        if (var2.field_z < -250) {
                          var2.field_z = -250;
                          break L152;
                        } else {
                          break L152;
                        }
                      }
                      if (0 >= var2.field_z) {
                        break L151;
                      } else {
                        var2.field_z = -(var2.field_z * 95) / 100;
                        break L151;
                      }
                    } else {
                      break L151;
                    }
                  }
                  L153: {
                    if (wc.field_c[97]) {
                      L154: {
                        var2.field_n = var2.field_n + (3 + jl.field_j);
                        if (var2.field_n <= 250) {
                          break L154;
                        } else {
                          var2.field_n = 250;
                          break L154;
                        }
                      }
                      if (var2.field_n >= 0) {
                        break L153;
                      } else {
                        var2.field_n = 95 * var2.field_n / 100;
                        break L153;
                      }
                    } else {
                      break L153;
                    }
                  }
                  L155: {
                    if (wc.field_c[96]) {
                      break L155;
                    } else {
                      if (!wc.field_c[97]) {
                        var2.field_n = 90 * var2.field_n / 100;
                        break L155;
                      } else {
                        break L155;
                      }
                    }
                  }
                  L156: {
                    if (!wc.field_c[99]) {
                      break L156;
                    } else {
                      L157: {
                        var2.field_z = var2.field_z + (3 + jl.field_j);
                        if (var2.field_z <= 120) {
                          break L157;
                        } else {
                          var2.field_z = 120;
                          break L157;
                        }
                      }
                      if (0 <= var2.field_z) {
                        break L156;
                      } else {
                        var2.field_z = 95 * var2.field_z / 100;
                        break L156;
                      }
                    }
                  }
                  L158: {
                    L159: {
                      if (wc.field_c[82]) {
                        break L159;
                      } else {
                        if (!wc.field_c[83]) {
                          break L158;
                        } else {
                          break L159;
                        }
                      }
                    }
                    if (var2.field_j == 0) {
                      gi.field_g = false;
                      u.field_b = u.field_b - 2;
                      var2.field_j = 1;
                      break L158;
                    } else {
                      break L158;
                    }
                  }
                  if (wc.field_c[98]) {
                    break L130;
                  } else {
                    if (!wc.field_c[99]) {
                      var2.field_z = var2.field_z * 90 / 100;
                      break L130;
                    } else {
                      break L130;
                    }
                  }
                } else {
                  break L130;
                }
              }
            }
            L160: {
              L161: {
                L162: {
                  if (tj.field_G <= 1000) {
                    break L162;
                  } else {
                    if (se.field_m > 2) {
                      break L161;
                    } else {
                      break L162;
                    }
                  }
                }
                if (2 != se.field_m) {
                  break L160;
                } else {
                  if (ua.field_c == 20) {
                    break L161;
                  } else {
                    break L160;
                  }
                }
              }
              tj.field_G = 0;
              hc.field_e = "hahahah";
              break L160;
            }
            L163: while (true) {
              L164: {
                L165: {
                  if (!ad.e((byte) 103)) {
                    break L165;
                  } else {
                    stackOut_530_0 = ~field_E;
                    stackOut_530_1 = -1;
                    stackIn_603_0 = stackOut_530_0;
                    stackIn_603_1 = stackOut_530_1;
                    stackIn_531_0 = stackOut_530_0;
                    stackIn_531_1 = stackOut_530_1;
                    if (var8 != 0) {
                      break L164;
                    } else {
                      L166: {
                        if (stackIn_531_0 >= stackIn_531_1) {
                          break L166;
                        } else {
                          L167: {
                            hc.field_e = hc.field_e.substring(1) + field_E;
                            if (se.field_m < 2) {
                              break L167;
                            } else {
                              if (ua.field_c >= 20) {
                                break L166;
                              } else {
                                if (2 == se.field_m) {
                                  break L167;
                                } else {
                                  break L166;
                                }
                              }
                            }
                          }
                          if (2 <= ad.field_y) {
                            L168: {
                              var3 = a.field_a ? 1 : 0;
                              if (!hc.field_e.equalsIgnoreCase("thunder")) {
                                break L168;
                              } else {
                                cg.field_e = 7;
                                a.field_a = true;
                                break L168;
                              }
                            }
                            L169: {
                              if (!hc.field_e.equalsIgnoreCase("beeswax")) {
                                break L169;
                              } else {
                                tj.field_G = 10000;
                                a.field_a = true;
                                break L169;
                              }
                            }
                            L170: {
                              if (hc.field_e.equalsIgnoreCase("diewell")) {
                                ua.field_c = -1 + ue.field_c[rj.field_h];
                                a.field_a = true;
                                hc.field_e = "hahahah";
                                break L170;
                              } else {
                                break L170;
                              }
                            }
                            L171: {
                              if (hc.field_e.equalsIgnoreCase("donefor")) {
                                pf.field_d = 1000;
                                a.field_a = true;
                                jk.field_j = 0;
                                break L171;
                              } else {
                                break L171;
                              }
                            }
                            L172: {
                              if (!hc.field_e.equalsIgnoreCase("xebeams")) {
                                break L172;
                              } else {
                                hh.field_c = 1;
                                kh.field_y.b(70, (rf) (Object) new bf(0, -128, 0, 13));
                                a.field_a = true;
                                break L172;
                              }
                            }
                            L173: {
                              if (!hc.field_e.equalsIgnoreCase("levskip")) {
                                break L173;
                              } else {
                                il.field_i = il.field_i + (rj.field_h - 2);
                                u.field_d = 1;
                                rj.field_h = 2;
                                a.field_a = true;
                                hc.field_e = "hahahah";
                                break L173;
                              }
                            }
                            if (!a.field_a) {
                              break L166;
                            } else {
                              if (var3 != 0) {
                                break L166;
                              } else {
                                fc.field_e = fc.field_e + 1;
                                il.field_i = il.field_i + 1;
                                break L166;
                              }
                            }
                          } else {
                            break L166;
                          }
                        }
                      }
                      L174: {
                        if (13 != lb.field_B) {
                          break L174;
                        } else {
                          L175: {
                            if (rj.field_h != 4) {
                              break L175;
                            } else {
                              fi.field_e.field_u = 32;
                              if (var8 == 0) {
                                break L174;
                              } else {
                                break L175;
                              }
                            }
                          }
                          L176: {
                            L177: {
                              if (fi.field_e.field_k != 0) {
                                break L177;
                              } else {
                                if (gj.field_c != 0) {
                                  break L177;
                                } else {
                                  L178: {
                                    if (25 <= fi.field_e.field_r) {
                                      break L178;
                                    } else {
                                      fi.field_e.field_r = -fi.field_e.field_r + 192;
                                      if (var8 == 0) {
                                        break L176;
                                      } else {
                                        break L178;
                                      }
                                    }
                                  }
                                  if (fi.field_e.field_r < 167) {
                                    fi.field_e.field_r = 167;
                                    if (var8 == 0) {
                                      break L176;
                                    } else {
                                      break L177;
                                    }
                                  } else {
                                    break L176;
                                  }
                                }
                              }
                            }
                            od.a(-99, 1, false);
                            break L176;
                          }
                          pg.a(true, (byte) -87);
                          return;
                        }
                      }
                      L179: {
                        if (ad.field_y < 2) {
                          break L179;
                        } else {
                          L180: {
                            if (lb.field_B == 32) {
                              L181: {
                                if (qb.field_e != 0) {
                                  break L181;
                                } else {
                                  sd.field_c = sd.field_c + 1;
                                  if (var8 == 0) {
                                    break L180;
                                  } else {
                                    break L181;
                                  }
                                }
                              }
                              sd.field_c = 0;
                              qb.field_e = 0;
                              break L180;
                            } else {
                              break L180;
                            }
                          }
                          L182: {
                            if (lb.field_B != 33) {
                              break L182;
                            } else {
                              L183: {
                                if (qb.field_e != 1) {
                                  break L183;
                                } else {
                                  sd.field_c = sd.field_c + 1;
                                  if (var8 == 0) {
                                    break L182;
                                  } else {
                                    break L183;
                                  }
                                }
                              }
                              sd.field_c = 0;
                              qb.field_e = 1;
                              break L182;
                            }
                          }
                          if (lb.field_B == 34) {
                            L184: {
                              if (2 == qb.field_e) {
                                break L184;
                              } else {
                                sd.field_c = 0;
                                qb.field_e = 2;
                                if (var8 == 0) {
                                  break L179;
                                } else {
                                  break L184;
                                }
                              }
                            }
                            sd.field_c = sd.field_c + 1;
                            break L179;
                          } else {
                            break L179;
                          }
                        }
                      }
                      if (gj.field_c == -1) {
                        hc.field_e = "hahahah";
                        cg.field_e = 0;
                        if (var8 == 0) {
                          continue L163;
                        } else {
                          break L165;
                        }
                      } else {
                        continue L163;
                      }
                    }
                  }
                }
                hc.field_c = hc.field_c + 1;
                vd.field_j = vd.field_j + 3;
                stackOut_602_0 = 2;
                stackOut_602_1 = ad.field_y;
                stackIn_603_0 = stackOut_602_0;
                stackIn_603_1 = stackOut_602_1;
                break L164;
              }
              L185: {
                if (stackIn_603_0 > stackIn_603_1) {
                  break L185;
                } else {
                  if (cg.field_e != 7) {
                    break L185;
                  } else {
                    jl.field_j = 20;
                    il.field_i = il.field_i + 1;
                    fc.field_e = fc.field_e + 1;
                    vb.field_m = 20;
                    a.field_a = true;
                    break L185;
                  }
                }
              }
              L186: {
                L187: {
                  if (hc.field_c > 240) {
                    qd.field_E[2] = qd.field_E[1];
                    hc.field_c = hc.field_c - 240;
                    qd.field_E[1] = qd.field_E[0];
                    qd.field_E[0] = ge.field_c[0];
                    qd.field_E[5] = qd.field_E[4];
                    qd.field_E[4] = qd.field_E[3];
                    qd.field_E[3] = ge.field_c[1];
                    var3 = 0;
                    L188: while (true) {
                      if (var3 >= 2) {
                        break L187;
                      } else {
                        stackOut_611_0 = ge.field_c[var3];
                        stackOut_611_1 = 1;
                        stackIn_641_0 = stackOut_611_0;
                        stackIn_641_1 = stackOut_611_1;
                        stackIn_612_0 = stackOut_611_0;
                        stackIn_612_1 = stackOut_611_1;
                        if (var8 != 0) {
                          break L186;
                        } else {
                          L189: {
                            if (stackIn_612_0 == stackIn_612_1) {
                              ge.field_c[var3] = 0;
                              break L189;
                            } else {
                              break L189;
                            }
                          }
                          L190: {
                            if (ge.field_c[var3] != 3) {
                              break L190;
                            } else {
                              ge.field_c[var3] = 2;
                              break L190;
                            }
                          }
                          L191: {
                            if (ge.field_c[var3] == 4) {
                              ge.field_c[var3] = 0;
                              break L191;
                            } else {
                              break L191;
                            }
                          }
                          L192: {
                            if (ge.field_c[var3] == 5) {
                              ge.field_c[var3] = 0;
                              break L192;
                            } else {
                              break L192;
                            }
                          }
                          L193: {
                            if (ge.field_c[var3] == 6) {
                              ge.field_c[var3] = 0;
                              break L193;
                            } else {
                              break L193;
                            }
                          }
                          L194: {
                            if (8 != ge.field_c[var3]) {
                              break L194;
                            } else {
                              ge.field_c[var3] = 7;
                              break L194;
                            }
                          }
                          L195: {
                            if (ge.field_c[var3] == 9) {
                              ge.field_c[var3] = 0;
                              break L195;
                            } else {
                              break L195;
                            }
                          }
                          L196: {
                            if (10 != ge.field_c[var3]) {
                              break L196;
                            } else {
                              ge.field_c[var3] = 0;
                              break L196;
                            }
                          }
                          L197: {
                            if (ge.field_c[var3] == 11) {
                              ge.field_c[var3] = 0;
                              break L197;
                            } else {
                              break L197;
                            }
                          }
                          L198: {
                            if (ge.field_c[var3] != 13) {
                              break L198;
                            } else {
                              ge.field_c[var3] = 12;
                              break L198;
                            }
                          }
                          var3++;
                          if (var8 == 0) {
                            continue L188;
                          } else {
                            break L187;
                          }
                        }
                      }
                    }
                  } else {
                    break L187;
                  }
                }
                stackOut_640_0 = vd.field_j;
                stackOut_640_1 = 480;
                stackIn_641_0 = stackOut_640_0;
                stackIn_641_1 = stackOut_640_1;
                break L186;
              }
              L199: {
                if (stackIn_641_0 <= stackIn_641_1) {
                  break L199;
                } else {
                  vd.field_j = vd.field_j - 480;
                  break L199;
                }
              }
              L200: {
                if (0 > gj.field_c) {
                  if (!bi.field_b) {
                    lc.field_gb = lc.field_gb + 1;
                    if (1280 >= lc.field_gb) {
                      break L200;
                    } else {
                      lc.field_gb = -640;
                      break L200;
                    }
                  } else {
                    break L200;
                  }
                } else {
                  break L200;
                }
              }
              pg.a(true, (byte) -104);
              return;
            }
          }
        }
    }

    final void s(int param0) {
        jl.field_j = jl.field_j + 5;
        dg.field_l = 0;
        mj.a(96, 12, 0, 28, 100);
        if (param0 != -9) {
            return;
        }
        try {
            mj.a(255, 12, 1200, 37, 100);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.N(" + param0 + ')');
        }
    }

    final void u(int param0) {
        try {
            vb.field_m = vb.field_m + 1;
            dg.field_l = 0;
            mj.a(96, param0 + -88, 0, 30, 100);
            mj.a(255, param0 ^ 104, 1200, 35, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.W(" + param0 + ')');
        }
    }

    private final void l(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bf var9 = null;
        int var10 = 0;
        bf var10_ref_bf = null;
        int var11_int = 0;
        bf var11 = null;
        int var12 = 0;
        int stackIn_101_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        bf stackIn_121_0 = null;
        bf stackIn_123_0 = null;
        bf stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        bf stackIn_143_0 = null;
        bf stackIn_145_0 = null;
        bf stackIn_147_0 = null;
        bf stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_172_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_175_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_170_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_174_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_171_1 = 0;
        int stackOut_172_0 = 0;
        int stackOut_172_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        bf stackOut_142_0 = null;
        bf stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        bf stackOut_143_0 = null;
        bf stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_113_0 = 0;
        bf stackOut_120_0 = null;
        bf stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        bf stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        var12 = field_A;
        try {
          L0: {
            L1: {
              var2_int = sh.b(param0 + -31, 3) - -ua.field_c;
              if (~var2_int >= ~ue.field_c[rj.field_h]) {
                break L1;
              } else {
                if (~ua.field_c < ~ue.field_c[rj.field_h]) {
                  break L1;
                } else {
                  var2_int = ue.field_c[rj.field_h];
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 91) {
                break L2;
              } else {
                this.l((byte) 51);
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      var3 = sh.b(35, 640);
                      var4 = -64 + fi.field_e.field_f + sh.b(param0 ^ -39, 128);
                      var5 = null;
                      var10 = var2_int;
                      if (var10 != 0) {
                        break L7;
                      } else {
                        if (var12 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (1 == var10) {
                      break L6;
                    } else {
                      L8: {
                        if (var10 != 4) {
                          break L8;
                        } else {
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var10 != 5) {
                          break L9;
                        } else {
                          if (var12 == 0) {
                            break L5;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (2 == var10) {
                        break L4;
                      } else {
                        if (var10 == 6) {
                          break L4;
                        } else {
                          if (var10 == 11) {
                            break L4;
                          } else {
                            L10: {
                              if (var10 != 13) {
                                break L10;
                              } else {
                                if (var12 == 0) {
                                  break L4;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var10 == 3) {
                                break L11;
                              } else {
                                if (var10 == 16) {
                                  break L11;
                                } else {
                                  L12: {
                                    L13: {
                                      L14: {
                                        L15: {
                                          L16: {
                                            L17: {
                                              L18: {
                                                if (var10 == 8) {
                                                  nf.field_e = 0;
                                                  var10 = -8;
                                                  L19: while (true) {
                                                    L20: {
                                                      if (var10 > 8) {
                                                        break L20;
                                                      } else {
                                                        kh.field_y.b(86, (rf) (Object) new bf(320 + var10 * 24, -Math.abs(-64 + 64 * var10), 320 - -(24 * var10), 1));
                                                        var10++;
                                                        if (var12 == 0) {
                                                          continue L19;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    if (var12 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                } else {
                                                  if (var10 == 18) {
                                                    break L18;
                                                  } else {
                                                    L21: {
                                                      if (7 != var10) {
                                                        break L21;
                                                      } else {
                                                        if (var12 == 0) {
                                                          break L17;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    L22: {
                                                      if (var10 != 15) {
                                                        break L22;
                                                      } else {
                                                        if (var12 == 0) {
                                                          break L17;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    L23: {
                                                      if (var10 != 19) {
                                                        break L23;
                                                      } else {
                                                        if (var12 == 0) {
                                                          break L17;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (var10 != 9) {
                                                        break L24;
                                                      } else {
                                                        if (var12 == 0) {
                                                          break L16;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    if (var10 == 14) {
                                                      break L16;
                                                    } else {
                                                      if (10 == var10) {
                                                        break L15;
                                                      } else {
                                                        if (var10 == 12) {
                                                          break L14;
                                                        } else {
                                                          if (var10 == 17) {
                                                            break L13;
                                                          } else {
                                                            if (20 == var10) {
                                                              break L12;
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L25: {
                                                L26: {
                                                  var6 = -64;
                                                  nf.field_e = 0;
                                                  if (sh.b(param0 + 31, 2) == 0) {
                                                    break L26;
                                                  } else {
                                                    var7 = 560;
                                                    var8 = -24;
                                                    if (var12 == 0) {
                                                      break L25;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                }
                                                var8 = 24;
                                                var7 = 80;
                                                break L25;
                                              }
                                              var10 = -10;
                                              L27: while (true) {
                                                L28: {
                                                  if (var10 > 10) {
                                                    break L28;
                                                  } else {
                                                    var11 = new bf(var7, var6, 640 + -var7, 17);
                                                    var11.field_p = true;
                                                    var7 = var7 + var8;
                                                    var6 -= 16;
                                                    kh.field_y.b(param0 ^ 29, (rf) (Object) var11);
                                                    var10++;
                                                    if (var12 == 0) {
                                                      continue L27;
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                }
                                                if (var12 == 0) {
                                                  break L3;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            nf.field_e = 150;
                                            kh.field_y.b(81, (rf) (Object) new bf(var3, -64, var4, 3));
                                            if (var12 == 0) {
                                              break L3;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          nf.field_e = 0;
                                          var10 = 0;
                                          L29: while (true) {
                                            L30: {
                                              if (var10 >= 5) {
                                                break L30;
                                              } else {
                                                kh.field_y.b(95, (rf) (Object) new bf(var3, -64 + -var10 * 64, var4, 1));
                                                kh.field_y.b(94, (rf) (Object) new bf(-var3 + 640, 64 * -var10 - 64, -var4 + 640, 1));
                                                var10++;
                                                if (var12 == 0) {
                                                  continue L29;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                            if (var12 == 0) {
                                              break L3;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        nf.field_e = 50;
                                        var10 = 0;
                                        L31: while (true) {
                                          L32: {
                                            stackOut_170_0 = var10;
                                            stackIn_174_0 = stackOut_170_0;
                                            stackIn_171_0 = stackOut_170_0;
                                            if (nf.field_l == 2) {
                                              stackOut_174_0 = stackIn_174_0;
                                              stackOut_174_1 = 10;
                                              stackIn_175_0 = stackOut_174_0;
                                              stackIn_175_1 = stackOut_174_1;
                                              break L32;
                                            } else {
                                              stackOut_171_0 = stackIn_171_0;
                                              stackOut_171_1 = 5;
                                              stackIn_175_0 = stackOut_171_0;
                                              stackIn_175_1 = stackOut_171_1;
                                              stackIn_172_0 = stackOut_171_0;
                                              stackIn_172_1 = stackOut_171_1;
                                              if (var12 != 0) {
                                                break L32;
                                              } else {
                                                stackOut_172_0 = stackIn_172_0;
                                                stackOut_172_1 = stackIn_172_1;
                                                stackIn_175_0 = stackOut_172_0;
                                                stackIn_175_1 = stackOut_172_1;
                                                break L32;
                                              }
                                            }
                                          }
                                          L33: {
                                            if (stackIn_175_0 >= stackIn_175_1) {
                                              break L33;
                                            } else {
                                              kh.field_y.b(70, (rf) (Object) new bf(var3, -64 + -var10 * 64, var4, 4));
                                              var10++;
                                              if (var12 == 0) {
                                                continue L31;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          if (var12 == 0) {
                                            break L3;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      nf.field_e = -50;
                                      kh.field_y.b(78, (rf) (Object) new bf(var3, -64, var3, 12));
                                      if (var12 == 0) {
                                        break L3;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    nf.field_e = -50;
                                    kh.field_y.b(61, (rf) (Object) new bf(32, -64, 32, 12));
                                    kh.field_y.b(84, (rf) (Object) new bf(608, -64, 608, 12));
                                    if (var12 == 0) {
                                      break L3;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var9 = new bf(320, -256, var4, 15);
                                  kh.field_y.b(param0 + -7, (rf) (Object) var9);
                                  tj.field_C = var9.field_k;
                                  ua.field_c = ue.field_c[rj.field_h] + 1;
                                  pf.field_d = pf.field_d + 1;
                                  dg.field_l = 0;
                                  mj.a(255, 12, 0, 41, 100);
                                  ti.field_f.a((oa) (Object) kc.field_P);
                                  kc.field_P.f();
                                  kc.field_P = fl.field_h;
                                  ti.field_f.b((oa) (Object) kc.field_P);
                                  kc.field_P.a(mc.field_b);
                                  break L3;
                                }
                              }
                            }
                            nf.field_e = 100;
                            var10 = 0;
                            L34: while (true) {
                              L35: {
                                L36: {
                                  stackOut_134_0 = ~var10;
                                  stackIn_138_0 = stackOut_134_0;
                                  stackIn_135_0 = stackOut_134_0;
                                  if (2 == nf.field_l) {
                                    stackOut_138_0 = stackIn_138_0;
                                    stackOut_138_1 = 2;
                                    stackIn_139_0 = stackOut_138_0;
                                    stackIn_139_1 = stackOut_138_1;
                                    break L36;
                                  } else {
                                    stackOut_135_0 = stackIn_135_0;
                                    stackOut_135_1 = 1;
                                    stackIn_140_0 = stackOut_135_0;
                                    stackIn_140_1 = stackOut_135_1;
                                    stackIn_136_0 = stackOut_135_0;
                                    stackIn_136_1 = stackOut_135_1;
                                    if (var12 != 0) {
                                      break L35;
                                    } else {
                                      stackOut_136_0 = stackIn_136_0;
                                      stackOut_136_1 = stackIn_136_1;
                                      stackIn_139_0 = stackOut_136_0;
                                      stackIn_139_1 = stackOut_136_1;
                                      break L36;
                                    }
                                  }
                                }
                                stackOut_139_0 = stackIn_139_0;
                                stackOut_139_1 = ~stackIn_139_1;
                                stackIn_140_0 = stackOut_139_0;
                                stackIn_140_1 = stackOut_139_1;
                                break L35;
                              }
                              L37: {
                                if (stackIn_140_0 <= stackIn_140_1) {
                                  break L37;
                                } else {
                                  L38: {
                                    var11 = new bf(var3, -64 + -var10 * 64, sh.b(77, 128) - 64, 5);
                                    var11.field_h = (bf) var5;
                                    if (3 != var2_int) {
                                      break L38;
                                    } else {
                                      L39: {
                                        stackOut_142_0 = (bf) var11;
                                        stackIn_147_0 = stackOut_142_0;
                                        stackIn_143_0 = stackOut_142_0;
                                        if (nf.field_l == 2) {
                                          stackOut_147_0 = (bf) (Object) stackIn_147_0;
                                          stackOut_147_1 = 0;
                                          stackIn_148_0 = stackOut_147_0;
                                          stackIn_148_1 = stackOut_147_1;
                                          break L39;
                                        } else {
                                          stackOut_143_0 = (bf) (Object) stackIn_143_0;
                                          stackIn_145_0 = stackOut_143_0;
                                          stackOut_145_0 = (bf) (Object) stackIn_145_0;
                                          stackOut_145_1 = 1;
                                          stackIn_148_0 = stackOut_145_0;
                                          stackIn_148_1 = stackOut_145_1;
                                          break L39;
                                        }
                                      }
                                      stackIn_148_0.field_p = stackIn_148_1 != 0;
                                      break L38;
                                    }
                                  }
                                  var5 = (Object) (Object) var11;
                                  kh.field_y.b(59, (rf) (Object) var11);
                                  var10++;
                                  if (var12 == 0) {
                                    continue L34;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (ua.field_c >= 4) {
                    nf.field_e = 0;
                    var10 = -3;
                    L40: while (true) {
                      L41: {
                        if (var10 >= 4) {
                          break L41;
                        } else {
                          kh.field_y.b(param0 ^ 5, (rf) (Object) new bf(24 * var10 + 320, -Math.abs(var10 * 64 + -64), var10 * 7680, 1));
                          var10++;
                          if (var12 == 0) {
                            continue L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                      if (var12 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    L42: {
                      var10_ref_bf = new bf(var3, -64, var4, 22);
                      li.a(param0 + -207, var10_ref_bf);
                      var10_ref_bf.field_n = sh.b(-128, 16) + -8;
                      var10_ref_bf.field_z = sh.b(-127, 64) + 32;
                      var10_ref_bf.field_l = sh.b(param0 + -219, 36);
                      if (sh.b(26, 2) != 0) {
                        stackOut_100_0 = 640 - sh.b(-128, 128);
                        stackIn_101_0 = stackOut_100_0;
                        break L42;
                      } else {
                        stackOut_98_0 = sh.b(param0 + -217, 128);
                        stackIn_101_0 = stackOut_98_0;
                        break L42;
                      }
                    }
                    var11_int = stackIn_101_0;
                    var10_ref_bf = new bf(var11_int, -128, var4, 22);
                    li.a(-120, var10_ref_bf);
                    var10_ref_bf.field_n = sh.b(51, 16) + -8;
                    var10_ref_bf.field_z = sh.b(-126, 64) + 32;
                    var10_ref_bf.field_l = sh.b(-126, 36);
                    nf.field_e = var2_int * 30 - (-25 - 50 * nf.field_l);
                    kh.field_y.b(param0 + 3, (rf) (Object) new bf(128 + sh.b(11, 384), -128, fi.field_e.field_f, 1));
                    break L3;
                  }
                }
                nf.field_e = 0;
                var10 = 0;
                L43: while (true) {
                  L44: {
                    if (var10 >= 5) {
                      break L44;
                    } else {
                      kh.field_y.b(108, (rf) (Object) new bf(var3, 64 * -var10 + -64, var4, 1));
                      var10++;
                      if (var12 == 0) {
                        continue L43;
                      } else {
                        break L44;
                      }
                    }
                  }
                  if (var12 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              nf.field_e = 0;
              var10 = 0;
              L45: while (true) {
                L46: {
                  if (2 == nf.field_l) {
                    stackOut_115_0 = 10;
                    stackIn_116_0 = stackOut_115_0;
                    break L46;
                  } else {
                    stackOut_112_0 = 5;
                    stackIn_116_0 = stackOut_112_0;
                    stackIn_113_0 = stackOut_112_0;
                    if (var12 != 0) {
                      break L46;
                    } else {
                      stackOut_113_0 = stackIn_113_0;
                      stackIn_116_0 = stackOut_113_0;
                      break L46;
                    }
                  }
                }
                L47: {
                  if (stackIn_116_0 <= var10) {
                    break L47;
                  } else {
                    L48: {
                      var11 = new bf(var3, -64 + -var10 * 64, var4, 2);
                      if (2 == var2_int) {
                        L49: {
                          stackOut_120_0 = (bf) var11;
                          stackIn_123_0 = stackOut_120_0;
                          stackIn_121_0 = stackOut_120_0;
                          if (nf.field_l == 2) {
                            stackOut_123_0 = (bf) (Object) stackIn_123_0;
                            stackOut_123_1 = 0;
                            stackIn_124_0 = stackOut_123_0;
                            stackIn_124_1 = stackOut_123_1;
                            break L49;
                          } else {
                            stackOut_121_0 = (bf) (Object) stackIn_121_0;
                            stackOut_121_1 = 1;
                            stackIn_124_0 = stackOut_121_0;
                            stackIn_124_1 = stackOut_121_1;
                            break L49;
                          }
                        }
                        stackIn_124_0.field_p = stackIn_124_1 != 0;
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    L50: {
                      var11.field_h = (bf) var5;
                      if (var10 != 0) {
                        break L50;
                      } else {
                        var5 = (Object) (Object) var11;
                        break L50;
                      }
                    }
                    L51: {
                      if (!var11.field_p) {
                        var11.field_i = -64 + (var3 - -sh.b(-127, 128));
                        break L51;
                      } else {
                        break L51;
                      }
                    }
                    kh.field_y.b(param0 ^ 22, (rf) (Object) var11);
                    var10++;
                    if (var12 == 0) {
                      continue L45;
                    } else {
                      break L47;
                    }
                  }
                }
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.T(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            StarCannon.r(122);
            bj.a(-1);
            eb.a(true);
            pb.a(91);
            rd.e(-29826);
            bg.a(-115);
            lj.b(87);
            pc.b(-76);
            ag.j((byte) 39);
            ii.b((byte) 70);
            th.c(1719);
            gg.b((byte) 121);
            wk.a(true);
            gj.a(15686);
            ki.a();
            ue.b(0);
            qe.a();
            oh.a(-1);
            ec.a(82);
            rb.g((byte) -59);
            dd.a(-121);
            qa.a(-5504);
            mf.a(23675);
            kg.a((byte) 103);
            r.a(-76);
            ce.a(30518);
            j.a(-3);
            ri.a(-15552);
            fb.a(-113);
            nb.a(572996488);
            pk.a(4);
            qi.b(0);
            vf.a(false);
            fi.a(0);
            tk.a(-124);
            cg.a(89);
            qc.a(-1);
            bb.b(2);
            bf.a(15415);
            d.a(32);
            jl.a(0);
            m.b(-98);
            lh.a((byte) -113);
            wd.c();
            df.a();
            eh.g((byte) 101);
            ef.a((byte) 27);
            td.c(-12539);
            sb.b(105);
            ed.b((byte) -61);
            rf.b(false);
            ui.d((byte) -80);
            uh.b((byte) -115);
            md.a(-27240);
            var2_int = 82 / ((param0 - -63) / 62);
            n.f(0);
            gi.b(640);
            wc.c(-1);
            bi.b(0);
            ck.a(false);
            gf.a((byte) -126);
            sd.a(false);
            sc.a(0);
            wg.a((byte) -117);
            be.a(20342);
            tc.g(-14528);
            ok.i((byte) -90);
            lf.e(false);
            lc.m(-11147);
            ph.m(-1);
            kh.h((byte) 126);
            db.a(-117);
            rg.k(-128);
            hg.a(false);
            ma.a((byte) 67);
            sg.a(false);
            g.b(-12837);
            ak.a((byte) 94);
            nc.b((byte) 59);
            ti.a((byte) 13);
            je.a();
            nj.a();
            l.a();
            ja.a((byte) 80);
            ih.b((byte) -125);
            jf.a(true);
            ua.a(128);
            ne.a(-109);
            ia.k(36);
            fc.a(20811);
            u.a(2);
            hc.a(false);
            sa.a(30334);
            v.a((byte) -63);
            s.a((byte) -104);
            hh.a((byte) -22);
            vh.h((byte) -98);
            jh.b(126);
            ra.d((byte) 108);
            tg.h(-64);
            t.c((byte) 113);
            cb.b(0);
            la.a((byte) 1);
            ik.d(0);
            jb.a(-730625660);
            pd.a((byte) 98);
            vj.e(true);
            fg.a((byte) 6);
            hd.a((byte) 125);
            gl.a();
            fd.a(-12241);
            kl.a(21367);
            lb.a((byte) -49);
            ll.a(-1);
            ee.a((byte) 79);
            wi.b(64);
            bl.a(-29584);
            ac.a((byte) -77);
            a.a(-1);
            pe.a((byte) 93);
            ca.a(true);
            ai.a(0);
            hi.a((byte) 56);
            te.a(-1);
            dl.a(true);
            kk.a((byte) 63);
            nk.a();
            fk.a(-4918);
            va.b((byte) 80);
            mc.a((byte) 40);
            ea.a((byte) 48);
            ni.a(-81);
            w.b(3);
            eg.a((byte) -118);
            ci.a(-124);
            bd.a((byte) -74);
            uj.c((byte) -44);
            dk.a(-115);
            kf.a(0);
            kc.a(false);
            qd.h((byte) -37);
            vk.e((byte) 73);
            ba.c(125);
            dh.a((byte) -107);
            na.a(426388817);
            ff.f(-75);
            rc.a((byte) -14);
            ta.a(-32769);
            gd.a((byte) 123);
            ha.a((byte) -62);
            b.a(true);
            ic.a((byte) -120);
            wj.a(false);
            oe.b(12);
            le.a(-11434);
            hf.b(-22720);
            mg.c(0);
            jk.a(-124);
            nf.b(-109);
            ad.f((byte) -95);
            fe.f((byte) 73);
            qj.l(-102);
            fa.a(1851621384);
            kd.a(-16);
            ab.e((byte) 119);
            jg.e(934716193);
            pa.f(-200);
            gh.e(13329);
            qf.d((byte) 100);
            vg.b(-117);
            jj.a(0);
            el.e((byte) 115);
            sj.f((byte) 126);
            h.a();
            li.b(-23);
            se.c((byte) -2);
            ij.b(20756);
            ve.a(32729);
            tj.g(-123);
            af.g(9392);
            o.a(4432);
            ek.a(false);
            bh.a(-110);
            mi.d(1);
            ej.f(99);
            fl.e(115);
            cd.a(8192);
            wh.a(true);
            ob.d(-18147);
            rh.a(false);
            gb.b(122);
            fh.b((byte) -46);
            sh.b(4);
            tf.a(18172);
            ie.h(24288);
            vc.b((byte) 35);
            re.d(0);
            hj.a((byte) -45);
            ld.g(8240);
            oj.d(-113);
            ah.a(-91);
            rj.a(-1);
            hb.a(9681);
            pf.a(true);
            ig.a(-1);
            qb.a(-115);
            ge.a(45);
            q.b((byte) 119);
            kj.a(0);
            mj.a(true);
            od.a(83);
            cl.d((byte) 121);
            vd.a(32);
            ae.a((byte) 64);
            bc.b((byte) -128);
            we.b((byte) 95);
            dg.d(124);
            of.a(true);
            il.b(2147483647);
            nh.a(false);
            nd.g(0);
            cc.e((byte) -98);
            cf.f(1);
            di.f(24979);
            vb.e((byte) 114);
            og.a((byte) 92);
            oi.a(false);
            p.a(11);
            uc.e(1);
            sk.a(false);
            ((StarCannon) this).field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.E(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        Object var2_ref = null;
        RuntimeException var2 = null;
        int var3_int = 0;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_9_1 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_147_0 = 0;
        RuntimeException decompiledCaughtException = null;
        qc stackOut_4_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        int stackOut_8_0 = 0;
        Object stackOut_8_1 = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_9_1 = null;
        boolean stackOut_9_2 = false;
        int stackOut_146_0 = 0;
        int stackOut_144_0 = 0;
        var2_ref = null;
        var6 = field_A;
        try {
          L0: {
            L1: {
              if (n.field_a != null) {
                stackOut_4_0 = n.field_a;
                stackIn_5_0 = (Object) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = kj.field_E;
                stackIn_5_0 = (Object) (Object) stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (le.c(4)) {
              L2: {
                stackOut_8_0 = 320;
                stackOut_8_1 = var2_ref;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = (RuntimeException) (Object) stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = (RuntimeException) (Object) stackOut_8_1;
                if (n.field_a != null) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = (RuntimeException) (Object) stackIn_11_1;
                  stackOut_11_2 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L2;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = (RuntimeException) (Object) stackIn_9_1;
                  stackOut_9_2 = dl.field_d;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2 ? 1 : 0;
                  break L2;
                }
              }
              ee.a(stackIn_12_0, (java.awt.Canvas) (Object) stackIn_12_1, stackIn_12_2 != 0);
              return;
            } else {
              L3: {
                if (param0 == 22) {
                  break L3;
                } else {
                  this.l((byte) -102);
                  break L3;
                }
              }
              if (ld.field_ib) {
                if (oh.field_a != null) {
                  ma.a(q.field_i, -13923, 100.0f);
                  oi.a((java.awt.Canvas) var2_ref, (byte) 72);
                  return;
                } else {
                  L4: {
                    L5: {
                      if (qc.field_d == 0) {
                        break L5;
                      } else {
                        var3_int = (320 + -fi.field_e.field_f) / 48;
                        eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                        var3_int += 320;
                        eb.field_b[qd.field_E[5]].a(var3_int, hc.field_c + 240, 320, 240);
                        eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                        var3_int += 320;
                        eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                        var3_int -= 960;
                        eb.field_b[qd.field_E[5]].a(var3_int, 240 + hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                        eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ki.b();
                    break L4;
                  }
                  L6: {
                    if (gj.field_c != -1) {
                      break L6;
                    } else {
                      L7: {
                        if (50 <= cd.field_c) {
                          break L7;
                        } else {
                          L8: {
                            gj.field_e.d(-gj.field_e.field_x + 640 >> 2143672641, 0);
                            if (25 < cd.field_c) {
                              break L8;
                            } else {
                              if (field_z == -2) {
                                break L8;
                              } else {
                                gb.field_r.e(640 - gb.field_r.field_x >> -1364140095, 0, -(cd.field_c * 10) + 250);
                                break L8;
                              }
                            }
                          }
                          if (cd.field_c > 25) {
                            gb.field_r.e(-gb.field_r.field_x + 640 >> -534476095, 0, -250 + 10 * cd.field_c);
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      gb.field_r.d(-gb.field_r.field_x + 640 >> 1958122657, 0);
                      break L6;
                    }
                  }
                  L9: {
                    L10: {
                      if (pa.field_L != field_z) {
                        break L10;
                      } else {
                        L11: {
                          if (field_z == -1) {
                            break L11;
                          } else {
                            L12: {
                              if (field_z != 1) {
                                break L12;
                              } else {
                                this.b(0, 7306);
                                break L12;
                              }
                            }
                            L13: {
                              if (3 != field_z) {
                                break L13;
                              } else {
                                if (lf.field_cb != 1) {
                                  break L13;
                                } else {
                                  this.b(0, 7306);
                                  break L13;
                                }
                              }
                            }
                            fg.field_a[field_z].a(320, 100);
                            if (var6 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                        this.b(100, 7306);
                        if (var6 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L14: {
                      if (cd.field_c <= 25) {
                        L15: {
                          var3_int = -cd.field_c + 25 << -1386168606;
                          if (-1 != field_z) {
                            break L15;
                          } else {
                            this.b(var3_int, 7306);
                            break L15;
                          }
                        }
                        L16: {
                          if (pa.field_L == -1) {
                            this.b(-var3_int + 100, 7306);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (3 != pa.field_L) {
                            break L17;
                          } else {
                            if (1 != field_z) {
                              break L17;
                            } else {
                              this.b(0, 7306);
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (pa.field_L != 1) {
                            break L18;
                          } else {
                            if (field_z == 3) {
                              this.b(0, param0 + 7284);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (field_z < 0) {
                          break L14;
                        } else {
                          fg.field_a[field_z].a(320, var3_int);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    if (cd.field_c <= 25) {
                      break L9;
                    } else {
                      if (pa.field_L < 0) {
                        break L9;
                      } else {
                        L19: {
                          var3_int = -25 + cd.field_c << 1791309058;
                          if (pa.field_L != -1) {
                            break L19;
                          } else {
                            this.b(var3_int, 7306);
                            break L19;
                          }
                        }
                        L20: {
                          if (field_z != -1) {
                            break L20;
                          } else {
                            this.b(-var3_int + 100, 7306);
                            break L20;
                          }
                        }
                        L21: {
                          if (pa.field_L != 3) {
                            break L21;
                          } else {
                            if (field_z != 1) {
                              break L21;
                            } else {
                              this.b(0, 7306);
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (1 != pa.field_L) {
                            break L22;
                          } else {
                            if (3 == field_z) {
                              this.b(0, 7306);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                        }
                        fg.field_a[pa.field_L].a(320, var3_int);
                        break L9;
                      }
                    }
                  }
                  L23: {
                    var3 = (wf) (Object) pk.field_a.c(-3905);
                    if (null == var3) {
                      break L23;
                    } else {
                      L24: {
                        L25: {
                          var5 = ((StarCannon) this).field_B;
                          if (80 <= var5) {
                            break L25;
                          } else {
                            var4 = var5 / 2 + -32;
                            if (var6 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (230 <= var5) {
                            break L26;
                          } else {
                            var4 = 8;
                            if (var6 == 0) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        var4 = -(var5 / 2) + 123;
                        break L24;
                      }
                      j.field_c[var3.field_g].c(8, var4);
                      af.field_y.a(di.field_j[var3.field_g], 48, var4 - -af.field_y.field_p, 65535, -1);
                      break L23;
                    }
                  }
                  L27: {
                    if (nh.field_e != 0) {
                      var4 = 256 * jb.field_e / 50;
                      if (0 < var4) {
                        ki.b(0, 0, ki.field_j, ki.field_f, 0, var4);
                        break L27;
                      } else {
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (!gh.f(-23093)) {
                      break L28;
                    } else {
                      ki.b(0, 0, 640, 480, 0, 128);
                      ki.d(-12 + (-(ii.a(6940) / 2) + 320), -12 + -(wc.d(20) / 2) + 240, 24 - -ii.a(6940), 24 - -wc.d(20), 0);
                      fg.a(32513, jk.field_f, 12, 12);
                      break L28;
                    }
                  }
                  L29: {
                    if (!cb.a(false)) {
                      break L29;
                    } else {
                      if (!gh.f(param0 ^ -23075)) {
                        L30: {
                          if (n.field_a != null) {
                            stackOut_146_0 = 1;
                            stackIn_147_0 = stackOut_146_0;
                            break L30;
                          } else {
                            stackOut_144_0 = 0;
                            stackIn_147_0 = stackOut_144_0;
                            break L30;
                          }
                        }
                        jf.a(stackIn_147_0 != 0, param0 ^ 106);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                  }
                  dd.a((java.awt.Canvas) var2_ref, 0, 0, -23466);
                  break L0;
                }
              } else {
                oi.a((java.awt.Canvas) var2_ref, (byte) -128);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.J(" + param0 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_A;
        try {
          L0: {
            ((StarCannon) this).a(9, 9, 0, 8, true, 6, false, 7);
            hh.field_b = new hl[9];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 9) {
                    break L3;
                  } else {
                    hh.field_b[var2_int] = new hl(1, 1);
                    hh.field_b[var2_int].field_B[0] = 65535;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 60 % ((param0 - -23) / 47);
                sb.field_m = 33023;
                hh.field_b[4] = null;
                ig.field_b = 16777215;
                sd.field_a = 33023;
                df.a(22050, false, 10);
                nb.field_f = df.a(nb.field_e, (java.awt.Component) (Object) kj.field_E, 0, 512);
                ea.field_d = df.a(nb.field_e, (java.awt.Component) (Object) kj.field_E, 1, 22050);
                jk.field_k = new vi();
                ti.field_f = new vi();
                nb.field_f.a((c) (Object) jk.field_k);
                ea.field_d.a((c) (Object) ti.field_f);
                se.field_m = 0;
                bi.field_b = false;
                mc.field_b = 128;
                dg.field_l = 0;
                nb.field_g = 64;
                lc.field_gb = -2048;
                nf.field_l = 0;
                ua.field_c = -2;
                qc.field_d = 2;
                ((StarCannon) this).a(false, false, false, true, -752);
                wa.a(0, -75, 16777215, 0, rj.field_l, (java.applet.Applet) this);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.I(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (n.field_a == null) {
                break L1;
              } else {
                re.a(param0 ^ -25109);
                break L1;
              }
            }
            L2: {
              if (null != nb.field_f) {
                nb.field_f.b();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null == ea.field_d) {
                break L3;
              } else {
                ea.field_d.b();
                break L3;
              }
            }
            L4: {
              la.a(2);
              if (param0 == -25109) {
                break L4;
              } else {
                this.m((byte) 25);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.C(" + param0 + ')');
        }
    }

    public static void r(int param0) {
        field_C = null;
        if (param0 <= 121) {
            return;
        }
        try {
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.O(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_A;
        try {
          L0: {
            L1: {
              oe.field_a = oe.field_a - 1;
              ja.field_d = ja.field_d + 1;
              if (kg.field_a != 0) {
                na.field_d = na.field_d + fc.field_e;
                il.field_i = il.field_i + 2;
                oe.field_a = oe.field_a + 1;
                ja.field_d = ja.field_d + 1;
                fc.field_e = fc.field_e - jl.field_d * fc.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (wc.field_c[98]) {
                jl.field_d = jl.field_d + pe.field_d;
                ja.field_d = ja.field_d + 5;
                oe.field_a = oe.field_a + 5;
                il.field_i = il.field_i + 10;
                fc.field_e = fc.field_e - pe.field_d * na.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (wc.field_c[99]) {
                oe.field_a = oe.field_a + 3;
                na.field_d = na.field_d - kc.field_Q;
                fc.field_e = fc.field_e + jl.field_d * kc.field_Q;
                ja.field_d = ja.field_d + 7;
                il.field_i = il.field_i + 10;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!wc.field_c[84]) {
                break L4;
              } else {
                fc.field_e = fc.field_e - na.field_d;
                jl.field_d = jl.field_d + 1;
                oe.field_a = oe.field_a + 10;
                ja.field_d = ja.field_d - 10;
                break L4;
              }
            }
            L5: {
              va.field_f = va.field_f + 1;
              se.field_u = 256;
              if (5 >= va.field_f) {
                break L5;
              } else {
                va.field_f = va.field_f - 5;
                pd.field_a = pd.field_a + 1;
                if (pd.field_a >= 5) {
                  pd.field_a = pd.field_a - 5;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (null == pk.field_a.c(-3905)) {
                break L6;
              } else {
                int fieldTemp$2 = ((StarCannon) this).field_B + 1;
                ((StarCannon) this).field_B = ((StarCannon) this).field_B + 1;
                if (fieldTemp$2 == 335) {
                  ((StarCannon) this).field_B = 0;
                  rf discarded$3 = pk.field_a.a((byte) 39);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              L8: {
                if (nh.field_e != 0) {
                  break L8;
                } else {
                  L9: {
                    if (pa.field_L == field_z) {
                      break L9;
                    } else {
                      L10: {
                        cd.field_c = cd.field_c + 1;
                        if (25 > cd.field_c) {
                          break L10;
                        } else {
                          if (-1 == pa.field_L) {
                            cd.field_c = 50;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (cd.field_c >= 50) {
                        field_z = pa.field_L;
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  L11: {
                    if (field_z != -1) {
                      break L11;
                    } else {
                      this.m((byte) 110);
                      if (var3 == 0) {
                        break L7;
                      } else {
                        break L11;
                      }
                    }
                  }
                  fg.field_a[field_z].b(0);
                  if (var3 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L12: {
                if (1 == nh.field_e) {
                  break L12;
                } else {
                  L13: {
                    if (nh.field_e != 2) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if (wk.a(77)) {
                            break L15;
                          } else {
                            oh.field_a = og.a(4, (byte) 113);
                            sa.a(nf.field_l + na.field_a * 3, 23820);
                            field_z = ff.field_o;
                            if (var3 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        field_z = vj.field_ab;
                        break L14;
                      }
                      L16: {
                        if (gh.f(-23093)) {
                          hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, (qe) (Object) a.field_b, -11, 12, false);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      nh.field_e = 3;
                      pa.field_L = field_z;
                      if (var3 == 0) {
                        break L7;
                      } else {
                        break L13;
                      }
                    }
                  }
                  jb.field_e = jb.field_e - 1;
                  if (jb.field_e == 0) {
                    nh.field_e = 0;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L12;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              jb.field_e = jb.field_e + 1;
              if (jb.field_e == 50) {
                L17: {
                  L18: {
                    if (!gh.f(-23093)) {
                      break L18;
                    } else {
                      mf.a((byte) -58);
                      if (var3 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  pk.b(0);
                  break L17;
                }
                nh.field_e = 2;
                break L7;
              } else {
                break L7;
              }
            }
            L19: {
              if (param0) {
                break L19;
              } else {
                this.t(-117);
                break L19;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.EA(" + param0 + ')');
        }
    }

    public StarCannon() {
        ((StarCannon) this).field_D = 0;
        ((StarCannon) this).field_B = 0;
    }

    final static void a(ue param0, boolean param1, int param2, ue param3, ue param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              qa.field_a = uf.a("", 15);
              if (param2 == -20169) {
                break L1;
              } else {
                field_E = 's';
                break L1;
              }
            }
            qa.field_a.a(false, false);
            fc.a(param0, param4, (byte) 95, param3);
            td.b(30000);
            ie.field_x = cl.field_k;
            uh.field_k = cl.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("StarCannon.V(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        bf var6 = null;
        int var7 = 0;
        int var8 = 0;
        bf var8_ref_bf = null;
        int var9 = 0;
        int var10 = 0;
        bf var11 = null;
        int var12 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_181_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_122_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_180_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        var12 = field_A;
        try {
          L0: {
            L1: {
              var2_int = sh.b(-127, 3) + ua.field_c;
              if (ue.field_c[rj.field_h] >= var2_int) {
                break L1;
              } else {
                if (ua.field_c <= ue.field_c[rj.field_h]) {
                  var2_int = ue.field_c[rj.field_h];
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var3 = sh.b(-126, 640);
                    var4 = -64 + fi.field_e.field_f + sh.b(-127, 128);
                    var5 = null;
                    var7 = var2_int;
                    if (var7 == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (3 != var7) {
                          break L6;
                        } else {
                          if (var12 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var7 != 10) {
                          break L7;
                        } else {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var7 != 1) {
                          break L8;
                        } else {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (11 == var7) {
                        break L3;
                      } else {
                        L9: {
                          if (var7 != 5) {
                            break L9;
                          } else {
                            if (var12 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            L20: {
                                              if (2 != var7) {
                                                break L20;
                                              } else {
                                                if (var12 == 0) {
                                                  break L19;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (var7 != 9) {
                                                break L21;
                                              } else {
                                                if (var12 == 0) {
                                                  break L19;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (var7 == 4) {
                                              break L18;
                                            } else {
                                              L22: {
                                                if (var7 != 15) {
                                                  break L22;
                                                } else {
                                                  if (var12 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              L23: {
                                                if (var7 != 6) {
                                                  break L23;
                                                } else {
                                                  if (var12 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              if (19 == var7) {
                                                break L17;
                                              } else {
                                                if (7 == var7) {
                                                  break L16;
                                                } else {
                                                  if (var7 == 8) {
                                                    break L15;
                                                  } else {
                                                    if (var7 == 14) {
                                                      break L15;
                                                    } else {
                                                      if (var7 == 12) {
                                                        break L14;
                                                      } else {
                                                        L24: {
                                                          if (var7 != 16) {
                                                            break L24;
                                                          } else {
                                                            if (var12 == 0) {
                                                              break L14;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        if (13 == var7) {
                                                          break L13;
                                                        } else {
                                                          if (var7 == 17) {
                                                            break L12;
                                                          } else {
                                                            if (18 == var7) {
                                                              break L11;
                                                            } else {
                                                              if (20 == var7) {
                                                                break L10;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          nf.field_e = 175;
                                          var7 = 0;
                                          L25: while (true) {
                                            L26: {
                                              stackOut_122_0 = var7;
                                              stackIn_126_0 = stackOut_122_0;
                                              stackIn_123_0 = stackOut_122_0;
                                              if (2 != nf.field_l) {
                                                stackOut_126_0 = stackIn_126_0;
                                                stackOut_126_1 = 5;
                                                stackIn_127_0 = stackOut_126_0;
                                                stackIn_127_1 = stackOut_126_1;
                                                break L26;
                                              } else {
                                                stackOut_123_0 = stackIn_123_0;
                                                stackOut_123_1 = 10;
                                                stackIn_127_0 = stackOut_123_0;
                                                stackIn_127_1 = stackOut_123_1;
                                                stackIn_124_0 = stackOut_123_0;
                                                stackIn_124_1 = stackOut_123_1;
                                                if (var12 != 0) {
                                                  break L26;
                                                } else {
                                                  stackOut_124_0 = stackIn_124_0;
                                                  stackOut_124_1 = stackIn_124_1;
                                                  stackIn_127_0 = stackOut_124_0;
                                                  stackIn_127_1 = stackOut_124_1;
                                                  break L26;
                                                }
                                              }
                                            }
                                            L27: {
                                              if (stackIn_127_0 >= stackIn_127_1) {
                                                break L27;
                                              } else {
                                                kh.field_y.b(63, (rf) (Object) new bf(var3, -64 + 64 * -var7, var4, 4));
                                                var7++;
                                                if (var12 == 0) {
                                                  continue L25;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                            if (var12 == 0) {
                                              break L2;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        nf.field_e = 0;
                                        var7 = 0;
                                        L28: while (true) {
                                          L29: {
                                            L30: {
                                              if (5 <= var7) {
                                                break L30;
                                              } else {
                                                kh.field_y.b(81, (rf) (Object) new bf(var3, -64 + -var7 * 64, var4, 1));
                                                var7++;
                                                if (var12 != 0) {
                                                  break L29;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L28;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                            }
                                            kh.field_y.b(57, (rf) (Object) new bf(640 - var3, -64, -var4 + 640, 3));
                                            break L29;
                                          }
                                          if (var12 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      nf.field_e = 0;
                                      var7 = 0;
                                      L31: while (true) {
                                        L32: {
                                          L33: {
                                            if (5 <= var7) {
                                              break L33;
                                            } else {
                                              kh.field_y.b(117, (rf) (Object) new bf(var3, -64 + -var7 * 64, var4, 1));
                                              var7++;
                                              if (var12 != 0) {
                                                break L32;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L31;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                          kh.field_y.b(122, (rf) (Object) new bf(-var3 + 640, -64, -var3 + 640, 21));
                                          break L32;
                                        }
                                        if (var12 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    nf.field_e = 0;
                                    kh.field_y.b(73, (rf) (Object) new bf(var3, -64, var4, 3));
                                    kh.field_y.b(64, (rf) (Object) new bf(640 + -var3, -64, 640 + -var3, 21));
                                    if (var12 == 0) {
                                      break L2;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L34: {
                                    L35: {
                                      nf.field_e = 0;
                                      var7 = 0;
                                      if (sh.b(62, 2) != 0) {
                                        break L35;
                                      } else {
                                        var8 = 80;
                                        var9 = 24;
                                        if (var12 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var9 = -24;
                                    var8 = 560;
                                    break L34;
                                  }
                                  var10 = -10;
                                  L36: while (true) {
                                    L37: {
                                      L38: {
                                        if (var10 > 10) {
                                          break L38;
                                        } else {
                                          var11 = new bf(var8, var7, 640 + -var8, 17);
                                          var7 -= 16;
                                          var11.field_p = true;
                                          var8 = var8 + var9;
                                          kh.field_y.b(100, (rf) (Object) var11);
                                          var10++;
                                          if (var12 != 0) {
                                            break L37;
                                          } else {
                                            if (var12 == 0) {
                                              continue L36;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      var8 = 64 + sh.b(100, 512);
                                      kh.field_y.b(95, (rf) (Object) new bf(var8, -96, var8, 21));
                                      break L37;
                                    }
                                    if (var12 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                nf.field_e = 100;
                                kh.field_y.b(75, (rf) (Object) new bf(var3, -64, -64 + sh.b(-1, 128), 5));
                                if (var12 == 0) {
                                  break L2;
                                } else {
                                  break L13;
                                }
                              }
                              nf.field_e = -50;
                              var7 = sh.b(-126, 180) + 32;
                              kh.field_y.b(74, (rf) (Object) new bf(var7, -64, var7, 12));
                              var7 = 608 + -sh.b(-128, 180);
                              kh.field_y.b(56, (rf) (Object) new bf(var7, -64, var7, 12));
                              if (var12 == 0) {
                                break L2;
                              } else {
                                break L12;
                              }
                            }
                            L39: {
                              L40: {
                                nf.field_e = -50;
                                kh.field_y.b(82, (rf) (Object) new bf(32, -64, 32, 21));
                                if (sh.b(34, 2) == 0) {
                                  break L40;
                                } else {
                                  kh.field_y.b(69, (rf) (Object) new bf(320, -96, 320, 21));
                                  if (var12 == 0) {
                                    break L39;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              kh.field_y.b(91, (rf) (Object) new bf(320, -32, 320, 18));
                              kh.field_y.b(67, (rf) (Object) new bf(320, -96, 320, 18));
                              kh.field_y.b(79, (rf) (Object) new bf(320, -160, 320, 18));
                              break L39;
                            }
                            kh.field_y.b(106, (rf) (Object) new bf(608, -64, 608, 21));
                            if (var12 == 0) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                          nf.field_e = 150;
                          kh.field_y.b(76, (rf) (Object) new bf(var3, -64, var4, 3));
                          var7 = 0;
                          L41: while (true) {
                            L42: {
                              if (2 == nf.field_l) {
                                stackOut_180_0 = 2;
                                stackIn_181_0 = stackOut_180_0;
                                break L42;
                              } else {
                                stackOut_177_0 = 1;
                                stackIn_181_0 = stackOut_177_0;
                                stackIn_178_0 = stackOut_177_0;
                                if (var12 != 0) {
                                  break L42;
                                } else {
                                  stackOut_178_0 = stackIn_178_0;
                                  stackIn_181_0 = stackOut_178_0;
                                  break L42;
                                }
                              }
                            }
                            L43: {
                              if (stackIn_181_0 <= var7) {
                                break L43;
                              } else {
                                kh.field_y.b(112, (rf) (Object) new bf(320, 64 * -var7 - 128, 320, 3));
                                var7++;
                                if (var12 == 0) {
                                  continue L41;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            kh.field_y.b(107, (rf) (Object) new bf(-var3 + 640, -64, 640 - var4, 3));
                            if (var12 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var6 = new bf(320, -256, var4, 16);
                        kh.field_y.b(88, (rf) (Object) var6);
                        tj.field_C = var6.field_k;
                        ua.field_c = 1 + ue.field_c[rj.field_h];
                        pf.field_d = pf.field_d + 1;
                        dg.field_l = 0;
                        mj.a(255, 12, 0, 41, 100);
                        ti.field_f.a((oa) (Object) kc.field_P);
                        kc.field_P.f();
                        kc.field_P = fl.field_h;
                        ti.field_f.b((oa) (Object) kc.field_P);
                        kc.field_P.a(mc.field_b);
                        break L2;
                      }
                    }
                  }
                  nf.field_e = 0;
                  var7 = -8;
                  L44: while (true) {
                    L45: {
                      if (var7 >= 8) {
                        break L45;
                      } else {
                        kh.field_y.b(88, (rf) (Object) new bf(320 - -(var7 * 24), -Math.abs(-64 + var7 * 64), 24 * var7 + 320, 1));
                        var7++;
                        if (var12 == 0) {
                          continue L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                    if (var12 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L46: {
                  L47: {
                    nf.field_e = 0;
                    var7 = -64;
                    if (sh.b(-126, 2) == 0) {
                      break L47;
                    } else {
                      var9 = -24;
                      var8 = 560;
                      if (var12 == 0) {
                        break L46;
                      } else {
                        break L47;
                      }
                    }
                  }
                  var8 = 80;
                  var9 = 24;
                  break L46;
                }
                var10 = -10;
                L48: while (true) {
                  L49: {
                    if (10 < var10) {
                      break L49;
                    } else {
                      var11 = new bf(var8, var7, 640 - var8, 17);
                      var7 -= 16;
                      var11.field_p = true;
                      var8 = var8 + var9;
                      kh.field_y.b(107, (rf) (Object) var11);
                      var10++;
                      if (var12 == 0) {
                        continue L48;
                      } else {
                        break L49;
                      }
                    }
                  }
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              nf.field_e = 0;
              var4 = var3 - -sh.b(-24, 128) - 64;
              var7 = 0;
              L50: while (true) {
                L51: {
                  L52: {
                    stackOut_110_0 = ~var7;
                    stackIn_114_0 = stackOut_110_0;
                    stackIn_111_0 = stackOut_110_0;
                    if (nf.field_l == 2) {
                      stackOut_114_0 = stackIn_114_0;
                      stackOut_114_1 = 10;
                      stackIn_115_0 = stackOut_114_0;
                      stackIn_115_1 = stackOut_114_1;
                      break L52;
                    } else {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = 5;
                      stackIn_116_0 = stackOut_111_0;
                      stackIn_116_1 = stackOut_111_1;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      if (var12 != 0) {
                        break L51;
                      } else {
                        stackOut_112_0 = stackIn_112_0;
                        stackOut_112_1 = stackIn_112_1;
                        stackIn_115_0 = stackOut_112_0;
                        stackIn_115_1 = stackOut_112_1;
                        break L52;
                      }
                    }
                  }
                  stackOut_115_0 = stackIn_115_0;
                  stackOut_115_1 = ~stackIn_115_1;
                  stackIn_116_0 = stackOut_115_0;
                  stackIn_116_1 = stackOut_115_1;
                  break L51;
                }
                L53: {
                  if (stackIn_116_0 <= stackIn_116_1) {
                    break L53;
                  } else {
                    L54: {
                      var8_ref_bf = new bf(var3, -64 + 64 * -var7, var4, 2);
                      var8_ref_bf.field_h = (bf) var5;
                      kh.field_y.b(115, (rf) (Object) var8_ref_bf);
                      if (var7 != 0) {
                        break L54;
                      } else {
                        var5 = (Object) (Object) var8_ref_bf;
                        break L54;
                      }
                    }
                    var7++;
                    if (var12 == 0) {
                      continue L50;
                    } else {
                      break L53;
                    }
                  }
                }
                break L2;
              }
            }
            L55: {
              if (param0 >= 79) {
                break L55;
              } else {
                this.o(112);
                break L55;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "StarCannon.S(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[8192];
        field_C = "Menu";
        field_z = -2;
    }
}

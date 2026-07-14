/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve implements db {
    private int field_m;
    static int field_l;
    private wl field_e;
    static hh field_d;
    private int field_c;
    static String field_f;
    static mf field_h;
    private int field_j;
    private int field_a;
    private int field_b;
    static byte[][][] field_n;
    private int field_i;
    static int field_g;
    static int field_k;

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        q var12 = null;
        hm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        hm stackOut_1_0 = null;
        L0: {
          var11 = EscapeVector.field_A;
          if (!(param3 instanceof q)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (hm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (hm) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (q) (Object) stackIn_3_0;
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        em.a(param3.field_k + param0, param1 + param3.field_j, param3.field_g, param3.field_x, ((ve) this).field_b);
        var7 = param3.field_g + -(2 * var12.field_M);
        var8 = param0 - (-param3.field_k + -var12.field_M);
        var9 = var12.field_J + (param1 + param3.field_j);
        em.d(var8, var9, var8 - -var7, var9, ((ve) this).field_m);
        var10 = -1 + var12.e((byte) 98);
        L2: while (true) {
          if (-1 < (var10 ^ -1)) {
            if (param2 <= -14) {
              if (((ve) this).field_e != null) {
                ((ve) this).field_e.c(var12.field_l, var8 - -(var7 / 2), var12.field_J + ((ve) this).field_e.field_y + var9, ((ve) this).field_i, ((ve) this).field_a);
                return;
              } else {
                return;
              }
            } else {
              ((ve) this).field_j = -58;
              if (((ve) this).field_e == null) {
                return;
              } else {
                ((ve) this).field_e.c(var12.field_l, var8 - -(var7 / 2), var12.field_J + ((ve) this).field_e.field_y + var9, ((ve) this).field_i, ((ve) this).field_a);
                return;
              }
            }
          } else {
            em.d(var8 + var7 * var12.b(var10, (byte) 97) / var12.k(-1), var9, ((ve) this).field_j, ((ve) this).field_c);
            var10--;
            continue L2;
          }
        }
    }

    final static p a(int param0, mf param1, mf param2, int[] param3) {
        Object var5 = null;
        Object var6 = null;
        if (null == om.field_e) {
          kc.field_c = dn.a(0, vl.field_f, ej.field_g, param1, 1, param3, dn.field_C);
          var6 = null;
          rb.field_k = dn.a(0, ok.field_b, c.field_q, param2, 0, (int[]) null, q.field_L);
          tk.field_b = new qh(param1, bm.field_e, sb.field_i, 1, od.field_n, param3);
          om.field_e = new p();
          return null;
        } else {
          L0: {
            if (param0 == 1) {
              break L0;
            } else {
              var5 = null;
              ve.a((byte) 82, (String) null);
              break L0;
            }
          }
          if (!om.field_e.a(23389)) {
            return null;
          } else {
            return om.field_e;
          }
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        Object var4 = null;
        ff.a((String) null, param2, 64, param1);
        int var3 = 104 / ((31 - param0) / 61);
    }

    final static mf a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != 0) {
            return null;
        }
        return ji.a(param2, param0, false, param3, param4, (byte) 114);
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = EscapeVector.field_A;
        if (-1 == bg.field_f) {
          if ((oj.field_M ^ -1) != 0) {
            L0: {
              ei.field_j = ei.field_j + 1;
              if (param1 != null) {
                if (!param1.equals((Object) (Object) on.field_b)) {
                  L1: {
                    if (!un.field_u) {
                      if (ei.field_j >= ef.field_d) {
                        if (ei.field_j >= ef.field_d + qf.field_l) {
                          stackOut_160_0 = 0;
                          stackIn_161_0 = stackOut_160_0;
                          break L1;
                        } else {
                          stackOut_159_0 = 1;
                          stackIn_161_0 = stackOut_159_0;
                          break L1;
                        }
                      } else {
                        stackOut_157_0 = 0;
                        stackIn_161_0 = stackOut_157_0;
                        break L1;
                      }
                    } else {
                      stackOut_155_0 = 0;
                      stackIn_161_0 = stackOut_155_0;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var2 = stackIn_161_0;
                      if (param1 == null) {
                        break L3;
                      } else {
                        if (un.field_u) {
                          ei.field_j = ef.field_d;
                          break L2;
                        } else {
                          if (var2 == 0) {
                            break L3;
                          } else {
                            ei.field_j = ef.field_d;
                            break L2;
                          }
                        }
                      }
                    }
                    ei.field_j = 0;
                    break L2;
                  }
                  ni.field_O = bg.field_f;
                  ci.field_g = oj.field_M;
                  if (param1 != null) {
                    un.field_u = false;
                    break L0;
                  } else {
                    if (var2 == 0) {
                      break L0;
                    } else {
                      un.field_u = true;
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                if (on.field_b != null) {
                  break L0;
                } else {
                  L4: {
                    if (!un.field_u) {
                      if (ei.field_j >= ef.field_d) {
                        if (ei.field_j >= ef.field_d + qf.field_l) {
                          stackOut_127_0 = 0;
                          stackIn_129_0 = stackOut_127_0;
                          break L4;
                        } else {
                          stackOut_126_0 = 1;
                          stackIn_129_0 = stackOut_126_0;
                          break L4;
                        }
                      } else {
                        stackOut_124_0 = 0;
                        stackIn_129_0 = stackOut_124_0;
                        break L4;
                      }
                    } else {
                      stackOut_122_0 = 0;
                      stackIn_129_0 = stackOut_122_0;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      var2 = stackIn_129_0;
                      if (param1 == null) {
                        break L6;
                      } else {
                        if (un.field_u) {
                          ei.field_j = ef.field_d;
                          break L5;
                        } else {
                          if (var2 == 0) {
                            break L6;
                          } else {
                            ei.field_j = ef.field_d;
                            break L5;
                          }
                        }
                      }
                    }
                    ei.field_j = 0;
                    break L5;
                  }
                  L7: {
                    ni.field_O = bg.field_f;
                    ci.field_g = oj.field_M;
                    if (param1 != null) {
                      un.field_u = false;
                      break L7;
                    } else {
                      if (var2 == 0) {
                        break L7;
                      } else {
                        un.field_u = true;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    on.field_b = param1;
                    if (un.field_u) {
                      break L8;
                    } else {
                      if (ei.field_j >= ef.field_d) {
                        break L8;
                      } else {
                        if (ah.field_h) {
                          ei.field_j = 0;
                          ci.field_g = oj.field_M;
                          ni.field_O = bg.field_f;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (param0 <= -97) {
                      break L9;
                    } else {
                      mf discarded$8 = ve.a(-81, 8, false, 82, false);
                      break L9;
                    }
                  }
                  L10: {
                    if (!un.field_u) {
                      break L10;
                    } else {
                      if (ei.field_j != fj.field_jb) {
                        break L10;
                      } else {
                        un.field_u = false;
                        ei.field_j = 0;
                        break L10;
                      }
                    }
                  }
                  bg.field_f = -1;
                  oj.field_M = -1;
                  return;
                }
              }
            }
            on.field_b = param1;
            if (!un.field_u) {
              if (ei.field_j >= ef.field_d) {
                L11: {
                  if (param0 <= -97) {
                    break L11;
                  } else {
                    mf discarded$9 = ve.a(-81, 8, false, 82, false);
                    break L11;
                  }
                }
                L12: {
                  if (!un.field_u) {
                    break L12;
                  } else {
                    if (ei.field_j != fj.field_jb) {
                      break L12;
                    } else {
                      un.field_u = false;
                      ei.field_j = 0;
                      break L12;
                    }
                  }
                }
                bg.field_f = -1;
                oj.field_M = -1;
                return;
              } else {
                L13: {
                  if (ah.field_h) {
                    ei.field_j = 0;
                    ci.field_g = oj.field_M;
                    ni.field_O = bg.field_f;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0 <= -97) {
                    break L14;
                  } else {
                    mf discarded$10 = ve.a(-81, 8, false, 82, false);
                    break L14;
                  }
                }
                L15: {
                  if (!un.field_u) {
                    break L15;
                  } else {
                    if (ei.field_j != fj.field_jb) {
                      break L15;
                    } else {
                      un.field_u = false;
                      ei.field_j = 0;
                      break L15;
                    }
                  }
                }
                bg.field_f = -1;
                oj.field_M = -1;
                return;
              }
            } else {
              L16: {
                if (param0 <= -97) {
                  break L16;
                } else {
                  mf discarded$11 = ve.a(-81, 8, false, 82, false);
                  break L16;
                }
              }
              L17: {
                if (!un.field_u) {
                  break L17;
                } else {
                  if (ei.field_j != fj.field_jb) {
                    break L17;
                  } else {
                    un.field_u = false;
                    ei.field_j = 0;
                    break L17;
                  }
                }
              }
              bg.field_f = -1;
              oj.field_M = -1;
              return;
            }
          } else {
            L18: {
              L19: {
                oj.field_M = bj.field_y;
                bg.field_f = dh.field_d;
                ei.field_j = ei.field_j + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) on.field_b)) {
                    break L19;
                  } else {
                    break L18;
                  }
                } else {
                  if (on.field_b != null) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if (!un.field_u) {
                  if (ei.field_j >= ef.field_d) {
                    if (ei.field_j >= ef.field_d + qf.field_l) {
                      stackOut_95_0 = 0;
                      stackIn_96_0 = stackOut_95_0;
                      break L20;
                    } else {
                      stackOut_94_0 = 1;
                      stackIn_96_0 = stackOut_94_0;
                      break L20;
                    }
                  } else {
                    stackOut_92_0 = 0;
                    stackIn_96_0 = stackOut_92_0;
                    break L20;
                  }
                } else {
                  stackOut_90_0 = 0;
                  stackIn_96_0 = stackOut_90_0;
                  break L20;
                }
              }
              L21: {
                L22: {
                  var2 = stackIn_96_0;
                  if (param1 == null) {
                    break L22;
                  } else {
                    if (un.field_u) {
                      ei.field_j = ef.field_d;
                      break L21;
                    } else {
                      if (var2 == 0) {
                        break L22;
                      } else {
                        ei.field_j = ef.field_d;
                        break L21;
                      }
                    }
                  }
                }
                ei.field_j = 0;
                break L21;
              }
              ni.field_O = bg.field_f;
              ci.field_g = oj.field_M;
              if (param1 != null) {
                un.field_u = false;
                break L18;
              } else {
                if (var2 == 0) {
                  break L18;
                } else {
                  un.field_u = true;
                  break L18;
                }
              }
            }
            L23: {
              on.field_b = param1;
              if (un.field_u) {
                break L23;
              } else {
                if (ei.field_j >= ef.field_d) {
                  break L23;
                } else {
                  if (ah.field_h) {
                    ei.field_j = 0;
                    ci.field_g = oj.field_M;
                    ni.field_O = bg.field_f;
                    break L23;
                  } else {
                    break L23;
                  }
                }
              }
            }
            L24: {
              if (param0 <= -97) {
                break L24;
              } else {
                mf discarded$12 = ve.a(-81, 8, false, 82, false);
                break L24;
              }
            }
            L25: {
              if (!un.field_u) {
                break L25;
              } else {
                if (ei.field_j != fj.field_jb) {
                  break L25;
                } else {
                  un.field_u = false;
                  ei.field_j = 0;
                  break L25;
                }
              }
            }
            bg.field_f = -1;
            oj.field_M = -1;
            return;
          }
        } else {
          ei.field_j = ei.field_j + 1;
          if (param1 == null) {
            if (on.field_b == null) {
              L26: {
                if (!un.field_u) {
                  if (ei.field_j >= ef.field_d) {
                    if (ei.field_j < ef.field_d + qf.field_l) {
                      stackOut_53_0 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      break L26;
                    } else {
                      stackOut_52_0 = 0;
                      stackIn_55_0 = stackOut_52_0;
                      break L26;
                    }
                  } else {
                    stackOut_50_0 = 0;
                    stackIn_55_0 = stackOut_50_0;
                    break L26;
                  }
                } else {
                  stackOut_48_0 = 0;
                  stackIn_55_0 = stackOut_48_0;
                  break L26;
                }
              }
              L27: {
                var2 = stackIn_55_0;
                if (param1 != null) {
                  if (un.field_u) {
                    ei.field_j = ef.field_d;
                    break L27;
                  } else {
                    if (var2 != 0) {
                      ei.field_j = ef.field_d;
                      break L27;
                    } else {
                      ei.field_j = 0;
                      break L27;
                    }
                  }
                } else {
                  ei.field_j = 0;
                  break L27;
                }
              }
              L28: {
                ni.field_O = bg.field_f;
                ci.field_g = oj.field_M;
                if (param1 != null) {
                  un.field_u = false;
                  break L28;
                } else {
                  if (var2 == 0) {
                    break L28;
                  } else {
                    un.field_u = true;
                    break L28;
                  }
                }
              }
              L29: {
                on.field_b = param1;
                if (un.field_u) {
                  break L29;
                } else {
                  if (ei.field_j >= ef.field_d) {
                    break L29;
                  } else {
                    if (ah.field_h) {
                      ei.field_j = 0;
                      ci.field_g = oj.field_M;
                      ni.field_O = bg.field_f;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                }
              }
              L30: {
                if (param0 <= -97) {
                  break L30;
                } else {
                  mf discarded$13 = ve.a(-81, 8, false, 82, false);
                  break L30;
                }
              }
              L31: {
                L32: {
                  if (!un.field_u) {
                    break L32;
                  } else {
                    if (ei.field_j != fj.field_jb) {
                      break L32;
                    } else {
                      un.field_u = false;
                      ei.field_j = 0;
                      bg.field_f = -1;
                      oj.field_M = -1;
                      break L31;
                    }
                  }
                }
                bg.field_f = -1;
                oj.field_M = -1;
                break L31;
              }
              return;
            } else {
              L33: {
                on.field_b = param1;
                if (un.field_u) {
                  break L33;
                } else {
                  if (ei.field_j >= ef.field_d) {
                    break L33;
                  } else {
                    if (ah.field_h) {
                      ei.field_j = 0;
                      ci.field_g = oj.field_M;
                      ni.field_O = bg.field_f;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L34: {
                if (param0 <= -97) {
                  break L34;
                } else {
                  mf discarded$14 = ve.a(-81, 8, false, 82, false);
                  break L34;
                }
              }
              L35: {
                if (!un.field_u) {
                  break L35;
                } else {
                  if (ei.field_j != fj.field_jb) {
                    break L35;
                  } else {
                    un.field_u = false;
                    ei.field_j = 0;
                    break L35;
                  }
                }
              }
              bg.field_f = -1;
              oj.field_M = -1;
              return;
            }
          } else {
            L36: {
              if (!param1.equals((Object) (Object) on.field_b)) {
                L37: {
                  if (!un.field_u) {
                    if (ei.field_j >= ef.field_d) {
                      if (ei.field_j < ef.field_d + qf.field_l) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L37;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L37;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L37;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_12_0 = stackOut_5_0;
                    break L37;
                  }
                }
                L38: {
                  var2 = stackIn_12_0;
                  if (param1 != null) {
                    L39: {
                      if (un.field_u) {
                        break L39;
                      } else {
                        if (var2 != 0) {
                          break L39;
                        } else {
                          ei.field_j = 0;
                          break L38;
                        }
                      }
                    }
                    ei.field_j = ef.field_d;
                    break L38;
                  } else {
                    ei.field_j = 0;
                    break L38;
                  }
                }
                ni.field_O = bg.field_f;
                ci.field_g = oj.field_M;
                if (param1 != null) {
                  un.field_u = false;
                  break L36;
                } else {
                  if (var2 == 0) {
                    break L36;
                  } else {
                    un.field_u = true;
                    break L36;
                  }
                }
              } else {
                break L36;
              }
            }
            L40: {
              on.field_b = param1;
              if (un.field_u) {
                break L40;
              } else {
                if (ei.field_j >= ef.field_d) {
                  break L40;
                } else {
                  if (ah.field_h) {
                    ei.field_j = 0;
                    ci.field_g = oj.field_M;
                    ni.field_O = bg.field_f;
                    break L40;
                  } else {
                    break L40;
                  }
                }
              }
            }
            L41: {
              if (param0 <= -97) {
                break L41;
              } else {
                mf discarded$15 = ve.a(-81, 8, false, 82, false);
                break L41;
              }
            }
            L42: {
              if (!un.field_u) {
                break L42;
              } else {
                if (ei.field_j != fj.field_jb) {
                  break L42;
                } else {
                  un.field_u = false;
                  ei.field_j = 0;
                  break L42;
                }
              }
            }
            bg.field_f = -1;
            oj.field_M = -1;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_f = null;
        field_h = null;
        field_d = null;
        if (param0 != 0) {
            field_l = -119;
        }
    }

    ve(wl param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ve) this).field_j = param5;
        ((ve) this).field_e = param0;
        ((ve) this).field_i = param1;
        ((ve) this).field_c = param6;
        ((ve) this).field_b = param4;
        ((ve) this).field_a = param2;
        ((ve) this).field_m = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_f = "Try again";
    }
}

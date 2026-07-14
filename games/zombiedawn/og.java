/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends pj {
    static boolean field_A;
    static int[] field_y;
    de field_w;
    static String field_z;
    byte field_C;
    static vn[] field_x;
    int field_v;
    static af field_B;

    final byte[] d(int param0) {
        if (((og) this).field_q) {
            throw new RuntimeException();
        }
        if (((og) this).field_w.field_j < ((og) this).field_w.field_h.length + -((og) this).field_C) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            return null;
        }
        return ((og) this).field_w.field_h;
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        var3 = ZombieDawn.field_J;
        pl.field_m = pl.field_m + 1;
        if (param1 == 0) {
          if (ja.field_d == -1) {
            if (-1 == ck.field_n) {
              L0: {
                L1: {
                  ja.field_d = ha.field_b;
                  ck.field_n = ei.field_K;
                  if (param0 != null) {
                    if (!param0.equals((Object) (Object) da.field_m)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  } else {
                    if (da.field_m != null) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (!qo.field_x) {
                    if (td.field_d <= pl.field_m) {
                      if (td.field_d - -vf.field_k <= pl.field_m) {
                        stackOut_167_0 = 0;
                        stackIn_168_0 = stackOut_167_0;
                        break L2;
                      } else {
                        stackOut_166_0 = 1;
                        stackIn_168_0 = stackOut_166_0;
                        break L2;
                      }
                    } else {
                      stackOut_164_0 = 0;
                      stackIn_168_0 = stackOut_164_0;
                      break L2;
                    }
                  } else {
                    stackOut_162_0 = 0;
                    stackIn_168_0 = stackOut_162_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_168_0;
                  if (param0 == null) {
                    pl.field_m = 0;
                    break L3;
                  } else {
                    L4: {
                      if (qo.field_x) {
                        break L4;
                      } else {
                        if (var2 != 0) {
                          break L4;
                        } else {
                          pl.field_m = 0;
                          break L3;
                        }
                      }
                    }
                    pl.field_m = td.field_d;
                    break L3;
                  }
                }
                L5: {
                  if (param0 == null) {
                    if (var2 == 0) {
                      break L5;
                    } else {
                      qo.field_x = true;
                      break L5;
                    }
                  } else {
                    qo.field_x = false;
                    break L5;
                  }
                }
                mm.field_i = ck.field_n;
                lc.field_i = ja.field_d;
                break L0;
              }
              L6: {
                da.field_m = param0;
                if (qo.field_x) {
                  break L6;
                } else {
                  if (td.field_d <= pl.field_m) {
                    break L6;
                  } else {
                    if (ll.field_a) {
                      pl.field_m = 0;
                      mm.field_i = ck.field_n;
                      lc.field_i = ja.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              L7: {
                ja.field_d = -1;
                if (!qo.field_x) {
                  break L7;
                } else {
                  if (pl.field_m == se.field_o) {
                    pl.field_m = 0;
                    qo.field_x = false;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              ck.field_n = -1;
              return;
            } else {
              if (param0 != null) {
                L8: {
                  if (!param0.equals((Object) (Object) da.field_m)) {
                    L9: {
                      if (!qo.field_x) {
                        if (td.field_d <= pl.field_m) {
                          if (td.field_d - -vf.field_k <= pl.field_m) {
                            stackOut_125_0 = 0;
                            stackIn_126_0 = stackOut_125_0;
                            break L9;
                          } else {
                            stackOut_124_0 = 1;
                            stackIn_126_0 = stackOut_124_0;
                            break L9;
                          }
                        } else {
                          stackOut_122_0 = 0;
                          stackIn_126_0 = stackOut_122_0;
                          break L9;
                        }
                      } else {
                        stackOut_120_0 = 0;
                        stackIn_126_0 = stackOut_120_0;
                        break L9;
                      }
                    }
                    L10: {
                      var2 = stackIn_126_0;
                      if (param0 == null) {
                        pl.field_m = 0;
                        break L10;
                      } else {
                        L11: {
                          if (qo.field_x) {
                            break L11;
                          } else {
                            if (var2 != 0) {
                              break L11;
                            } else {
                              pl.field_m = 0;
                              break L10;
                            }
                          }
                        }
                        pl.field_m = td.field_d;
                        break L10;
                      }
                    }
                    L12: {
                      if (param0 == null) {
                        if (var2 == 0) {
                          break L12;
                        } else {
                          qo.field_x = true;
                          mm.field_i = ck.field_n;
                          lc.field_i = ja.field_d;
                          break L8;
                        }
                      } else {
                        qo.field_x = false;
                        break L12;
                      }
                    }
                    mm.field_i = ck.field_n;
                    lc.field_i = ja.field_d;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                da.field_m = param0;
                if (!qo.field_x) {
                  L13: {
                    if (td.field_d <= pl.field_m) {
                      break L13;
                    } else {
                      if (ll.field_a) {
                        pl.field_m = 0;
                        mm.field_i = ck.field_n;
                        lc.field_i = ja.field_d;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    ja.field_d = -1;
                    if (!qo.field_x) {
                      break L14;
                    } else {
                      if (pl.field_m == se.field_o) {
                        pl.field_m = 0;
                        qo.field_x = false;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ck.field_n = -1;
                  return;
                } else {
                  L15: {
                    ja.field_d = -1;
                    if (!qo.field_x) {
                      break L15;
                    } else {
                      if (pl.field_m == se.field_o) {
                        pl.field_m = 0;
                        qo.field_x = false;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  ck.field_n = -1;
                  return;
                }
              } else {
                if (da.field_m == null) {
                  L16: {
                    if (!qo.field_x) {
                      if (td.field_d <= pl.field_m) {
                        if (td.field_d - -vf.field_k <= pl.field_m) {
                          stackOut_93_0 = 0;
                          stackIn_95_0 = stackOut_93_0;
                          break L16;
                        } else {
                          stackOut_92_0 = 1;
                          stackIn_95_0 = stackOut_92_0;
                          break L16;
                        }
                      } else {
                        stackOut_90_0 = 0;
                        stackIn_95_0 = stackOut_90_0;
                        break L16;
                      }
                    } else {
                      stackOut_88_0 = 0;
                      stackIn_95_0 = stackOut_88_0;
                      break L16;
                    }
                  }
                  L17: {
                    var2 = stackIn_95_0;
                    if (param0 == null) {
                      pl.field_m = 0;
                      break L17;
                    } else {
                      L18: {
                        if (qo.field_x) {
                          break L18;
                        } else {
                          if (var2 != 0) {
                            break L18;
                          } else {
                            pl.field_m = 0;
                            break L17;
                          }
                        }
                      }
                      pl.field_m = td.field_d;
                      break L17;
                    }
                  }
                  L19: {
                    if (param0 == null) {
                      if (var2 == 0) {
                        break L19;
                      } else {
                        qo.field_x = true;
                        break L19;
                      }
                    } else {
                      qo.field_x = false;
                      break L19;
                    }
                  }
                  L20: {
                    mm.field_i = ck.field_n;
                    lc.field_i = ja.field_d;
                    da.field_m = param0;
                    if (qo.field_x) {
                      break L20;
                    } else {
                      if (td.field_d <= pl.field_m) {
                        break L20;
                      } else {
                        if (ll.field_a) {
                          pl.field_m = 0;
                          mm.field_i = ck.field_n;
                          lc.field_i = ja.field_d;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                  L21: {
                    ja.field_d = -1;
                    if (!qo.field_x) {
                      break L21;
                    } else {
                      if (pl.field_m == se.field_o) {
                        pl.field_m = 0;
                        qo.field_x = false;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                  ck.field_n = -1;
                  return;
                } else {
                  L22: {
                    da.field_m = param0;
                    if (qo.field_x) {
                      break L22;
                    } else {
                      if (td.field_d <= pl.field_m) {
                        break L22;
                      } else {
                        if (ll.field_a) {
                          pl.field_m = 0;
                          mm.field_i = ck.field_n;
                          lc.field_i = ja.field_d;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  L23: {
                    ja.field_d = -1;
                    if (!qo.field_x) {
                      break L23;
                    } else {
                      if (pl.field_m == se.field_o) {
                        pl.field_m = 0;
                        qo.field_x = false;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  ck.field_n = -1;
                  return;
                }
              }
            }
          } else {
            L24: {
              if (param0 != null) {
                if (!param0.equals((Object) (Object) da.field_m)) {
                  L25: {
                    if (!qo.field_x) {
                      if (td.field_d <= pl.field_m) {
                        if (td.field_d - -vf.field_k > pl.field_m) {
                          stackOut_46_0 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L25;
                        } else {
                          stackOut_45_0 = 0;
                          stackIn_48_0 = stackOut_45_0;
                          break L25;
                        }
                      } else {
                        stackOut_43_0 = 0;
                        stackIn_48_0 = stackOut_43_0;
                        break L25;
                      }
                    } else {
                      stackOut_41_0 = 0;
                      stackIn_48_0 = stackOut_41_0;
                      break L25;
                    }
                  }
                  L26: {
                    var2 = stackIn_48_0;
                    if (param0 == null) {
                      pl.field_m = 0;
                      break L26;
                    } else {
                      if (!qo.field_x) {
                        if (var2 == 0) {
                          pl.field_m = 0;
                          break L26;
                        } else {
                          pl.field_m = td.field_d;
                          break L26;
                        }
                      } else {
                        pl.field_m = td.field_d;
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (param0 == null) {
                      if (var2 == 0) {
                        break L27;
                      } else {
                        qo.field_x = true;
                        mm.field_i = ck.field_n;
                        lc.field_i = ja.field_d;
                        break L24;
                      }
                    } else {
                      qo.field_x = false;
                      break L27;
                    }
                  }
                  mm.field_i = ck.field_n;
                  lc.field_i = ja.field_d;
                  break L24;
                } else {
                  break L24;
                }
              } else {
                if (da.field_m != null) {
                  break L24;
                } else {
                  L28: {
                    if (!qo.field_x) {
                      if (td.field_d <= pl.field_m) {
                        if (td.field_d - -vf.field_k > pl.field_m) {
                          stackOut_11_0 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          break L28;
                        } else {
                          stackOut_10_0 = 0;
                          stackIn_13_0 = stackOut_10_0;
                          break L28;
                        }
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_13_0 = stackOut_8_0;
                        break L28;
                      }
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_13_0 = stackOut_6_0;
                      break L28;
                    }
                  }
                  L29: {
                    L30: {
                      var2 = stackIn_13_0;
                      if (param0 == null) {
                        break L30;
                      } else {
                        if (!qo.field_x) {
                          if (var2 == 0) {
                            break L30;
                          } else {
                            pl.field_m = td.field_d;
                            break L29;
                          }
                        } else {
                          pl.field_m = td.field_d;
                          break L29;
                        }
                      }
                    }
                    pl.field_m = 0;
                    break L29;
                  }
                  L31: {
                    if (param0 == null) {
                      if (var2 == 0) {
                        break L31;
                      } else {
                        qo.field_x = true;
                        break L31;
                      }
                    } else {
                      qo.field_x = false;
                      break L31;
                    }
                  }
                  L32: {
                    mm.field_i = ck.field_n;
                    lc.field_i = ja.field_d;
                    da.field_m = param0;
                    if (qo.field_x) {
                      break L32;
                    } else {
                      if (td.field_d <= pl.field_m) {
                        break L32;
                      } else {
                        if (ll.field_a) {
                          pl.field_m = 0;
                          mm.field_i = ck.field_n;
                          lc.field_i = ja.field_d;
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                    }
                  }
                  L33: {
                    ja.field_d = -1;
                    if (!qo.field_x) {
                      ck.field_n = -1;
                      break L33;
                    } else {
                      if (pl.field_m == se.field_o) {
                        pl.field_m = 0;
                        qo.field_x = false;
                        ck.field_n = -1;
                        break L33;
                      } else {
                        ck.field_n = -1;
                        break L33;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L34: {
              da.field_m = param0;
              if (qo.field_x) {
                break L34;
              } else {
                if (td.field_d <= pl.field_m) {
                  break L34;
                } else {
                  if (ll.field_a) {
                    pl.field_m = 0;
                    mm.field_i = ck.field_n;
                    lc.field_i = ja.field_d;
                    break L34;
                  } else {
                    break L34;
                  }
                }
              }
            }
            L35: {
              ja.field_d = -1;
              if (!qo.field_x) {
                break L35;
              } else {
                if (pl.field_m == se.field_o) {
                  pl.field_m = 0;
                  qo.field_x = false;
                  break L35;
                } else {
                  break L35;
                }
              }
            }
            ck.field_n = -1;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_z = null;
        if (param0) {
            return;
        }
        field_y = null;
        field_x = null;
        field_B = null;
    }

    final static void b(int param0, int param1) {
        ba.field_s = param1;
        if (param0 >= -110) {
            og.b(53, -25);
        }
    }

    final int e(int param0) {
        if (((og) this).field_w == null) {
            return 0;
        }
        if (param0 != -31478) {
            return 29;
        }
        return 100 * ((og) this).field_w.field_j / (-((og) this).field_C + ((og) this).field_w.field_h.length);
    }

    final static void g(int param0) {
        int var2 = 0;
        u var3 = null;
        int var4 = ZombieDawn.field_J;
        u[] var5 = ij.field_L;
        u[] var1 = var5;
        for (var2 = param0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.d(param0 ^ 0);
        }
    }

    og() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[8192];
        field_z = "Rank";
        field_B = new af();
    }
}

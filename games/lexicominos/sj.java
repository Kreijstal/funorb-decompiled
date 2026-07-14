/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends kd {
    long[][] field_i;
    boolean field_k;
    int[][] field_n;
    String[][] field_j;
    int field_m;
    static String field_l;
    int field_h;
    int field_o;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_150_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        ug.field_m = ug.field_m + 1;
        if ((ch.field_e ^ -1) == param0) {
          if (0 != (fk.field_e ^ -1)) {
            L0: {
              L1: {
                if (param1 != null) {
                  if (param1.equals((Object) (Object) nc.field_p)) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (nc.field_p != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!af.field_b) {
                  if (ug.field_m >= dj.field_b) {
                    if (dj.field_b - -ik.field_j > ug.field_m) {
                      stackOut_148_0 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      break L2;
                    } else {
                      stackOut_147_0 = 0;
                      stackIn_150_0 = stackOut_147_0;
                      break L2;
                    }
                  } else {
                    stackOut_145_0 = 0;
                    stackIn_150_0 = stackOut_145_0;
                    break L2;
                  }
                } else {
                  stackOut_143_0 = 0;
                  stackIn_150_0 = stackOut_143_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = stackIn_150_0;
                  if (param1 == null) {
                    break L4;
                  } else {
                    if (af.field_b) {
                      ug.field_m = dj.field_b;
                      break L3;
                    } else {
                      if (var2 == 0) {
                        break L4;
                      } else {
                        ug.field_m = dj.field_b;
                        break L3;
                      }
                    }
                  }
                }
                ug.field_m = 0;
                break L3;
              }
              L5: {
                vf.field_r = fk.field_e;
                if (param1 == null) {
                  if (var2 != 0) {
                    af.field_b = true;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  af.field_b = false;
                  break L5;
                }
              }
              bf.field_g = ch.field_e;
              break L0;
            }
            L6: {
              if (af.field_b) {
                break L6;
              } else {
                if (dj.field_b <= ug.field_m) {
                  break L6;
                } else {
                  if (ob.field_c) {
                    ug.field_m = 0;
                    vf.field_r = fk.field_e;
                    bf.field_g = ch.field_e;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              nc.field_p = param1;
              fk.field_e = -1;
              if (!af.field_b) {
                break L7;
              } else {
                if (ug.field_m == v.field_u) {
                  af.field_b = false;
                  ug.field_m = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ch.field_e = -1;
            return;
          } else {
            L8: {
              L9: {
                ch.field_e = bk.field_b;
                fk.field_e = sh.field_e;
                if (param1 != null) {
                  if (param1.equals((Object) (Object) nc.field_p)) {
                    break L8;
                  } else {
                    break L9;
                  }
                } else {
                  if (nc.field_p != null) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (!af.field_b) {
                  if (ug.field_m >= dj.field_b) {
                    if (dj.field_b - -ik.field_j <= ug.field_m) {
                      stackOut_112_0 = 0;
                      stackIn_114_0 = stackOut_112_0;
                      break L10;
                    } else {
                      stackOut_111_0 = 1;
                      stackIn_114_0 = stackOut_111_0;
                      break L10;
                    }
                  } else {
                    stackOut_109_0 = 0;
                    stackIn_114_0 = stackOut_109_0;
                    break L10;
                  }
                } else {
                  stackOut_107_0 = 0;
                  stackIn_114_0 = stackOut_107_0;
                  break L10;
                }
              }
              L11: {
                L12: {
                  var2 = stackIn_114_0;
                  if (param1 == null) {
                    break L12;
                  } else {
                    if (af.field_b) {
                      ug.field_m = dj.field_b;
                      break L11;
                    } else {
                      if (var2 == 0) {
                        break L12;
                      } else {
                        ug.field_m = dj.field_b;
                        break L11;
                      }
                    }
                  }
                }
                ug.field_m = 0;
                break L11;
              }
              L13: {
                vf.field_r = fk.field_e;
                if (param1 == null) {
                  if (var2 != 0) {
                    af.field_b = true;
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  af.field_b = false;
                  break L13;
                }
              }
              bf.field_g = ch.field_e;
              break L8;
            }
            L14: {
              if (af.field_b) {
                break L14;
              } else {
                if (dj.field_b <= ug.field_m) {
                  break L14;
                } else {
                  if (ob.field_c) {
                    ug.field_m = 0;
                    vf.field_r = fk.field_e;
                    bf.field_g = ch.field_e;
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L15: {
              nc.field_p = param1;
              fk.field_e = -1;
              if (!af.field_b) {
                break L15;
              } else {
                if (ug.field_m == v.field_u) {
                  af.field_b = false;
                  ug.field_m = 0;
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            ch.field_e = -1;
            return;
          }
        } else {
          if (param1 != null) {
            if (param1.equals((Object) (Object) nc.field_p)) {
              L16: {
                if (af.field_b) {
                  break L16;
                } else {
                  if (dj.field_b <= ug.field_m) {
                    break L16;
                  } else {
                    if (ob.field_c) {
                      ug.field_m = 0;
                      vf.field_r = fk.field_e;
                      bf.field_g = ch.field_e;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              L17: {
                nc.field_p = param1;
                fk.field_e = -1;
                if (!af.field_b) {
                  ch.field_e = -1;
                  break L17;
                } else {
                  if (ug.field_m == v.field_u) {
                    af.field_b = false;
                    ug.field_m = 0;
                    ch.field_e = -1;
                    break L17;
                  } else {
                    ch.field_e = -1;
                    break L17;
                  }
                }
              }
              return;
            } else {
              L18: {
                if (!af.field_b) {
                  if (ug.field_m >= dj.field_b) {
                    if (dj.field_b - -ik.field_j > ug.field_m) {
                      stackOut_58_0 = 1;
                      stackIn_60_0 = stackOut_58_0;
                      break L18;
                    } else {
                      stackOut_57_0 = 0;
                      stackIn_60_0 = stackOut_57_0;
                      break L18;
                    }
                  } else {
                    stackOut_55_0 = 0;
                    stackIn_60_0 = stackOut_55_0;
                    break L18;
                  }
                } else {
                  stackOut_53_0 = 0;
                  stackIn_60_0 = stackOut_53_0;
                  break L18;
                }
              }
              L19: {
                var2 = stackIn_60_0;
                if (param1 != null) {
                  if (af.field_b) {
                    ug.field_m = dj.field_b;
                    break L19;
                  } else {
                    if (var2 != 0) {
                      ug.field_m = dj.field_b;
                      break L19;
                    } else {
                      ug.field_m = 0;
                      break L19;
                    }
                  }
                } else {
                  ug.field_m = 0;
                  break L19;
                }
              }
              L20: {
                vf.field_r = fk.field_e;
                if (param1 == null) {
                  if (var2 != 0) {
                    af.field_b = true;
                    break L20;
                  } else {
                    break L20;
                  }
                } else {
                  af.field_b = false;
                  break L20;
                }
              }
              L21: {
                bf.field_g = ch.field_e;
                if (af.field_b) {
                  break L21;
                } else {
                  if (dj.field_b <= ug.field_m) {
                    break L21;
                  } else {
                    if (ob.field_c) {
                      ug.field_m = 0;
                      vf.field_r = fk.field_e;
                      bf.field_g = ch.field_e;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              L22: {
                nc.field_p = param1;
                fk.field_e = -1;
                if (!af.field_b) {
                  ch.field_e = -1;
                  break L22;
                } else {
                  if (ug.field_m == v.field_u) {
                    af.field_b = false;
                    ug.field_m = 0;
                    ch.field_e = -1;
                    break L22;
                  } else {
                    ch.field_e = -1;
                    break L22;
                  }
                }
              }
              return;
            }
          } else {
            if (nc.field_p != null) {
              L23: {
                if (af.field_b) {
                  break L23;
                } else {
                  if (dj.field_b <= ug.field_m) {
                    break L23;
                  } else {
                    if (ob.field_c) {
                      ug.field_m = 0;
                      vf.field_r = fk.field_e;
                      bf.field_g = ch.field_e;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
              }
              L24: {
                nc.field_p = param1;
                fk.field_e = -1;
                if (!af.field_b) {
                  ch.field_e = -1;
                  break L24;
                } else {
                  if (ug.field_m == v.field_u) {
                    af.field_b = false;
                    ug.field_m = 0;
                    ch.field_e = -1;
                    break L24;
                  } else {
                    ch.field_e = -1;
                    break L24;
                  }
                }
              }
              return;
            } else {
              L25: {
                if (!af.field_b) {
                  if (ug.field_m >= dj.field_b) {
                    if (dj.field_b - -ik.field_j > ug.field_m) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L25;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L25;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    break L25;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_11_0 = stackOut_4_0;
                  break L25;
                }
              }
              L26: {
                var2 = stackIn_11_0;
                if (param1 != null) {
                  L27: {
                    if (af.field_b) {
                      break L27;
                    } else {
                      if (var2 != 0) {
                        break L27;
                      } else {
                        ug.field_m = 0;
                        break L26;
                      }
                    }
                  }
                  ug.field_m = dj.field_b;
                  break L26;
                } else {
                  ug.field_m = 0;
                  break L26;
                }
              }
              L28: {
                vf.field_r = fk.field_e;
                if (param1 == null) {
                  if (var2 != 0) {
                    af.field_b = true;
                    break L28;
                  } else {
                    break L28;
                  }
                } else {
                  af.field_b = false;
                  break L28;
                }
              }
              L29: {
                bf.field_g = ch.field_e;
                if (af.field_b) {
                  break L29;
                } else {
                  if (dj.field_b <= ug.field_m) {
                    break L29;
                  } else {
                    if (ob.field_c) {
                      ug.field_m = 0;
                      vf.field_r = fk.field_e;
                      bf.field_g = ch.field_e;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                }
              }
              L30: {
                nc.field_p = param1;
                fk.field_e = -1;
                if (!af.field_b) {
                  ch.field_e = -1;
                  break L30;
                } else {
                  if (ug.field_m == v.field_u) {
                    af.field_b = false;
                    ug.field_m = 0;
                    ch.field_e = -1;
                    break L30;
                  } else {
                    ch.field_e = -1;
                    break L30;
                  }
                }
              }
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 3) {
            sj.a((byte) -96);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (param5) {
          if (param4 >= param6) {
            if (param6 - -param3 > param4) {
              if (param0 >= param2) {
                if (param1 + param2 <= param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    sj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "END";
    }
}

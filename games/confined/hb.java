/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends kg {
    static bf field_u;
    private int field_p;
    static String field_v;
    private fc field_q;
    static String field_s;
    static be field_r;
    static String field_t;

    final void i(int param0) {
        ((hb) this).field_p = ((hb) this).field_n * param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        for (var5 = param1; param2 > var5; var5++) {
            ((hb) this).field_n = ((hb) this).field_n + 1;
            param0[var5 + param3] = (byte)(((hb) this).field_m[((hb) this).field_n] + -((hb) this).field_q.c(km.a(param1, 256)));
        }
    }

    hb(byte[] param0) {
        super(param0);
    }

    final void b(boolean param0, int param1) {
        ((hb) this).field_n = ((hb) this).field_n + 1;
        ((hb) this).field_m[((hb) this).field_n] = (byte)(((hb) this).field_q.c(256) + param1);
        if (!param0) {
            ((hb) this).j(-107);
        }
    }

    final void a(int[] param0, int param1) {
        int var3 = -124 % ((17 - param1) / 51);
        ((hb) this).field_q = new fc(param0);
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_153_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 == 122) {
          hm.field_qb = hm.field_qb + 1;
          if (-1 == c.field_t) {
            if (-1 != ah.field_Q) {
              L0: {
                L1: {
                  if (param1 != null) {
                    if (param1.equals((Object) (Object) vf.field_o)) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    if (vf.field_o != null) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (!sa.field_R) {
                    if (kc.field_t <= hm.field_qb) {
                      if (kc.field_t + hm.field_nb > hm.field_qb) {
                        stackOut_151_0 = 1;
                        stackIn_153_0 = stackOut_151_0;
                        break L2;
                      } else {
                        stackOut_150_0 = 0;
                        stackIn_153_0 = stackOut_150_0;
                        break L2;
                      }
                    } else {
                      stackOut_148_0 = 0;
                      stackIn_153_0 = stackOut_148_0;
                      break L2;
                    }
                  } else {
                    stackOut_146_0 = 0;
                    stackIn_153_0 = stackOut_146_0;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var2 = stackIn_153_0;
                    if (param1 == null) {
                      break L4;
                    } else {
                      if (sa.field_R) {
                        hm.field_qb = kc.field_t;
                        break L3;
                      } else {
                        if (var2 == 0) {
                          break L4;
                        } else {
                          hm.field_qb = kc.field_t;
                          break L3;
                        }
                      }
                    }
                  }
                  hm.field_qb = 0;
                  break L3;
                }
                if (param1 != null) {
                  sa.field_R = false;
                  nm.field_I = c.field_t;
                  he.field_f = ah.field_Q;
                  break L0;
                } else {
                  if (var2 != 0) {
                    sa.field_R = true;
                    nm.field_I = c.field_t;
                    he.field_f = ah.field_Q;
                    break L0;
                  } else {
                    nm.field_I = c.field_t;
                    he.field_f = ah.field_Q;
                    break L0;
                  }
                }
              }
              L5: {
                vf.field_o = param1;
                if (!sa.field_R) {
                  if (!sa.field_R) {
                    break L5;
                  } else {
                    if (hm.field_qb != qa.field_f) {
                      break L5;
                    } else {
                      hm.field_qb = 0;
                      sa.field_R = false;
                      break L5;
                    }
                  }
                } else {
                  if (!sa.field_R) {
                    break L5;
                  } else {
                    if (hm.field_qb != qa.field_f) {
                      break L5;
                    } else {
                      hm.field_qb = 0;
                      sa.field_R = false;
                      break L5;
                    }
                  }
                }
              }
              c.field_t = -1;
              ah.field_Q = -1;
              return;
            } else {
              L6: {
                L7: {
                  c.field_t = ld.field_l;
                  ah.field_Q = jh.field_R;
                  if (param1 != null) {
                    if (param1.equals((Object) (Object) vf.field_o)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  } else {
                    if (vf.field_o != null) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (!sa.field_R) {
                    if (kc.field_t <= hm.field_qb) {
                      if (kc.field_t + hm.field_nb <= hm.field_qb) {
                        stackOut_116_0 = 0;
                        stackIn_118_0 = stackOut_116_0;
                        break L8;
                      } else {
                        stackOut_115_0 = 1;
                        stackIn_118_0 = stackOut_115_0;
                        break L8;
                      }
                    } else {
                      stackOut_113_0 = 0;
                      stackIn_118_0 = stackOut_113_0;
                      break L8;
                    }
                  } else {
                    stackOut_111_0 = 0;
                    stackIn_118_0 = stackOut_111_0;
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    var2 = stackIn_118_0;
                    if (param1 == null) {
                      break L10;
                    } else {
                      if (sa.field_R) {
                        hm.field_qb = kc.field_t;
                        break L9;
                      } else {
                        if (var2 == 0) {
                          break L10;
                        } else {
                          hm.field_qb = kc.field_t;
                          break L9;
                        }
                      }
                    }
                  }
                  hm.field_qb = 0;
                  break L9;
                }
                L11: {
                  if (param1 != null) {
                    sa.field_R = false;
                    break L11;
                  } else {
                    if (var2 != 0) {
                      sa.field_R = true;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                nm.field_I = c.field_t;
                he.field_f = ah.field_Q;
                break L6;
              }
              L12: {
                vf.field_o = param1;
                if (!sa.field_R) {
                  if (!sa.field_R) {
                    break L12;
                  } else {
                    if (hm.field_qb != qa.field_f) {
                      break L12;
                    } else {
                      hm.field_qb = 0;
                      sa.field_R = false;
                      break L12;
                    }
                  }
                } else {
                  if (!sa.field_R) {
                    break L12;
                  } else {
                    if (hm.field_qb != qa.field_f) {
                      break L12;
                    } else {
                      hm.field_qb = 0;
                      sa.field_R = false;
                      break L12;
                    }
                  }
                }
              }
              c.field_t = -1;
              ah.field_Q = -1;
              return;
            }
          } else {
            if (param1 != null) {
              if (param1.equals((Object) (Object) vf.field_o)) {
                L13: {
                  vf.field_o = param1;
                  if (sa.field_R) {
                    break L13;
                  } else {
                    if (hm.field_qb >= kc.field_t) {
                      break L13;
                    } else {
                      if (hn.field_D) {
                        hm.field_qb = 0;
                        he.field_f = ah.field_Q;
                        nm.field_I = c.field_t;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L14: {
                  L15: {
                    if (!sa.field_R) {
                      break L15;
                    } else {
                      if (hm.field_qb != qa.field_f) {
                        break L15;
                      } else {
                        hm.field_qb = 0;
                        sa.field_R = false;
                        c.field_t = -1;
                        ah.field_Q = -1;
                        break L14;
                      }
                    }
                  }
                  c.field_t = -1;
                  ah.field_Q = -1;
                  break L14;
                }
                return;
              } else {
                L16: {
                  if (!sa.field_R) {
                    if (kc.field_t <= hm.field_qb) {
                      if (kc.field_t + hm.field_nb > hm.field_qb) {
                        stackOut_61_0 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        break L16;
                      } else {
                        stackOut_60_0 = 0;
                        stackIn_63_0 = stackOut_60_0;
                        break L16;
                      }
                    } else {
                      stackOut_58_0 = 0;
                      stackIn_63_0 = stackOut_58_0;
                      break L16;
                    }
                  } else {
                    stackOut_56_0 = 0;
                    stackIn_63_0 = stackOut_56_0;
                    break L16;
                  }
                }
                L17: {
                  var2 = stackIn_63_0;
                  if (param1 != null) {
                    if (sa.field_R) {
                      hm.field_qb = kc.field_t;
                      break L17;
                    } else {
                      if (var2 != 0) {
                        hm.field_qb = kc.field_t;
                        break L17;
                      } else {
                        hm.field_qb = 0;
                        break L17;
                      }
                    }
                  } else {
                    hm.field_qb = 0;
                    break L17;
                  }
                }
                L18: {
                  if (param1 != null) {
                    sa.field_R = false;
                    nm.field_I = c.field_t;
                    he.field_f = ah.field_Q;
                    break L18;
                  } else {
                    if (var2 != 0) {
                      sa.field_R = true;
                      nm.field_I = c.field_t;
                      he.field_f = ah.field_Q;
                      break L18;
                    } else {
                      nm.field_I = c.field_t;
                      he.field_f = ah.field_Q;
                      break L18;
                    }
                  }
                }
                L19: {
                  vf.field_o = param1;
                  if (sa.field_R) {
                    break L19;
                  } else {
                    if (hm.field_qb >= kc.field_t) {
                      break L19;
                    } else {
                      if (hn.field_D) {
                        hm.field_qb = 0;
                        he.field_f = ah.field_Q;
                        nm.field_I = c.field_t;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                L20: {
                  L21: {
                    if (!sa.field_R) {
                      break L21;
                    } else {
                      if (hm.field_qb != qa.field_f) {
                        break L21;
                      } else {
                        hm.field_qb = 0;
                        sa.field_R = false;
                        c.field_t = -1;
                        ah.field_Q = -1;
                        break L20;
                      }
                    }
                  }
                  c.field_t = -1;
                  ah.field_Q = -1;
                  break L20;
                }
                return;
              }
            } else {
              if (vf.field_o != null) {
                L22: {
                  vf.field_o = param1;
                  if (sa.field_R) {
                    break L22;
                  } else {
                    if (hm.field_qb >= kc.field_t) {
                      break L22;
                    } else {
                      if (hn.field_D) {
                        hm.field_qb = 0;
                        he.field_f = ah.field_Q;
                        nm.field_I = c.field_t;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                L23: {
                  L24: {
                    if (!sa.field_R) {
                      break L24;
                    } else {
                      if (hm.field_qb != qa.field_f) {
                        break L24;
                      } else {
                        hm.field_qb = 0;
                        sa.field_R = false;
                        c.field_t = -1;
                        ah.field_Q = -1;
                        break L23;
                      }
                    }
                  }
                  c.field_t = -1;
                  ah.field_Q = -1;
                  break L23;
                }
                return;
              } else {
                L25: {
                  if (!sa.field_R) {
                    if (kc.field_t <= hm.field_qb) {
                      if (kc.field_t + hm.field_nb > hm.field_qb) {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L25;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_13_0 = stackOut_10_0;
                        break L25;
                      }
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_13_0 = stackOut_8_0;
                      break L25;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_13_0 = stackOut_6_0;
                    break L25;
                  }
                }
                L26: {
                  var2 = stackIn_13_0;
                  if (param1 != null) {
                    L27: {
                      if (sa.field_R) {
                        break L27;
                      } else {
                        if (var2 != 0) {
                          break L27;
                        } else {
                          hm.field_qb = 0;
                          break L26;
                        }
                      }
                    }
                    hm.field_qb = kc.field_t;
                    break L26;
                  } else {
                    hm.field_qb = 0;
                    break L26;
                  }
                }
                L28: {
                  if (param1 != null) {
                    sa.field_R = false;
                    nm.field_I = c.field_t;
                    he.field_f = ah.field_Q;
                    break L28;
                  } else {
                    if (var2 != 0) {
                      sa.field_R = true;
                      nm.field_I = c.field_t;
                      he.field_f = ah.field_Q;
                      break L28;
                    } else {
                      nm.field_I = c.field_t;
                      he.field_f = ah.field_Q;
                      break L28;
                    }
                  }
                }
                L29: {
                  vf.field_o = param1;
                  if (sa.field_R) {
                    break L29;
                  } else {
                    if (hm.field_qb >= kc.field_t) {
                      break L29;
                    } else {
                      if (hn.field_D) {
                        hm.field_qb = 0;
                        he.field_f = ah.field_Q;
                        nm.field_I = c.field_t;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                L30: {
                  L31: {
                    if (!sa.field_R) {
                      break L31;
                    } else {
                      if (hm.field_qb != qa.field_f) {
                        break L31;
                      } else {
                        hm.field_qb = 0;
                        sa.field_R = false;
                        c.field_t = -1;
                        ah.field_Q = -1;
                        break L30;
                      }
                    }
                  }
                  c.field_t = -1;
                  ah.field_Q = -1;
                  break L30;
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int g(int param0, int param1) {
        int var6 = Confined.field_J ? 1 : 0;
        int var3 = ((hb) this).field_p >> 1904482147;
        int var4 = 8 - (7 & ((hb) this).field_p);
        ((hb) this).field_p = ((hb) this).field_p + param0;
        int var5 = param1;
        while (var4 < param0) {
            var3++;
            var5 = var5 + ((hn.field_C[var4] & ((hb) this).field_m[var3]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((hb) this).field_m[var3] >> var4 + -param0 & hn.field_C[param0]);
        } else {
            var5 = var5 + (hn.field_C[var4] & ((hb) this).field_m[var3]);
        }
        return var5;
    }

    hb(int param0) {
        super(param0);
    }

    final int h(int param0) {
        if (param0 != -1) {
          field_r = null;
          ((hb) this).field_n = ((hb) this).field_n + 1;
          return ((hb) this).field_m[((hb) this).field_n] + -((hb) this).field_q.c(param0 ^ -257) & 255;
        } else {
          ((hb) this).field_n = ((hb) this).field_n + 1;
          return ((hb) this).field_m[((hb) this).field_n] + -((hb) this).field_q.c(param0 ^ -257) & 255;
        }
    }

    final void j(int param0) {
        int var2 = 126 % ((77 - param0) / 38);
        ((hb) this).field_n = (((hb) this).field_p + 7) / 8;
    }

    public static void g(int param0) {
        field_r = null;
        field_s = null;
        field_t = null;
        if (param0 != -1) {
          hb.g(10);
          field_u = null;
          field_v = null;
          return;
        } else {
          field_u = null;
          field_v = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Score";
        field_t = "Confirm Password: ";
    }
}

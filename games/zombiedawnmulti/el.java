/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends rg {
    private String field_J;
    private int field_I;
    private boolean field_K;
    private int field_L;
    private int field_F;
    static int field_M;
    static ri field_E;
    private fm field_G;
    static ja[] field_H;

    final static ja[] a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        ja var13 = null;
        ja var14 = null;
        int[] var16 = oo.field_i;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = oo.field_b;
        int var8 = oo.field_l;
        ja var9 = new ja(16, param0);
        var9.a();
        oo.a(param2, 0, 16, param0, param1, param3);
        Object var10 = null;
        Object var11 = null;
        if (!(!param5)) {
            var13 = var9.c();
            var10 = var13;
            var13.a();
            oo.b(0, 0, 5, 0);
            oo.b(0, 1, 3, 0);
            oo.b(0, 2, 2, 0);
            oo.b(0, 3, 1, 0);
            oo.b(0, 4, 1, 0);
        }
        if (!(!param4)) {
            var14 = var9.c();
            var11 = var14;
            var14.a();
            oo.b(11, 0, 5, 0);
            oo.b(13, 1, 3, 0);
            oo.b(14, 2, 2, 0);
            oo.b(15, 3, 1, 0);
            oo.b(15, 4, 1, 0);
        }
        oo.a(var16, var7, var8);
        return new ja[]{null, null, null, (ja) (var10), var9, (ja) (var11), null, null, null};
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9) {
        int var11;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param9) {
          if (kp.field_l == oo.field_b) {
            L0: {
              if (oo.field_l == dm.field_Qb) {
                break L0;
              } else {
                if (oo.field_l != dl.field_h.field_f) {
                  break L0;
                } else {
                  if (dl.field_h.field_h != oo.field_b) {
                    break L0;
                  } else {
                    if (null != mh.field_c) {
                      ci.a(false, -83);
                      break L0;
                    } else {
                      if (ej.field_n != null) {
                        ci.a(true, -51);
                        break L0;
                      } else {
                        wn.a((byte) 3);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            if (param9) {
              L1: {
                ck.field_a = ho.field_m;
                ui.a((byte) -109, param9);
                if (-1 <= (mh.field_h ^ -1)) {
                  break L1;
                } else {
                  ko.a(param4, param7, false, param9);
                  break L1;
                }
              }
              L2: {
                eb.field_B.field_R = 1;
                eb.field_B.field_V = qc.field_u.field_V;
                if (sq.field_Q <= 0) {
                  break L2;
                } else {
                  gg.a(param7, param4, param9, true);
                  break L2;
                }
              }
              L3: {
                if (0 < da.field_a) {
                  so.a(param3 ^ 48, param4, param9, param1, param7);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (!io.field_b) {
                    break L5;
                  } else {
                    if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                      pd.field_b.field_Z = false;
                      hf.field_e.field_Jb.field_wb = ka.field_p;
                      ob.a(hf.field_e.field_Gb, 97);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                break L4;
              }
              og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
              vi.a(param2, param7, (byte) 45, bf.field_n, param6);
              if (param3 == 2) {
                qj.field_i = qj.field_i + 1;
                return;
              } else {
                return;
              }
            } else {
              ck.field_a = (-640 + kp.field_l) / 2;
              ui.a((byte) -109, param9);
              if (-1 <= (mh.field_h ^ -1)) {
                L6: {
                  eb.field_B.field_R = 1;
                  eb.field_B.field_V = qc.field_u.field_V;
                  if (sq.field_Q <= 0) {
                    break L6;
                  } else {
                    gg.a(param7, param4, param9, true);
                    break L6;
                  }
                }
                L7: {
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (!io.field_b) {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                  vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                  if (param3 == 2) {
                    qj.field_i = qj.field_i + 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                    pd.field_b.field_Z = false;
                    hf.field_e.field_Jb.field_wb = ka.field_p;
                    ob.a(hf.field_e.field_Gb, 97);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 == 2) {
                      qj.field_i = qj.field_i + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 == 2) {
                      qj.field_i = qj.field_i + 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L8: {
                  ko.a(param4, param7, false, param9);
                  eb.field_B.field_R = 1;
                  eb.field_B.field_V = qc.field_u.field_V;
                  if (sq.field_Q <= 0) {
                    break L8;
                  } else {
                    gg.a(param7, param4, param9, true);
                    break L8;
                  }
                }
                L9: {
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (!io.field_b) {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                  vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                  if (param3 == 2) {
                    qj.field_i = qj.field_i + 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                    pd.field_b.field_Z = false;
                    hf.field_e.field_Jb.field_wb = ka.field_p;
                    ob.a(hf.field_e.field_Gb, 97);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 == 2) {
                      qj.field_i = qj.field_i + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 == 2) {
                      qj.field_i = qj.field_i + 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L10: {
              if (oo.field_l != dl.field_h.field_f) {
                break L10;
              } else {
                if (dl.field_h.field_h != oo.field_b) {
                  break L10;
                } else {
                  if (null != mh.field_c) {
                    ci.a(false, -83);
                    break L10;
                  } else {
                    if (ej.field_n != null) {
                      ci.a(true, -51);
                      break L10;
                    } else {
                      wn.a((byte) 3);
                      break L10;
                    }
                  }
                }
              }
            }
            if (param9) {
              L11: {
                ck.field_a = ho.field_m;
                ui.a((byte) -109, param9);
                if (-1 <= (mh.field_h ^ -1)) {
                  break L11;
                } else {
                  ko.a(param4, param7, false, param9);
                  break L11;
                }
              }
              L12: {
                eb.field_B.field_R = 1;
                eb.field_B.field_V = qc.field_u.field_V;
                if (sq.field_Q <= 0) {
                  break L12;
                } else {
                  gg.a(param7, param4, param9, true);
                  break L12;
                }
              }
              L13: {
                if (0 < da.field_a) {
                  so.a(param3 ^ 48, param4, param9, param1, param7);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                L15: {
                  if (!io.field_b) {
                    break L15;
                  } else {
                    if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                      pd.field_b.field_Z = false;
                      hf.field_e.field_Jb.field_wb = ka.field_p;
                      ob.a(hf.field_e.field_Gb, 97);
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                break L14;
              }
              og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
              vi.a(param2, param7, (byte) 45, bf.field_n, param6);
              if (param3 != 2) {
                return;
              } else {
                qj.field_i = qj.field_i + 1;
                return;
              }
            } else {
              ck.field_a = (-640 + kp.field_l) / 2;
              ui.a((byte) -109, param9);
              if (-1 <= (mh.field_h ^ -1)) {
                eb.field_B.field_R = 1;
                eb.field_B.field_V = qc.field_u.field_V;
                if (sq.field_Q <= 0) {
                  L16: {
                    if (0 < da.field_a) {
                      so.a(param3 ^ 48, param4, param9, param1, param7);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (!io.field_b) {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 == 2) {
                      qj.field_i = qj.field_i + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                      pd.field_b.field_Z = false;
                      hf.field_e.field_Jb.field_wb = ka.field_p;
                      ob.a(hf.field_e.field_Gb, 97);
                      og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                      vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                      if (param3 == 2) {
                        qj.field_i = qj.field_i + 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      hf.field_e.field_Jb.field_wb = null;
                      pd.field_b.field_Z = true;
                      vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                      og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                      vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                      if (param3 == 2) {
                        qj.field_i = qj.field_i + 1;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L17: {
                    gg.a(param7, param4, param9, true);
                    if (0 < da.field_a) {
                      so.a(param3 ^ 48, param4, param9, param1, param7);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      if (!io.field_b) {
                        break L19;
                      } else {
                        if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                          pd.field_b.field_Z = false;
                          hf.field_e.field_Jb.field_wb = ka.field_p;
                          ob.a(hf.field_e.field_Gb, 97);
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                    break L18;
                  }
                  og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                  vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                  if (param3 == 2) {
                    qj.field_i = qj.field_i + 1;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L20: {
                  ko.a(param4, param7, false, param9);
                  eb.field_B.field_R = 1;
                  eb.field_B.field_V = qc.field_u.field_V;
                  if (sq.field_Q <= 0) {
                    break L20;
                  } else {
                    gg.a(param7, param4, param9, true);
                    break L20;
                  }
                }
                L21: {
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  L23: {
                    if (!io.field_b) {
                      break L23;
                    } else {
                      if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                        pd.field_b.field_Z = false;
                        hf.field_e.field_Jb.field_wb = ka.field_p;
                        ob.a(hf.field_e.field_Gb, 97);
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  break L22;
                }
                og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                if (param3 != 2) {
                  return;
                } else {
                  qj.field_i = qj.field_i + 1;
                  return;
                }
              }
            }
          }
        } else {
          if (param9) {
            L24: {
              ck.field_a = ho.field_m;
              ui.a((byte) -109, param9);
              if (-1 <= (mh.field_h ^ -1)) {
                break L24;
              } else {
                ko.a(param4, param7, false, param9);
                break L24;
              }
            }
            L25: {
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q <= 0) {
                break L25;
              } else {
                gg.a(param7, param4, param9, true);
                break L25;
              }
            }
            L26: {
              if (0 < da.field_a) {
                so.a(param3 ^ 48, param4, param9, param1, param7);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              L28: {
                if (!io.field_b) {
                  break L28;
                } else {
                  if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                    pd.field_b.field_Z = false;
                    hf.field_e.field_Jb.field_wb = ka.field_p;
                    ob.a(hf.field_e.field_Gb, 97);
                    break L27;
                  } else {
                    break L28;
                  }
                }
              }
              hf.field_e.field_Jb.field_wb = null;
              pd.field_b.field_Z = true;
              vi.a(param2, param7, (byte) 45, hf.field_e, param6);
              break L27;
            }
            og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
            vi.a(param2, param7, (byte) 45, bf.field_n, param6);
            if (param3 != 2) {
              return;
            } else {
              qj.field_i = qj.field_i + 1;
              return;
            }
          } else {
            ck.field_a = (-640 + kp.field_l) / 2;
            ui.a((byte) -109, param9);
            if (-1 <= (mh.field_h ^ -1)) {
              eb.field_B.field_R = 1;
              eb.field_B.field_V = qc.field_u.field_V;
              if (sq.field_Q <= 0) {
                L29: {
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                if (!io.field_b) {
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                  vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                  if (param3 != 2) {
                    return;
                  } else {
                    qj.field_i = qj.field_i + 1;
                    return;
                  }
                } else {
                  if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                    pd.field_b.field_Z = false;
                    hf.field_e.field_Jb.field_wb = ka.field_p;
                    ob.a(hf.field_e.field_Gb, 97);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 != 2) {
                      return;
                    } else {
                      qj.field_i = qj.field_i + 1;
                      return;
                    }
                  } else {
                    hf.field_e.field_Jb.field_wb = null;
                    pd.field_b.field_Z = true;
                    vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                    og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                    vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                    if (param3 != 2) {
                      return;
                    } else {
                      qj.field_i = qj.field_i + 1;
                      return;
                    }
                  }
                }
              } else {
                L30: {
                  gg.a(param7, param4, param9, true);
                  if (0 < da.field_a) {
                    so.a(param3 ^ 48, param4, param9, param1, param7);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  L32: {
                    if (!io.field_b) {
                      break L32;
                    } else {
                      if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                        pd.field_b.field_Z = false;
                        hf.field_e.field_Jb.field_wb = ka.field_p;
                        ob.a(hf.field_e.field_Gb, 97);
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  hf.field_e.field_Jb.field_wb = null;
                  pd.field_b.field_Z = true;
                  vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                  break L31;
                }
                og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
                vi.a(param2, param7, (byte) 45, bf.field_n, param6);
                if (param3 != 2) {
                  return;
                } else {
                  qj.field_i = qj.field_i + 1;
                  return;
                }
              }
            } else {
              L33: {
                ko.a(param4, param7, false, param9);
                eb.field_B.field_R = 1;
                eb.field_B.field_V = qc.field_u.field_V;
                if (sq.field_Q <= 0) {
                  break L33;
                } else {
                  gg.a(param7, param4, param9, true);
                  break L33;
                }
              }
              L34: {
                if (0 < da.field_a) {
                  so.a(param3 ^ 48, param4, param9, param1, param7);
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                L36: {
                  if (!io.field_b) {
                    break L36;
                  } else {
                    if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                      pd.field_b.field_Z = false;
                      hf.field_e.field_Jb.field_wb = ka.field_p;
                      ob.a(hf.field_e.field_Gb, 97);
                      break L35;
                    } else {
                      break L36;
                    }
                  }
                }
                hf.field_e.field_Jb.field_wb = null;
                pd.field_b.field_Z = true;
                vi.a(param2, param7, (byte) 45, hf.field_e, param6);
                break L35;
              }
              og.a(param8, (byte) 120, param0, param7, param5, param6, param2);
              vi.a(param2, param7, (byte) 45, bf.field_n, param6);
              if (param3 != 2) {
                return;
              } else {
                qj.field_i = qj.field_i + 1;
                return;
              }
            }
          }
        }
    }

    final String d(byte param0) {
        int var2 = this.field_B.field_l ? 1 : 0;
        this.field_B.field_l = this.field_l;
        String var3 = this.field_B.d((byte) -84);
        this.field_B.field_l = var2 != 0 ? true : false;
        int var4 = -127 % ((53 - param0) / 57);
        return var3;
    }

    public static void h(int param0) {
        field_E = null;
        field_H = null;
        if (param0 != 3) {
            field_H = (ja[]) null;
        }
    }

    final static mf b(boolean param0) {
        try {
            Throwable var1 = null;
            mf stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    el.b(true);
                    break L1;
                  }
                }
                stackIn_3_0 = (mf) (Class.forName("ue").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_7_0 = 0;
        fm stackIn_9_0;
        String stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_9_5;
        int stackIn_9_6;
        int stackIn_9_7;
        fm stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_14_0 = 0;
        fm stackIn_16_0;
        String stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_16_5;
        int stackIn_16_6;
        int stackIn_16_7;
        fm stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        int stackIn_17_8 = 0;
        var5 = param3 + this.field_y;
        var6 = param1 + this.field_i;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          if (param0 != -2) {
            L0: {
              this.d((byte) 56);
              if (!this.field_K) {
                stackIn_14_0 = 0;
                break L0;
              } else {
                stackIn_14_0 = -this.field_L + this.field_n - this.field_I * 2;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_14_0;
              stackIn_16_0 = this.field_G;

              stackIn_16_1 = this.field_J;

              stackIn_16_2 = this.field_I + (var7 + var5);

              stackIn_16_3 = this.field_I + var6;

              stackIn_16_4 = -this.field_I + this.field_L;

              stackIn_16_5 = -(2 * this.field_I) + this.field_w;

              stackIn_16_6 = this.field_F;

              stackIn_16_7 = -1;

              if (!this.field_K) {
                stackIn_17_0 = (fm) ((Object) stackIn_16_0);
                stackIn_17_1 = (String) ((Object) stackIn_16_1);
                stackIn_17_2 = stackIn_16_2;
                stackIn_17_3 = stackIn_16_3;
                stackIn_17_4 = stackIn_16_4;
                stackIn_17_5 = stackIn_16_5;
                stackIn_17_6 = stackIn_16_6;
                stackIn_17_7 = stackIn_16_7;
                stackIn_17_8 = 2;
                break L1;
              } else {
                stackIn_17_0 = (fm) ((Object) stackIn_16_0);
                stackIn_17_1 = (String) ((Object) stackIn_16_1);
                stackIn_17_2 = stackIn_16_2;
                stackIn_17_3 = stackIn_16_3;
                stackIn_17_4 = stackIn_16_4;
                stackIn_17_5 = stackIn_16_5;
                stackIn_17_6 = stackIn_16_6;
                stackIn_17_7 = stackIn_16_7;
                stackIn_17_8 = 0;
                break L1;
              }
            }
            ((fm) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5, stackIn_17_6, stackIn_17_7, stackIn_17_8, 1, this.field_G.field_C);
            return;
          } else {
            L2: {
              if (!this.field_K) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = -this.field_L + this.field_n - this.field_I * 2;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_7_0;
              stackIn_9_0 = this.field_G;

              stackIn_9_1 = this.field_J;

              stackIn_9_2 = this.field_I + (var7 + var5);

              stackIn_9_3 = this.field_I + var6;

              stackIn_9_4 = -this.field_I + this.field_L;

              stackIn_9_5 = -(2 * this.field_I) + this.field_w;

              stackIn_9_6 = this.field_F;

              stackIn_9_7 = -1;

              if (!this.field_K) {
                stackIn_10_0 = (fm) ((Object) stackIn_9_0);
                stackIn_10_1 = (String) ((Object) stackIn_9_1);
                stackIn_10_2 = stackIn_9_2;
                stackIn_10_3 = stackIn_9_3;
                stackIn_10_4 = stackIn_9_4;
                stackIn_10_5 = stackIn_9_5;
                stackIn_10_6 = stackIn_9_6;
                stackIn_10_7 = stackIn_9_7;
                stackIn_10_8 = 2;
                break L3;
              } else {
                stackIn_10_0 = (fm) ((Object) stackIn_9_0);
                stackIn_10_1 = (String) ((Object) stackIn_9_1);
                stackIn_10_2 = stackIn_9_2;
                stackIn_10_3 = stackIn_9_3;
                stackIn_10_4 = stackIn_9_4;
                stackIn_10_5 = stackIn_9_5;
                stackIn_10_6 = stackIn_9_6;
                stackIn_10_7 = stackIn_9_7;
                stackIn_10_8 = 0;
                break L3;
              }
            }
            ((fm) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5, stackIn_10_6, stackIn_10_7, stackIn_10_8, 1, this.field_G.field_C);
            return;
          }
        }
    }

    el(int param0, int param1, int param2, int param3, cf param4, boolean param5, int param6, int param7, fm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nl) null, (bj) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_I = param7;
              this.field_B = param4;
              this.field_L = param6;
              this.field_J = param10;
              this.field_G = param8;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((el) (this)).field_K = stackIn_4_1 != 0;
              this.field_F = param9;
              var12_int = -this.field_I + this.field_L;
              var13 = this.field_G.a(param10, var12_int, this.field_G.field_C) - -(2 * this.field_I);
              if (param3 < var13) {
                this.b(param0, param1, 28972, param2, var13);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_K) {
                stackIn_10_0 = this.field_I * 2 + this.field_L;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_B.b(var14, (-param3 + var13 >> 738749601) + this.field_I, 28972, param2 + -this.field_L - this.field_I * 3, -(this.field_I * 2) + param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("el.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_M = 2;
    }
}

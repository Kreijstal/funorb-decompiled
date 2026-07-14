/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ja var9 = null;
        ja var10 = null;
        ja var11 = null;
        int[] var12 = null;
        ja var13 = null;
        ja var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = oo.field_i;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = oo.field_b;
          var8 = oo.field_l;
          var9 = new ja(16, param0);
          var9.a();
          oo.a(param2, 0, 16, param0, param1, param3);
          var10 = null;
          var11 = null;
          if (param5) {
            var13 = var9.c();
            var10 = var13;
            var13.a();
            oo.b(0, 0, 5, 0);
            oo.b(0, 1, 3, 0);
            oo.b(0, 2, 2, 0);
            oo.b(0, 3, 1, 0);
            oo.b(0, 4, 1, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4) {
            var14 = var9.c();
            var11 = var14;
            var14.a();
            oo.b(11, 0, 5, 0);
            oo.b(13, 1, 3, 0);
            oo.b(14, 2, 2, 0);
            oo.b(15, 3, 1, 0);
            oo.b(15, 4, 1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        oo.a(var18, var7, var8);
        return new ja[]{null, null, null, var10, var9, var11, null, null, null};
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9) {
        int var11 = 0;
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
        int var2 = ((el) this).field_B.field_l ? 1 : 0;
        ((el) this).field_B.field_l = ((el) this).field_l;
        String var3 = ((el) this).field_B.d((byte) -84);
        ((el) this).field_B.field_l = var2 != 0 ? true : false;
        int var4 = -127 % ((53 - param0) / 57);
        return var3;
    }

    public static void h(int param0) {
        field_E = null;
        field_H = null;
        if (param0 != 3) {
            field_H = null;
        }
    }

    final static mf b(boolean param0) {
        try {
            Throwable var1 = null;
            mf stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            mf stackOut_2_0 = null;
            try {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  mf discarded$2 = el.b(true);
                  break L0;
                }
              }
              stackOut_2_0 = (mf) Class.forName("ue").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        fm stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        fm stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
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
        fm stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        fm stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        fm stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        int stackIn_17_8 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        fm stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        fm stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        fm stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        int stackOut_15_8 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        fm stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        fm stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        fm stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        var5 = param3 + ((el) this).field_y;
        var6 = param1 + ((el) this).field_i;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          if (param0 != -2) {
            L0: {
              String discarded$3 = ((el) this).d((byte) 56);
              if (!((el) this).field_K) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_12_0 = -((el) this).field_L + ((el) this).field_n - ((el) this).field_I * 2;
                stackIn_14_0 = stackOut_12_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_14_0;
              stackOut_14_0 = ((el) this).field_G;
              stackOut_14_1 = ((el) this).field_J;
              stackOut_14_2 = ((el) this).field_I + (var7 + var5);
              stackOut_14_3 = ((el) this).field_I + var6;
              stackOut_14_4 = -((el) this).field_I + ((el) this).field_L;
              stackOut_14_5 = -(2 * ((el) this).field_I) + ((el) this).field_w;
              stackOut_14_6 = ((el) this).field_F;
              stackOut_14_7 = -1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_16_3 = stackOut_14_3;
              stackIn_16_4 = stackOut_14_4;
              stackIn_16_5 = stackOut_14_5;
              stackIn_16_6 = stackOut_14_6;
              stackIn_16_7 = stackOut_14_7;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              stackIn_15_3 = stackOut_14_3;
              stackIn_15_4 = stackOut_14_4;
              stackIn_15_5 = stackOut_14_5;
              stackIn_15_6 = stackOut_14_6;
              stackIn_15_7 = stackOut_14_7;
              if (!((el) this).field_K) {
                stackOut_16_0 = (fm) (Object) stackIn_16_0;
                stackOut_16_1 = (String) (Object) stackIn_16_1;
                stackOut_16_2 = stackIn_16_2;
                stackOut_16_3 = stackIn_16_3;
                stackOut_16_4 = stackIn_16_4;
                stackOut_16_5 = stackIn_16_5;
                stackOut_16_6 = stackIn_16_6;
                stackOut_16_7 = stackIn_16_7;
                stackOut_16_8 = 2;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                stackIn_17_4 = stackOut_16_4;
                stackIn_17_5 = stackOut_16_5;
                stackIn_17_6 = stackOut_16_6;
                stackIn_17_7 = stackOut_16_7;
                stackIn_17_8 = stackOut_16_8;
                break L1;
              } else {
                stackOut_15_0 = (fm) (Object) stackIn_15_0;
                stackOut_15_1 = (String) (Object) stackIn_15_1;
                stackOut_15_2 = stackIn_15_2;
                stackOut_15_3 = stackIn_15_3;
                stackOut_15_4 = stackIn_15_4;
                stackOut_15_5 = stackIn_15_5;
                stackOut_15_6 = stackIn_15_6;
                stackOut_15_7 = stackIn_15_7;
                stackOut_15_8 = 0;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                stackIn_17_4 = stackOut_15_4;
                stackIn_17_5 = stackOut_15_5;
                stackIn_17_6 = stackOut_15_6;
                stackIn_17_7 = stackOut_15_7;
                stackIn_17_8 = stackOut_15_8;
                break L1;
              }
            }
            int discarded$4 = ((fm) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5, stackIn_17_6, stackIn_17_7, stackIn_17_8, 1, ((el) this).field_G.field_C);
            return;
          } else {
            L2: {
              if (!((el) this).field_K) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = -((el) this).field_L + ((el) this).field_n - ((el) this).field_I * 2;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_7_0;
              stackOut_7_0 = ((el) this).field_G;
              stackOut_7_1 = ((el) this).field_J;
              stackOut_7_2 = ((el) this).field_I + (var7 + var5);
              stackOut_7_3 = ((el) this).field_I + var6;
              stackOut_7_4 = -((el) this).field_I + ((el) this).field_L;
              stackOut_7_5 = -(2 * ((el) this).field_I) + ((el) this).field_w;
              stackOut_7_6 = ((el) this).field_F;
              stackOut_7_7 = -1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_9_5 = stackOut_7_5;
              stackIn_9_6 = stackOut_7_6;
              stackIn_9_7 = stackOut_7_7;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              stackIn_8_5 = stackOut_7_5;
              stackIn_8_6 = stackOut_7_6;
              stackIn_8_7 = stackOut_7_7;
              if (!((el) this).field_K) {
                stackOut_9_0 = (fm) (Object) stackIn_9_0;
                stackOut_9_1 = (String) (Object) stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = stackIn_9_4;
                stackOut_9_5 = stackIn_9_5;
                stackOut_9_6 = stackIn_9_6;
                stackOut_9_7 = stackIn_9_7;
                stackOut_9_8 = 2;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                stackIn_10_6 = stackOut_9_6;
                stackIn_10_7 = stackOut_9_7;
                stackIn_10_8 = stackOut_9_8;
                break L3;
              } else {
                stackOut_8_0 = (fm) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = stackIn_8_6;
                stackOut_8_7 = stackIn_8_7;
                stackOut_8_8 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                stackIn_10_5 = stackOut_8_5;
                stackIn_10_6 = stackOut_8_6;
                stackIn_10_7 = stackOut_8_7;
                stackIn_10_8 = stackOut_8_8;
                break L3;
              }
            }
            int discarded$5 = ((fm) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5, stackIn_10_6, stackIn_10_7, stackIn_10_8, 1, ((el) this).field_G.field_C);
            return;
          }
        }
    }

    el(int param0, int param1, int param2, int param3, cf param4, boolean param5, int param6, int param7, fm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nl) null, (bj) null);
        ((el) this).field_I = param7;
        ((el) this).field_B = param4;
        ((el) this).field_L = param6;
        ((el) this).field_J = param10;
        ((el) this).field_G = param8;
        ((el) this).field_K = param5 ? true : false;
        ((el) this).field_F = param9;
        int var12 = -((el) this).field_I + ((el) this).field_L;
        int var13 = ((el) this).field_G.a(param10, var12, ((el) this).field_G.field_C) - -(2 * ((el) this).field_I);
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((el) this).b(param0, param1, 28972, param2, var13);
        }
        int var14 = ((el) this).field_K ? 0 : ((el) this).field_I * 2 + ((el) this).field_L;
        ((el) this).field_B.b(var14, (-param3 + var13 >> 738749601) + ((el) this).field_I, 28972, param2 + -((el) this).field_L - ((el) this).field_I * 3, -(((el) this).field_I * 2) + param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 2;
    }
}

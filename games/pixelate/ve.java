/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ak {
    static String field_Jb;
    static ak field_Ib;
    static String field_Gb;
    private StringBuilder field_Eb;
    static int field_Kb;
    private ak field_Lb;
    private ak field_Fb;
    private int field_Hb;

    public static void b(byte param0) {
        if (param0 != -70) {
            return;
        }
        field_Ib = null;
        field_Jb = null;
        field_Gb = null;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((ve) this).field_Hb == 0) {
          if (-86 == (ke.field_a ^ -1)) {
            if (-1 > (((ve) this).field_Eb.length() ^ -1)) {
              StringBuilder discarded$10 = nk.a(((ve) this).field_Eb, ((ve) this).field_Eb.length() - 1, ' ', 16736352);
              var2 = 17 / ((-8 - param0) / 50);
              if (((ve) this).field_Eb.length() >= 12) {
                if ((ke.field_a ^ -1) != -85) {
                  if (ke.field_a != 13) {
                    return true;
                  } else {
                    ((ve) this).field_Hb = 1;
                    return true;
                  }
                } else {
                  if (((ve) this).field_Eb.length() <= 0) {
                    ((ve) this).field_Hb = 1;
                    if (ke.field_a != 13) {
                      return true;
                    } else {
                      ((ve) this).field_Hb = 1;
                      return true;
                    }
                  } else {
                    ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                    ((ve) this).field_Hb = 2;
                    if (ke.field_a != 13) {
                      return true;
                    } else {
                      ((ve) this).field_Hb = 1;
                      return true;
                    }
                  }
                }
              } else {
                L0: {
                  var3 = Character.toLowerCase(nj.field_f);
                  if (var3 == 32) {
                    var3 = 95;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (var3 != 95) {
                    break L1;
                  } else {
                    if (((ve) this).field_Eb.length() <= 0) {
                      break L1;
                    } else {
                      StringBuilder discarded$11 = ((ve) this).field_Eb.append(var3);
                      break L1;
                    }
                  }
                }
                if (tk.a(-66, (char) var3)) {
                  L2: {
                    StringBuilder discarded$12 = ((ve) this).field_Eb.append(var3);
                    if ((ke.field_a ^ -1) != -85) {
                      break L2;
                    } else {
                      if (((ve) this).field_Eb.length() <= 0) {
                        ((ve) this).field_Hb = 1;
                        break L2;
                      } else {
                        ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                        ((ve) this).field_Hb = 2;
                        break L2;
                      }
                    }
                  }
                  if (ke.field_a != 13) {
                    return true;
                  } else {
                    ((ve) this).field_Hb = 1;
                    return true;
                  }
                } else {
                  if (ti.a(124, (char) var3)) {
                    StringBuilder discarded$13 = ((ve) this).field_Eb.append(var3);
                    if ((ke.field_a ^ -1) != -85) {
                      if (ke.field_a != 13) {
                        return true;
                      } else {
                        ((ve) this).field_Hb = 1;
                        return true;
                      }
                    } else {
                      if (((ve) this).field_Eb.length() <= 0) {
                        ((ve) this).field_Hb = 1;
                        if (ke.field_a != 13) {
                          return true;
                        } else {
                          ((ve) this).field_Hb = 1;
                          return true;
                        }
                      } else {
                        ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                        ((ve) this).field_Hb = 2;
                        if (ke.field_a != 13) {
                          return true;
                        } else {
                          ((ve) this).field_Hb = 1;
                          return true;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if ((ke.field_a ^ -1) != -85) {
                        break L3;
                      } else {
                        if (((ve) this).field_Eb.length() <= 0) {
                          ((ve) this).field_Hb = 1;
                          break L3;
                        } else {
                          ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                          ((ve) this).field_Hb = 2;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (ke.field_a != 13) {
                        break L4;
                      } else {
                        ((ve) this).field_Hb = 1;
                        break L4;
                      }
                    }
                    return true;
                  }
                }
              }
            } else {
              var2 = 17 / ((-8 - param0) / 50);
              if (((ve) this).field_Eb.length() >= 12) {
                if ((ke.field_a ^ -1) != -85) {
                  if (ke.field_a != 13) {
                    return true;
                  } else {
                    ((ve) this).field_Hb = 1;
                    return true;
                  }
                } else {
                  if (((ve) this).field_Eb.length() <= 0) {
                    ((ve) this).field_Hb = 1;
                    if (ke.field_a == 13) {
                      ((ve) this).field_Hb = 1;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                    ((ve) this).field_Hb = 2;
                    if (ke.field_a != 13) {
                      return true;
                    } else {
                      ((ve) this).field_Hb = 1;
                      return true;
                    }
                  }
                }
              } else {
                L5: {
                  var3 = Character.toLowerCase(nj.field_f);
                  if (var3 == 32) {
                    var3 = 95;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var3 != 95) {
                    break L6;
                  } else {
                    if (((ve) this).field_Eb.length() <= 0) {
                      break L6;
                    } else {
                      StringBuilder discarded$14 = ((ve) this).field_Eb.append(var3);
                      break L6;
                    }
                  }
                }
                if (!tk.a(-66, (char) var3)) {
                  if (!ti.a(124, (char) var3)) {
                    L7: {
                      if ((ke.field_a ^ -1) != -85) {
                        break L7;
                      } else {
                        if (((ve) this).field_Eb.length() <= 0) {
                          ((ve) this).field_Hb = 1;
                          break L7;
                        } else {
                          ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                          ((ve) this).field_Hb = 2;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (ke.field_a != 13) {
                        break L8;
                      } else {
                        ((ve) this).field_Hb = 1;
                        break L8;
                      }
                    }
                    return true;
                  } else {
                    L9: {
                      StringBuilder discarded$15 = ((ve) this).field_Eb.append(var3);
                      if ((ke.field_a ^ -1) != -85) {
                        break L9;
                      } else {
                        if (((ve) this).field_Eb.length() <= 0) {
                          ((ve) this).field_Hb = 1;
                          break L9;
                        } else {
                          ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                          ((ve) this).field_Hb = 2;
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (ke.field_a != 13) {
                        break L10;
                      } else {
                        ((ve) this).field_Hb = 1;
                        break L10;
                      }
                    }
                    return true;
                  }
                } else {
                  L11: {
                    StringBuilder discarded$16 = ((ve) this).field_Eb.append(var3);
                    if ((ke.field_a ^ -1) != -85) {
                      break L11;
                    } else {
                      if (((ve) this).field_Eb.length() <= 0) {
                        ((ve) this).field_Hb = 1;
                        break L11;
                      } else {
                        ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                        ((ve) this).field_Hb = 2;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (ke.field_a != 13) {
                      break L12;
                    } else {
                      ((ve) this).field_Hb = 1;
                      break L12;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            var2 = 17 / ((-8 - param0) / 50);
            if (((ve) this).field_Eb.length() >= 12) {
              if ((ke.field_a ^ -1) != -85) {
                if (ke.field_a == 13) {
                  ((ve) this).field_Hb = 1;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (((ve) this).field_Eb.length() > 0) {
                  L13: {
                    ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                    ((ve) this).field_Hb = 2;
                    if (ke.field_a != 13) {
                      break L13;
                    } else {
                      ((ve) this).field_Hb = 1;
                      break L13;
                    }
                  }
                  return true;
                } else {
                  L14: {
                    ((ve) this).field_Hb = 1;
                    if (ke.field_a != 13) {
                      break L14;
                    } else {
                      ((ve) this).field_Hb = 1;
                      break L14;
                    }
                  }
                  return true;
                }
              }
            } else {
              L15: {
                var3 = Character.toLowerCase(nj.field_f);
                if (var3 == 32) {
                  var3 = 95;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (var3 != 95) {
                  break L16;
                } else {
                  if (((ve) this).field_Eb.length() <= 0) {
                    break L16;
                  } else {
                    StringBuilder discarded$17 = ((ve) this).field_Eb.append(var3);
                    break L16;
                  }
                }
              }
              if (!tk.a(-66, (char) var3)) {
                if (!ti.a(124, (char) var3)) {
                  L17: {
                    if ((ke.field_a ^ -1) != -85) {
                      break L17;
                    } else {
                      if (((ve) this).field_Eb.length() <= 0) {
                        ((ve) this).field_Hb = 1;
                        break L17;
                      } else {
                        ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                        ((ve) this).field_Hb = 2;
                        break L17;
                      }
                    }
                  }
                  if (ke.field_a == 13) {
                    ((ve) this).field_Hb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  L18: {
                    StringBuilder discarded$18 = ((ve) this).field_Eb.append(var3);
                    if ((ke.field_a ^ -1) != -85) {
                      break L18;
                    } else {
                      if (((ve) this).field_Eb.length() <= 0) {
                        ((ve) this).field_Hb = 1;
                        break L18;
                      } else {
                        ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                        ((ve) this).field_Hb = 2;
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (ke.field_a != 13) {
                      break L19;
                    } else {
                      ((ve) this).field_Hb = 1;
                      break L19;
                    }
                  }
                  return true;
                }
              } else {
                L20: {
                  StringBuilder discarded$19 = ((ve) this).field_Eb.append(var3);
                  if ((ke.field_a ^ -1) != -85) {
                    break L20;
                  } else {
                    if (((ve) this).field_Eb.length() <= 0) {
                      ((ve) this).field_Hb = 1;
                      break L20;
                    } else {
                      ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                      ((ve) this).field_Hb = 2;
                      break L20;
                    }
                  }
                }
                L21: {
                  if (ke.field_a != 13) {
                    break L21;
                  } else {
                    ((ve) this).field_Hb = 1;
                    break L21;
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static tf[] a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        tf var9 = null;
        tf var10 = null;
        tf var11 = null;
        int[] var12 = null;
        int[] var15 = null;
        int[] var16 = null;
        tf var17 = null;
        tf var18 = null;
        int[] var19 = null;
        tf var20 = null;
        tf var21 = null;
        int[] var22 = null;
        var22 = t.field_k;
        var19 = var22;
        var16 = var19;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = t.field_j;
        var8 = t.field_d;
        var9 = new tf(16, param3);
        var9.c();
        if (!param4) {
          L0: {
            field_Kb = 20;
            t.g(0, 0, 16, param3, param5, param2);
            var10 = null;
            if (param0) {
              var17 = var9.a();
              var10 = var17;
              var17.c();
              t.b(0, 0, 5, 0);
              t.b(0, 1, 3, 0);
              t.b(0, 2, 2, 0);
              t.b(0, 3, 1, 0);
              t.b(0, 4, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var11 = null;
            if (param1) {
              var18 = var9.a();
              var11 = var18;
              var18.c();
              t.b(11, 0, 5, 0);
              t.b(13, 1, 3, 0);
              t.b(14, 2, 2, 0);
              t.b(15, 3, 1, 0);
              t.b(15, 4, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          t.a(var22, var7, var8);
          return new tf[]{null, null, null, var10, var9, var11, null, null, null};
        } else {
          L2: {
            t.g(0, 0, 16, param3, param5, param2);
            var10 = null;
            if (param0) {
              var20 = var9.a();
              var10 = var20;
              var20.c();
              t.b(0, 0, 5, 0);
              t.b(0, 1, 3, 0);
              t.b(0, 2, 2, 0);
              t.b(0, 3, 1, 0);
              t.b(0, 4, 1, 0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var11 = null;
            if (param1) {
              var21 = var9.a();
              var11 = var21;
              var21.c();
              t.b(11, 0, 5, 0);
              t.b(13, 1, 3, 0);
              t.b(14, 2, 2, 0);
              t.b(15, 3, 1, 0);
              t.b(15, 4, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          t.a(var22, var7, var8);
          return new tf[]{null, null, null, var10, var9, var11, null, null, null};
        }
    }

    final int b(int param0, boolean param1) {
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        ((ve) this).a(-28476, param1);
        if (param0 < -92) {
          if (!param1) {
            ((ve) this).field_Lb.field_cb = ((ve) this).field_Eb.toString();
            if (param1) {
              if (nm.field_c != 0) {
                if (((ve) this).field_P == 0) {
                  ((ve) this).field_Hb = 1;
                  return ((ve) this).field_Hb;
                } else {
                  return ((ve) this).field_Hb;
                }
              } else {
                return ((ve) this).field_Hb;
              }
            } else {
              return ((ve) this).field_Hb;
            }
          } else {
            L0: while (true) {
              if (bh.b((byte) 108)) {
                L1: {
                  if (-86 != ke.field_a) {
                    break L1;
                  } else {
                    if (-1 > (((ve) this).field_Eb.length() ^ -1)) {
                      StringBuilder discarded$5 = nk.a(((ve) this).field_Eb, -1 + ((ve) this).field_Eb.length(), ' ', 16736352);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (aq.a(nj.field_f, (CharSequence) (Object) ((ve) this).field_Eb, (byte) -117)) {
                    StringBuilder discarded$6 = ((ve) this).field_Eb.append(nj.field_f);
                    break L2;
                  } else {
                    L3: {
                      if (((ve) this).field_Eb.length() != 0) {
                        break L3;
                      } else {
                        if (nj.field_f == 91) {
                          StringBuilder discarded$7 = ((ve) this).field_Eb.append(nj.field_f);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (-2 != (((ve) this).field_Eb.length() ^ -1)) {
                        break L4;
                      } else {
                        if (nj.field_f == 35) {
                          StringBuilder discarded$8 = ((ve) this).field_Eb.append(nj.field_f);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (nj.field_f != 93) {
                      break L2;
                    } else {
                      StringBuilder discarded$9 = ((ve) this).field_Eb.append(nj.field_f);
                      break L2;
                    }
                  }
                }
                if (84 != ke.field_a) {
                  if (13 == ke.field_a) {
                    return 1;
                  } else {
                    continue L0;
                  }
                } else {
                  if ((((ve) this).field_Eb.length() ^ -1) < -1) {
                    ((ve) this).field_cb = ((ve) this).field_Eb.toString();
                    return 2;
                  } else {
                    return 1;
                  }
                }
              } else {
                ((ve) this).field_Lb.field_cb = ((ve) this).field_Eb.toString();
                if (nm.field_c != 0) {
                  if (((ve) this).field_P == -1) {
                    ((ve) this).field_Hb = 1;
                    return ((ve) this).field_Hb;
                  } else {
                    return ((ve) this).field_Hb;
                  }
                } else {
                  return ((ve) this).field_Hb;
                }
              }
            }
          }
        } else {
          return 124;
        }
    }

    ve(int param0, int param1, int param2, int param3, String param4, ak param5, ak param6, ak param7) {
        super(0L, param5);
        ((ve) this).field_Hb = 0;
        ((ve) this).field_Fb = new ak(0L, param6, param4);
        ((ve) this).a(((ve) this).field_Fb, (byte) 26);
        ((ve) this).field_Lb = new ak(0L, param7);
        ((ve) this).field_Lb.field_N = 16764006;
        ((ve) this).a(((ve) this).field_Lb, (byte) 26);
        ((ve) this).field_Lb.field_qb = "|";
        ((ve) this).field_Eb = new StringBuilder(12);
        int var9 = ((ve) this).field_Fb.g(0);
        ((ve) this).field_Fb.a(3, fq.field_q, 5, 256, var9);
        ((ve) this).field_Lb.a(3 - -fq.field_q, fq.field_q, 5, 256, var9);
        int var10 = var9 + 10;
        int var11 = 6 + 2 * fq.field_q;
        int var12 = ui.a(param2, param0, var10, (byte) -1);
        int var13 = pj.a(var11, param1, param3, (byte) 67);
        ((ve) this).a(var13, var11, var12, 256, var10);
    }

    final static void j(int param0) {
        cd.field_e = new String[d.field_b];
        cd.field_e[17] = ap.field_i;
        cd.field_e[20] = sh.field_c;
        cd.field_e[21] = nk.field_g;
        cd.field_e[5] = wf.field_a;
        cd.field_e[18] = gp.field_Eb;
        cd.field_e[15] = dq.field_d;
        cd.field_e[7] = uc.field_m;
        cd.field_e[19] = nk.field_h;
        cd.field_e[4] = ch.field_G;
        if (param0 != 1565) {
          return;
        } else {
          cd.field_e[11] = nj.field_d;
          cd.field_e[13] = no.field_n;
          cd.field_e[9] = ke.field_c;
          cd.field_e[6] = ae.field_j;
          cd.field_e[16] = w.field_u;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Withdraw request to join <%0>'s game";
        field_Gb = "You have withdrawn your request to join.";
    }
}

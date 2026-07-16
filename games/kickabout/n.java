/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private bi field_g;
    private iw field_i;
    static qv field_e;
    static String[] field_f;
    static int field_m;
    private eb field_h;
    private java.math.BigInteger field_b;
    private java.math.BigInteger field_l;
    static String field_j;
    static boolean field_c;
    private wm[] field_k;
    static int field_d;
    private ui field_a;

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != -2147483648) {
            n.a(-8, 21, -15);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static String a(char param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var12 = Kickabout.field_G;
        var4 = param3.length();
        var5 = param1.length();
        var6 = var4;
        var7 = -1 + var5;
        if (-1 != (var7 ^ -1)) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param3.indexOf((int) param0, var8_int);
            if (0 <= var8_int) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              var10 = 4 % ((-69 - param2) / 54);
              var14 = new StringBuilder(var6);
              var8 = var14;
              var9 = 0;
              L1: while (true) {
                var11 = param3.indexOf((int) param0, var9);
                if (0 > var11) {
                  StringBuilder discarded$6 = var14.append(param3.substring(var9));
                  return var14.toString();
                } else {
                  StringBuilder discarded$7 = var14.append(param3.substring(var9, var11));
                  StringBuilder discarded$8 = var14.append(param1);
                  var9 = 1 + var11;
                  continue L1;
                }
              }
            }
          }
        } else {
          var10 = 4 % ((-69 - param2) / 54);
          var13 = new StringBuilder(var6);
          var9 = 0;
          L2: while (true) {
            var11 = param3.indexOf((int) param0, var9);
            if (0 > var11) {
              StringBuilder discarded$9 = var13.append(param3.substring(var9));
              return var13.toString();
            } else {
              StringBuilder discarded$10 = var13.append(param3.substring(var9, var11));
              StringBuilder discarded$11 = var13.append(param1);
              var9 = 1 + var11;
              continue L2;
            }
          }
        }
    }

    n(bi param0, eb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final wm a(qh param0, int param1, int param2, boolean param3, qh param4) {
        if (((n) this).field_i == null) {
            throw new RuntimeException();
        }
        if (-1 < (param2 ^ -1)) {
            throw new RuntimeException();
        }
        if (param2 >= ((n) this).field_k.length) {
            throw new RuntimeException();
        }
        if (!(null == ((n) this).field_k[param2])) {
            return ((n) this).field_k[param2];
        }
        ((n) this).field_i.field_n = param2 * 72 + 6;
        int var6 = ((n) this).field_i.k(4);
        int var7 = ((n) this).field_i.k(4);
        byte[] var14 = new byte[64];
        ((n) this).field_i.a(var14, 0, (byte) -6, 64);
        int var10 = -31 / ((param1 - 39) / 51);
        wm var9 = new wm(param2, param0, param4, ((n) this).field_g, ((n) this).field_h, var6, var14, var7, param3);
        ((n) this).field_k[param2] = var9;
        return var9;
    }

    final static void a(int param0, String param1) {
        jw.field_Cb.field_E = param1;
        qv.field_f = true;
        int var2 = ea.field_f.field_a;
        int var3 = ea.field_f.field_e;
        int var4 = 59 % ((param0 - -57) / 43);
        int var5 = jw.field_Cb.field_X.c(param1, 272, jw.field_Cb.field_xb);
        int var6 = -103 + var3 / 2 + -(var5 / 2);
        kk.field_j.a(true, 320, (-320 + var2) / 2, var6, -120 + (var3 - 2 * var6));
        kk.field_j.field_R = fs.a(kk.field_j.field_mb, 3, 2105376, 11579568, 8421504, (byte) 126);
        jw.field_Cb.a(true, -24 + kk.field_j.field_q - 24, 24, 16, -24 + (-20 + kk.field_j.field_mb));
        ao.field_a.a(true, 80, 120, -20 + kk.field_j.field_mb + -24, 24);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Kickabout.field_G;
        if (((n) this).field_k == null) {
          return;
        } else {
          var2 = param0;
          L0: while (true) {
            if (((n) this).field_k.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((n) this).field_k.length <= var4) {
                  return;
                } else {
                  if (null != ((n) this).field_k[var4]) {
                    ((n) this).field_k[var4].b(-44);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((n) this).field_k[var2] != null) {
                ((n) this).field_k[var2].d(18137);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        Object var4 = null;
        if (null != oo.field_e) {
          if (param1 > oo.field_e.length) {
            L0: {
              L1: {
                oo.field_e = new int[param1 * 2];
                if (bl.field_m == null) {
                  break L1;
                } else {
                  if (bl.field_m.length < param1) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              bl.field_m = new int[2 * param1];
              break L0;
            }
            L2: {
              if (param0 == -20669) {
                break L2;
              } else {
                var4 = null;
                String discarded$3 = n.a('[', (String) null, (byte) 89, (String) null);
                break L2;
              }
            }
            L3: {
              L4: {
                if (qp.field_G == null) {
                  break L4;
                } else {
                  if (param1 <= qp.field_G.length) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              qp.field_G = new int[param1 * 2];
              break L3;
            }
            L5: {
              if (null == fo.field_j) {
                break L5;
              } else {
                if (param1 <= fo.field_j.length) {
                  L6: {
                    L7: {
                      if (ln.field_B == null) {
                        break L7;
                      } else {
                        if (ln.field_B.length < param1) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ln.field_B = new int[2 * param1];
                    break L6;
                  }
                  if (null == w.field_a) {
                    w.field_a = new int[param1 * 2];
                    if (pf.field_d == null) {
                      L8: {
                        pf.field_d = new int[(param2 + param1) * 2];
                        if (null == ug.field_f) {
                          break L8;
                        } else {
                          if (ug.field_f.length >= param1) {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            break L8;
                          }
                        }
                      }
                      ug.field_f = new boolean[2 * param1];
                      kt.field_g = -2147483648;
                      lm.field_V = -2147483648;
                      er.field_k = 2147483647;
                      vi.field_s = 2147483647;
                      wf.field_O = 0;
                      return;
                    } else {
                      if (param2 + param1 <= pf.field_d.length) {
                        if (null == ug.field_f) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          if (ug.field_f.length < param1) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          }
                        }
                      } else {
                        L9: {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            break L9;
                          } else {
                            if (ug.field_f.length >= param1) {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      }
                    }
                  } else {
                    if (param1 <= w.field_a.length) {
                      if (pf.field_d == null) {
                        pf.field_d = new int[(param2 + param1) * 2];
                        if (null == ug.field_f) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          if (ug.field_f.length < param1) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          }
                        }
                      } else {
                        if (param2 + param1 <= pf.field_d.length) {
                          if (null == ug.field_f) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            if (ug.field_f.length < param1) {
                              ug.field_f = new boolean[2 * param1];
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            }
                          }
                        } else {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            if (ug.field_f.length < param1) {
                              ug.field_f = new boolean[2 * param1];
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L10: {
                        L11: {
                          w.field_a = new int[param1 * 2];
                          if (pf.field_d == null) {
                            break L11;
                          } else {
                            if (param2 + param1 <= pf.field_d.length) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        pf.field_d = new int[(param2 + param1) * 2];
                        break L10;
                      }
                      if (null == ug.field_f) {
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      } else {
                        if (ug.field_f.length < param1) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L12: {
              L13: {
                fo.field_j = new int[2 * param1];
                if (ln.field_B == null) {
                  break L13;
                } else {
                  if (ln.field_B.length < param1) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              ln.field_B = new int[2 * param1];
              break L12;
            }
            L14: {
              L15: {
                if (null == w.field_a) {
                  break L15;
                } else {
                  if (param1 <= w.field_a.length) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              w.field_a = new int[param1 * 2];
              break L14;
            }
            L16: {
              L17: {
                if (pf.field_d == null) {
                  break L17;
                } else {
                  if (param2 + param1 <= pf.field_d.length) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              pf.field_d = new int[(param2 + param1) * 2];
              break L16;
            }
            L18: {
              if (null == ug.field_f) {
                break L18;
              } else {
                if (ug.field_f.length >= param1) {
                  kt.field_g = -2147483648;
                  lm.field_V = -2147483648;
                  er.field_k = 2147483647;
                  vi.field_s = 2147483647;
                  wf.field_O = 0;
                  return;
                } else {
                  break L18;
                }
              }
            }
            ug.field_f = new boolean[2 * param1];
            kt.field_g = -2147483648;
            lm.field_V = -2147483648;
            er.field_k = 2147483647;
            vi.field_s = 2147483647;
            wf.field_O = 0;
            return;
          } else {
            L19: {
              L20: {
                if (bl.field_m == null) {
                  break L20;
                } else {
                  if (bl.field_m.length < param1) {
                    break L20;
                  } else {
                    break L19;
                  }
                }
              }
              bl.field_m = new int[2 * param1];
              break L19;
            }
            L21: {
              if (param0 == -20669) {
                break L21;
              } else {
                var4 = null;
                String discarded$4 = n.a('[', (String) null, (byte) 89, (String) null);
                break L21;
              }
            }
            L22: {
              L23: {
                if (qp.field_G == null) {
                  break L23;
                } else {
                  if (param1 <= qp.field_G.length) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              qp.field_G = new int[param1 * 2];
              break L22;
            }
            L24: {
              if (null == fo.field_j) {
                break L24;
              } else {
                if (param1 <= fo.field_j.length) {
                  L25: {
                    L26: {
                      if (ln.field_B == null) {
                        break L26;
                      } else {
                        if (ln.field_B.length < param1) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    ln.field_B = new int[2 * param1];
                    break L25;
                  }
                  if (null == w.field_a) {
                    L27: {
                      L28: {
                        w.field_a = new int[param1 * 2];
                        if (pf.field_d == null) {
                          break L28;
                        } else {
                          if (param2 + param1 <= pf.field_d.length) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      pf.field_d = new int[(param2 + param1) * 2];
                      break L27;
                    }
                    L29: {
                      if (null == ug.field_f) {
                        break L29;
                      } else {
                        if (ug.field_f.length >= param1) {
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          break L29;
                        }
                      }
                    }
                    ug.field_f = new boolean[2 * param1];
                    kt.field_g = -2147483648;
                    lm.field_V = -2147483648;
                    er.field_k = 2147483647;
                    vi.field_s = 2147483647;
                    wf.field_O = 0;
                    return;
                  } else {
                    if (param1 <= w.field_a.length) {
                      if (pf.field_d == null) {
                        L30: {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            break L30;
                          } else {
                            if (ug.field_f.length >= param1) {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              break L30;
                            }
                          }
                        }
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      } else {
                        if (param2 + param1 <= pf.field_d.length) {
                          if (null == ug.field_f) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            if (ug.field_f.length < param1) {
                              ug.field_f = new boolean[2 * param1];
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            }
                          }
                        } else {
                          L31: {
                            pf.field_d = new int[(param2 + param1) * 2];
                            if (null == ug.field_f) {
                              break L31;
                            } else {
                              if (ug.field_f.length >= param1) {
                                kt.field_g = -2147483648;
                                lm.field_V = -2147483648;
                                er.field_k = 2147483647;
                                vi.field_s = 2147483647;
                                wf.field_O = 0;
                                return;
                              } else {
                                break L31;
                              }
                            }
                          }
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        }
                      }
                    } else {
                      L32: {
                        L33: {
                          w.field_a = new int[param1 * 2];
                          if (pf.field_d == null) {
                            break L33;
                          } else {
                            if (param2 + param1 <= pf.field_d.length) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        pf.field_d = new int[(param2 + param1) * 2];
                        break L32;
                      }
                      L34: {
                        if (null == ug.field_f) {
                          break L34;
                        } else {
                          if (ug.field_f.length >= param1) {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            break L34;
                          }
                        }
                      }
                      ug.field_f = new boolean[2 * param1];
                      kt.field_g = -2147483648;
                      lm.field_V = -2147483648;
                      er.field_k = 2147483647;
                      vi.field_s = 2147483647;
                      wf.field_O = 0;
                      return;
                    }
                  }
                } else {
                  break L24;
                }
              }
            }
            L35: {
              L36: {
                fo.field_j = new int[2 * param1];
                if (ln.field_B == null) {
                  break L36;
                } else {
                  if (ln.field_B.length < param1) {
                    break L36;
                  } else {
                    break L35;
                  }
                }
              }
              ln.field_B = new int[2 * param1];
              break L35;
            }
            L37: {
              L38: {
                if (null == w.field_a) {
                  break L38;
                } else {
                  if (param1 <= w.field_a.length) {
                    break L37;
                  } else {
                    break L38;
                  }
                }
              }
              w.field_a = new int[param1 * 2];
              break L37;
            }
            L39: {
              L40: {
                if (pf.field_d == null) {
                  break L40;
                } else {
                  if (param2 + param1 <= pf.field_d.length) {
                    break L39;
                  } else {
                    break L40;
                  }
                }
              }
              pf.field_d = new int[(param2 + param1) * 2];
              break L39;
            }
            L41: {
              if (null == ug.field_f) {
                break L41;
              } else {
                if (ug.field_f.length >= param1) {
                  kt.field_g = -2147483648;
                  lm.field_V = -2147483648;
                  er.field_k = 2147483647;
                  vi.field_s = 2147483647;
                  wf.field_O = 0;
                  return;
                } else {
                  break L41;
                }
              }
            }
            ug.field_f = new boolean[2 * param1];
            kt.field_g = -2147483648;
            lm.field_V = -2147483648;
            er.field_k = 2147483647;
            vi.field_s = 2147483647;
            wf.field_O = 0;
            return;
          }
        } else {
          L42: {
            L43: {
              oo.field_e = new int[param1 * 2];
              if (bl.field_m == null) {
                break L43;
              } else {
                if (bl.field_m.length < param1) {
                  break L43;
                } else {
                  break L42;
                }
              }
            }
            bl.field_m = new int[2 * param1];
            break L42;
          }
          L44: {
            if (param0 == -20669) {
              break L44;
            } else {
              var4 = null;
              String discarded$5 = n.a('[', (String) null, (byte) 89, (String) null);
              break L44;
            }
          }
          L45: {
            L46: {
              if (qp.field_G == null) {
                break L46;
              } else {
                if (param1 <= qp.field_G.length) {
                  break L45;
                } else {
                  break L46;
                }
              }
            }
            qp.field_G = new int[param1 * 2];
            break L45;
          }
          L47: {
            if (null == fo.field_j) {
              break L47;
            } else {
              if (param1 <= fo.field_j.length) {
                L48: {
                  L49: {
                    if (ln.field_B == null) {
                      break L49;
                    } else {
                      if (ln.field_B.length < param1) {
                        break L49;
                      } else {
                        break L48;
                      }
                    }
                  }
                  ln.field_B = new int[2 * param1];
                  break L48;
                }
                if (null == w.field_a) {
                  L50: {
                    L51: {
                      w.field_a = new int[param1 * 2];
                      if (pf.field_d == null) {
                        break L51;
                      } else {
                        if (param2 + param1 <= pf.field_d.length) {
                          break L50;
                        } else {
                          break L51;
                        }
                      }
                    }
                    pf.field_d = new int[(param2 + param1) * 2];
                    break L50;
                  }
                  L52: {
                    if (null == ug.field_f) {
                      break L52;
                    } else {
                      if (ug.field_f.length >= param1) {
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      } else {
                        break L52;
                      }
                    }
                  }
                  ug.field_f = new boolean[2 * param1];
                  kt.field_g = -2147483648;
                  lm.field_V = -2147483648;
                  er.field_k = 2147483647;
                  vi.field_s = 2147483647;
                  wf.field_O = 0;
                  return;
                } else {
                  if (param1 <= w.field_a.length) {
                    if (pf.field_d == null) {
                      L53: {
                        pf.field_d = new int[(param2 + param1) * 2];
                        if (null == ug.field_f) {
                          break L53;
                        } else {
                          if (ug.field_f.length >= param1) {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            break L53;
                          }
                        }
                      }
                      ug.field_f = new boolean[2 * param1];
                      kt.field_g = -2147483648;
                      lm.field_V = -2147483648;
                      er.field_k = 2147483647;
                      vi.field_s = 2147483647;
                      wf.field_O = 0;
                      return;
                    } else {
                      if (param2 + param1 <= pf.field_d.length) {
                        if (null == ug.field_f) {
                          ug.field_f = new boolean[2 * param1];
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          if (ug.field_f.length < param1) {
                            ug.field_f = new boolean[2 * param1];
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          } else {
                            kt.field_g = -2147483648;
                            lm.field_V = -2147483648;
                            er.field_k = 2147483647;
                            vi.field_s = 2147483647;
                            wf.field_O = 0;
                            return;
                          }
                        }
                      } else {
                        L54: {
                          pf.field_d = new int[(param2 + param1) * 2];
                          if (null == ug.field_f) {
                            break L54;
                          } else {
                            if (ug.field_f.length >= param1) {
                              kt.field_g = -2147483648;
                              lm.field_V = -2147483648;
                              er.field_k = 2147483647;
                              vi.field_s = 2147483647;
                              wf.field_O = 0;
                              return;
                            } else {
                              break L54;
                            }
                          }
                        }
                        ug.field_f = new boolean[2 * param1];
                        kt.field_g = -2147483648;
                        lm.field_V = -2147483648;
                        er.field_k = 2147483647;
                        vi.field_s = 2147483647;
                        wf.field_O = 0;
                        return;
                      }
                    }
                  } else {
                    L55: {
                      L56: {
                        w.field_a = new int[param1 * 2];
                        if (pf.field_d == null) {
                          break L56;
                        } else {
                          if (param2 + param1 <= pf.field_d.length) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                      pf.field_d = new int[(param2 + param1) * 2];
                      break L55;
                    }
                    L57: {
                      if (null == ug.field_f) {
                        break L57;
                      } else {
                        if (ug.field_f.length >= param1) {
                          kt.field_g = -2147483648;
                          lm.field_V = -2147483648;
                          er.field_k = 2147483647;
                          vi.field_s = 2147483647;
                          wf.field_O = 0;
                          return;
                        } else {
                          break L57;
                        }
                      }
                    }
                    ug.field_f = new boolean[2 * param1];
                    kt.field_g = -2147483648;
                    lm.field_V = -2147483648;
                    er.field_k = 2147483647;
                    vi.field_s = 2147483647;
                    wf.field_O = 0;
                    return;
                  }
                }
              } else {
                break L47;
              }
            }
          }
          L58: {
            L59: {
              fo.field_j = new int[2 * param1];
              if (ln.field_B == null) {
                break L59;
              } else {
                if (ln.field_B.length < param1) {
                  break L59;
                } else {
                  break L58;
                }
              }
            }
            ln.field_B = new int[2 * param1];
            break L58;
          }
          L60: {
            L61: {
              if (null == w.field_a) {
                break L61;
              } else {
                if (param1 <= w.field_a.length) {
                  break L60;
                } else {
                  break L61;
                }
              }
            }
            w.field_a = new int[param1 * 2];
            break L60;
          }
          L62: {
            L63: {
              if (pf.field_d == null) {
                break L63;
              } else {
                if (param2 + param1 <= pf.field_d.length) {
                  break L62;
                } else {
                  break L63;
                }
              }
            }
            pf.field_d = new int[(param2 + param1) * 2];
            break L62;
          }
          L64: {
            if (null == ug.field_f) {
              break L64;
            } else {
              if (ug.field_f.length >= param1) {
                kt.field_g = -2147483648;
                lm.field_V = -2147483648;
                er.field_k = 2147483647;
                vi.field_s = 2147483647;
                wf.field_O = 0;
                return;
              } else {
                break L64;
              }
            }
          }
          ug.field_f = new boolean[2 * param1];
          kt.field_g = -2147483648;
          lm.field_V = -2147483648;
          er.field_k = 2147483647;
          vi.field_s = 2147483647;
          wf.field_O = 0;
          return;
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        iw var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var8 = Kickabout.field_G;
        if (((n) this).field_i == null) {
          L0: {
            if (((n) this).field_a == null) {
              if (!((n) this).field_g.a(25533)) {
                ((n) this).field_a = ((n) this).field_g.a(255, 255, (byte) 0, (byte) 89, true);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((n) this).field_a.field_p) {
            var10 = new iw(((n) this).field_a.b(param0 ^ -12847));
            var10.field_n = 5;
            var3 = var10.h((byte) -116);
            var10.field_n = var10.field_n + 72 * var3;
            var18 = new byte[var10.field_f.length + -var10.field_n];
            var14 = var18;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            if (param0 == -45) {
              L1: {
                var10.a(var4, 0, (byte) -6, var18.length);
                if (((n) this).field_b == null) {
                  var5 = var4;
                  break L1;
                } else {
                  if (((n) this).field_l != null) {
                    var12 = new java.math.BigInteger(var18);
                    var7_ref_java_math_BigInteger = var12.modPow(((n) this).field_b, ((n) this).field_l);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  } else {
                    var19 = var4;
                    var15 = var19;
                    var5 = var15;
                    if (-66 == (var19.length ^ -1)) {
                      var20 = jj.a(-5 + var10.field_n + -var18.length, var10.field_f, (byte) 122, 5);
                      var7 = 0;
                      L2: while (true) {
                        if (-65 < (var7 ^ -1)) {
                          if (var5[var7 - -1] == var20[var7]) {
                            var7++;
                            continue L2;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          ((n) this).field_k = new wm[var3];
                          ((n) this).field_i = var10;
                          return true;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              if (-66 == (var5.length ^ -1)) {
                var21 = jj.a(-5 + var10.field_n + -var18.length, var10.field_f, (byte) 122, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var5[var7 - -1] == var21[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    ((n) this).field_k = new wm[var3];
                    ((n) this).field_i = var10;
                    return true;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        if (null == mr.field_Z) {
            return false;
        }
        if (null == mr.field_Z.h((byte) 18)) {
            return false;
        }
        return true;
    }

    private n(bi param0, eb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((n) this).field_h = param1;
        ((n) this).field_l = param3;
        ((n) this).field_b = param2;
        ((n) this).field_g = param0;
        if (!((n) this).field_g.a(25533)) {
            ((n) this).field_a = ((n) this).field_g.a(255, 255, (byte) 0, (byte) 89, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_f = new String[100];
        field_j = "Options";
        field_d = -1;
    }
}

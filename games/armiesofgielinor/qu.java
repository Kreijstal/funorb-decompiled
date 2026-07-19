/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qu extends tc {
    static String field_r;
    static String field_n;
    static ru[] field_k;
    static int field_p;
    byte[] field_m;
    int field_o;
    static boolean field_q;
    long field_l;
    static String[] field_s;

    final static void e(int param0) {
        if (iu.field_h) {
            e.a((byte) -93);
            if (param0 == -3) {
                return;
            }
            field_q = false;
            return;
        }
        if (param0 != -3) {
            field_q = false;
            return;
        }
    }

    final static String a(int param0, byte param1) {
        String discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ic var10 = null;
        ic var11 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var10 = rd.field_j;
        var11 = var10;
        if (var11 != null) {
          if (param0 >= 0) {
            if (var11.field_xb.field_W >= param0) {
              var11.field_xb.b(10001, param0, false);
              kw.field_R = 2297;
              cg.field_j = 72584621;
              wr.field_L = 224;
              ii.field_b = 4452;
              var3 = var10.field_xb.field_mb[var10.field_q];
              var4 = var10.field_xb.field_zb[var10.field_q];
              hc.field_b = hc.field_b + 1;
              hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
              if (param1 <= 31) {
                L0: {
                  discarded$1 = qu.a(-2, (byte) 45);
                  hc.field_b = Math.abs(hc.field_b);
                  var5 = var3 + 0;
                  var6 = var4 - 0;
                  var7 = hc.field_b % 4;
                  var8 = var7;
                  if (0 == var8) {
                    kw.field_R = kw.field_R - var6;
                    ii.field_b = ii.field_b - var5;
                    if (var9 == 0) {
                      break L0;
                    } else {
                      ii.field_b = ii.field_b + var6;
                      kw.field_R = kw.field_R + var5;
                      kw.field_R = kw.field_R + (var5 - var6);
                      ii.field_b = ii.field_b - (-var6 + var5);
                      throw new IllegalStateException("");
                    }
                  } else {
                    if (var8 != 1) {
                      if (-3 == (var8 ^ -1)) {
                        kw.field_R = kw.field_R + (var5 - var6);
                        if (var9 == 0) {
                          break L0;
                        } else {
                          ii.field_b = ii.field_b - (-var6 + var5);
                          throw new IllegalStateException("");
                        }
                      } else {
                        if (var8 != 3) {
                          throw new IllegalStateException("");
                        } else {
                          if (var9 == 0) {
                            ii.field_b = ii.field_b - (-var6 + var5);
                            if (var9 == 0) {
                              break L0;
                            } else {
                              throw new IllegalStateException("");
                            }
                          } else {
                            kw.field_R = kw.field_R - var6;
                            ii.field_b = ii.field_b - var5;
                            ii.field_b = ii.field_b + var6;
                            kw.field_R = kw.field_R + var5;
                            kw.field_R = kw.field_R + (var5 - var6);
                            ii.field_b = ii.field_b - (-var6 + var5);
                            throw new IllegalStateException("");
                          }
                        }
                      }
                    } else {
                      if (var9 == 0) {
                        ii.field_b = ii.field_b + var6;
                        kw.field_R = kw.field_R + var5;
                        if (var9 == 0) {
                          break L0;
                        } else {
                          kw.field_R = kw.field_R + (var5 - var6);
                          ii.field_b = ii.field_b - (-var6 + var5);
                          throw new IllegalStateException("");
                        }
                      } else {
                        if (-3 == (var8 ^ -1)) {
                          kw.field_R = kw.field_R + (var5 - var6);
                          if (var9 == 0) {
                            return "Done.";
                          } else {
                            ii.field_b = ii.field_b - (-var6 + var5);
                            throw new IllegalStateException("");
                          }
                        } else {
                          if (var8 != 3) {
                            throw new IllegalStateException("");
                          } else {
                            kw.field_R = kw.field_R - var6;
                            ii.field_b = ii.field_b - var5;
                            ii.field_b = ii.field_b + var6;
                            kw.field_R = kw.field_R + var5;
                            kw.field_R = kw.field_R + (var5 - var6);
                            ii.field_b = ii.field_b - (-var6 + var5);
                            throw new IllegalStateException("");
                          }
                        }
                      }
                    }
                  }
                }
                return "Done.";
              } else {
                hc.field_b = Math.abs(hc.field_b);
                var5 = var3 + 0;
                var6 = var4 - 0;
                var7 = hc.field_b % 4;
                var8 = var7;
                if (0 == var8) {
                  kw.field_R = kw.field_R - var6;
                  ii.field_b = ii.field_b - var5;
                  if (var9 != 0) {
                    ii.field_b = ii.field_b + var6;
                    kw.field_R = kw.field_R + var5;
                    if (var9 != 0) {
                      kw.field_R = kw.field_R + (var5 - var6);
                      ii.field_b = ii.field_b - (-var6 + var5);
                      throw new IllegalStateException("");
                    } else {
                      return "Done.";
                    }
                  } else {
                    return "Done.";
                  }
                } else {
                  if (var8 != 1) {
                    if (-3 == (var8 ^ -1)) {
                      kw.field_R = kw.field_R + (var5 - var6);
                      if (var9 != 0) {
                        ii.field_b = ii.field_b - (-var6 + var5);
                        if (var9 == 0) {
                          return "Done.";
                        } else {
                          throw new IllegalStateException("");
                        }
                      } else {
                        return "Done.";
                      }
                    } else {
                      if (var8 == 3) {
                        if (var9 == 0) {
                          ii.field_b = ii.field_b - (-var6 + var5);
                          if (var9 == 0) {
                            return "Done.";
                          } else {
                            throw new IllegalStateException("");
                          }
                        } else {
                          kw.field_R = kw.field_R - var6;
                          ii.field_b = ii.field_b - var5;
                          ii.field_b = ii.field_b + var6;
                          kw.field_R = kw.field_R + var5;
                          kw.field_R = kw.field_R + (var5 - var6);
                          ii.field_b = ii.field_b - (-var6 + var5);
                          throw new IllegalStateException("");
                        }
                      } else {
                        throw new IllegalStateException("");
                      }
                    }
                  } else {
                    if (var9 == 0) {
                      ii.field_b = ii.field_b + var6;
                      kw.field_R = kw.field_R + var5;
                      if (var9 != 0) {
                        kw.field_R = kw.field_R + (var5 - var6);
                        if (var9 != 0) {
                          ii.field_b = ii.field_b - (-var6 + var5);
                          if (var9 != 0) {
                            throw new IllegalStateException("");
                          } else {
                            return "Done.";
                          }
                        } else {
                          return "Done.";
                        }
                      } else {
                        return "Done.";
                      }
                    } else {
                      if (-3 == (var8 ^ -1)) {
                        kw.field_R = kw.field_R + (var5 - var6);
                        if (var9 != 0) {
                          ii.field_b = ii.field_b - (-var6 + var5);
                          throw new IllegalStateException("");
                        } else {
                          return "Done.";
                        }
                      } else {
                        if (var8 == 3) {
                          kw.field_R = kw.field_R - var6;
                          ii.field_b = ii.field_b - var5;
                          ii.field_b = ii.field_b + var6;
                          kw.field_R = kw.field_R + var5;
                          kw.field_R = kw.field_R + (var5 - var6);
                          ii.field_b = ii.field_b - (-var6 + var5);
                          throw new IllegalStateException("");
                        } else {
                          throw new IllegalStateException("");
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return "Please choose a player, 0-based.";
            }
          } else {
            return "Please choose a player, 0-based.";
          }
        } else {
          return "No game in progress.";
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (pp.field_R != null) {
          if (pp.field_R.length < param2) {
            L0: {
              L1: {
                pp.field_R = new int[param2 * 2];
                if (no.field_U == null) {
                  break L1;
                } else {
                  if (param2 <= no.field_U.length) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              no.field_U = new int[param2 * 2];
              break L0;
            }
            L2: {
              L3: {
                if (wp.field_w == null) {
                  break L3;
                } else {
                  if (param2 > wp.field_w.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              wp.field_w = new int[param2 * 2];
              break L2;
            }
            L4: {
              L5: {
                if (ci.field_c == null) {
                  break L5;
                } else {
                  if (param2 <= ci.field_c.length) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              ci.field_c = new int[param2 * 2];
              break L4;
            }
            L6: {
              L7: {
                if (null == pe.field_s) {
                  break L7;
                } else {
                  if (param2 <= pe.field_s.length) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              pe.field_s = new int[param2 * 2];
              break L6;
            }
            if (tb.field_h == null) {
              L8: {
                L9: {
                  tb.field_h = new int[2 * param2];
                  if (vt.field_m == null) {
                    break L9;
                  } else {
                    if (param2 + param1 <= vt.field_m.length) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                vt.field_m = new int[(param2 + param1) * 2];
                break L8;
              }
              if (cl.field_q == null) {
                cl.field_q = new boolean[2 * param2];
                kt.field_p = 0;
                if (param0 == 2) {
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                } else {
                  return;
                }
              } else {
                if (cl.field_q.length >= param2) {
                  kt.field_p = 0;
                  if (param0 == 2) {
                    pd.field_e = 2147483647;
                    sq.field_k = 2147483647;
                    df.field_T = -2147483648;
                    se.field_e = -2147483648;
                    return;
                  } else {
                    return;
                  }
                } else {
                  cl.field_q = new boolean[2 * param2];
                  kt.field_p = 0;
                  if (param0 == 2) {
                    pd.field_e = 2147483647;
                    sq.field_k = 2147483647;
                    df.field_T = -2147483648;
                    se.field_e = -2147483648;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (tb.field_h.length >= param2) {
                if (vt.field_m == null) {
                  vt.field_m = new int[(param2 + param1) * 2];
                  if (cl.field_q == null) {
                    cl.field_q = new boolean[2 * param2];
                    kt.field_p = 0;
                    if (param0 == 2) {
                      pd.field_e = 2147483647;
                      sq.field_k = 2147483647;
                      df.field_T = -2147483648;
                      se.field_e = -2147483648;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (cl.field_q.length >= param2) {
                      kt.field_p = 0;
                      if (param0 == 2) {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      if (param0 == 2) {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param2 + param1 <= vt.field_m.length) {
                    if (cl.field_q == null) {
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      if (param0 == 2) {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (cl.field_q.length >= param2) {
                        kt.field_p = 0;
                        if (param0 == 2) {
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        if (param0 == 2) {
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    vt.field_m = new int[(param2 + param1) * 2];
                    if (cl.field_q == null) {
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      if (param0 == 2) {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (cl.field_q.length >= param2) {
                        kt.field_p = 0;
                        if (param0 == 2) {
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        if (param0 == 2) {
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
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
                  L11: {
                    tb.field_h = new int[2 * param2];
                    if (vt.field_m == null) {
                      break L11;
                    } else {
                      if (param2 + param1 <= vt.field_m.length) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  vt.field_m = new int[(param2 + param1) * 2];
                  break L10;
                }
                L12: {
                  L13: {
                    if (cl.field_q == null) {
                      break L13;
                    } else {
                      if (cl.field_q.length >= param2) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  cl.field_q = new boolean[2 * param2];
                  break L12;
                }
                kt.field_p = 0;
                if (param0 == 2) {
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L14: {
              L15: {
                if (no.field_U == null) {
                  break L15;
                } else {
                  if (param2 <= no.field_U.length) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              no.field_U = new int[param2 * 2];
              break L14;
            }
            L16: {
              L17: {
                if (wp.field_w == null) {
                  break L17;
                } else {
                  if (param2 > wp.field_w.length) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
              }
              wp.field_w = new int[param2 * 2];
              break L16;
            }
            L18: {
              L19: {
                if (ci.field_c == null) {
                  break L19;
                } else {
                  if (param2 <= ci.field_c.length) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              ci.field_c = new int[param2 * 2];
              break L18;
            }
            L20: {
              L21: {
                if (null == pe.field_s) {
                  break L21;
                } else {
                  if (param2 <= pe.field_s.length) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              pe.field_s = new int[param2 * 2];
              break L20;
            }
            if (tb.field_h == null) {
              L22: {
                L23: {
                  tb.field_h = new int[2 * param2];
                  if (vt.field_m == null) {
                    break L23;
                  } else {
                    if (param2 + param1 <= vt.field_m.length) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                vt.field_m = new int[(param2 + param1) * 2];
                break L22;
              }
              L24: {
                L25: {
                  if (cl.field_q == null) {
                    break L25;
                  } else {
                    if (cl.field_q.length >= param2) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                cl.field_q = new boolean[2 * param2];
                break L24;
              }
              kt.field_p = 0;
              if (param0 == 2) {
                pd.field_e = 2147483647;
                sq.field_k = 2147483647;
                df.field_T = -2147483648;
                se.field_e = -2147483648;
                return;
              } else {
                return;
              }
            } else {
              if (tb.field_h.length >= param2) {
                if (vt.field_m == null) {
                  L26: {
                    L27: {
                      vt.field_m = new int[(param2 + param1) * 2];
                      if (cl.field_q == null) {
                        break L27;
                      } else {
                        if (cl.field_q.length >= param2) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    cl.field_q = new boolean[2 * param2];
                    break L26;
                  }
                  kt.field_p = 0;
                  if (param0 == 2) {
                    pd.field_e = 2147483647;
                    sq.field_k = 2147483647;
                    df.field_T = -2147483648;
                    se.field_e = -2147483648;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param2 + param1 <= vt.field_m.length) {
                    if (cl.field_q == null) {
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      if (param0 == 2) {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (cl.field_q.length >= param2) {
                        kt.field_p = 0;
                        if (param0 == 2) {
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        if (param0 == 2) {
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L28: {
                      L29: {
                        vt.field_m = new int[(param2 + param1) * 2];
                        if (cl.field_q == null) {
                          break L29;
                        } else {
                          if (cl.field_q.length >= param2) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      cl.field_q = new boolean[2 * param2];
                      break L28;
                    }
                    kt.field_p = 0;
                    if (param0 == 2) {
                      pd.field_e = 2147483647;
                      sq.field_k = 2147483647;
                      df.field_T = -2147483648;
                      se.field_e = -2147483648;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L30: {
                  L31: {
                    tb.field_h = new int[2 * param2];
                    if (vt.field_m == null) {
                      break L31;
                    } else {
                      if (param2 + param1 <= vt.field_m.length) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  vt.field_m = new int[(param2 + param1) * 2];
                  break L30;
                }
                L32: {
                  L33: {
                    if (cl.field_q == null) {
                      break L33;
                    } else {
                      if (cl.field_q.length >= param2) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  cl.field_q = new boolean[2 * param2];
                  break L32;
                }
                kt.field_p = 0;
                if (param0 != 2) {
                  return;
                } else {
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                }
              }
            }
          }
        } else {
          L34: {
            L35: {
              pp.field_R = new int[param2 * 2];
              if (no.field_U == null) {
                break L35;
              } else {
                if (param2 <= no.field_U.length) {
                  break L34;
                } else {
                  break L35;
                }
              }
            }
            no.field_U = new int[param2 * 2];
            break L34;
          }
          L36: {
            L37: {
              if (wp.field_w == null) {
                break L37;
              } else {
                if (param2 > wp.field_w.length) {
                  break L37;
                } else {
                  break L36;
                }
              }
            }
            wp.field_w = new int[param2 * 2];
            break L36;
          }
          L38: {
            L39: {
              if (ci.field_c == null) {
                break L39;
              } else {
                if (param2 <= ci.field_c.length) {
                  break L38;
                } else {
                  break L39;
                }
              }
            }
            ci.field_c = new int[param2 * 2];
            break L38;
          }
          L40: {
            L41: {
              if (null == pe.field_s) {
                break L41;
              } else {
                if (param2 <= pe.field_s.length) {
                  break L40;
                } else {
                  break L41;
                }
              }
            }
            pe.field_s = new int[param2 * 2];
            break L40;
          }
          if (tb.field_h == null) {
            L42: {
              L43: {
                tb.field_h = new int[2 * param2];
                if (vt.field_m == null) {
                  break L43;
                } else {
                  if (param2 + param1 <= vt.field_m.length) {
                    break L42;
                  } else {
                    break L43;
                  }
                }
              }
              vt.field_m = new int[(param2 + param1) * 2];
              break L42;
            }
            L44: {
              L45: {
                if (cl.field_q == null) {
                  break L45;
                } else {
                  if (cl.field_q.length >= param2) {
                    break L44;
                  } else {
                    break L45;
                  }
                }
              }
              cl.field_q = new boolean[2 * param2];
              break L44;
            }
            kt.field_p = 0;
            if (param0 != 2) {
              return;
            } else {
              pd.field_e = 2147483647;
              sq.field_k = 2147483647;
              df.field_T = -2147483648;
              se.field_e = -2147483648;
              return;
            }
          } else {
            if (tb.field_h.length >= param2) {
              if (vt.field_m == null) {
                L46: {
                  L47: {
                    vt.field_m = new int[(param2 + param1) * 2];
                    if (cl.field_q == null) {
                      break L47;
                    } else {
                      if (cl.field_q.length >= param2) {
                        break L46;
                      } else {
                        break L47;
                      }
                    }
                  }
                  cl.field_q = new boolean[2 * param2];
                  break L46;
                }
                kt.field_p = 0;
                if (param0 != 2) {
                  return;
                } else {
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                }
              } else {
                if (param2 + param1 <= vt.field_m.length) {
                  if (cl.field_q == null) {
                    cl.field_q = new boolean[2 * param2];
                    kt.field_p = 0;
                    if (param0 != 2) {
                      return;
                    } else {
                      pd.field_e = 2147483647;
                      sq.field_k = 2147483647;
                      df.field_T = -2147483648;
                      se.field_e = -2147483648;
                      return;
                    }
                  } else {
                    if (cl.field_q.length >= param2) {
                      kt.field_p = 0;
                      if (param0 != 2) {
                        return;
                      } else {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      }
                    } else {
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      if (param0 != 2) {
                        return;
                      } else {
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      }
                    }
                  }
                } else {
                  L48: {
                    L49: {
                      vt.field_m = new int[(param2 + param1) * 2];
                      if (cl.field_q == null) {
                        break L49;
                      } else {
                        if (cl.field_q.length >= param2) {
                          break L48;
                        } else {
                          break L49;
                        }
                      }
                    }
                    cl.field_q = new boolean[2 * param2];
                    break L48;
                  }
                  kt.field_p = 0;
                  if (param0 != 2) {
                    return;
                  } else {
                    pd.field_e = 2147483647;
                    sq.field_k = 2147483647;
                    df.field_T = -2147483648;
                    se.field_e = -2147483648;
                    return;
                  }
                }
              }
            } else {
              L50: {
                L51: {
                  tb.field_h = new int[2 * param2];
                  if (vt.field_m == null) {
                    break L51;
                  } else {
                    if (param2 + param1 <= vt.field_m.length) {
                      break L50;
                    } else {
                      break L51;
                    }
                  }
                }
                vt.field_m = new int[(param2 + param1) * 2];
                break L50;
              }
              L52: {
                L53: {
                  if (cl.field_q == null) {
                    break L53;
                  } else {
                    if (cl.field_q.length >= param2) {
                      break L52;
                    } else {
                      break L53;
                    }
                  }
                }
                cl.field_q = new boolean[2 * param2];
                break L52;
              }
              kt.field_p = 0;
              if (param0 != 2) {
                return;
              } else {
                pd.field_e = 2147483647;
                sq.field_k = 2147483647;
                df.field_T = -2147483648;
                se.field_e = -2147483648;
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        field_k = null;
        field_r = null;
        int var1 = 97 % ((32 - param0) / 56);
    }

    qu(long param0, int param1, byte[] param2) {
        try {
            this.field_o = param1;
            this.field_l = param0;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qu.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Armour will help protect your units from damage, but each unit can only wear one type of armour at a time. Equipping a unit with new armour will cause whatever armour that unit is currently wearing to be discarded.";
        field_r = "Most victimised";
        field_s = new String[]{"By rating", "By win percentage"};
        field_p = 200;
    }
}

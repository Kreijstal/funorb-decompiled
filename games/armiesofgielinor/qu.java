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

    final static void e() {
        if (iu.field_h) {
            e.a((byte) -93);
            return;
        }
    }

    final static String a(int param0, byte param1) {
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
              L0: {
                var11.field_xb.b(10001, param0, false);
                kw.field_R = 2297;
                cg.field_j = 72584621;
                wr.field_L = 224;
                ii.field_b = 4452;
                var3 = var10.field_xb.field_mb[var10.field_q];
                var4 = var10.field_xb.field_zb[var10.field_q];
                hc.field_b = hc.field_b + 1;
                hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
                if (param1 > 31) {
                  break L0;
                } else {
                  String discarded$1 = qu.a(-2, (byte) 45);
                  break L0;
                }
              }
              hc.field_b = Math.abs(hc.field_b);
              var5 = var3;
              var6 = var4;
              var7 = hc.field_b % 4;
              var8 = var7;
              if (0 != var8) {
                if (var8 != 1) {
                  if (var8 != 2) {
                    if (var8 == 3) {
                      ii.field_b = ii.field_b - (-var6 + var5);
                      return "Done.";
                    } else {
                      throw new IllegalStateException("");
                    }
                  } else {
                    kw.field_R = kw.field_R + (var5 - var6);
                    return "Done.";
                  }
                } else {
                  ii.field_b = ii.field_b + var6;
                  kw.field_R = kw.field_R + var5;
                  return "Done.";
                }
              } else {
                kw.field_R = kw.field_R - var6;
                ii.field_b = ii.field_b - var5;
                return "Done.";
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
              if (null == pe.field_s) {
                break L6;
              } else {
                if (param2 <= pe.field_s.length) {
                  if (tb.field_h == null) {
                    tb.field_h = new int[2 * param2];
                    if (vt.field_m == null) {
                      L7: {
                        vt.field_m = new int[(param2 + param1) * 2];
                        if (cl.field_q == null) {
                          break L7;
                        } else {
                          if (cl.field_q.length >= param2) {
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            break L7;
                          }
                        }
                      }
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      pd.field_e = 2147483647;
                      sq.field_k = 2147483647;
                      df.field_T = -2147483648;
                      se.field_e = -2147483648;
                      return;
                    } else {
                      if (param2 + param1 <= vt.field_m.length) {
                        if (cl.field_q == null) {
                          cl.field_q = new boolean[2 * param2];
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          if (cl.field_q.length >= param2) {
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            cl.field_q = new boolean[2 * param2];
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          }
                        }
                      } else {
                        L8: {
                          vt.field_m = new int[(param2 + param1) * 2];
                          if (cl.field_q == null) {
                            break L8;
                          } else {
                            if (cl.field_q.length >= param2) {
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            } else {
                              break L8;
                            }
                          }
                        }
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      }
                    }
                  } else {
                    if (tb.field_h.length >= param2) {
                      if (vt.field_m == null) {
                        vt.field_m = new int[(param2 + param1) * 2];
                        if (cl.field_q == null) {
                          cl.field_q = new boolean[2 * param2];
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          if (cl.field_q.length >= param2) {
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            cl.field_q = new boolean[2 * param2];
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          }
                        }
                      } else {
                        if (param2 + param1 <= vt.field_m.length) {
                          if (cl.field_q == null) {
                            cl.field_q = new boolean[2 * param2];
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            if (cl.field_q.length >= param2) {
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            } else {
                              cl.field_q = new boolean[2 * param2];
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            }
                          }
                        } else {
                          vt.field_m = new int[(param2 + param1) * 2];
                          if (cl.field_q == null) {
                            cl.field_q = new boolean[2 * param2];
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            if (cl.field_q.length >= param2) {
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            } else {
                              cl.field_q = new boolean[2 * param2];
                              kt.field_p = 0;
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
                      L9: {
                        L10: {
                          tb.field_h = new int[2 * param2];
                          if (vt.field_m == null) {
                            break L10;
                          } else {
                            if (param2 + param1 <= vt.field_m.length) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        vt.field_m = new int[(param2 + param1) * 2];
                        break L9;
                      }
                      if (cl.field_q == null) {
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        if (cl.field_q.length >= param2) {
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          cl.field_q = new boolean[2 * param2];
                          kt.field_p = 0;
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
                  break L6;
                }
              }
            }
            L11: {
              L12: {
                pe.field_s = new int[param2 * 2];
                if (tb.field_h == null) {
                  break L12;
                } else {
                  if (tb.field_h.length >= param2) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              tb.field_h = new int[2 * param2];
              break L11;
            }
            L13: {
              L14: {
                if (vt.field_m == null) {
                  break L14;
                } else {
                  if (param2 + param1 <= vt.field_m.length) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              vt.field_m = new int[(param2 + param1) * 2];
              break L13;
            }
            L15: {
              if (cl.field_q == null) {
                break L15;
              } else {
                if (cl.field_q.length >= param2) {
                  kt.field_p = 0;
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                } else {
                  break L15;
                }
              }
            }
            cl.field_q = new boolean[2 * param2];
            kt.field_p = 0;
            pd.field_e = 2147483647;
            sq.field_k = 2147483647;
            df.field_T = -2147483648;
            se.field_e = -2147483648;
            return;
          } else {
            L16: {
              L17: {
                if (no.field_U == null) {
                  break L17;
                } else {
                  if (param2 <= no.field_U.length) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              no.field_U = new int[param2 * 2];
              break L16;
            }
            L18: {
              L19: {
                if (wp.field_w == null) {
                  break L19;
                } else {
                  if (param2 > wp.field_w.length) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              wp.field_w = new int[param2 * 2];
              break L18;
            }
            L20: {
              L21: {
                if (ci.field_c == null) {
                  break L21;
                } else {
                  if (param2 <= ci.field_c.length) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              ci.field_c = new int[param2 * 2];
              break L20;
            }
            L22: {
              if (null == pe.field_s) {
                break L22;
              } else {
                if (param2 <= pe.field_s.length) {
                  if (tb.field_h == null) {
                    L23: {
                      L24: {
                        tb.field_h = new int[2 * param2];
                        if (vt.field_m == null) {
                          break L24;
                        } else {
                          if (param2 + param1 <= vt.field_m.length) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      vt.field_m = new int[(param2 + param1) * 2];
                      break L23;
                    }
                    L25: {
                      if (cl.field_q == null) {
                        break L25;
                      } else {
                        if (cl.field_q.length >= param2) {
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          break L25;
                        }
                      }
                    }
                    cl.field_q = new boolean[2 * param2];
                    kt.field_p = 0;
                    pd.field_e = 2147483647;
                    sq.field_k = 2147483647;
                    df.field_T = -2147483648;
                    se.field_e = -2147483648;
                    return;
                  } else {
                    if (tb.field_h.length >= param2) {
                      if (vt.field_m == null) {
                        L26: {
                          vt.field_m = new int[(param2 + param1) * 2];
                          if (cl.field_q == null) {
                            break L26;
                          } else {
                            if (cl.field_q.length >= param2) {
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            } else {
                              break L26;
                            }
                          }
                        }
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        if (param2 + param1 <= vt.field_m.length) {
                          if (cl.field_q == null) {
                            cl.field_q = new boolean[2 * param2];
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            if (cl.field_q.length >= param2) {
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            } else {
                              cl.field_q = new boolean[2 * param2];
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            }
                          }
                        } else {
                          L27: {
                            vt.field_m = new int[(param2 + param1) * 2];
                            if (cl.field_q == null) {
                              break L27;
                            } else {
                              if (cl.field_q.length >= param2) {
                                kt.field_p = 0;
                                pd.field_e = 2147483647;
                                sq.field_k = 2147483647;
                                df.field_T = -2147483648;
                                se.field_e = -2147483648;
                                return;
                              } else {
                                break L27;
                              }
                            }
                          }
                          cl.field_q = new boolean[2 * param2];
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        }
                      }
                    } else {
                      L28: {
                        L29: {
                          tb.field_h = new int[2 * param2];
                          if (vt.field_m == null) {
                            break L29;
                          } else {
                            if (param2 + param1 <= vt.field_m.length) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        vt.field_m = new int[(param2 + param1) * 2];
                        break L28;
                      }
                      L30: {
                        if (cl.field_q == null) {
                          break L30;
                        } else {
                          if (cl.field_q.length >= param2) {
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            break L30;
                          }
                        }
                      }
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      pd.field_e = 2147483647;
                      sq.field_k = 2147483647;
                      df.field_T = -2147483648;
                      se.field_e = -2147483648;
                      return;
                    }
                  }
                } else {
                  break L22;
                }
              }
            }
            L31: {
              L32: {
                pe.field_s = new int[param2 * 2];
                if (tb.field_h == null) {
                  break L32;
                } else {
                  if (tb.field_h.length >= param2) {
                    break L31;
                  } else {
                    break L32;
                  }
                }
              }
              tb.field_h = new int[2 * param2];
              break L31;
            }
            L33: {
              L34: {
                if (vt.field_m == null) {
                  break L34;
                } else {
                  if (param2 + param1 <= vt.field_m.length) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              vt.field_m = new int[(param2 + param1) * 2];
              break L33;
            }
            L35: {
              if (cl.field_q == null) {
                break L35;
              } else {
                if (cl.field_q.length >= param2) {
                  kt.field_p = 0;
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                } else {
                  break L35;
                }
              }
            }
            cl.field_q = new boolean[2 * param2];
            kt.field_p = 0;
            pd.field_e = 2147483647;
            sq.field_k = 2147483647;
            df.field_T = -2147483648;
            se.field_e = -2147483648;
            return;
          }
        } else {
          L36: {
            L37: {
              pp.field_R = new int[param2 * 2];
              if (no.field_U == null) {
                break L37;
              } else {
                if (param2 <= no.field_U.length) {
                  break L36;
                } else {
                  break L37;
                }
              }
            }
            no.field_U = new int[param2 * 2];
            break L36;
          }
          L38: {
            L39: {
              if (wp.field_w == null) {
                break L39;
              } else {
                if (param2 > wp.field_w.length) {
                  break L39;
                } else {
                  break L38;
                }
              }
            }
            wp.field_w = new int[param2 * 2];
            break L38;
          }
          L40: {
            L41: {
              if (ci.field_c == null) {
                break L41;
              } else {
                if (param2 <= ci.field_c.length) {
                  break L40;
                } else {
                  break L41;
                }
              }
            }
            ci.field_c = new int[param2 * 2];
            break L40;
          }
          L42: {
            if (null == pe.field_s) {
              break L42;
            } else {
              if (param2 <= pe.field_s.length) {
                if (tb.field_h == null) {
                  L43: {
                    L44: {
                      tb.field_h = new int[2 * param2];
                      if (vt.field_m == null) {
                        break L44;
                      } else {
                        if (param2 + param1 <= vt.field_m.length) {
                          break L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                    vt.field_m = new int[(param2 + param1) * 2];
                    break L43;
                  }
                  L45: {
                    if (cl.field_q == null) {
                      break L45;
                    } else {
                      if (cl.field_q.length >= param2) {
                        kt.field_p = 0;
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      } else {
                        break L45;
                      }
                    }
                  }
                  cl.field_q = new boolean[2 * param2];
                  kt.field_p = 0;
                  pd.field_e = 2147483647;
                  sq.field_k = 2147483647;
                  df.field_T = -2147483648;
                  se.field_e = -2147483648;
                  return;
                } else {
                  if (tb.field_h.length >= param2) {
                    if (vt.field_m == null) {
                      L46: {
                        vt.field_m = new int[(param2 + param1) * 2];
                        if (cl.field_q == null) {
                          break L46;
                        } else {
                          if (cl.field_q.length >= param2) {
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            break L46;
                          }
                        }
                      }
                      cl.field_q = new boolean[2 * param2];
                      kt.field_p = 0;
                      pd.field_e = 2147483647;
                      sq.field_k = 2147483647;
                      df.field_T = -2147483648;
                      se.field_e = -2147483648;
                      return;
                    } else {
                      if (param2 + param1 <= vt.field_m.length) {
                        if (cl.field_q == null) {
                          cl.field_q = new boolean[2 * param2];
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          if (cl.field_q.length >= param2) {
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          } else {
                            cl.field_q = new boolean[2 * param2];
                            kt.field_p = 0;
                            pd.field_e = 2147483647;
                            sq.field_k = 2147483647;
                            df.field_T = -2147483648;
                            se.field_e = -2147483648;
                            return;
                          }
                        }
                      } else {
                        L47: {
                          vt.field_m = new int[(param2 + param1) * 2];
                          if (cl.field_q == null) {
                            break L47;
                          } else {
                            if (cl.field_q.length >= param2) {
                              kt.field_p = 0;
                              pd.field_e = 2147483647;
                              sq.field_k = 2147483647;
                              df.field_T = -2147483648;
                              se.field_e = -2147483648;
                              return;
                            } else {
                              break L47;
                            }
                          }
                        }
                        cl.field_q = new boolean[2 * param2];
                        kt.field_p = 0;
                        pd.field_e = 2147483647;
                        sq.field_k = 2147483647;
                        df.field_T = -2147483648;
                        se.field_e = -2147483648;
                        return;
                      }
                    }
                  } else {
                    L48: {
                      L49: {
                        tb.field_h = new int[2 * param2];
                        if (vt.field_m == null) {
                          break L49;
                        } else {
                          if (param2 + param1 <= vt.field_m.length) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      vt.field_m = new int[(param2 + param1) * 2];
                      break L48;
                    }
                    L50: {
                      if (cl.field_q == null) {
                        break L50;
                      } else {
                        if (cl.field_q.length >= param2) {
                          kt.field_p = 0;
                          pd.field_e = 2147483647;
                          sq.field_k = 2147483647;
                          df.field_T = -2147483648;
                          se.field_e = -2147483648;
                          return;
                        } else {
                          break L50;
                        }
                      }
                    }
                    cl.field_q = new boolean[2 * param2];
                    kt.field_p = 0;
                    pd.field_e = 2147483647;
                    sq.field_k = 2147483647;
                    df.field_T = -2147483648;
                    se.field_e = -2147483648;
                    return;
                  }
                }
              } else {
                break L42;
              }
            }
          }
          L51: {
            L52: {
              pe.field_s = new int[param2 * 2];
              if (tb.field_h == null) {
                break L52;
              } else {
                if (tb.field_h.length >= param2) {
                  break L51;
                } else {
                  break L52;
                }
              }
            }
            tb.field_h = new int[2 * param2];
            break L51;
          }
          L53: {
            L54: {
              if (vt.field_m == null) {
                break L54;
              } else {
                if (param2 + param1 <= vt.field_m.length) {
                  break L53;
                } else {
                  break L54;
                }
              }
            }
            vt.field_m = new int[(param2 + param1) * 2];
            break L53;
          }
          L55: {
            if (cl.field_q == null) {
              break L55;
            } else {
              if (cl.field_q.length >= param2) {
                kt.field_p = 0;
                pd.field_e = 2147483647;
                sq.field_k = 2147483647;
                df.field_T = -2147483648;
                se.field_e = -2147483648;
                return;
              } else {
                break L55;
              }
            }
          }
          cl.field_q = new boolean[2 * param2];
          kt.field_p = 0;
          pd.field_e = 2147483647;
          sq.field_k = 2147483647;
          df.field_T = -2147483648;
          se.field_e = -2147483648;
          return;
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
            ((qu) this).field_o = param1;
            ((qu) this).field_l = param0;
            ((qu) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "qu.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Armour will help protect your units from damage, but each unit can only wear one type of armour at a time. Equipping a unit with new armour will cause whatever armour that unit is currently wearing to be discarded.";
        field_r = "Most victimised";
        field_s = new String[]{"By rating", "By win percentage"};
        field_p = 200;
    }
}

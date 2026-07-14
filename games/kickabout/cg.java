/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ct {
    private int field_J;
    static String[] field_G;
    private String field_A;
    private hu field_I;
    static ut field_K;
    private boolean field_B;
    static String[] field_E;
    static int field_D;
    private int field_C;
    static String field_L;
    private int field_M;

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_142_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_135_0 = 0;
        var3 = Kickabout.field_G;
        if (param1 <= -83) {
          L0: {
            k.field_i = k.field_i + 1;
            if (0 != (ji.field_Hb ^ -1)) {
              break L0;
            } else {
              if (lj.field_h == -1) {
                ji.field_Hb = el.field_A;
                lj.field_h = n.field_m;
                break L0;
              } else {
                if (param0 != null) {
                  if (param0.equals((Object) (Object) mh.field_o)) {
                    L1: {
                      if (nc.field_a) {
                        break L1;
                      } else {
                        if (us.field_e <= k.field_i) {
                          break L1;
                        } else {
                          if (!el.field_C) {
                            break L1;
                          } else {
                            k.field_i = 0;
                            td.field_d = lj.field_h;
                            ws.field_e = ji.field_Hb;
                            break L1;
                          }
                        }
                      }
                    }
                    L2: {
                      mh.field_o = param0;
                      if (!nc.field_a) {
                        lj.field_h = -1;
                        ji.field_Hb = -1;
                        break L2;
                      } else {
                        if (k.field_i == nd.field_b) {
                          k.field_i = 0;
                          nc.field_a = false;
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L2;
                        } else {
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L2;
                        }
                      }
                    }
                    return;
                  } else {
                    L3: {
                      if (!nc.field_a) {
                        if (us.field_e <= k.field_i) {
                          if (k.field_i < us.field_e - -rd.field_i) {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L3;
                          } else {
                            stackOut_58_0 = 0;
                            stackIn_61_0 = stackOut_58_0;
                            break L3;
                          }
                        } else {
                          stackOut_56_0 = 0;
                          stackIn_61_0 = stackOut_56_0;
                          break L3;
                        }
                      } else {
                        stackOut_54_0 = 0;
                        stackIn_61_0 = stackOut_54_0;
                        break L3;
                      }
                    }
                    L4: {
                      var2 = stackIn_61_0;
                      if (param0 != null) {
                        if (nc.field_a) {
                          k.field_i = us.field_e;
                          break L4;
                        } else {
                          if (var2 != 0) {
                            k.field_i = us.field_e;
                            break L4;
                          } else {
                            k.field_i = 0;
                            break L4;
                          }
                        }
                      } else {
                        k.field_i = 0;
                        break L4;
                      }
                    }
                    L5: {
                      td.field_d = lj.field_h;
                      ws.field_e = ji.field_Hb;
                      if (param0 == null) {
                        if (var2 != 0) {
                          nc.field_a = true;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        nc.field_a = false;
                        break L5;
                      }
                    }
                    L6: {
                      if (nc.field_a) {
                        break L6;
                      } else {
                        if (us.field_e <= k.field_i) {
                          break L6;
                        } else {
                          if (!el.field_C) {
                            break L6;
                          } else {
                            k.field_i = 0;
                            td.field_d = lj.field_h;
                            ws.field_e = ji.field_Hb;
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      mh.field_o = param0;
                      if (!nc.field_a) {
                        lj.field_h = -1;
                        ji.field_Hb = -1;
                        break L7;
                      } else {
                        if (k.field_i == nd.field_b) {
                          k.field_i = 0;
                          nc.field_a = false;
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L7;
                        } else {
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L7;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (null != mh.field_o) {
                    L8: {
                      if (nc.field_a) {
                        break L8;
                      } else {
                        if (us.field_e <= k.field_i) {
                          break L8;
                        } else {
                          if (!el.field_C) {
                            break L8;
                          } else {
                            k.field_i = 0;
                            td.field_d = lj.field_h;
                            ws.field_e = ji.field_Hb;
                            break L8;
                          }
                        }
                      }
                    }
                    L9: {
                      mh.field_o = param0;
                      if (!nc.field_a) {
                        lj.field_h = -1;
                        ji.field_Hb = -1;
                        break L9;
                      } else {
                        if (k.field_i == nd.field_b) {
                          k.field_i = 0;
                          nc.field_a = false;
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L9;
                        } else {
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L9;
                        }
                      }
                    }
                    return;
                  } else {
                    L10: {
                      if (!nc.field_a) {
                        if (us.field_e <= k.field_i) {
                          if (k.field_i < us.field_e - -rd.field_i) {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L10;
                          } else {
                            stackOut_11_0 = 0;
                            stackIn_14_0 = stackOut_11_0;
                            break L10;
                          }
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_14_0 = stackOut_9_0;
                          break L10;
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_14_0 = stackOut_7_0;
                        break L10;
                      }
                    }
                    L11: {
                      var2 = stackIn_14_0;
                      if (param0 != null) {
                        L12: {
                          if (nc.field_a) {
                            break L12;
                          } else {
                            if (var2 != 0) {
                              break L12;
                            } else {
                              k.field_i = 0;
                              break L11;
                            }
                          }
                        }
                        k.field_i = us.field_e;
                        break L11;
                      } else {
                        k.field_i = 0;
                        break L11;
                      }
                    }
                    L13: {
                      td.field_d = lj.field_h;
                      ws.field_e = ji.field_Hb;
                      if (param0 == null) {
                        if (var2 != 0) {
                          nc.field_a = true;
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        nc.field_a = false;
                        break L13;
                      }
                    }
                    L14: {
                      if (nc.field_a) {
                        break L14;
                      } else {
                        if (us.field_e <= k.field_i) {
                          break L14;
                        } else {
                          if (!el.field_C) {
                            break L14;
                          } else {
                            k.field_i = 0;
                            td.field_d = lj.field_h;
                            ws.field_e = ji.field_Hb;
                            break L14;
                          }
                        }
                      }
                    }
                    L15: {
                      mh.field_o = param0;
                      if (!nc.field_a) {
                        lj.field_h = -1;
                        ji.field_Hb = -1;
                        break L15;
                      } else {
                        if (k.field_i == nd.field_b) {
                          k.field_i = 0;
                          nc.field_a = false;
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L15;
                        } else {
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          break L15;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
          L16: {
            if (param0 != null) {
              if (!param0.equals((Object) (Object) mh.field_o)) {
                break L16;
              } else {
                L17: {
                  if (nc.field_a) {
                    break L17;
                  } else {
                    if (us.field_e <= k.field_i) {
                      break L17;
                    } else {
                      if (!el.field_C) {
                        break L17;
                      } else {
                        k.field_i = 0;
                        td.field_d = lj.field_h;
                        ws.field_e = ji.field_Hb;
                        mh.field_o = param0;
                        if (nc.field_a) {
                          if (k.field_i != nd.field_b) {
                            lj.field_h = -1;
                            ji.field_Hb = -1;
                            return;
                          } else {
                            k.field_i = 0;
                            nc.field_a = false;
                            lj.field_h = -1;
                            ji.field_Hb = -1;
                            return;
                          }
                        } else {
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          return;
                        }
                      }
                    }
                  }
                }
                mh.field_o = param0;
                if (nc.field_a) {
                  if (k.field_i == nd.field_b) {
                    k.field_i = 0;
                    nc.field_a = false;
                    lj.field_h = -1;
                    ji.field_Hb = -1;
                    return;
                  } else {
                    lj.field_h = -1;
                    ji.field_Hb = -1;
                    return;
                  }
                } else {
                  lj.field_h = -1;
                  ji.field_Hb = -1;
                  return;
                }
              }
            } else {
              if (null == mh.field_o) {
                break L16;
              } else {
                L18: {
                  if (nc.field_a) {
                    break L18;
                  } else {
                    if (us.field_e <= k.field_i) {
                      break L18;
                    } else {
                      if (!el.field_C) {
                        break L18;
                      } else {
                        k.field_i = 0;
                        td.field_d = lj.field_h;
                        ws.field_e = ji.field_Hb;
                        mh.field_o = param0;
                        if (nc.field_a) {
                          if (k.field_i != nd.field_b) {
                            lj.field_h = -1;
                            ji.field_Hb = -1;
                            return;
                          } else {
                            k.field_i = 0;
                            nc.field_a = false;
                            lj.field_h = -1;
                            ji.field_Hb = -1;
                            return;
                          }
                        } else {
                          lj.field_h = -1;
                          ji.field_Hb = -1;
                          return;
                        }
                      }
                    }
                  }
                }
                mh.field_o = param0;
                if (nc.field_a) {
                  if (k.field_i != nd.field_b) {
                    lj.field_h = -1;
                    ji.field_Hb = -1;
                    return;
                  } else {
                    k.field_i = 0;
                    nc.field_a = false;
                    lj.field_h = -1;
                    ji.field_Hb = -1;
                    return;
                  }
                } else {
                  lj.field_h = -1;
                  ji.field_Hb = -1;
                  return;
                }
              }
            }
          }
          L19: {
            if (!nc.field_a) {
              if (us.field_e <= k.field_i) {
                if (k.field_i < us.field_e - -rd.field_i) {
                  stackOut_140_0 = 1;
                  stackIn_142_0 = stackOut_140_0;
                  break L19;
                } else {
                  stackOut_139_0 = 0;
                  stackIn_142_0 = stackOut_139_0;
                  break L19;
                }
              } else {
                stackOut_137_0 = 0;
                stackIn_142_0 = stackOut_137_0;
                break L19;
              }
            } else {
              stackOut_135_0 = 0;
              stackIn_142_0 = stackOut_135_0;
              break L19;
            }
          }
          var2 = stackIn_142_0;
          if (param0 == null) {
            L20: {
              k.field_i = 0;
              td.field_d = lj.field_h;
              ws.field_e = ji.field_Hb;
              if (param0 == null) {
                if (var2 != 0) {
                  nc.field_a = true;
                  break L20;
                } else {
                  break L20;
                }
              } else {
                nc.field_a = false;
                break L20;
              }
            }
            L21: {
              if (nc.field_a) {
                break L21;
              } else {
                if (us.field_e <= k.field_i) {
                  break L21;
                } else {
                  if (!el.field_C) {
                    break L21;
                  } else {
                    k.field_i = 0;
                    td.field_d = lj.field_h;
                    ws.field_e = ji.field_Hb;
                    break L21;
                  }
                }
              }
            }
            L22: {
              mh.field_o = param0;
              if (!nc.field_a) {
                break L22;
              } else {
                if (k.field_i == nd.field_b) {
                  k.field_i = 0;
                  nc.field_a = false;
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            lj.field_h = -1;
            ji.field_Hb = -1;
            return;
          } else {
            L23: {
              if (nc.field_a) {
                k.field_i = us.field_e;
                break L23;
              } else {
                if (var2 == 0) {
                  L24: {
                    k.field_i = 0;
                    td.field_d = lj.field_h;
                    ws.field_e = ji.field_Hb;
                    if (param0 == null) {
                      if (var2 != 0) {
                        nc.field_a = true;
                        break L24;
                      } else {
                        break L24;
                      }
                    } else {
                      nc.field_a = false;
                      break L24;
                    }
                  }
                  L25: {
                    if (nc.field_a) {
                      break L25;
                    } else {
                      if (us.field_e <= k.field_i) {
                        break L25;
                      } else {
                        if (!el.field_C) {
                          break L25;
                        } else {
                          k.field_i = 0;
                          td.field_d = lj.field_h;
                          ws.field_e = ji.field_Hb;
                          break L25;
                        }
                      }
                    }
                  }
                  mh.field_o = param0;
                  if (nc.field_a) {
                    if (k.field_i != nd.field_b) {
                      lj.field_h = -1;
                      ji.field_Hb = -1;
                      return;
                    } else {
                      k.field_i = 0;
                      nc.field_a = false;
                      lj.field_h = -1;
                      ji.field_Hb = -1;
                      return;
                    }
                  } else {
                    lj.field_h = -1;
                    ji.field_Hb = -1;
                    return;
                  }
                } else {
                  k.field_i = us.field_e;
                  break L23;
                }
              }
            }
            td.field_d = lj.field_h;
            ws.field_e = ji.field_Hb;
            if (param0 == null) {
              if (var2 != 0) {
                L26: {
                  nc.field_a = true;
                  if (nc.field_a) {
                    break L26;
                  } else {
                    if (us.field_e <= k.field_i) {
                      break L26;
                    } else {
                      if (!el.field_C) {
                        break L26;
                      } else {
                        L27: {
                          k.field_i = 0;
                          td.field_d = lj.field_h;
                          ws.field_e = ji.field_Hb;
                          mh.field_o = param0;
                          if (!nc.field_a) {
                            break L27;
                          } else {
                            if (k.field_i == nd.field_b) {
                              k.field_i = 0;
                              nc.field_a = false;
                              break L27;
                            } else {
                              lj.field_h = -1;
                              ji.field_Hb = -1;
                              return;
                            }
                          }
                        }
                        lj.field_h = -1;
                        ji.field_Hb = -1;
                        return;
                      }
                    }
                  }
                }
                L28: {
                  mh.field_o = param0;
                  if (!nc.field_a) {
                    break L28;
                  } else {
                    if (k.field_i == nd.field_b) {
                      k.field_i = 0;
                      nc.field_a = false;
                      break L28;
                    } else {
                      lj.field_h = -1;
                      ji.field_Hb = -1;
                      return;
                    }
                  }
                }
                lj.field_h = -1;
                ji.field_Hb = -1;
                return;
              } else {
                L29: {
                  if (nc.field_a) {
                    break L29;
                  } else {
                    if (us.field_e <= k.field_i) {
                      break L29;
                    } else {
                      if (!el.field_C) {
                        break L29;
                      } else {
                        L30: {
                          k.field_i = 0;
                          td.field_d = lj.field_h;
                          ws.field_e = ji.field_Hb;
                          mh.field_o = param0;
                          if (!nc.field_a) {
                            break L30;
                          } else {
                            if (k.field_i == nd.field_b) {
                              k.field_i = 0;
                              nc.field_a = false;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                        }
                        lj.field_h = -1;
                        ji.field_Hb = -1;
                        return;
                      }
                    }
                  }
                }
                L31: {
                  mh.field_o = param0;
                  if (!nc.field_a) {
                    break L31;
                  } else {
                    if (k.field_i == nd.field_b) {
                      k.field_i = 0;
                      nc.field_a = false;
                      break L31;
                    } else {
                      lj.field_h = -1;
                      ji.field_Hb = -1;
                      return;
                    }
                  }
                }
                lj.field_h = -1;
                ji.field_Hb = -1;
                return;
              }
            } else {
              L32: {
                nc.field_a = false;
                if (nc.field_a) {
                  break L32;
                } else {
                  if (us.field_e <= k.field_i) {
                    break L32;
                  } else {
                    if (!el.field_C) {
                      break L32;
                    } else {
                      L33: {
                        k.field_i = 0;
                        td.field_d = lj.field_h;
                        ws.field_e = ji.field_Hb;
                        mh.field_o = param0;
                        if (!nc.field_a) {
                          break L33;
                        } else {
                          if (k.field_i == nd.field_b) {
                            k.field_i = 0;
                            nc.field_a = false;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                      }
                      lj.field_h = -1;
                      ji.field_Hb = -1;
                      return;
                    }
                  }
                }
              }
              mh.field_o = param0;
              if (nc.field_a) {
                if (k.field_i == nd.field_b) {
                  k.field_i = 0;
                  nc.field_a = false;
                  lj.field_h = -1;
                  ji.field_Hb = -1;
                  return;
                } else {
                  lj.field_h = -1;
                  ji.field_Hb = -1;
                  return;
                }
              } else {
                lj.field_h = -1;
                ji.field_Hb = -1;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void k(int param0) {
        field_E = null;
        field_L = null;
        field_G = null;
        field_K = null;
        if (param0 < 89) {
            Object var2 = null;
            cg.a((String) null, (byte) 122);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((cg) this).field_t - -param2;
        int var6 = param3 + ((cg) this).field_g;
        super.a(param0, (int) (char)param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        int var7 = !((cg) this).field_B ? 0 : -(2 * ((cg) this).field_J) + -((cg) this).field_M + ((cg) this).field_n;
        int discarded$0 = ((cg) this).field_I.a(((cg) this).field_A, var5 + (var7 + ((cg) this).field_J), ((cg) this).field_J + var6, -((cg) this).field_J + ((cg) this).field_M, ((cg) this).field_i - ((cg) this).field_J * 2, ((cg) this).field_C, -1, ((cg) this).field_B ? 0 : 2, 1, ((cg) this).field_I.field_G);
    }

    final String f(int param0) {
        int var2 = ((cg) this).field_z.field_m ? 1 : 0;
        ((cg) this).field_z.field_m = ((cg) this).field_m;
        String var3 = ((cg) this).field_z.f(param0);
        ((cg) this).field_z.field_m = var2 != 0 ? true : false;
        return var3;
    }

    cg(int param0, int param1, int param2, int param3, fd param4, boolean param5, int param6, int param7, hu param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gj) null, (jv) null);
        ((cg) this).field_C = param9;
        ((cg) this).field_z = param4;
        ((cg) this).field_J = param7;
        ((cg) this).field_B = param5 ? true : false;
        ((cg) this).field_A = param10;
        ((cg) this).field_M = param6;
        ((cg) this).field_I = param8;
        int var12 = ((cg) this).field_M - ((cg) this).field_J;
        int var13 = ((cg) this).field_I.c(param10, var12, ((cg) this).field_I.field_G) - -(2 * ((cg) this).field_J);
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((cg) this).a(var13, 1, param0, param2, param1);
        }
        int var14 = ((cg) this).field_B ? 0 : ((cg) this).field_M + 2 * ((cg) this).field_J;
        ((cg) this).field_z.a(-(((cg) this).field_J * 2) + param3, 1, var14, -((cg) this).field_M + (param2 + -(((cg) this).field_J * 3)), ((cg) this).field_J + (var13 + -param3 >> -954640639));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 0;
        field_G = new String[]{"Right-click", "Mouse wheel"};
        field_L = "<%0> beats <%1>, <%2> to <%3>, sealing their place <%4>.";
    }
}

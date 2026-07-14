/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static kb field_b;
    static int[] field_a;

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_158_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var3 = HoldTheLine.field_D;
        if (param1 == (ak.field_c ^ -1)) {
          if (0 != (jf.field_b ^ -1)) {
            L0: {
              dm.field_a = dm.field_a + 1;
              if (param0 == null) {
                if (null == n.field_s) {
                  L1: {
                    if (!sk.field_h) {
                      if (dm.field_a >= g.field_h) {
                        if (we.field_l + g.field_h > dm.field_a) {
                          stackOut_156_0 = 1;
                          stackIn_158_0 = stackOut_156_0;
                          break L1;
                        } else {
                          stackOut_155_0 = 0;
                          stackIn_158_0 = stackOut_155_0;
                          break L1;
                        }
                      } else {
                        stackOut_153_0 = 0;
                        stackIn_158_0 = stackOut_153_0;
                        break L1;
                      }
                    } else {
                      stackOut_151_0 = 0;
                      stackIn_158_0 = stackOut_151_0;
                      break L1;
                    }
                  }
                  L2: {
                    var2 = stackIn_158_0;
                    if (param0 == null) {
                      dm.field_a = 0;
                      break L2;
                    } else {
                      L3: {
                        if (sk.field_h) {
                          break L3;
                        } else {
                          if (var2 != 0) {
                            break L3;
                          } else {
                            if (sk.field_h) {
                              break L0;
                            } else {
                              if (g.field_h <= dm.field_a) {
                                break L0;
                              } else {
                                if (!na.field_k) {
                                  break L0;
                                } else {
                                  ac.field_e = ak.field_c;
                                  dm.field_a = 0;
                                  em.field_l = jf.field_b;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                      dm.field_a = g.field_h;
                      break L2;
                    }
                  }
                  L4: {
                    L5: {
                      ac.field_e = ak.field_c;
                      if (param0 == null) {
                        if (var2 == 0) {
                          break L5;
                        } else {
                          sk.field_h = true;
                          em.field_l = jf.field_b;
                          break L4;
                        }
                      } else {
                        sk.field_h = false;
                        break L5;
                      }
                    }
                    em.field_l = jf.field_b;
                    break L4;
                  }
                  if (sk.field_h) {
                    break L0;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L0;
                    } else {
                      if (!na.field_k) {
                        break L0;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (sk.field_h) {
                    break L0;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L0;
                    } else {
                      if (!na.field_k) {
                        break L0;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                if (param0.equals((Object) (Object) n.field_s)) {
                  if (sk.field_h) {
                    break L0;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L0;
                    } else {
                      if (!na.field_k) {
                        break L0;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (sk.field_h) {
                    break L0;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L0;
                    } else {
                      if (!na.field_k) {
                        break L0;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              n.field_s = param0;
              jf.field_b = -1;
              ak.field_c = -1;
              if (!sk.field_h) {
                break L6;
              } else {
                if (rb.field_m == dm.field_a) {
                  dm.field_a = 0;
                  sk.field_h = false;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            return;
          } else {
            L7: {
              jf.field_b = rf.field_X;
              ak.field_c = nc.field_g;
              dm.field_a = dm.field_a + 1;
              if (param0 == null) {
                if (null == n.field_s) {
                  L8: {
                    if (!sk.field_h) {
                      if (dm.field_a >= g.field_h) {
                        if (we.field_l + g.field_h <= dm.field_a) {
                          stackOut_112_0 = 0;
                          stackIn_114_0 = stackOut_112_0;
                          break L8;
                        } else {
                          stackOut_111_0 = 1;
                          stackIn_114_0 = stackOut_111_0;
                          break L8;
                        }
                      } else {
                        stackOut_109_0 = 0;
                        stackIn_114_0 = stackOut_109_0;
                        break L8;
                      }
                    } else {
                      stackOut_107_0 = 0;
                      stackIn_114_0 = stackOut_107_0;
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      var2 = stackIn_114_0;
                      if (param0 == null) {
                        break L10;
                      } else {
                        L11: {
                          if (sk.field_h) {
                            break L11;
                          } else {
                            if (var2 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        dm.field_a = g.field_h;
                        break L9;
                      }
                    }
                    dm.field_a = 0;
                    break L9;
                  }
                  L12: {
                    ac.field_e = ak.field_c;
                    if (param0 == null) {
                      if (var2 == 0) {
                        break L12;
                      } else {
                        sk.field_h = true;
                        break L12;
                      }
                    } else {
                      sk.field_h = false;
                      break L12;
                    }
                  }
                  em.field_l = jf.field_b;
                  if (sk.field_h) {
                    break L7;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L7;
                    } else {
                      if (!na.field_k) {
                        break L7;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L7;
                      }
                    }
                  }
                } else {
                  if (sk.field_h) {
                    break L7;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L7;
                    } else {
                      if (!na.field_k) {
                        break L7;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L7;
                      }
                    }
                  }
                }
              } else {
                if (!param0.equals((Object) (Object) n.field_s)) {
                  if (sk.field_h) {
                    break L7;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L7;
                    } else {
                      if (!na.field_k) {
                        break L7;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L7;
                      }
                    }
                  }
                } else {
                  if (sk.field_h) {
                    break L7;
                  } else {
                    if (g.field_h <= dm.field_a) {
                      break L7;
                    } else {
                      if (!na.field_k) {
                        break L7;
                      } else {
                        ac.field_e = ak.field_c;
                        dm.field_a = 0;
                        em.field_l = jf.field_b;
                        break L7;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              n.field_s = param0;
              jf.field_b = -1;
              ak.field_c = -1;
              if (!sk.field_h) {
                break L13;
              } else {
                if (rb.field_m == dm.field_a) {
                  dm.field_a = 0;
                  sk.field_h = false;
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            return;
          }
        } else {
          dm.field_a = dm.field_a + 1;
          if (param0 == null) {
            if (null != n.field_s) {
              L14: {
                if (sk.field_h) {
                  break L14;
                } else {
                  if (g.field_h <= dm.field_a) {
                    break L14;
                  } else {
                    if (!na.field_k) {
                      break L14;
                    } else {
                      ac.field_e = ak.field_c;
                      dm.field_a = 0;
                      em.field_l = jf.field_b;
                      break L14;
                    }
                  }
                }
              }
              L15: {
                n.field_s = param0;
                jf.field_b = -1;
                ak.field_c = -1;
                if (!sk.field_h) {
                  break L15;
                } else {
                  if (rb.field_m == dm.field_a) {
                    dm.field_a = 0;
                    sk.field_h = false;
                    break L15;
                  } else {
                    break L15;
                  }
                }
              }
              return;
            } else {
              L16: {
                if (!sk.field_h) {
                  if (dm.field_a >= g.field_h) {
                    if (we.field_l + g.field_h > dm.field_a) {
                      stackOut_52_0 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      break L16;
                    } else {
                      stackOut_51_0 = 0;
                      stackIn_54_0 = stackOut_51_0;
                      break L16;
                    }
                  } else {
                    stackOut_49_0 = 0;
                    stackIn_54_0 = stackOut_49_0;
                    break L16;
                  }
                } else {
                  stackOut_47_0 = 0;
                  stackIn_54_0 = stackOut_47_0;
                  break L16;
                }
              }
              L17: {
                var2 = stackIn_54_0;
                if (param0 != null) {
                  if (sk.field_h) {
                    dm.field_a = g.field_h;
                    break L17;
                  } else {
                    if (var2 != 0) {
                      dm.field_a = g.field_h;
                      break L17;
                    } else {
                      dm.field_a = 0;
                      break L17;
                    }
                  }
                } else {
                  dm.field_a = 0;
                  break L17;
                }
              }
              L18: {
                L19: {
                  ac.field_e = ak.field_c;
                  if (param0 == null) {
                    if (var2 == 0) {
                      break L19;
                    } else {
                      sk.field_h = true;
                      em.field_l = jf.field_b;
                      break L18;
                    }
                  } else {
                    sk.field_h = false;
                    break L19;
                  }
                }
                em.field_l = jf.field_b;
                break L18;
              }
              L20: {
                if (sk.field_h) {
                  break L20;
                } else {
                  if (g.field_h <= dm.field_a) {
                    break L20;
                  } else {
                    if (!na.field_k) {
                      break L20;
                    } else {
                      ac.field_e = ak.field_c;
                      dm.field_a = 0;
                      em.field_l = jf.field_b;
                      break L20;
                    }
                  }
                }
              }
              L21: {
                n.field_s = param0;
                jf.field_b = -1;
                ak.field_c = -1;
                if (!sk.field_h) {
                  break L21;
                } else {
                  if (rb.field_m == dm.field_a) {
                    dm.field_a = 0;
                    sk.field_h = false;
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
              return;
            }
          } else {
            if (param0.equals((Object) (Object) n.field_s)) {
              L22: {
                if (sk.field_h) {
                  break L22;
                } else {
                  if (g.field_h <= dm.field_a) {
                    break L22;
                  } else {
                    if (!na.field_k) {
                      break L22;
                    } else {
                      ac.field_e = ak.field_c;
                      dm.field_a = 0;
                      em.field_l = jf.field_b;
                      break L22;
                    }
                  }
                }
              }
              L23: {
                n.field_s = param0;
                jf.field_b = -1;
                ak.field_c = -1;
                if (!sk.field_h) {
                  break L23;
                } else {
                  if (rb.field_m == dm.field_a) {
                    dm.field_a = 0;
                    sk.field_h = false;
                    break L23;
                  } else {
                    break L23;
                  }
                }
              }
              return;
            } else {
              L24: {
                if (!sk.field_h) {
                  if (dm.field_a >= g.field_h) {
                    if (we.field_l + g.field_h > dm.field_a) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L24;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L24;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    break L24;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_11_0 = stackOut_4_0;
                  break L24;
                }
              }
              L25: {
                var2 = stackIn_11_0;
                if (param0 != null) {
                  L26: {
                    if (sk.field_h) {
                      break L26;
                    } else {
                      if (var2 != 0) {
                        break L26;
                      } else {
                        dm.field_a = 0;
                        break L25;
                      }
                    }
                  }
                  dm.field_a = g.field_h;
                  break L25;
                } else {
                  dm.field_a = 0;
                  break L25;
                }
              }
              L27: {
                L28: {
                  ac.field_e = ak.field_c;
                  if (param0 == null) {
                    if (var2 == 0) {
                      break L28;
                    } else {
                      sk.field_h = true;
                      em.field_l = jf.field_b;
                      break L27;
                    }
                  } else {
                    sk.field_h = false;
                    break L28;
                  }
                }
                em.field_l = jf.field_b;
                break L27;
              }
              L29: {
                if (sk.field_h) {
                  break L29;
                } else {
                  if (g.field_h <= dm.field_a) {
                    break L29;
                  } else {
                    if (!na.field_k) {
                      break L29;
                    } else {
                      ac.field_e = ak.field_c;
                      dm.field_a = 0;
                      em.field_l = jf.field_b;
                      break L29;
                    }
                  }
                }
              }
              L30: {
                n.field_s = param0;
                jf.field_b = -1;
                ak.field_c = -1;
                if (!sk.field_h) {
                  break L30;
                } else {
                  if (rb.field_m == dm.field_a) {
                    dm.field_a = 0;
                    sk.field_h = false;
                    break L30;
                  } else {
                    break L30;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final static int a(lb param0, int param1, gj param2) {
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        wb var11 = null;
        var11 = new wb(param0.field_r, param0.field_s);
        var4 = new wb(param0.field_r, param2.field_t);
        var5 = var11.a(-105, var4);
        var6 = var11.a(false, var4);
        var7 = var11.a(51);
        var8 = (float)param2.field_u * (float)var7 * (float)param2.field_u - (float)var6 * (float)var6;
        if (var8 >= (float)param1) {
          var9 = 0;
          var10 = (float)Math.sqrt((double)var8);
          mm.field_d = ((float)var5 + var10) / (float)var7;
          if (mm.field_d >= 0.0f) {
            if (1.0f >= mm.field_d) {
              lk.field_b = ha.a(param2.field_t, param0.a(false, mm.field_d), false);
              if (param2.a(lk.field_b, 13012)) {
                var9++;
                if (var10 > 0.0f) {
                  rb.field_g = ((float)var5 - var10) / (float)var7;
                  if (rb.field_g >= 0.0f) {
                    if (rb.field_g <= 1.0f) {
                      L0: {
                        cj.field_G = ha.a(param2.field_t, param0.a(false, rb.field_g), false);
                        if (param2.a(cj.field_G, 13012)) {
                          var9++;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      if ((var9 ^ -1) != -2) {
                        return var9;
                      } else {
                        lk.field_b = cj.field_G;
                        mm.field_d = rb.field_g;
                        return var9;
                      }
                    } else {
                      return var9;
                    }
                  } else {
                    return var9;
                  }
                } else {
                  return var9;
                }
              } else {
                L1: {
                  if (var10 > 0.0f) {
                    rb.field_g = ((float)var5 - var10) / (float)var7;
                    if (rb.field_g < 0.0f) {
                      break L1;
                    } else {
                      if (rb.field_g > 1.0f) {
                        break L1;
                      } else {
                        L2: {
                          cj.field_G = ha.a(param2.field_t, param0.a(false, rb.field_g), false);
                          if (param2.a(cj.field_G, 13012)) {
                            var9++;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        if ((var9 ^ -1) != -2) {
                          break L1;
                        } else {
                          lk.field_b = cj.field_G;
                          mm.field_d = rb.field_g;
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                return var9;
              }
            } else {
              if (var10 > 0.0f) {
                rb.field_g = ((float)var5 - var10) / (float)var7;
                if (rb.field_g >= 0.0f) {
                  if (rb.field_g <= 1.0f) {
                    L3: {
                      cj.field_G = ha.a(param2.field_t, param0.a(false, rb.field_g), false);
                      if (param2.a(cj.field_G, 13012)) {
                        var9++;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if ((var9 ^ -1) == -2) {
                      lk.field_b = cj.field_G;
                      mm.field_d = rb.field_g;
                      return var9;
                    } else {
                      return var9;
                    }
                  } else {
                    return var9;
                  }
                } else {
                  return var9;
                }
              } else {
                return var9;
              }
            }
          } else {
            if (var10 > 0.0f) {
              rb.field_g = ((float)var5 - var10) / (float)var7;
              if (rb.field_g >= 0.0f) {
                if (rb.field_g <= 1.0f) {
                  L4: {
                    cj.field_G = ha.a(param2.field_t, param0.a(false, rb.field_g), false);
                    if (param2.a(cj.field_G, 13012)) {
                      var9++;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if ((var9 ^ -1) == -2) {
                    lk.field_b = cj.field_G;
                    mm.field_d = rb.field_g;
                    return var9;
                  } else {
                    return var9;
                  }
                } else {
                  return var9;
                }
              } else {
                return var9;
              }
            } else {
              return var9;
            }
          }
        } else {
          return 0;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 12031) {
            field_b = null;
        }
    }

    final static char a(boolean param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (!param0) {
          field_b = null;
          var2 = param1;
          if (32 != var2) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 == 95) {
                  break L0;
                } else {
                  if (var2 != -46) {
                    L1: {
                      if (-92 == var2) {
                        break L1;
                      } else {
                        if (93 == var2) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if (var2 != -225) {
                                if (var2 != 225) {
                                  if (-227 != var2) {
                                    if (228 != var2) {
                                      if (-228 != var2) {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (-194 == var2) {
                                            break L2;
                                          } else {
                                            if (-195 == (var2 ^ -1)) {
                                              break L2;
                                            } else {
                                              if ((var2 ^ -1) != -197) {
                                                if (var2 == -196) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (233 != var2) {
                                                        if (-235 == var2) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (200 == var2) {
                                                              break L3;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (-204 != (var2 ^ -1)) {
                                                                    L4: {
                                                                      if (var2 == -238) {
                                                                        break L4;
                                                                      } else {
                                                                        if (238 != var2) {
                                                                          if (239 != var2) {
                                                                            if (-206 == var2) {
                                                                              break L4;
                                                                            } else {
                                                                              if (206 != var2) {
                                                                                if ((var2 ^ -1) != -208) {
                                                                                  L5: {
                                                                                    if (242 == var2) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 != -244) {
                                                                                        if (-245 != var2) {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (-246 == (var2 ^ -1)) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) != -211) {
                                                                                                if ((var2 ^ -1) == -212) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (212 != var2) {
                                                                                                    if (var2 != -215) {
                                                                                                      if (-214 == var2) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if ((var2 ^ -1) != -251) {
                                                                                                              if ((var2 ^ -1) == -252) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 != -253) {
                                                                                                                  if (-218 != var2) {
                                                                                                                    if (var2 != -219) {
                                                                                                                      if (var2 == 219) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        if (-221 != var2) {
                                                                                                                          L7: {
                                                                                                                            if (var2 == -232) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              if (var2 == -200) {
                                                                                                                                break L7;
                                                                                                                              } else {
                                                                                                                                L8: {
                                                                                                                                  if (255 == var2) {
                                                                                                                                    break L8;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 376) {
                                                                                                                                      break L8;
                                                                                                                                    } else {
                                                                                                                                      if (-242 == var2) {
                                                                                                                                        return 'n';
                                                                                                                                      } else {
                                                                                                                                        if (-210 != var2) {
                                                                                                                                          if (-224 != (var2 ^ -1)) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          return 'n';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          return 'c';
                                                                                                                        } else {
                                                                                                                          return 'u';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'o';
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                } else {
                                                                                  return 'i';
                                                                                }
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        } else {
                                                                          return 'i';
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    return 'e';
                                                                  }
                                                                }
                                                              } else {
                                                                return 'e';
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (32 != var2) {
            if (var2 != 160) {
              if (var2 != 95) {
                if (var2 != -46) {
                  if (-92 != var2) {
                    L9: {
                      if (93 == var2) {
                        break L9;
                      } else {
                        if (var2 != 35) {
                          L10: {
                            if (var2 != -225) {
                              if (var2 != 225) {
                                if (-227 != var2) {
                                  if (228 != var2) {
                                    if (-228 != var2) {
                                      if (var2 == 192) {
                                        break L10;
                                      } else {
                                        if (-194 == var2) {
                                          break L10;
                                        } else {
                                          if (-195 == (var2 ^ -1)) {
                                            break L10;
                                          } else {
                                            if ((var2 ^ -1) != -197) {
                                              if (var2 == -196) {
                                                break L10;
                                              } else {
                                                L11: {
                                                  if (232 == var2) {
                                                    break L11;
                                                  } else {
                                                    if (233 != var2) {
                                                      if (-235 == var2) {
                                                        break L11;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L11;
                                                        } else {
                                                          if (200 == var2) {
                                                            break L11;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (202 == var2) {
                                                                break L11;
                                                              } else {
                                                                if (-204 != (var2 ^ -1)) {
                                                                  L12: {
                                                                    if (var2 == -238) {
                                                                      break L12;
                                                                    } else {
                                                                      if (238 != var2) {
                                                                        if (239 != var2) {
                                                                          if (-206 == var2) {
                                                                            break L12;
                                                                          } else {
                                                                            if (206 != var2) {
                                                                              if ((var2 ^ -1) != -208) {
                                                                                L13: {
                                                                                  if (242 == var2) {
                                                                                    break L13;
                                                                                  } else {
                                                                                    if (var2 != -244) {
                                                                                      if (-245 != var2) {
                                                                                        if (var2 == 246) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          if (-246 == (var2 ^ -1)) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            if ((var2 ^ -1) != -211) {
                                                                                              if ((var2 ^ -1) == -212) {
                                                                                                break L13;
                                                                                              } else {
                                                                                                if (212 != var2) {
                                                                                                  if (var2 != -215) {
                                                                                                    if (-214 == var2) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      L14: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L14;
                                                                                                        } else {
                                                                                                          if ((var2 ^ -1) != -251) {
                                                                                                            if ((var2 ^ -1) == -252) {
                                                                                                              break L14;
                                                                                                            } else {
                                                                                                              if (var2 != -253) {
                                                                                                                if (-218 != var2) {
                                                                                                                  if (var2 != -219) {
                                                                                                                    if (var2 == 219) {
                                                                                                                      break L14;
                                                                                                                    } else {
                                                                                                                      if (-221 != var2) {
                                                                                                                        L15: {
                                                                                                                          if (var2 == -232) {
                                                                                                                            break L15;
                                                                                                                          } else {
                                                                                                                            if (var2 == -200) {
                                                                                                                              break L15;
                                                                                                                            } else {
                                                                                                                              L16: {
                                                                                                                                if (255 == var2) {
                                                                                                                                  break L16;
                                                                                                                                } else {
                                                                                                                                  if (var2 == 376) {
                                                                                                                                    break L16;
                                                                                                                                  } else {
                                                                                                                                    if (-242 == var2) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (-210 != var2) {
                                                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        return 'n';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L13;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L13;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              break L13;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L13;
                                                                                      }
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L12;
                                                                              }
                                                                            } else {
                                                                              break L12;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L12;
                                                                        }
                                                                      } else {
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                            } else {
                                                              break L11;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          return 'a';
                        } else {
                          break L9;
                        }
                      }
                    }
                    return param1;
                  } else {
                    return param1;
                  }
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    final static void a(int param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ib.field_s.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!hn.a(false, param1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                            if (param0 == -7235) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            field_a = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        bl.a((Throwable) null, (byte) 79, "MGR1: " + param1);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kb(0);
        field_a = new int[8192];
    }
}

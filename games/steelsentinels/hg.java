/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static long[] field_c;
    boolean field_d;
    static wk[] field_i;
    String field_b;
    String field_g;
    static boolean field_h;
    static String field_f;
    static String field_a;
    static gh field_e;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_43_0 = 0;
        int stackIn_177_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_170_0 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          si.field_m = si.field_m + 1;
          if (pe.field_d != 0) {
            break L0;
          } else {
            if (0 == jj.field_c) {
              jj.field_c = pi.field_c;
              pe.field_d = oh.field_f;
              break L0;
            } else {
              L1: {
                if (param1 == null) {
                  if (rc.field_b == null) {
                    break L1;
                  } else {
                    L2: {
                      if (pg.field_A) {
                        break L2;
                      } else {
                        if (si.field_m >= ik.field_c) {
                          break L2;
                        } else {
                          if (!ik.field_a) {
                            break L2;
                          } else {
                            t.field_l = jj.field_c;
                            si.field_m = 0;
                            eh.field_a = pe.field_d;
                            break L2;
                          }
                        }
                      }
                    }
                    if (param0 <= -125) {
                      L3: {
                        L4: {
                          rc.field_b = param1;
                          if (!pg.field_A) {
                            break L4;
                          } else {
                            if (si.field_m != ql.field_Ub) {
                              break L4;
                            } else {
                              si.field_m = 0;
                              pg.field_A = false;
                              pe.field_d = -1;
                              jj.field_c = -1;
                              break L3;
                            }
                          }
                        }
                        pe.field_d = -1;
                        jj.field_c = -1;
                        break L3;
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!param1.equals((Object) (Object) rc.field_b)) {
                    break L1;
                  } else {
                    L5: {
                      if (pg.field_A) {
                        break L5;
                      } else {
                        if (si.field_m >= ik.field_c) {
                          break L5;
                        } else {
                          if (!ik.field_a) {
                            break L5;
                          } else {
                            t.field_l = jj.field_c;
                            si.field_m = 0;
                            eh.field_a = pe.field_d;
                            break L5;
                          }
                        }
                      }
                    }
                    if (param0 <= -125) {
                      L6: {
                        L7: {
                          rc.field_b = param1;
                          if (!pg.field_A) {
                            break L7;
                          } else {
                            if (si.field_m != ql.field_Ub) {
                              break L7;
                            } else {
                              si.field_m = 0;
                              pg.field_A = false;
                              pe.field_d = -1;
                              jj.field_c = -1;
                              break L6;
                            }
                          }
                        }
                        pe.field_d = -1;
                        jj.field_c = -1;
                        break L6;
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              L8: {
                if (!pg.field_A) {
                  if (ik.field_c <= si.field_m) {
                    if (si.field_m < ni.field_c + ik.field_c) {
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L8;
                    } else {
                      stackOut_40_0 = 0;
                      stackIn_43_0 = stackOut_40_0;
                      break L8;
                    }
                  } else {
                    stackOut_38_0 = 0;
                    stackIn_43_0 = stackOut_38_0;
                    break L8;
                  }
                } else {
                  stackOut_36_0 = 0;
                  stackIn_43_0 = stackOut_36_0;
                  break L8;
                }
              }
              L9: {
                var2 = stackIn_43_0;
                if (param1 != null) {
                  break L9;
                } else {
                  break L9;
                }
              }
              si.field_m = 0;
              L10: {
                if (param1 != null) {
                  pg.field_A = false;
                  t.field_l = jj.field_c;
                  eh.field_a = pe.field_d;
                  if (pg.field_A) {
                    break L10;
                  } else {
                    if (si.field_m >= ik.field_c) {
                      break L10;
                    } else {
                      if (!ik.field_a) {
                        break L10;
                      } else {
                        t.field_l = jj.field_c;
                        si.field_m = 0;
                        eh.field_a = pe.field_d;
                        break L10;
                      }
                    }
                  }
                } else {
                  if (var2 != 0) {
                    pg.field_A = true;
                    t.field_l = jj.field_c;
                    eh.field_a = pe.field_d;
                    if (pg.field_A) {
                      break L10;
                    } else {
                      if (si.field_m >= ik.field_c) {
                        break L10;
                      } else {
                        if (!ik.field_a) {
                          break L10;
                        } else {
                          t.field_l = jj.field_c;
                          si.field_m = 0;
                          eh.field_a = pe.field_d;
                          break L10;
                        }
                      }
                    }
                  } else {
                    t.field_l = jj.field_c;
                    eh.field_a = pe.field_d;
                    if (pg.field_A) {
                      break L10;
                    } else {
                      if (si.field_m >= ik.field_c) {
                        break L10;
                      } else {
                        if (!ik.field_a) {
                          break L10;
                        } else {
                          t.field_l = jj.field_c;
                          si.field_m = 0;
                          eh.field_a = pe.field_d;
                          break L10;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 <= -125) {
                L11: {
                  L12: {
                    rc.field_b = param1;
                    if (!pg.field_A) {
                      break L12;
                    } else {
                      if (si.field_m != ql.field_Ub) {
                        break L12;
                      } else {
                        si.field_m = 0;
                        pg.field_A = false;
                        pe.field_d = -1;
                        jj.field_c = -1;
                        break L11;
                      }
                    }
                  }
                  pe.field_d = -1;
                  jj.field_c = -1;
                  break L11;
                }
                return;
              } else {
                return;
              }
            }
          }
        }
        L13: {
          if (param1 == null) {
            if (rc.field_b == null) {
              break L13;
            } else {
              L14: {
                if (pg.field_A) {
                  break L14;
                } else {
                  if (si.field_m >= ik.field_c) {
                    break L14;
                  } else {
                    if (!ik.field_a) {
                      break L14;
                    } else {
                      t.field_l = jj.field_c;
                      si.field_m = 0;
                      eh.field_a = pe.field_d;
                      if (param0 <= -125) {
                        rc.field_b = param1;
                        if (pg.field_A) {
                          if (si.field_m == ql.field_Ub) {
                            si.field_m = 0;
                            pg.field_A = false;
                            pe.field_d = -1;
                            jj.field_c = -1;
                            return;
                          } else {
                            pe.field_d = -1;
                            jj.field_c = -1;
                            return;
                          }
                        } else {
                          pe.field_d = -1;
                          jj.field_c = -1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 <= -125) {
                rc.field_b = param1;
                if (pg.field_A) {
                  if (si.field_m == ql.field_Ub) {
                    si.field_m = 0;
                    pg.field_A = false;
                    pe.field_d = -1;
                    jj.field_c = -1;
                    return;
                  } else {
                    pe.field_d = -1;
                    jj.field_c = -1;
                    return;
                  }
                } else {
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (!param1.equals((Object) (Object) rc.field_b)) {
              break L13;
            } else {
              L15: {
                if (pg.field_A) {
                  break L15;
                } else {
                  if (si.field_m >= ik.field_c) {
                    break L15;
                  } else {
                    if (!ik.field_a) {
                      break L15;
                    } else {
                      t.field_l = jj.field_c;
                      si.field_m = 0;
                      eh.field_a = pe.field_d;
                      if (param0 <= -125) {
                        rc.field_b = param1;
                        if (pg.field_A) {
                          if (si.field_m != ql.field_Ub) {
                            pe.field_d = -1;
                            jj.field_c = -1;
                            return;
                          } else {
                            si.field_m = 0;
                            pg.field_A = false;
                            pe.field_d = -1;
                            jj.field_c = -1;
                            return;
                          }
                        } else {
                          pe.field_d = -1;
                          jj.field_c = -1;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 <= -125) {
                rc.field_b = param1;
                if (pg.field_A) {
                  if (si.field_m != ql.field_Ub) {
                    pe.field_d = -1;
                    jj.field_c = -1;
                    return;
                  } else {
                    si.field_m = 0;
                    pg.field_A = false;
                    pe.field_d = -1;
                    jj.field_c = -1;
                    return;
                  }
                } else {
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        L16: {
          if (!pg.field_A) {
            if (ik.field_c <= si.field_m) {
              if (si.field_m < ni.field_c + ik.field_c) {
                stackOut_175_0 = 1;
                stackIn_177_0 = stackOut_175_0;
                break L16;
              } else {
                stackOut_174_0 = 0;
                stackIn_177_0 = stackOut_174_0;
                break L16;
              }
            } else {
              stackOut_172_0 = 0;
              stackIn_177_0 = stackOut_172_0;
              break L16;
            }
          } else {
            stackOut_170_0 = 0;
            stackIn_177_0 = stackOut_170_0;
            break L16;
          }
        }
        L17: {
          var2 = stackIn_177_0;
          if (param1 == null) {
            si.field_m = 0;
            break L17;
          } else {
            if (pg.field_A) {
              si.field_m = ik.field_c;
              break L17;
            } else {
              if (var2 != 0) {
                L18: {
                  si.field_m = ik.field_c;
                  if (param1 != null) {
                    pg.field_A = false;
                    t.field_l = jj.field_c;
                    eh.field_a = pe.field_d;
                    break L18;
                  } else {
                    if (var2 != 0) {
                      pg.field_A = true;
                      t.field_l = jj.field_c;
                      eh.field_a = pe.field_d;
                      break L18;
                    } else {
                      t.field_l = jj.field_c;
                      eh.field_a = pe.field_d;
                      break L18;
                    }
                  }
                }
                L19: {
                  if (pg.field_A) {
                    break L19;
                  } else {
                    if (si.field_m >= ik.field_c) {
                      break L19;
                    } else {
                      if (!ik.field_a) {
                        break L19;
                      } else {
                        t.field_l = jj.field_c;
                        si.field_m = 0;
                        eh.field_a = pe.field_d;
                        break L19;
                      }
                    }
                  }
                }
                if (param0 <= -125) {
                  L20: {
                    rc.field_b = param1;
                    if (!pg.field_A) {
                      break L20;
                    } else {
                      if (si.field_m != ql.field_Ub) {
                        break L20;
                      } else {
                        si.field_m = 0;
                        pg.field_A = false;
                        break L20;
                      }
                    }
                  }
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                } else {
                  return;
                }
              } else {
                si.field_m = 0;
                break L17;
              }
            }
          }
        }
        if (param1 != null) {
          pg.field_A = false;
          L21: {
            t.field_l = jj.field_c;
            eh.field_a = pe.field_d;
            if (pg.field_A) {
              break L21;
            } else {
              if (si.field_m >= ik.field_c) {
                break L21;
              } else {
                if (!ik.field_a) {
                  break L21;
                } else {
                  t.field_l = jj.field_c;
                  si.field_m = 0;
                  eh.field_a = pe.field_d;
                  if (param0 > -125) {
                    return;
                  } else {
                    L22: {
                      rc.field_b = param1;
                      if (!pg.field_A) {
                        break L22;
                      } else {
                        if (si.field_m != ql.field_Ub) {
                          break L22;
                        } else {
                          si.field_m = 0;
                          pg.field_A = false;
                          break L22;
                        }
                      }
                    }
                    pe.field_d = -1;
                    jj.field_c = -1;
                    return;
                  }
                }
              }
            }
          }
          if (param0 <= -125) {
            rc.field_b = param1;
            if (pg.field_A) {
              if (si.field_m == ql.field_Ub) {
                si.field_m = 0;
                pg.field_A = false;
                pe.field_d = -1;
                jj.field_c = -1;
                return;
              } else {
                pe.field_d = -1;
                jj.field_c = -1;
                return;
              }
            } else {
              pe.field_d = -1;
              jj.field_c = -1;
              return;
            }
          } else {
            return;
          }
        } else {
          if (var2 != 0) {
            pg.field_A = true;
            L23: {
              t.field_l = jj.field_c;
              eh.field_a = pe.field_d;
              if (pg.field_A) {
                break L23;
              } else {
                if (si.field_m >= ik.field_c) {
                  break L23;
                } else {
                  if (!ik.field_a) {
                    break L23;
                  } else {
                    t.field_l = jj.field_c;
                    si.field_m = 0;
                    eh.field_a = pe.field_d;
                    if (param0 > -125) {
                      return;
                    } else {
                      L24: {
                        rc.field_b = param1;
                        if (!pg.field_A) {
                          break L24;
                        } else {
                          if (si.field_m != ql.field_Ub) {
                            break L24;
                          } else {
                            si.field_m = 0;
                            pg.field_A = false;
                            break L24;
                          }
                        }
                      }
                      pe.field_d = -1;
                      jj.field_c = -1;
                      return;
                    }
                  }
                }
              }
            }
            if (param0 <= -125) {
              rc.field_b = param1;
              if (pg.field_A) {
                if (si.field_m == ql.field_Ub) {
                  si.field_m = 0;
                  pg.field_A = false;
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                } else {
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                }
              } else {
                pe.field_d = -1;
                jj.field_c = -1;
                return;
              }
            } else {
              return;
            }
          } else {
            L25: {
              t.field_l = jj.field_c;
              eh.field_a = pe.field_d;
              if (pg.field_A) {
                break L25;
              } else {
                if (si.field_m >= ik.field_c) {
                  break L25;
                } else {
                  if (!ik.field_a) {
                    break L25;
                  } else {
                    t.field_l = jj.field_c;
                    si.field_m = 0;
                    eh.field_a = pe.field_d;
                    break L25;
                  }
                }
              }
            }
            if (param0 <= -125) {
              rc.field_b = param1;
              if (pg.field_A) {
                if (si.field_m == ql.field_Ub) {
                  si.field_m = 0;
                  pg.field_A = false;
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                } else {
                  pe.field_d = -1;
                  jj.field_c = -1;
                  return;
                }
              } else {
                pe.field_d = -1;
                jj.field_c = -1;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        db.a(-1, (java.awt.Component) (Object) param1);
        al.a(true, (java.awt.Component) (Object) param1);
        if (null == nc.field_j) {
          if (param0 == -93) {
            return;
          } else {
            field_h = true;
            return;
          }
        } else {
          nc.field_j.a((java.awt.Component) (Object) param1, false);
          if (param0 != -93) {
            field_h = true;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_e = null;
        field_i = null;
        field_c = null;
        field_f = null;
        if (param0 >= 82) {
          field_a = null;
          return;
        } else {
          var2 = null;
          hg.a((byte) 122, (java.awt.Canvas) null);
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
        field_h = false;
        field_f = "Go Back";
        field_a = "FULL ACCESS";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    static tf field_b;
    static ii field_e;
    static boolean field_d;
    static int field_a;
    static int field_c;
    static String field_f;

    final static void a(int param0, boolean param1) {
        pc var2 = null;
        var2 = aa.field_f;
        var2.g(param0, 15514);
        var2.e(160, 2);
        var2.e(160, 4);
        if (!param1) {
          int discarded$2 = ro.b(16, true);
          var2.e(160, hk.a((byte) -102));
          return;
        } else {
          var2.e(160, hk.a((byte) -102));
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        if (param0) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        pc var2 = null;
        var2 = aa.field_f;
        var2.g(param1, 15514);
        if (param0 <= 124) {
          return;
        } else {
          var2.e(160, 1);
          var2.e(160, 2);
          return;
        }
    }

    final static void a(String[] args, int param1) {
        if (fm.field_b == null) {
          if (param1 != 2) {
            return;
          } else {
            L0: {
              if (aa.field_c != null) {
                aa.field_c.field_S.a((byte) -90, args);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          fm.field_b.field_W.a((byte) -98, args);
          if (param1 != 2) {
            return;
          } else {
            L1: {
              if (aa.field_c != null) {
                aa.field_c.field_S.a((byte) -90, args);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    final static void a(boolean param0, tf[][] param1, int param2, int param3, fm param4, String[] param5, int[] param6, String[][] param7, hh[] param8, int param9, int[] param10, byte[] param11, String[][] param12, fm param13, tf[][] param14, byte[] param15, fm param16) {
        Object var18 = null;
        Object var19 = null;
        var19 = null;
        d.a(param16, param13, true, param11, param7, param2, param8, param6, (String[]) null, 1, param0, param12, param9, param10, param1, param4, param5, param15, param14);
        if (param3 == -15690) {
          return;
        } else {
          var18 = null;
          ro.a((String[]) null, -104);
          return;
        }
    }

    final static int b(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        oe.field_Sb = oe.field_Sb + 65536;
        L0: while (true) {
          if (fp.a(true, ui.field_j, oe.field_Sb) < 65536) {
            L1: {
              var2 = -1;
              if (wg.field_g != null) {
                var2 = wg.field_g.length;
                break L1;
              } else {
                if (li.field_a == null) {
                  break L1;
                } else {
                  var2 = li.field_a.length;
                  break L1;
                }
              }
            }
            L2: {
              if (-1 != var2) {
                L3: {
                  if (ui.field_a > jn.field_q) {
                    jn.field_q = jn.field_q + 1;
                    if (ui.field_k >= jn.field_q) {
                      if (jn.field_q < ui.field_a) {
                        break L3;
                      } else {
                        if (wg.field_g[(ae.field_b + 1) % var2] != null) {
                          break L3;
                        } else {
                          jn.field_q = jn.field_q - 1;
                          break L3;
                        }
                      }
                    } else {
                      if (jn.field_q < ui.field_a) {
                        break L3;
                      } else {
                        if (wg.field_g[(ae.field_b + 1) % var2] != null) {
                          break L3;
                        } else {
                          jn.field_q = jn.field_q - 1;
                          break L3;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (ui.field_a > jn.field_q) {
                    break L4;
                  } else {
                    L5: {
                      jc.field_b = ae.field_b;
                      if (!pm.field_e) {
                        ae.field_b = ae.field_b - 1;
                        if (ae.field_b < 0) {
                          ae.field_b = ae.field_b + var2;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        ae.field_b = ae.field_b + 1;
                        if (ae.field_b >= var2) {
                          ae.field_b = ae.field_b - var2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    jn.field_q = jn.field_q - ui.field_a;
                    break L4;
                  }
                }
                if (jn.field_q > ui.field_k) {
                  pm.field_e = true;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L6: {
              if (param0 < -21) {
                break L6;
              } else {
                field_c = 69;
                break L6;
              }
            }
            if (gp.field_Kb != null) {
              var3 = 357 - gp.field_Kb.field_B / 2;
              var4 = 0;
              if (-1 != (nm.field_c ^ -1)) {
                L7: {
                  if (ji.field_c <= var3) {
                    break L7;
                  } else {
                    if (ji.field_c < gp.field_Kb.field_E + var3) {
                      L8: {
                        if (-gp.field_Kb.field_F + 269 >= uo.field_a) {
                          break L8;
                        } else {
                          if (269 <= uo.field_a) {
                            break L8;
                          } else {
                            jn.field_q = ui.field_a;
                            pm.field_e = false;
                            var4 = 1;
                            break L8;
                          }
                        }
                      }
                      if (586 >= uo.field_a) {
                        break L7;
                      } else {
                        if (uo.field_a < 586 + gp.field_Kb.field_F) {
                          var4 = 1;
                          pm.field_e = true;
                          jn.field_q = ui.field_a;
                          break L7;
                        } else {
                          L9: {
                            if (var4 != 0) {
                              break L9;
                            } else {
                              if (jn.field_q <= ui.field_k) {
                                break L9;
                              } else {
                                if (bg.field_k <= var3) {
                                  break L9;
                                } else {
                                  if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                                    L10: {
                                      if (uf.field_d <= -gp.field_Kb.field_F + 269) {
                                        break L10;
                                      } else {
                                        if (269 <= uf.field_d) {
                                          break L10;
                                        } else {
                                          jn.field_q = ui.field_k;
                                          break L10;
                                        }
                                      }
                                    }
                                    if (uf.field_d <= 586) {
                                      break L9;
                                    } else {
                                      if (uf.field_d < gp.field_Kb.field_F + 586) {
                                        jn.field_q = ui.field_k;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          if (param1) {
                            L11: {
                              a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                              if (!a.field_I.a(19)) {
                                break L11;
                              } else {
                                if (a.field_I.field_j == 0) {
                                  return 3;
                                } else {
                                  if ((a.field_I.field_j ^ -1) == -2) {
                                    return 2;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            L12: while (true) {
                              if (bh.b((byte) 116)) {
                                L13: {
                                  a.field_I.a(99, 0);
                                  if (a.field_I.a(57)) {
                                    if (-1 != (a.field_I.field_j ^ -1)) {
                                      if (a.field_I.field_j == 1) {
                                        return 1;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                                if (ke.field_a != 13) {
                                  continue L12;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 0;
                              }
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    } else {
                      L14: {
                        if (var4 != 0) {
                          break L14;
                        } else {
                          if (jn.field_q <= ui.field_k) {
                            break L14;
                          } else {
                            if (bg.field_k <= var3) {
                              break L14;
                            } else {
                              if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                                L15: {
                                  if (uf.field_d <= -gp.field_Kb.field_F + 269) {
                                    break L15;
                                  } else {
                                    if (269 <= uf.field_d) {
                                      break L15;
                                    } else {
                                      jn.field_q = ui.field_k;
                                      break L15;
                                    }
                                  }
                                }
                                if (uf.field_d <= 586) {
                                  break L14;
                                } else {
                                  if (uf.field_d < gp.field_Kb.field_F + 586) {
                                    jn.field_q = ui.field_k;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      if (param1) {
                        L16: {
                          a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                          if (!a.field_I.a(19)) {
                            break L16;
                          } else {
                            if (a.field_I.field_j == 0) {
                              return 3;
                            } else {
                              if ((a.field_I.field_j ^ -1) == -2) {
                                return 2;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        L17: while (true) {
                          if (bh.b((byte) 116)) {
                            L18: {
                              a.field_I.a(99, 0);
                              if (a.field_I.a(57)) {
                                if (-1 != (a.field_I.field_j ^ -1)) {
                                  if (a.field_I.field_j == 1) {
                                    return 1;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                break L18;
                              }
                            }
                            if (ke.field_a != 13) {
                              continue L17;
                            } else {
                              return 1;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    }
                  }
                }
                if (var4 == 0) {
                  if (jn.field_q > ui.field_k) {
                    L19: {
                      if (bg.field_k <= var3) {
                        break L19;
                      } else {
                        if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                          L20: {
                            if (uf.field_d <= -gp.field_Kb.field_F + 269) {
                              break L20;
                            } else {
                              if (269 <= uf.field_d) {
                                break L20;
                              } else {
                                L21: {
                                  jn.field_q = ui.field_k;
                                  if (uf.field_d <= 586) {
                                    break L21;
                                  } else {
                                    if (uf.field_d < gp.field_Kb.field_F + 586) {
                                      jn.field_q = ui.field_k;
                                      break L21;
                                    } else {
                                      L22: {
                                        if (!param1) {
                                          break L22;
                                        } else {
                                          L23: {
                                            a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                            if (!a.field_I.a(19)) {
                                              break L23;
                                            } else {
                                              if (a.field_I.field_j == 0) {
                                                return 3;
                                              } else {
                                                if ((a.field_I.field_j ^ -1) == -2) {
                                                  return 2;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                          }
                                          L24: while (true) {
                                            if (!bh.b((byte) 116)) {
                                              break L22;
                                            } else {
                                              L25: {
                                                a.field_I.a(99, 0);
                                                if (a.field_I.a(57)) {
                                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                                    if (a.field_I.field_j == 1) {
                                                      return 1;
                                                    } else {
                                                      break L25;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L25;
                                                }
                                              }
                                              if (ke.field_a != 13) {
                                                continue L24;
                                              } else {
                                                return 1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return 0;
                                    }
                                  }
                                }
                                L26: {
                                  if (!param1) {
                                    break L26;
                                  } else {
                                    a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                    if (!a.field_I.a(19)) {
                                      L27: while (true) {
                                        if (!bh.b((byte) 116)) {
                                          break L26;
                                        } else {
                                          L28: {
                                            a.field_I.a(99, 0);
                                            if (a.field_I.a(57)) {
                                              if (-1 != (a.field_I.field_j ^ -1)) {
                                                if (a.field_I.field_j == 1) {
                                                  return 1;
                                                } else {
                                                  break L28;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L28;
                                            }
                                          }
                                          if (ke.field_a != 13) {
                                            continue L27;
                                          } else {
                                            return 1;
                                          }
                                        }
                                      }
                                    } else {
                                      if (a.field_I.field_j == 0) {
                                        return 3;
                                      } else {
                                        if ((a.field_I.field_j ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          L29: while (true) {
                                            if (!bh.b((byte) 116)) {
                                              return 0;
                                            } else {
                                              L30: {
                                                a.field_I.a(99, 0);
                                                if (a.field_I.a(57)) {
                                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                                    if (a.field_I.field_j == 1) {
                                                      return 1;
                                                    } else {
                                                      break L30;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L30;
                                                }
                                              }
                                              if (ke.field_a != 13) {
                                                continue L29;
                                              } else {
                                                return 1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                return 0;
                              }
                            }
                          }
                          if (uf.field_d <= 586) {
                            break L19;
                          } else {
                            if (uf.field_d < gp.field_Kb.field_F + 586) {
                              jn.field_q = ui.field_k;
                              break L19;
                            } else {
                              L31: {
                                if (!param1) {
                                  break L31;
                                } else {
                                  a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                  if (!a.field_I.a(19)) {
                                    L32: while (true) {
                                      if (!bh.b((byte) 116)) {
                                        break L31;
                                      } else {
                                        L33: {
                                          a.field_I.a(99, 0);
                                          if (a.field_I.a(57)) {
                                            if (-1 != (a.field_I.field_j ^ -1)) {
                                              if (a.field_I.field_j == 1) {
                                                return 1;
                                              } else {
                                                break L33;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L33;
                                          }
                                        }
                                        if (ke.field_a != 13) {
                                          continue L32;
                                        } else {
                                          return 1;
                                        }
                                      }
                                    }
                                  } else {
                                    if (a.field_I.field_j == 0) {
                                      return 3;
                                    } else {
                                      if ((a.field_I.field_j ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        L34: while (true) {
                                          if (!bh.b((byte) 116)) {
                                            return 0;
                                          } else {
                                            L35: {
                                              a.field_I.a(99, 0);
                                              if (a.field_I.a(57)) {
                                                if (-1 != (a.field_I.field_j ^ -1)) {
                                                  if (a.field_I.field_j == 1) {
                                                    return 1;
                                                  } else {
                                                    break L35;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              } else {
                                                break L35;
                                              }
                                            }
                                            if (ke.field_a != 13) {
                                              continue L34;
                                            } else {
                                              return 1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              return 0;
                            }
                          }
                        } else {
                          L36: {
                            if (!param1) {
                              break L36;
                            } else {
                              a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                              if (!a.field_I.a(19)) {
                                L37: while (true) {
                                  if (!bh.b((byte) 116)) {
                                    break L36;
                                  } else {
                                    L38: {
                                      a.field_I.a(99, 0);
                                      if (a.field_I.a(57)) {
                                        if (-1 != (a.field_I.field_j ^ -1)) {
                                          if (a.field_I.field_j == 1) {
                                            return 1;
                                          } else {
                                            break L38;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        break L38;
                                      }
                                    }
                                    if (ke.field_a != 13) {
                                      continue L37;
                                    } else {
                                      return 1;
                                    }
                                  }
                                }
                              } else {
                                if (a.field_I.field_j == 0) {
                                  return 3;
                                } else {
                                  if ((a.field_I.field_j ^ -1) == -2) {
                                    return 2;
                                  } else {
                                    L39: while (true) {
                                      if (!bh.b((byte) 116)) {
                                        return 0;
                                      } else {
                                        L40: {
                                          a.field_I.a(99, 0);
                                          if (a.field_I.a(57)) {
                                            if (-1 != (a.field_I.field_j ^ -1)) {
                                              if (a.field_I.field_j == 1) {
                                                return 1;
                                              } else {
                                                break L40;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L40;
                                          }
                                        }
                                        if (ke.field_a != 13) {
                                          continue L39;
                                        } else {
                                          return 1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return 0;
                        }
                      }
                    }
                    L41: {
                      if (!param1) {
                        break L41;
                      } else {
                        a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                        if (!a.field_I.a(19)) {
                          L42: while (true) {
                            if (!bh.b((byte) 116)) {
                              break L41;
                            } else {
                              L43: {
                                a.field_I.a(99, 0);
                                if (a.field_I.a(57)) {
                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                    if (a.field_I.field_j == 1) {
                                      return 1;
                                    } else {
                                      break L43;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L43;
                                }
                              }
                              if (ke.field_a != 13) {
                                continue L42;
                              } else {
                                return 1;
                              }
                            }
                          }
                        } else {
                          if (a.field_I.field_j == 0) {
                            return 3;
                          } else {
                            if (a.field_I.field_j == -2) {
                              return 2;
                            } else {
                              L44: while (true) {
                                if (!bh.b((byte) 116)) {
                                  return 0;
                                } else {
                                  L45: {
                                    a.field_I.a(99, 0);
                                    if (a.field_I.a(57)) {
                                      if (-1 != a.field_I.field_j) {
                                        if (a.field_I.field_j == 1) {
                                          return 1;
                                        } else {
                                          break L45;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    } else {
                                      break L45;
                                    }
                                  }
                                  if (ke.field_a != 13) {
                                    continue L44;
                                  } else {
                                    return 1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return 0;
                  } else {
                    L46: {
                      if (!param1) {
                        break L46;
                      } else {
                        a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                        if (!a.field_I.a(19)) {
                          L47: while (true) {
                            if (!bh.b((byte) 116)) {
                              break L46;
                            } else {
                              L48: {
                                a.field_I.a(99, 0);
                                if (a.field_I.a(57)) {
                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                    if (a.field_I.field_j == 1) {
                                      return 1;
                                    } else {
                                      break L48;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                              if (ke.field_a != 13) {
                                continue L47;
                              } else {
                                return 1;
                              }
                            }
                          }
                        } else {
                          if (a.field_I.field_j == 0) {
                            return 3;
                          } else {
                            if (a.field_I.field_j == -2) {
                              return 2;
                            } else {
                              L49: while (true) {
                                if (!bh.b((byte) 116)) {
                                  return 0;
                                } else {
                                  L50: {
                                    a.field_I.a(99, 0);
                                    if (a.field_I.a(57)) {
                                      if (-1 != a.field_I.field_j) {
                                        if (a.field_I.field_j == 1) {
                                          return 1;
                                        } else {
                                          break L50;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    } else {
                                      break L50;
                                    }
                                  }
                                  if (ke.field_a != 13) {
                                    continue L49;
                                  } else {
                                    return 1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return 0;
                  }
                } else {
                  if (param1) {
                    a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                    if (!a.field_I.a(19)) {
                      L51: while (true) {
                        if (!bh.b((byte) 116)) {
                          return 0;
                        } else {
                          L52: {
                            a.field_I.a(99, 0);
                            if (a.field_I.a(57)) {
                              if (-1 != (a.field_I.field_j ^ -1)) {
                                if (a.field_I.field_j == 1) {
                                  return 1;
                                } else {
                                  break L52;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L52;
                            }
                          }
                          if (ke.field_a != 13) {
                            continue L51;
                          } else {
                            return 1;
                          }
                        }
                      }
                    } else {
                      if (a.field_I.field_j == 0) {
                        return 3;
                      } else {
                        if (a.field_I.field_j != -2) {
                          L53: while (true) {
                            if (bh.b((byte) 116)) {
                              L54: {
                                a.field_I.a(99, 0);
                                if (a.field_I.a(57)) {
                                  if (-1 != a.field_I.field_j) {
                                    if (a.field_I.field_j == 1) {
                                      return 1;
                                    } else {
                                      break L54;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L54;
                                }
                              }
                              if (ke.field_a != 13) {
                                continue L53;
                              } else {
                                return 1;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 2;
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                L55: {
                  if (var4 != 0) {
                    break L55;
                  } else {
                    if (jn.field_q <= ui.field_k) {
                      break L55;
                    } else {
                      if (bg.field_k <= var3) {
                        break L55;
                      } else {
                        if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                          L56: {
                            if (uf.field_d <= -gp.field_Kb.field_F + 269) {
                              break L56;
                            } else {
                              if (269 <= uf.field_d) {
                                break L56;
                              } else {
                                L57: {
                                  jn.field_q = ui.field_k;
                                  if (uf.field_d <= 586) {
                                    break L57;
                                  } else {
                                    if (uf.field_d < gp.field_Kb.field_F + 586) {
                                      jn.field_q = ui.field_k;
                                      break L57;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                if (param1) {
                                  L58: {
                                    a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                    if (!a.field_I.a(19)) {
                                      break L58;
                                    } else {
                                      if (a.field_I.field_j == 0) {
                                        return 3;
                                      } else {
                                        if ((a.field_I.field_j ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          break L58;
                                        }
                                      }
                                    }
                                  }
                                  L59: while (true) {
                                    if (bh.b((byte) 116)) {
                                      L60: {
                                        a.field_I.a(99, 0);
                                        if (a.field_I.a(57)) {
                                          if (-1 != (a.field_I.field_j ^ -1)) {
                                            if (a.field_I.field_j == 1) {
                                              return 1;
                                            } else {
                                              break L60;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L60;
                                        }
                                      }
                                      if (ke.field_a != 13) {
                                        continue L59;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                          if (uf.field_d <= 586) {
                            break L55;
                          } else {
                            if (uf.field_d < gp.field_Kb.field_F + 586) {
                              jn.field_q = ui.field_k;
                              break L55;
                            } else {
                              if (param1) {
                                L61: {
                                  a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                  if (!a.field_I.a(19)) {
                                    break L61;
                                  } else {
                                    if (a.field_I.field_j == 0) {
                                      return 3;
                                    } else {
                                      if ((a.field_I.field_j ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                }
                                L62: while (true) {
                                  if (bh.b((byte) 116)) {
                                    L63: {
                                      a.field_I.a(99, 0);
                                      if (a.field_I.a(57)) {
                                        if (-1 != (a.field_I.field_j ^ -1)) {
                                          if (a.field_I.field_j == 1) {
                                            return 1;
                                          } else {
                                            break L63;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        break L63;
                                      }
                                    }
                                    if (ke.field_a != 13) {
                                      continue L62;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        } else {
                          if (param1) {
                            L64: {
                              a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                              if (!a.field_I.a(19)) {
                                break L64;
                              } else {
                                if (a.field_I.field_j == 0) {
                                  return 3;
                                } else {
                                  if ((a.field_I.field_j ^ -1) == -2) {
                                    return 2;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                            }
                            L65: while (true) {
                              if (bh.b((byte) 116)) {
                                L66: {
                                  a.field_I.a(99, 0);
                                  if (a.field_I.a(57)) {
                                    if (-1 != (a.field_I.field_j ^ -1)) {
                                      if (a.field_I.field_j == 1) {
                                        return 1;
                                      } else {
                                        break L66;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L66;
                                  }
                                }
                                if (ke.field_a != 13) {
                                  continue L65;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 0;
                              }
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                  }
                }
                if (param1) {
                  a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                  if (!a.field_I.a(19)) {
                    L67: while (true) {
                      if (bh.b((byte) 116)) {
                        L68: {
                          a.field_I.a(99, 0);
                          if (a.field_I.a(57)) {
                            if (-1 != (a.field_I.field_j ^ -1)) {
                              if (a.field_I.field_j == 1) {
                                return 1;
                              } else {
                                break L68;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            break L68;
                          }
                        }
                        if (ke.field_a != 13) {
                          continue L67;
                        } else {
                          return 1;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    if (a.field_I.field_j == 0) {
                      return 3;
                    } else {
                      if ((a.field_I.field_j ^ -1) != -2) {
                        L69: while (true) {
                          if (bh.b((byte) 116)) {
                            L70: {
                              a.field_I.a(99, 0);
                              if (a.field_I.a(57)) {
                                if (-1 != (a.field_I.field_j ^ -1)) {
                                  if (a.field_I.field_j == 1) {
                                    return 1;
                                  } else {
                                    break L70;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                break L70;
                              }
                            }
                            if (ke.field_a != 13) {
                              continue L69;
                            } else {
                              return 1;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 2;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (param1) {
                a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                if (!a.field_I.a(19)) {
                  L71: while (true) {
                    if (bh.b((byte) 116)) {
                      L72: {
                        a.field_I.a(99, 0);
                        if (a.field_I.a(57)) {
                          if (-1 != (a.field_I.field_j ^ -1)) {
                            if (a.field_I.field_j == 1) {
                              return 1;
                            } else {
                              break L72;
                            }
                          } else {
                            return 3;
                          }
                        } else {
                          break L72;
                        }
                      }
                      if (ke.field_a != 13) {
                        continue L71;
                      } else {
                        return 1;
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  if (a.field_I.field_j == 0) {
                    return 3;
                  } else {
                    if ((a.field_I.field_j ^ -1) != -2) {
                      L73: while (true) {
                        if (bh.b((byte) 116)) {
                          L74: {
                            a.field_I.a(99, 0);
                            if (a.field_I.a(57)) {
                              if (-1 != (a.field_I.field_j ^ -1)) {
                                if (a.field_I.field_j == 1) {
                                  return 1;
                                } else {
                                  break L74;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L74;
                            }
                          }
                          if (ke.field_a != 13) {
                            continue L73;
                          } else {
                            return 1;
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      return 2;
                    }
                  }
                }
              } else {
                return 0;
              }
            }
          } else {
            oe.field_Sb = oe.field_Sb - ui.field_j;
            qk.field_e = qk.field_e + 1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Twisted Logic";
    }
}

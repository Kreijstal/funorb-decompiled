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
                  if ((ui.field_a ^ -1) < (jn.field_q ^ -1)) {
                    L4: {
                      jn.field_q = jn.field_q + 1;
                      if (ui.field_k >= jn.field_q) {
                        break L4;
                      } else {
                        L5: {
                          if (null == wg.field_g) {
                            break L5;
                          } else {
                            if (null == wg.field_g[ae.field_b]) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        jn.field_q = jn.field_q - 1;
                        break L3;
                      }
                    }
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
                    break L3;
                  }
                }
                L6: {
                  if (ui.field_a > jn.field_q) {
                    break L6;
                  } else {
                    L7: {
                      jc.field_b = ae.field_b;
                      if (!pm.field_e) {
                        ae.field_b = ae.field_b - 1;
                        if (ae.field_b < 0) {
                          ae.field_b = ae.field_b + var2;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        ae.field_b = ae.field_b + 1;
                        if (ae.field_b >= var2) {
                          ae.field_b = ae.field_b - var2;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    jn.field_q = jn.field_q - ui.field_a;
                    break L6;
                  }
                }
                if ((jn.field_q ^ -1) < (ui.field_k ^ -1)) {
                  pm.field_e = true;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L8: {
              if (param0 < -21) {
                break L8;
              } else {
                field_c = 69;
                break L8;
              }
            }
            if (gp.field_Kb != null) {
              var3 = 357 - gp.field_Kb.field_B / 2;
              var4 = 0;
              if (-1 != (nm.field_c ^ -1)) {
                L9: {
                  if (ji.field_c <= var3) {
                    break L9;
                  } else {
                    if ((ji.field_c ^ -1) > (gp.field_Kb.field_E + var3 ^ -1)) {
                      L10: {
                        if (-gp.field_Kb.field_F + 269 >= uo.field_a) {
                          break L10;
                        } else {
                          if (269 <= uo.field_a) {
                            break L10;
                          } else {
                            jn.field_q = ui.field_a;
                            pm.field_e = false;
                            var4 = 1;
                            break L10;
                          }
                        }
                      }
                      if (586 >= uo.field_a) {
                        break L9;
                      } else {
                        if ((uo.field_a ^ -1) > (586 + gp.field_Kb.field_F ^ -1)) {
                          var4 = 1;
                          pm.field_e = true;
                          jn.field_q = ui.field_a;
                          break L9;
                        } else {
                          L11: {
                            if (var4 != 0) {
                              break L11;
                            } else {
                              if ((jn.field_q ^ -1) >= (ui.field_k ^ -1)) {
                                break L11;
                              } else {
                                if (bg.field_k <= var3) {
                                  break L11;
                                } else {
                                  if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                                    L12: {
                                      if ((uf.field_d ^ -1) >= (-gp.field_Kb.field_F + 269 ^ -1)) {
                                        break L12;
                                      } else {
                                        if (269 <= uf.field_d) {
                                          break L12;
                                        } else {
                                          jn.field_q = ui.field_k;
                                          break L12;
                                        }
                                      }
                                    }
                                    if (uf.field_d <= 586) {
                                      break L11;
                                    } else {
                                      if ((uf.field_d ^ -1) > (gp.field_Kb.field_F + 586 ^ -1)) {
                                        jn.field_q = ui.field_k;
                                        break L11;
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
                          }
                          L13: {
                            if (!param1) {
                              break L13;
                            } else {
                              L14: {
                                a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                if (!a.field_I.a(19)) {
                                  break L14;
                                } else {
                                  if ((a.field_I.field_j ^ -1) == -1) {
                                    return 3;
                                  } else {
                                    if ((a.field_I.field_j ^ -1) == -2) {
                                      return 2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L15: while (true) {
                                if (!bh.b((byte) 116)) {
                                  break L13;
                                } else {
                                  L16: {
                                    a.field_I.a(99, 0);
                                    if (a.field_I.a(57)) {
                                      if (-1 != (a.field_I.field_j ^ -1)) {
                                        if (a.field_I.field_j == 1) {
                                          return 1;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                  if (ke.field_a != 13) {
                                    continue L15;
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
                    } else {
                      L17: {
                        if (var4 != 0) {
                          break L17;
                        } else {
                          if ((jn.field_q ^ -1) >= (ui.field_k ^ -1)) {
                            break L17;
                          } else {
                            if (bg.field_k <= var3) {
                              break L17;
                            } else {
                              if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                                L18: {
                                  if ((uf.field_d ^ -1) >= (-gp.field_Kb.field_F + 269 ^ -1)) {
                                    break L18;
                                  } else {
                                    if (269 <= uf.field_d) {
                                      break L18;
                                    } else {
                                      jn.field_q = ui.field_k;
                                      break L18;
                                    }
                                  }
                                }
                                if (uf.field_d <= 586) {
                                  break L17;
                                } else {
                                  if ((uf.field_d ^ -1) > (gp.field_Kb.field_F + 586 ^ -1)) {
                                    jn.field_q = ui.field_k;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (!param1) {
                          break L19;
                        } else {
                          L20: {
                            a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                            if (!a.field_I.a(19)) {
                              break L20;
                            } else {
                              if ((a.field_I.field_j ^ -1) == -1) {
                                return 3;
                              } else {
                                if ((a.field_I.field_j ^ -1) == -2) {
                                  return 2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          L21: while (true) {
                            if (!bh.b((byte) 116)) {
                              break L19;
                            } else {
                              L22: {
                                a.field_I.a(99, 0);
                                if (a.field_I.a(57)) {
                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                    if (a.field_I.field_j == 1) {
                                      return 1;
                                    } else {
                                      break L22;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L22;
                                }
                              }
                              if (ke.field_a != 13) {
                                continue L21;
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
                if (var4 == 0) {
                  if ((jn.field_q ^ -1) < (ui.field_k ^ -1)) {
                    L23: {
                      if (bg.field_k <= var3) {
                        break L23;
                      } else {
                        if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                          L24: {
                            if ((uf.field_d ^ -1) >= (-gp.field_Kb.field_F + 269 ^ -1)) {
                              break L24;
                            } else {
                              if (269 <= uf.field_d) {
                                break L24;
                              } else {
                                L25: {
                                  jn.field_q = ui.field_k;
                                  if (uf.field_d <= 586) {
                                    break L25;
                                  } else {
                                    if ((uf.field_d ^ -1) > (gp.field_Kb.field_F + 586 ^ -1)) {
                                      jn.field_q = ui.field_k;
                                      break L25;
                                    } else {
                                      L26: {
                                        if (!param1) {
                                          break L26;
                                        } else {
                                          L27: {
                                            a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                            if (!a.field_I.a(19)) {
                                              break L27;
                                            } else {
                                              if ((a.field_I.field_j ^ -1) == -1) {
                                                return 3;
                                              } else {
                                                if ((a.field_I.field_j ^ -1) == -2) {
                                                  return 2;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                          L28: while (true) {
                                            if (!bh.b((byte) 116)) {
                                              break L26;
                                            } else {
                                              L29: {
                                                a.field_I.a(99, 0);
                                                if (a.field_I.a(57)) {
                                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                                    if (a.field_I.field_j == 1) {
                                                      return 1;
                                                    } else {
                                                      break L29;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L29;
                                                }
                                              }
                                              if (ke.field_a != 13) {
                                                continue L28;
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
                                L30: {
                                  if (!param1) {
                                    break L30;
                                  } else {
                                    a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                    if (!a.field_I.a(19)) {
                                      L31: while (true) {
                                        if (!bh.b((byte) 116)) {
                                          break L30;
                                        } else {
                                          L32: {
                                            a.field_I.a(99, 0);
                                            if (a.field_I.a(57)) {
                                              if (-1 != (a.field_I.field_j ^ -1)) {
                                                if (a.field_I.field_j == 1) {
                                                  return 1;
                                                } else {
                                                  break L32;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L32;
                                            }
                                          }
                                          if (ke.field_a != 13) {
                                            continue L31;
                                          } else {
                                            return 1;
                                          }
                                        }
                                      }
                                    } else {
                                      if ((a.field_I.field_j ^ -1) == -1) {
                                        return 3;
                                      } else {
                                        if ((a.field_I.field_j ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          L33: while (true) {
                                            if (!bh.b((byte) 116)) {
                                              return 0;
                                            } else {
                                              L34: {
                                                a.field_I.a(99, 0);
                                                if (a.field_I.a(57)) {
                                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                                    if (a.field_I.field_j == 1) {
                                                      return 1;
                                                    } else {
                                                      break L34;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L34;
                                                }
                                              }
                                              if (ke.field_a != 13) {
                                                continue L33;
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
                            break L23;
                          } else {
                            if ((uf.field_d ^ -1) > (gp.field_Kb.field_F + 586 ^ -1)) {
                              jn.field_q = ui.field_k;
                              break L23;
                            } else {
                              L35: {
                                if (!param1) {
                                  break L35;
                                } else {
                                  a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                  if (!a.field_I.a(19)) {
                                    L36: while (true) {
                                      if (!bh.b((byte) 116)) {
                                        break L35;
                                      } else {
                                        L37: {
                                          a.field_I.a(99, 0);
                                          if (a.field_I.a(57)) {
                                            if (-1 != (a.field_I.field_j ^ -1)) {
                                              if (a.field_I.field_j == 1) {
                                                return 1;
                                              } else {
                                                break L37;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L37;
                                          }
                                        }
                                        if (ke.field_a != 13) {
                                          continue L36;
                                        } else {
                                          return 1;
                                        }
                                      }
                                    }
                                  } else {
                                    if ((a.field_I.field_j ^ -1) == -1) {
                                      return 3;
                                    } else {
                                      if ((a.field_I.field_j ^ -1) == -2) {
                                        return 2;
                                      } else {
                                        L38: while (true) {
                                          if (!bh.b((byte) 116)) {
                                            return 0;
                                          } else {
                                            L39: {
                                              a.field_I.a(99, 0);
                                              if (a.field_I.a(57)) {
                                                if (-1 != (a.field_I.field_j ^ -1)) {
                                                  if (a.field_I.field_j == 1) {
                                                    return 1;
                                                  } else {
                                                    break L39;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              } else {
                                                break L39;
                                              }
                                            }
                                            if (ke.field_a != 13) {
                                              continue L38;
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
                          L40: {
                            if (!param1) {
                              break L40;
                            } else {
                              a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                              if (!a.field_I.a(19)) {
                                L41: while (true) {
                                  if (!bh.b((byte) 116)) {
                                    break L40;
                                  } else {
                                    L42: {
                                      a.field_I.a(99, 0);
                                      if (a.field_I.a(57)) {
                                        if (-1 != (a.field_I.field_j ^ -1)) {
                                          if (a.field_I.field_j == 1) {
                                            return 1;
                                          } else {
                                            break L42;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        break L42;
                                      }
                                    }
                                    if (ke.field_a != 13) {
                                      continue L41;
                                    } else {
                                      return 1;
                                    }
                                  }
                                }
                              } else {
                                if ((a.field_I.field_j ^ -1) == -1) {
                                  return 3;
                                } else {
                                  if ((a.field_I.field_j ^ -1) == -2) {
                                    return 2;
                                  } else {
                                    L43: while (true) {
                                      if (!bh.b((byte) 116)) {
                                        return 0;
                                      } else {
                                        L44: {
                                          a.field_I.a(99, 0);
                                          if (a.field_I.a(57)) {
                                            if (-1 != (a.field_I.field_j ^ -1)) {
                                              if (a.field_I.field_j == 1) {
                                                return 1;
                                              } else {
                                                break L44;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L44;
                                          }
                                        }
                                        if (ke.field_a != 13) {
                                          continue L43;
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
                    L45: {
                      if (!param1) {
                        break L45;
                      } else {
                        a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                        if (!a.field_I.a(19)) {
                          L46: while (true) {
                            if (!bh.b((byte) 116)) {
                              break L45;
                            } else {
                              L47: {
                                a.field_I.a(99, 0);
                                if (a.field_I.a(57)) {
                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                    if (a.field_I.field_j == 1) {
                                      return 1;
                                    } else {
                                      break L47;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L47;
                                }
                              }
                              if (ke.field_a != 13) {
                                continue L46;
                              } else {
                                return 1;
                              }
                            }
                          }
                        } else {
                          if ((a.field_I.field_j ^ -1) == -1) {
                            return 3;
                          } else {
                            if ((a.field_I.field_j ^ -1) == -2) {
                              return 2;
                            } else {
                              L48: while (true) {
                                if (!bh.b((byte) 116)) {
                                  return 0;
                                } else {
                                  L49: {
                                    a.field_I.a(99, 0);
                                    if (a.field_I.a(57)) {
                                      if (-1 != (a.field_I.field_j ^ -1)) {
                                        if (a.field_I.field_j == 1) {
                                          return 1;
                                        } else {
                                          break L49;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    } else {
                                      break L49;
                                    }
                                  }
                                  if (ke.field_a != 13) {
                                    continue L48;
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
                    L50: {
                      if (!param1) {
                        break L50;
                      } else {
                        a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                        if (!a.field_I.a(19)) {
                          L51: while (true) {
                            if (!bh.b((byte) 116)) {
                              break L50;
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
                          if ((a.field_I.field_j ^ -1) == -1) {
                            return 3;
                          } else {
                            if ((a.field_I.field_j ^ -1) == -2) {
                              return 2;
                            } else {
                              L53: while (true) {
                                if (!bh.b((byte) 116)) {
                                  return 0;
                                } else {
                                  L54: {
                                    a.field_I.a(99, 0);
                                    if (a.field_I.a(57)) {
                                      if (-1 != (a.field_I.field_j ^ -1)) {
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
                  L55: {
                    if (!param1) {
                      break L55;
                    } else {
                      a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                      if (!a.field_I.a(19)) {
                        L56: while (true) {
                          if (!bh.b((byte) 116)) {
                            break L55;
                          } else {
                            L57: {
                              a.field_I.a(99, 0);
                              if (a.field_I.a(57)) {
                                if (-1 != (a.field_I.field_j ^ -1)) {
                                  if (a.field_I.field_j == 1) {
                                    return 1;
                                  } else {
                                    break L57;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                break L57;
                              }
                            }
                            if (ke.field_a != 13) {
                              continue L56;
                            } else {
                              return 1;
                            }
                          }
                        }
                      } else {
                        if ((a.field_I.field_j ^ -1) == -1) {
                          return 3;
                        } else {
                          if ((a.field_I.field_j ^ -1) == -2) {
                            return 2;
                          } else {
                            L58: while (true) {
                              if (!bh.b((byte) 116)) {
                                return 0;
                              } else {
                                L59: {
                                  a.field_I.a(99, 0);
                                  if (a.field_I.a(57)) {
                                    if (-1 != (a.field_I.field_j ^ -1)) {
                                      if (a.field_I.field_j == 1) {
                                        return 1;
                                      } else {
                                        break L59;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L59;
                                  }
                                }
                                if (ke.field_a != 13) {
                                  continue L58;
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
                L60: {
                  if (var4 != 0) {
                    break L60;
                  } else {
                    if ((jn.field_q ^ -1) >= (ui.field_k ^ -1)) {
                      break L60;
                    } else {
                      if (bg.field_k <= var3) {
                        break L60;
                      } else {
                        if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                          L61: {
                            if ((uf.field_d ^ -1) >= (-gp.field_Kb.field_F + 269 ^ -1)) {
                              break L61;
                            } else {
                              if (269 <= uf.field_d) {
                                break L61;
                              } else {
                                L62: {
                                  jn.field_q = ui.field_k;
                                  if (uf.field_d <= 586) {
                                    break L62;
                                  } else {
                                    if ((uf.field_d ^ -1) > (gp.field_Kb.field_F + 586 ^ -1)) {
                                      jn.field_q = ui.field_k;
                                      break L62;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                L63: {
                                  if (!param1) {
                                    break L63;
                                  } else {
                                    L64: {
                                      a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                      if (!a.field_I.a(19)) {
                                        break L64;
                                      } else {
                                        if ((a.field_I.field_j ^ -1) == -1) {
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
                                      if (!bh.b((byte) 116)) {
                                        break L63;
                                      } else {
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
                                      }
                                    }
                                  }
                                }
                                return 0;
                              }
                            }
                          }
                          if (uf.field_d <= 586) {
                            break L60;
                          } else {
                            if ((uf.field_d ^ -1) > (gp.field_Kb.field_F + 586 ^ -1)) {
                              jn.field_q = ui.field_k;
                              break L60;
                            } else {
                              L67: {
                                if (!param1) {
                                  break L67;
                                } else {
                                  L68: {
                                    a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                    if (!a.field_I.a(19)) {
                                      break L68;
                                    } else {
                                      if ((a.field_I.field_j ^ -1) == -1) {
                                        return 3;
                                      } else {
                                        if ((a.field_I.field_j ^ -1) == -2) {
                                          return 2;
                                        } else {
                                          break L68;
                                        }
                                      }
                                    }
                                  }
                                  L69: while (true) {
                                    if (!bh.b((byte) 116)) {
                                      break L67;
                                    } else {
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
                                    }
                                  }
                                }
                              }
                              return 0;
                            }
                          }
                        } else {
                          L71: {
                            if (!param1) {
                              break L71;
                            } else {
                              L72: {
                                a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                                if (!a.field_I.a(19)) {
                                  break L72;
                                } else {
                                  if ((a.field_I.field_j ^ -1) == -1) {
                                    return 3;
                                  } else {
                                    if ((a.field_I.field_j ^ -1) == -2) {
                                      return 2;
                                    } else {
                                      break L72;
                                    }
                                  }
                                }
                              }
                              L73: while (true) {
                                if (!bh.b((byte) 116)) {
                                  break L71;
                                } else {
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
                                }
                              }
                            }
                          }
                          return 0;
                        }
                      }
                    }
                  }
                }
                L75: {
                  if (!param1) {
                    break L75;
                  } else {
                    a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                    if (!a.field_I.a(19)) {
                      L76: while (true) {
                        if (!bh.b((byte) 116)) {
                          break L75;
                        } else {
                          L77: {
                            a.field_I.a(99, 0);
                            if (a.field_I.a(57)) {
                              if (-1 != (a.field_I.field_j ^ -1)) {
                                if (a.field_I.field_j == 1) {
                                  return 1;
                                } else {
                                  break L77;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L77;
                            }
                          }
                          if (ke.field_a != 13) {
                            continue L76;
                          } else {
                            return 1;
                          }
                        }
                      }
                    } else {
                      if ((a.field_I.field_j ^ -1) == -1) {
                        return 3;
                      } else {
                        if ((a.field_I.field_j ^ -1) == -2) {
                          return 2;
                        } else {
                          L78: while (true) {
                            if (!bh.b((byte) 116)) {
                              return 0;
                            } else {
                              L79: {
                                a.field_I.a(99, 0);
                                if (a.field_I.a(57)) {
                                  if (-1 != (a.field_I.field_j ^ -1)) {
                                    if (a.field_I.field_j == 1) {
                                      return 1;
                                    } else {
                                      break L79;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  break L79;
                                }
                              }
                              if (ke.field_a != 13) {
                                continue L78;
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
              L80: {
                if (!param1) {
                  break L80;
                } else {
                  a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                  if (!a.field_I.a(19)) {
                    L81: while (true) {
                      if (!bh.b((byte) 116)) {
                        break L80;
                      } else {
                        L82: {
                          a.field_I.a(99, 0);
                          if (a.field_I.a(57)) {
                            if (-1 != (a.field_I.field_j ^ -1)) {
                              if (a.field_I.field_j == 1) {
                                return 1;
                              } else {
                                break L82;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            break L82;
                          }
                        }
                        if (ke.field_a != 13) {
                          continue L81;
                        } else {
                          return 1;
                        }
                      }
                    }
                  } else {
                    if ((a.field_I.field_j ^ -1) == -1) {
                      return 3;
                    } else {
                      if ((a.field_I.field_j ^ -1) == -2) {
                        return 2;
                      } else {
                        L83: while (true) {
                          if (!bh.b((byte) 116)) {
                            return 0;
                          } else {
                            L84: {
                              a.field_I.a(99, 0);
                              if (a.field_I.a(57)) {
                                if (-1 != (a.field_I.field_j ^ -1)) {
                                  if (a.field_I.field_j == 1) {
                                    return 1;
                                  } else {
                                    break L84;
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                break L84;
                              }
                            }
                            if (ke.field_a != 13) {
                              continue L83;
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

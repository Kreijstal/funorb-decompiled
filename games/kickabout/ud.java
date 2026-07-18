/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends qt {
    static String[] field_A;
    static int[] field_B;

    ud() {
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        super.a((byte) -104, param1);
        var3 = 7 % ((param0 - 38) / 60);
        if (ra.field_G == null) {
          if (um.field_b) {
            if (ih.field_c != gk.field_g) {
              nm.a(hh.field_f, -76, wb.field_j, gk.field_g);
              if (!wh.field_q) {
                mj.a(140.0, 60, 448.0, 672.0);
                if (!ja.field_O) {
                  gg.h((byte) -125);
                  System.gc();
                  dd.a((byte) 98);
                  jm.a(-1, false, -2);
                  return;
                } else {
                  int discarded$4 = 13459;
                  nt.j();
                  gg.h((byte) -125);
                  System.gc();
                  dd.a((byte) 98);
                  jm.a(-1, false, -2);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (hh.field_f != rm.field_C) {
                nm.a(hh.field_f, -76, wb.field_j, gk.field_g);
                if (!wh.field_q) {
                  mj.a(140.0, 60, 448.0, 672.0);
                  if (!ja.field_O) {
                    gg.h((byte) -125);
                    System.gc();
                    dd.a((byte) 98);
                    jm.a(-1, false, -2);
                    return;
                  } else {
                    int discarded$5 = 13459;
                    nt.j();
                    gg.h((byte) -125);
                    System.gc();
                    dd.a((byte) 98);
                    jm.a(-1, false, -2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L0: {
                  if (vi.field_n) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L0;
                  }
                }
                if (stackIn_9_0 == (wb.field_j ? 1 : 0)) {
                  nm.a(hh.field_f, -76, wb.field_j, gk.field_g);
                  if (!wh.field_q) {
                    mj.a(140.0, 60, 448.0, 672.0);
                    if (!ja.field_O) {
                      gg.h((byte) -125);
                      System.gc();
                      dd.a((byte) 98);
                      jm.a(-1, false, -2);
                      return;
                    } else {
                      int discarded$6 = 13459;
                      nt.j();
                      gg.h((byte) -125);
                      System.gc();
                      dd.a((byte) 98);
                      jm.a(-1, false, -2);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (wh.field_q) {
                    return;
                  } else {
                    L1: {
                      mj.a(140.0, 60, 448.0, 672.0);
                      if (!ja.field_O) {
                        gg.h((byte) -125);
                        System.gc();
                        dd.a((byte) 98);
                        jm.a(-1, false, -2);
                        break L1;
                      } else {
                        int discarded$7 = 13459;
                        nt.j();
                        gg.h((byte) -125);
                        System.gc();
                        dd.a((byte) 98);
                        jm.a(-1, false, -2);
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            var4 = nv.field_E[ew.field_a];
            var5 = qt.field_r[ew.field_a];
            mj.a(256.0, 60, (double)var4, (double)var5);
            gg.h((byte) 93);
            jm.a(ig.field_d, false, -2);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = ud.a(-31, (String) null, true);
                break L1;
              }
            }
            if (!param2) {
              stackOut_5_0 = cv.field_f.a(param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = sf.field_F.a(param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ud.K(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean c(int param0, int param1) {
        int stackIn_26_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_138_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        if (param1 == 17030) {
          if (!ne.field_G[82]) {
            if (!ne.field_G[86]) {
              if (16 > param0) {
                if (32 > param0) {
                  L0: {
                    L1: {
                      if (param0 < 48) {
                        if (param0 < 64) {
                          if (param0 == 80) {
                            break L1;
                          } else {
                            if (param0 == 83) {
                              break L1;
                            } else {
                              if (param0 == 84) {
                                break L1;
                              } else {
                                if (param0 == 85) {
                                  break L1;
                                } else {
                                  if (59 == param0) {
                                    break L1;
                                  } else {
                                    if (param0 == 74) {
                                      break L1;
                                    } else {
                                      if (28 != param0) {
                                        stackOut_137_0 = 0;
                                        stackIn_138_0 = stackOut_137_0;
                                        break L0;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (param0 <= 73) {
                            break L1;
                          } else {
                            L2: {
                              L3: {
                                if (param0 == 80) {
                                  break L3;
                                } else {
                                  if (param0 == 83) {
                                    break L3;
                                  } else {
                                    if (param0 == 84) {
                                      break L3;
                                    } else {
                                      if (param0 == 85) {
                                        break L3;
                                      } else {
                                        if (59 == param0) {
                                          break L3;
                                        } else {
                                          if (param0 == 74) {
                                            break L3;
                                          } else {
                                            if (28 != param0) {
                                              stackOut_126_0 = 0;
                                              stackIn_127_0 = stackOut_126_0;
                                              break L2;
                                            } else {
                                              return true;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_125_0 = 1;
                              stackIn_127_0 = stackOut_125_0;
                              break L2;
                            }
                            return stackIn_127_0 != 0;
                          }
                        }
                      } else {
                        if (param0 <= 58) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              if (param0 < 64) {
                                if (param0 == 80) {
                                  break L5;
                                } else {
                                  if (param0 == 83) {
                                    break L5;
                                  } else {
                                    if (param0 == 84) {
                                      break L5;
                                    } else {
                                      if (param0 == 85) {
                                        break L5;
                                      } else {
                                        if (59 == param0) {
                                          break L5;
                                        } else {
                                          if (param0 == 74) {
                                            break L5;
                                          } else {
                                            if (28 != param0) {
                                              stackOut_113_0 = 0;
                                              stackIn_114_0 = stackOut_113_0;
                                              break L4;
                                            } else {
                                              return true;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 <= 73) {
                                  break L5;
                                } else {
                                  L6: {
                                    L7: {
                                      if (param0 == 80) {
                                        break L7;
                                      } else {
                                        if (param0 == 83) {
                                          break L7;
                                        } else {
                                          if (param0 == 84) {
                                            break L7;
                                          } else {
                                            if (param0 == 85) {
                                              break L7;
                                            } else {
                                              if (59 == param0) {
                                                break L7;
                                              } else {
                                                if (param0 == 74) {
                                                  break L7;
                                                } else {
                                                  if (28 != param0) {
                                                    stackOut_102_0 = 0;
                                                    stackIn_103_0 = stackOut_102_0;
                                                    break L6;
                                                  } else {
                                                    return true;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_101_0 = 1;
                                    stackIn_103_0 = stackOut_101_0;
                                    break L6;
                                  }
                                  return stackIn_103_0 != 0;
                                }
                              }
                            }
                            stackOut_112_0 = 1;
                            stackIn_114_0 = stackOut_112_0;
                            break L4;
                          }
                          return stackIn_114_0 != 0;
                        }
                      }
                    }
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L0;
                  }
                  return stackIn_138_0 != 0;
                } else {
                  if (param0 > 43) {
                    if (param0 < 48) {
                      L8: {
                        L9: {
                          if (param0 < 64) {
                            if (param0 == 80) {
                              break L9;
                            } else {
                              if (param0 == 83) {
                                break L9;
                              } else {
                                if (param0 == 84) {
                                  break L9;
                                } else {
                                  if (param0 == 85) {
                                    break L9;
                                  } else {
                                    if (59 == param0) {
                                      break L9;
                                    } else {
                                      if (param0 == 74) {
                                        break L9;
                                      } else {
                                        if (28 != param0) {
                                          stackOut_87_0 = 0;
                                          stackIn_88_0 = stackOut_87_0;
                                          break L8;
                                        } else {
                                          return true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (param0 <= 73) {
                              break L9;
                            } else {
                              L10: {
                                L11: {
                                  if (param0 == 80) {
                                    break L11;
                                  } else {
                                    if (param0 == 83) {
                                      break L11;
                                    } else {
                                      if (param0 == 84) {
                                        break L11;
                                      } else {
                                        if (param0 == 85) {
                                          break L11;
                                        } else {
                                          if (59 == param0) {
                                            break L11;
                                          } else {
                                            if (param0 == 74) {
                                              break L11;
                                            } else {
                                              if (28 != param0) {
                                                stackOut_76_0 = 0;
                                                stackIn_77_0 = stackOut_76_0;
                                                break L10;
                                              } else {
                                                return true;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_75_0 = 1;
                                stackIn_77_0 = stackOut_75_0;
                                break L10;
                              }
                              return stackIn_77_0 != 0;
                            }
                          }
                        }
                        stackOut_86_0 = 1;
                        stackIn_88_0 = stackOut_86_0;
                        break L8;
                      }
                      return stackIn_88_0 != 0;
                    } else {
                      if (param0 > 58) {
                        L12: {
                          L13: {
                            L14: {
                              if (param0 < 64) {
                                break L14;
                              } else {
                                if (param0 <= 73) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (param0 == 80) {
                              break L13;
                            } else {
                              if (param0 == 83) {
                                break L13;
                              } else {
                                if (param0 == 84) {
                                  break L13;
                                } else {
                                  if (param0 == 85) {
                                    break L13;
                                  } else {
                                    if (59 == param0) {
                                      break L13;
                                    } else {
                                      if (param0 == 74) {
                                        break L13;
                                      } else {
                                        if (28 != param0) {
                                          stackOut_63_0 = 0;
                                          stackIn_64_0 = stackOut_63_0;
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_62_0 = 1;
                          stackIn_64_0 = stackOut_62_0;
                          break L12;
                        }
                        return stackIn_64_0 != 0;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                if (param0 > 27) {
                  if (32 <= param0) {
                    L15: {
                      L16: {
                        if (param0 <= 43) {
                          break L16;
                        } else {
                          L17: {
                            if (param0 < 48) {
                              break L17;
                            } else {
                              if (param0 <= 58) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (param0 < 64) {
                              break L18;
                            } else {
                              if (param0 <= 73) {
                                break L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (param0 == 80) {
                            break L16;
                          } else {
                            if (param0 == 83) {
                              break L16;
                            } else {
                              if (param0 == 84) {
                                break L16;
                              } else {
                                if (param0 == 85) {
                                  break L16;
                                } else {
                                  if (59 == param0) {
                                    break L16;
                                  } else {
                                    if (param0 == 74) {
                                      break L16;
                                    } else {
                                      if (28 != param0) {
                                        stackOut_43_0 = 0;
                                        stackIn_44_0 = stackOut_43_0;
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L15;
                    }
                    return stackIn_44_0 != 0;
                  } else {
                    L19: {
                      L20: {
                        L21: {
                          if (param0 < 48) {
                            break L21;
                          } else {
                            if (param0 <= 58) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (param0 < 64) {
                            break L22;
                          } else {
                            if (param0 <= 73) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (param0 == 80) {
                          break L20;
                        } else {
                          if (param0 == 83) {
                            break L20;
                          } else {
                            if (param0 == 84) {
                              break L20;
                            } else {
                              if (param0 == 85) {
                                break L20;
                              } else {
                                if (59 == param0) {
                                  break L20;
                                } else {
                                  if (param0 == 74) {
                                    break L20;
                                  } else {
                                    if (28 != param0) {
                                      stackOut_25_0 = 0;
                                      stackIn_26_0 = stackOut_25_0;
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L19;
                    }
                    return stackIn_26_0 != 0;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void e() {
        field_A = null;
        field_B = null;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5, int param6, boolean param7, int param8, boolean param9) {
        int var11 = 0;
        var11 = Kickabout.field_G;
        if (!param4) {
          if (ea.field_a == on.field_g) {
            L0: {
              if (on.field_f == bh.field_s) {
                break L0;
              } else {
                if (ea.field_f.field_e != on.field_f) {
                  break L0;
                } else {
                  if (ea.field_f.field_a != on.field_g) {
                    break L0;
                  } else {
                    if (null == uv.field_i) {
                      if (ow.field_b == null) {
                        L1: {
                          int discarded$16 = 0;
                          ml.c();
                          if (param4) {
                            df.field_H = ub.field_B;
                            break L1;
                          } else {
                            df.field_H = (ea.field_a - 640) / 2;
                            break L1;
                          }
                        }
                        L2: {
                          gt.a(param4, 1);
                          if (ns.field_a > 0) {
                            int discarded$17 = 11;
                            int discarded$18 = -119;
                            we.a(param7, param4);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        L3: {
                          nv.field_F.field_A = 1;
                          nv.field_F.field_kb = ip.field_c.field_kb;
                          if (fj.field_a <= 0) {
                            break L3;
                          } else {
                            ri.a(102, param4, param7, 11);
                            break L3;
                          }
                        }
                        L4: {
                          if (ee.field_b > 0) {
                            lu.a(param7, 11, -2, param9, param4);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (!td.field_b) {
                              break L6;
                            } else {
                              if (uv.field_i.field_gc < uv.field_i.field_bc) {
                                break L6;
                              } else {
                                mc.field_d.field_lb = false;
                                bf.field_u.field_zb.field_E = no.field_I;
                                hl.a(true, bf.field_u.field_Ab);
                                break L5;
                              }
                            }
                          }
                          bf.field_u.field_zb.field_E = null;
                          mc.field_d.field_lb = true;
                          e.a(bf.field_u, param3, param2, 11, 92);
                          break L5;
                        }
                        w.a(param2, false, 11, 16777215, true, param3, 16777215);
                        e.a(bs.field_c, param3, param2, 11, 38);
                        de.field_c = de.field_c + 1;
                        return;
                      } else {
                        bq.a(103, true);
                        break L0;
                      }
                    } else {
                      bq.a(98, false);
                      break L0;
                    }
                  }
                }
              }
            }
            if (param4) {
              L7: {
                df.field_H = ub.field_B;
                gt.a(param4, 1);
                if (ns.field_a > 0) {
                  int discarded$19 = 11;
                  int discarded$20 = -119;
                  we.a(param7, param4);
                  break L7;
                } else {
                  break L7;
                }
              }
              nv.field_F.field_A = 1;
              nv.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a <= 0) {
                L8: {
                  if (ee.field_b > 0) {
                    lu.a(param7, 11, -2, param9, param4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (td.field_b) {
                  if (uv.field_i.field_gc >= uv.field_i.field_bc) {
                    mc.field_d.field_lb = false;
                    bf.field_u.field_zb.field_E = no.field_I;
                    hl.a(true, bf.field_u.field_Ab);
                    w.a(param2, false, 11, 16777215, true, param3, 16777215);
                    e.a(bs.field_c, param3, param2, 11, 38);
                    de.field_c = de.field_c + 1;
                    return;
                  } else {
                    bf.field_u.field_zb.field_E = null;
                    mc.field_d.field_lb = true;
                    e.a(bf.field_u, param3, param2, 11, 92);
                    w.a(param2, false, 11, 16777215, true, param3, 16777215);
                    e.a(bs.field_c, param3, param2, 11, 38);
                    de.field_c = de.field_c + 1;
                    return;
                  }
                } else {
                  bf.field_u.field_zb.field_E = null;
                  mc.field_d.field_lb = true;
                  e.a(bf.field_u, param3, param2, 11, 92);
                  w.a(param2, false, 11, 16777215, true, param3, 16777215);
                  e.a(bs.field_c, param3, param2, 11, 38);
                  de.field_c = de.field_c + 1;
                  return;
                }
              } else {
                L9: {
                  ri.a(102, param4, param7, 11);
                  if (ee.field_b > 0) {
                    lu.a(param7, 11, -2, param9, param4);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    if (!td.field_b) {
                      break L11;
                    } else {
                      if (uv.field_i.field_gc < uv.field_i.field_bc) {
                        break L11;
                      } else {
                        mc.field_d.field_lb = false;
                        bf.field_u.field_zb.field_E = no.field_I;
                        hl.a(true, bf.field_u.field_Ab);
                        break L10;
                      }
                    }
                  }
                  bf.field_u.field_zb.field_E = null;
                  mc.field_d.field_lb = true;
                  e.a(bf.field_u, param3, param2, 11, 92);
                  break L10;
                }
                w.a(param2, false, 11, 16777215, true, param3, 16777215);
                e.a(bs.field_c, param3, param2, 11, 38);
                de.field_c = de.field_c + 1;
                return;
              }
            } else {
              L12: {
                df.field_H = (ea.field_a - 640) / 2;
                gt.a(param4, 1);
                if (ns.field_a > 0) {
                  int discarded$21 = 11;
                  int discarded$22 = -119;
                  we.a(param7, param4);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                nv.field_F.field_A = 1;
                nv.field_F.field_kb = ip.field_c.field_kb;
                if (fj.field_a <= 0) {
                  break L13;
                } else {
                  ri.a(102, param4, param7, 11);
                  break L13;
                }
              }
              L14: {
                if (ee.field_b > 0) {
                  lu.a(param7, 11, -2, param9, param4);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (!td.field_b) {
                  break L15;
                } else {
                  if (uv.field_i.field_gc < uv.field_i.field_bc) {
                    break L15;
                  } else {
                    mc.field_d.field_lb = false;
                    bf.field_u.field_zb.field_E = no.field_I;
                    hl.a(true, bf.field_u.field_Ab);
                    w.a(param2, false, 11, 16777215, true, param3, 16777215);
                    e.a(bs.field_c, param3, param2, 11, 38);
                    de.field_c = de.field_c + 1;
                    return;
                  }
                }
              }
              bf.field_u.field_zb.field_E = null;
              mc.field_d.field_lb = true;
              e.a(bf.field_u, param3, param2, 11, 92);
              w.a(param2, false, 11, 16777215, true, param3, 16777215);
              e.a(bs.field_c, param3, param2, 11, 38);
              de.field_c = de.field_c + 1;
              return;
            }
          } else {
            L16: {
              if (ea.field_f.field_e != on.field_f) {
                break L16;
              } else {
                if (ea.field_f.field_a != on.field_g) {
                  break L16;
                } else {
                  if (null == uv.field_i) {
                    if (ow.field_b == null) {
                      L17: {
                        int discarded$23 = 0;
                        ml.c();
                        if (param4) {
                          df.field_H = ub.field_B;
                          break L17;
                        } else {
                          df.field_H = (ea.field_a - 640) / 2;
                          break L17;
                        }
                      }
                      L18: {
                        gt.a(param4, 1);
                        if (ns.field_a > 0) {
                          int discarded$24 = 11;
                          int discarded$25 = -119;
                          we.a(param7, param4);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        nv.field_F.field_A = 1;
                        nv.field_F.field_kb = ip.field_c.field_kb;
                        if (fj.field_a <= 0) {
                          break L19;
                        } else {
                          ri.a(102, param4, param7, 11);
                          break L19;
                        }
                      }
                      L20: {
                        if (ee.field_b > 0) {
                          lu.a(param7, 11, -2, param9, param4);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        L22: {
                          if (!td.field_b) {
                            break L22;
                          } else {
                            if (uv.field_i.field_gc < uv.field_i.field_bc) {
                              break L22;
                            } else {
                              mc.field_d.field_lb = false;
                              bf.field_u.field_zb.field_E = no.field_I;
                              hl.a(true, bf.field_u.field_Ab);
                              break L21;
                            }
                          }
                        }
                        bf.field_u.field_zb.field_E = null;
                        mc.field_d.field_lb = true;
                        e.a(bf.field_u, param3, param2, 11, 92);
                        break L21;
                      }
                      w.a(param2, false, 11, 16777215, true, param3, 16777215);
                      e.a(bs.field_c, param3, param2, 11, 38);
                      de.field_c = de.field_c + 1;
                      return;
                    } else {
                      bq.a(103, true);
                      break L16;
                    }
                  } else {
                    bq.a(98, false);
                    break L16;
                  }
                }
              }
            }
            if (!param4) {
              L23: {
                df.field_H = (ea.field_a - 640) / 2;
                gt.a(param4, 1);
                if (ns.field_a > 0) {
                  int discarded$26 = 11;
                  int discarded$27 = -119;
                  we.a(param7, param4);
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                nv.field_F.field_A = 1;
                nv.field_F.field_kb = ip.field_c.field_kb;
                if (fj.field_a <= 0) {
                  break L24;
                } else {
                  ri.a(102, param4, param7, 11);
                  break L24;
                }
              }
              L25: {
                if (ee.field_b > 0) {
                  lu.a(param7, 11, -2, param9, param4);
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                L27: {
                  if (!td.field_b) {
                    break L27;
                  } else {
                    if (uv.field_i.field_gc < uv.field_i.field_bc) {
                      break L27;
                    } else {
                      mc.field_d.field_lb = false;
                      bf.field_u.field_zb.field_E = no.field_I;
                      hl.a(true, bf.field_u.field_Ab);
                      break L26;
                    }
                  }
                }
                bf.field_u.field_zb.field_E = null;
                mc.field_d.field_lb = true;
                e.a(bf.field_u, param3, param2, 11, 92);
                break L26;
              }
              w.a(param2, false, 11, 16777215, true, param3, 16777215);
              e.a(bs.field_c, param3, param2, 11, 38);
              de.field_c = de.field_c + 1;
              return;
            } else {
              L28: {
                df.field_H = ub.field_B;
                gt.a(param4, 1);
                if (ns.field_a > 0) {
                  int discarded$28 = 11;
                  int discarded$29 = -119;
                  we.a(param7, param4);
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                nv.field_F.field_A = 1;
                nv.field_F.field_kb = ip.field_c.field_kb;
                if (fj.field_a <= 0) {
                  break L29;
                } else {
                  ri.a(102, param4, param7, 11);
                  break L29;
                }
              }
              L30: {
                if (ee.field_b > 0) {
                  lu.a(param7, 11, -2, param9, param4);
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                L32: {
                  if (!td.field_b) {
                    break L32;
                  } else {
                    if (uv.field_i.field_gc < uv.field_i.field_bc) {
                      break L32;
                    } else {
                      mc.field_d.field_lb = false;
                      bf.field_u.field_zb.field_E = no.field_I;
                      hl.a(true, bf.field_u.field_Ab);
                      break L31;
                    }
                  }
                }
                bf.field_u.field_zb.field_E = null;
                mc.field_d.field_lb = true;
                e.a(bf.field_u, param3, param2, 11, 92);
                break L31;
              }
              w.a(param2, false, 11, 16777215, true, param3, 16777215);
              e.a(bs.field_c, param3, param2, 11, 38);
              de.field_c = de.field_c + 1;
              return;
            }
          }
        } else {
          L33: {
            df.field_H = ub.field_B;
            gt.a(param4, 1);
            if (ns.field_a > 0) {
              int discarded$30 = 11;
              int discarded$31 = -119;
              we.a(param7, param4);
              break L33;
            } else {
              break L33;
            }
          }
          L34: {
            nv.field_F.field_A = 1;
            nv.field_F.field_kb = ip.field_c.field_kb;
            if (fj.field_a <= 0) {
              break L34;
            } else {
              ri.a(102, param4, param7, 11);
              break L34;
            }
          }
          L35: {
            if (ee.field_b > 0) {
              lu.a(param7, 11, -2, param9, param4);
              break L35;
            } else {
              break L35;
            }
          }
          L36: {
            L37: {
              if (!td.field_b) {
                break L37;
              } else {
                if (uv.field_i.field_gc < uv.field_i.field_bc) {
                  break L37;
                } else {
                  mc.field_d.field_lb = false;
                  bf.field_u.field_zb.field_E = no.field_I;
                  hl.a(true, bf.field_u.field_Ab);
                  break L36;
                }
              }
            }
            bf.field_u.field_zb.field_E = null;
            mc.field_d.field_lb = true;
            e.a(bf.field_u, param3, param2, 11, 92);
            break L36;
          }
          w.a(param2, false, 11, 16777215, true, param3, 16777215);
          e.a(bs.field_c, param3, param2, 11, 38);
          de.field_c = de.field_c + 1;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        if (null == um.field_e) {
            return;
        }
        if (-2 == ig.field_d) {
            return;
        }
        um.field_e.c((byte) 80);
    }

    final static boolean a() {
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (fb.field_J == null) {
          if (!vg.field_Wb) {
            if (!kd.field_s) {
              if (9 != cc.field_e) {
                if (cc.field_e != 10) {
                  if (11 != cc.field_e) {
                    if (cc.field_e == 80) {
                      if (!ph.a(true)) {
                        return false;
                      } else {
                        vg.field_Wb = true;
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return ov.a(15, -14, 13);
                  }
                } else {
                  return ov.a(15, -14, 13);
                }
              } else {
                return ov.a(15, -14, 13);
              }
            } else {
              return ov.a(15, -14, 13);
            }
          } else {
            if (ph.a(true)) {
              L0: {
                if (!hd.a(false, 12, 13)) {
                  stackOut_41_0 = 0;
                  stackIn_42_0 = stackOut_41_0;
                  break L0;
                } else {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  break L0;
                }
              }
              L1: {
                L2: {
                  var4 = stackIn_42_0;
                  if (80 == cc.field_e) {
                    break L2;
                  } else {
                    if (84 == cc.field_e) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                vg.field_Wb = false;
                var4 = 1;
                break L1;
              }
              L3: {
                if (13 != cc.field_e) {
                  break L3;
                } else {
                  td.a(89);
                  var4 = 1;
                  vg.field_Wb = false;
                  break L3;
                }
              }
              return var4 != 0;
            } else {
              return false;
            }
          }
        } else {
          if (cc.field_e != 13) {
            if (!vg.field_Wb) {
              if (!kd.field_s) {
                if (9 != cc.field_e) {
                  if (cc.field_e != 10) {
                    if (11 != cc.field_e) {
                      if (cc.field_e == 80) {
                        if (ph.a(true)) {
                          vg.field_Wb = true;
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return ov.a(15, -14, 13);
                    }
                  } else {
                    return ov.a(15, -14, 13);
                  }
                } else {
                  return ov.a(15, -14, 13);
                }
              } else {
                return ov.a(15, -14, 13);
              }
            } else {
              if (ph.a(true)) {
                L4: {
                  if (!hd.a(false, 12, 13)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L4;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L4;
                  }
                }
                var4 = stackIn_9_0;
                if (80 != cc.field_e) {
                  if (84 != cc.field_e) {
                    L5: {
                      if (13 != cc.field_e) {
                        break L5;
                      } else {
                        td.a(89);
                        var4 = 1;
                        vg.field_Wb = false;
                        break L5;
                      }
                    }
                    return var4 != 0;
                  } else {
                    L6: {
                      vg.field_Wb = false;
                      var4 = 1;
                      if (13 != cc.field_e) {
                        break L6;
                      } else {
                        td.a(89);
                        var4 = 1;
                        vg.field_Wb = false;
                        break L6;
                      }
                    }
                    return var4 != 0;
                  }
                } else {
                  L7: {
                    vg.field_Wb = false;
                    var4 = 1;
                    if (13 != cc.field_e) {
                      break L7;
                    } else {
                      td.a(89);
                      var4 = 1;
                      vg.field_Wb = false;
                      break L7;
                    }
                  }
                  return var4 != 0;
                }
              } else {
                return false;
              }
            }
          } else {
            fb.field_J = null;
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[8192];
        field_A = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}

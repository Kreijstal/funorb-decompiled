/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static dd field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_140_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_133_0 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          c.field_S = c.field_S + 1;
          if (kb.field_r != param0) {
            break L0;
          } else {
            if (0 == rf.field_a) {
              kb.field_r = ag.field_f;
              rf.field_a = kc.field_b;
              break L0;
            } else {
              if (param1 == null) {
                if (gf.field_b != null) {
                  L1: {
                    if (ok.field_w) {
                      break L1;
                    } else {
                      if (oh.field_db <= c.field_S) {
                        break L1;
                      } else {
                        if (!pl.field_c) {
                          break L1;
                        } else {
                          aa.field_t = kb.field_r;
                          gg.field_f = rf.field_a;
                          c.field_S = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    gf.field_b = param1;
                    kb.field_r = -1;
                    if (!ok.field_w) {
                      rf.field_a = -1;
                      break L2;
                    } else {
                      if (wb.field_y == c.field_S) {
                        ok.field_w = false;
                        c.field_S = 0;
                        rf.field_a = -1;
                        break L2;
                      } else {
                        rf.field_a = -1;
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  L3: {
                    if (!ok.field_w) {
                      if (c.field_S >= oh.field_db) {
                        if (fj.field_b + oh.field_db > c.field_S) {
                          stackOut_57_0 = 1;
                          stackIn_59_0 = stackOut_57_0;
                          break L3;
                        } else {
                          stackOut_56_0 = 0;
                          stackIn_59_0 = stackOut_56_0;
                          break L3;
                        }
                      } else {
                        stackOut_54_0 = 0;
                        stackIn_59_0 = stackOut_54_0;
                        break L3;
                      }
                    } else {
                      stackOut_52_0 = 0;
                      stackIn_59_0 = stackOut_52_0;
                      break L3;
                    }
                  }
                  L4: {
                    var2 = stackIn_59_0;
                    if (param1 != null) {
                      if (ok.field_w) {
                        c.field_S = oh.field_db;
                        break L4;
                      } else {
                        if (var2 != 0) {
                          c.field_S = oh.field_db;
                          break L4;
                        } else {
                          c.field_S = 0;
                          break L4;
                        }
                      }
                    } else {
                      c.field_S = 0;
                      break L4;
                    }
                  }
                  L5: {
                    aa.field_t = kb.field_r;
                    gg.field_f = rf.field_a;
                    if (param1 == null) {
                      if (var2 != 0) {
                        ok.field_w = true;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      ok.field_w = false;
                      break L5;
                    }
                  }
                  L6: {
                    if (ok.field_w) {
                      break L6;
                    } else {
                      if (oh.field_db <= c.field_S) {
                        break L6;
                      } else {
                        if (!pl.field_c) {
                          break L6;
                        } else {
                          aa.field_t = kb.field_r;
                          gg.field_f = rf.field_a;
                          c.field_S = 0;
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    gf.field_b = param1;
                    kb.field_r = -1;
                    if (!ok.field_w) {
                      rf.field_a = -1;
                      break L7;
                    } else {
                      if (wb.field_y == c.field_S) {
                        ok.field_w = false;
                        c.field_S = 0;
                        rf.field_a = -1;
                        break L7;
                      } else {
                        rf.field_a = -1;
                        break L7;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (param1.equals((Object) (Object) gf.field_b)) {
                  L8: {
                    if (ok.field_w) {
                      break L8;
                    } else {
                      if (oh.field_db <= c.field_S) {
                        break L8;
                      } else {
                        if (!pl.field_c) {
                          break L8;
                        } else {
                          aa.field_t = kb.field_r;
                          gg.field_f = rf.field_a;
                          c.field_S = 0;
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    gf.field_b = param1;
                    kb.field_r = -1;
                    if (!ok.field_w) {
                      rf.field_a = -1;
                      break L9;
                    } else {
                      if (wb.field_y == c.field_S) {
                        ok.field_w = false;
                        c.field_S = 0;
                        rf.field_a = -1;
                        break L9;
                      } else {
                        rf.field_a = -1;
                        break L9;
                      }
                    }
                  }
                  return;
                } else {
                  L10: {
                    if (!ok.field_w) {
                      if (c.field_S >= oh.field_db) {
                        if (fj.field_b + oh.field_db > c.field_S) {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L10;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_12_0 = stackOut_9_0;
                          break L10;
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_12_0 = stackOut_7_0;
                        break L10;
                      }
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_12_0 = stackOut_5_0;
                      break L10;
                    }
                  }
                  L11: {
                    var2 = stackIn_12_0;
                    if (param1 != null) {
                      L12: {
                        if (ok.field_w) {
                          break L12;
                        } else {
                          if (var2 != 0) {
                            break L12;
                          } else {
                            c.field_S = 0;
                            break L11;
                          }
                        }
                      }
                      c.field_S = oh.field_db;
                      break L11;
                    } else {
                      c.field_S = 0;
                      break L11;
                    }
                  }
                  L13: {
                    aa.field_t = kb.field_r;
                    gg.field_f = rf.field_a;
                    if (param1 == null) {
                      if (var2 != 0) {
                        ok.field_w = true;
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      ok.field_w = false;
                      break L13;
                    }
                  }
                  L14: {
                    if (ok.field_w) {
                      break L14;
                    } else {
                      if (oh.field_db <= c.field_S) {
                        break L14;
                      } else {
                        if (!pl.field_c) {
                          break L14;
                        } else {
                          aa.field_t = kb.field_r;
                          gg.field_f = rf.field_a;
                          c.field_S = 0;
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    gf.field_b = param1;
                    kb.field_r = -1;
                    if (!ok.field_w) {
                      rf.field_a = -1;
                      break L15;
                    } else {
                      if (wb.field_y == c.field_S) {
                        ok.field_w = false;
                        c.field_S = 0;
                        rf.field_a = -1;
                        break L15;
                      } else {
                        rf.field_a = -1;
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
          if (param1 == null) {
            if (gf.field_b == null) {
              break L16;
            } else {
              L17: {
                if (ok.field_w) {
                  break L17;
                } else {
                  if (oh.field_db <= c.field_S) {
                    break L17;
                  } else {
                    if (!pl.field_c) {
                      break L17;
                    } else {
                      aa.field_t = kb.field_r;
                      gg.field_f = rf.field_a;
                      c.field_S = 0;
                      gf.field_b = param1;
                      kb.field_r = -1;
                      if (ok.field_w) {
                        if (wb.field_y != c.field_S) {
                          rf.field_a = -1;
                          return;
                        } else {
                          ok.field_w = false;
                          c.field_S = 0;
                          rf.field_a = -1;
                          return;
                        }
                      } else {
                        rf.field_a = -1;
                        return;
                      }
                    }
                  }
                }
              }
              gf.field_b = param1;
              kb.field_r = -1;
              if (ok.field_w) {
                if (wb.field_y == c.field_S) {
                  ok.field_w = false;
                  c.field_S = 0;
                  rf.field_a = -1;
                  return;
                } else {
                  rf.field_a = -1;
                  return;
                }
              } else {
                rf.field_a = -1;
                return;
              }
            }
          } else {
            if (!param1.equals((Object) (Object) gf.field_b)) {
              break L16;
            } else {
              L18: {
                if (ok.field_w) {
                  break L18;
                } else {
                  if (oh.field_db <= c.field_S) {
                    break L18;
                  } else {
                    if (!pl.field_c) {
                      break L18;
                    } else {
                      aa.field_t = kb.field_r;
                      gg.field_f = rf.field_a;
                      c.field_S = 0;
                      gf.field_b = param1;
                      kb.field_r = -1;
                      if (ok.field_w) {
                        if (wb.field_y != c.field_S) {
                          rf.field_a = -1;
                          return;
                        } else {
                          ok.field_w = false;
                          c.field_S = 0;
                          rf.field_a = -1;
                          return;
                        }
                      } else {
                        rf.field_a = -1;
                        return;
                      }
                    }
                  }
                }
              }
              gf.field_b = param1;
              kb.field_r = -1;
              if (ok.field_w) {
                if (wb.field_y != c.field_S) {
                  rf.field_a = -1;
                  return;
                } else {
                  ok.field_w = false;
                  c.field_S = 0;
                  rf.field_a = -1;
                  return;
                }
              } else {
                rf.field_a = -1;
                return;
              }
            }
          }
        }
        L19: {
          if (!ok.field_w) {
            if (c.field_S >= oh.field_db) {
              if (fj.field_b + oh.field_db > c.field_S) {
                stackOut_138_0 = 1;
                stackIn_140_0 = stackOut_138_0;
                break L19;
              } else {
                stackOut_137_0 = 0;
                stackIn_140_0 = stackOut_137_0;
                break L19;
              }
            } else {
              stackOut_135_0 = 0;
              stackIn_140_0 = stackOut_135_0;
              break L19;
            }
          } else {
            stackOut_133_0 = 0;
            stackIn_140_0 = stackOut_133_0;
            break L19;
          }
        }
        var2 = stackIn_140_0;
        if (param1 == null) {
          L20: {
            c.field_S = 0;
            aa.field_t = kb.field_r;
            gg.field_f = rf.field_a;
            if (param1 == null) {
              if (var2 != 0) {
                ok.field_w = true;
                break L20;
              } else {
                break L20;
              }
            } else {
              ok.field_w = false;
              break L20;
            }
          }
          L21: {
            if (ok.field_w) {
              break L21;
            } else {
              if (oh.field_db <= c.field_S) {
                break L21;
              } else {
                if (!pl.field_c) {
                  break L21;
                } else {
                  aa.field_t = kb.field_r;
                  gg.field_f = rf.field_a;
                  c.field_S = 0;
                  break L21;
                }
              }
            }
          }
          L22: {
            gf.field_b = param1;
            kb.field_r = -1;
            if (!ok.field_w) {
              break L22;
            } else {
              if (wb.field_y == c.field_S) {
                ok.field_w = false;
                c.field_S = 0;
                break L22;
              } else {
                break L22;
              }
            }
          }
          rf.field_a = -1;
          return;
        } else {
          L23: {
            if (ok.field_w) {
              c.field_S = oh.field_db;
              break L23;
            } else {
              if (var2 == 0) {
                L24: {
                  c.field_S = 0;
                  aa.field_t = kb.field_r;
                  gg.field_f = rf.field_a;
                  if (param1 == null) {
                    if (var2 != 0) {
                      ok.field_w = true;
                      break L24;
                    } else {
                      break L24;
                    }
                  } else {
                    ok.field_w = false;
                    break L24;
                  }
                }
                L25: {
                  if (ok.field_w) {
                    break L25;
                  } else {
                    if (oh.field_db <= c.field_S) {
                      break L25;
                    } else {
                      if (!pl.field_c) {
                        break L25;
                      } else {
                        aa.field_t = kb.field_r;
                        gg.field_f = rf.field_a;
                        c.field_S = 0;
                        break L25;
                      }
                    }
                  }
                }
                gf.field_b = param1;
                kb.field_r = -1;
                if (ok.field_w) {
                  if (wb.field_y != c.field_S) {
                    rf.field_a = -1;
                    return;
                  } else {
                    ok.field_w = false;
                    c.field_S = 0;
                    rf.field_a = -1;
                    return;
                  }
                } else {
                  rf.field_a = -1;
                  return;
                }
              } else {
                c.field_S = oh.field_db;
                break L23;
              }
            }
          }
          aa.field_t = kb.field_r;
          gg.field_f = rf.field_a;
          if (param1 == null) {
            if (var2 != 0) {
              L26: {
                ok.field_w = true;
                if (ok.field_w) {
                  break L26;
                } else {
                  if (oh.field_db <= c.field_S) {
                    break L26;
                  } else {
                    if (!pl.field_c) {
                      break L26;
                    } else {
                      L27: {
                        aa.field_t = kb.field_r;
                        gg.field_f = rf.field_a;
                        c.field_S = 0;
                        gf.field_b = param1;
                        kb.field_r = -1;
                        if (!ok.field_w) {
                          break L27;
                        } else {
                          if (wb.field_y == c.field_S) {
                            ok.field_w = false;
                            c.field_S = 0;
                            break L27;
                          } else {
                            rf.field_a = -1;
                            return;
                          }
                        }
                      }
                      rf.field_a = -1;
                      return;
                    }
                  }
                }
              }
              L28: {
                gf.field_b = param1;
                kb.field_r = -1;
                if (!ok.field_w) {
                  break L28;
                } else {
                  if (wb.field_y == c.field_S) {
                    ok.field_w = false;
                    c.field_S = 0;
                    break L28;
                  } else {
                    rf.field_a = -1;
                    return;
                  }
                }
              }
              rf.field_a = -1;
              return;
            } else {
              L29: {
                if (ok.field_w) {
                  break L29;
                } else {
                  if (oh.field_db <= c.field_S) {
                    break L29;
                  } else {
                    if (!pl.field_c) {
                      break L29;
                    } else {
                      L30: {
                        aa.field_t = kb.field_r;
                        gg.field_f = rf.field_a;
                        c.field_S = 0;
                        gf.field_b = param1;
                        kb.field_r = -1;
                        if (!ok.field_w) {
                          break L30;
                        } else {
                          if (wb.field_y == c.field_S) {
                            ok.field_w = false;
                            c.field_S = 0;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                      rf.field_a = -1;
                      return;
                    }
                  }
                }
              }
              L31: {
                gf.field_b = param1;
                kb.field_r = -1;
                if (!ok.field_w) {
                  break L31;
                } else {
                  if (wb.field_y == c.field_S) {
                    ok.field_w = false;
                    c.field_S = 0;
                    break L31;
                  } else {
                    rf.field_a = -1;
                    return;
                  }
                }
              }
              rf.field_a = -1;
              return;
            }
          } else {
            L32: {
              ok.field_w = false;
              if (ok.field_w) {
                break L32;
              } else {
                if (oh.field_db <= c.field_S) {
                  break L32;
                } else {
                  if (!pl.field_c) {
                    break L32;
                  } else {
                    L33: {
                      aa.field_t = kb.field_r;
                      gg.field_f = rf.field_a;
                      c.field_S = 0;
                      gf.field_b = param1;
                      kb.field_r = -1;
                      if (!ok.field_w) {
                        break L33;
                      } else {
                        if (wb.field_y == c.field_S) {
                          ok.field_w = false;
                          c.field_S = 0;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                    rf.field_a = -1;
                    return;
                  }
                }
              }
            }
            gf.field_b = param1;
            kb.field_r = -1;
            if (ok.field_w) {
              if (wb.field_y == c.field_S) {
                ok.field_w = false;
                c.field_S = 0;
                rf.field_a = -1;
                return;
              } else {
                rf.field_a = -1;
                return;
              }
            } else {
              rf.field_a = -1;
              return;
            }
          }
        }
    }

    final static void a(int param0, long param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param1);
        } catch (InterruptedException interruptedException) {
        }
        int var3 = 17 / ((-52 - param0) / 58);
    }

    public static void a(byte param0) {
        int var1 = -58 % ((param0 - -7) / 47);
        field_b = null;
        field_c = null;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param0.getDocumentBase().getFile();
                            var4 = var2;
                            var4 = var2;
                            var3 = var2.indexOf('?');
                            var4 = "reload.ws";
                            if (var3 < 0) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var4 = var4 + var2.substring(var3);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = new java.net.URL(param0.getCodeBase(), var4);
                            param0.getAppletContext().showDocument(ib.a(param0, var5, param1 ^ -15686), "_self");
                            if (param1 == 10245) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            df.a((byte) 57);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
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
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}

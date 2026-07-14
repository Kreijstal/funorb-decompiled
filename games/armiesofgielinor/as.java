/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends oj {
    private int field_A;
    static je field_E;
    private boolean field_z;
    private boolean field_C;
    static boolean field_B;
    static String field_y;

    final boolean a(at param0, byte param1, ic param2) {
        Object var5 = null;
        if (param1 < -84) {
          return ((as) this).a((byte) -39, param2, param0, true);
        } else {
          var5 = null;
          boolean discarded$3 = ((as) this).a((at) null, (byte) -44, (ic) null);
          return ((as) this).a((byte) -39, param2, param0, true);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ta.field_N = 0;
        kd.field_R = null;
        jj.field_g = null;
        var2 = gm.field_i;
        gm.field_i = er.field_a;
        ai.field_T.field_q = ai.field_T.field_q + 1;
        if (param1 == 101) {
          if (-52 != param0) {
            if (param0 == 50) {
              ai.field_T.field_p = 5;
              er.field_a = var2;
              if (2 > ai.field_T.field_q) {
                L0: {
                  if (2 > ai.field_T.field_q) {
                    break L0;
                  } else {
                    if (-51 != param0) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 <= ai.field_T.field_q) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (51 != param0) {
                  L1: {
                    if (2 > ai.field_T.field_q) {
                      break L1;
                    } else {
                      if (-51 != param0) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 <= ai.field_T.field_q) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            } else {
              ai.field_T.field_p = 1;
              er.field_a = var2;
              if (2 > ai.field_T.field_q) {
                L2: {
                  if (2 > ai.field_T.field_q) {
                    break L2;
                  } else {
                    if (-51 != param0) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 > ai.field_T.field_q) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (51 != param0) {
                  L3: {
                    if (2 > ai.field_T.field_q) {
                      break L3;
                    } else {
                      if (-51 != param0) {
                        break L3;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 <= ai.field_T.field_q) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          } else {
            ai.field_T.field_p = 2;
            er.field_a = var2;
            if (2 > ai.field_T.field_q) {
              L4: {
                if (2 > ai.field_T.field_q) {
                  break L4;
                } else {
                  if (-51 != param0) {
                    break L4;
                  } else {
                    return 5;
                  }
                }
              }
              if (-5 < (ai.field_T.field_q ^ -1)) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (51 != param0) {
                if (2 <= ai.field_T.field_q) {
                  if (-51 != param0) {
                    if (-5 < ai.field_T.field_q) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (-5 < ai.field_T.field_q) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                return 2;
              }
            }
          }
        } else {
          L5: {
            int discarded$1 = as.a(-88, (byte) -45);
            if (-52 != (param0 ^ -1)) {
              if (param0 == 50) {
                ai.field_T.field_p = 5;
                break L5;
              } else {
                ai.field_T.field_p = 1;
                break L5;
              }
            } else {
              ai.field_T.field_p = 2;
              break L5;
            }
          }
          er.field_a = var2;
          if (2 <= ai.field_T.field_q) {
            if (51 == param0) {
              return 2;
            } else {
              if (2 <= ai.field_T.field_q) {
                if (-51 != param0) {
                  if (-5 < ai.field_T.field_q) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              } else {
                if (-5 < ai.field_T.field_q) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            L6: {
              if (2 > ai.field_T.field_q) {
                break L6;
              } else {
                if (-51 != param0) {
                  break L6;
                } else {
                  return 5;
                }
              }
            }
            if (-5 > ai.field_T.field_q) {
              return -1;
            } else {
              return 1;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_338_0 = 0;
        int stackOut_337_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_332_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_243_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ev.field_a = ev.field_a + 1;
        if (0 == (me.field_e ^ -1)) {
          if ((of.field_Ib ^ -1) != 0) {
            if (param1 == null) {
              L0: {
                if (ts.field_a == null) {
                  L1: {
                    if (!ei.field_b) {
                      if (bb.field_c <= ev.field_a) {
                        if (bb.field_c - -ps.field_E <= ev.field_a) {
                          stackOut_337_0 = 0;
                          stackIn_338_0 = stackOut_337_0;
                          break L1;
                        } else {
                          stackOut_336_0 = 1;
                          stackIn_338_0 = stackOut_336_0;
                          break L1;
                        }
                      } else {
                        stackOut_334_0 = 0;
                        stackIn_338_0 = stackOut_334_0;
                        break L1;
                      }
                    } else {
                      stackOut_332_0 = 0;
                      stackIn_338_0 = stackOut_332_0;
                      break L1;
                    }
                  }
                  L2: {
                    var2 = stackIn_338_0;
                    if (param1 == null) {
                      ev.field_a = 0;
                      break L2;
                    } else {
                      L3: {
                        if (ei.field_b) {
                          break L3;
                        } else {
                          if (var2 != 0) {
                            break L3;
                          } else {
                            ev.field_a = 0;
                            break L2;
                          }
                        }
                      }
                      ev.field_a = bb.field_c;
                      break L2;
                    }
                  }
                  cc.field_b = of.field_Ib;
                  if (param1 != null) {
                    ei.field_b = false;
                    lq.field_e = me.field_e;
                    break L0;
                  } else {
                    if (var2 == 0) {
                      lq.field_e = me.field_e;
                      break L0;
                    } else {
                      ei.field_b = true;
                      lq.field_e = me.field_e;
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
              L4: {
                if (ei.field_b) {
                  ts.field_a = param1;
                  me.field_e = param0;
                  of.field_Ib = -1;
                  if (!ei.field_b) {
                    if (!ei.field_b) {
                      L5: {
                        if (ev.field_a >= bb.field_c) {
                          ts.field_a = param1;
                          me.field_e = param0;
                          of.field_Ib = -1;
                          if (ei.field_b) {
                            if (ce.field_J != ev.field_a) {
                              ts.field_a = param1;
                              me.field_e = param0;
                              of.field_Ib = -1;
                              if (ei.field_b) {
                                if (ce.field_J == ev.field_a) {
                                  ei.field_b = false;
                                  ev.field_a = 0;
                                  break L5;
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              ei.field_b = false;
                              ev.field_a = 0;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          ts.field_a = param1;
                          me.field_e = param0;
                          of.field_Ib = -1;
                          if (ei.field_b) {
                            L6: {
                              if (ce.field_J == ev.field_a) {
                                break L6;
                              } else {
                                ts.field_a = param1;
                                me.field_e = param0;
                                of.field_Ib = -1;
                                if (ei.field_b) {
                                  if (ce.field_J == ev.field_a) {
                                    break L6;
                                  } else {
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              }
                            }
                            ei.field_b = false;
                            ev.field_a = 0;
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L7: {
                        ts.field_a = param1;
                        me.field_e = param0;
                        of.field_Ib = -1;
                        if (!ei.field_b) {
                          break L7;
                        } else {
                          if (ce.field_J != ev.field_a) {
                            break L7;
                          } else {
                            ei.field_b = false;
                            ev.field_a = 0;
                            break L7;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (ei.field_b) {
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L4;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L4;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L4;
                        }
                      }
                    } else {
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L4;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L4;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L4;
                        }
                      }
                    }
                  }
                } else {
                  if (ev.field_a < bb.field_c) {
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (ei.field_b) {
                      if (ce.field_J == ev.field_a) {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L4;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (ei.field_b) {
                      if (ce.field_J == ev.field_a) {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L4;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              if (param1.equals((Object) (Object) ts.field_a)) {
                L8: {
                  if (!ei.field_b) {
                    if (ev.field_a >= bb.field_c) {
                      lq.field_e = me.field_e;
                      if (!ei.field_b) {
                        if (ev.field_a < bb.field_c) {
                          if (!lk.field_f) {
                            L9: {
                              ts.field_a = param1;
                              me.field_e = param0;
                              of.field_Ib = -1;
                              if (!ei.field_b) {
                                break L9;
                              } else {
                                if (ce.field_J != ev.field_a) {
                                  break L9;
                                } else {
                                  ei.field_b = false;
                                  ev.field_a = 0;
                                  break L9;
                                }
                              }
                            }
                            return;
                          } else {
                            cc.field_b = of.field_Ib;
                            lq.field_e = me.field_e;
                            ev.field_a = 0;
                            L10: {
                              ts.field_a = param1;
                              me.field_e = param0;
                              of.field_Ib = -1;
                              if (!ei.field_b) {
                                break L10;
                              } else {
                                if (ce.field_J != ev.field_a) {
                                  break L10;
                                } else {
                                  ei.field_b = false;
                                  ev.field_a = 0;
                                  break L10;
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          L11: {
                            ts.field_a = param1;
                            me.field_e = param0;
                            of.field_Ib = -1;
                            if (!ei.field_b) {
                              break L11;
                            } else {
                              if (ce.field_J != ev.field_a) {
                                break L11;
                              } else {
                                ei.field_b = false;
                                ev.field_a = 0;
                                break L11;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L12: {
                          ts.field_a = param1;
                          me.field_e = param0;
                          of.field_Ib = -1;
                          if (!ei.field_b) {
                            break L12;
                          } else {
                            if (ce.field_J != ev.field_a) {
                              break L12;
                            } else {
                              ei.field_b = false;
                              ev.field_a = 0;
                              break L12;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (ei.field_b) {
                        if (ce.field_J == ev.field_a) {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L8;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    lq.field_e = me.field_e;
                    if (!ei.field_b) {
                      if (ev.field_a < bb.field_c) {
                        if (lk.field_f) {
                          cc.field_b = of.field_Ib;
                          lq.field_e = me.field_e;
                          ev.field_a = 0;
                          ts.field_a = param1;
                          me.field_e = param0;
                          of.field_Ib = -1;
                          if (!ei.field_b) {
                            break L8;
                          } else {
                            if (ce.field_J != ev.field_a) {
                              break L8;
                            } else {
                              ei.field_b = false;
                              ev.field_a = 0;
                              break L8;
                            }
                          }
                        } else {
                          L13: {
                            ts.field_a = param1;
                            me.field_e = param0;
                            of.field_Ib = -1;
                            if (!ei.field_b) {
                              break L13;
                            } else {
                              if (ce.field_J != ev.field_a) {
                                break L13;
                              } else {
                                ei.field_b = false;
                                ev.field_a = 0;
                                break L13;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L14: {
                          ts.field_a = param1;
                          me.field_e = param0;
                          of.field_Ib = -1;
                          if (!ei.field_b) {
                            break L14;
                          } else {
                            if (ce.field_J != ev.field_a) {
                              break L14;
                            } else {
                              ei.field_b = false;
                              ev.field_a = 0;
                              break L14;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L15: {
                        ts.field_a = param1;
                        me.field_e = param0;
                        of.field_Ib = -1;
                        if (!ei.field_b) {
                          break L15;
                        } else {
                          if (ce.field_J != ev.field_a) {
                            break L15;
                          } else {
                            ei.field_b = false;
                            ev.field_a = 0;
                            break L15;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              } else {
                L16: {
                  if (!ei.field_b) {
                    if (bb.field_c <= ev.field_a) {
                      if (bb.field_c - -ps.field_E <= ev.field_a) {
                        stackOut_248_0 = 0;
                        stackIn_250_0 = stackOut_248_0;
                        break L16;
                      } else {
                        stackOut_247_0 = 1;
                        stackIn_250_0 = stackOut_247_0;
                        break L16;
                      }
                    } else {
                      stackOut_245_0 = 0;
                      stackIn_250_0 = stackOut_245_0;
                      break L16;
                    }
                  } else {
                    stackOut_243_0 = 0;
                    stackIn_250_0 = stackOut_243_0;
                    break L16;
                  }
                }
                L17: {
                  var2 = stackIn_250_0;
                  if (param1 == null) {
                    ev.field_a = 0;
                    break L17;
                  } else {
                    L18: {
                      if (ei.field_b) {
                        break L18;
                      } else {
                        if (var2 != 0) {
                          break L18;
                        } else {
                          ev.field_a = 0;
                          break L17;
                        }
                      }
                    }
                    ev.field_a = bb.field_c;
                    break L17;
                  }
                }
                L19: {
                  cc.field_b = of.field_Ib;
                  if (param1 != null) {
                    ei.field_b = false;
                    break L19;
                  } else {
                    if (var2 == 0) {
                      break L19;
                    } else {
                      ei.field_b = true;
                      break L19;
                    }
                  }
                }
                L20: {
                  lq.field_e = me.field_e;
                  if (!ei.field_b) {
                    if (ev.field_a < bb.field_c) {
                      if (lk.field_f) {
                        cc.field_b = of.field_Ib;
                        lq.field_e = me.field_e;
                        ev.field_a = 0;
                        ts.field_a = param1;
                        me.field_e = param0;
                        of.field_Ib = -1;
                        if (!ei.field_b) {
                          break L20;
                        } else {
                          if (ce.field_J != ev.field_a) {
                            break L20;
                          } else {
                            ei.field_b = false;
                            ev.field_a = 0;
                            break L20;
                          }
                        }
                      } else {
                        ts.field_a = param1;
                        me.field_e = param0;
                        of.field_Ib = -1;
                        if (!ei.field_b) {
                          break L20;
                        } else {
                          if (ce.field_J != ev.field_a) {
                            break L20;
                          } else {
                            ei.field_b = false;
                            ev.field_a = 0;
                            break L20;
                          }
                        }
                      }
                    } else {
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L20;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L20;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L20;
                        }
                      }
                    }
                  } else {
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (!ei.field_b) {
                      break L20;
                    } else {
                      if (ce.field_J != ev.field_a) {
                        break L20;
                      } else {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L20;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L21: {
              L22: {
                of.field_Ib = ko.field_b;
                me.field_e = sm.field_d;
                if (param1 == null) {
                  L23: {
                    if (ts.field_a == null) {
                      L24: {
                        if (!ei.field_b) {
                          if (bb.field_c <= ev.field_a) {
                            if (bb.field_c - -ps.field_E <= ev.field_a) {
                              stackOut_212_0 = 0;
                              stackIn_213_0 = stackOut_212_0;
                              break L24;
                            } else {
                              stackOut_211_0 = 1;
                              stackIn_213_0 = stackOut_211_0;
                              break L24;
                            }
                          } else {
                            stackOut_209_0 = 0;
                            stackIn_213_0 = stackOut_209_0;
                            break L24;
                          }
                        } else {
                          stackOut_207_0 = 0;
                          stackIn_213_0 = stackOut_207_0;
                          break L24;
                        }
                      }
                      L25: {
                        var2 = stackIn_213_0;
                        if (param1 == null) {
                          ev.field_a = 0;
                          break L25;
                        } else {
                          L26: {
                            if (ei.field_b) {
                              break L26;
                            } else {
                              if (var2 != 0) {
                                break L26;
                              } else {
                                ev.field_a = 0;
                                break L25;
                              }
                            }
                          }
                          ev.field_a = bb.field_c;
                          break L25;
                        }
                      }
                      cc.field_b = of.field_Ib;
                      if (param1 != null) {
                        ei.field_b = false;
                        ts.field_a = param1;
                        me.field_e = param0;
                        of.field_Ib = -1;
                        if (!ei.field_b) {
                          break L21;
                        } else {
                          if (ce.field_J != ev.field_a) {
                            break L21;
                          } else {
                            ei.field_b = false;
                            ev.field_a = 0;
                            ts.field_a = param1;
                            me.field_e = param0;
                            of.field_Ib = -1;
                            if (!ei.field_b) {
                              break L21;
                            } else {
                              if (ce.field_J != ev.field_a) {
                                break L21;
                              } else {
                                ei.field_b = false;
                                ev.field_a = 0;
                                ts.field_a = param1;
                                me.field_e = param0;
                                of.field_Ib = -1;
                                if (!ei.field_b) {
                                  break L21;
                                } else {
                                  if (ce.field_J != ev.field_a) {
                                    break L21;
                                  } else {
                                    ei.field_b = false;
                                    ev.field_a = 0;
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L27: {
                          if (var2 == 0) {
                            break L27;
                          } else {
                            ei.field_b = true;
                            break L27;
                          }
                        }
                        lq.field_e = me.field_e;
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  if (ei.field_b) {
                    break L22;
                  } else {
                    if (ev.field_a >= bb.field_c) {
                      break L22;
                    } else {
                      if (!lk.field_f) {
                        break L22;
                      } else {
                        cc.field_b = of.field_Ib;
                        lq.field_e = me.field_e;
                        ev.field_a = 0;
                        break L22;
                      }
                    }
                  }
                } else {
                  if (param1.equals((Object) (Object) ts.field_a)) {
                    if (ei.field_b) {
                      break L22;
                    } else {
                      if (ev.field_a >= bb.field_c) {
                        break L22;
                      } else {
                        if (!lk.field_f) {
                          break L22;
                        } else {
                          cc.field_b = of.field_Ib;
                          lq.field_e = me.field_e;
                          ev.field_a = 0;
                          break L22;
                        }
                      }
                    }
                  } else {
                    if (ei.field_b) {
                      break L22;
                    } else {
                      if (ev.field_a >= bb.field_c) {
                        break L22;
                      } else {
                        if (!lk.field_f) {
                          break L22;
                        } else {
                          cc.field_b = of.field_Ib;
                          lq.field_e = me.field_e;
                          ev.field_a = 0;
                          break L22;
                        }
                      }
                    }
                  }
                }
              }
              ts.field_a = param1;
              me.field_e = param0;
              of.field_Ib = -1;
              if (!ei.field_b) {
                break L21;
              } else {
                if (ce.field_J != ev.field_a) {
                  break L21;
                } else {
                  ei.field_b = false;
                  ev.field_a = 0;
                  break L21;
                }
              }
            }
            return;
          }
        } else {
          if (param1 != null) {
            if (param1.equals((Object) (Object) ts.field_a)) {
              L28: {
                if (!ei.field_b) {
                  if (ev.field_a < bb.field_c) {
                    if (lk.field_f) {
                      cc.field_b = of.field_Ib;
                      lq.field_e = me.field_e;
                      ev.field_a = 0;
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L28;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L28;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L28;
                        }
                      }
                    } else {
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L28;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L28;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L28;
                        }
                      }
                    }
                  } else {
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (!ei.field_b) {
                      break L28;
                    } else {
                      if (ce.field_J != ev.field_a) {
                        break L28;
                      } else {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L28;
                      }
                    }
                  }
                } else {
                  ts.field_a = param1;
                  me.field_e = param0;
                  of.field_Ib = -1;
                  if (!ei.field_b) {
                    break L28;
                  } else {
                    if (ce.field_J != ev.field_a) {
                      break L28;
                    } else {
                      ei.field_b = false;
                      ev.field_a = 0;
                      break L28;
                    }
                  }
                }
              }
              return;
            } else {
              L29: {
                if (!ei.field_b) {
                  if (bb.field_c <= ev.field_a) {
                    if (bb.field_c - -ps.field_E > ev.field_a) {
                      stackOut_60_0 = 1;
                      stackIn_62_0 = stackOut_60_0;
                      break L29;
                    } else {
                      stackOut_59_0 = 0;
                      stackIn_62_0 = stackOut_59_0;
                      break L29;
                    }
                  } else {
                    stackOut_57_0 = 0;
                    stackIn_62_0 = stackOut_57_0;
                    break L29;
                  }
                } else {
                  stackOut_55_0 = 0;
                  stackIn_62_0 = stackOut_55_0;
                  break L29;
                }
              }
              L30: {
                var2 = stackIn_62_0;
                if (param1 != null) {
                  if (!ei.field_b) {
                    if (var2 != 0) {
                      ev.field_a = bb.field_c;
                      break L30;
                    } else {
                      ev.field_a = 0;
                      break L30;
                    }
                  } else {
                    ev.field_a = bb.field_c;
                    break L30;
                  }
                } else {
                  ev.field_a = 0;
                  break L30;
                }
              }
              L31: {
                cc.field_b = of.field_Ib;
                if (param1 != null) {
                  ei.field_b = false;
                  break L31;
                } else {
                  if (var2 == 0) {
                    break L31;
                  } else {
                    ei.field_b = true;
                    break L31;
                  }
                }
              }
              L32: {
                lq.field_e = me.field_e;
                if (!ei.field_b) {
                  if (ev.field_a < bb.field_c) {
                    if (lk.field_f) {
                      cc.field_b = of.field_Ib;
                      lq.field_e = me.field_e;
                      ev.field_a = 0;
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L32;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L32;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L32;
                        }
                      }
                    } else {
                      ts.field_a = param1;
                      me.field_e = param0;
                      of.field_Ib = -1;
                      if (!ei.field_b) {
                        break L32;
                      } else {
                        if (ce.field_J != ev.field_a) {
                          break L32;
                        } else {
                          ei.field_b = false;
                          ev.field_a = 0;
                          break L32;
                        }
                      }
                    }
                  } else {
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (!ei.field_b) {
                      break L32;
                    } else {
                      if (ce.field_J != ev.field_a) {
                        break L32;
                      } else {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L32;
                      }
                    }
                  }
                } else {
                  ts.field_a = param1;
                  me.field_e = param0;
                  of.field_Ib = -1;
                  if (!ei.field_b) {
                    break L32;
                  } else {
                    if (ce.field_J != ev.field_a) {
                      break L32;
                    } else {
                      ei.field_b = false;
                      ev.field_a = 0;
                      break L32;
                    }
                  }
                }
              }
              return;
            }
          } else {
            L33: {
              if (ts.field_a == null) {
                L34: {
                  if (!ei.field_b) {
                    if (bb.field_c <= ev.field_a) {
                      if (bb.field_c - -ps.field_E > ev.field_a) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L34;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L34;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L34;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_12_0 = stackOut_5_0;
                    break L34;
                  }
                }
                L35: {
                  var2 = stackIn_12_0;
                  if (param1 != null) {
                    break L35;
                  } else {
                    break L35;
                  }
                }
                ev.field_a = 0;
                cc.field_b = of.field_Ib;
                if (param1 != null) {
                  ei.field_b = false;
                  lq.field_e = me.field_e;
                  break L33;
                } else {
                  if (var2 == 0) {
                    lq.field_e = me.field_e;
                    break L33;
                  } else {
                    ei.field_b = true;
                    lq.field_e = me.field_e;
                    break L33;
                  }
                }
              } else {
                break L33;
              }
            }
            L36: {
              if (!ei.field_b) {
                if (ev.field_a < bb.field_c) {
                  if (lk.field_f) {
                    cc.field_b = of.field_Ib;
                    lq.field_e = me.field_e;
                    ev.field_a = 0;
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (!ei.field_b) {
                      break L36;
                    } else {
                      if (ce.field_J != ev.field_a) {
                        break L36;
                      } else {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L36;
                      }
                    }
                  } else {
                    ts.field_a = param1;
                    me.field_e = param0;
                    of.field_Ib = -1;
                    if (!ei.field_b) {
                      break L36;
                    } else {
                      if (ce.field_J != ev.field_a) {
                        break L36;
                      } else {
                        ei.field_b = false;
                        ev.field_a = 0;
                        break L36;
                      }
                    }
                  }
                } else {
                  ts.field_a = param1;
                  me.field_e = param0;
                  of.field_Ib = -1;
                  if (!ei.field_b) {
                    break L36;
                  } else {
                    if (ce.field_J != ev.field_a) {
                      break L36;
                    } else {
                      ei.field_b = false;
                      ev.field_a = 0;
                      break L36;
                    }
                  }
                }
              } else {
                ts.field_a = param1;
                me.field_e = param0;
                of.field_Ib = -1;
                if (!ei.field_b) {
                  break L36;
                } else {
                  if (ce.field_J != ev.field_a) {
                    break L36;
                  } else {
                    ei.field_b = false;
                    ev.field_a = 0;
                    break L36;
                  }
                }
              }
            }
            return;
          }
        }
    }

    as(jd param0, int param1, boolean param2) {
        ((as) this).field_z = param2 ? true : false;
        ((as) this).field_C = false;
        ((as) this).field_A = param1;
        ((as) this).field_m = 23;
        ((as) this).field_w = param0;
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (!param1) {
          var3 = "EventSwitch: pos: (" + ((as) this).field_w.field_J + "," + ((as) this).field_w.field_w + ")";
          var4 = 1 / ((53 - param0) / 51);
          return var3;
        } else {
          System.out.println("Death event debug");
          System.out.println("Unit at " + ((as) this).field_w.field_J + "," + ((as) this).field_w.field_w);
          var3 = "EventSwitch: pos: (" + ((as) this).field_w.field_J + "," + ((as) this).field_w.field_w + ")";
          var4 = 1 / ((53 - param0) / 51);
          return var3;
        }
    }

    public static void g(int param0) {
        field_E = null;
        if (param0 != -19269) {
            return;
        }
        field_y = null;
    }

    final void a(ha param0, int param1) {
        Object var4 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        if (!((as) this).field_C) {
          ((as) this).field_C = true;
          ((as) this).field_w = ((as) this).field_w.b(((as) this).field_A, -1);
          if (null != ((as) this).field_w) {
            if (((as) this).field_w.e((byte) 123)) {
              L0: {
                if (param0.field_sb != ((as) this).field_w.field_O) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L0;
                }
              }
              if (stackIn_17_0 != 0 & ((as) this).field_z) {
                param0.field_l.a(param1 + 27411, (tc) (Object) new qj(((as) this).field_w.field_J, ((as) this).field_w.field_w));
                if (param1 == -26661) {
                  return;
                } else {
                  var4 = null;
                  ((as) this).a((ha) null, 25);
                  return;
                }
              } else {
                if (param1 == -26661) {
                  return;
                } else {
                  var4 = null;
                  ((as) this).a((ha) null, 25);
                  return;
                }
              }
            } else {
              if (param1 == -26661) {
                return;
              } else {
                var4 = null;
                ((as) this).a((ha) null, 25);
                return;
              }
            }
          } else {
            if (param1 == -26661) {
              return;
            } else {
              var4 = null;
              ((as) this).a((ha) null, 25);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Damage taken";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends wf {
    static String field_h;
    static String field_g;

    public static void a(byte param0) {
        field_g = null;
        field_h = null;
    }

    final static void a(String[] args, byte param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              db.field_a = gd.field_l;
              if (255 == param3) {
                L2: {
                  if (ab.field_j >= 13) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                de.field_a = de.a(stackIn_12_0 != 0, (byte) -116);
                var6 = null;
                dj.a(false, (String[]) null);
                break L1;
              } else {
                if (param3 < 100) {
                  de.field_a = mk.a(242763393, param2, param3);
                  break L1;
                } else {
                  if (param3 > 105) {
                    de.field_a = mk.a(242763393, param2, param3);
                    break L1;
                  } else {
                    var4 = args;
                    dj.a(false, var4);
                    de.field_a = ve.a(args, (byte) -128);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4_ref;
            stackOut_14_1 = new StringBuilder().append("he.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(89).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (ba.field_q == null) {
              break L1;
            } else {
              if (ba.field_q.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ba.field_q = new int[2 * param1];
          break L0;
        }
        if (null != dk.field_k) {
          if (dk.field_k.length >= param1) {
            L2: {
              L3: {
                if (null == bh.field_a) {
                  break L3;
                } else {
                  if (param1 > bh.field_a.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              bh.field_a = new int[param1 * 2];
              break L2;
            }
            L4: {
              L5: {
                if (null == pd.field_a) {
                  break L5;
                } else {
                  if (pd.field_a.length >= param1) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              pd.field_a = new int[2 * param1];
              break L4;
            }
            if (null == bg.field_j) {
              L6: {
                L7: {
                  bg.field_j = new int[param1 * 2];
                  if (tb.field_d == null) {
                    break L7;
                  } else {
                    if (tb.field_d.length >= param1) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                tb.field_d = new int[param1 * 2];
                break L6;
              }
              if (lk.field_d != null) {
                if (lk.field_d.length >= param1 + param0) {
                  L8: {
                    L9: {
                      if (pa.field_h == null) {
                        break L9;
                      } else {
                        if (pa.field_h.length < param1) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    pa.field_h = new boolean[2 * param1];
                    break L8;
                  }
                  rc.field_c = -2147483648;
                  ue.field_a = 2147483647;
                  ua.field_d = 2147483647;
                  cg.field_l = 0;
                  vb.field_a = -2147483648;
                  return;
                } else {
                  L10: {
                    L11: {
                      lk.field_d = new int[(param1 - -param0) * 2];
                      if (pa.field_h == null) {
                        break L11;
                      } else {
                        if (pa.field_h.length < param1) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    pa.field_h = new boolean[2 * param1];
                    break L10;
                  }
                  rc.field_c = -2147483648;
                  ue.field_a = 2147483647;
                  ua.field_d = 2147483647;
                  cg.field_l = 0;
                  vb.field_a = -2147483648;
                  return;
                }
              } else {
                L12: {
                  L13: {
                    lk.field_d = new int[(param1 - -param0) * 2];
                    if (pa.field_h == null) {
                      break L13;
                    } else {
                      if (pa.field_h.length < param1) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  pa.field_h = new boolean[2 * param1];
                  break L12;
                }
                rc.field_c = -2147483648;
                ue.field_a = 2147483647;
                ua.field_d = 2147483647;
                cg.field_l = 0;
                vb.field_a = -2147483648;
                return;
              }
            } else {
              if (bg.field_j.length >= param1) {
                if (tb.field_d == null) {
                  tb.field_d = new int[param1 * 2];
                  if (lk.field_d != null) {
                    if (lk.field_d.length >= param1 + param0) {
                      L14: {
                        L15: {
                          if (pa.field_h == null) {
                            break L15;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L14;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    } else {
                      L16: {
                        L17: {
                          lk.field_d = new int[(param1 - -param0) * 2];
                          if (pa.field_h == null) {
                            break L17;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L16;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  } else {
                    L18: {
                      L19: {
                        lk.field_d = new int[(param1 - -param0) * 2];
                        if (pa.field_h == null) {
                          break L19;
                        } else {
                          if (pa.field_h.length < param1) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      pa.field_h = new boolean[2 * param1];
                      break L18;
                    }
                    rc.field_c = -2147483648;
                    ue.field_a = 2147483647;
                    ua.field_d = 2147483647;
                    cg.field_l = 0;
                    vb.field_a = -2147483648;
                    return;
                  }
                } else {
                  if (tb.field_d.length >= param1) {
                    if (lk.field_d != null) {
                      if (lk.field_d.length < param1 + param0) {
                        L20: {
                          L21: {
                            lk.field_d = new int[(param1 - -param0) * 2];
                            if (pa.field_h == null) {
                              break L21;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L21;
                              } else {
                                break L20;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L20;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      } else {
                        L22: {
                          L23: {
                            if (pa.field_h == null) {
                              break L23;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L23;
                              } else {
                                break L22;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L22;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      }
                    } else {
                      L24: {
                        L25: {
                          lk.field_d = new int[(param1 - -param0) * 2];
                          if (pa.field_h == null) {
                            break L25;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L24;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  } else {
                    tb.field_d = new int[param1 * 2];
                    if (lk.field_d != null) {
                      if (lk.field_d.length >= param1 + param0) {
                        L26: {
                          L27: {
                            if (pa.field_h == null) {
                              break L27;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L27;
                              } else {
                                break L26;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L26;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      } else {
                        L28: {
                          L29: {
                            lk.field_d = new int[(param1 - -param0) * 2];
                            if (pa.field_h == null) {
                              break L29;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L29;
                              } else {
                                break L28;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L28;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      }
                    } else {
                      L30: {
                        L31: {
                          lk.field_d = new int[(param1 - -param0) * 2];
                          if (pa.field_h == null) {
                            break L31;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L31;
                            } else {
                              break L30;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L30;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  }
                }
              } else {
                L32: {
                  L33: {
                    bg.field_j = new int[param1 * 2];
                    if (tb.field_d == null) {
                      break L33;
                    } else {
                      if (tb.field_d.length >= param1) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  tb.field_d = new int[param1 * 2];
                  break L32;
                }
                L34: {
                  L35: {
                    if (lk.field_d == null) {
                      break L35;
                    } else {
                      if (lk.field_d.length >= param1 + param0) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  lk.field_d = new int[(param1 - -param0) * 2];
                  break L34;
                }
                L36: {
                  L37: {
                    if (pa.field_h == null) {
                      break L37;
                    } else {
                      if (pa.field_h.length < param1) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                  pa.field_h = new boolean[2 * param1];
                  break L36;
                }
                rc.field_c = -2147483648;
                ue.field_a = 2147483647;
                ua.field_d = 2147483647;
                cg.field_l = 0;
                vb.field_a = -2147483648;
                return;
              }
            }
          } else {
            L38: {
              L39: {
                dk.field_k = new int[param1 * 2];
                if (null == bh.field_a) {
                  break L39;
                } else {
                  if (param1 > bh.field_a.length) {
                    break L39;
                  } else {
                    break L38;
                  }
                }
              }
              bh.field_a = new int[param1 * 2];
              break L38;
            }
            L40: {
              L41: {
                if (null == pd.field_a) {
                  break L41;
                } else {
                  if (pd.field_a.length >= param1) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
              }
              pd.field_a = new int[2 * param1];
              break L40;
            }
            if (null != bg.field_j) {
              if (bg.field_j.length >= param1) {
                if (tb.field_d != null) {
                  if (tb.field_d.length >= param1) {
                    if (lk.field_d != null) {
                      if (lk.field_d.length < param1 + param0) {
                        L42: {
                          L43: {
                            lk.field_d = new int[(param1 - -param0) * 2];
                            if (pa.field_h == null) {
                              break L43;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L43;
                              } else {
                                break L42;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L42;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      } else {
                        L44: {
                          L45: {
                            if (pa.field_h == null) {
                              break L45;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L45;
                              } else {
                                break L44;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L44;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      }
                    } else {
                      L46: {
                        L47: {
                          lk.field_d = new int[(param1 - -param0) * 2];
                          if (pa.field_h == null) {
                            break L47;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L47;
                            } else {
                              break L46;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L46;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  } else {
                    L48: {
                      L49: {
                        tb.field_d = new int[param1 * 2];
                        if (lk.field_d == null) {
                          break L49;
                        } else {
                          if (lk.field_d.length >= param1 + param0) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      lk.field_d = new int[(param1 - -param0) * 2];
                      break L48;
                    }
                    L50: {
                      L51: {
                        if (pa.field_h == null) {
                          break L51;
                        } else {
                          if (pa.field_h.length < param1) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      pa.field_h = new boolean[2 * param1];
                      break L50;
                    }
                    rc.field_c = -2147483648;
                    ue.field_a = 2147483647;
                    ua.field_d = 2147483647;
                    cg.field_l = 0;
                    vb.field_a = -2147483648;
                    return;
                  }
                } else {
                  L52: {
                    L53: {
                      tb.field_d = new int[param1 * 2];
                      if (lk.field_d == null) {
                        break L53;
                      } else {
                        if (lk.field_d.length >= param1 + param0) {
                          break L52;
                        } else {
                          break L53;
                        }
                      }
                    }
                    lk.field_d = new int[(param1 - -param0) * 2];
                    break L52;
                  }
                  L54: {
                    L55: {
                      if (pa.field_h == null) {
                        break L55;
                      } else {
                        if (pa.field_h.length < param1) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    pa.field_h = new boolean[2 * param1];
                    break L54;
                  }
                  rc.field_c = -2147483648;
                  ue.field_a = 2147483647;
                  ua.field_d = 2147483647;
                  cg.field_l = 0;
                  vb.field_a = -2147483648;
                  return;
                }
              } else {
                L56: {
                  L57: {
                    bg.field_j = new int[param1 * 2];
                    if (tb.field_d == null) {
                      break L57;
                    } else {
                      if (tb.field_d.length >= param1) {
                        break L56;
                      } else {
                        break L57;
                      }
                    }
                  }
                  tb.field_d = new int[param1 * 2];
                  break L56;
                }
                L58: {
                  L59: {
                    if (lk.field_d == null) {
                      break L59;
                    } else {
                      if (lk.field_d.length >= param1 + param0) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  lk.field_d = new int[(param1 - -param0) * 2];
                  break L58;
                }
                L60: {
                  L61: {
                    if (pa.field_h == null) {
                      break L61;
                    } else {
                      if (pa.field_h.length < param1) {
                        break L61;
                      } else {
                        break L60;
                      }
                    }
                  }
                  pa.field_h = new boolean[2 * param1];
                  break L60;
                }
                rc.field_c = -2147483648;
                ue.field_a = 2147483647;
                ua.field_d = 2147483647;
                cg.field_l = 0;
                vb.field_a = -2147483648;
                return;
              }
            } else {
              L62: {
                L63: {
                  bg.field_j = new int[param1 * 2];
                  if (tb.field_d == null) {
                    break L63;
                  } else {
                    if (tb.field_d.length >= param1) {
                      break L62;
                    } else {
                      break L63;
                    }
                  }
                }
                tb.field_d = new int[param1 * 2];
                break L62;
              }
              L64: {
                L65: {
                  if (lk.field_d == null) {
                    break L65;
                  } else {
                    if (lk.field_d.length >= param1 + param0) {
                      break L64;
                    } else {
                      break L65;
                    }
                  }
                }
                lk.field_d = new int[(param1 - -param0) * 2];
                break L64;
              }
              L66: {
                L67: {
                  if (pa.field_h == null) {
                    break L67;
                  } else {
                    if (pa.field_h.length < param1) {
                      break L67;
                    } else {
                      break L66;
                    }
                  }
                }
                pa.field_h = new boolean[2 * param1];
                break L66;
              }
              rc.field_c = -2147483648;
              ue.field_a = 2147483647;
              ua.field_d = 2147483647;
              cg.field_l = 0;
              vb.field_a = -2147483648;
              return;
            }
          }
        } else {
          L68: {
            L69: {
              dk.field_k = new int[param1 * 2];
              if (null == bh.field_a) {
                break L69;
              } else {
                if (param1 > bh.field_a.length) {
                  break L69;
                } else {
                  break L68;
                }
              }
            }
            bh.field_a = new int[param1 * 2];
            break L68;
          }
          L70: {
            L71: {
              if (null == pd.field_a) {
                break L71;
              } else {
                if (pd.field_a.length >= param1) {
                  break L70;
                } else {
                  break L71;
                }
              }
            }
            pd.field_a = new int[2 * param1];
            break L70;
          }
          if (null != bg.field_j) {
            if (bg.field_j.length >= param1) {
              if (tb.field_d != null) {
                if (tb.field_d.length >= param1) {
                  if (lk.field_d != null) {
                    if (lk.field_d.length < param1 + param0) {
                      L72: {
                        L73: {
                          lk.field_d = new int[(param1 - -param0) * 2];
                          if (pa.field_h == null) {
                            break L73;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L73;
                            } else {
                              break L72;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L72;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    } else {
                      L74: {
                        L75: {
                          if (pa.field_h == null) {
                            break L75;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L75;
                            } else {
                              break L74;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L74;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  } else {
                    L76: {
                      L77: {
                        lk.field_d = new int[(param1 - -param0) * 2];
                        if (pa.field_h == null) {
                          break L77;
                        } else {
                          if (pa.field_h.length < param1) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      pa.field_h = new boolean[2 * param1];
                      break L76;
                    }
                    rc.field_c = -2147483648;
                    ue.field_a = 2147483647;
                    ua.field_d = 2147483647;
                    cg.field_l = 0;
                    vb.field_a = -2147483648;
                    return;
                  }
                } else {
                  L78: {
                    L79: {
                      tb.field_d = new int[param1 * 2];
                      if (lk.field_d == null) {
                        break L79;
                      } else {
                        if (lk.field_d.length >= param1 + param0) {
                          break L78;
                        } else {
                          break L79;
                        }
                      }
                    }
                    lk.field_d = new int[(param1 - -param0) * 2];
                    break L78;
                  }
                  L80: {
                    L81: {
                      if (pa.field_h == null) {
                        break L81;
                      } else {
                        if (pa.field_h.length < param1) {
                          break L81;
                        } else {
                          break L80;
                        }
                      }
                    }
                    pa.field_h = new boolean[2 * param1];
                    break L80;
                  }
                  rc.field_c = -2147483648;
                  ue.field_a = 2147483647;
                  ua.field_d = 2147483647;
                  cg.field_l = 0;
                  vb.field_a = -2147483648;
                  return;
                }
              } else {
                L82: {
                  L83: {
                    tb.field_d = new int[param1 * 2];
                    if (lk.field_d == null) {
                      break L83;
                    } else {
                      if (lk.field_d.length >= param1 + param0) {
                        break L82;
                      } else {
                        break L83;
                      }
                    }
                  }
                  lk.field_d = new int[(param1 - -param0) * 2];
                  break L82;
                }
                L84: {
                  L85: {
                    if (pa.field_h == null) {
                      break L85;
                    } else {
                      if (pa.field_h.length < param1) {
                        break L85;
                      } else {
                        break L84;
                      }
                    }
                  }
                  pa.field_h = new boolean[2 * param1];
                  break L84;
                }
                rc.field_c = -2147483648;
                ue.field_a = 2147483647;
                ua.field_d = 2147483647;
                cg.field_l = 0;
                vb.field_a = -2147483648;
                return;
              }
            } else {
              L86: {
                L87: {
                  bg.field_j = new int[param1 * 2];
                  if (tb.field_d == null) {
                    break L87;
                  } else {
                    if (tb.field_d.length >= param1) {
                      break L86;
                    } else {
                      break L87;
                    }
                  }
                }
                tb.field_d = new int[param1 * 2];
                break L86;
              }
              L88: {
                L89: {
                  if (lk.field_d == null) {
                    break L89;
                  } else {
                    if (lk.field_d.length >= param1 + param0) {
                      break L88;
                    } else {
                      break L89;
                    }
                  }
                }
                lk.field_d = new int[(param1 - -param0) * 2];
                break L88;
              }
              L90: {
                L91: {
                  if (pa.field_h == null) {
                    break L91;
                  } else {
                    if (pa.field_h.length < param1) {
                      break L91;
                    } else {
                      break L90;
                    }
                  }
                }
                pa.field_h = new boolean[2 * param1];
                break L90;
              }
              rc.field_c = -2147483648;
              ue.field_a = 2147483647;
              ua.field_d = 2147483647;
              cg.field_l = 0;
              vb.field_a = -2147483648;
              return;
            }
          } else {
            L92: {
              L93: {
                bg.field_j = new int[param1 * 2];
                if (tb.field_d == null) {
                  break L93;
                } else {
                  if (tb.field_d.length >= param1) {
                    break L92;
                  } else {
                    break L93;
                  }
                }
              }
              tb.field_d = new int[param1 * 2];
              break L92;
            }
            L94: {
              L95: {
                if (lk.field_d == null) {
                  break L95;
                } else {
                  if (lk.field_d.length >= param1 + param0) {
                    break L94;
                  } else {
                    break L95;
                  }
                }
              }
              lk.field_d = new int[(param1 - -param0) * 2];
              break L94;
            }
            L96: {
              L97: {
                if (pa.field_h == null) {
                  break L97;
                } else {
                  if (pa.field_h.length < param1) {
                    break L97;
                  } else {
                    break L96;
                  }
                }
              }
              pa.field_h = new boolean[2 * param1];
              break L96;
            }
            rc.field_c = -2147483648;
            ue.field_a = 2147483647;
            ua.field_d = 2147483647;
            cg.field_l = 0;
            vb.field_a = -2147483648;
            return;
          }
        }
    }

    final static void a(ti param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              param2 = param2 + param0.field_u;
              param4 = param4 + param0.field_l;
              var5_int = param2 + sb.field_c * param4;
              var6 = 0;
              var7 = param0.field_m;
              if (param3 > 55) {
                break L1;
              } else {
                var12 = null;
                he.a((ti) null, 10, 5, (byte) -107, 1);
                break L1;
              }
            }
            L2: {
              var8 = param0.field_n;
              var9 = -var8 + sb.field_c;
              var10 = 0;
              if (param4 >= sb.field_e) {
                break L2;
              } else {
                var11 = sb.field_e + -param4;
                var5_int = var5_int + sb.field_c * var11;
                var6 = var6 + var11 * var8;
                var7 = var7 - var11;
                param4 = sb.field_e;
                break L2;
              }
            }
            L3: {
              if (param4 - -var7 <= sb.field_f) {
                break L3;
              } else {
                var7 = var7 - (param4 + var7 + -sb.field_f);
                break L3;
              }
            }
            L4: {
              if (sb.field_d <= param2) {
                break L4;
              } else {
                var11 = sb.field_d + -param2;
                var8 = var8 - var11;
                var5_int = var5_int + var11;
                var10 = var10 + var11;
                var6 = var6 + var11;
                var9 = var9 + var11;
                param2 = sb.field_d;
                break L4;
              }
            }
            L5: {
              if (sb.field_b >= param2 - -var8) {
                break L5;
              } else {
                var11 = var8 + param2 + -sb.field_b;
                var9 = var9 + var11;
                var10 = var10 + var11;
                var8 = var8 - var11;
                break L5;
              }
            }
            L6: {
              if (var8 <= 0) {
                break L6;
              } else {
                if (var7 > 0) {
                  we.a(var6, param1, var7, param0.field_w, var10, var9, var8, 0, sb.field_h, (byte) -53, var5_int);
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("he.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private he() throws Throwable {
        throw new Error();
    }

    final static void b(byte param0) {
        aa.field_g = false;
        lb.field_d = false;
        ba.a(121, -1);
        int var1 = -100 % ((44 - param0) / 47);
        rh.field_v = jh.field_n;
        db.field_a = jh.field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "End Game";
        field_g = "Are you sure you want to skip this round, scoring 0 for it?";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static boolean field_f;
    static String field_a;
    static int field_b;
    static int field_d;
    static int field_c;
    static eg field_e;

    final static dd[] a(dd[] param0, byte param1) {
        RuntimeException var2 = null;
        dd[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              param0[3].field_y = param0[3].field_A;
              if (param1 == -29) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            param0[1].field_w = param0[1].field_z;
            param0[5].field_y = param0[5].field_A;
            param0[7].field_w = param0[7].field_z;
            stackOut_2_0 = (dd[]) (param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("gn.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, boolean param2) {
        if (wg.field_Nb != null) {
          if (param0 > wg.field_Nb.length) {
            L0: {
              L1: {
                wg.field_Nb = new int[param0 * 2];
                if (kb.field_g == null) {
                  break L1;
                } else {
                  if (param0 <= kb.field_g.length) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              kb.field_g = new int[param0 * 2];
              break L0;
            }
            L2: {
              L3: {
                if (null == ob.field_y) {
                  break L3;
                } else {
                  if (ob.field_y.length >= param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ob.field_y = new int[param0 * 2];
              break L2;
            }
            if (!param2) {
              L4: {
                L5: {
                  if (om.field_s == null) {
                    break L5;
                  } else {
                    if (om.field_s.length >= param0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                om.field_s = new int[2 * param0];
                break L4;
              }
              L6: {
                if (gd.field_d == null) {
                  gd.field_d = new int[param0 * 2];
                  break L6;
                } else {
                  if (gd.field_d.length < param0) {
                    L7: {
                      L8: {
                        gd.field_d = new int[param0 * 2];
                        if (ah.field_c == null) {
                          break L8;
                        } else {
                          if (ah.field_c.length >= param0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      ah.field_c = new int[param0 * 2];
                      break L7;
                    }
                    L9: {
                      L10: {
                        if (ep.field_H == null) {
                          break L10;
                        } else {
                          if (param1 + param0 <= ep.field_H.length) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ep.field_H = new int[2 * (param1 + param0)];
                      break L9;
                    }
                    L11: {
                      if (im.field_cc == null) {
                        break L11;
                      } else {
                        if (im.field_cc.length >= param0) {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          break L11;
                        }
                      }
                    }
                    im.field_cc = new boolean[2 * param0];
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  } else {
                    break L6;
                  }
                }
              }
              if (ah.field_c == null) {
                ah.field_c = new int[param0 * 2];
                if (ep.field_H == null) {
                  L12: {
                    ep.field_H = new int[2 * (param1 + param0)];
                    if (im.field_cc == null) {
                      break L12;
                    } else {
                      if (im.field_cc.length >= param0) {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        break L12;
                      }
                    }
                  }
                  im.field_cc = new boolean[2 * param0];
                  rn.field_d = 2147483647;
                  q.field_a = -2147483648;
                  jl.field_c = -2147483648;
                  jh.field_c = 0;
                  gr.field_z = 2147483647;
                  return;
                } else {
                  if (param1 + param0 <= ep.field_H.length) {
                    if (im.field_cc == null) {
                      im.field_cc = new boolean[2 * param0];
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    } else {
                      if (im.field_cc.length < param0) {
                        im.field_cc = new boolean[2 * param0];
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      }
                    }
                  } else {
                    L13: {
                      ep.field_H = new int[2 * (param1 + param0)];
                      if (im.field_cc == null) {
                        break L13;
                      } else {
                        if (im.field_cc.length >= param0) {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          break L13;
                        }
                      }
                    }
                    im.field_cc = new boolean[2 * param0];
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  }
                }
              } else {
                if (ah.field_c.length >= param0) {
                  if (ep.field_H == null) {
                    ep.field_H = new int[2 * (param1 + param0)];
                    if (im.field_cc == null) {
                      im.field_cc = new boolean[2 * param0];
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    } else {
                      if (im.field_cc.length < param0) {
                        im.field_cc = new boolean[2 * param0];
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      }
                    }
                  } else {
                    if (param1 + param0 <= ep.field_H.length) {
                      if (im.field_cc == null) {
                        im.field_cc = new boolean[2 * param0];
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        if (im.field_cc.length < param0) {
                          im.field_cc = new boolean[2 * param0];
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        }
                      }
                    } else {
                      ep.field_H = new int[2 * (param1 + param0)];
                      if (im.field_cc == null) {
                        im.field_cc = new boolean[2 * param0];
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        if (im.field_cc.length < param0) {
                          im.field_cc = new boolean[2 * param0];
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L14: {
                    L15: {
                      ah.field_c = new int[param0 * 2];
                      if (ep.field_H == null) {
                        break L15;
                      } else {
                        if (param1 + param0 <= ep.field_H.length) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    ep.field_H = new int[2 * (param1 + param0)];
                    break L14;
                  }
                  if (im.field_cc == null) {
                    im.field_cc = new boolean[2 * param0];
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  } else {
                    if (im.field_cc.length < param0) {
                      im.field_cc = new boolean[2 * param0];
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    } else {
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L16: {
              L17: {
                if (kb.field_g == null) {
                  break L17;
                } else {
                  if (param0 <= kb.field_g.length) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              kb.field_g = new int[param0 * 2];
              break L16;
            }
            L18: {
              L19: {
                if (null == ob.field_y) {
                  break L19;
                } else {
                  if (ob.field_y.length >= param0) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              ob.field_y = new int[param0 * 2];
              break L18;
            }
            if (!param2) {
              L20: {
                L21: {
                  if (om.field_s == null) {
                    break L21;
                  } else {
                    if (om.field_s.length >= param0) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                om.field_s = new int[2 * param0];
                break L20;
              }
              L22: {
                if (gd.field_d == null) {
                  gd.field_d = new int[param0 * 2];
                  break L22;
                } else {
                  if (gd.field_d.length < param0) {
                    L23: {
                      L24: {
                        gd.field_d = new int[param0 * 2];
                        if (ah.field_c == null) {
                          break L24;
                        } else {
                          if (ah.field_c.length >= param0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      ah.field_c = new int[param0 * 2];
                      break L23;
                    }
                    L25: {
                      L26: {
                        if (ep.field_H == null) {
                          break L26;
                        } else {
                          if (param1 + param0 <= ep.field_H.length) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      ep.field_H = new int[2 * (param1 + param0)];
                      break L25;
                    }
                    L27: {
                      if (im.field_cc == null) {
                        break L27;
                      } else {
                        if (im.field_cc.length >= param0) {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          break L27;
                        }
                      }
                    }
                    im.field_cc = new boolean[2 * param0];
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  } else {
                    break L22;
                  }
                }
              }
              if (ah.field_c == null) {
                L28: {
                  L29: {
                    ah.field_c = new int[param0 * 2];
                    if (ep.field_H == null) {
                      break L29;
                    } else {
                      if (param1 + param0 <= ep.field_H.length) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  ep.field_H = new int[2 * (param1 + param0)];
                  break L28;
                }
                L30: {
                  if (im.field_cc == null) {
                    break L30;
                  } else {
                    if (im.field_cc.length >= param0) {
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    } else {
                      break L30;
                    }
                  }
                }
                im.field_cc = new boolean[2 * param0];
                rn.field_d = 2147483647;
                q.field_a = -2147483648;
                jl.field_c = -2147483648;
                jh.field_c = 0;
                gr.field_z = 2147483647;
                return;
              } else {
                if (ah.field_c.length >= param0) {
                  if (ep.field_H == null) {
                    L31: {
                      ep.field_H = new int[2 * (param1 + param0)];
                      if (im.field_cc == null) {
                        break L31;
                      } else {
                        if (im.field_cc.length >= param0) {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          break L31;
                        }
                      }
                    }
                    im.field_cc = new boolean[2 * param0];
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  } else {
                    if (param1 + param0 <= ep.field_H.length) {
                      if (im.field_cc == null) {
                        im.field_cc = new boolean[2 * param0];
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        if (im.field_cc.length < param0) {
                          im.field_cc = new boolean[2 * param0];
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        }
                      }
                    } else {
                      L32: {
                        ep.field_H = new int[2 * (param1 + param0)];
                        if (im.field_cc == null) {
                          break L32;
                        } else {
                          if (im.field_cc.length >= param0) {
                            rn.field_d = 2147483647;
                            q.field_a = -2147483648;
                            jl.field_c = -2147483648;
                            jh.field_c = 0;
                            gr.field_z = 2147483647;
                            return;
                          } else {
                            break L32;
                          }
                        }
                      }
                      im.field_cc = new boolean[2 * param0];
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    }
                  }
                } else {
                  L33: {
                    L34: {
                      ah.field_c = new int[param0 * 2];
                      if (ep.field_H == null) {
                        break L34;
                      } else {
                        if (param1 + param0 <= ep.field_H.length) {
                          break L33;
                        } else {
                          break L34;
                        }
                      }
                    }
                    ep.field_H = new int[2 * (param1 + param0)];
                    break L33;
                  }
                  L35: {
                    if (im.field_cc == null) {
                      break L35;
                    } else {
                      if (im.field_cc.length >= param0) {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        break L35;
                      }
                    }
                  }
                  im.field_cc = new boolean[2 * param0];
                  rn.field_d = 2147483647;
                  q.field_a = -2147483648;
                  jl.field_c = -2147483648;
                  jh.field_c = 0;
                  gr.field_z = 2147483647;
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          L36: {
            L37: {
              wg.field_Nb = new int[param0 * 2];
              if (kb.field_g == null) {
                break L37;
              } else {
                if (param0 <= kb.field_g.length) {
                  break L36;
                } else {
                  break L37;
                }
              }
            }
            kb.field_g = new int[param0 * 2];
            break L36;
          }
          L38: {
            L39: {
              if (null == ob.field_y) {
                break L39;
              } else {
                if (ob.field_y.length >= param0) {
                  break L38;
                } else {
                  break L39;
                }
              }
            }
            ob.field_y = new int[param0 * 2];
            break L38;
          }
          if (!param2) {
            L40: {
              L41: {
                if (om.field_s == null) {
                  break L41;
                } else {
                  if (om.field_s.length >= param0) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
              }
              om.field_s = new int[2 * param0];
              break L40;
            }
            L42: {
              if (gd.field_d == null) {
                gd.field_d = new int[param0 * 2];
                break L42;
              } else {
                if (gd.field_d.length < param0) {
                  L43: {
                    L44: {
                      gd.field_d = new int[param0 * 2];
                      if (ah.field_c == null) {
                        break L44;
                      } else {
                        if (ah.field_c.length >= param0) {
                          break L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                    ah.field_c = new int[param0 * 2];
                    break L43;
                  }
                  L45: {
                    L46: {
                      if (ep.field_H == null) {
                        break L46;
                      } else {
                        if (param1 + param0 <= ep.field_H.length) {
                          break L45;
                        } else {
                          break L46;
                        }
                      }
                    }
                    ep.field_H = new int[2 * (param1 + param0)];
                    break L45;
                  }
                  L47: {
                    if (im.field_cc == null) {
                      break L47;
                    } else {
                      if (im.field_cc.length >= param0) {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        break L47;
                      }
                    }
                  }
                  im.field_cc = new boolean[2 * param0];
                  rn.field_d = 2147483647;
                  q.field_a = -2147483648;
                  jl.field_c = -2147483648;
                  jh.field_c = 0;
                  gr.field_z = 2147483647;
                  return;
                } else {
                  break L42;
                }
              }
            }
            if (ah.field_c == null) {
              L48: {
                L49: {
                  ah.field_c = new int[param0 * 2];
                  if (ep.field_H == null) {
                    break L49;
                  } else {
                    if (param1 + param0 <= ep.field_H.length) {
                      break L48;
                    } else {
                      break L49;
                    }
                  }
                }
                ep.field_H = new int[2 * (param1 + param0)];
                break L48;
              }
              L50: {
                if (im.field_cc == null) {
                  break L50;
                } else {
                  if (im.field_cc.length >= param0) {
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  } else {
                    break L50;
                  }
                }
              }
              im.field_cc = new boolean[2 * param0];
              rn.field_d = 2147483647;
              q.field_a = -2147483648;
              jl.field_c = -2147483648;
              jh.field_c = 0;
              gr.field_z = 2147483647;
              return;
            } else {
              if (ah.field_c.length >= param0) {
                if (ep.field_H == null) {
                  L51: {
                    ep.field_H = new int[2 * (param1 + param0)];
                    if (im.field_cc == null) {
                      break L51;
                    } else {
                      if (im.field_cc.length >= param0) {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        break L51;
                      }
                    }
                  }
                  im.field_cc = new boolean[2 * param0];
                  rn.field_d = 2147483647;
                  q.field_a = -2147483648;
                  jl.field_c = -2147483648;
                  jh.field_c = 0;
                  gr.field_z = 2147483647;
                  return;
                } else {
                  if (param1 + param0 <= ep.field_H.length) {
                    if (im.field_cc == null) {
                      im.field_cc = new boolean[2 * param0];
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    } else {
                      if (im.field_cc.length < param0) {
                        im.field_cc = new boolean[2 * param0];
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      } else {
                        rn.field_d = 2147483647;
                        q.field_a = -2147483648;
                        jl.field_c = -2147483648;
                        jh.field_c = 0;
                        gr.field_z = 2147483647;
                        return;
                      }
                    }
                  } else {
                    L52: {
                      ep.field_H = new int[2 * (param1 + param0)];
                      if (im.field_cc == null) {
                        break L52;
                      } else {
                        if (im.field_cc.length >= param0) {
                          rn.field_d = 2147483647;
                          q.field_a = -2147483648;
                          jl.field_c = -2147483648;
                          jh.field_c = 0;
                          gr.field_z = 2147483647;
                          return;
                        } else {
                          break L52;
                        }
                      }
                    }
                    im.field_cc = new boolean[2 * param0];
                    rn.field_d = 2147483647;
                    q.field_a = -2147483648;
                    jl.field_c = -2147483648;
                    jh.field_c = 0;
                    gr.field_z = 2147483647;
                    return;
                  }
                }
              } else {
                L53: {
                  L54: {
                    ah.field_c = new int[param0 * 2];
                    if (ep.field_H == null) {
                      break L54;
                    } else {
                      if (param1 + param0 <= ep.field_H.length) {
                        break L53;
                      } else {
                        break L54;
                      }
                    }
                  }
                  ep.field_H = new int[2 * (param1 + param0)];
                  break L53;
                }
                L55: {
                  if (im.field_cc == null) {
                    break L55;
                  } else {
                    if (im.field_cc.length >= param0) {
                      rn.field_d = 2147483647;
                      q.field_a = -2147483648;
                      jl.field_c = -2147483648;
                      jh.field_c = 0;
                      gr.field_z = 2147483647;
                      return;
                    } else {
                      break L55;
                    }
                  }
                }
                im.field_cc = new boolean[2 * param0];
                rn.field_d = 2147483647;
                q.field_a = -2147483648;
                jl.field_c = -2147483648;
                jh.field_c = 0;
                gr.field_z = 2147483647;
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static eg a(eg param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        eg stackIn_6_0 = null;
        eg stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_7_0 = null;
        eg stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.field_q.length <= var2_int) {
                if (param1 == 5) {
                  jf.a(param0, (byte) 38);
                  param0.a();
                  stackOut_7_0 = (eg) (param0);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_5_0 = (eg) null;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                param0.field_q[var2_int] = -param0.field_q[var2_int];
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("gn.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    static {
        field_a = "Now you have potted a ball, that group - either spots (balls 1-7) or stripes (balls 9-15) - becomes yours. Your objective is now to pot the rest of the balls of your group, then the black ball. You must always hit one of your balls first!";
        field_c = 50;
    }
}

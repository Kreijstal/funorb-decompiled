/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends wf {
    static String field_h;
    static String field_g;

    public static void a(byte param0) {
        if (param0 < 12) {
            he.b((byte) 57);
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static void a(String[] args, byte param1, String param2, int param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        String[] var6 = null;
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
        int decompiledRegionSelector0 = 0;
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
            if (param1 > 75) {
              L1: {
                L2: {
                  db.field_a = gd.field_l;
                  if (255 == param3) {
                    break L2;
                  } else {
                    L3: {
                      if (param3 < 100) {
                        break L3;
                      } else {
                        if (param3 > 105) {
                          break L3;
                        } else {
                          var4 = args;
                          dj.a(false, var4);
                          de.field_a = ve.a(args, (byte) -128);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    de.field_a = mk.a(242763393, param2, param3);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (-14 >= (ab.field_j ^ -1)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                de.field_a = de.a(stackIn_12_0 != 0, (byte) -116);
                var6 = (String[]) null;
                dj.a(false, (String[]) null);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("he.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            L6: {
              if (null == bg.field_j) {
                break L6;
              } else {
                if (bg.field_j.length >= param1) {
                  if (param2 == 24070) {
                    if (tb.field_d == null) {
                      tb.field_d = new int[param1 * 2];
                      if (lk.field_d != null) {
                        if (lk.field_d.length >= param1 + param0) {
                          L7: {
                            L8: {
                              if (pa.field_h == null) {
                                break L8;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L8;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L7;
                          }
                          rc.field_c = -2147483648;
                          ue.field_a = 2147483647;
                          ua.field_d = 2147483647;
                          cg.field_l = 0;
                          vb.field_a = -2147483648;
                          return;
                        } else {
                          L9: {
                            L10: {
                              lk.field_d = new int[(param1 - -param0) * 2];
                              if (pa.field_h == null) {
                                break L10;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L9;
                          }
                          rc.field_c = -2147483648;
                          ue.field_a = 2147483647;
                          ua.field_d = 2147483647;
                          cg.field_l = 0;
                          vb.field_a = -2147483648;
                          return;
                        }
                      } else {
                        L11: {
                          L12: {
                            lk.field_d = new int[(param1 - -param0) * 2];
                            if (pa.field_h == null) {
                              break L12;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L11;
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
                            L13: {
                              L14: {
                                lk.field_d = new int[(param1 - -param0) * 2];
                                if (pa.field_h == null) {
                                  break L14;
                                } else {
                                  if (pa.field_h.length < param1) {
                                    break L14;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              pa.field_h = new boolean[2 * param1];
                              break L13;
                            }
                            rc.field_c = -2147483648;
                            ue.field_a = 2147483647;
                            ua.field_d = 2147483647;
                            cg.field_l = 0;
                            vb.field_a = -2147483648;
                            return;
                          } else {
                            L15: {
                              L16: {
                                if (pa.field_h == null) {
                                  break L16;
                                } else {
                                  if (pa.field_h.length < param1) {
                                    break L16;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              pa.field_h = new boolean[2 * param1];
                              break L15;
                            }
                            rc.field_c = -2147483648;
                            ue.field_a = 2147483647;
                            ua.field_d = 2147483647;
                            cg.field_l = 0;
                            vb.field_a = -2147483648;
                            return;
                          }
                        } else {
                          L17: {
                            L18: {
                              lk.field_d = new int[(param1 - -param0) * 2];
                              if (pa.field_h == null) {
                                break L18;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L18;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L17;
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
                            L19: {
                              L20: {
                                if (pa.field_h == null) {
                                  break L20;
                                } else {
                                  if (pa.field_h.length < param1) {
                                    break L20;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              pa.field_h = new boolean[2 * param1];
                              break L19;
                            }
                            rc.field_c = -2147483648;
                            ue.field_a = 2147483647;
                            ua.field_d = 2147483647;
                            cg.field_l = 0;
                            vb.field_a = -2147483648;
                            return;
                          } else {
                            L21: {
                              L22: {
                                lk.field_d = new int[(param1 - -param0) * 2];
                                if (pa.field_h == null) {
                                  break L22;
                                } else {
                                  if (pa.field_h.length < param1) {
                                    break L22;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              pa.field_h = new boolean[2 * param1];
                              break L21;
                            }
                            rc.field_c = -2147483648;
                            ue.field_a = 2147483647;
                            ua.field_d = 2147483647;
                            cg.field_l = 0;
                            vb.field_a = -2147483648;
                            return;
                          }
                        } else {
                          L23: {
                            L24: {
                              lk.field_d = new int[(param1 - -param0) * 2];
                              if (pa.field_h == null) {
                                break L24;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L24;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L23;
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
                    L25: {
                      L26: {
                        he.b((byte) -97);
                        if (tb.field_d == null) {
                          break L26;
                        } else {
                          if (tb.field_d.length >= param1) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      tb.field_d = new int[param1 * 2];
                      break L25;
                    }
                    if (lk.field_d != null) {
                      if (lk.field_d.length < param1 + param0) {
                        L27: {
                          L28: {
                            lk.field_d = new int[(param1 - -param0) * 2];
                            if (pa.field_h == null) {
                              break L28;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L28;
                              } else {
                                break L27;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L27;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      } else {
                        L29: {
                          L30: {
                            if (pa.field_h == null) {
                              break L30;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L30;
                              } else {
                                break L29;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L29;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      }
                    } else {
                      L31: {
                        L32: {
                          lk.field_d = new int[(param1 - -param0) * 2];
                          if (pa.field_h == null) {
                            break L32;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L32;
                            } else {
                              break L31;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L31;
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
                  break L6;
                }
              }
            }
            L33: {
              bg.field_j = new int[param1 * 2];
              if (param2 == 24070) {
                break L33;
              } else {
                he.b((byte) -97);
                break L33;
              }
            }
            L34: {
              L35: {
                if (tb.field_d == null) {
                  break L35;
                } else {
                  if (tb.field_d.length >= param1) {
                    break L34;
                  } else {
                    break L35;
                  }
                }
              }
              tb.field_d = new int[param1 * 2];
              break L34;
            }
            L36: {
              L37: {
                if (lk.field_d == null) {
                  break L37;
                } else {
                  if (lk.field_d.length >= param1 + param0) {
                    break L36;
                  } else {
                    break L37;
                  }
                }
              }
              lk.field_d = new int[(param1 - -param0) * 2];
              break L36;
            }
            L38: {
              L39: {
                if (pa.field_h == null) {
                  break L39;
                } else {
                  if (pa.field_h.length < param1) {
                    break L39;
                  } else {
                    break L38;
                  }
                }
              }
              pa.field_h = new boolean[2 * param1];
              break L38;
            }
            rc.field_c = -2147483648;
            ue.field_a = 2147483647;
            ua.field_d = 2147483647;
            cg.field_l = 0;
            vb.field_a = -2147483648;
            return;
          } else {
            L40: {
              L41: {
                dk.field_k = new int[param1 * 2];
                if (null == bh.field_a) {
                  break L41;
                } else {
                  if (param1 > bh.field_a.length) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              bh.field_a = new int[param1 * 2];
              break L40;
            }
            L42: {
              L43: {
                if (null == pd.field_a) {
                  break L43;
                } else {
                  if (pd.field_a.length >= param1) {
                    break L42;
                  } else {
                    break L43;
                  }
                }
              }
              pd.field_a = new int[2 * param1];
              break L42;
            }
            L44: {
              if (null == bg.field_j) {
                break L44;
              } else {
                if (bg.field_j.length >= param1) {
                  if (param2 == 24070) {
                    if (tb.field_d != null) {
                      if (tb.field_d.length >= param1) {
                        if (lk.field_d != null) {
                          if (lk.field_d.length < param1 + param0) {
                            L45: {
                              L46: {
                                lk.field_d = new int[(param1 - -param0) * 2];
                                if (pa.field_h == null) {
                                  break L46;
                                } else {
                                  if (pa.field_h.length < param1) {
                                    break L46;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              pa.field_h = new boolean[2 * param1];
                              break L45;
                            }
                            rc.field_c = -2147483648;
                            ue.field_a = 2147483647;
                            ua.field_d = 2147483647;
                            cg.field_l = 0;
                            vb.field_a = -2147483648;
                            return;
                          } else {
                            L47: {
                              L48: {
                                if (pa.field_h == null) {
                                  break L48;
                                } else {
                                  if (pa.field_h.length < param1) {
                                    break L48;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              pa.field_h = new boolean[2 * param1];
                              break L47;
                            }
                            rc.field_c = -2147483648;
                            ue.field_a = 2147483647;
                            ua.field_d = 2147483647;
                            cg.field_l = 0;
                            vb.field_a = -2147483648;
                            return;
                          }
                        } else {
                          L49: {
                            L50: {
                              lk.field_d = new int[(param1 - -param0) * 2];
                              if (pa.field_h == null) {
                                break L50;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L50;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L49;
                          }
                          rc.field_c = -2147483648;
                          ue.field_a = 2147483647;
                          ua.field_d = 2147483647;
                          cg.field_l = 0;
                          vb.field_a = -2147483648;
                          return;
                        }
                      } else {
                        L51: {
                          L52: {
                            tb.field_d = new int[param1 * 2];
                            if (lk.field_d == null) {
                              break L52;
                            } else {
                              if (lk.field_d.length >= param1 + param0) {
                                break L51;
                              } else {
                                break L52;
                              }
                            }
                          }
                          lk.field_d = new int[(param1 - -param0) * 2];
                          break L51;
                        }
                        L53: {
                          L54: {
                            if (pa.field_h == null) {
                              break L54;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L54;
                              } else {
                                break L53;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L53;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      }
                    } else {
                      L55: {
                        L56: {
                          tb.field_d = new int[param1 * 2];
                          if (lk.field_d == null) {
                            break L56;
                          } else {
                            if (lk.field_d.length >= param1 + param0) {
                              break L55;
                            } else {
                              break L56;
                            }
                          }
                        }
                        lk.field_d = new int[(param1 - -param0) * 2];
                        break L55;
                      }
                      L57: {
                        L58: {
                          if (pa.field_h == null) {
                            break L58;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L58;
                            } else {
                              break L57;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L57;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  } else {
                    L59: {
                      L60: {
                        he.b((byte) -97);
                        if (tb.field_d == null) {
                          break L60;
                        } else {
                          if (tb.field_d.length >= param1) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                      tb.field_d = new int[param1 * 2];
                      break L59;
                    }
                    L61: {
                      L62: {
                        if (lk.field_d == null) {
                          break L62;
                        } else {
                          if (lk.field_d.length >= param1 + param0) {
                            break L61;
                          } else {
                            break L62;
                          }
                        }
                      }
                      lk.field_d = new int[(param1 - -param0) * 2];
                      break L61;
                    }
                    L63: {
                      L64: {
                        if (pa.field_h == null) {
                          break L64;
                        } else {
                          if (pa.field_h.length < param1) {
                            break L64;
                          } else {
                            break L63;
                          }
                        }
                      }
                      pa.field_h = new boolean[2 * param1];
                      break L63;
                    }
                    rc.field_c = -2147483648;
                    ue.field_a = 2147483647;
                    ua.field_d = 2147483647;
                    cg.field_l = 0;
                    vb.field_a = -2147483648;
                    return;
                  }
                } else {
                  break L44;
                }
              }
            }
            L65: {
              bg.field_j = new int[param1 * 2];
              if (param2 == 24070) {
                break L65;
              } else {
                he.b((byte) -97);
                break L65;
              }
            }
            L66: {
              L67: {
                if (tb.field_d == null) {
                  break L67;
                } else {
                  if (tb.field_d.length >= param1) {
                    break L66;
                  } else {
                    break L67;
                  }
                }
              }
              tb.field_d = new int[param1 * 2];
              break L66;
            }
            L68: {
              L69: {
                if (lk.field_d == null) {
                  break L69;
                } else {
                  if (lk.field_d.length >= param1 + param0) {
                    break L68;
                  } else {
                    break L69;
                  }
                }
              }
              lk.field_d = new int[(param1 - -param0) * 2];
              break L68;
            }
            L70: {
              L71: {
                if (pa.field_h == null) {
                  break L71;
                } else {
                  if (pa.field_h.length < param1) {
                    break L71;
                  } else {
                    break L70;
                  }
                }
              }
              pa.field_h = new boolean[2 * param1];
              break L70;
            }
            rc.field_c = -2147483648;
            ue.field_a = 2147483647;
            ua.field_d = 2147483647;
            cg.field_l = 0;
            vb.field_a = -2147483648;
            return;
          }
        } else {
          L72: {
            L73: {
              dk.field_k = new int[param1 * 2];
              if (null == bh.field_a) {
                break L73;
              } else {
                if (param1 > bh.field_a.length) {
                  break L73;
                } else {
                  break L72;
                }
              }
            }
            bh.field_a = new int[param1 * 2];
            break L72;
          }
          L74: {
            L75: {
              if (null == pd.field_a) {
                break L75;
              } else {
                if (pd.field_a.length >= param1) {
                  break L74;
                } else {
                  break L75;
                }
              }
            }
            pd.field_a = new int[2 * param1];
            break L74;
          }
          L76: {
            if (null == bg.field_j) {
              break L76;
            } else {
              if (bg.field_j.length >= param1) {
                if (param2 == 24070) {
                  if (tb.field_d != null) {
                    if (tb.field_d.length >= param1) {
                      if (lk.field_d != null) {
                        if (lk.field_d.length < param1 + param0) {
                          L77: {
                            L78: {
                              lk.field_d = new int[(param1 - -param0) * 2];
                              if (pa.field_h == null) {
                                break L78;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L78;
                                } else {
                                  break L77;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L77;
                          }
                          rc.field_c = -2147483648;
                          ue.field_a = 2147483647;
                          ua.field_d = 2147483647;
                          cg.field_l = 0;
                          vb.field_a = -2147483648;
                          return;
                        } else {
                          L79: {
                            L80: {
                              if (pa.field_h == null) {
                                break L80;
                              } else {
                                if (pa.field_h.length < param1) {
                                  break L80;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            pa.field_h = new boolean[2 * param1];
                            break L79;
                          }
                          rc.field_c = -2147483648;
                          ue.field_a = 2147483647;
                          ua.field_d = 2147483647;
                          cg.field_l = 0;
                          vb.field_a = -2147483648;
                          return;
                        }
                      } else {
                        L81: {
                          L82: {
                            lk.field_d = new int[(param1 - -param0) * 2];
                            if (pa.field_h == null) {
                              break L82;
                            } else {
                              if (pa.field_h.length < param1) {
                                break L82;
                              } else {
                                break L81;
                              }
                            }
                          }
                          pa.field_h = new boolean[2 * param1];
                          break L81;
                        }
                        rc.field_c = -2147483648;
                        ue.field_a = 2147483647;
                        ua.field_d = 2147483647;
                        cg.field_l = 0;
                        vb.field_a = -2147483648;
                        return;
                      }
                    } else {
                      L83: {
                        L84: {
                          tb.field_d = new int[param1 * 2];
                          if (lk.field_d == null) {
                            break L84;
                          } else {
                            if (lk.field_d.length >= param1 + param0) {
                              break L83;
                            } else {
                              break L84;
                            }
                          }
                        }
                        lk.field_d = new int[(param1 - -param0) * 2];
                        break L83;
                      }
                      L85: {
                        L86: {
                          if (pa.field_h == null) {
                            break L86;
                          } else {
                            if (pa.field_h.length < param1) {
                              break L86;
                            } else {
                              break L85;
                            }
                          }
                        }
                        pa.field_h = new boolean[2 * param1];
                        break L85;
                      }
                      rc.field_c = -2147483648;
                      ue.field_a = 2147483647;
                      ua.field_d = 2147483647;
                      cg.field_l = 0;
                      vb.field_a = -2147483648;
                      return;
                    }
                  } else {
                    L87: {
                      L88: {
                        tb.field_d = new int[param1 * 2];
                        if (lk.field_d == null) {
                          break L88;
                        } else {
                          if (lk.field_d.length >= param1 + param0) {
                            break L87;
                          } else {
                            break L88;
                          }
                        }
                      }
                      lk.field_d = new int[(param1 - -param0) * 2];
                      break L87;
                    }
                    L89: {
                      L90: {
                        if (pa.field_h == null) {
                          break L90;
                        } else {
                          if (pa.field_h.length < param1) {
                            break L90;
                          } else {
                            break L89;
                          }
                        }
                      }
                      pa.field_h = new boolean[2 * param1];
                      break L89;
                    }
                    rc.field_c = -2147483648;
                    ue.field_a = 2147483647;
                    ua.field_d = 2147483647;
                    cg.field_l = 0;
                    vb.field_a = -2147483648;
                    return;
                  }
                } else {
                  L91: {
                    L92: {
                      he.b((byte) -97);
                      if (tb.field_d == null) {
                        break L92;
                      } else {
                        if (tb.field_d.length >= param1) {
                          break L91;
                        } else {
                          break L92;
                        }
                      }
                    }
                    tb.field_d = new int[param1 * 2];
                    break L91;
                  }
                  L93: {
                    L94: {
                      if (lk.field_d == null) {
                        break L94;
                      } else {
                        if (lk.field_d.length >= param1 + param0) {
                          break L93;
                        } else {
                          break L94;
                        }
                      }
                    }
                    lk.field_d = new int[(param1 - -param0) * 2];
                    break L93;
                  }
                  L95: {
                    L96: {
                      if (pa.field_h == null) {
                        break L96;
                      } else {
                        if (pa.field_h.length < param1) {
                          break L96;
                        } else {
                          break L95;
                        }
                      }
                    }
                    pa.field_h = new boolean[2 * param1];
                    break L95;
                  }
                  rc.field_c = -2147483648;
                  ue.field_a = 2147483647;
                  ua.field_d = 2147483647;
                  cg.field_l = 0;
                  vb.field_a = -2147483648;
                  return;
                }
              } else {
                break L76;
              }
            }
          }
          L97: {
            bg.field_j = new int[param1 * 2];
            if (param2 == 24070) {
              break L97;
            } else {
              he.b((byte) -97);
              break L97;
            }
          }
          L98: {
            L99: {
              if (tb.field_d == null) {
                break L99;
              } else {
                if (tb.field_d.length >= param1) {
                  break L98;
                } else {
                  break L99;
                }
              }
            }
            tb.field_d = new int[param1 * 2];
            break L98;
          }
          L100: {
            L101: {
              if (lk.field_d == null) {
                break L101;
              } else {
                if (lk.field_d.length >= param1 + param0) {
                  break L100;
                } else {
                  break L101;
                }
              }
            }
            lk.field_d = new int[(param1 - -param0) * 2];
            break L100;
          }
          L102: {
            L103: {
              if (pa.field_h == null) {
                break L103;
              } else {
                if (pa.field_h.length < param1) {
                  break L103;
                } else {
                  break L102;
                }
              }
            }
            pa.field_h = new boolean[2 * param1];
            break L102;
          }
          rc.field_c = -2147483648;
          ue.field_a = 2147483647;
          ua.field_d = 2147483647;
          cg.field_l = 0;
          vb.field_a = -2147483648;
          return;
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
        ti var12 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
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
                var12 = (ti) null;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("he.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        field_h = "End Game";
        field_g = "Are you sure you want to skip this round, scoring 0 for it?";
    }
}

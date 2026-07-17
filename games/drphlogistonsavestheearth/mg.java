/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg {
    private java.util.zip.Inflater field_b;
    static String[][] field_a;

    private mg(int param0, int param1, int param2) {
    }

    final static int a(boolean param0) {
        if (hj.field_f < 2) {
          return 0;
        } else {
          if (ob.field_c == 0) {
            if (!qd.field_Jb.a(0)) {
              return 20;
            } else {
              if (qd.field_Jb.a(255, "commonui")) {
                if (!sb.field_i.a(0)) {
                  return 50;
                } else {
                  if (sb.field_i.a(255, "commonui")) {
                    if (!ig.field_t.a(0)) {
                      return 70;
                    } else {
                      if (ig.field_t.c((byte) 54)) {
                        return 100;
                      } else {
                        return 80;
                      }
                    }
                  } else {
                    return 60;
                  }
                }
              } else {
                return 40;
              }
            }
          } else {
            if (bi.field_I != null) {
              if (bi.field_I.a(0)) {
                if (!bi.field_I.a((byte) 12, "")) {
                  return 29;
                } else {
                  if (bi.field_I.a(255, "")) {
                    if (!qd.field_Jb.a(0)) {
                      return 43;
                    } else {
                      if (qd.field_Jb.a(255, "commonui")) {
                        if (!sb.field_i.a(0)) {
                          return 71;
                        } else {
                          if (sb.field_i.a(255, "commonui")) {
                            if (!ig.field_t.a(0)) {
                              return 82;
                            } else {
                              if (ig.field_t.c((byte) 22)) {
                                return 100;
                              } else {
                                return 86;
                              }
                            }
                          } else {
                            return 80;
                          }
                        }
                      } else {
                        return 57;
                      }
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                return 14;
              }
            } else {
              if (!qd.field_Jb.a(0)) {
                return 43;
              } else {
                if (qd.field_Jb.a(255, "commonui")) {
                  if (!sb.field_i.a(0)) {
                    return 71;
                  } else {
                    if (sb.field_i.a(255, "commonui")) {
                      if (!ig.field_t.a(0)) {
                        return 82;
                      } else {
                        if (ig.field_t.c((byte) 22)) {
                          return 100;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                } else {
                  return 57;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == ja.field_t) {
              break L1;
            } else {
              if (ja.field_t.length < param0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ja.field_t = new int[2 * param0];
          break L0;
        }
        L2: {
          L3: {
            if (null == rc.field_i) {
              break L3;
            } else {
              if (rc.field_i.length < param0) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          rc.field_i = new int[param0 * 2];
          break L2;
        }
        L4: {
          if (param1 >= 48) {
            break L4;
          } else {
            int discarded$1 = mg.a(true);
            break L4;
          }
        }
        L5: {
          if (null == fi.field_h) {
            break L5;
          } else {
            if (param0 <= fi.field_h.length) {
              if (kk.field_a == null) {
                L6: {
                  L7: {
                    kk.field_a = new int[param0 * 2];
                    if (null == qj.field_d) {
                      break L7;
                    } else {
                      if (param0 > qj.field_d.length) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  qj.field_d = new int[param0 * 2];
                  break L6;
                }
                L8: {
                  L9: {
                    if (null == kf.field_c) {
                      break L9;
                    } else {
                      if (param0 > kf.field_c.length) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  kf.field_c = new int[2 * param0];
                  break L8;
                }
                if (null == bj.field_a) {
                  L10: {
                    bj.field_a = new int[2 * (param2 + param0)];
                    if (null == cb.field_c) {
                      break L10;
                    } else {
                      if (cb.field_c.length >= param0) {
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      } else {
                        break L10;
                      }
                    }
                  }
                  cb.field_c = new boolean[param0 * 2];
                  pf.field_f = -2147483648;
                  ha.field_c = 2147483647;
                  mh.field_b = -2147483648;
                  gg.field_b = 0;
                  cc.field_B = 2147483647;
                  return;
                } else {
                  if (bj.field_a.length >= param2 + param0) {
                    if (null == cb.field_c) {
                      cb.field_c = new boolean[param0 * 2];
                      pf.field_f = -2147483648;
                      ha.field_c = 2147483647;
                      mh.field_b = -2147483648;
                      gg.field_b = 0;
                      cc.field_B = 2147483647;
                      return;
                    } else {
                      if (cb.field_c.length < param0) {
                        cb.field_c = new boolean[param0 * 2];
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      } else {
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      }
                    }
                  } else {
                    L11: {
                      bj.field_a = new int[2 * (param2 + param0)];
                      if (null == cb.field_c) {
                        break L11;
                      } else {
                        if (cb.field_c.length >= param0) {
                          pf.field_f = -2147483648;
                          ha.field_c = 2147483647;
                          mh.field_b = -2147483648;
                          gg.field_b = 0;
                          cc.field_B = 2147483647;
                          return;
                        } else {
                          break L11;
                        }
                      }
                    }
                    cb.field_c = new boolean[param0 * 2];
                    pf.field_f = -2147483648;
                    ha.field_c = 2147483647;
                    mh.field_b = -2147483648;
                    gg.field_b = 0;
                    cc.field_B = 2147483647;
                    return;
                  }
                }
              } else {
                if (kk.field_a.length >= param0) {
                  L12: {
                    L13: {
                      if (null == qj.field_d) {
                        break L13;
                      } else {
                        if (param0 > qj.field_d.length) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    qj.field_d = new int[param0 * 2];
                    break L12;
                  }
                  L14: {
                    L15: {
                      if (null == kf.field_c) {
                        break L15;
                      } else {
                        if (param0 > kf.field_c.length) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    kf.field_c = new int[2 * param0];
                    break L14;
                  }
                  if (null == bj.field_a) {
                    bj.field_a = new int[2 * (param2 + param0)];
                    if (null == cb.field_c) {
                      cb.field_c = new boolean[param0 * 2];
                      pf.field_f = -2147483648;
                      ha.field_c = 2147483647;
                      mh.field_b = -2147483648;
                      gg.field_b = 0;
                      cc.field_B = 2147483647;
                      return;
                    } else {
                      if (cb.field_c.length < param0) {
                        cb.field_c = new boolean[param0 * 2];
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      } else {
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      }
                    }
                  } else {
                    if (bj.field_a.length >= param2 + param0) {
                      if (null == cb.field_c) {
                        cb.field_c = new boolean[param0 * 2];
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      } else {
                        if (cb.field_c.length < param0) {
                          cb.field_c = new boolean[param0 * 2];
                          pf.field_f = -2147483648;
                          ha.field_c = 2147483647;
                          mh.field_b = -2147483648;
                          gg.field_b = 0;
                          cc.field_B = 2147483647;
                          return;
                        } else {
                          pf.field_f = -2147483648;
                          ha.field_c = 2147483647;
                          mh.field_b = -2147483648;
                          gg.field_b = 0;
                          cc.field_B = 2147483647;
                          return;
                        }
                      }
                    } else {
                      bj.field_a = new int[2 * (param2 + param0)];
                      if (null == cb.field_c) {
                        cb.field_c = new boolean[param0 * 2];
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      } else {
                        if (cb.field_c.length < param0) {
                          cb.field_c = new boolean[param0 * 2];
                          pf.field_f = -2147483648;
                          ha.field_c = 2147483647;
                          mh.field_b = -2147483648;
                          gg.field_b = 0;
                          cc.field_B = 2147483647;
                          return;
                        } else {
                          pf.field_f = -2147483648;
                          ha.field_c = 2147483647;
                          mh.field_b = -2147483648;
                          gg.field_b = 0;
                          cc.field_B = 2147483647;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L16: {
                    L17: {
                      kk.field_a = new int[param0 * 2];
                      if (null == qj.field_d) {
                        break L17;
                      } else {
                        if (param0 > qj.field_d.length) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    qj.field_d = new int[param0 * 2];
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (null == kf.field_c) {
                        break L19;
                      } else {
                        if (param0 > kf.field_c.length) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    kf.field_c = new int[2 * param0];
                    break L18;
                  }
                  L20: {
                    L21: {
                      if (null == bj.field_a) {
                        break L21;
                      } else {
                        if (bj.field_a.length >= param2 + param0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    bj.field_a = new int[2 * (param2 + param0)];
                    break L20;
                  }
                  if (null == cb.field_c) {
                    cb.field_c = new boolean[param0 * 2];
                    pf.field_f = -2147483648;
                    ha.field_c = 2147483647;
                    mh.field_b = -2147483648;
                    gg.field_b = 0;
                    cc.field_B = 2147483647;
                    return;
                  } else {
                    if (cb.field_c.length < param0) {
                      cb.field_c = new boolean[param0 * 2];
                      pf.field_f = -2147483648;
                      ha.field_c = 2147483647;
                      mh.field_b = -2147483648;
                      gg.field_b = 0;
                      cc.field_B = 2147483647;
                      return;
                    } else {
                      pf.field_f = -2147483648;
                      ha.field_c = 2147483647;
                      mh.field_b = -2147483648;
                      gg.field_b = 0;
                      cc.field_B = 2147483647;
                      return;
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
        fi.field_h = new int[param0 * 2];
        if (kk.field_a != null) {
          if (kk.field_a.length < param0) {
            L22: {
              L23: {
                kk.field_a = new int[param0 * 2];
                if (null == qj.field_d) {
                  break L23;
                } else {
                  if (param0 > qj.field_d.length) {
                    break L23;
                  } else {
                    break L22;
                  }
                }
              }
              qj.field_d = new int[param0 * 2];
              break L22;
            }
            L24: {
              L25: {
                if (null == kf.field_c) {
                  break L25;
                } else {
                  if (param0 > kf.field_c.length) {
                    break L25;
                  } else {
                    break L24;
                  }
                }
              }
              kf.field_c = new int[2 * param0];
              break L24;
            }
            L26: {
              L27: {
                if (null == bj.field_a) {
                  break L27;
                } else {
                  if (bj.field_a.length >= param2 + param0) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              bj.field_a = new int[2 * (param2 + param0)];
              break L26;
            }
            L28: {
              if (null == cb.field_c) {
                break L28;
              } else {
                if (cb.field_c.length >= param0) {
                  pf.field_f = -2147483648;
                  ha.field_c = 2147483647;
                  mh.field_b = -2147483648;
                  gg.field_b = 0;
                  cc.field_B = 2147483647;
                  return;
                } else {
                  break L28;
                }
              }
            }
            cb.field_c = new boolean[param0 * 2];
            pf.field_f = -2147483648;
            ha.field_c = 2147483647;
            mh.field_b = -2147483648;
            gg.field_b = 0;
            cc.field_B = 2147483647;
            return;
          } else {
            L29: {
              L30: {
                if (null == qj.field_d) {
                  break L30;
                } else {
                  if (param0 > qj.field_d.length) {
                    break L30;
                  } else {
                    break L29;
                  }
                }
              }
              qj.field_d = new int[param0 * 2];
              break L29;
            }
            L31: {
              L32: {
                if (null == kf.field_c) {
                  break L32;
                } else {
                  if (param0 > kf.field_c.length) {
                    break L32;
                  } else {
                    break L31;
                  }
                }
              }
              kf.field_c = new int[2 * param0];
              break L31;
            }
            L33: {
              L34: {
                if (null == bj.field_a) {
                  break L34;
                } else {
                  if (bj.field_a.length >= param2 + param0) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              bj.field_a = new int[2 * (param2 + param0)];
              break L33;
            }
            L35: {
              if (null == cb.field_c) {
                break L35;
              } else {
                if (cb.field_c.length >= param0) {
                  pf.field_f = -2147483648;
                  ha.field_c = 2147483647;
                  mh.field_b = -2147483648;
                  gg.field_b = 0;
                  cc.field_B = 2147483647;
                  return;
                } else {
                  break L35;
                }
              }
            }
            cb.field_c = new boolean[param0 * 2];
            pf.field_f = -2147483648;
            ha.field_c = 2147483647;
            mh.field_b = -2147483648;
            gg.field_b = 0;
            cc.field_B = 2147483647;
            return;
          }
        } else {
          L36: {
            L37: {
              kk.field_a = new int[param0 * 2];
              if (null == qj.field_d) {
                break L37;
              } else {
                if (param0 > qj.field_d.length) {
                  break L37;
                } else {
                  break L36;
                }
              }
            }
            qj.field_d = new int[param0 * 2];
            break L36;
          }
          L38: {
            L39: {
              if (null == kf.field_c) {
                break L39;
              } else {
                if (param0 > kf.field_c.length) {
                  break L39;
                } else {
                  break L38;
                }
              }
            }
            kf.field_c = new int[2 * param0];
            break L38;
          }
          L40: {
            L41: {
              if (null == bj.field_a) {
                break L41;
              } else {
                if (bj.field_a.length >= param2 + param0) {
                  break L40;
                } else {
                  break L41;
                }
              }
            }
            bj.field_a = new int[2 * (param2 + param0)];
            break L40;
          }
          L42: {
            if (null == cb.field_c) {
              break L42;
            } else {
              if (cb.field_c.length >= param0) {
                pf.field_f = -2147483648;
                ha.field_c = 2147483647;
                mh.field_b = -2147483648;
                gg.field_b = 0;
                cc.field_B = 2147483647;
                return;
              } else {
                break L42;
              }
            }
          }
          cb.field_c = new boolean[param0 * 2];
          pf.field_f = -2147483648;
          ha.field_c = 2147483647;
          mh.field_b = -2147483648;
          gg.field_b = 0;
          cc.field_B = 2147483647;
          return;
        }
    }

    public mg() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte[] param0, od param1, int param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
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
                  if (param1.field_h[param1.field_j] != -32) {
                    break L1;
                  } else {
                    if (116 == param1.field_h[param1.field_j - -1]) {
                      L2: {
                        if (null != ((mg) this).field_b) {
                          break L2;
                        } else {
                          ((mg) this).field_b = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((mg) this).field_b.setInput(param1.field_h, param1.field_j + 10, -param1.field_j + (-18 + param1.field_h.length));
                          if (param2 == -1) {
                            int discarded$2 = ((mg) this).field_b.inflate(param0);
                            break L3;
                          } else {
                            return;
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        ((mg) this).field_b.reset();
                        throw new RuntimeException("");
                      }
                      ((mg) this).field_b.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var4_ref;
                stackOut_13_1 = new StringBuilder().append("mg.C(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              L5: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L5;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L5;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[8], new String[1], new String[1], new String[3], new String[1], new String[1], new String[3], new String[1], new String[1]};
    }
}

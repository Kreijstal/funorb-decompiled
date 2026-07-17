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
          if (null == fi.field_h) {
            break L4;
          } else {
            if (param0 <= fi.field_h.length) {
              if (kk.field_a == null) {
                L5: {
                  L6: {
                    kk.field_a = new int[param0 * 2];
                    if (null == qj.field_d) {
                      break L6;
                    } else {
                      if (param0 > qj.field_d.length) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  qj.field_d = new int[param0 * 2];
                  break L5;
                }
                L7: {
                  L8: {
                    if (null == kf.field_c) {
                      break L8;
                    } else {
                      if (param0 > kf.field_c.length) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  kf.field_c = new int[2 * param0];
                  break L7;
                }
                if (null == bj.field_a) {
                  L9: {
                    bj.field_a = new int[2 * (param2 + param0)];
                    if (null == cb.field_c) {
                      break L9;
                    } else {
                      if (cb.field_c.length >= param0) {
                        pf.field_f = -2147483648;
                        ha.field_c = 2147483647;
                        mh.field_b = -2147483648;
                        gg.field_b = 0;
                        cc.field_B = 2147483647;
                        return;
                      } else {
                        break L9;
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
                  }
                }
              } else {
                if (kk.field_a.length >= param0) {
                  L11: {
                    L12: {
                      if (null == qj.field_d) {
                        break L12;
                      } else {
                        if (param0 > qj.field_d.length) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    qj.field_d = new int[param0 * 2];
                    break L11;
                  }
                  L13: {
                    L14: {
                      if (null == kf.field_c) {
                        break L14;
                      } else {
                        if (param0 > kf.field_c.length) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    kf.field_c = new int[2 * param0];
                    break L13;
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
                  L15: {
                    L16: {
                      kk.field_a = new int[param0 * 2];
                      if (null == qj.field_d) {
                        break L16;
                      } else {
                        if (param0 > qj.field_d.length) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    qj.field_d = new int[param0 * 2];
                    break L15;
                  }
                  L17: {
                    L18: {
                      if (null == kf.field_c) {
                        break L18;
                      } else {
                        if (param0 > kf.field_c.length) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                    kf.field_c = new int[2 * param0];
                    break L17;
                  }
                  L19: {
                    L20: {
                      if (null == bj.field_a) {
                        break L20;
                      } else {
                        if (bj.field_a.length >= param2 + param0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    bj.field_a = new int[2 * (param2 + param0)];
                    break L19;
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
              break L4;
            }
          }
        }
        fi.field_h = new int[param0 * 2];
        if (kk.field_a != null) {
          if (kk.field_a.length < param0) {
            L21: {
              L22: {
                kk.field_a = new int[param0 * 2];
                if (null == qj.field_d) {
                  break L22;
                } else {
                  if (param0 > qj.field_d.length) {
                    break L22;
                  } else {
                    break L21;
                  }
                }
              }
              qj.field_d = new int[param0 * 2];
              break L21;
            }
            L23: {
              L24: {
                if (null == kf.field_c) {
                  break L24;
                } else {
                  if (param0 > kf.field_c.length) {
                    break L24;
                  } else {
                    break L23;
                  }
                }
              }
              kf.field_c = new int[2 * param0];
              break L23;
            }
            L25: {
              L26: {
                if (null == bj.field_a) {
                  break L26;
                } else {
                  if (bj.field_a.length >= param2 + param0) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              bj.field_a = new int[2 * (param2 + param0)];
              break L25;
            }
            L27: {
              if (null == cb.field_c) {
                break L27;
              } else {
                if (cb.field_c.length >= param0) {
                  pf.field_f = -2147483648;
                  ha.field_c = 2147483647;
                  mh.field_b = -2147483648;
                  gg.field_b = 0;
                  cc.field_B = 2147483647;
                  return;
                } else {
                  break L27;
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
            L28: {
              L29: {
                if (null == qj.field_d) {
                  break L29;
                } else {
                  if (param0 > qj.field_d.length) {
                    break L29;
                  } else {
                    break L28;
                  }
                }
              }
              qj.field_d = new int[param0 * 2];
              break L28;
            }
            L30: {
              L31: {
                if (null == kf.field_c) {
                  break L31;
                } else {
                  if (param0 > kf.field_c.length) {
                    break L31;
                  } else {
                    break L30;
                  }
                }
              }
              kf.field_c = new int[2 * param0];
              break L30;
            }
            L32: {
              L33: {
                if (null == bj.field_a) {
                  break L33;
                } else {
                  if (bj.field_a.length >= param2 + param0) {
                    break L32;
                  } else {
                    break L33;
                  }
                }
              }
              bj.field_a = new int[2 * (param2 + param0)];
              break L32;
            }
            L34: {
              if (null == cb.field_c) {
                break L34;
              } else {
                if (cb.field_c.length >= param0) {
                  pf.field_f = -2147483648;
                  ha.field_c = 2147483647;
                  mh.field_b = -2147483648;
                  gg.field_b = 0;
                  cc.field_B = 2147483647;
                  return;
                } else {
                  break L34;
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
          L35: {
            L36: {
              kk.field_a = new int[param0 * 2];
              if (null == qj.field_d) {
                break L36;
              } else {
                if (param0 > qj.field_d.length) {
                  break L36;
                } else {
                  break L35;
                }
              }
            }
            qj.field_d = new int[param0 * 2];
            break L35;
          }
          L37: {
            L38: {
              if (null == kf.field_c) {
                break L38;
              } else {
                if (param0 > kf.field_c.length) {
                  break L38;
                } else {
                  break L37;
                }
              }
            }
            kf.field_c = new int[2 * param0];
            break L37;
          }
          L39: {
            L40: {
              if (null == bj.field_a) {
                break L40;
              } else {
                if (bj.field_a.length >= param2 + param0) {
                  break L39;
                } else {
                  break L40;
                }
              }
            }
            bj.field_a = new int[2 * (param2 + param0)];
            break L39;
          }
          L41: {
            if (null == cb.field_c) {
              break L41;
            } else {
              if (cb.field_c.length >= param0) {
                pf.field_f = -2147483648;
                ha.field_c = 2147483647;
                mh.field_b = -2147483648;
                gg.field_b = 0;
                cc.field_B = 2147483647;
                return;
              } else {
                break L41;
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

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[8], new String[1], new String[1], new String[3], new String[1], new String[1], new String[3], new String[1], new String[1]};
    }
}

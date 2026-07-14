/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static id field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != wd.field_e) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (vo.a(-125, (char) var2)) {
                var3 = jt.field_s - -1 & 127;
                if (var3 == bj.field_a) {
                  param0.consume();
                  return;
                } else {
                  cp.field_c[jt.field_s] = -1;
                  aa.field_c[jt.field_s] = (char)var2;
                  jt.field_s = var3;
                  param0.consume();
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            } else {
              param0.consume();
              return;
            }
          } else {
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null != wd.field_e) {
            kj.field_e = 0;
            var2 = param0.getKeyCode();
            if (0 <= var2) {
              L1: {
                if (var2 < kn.field_c.length) {
                  var2 = kn.field_c[var2];
                  if (0 == (128 & var2)) {
                    break L1;
                  } else {
                    var2 = -1;
                    break L1;
                  }
                } else {
                  var2 = -1;
                  break L1;
                }
              }
              if (lv.field_i >= 0) {
                if (-1 >= (var2 ^ -1)) {
                  jf.field_d[lv.field_i] = var2;
                  lv.field_i = lv.field_i - -1 & 127;
                  if (lv.field_i == ks.field_v) {
                    L2: {
                      lv.field_i = -1;
                      if (var2 >= 0) {
                        var3 = 1 + jt.field_s & 127;
                        if (var3 != bj.field_a) {
                          cp.field_c[jt.field_s] = var2;
                          aa.field_c[jt.field_s] = (char)0;
                          jt.field_s = var3;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    var3 = param0.getModifiers();
                    if (-1 == (var3 & 10)) {
                      if (-86 != var2) {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    if (var2 >= 0) {
                      var3 = 1 + jt.field_s & 127;
                      if (var3 != bj.field_a) {
                        cp.field_c[jt.field_s] = var2;
                        aa.field_c[jt.field_s] = (char)0;
                        jt.field_s = var3;
                        var3 = param0.getModifiers();
                        if (-1 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 != var2) {
                            if (10 == var2) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          } else {
                            param0.consume();
                            return;
                          }
                        }
                      } else {
                        var3 = param0.getModifiers();
                        if (-1 == (var3 & 10)) {
                          if (-86 != var2) {
                            if (10 == var2) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          } else {
                            param0.consume();
                            return;
                          }
                        } else {
                          param0.consume();
                          return;
                        }
                      }
                    } else {
                      var3 = param0.getModifiers();
                      if (-1 == (var3 & 10)) {
                        if (-86 != var2) {
                          if (10 == var2) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        } else {
                          param0.consume();
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    }
                  }
                } else {
                  if (var2 >= 0) {
                    var3 = 1 + jt.field_s & 127;
                    if (var3 != bj.field_a) {
                      cp.field_c[jt.field_s] = var2;
                      aa.field_c[jt.field_s] = (char)0;
                      jt.field_s = var3;
                      var3 = param0.getModifiers();
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (10 != var2) {
                            break L0;
                          } else {
                            param0.consume();
                            return;
                          }
                        }
                      }
                    } else {
                      var3 = param0.getModifiers();
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (10 != var2) {
                            return;
                          } else {
                            param0.consume();
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (10 != var2) {
                          return;
                        } else {
                          param0.consume();
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (var2 >= 0) {
                  var3 = 1 + jt.field_s & 127;
                  if (var3 != bj.field_a) {
                    cp.field_c[jt.field_s] = var2;
                    aa.field_c[jt.field_s] = (char)0;
                    jt.field_s = var3;
                    var3 = param0.getModifiers();
                    if (-1 == (var3 & 10)) {
                      if (-86 != var2) {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    L3: {
                      var3 = param0.getModifiers();
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        break L3;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          break L3;
                        } else {
                          if (10 != var2) {
                            break L3;
                          } else {
                            param0.consume();
                            break L3;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      break L4;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        break L4;
                      } else {
                        if (10 != var2) {
                          break L4;
                        } else {
                          param0.consume();
                          break L4;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L5: {
                var2 = -1;
                if (lv.field_i < 0) {
                  break L5;
                } else {
                  if (-1 >= (var2 ^ -1)) {
                    jf.field_d[lv.field_i] = var2;
                    lv.field_i = lv.field_i - -1 & 127;
                    if (lv.field_i != ks.field_v) {
                      break L5;
                    } else {
                      L6: {
                        lv.field_i = -1;
                        if (var2 >= 0) {
                          var3 = 1 + jt.field_s & 127;
                          if (var3 != bj.field_a) {
                            cp.field_c[jt.field_s] = var2;
                            aa.field_c[jt.field_s] = (char)0;
                            jt.field_s = var3;
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var3 = param0.getModifiers();
                        if (-1 != (var3 & 10)) {
                          param0.consume();
                          break L7;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            break L7;
                          } else {
                            if (10 != var2) {
                              break L7;
                            } else {
                              param0.consume();
                              break L7;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              if (var2 >= 0) {
                var3 = 1 + jt.field_s & 127;
                if (var3 != bj.field_a) {
                  cp.field_c[jt.field_s] = var2;
                  aa.field_c[jt.field_s] = (char)0;
                  jt.field_s = var3;
                  var3 = param0.getModifiers();
                  if (-1 == (var3 & 10)) {
                    if (-86 != var2) {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  L8: {
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      break L8;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        break L8;
                      } else {
                        if (10 != var2) {
                          break L8;
                        } else {
                          param0.consume();
                          break L8;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  var3 = param0.getModifiers();
                  if (-1 != (var3 & 10)) {
                    param0.consume();
                    break L9;
                  } else {
                    if (-86 == var2) {
                      param0.consume();
                      break L9;
                    } else {
                      if (10 != var2) {
                        break L9;
                      } else {
                        param0.consume();
                        break L9;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final static void a(ah param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (gt.field_bb) {
          return;
        } else {
          var2 = param0.field_C;
          var3 = param0.field_z;
          var4 = -param0.field_E;
          var5 = param0.field_A;
          if (param1 != -1) {
            field_a = null;
            var6 = 1;
            var7 = fi.a(5, he.field_o, (byte) -96);
            bj.field_b.a((ms) (Object) new tl(var6, var7, var2, var3, var4, var5), (byte) 39);
            return;
          } else {
            var6 = 1;
            var7 = fi.a(5, he.field_o, (byte) -96);
            bj.field_b.a((ms) (Object) new tl(var6, var7, var2, var3, var4, var5), (byte) 39);
            return;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != wd.field_e) {
          kj.field_e = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            if (var2 < kn.field_c.length) {
              var2 = -129 & kn.field_c[var2];
              if (lv.field_i <= -1) {
                if (-1 <= var2) {
                  jf.field_d[lv.field_i] = var2 ^ -1;
                  lv.field_i = lv.field_i + 1 & 127;
                  if (lv.field_i == ks.field_v) {
                    lv.field_i = -1;
                    param0.consume();
                    return;
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  param0.consume();
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            } else {
              var2 = -1;
              if (lv.field_i > -1) {
                param0.consume();
                return;
              } else {
                if (-1 <= var2) {
                  jf.field_d[lv.field_i] = var2 ^ -1;
                  lv.field_i = lv.field_i + 1 & 127;
                  if (lv.field_i == ks.field_v) {
                    lv.field_i = -1;
                    param0.consume();
                    return;
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  param0.consume();
                  return;
                }
              }
            }
          } else {
            var2 = -1;
            if (lv.field_i > -1) {
              param0.consume();
              return;
            } else {
              if (-1 <= var2) {
                jf.field_d[lv.field_i] = var2 ^ -1;
                lv.field_i = lv.field_i + 1 & 127;
                if (lv.field_i == ks.field_v) {
                  lv.field_i = -1;
                  param0.consume();
                  return;
                } else {
                  param0.consume();
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            }
          }
        } else {
          param0.consume();
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -2851) {
            hb.a(-38);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == wd.field_e)) {
            lv.field_i = -1;
        }
    }

    final static vo a(byte param0) {
        int var1 = -91 % ((79 - param0) / 41);
        return new vo(0, 0, ks.field_x.field_g, 0, (mh) null, ks.field_x.field_f, ks.field_x.field_p, ks.field_x.field_g, ks.field_x.field_g, ks.field_x.field_a, ks.field_x.field_b, false, true, 32768, 0);
    }

    final static boolean a(cn param0, int param1, cn param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          var3 = -param2.field_kb + param0.field_kb;
          if (jm.field_d != param0.field_gb) {
            if (null != param0.field_gb) {
              break L0;
            } else {
              // wide iinc 3 200
              break L0;
            }
          } else {
            // wide iinc 3 -200
            break L0;
          }
        }
        if (jm.field_d == param2.field_gb) {
          // wide iinc 3 200
          if (param1 != 0) {
            return true;
          } else {
            L1: {
              if (var3 <= 0) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L1;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
                break L1;
              }
            }
            return stackIn_24_0 != 0;
          }
        } else {
          if (null == param2.field_gb) {
            // wide iinc 3 -200
            if (param1 != 0) {
              return true;
            } else {
              L2: {
                if (var3 <= 0) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              return stackIn_17_0 != 0;
            }
          } else {
            if (param1 != 0) {
              return true;
            } else {
              L3: {
                if (var3 <= 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}

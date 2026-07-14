/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static sm[] field_a;
    static String field_b;
    static int[] field_d;
    static String field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != ha.field_b) {
          var2 = param0.getKeyChar();
          if (0 != var2) {
            if (var2 != 65535) {
              if (fm.a((byte) 32, (char) var2)) {
                var3 = 127 & 1 + gn.field_d;
                if (q.field_g != var3) {
                  ol.field_c[gn.field_d] = -1;
                  pe.field_H[gn.field_d] = (char)var2;
                  gn.field_d = var3;
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
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -3) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(ha.field_b == null)) {
            hb.field_y = -1;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ha.field_b != null) {
          po.field_w = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if (var2 < vo.field_a.length) {
              var2 = vo.field_a[var2];
              if ((var2 & 128) != -1) {
                L0: {
                  var2 = -1;
                  if (-1 > hb.field_y) {
                    break L0;
                  } else {
                    if (var2 >= 0) {
                      no.field_i[hb.field_y] = var2;
                      hb.field_y = hb.field_y + 1 & 127;
                      if (n.field_w != hb.field_y) {
                        break L0;
                      } else {
                        L1: {
                          hb.field_y = -1;
                          if (0 > var2) {
                            break L1;
                          } else {
                            var3 = gn.field_d - -1 & 127;
                            if (q.field_g != var3) {
                              ol.field_c[gn.field_d] = var2;
                              pe.field_H[gn.field_d] = (char)0;
                              gn.field_d = var3;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != -1) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if ((var2 ^ -1) == -11) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L2: {
                        if (0 > var2) {
                          break L2;
                        } else {
                          var3 = gn.field_d - -1 & 127;
                          if (q.field_g != var3) {
                            ol.field_c[gn.field_d] = var2;
                            pe.field_H[gn.field_d] = (char)0;
                            gn.field_d = var3;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -11) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (0 > var2) {
                    break L3;
                  } else {
                    var3 = gn.field_d - -1 & 127;
                    if (q.field_g != var3) {
                      ol.field_c[gn.field_d] = var2;
                      pe.field_H[gn.field_d] = (char)0;
                      gn.field_d = var3;
                      break L3;
                    } else {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -11) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != -1) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == var2) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -11) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L4: {
                  if (-1 > hb.field_y) {
                    break L4;
                  } else {
                    if (var2 >= 0) {
                      no.field_i[hb.field_y] = var2;
                      hb.field_y = hb.field_y + 1 & 127;
                      if (n.field_w != hb.field_y) {
                        break L4;
                      } else {
                        L5: {
                          hb.field_y = -1;
                          if (0 > var2) {
                            break L5;
                          } else {
                            var3 = gn.field_d - -1 & 127;
                            if (q.field_g != var3) {
                              ol.field_c[gn.field_d] = var2;
                              pe.field_H[gn.field_d] = (char)0;
                              gn.field_d = var3;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != -1) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if ((var2 ^ -1) == -11) {
                              param0.consume();
                              return;
                            } else {
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
                L6: {
                  if (0 > var2) {
                    break L6;
                  } else {
                    var3 = gn.field_d - -1 & 127;
                    if (q.field_g != var3) {
                      ol.field_c[gn.field_d] = var2;
                      pe.field_H[gn.field_d] = (char)0;
                      gn.field_d = var3;
                      break L6;
                    } else {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -11) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != -1) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == var2) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == -11) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              L7: {
                var2 = -1;
                if (-1 < (hb.field_y ^ -1)) {
                  break L7;
                } else {
                  if (var2 >= 0) {
                    no.field_i[hb.field_y] = var2;
                    hb.field_y = hb.field_y + 1 & 127;
                    if (n.field_w != hb.field_y) {
                      break L7;
                    } else {
                      L8: {
                        hb.field_y = -1;
                        if (0 > var2) {
                          break L8;
                        } else {
                          var3 = gn.field_d - -1 & 127;
                          if (q.field_g != var3) {
                            ol.field_c[gn.field_d] = var2;
                            pe.field_H[gn.field_d] = (char)0;
                            gn.field_d = var3;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 != var2) {
                          if ((var2 ^ -1) != -11) {
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
                    L9: {
                      if (0 > var2) {
                        break L9;
                      } else {
                        var3 = gn.field_d - -1 & 127;
                        if (q.field_g != var3) {
                          ol.field_c[gn.field_d] = var2;
                          pe.field_H[gn.field_d] = (char)0;
                          gn.field_d = var3;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == -1) {
                      if (-86 != var2) {
                        if ((var2 ^ -1) != -11) {
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
                  }
                }
              }
              L10: {
                if (0 > var2) {
                  break L10;
                } else {
                  var3 = gn.field_d - -1 & 127;
                  if (q.field_g != var3) {
                    ol.field_c[gn.field_d] = var2;
                    pe.field_H[gn.field_d] = (char)0;
                    gn.field_d = var3;
                    break L10;
                  } else {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != -1) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              var3 = param0.getModifiers();
              if ((var3 & 10) != -1) {
                param0.consume();
                return;
              } else {
                if (-86 == var2) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) == -11) {
                    param0.consume();
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            L11: {
              var2 = -1;
              if (-1 < (hb.field_y ^ -1)) {
                break L11;
              } else {
                if (var2 >= 0) {
                  no.field_i[hb.field_y] = var2;
                  hb.field_y = hb.field_y + 1 & 127;
                  if (n.field_w != hb.field_y) {
                    break L11;
                  } else {
                    L12: {
                      hb.field_y = -1;
                      if (0 > var2) {
                        break L12;
                      } else {
                        var3 = gn.field_d - -1 & 127;
                        if (q.field_g != var3) {
                          ol.field_c[gn.field_d] = var2;
                          pe.field_H[gn.field_d] = (char)0;
                          gn.field_d = var3;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == -1) {
                      if (-86 != var2) {
                        if ((var2 ^ -1) != -11) {
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
                  }
                } else {
                  L13: {
                    if (0 > var2) {
                      break L13;
                    } else {
                      var3 = gn.field_d - -1 & 127;
                      if (q.field_g != var3) {
                        ol.field_c[gn.field_d] = var2;
                        pe.field_H[gn.field_d] = (char)0;
                        gn.field_d = var3;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((var3 & 10) == -1) {
                    if (-86 != var2) {
                      if ((var2 ^ -1) != -11) {
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
                }
              }
            }
            L14: {
              if (0 > var2) {
                break L14;
              } else {
                var3 = gn.field_d - -1 & 127;
                if (q.field_g != var3) {
                  ol.field_c[gn.field_d] = var2;
                  pe.field_H[gn.field_d] = (char)0;
                  gn.field_d = var3;
                  break L14;
                } else {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) == -1) {
                    if (-86 != var2) {
                      if ((var2 ^ -1) != -11) {
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
                }
              }
            }
            var3 = param0.getModifiers();
            if ((var3 & 10) == -1) {
              if (-86 != var2) {
                if ((var2 ^ -1) == -11) {
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
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (ha.field_b != null) {
          L0: {
            po.field_w = 0;
            var2 = param0.getKeyCode();
            if (-1 < var2) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < vo.field_a.length) {
                var2 = -129 & vo.field_a[var2];
                break L0;
              } else {
                var2 = -1;
                if (-1 <= hb.field_y) {
                  if ((var2 ^ -1) <= -1) {
                    no.field_i[hb.field_y] = var2 ^ -1;
                    hb.field_y = 127 & 1 + hb.field_y;
                    if (hb.field_y == n.field_w) {
                      hb.field_y = -1;
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
              }
            }
          }
          if (-1 >= (hb.field_y ^ -1)) {
            if ((var2 ^ -1) <= -1) {
              no.field_i[hb.field_y] = var2 ^ -1;
              hb.field_y = 127 & 1 + hb.field_y;
              if (hb.field_y == n.field_w) {
                hb.field_y = -1;
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
          param0.consume();
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names should contain a maximum of 12 characters";
        field_d = new int[3];
        field_c = "Change display name";
    }
}

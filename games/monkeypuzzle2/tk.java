/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != wj.field_k) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (ak.a(-1, (char) var2)) {
                var3 = 1 + jk.field_w & 127;
                if (o.field_b == var3) {
                  param0.consume();
                  return;
                } else {
                  oi.field_e[jk.field_w] = -1;
                  ia.field_d[jk.field_w] = (char)var2;
                  jk.field_w = var3;
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

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (wj.field_k != null) {
          je.field_c = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            if (var2 < cb.field_c.length) {
              var2 = cb.field_c[var2];
              if (-1 == (var2 & 128)) {
                L0: {
                  if (-1 < vf.field_a) {
                    break L0;
                  } else {
                    if (-1 <= var2) {
                      ia.field_g[vf.field_a] = var2;
                      vf.field_a = 1 + vf.field_a & 127;
                      if (vf.field_a == sl.field_j) {
                        vf.field_a = -1;
                        break L0;
                      } else {
                        if (0 <= var2) {
                          var3 = jk.field_w - -1 & 127;
                          if (o.field_b != var3) {
                            oi.field_e[jk.field_w] = var2;
                            ia.field_d[jk.field_w] = (char)0;
                            jk.field_w = var3;
                            var3 = param0.getModifiers();
                            if ((var3 & 10) != 0) {
                              param0.consume();
                              return;
                            } else {
                              if ((var2 ^ -1) == -86) {
                                param0.consume();
                                return;
                              } else {
                                if (10 == var2) {
                                  param0.consume();
                                  return;
                                } else {
                                  return;
                                }
                              }
                            }
                          } else {
                            var3 = param0.getModifiers();
                            if ((var3 & 10) != 0) {
                              param0.consume();
                              return;
                            } else {
                              if ((var2 ^ -1) == -86) {
                                param0.consume();
                                return;
                              } else {
                                if (10 == var2) {
                                  param0.consume();
                                  return;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        } else {
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if ((var2 ^ -1) == -86) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
                                param0.consume();
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (0 <= var2) {
                        var3 = jk.field_w - -1 & 127;
                        if (o.field_b != var3) {
                          oi.field_e[jk.field_w] = var2;
                          ia.field_d[jk.field_w] = (char)0;
                          jk.field_w = var3;
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if ((var2 ^ -1) == -86) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
                                param0.consume();
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if ((var2 ^ -1) == -86) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
                                param0.consume();
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (10 == var2) {
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
                }
                if (0 <= var2) {
                  var3 = jk.field_w - -1 & 127;
                  if (o.field_b != var3) {
                    oi.field_e[jk.field_w] = var2;
                    ia.field_d[jk.field_w] = (char)0;
                    jk.field_w = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  var2 = -1;
                  if (-1 > vf.field_a) {
                    break L1;
                  } else {
                    if (-1 >= (var2 ^ -1)) {
                      ia.field_g[vf.field_a] = var2;
                      vf.field_a = 1 + vf.field_a & 127;
                      if (vf.field_a == sl.field_j) {
                        vf.field_a = -1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (0 <= var2) {
                  var3 = jk.field_w - -1 & 127;
                  if (o.field_b != var3) {
                    oi.field_e[jk.field_w] = var2;
                    ia.field_d[jk.field_w] = (char)0;
                    jk.field_w = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              L2: {
                var2 = -1;
                if (-1 < vf.field_a) {
                  break L2;
                } else {
                  if (-1 <= var2) {
                    ia.field_g[vf.field_a] = var2;
                    vf.field_a = 1 + vf.field_a & 127;
                    if (vf.field_a == sl.field_j) {
                      vf.field_a = -1;
                      break L2;
                    } else {
                      L3: {
                        if (0 <= var2) {
                          var3 = jk.field_w - -1 & 127;
                          if (o.field_b != var3) {
                            oi.field_e[jk.field_w] = var2;
                            ia.field_d[jk.field_w] = (char)0;
                            jk.field_w = var3;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (10 == var2) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L4: {
                      if (0 <= var2) {
                        var3 = jk.field_w - -1 & 127;
                        if (o.field_b != var3) {
                          oi.field_e[jk.field_w] = var2;
                          ia.field_d[jk.field_w] = (char)0;
                          jk.field_w = var3;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) != -86) {
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
                  }
                }
              }
              if (0 <= var2) {
                var3 = jk.field_w - -1 & 127;
                if (o.field_b != var3) {
                  oi.field_e[jk.field_w] = var2;
                  ia.field_d[jk.field_w] = (char)0;
                  jk.field_w = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) == -86) {
                    param0.consume();
                    return;
                  } else {
                    if (10 == var2) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L5: {
              var2 = -1;
              if (-1 < vf.field_a) {
                break L5;
              } else {
                if (-1 <= var2) {
                  ia.field_g[vf.field_a] = var2;
                  vf.field_a = 1 + vf.field_a & 127;
                  if (vf.field_a == sl.field_j) {
                    vf.field_a = -1;
                    break L5;
                  } else {
                    L6: {
                      if (0 <= var2) {
                        var3 = jk.field_w - -1 & 127;
                        if (o.field_b != var3) {
                          oi.field_e[jk.field_w] = var2;
                          ia.field_d[jk.field_w] = (char)0;
                          jk.field_w = var3;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == 0) {
                      if ((var2 ^ -1) != -86) {
                        if (10 != var2) {
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
                  L7: {
                    if (0 <= var2) {
                      var3 = jk.field_w - -1 & 127;
                      if (o.field_b != var3) {
                        oi.field_e[jk.field_w] = var2;
                        ia.field_d[jk.field_w] = (char)0;
                        jk.field_w = var3;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((var3 & 10) == 0) {
                    if ((var2 ^ -1) != -86) {
                      if (10 != var2) {
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
            if (0 <= var2) {
              var3 = jk.field_w - -1 & 127;
              if (o.field_b != var3) {
                oi.field_e[jk.field_w] = var2;
                ia.field_d[jk.field_w] = (char)0;
                jk.field_w = var3;
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if ((var2 ^ -1) != -86) {
                    if (10 != var2) {
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
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if ((var2 ^ -1) != -86) {
                    if (10 != var2) {
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
              var3 = param0.getModifiers();
              if ((var3 & 10) == 0) {
                if ((var2 ^ -1) != -86) {
                  if (10 != var2) {
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
        } else {
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != wj.field_k) {
          L0: {
            je.field_c = 0;
            var2 = param0.getKeyCode();
            if (var2 < 0) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < cb.field_c.length) {
                var2 = cb.field_c[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (vf.field_a >= 0) {
                  if ((var2 ^ -1) <= -1) {
                    ia.field_g[vf.field_a] = var2 ^ -1;
                    vf.field_a = 127 & vf.field_a + 1;
                    if (vf.field_a != sl.field_j) {
                      param0.consume();
                      return;
                    } else {
                      vf.field_a = -1;
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
          if (vf.field_a >= 0) {
            if ((var2 ^ -1) <= -1) {
              ia.field_g[vf.field_a] = var2 ^ -1;
              vf.field_a = 127 & vf.field_a + 1;
              if (vf.field_a == sl.field_j) {
                vf.field_a = -1;
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

    final static String a(ad param0, String param1, String param2, int param3, String param4) {
        if (param3 == 1) {
          if (!param0.a(120)) {
            return param4;
          } else {
            return param2 + " - " + param0.a(param1, (byte) -81) + "%";
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (!param1) {
            field_a = null;
            ed.field_d = 1000000000L / (long)param0;
            return;
        }
        ed.field_d = 1000000000L / (long)param0;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (wj.field_k != null) {
            vf.field_a = -1;
        }
    }

    public static void a(int param0) {
        if (param0 < 114) {
            tk.a(-14);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}

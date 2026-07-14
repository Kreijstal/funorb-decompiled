/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        int var1 = 20 % ((param0 - -75) / 40);
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == ck.field_v)) {
            sb.field_b = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ck.field_v != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (eh.a(0, (char) var2)) {
                var3 = 1 + bn.field_b & 127;
                if (var3 == ve.field_l) {
                  param0.consume();
                  return;
                } else {
                  td.field_b[bn.field_b] = -1;
                  ek.field_a[bn.field_b] = (char)var2;
                  bn.field_b = var3;
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

    final static void b(int param0) {
        int var1 = 16 % ((param0 - 0) / 63);
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != ck.field_v) {
          ui.field_e = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if (jc.field_a.length > var2) {
              L0: {
                var2 = jc.field_a[var2];
                if (0 == (128 & var2)) {
                  break L0;
                } else {
                  var2 = -1;
                  break L0;
                }
              }
              if (0 <= sb.field_b) {
                if ((var2 ^ -1) <= -1) {
                  hc.field_C[sb.field_b] = var2;
                  sb.field_b = 1 + sb.field_b & 127;
                  if (m.field_k == sb.field_b) {
                    sb.field_b = -1;
                    if (0 <= var2) {
                      var3 = bn.field_b - -1 & 127;
                      if (var3 == ve.field_l) {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        td.field_b[bn.field_b] = var2;
                        ek.field_a[bn.field_b] = (char)0;
                        bn.field_b = var3;
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
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
                          if (var2 == 10) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (0 <= var2) {
                      var3 = bn.field_b - -1 & 127;
                      if (var3 == ve.field_l) {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        td.field_b[bn.field_b] = var2;
                        ek.field_a[bn.field_b] = (char)0;
                        bn.field_b = var3;
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
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
                          if (var2 == 10) {
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
                    var3 = bn.field_b - -1 & 127;
                    if (var3 == ve.field_l) {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      td.field_b[bn.field_b] = var2;
                      ek.field_a[bn.field_b] = (char)0;
                      bn.field_b = var3;
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
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
                        if (var2 == 10) {
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
                  var3 = bn.field_b - -1 & 127;
                  if (var3 == ve.field_l) {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    td.field_b[bn.field_b] = var2;
                    ek.field_a[bn.field_b] = (char)0;
                    bn.field_b = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
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
                    if ((var2 ^ -1) != -86) {
                      if (var2 != 10) {
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
              }
            } else {
              var2 = -1;
              if (0 <= sb.field_b) {
                L1: {
                  if ((var2 ^ -1) <= -1) {
                    hc.field_C[sb.field_b] = var2;
                    sb.field_b = 1 + sb.field_b & 127;
                    if (m.field_k != sb.field_b) {
                      break L1;
                    } else {
                      sb.field_b = -1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (0 <= var2) {
                  var3 = bn.field_b - -1 & 127;
                  if (var3 == ve.field_l) {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) != -86) {
                        if (var2 != 10) {
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
                  } else {
                    td.field_b[bn.field_b] = var2;
                    ek.field_a[bn.field_b] = (char)0;
                    bn.field_b = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == 0) {
                      if ((var2 ^ -1) != -86) {
                        if (var2 != 10) {
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
                      if (var2 != 10) {
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
                L2: {
                  if (0 <= var2) {
                    var3 = bn.field_b - -1 & 127;
                    if (var3 == ve.field_l) {
                      break L2;
                    } else {
                      td.field_b[bn.field_b] = var2;
                      ek.field_a[bn.field_b] = (char)0;
                      bn.field_b = var3;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if ((var2 ^ -1) != -86) {
                    if (var2 != 10) {
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
            L3: {
              var2 = -1;
              if (0 > sb.field_b) {
                break L3;
              } else {
                if ((var2 ^ -1) <= -1) {
                  hc.field_C[sb.field_b] = var2;
                  sb.field_b = 1 + sb.field_b & 127;
                  if (m.field_k != sb.field_b) {
                    break L3;
                  } else {
                    sb.field_b = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (0 <= var2) {
                var3 = bn.field_b - -1 & 127;
                if (var3 == ve.field_l) {
                  break L4;
                } else {
                  td.field_b[bn.field_b] = var2;
                  ek.field_a[bn.field_b] = (char)0;
                  bn.field_b = var3;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var3 = param0.getModifiers();
            if ((var3 & 10) == 0) {
              if ((var2 ^ -1) != -86) {
                if (var2 != 10) {
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
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (ck.field_v != null) {
          ui.field_e = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            L0: {
              if (var2 >= jc.field_a.length) {
                var2 = -1;
                break L0;
              } else {
                var2 = -129 & jc.field_a[var2];
                break L0;
              }
            }
            if (sb.field_b <= -1) {
              if (-1 <= var2) {
                hc.field_C[sb.field_b] = var2 ^ -1;
                sb.field_b = sb.field_b - -1 & 127;
                if (m.field_k == sb.field_b) {
                  sb.field_b = -1;
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
            if (sb.field_b <= -1) {
              if (-1 <= var2) {
                hc.field_C[sb.field_b] = var2 ^ -1;
                sb.field_b = sb.field_b - -1 & 127;
                if (m.field_k != sb.field_b) {
                  param0.consume();
                  return;
                } else {
                  sb.field_b = -1;
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
          param0.consume();
          return;
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var4 = null;
            String var7 = null;
            oh.field_p = param0;
            String var6 = param2.getParameter("cookieprefix");
            String var5 = var6;
            var5 = var6;
            if (param1 != 30) {
                return;
            }
            try {
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (0 == param0.length()) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + bh.a(-106, 94608000000L + td.b(128)) + "; Max-Age=" + 94608000L;
                }
                sd.a((byte) -111, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            gl.a((byte) 15, param2);
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
        field_b = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = "Main Menu";
        field_c = "Create";
    }
}

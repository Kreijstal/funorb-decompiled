/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_e;
    static boolean field_d;
    static String field_j;
    static wk field_b;
    static int field_g;
    static String field_a;
    static String field_l;
    static String field_f;
    static qb[] field_h;
    static String field_k;
    static qb[] field_c;
    static String field_i;

    public static void a(int param0) {
        if (param0 != -733) {
          return;
        } else {
          field_f = null;
          field_l = null;
          field_k = null;
          field_a = null;
          field_h = null;
          field_i = null;
          field_c = null;
          field_b = null;
          field_j = null;
          field_e = null;
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (null != ch.field_a) {
            L1: {
              L2: {
                hg.field_b = 0;
                var2 = param0.getKeyCode();
                if (0 > var2) {
                  break L2;
                } else {
                  if (var2 < sb.field_h.length) {
                    var2 = sb.field_h[var2] & -129;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (0 > ub.field_b) {
              break L0;
            } else {
              if (-1 < (var2 ^ -1)) {
                break L0;
              } else {
                dk.field_d[ub.field_b] = var2 ^ -1;
                ub.field_b = 127 & ub.field_b + 1;
                if (ub.field_b == go.field_g) {
                  ub.field_b = -1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        param0.consume();
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null == ch.field_a) {
            break L0;
          } else {
            L1: {
              L2: {
                hg.field_b = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (var2 < sb.field_h.length) {
                    var2 = sb.field_h[var2];
                    if ((128 & var2) != -1) {
                      var2 = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            L3: {
              if (-1 > ub.field_b) {
                break L3;
              } else {
                if ((var2 ^ -1) <= -1) {
                  dk.field_d[ub.field_b] = var2;
                  ub.field_b = 127 & ub.field_b - -1;
                  if (ub.field_b != go.field_g) {
                    break L3;
                  } else {
                    ub.field_b = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if ((var2 ^ -1) <= -1) {
                var3 = 1 + pi.field_a & 127;
                if (var3 != vk.field_u) {
                  v.field_p[pi.field_a] = var2;
                  qa.field_i[pi.field_a] = (char)0;
                  pi.field_a = var3;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              var3 = param0.getModifiers();
              if (-1 != (10 & var3 ^ -1)) {
                break L5;
              } else {
                if ((var2 ^ -1) == -86) {
                  break L5;
                } else {
                  if (var2 != 10) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != -101) {
            field_e = null;
        }
        if (tc.field_A != null) {
            tc.field_A.a(param0, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (0 == (param2 ^ -1)) {
            ed.a(param1, (byte) 106);
            break L0;
          } else {
            L1: {
              if (-2 != param2) {
                break L1;
              } else {
                if ((bi.field_I ^ -1) < -4) {
                  sc.a(2, an.field_j, an.field_f);
                  de.d(bi.field_I + -3, 0, 646, an.field_j, 0);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (-2 == param2) {
              de.b();
              break L0;
            } else {
              L2: {
                if (param3) {
                  ed.a(false, (byte) 81);
                  de.b(0, 0, an.field_f, an.field_j);
                  break L2;
                } else {
                  break L2;
                }
              }
              tl.field_f[param2].e((byte) -45);
              break L0;
            }
          }
        }
        L3: {
          if (param0 == -2) {
            break L3;
          } else {
            field_a = null;
            break L3;
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2, byte param3, CharSequence param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        var6 = param5 - param0;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var7 >= var6) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param4.charAt(var7 + param0);
                    if (var8 <= 0) {
                      break L4;
                    } else {
                      if (128 > var8) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var8 < 160) {
                      break L5;
                    } else {
                      if (255 >= var8) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var8 != 8364) {
                      break L6;
                    } else {
                      param1[param2 + var7] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 == 8218) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 != 402) {
                          break L8;
                        } else {
                          param1[var7 + param2] = (byte)-125;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var8 != 8222) {
                          break L9;
                        } else {
                          param1[param2 - -var7] = (byte)-124;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var8 != 8230) {
                          break L10;
                        } else {
                          param1[param2 + var7] = (byte)-123;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (8224 != var8) {
                          break L11;
                        } else {
                          param1[var7 + param2] = (byte)-122;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (8225 != var8) {
                          break L12;
                        } else {
                          param1[var7 + param2] = (byte)-121;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (710 != var8) {
                          break L13;
                        } else {
                          param1[param2 + var7] = (byte)-120;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (var8 == 8240) {
                          break L14;
                        } else {
                          L15: {
                            if (var8 != 352) {
                              break L15;
                            } else {
                              param1[var7 + param2] = (byte)-118;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (var8 != 8249) {
                              break L16;
                            } else {
                              param1[param2 + var7] = (byte)-117;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (338 != var8) {
                              break L17;
                            } else {
                              param1[param2 + var7] = (byte)-116;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (var8 != 381) {
                              break L18;
                            } else {
                              param1[param2 - -var7] = (byte)-114;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (var8 != 8216) {
                              break L19;
                            } else {
                              param1[var7 + param2] = (byte)-111;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if (8217 != var8) {
                              break L20;
                            } else {
                              param1[var7 + param2] = (byte)-110;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (var8 == 8220) {
                              break L21;
                            } else {
                              L22: {
                                if (var8 == 8221) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (var8 != 8226) {
                                      break L23;
                                    } else {
                                      param1[var7 + param2] = (byte)-107;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  L24: {
                                    if (8211 != var8) {
                                      break L24;
                                    } else {
                                      param1[param2 + var7] = (byte)-106;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L25: {
                                    if (var8 == 8212) {
                                      break L25;
                                    } else {
                                      L26: {
                                        if (var8 != 732) {
                                          break L26;
                                        } else {
                                          param1[param2 + var7] = (byte)-104;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      L27: {
                                        if (8482 != var8) {
                                          break L27;
                                        } else {
                                          param1[param2 + var7] = (byte)-103;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      L28: {
                                        if (var8 != 353) {
                                          break L28;
                                        } else {
                                          param1[var7 + param2] = (byte)-102;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (var8 != 8250) {
                                          break L29;
                                        } else {
                                          param1[param2 - -var7] = (byte)-101;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (339 == var8) {
                                          break L30;
                                        } else {
                                          L31: {
                                            if (var8 != 382) {
                                              break L31;
                                            } else {
                                              param1[param2 - -var7] = (byte)-98;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                          L32: {
                                            if (var8 != 376) {
                                              break L32;
                                            } else {
                                              param1[param2 - -var7] = (byte)-97;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                          param1[var7 + param2] = (byte)63;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      param1[param2 - -var7] = (byte)-100;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  param1[var7 + param2] = (byte)-105;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              param1[param2 - -var7] = (byte)-108;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L21;
                              }
                            }
                          }
                          param1[param2 - -var7] = (byte)-109;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L14;
                          }
                        }
                      }
                      param1[param2 + var7] = (byte)-119;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1[param2 - -var7] = (byte)-126;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param1[param2 - -var7] = (byte)var8;
                break L2;
              }
              var7++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L33: {
            if (param3 == 89) {
              break L33;
            } else {
              field_i = null;
              break L33;
            }
          }
          return var6;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (ch.field_a != null) {
            ub.field_b = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(null == ch.field_a)) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (!(!hf.a((char) var2, (byte) 123))) {
                        var3 = 1 + pi.field_a & 127;
                        if (!(var3 == vk.field_u)) {
                            v.field_p[pi.field_a] = -1;
                            qa.field_i[pi.field_a] = (char)var2;
                            pi.field_a = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Send private message";
        field_k = "All players have left <%0>'s game.";
        field_d = false;
        field_l = "Spell Selection";
        field_f = "Suggested names: ";
        field_a = "This game option has not yet been unlocked for use.";
        field_i = "Passwords must be between 5 and 20 characters long";
    }
}
